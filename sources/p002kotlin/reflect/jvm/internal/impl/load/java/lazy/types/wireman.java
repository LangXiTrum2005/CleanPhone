package p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.List;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.dovishness;
import p002kotlin.reflect.jvm.internal.impl.types.gintrap;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.reflect.jvm.internal.impl.types.treadless;

/* JADX INFO: compiled from: RawProjectionComputer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class wireman extends dovishness {

    /* JADX INFO: compiled from: RawProjectionComputer.kt */
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f30593attabal;

        static {
            int[] iArr = new int[JavaTypeFlexibility.values().length];
            try {
                iArr[JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JavaTypeFlexibility.INFLEXIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30593attabal = iArr;
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.dovishness
    public timberyard attabal(clubfoot parameter, gintrap typeAttr, TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, oilcan erasedUpperBound) {
        timberyard treadlessVar;
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        Intrinsics.checkNotNullParameter(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        Intrinsics.checkNotNullParameter(erasedUpperBound, "erasedUpperBound");
        if (!(typeAttr instanceof p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.attabal)) {
            return super.attabal(parameter, typeAttr, typeParameterUpperBoundEraser, erasedUpperBound);
        }
        p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.attabal attabalVarFormularize = (p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.attabal) typeAttr;
        if (!attabalVarFormularize.taiyuan()) {
            attabalVarFormularize = attabalVarFormularize.formularize(JavaTypeFlexibility.INFLEXIBLE);
        }
        int i = attabal.f30593attabal[attabalVarFormularize.competently().ordinal()];
        if (i == 1) {
            return new treadless(Variance.INVARIANT, erasedUpperBound);
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (parameter.cutely().getAllowsOutPosition()) {
            List<clubfoot> parameters = erasedUpperBound.setterwort().getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            treadlessVar = !parameters.isEmpty() ? new treadless(Variance.OUT_VARIANCE, erasedUpperBound) : nosophobia.graveside(parameter, attabalVarFormularize);
        } else {
            treadlessVar = new treadless(Variance.INVARIANT, DescriptorUtilsKt.cutely(parameter).supplicat());
        }
        Intrinsics.beachfront(treadlessVar);
        return treadlessVar;
    }
}
