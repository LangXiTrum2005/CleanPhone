package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3538h0 {
    private final IronSource.a a;
    private final UUID b;
    private final String c;
    private C3461cd d;
    private final Df e;
    private final Double f;

    /* JADX INFO: renamed from: com.ironsource.h0$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public C3538h0(IronSource.a adFormat, UUID adId, String adUnitId, C3461cd c3461cd, Df df, Double d) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.a = adFormat;
        this.b = adId;
        this.c = adUnitId;
        this.d = c3461cd;
        this.e = df;
        this.f = d;
    }

    public final IronSource.a a() {
        return this.a;
    }

    public final UUID b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final Double d() {
        return this.f;
    }

    public final LevelPlay.AdFormat e() {
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i == 3) {
            return LevelPlay.AdFormat.BANNER;
        }
        if (i == 4) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final C3461cd f() {
        return this.d;
    }

    public final Df g() {
        return this.e;
    }

    public final boolean h() {
        return p002kotlin.collections.adultoid.kowloon(IronSource.a.REWARDED_VIDEO, IronSource.a.INTERSTITIAL).contains(this.a);
    }

    public final void a(C3461cd c3461cd) {
        this.d = c3461cd;
    }

    public /* synthetic */ C3538h0(IronSource.a aVar, UUID uuid, String str, C3461cd c3461cd, Df df, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, uuid, str, (i & 8) != 0 ? null : c3461cd, (i & 16) != 0 ? null : df, (i & 32) != 0 ? null : d);
    }
}
