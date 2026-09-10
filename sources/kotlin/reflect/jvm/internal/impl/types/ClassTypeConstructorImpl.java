package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes7.dex */
public class ClassTypeConstructorImpl extends AbstractClassTypeConstructor implements TypeConstructor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ModuleAwareClassDescriptor f44497c;
    public final List d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Collection f44498e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassTypeConstructorImpl(ModuleAwareClassDescriptor moduleAwareClassDescriptor, List list, Collection collection, LockBasedStorageManager lockBasedStorageManager) {
        super((StorageManager) lockBasedStorageManager);
        if (list == null) {
            o(1);
            throw null;
        }
        if (collection == null) {
            o(2);
            throw null;
        }
        if (lockBasedStorageManager == null) {
            o(3);
            throw null;
        }
        this.f44497c = moduleAwareClassDescriptor;
        this.d = Collections.unmodifiableList(new ArrayList(list));
        this.f44498e = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void o(int i2) {
        String str = (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : 3];
        switch (i2) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i2 == 4) {
            objArr[1] = "getParameters";
        } else if (i2 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i2 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i2 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i2 != 4 && i2 != 5 && i2 != 6 && i2 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i2 != 4 && i2 != 5 && i2 != 6 && i2 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean e() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final Collection g() {
        Collection collection = this.f44498e;
        if (collection != null) {
            return collection;
        }
        o(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        List list = this.d;
        if (list != null) {
            return list;
        }
        o(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final SupertypeLoopChecker j() {
        return SupertypeLoopChecker.EMPTY.f43593a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: p */
    public final ClassDescriptor c() {
        ModuleAwareClassDescriptor moduleAwareClassDescriptor = this.f44497c;
        if (moduleAwareClassDescriptor != null) {
            return moduleAwareClassDescriptor;
        }
        o(5);
        throw null;
    }

    public final String toString() {
        String str = DescriptorUtils.g(this.f44497c).f44168a;
        if (str != null) {
            return str;
        }
        FqNameUnsafe.a(4);
        throw null;
    }
}
