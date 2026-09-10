package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import byname.marial;
import java.util.Collections;
import java.util.List;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impassible;
import p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;
import p002kotlin.reflect.jvm.internal.impl.types.itchy;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import yeast.formularize;
import yeast.impromptu;

/* JADX INFO: compiled from: AbstractClassDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class attabal extends polloi {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final impromptu<merc> f30004arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final impromptu<MemberScope> f30005monoploid;
    private final marial name;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final impromptu<starveling> f30006polloi;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractClassDescriptor.java */
    public class C0673attabal implements Function0<merc> {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.attabal$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractClassDescriptor.java */
        public class C0674attabal implements Function1<beachfront, merc> {
            public C0674attabal() {
            }

            @Override // p002kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
            public merc invoke(beachfront beachfrontVar) {
                p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarBeachfront = beachfrontVar.beachfront(attabal.this);
                if (beachfrontVarBeachfront == null) {
                    return attabal.this.f30004arytenoidectomy.invoke();
                }
                if (beachfrontVarBeachfront instanceof overspeculate) {
                    return KotlinTypeFactory.saneness((overspeculate) beachfrontVarBeachfront, nosophobia.competently(beachfrontVarBeachfront.impromptu().getParameters()));
                }
                return beachfrontVarBeachfront instanceof polloi ? nosophobia.dovishness(beachfrontVarBeachfront.impromptu().attabal(beachfrontVar), ((polloi) beachfrontVarBeachfront).itchy(beachfrontVar), this) : beachfrontVarBeachfront.impassible();
            }
        }

        public C0673attabal() {
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public merc invoke() {
            attabal attabalVar = attabal.this;
            return nosophobia.adultoid(attabalVar, attabalVar.walach(), new C0674attabal());
        }
    }

    /* JADX INFO: compiled from: AbstractClassDescriptor.java */
    public class dern implements Function0<starveling> {
        public dern() {
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public starveling invoke() {
            return new arytenoidectomy(attabal.this);
        }
    }

    /* JADX INFO: compiled from: AbstractClassDescriptor.java */
    public class saneness implements Function0<MemberScope> {
        public saneness() {
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public MemberScope invoke() {
            return new p002kotlin.reflect.jvm.internal.impl.resolve.scopes.marial(attabal.this.walach());
        }
    }

    public attabal(formularize formularizeVar, marial marialVar) {
        if (formularizeVar == null) {
            unconsolidated(0);
        }
        if (marialVar == null) {
            unconsolidated(1);
        }
        this.name = marialVar;
        this.f30004arytenoidectomy = formularizeVar.dern(new C0673attabal());
        this.f30005monoploid = formularizeVar.dern(new saneness());
        this.f30006polloi = formularizeVar.dern(new dern());
    }

    private static /* synthetic */ void unconsolidated(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.polloi, p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public wireman attabal() {
        return this;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public MemberScope coi(itchy itchyVar) {
        if (itchyVar == null) {
            unconsolidated(15);
        }
        MemberScope memberScopeTimberyard = timberyard(itchyVar, DescriptorUtilsKt.kowloon(p002kotlin.reflect.jvm.internal.impl.resolve.marial.competently(this)));
        if (memberScopeTimberyard == null) {
            unconsolidated(16);
        }
        return memberScopeTimberyard;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public <R, D> R dovishness(impassible<R, D> impassibleVar, D d) {
        return impassibleVar.attabal(this, d);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.yemenite
    public marial getName() {
        marial marialVar = this.name;
        if (marialVar == null) {
            unconsolidated(2);
        }
        return marialVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront
    public merc impassible() {
        merc mercVarInvoke = this.f30004arytenoidectomy.invoke();
        if (mercVarInvoke == null) {
            unconsolidated(20);
        }
        return mercVarInvoke;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public List<starveling> mathsort() {
        List<starveling> list = Collections.EMPTY_LIST;
        if (list == null) {
            unconsolidated(6);
        }
        return list;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.mathsort
    /* JADX INFO: renamed from: outmarry, reason: merged with bridge method [inline-methods] */
    public wireman dern(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            unconsolidated(18);
        }
        return typeSubstitutor.apical() ? this : new monoploid(this, typeSubstitutor);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public MemberScope privatdozent() {
        MemberScope memberScopeInvoke = this.f30005monoploid.invoke();
        if (memberScopeInvoke == null) {
            unconsolidated(4);
        }
        return memberScopeInvoke;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public starveling technofreak() {
        starveling starvelingVarInvoke = this.f30006polloi.invoke();
        if (starvelingVarInvoke == null) {
            unconsolidated(5);
        }
        return starvelingVarInvoke;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.polloi
    public MemberScope timberyard(itchy itchyVar, beachfront beachfrontVar) {
        if (itchyVar == null) {
            unconsolidated(10);
        }
        if (beachfrontVar == null) {
            unconsolidated(11);
        }
        if (!itchyVar.beachfront()) {
            return new SubstitutingScope(itchy(beachfrontVar), TypeSubstitutor.competently(itchyVar));
        }
        MemberScope memberScopeItchy = itchy(beachfrontVar);
        if (memberScopeItchy == null) {
            unconsolidated(12);
        }
        return memberScopeItchy;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public MemberScope walach() {
        MemberScope memberScopeItchy = itchy(DescriptorUtilsKt.kowloon(p002kotlin.reflect.jvm.internal.impl.resolve.marial.competently(this)));
        if (memberScopeItchy == null) {
            unconsolidated(17);
        }
        return memberScopeItchy;
    }
}
