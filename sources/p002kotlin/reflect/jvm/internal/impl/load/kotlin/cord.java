package p002kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.ironsource.mediationsdk.logger.IronSourceError;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: compiled from: TypeMappingMode.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class cord {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final attabal f30699apical = new attabal(null);

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final cord f30700arytenoidectomy;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final cord f30701formularize;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final cord f30702graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final cord f30703impassible;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final cord f30704kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final cord f30705molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final cord f30706monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final cord f30707polloi;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static final cord f30708triweekly;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final boolean f30709attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final cord f30710beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final boolean f30711competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final boolean f30712cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final boolean f30713dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final cord f30714impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final boolean f30715marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final boolean f30716saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final cord f30717taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final boolean f30718wireman;

    /* JADX INFO: compiled from: TypeMappingMode.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public attabal() {
        }
    }

    /* JADX INFO: compiled from: TypeMappingMode.kt */
    public /* synthetic */ class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f30719attabal;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30719attabal = iArr;
        }
    }

    static {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        cord cordVar = new cord(z, z2, z3, z4, z5, null, false, null, null, z6, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
        f30701formularize = cordVar;
        cord cordVar2 = new cord(false, false, z6, false, false, null, false, null, null, true, 511, null);
        f30703impassible = cordVar2;
        f30708triweekly = new cord(false, true, false, false, false, null, false, null, null, false, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, null);
        f30704kowloon = new cord(z, z2, z3, z4, z5, cordVar, false, null, null, z6, 988, null);
        f30700arytenoidectomy = new cord(false, false, z6, false, false, cordVar2, false, null, null, true, 476, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z7 = false;
        cord cordVar3 = null;
        cord cordVar4 = null;
        f30706monoploid = new cord(z, true, z3, z4, z5, cordVar, z7, cordVar3, cordVar4, z6, 988, defaultConstructorMarker);
        boolean z8 = false;
        boolean z9 = true;
        f30707polloi = new cord(z, z8, z3, z9, z5, cordVar, z7, cordVar3, cordVar4, z6, 983, defaultConstructorMarker);
        f30705molybdenite = new cord(z, z8, z3, z9, z5, cordVar, z7, cordVar3, cordVar4, z6, 919, defaultConstructorMarker);
        f30702graveside = new cord(z, z8, true, false, z5, cordVar, z7, cordVar3, cordVar4, z6, 984, defaultConstructorMarker);
    }

    public cord(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, cord cordVar, boolean z6, cord cordVar2, cord cordVar3, boolean z7) {
        this.f30709attabal = z;
        this.f30716saneness = z2;
        this.f30713dern = z3;
        this.f30718wireman = z4;
        this.f30715marial = z5;
        this.f30710beachfront = cordVar;
        this.f30711competently = z6;
        this.f30714impromptu = cordVar2;
        this.f30717taiyuan = cordVar3;
        this.f30712cutely = z7;
    }

    public final boolean attabal() {
        return this.f30711competently;
    }

    public final cord beachfront(Variance effectiveVariance, boolean z) {
        Intrinsics.checkNotNullParameter(effectiveVariance, "effectiveVariance");
        if (!z || !this.f30713dern) {
            int i = saneness.f30719attabal[effectiveVariance.ordinal()];
            if (i == 1) {
                cord cordVar = this.f30714impromptu;
                if (cordVar != null) {
                    return cordVar;
                }
            } else if (i != 2) {
                cord cordVar2 = this.f30710beachfront;
                if (cordVar2 != null) {
                    return cordVar2;
                }
            } else {
                cord cordVar3 = this.f30717taiyuan;
                if (cordVar3 != null) {
                    return cordVar3;
                }
            }
        }
        return this;
    }

    public final cord competently() {
        return new cord(this.f30709attabal, true, this.f30713dern, this.f30718wireman, this.f30715marial, this.f30710beachfront, this.f30711competently, this.f30714impromptu, this.f30717taiyuan, false, 512, null);
    }

    public final boolean dern() {
        return this.f30716saneness;
    }

    public final boolean marial() {
        return this.f30713dern;
    }

    public final boolean saneness() {
        return this.f30712cutely;
    }

    public final boolean wireman() {
        return this.f30709attabal;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ cord(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, cord cordVar, boolean z6, cord cordVar2, cord cordVar3, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? false : z4;
        z5 = (i & 16) != 0 ? false : z5;
        cordVar = (i & 32) != 0 ? null : cordVar;
        this(z, z2, z3, z4, z5, cordVar, (i & 64) != 0 ? true : z6, (i & 128) != 0 ? cordVar : cordVar2, (i & 256) != 0 ? cordVar : cordVar3, (i & 512) != 0 ? false : z7);
    }
}
