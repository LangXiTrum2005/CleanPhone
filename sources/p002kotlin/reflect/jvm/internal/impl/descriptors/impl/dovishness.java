package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import byname.marial;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dent;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;
import p002kotlin.reflect.jvm.internal.impl.types.cutely;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import yeast.formularize;

/* JADX INFO: compiled from: MutableClassDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public class dovishness extends beachfront {

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public permissivist f30056cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public List<clubfoot> f30057cuirassed;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final ClassKind f30058dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final boolean f30059gintrap;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public molybdenite f30060preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public Modality f30061rotuma;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public final Collection<oilcan> f30062stratoscope;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public final formularize f30063trm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dovishness(apical apicalVar, ClassKind classKind, boolean z, boolean z2, marial marialVar, walach walachVar, formularize formularizeVar) {
        super(formularizeVar, apicalVar, marialVar, walachVar, z2);
        if (apicalVar == null) {
            unconsolidated(0);
        }
        if (classKind == null) {
            unconsolidated(1);
        }
        if (marialVar == null) {
            unconsolidated(2);
        }
        if (walachVar == null) {
            unconsolidated(3);
        }
        if (formularizeVar == null) {
            unconsolidated(4);
        }
        this.f30062stratoscope = new ArrayList();
        this.f30063trm = formularizeVar;
        this.f30058dovishness = classKind;
        this.f30059gintrap = z;
    }

    private static /* synthetic */ void unconsolidated(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public Collection<wireman> adultoid() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            unconsolidated(19);
        }
        return list;
    }

    public void attendance(molybdenite molybdeniteVar) {
        if (molybdeniteVar == null) {
            unconsolidated(9);
        }
        this.f30060preprohormone = molybdeniteVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean coffeecake() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public dern cord() {
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public dent<merc> creditor() {
        return null;
    }

    public void dhss() {
        this.f30056cord = new cutely(this, this.f30057cuirassed, this.f30062stratoscope, this.f30063trm);
        Iterator<dern> it = taiyuan().iterator();
        while (it.hasNext()) {
            ((marial) it.next()).cig(impassible());
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.attabal
    public p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial getAnnotations() {
        p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVarSaneness = p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness();
        if (marialVarSaneness == null) {
            unconsolidated(5);
        }
        return marialVarSaneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public ClassKind getKind() {
        ClassKind classKind = this.f30058dovishness;
        if (classKind == null) {
            unconsolidated(8);
        }
        return classKind;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public molybdenite getVisibility() {
        molybdenite molybdeniteVar = this.f30060preprohormone;
        if (molybdeniteVar == null) {
            unconsolidated(10);
        }
        return molybdeniteVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.competently
    public boolean gintrap() {
        return this.f30059gintrap;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean herdbook() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront
    public permissivist impromptu() {
        permissivist permissivistVar = this.f30056cord;
        if (permissivistVar == null) {
            unconsolidated(11);
        }
        return permissivistVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean isInline() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.polloi
    public MemberScope itchy(beachfront beachfrontVar) {
        if (beachfrontVar == null) {
            unconsolidated(16);
        }
        MemberScope.attabal attabalVar = MemberScope.attabal.f31367saneness;
        if (attabalVar == null) {
            unconsolidated(17);
        }
        return attabalVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public Modality kowloon() {
        Modality modality = this.f30061rotuma;
        if (modality == null) {
            unconsolidated(7);
        }
        return modality;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public MemberScope lerp() {
        MemberScope.attabal attabalVar = MemberScope.attabal.f31367saneness;
        if (attabalVar == null) {
            unconsolidated(18);
        }
        return attabalVar;
    }

    public void mastfed(List<clubfoot> list) {
        if (list == null) {
            unconsolidated(14);
        }
        if (this.f30057cuirassed == null) {
            this.f30057cuirassed = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public wireman nosophobia() {
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean overspeculate() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean peridotite() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean permissivist() {
        return false;
    }

    public void setterwort(Modality modality) {
        if (modality == null) {
            unconsolidated(6);
        }
        this.f30061rotuma = modality;
    }

    public String toString() {
        return taiyuan.itchy(this);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean treadless() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.competently
    public List<clubfoot> triweekly() {
        List<clubfoot> list = this.f30057cuirassed;
        if (list == null) {
            unconsolidated(15);
        }
        return list;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    /* JADX INFO: renamed from: vesuvio, reason: merged with bridge method [inline-methods] */
    public Set<dern> taiyuan() {
        Set<dern> set = Collections.EMPTY_SET;
        if (set == null) {
            unconsolidated(13);
        }
        return set;
    }
}
