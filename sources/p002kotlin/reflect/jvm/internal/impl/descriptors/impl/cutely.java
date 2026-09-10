package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.formularize;
import p002kotlin.reflect.jvm.internal.impl.descriptors.triweekly;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;

/* JADX INFO: compiled from: DeclarationDescriptorNonRootImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class cutely extends taiyuan implements formularize {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final apical f30054arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final walach f30055monoploid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cutely(apical apicalVar, marial marialVar, byname.marial marialVar2, walach walachVar) {
        super(marialVar, marialVar2);
        if (apicalVar == null) {
            timberyard(0);
        }
        if (marialVar == null) {
            timberyard(1);
        }
        if (marialVar2 == null) {
            timberyard(2);
        }
        if (walachVar == null) {
            timberyard(3);
        }
        this.f30054arytenoidectomy = apicalVar;
        this.f30055monoploid = walachVar;
    }

    private static /* synthetic */ void timberyard(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
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
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.triweekly
    public walach competently() {
        walach walachVar = this.f30055monoploid;
        if (walachVar == null) {
            timberyard(6);
        }
        return walachVar;
    }

    public apical saneness() {
        apical apicalVar = this.f30054arytenoidectomy;
        if (apicalVar == null) {
            timberyard(5);
        }
        return apicalVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.taiyuan, p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    /* JADX INFO: renamed from: unconsolidated, reason: merged with bridge method [inline-methods] */
    public triweekly attabal() {
        triweekly triweeklyVar = (triweekly) super.attabal();
        if (triweeklyVar == null) {
            timberyard(4);
        }
        return triweeklyVar;
    }
}
