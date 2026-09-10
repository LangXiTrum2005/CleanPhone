package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wa extends l9.a {
    public static final Parcelable.Creator<wa> CREATOR = new j7(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final va f24115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24116d;

    public wa(String str, String str2, va vaVar, boolean z10) {
        this.f24113a = str;
        this.f24114b = str2;
        this.f24115c = vaVar;
        this.f24116d = z10;
    }

    public final void b(StringBuilder sb2) {
        sb2.append("FlagOverride(");
        sb2.append(this.f24113a);
        sb2.append(", ");
        sb2.append(this.f24114b);
        sb2.append(", ");
        this.f24115c.b(sb2);
        sb2.append(", ");
        sb2.append(this.f24116d);
        sb2.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa)) {
            return false;
        }
        wa waVar = (wa) obj;
        return e1.b(this.f24113a, waVar.f24113a) && e1.b(this.f24114b, waVar.f24114b) && e1.b(this.f24115c, waVar.f24115c) && this.f24116d == waVar.f24116d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        b(sb2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.J(parcel, 2, this.f24113a);
        r9.b.J(parcel, 3, this.f24114b);
        r9.b.I(parcel, 4, this.f24115c, i10);
        r9.b.Q(parcel, 5, 4);
        parcel.writeInt(this.f24116d ? 1 : 0);
        r9.b.S(parcel, iR);
    }
}
