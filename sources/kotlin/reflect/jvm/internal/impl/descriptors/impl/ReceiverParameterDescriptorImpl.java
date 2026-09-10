package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.AbstractReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;

/* JADX INFO: loaded from: classes7.dex */
public class ReceiverParameterDescriptorImpl extends AbstractReceiverParameterDescriptor {
    public final DeclarationDescriptor Z;
    public final AbstractReceiverValue e0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReceiverParameterDescriptorImpl(DeclarationDescriptor declarationDescriptor, AbstractReceiverValue abstractReceiverValue, Annotations annotations) {
        this(declarationDescriptor, abstractReceiverValue, annotations, SpecialNames.d);
        if (declarationDescriptor == null) {
            Z(0);
            throw null;
        }
        if (annotations != null) {
        } else {
            Z(2);
            throw null;
        }
    }

    public static /* synthetic */ void Z(int i2) {
        String str = (i2 == 7 || i2 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 7 || i2 == 8) ? 2 : 3];
        switch (i2) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i2 == 7) {
            objArr[1] = "getValue";
        } else if (i2 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i2) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 7 && i2 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor d() {
        DeclarationDescriptor declarationDescriptor = this.Z;
        if (declarationDescriptor != null) {
            return declarationDescriptor;
        }
        Z(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor
    public final ReceiverValue getValue() {
        AbstractReceiverValue abstractReceiverValue = this.e0;
        if (abstractReceiverValue != null) {
            return abstractReceiverValue;
        }
        Z(7);
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiverParameterDescriptorImpl(DeclarationDescriptor declarationDescriptor, AbstractReceiverValue abstractReceiverValue, Annotations annotations, Name name) {
        super(annotations, name);
        if (declarationDescriptor == null) {
            Z(3);
            throw null;
        }
        if (annotations == null) {
            Z(5);
            throw null;
        }
        if (name != null) {
            this.Z = declarationDescriptor;
            this.e0 = abstractReceiverValue;
            return;
        }
        Z(6);
        throw null;
    }
}
