package p002kotlin.reflect.jvm.internal.impl.builtins.functions;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3700q2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.IndexedValue;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.oilcan;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.merc;

/* JADX INFO: compiled from: FunctionInvokeDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class wireman extends oilcan {

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public static final attabal f29812hydrovane = new attabal(null);

    /* JADX INFO: compiled from: FunctionInvokeDescriptor.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wireman attabal(saneness functionClass, boolean z) {
            Intrinsics.checkNotNullParameter(functionClass, "functionClass");
            List<clubfoot> listTriweekly = functionClass.triweekly();
            wireman wiremanVar = new wireman(functionClass, null, CallableMemberDescriptor.Kind.DECLARATION, z, null);
            starveling starvelingVarTechnofreak = functionClass.technofreak();
            List<starveling> listFormularize = adultoid.formularize();
            List<? extends clubfoot> listFormularize2 = adultoid.formularize();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listTriweekly) {
                if (((clubfoot) obj).cutely() != Variance.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable<IndexedValue> iterableLicking = CollectionsKt.licking(arrayList);
            ArrayList arrayList2 = new ArrayList(dovishness.gintrap(iterableLicking, 10));
            for (IndexedValue indexedValue : iterableLicking) {
                arrayList2.add(wireman.f29812hydrovane.saneness(wiremanVar, indexedValue.dern(), (clubfoot) indexedValue.wireman()));
            }
            wiremanVar.libyan(null, starvelingVarTechnofreak, listFormularize, listFormularize2, arrayList2, ((clubfoot) CollectionsKt.igbo(listTriweekly)).impassible(), Modality.ABSTRACT, polloi.f30212marial);
            wiremanVar.osteal(true);
            return wiremanVar;
        }

        public final cultivated saneness(wireman wiremanVar, int i, clubfoot clubfootVar) {
            String lowerCase;
            String strDern = clubfootVar.getName().dern();
            Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
            if (Intrinsics.wireman(strDern, RequestConfiguration.MAX_AD_CONTENT_RATING_T)) {
                lowerCase = C3700q2.p;
            } else if (Intrinsics.wireman(strDern, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strDern.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            }
            marial marialVarSaneness = marial.f29950impromptu.saneness();
            byname.marial marialVarCutely = byname.marial.cutely(lowerCase);
            Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
            merc mercVarImpassible = clubfootVar.impassible();
            Intrinsics.checkNotNullExpressionValue(mercVarImpassible, "getDefaultType(...)");
            walach NO_SOURCE = walach.f30274attabal;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            return new ValueParameterDescriptorImpl(wiremanVar, null, i, marialVarSaneness, marialVarCutely, mercVarImpassible, false, false, false, null, NO_SOURCE);
        }

        public attabal() {
        }
    }

    public /* synthetic */ wireman(apical apicalVar, wireman wiremanVar, CallableMemberDescriptor.Kind kind, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(apicalVar, wiremanVar, kind, z);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean isExternal() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness
    public boolean isInline() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness
    public boolean preprohormone() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon
    public p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness setterwort(kowloon.dern configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        wireman wiremanVar = (wireman) super.setterwort(configuration);
        if (wiremanVar == null) {
            return null;
        }
        List<cultivated> listBeachfront = wiremanVar.beachfront();
        Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
        List<cultivated> list = listBeachfront;
        if ((list instanceof Collection) && list.isEmpty()) {
            return wiremanVar;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            p002kotlin.reflect.jvm.internal.impl.types.oilcan type = ((cultivated) it.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            if (p002kotlin.reflect.jvm.internal.impl.builtins.marial.wireman(type) != null) {
                List<cultivated> listBeachfront2 = wiremanVar.beachfront();
                Intrinsics.checkNotNullExpressionValue(listBeachfront2, "getValueParameters(...)");
                List<cultivated> list2 = listBeachfront2;
                ArrayList arrayList = new ArrayList(dovishness.gintrap(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    p002kotlin.reflect.jvm.internal.impl.types.oilcan type2 = ((cultivated) it2.next()).getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                    arrayList.add(p002kotlin.reflect.jvm.internal.impl.builtins.marial.wireman(type2));
                }
                return wiremanVar.vir(arrayList);
            }
        }
        return wiremanVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.oilcan, p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon
    public kowloon vesuvio(apical newOwner, p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness dovishnessVar, CallableMemberDescriptor.Kind kind, byname.marial marialVar, marial annotations, walach source) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        return new wireman(newOwner, (wireman) dovishnessVar, kind, isSuspend());
    }

    public final p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness vir(List<byname.marial> list) {
        byname.marial marialVar;
        int size = beachfront().size() - list.size();
        boolean z = true;
        if (size == 0) {
            List<cultivated> listBeachfront = beachfront();
            Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
            List<Pair> listFastrack = CollectionsKt.fastrack(list, listBeachfront);
            if ((listFastrack instanceof Collection) && listFastrack.isEmpty()) {
                return this;
            }
            for (Pair pair : listFastrack) {
                if (!Intrinsics.wireman((byname.marial) pair.component1(), ((cultivated) pair.component2()).getName())) {
                }
            }
            return this;
        }
        List<cultivated> listBeachfront2 = beachfront();
        Intrinsics.checkNotNullExpressionValue(listBeachfront2, "getValueParameters(...)");
        List<cultivated> list2 = listBeachfront2;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list2, 10));
        for (cultivated cultivatedVar : list2) {
            byname.marial name = cultivatedVar.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            int index = cultivatedVar.getIndex();
            int i = index - size;
            if (i >= 0 && (marialVar = list.get(i)) != null) {
                name = marialVar;
            }
            arrayList.add(cultivatedVar.empress(this, name, index));
        }
        kowloon.dern dernVarDeadwork = deadwork(TypeSubstitutor.f31696saneness);
        List<byname.marial> list3 = list;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((byname.marial) it.next()) == null) {
                }
            }
            z = false;
        }
        kowloon.dern dernVarImpassible = dernVarDeadwork.kattegat(z).saneness(arrayList).impassible(attabal());
        Intrinsics.checkNotNullExpressionValue(dernVarImpassible, "setOriginal(...)");
        p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness dovishnessVar = super.setterwort(dernVarImpassible);
        Intrinsics.beachfront(dovishnessVar);
        return dovishnessVar;
    }

    public wireman(apical apicalVar, wireman wiremanVar, CallableMemberDescriptor.Kind kind, boolean z) {
        super(apicalVar, wiremanVar, marial.f29950impromptu.saneness(), p002kotlin.reflect.jvm.internal.impl.util.kowloon.f31903taiyuan, kind, walach.f30274attabal);
        tarboosh(true);
        demilitarize(z);
        prefect(false);
    }
}
