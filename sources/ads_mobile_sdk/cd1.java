package ads_mobile_sdk;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import saneness.salutatory;

/* JADX INFO: loaded from: classes.dex */
public final class cd1 extends LinkedHashMap {
    public static final cd1 b;
    public boolean a;

    static {
        cd1 cd1Var = new cd1();
        b = cd1Var;
        cd1Var.a = false;
    }

    public cd1() {
        this.a = true;
    }

    public static cd1 a() {
        return b;
    }

    public final cd1 b() {
        return isEmpty() ? new cd1() : new cd1(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
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

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int iHashCode2 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                byte[] bArr2 = r21.a;
                iHashCode = bArr.length;
                for (byte b2 : bArr) {
                    iHashCode = (iHashCode * 31) + b2;
                }
                if (iHashCode == 0) {
                    iHashCode = 1;
                }
            } else {
                if (key instanceof salutatory) {
                    throw new UnsupportedOperationException();
                }
                iHashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = r21.a;
                int length = bArr3.length;
                for (byte b3 : bArr3) {
                    length = (length * 31) + b3;
                }
                if (length != 0) {
                    iHashCode2 = length;
                }
            } else {
                if (value instanceof salutatory) {
                    throw new UnsupportedOperationException();
                }
                iHashCode2 = value.hashCode();
            }
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
        byte[] bArr = r21.a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
        for (Object obj : map.keySet()) {
            byte[] bArr = r21.a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (this.a) {
            return super.remove(obj);
        }
        throw new UnsupportedOperationException();
    }

    public cd1(Map map) {
        super(map);
        this.a = true;
    }
}
