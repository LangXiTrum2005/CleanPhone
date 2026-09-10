package com.airbnb.lottie.model;

import androidx.core.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public class MutablePair<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9736b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.f4407a;
        String str = this.f9735a;
        if (obj2 != str && (obj2 == null || !obj2.equals(str))) {
            return false;
        }
        String str2 = this.f9736b;
        Object obj3 = pair.f4408b;
        if (obj3 != str2) {
            return obj3 != null && obj3.equals(str2);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f9735a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f9736b;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + ((Object) this.f9735a) + " " + ((Object) this.f9736b) + "}";
    }
}
