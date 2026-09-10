package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0452m0 extends C0624vb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0690z5 f29211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final If.b f29212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I8 f29213d;

    public C0452m0() {
        IronSource.a aVar = IronSource.a.BANNER;
        this.f29211b = new C0690z5(aVar, F0.b.MEDIATION, null, null, 12, null);
        If.b bVarB = If.b(aVar);
        kotlin.jvm.internal.n.e(bVarB, "createLogFactory(IronSource.AD_UNIT.BANNER)");
        this.f29212c = bVarB;
        this.f29213d = Kb.f26413u.d().f();
    }

    public static /* synthetic */ String a(C0452m0 c0452m0, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c0452m0.a(str, str2);
    }

    public final Integer b(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        Float fB = b();
        if (fB != null) {
            return Integer.valueOf(a.a.H(fB.floatValue() * Z4.f28089a.a(context)));
        }
        return null;
    }

    public final boolean c() {
        return Kb.f26413u.d().f().c();
    }

    private final ISBannerSize c(LevelPlayAdSize levelPlayAdSize) {
        if (kotlin.jvm.internal.n.a(levelPlayAdSize, LevelPlayAdSize.LARGE)) {
            return new ISBannerSize(com.ironsource.mediationsdk.j.f29554b, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
        }
        if (kotlin.jvm.internal.n.a(levelPlayAdSize, LevelPlayAdSize.MEDIUM_RECTANGLE)) {
            return new ISBannerSize(com.ironsource.mediationsdk.j.f29555c, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
        }
        if (kotlin.jvm.internal.n.a(levelPlayAdSize, LevelPlayAdSize.LEADERBOARD)) {
            return new ISBannerSize(com.ironsource.mediationsdk.j.f29557e, 0, 0);
        }
        return levelPlayAdSize.equals(LevelPlayAdSize.Companion.createCustomSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight())) ? new ISBannerSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : new ISBannerSize(com.ironsource.mediationsdk.j.f29553a, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
    }

    public final String a(String str, String str2) {
        String strA = this.f29212c.a(str, str2);
        kotlin.jvm.internal.n.e(strA, "logFactory.createLogMessage(message, suffix)");
        return strA;
    }

    public final List<LevelPlayAdSize> a() {
        Va vaA = this.f29213d.a();
        if (vaA != null) {
            return vaA.k();
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final ISBannerSize b(LevelPlayAdSize size) {
        kotlin.jvm.internal.n.f(size, "size");
        boolean zIsAdaptive = size.isAdaptive();
        if (zIsAdaptive) {
            return a(size);
        }
        if (!zIsAdaptive) {
            return c(size);
        }
        throw new aa.b((byte) 0, 20);
    }

    public final int a(int i10) {
        return com.ironsource.mediationsdk.j.a(i10);
    }

    private final ISBannerSize a(LevelPlayAdSize levelPlayAdSize) {
        LevelPlayAdSize fallbackAdSize$mediationsdk_release = levelPlayAdSize.getFallbackAdSize$mediationsdk_release();
        if (fallbackAdSize$mediationsdk_release == null) {
            fallbackAdSize$mediationsdk_release = LevelPlayAdSize.BANNER;
        }
        ISBannerSize iSBannerSizeB = b(fallbackAdSize$mediationsdk_release);
        iSBannerSizeB.setAdaptive(true);
        com.ironsource.mediationsdk.m.f29599a.a(iSBannerSizeB, new U7(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()));
        return iSBannerSizeB;
    }

    private final Float b() {
        Va vaA = this.f29213d.a();
        Float fValueOf = vaA != null ? Float.valueOf(vaA.l()) : null;
        if (fValueOf != null) {
            return fValueOf;
        }
        this.f29211b.h().f("MaxScreenSizePercentageForBannerHeight is null: Error getting sdk configurations");
        return null;
    }
}
