package com.bytedance.adsdk.lr.ik;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public class xha<T> {
    T lr;
    T ri;

    private static boolean lr(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return lr(pair.first, this.ri) && lr(pair.second, this.lr);
    }

    public int hashCode() {
        T t = this.ri;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.lr;
        return iHashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public void ri(T t, T t2) {
        this.ri = t;
        this.lr = t2;
    }

    public String toString() {
        return "Pair{" + this.ri + " " + this.lr + "}";
    }
}
