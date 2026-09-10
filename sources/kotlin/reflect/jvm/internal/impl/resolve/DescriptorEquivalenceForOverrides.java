package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;

/* JADX INFO: loaded from: classes7.dex */
public final class DescriptorEquivalenceForOverrides {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DescriptorEquivalenceForOverrides f44275a = new DescriptorEquivalenceForOverrides();

    public static SourceElement e(CallableDescriptor callableDescriptor) {
        while (callableDescriptor instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) callableDescriptor;
            if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.f43557Y) {
                break;
            }
            Collection overriddenDescriptors = callableMemberDescriptor.l();
            Intrinsics.e(overriddenDescriptors, "overriddenDescriptors");
            callableDescriptor = (CallableMemberDescriptor) CollectionsKt.X(overriddenDescriptors);
            if (callableDescriptor == null) {
                return null;
            }
        }
        return callableDescriptor.f();
    }

    public final boolean a(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, final boolean z2) {
        if ((declarationDescriptor instanceof ClassDescriptor) && (declarationDescriptor2 instanceof ClassDescriptor)) {
            return Intrinsics.a(((ClassDescriptor) declarationDescriptor).h(), ((ClassDescriptor) declarationDescriptor2).h());
        }
        if ((declarationDescriptor instanceof TypeParameterDescriptor) && (declarationDescriptor2 instanceof TypeParameterDescriptor)) {
            return b((TypeParameterDescriptor) declarationDescriptor, (TypeParameterDescriptor) declarationDescriptor2, z2, DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1.X);
        }
        if (!(declarationDescriptor instanceof CallableDescriptor) || !(declarationDescriptor2 instanceof CallableDescriptor)) {
            return ((declarationDescriptor instanceof PackageFragmentDescriptor) && (declarationDescriptor2 instanceof PackageFragmentDescriptor)) ? Intrinsics.a(((PackageFragmentDescriptor) declarationDescriptor).c(), ((PackageFragmentDescriptor) declarationDescriptor2).c()) : Intrinsics.a(declarationDescriptor, declarationDescriptor2);
        }
        final CallableDescriptor a2 = (CallableDescriptor) declarationDescriptor;
        final CallableDescriptor b2 = (CallableDescriptor) declarationDescriptor2;
        Intrinsics.f(a2, "a");
        Intrinsics.f(b2, "b");
        if (!a2.equals(b2)) {
            if (!Intrinsics.a(a2.getName(), b2.getName())) {
                return false;
            }
            if ((a2 instanceof MemberDescriptor) && (b2 instanceof MemberDescriptor) && ((MemberDescriptor) a2).d0() != ((MemberDescriptor) b2).d0()) {
                return false;
            }
            if ((Intrinsics.a(a2.d(), b2.d()) && (!z2 || !Intrinsics.a(e(a2), e(b2)))) || DescriptorUtils.o(a2) || DescriptorUtils.o(b2) || !d(a2, b2, DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$1.X, z2)) {
                return false;
            }
            OverridingUtil overridingUtil = new OverridingUtil(new KotlinTypeChecker.TypeConstructorEquality(a2, b2, z2) { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$$Lambda$0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f44276a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CallableDescriptor f44277b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final CallableDescriptor f44278c;

                {
                    this.f44276a = z2;
                    this.f44277b = a2;
                    this.f44278c = b2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
                public final boolean a(TypeConstructor c1, TypeConstructor c2) {
                    final CallableDescriptor a3 = this.f44277b;
                    Intrinsics.f(a3, "$a");
                    final CallableDescriptor b3 = this.f44278c;
                    Intrinsics.f(b3, "$b");
                    Intrinsics.f(c1, "c1");
                    Intrinsics.f(c2, "c2");
                    if (c1.equals(c2)) {
                        return true;
                    }
                    ClassifierDescriptor classifierDescriptorC = c1.c();
                    ClassifierDescriptor classifierDescriptorC2 = c2.c();
                    if (!(classifierDescriptorC instanceof TypeParameterDescriptor) || !(classifierDescriptorC2 instanceof TypeParameterDescriptor)) {
                        return false;
                    }
                    return DescriptorEquivalenceForOverrides.f44275a.b((TypeParameterDescriptor) classifierDescriptorC, (TypeParameterDescriptor) classifierDescriptorC2, this.f44276a, new Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Boolean.valueOf(Intrinsics.a((DeclarationDescriptor) obj, a3) && Intrinsics.a((DeclarationDescriptor) obj2, b3));
                        }
                    });
                }
            });
            OverridingUtil.OverrideCompatibilityInfo.Result resultC = overridingUtil.m(a2, b2, null, true).c();
            OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.OverrideCompatibilityInfo.Result.X;
            if (resultC != result || overridingUtil.m(b2, a2, null, true).c() != result) {
                return false;
            }
        }
        return true;
    }

    public final boolean b(TypeParameterDescriptor a2, TypeParameterDescriptor b2, boolean z2, Function2 function2) {
        Intrinsics.f(a2, "a");
        Intrinsics.f(b2, "b");
        if (a2.equals(b2)) {
            return true;
        }
        return !Intrinsics.a(a2.d(), b2.d()) && d(a2, b2, function2, z2) && a2.g() == b2.g();
    }

    public final boolean d(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, Function2 function2, boolean z2) {
        DeclarationDescriptor declarationDescriptorD = declarationDescriptor.d();
        DeclarationDescriptor declarationDescriptorD2 = declarationDescriptor2.d();
        return ((declarationDescriptorD instanceof CallableMemberDescriptor) || (declarationDescriptorD2 instanceof CallableMemberDescriptor)) ? ((Boolean) function2.invoke(declarationDescriptorD, declarationDescriptorD2)).booleanValue() : a(declarationDescriptorD, declarationDescriptorD2, z2);
    }
}
