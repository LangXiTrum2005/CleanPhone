package ea;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class n4 extends l9.a {
    public static final Parcelable.Creator<n4> CREATOR = new android.support.v4.media.a(29);
    public final long A;
    public final String B;
    public final String C;
    public final long D;
    public final int E;
    public final long F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f39632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f39633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f39634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f39635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f39636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f39637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f39638k;
    public final long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f39639m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f39640n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f39641o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Boolean f39642p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f39643q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f39644r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f39645s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f39646t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f39647u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f39648v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f39649w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f39650x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f39651y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f39652z;

    public n4(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13, long j18) {
        k9.c0.e(str);
        this.f39628a = str;
        this.f39629b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f39630c = str3;
        this.f39637j = j10;
        this.f39631d = str4;
        this.f39632e = j11;
        this.f39633f = j12;
        this.f39634g = str5;
        this.f39635h = z10;
        this.f39636i = z11;
        this.f39638k = str6;
        this.l = j13;
        this.f39639m = i10;
        this.f39640n = z12;
        this.f39641o = z13;
        this.f39642p = bool;
        this.f39643q = j14;
        this.f39644r = list;
        this.f39645s = str7;
        this.f39646t = str8;
        this.f39647u = str9;
        this.f39648v = z14;
        this.f39649w = j15;
        this.f39650x = i11;
        this.f39651y = str10;
        this.f39652z = i12;
        this.A = j16;
        this.B = str11;
        this.C = str12;
        this.D = j17;
        this.E = i13;
        this.F = j18;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.J(parcel, 2, this.f39628a);
        r9.b.J(parcel, 3, this.f39629b);
        r9.b.J(parcel, 4, this.f39630c);
        r9.b.J(parcel, 5, this.f39631d);
        r9.b.Q(parcel, 6, 8);
        parcel.writeLong(this.f39632e);
        r9.b.Q(parcel, 7, 8);
        parcel.writeLong(this.f39633f);
        r9.b.J(parcel, 8, this.f39634g);
        r9.b.Q(parcel, 9, 4);
        parcel.writeInt(this.f39635h ? 1 : 0);
        r9.b.Q(parcel, 10, 4);
        parcel.writeInt(this.f39636i ? 1 : 0);
        r9.b.Q(parcel, 11, 8);
        parcel.writeLong(this.f39637j);
        r9.b.J(parcel, 12, this.f39638k);
        r9.b.Q(parcel, 14, 8);
        parcel.writeLong(this.l);
        r9.b.Q(parcel, 15, 4);
        parcel.writeInt(this.f39639m);
        r9.b.Q(parcel, 16, 4);
        parcel.writeInt(this.f39640n ? 1 : 0);
        r9.b.Q(parcel, 18, 4);
        parcel.writeInt(this.f39641o ? 1 : 0);
        Boolean bool = this.f39642p;
        if (bool != null) {
            r9.b.Q(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        r9.b.Q(parcel, 22, 8);
        parcel.writeLong(this.f39643q);
        r9.b.L(parcel, 23, this.f39644r);
        r9.b.J(parcel, 25, this.f39645s);
        r9.b.J(parcel, 26, this.f39646t);
        r9.b.J(parcel, 27, this.f39647u);
        r9.b.Q(parcel, 28, 4);
        parcel.writeInt(this.f39648v ? 1 : 0);
        r9.b.Q(parcel, 29, 8);
        parcel.writeLong(this.f39649w);
        r9.b.Q(parcel, 30, 4);
        parcel.writeInt(this.f39650x);
        r9.b.J(parcel, 31, this.f39651y);
        r9.b.Q(parcel, 32, 4);
        parcel.writeInt(this.f39652z);
        r9.b.Q(parcel, 34, 8);
        parcel.writeLong(this.A);
        r9.b.J(parcel, 35, this.B);
        r9.b.J(parcel, 36, this.C);
        r9.b.Q(parcel, 37, 8);
        parcel.writeLong(this.D);
        r9.b.Q(parcel, 38, 4);
        parcel.writeInt(this.E);
        r9.b.Q(parcel, 39, 8);
        parcel.writeLong(this.F);
        r9.b.S(parcel, iR);
    }

    public n4(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, ArrayList arrayList, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13, long j18) {
        this.f39628a = str;
        this.f39629b = str2;
        this.f39630c = str3;
        this.f39637j = j12;
        this.f39631d = str4;
        this.f39632e = j10;
        this.f39633f = j11;
        this.f39634g = str5;
        this.f39635h = z10;
        this.f39636i = z11;
        this.f39638k = str6;
        this.l = j13;
        this.f39639m = i10;
        this.f39640n = z12;
        this.f39641o = z13;
        this.f39642p = bool;
        this.f39643q = j14;
        this.f39644r = arrayList;
        this.f39645s = str7;
        this.f39646t = str8;
        this.f39647u = str9;
        this.f39648v = z14;
        this.f39649w = j15;
        this.f39650x = i11;
        this.f39651y = str10;
        this.f39652z = i12;
        this.A = j16;
        this.B = str11;
        this.C = str12;
        this.D = j17;
        this.E = i13;
        this.F = j18;
    }
}
