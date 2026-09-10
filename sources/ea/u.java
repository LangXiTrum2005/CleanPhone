package ea;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends l9.a {
    public static final Parcelable.Creator<u> CREATOR = new android.support.v4.media.a(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f39772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f39774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f39775e;

    public u(u uVar, long j10, long j11) {
        k9.c0.h(uVar);
        this.f39771a = uVar.f39771a;
        this.f39772b = uVar.f39772b;
        this.f39773c = uVar.f39773c;
        this.f39774d = j10;
        this.f39775e = j11;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f39772b);
        String str = this.f39773c;
        int length = String.valueOf(str).length();
        String str2 = this.f39771a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        d5.u.r(sb2, "origin=", str, ",name=", str2);
        return defpackage.e.q(",params=", strValueOf, sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        android.support.v4.media.a.a(this, parcel, i10);
    }

    public u(String str, t tVar, String str2, long j10, long j11) {
        this.f39771a = str;
        this.f39772b = tVar;
        this.f39773c = str2;
        this.f39774d = j10;
        this.f39775e = j11;
    }
}
