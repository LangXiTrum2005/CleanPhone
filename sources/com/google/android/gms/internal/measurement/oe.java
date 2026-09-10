package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class oe {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f23807j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f23808k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final na.r f23810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final na.r f23811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final na.r f23812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final na.r f23813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final na.r f23814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f23815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile uc f23816h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Uri f23817i;

    public oe(Context context, na.r rVar, na.r rVar2, na.r rVar3) {
        this.f23809a = context;
        this.f23811c = rVar;
        this.f23810b = rVar3;
        this.f23812d = rVar2;
        Pattern pattern = xe.f24149a;
        com.google.android.gms.internal.consent_sdk.x xVar = new com.google.android.gms.internal.consent_sdk.x(context);
        xVar.G("phenotype_storage_info");
        xVar.H("storage-info.pb");
        this.f23815g = xVar.I();
        com.google.android.gms.internal.consent_sdk.x xVar2 = new com.google.android.gms.internal.consent_sdk.x(context);
        xVar2.G("phenotype_storage_info");
        xVar2.H("device-encrypted-storage-info.pb");
        Set set = xe.f24152d;
        h.e(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
        xVar2.f23261b = "directboot-files";
        this.f23817i = xVar2.I();
        int i10 = 1;
        this.f23813e = no.b.z(new rb(this, i10));
        this.f23814f = no.b.z(new ub(rVar, i10));
    }

    public final void a() {
        if (gb.i(this.f23809a)) {
            if (TimeUnit.HOURS.toMillis(24L) + c().y() < System.currentTimeMillis()) {
                ta.q0 q0Var = (ta.q0) this.f23811c.get();
                q0Var.getClass();
                ListenableFuture listenableFutureE = ta.k0.e((ListenableFuture) this.f23814f.get());
                int i10 = ta.g0.f50618h;
                ta.k0.g(listenableFutureE instanceof ta.g0 ? (ta.g0) listenableFutureE : new ta.h0(listenableFutureE), new pd(this, 2), q0Var);
                return;
            }
        }
        ta.n0 n0Var = ta.n0.f50627b;
    }

    public final ie b() {
        uc ucVarC = c();
        return new ie(ucVarC.w(), oa.j0.x(ucVarC.B()), ucVarC.v(), ucVarC.x(), (ucVarC.C() && ucVarC.D().v() == ((long) Build.VERSION.SDK_INT)) ? ucVarC.D().u() : "", oa.j0.x(ucVarC.z()), oa.j0.x(ucVarC.A()), ucVarC.u(), ucVarC.F(), ucVarC.E(), ucVarC.G());
    }

    public final uc c() {
        uc ucVarI;
        uc ucVar = this.f23816h;
        if (ucVar != null) {
            return ucVar;
        }
        synchronized (f23807j) {
            ucVarI = this.f23816h;
            if (ucVarI == null) {
                ucVarI = uc.I();
                if (gb.i(this.f23809a)) {
                    j2 j2Var = (j2) ucVarI.t(7);
                    z0 z0Var = z0.f24189a;
                    int i10 = n0.f23760a;
                    z0 z0Var2 = z0.f24190b;
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        InputStream inputStreamD = e1.d(((te) this.f23812d.get()).b(this.f23815g));
                        try {
                            i1 i1VarA = ((h1) j2Var).a(inputStreamD, z0Var2);
                            if (inputStreamD != null) {
                                inputStreamD.close();
                            }
                            uc ucVar2 = (uc) i1VarA;
                            StrictMode.setThreadPolicy(threadPolicy);
                            ucVarI = ucVar2;
                            this.f23816h = ucVarI;
                        } catch (Throwable th2) {
                            if (inputStreamD != null) {
                                try {
                                    inputStreamD.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    } catch (IOException unused) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    } catch (Throwable th4) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th4;
                    }
                }
            }
        }
        return ucVarI;
    }
}
