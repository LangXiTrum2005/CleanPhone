package com.startapp.sdk.components;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.WeightedChoice;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
import com.startapp.sdk.internal.a4;
import com.startapp.sdk.internal.a5;
import com.startapp.sdk.internal.a6;
import com.startapp.sdk.internal.al;
import com.startapp.sdk.internal.b4;
import com.startapp.sdk.internal.b5;
import com.startapp.sdk.internal.b6;
import com.startapp.sdk.internal.d5;
import com.startapp.sdk.internal.e4;
import com.startapp.sdk.internal.e5;
import com.startapp.sdk.internal.f5;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.gc;
import com.startapp.sdk.internal.h4;
import com.startapp.sdk.internal.h9;
import com.startapp.sdk.internal.i5;
import com.startapp.sdk.internal.j3;
import com.startapp.sdk.internal.j5;
import com.startapp.sdk.internal.k4;
import com.startapp.sdk.internal.k7;
import com.startapp.sdk.internal.kb;
import com.startapp.sdk.internal.l3;
import com.startapp.sdk.internal.l5;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.m4;
import com.startapp.sdk.internal.n3;
import com.startapp.sdk.internal.o4;
import com.startapp.sdk.internal.o5;
import com.startapp.sdk.internal.p;
import com.startapp.sdk.internal.p3;
import com.startapp.sdk.internal.p4;
import com.startapp.sdk.internal.p5;
import com.startapp.sdk.internal.q3;
import com.startapp.sdk.internal.r3;
import com.startapp.sdk.internal.r4;
import com.startapp.sdk.internal.r5;
import com.startapp.sdk.internal.s3;
import com.startapp.sdk.internal.t3;
import com.startapp.sdk.internal.t5;
import com.startapp.sdk.internal.tk;
import com.startapp.sdk.internal.u4;
import com.startapp.sdk.internal.u5;
import com.startapp.sdk.internal.v3;
import com.startapp.sdk.internal.v4;
import com.startapp.sdk.internal.v5;
import com.startapp.sdk.internal.vf;
import com.startapp.sdk.internal.w3;
import com.startapp.sdk.internal.w4;
import com.startapp.sdk.internal.w5;
import com.startapp.sdk.internal.x0;
import com.startapp.sdk.internal.x4;
import com.startapp.sdk.internal.x5;
import com.startapp.sdk.internal.xk;
import com.startapp.sdk.internal.y4;
import com.startapp.sdk.internal.y5;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.yk;
import com.startapp.sdk.internal.z4;
import com.startapp.sdk.internal.z5;
import com.startapp.sdk.internal.z6;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final w3 f40723U = new w3();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final lb f40724A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final lb f40725B;
    public final lb C;
    public final lb D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final lb f40726E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final lb f40727F;
    public final lb G;
    public final lb H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final lb f40728I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final lb f40729J;
    public final lb K;
    public final lb L;
    public final lb M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final lb f40730N;
    public final lb O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final lb f40731P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final lb f40732Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final lb f40733R;
    public final lb S;
    public final lb T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb f40734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f40735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f40736c;
    public final lb d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lb f40737e;
    public final lb f;
    public final lb g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lb f40738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lb f40739i;
    public final lb j;
    public final lb k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lb f40740l;
    public final lb m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final lb f40741n;
    public final lb o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lb f40742p;
    public final lb q;
    public final lb r;
    public final lb s;
    public final lb t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final lb f40743u;
    public final lb v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final lb f40744w;
    public final lb x;
    public final lb y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final lb f40745z;

    public a(final Context context) {
        this.L = new lb(new v4(context));
        this.f40734a = new lb(new j5(this, context));
        final int i2 = 0;
        this.f40735b = new lb(new k7(this) { // from class: com.startapp.sdk.components.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f40752b;

            {
                this.f40752b = this;
            }

            @Override // com.startapp.sdk.internal.k7
            public final Object a() {
                switch (i2) {
                    case 0:
                        return this.f40752b.e(context);
                    default:
                        return this.f40752b.c(context);
                }
            }
        });
        this.f40736c = new lb(new w5(this, context));
        lb lbVar = new lb(new x5());
        lb lbVar2 = new lb(new y5());
        this.d = new lb(new z5(context));
        this.f40737e = new lb(new a6(context));
        b6 b6Var = new b6();
        this.f = new lb(new j3(this, context, b6Var));
        this.g = new lb(new l3(this, context, b6Var));
        this.f40738h = new lb(new n3(context));
        this.f40739i = new lb(new p3(context));
        this.j = new lb(new q3(this, context));
        this.k = new lb(new r3(context));
        this.f40740l = new lb(new s3());
        new Exception();
        this.m = new lb(new t3(context));
        this.f40741n = new lb(new v3(this));
        this.o = new lb(new a4(context));
        this.f40742p = new lb(new b4(context));
        this.q = new lb(new e4(this, context, lbVar));
        this.r = new lb(new h4(this, context));
        this.s = new lb(new k4(this, context));
        this.t = new lb(new m4(context));
        this.f40743u = new lb(new o4(this, context));
        this.v = new lb(new p4(context));
        this.f40744w = new lb(new r4(context));
        this.x = new lb(new u4(this, context));
        this.y = new lb(new w4());
        this.f40745z = new lb(new b(1));
        this.f40724A = lbVar2;
        this.f40725B = lbVar2;
        this.C = lbVar2;
        this.D = new lb(new x4());
        this.f40726E = new lb(new y4());
        this.f40727F = new lb(new z4());
        this.G = new lb(new a5(context));
        this.H = new lb(new b5(context));
        this.f40728I = new lb(new d5(context));
        this.f40729J = new lb(new e5(context));
        final int i3 = 1;
        this.K = new lb(new U.a(this, 1));
        this.M = new lb(new k7(this) { // from class: com.startapp.sdk.components.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f40752b;

            {
                this.f40752b = this;
            }

            @Override // com.startapp.sdk.internal.k7
            public final Object a() {
                switch (i3) {
                    case 0:
                        return this.f40752b.e(context);
                    default:
                        return this.f40752b.c(context);
                }
            }
        });
        this.f40730N = new lb(new f5(this, context));
        this.O = new lb(new i5());
        this.f40731P = new lb(new l5(this, context));
        this.f40732Q = new lb(new o5());
        this.f40733R = new lb(new p5(this));
        this.S = new lb(new r5(this, context));
        this.T = new lb(new t5(this, context));
    }

    public static /* synthetic */ WvfMetadata a(WvfMetadata wvfMetadata) {
        return wvfMetadata;
    }

    public static /* synthetic */ WvfMetadata b(WvfMetadata wvfMetadata) {
        return wvfMetadata;
    }

    public static ScheduledExecutorService c() {
        return Executors.newScheduledThreadPool(0, new v5("scheduled"));
    }

    public static /* synthetic */ vf d(Context context) {
        return new vf(context.getSharedPreferences("StartApp-fb8245cb9af2e955", 0));
    }

    public final tk e(Context context) {
        final WvfMetadata wvfMetadataE0 = MetaData.E().e0();
        WeightedChoice weightedChoiceC = wvfMetadataE0 != null ? wvfMetadataE0.c() : null;
        String strA = weightedChoiceC != null ? weightedChoiceC.a() : null;
        if ("simple".equals(strA)) {
            return new yk(context);
        }
        if ("dynamic".equals(strA)) {
            final int i2 = 1;
            return new xk(context, this.D, this.f40727F, new lb(new b(2)), new k7() { // from class: com.startapp.sdk.components.c
                @Override // com.startapp.sdk.internal.k7
                public final Object a() {
                    switch (i2) {
                        case 0:
                            return a.b(wvfMetadataE0);
                        default:
                            return a.a(wvfMetadataE0);
                    }
                }
            });
        }
        final int i3 = 0;
        return new al(context, new lb(new d(context, 1)), this.D, this.f40727F, new lb(new b(3)), new k7() { // from class: com.startapp.sdk.components.c
            @Override // com.startapp.sdk.internal.k7
            public final Object a() {
                switch (i3) {
                    case 0:
                        return a.b(wvfMetadataE0);
                    default:
                        return a.a(wvfMetadataE0);
                }
            }
        }, new com.google.common.net.a(16));
    }

    public static a a(Context context) {
        a aVar;
        w3 w3Var = f40723U;
        a aVar2 = w3Var.f41603a;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (w3Var) {
            try {
                aVar = w3Var.f41603a;
                if (aVar == null) {
                    Context contextA = x0.a(context);
                    if (contextA != null) {
                        context = contextA;
                    }
                    aVar = new a(context);
                    w3Var.f41603a = aVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public static /* synthetic */ gc b() {
        return new gc(Looper.getMainLooper());
    }

    public static /* synthetic */ SharedPreferences b(Context context) {
        return new vf(context.getSharedPreferences("StartApp-3389de2c2d518660", 0));
    }

    public final p c(Context context) {
        return new p(context, new lb(new d(context, 0)), this.G, this.C, this.K, this.j, this.f40733R, this.f40730N, this.f40735b, this.m, this.f40741n, this.f40724A, this.f40744w, this.f40736c);
    }

    public static /* synthetic */ gc a() {
        return new gc(Looper.getMainLooper());
    }

    public static Unit a(String str, String str2) {
        g9 g9Var = new g9(h9.d);
        g9Var.d = "EVT";
        g9Var.f41004i = str;
        g9Var.f41002e = str2;
        g9Var.a();
        return Unit.f43263a;
    }

    public final y6 e() {
        return new z6(new com.google.common.net.a(16), new kb(new b(0)), this.D, new e(0));
    }

    public static ThreadPoolExecutor a(String str, int i2, long j) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, i2, j, TimeUnit.SECONDS, new LinkedTransferQueue<Runnable>() { // from class: com.startapp.sdk.components.ComponentLocator$45
            @Override // java.util.concurrent.LinkedTransferQueue, java.util.Queue, java.util.concurrent.BlockingQueue
            public final boolean offer(Object obj) {
                return tryTransfer((Runnable) obj);
            }
        }, new v5(str), new u5());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
