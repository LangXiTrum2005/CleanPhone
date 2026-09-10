package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3627m0 extends C3725rb {
    private final C3838y5 b;
    private final C3746sf.b c;
    private final G8 d;

    public C3627m0() {
        IronSource.a aVar = IronSource.a.BANNER;
        this.b = new C3838y5(aVar, F0.b.MEDIATION, null, null, 12, null);
        C3746sf.b bVarB = C3746sf.b(aVar);
        Intrinsics.checkNotNullExpressionValue(bVarB, "createLogFactory(IronSource.AD_UNIT.BANNER)");
        this.c = bVarB;
        this.d = Gb.s.d().f();
    }

    public static /* synthetic */ String a(C3627m0 c3627m0, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c3627m0.a(str, str2);
    }

    private final ISBannerSize c(LevelPlayAdSize levelPlayAdSize) {
        if (Intrinsics.wireman(levelPlayAdSize, LevelPlayAdSize.LARGE)) {
            return new ISBannerSize(com.ironsource.mediationsdk.j.b, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
        }
        if (Intrinsics.wireman(levelPlayAdSize, LevelPlayAdSize.MEDIUM_RECTANGLE)) {
            return new ISBannerSize(com.ironsource.mediationsdk.j.c, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
        }
        if (Intrinsics.wireman(levelPlayAdSize, LevelPlayAdSize.LEADERBOARD)) {
            return new ISBannerSize(com.ironsource.mediationsdk.j.e, 0, 0);
        }
        return Intrinsics.wireman(levelPlayAdSize, LevelPlayAdSize.Companion.createCustomSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight())) ? new ISBannerSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : new ISBannerSize(com.ironsource.mediationsdk.j.a, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
    }

    public final List<LevelPlayAdSize> b() {
        Sa saA = this.d.a();
        if (saA != null) {
            return saA.k();
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final boolean d() {
        return Gb.s.d().f().c();
    }

    public final String a(String str, String str2) {
        String strA = this.c.a(str, str2);
        Intrinsics.checkNotNullExpressionValue(strA, "logFactory.createLogMessage(message, suffix)");
        return strA;
    }

    public final int a(int i) {
        return com.ironsource.mediationsdk.j.a(i);
    }

    private final ISBannerSize a(LevelPlayAdSize levelPlayAdSize) {
        LevelPlayAdSize fallbackAdSize$mediationsdk_release = levelPlayAdSize.getFallbackAdSize$mediationsdk_release();
        if (fallbackAdSize$mediationsdk_release == null) {
            fallbackAdSize$mediationsdk_release = LevelPlayAdSize.BANNER;
        }
        ISBannerSize iSBannerSizeB = b(fallbackAdSize$mediationsdk_release);
        iSBannerSizeB.setAdaptive(true);
        com.ironsource.mediationsdk.m.a.a(iSBannerSizeB, new S7(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()));
        return iSBannerSizeB;
    }

    public final Integer b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Float fC = c();
        if (fC != null) {
            return Integer.valueOf(pastie.dern.wireman(fC.floatValue() * Y4.a.a(context)));
        }
        return null;
    }

    public final ISBannerSize b(LevelPlayAdSize size) {
        Intrinsics.checkNotNullParameter(size, "size");
        boolean zIsAdaptive = size.isAdaptive();
        if (zIsAdaptive) {
            return a(size);
        }
        if (zIsAdaptive) {
            throw new NoWhenBranchMatchedException();
        }
        return c(size);
    }

    private final Float c() {
        Sa saA = this.d.a();
        Float fValueOf = saA != null ? Float.valueOf(saA.l()) : null;
        if (fValueOf != null) {
            return fValueOf;
        }
        this.b.h().f("MaxScreenSizePercentageForBannerHeight is null: Error getting sdk configurations");
        return null;
    }
}
