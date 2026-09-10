package com.bumptech.glide.util;

import com.bumptech.glide.load.Key;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class LruCache<T, Y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f12843a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12845c;

    public static final class Entry<Y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f12846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12847b;

        public Entry(Object obj, int i2) {
            this.f12846a = obj;
            this.f12847b = i2;
        }
    }

    public LruCache(long j) {
        this.f12844b = j;
    }

    public final void a() {
        g(0L);
    }

    public final synchronized Object b(Object obj) {
        Entry entry;
        entry = (Entry) this.f12843a.get(obj);
        return entry != null ? entry.f12846a : null;
    }

    public int c(Object obj) {
        return 1;
    }

    public void d(Object obj, Object obj2) {
    }

    public final synchronized Object e(Object obj, Object obj2) {
        int iC = c(obj2);
        long j = iC;
        if (j >= this.f12844b) {
            d(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f12845c += j;
        }
        Entry entry = (Entry) this.f12843a.put(obj, obj2 == null ? null : new Entry(obj2, iC));
        if (entry != null) {
            this.f12845c -= (long) entry.f12847b;
            if (!entry.f12846a.equals(obj2)) {
                d(obj, entry.f12846a);
            }
        }
        g(this.f12844b);
        return entry != null ? entry.f12846a : null;
    }

    public final synchronized Object f(Key key) {
        Entry entry = (Entry) this.f12843a.remove(key);
        if (entry == null) {
            return null;
        }
        this.f12845c -= (long) entry.f12847b;
        return entry.f12846a;
    }

    public final synchronized void g(long j) {
        while (this.f12845c > j) {
            Iterator it = this.f12843a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            Entry entry2 = (Entry) entry.getValue();
            this.f12845c -= (long) entry2.f12847b;
            Object key = entry.getKey();
            it.remove();
            d(key, entry2.f12846a);
        }
    }
}
