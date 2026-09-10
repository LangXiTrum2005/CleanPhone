package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dent;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impassible;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.marial;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import p002kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;
import p002kotlin.reflect.jvm.internal.impl.types.cutely;
import p002kotlin.reflect.jvm.internal.impl.types.itchy;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.polloi;

/* JADX INFO: compiled from: LazySubstitutingClassDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public class monoploid extends polloi {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public permissivist f30140adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final polloi f30141arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public List<clubfoot> f30142graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public List<clubfoot> f30143molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final TypeSubstitutor f30144monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public TypeSubstitutor f30145polloi;

    /* JADX INFO: compiled from: LazySubstitutingClassDescriptor.java */
    public class attabal implements Function1<clubfoot, Boolean> {
        public attabal() {
        }

        @Override // p002kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(clubfoot clubfootVar) {
            return Boolean.valueOf(!clubfootVar.grimness());
        }
    }

    /* JADX INFO: compiled from: LazySubstitutingClassDescriptor.java */
    public class saneness implements Function1<merc, merc> {
        public saneness() {
        }

        @Override // p002kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public merc invoke(merc mercVar) {
            return monoploid.this.setterwort(mercVar);
        }
    }

    public monoploid(polloi polloiVar, TypeSubstitutor typeSubstitutor) {
        this.f30141arytenoidectomy = polloiVar;
        this.f30144monoploid = typeSubstitutor;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    private static /* synthetic */ void unconsolidated(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? 3 : 2];
        if (i == 2) {
            objArr[0] = "typeArguments";
        } else if (i == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 8) {
            objArr[0] = "typeArguments";
        } else if (i == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10) {
            objArr[2] = "getMemberScope";
        } else if (i == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 8 && i != 10 && i != 13 && i != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public Collection<wireman> adultoid() {
        Collection<wireman> collectionAdultoid = this.f30141arytenoidectomy.adultoid();
        if (collectionAdultoid == null) {
            unconsolidated(31);
        }
        return collectionAdultoid;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean coffeecake() {
        return this.f30141arytenoidectomy.coffeecake();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public MemberScope coi(itchy itchyVar) {
        if (itchyVar == null) {
            unconsolidated(10);
        }
        MemberScope memberScopeTimberyard = timberyard(itchyVar, DescriptorUtilsKt.kowloon(marial.competently(this)));
        if (memberScopeTimberyard == null) {
            unconsolidated(11);
        }
        return memberScopeTimberyard;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.triweekly
    public walach competently() {
        walach walachVar = walach.f30274attabal;
        if (walachVar == null) {
            unconsolidated(29);
        }
        return walachVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public dern cord() {
        return this.f30141arytenoidectomy.cord();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public dent<merc> creditor() {
        dent<merc> dentVarCreditor = this.f30141arytenoidectomy.creditor();
        if (dentVarCreditor == null) {
            return null;
        }
        return dentVarCreditor.dern(new saneness());
    }

    public final TypeSubstitutor dhss() {
        if (this.f30145polloi == null) {
            if (this.f30144monoploid.apical()) {
                this.f30145polloi = this.f30144monoploid;
            } else {
                List<clubfoot> parameters = this.f30141arytenoidectomy.impromptu().getParameters();
                this.f30143molybdenite = new ArrayList(parameters.size());
                this.f30145polloi = polloi.saneness(parameters, this.f30144monoploid.cutely(), this, this.f30143molybdenite);
                this.f30142graveside = CollectionsKt.milliradian(this.f30143molybdenite, new attabal());
            }
        }
        return this.f30145polloi;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public <R, D> R dovishness(impassible<R, D> impassibleVar, D d) {
        return impassibleVar.attabal(this, d);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.attabal
    public p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial getAnnotations() {
        p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial annotations = this.f30141arytenoidectomy.getAnnotations();
        if (annotations == null) {
            unconsolidated(19);
        }
        return annotations;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public ClassKind getKind() {
        ClassKind kind = this.f30141arytenoidectomy.getKind();
        if (kind == null) {
            unconsolidated(25);
        }
        return kind;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.yemenite
    public byname.marial getName() {
        byname.marial name = this.f30141arytenoidectomy.getName();
        if (name == null) {
            unconsolidated(20);
        }
        return name;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public molybdenite getVisibility() {
        molybdenite visibility = this.f30141arytenoidectomy.getVisibility();
        if (visibility == null) {
            unconsolidated(27);
        }
        return visibility;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.competently
    public boolean gintrap() {
        return this.f30141arytenoidectomy.gintrap();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean herdbook() {
        return this.f30141arytenoidectomy.herdbook();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront
    public merc impassible() {
        merc mercVarImpassible = KotlinTypeFactory.impassible(p002kotlin.reflect.jvm.internal.impl.types.impassible.f31774attabal.attabal(getAnnotations(), null, null), impromptu(), nosophobia.competently(impromptu().getParameters()), false, walach());
        if (mercVarImpassible == null) {
            unconsolidated(16);
        }
        return mercVarImpassible;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront
    public permissivist impromptu() {
        permissivist permissivistVarImpromptu = this.f30141arytenoidectomy.impromptu();
        if (this.f30144monoploid.apical()) {
            if (permissivistVarImpromptu == null) {
                unconsolidated(0);
            }
            return permissivistVarImpromptu;
        }
        if (this.f30140adultoid == null) {
            TypeSubstitutor typeSubstitutorDhss = dhss();
            Collection<oilcan> collectionCutely = permissivistVarImpromptu.cutely();
            ArrayList arrayList = new ArrayList(collectionCutely.size());
            Iterator<oilcan> it = collectionCutely.iterator();
            while (it.hasNext()) {
                arrayList.add(typeSubstitutorDhss.arytenoidectomy(it.next(), Variance.INVARIANT));
            }
            this.f30140adultoid = new cutely(this, this.f30143molybdenite, arrayList, LockBasedStorageManager.f31625marial);
        }
        permissivist permissivistVar = this.f30140adultoid;
        if (permissivistVar == null) {
            unconsolidated(1);
        }
        return permissivistVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean isExternal() {
        return this.f30141arytenoidectomy.isExternal();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean isInline() {
        return this.f30141arytenoidectomy.isInline();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.polloi
    public MemberScope itchy(beachfront beachfrontVar) {
        if (beachfrontVar == null) {
            unconsolidated(13);
        }
        MemberScope memberScopeItchy = this.f30141arytenoidectomy.itchy(beachfrontVar);
        if (!this.f30144monoploid.apical()) {
            return new SubstitutingScope(memberScopeItchy, dhss());
        }
        if (memberScopeItchy == null) {
            unconsolidated(14);
        }
        return memberScopeItchy;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public Modality kowloon() {
        Modality modalityKowloon = this.f30141arytenoidectomy.kowloon();
        if (modalityKowloon == null) {
            unconsolidated(26);
        }
        return modalityKowloon;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public MemberScope lerp() {
        MemberScope memberScopeLerp = this.f30141arytenoidectomy.lerp();
        if (memberScopeLerp == null) {
            unconsolidated(15);
        }
        return memberScopeLerp;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public List<starveling> mathsort() {
        List<starveling> list = Collections.EMPTY_LIST;
        if (list == null) {
            unconsolidated(17);
        }
        return list;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public wireman nosophobia() {
        return this.f30141arytenoidectomy.nosophobia();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean overspeculate() {
        return this.f30141arytenoidectomy.overspeculate();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean peridotite() {
        return this.f30141arytenoidectomy.peridotite();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean permissivist() {
        return this.f30141arytenoidectomy.permissivist();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public MemberScope privatdozent() {
        MemberScope memberScopePrivatdozent = this.f30141arytenoidectomy.privatdozent();
        if (memberScopePrivatdozent == null) {
            unconsolidated(28);
        }
        return memberScopePrivatdozent;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.formularize, p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public apical saneness() {
        apical apicalVarSaneness = this.f30141arytenoidectomy.saneness();
        if (apicalVarSaneness == null) {
            unconsolidated(22);
        }
        return apicalVarSaneness;
    }

    public final merc setterwort(merc mercVar) {
        return (mercVar == null || this.f30144monoploid.apical()) ? mercVar : (merc) dhss().arytenoidectomy(mercVar, Variance.INVARIANT);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public Collection<dern> taiyuan() {
        Collection<dern> collectionTaiyuan = this.f30141arytenoidectomy.taiyuan();
        ArrayList arrayList = new ArrayList(collectionTaiyuan.size());
        for (dern dernVar : collectionTaiyuan) {
            arrayList.add(((dern) dernVar.monoploid().impassible(dernVar.attabal()).cutely(dernVar.kowloon()).impromptu(dernVar.getVisibility()).polloi(dernVar.getKind()).triweekly(false).build()).dern(dhss()));
        }
        return arrayList;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public starveling technofreak() {
        throw new UnsupportedOperationException();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.polloi
    public MemberScope timberyard(itchy itchyVar, beachfront beachfrontVar) {
        if (itchyVar == null) {
            unconsolidated(5);
        }
        if (beachfrontVar == null) {
            unconsolidated(6);
        }
        MemberScope memberScopeTimberyard = this.f30141arytenoidectomy.timberyard(itchyVar, beachfrontVar);
        if (!this.f30144monoploid.apical()) {
            return new SubstitutingScope(memberScopeTimberyard, dhss());
        }
        if (memberScopeTimberyard == null) {
            unconsolidated(7);
        }
        return memberScopeTimberyard;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean treadless() {
        return this.f30141arytenoidectomy.treadless();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.competently
    public List<clubfoot> triweekly() {
        dhss();
        List<clubfoot> list = this.f30142graveside;
        if (list == null) {
            unconsolidated(30);
        }
        return list;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.mathsort
    /* JADX INFO: renamed from: vesuvio, reason: merged with bridge method [inline-methods] */
    public wireman dern(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            unconsolidated(23);
        }
        return typeSubstitutor.apical() ? this : new monoploid(this, TypeSubstitutor.impromptu(typeSubstitutor.cutely(), dhss().cutely()));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public MemberScope walach() {
        MemberScope memberScopeItchy = itchy(DescriptorUtilsKt.kowloon(marial.competently(this.f30141arytenoidectomy)));
        if (memberScopeItchy == null) {
            unconsolidated(12);
        }
        return memberScopeItchy;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.polloi, p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public wireman attabal() {
        wireman wiremanVarAttabal = this.f30141arytenoidectomy.attabal();
        if (wiremanVarAttabal == null) {
            unconsolidated(21);
        }
        return wiremanVarAttabal;
    }
}
