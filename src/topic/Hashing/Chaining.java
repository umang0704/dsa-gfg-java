package topic.Hashing;

import java.util.LinkedList;

public class Chaining {
    private LinkedList[] buckets;
    private Integer keyCount;

    public LinkedList[] getBuckets() {
        return buckets;
    }

    /**
     * 
     * @param key
     * @return
     */
    private Integer hashOf(Integer key) {
        return key % this.keyCount;
    }

    /**
     * 
     * @param keyCount
     */
    Chaining(int keyCount) {
        this.keyCount = keyCount;
        buckets = new LinkedList[this.keyCount];

    }

    /**
     * 
     * @param key
     * @return
     */
    boolean insert(Integer key) {
        int hash = hashOf(key);
        try { 
            if (buckets[hash] == null)
                buckets[hash] = new LinkedList();
            buckets[hash].add(key);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    /**
     * 
     * @param key
     * @return
     */
    boolean delete(Integer key){
        int hash = hashOf(key);
        try {
            if (buckets[hash] == null)
                return false;
            buckets[hash].remove(key);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    /**
     * 
     * @param key
     * @return
     */
    boolean search(Integer key){
        int hash = hashOf(key);
        try {
            if (buckets[hash] == null)
               return false;
            else if(buckets[hash].contains(key))
                return true;
            else
                return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        Chaining c = new Chaining(7);
        for(Integer i : new Integer[]{50,21,58,17,15,49,56,22,23,25})
            c.insert(i);
        for(LinkedList l : c.getBuckets())
            System.out.println(l);
    }
}




















