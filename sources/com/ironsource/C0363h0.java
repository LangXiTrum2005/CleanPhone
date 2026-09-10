package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;

/* JADX INFO: renamed from: com.ironsource.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0363h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSource.a f28753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UUID f28754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C0358gd f28756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Tf f28757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Double f28758f;

    /* JADX INFO: renamed from: com.ironsource.h0$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28759a;

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
            f28759a = iArr;
        }
    }

    public C0363h0(IronSource.a adFormat, UUID adId, String adUnitId, C0358gd c0358gd, Tf tf, Double d10) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(adId, "adId");
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        this.f28753a = adFormat;
        this.f28754b = adId;
        this.f28755c = adUnitId;
        this.f28756d = c0358gd;
        this.f28757e = tf;
        this.f28758f = d10;
    }

    public final IronSource.a a() {
        return this.f28753a;
    }

    public final UUID b() {
        return this.f28754b;
    }

    public final String c() {
        return this.f28755c;
    }

    public final Double d() {
        return this.f28758f;
    }

    public final LevelPlay.AdFormat e() {
        int i10 = a.f28759a[this.f28753a.ordinal()];
        if (i10 == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i10 == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i10 == 3) {
            return LevelPlay.AdFormat.BANNER;
        }
        if (i10 == 4) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        throw new aa.b((byte) 0, 20);
    }

    public final C0358gd f() {
        return this.f28756d;
    }

    public final Tf g() {
        return this.f28757e;
    }

    public final boolean h() {
        return xj.o.Q(IronSource.a.REWARDED_VIDEO, IronSource.a.INTERSTITIAL).contains(this.f28753a);
    }

    public final void a(C0358gd c0358gd) {
        this.f28756d = c0358gd;
    }

    public /* synthetic */ C0363h0(IronSource.a aVar, UUID uuid, String str, C0358gd c0358gd, Tf tf, Double d10, int i10, kotlin.jvm.internal.g gVar) {
        this(aVar, uuid, str, (i10 & 8) != 0 ? null : c0358gd, (i10 & 16) != 0 ? null : tf, (i10 & 32) != 0 ? null : d10);
    }
}
