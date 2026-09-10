package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class KotlinTypeFactory {

    public static final class ExpandedTypeOrRefinedConstructor {
    }

    public static final ExpandedTypeOrRefinedConstructor a(TypeConstructor typeConstructor, KotlinTypeRefiner kotlinTypeRefiner, List list) {
        ClassifierDescriptor classifierDescriptorC = typeConstructor.c();
        if (classifierDescriptorC != null) {
            kotlinTypeRefiner.d(classifierDescriptorC);
        }
        return null;
    }

    public static final UnwrappedType b(SimpleType lowerBound, SimpleType upperBound) {
        Intrinsics.f(lowerBound, "lowerBound");
        Intrinsics.f(upperBound, "upperBound");
        return lowerBound.equals(upperBound) ? lowerBound : new FlexibleTypeImpl(lowerBound, upperBound);
    }

    public static final SimpleType c(TypeAttributes attributes, ClassDescriptor descriptor, List arguments) {
        Intrinsics.f(attributes, "attributes");
        Intrinsics.f(descriptor, "descriptor");
        Intrinsics.f(arguments, "arguments");
        TypeConstructor typeConstructorH = descriptor.h();
        Intrinsics.e(typeConstructorH, "descriptor.typeConstructor");
        return d(attributes, typeConstructorH, arguments, false, null);
    }

    public static final SimpleType d(final TypeAttributes attributes, final TypeConstructor constructor, final List arguments, final boolean z2, KotlinTypeRefiner kotlinTypeRefiner) {
        MemberScope memberScopeA;
        ModuleAwareClassDescriptor moduleAwareClassDescriptor;
        Intrinsics.f(attributes, "attributes");
        Intrinsics.f(constructor, "constructor");
        Intrinsics.f(arguments, "arguments");
        if (attributes.isEmpty() && arguments.isEmpty() && !z2 && constructor.c() != null) {
            ClassifierDescriptor classifierDescriptorC = constructor.c();
            Intrinsics.c(classifierDescriptorC);
            SimpleType simpleTypeO = classifierDescriptorC.o();
            Intrinsics.e(simpleTypeO, "constructor.declarationDescriptor!!.defaultType");
            return simpleTypeO;
        }
        ClassifierDescriptor classifierDescriptorC2 = constructor.c();
        if (classifierDescriptorC2 instanceof TypeParameterDescriptor) {
            memberScopeA = ((TypeParameterDescriptor) classifierDescriptorC2).o().n();
        } else if (classifierDescriptorC2 instanceof ClassDescriptor) {
            if (kotlinTypeRefiner == null) {
                DescriptorUtilsKt.i(DescriptorUtilsKt.j(classifierDescriptorC2));
                kotlinTypeRefiner = KotlinTypeRefiner.Default.f44564a;
            }
            if (arguments.isEmpty()) {
                ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorC2;
                Intrinsics.f(classDescriptor, "<this>");
                moduleAwareClassDescriptor = classDescriptor instanceof ModuleAwareClassDescriptor ? (ModuleAwareClassDescriptor) classDescriptor : null;
                if (moduleAwareClassDescriptor == null || (memberScopeA = moduleAwareClassDescriptor.c0(kotlinTypeRefiner)) == null) {
                    memberScopeA = classDescriptor.Q();
                    Intrinsics.e(memberScopeA, "this.unsubstitutedMemberScope");
                }
            } else {
                ClassDescriptor classDescriptor2 = (ClassDescriptor) classifierDescriptorC2;
                TypeSubstitution typeSubstitutionA = TypeConstructorSubstitution.f44539b.a(constructor, arguments);
                Intrinsics.f(classDescriptor2, "<this>");
                moduleAwareClassDescriptor = classDescriptor2 instanceof ModuleAwareClassDescriptor ? (ModuleAwareClassDescriptor) classDescriptor2 : null;
                if (moduleAwareClassDescriptor == null || (memberScopeA = moduleAwareClassDescriptor.Z(typeSubstitutionA, kotlinTypeRefiner)) == null) {
                    memberScopeA = classDescriptor2.j0(typeSubstitutionA);
                    Intrinsics.e(memberScopeA, "this.getMemberScope(\n   …ubstitution\n            )");
                }
            }
        } else if (classifierDescriptorC2 instanceof TypeAliasDescriptor) {
            ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE;
            String str = ((TypeAliasDescriptor) classifierDescriptorC2).getName().X;
            Intrinsics.e(str, "descriptor.name.toString()");
            memberScopeA = ErrorUtils.a(errorScopeKind, true, str);
        } else {
            if (!(constructor instanceof IntersectionTypeConstructor)) {
                throw new IllegalStateException("Unsupported classifier: " + classifierDescriptorC2 + " for constructor: " + constructor);
            }
            memberScopeA = TypeIntersectionScope.Companion.a("member scope for intersection type", ((IntersectionTypeConstructor) constructor).f44513b);
        }
        return f(attributes, constructor, arguments, z2, memberScopeA, new Function1<KotlinTypeRefiner, SimpleType>(arguments, attributes, z2) { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$simpleType$1

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ List f44515Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KotlinTypeRefiner refiner = (KotlinTypeRefiner) obj;
                Intrinsics.f(refiner, "refiner");
                KotlinTypeFactory.a(this.X, refiner, this.f44515Y);
                return null;
            }
        });
    }

    public static final SimpleType e(final List arguments, final MemberScope memberScope, final TypeAttributes attributes, final TypeConstructor constructor, final boolean z2) {
        Intrinsics.f(attributes, "attributes");
        Intrinsics.f(constructor, "constructor");
        Intrinsics.f(arguments, "arguments");
        Intrinsics.f(memberScope, "memberScope");
        SimpleTypeImpl simpleTypeImpl = new SimpleTypeImpl(constructor, arguments, z2, memberScope, new Function1<KotlinTypeRefiner, SimpleType>(arguments, memberScope, attributes, constructor, z2) { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1
            public final /* synthetic */ TypeConstructor X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ List f44516Y;
            public final /* synthetic */ MemberScope Z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.X = constructor;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KotlinTypeRefiner kotlinTypeRefiner = (KotlinTypeRefiner) obj;
                Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
                KotlinTypeFactory.a(this.X, kotlinTypeRefiner, this.f44516Y);
                return null;
            }
        });
        return attributes.isEmpty() ? simpleTypeImpl : new SimpleTypeWithAttributes(simpleTypeImpl, attributes);
    }

    public static final SimpleType f(TypeAttributes attributes, TypeConstructor constructor, List arguments, boolean z2, MemberScope memberScope, Function1 function1) {
        Intrinsics.f(attributes, "attributes");
        Intrinsics.f(constructor, "constructor");
        Intrinsics.f(arguments, "arguments");
        Intrinsics.f(memberScope, "memberScope");
        SimpleTypeImpl simpleTypeImpl = new SimpleTypeImpl(constructor, arguments, z2, memberScope, function1);
        return attributes.isEmpty() ? simpleTypeImpl : new SimpleTypeWithAttributes(simpleTypeImpl, attributes);
    }
}
