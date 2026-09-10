package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import snook.competently;
import snook.marial;

/* JADX INFO: compiled from: LazyClassReceiverParameterDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public class arytenoidectomy extends dern {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final wireman f30002arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final marial f30003monoploid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arytenoidectomy(wireman wiremanVar) {
        super(p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness());
        if (wiremanVar == null) {
            timberyard(0);
        }
        this.f30002arytenoidectomy = wiremanVar;
        this.f30003monoploid = new marial(wiremanVar, null);
    }

    private static /* synthetic */ void timberyard(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.starveling
    public competently getValue() {
        marial marialVar = this.f30003monoploid;
        if (marialVar == null) {
            timberyard(1);
        }
        return marialVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public apical saneness() {
        wireman wiremanVar = this.f30002arytenoidectomy;
        if (wiremanVar == null) {
            timberyard(2);
        }
        return wiremanVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.taiyuan
    public String toString() {
        return "class " + this.f30002arytenoidectomy.getName() + "::this";
    }
}
