package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.ironsource.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0506p0 extends C0624vb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IronSource.a f29966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final If.b f29967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0690z5 f29968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I8 f29969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f29970f;

    /* JADX INFO: renamed from: com.ironsource.p0$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29971a = new a();

        private a() {
        }

        public static final C0506p0 a(IronSource.a adFormat, F0.b level) {
            kotlin.jvm.internal.n.f(adFormat, "adFormat");
            kotlin.jvm.internal.n.f(level, "level");
            return new C0506p0(adFormat, level);
        }
    }

    public C0506p0(IronSource.a adFormat, F0.b level) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(level, "level");
        this.f29969e = Kb.f26413u.d().f();
        this.f29970f = TimeUnit.HOURS.toMillis(1L);
        this.f29966b = adFormat;
        this.f29968d = new C0690z5(adFormat, level, null, null, 12, null);
        If.b bVarB = If.b(adFormat);
        kotlin.jvm.internal.n.e(bVarB, "createLogFactory(adFormat)");
        this.f29967c = bVarB;
    }

    public static /* synthetic */ String a(C0506p0 c0506p0, String str, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c0506p0.a(str, str2);
    }

    public final String b() {
        return a(this, (String) null, (String) null, 3, (Object) null);
    }

    public final IronSource.a c() {
        return this.f29966b;
    }

    public final C0690z5 d() {
        return this.f29968d;
    }

    public final int e() {
        return Kb.f26413u.d().s().a(this.f29966b);
    }

    public final boolean f() {
        return Kb.f26413u.d().f().c();
    }

    public final String a(String str, String str2) {
        String strA = this.f29967c.a(str, str2);
        kotlin.jvm.internal.n.e(strA, "logFactory.createLogMessage(message, suffix)");
        return strA;
    }

    public final String b(String str) {
        return a(this, str, (String) null, 2, (Object) null);
    }

    public final C0358gd c(String placementName) {
        kotlin.jvm.internal.n.f(placementName, "placementName");
        Va vaA = this.f29969e.a();
        if (vaA == null) {
            throw new IllegalStateException("Error getting sdk configurations");
        }
        C0358gd c0358gdC = vaA.c(LevelPlay.AdFormat.NATIVE_AD, placementName);
        if (c0358gdC != null) {
            return c0358gdC;
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final Ua.a d(String adUnitId) {
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        Va vaA = this.f29969e.a();
        if (vaA != null) {
            return vaA.a(adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final com.ironsource.lifecycle.b a() {
        com.ironsource.lifecycle.b bVarD = com.ironsource.lifecycle.b.d();
        kotlin.jvm.internal.n.e(bVarD, "getInstance()");
        return bVarD;
    }

    public final InterfaceC0637w6.a b(LevelPlay.AdFormat adFormat, String adUnitId) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        Va vaA = this.f29969e.a();
        if (vaA != null) {
            return vaA.b(adFormat, adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final C0358gd a(String placementName) {
        kotlin.jvm.internal.n.f(placementName, "placementName");
        Va vaA = this.f29969e.a();
        if (vaA != null) {
            C0358gd c0358gdC = vaA.c(LevelPlay.AdFormat.BANNER, placementName);
            if (c0358gdC != null) {
                return c0358gdC;
            }
            throw new IllegalStateException("Error getting placement");
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final long b(LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        Va vaA = this.f29969e.a();
        return vaA != null ? vaA.b(adFormat) : this.f29970f;
    }

    public C0506p0(C0506p0 adTools, F0.b level) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(level, "level");
        this.f29969e = Kb.f26413u.d().f();
        this.f29970f = TimeUnit.HOURS.toMillis(1L);
        IronSource.a aVar = adTools.f29966b;
        this.f29966b = aVar;
        this.f29967c = adTools.f29967c;
        this.f29968d = new C0690z5(aVar, level, adTools.f29968d.c(), null, 8, null);
    }

    public final C0358gd a(LevelPlay.AdFormat adFormat, String str) {
        Va vaA;
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        if (str == null || (vaA = this.f29969e.a()) == null) {
            return null;
        }
        return vaA.c(adFormat, str);
    }

    public final void a(Map<String, Object> data, ISBannerSize size) {
        kotlin.jvm.internal.n.f(data, "data");
        kotlin.jvm.internal.n.f(size, "size");
        com.ironsource.mediationsdk.j.a(data, size);
    }

    public final ISBannerSize a(LevelPlayAdSize adSize) {
        kotlin.jvm.internal.n.f(adSize, "adSize");
        return new C0452m0().b(adSize);
    }
}
