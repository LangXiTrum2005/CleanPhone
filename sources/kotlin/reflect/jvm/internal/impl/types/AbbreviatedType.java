package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes7.dex */
public final class AbbreviatedType extends DelegatingSimpleType {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final SimpleType f44487Y;
    public final SimpleType Z;

    public AbbreviatedType(SimpleType delegate, SimpleType abbreviation) {
        Intrinsics.f(delegate, "delegate");
        Intrinsics.f(abbreviation, "abbreviation");
        this.f44487Y = delegate;
        this.Z = abbreviation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* JADX INFO: renamed from: P0 */
    public final SimpleType N0(TypeAttributes newAttributes) {
        Intrinsics.f(newAttributes, "newAttributes");
        return new AbbreviatedType(this.f44487Y.N0(newAttributes), this.Z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final SimpleType Q0() {
        return this.f44487Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final DelegatingSimpleType S0(SimpleType simpleType) {
        return new AbbreviatedType(simpleType, this.Z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final AbbreviatedType L0(boolean z2) {
        return new AbbreviatedType(this.f44487Y.L0(z2), this.Z.L0(z2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final AbbreviatedType J0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new AbbreviatedType((SimpleType) kotlinTypeRefiner.a(this.f44487Y), (SimpleType) kotlinTypeRefiner.a(this.Z));
    }
}
