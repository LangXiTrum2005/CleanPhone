package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes7.dex */
public abstract class UnwrappedType extends KotlinType {
    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final UnwrappedType K0() {
        return this;
    }

    public abstract UnwrappedType L0(boolean z2);

    public abstract UnwrappedType M0(KotlinTypeRefiner kotlinTypeRefiner);

    public abstract UnwrappedType N0(TypeAttributes typeAttributes);
}
