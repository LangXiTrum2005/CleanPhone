package p002kotlin.reflect.jvm.internal.impl.resolve.scopes;

import byname.marial;
import discontentedly.saneness;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kurbash.formularize;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.cord;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import yeast.impromptu;

/* JADX INFO: compiled from: GivenFunctionsMemberScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class GivenFunctionsMemberScope extends beachfront {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f31358wireman = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(GivenFunctionsMemberScope.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final impromptu f31359dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final wireman f31360saneness;

    /* JADX INFO: compiled from: GivenFunctionsMemberScope.kt */
    public static final class attabal extends p002kotlin.reflect.jvm.internal.impl.resolve.impromptu {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ ArrayList<apical> f31361attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ GivenFunctionsMemberScope f31362saneness;

        public attabal(ArrayList<apical> arrayList, GivenFunctionsMemberScope givenFunctionsMemberScope) {
            this.f31361attabal = arrayList;
            this.f31362saneness = givenFunctionsMemberScope;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.resolve.taiyuan
        public void attabal(CallableMemberDescriptor fakeOverride) {
            Intrinsics.checkNotNullParameter(fakeOverride, "fakeOverride");
            OverridingUtil.polder(fakeOverride, null);
            this.f31361attabal.add(fakeOverride);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.resolve.impromptu
        public void marial(CallableMemberDescriptor fromSuper, CallableMemberDescriptor fromCurrent) {
            Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
            Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f31362saneness.formularize() + ": " + fromSuper + " vs " + fromCurrent).toString());
        }
    }

    public GivenFunctionsMemberScope(yeast.formularize storageManager, wireman containingClass) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
        this.f31360saneness = containingClass;
        this.f31359dern = storageManager.dern(new Function0<List<? extends apical>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$allDescriptors$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends apical> invoke() {
                List<dovishness> listTaiyuan = this.this$0.taiyuan();
                return CollectionsKt.unconsolidated(listTaiyuan, this.this$0.cutely(listTaiyuan));
            }
        });
    }

    public final List<apical> apical() {
        return (List) yeast.apical.attabal(this.f31359dern, this, f31358wireman[0]);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public Collection<apical> competently(wireman kindFilter, Function1<? super marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return !kindFilter.attabal(wireman.f31390arytenoidectomy.impassible()) ? adultoid.formularize() : apical();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<apical> cutely(List<? extends dovishness> list) {
        Collection<? extends CallableMemberDescriptor> collectionFormularize;
        ArrayList arrayList = new ArrayList(3);
        Collection<oilcan> collectionCutely = this.f31360saneness.impromptu().cutely();
        Intrinsics.checkNotNullExpressionValue(collectionCutely, "getSupertypes(...)");
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = collectionCutely.iterator();
        while (it.hasNext()) {
            cord.stratoscope(arrayList2, impromptu.attabal.attabal(((oilcan) it.next()).formularize(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof CallableMemberDescriptor) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            marial name = ((CallableMemberDescriptor) obj2).getName();
            Object arrayList4 = linkedHashMap.get(name);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(name, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            marial marialVar = (marial) entry.getKey();
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                Boolean boolValueOf = Boolean.valueOf(((CallableMemberDescriptor) obj3) instanceof dovishness);
                Object arrayList5 = linkedHashMap2.get(boolValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList5);
                }
                ((List) arrayList5).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                OverridingUtil overridingUtil = OverridingUtil.f31285beachfront;
                List list4 = list3;
                if (zBooleanValue) {
                    collectionFormularize = new ArrayList<>();
                    for (Object obj4 : list) {
                        if (Intrinsics.wireman(((dovishness) obj4).getName(), marialVar)) {
                            collectionFormularize.add(obj4);
                        }
                    }
                } else {
                    collectionFormularize = adultoid.formularize();
                }
                overridingUtil.dovishness(marialVar, list4, collectionFormularize, this.f31360saneness, new attabal(arrayList, this));
            }
        }
        return lyreflower.attabal.dern(arrayList);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<saran> dern(marial name, saneness location) {
        List listFormularize;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List<apical> listApical = apical();
        if (listApical.isEmpty()) {
            listFormularize = adultoid.formularize();
        } else {
            lyreflower.marial marialVar = new lyreflower.marial();
            for (Object obj : listApical) {
                if ((obj instanceof saran) && Intrinsics.wireman(((saran) obj).getName(), name)) {
                    marialVar.add(obj);
                }
            }
            listFormularize = marialVar;
        }
        return listFormularize;
    }

    public final wireman formularize() {
        return this.f31360saneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<hydrovane> saneness(marial name, saneness location) {
        List listFormularize;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List<apical> listApical = apical();
        if (listApical.isEmpty()) {
            listFormularize = adultoid.formularize();
        } else {
            lyreflower.marial marialVar = new lyreflower.marial();
            for (Object obj : listApical) {
                if ((obj instanceof hydrovane) && Intrinsics.wireman(((hydrovane) obj).getName(), name)) {
                    marialVar.add(obj);
                }
            }
            listFormularize = marialVar;
        }
        return listFormularize;
    }

    public abstract List<dovishness> taiyuan();
}
