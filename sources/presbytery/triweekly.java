package presbytery;

import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* JADX INFO: compiled from: TypeSystemContext.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class triweekly {

    /* JADX INFO: compiled from: TypeSystemContext.kt */
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f35663attabal;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f35663attabal = iArr;
        }
    }

    public static final TypeVariance attabal(Variance variance) {
        Intrinsics.checkNotNullParameter(variance, "<this>");
        int i = attabal.f35663attabal[variance.ordinal()];
        if (i == 1) {
            return TypeVariance.INV;
        }
        if (i == 2) {
            return TypeVariance.IN;
        }
        if (i == 3) {
            return TypeVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
