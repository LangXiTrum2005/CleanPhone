package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mx extends l9.a {
    public static final Parcelable.Creator<mx> CREATOR = new gj(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f17566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VersionInfoParcel f17567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApplicationInfo f17568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f17570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PackageInfo f17571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f17573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ev0 f17574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f17575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f17576k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Bundle f17577m;

    public mx(Bundle bundle, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, String str2, String str3, ev0 ev0Var, String str4, boolean z10, boolean z11, Bundle bundle2) {
        this.f17566a = bundle;
        this.f17567b = versionInfoParcel;
        this.f17569d = str;
        this.f17568c = applicationInfo;
        this.f17570e = arrayList;
        this.f17571f = packageInfo;
        this.f17572g = str2;
        this.f17573h = str3;
        this.f17574i = ev0Var;
        this.f17575j = str4;
        this.f17576k = z10;
        this.l = z11;
        this.f17577m = bundle2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.C(parcel, 1, this.f17566a);
        r9.b.I(parcel, 2, this.f17567b, i10);
        r9.b.I(parcel, 3, this.f17568c, i10);
        r9.b.J(parcel, 4, this.f17569d);
        r9.b.L(parcel, 5, this.f17570e);
        r9.b.I(parcel, 6, this.f17571f, i10);
        r9.b.J(parcel, 7, this.f17572g);
        r9.b.J(parcel, 9, this.f17573h);
        r9.b.I(parcel, 10, this.f17574i, i10);
        r9.b.J(parcel, 11, this.f17575j);
        r9.b.Q(parcel, 12, 4);
        parcel.writeInt(this.f17576k ? 1 : 0);
        r9.b.Q(parcel, 13, 4);
        parcel.writeInt(this.l ? 1 : 0);
        r9.b.C(parcel, 14, this.f17577m);
        r9.b.S(parcel, iR);
    }
}
