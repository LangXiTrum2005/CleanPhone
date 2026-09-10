package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r10 implements wk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jr1 f19262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InputStream f19266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f19268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile ij f19269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f19270j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f19271k = false;
    public po1 l;

    public r10(Context context, jr1 jr1Var, String str, int i10) {
        this.f19261a = context;
        this.f19262b = jr1Var;
        this.f19263c = str;
        this.f19264d = i10;
        new AtomicLong(-1L);
        this.f19265e = ((Boolean) zzba.zzc().a(am.G2)).booleanValue();
    }

    public final boolean a() {
        if (!this.f19265e) {
            return false;
        }
        if (!((Boolean) zzba.zzc().a(am.f12389v5)).booleanValue() || this.f19270j) {
            return ((Boolean) zzba.zzc().a(am.f12402w5)).booleanValue() && !this.f19271k;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public final long l(po1 po1Var) throws IOException {
        if (this.f19267g) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f19267g = true;
        Uri uri = po1Var.f18750a;
        this.f19268h = uri;
        this.l = po1Var;
        this.f19269i = ij.b(uri);
        fj fjVarB = null;
        if (!((Boolean) zzba.zzc().a(am.f12342s5)).booleanValue()) {
            if (this.f19269i != null) {
                this.f19269i.f15765h = po1Var.f18752c;
                ij ijVar = this.f19269i;
                String str = this.f19263c;
                ijVar.f15766i = str != null ? str : "";
                this.f19269i.f15767j = this.f19264d;
                fjVarB = zzt.zzj().b(this.f19269i);
            }
            if (fjVarB != null && fjVarB.zza()) {
                this.f19270j = fjVarB.m();
                this.f19271k = fjVarB.h();
                if (!a()) {
                    this.f19266f = fjVarB.b();
                    return -1L;
                }
            }
        } else if (this.f19269i != null) {
            this.f19269i.f15765h = po1Var.f18752c;
            ij ijVar2 = this.f19269i;
            String str2 = this.f19263c;
            ijVar2.f15766i = str2 != null ? str2 : "";
            this.f19269i.f15767j = this.f19264d;
            long jLongValue = (this.f19269i.f15764g ? (Long) zzba.zzc().a(am.f12374u5) : (Long) zzba.zzc().a(am.f12358t5)).longValue();
            ((p9.b) zzt.zzk()).getClass();
            SystemClock.elapsedRealtime();
            zzt.zzz();
            kj kjVarA = mj.a(this.f19261a, this.f19269i);
            try {
                try {
                    try {
                        nj njVar = (nj) kjVarA.get(jLongValue, TimeUnit.MILLISECONDS);
                        njVar.getClass();
                        this.f19270j = njVar.f17839c;
                        this.f19271k = njVar.f17841e;
                        if (!a()) {
                            this.f19266f = njVar.f17837a;
                        }
                    } catch (InterruptedException unused) {
                        kjVarA.cancel(false);
                        Thread.currentThread().interrupt();
                    }
                } catch (ExecutionException | TimeoutException unused2) {
                    kjVarA.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            ((p9.b) zzt.zzk()).getClass();
            SystemClock.elapsedRealtime();
            throw null;
        }
        if (this.f19269i != null) {
            Map map = po1Var.f18751b;
            long j10 = po1Var.f18752c;
            long j11 = po1Var.f18753d;
            int i10 = po1Var.f18754e;
            Uri uri2 = Uri.parse(this.f19269i.f15758a);
            ps1.e0(uri2, "The uri must be set.");
            this.l = new po1(uri2, map, j10, j11, i10);
        }
        return this.f19262b.l(this.l);
    }

    @Override // com.google.android.gms.internal.ads.vx1
    public final int t(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f19267g) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f19266f;
        return inputStream != null ? inputStream.read(bArr, i10, i11) : this.f19262b.t(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public final Uri zzc() {
        return this.f19268h;
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public final void zzd() throws IOException {
        if (!this.f19267g) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f19267g = false;
        this.f19268h = null;
        InputStream inputStream = this.f19266f;
        if (inputStream == null) {
            this.f19262b.zzd();
        } else {
            p9.c.d(inputStream);
            this.f19266f = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public final void n(ox1 ox1Var) {
    }
}
