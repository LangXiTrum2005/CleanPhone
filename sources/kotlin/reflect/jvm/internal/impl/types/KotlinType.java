package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: loaded from: classes7.dex */
public abstract class KotlinType implements Annotated, KotlinTypeMarker {
    public int X;

    public abstract List F0();

    public abstract TypeAttributes G0();

    public abstract TypeConstructor H0();

    public abstract boolean I0();

    public abstract KotlinType J0(KotlinTypeRefiner kotlinTypeRefiner);

    public abstract UnwrappedType K0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KotlinType)) {
            return false;
        }
        KotlinType kotlinType = (KotlinType) obj;
        if (I0() == kotlinType.I0()) {
            return AbstractStrictEqualityTypeChecker.b(SimpleClassicTypeSystemContext.f44576a, K0(), kotlinType.K0());
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        return AnnotationsTypeAttributeKt.a(G0());
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = this.X;
        if (i2 != 0) {
            return i2;
        }
        if (KotlinTypeKt.a(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (I0() ? 1 : 0) + ((F0().hashCode() + (H0().hashCode() * 31)) * 31);
        }
        this.X = iHashCode;
        return iHashCode;
    }

    public abstract MemberScope n();
}
