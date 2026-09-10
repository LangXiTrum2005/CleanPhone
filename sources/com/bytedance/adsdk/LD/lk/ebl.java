package com.bytedance.adsdk.LD.lk;

import android.util.Pair;
import com.bytedance.component.sdk.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ebl<T> {
    T LD;
    T Lxb;

    private static boolean LD(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public void Lxb(T t, T t2) {
        this.Lxb = t;
        this.LD = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return LD(pair.first, this.Lxb) && LD(pair.second, this.LD);
    }

    public int hashCode() {
        T t = this.Lxb;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.LD;
        return iHashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.Lxb + " " + this.LD + "}";
    }
}
