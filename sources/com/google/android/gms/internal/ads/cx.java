package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cx extends l9.a {
    public static final Parcelable.Creator<cx> CREATOR = new gj(10);
    public final long A;
    public final String B;
    public final float C;
    public final int D;
    public final int E;
    public final boolean F;
    public final String G;
    public final boolean H;
    public final String I;
    public final boolean J;
    public final int K;
    public final Bundle L;
    public final String M;
    public final zzee N;
    public final boolean O;
    public final Bundle P;
    public final String Q;
    public final String R;
    public final String S;
    public final boolean T;
    public final List U;
    public final String V;
    public final List W;
    public final int X;
    public final boolean Y;
    public final boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13262a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final boolean f13263a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f13264b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ArrayList f13265b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzm f13266c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final String f13267c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzr f13268d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final bs f13269d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13270e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final String f13271e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ApplicationInfo f13272f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Bundle f13273f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PackageInfo f13274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f13276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f13277j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final VersionInfoParcel f13278k;
    public final Bundle l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f13279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f13280n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Bundle f13281o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f13282p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f13283q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f13284r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f13285s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f13286t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f13287u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f13288v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f13289w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f13290x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final eo f13291y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final List f13292z;

    public cx(int i10, Bundle bundle, zzm zzmVar, zzr zzrVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, VersionInfoParcel versionInfoParcel, Bundle bundle2, int i11, ArrayList arrayList, Bundle bundle3, boolean z10, int i12, int i13, float f10, String str5, long j10, String str6, ArrayList arrayList2, String str7, eo eoVar, ArrayList arrayList3, long j11, String str8, float f11, boolean z11, int i14, int i15, boolean z12, String str9, String str10, boolean z13, int i16, Bundle bundle4, String str11, zzee zzeeVar, boolean z14, Bundle bundle5, String str12, String str13, String str14, boolean z15, ArrayList arrayList4, String str15, ArrayList arrayList5, int i17, boolean z16, boolean z17, boolean z18, ArrayList arrayList6, String str16, bs bsVar, String str17, Bundle bundle6) {
        this.f13262a = i10;
        this.f13264b = bundle;
        this.f13266c = zzmVar;
        this.f13268d = zzrVar;
        this.f13270e = str;
        this.f13272f = applicationInfo;
        this.f13274g = packageInfo;
        this.f13275h = str2;
        this.f13276i = str3;
        this.f13277j = str4;
        this.f13278k = versionInfoParcel;
        this.l = bundle2;
        this.f13279m = i11;
        this.f13280n = arrayList;
        this.f13292z = arrayList3 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList3);
        this.f13281o = bundle3;
        this.f13282p = z10;
        this.f13283q = i12;
        this.f13284r = i13;
        this.f13285s = f10;
        this.f13286t = str5;
        this.f13287u = j10;
        this.f13288v = str6;
        this.f13289w = arrayList2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList2);
        this.f13290x = str7;
        this.f13291y = eoVar;
        this.A = j11;
        this.B = str8;
        this.C = f11;
        this.H = z11;
        this.D = i14;
        this.E = i15;
        this.F = z12;
        this.G = str9;
        this.I = str10;
        this.J = z13;
        this.K = i16;
        this.L = bundle4;
        this.M = str11;
        this.N = zzeeVar;
        this.O = z14;
        this.P = bundle5;
        this.Q = str12;
        this.R = str13;
        this.S = str14;
        this.T = z15;
        this.U = arrayList4;
        this.V = str15;
        this.W = arrayList5;
        this.X = i17;
        this.Y = z16;
        this.Z = z17;
        this.f13263a0 = z18;
        this.f13265b0 = arrayList6;
        this.f13267c0 = str16;
        this.f13269d0 = bsVar;
        this.f13271e0 = str17;
        this.f13273f0 = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f13262a);
        r9.b.C(parcel, 2, this.f13264b);
        r9.b.I(parcel, 3, this.f13266c, i10);
        r9.b.I(parcel, 4, this.f13268d, i10);
        r9.b.J(parcel, 5, this.f13270e);
        r9.b.I(parcel, 6, this.f13272f, i10);
        r9.b.I(parcel, 7, this.f13274g, i10);
        r9.b.J(parcel, 8, this.f13275h);
        r9.b.J(parcel, 9, this.f13276i);
        r9.b.J(parcel, 10, this.f13277j);
        r9.b.I(parcel, 11, this.f13278k, i10);
        r9.b.C(parcel, 12, this.l);
        r9.b.Q(parcel, 13, 4);
        parcel.writeInt(this.f13279m);
        r9.b.L(parcel, 14, this.f13280n);
        r9.b.C(parcel, 15, this.f13281o);
        r9.b.Q(parcel, 16, 4);
        parcel.writeInt(this.f13282p ? 1 : 0);
        r9.b.Q(parcel, 18, 4);
        parcel.writeInt(this.f13283q);
        r9.b.Q(parcel, 19, 4);
        parcel.writeInt(this.f13284r);
        r9.b.Q(parcel, 20, 4);
        parcel.writeFloat(this.f13285s);
        r9.b.J(parcel, 21, this.f13286t);
        r9.b.Q(parcel, 25, 8);
        parcel.writeLong(this.f13287u);
        r9.b.J(parcel, 26, this.f13288v);
        r9.b.L(parcel, 27, this.f13289w);
        r9.b.J(parcel, 28, this.f13290x);
        r9.b.I(parcel, 29, this.f13291y, i10);
        r9.b.L(parcel, 30, this.f13292z);
        r9.b.Q(parcel, 31, 8);
        parcel.writeLong(this.A);
        r9.b.J(parcel, 33, this.B);
        r9.b.Q(parcel, 34, 4);
        parcel.writeFloat(this.C);
        r9.b.Q(parcel, 35, 4);
        parcel.writeInt(this.D);
        r9.b.Q(parcel, 36, 4);
        parcel.writeInt(this.E);
        r9.b.Q(parcel, 37, 4);
        parcel.writeInt(this.F ? 1 : 0);
        r9.b.J(parcel, 39, this.G);
        r9.b.Q(parcel, 40, 4);
        parcel.writeInt(this.H ? 1 : 0);
        r9.b.J(parcel, 41, this.I);
        r9.b.Q(parcel, 42, 4);
        parcel.writeInt(this.J ? 1 : 0);
        r9.b.Q(parcel, 43, 4);
        parcel.writeInt(this.K);
        r9.b.C(parcel, 44, this.L);
        r9.b.J(parcel, 45, this.M);
        r9.b.I(parcel, 46, this.N, i10);
        r9.b.Q(parcel, 47, 4);
        parcel.writeInt(this.O ? 1 : 0);
        r9.b.C(parcel, 48, this.P);
        r9.b.J(parcel, 49, this.Q);
        r9.b.J(parcel, 50, this.R);
        r9.b.J(parcel, 51, this.S);
        r9.b.Q(parcel, 52, 4);
        parcel.writeInt(this.T ? 1 : 0);
        r9.b.H(parcel, 53, this.U);
        r9.b.J(parcel, 54, this.V);
        r9.b.L(parcel, 55, this.W);
        r9.b.Q(parcel, 56, 4);
        parcel.writeInt(this.X);
        r9.b.Q(parcel, 57, 4);
        parcel.writeInt(this.Y ? 1 : 0);
        r9.b.Q(parcel, 58, 4);
        parcel.writeInt(this.Z ? 1 : 0);
        r9.b.Q(parcel, 59, 4);
        parcel.writeInt(this.f13263a0 ? 1 : 0);
        r9.b.L(parcel, 60, this.f13265b0);
        r9.b.J(parcel, 61, this.f13267c0);
        r9.b.I(parcel, 63, this.f13269d0, i10);
        r9.b.J(parcel, 64, this.f13271e0);
        r9.b.C(parcel, 65, this.f13273f0);
        r9.b.S(parcel, iR);
    }
}
