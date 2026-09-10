package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3681p0 extends C3725rb {
    private final IronSource.a b;
    private final C3746sf.b c;
    private final C3838y5 d;
    private final G8 e;
    private final long f;

    /* JADX INFO: renamed from: com.ironsource.p0$a */
    public static final class a {
        public static final a a = new a();

        private a() {
        }

        public static final C3681p0 a(IronSource.a adFormat, F0.b level) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            Intrinsics.checkNotNullParameter(level, "level");
            return new C3681p0(adFormat, level);
        }
    }

    public C3681p0(IronSource.a adFormat, F0.b level) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(level, "level");
        this.e = Gb.s.d().f();
        this.f = TimeUnit.HOURS.toMillis(1L);
        this.b = adFormat;
        this.d = new C3838y5(adFormat, level, null, null, 12, null);
        C3746sf.b bVarB = C3746sf.b(adFormat);
        Intrinsics.checkNotNullExpressionValue(bVarB, "createLogFactory(adFormat)");
        this.c = bVarB;
    }

    public static /* synthetic */ String a(C3681p0 c3681p0, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c3681p0.a(str, str2);
    }

    public final String b(String str) {
        return a(this, str, (String) null, 2, (Object) null);
    }

    public final String c() {
        return a(this, (String) null, (String) null, 3, (Object) null);
    }

    public final IronSource.a d() {
        return this.b;
    }

    public final C3838y5 e() {
        return this.d;
    }

    public final int f() {
        return Gb.s.d().s().a(this.b);
    }

    public final boolean g() {
        return Gb.s.d().f().c();
    }

    public final String a(String str, String str2) {
        String strA = this.c.a(str, str2);
        Intrinsics.checkNotNullExpressionValue(strA, "logFactory.createLogMessage(message, suffix)");
        return strA;
    }

    public final com.ironsource.lifecycle.b b() {
        com.ironsource.lifecycle.b bVarD = com.ironsource.lifecycle.b.d();
        Intrinsics.checkNotNullExpressionValue(bVarD, "getInstance()");
        return bVarD;
    }

    public final C3461cd c(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Sa saA = this.e.a();
        if (saA == null) {
            throw new IllegalStateException("Error getting sdk configurations");
        }
        C3461cd c3461cdC = saA.c(LevelPlay.AdFormat.NATIVE_AD, placementName);
        if (c3461cdC != null) {
            return c3461cdC;
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final Ra.a d(String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Sa saA = this.e.a();
        if (saA != null) {
            return saA.a(adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final C3461cd a(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Sa saA = this.e.a();
        if (saA != null) {
            C3461cd c3461cdC = saA.c(LevelPlay.AdFormat.BANNER, placementName);
            if (c3461cdC != null) {
                return c3461cdC;
            }
            throw new IllegalStateException("Error getting placement");
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final InterfaceC3754t6.a b(LevelPlay.AdFormat adFormat, String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Sa saA = this.e.a();
        if (saA != null) {
            return saA.b(adFormat, adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final long b(LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Sa saA = this.e.a();
        return saA != null ? saA.b(adFormat) : this.f;
    }

    public C3681p0(C3681p0 adTools, F0.b level) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(level, "level");
        this.e = Gb.s.d().f();
        this.f = TimeUnit.HOURS.toMillis(1L);
        IronSource.a aVar = adTools.b;
        this.b = aVar;
        this.c = adTools.c;
        this.d = new C3838y5(aVar, level, adTools.d.c(), null, 8, null);
    }

    public final C3461cd a(LevelPlay.AdFormat adFormat, String str) {
        Sa saA;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        if (str == null || (saA = this.e.a()) == null) {
            return null;
        }
        return saA.c(adFormat, str);
    }

    public final void a(Map<String, Object> data, ISBannerSize size) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(size, "size");
        com.ironsource.mediationsdk.j.a(data, size);
    }

    public final ISBannerSize a(LevelPlayAdSize adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        return new C3627m0().b(adSize);
    }
}
