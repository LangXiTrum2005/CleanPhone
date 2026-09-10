package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import byname.marial;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impassible;
import p002kotlin.reflect.jvm.internal.impl.descriptors.splinterproof;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import p002kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import prescient.competently;
import yeast.formularize;
import yeast.impromptu;

/* JADX INFO: compiled from: AbstractTypeParameterDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class wireman extends cutely implements clubfoot {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final impromptu<permissivist> f30169adultoid;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final impromptu<merc> f30170dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final formularize f30171gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final int f30172graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final boolean f30173molybdenite;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final Variance f30174polloi;

    /* JADX INFO: compiled from: AbstractTypeParameterDescriptor.java */
    public class attabal implements Function0<permissivist> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ splinterproof f30175arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ formularize f30176kowloon;

        public attabal(formularize formularizeVar, splinterproof splinterproofVar) {
            this.f30176kowloon = formularizeVar;
            this.f30175arytenoidectomy = splinterproofVar;
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public permissivist invoke() {
            return new dern(wireman.this, this.f30176kowloon, this.f30175arytenoidectomy);
        }
    }

    /* JADX INFO: compiled from: AbstractTypeParameterDescriptor.java */
    public class dern extends AbstractTypeConstructor {

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ wireman f30178marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final splinterproof f30179wireman;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dern(wireman wiremanVar, formularize formularizeVar, splinterproof splinterproofVar) {
            super(formularizeVar);
            if (formularizeVar == null) {
                dovishness(0);
            }
            this.f30178marial = wiremanVar;
            this.f30179wireman = splinterproofVar;
        }

        private static /* synthetic */ void dovishness(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public void adultoid(oilcan oilcanVar) {
            if (oilcanVar == null) {
                dovishness(6);
            }
            this.f30178marial.dhss(oilcanVar);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
        public beachfront apical() {
            beachfront beachfrontVarCutely = DescriptorUtilsKt.cutely(this.f30178marial);
            if (beachfrontVarCutely == null) {
                dovishness(4);
            }
            return beachfrontVarCutely;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
        public List<clubfoot> getParameters() {
            List<clubfoot> list = Collections.EMPTY_LIST;
            if (list == null) {
                dovishness(2);
            }
            return list;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public Collection<oilcan> impassible() {
            List<oilcan> listVesuvio = this.f30178marial.vesuvio();
            if (listVesuvio == null) {
                dovishness(1);
            }
            return listVesuvio;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.apical
        public boolean impromptu(p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVar) {
            if (beachfrontVar == null) {
                dovishness(9);
            }
            return (beachfrontVar instanceof clubfoot) && DescriptorEquivalenceForOverrides.f31282attabal.impromptu(this.f30178marial, (clubfoot) beachfrontVar, true);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
        public boolean marial() {
            return true;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public List<oilcan> molybdenite(List<oilcan> list) {
            if (list == null) {
                dovishness(7);
            }
            List<oilcan> listOutmarry = this.f30178marial.outmarry(list);
            if (listOutmarry == null) {
                dovishness(8);
            }
            return listOutmarry;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public splinterproof monoploid() {
            splinterproof splinterproofVar = this.f30179wireman;
            if (splinterproofVar == null) {
                dovishness(5);
            }
            return splinterproofVar;
        }

        public String toString() {
            return this.f30178marial.getName().toString();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public oilcan triweekly() {
            return competently.wireman(ErrorTypeKind.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.apical, p002kotlin.reflect.jvm.internal.impl.types.permissivist
        public p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront wireman() {
            wireman wiremanVar = this.f30178marial;
            if (wiremanVar == null) {
                dovishness(3);
            }
            return wiremanVar;
        }
    }

    /* JADX INFO: compiled from: AbstractTypeParameterDescriptor.java */
    public class saneness implements Function0<merc> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ marial f30181kowloon;

        /* JADX INFO: compiled from: AbstractTypeParameterDescriptor.java */
        public class attabal implements Function0<MemberScope> {
            public attabal() {
            }

            @Override // p002kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
            public MemberScope invoke() {
                return TypeIntersectionScope.cutely("Scope for type parameter " + saneness.this.f30181kowloon.dern(), wireman.this.getUpperBounds());
            }
        }

        public saneness(marial marialVar) {
            this.f30181kowloon = marialVar;
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public merc invoke() {
            return KotlinTypeFactory.impassible(overspeculate.f31797arytenoidectomy.taiyuan(), wireman.this.impromptu(), Collections.EMPTY_LIST, false, new LazyScopeAdapter(new attabal()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wireman(formularize formularizeVar, apical apicalVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar, marial marialVar2, Variance variance, boolean z, int i, walach walachVar, splinterproof splinterproofVar) {
        super(apicalVar, marialVar, marialVar2, walachVar);
        if (formularizeVar == null) {
            timberyard(0);
        }
        if (apicalVar == null) {
            timberyard(1);
        }
        if (marialVar == null) {
            timberyard(2);
        }
        if (marialVar2 == null) {
            timberyard(3);
        }
        if (variance == null) {
            timberyard(4);
        }
        if (walachVar == null) {
            timberyard(5);
        }
        if (splinterproofVar == null) {
            timberyard(6);
        }
        this.f30174polloi = variance;
        this.f30173molybdenite = z;
        this.f30172graveside = i;
        this.f30169adultoid = formularizeVar.dern(new attabal(formularizeVar, splinterproofVar));
        this.f30170dovishness = formularizeVar.dern(new saneness(marialVar2));
        this.f30171gintrap = formularizeVar;
    }

    private static /* synthetic */ void timberyard(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
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
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot
    public Variance cutely() {
        Variance variance = this.f30174polloi;
        if (variance == null) {
            timberyard(7);
        }
        return variance;
    }

    public abstract void dhss(oilcan oilcanVar);

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public <R, D> R dovishness(impassible<R, D> impassibleVar, D d) {
        return impassibleVar.impassible(this, d);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot
    public int getIndex() {
        return this.f30172graveside;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot
    public List<oilcan> getUpperBounds() {
        List<oilcan> listCutely = ((dern) impromptu()).cutely();
        if (listCutely == null) {
            timberyard(8);
        }
        return listCutely;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot
    public boolean graveside() {
        return this.f30173molybdenite;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot
    public boolean grimness() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront
    public merc impassible() {
        merc mercVarInvoke = this.f30170dovishness.invoke();
        if (mercVarInvoke == null) {
            timberyard(10);
        }
        return mercVarInvoke;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot, p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront
    public final permissivist impromptu() {
        permissivist permissivistVarInvoke = this.f30169adultoid.invoke();
        if (permissivistVarInvoke == null) {
            timberyard(9);
        }
        return permissivistVarInvoke;
    }

    public List<oilcan> outmarry(List<oilcan> list) {
        if (list == null) {
            timberyard(12);
        }
        if (list == null) {
            timberyard(13);
        }
        return list;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot
    public formularize supplicat() {
        formularize formularizeVar = this.f30171gintrap;
        if (formularizeVar == null) {
            timberyard(14);
        }
        return formularizeVar;
    }

    public abstract List<oilcan> vesuvio();

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cutely
    public clubfoot attabal() {
        clubfoot clubfootVar = (clubfoot) super.attabal();
        if (clubfootVar == null) {
            timberyard(11);
        }
        return clubfootVar;
    }
}
