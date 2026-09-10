package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractClassTypeConstructor extends AbstractTypeConstructor implements TypeConstructor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClassTypeConstructor(LockBasedStorageManager lockBasedStorageManager) {
        super(lockBasedStorageManager);
        if (lockBasedStorageManager != null) {
        } else {
            o(0);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public static /* synthetic */ void o(int i2) {
        String str = (i2 == 1 || i2 == 3 || i2 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 1 || i2 == 3 || i2 == 4) ? 2 : 3];
        if (i2 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i2 == 2) {
            objArr[0] = "classifier";
        } else if (i2 == 3 || i2 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i2 == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i2 == 3 || i2 == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i2 != 1) {
            if (i2 == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i2 != 3 && i2 != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i2 != 1 && i2 != 3 && i2 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
    public final boolean f(ClassifierDescriptor classifierDescriptor) {
        boolean z2;
        if (classifierDescriptor instanceof ClassDescriptor) {
            ClassDescriptor first = c();
            Intrinsics.f(first, "first");
            if (!Intrinsics.a(first.getName(), classifierDescriptor.getName())) {
                z2 = false;
                break;
            }
            DeclarationDescriptor declarationDescriptorD = first.d();
            DeclarationDescriptor declarationDescriptorD2 = classifierDescriptor.d();
            while (true) {
                if (declarationDescriptorD != null && declarationDescriptorD2 != null) {
                    if (!(declarationDescriptorD instanceof ModuleDescriptor)) {
                        if (!(declarationDescriptorD2 instanceof ModuleDescriptor)) {
                            if (declarationDescriptorD instanceof PackageFragmentDescriptor) {
                                if (!(declarationDescriptorD2 instanceof PackageFragmentDescriptor) || !Intrinsics.a(((PackageFragmentDescriptor) declarationDescriptorD).c(), ((PackageFragmentDescriptor) declarationDescriptorD2).c())) {
                                    break;
                                }
                            } else if (!(declarationDescriptorD2 instanceof PackageFragmentDescriptor) && Intrinsics.a(declarationDescriptorD.getName(), declarationDescriptorD2.getName())) {
                                declarationDescriptorD = declarationDescriptorD.d();
                                declarationDescriptorD2 = declarationDescriptorD2.d();
                            }
                        }
                        z2 = false;
                        break;
                    }
                    z2 = declarationDescriptorD2 instanceof ModuleDescriptor;
                    break;
                }
                z2 = true;
                break;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final KotlinType h() {
        ClassDescriptor classDescriptorC = c();
        if (classDescriptorC == null) {
            KotlinBuiltIns.a(107);
            throw null;
        }
        Name name = KotlinBuiltIns.f;
        if (KotlinBuiltIns.b(classDescriptorC, StandardNames.FqNames.f43494a) || KotlinBuiltIns.b(classDescriptorC, StandardNames.FqNames.f43495b)) {
            return null;
        }
        return k().e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final Collection i(boolean z2) {
        DeclarationDescriptor declarationDescriptorD = c().d();
        if (!(declarationDescriptorD instanceof ClassDescriptor)) {
            List list = Collections.EMPTY_LIST;
            if (list != null) {
                return list;
            }
            o(3);
            throw null;
        }
        SmartList smartList = new SmartList();
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptorD;
        smartList.add(classDescriptor.o());
        ClassDescriptor classDescriptorG0 = classDescriptor.g0();
        if (z2 && classDescriptorG0 != null) {
            smartList.add(classDescriptorG0.o());
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final KotlinBuiltIns k() {
        KotlinBuiltIns kotlinBuiltInsE = DescriptorUtilsKt.e(c());
        if (kotlinBuiltInsE != null) {
            return kotlinBuiltInsE;
        }
        o(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public abstract ClassDescriptor c();
}
