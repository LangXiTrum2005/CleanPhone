package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes7.dex */
public final class TypeSystemContextKt {

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final TypeVariance a(Variance variance) {
        int iOrdinal = variance.ordinal();
        if (iOrdinal == 0) {
            return TypeVariance.INV;
        }
        if (iOrdinal == 1) {
            return TypeVariance.IN;
        }
        if (iOrdinal == 2) {
            return TypeVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
