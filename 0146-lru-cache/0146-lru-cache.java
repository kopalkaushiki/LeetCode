class LRUCache {
    class Node{
        int key;
        int val;
        Node prev;
        Node next;
    }
    final Node head= new Node();
    final Node tail= new Node();
    HashMap<Integer,Node> map;
    int cache_cap;
    
    public LRUCache(int capacity) {
        map= new HashMap<>();
        this.cache_cap= capacity;
        head.next= tail;
        tail.prev= head;
    }
    
    public int get(int key) {
        int result= -1;
        Node node= map.get(key);
        if(node != null){
            result= node.val;
            remove(node);
            add(node);
        }
        return result;
    }
    
    public void put(int key, int value) {
        Node node= map.get(key);
        if(node != null){
            remove(node);
            node.val= value;
            add(node);
        }
        else{
            if(map.size() == cache_cap){
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node new_node= new Node();
            new_node.key= key;
            new_node.val= value;

            map.put(key, new_node);
            add(new_node);
        }
    }
    public void add(Node node){
        node.next= head.next;
        head.next.prev= node;
        node.prev= head;
        head.next= node;
    }

    public void remove(Node node){
        node.prev.next= node.next;
        node.next.prev= node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */