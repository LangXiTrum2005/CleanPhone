package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import byname.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import yeast.formularize;

/* JADX INFO: compiled from: ClassDescriptorBase.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class beachfront extends attabal {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final boolean f30011adultoid;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final walach f30012graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final apical f30013molybdenite;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beachfront(formularize formularizeVar, apical apicalVar, marial marialVar, walach walachVar, boolean z) {
        super(formularizeVar, marialVar);
        if (formularizeVar == null) {
            unconsolidated(0);
        }
        if (apicalVar == null) {
            unconsolidated(1);
        }
        if (marialVar == null) {
            unconsolidated(2);
        }
        if (walachVar == null) {
            unconsolidated(3);
        }
        this.f30013molybdenite = apicalVar;
        this.f30012graveside = walachVar;
        this.f30011adultoid = z;
    }

    private static /* synthetic */ void unconsolidated(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.triweekly
    public walach competently() {
        walach walachVar = this.f30012graveside;
        if (walachVar == null) {
            unconsolidated(5);
        }
        return walachVar;
    }

    public boolean isExternal() {
        return this.f30011adultoid;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.formularize, p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public apical saneness() {
        apical apicalVar = this.f30013molybdenite;
        if (apicalVar == null) {
            unconsolidated(4);
        }
        return apicalVar;
    }
}
