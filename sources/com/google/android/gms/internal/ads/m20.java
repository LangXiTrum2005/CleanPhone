package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m20 extends yg1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f17214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wk1 f17215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vf f17216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f17217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f17219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InputStream f17220k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Uri f17221m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile ij f17222n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17223o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17224p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17225q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f17226r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f17227s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ListenableFuture f17228t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicLong f17229u;

    public m20(Context context, wk1 wk1Var, String str, int i10, ox1 ox1Var, vf vfVar) {
        super(false);
        this.f17214e = context;
        this.f17215f = wk1Var;
        this.f17216g = vfVar;
        this.f17217h = str;
        this.f17218i = i10;
        this.f17223o = false;
        this.f17224p = false;
        this.f17225q = false;
        this.f17226r = false;
        this.f17227s = 0L;
        this.f17229u = new AtomicLong(-1L);
        this.f17228t = null;
        this.f17219j = ((Boolean) zzba.zzc().a(am.G2)).booleanValue();
        n(ox1Var);
    }

    public final boolean f() {
        if (!this.f17219j) {
            return false;
        }
        if (!((Boolean) zzba.zzc().a(am.f12389v5)).booleanValue() || this.f17225q) {
            return ((Boolean) zzba.zzc().a(am.f12402w5)).booleanValue() && !this.f17226r;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [com.google.android.gms.internal.ads.e10] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.ads.ij] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.wk1
    public final long l(po1 po1Var) throws Throwable {
        fj fjVarB;
        boolean z10;
        long j10;
        Throwable th2;
        boolean z11;
        boolean z12;
        long jElapsedRealtime;
        StringBuilder sb2;
        if (this.l) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        ?? r3 = 1;
        this.l = true;
        Uri uri = po1Var.f18750a;
        this.f17221m = uri;
        boolean z13 = this.f17219j;
        if (!z13) {
            c(po1Var);
        }
        this.f17222n = ij.b(uri);
        if (!((Boolean) zzba.zzc().a(am.f12342s5)).booleanValue()) {
            if (this.f17222n != null) {
                this.f17222n.f15765h = po1Var.f18752c;
                ij ijVar = this.f17222n;
                String str = this.f17217h;
                ijVar.f15766i = str != null ? str : "";
                this.f17222n.f15767j = this.f17218i;
                fjVarB = zzt.zzj().b(this.f17222n);
            } else {
                fjVarB = null;
            }
            fj fjVar = fjVarB;
            if (fjVar != null && fjVar.zza()) {
                synchronized (fjVar) {
                    z10 = fjVar.f14445b;
                }
                this.f17223o = z10;
                this.f17225q = fjVar.m();
                this.f17226r = fjVar.h();
                synchronized (fjVar) {
                    j10 = fjVar.f14447d;
                }
                this.f17227s = j10;
                this.f17224p = true;
                if (!f()) {
                    this.f17220k = fjVar.b();
                    if (this.f17219j) {
                        c(po1Var);
                    }
                    return -1L;
                }
            }
        } else if (this.f17222n != null) {
            this.f17222n.f15765h = po1Var.f18752c;
            ij ijVar2 = this.f17222n;
            String str2 = this.f17217h;
            ijVar2.f15766i = str2 != null ? str2 : "";
            this.f17222n.f15767j = this.f17218i;
            long jLongValue = (this.f17222n.f15764g ? (Long) zzba.zzc().a(am.f12374u5) : (Long) zzba.zzc().a(am.f12358t5)).longValue();
            ((p9.b) zzt.zzk()).getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            zzt.zzz();
            Context context = this.f17214e;
            ?? r10 = this.f17222n;
            kj kjVarA = mj.a(context, r10);
            try {
                try {
                    nj njVar = (nj) kjVarA.get(jLongValue, TimeUnit.MILLISECONDS);
                    try {
                        this.f17223o = njVar.f17838b;
                        this.f17225q = njVar.f17839c;
                        this.f17226r = njVar.f17841e;
                        this.f17227s = njVar.f17840d;
                        if (!f()) {
                            this.f17220k = njVar.f17837a;
                            if (z13) {
                                c(po1Var);
                            }
                            ((p9.b) zzt.zzk()).getClass();
                            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                            e10 e10Var = ((r20) this.f17216g.f21157b).f19292j;
                            if (e10Var != null) {
                                e10Var.a(jElapsedRealtime3, true);
                            }
                            this.f17224p = true;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 24);
                            sb3.append("Cache connection took ");
                            sb3.append(jElapsedRealtime3);
                            sb3.append("ms");
                            zze.zza(sb3.toString());
                            return -1L;
                        }
                        ((p9.b) zzt.zzk()).getClass();
                        long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        e10 e10Var2 = ((r20) this.f17216g.f21157b).f19292j;
                        if (e10Var2 != null) {
                            e10Var2.a(jElapsedRealtime4, true);
                        }
                        this.f17224p = true;
                        sb2 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 24);
                        sb2.append("Cache connection took ");
                        sb2.append(jElapsedRealtime4);
                    } catch (InterruptedException unused) {
                        z12 = true;
                        kjVarA.cancel(true);
                        Thread.currentThread().interrupt();
                        ((p9.b) zzt.zzk()).getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        e10 e10Var3 = ((r20) this.f17216g.f21157b).f19292j;
                        if (e10Var3 != null) {
                            e10Var3.a(jElapsedRealtime, z12);
                        }
                        this.f17224p = z12;
                        sb2 = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 24);
                        r10 = z12;
                        sb2.append("Cache connection took ");
                        sb2.append(jElapsedRealtime);
                    } catch (ExecutionException | TimeoutException unused2) {
                        z11 = true;
                        kjVarA.cancel(true);
                        ((p9.b) zzt.zzk()).getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        e10 e10Var4 = ((r20) this.f17216g.f21157b).f19292j;
                        if (e10Var4 != null) {
                            e10Var4.a(jElapsedRealtime, z11);
                        }
                        this.f17224p = z11;
                        sb2 = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 24);
                        r10 = z11;
                        sb2.append("Cache connection took ");
                        sb2.append(jElapsedRealtime);
                    } catch (Throwable th3) {
                        th2 = th3;
                        ((p9.b) zzt.zzk()).getClass();
                        long jElapsedRealtime5 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        ?? r0 = ((r20) this.f17216g.f21157b).f19292j;
                        if (r0 != 0) {
                            r0.a(jElapsedRealtime5, r3);
                        }
                        this.f17224p = r3;
                        StringBuilder sb4 = new StringBuilder(String.valueOf(jElapsedRealtime5).length() + 24);
                        sb4.append("Cache connection took ");
                        sb4.append(jElapsedRealtime5);
                        sb4.append("ms");
                        zze.zza(sb4.toString());
                        throw th2;
                    }
                } catch (InterruptedException unused3) {
                    z12 = false;
                } catch (ExecutionException | TimeoutException unused4) {
                    z11 = false;
                } catch (Throwable th4) {
                    th2 = th4;
                    r3 = 0;
                }
                sb2.append("ms");
                zze.zza(sb2.toString());
            } catch (Throwable th5) {
                th2 = th5;
                r3 = r10;
            }
        }
        this.f17224p = false;
        if (this.f17222n != null) {
            Map map = po1Var.f18751b;
            long j11 = po1Var.f18752c;
            long j12 = po1Var.f18753d;
            int i10 = po1Var.f18754e;
            Uri uri2 = Uri.parse(this.f17222n.f15758a);
            ps1.e0(uri2, "The uri must be set.");
            po1Var = new po1(uri2, map, j11, j12, i10);
        }
        return this.f17215f.l(po1Var);
    }

    @Override // com.google.android.gms.internal.ads.vx1
    public final int t(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.l) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.f17220k;
        int iT = inputStream != null ? inputStream.read(bArr, i10, i11) : this.f17215f.t(bArr, i10, i11);
        if (this.f17219j && this.f17220k == null) {
            return iT;
        }
        d(iT);
        return iT;
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public final Uri zzc() {
        return this.f17221m;
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public final void zzd() throws IOException {
        if (!this.l) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.l = false;
        this.f17221m = null;
        boolean z10 = (this.f17219j && this.f17220k == null) ? false : true;
        InputStream inputStream = this.f17220k;
        if (inputStream != null) {
            p9.c.d(inputStream);
            this.f17220k = null;
        } else {
            this.f17215f.zzd();
        }
        if (z10) {
            e();
        }
    }
}
