package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ev0 extends l9.a {
    public static final Parcelable.Creator<ev0> CREATOR = new gj(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cv0 f14093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f14097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14099i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f14100j;

    public ev0(int i10, String str, int i11, int i12, int i13, int i14, int i15) {
        cv0[] cv0VarArrValues = cv0.values();
        this.f14091a = null;
        this.f14092b = i10;
        this.f14093c = cv0VarArrValues[i10];
        this.f14094d = i11;
        this.f14095e = i12;
        this.f14096f = i13;
        this.f14097g = str;
        this.f14098h = i14;
        this.f14100j = new int[]{1, 2, 3}[i14];
        this.f14099i = i15;
        int i16 = new int[]{1}[i15];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f14092b);
        r9.b.Q(parcel, 2, 4);
        parcel.writeInt(this.f14094d);
        r9.b.Q(parcel, 3, 4);
        parcel.writeInt(this.f14095e);
        r9.b.Q(parcel, 4, 4);
        parcel.writeInt(this.f14096f);
        r9.b.J(parcel, 5, this.f14097g);
        r9.b.Q(parcel, 6, 4);
        parcel.writeInt(this.f14098h);
        r9.b.Q(parcel, 7, 4);
        parcel.writeInt(this.f14099i);
        r9.b.S(parcel, iR);
    }

    public ev0(Context context, cv0 cv0Var, int i10, int i11, int i12, String str, String str2) {
        cv0.values();
        this.f14091a = context;
        this.f14092b = cv0Var.ordinal();
        this.f14093c = cv0Var;
        this.f14094d = i10;
        this.f14095e = i11;
        this.f14096f = i12;
        this.f14097g = str;
        int i13 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.f14100j = i13;
        this.f14098h = i13 - 1;
        this.f14099i = 0;
    }
}
