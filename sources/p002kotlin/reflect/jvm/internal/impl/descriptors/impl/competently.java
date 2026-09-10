package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import byname.marial;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dent;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;
import p002kotlin.reflect.jvm.internal.impl.types.cutely;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import yeast.formularize;

/* JADX INFO: compiled from: ClassDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class competently extends beachfront {

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public Set<dern> f30014cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public dern f30015cuirassed;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final Modality f30016dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final ClassKind f30017gintrap;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public MemberScope f30018preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final permissivist f30019rotuma;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public competently(apical apicalVar, marial marialVar, Modality modality, ClassKind classKind, Collection<oilcan> collection2, walach walachVar, boolean z, formularize formularizeVar) {
        super(formularizeVar, apicalVar, marialVar, walachVar, z);
        if (apicalVar == null) {
            unconsolidated(0);
        }
        if (marialVar == null) {
            unconsolidated(1);
        }
        if (modality == null) {
            unconsolidated(2);
        }
        if (classKind == null) {
            unconsolidated(3);
        }
        if (collection2 == null) {
            unconsolidated(4);
        }
        if (walachVar == null) {
            unconsolidated(5);
        }
        if (formularizeVar == null) {
            unconsolidated(6);
        }
        this.f30016dovishness = modality;
        this.f30017gintrap = classKind;
        this.f30019rotuma = new cutely(this, Collections.EMPTY_LIST, collection2, formularizeVar);
    }

    private static /* synthetic */ void unconsolidated(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = MobileAdsBridgeBase.initializeMethodName;
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
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

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean coffeecake() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public dern cord() {
        return this.f30015cuirassed;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public dent<merc> creditor() {
        return null;
    }

    public final void dhss(MemberScope memberScope, Set<dern> set, dern dernVar) {
        if (memberScope == null) {
            unconsolidated(7);
        }
        if (set == null) {
            unconsolidated(8);
        }
        this.f30018preprohormone = memberScope;
        this.f30014cord = set;
        this.f30015cuirassed = dernVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.attabal
    public p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial getAnnotations() {
        p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVarSaneness = p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness();
        if (marialVarSaneness == null) {
            unconsolidated(9);
        }
        return marialVarSaneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public ClassKind getKind() {
        ClassKind classKind = this.f30017gintrap;
        if (classKind == null) {
            unconsolidated(15);
        }
        return classKind;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public molybdenite getVisibility() {
        molybdenite molybdeniteVar = polloi.f30212marial;
        if (molybdeniteVar == null) {
            unconsolidated(17);
        }
        return molybdeniteVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.competently
    public boolean gintrap() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean herdbook() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront
    public permissivist impromptu() {
        permissivist permissivistVar = this.f30019rotuma;
        if (permissivistVar == null) {
            unconsolidated(10);
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
            unconsolidated(12);
        }
        MemberScope memberScope = this.f30018preprohormone;
        if (memberScope == null) {
            unconsolidated(13);
        }
        return memberScope;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public Modality kowloon() {
        Modality modality = this.f30016dovishness;
        if (modality == null) {
            unconsolidated(16);
        }
        return modality;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public MemberScope lerp() {
        MemberScope.attabal attabalVar = MemberScope.attabal.f31367saneness;
        if (attabalVar == null) {
            unconsolidated(14);
        }
        return attabalVar;
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

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public Collection<dern> taiyuan() {
        Set<dern> set = this.f30014cord;
        if (set == null) {
            unconsolidated(11);
        }
        return set;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean treadless() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.competently
    public List<clubfoot> triweekly() {
        List<clubfoot> list = Collections.EMPTY_LIST;
        if (list == null) {
            unconsolidated(18);
        }
        return list;
    }
}
