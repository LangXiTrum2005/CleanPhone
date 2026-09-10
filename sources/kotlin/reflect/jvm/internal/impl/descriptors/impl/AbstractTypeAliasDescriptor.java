package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractTypeAliasDescriptor extends DeclarationDescriptorNonRootImpl implements TypeAliasDescriptor {
    public final DelegatedDescriptorVisibility f0;
    public List g0;
    public final AbstractTypeAliasDescriptor$typeConstructor$1 h0;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1] */
    public AbstractTypeAliasDescriptor(DeclarationDescriptor containingDeclaration, Annotations annotations, Name name, DelegatedDescriptorVisibility visibilityImpl) {
        SourceElement sourceElement = SourceElement.f43591a;
        Intrinsics.f(containingDeclaration, "containingDeclaration");
        Intrinsics.f(visibilityImpl, "visibilityImpl");
        super(containingDeclaration, annotations, name, sourceElement);
        this.f0 = visibilityImpl;
        this.h0 = new TypeConstructor() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public final ClassifierDescriptor c() {
                return this.f43627a;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public final Collection d() {
                Collection collectionD = ((DeserializedTypeAliasDescriptor) this.f43627a).m0().H0().d();
                Intrinsics.e(collectionD, "declarationDescriptor.un…pe.constructor.supertypes");
                return collectionD;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public final boolean e() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public final List getParameters() {
                return this.f43627a.G0();
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public final KotlinBuiltIns k() {
                return DescriptorUtilsKt.e(this.f43627a);
            }

            public final String toString() {
                return "[typealias " + this.f43627a.getName().b() + AbstractJsonLexerKt.END_LIST;
            }
        };
    }

    public final SimpleType F0() {
        MemberScope memberScopeQ;
        final DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = (DeserializedTypeAliasDescriptor) this;
        ClassDescriptor classDescriptorR = deserializedTypeAliasDescriptor.r();
        if (classDescriptorR == null || (memberScopeQ = classDescriptorR.Q()) == null) {
            memberScopeQ = MemberScope.Empty.f44351b;
        }
        Function1<KotlinTypeRefiner, SimpleType> function1 = new Function1<KotlinTypeRefiner, SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$computeDefaultType$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((KotlinTypeRefiner) obj).d(deserializedTypeAliasDescriptor);
                return null;
            }
        };
        ErrorType errorType = TypeUtils.f44555a;
        return ErrorUtils.f(this) ? ErrorUtils.c(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, toString()) : TypeUtils.l(h(), memberScopeQ, function1);
    }

    public abstract List G0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean R() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public final ClassifierDescriptor y0() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean d0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final DescriptorVisibility getVisibility() {
        return this.f0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final TypeConstructor h() {
        return this.h0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final List p() {
        List list = this.g0;
        if (list != null) {
            return list;
        }
        Intrinsics.m("declaredTypeParametersImpl");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object v(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.b(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final boolean w() {
        return TypeUtils.c(((DeserializedTypeAliasDescriptor) this).m0(), new Function1<UnwrappedType, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$isInner$1
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:9:0x0029  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z2;
                UnwrappedType type = (UnwrappedType) obj;
                Intrinsics.e(type, "type");
                if (KotlinTypeKt.a(type)) {
                    z2 = false;
                } else {
                    ClassifierDescriptor classifierDescriptorC = type.H0().c();
                    if (!(classifierDescriptorC instanceof TypeParameterDescriptor) || Intrinsics.a(((TypeParameterDescriptor) classifierDescriptorC).d(), this.X)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            }
        }, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    public final DeclarationDescriptorWithSource y0() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public final DeclarationDescriptor y0() {
        return this;
    }
}
