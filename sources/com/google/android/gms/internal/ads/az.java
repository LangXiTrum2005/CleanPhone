package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class az extends l9.a {
    public static final Parcelable.Creator<az> CREATOR = new gj(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f12548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f12550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f12551h;

    public az(String str, String str2, boolean z10, boolean z11, List list, boolean z12, boolean z13, List list2) {
        this.f12544a = str;
        this.f12545b = str2;
        this.f12546c = z10;
        this.f12547d = z11;
        this.f12548e = list;
        this.f12549f = z12;
        this.f12550g = z13;
        this.f12551h = list2 == null ? new ArrayList() : list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.J(parcel, 2, this.f12544a);
        r9.b.J(parcel, 3, this.f12545b);
        r9.b.Q(parcel, 4, 4);
        parcel.writeInt(this.f12546c ? 1 : 0);
        r9.b.Q(parcel, 5, 4);
        parcel.writeInt(this.f12547d ? 1 : 0);
        r9.b.L(parcel, 6, this.f12548e);
        r9.b.Q(parcel, 7, 4);
        parcel.writeInt(this.f12549f ? 1 : 0);
        r9.b.Q(parcel, 8, 4);
        parcel.writeInt(this.f12550g ? 1 : 0);
        r9.b.L(parcel, 9, this.f12551h);
        r9.b.S(parcel, iR);
    }
}
