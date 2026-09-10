package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes.dex */
public class PooledLinkedList<T> {
    private Item<T> curr;
    private Item<T> head;
    private Item<T> iter;
    private final Pool<Item<T>> pool;
    private int size = 0;
    private Item<T> tail;

    public static final class Item<T> {
        public Item<T> next;
        public T payload;
        public Item<T> prev;
    }

    public PooledLinkedList(int i) {
        this.pool = new Pool<Item<T>>(16, i) { // from class: com.badlogic.gdx.utils.PooledLinkedList.1
            @Override // com.badlogic.gdx.utils.Pool
            public Item<T> newObject() {
                return new Item<>();
            }
        };
    }

    public void add(T t) {
        Item<T> itemObtain = this.pool.obtain();
        itemObtain.payload = t;
        itemObtain.next = null;
        itemObtain.prev = null;
        if (this.head == null) {
            this.head = itemObtain;
            this.tail = itemObtain;
            this.size++;
        } else {
            Item<T> item = this.tail;
            itemObtain.prev = item;
            item.next = itemObtain;
            this.tail = itemObtain;
            this.size++;
        }
    }

    public void addFirst(T t) {
        Item<T> itemObtain = this.pool.obtain();
        itemObtain.payload = t;
        Item<T> item = this.head;
        itemObtain.next = item;
        itemObtain.prev = null;
        if (item != null) {
            item.prev = itemObtain;
        } else {
            this.tail = itemObtain;
        }
        this.head = itemObtain;
        this.size++;
    }

    public void clear() {
        iter();
        while (next() != null) {
            remove();
        }
    }

    public void iter() {
        this.iter = this.head;
    }

    public void iterReverse() {
        this.iter = this.tail;
    }

    @Null
    public T next() {
        Item<T> item = this.iter;
        if (item == null) {
            return null;
        }
        T t = item.payload;
        this.curr = item;
        this.iter = item.next;
        return t;
    }

    @Null
    public T previous() {
        Item<T> item = this.iter;
        if (item == null) {
            return null;
        }
        T t = item.payload;
        this.curr = item;
        this.iter = item.prev;
        return t;
    }

    public void remove() {
        Item<T> item = this.curr;
        if (item == null) {
            return;
        }
        this.size--;
        Item<T> item2 = item.next;
        Item<T> item3 = item.prev;
        this.pool.free(item);
        this.curr = null;
        if (this.size == 0) {
            this.head = null;
            this.tail = null;
        } else if (item == this.head) {
            item2.prev = null;
            this.head = item2;
        } else if (item == this.tail) {
            item3.next = null;
            this.tail = item3;
        } else {
            item3.next = item2;
            item2.prev = item3;
        }
    }

    @Null
    public T removeLast() {
        Item<T> item = this.tail;
        if (item == null) {
            return null;
        }
        T t = item.payload;
        this.size--;
        Item<T> item2 = item.prev;
        this.pool.free(item);
        if (this.size == 0) {
            this.head = null;
            this.tail = null;
        } else {
            this.tail = item2;
            item2.next = null;
        }
        return t;
    }

    public int size() {
        return this.size;
    }
}
