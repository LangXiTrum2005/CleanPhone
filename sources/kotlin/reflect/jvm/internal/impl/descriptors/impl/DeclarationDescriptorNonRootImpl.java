package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DeclarationDescriptorNonRootImpl extends DeclarationDescriptorImpl implements DeclarationDescriptorNonRoot {
    public final DeclarationDescriptor Z;
    public final SourceElement e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeclarationDescriptorNonRootImpl(DeclarationDescriptor declarationDescriptor, Annotations annotations, Name name, SourceElement sourceElement) {
        super(annotations, name);
        if (declarationDescriptor == null) {
            Z(0);
            throw null;
        }
        if (annotations == null) {
            Z(1);
            throw null;
        }
        if (name == null) {
            Z(2);
            throw null;
        }
        if (sourceElement == null) {
            Z(3);
            throw null;
        }
        this.Z = declarationDescriptor;
        this.e0 = sourceElement;
    }

    public static /* synthetic */ void Z(int i2) {
        String str = (i2 == 4 || i2 == 5 || i2 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 4 || i2 == 5 || i2 == 6) ? 2 : 3];
        switch (i2) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i2 == 4) {
            objArr[1] = "getOriginal";
        } else if (i2 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i2 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i2 != 4 && i2 != 5 && i2 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i2 != 4 && i2 != 5 && i2 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public DeclarationDescriptor d() {
        DeclarationDescriptor declarationDescriptor = this.Z;
        if (declarationDescriptor != null) {
            return declarationDescriptor;
        }
        Z(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement f() {
        SourceElement sourceElement = this.e0;
        if (sourceElement != null) {
            return sourceElement;
        }
        Z(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptorWithSource y0() {
        return this;
    }
}
