class Entry {
    int key, value;
    Entry next;
    Entry(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class HashMaps {
    private final int SIZE = 100;
    private Entry[] table = new Entry[SIZE];

    int hash(int key) {
        return key % SIZE;
    }

    void put(int key, int value) {
        int idx = hash(key);
        Entry head = table[idx];
        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        Entry newEntry = new Entry(key, value);
        newEntry.next = table[idx];
        table[idx] = newEntry;
    }

    Integer get(int key) {
        int idx = hash(key);
        Entry head = table[idx];
        while (head != null) {
            if (head.key == key)
                return head.value;
            head = head.next;
        }
        return null;
    }
}
