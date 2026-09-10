package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes.dex */
public class IdentityMap<K, V> extends ObjectMap<K, V> {
    public IdentityMap() {
    }

    @Override // com.badlogic.gdx.utils.ObjectMap
    public int hashCode() {
        int iHashCode = this.size;
        K[] kArr = this.keyTable;
        V[] vArr = this.valueTable;
        int length = kArr.length;
        for (int i = 0; i < length; i++) {
            K k = kArr[i];
            if (k != null) {
                int iIdentityHashCode = System.identityHashCode(k) + iHashCode;
                V v = vArr[i];
                iHashCode = v != null ? v.hashCode() + iIdentityHashCode : iIdentityHashCode;
            }
        }
        return iHashCode;
    }

    @Override // com.badlogic.gdx.utils.ObjectMap
    public int locateKey(K k) {
        if (k == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        K[] kArr = this.keyTable;
        int iPlace = place(k);
        while (true) {
            K k2 = kArr[iPlace];
            if (k2 == null) {
                return -(iPlace + 1);
            }
            if (k2 == k) {
                return iPlace;
            }
            iPlace = (iPlace + 1) & this.mask;
        }
    }

    @Override // com.badlogic.gdx.utils.ObjectMap
    public int place(K k) {
        return (int) ((((long) System.identityHashCode(k)) * (-7046029254386353131L)) >>> this.shift);
    }

    public IdentityMap(int i) {
        super(i);
    }

    public IdentityMap(int i, float f) {
        super(i, f);
    }

    public IdentityMap(IdentityMap<K, V> identityMap) {
        super(identityMap);
    }
}
