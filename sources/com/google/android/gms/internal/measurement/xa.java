package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xa extends l9.a {
    public static final Parcelable.Creator<xa> CREATOR = new j7(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24143a;

    public xa(ArrayList arrayList) {
        this.f24143a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xa) {
            return this.f24143a.equals(((xa) obj).f24143a);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlagOverrides(");
        boolean z10 = true;
        for (wa waVar : this.f24143a) {
            if (!z10) {
                sb2.append(", ");
            }
            waVar.b(sb2);
            z10 = false;
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.O(parcel, 2, this.f24143a);
        r9.b.S(parcel, iR);
    }
}
