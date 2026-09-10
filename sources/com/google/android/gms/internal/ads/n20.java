package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n20 implements wk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17618a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f17622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Parcelable f17623f;

    public n20(long j10, long j11, Bundle bundle, String str, String str2) {
        this.f17621d = str;
        this.f17622e = str2;
        this.f17623f = bundle;
        this.f17619b = j10;
        this.f17620c = j11;
    }

    public static n20 a(ea.u uVar) {
        String str = uVar.f39771a;
        String str2 = uVar.f39773c;
        return new n20(uVar.f39774d, uVar.f39775e, uVar.f39772b.n(), str, str2);
    }

    public ea.u c() {
        ea.t tVar = new ea.t(new Bundle((Bundle) this.f17623f));
        String str = (String) this.f17622e;
        return new ea.u((String) this.f17621d, tVar, str, this.f17619b, this.f17620c);
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public long l(po1 po1Var) {
        po1 po1Var2;
        po1 po1Var3;
        Uri uri = po1Var.f18750a;
        long j10 = po1Var.f18753d;
        this.f17623f = uri;
        long j11 = po1Var.f18752c;
        long j12 = this.f17619b;
        if (j11 >= j12) {
            po1Var2 = null;
        } else {
            long jMin = j12 - j11;
            if (j10 != -1) {
                jMin = Math.min(j10, jMin);
            }
            po1Var2 = new po1(uri, j11, jMin);
        }
        if (j10 == -1 || j11 + j10 > j12) {
            po1Var3 = new po1(uri, Math.max(j12, j11), j10 != -1 ? Math.min(j10, (j11 + j10) - j12) : -1L);
        } else {
            po1Var3 = null;
        }
        long jL = po1Var2 != 0 ? ((ci1) this.f17621d).l(po1Var2) : 0L;
        long jL2 = po1Var3 != null ? ((wk1) this.f17622e).l(po1Var3) : 0L;
        this.f17620c = j11;
        if (jL == -1 || jL2 == -1) {
            return -1L;
        }
        return jL + jL2;
    }

    @Override // com.google.android.gms.internal.ads.vx1
    public int t(byte[] bArr, int i10, int i11) {
        int i12;
        long j10 = this.f17620c;
        long j11 = this.f17619b;
        if (j10 < j11) {
            int iT = ((ci1) this.f17621d).t(bArr, i10, (int) Math.min(i11, j11 - j10));
            long j12 = this.f17620c + ((long) iT);
            this.f17620c = j12;
            i12 = iT;
            j10 = j12;
        } else {
            i12 = 0;
        }
        if (j10 < j11) {
            return i12;
        }
        int iT2 = ((wk1) this.f17622e).t(bArr, i10 + i12, i11 - i12);
        int i13 = i12 + iT2;
        this.f17620c += (long) iT2;
        return i13;
    }

    public String toString() {
        switch (this.f17618a) {
            case 1:
                String str = (String) this.f17622e;
                String string = ((Bundle) this.f17623f).toString();
                int length = String.valueOf(str).length();
                String str2 = (String) this.f17621d;
                StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
                d5.u.r(sb2, "origin=", str, ",name=", str2);
                return defpackage.e.q(",params=", string, sb2);
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public Uri zzc() {
        return (Uri) this.f17623f;
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public void zzd() {
        ((ci1) this.f17621d).zzd();
        ((wk1) this.f17622e).zzd();
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public Map zzj() {
        return db1.f13484g;
    }

    public n20(ci1 ci1Var, int i10, wk1 wk1Var) {
        this.f17621d = ci1Var;
        this.f17619b = i10;
        this.f17622e = wk1Var;
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public void n(ox1 ox1Var) {
    }
}
