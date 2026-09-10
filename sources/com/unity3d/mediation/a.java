package com.unity3d.mediation;

import aa.b;
import com.ironsource.mediationsdk.IronSource;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38525a = new a();

    /* JADX INFO: renamed from: com.unity3d.mediation.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class C0223a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38526a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f38526a = iArr;
        }
    }

    private a() {
    }

    public static final IronSource.a a(LevelPlay.AdFormat adFormat) {
        n.f(adFormat, "<this>");
        int i10 = C0223a.f38526a[adFormat.ordinal()];
        if (i10 == 1) {
            return IronSource.a.BANNER;
        }
        if (i10 == 2) {
            return IronSource.a.INTERSTITIAL;
        }
        if (i10 == 3) {
            return IronSource.a.REWARDED_VIDEO;
        }
        if (i10 == 4) {
            return IronSource.a.NATIVE_AD;
        }
        throw new b((byte) 0, 20);
    }
}
