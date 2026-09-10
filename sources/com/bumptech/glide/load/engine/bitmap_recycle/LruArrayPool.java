package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import com.bumptech.glide.util.Preconditions;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class LruArrayPool implements ArrayPool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupedLinkedMap f12488a = new GroupedLinkedMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KeyPool f12489b = new KeyPool();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f12490c = new HashMap();
    public final HashMap d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12491e;
    public int f;

    public static final class Key implements Poolable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KeyPool f12492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Class f12494c;

        public Key(KeyPool keyPool) {
            this.f12492a = keyPool;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
        public final void a() {
            this.f12492a.c(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Key) {
                Key key = (Key) obj;
                if (this.f12493b == key.f12493b && this.f12494c == key.f12494c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i2 = this.f12493b * 31;
            Class cls = this.f12494c;
            return i2 + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.f12493b + "array=" + this.f12494c + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static final class KeyPool extends BaseKeyPool<Key> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool
        public final Poolable a() {
            return new Key(this);
        }
    }

    public LruArrayPool(int i2) {
        this.f12491e = i2;
    }

    public final synchronized void a() {
        c(0);
    }

    public final void b(int i2, Class cls) {
        NavigableMap navigableMapH = h(cls);
        Integer num = (Integer) navigableMapH.get(Integer.valueOf(i2));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapH.remove(Integer.valueOf(i2));
                return;
            } else {
                navigableMapH.put(Integer.valueOf(i2), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i2 + ", this: " + this);
    }

    public final void c(int i2) {
        while (this.f > i2) {
            Object objC = this.f12488a.c();
            Preconditions.b(objC);
            ArrayAdapterInterface arrayAdapterInterfaceE = e(objC.getClass());
            this.f -= arrayAdapterInterfaceE.b(objC) * arrayAdapterInterfaceE.a();
            b(arrayAdapterInterfaceE.b(objC), objC.getClass());
            if (Log.isLoggable(arrayAdapterInterfaceE.getTag(), 2)) {
                Log.v(arrayAdapterInterfaceE.getTag(), "evicted: " + arrayAdapterInterfaceE.b(objC));
            }
        }
    }

    public final synchronized Object d(int i2, Class cls) {
        Key key;
        int i3;
        try {
            Integer num = (Integer) h(cls).ceilingKey(Integer.valueOf(i2));
            if (num == null || ((i3 = this.f) != 0 && this.f12491e / i3 < 2 && num.intValue() > i2 * 8)) {
                Key key2 = (Key) this.f12489b.b();
                key2.f12493b = i2;
                key2.f12494c = cls;
                key = key2;
            } else {
                KeyPool keyPool = this.f12489b;
                int iIntValue = num.intValue();
                key = (Key) keyPool.b();
                key.f12493b = iIntValue;
                key.f12494c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return g(key, cls);
    }

    public final ArrayAdapterInterface e(Class cls) {
        ArrayAdapterInterface byteArrayAdapter;
        HashMap map = this.d;
        ArrayAdapterInterface arrayAdapterInterface = (ArrayAdapterInterface) map.get(cls);
        if (arrayAdapterInterface != null) {
            return arrayAdapterInterface;
        }
        if (cls.equals(int[].class)) {
            byteArrayAdapter = new IntegerArrayAdapter();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            byteArrayAdapter = new ByteArrayAdapter();
        }
        map.put(cls, byteArrayAdapter);
        return byteArrayAdapter;
    }

    public final synchronized Object f() {
        Key key;
        key = (Key) this.f12489b.b();
        key.f12493b = 8;
        key.f12494c = byte[].class;
        return g(key, byte[].class);
    }

    public final Object g(Key key, Class cls) {
        ArrayAdapterInterface arrayAdapterInterfaceE = e(cls);
        Object objA = this.f12488a.a(key);
        if (objA != null) {
            this.f -= arrayAdapterInterfaceE.b(objA) * arrayAdapterInterfaceE.a();
            b(arrayAdapterInterfaceE.b(objA), cls);
        }
        if (objA != null) {
            return objA;
        }
        if (Log.isLoggable(arrayAdapterInterfaceE.getTag(), 2)) {
            Log.v(arrayAdapterInterfaceE.getTag(), "Allocated " + key.f12493b + " bytes");
        }
        return arrayAdapterInterfaceE.newArray(key.f12493b);
    }

    public final NavigableMap h(Class cls) {
        HashMap map = this.f12490c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized void i(Object obj) {
        Class<?> cls = obj.getClass();
        ArrayAdapterInterface arrayAdapterInterfaceE = e(cls);
        int iB = arrayAdapterInterfaceE.b(obj);
        int iA = arrayAdapterInterfaceE.a() * iB;
        if (iA <= this.f12491e / 2) {
            Key key = (Key) this.f12489b.b();
            key.f12493b = iB;
            key.f12494c = cls;
            this.f12488a.b(key, obj);
            NavigableMap navigableMapH = h(cls);
            Integer num = (Integer) navigableMapH.get(Integer.valueOf(key.f12493b));
            Integer numValueOf = Integer.valueOf(key.f12493b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapH.put(numValueOf, Integer.valueOf(iIntValue));
            this.f += iA;
            c(this.f12491e);
        }
    }
}
