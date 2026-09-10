package p002kotlin.reflect.jvm.internal.impl.builtins.functions;

import byname.marial;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.graveside;
import p002kotlin.collections.kattegat;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;
import p002kotlin.reflect.jvm.internal.impl.builtins.competently;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p002kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dent;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.splinterproof;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.treadless;
import yeast.formularize;

/* JADX INFO: compiled from: FunctionClassDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class saneness extends p002kotlin.reflect.jvm.internal.impl.descriptors.impl.attabal {

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public static final attabal f29800cuirassed = new attabal(null);

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public static final byname.saneness f29801stratoscope = new byname.saneness(competently.f29682preprohormone, marial.cutely("Function"));

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public static final byname.saneness f29802trm = new byname.saneness(competently.f29670dovishness, marial.cutely("KFunction"));

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final marial f29803adultoid;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public final FunctionClassKind f29804cord;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final int f29805dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final C0669saneness f29806gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final sealless f29807graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final formularize f29808molybdenite;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public final List<clubfoot> f29809preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final dern f29810rotuma;

    /* JADX INFO: compiled from: FunctionClassDescriptor.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public attabal() {
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FunctionClassDescriptor.kt */
    public final class C0669saneness extends p002kotlin.reflect.jvm.internal.impl.types.saneness {
        public C0669saneness() {
            super(saneness.this.f29808molybdenite);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
        public List<clubfoot> getParameters() {
            return saneness.this.f29809preprohormone;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public Collection<oilcan> impassible() {
            List listKowloon;
            marial marialVarSakeen = saneness.this.sakeen();
            marial.attabal attabalVar = marial.attabal.f29796marial;
            if (Intrinsics.wireman(marialVarSakeen, attabalVar)) {
                listKowloon = graveside.marial(saneness.f29801stratoscope);
            } else if (Intrinsics.wireman(marialVarSakeen, marial.saneness.f29798marial)) {
                listKowloon = adultoid.kowloon(saneness.f29802trm, new byname.saneness(competently.f29682preprohormone, attabalVar.dern(saneness.this.lampshade())));
            } else {
                marial.wireman wiremanVar = marial.wireman.f29799marial;
                if (Intrinsics.wireman(marialVarSakeen, wiremanVar)) {
                    listKowloon = graveside.marial(saneness.f29801stratoscope);
                } else {
                    if (!Intrinsics.wireman(marialVarSakeen, marial.dern.f29797marial)) {
                        squalor.attabal.saneness(null, 1, null);
                        throw null;
                    }
                    listKowloon = adultoid.kowloon(saneness.f29802trm, new byname.saneness(competently.f29679monoploid, wiremanVar.dern(saneness.this.lampshade())));
                }
            }
            trm trmVarSaneness = saneness.this.f29807graveside.saneness();
            List<byname.saneness> list = listKowloon;
            ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
            for (byname.saneness sanenessVar : list) {
                wireman wiremanVarAttabal = FindClassInModuleKt.attabal(trmVarSaneness, sanenessVar);
                if (wiremanVarAttabal == null) {
                    throw new IllegalStateException(("Built-in class " + sanenessVar + " not found").toString());
                }
                List listAttendance = CollectionsKt.attendance(getParameters(), wiremanVarAttabal.impromptu().getParameters().size());
                ArrayList arrayList2 = new ArrayList(dovishness.gintrap(listAttendance, 10));
                Iterator it = listAttendance.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new treadless(((clubfoot) it.next()).impassible()));
                }
                arrayList.add(KotlinTypeFactory.competently(overspeculate.f31797arytenoidectomy.taiyuan(), wiremanVarAttabal, arrayList2));
            }
            return CollectionsKt.molet(arrayList);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
        public boolean marial() {
            return true;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public splinterproof monoploid() {
            return splinterproof.attabal.f30272attabal;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.apical, p002kotlin.reflect.jvm.internal.impl.types.permissivist
        /* JADX INFO: renamed from: rotuma, reason: merged with bridge method [inline-methods] */
        public saneness wireman() {
            return saneness.this;
        }

        public String toString() {
            return wireman().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public saneness(formularize storageManager, sealless containingDeclaration, marial functionTypeKind, int i) {
        super(storageManager, functionTypeKind.dern(i));
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(functionTypeKind, "functionTypeKind");
        this.f29808molybdenite = storageManager;
        this.f29807graveside = containingDeclaration;
        this.f29803adultoid = functionTypeKind;
        this.f29805dovishness = i;
        this.f29806gintrap = new C0669saneness();
        this.f29810rotuma = new dern(storageManager, this);
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i);
        ArrayList arrayList2 = new ArrayList(dovishness.gintrap(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((kattegat) it).nextInt();
            Variance variance = Variance.IN_VARIANCE;
            StringBuilder sb = new StringBuilder();
            sb.append('P');
            sb.append(iNextInt);
            dhss(arrayList, this, variance, sb.toString());
            arrayList2.add(Unit.f29295attabal);
        }
        dhss(arrayList, this, Variance.OUT_VARIANCE, "R");
        this.f29809preprohormone = CollectionsKt.molet(arrayList);
        this.f29804cord = FunctionClassKind.Companion.attabal(this.f29803adultoid);
    }

    public static final void dhss(ArrayList<clubfoot> arrayList, saneness sanenessVar, Variance variance, String str) {
        arrayList.add(p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kattegat.libyan(sanenessVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness(), false, variance, marial.cutely(str), arrayList.size(), sanenessVar.f29808molybdenite));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    /* JADX INFO: renamed from: basify, reason: merged with bridge method [inline-methods] */
    public MemberScope.attabal lerp() {
        return MemberScope.attabal.f31367saneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean coffeecake() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.triweekly
    public walach competently() {
        walach NO_SOURCE = walach.f30274attabal;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public /* bridge */ /* synthetic */ dern cord() {
        return (dern) prefect();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public dent<merc> creditor() {
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    /* JADX INFO: renamed from: deadwork, reason: merged with bridge method [inline-methods] */
    public List<dern> taiyuan() {
        return adultoid.formularize();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.attabal
    public p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial getAnnotations() {
        return p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public ClassKind getKind() {
        return ClassKind.INTERFACE;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public molybdenite getVisibility() {
        molybdenite PUBLIC = polloi.f30212marial;
        Intrinsics.checkNotNullExpressionValue(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.competently
    public boolean gintrap() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean herdbook() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    /* JADX INFO: renamed from: immediately, reason: merged with bridge method [inline-methods] */
    public List<wireman> adultoid() {
        return adultoid.formularize();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront
    public permissivist impromptu() {
        return this.f29806gintrap;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean isExternal() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean isInline() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public Modality kowloon() {
        return Modality.ABSTRACT;
    }

    public final int lampshade() {
        return this.f29805dovishness;
    }

    public Void libyan() {
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.formularize, p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    /* JADX INFO: renamed from: molet, reason: merged with bridge method [inline-methods] */
    public sealless saneness() {
        return this.f29807graveside;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public /* bridge */ /* synthetic */ wireman nosophobia() {
        return (wireman) libyan();
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

    public Void prefect() {
        return null;
    }

    public final marial sakeen() {
        return this.f29803adultoid;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.polloi
    /* JADX INFO: renamed from: tectonization, reason: merged with bridge method [inline-methods] */
    public dern itchy(beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f29810rotuma;
    }

    public String toString() {
        String strDern = getName().dern();
        Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
        return strDern;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean treadless() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.competently
    public List<clubfoot> triweekly() {
        return this.f29809preprohormone;
    }
}
