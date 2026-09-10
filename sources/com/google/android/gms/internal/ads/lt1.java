package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class lt1 extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final lt1 f17125b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17126a = true;

    static {
        lt1 lt1Var = new lt1();
        f17125b = lt1Var;
        lt1Var.f17126a = false;
    }

    public static int h(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof us1) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iB = bt1.b(length, 0, length, bArr);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final lt1 g() {
        if (isEmpty()) {
            return new lt1();
        }
        lt1 lt1Var = new lt1(this);
        lt1Var.f17126a = true;
        return lt1Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iH = 0;
        for (Map.Entry entry : entrySet()) {
            iH += h(entry.getValue()) ^ h(entry.getKey());
        }
        return iH;
    }

    public final void i() {
        if (!this.f17126a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        i();
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        i();
        for (Object obj : map.keySet()) {
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        i();
        return super.remove(obj);
    }
}
