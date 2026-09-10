package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
public final class NewKotlinTypeCheckerImpl implements NewKotlinTypeChecker {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KotlinTypePreparator f44575c = KotlinTypePreparator.Default.f44563a;
    public final OverridingUtil d = new OverridingUtil(OverridingUtil.d);

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    public final OverridingUtil a() {
        return this.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    public final KotlinTypeRefiner b() {
        return KotlinTypeRefiner.Default.f44564a;
    }

    public final boolean c(KotlinType a2, KotlinType b2) {
        Intrinsics.f(a2, "a");
        Intrinsics.f(b2, "b");
        return AbstractTypeChecker.e(ClassicTypeCheckerStateKt.a(false, this.f44575c, 6), a2.K0(), b2.K0());
    }

    public final boolean d(KotlinType subtype, KotlinType supertype) {
        Intrinsics.f(subtype, "subtype");
        Intrinsics.f(supertype, "supertype");
        return AbstractTypeChecker.i(AbstractTypeChecker.f44488a, ClassicTypeCheckerStateKt.a(true, this.f44575c, 6), subtype.K0(), supertype.K0());
    }
}
