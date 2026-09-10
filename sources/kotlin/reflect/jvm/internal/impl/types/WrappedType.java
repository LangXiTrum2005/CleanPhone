package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes7.dex */
public abstract class WrappedType extends KotlinType {
    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final List F0() {
        return L0().F0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeAttributes G0() {
        return L0().G0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeConstructor H0() {
        return L0().H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean I0() {
        return L0().I0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final UnwrappedType K0() {
        KotlinType kotlinTypeL0 = L0();
        while (kotlinTypeL0 instanceof WrappedType) {
            kotlinTypeL0 = ((WrappedType) kotlinTypeL0).L0();
        }
        Intrinsics.d(kotlinTypeL0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (UnwrappedType) kotlinTypeL0;
    }

    public abstract KotlinType L0();

    public boolean M0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final MemberScope n() {
        return L0().n();
    }

    public final String toString() {
        return M0() ? L0().toString() : "<Not computed yet>";
    }
}
