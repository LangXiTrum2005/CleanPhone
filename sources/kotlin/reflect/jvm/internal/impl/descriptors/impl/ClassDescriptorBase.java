package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ClassDescriptorBase extends AbstractClassDescriptor {
    public final DeclarationDescriptor f0;
    public final SourceElement g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassDescriptorBase(LockBasedStorageManager lockBasedStorageManager, DeclarationDescriptor declarationDescriptor, Name name, SourceElement sourceElement) {
        super(lockBasedStorageManager, name);
        if (lockBasedStorageManager == null) {
            y0(0);
            throw null;
        }
        if (declarationDescriptor == null) {
            y0(1);
            throw null;
        }
        if (name == null) {
            y0(2);
            throw null;
        }
        if (sourceElement == null) {
            y0(3);
            throw null;
        }
        this.f0 = declarationDescriptor;
        this.g0 = sourceElement;
    }

    public static /* synthetic */ void y0(int i2) {
        String str = (i2 == 4 || i2 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 4 || i2 == 5) ? 2 : 3];
        if (i2 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i2 == 2) {
            objArr[0] = "name";
        } else if (i2 == 3) {
            objArr[0] = "source";
        } else if (i2 == 4 || i2 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i2 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i2 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i2 != 4 && i2 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i2 != 4 && i2 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor d() {
        DeclarationDescriptor declarationDescriptor = this.f0;
        if (declarationDescriptor != null) {
            return declarationDescriptor;
        }
        y0(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public final SourceElement f() {
        SourceElement sourceElement = this.g0;
        if (sourceElement != null) {
            return sourceElement;
        }
        y0(5);
        throw null;
    }

    public boolean isExternal() {
        return false;
    }
}
