package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t extends o implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient r f24470b;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public r n() {
        r rVar = this.f24470b;
        if (rVar != null) {
            return rVar;
        }
        r rVarR = r();
        this.f24470b = rVarR;
        return rVarR;
    }

    public r r() {
        Object[] array = toArray(o.f24431a);
        p pVar = r.f24456b;
        return r.s(array.length, array);
    }
}
