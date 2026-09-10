package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C0364h1;
import com.ironsource.C0452m0;
import com.ironsource.mediationsdk.j;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class LevelPlayAdSize {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f38504f = 320;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f38505g = 50;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f38506h = 320;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f38507i = 90;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f38510m = 90;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f38513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f38514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LevelPlayAdSize f38515e;
    public static final Companion Companion = new Companion(null);
    public static final LevelPlayAdSize BANNER = new LevelPlayAdSize(320, 50, j.f29553a, false, null, 16, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f38508j = 300;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f38509k = 250;
    public static final LevelPlayAdSize MEDIUM_RECTANGLE = new LevelPlayAdSize(f38508j, f38509k, j.f29559g, false, null, 16, null);
    private static final int l = 728;
    public static final LevelPlayAdSize LEADERBOARD = new LevelPlayAdSize(l, 90, j.f29556d, false, null, 16, null);
    public static final LevelPlayAdSize LARGE = new LevelPlayAdSize(320, 90, j.f29554b, false, null, 16, null);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ LevelPlayAdSize createAdaptiveAdSize$default(Companion companion, Context context, Integer num, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                num = null;
            }
            return companion.createAdaptiveAdSize(context, num);
        }

        public final LevelPlayAdSize createAdSize$mediationsdk_release(String adSize) {
            n.f(adSize, "adSize");
            int iHashCode = adSize.hashCode();
            if (iHashCode != -96588539) {
                if (iHashCode != 72205083) {
                    if (iHashCode != 446888797) {
                        if (iHashCode == 1951953708 && adSize.equals(j.f29553a)) {
                            return LevelPlayAdSize.BANNER;
                        }
                    } else if (adSize.equals(j.f29556d)) {
                        return LevelPlayAdSize.LEADERBOARD;
                    }
                } else if (adSize.equals(j.f29554b)) {
                    return LevelPlayAdSize.LARGE;
                }
            } else if (adSize.equals(j.f29559g)) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            throw new IllegalArgumentException("Wrong Ad Size");
        }

        public final LevelPlayAdSize createAdaptiveAdSize(Context context) {
            n.f(context, "context");
            return createAdaptiveAdSize$default(this, context, null, 2, null);
        }

        public final LevelPlayAdSize createCustomSize(int i10, int i11) {
            return new LevelPlayAdSize(i10, i11, j.f29558f, false, null, 16, null);
        }

        private Companion() {
        }

        public final LevelPlayAdSize createAdaptiveAdSize(Context context, Integer num) {
            n.f(context, "context");
            return new C0364h1(new C0452m0()).a(context, num);
        }
    }

    public LevelPlayAdSize(int i10, int i11, String str, boolean z10, LevelPlayAdSize levelPlayAdSize) {
        this.f38511a = i10;
        this.f38512b = i11;
        this.f38513c = str;
        this.f38514d = z10;
        this.f38515e = levelPlayAdSize;
    }

    public static final LevelPlayAdSize createAdaptiveAdSize(Context context) {
        return Companion.createAdaptiveAdSize(context);
    }

    public static final LevelPlayAdSize createCustomSize(int i10, int i11) {
        return Companion.createCustomSize(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LevelPlayAdSize.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        n.d(obj, "null cannot be cast to non-null type com.unity3d.mediation.LevelPlayAdSize");
        LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
        return this.f38511a == levelPlayAdSize.f38511a && this.f38512b == levelPlayAdSize.f38512b && n.a(this.f38513c, levelPlayAdSize.f38513c);
    }

    public final String getDescription() {
        return String.valueOf(this.f38513c);
    }

    public final LevelPlayAdSize getFallbackAdSize$mediationsdk_release() {
        return this.f38515e;
    }

    public final int getHeight() {
        return this.f38512b;
    }

    public final int getWidth() {
        return this.f38511a;
    }

    public int hashCode() {
        int i10 = ((this.f38511a * 31) + this.f38512b) * 31;
        String str = this.f38513c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isAdaptive() {
        return this.f38514d;
    }

    public String toString() {
        return this.f38513c + " " + this.f38511a + "x" + this.f38512b;
    }

    public static final LevelPlayAdSize createAdaptiveAdSize(Context context, Integer num) {
        return Companion.createAdaptiveAdSize(context, num);
    }

    public /* synthetic */ LevelPlayAdSize(int i10, int i11, String str, boolean z10, LevelPlayAdSize levelPlayAdSize, int i12, g gVar) {
        this(i10, i11, (i12 & 4) != 0 ? null : str, z10, (i12 & 16) != 0 ? null : levelPlayAdSize);
    }
}
