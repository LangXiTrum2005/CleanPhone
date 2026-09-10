package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;

/* JADX INFO: loaded from: classes7.dex */
public interface ClassifierNamePolicy {

    public static final class FULLY_QUALIFIED implements ClassifierNamePolicy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FULLY_QUALIFIED f44234a = new FULLY_QUALIFIED();

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        public final String a(ClassifierDescriptor classifierDescriptor, DescriptorRendererImpl descriptorRendererImpl) {
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                Name name = ((TypeParameterDescriptor) classifierDescriptor).getName();
                Intrinsics.e(name, "classifier.name");
                return descriptorRendererImpl.Q(name, false);
            }
            FqNameUnsafe fqNameUnsafeG = DescriptorUtils.g(classifierDescriptor);
            Intrinsics.e(fqNameUnsafeG, "getFqName(classifier)");
            return descriptorRendererImpl.I(fqNameUnsafeG);
        }
    }

    public static final class SHORT implements ClassifierNamePolicy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SHORT f44235a = new SHORT();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor] */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Named] */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        public final String a(ClassifierDescriptor classifierDescriptor, DescriptorRendererImpl descriptorRendererImpl) {
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                Name name = ((TypeParameterDescriptor) classifierDescriptor).getName();
                Intrinsics.e(name, "classifier.name");
                return descriptorRendererImpl.Q(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifierDescriptor.getName());
                classifierDescriptor = classifierDescriptor.d();
            } while (classifierDescriptor instanceof ClassDescriptor);
            return RenderingUtilsKt.b(CollectionsKt.j(arrayList));
        }
    }

    public static final class SOURCE_CODE_QUALIFIED implements ClassifierNamePolicy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SOURCE_CODE_QUALIFIED f44236a = new SOURCE_CODE_QUALIFIED();

        public static String b(ClassifierDescriptor classifierDescriptor) {
            String strB;
            Name name = classifierDescriptor.getName();
            Intrinsics.e(name, "descriptor.name");
            String strA = RenderingUtilsKt.a(name);
            if (!(classifierDescriptor instanceof TypeParameterDescriptor)) {
                DeclarationDescriptor declarationDescriptorD = classifierDescriptor.d();
                Intrinsics.e(declarationDescriptorD, "descriptor.containingDeclaration");
                if (declarationDescriptorD instanceof ClassDescriptor) {
                    strB = b((ClassifierDescriptor) declarationDescriptorD);
                } else if (declarationDescriptorD instanceof PackageFragmentDescriptor) {
                    FqNameUnsafe fqNameUnsafeI = ((PackageFragmentDescriptor) declarationDescriptorD).c().i();
                    Intrinsics.e(fqNameUnsafeI, "descriptor.fqName.toUnsafe()");
                    List listE = fqNameUnsafeI.e();
                    Intrinsics.e(listE, "pathSegments()");
                    strB = RenderingUtilsKt.b(listE);
                } else {
                    strB = null;
                }
                if (strB != null && !strB.equals("")) {
                    return strB + '.' + strA;
                }
            }
            return strA;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        public final String a(ClassifierDescriptor classifierDescriptor, DescriptorRendererImpl descriptorRendererImpl) {
            return b(classifierDescriptor);
        }
    }

    String a(ClassifierDescriptor classifierDescriptor, DescriptorRendererImpl descriptorRendererImpl);
}
