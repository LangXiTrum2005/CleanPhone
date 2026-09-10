package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g31 implements d31, b31, n31 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final uu1 f14719u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t21 f14721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f14722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s21 f14723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f14727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f14728i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f14729j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f14730k;
    public final AtomicBoolean l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f14731m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f14732n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f14733o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ld f14734p = md.z();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f14735q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14736r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashMap f14737s = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f14738t;

    static {
        tu1 tu1VarZ = uu1.z();
        tu1VarZ.b();
        ((uu1) tu1VarZ.f19193b).A(17);
        f14719u = (uu1) tu1VarZ.e();
    }

    public g31(Context context, t21 t21Var, ExecutorService executorService, s21 s21Var, Random random, String str, long j10, long j11, double d10, String str2, int i10, long j12) {
        this.f14720a = context;
        this.f14721b = t21Var;
        this.f14722c = executorService;
        this.f14723d = s21Var;
        this.f14725f = str;
        this.f14726g = j10;
        this.f14727h = j11;
        this.f14728i = d10;
        this.f14729j = str2;
        this.f14738t = i10;
        this.f14730k = j12;
        this.f14724e = random.nextDouble() < d10;
    }

    public final void a(int i10, long j10, String str, Throwable th2) {
        long jLongValue;
        if (this.f14724e) {
            synchronized (this.f14732n) {
                try {
                    ArrayList arrayList = this.f14735q;
                    synchronized (this.f14733o) {
                        try {
                            HashMap map = this.f14737s;
                            Integer numValueOf = Integer.valueOf(i10);
                            Long l = (Long) map.get(numValueOf);
                            if (l == null) {
                                l = 0L;
                            }
                            jLongValue = 1 + l.longValue();
                            map.put(numValueOf, Long.valueOf(jLongValue));
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    arrayList.add(new e31(i10, j10, th2, str, jLongValue));
                    if (!this.f14736r) {
                        this.f14736r = true;
                        this.f14721b.a(new f31(this, 1), this.f14727h);
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    public final void b(md mdVar) {
        try {
            fh fhVarZ = gh.z();
            uu1 uu1Var = f14719u;
            fhVarZ.b();
            ((gh) fhVarZ.f19193b).B(uu1Var);
            dh dhVarZ = eh.z();
            dhVarZ.b();
            ((eh) dhVarZ.f19193b).A(mdVar);
            eh ehVar = (eh) dhVarZ.e();
            fhVarZ.b();
            ((gh) fhVarZ.f19193b).A(ehVar);
            gh ghVar = (gh) fhVarZ.e();
            s21 s21Var = this.f14723d;
            String str = this.f14725f;
            byte[] bArrB = ghVar.b();
            String str2 = CommonGatewayClient.HEADER_PROTOBUF;
            s21Var.getClass();
            android.support.v4.media.session.a.p(new m01(s21Var, str, true, str2, bArrB));
        } catch (RuntimeException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.b31
    public final ListenableFuture zza() {
        pe1 pe1Var = new pe1(Executors.callable(new f31(this, 0), null));
        this.f14722c.execute(pe1Var);
        return pe1Var;
    }
}
