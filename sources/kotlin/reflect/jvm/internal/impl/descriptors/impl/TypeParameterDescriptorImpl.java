package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion$EMPTY$1;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes7.dex */
public class TypeParameterDescriptorImpl extends AbstractTypeParameterDescriptor {
    public final ArrayList l0;
    public boolean m0;

    /* JADX WARN: Illegal instructions before constructor call */
    public TypeParameterDescriptorImpl(DeclarationDescriptor declarationDescriptor, Annotations annotations, boolean z2, Variance variance, Name name, int i2, StorageManager storageManager) {
        SupertypeLoopChecker.EMPTY empty = SupertypeLoopChecker.EMPTY.f43593a;
        if (declarationDescriptor == null) {
            Z(19);
            throw null;
        }
        if (annotations == null) {
            Z(20);
            throw null;
        }
        if (variance == null) {
            Z(21);
            throw null;
        }
        if (name == null) {
            Z(22);
            throw null;
        }
        if (storageManager == null) {
            Z(25);
            throw null;
        }
        super(storageManager, declarationDescriptor, annotations, name, variance, z2, i2, empty);
        this.l0 = new ArrayList(1);
        this.m0 = false;
    }

    public static TypeParameterDescriptorImpl I0(DeclarationDescriptor declarationDescriptor, Annotations annotations, boolean z2, Variance variance, Name name, int i2, StorageManager storageManager) {
        if (declarationDescriptor == null) {
            Z(6);
            throw null;
        }
        if (annotations == null) {
            Z(7);
            throw null;
        }
        if (variance == null) {
            Z(8);
            throw null;
        }
        if (name == null) {
            Z(9);
            throw null;
        }
        if (storageManager != null) {
            return new TypeParameterDescriptorImpl(declarationDescriptor, annotations, z2, variance, name, i2, storageManager);
        }
        Z(11);
        throw null;
    }

    public static TypeParameterDescriptorImpl J0(AbstractClassDescriptor abstractClassDescriptor, Variance variance, Name name, int i2, LockBasedStorageManager lockBasedStorageManager) {
        Annotations$Companion$EMPTY$1 annotations$Companion$EMPTY$1 = Annotations.Companion.f43614a;
        if (abstractClassDescriptor == null) {
            Z(0);
            throw null;
        }
        if (lockBasedStorageManager == null) {
            Z(4);
            throw null;
        }
        TypeParameterDescriptorImpl typeParameterDescriptorImplI0 = I0(abstractClassDescriptor, annotations$Companion$EMPTY$1, false, variance, name, i2, lockBasedStorageManager);
        SimpleType simpleTypeN = DescriptorUtilsKt.e(abstractClassDescriptor).n();
        if (typeParameterDescriptorImplI0.m0) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + typeParameterDescriptorImplI0.K0());
        }
        if (!KotlinTypeKt.a(simpleTypeN)) {
            typeParameterDescriptorImplI0.l0.add(simpleTypeN);
        }
        if (!typeParameterDescriptorImplI0.m0) {
            typeParameterDescriptorImplI0.m0 = true;
            return typeParameterDescriptorImplI0;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + typeParameterDescriptorImplI0.K0());
    }

    public static /* synthetic */ void Z(int i2) {
        String str = (i2 == 5 || i2 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 5 || i2 == 28) ? 2 : 3];
        switch (i2) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i2 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i2 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i2) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 5 && i2 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final void G0(KotlinType kotlinType) {
        if (kotlinType != null) {
            return;
        }
        Z(27);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final List H0() {
        if (!this.m0) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + K0());
        }
        ArrayList arrayList = this.l0;
        if (arrayList != null) {
            return arrayList;
        }
        Z(28);
        throw null;
    }

    public final String K0() {
        return getName() + " declared in " + DescriptorUtils.g(d());
    }
}
