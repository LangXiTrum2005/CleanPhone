package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes7.dex */
public final class DescriptorUtilsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f44314a = 0;

    static {
        Name.g("value");
    }

    public static final boolean a(ValueParameterDescriptor valueParameterDescriptor) {
        Intrinsics.f(valueParameterDescriptor, "<this>");
        Boolean boolC = DFS.c(CollectionsKt.H(valueParameterDescriptor), DescriptorUtilsKt$$Lambda$0.f44315a, DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.X);
        Intrinsics.e(boolC, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return boolC.booleanValue();
    }

    public static CallableMemberDescriptor b(CallableMemberDescriptor callableMemberDescriptor, final Function1 function1) {
        Intrinsics.f(callableMemberDescriptor, "<this>");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        return (CallableMemberDescriptor) DFS.a(CollectionsKt.H(callableMemberDescriptor), new DescriptorUtilsKt$$Lambda$1(), new DFS.AbstractNodeHandler<CallableMemberDescriptor, CallableMemberDescriptor>(function1) { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$firstOverridden$2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Lambda f44317b;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f44317b = (Lambda) function1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public final Object a() {
                return (CallableMemberDescriptor) this.f44316a.X;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public final void b(Object obj) {
                CallableMemberDescriptor current = (CallableMemberDescriptor) obj;
                Intrinsics.f(current, "current");
                Ref.ObjectRef objectRef2 = this.f44316a;
                if (objectRef2.X == null && ((Boolean) this.f44317b.invoke(current)).booleanValue()) {
                    objectRef2.X = current;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public final boolean c(Object obj) {
                CallableMemberDescriptor current = (CallableMemberDescriptor) obj;
                Intrinsics.f(current, "current");
                return this.f44316a.X == null;
            }
        });
    }

    public static final FqName c(DeclarationDescriptorNonRoot declarationDescriptorNonRoot) {
        Intrinsics.f(declarationDescriptorNonRoot, "<this>");
        FqNameUnsafe fqNameUnsafeH = h(declarationDescriptorNonRoot);
        if (!fqNameUnsafeH.d()) {
            fqNameUnsafeH = null;
        }
        if (fqNameUnsafeH != null) {
            return fqNameUnsafeH.g();
        }
        return null;
    }

    public static final ClassDescriptor d(AnnotationDescriptor annotationDescriptor) {
        Intrinsics.f(annotationDescriptor, "<this>");
        ClassifierDescriptor classifierDescriptorC = annotationDescriptor.getType().H0().c();
        if (classifierDescriptorC instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorC;
        }
        return null;
    }

    public static final KotlinBuiltIns e(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.f(declarationDescriptor, "<this>");
        return j(declarationDescriptor).k();
    }

    public static final ClassId f(ClassifierDescriptor classifierDescriptor) {
        DeclarationDescriptor declarationDescriptorD;
        ClassId classIdF;
        if (classifierDescriptor == null || (declarationDescriptorD = classifierDescriptor.d()) == null) {
            return null;
        }
        if (declarationDescriptorD instanceof PackageFragmentDescriptor) {
            return new ClassId(((PackageFragmentDescriptor) declarationDescriptorD).c(), classifierDescriptor.getName());
        }
        if (!(declarationDescriptorD instanceof ClassifierDescriptorWithTypeParameters) || (classIdF = f((ClassifierDescriptor) declarationDescriptorD)) == null) {
            return null;
        }
        return classIdF.d(classifierDescriptor.getName());
    }

    public static final FqName g(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.f(declarationDescriptor, "<this>");
        FqName fqNameH = DescriptorUtils.h(declarationDescriptor);
        if (fqNameH == null) {
            fqNameH = DescriptorUtils.g(declarationDescriptor.d()).b(declarationDescriptor.getName()).g();
        }
        if (fqNameH != null) {
            return fqNameH;
        }
        DescriptorUtils.a(4);
        throw null;
    }

    public static final FqNameUnsafe h(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.f(declarationDescriptor, "<this>");
        FqNameUnsafe fqNameUnsafeG = DescriptorUtils.g(declarationDescriptor);
        Intrinsics.e(fqNameUnsafeG, "getFqName(this)");
        return fqNameUnsafeG;
    }

    public static final void i(ModuleDescriptor moduleDescriptor) {
        Intrinsics.f(moduleDescriptor, "<this>");
    }

    public static final ModuleDescriptor j(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.f(declarationDescriptor, "<this>");
        ModuleDescriptor moduleDescriptorD = DescriptorUtils.d(declarationDescriptor);
        Intrinsics.e(moduleDescriptorD, "getContainingModule(this)");
        return moduleDescriptorD;
    }

    public static final Sequence k(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        Intrinsics.f(classifierDescriptorWithTypeParameters, "<this>");
        return SequencesKt.e(SequencesKt.l(DescriptorUtilsKt$parentsWithSelf$1.X, classifierDescriptorWithTypeParameters), 1);
    }

    public static final CallableMemberDescriptor l(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.f(callableMemberDescriptor, "<this>");
        if (!(callableMemberDescriptor instanceof PropertyAccessorDescriptor)) {
            return callableMemberDescriptor;
        }
        PropertyDescriptor correspondingProperty = ((PropertyAccessorDescriptor) callableMemberDescriptor).P();
        Intrinsics.e(correspondingProperty, "correspondingProperty");
        return correspondingProperty;
    }
}
