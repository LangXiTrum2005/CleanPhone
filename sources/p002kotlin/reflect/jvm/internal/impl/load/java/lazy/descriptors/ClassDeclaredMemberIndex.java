package p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import byname.marial;
import genesic.arytenoidectomy;
import genesic.competently;
import genesic.gintrap;
import genesic.monoploid;
import genesic.polloi;
import genesic.triweekly;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.polder;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.wireman;
import p002kotlin.sequences.Sequence;
import p002kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: DeclaredMemberIndex.kt */
/* JADX INFO: loaded from: classes5.dex */
public class ClassDeclaredMemberIndex implements attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final competently f30479attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Map<marial, gintrap> f30480beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Function1<polloi, Boolean> f30481dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Map<marial, triweekly> f30482marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Function1<monoploid, Boolean> f30483saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Map<marial, List<polloi>> f30484wireman;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassDeclaredMemberIndex(competently jClass, Function1<? super monoploid, Boolean> memberFilter) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(memberFilter, "memberFilter");
        this.f30479attabal = jClass;
        this.f30483saneness = memberFilter;
        Function1<polloi, Boolean> function1 = new Function1<polloi, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex$methodFilter$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(polloi m) {
                Intrinsics.checkNotNullParameter(m, "m");
                return Boolean.valueOf(((Boolean) this.this$0.f30483saneness.invoke(m)).booleanValue() && !arytenoidectomy.dern(m));
            }
        };
        this.f30481dern = function1;
        Sequence sequencePreprohormone = SequencesKt___SequencesKt.preprohormone(CollectionsKt.clubfoot(jClass.getMethods()), function1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequencePreprohormone) {
            marial name = ((polloi) obj).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f30484wireman = linkedHashMap;
        Sequence sequencePreprohormone2 = SequencesKt___SequencesKt.preprohormone(CollectionsKt.clubfoot(this.f30479attabal.getFields()), this.f30483saneness);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : sequencePreprohormone2) {
            linkedHashMap2.put(((triweekly) obj2).getName(), obj2);
        }
        this.f30482marial = linkedHashMap2;
        Collection<gintrap> collectionImpassible = this.f30479attabal.impassible();
        Function1<monoploid, Boolean> function2 = this.f30483saneness;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collectionImpassible) {
            if (function2.invoke((monoploid) obj3).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(wireman.wireman(polder.marial(dovishness.gintrap(arrayList2, 10)), 16));
        for (Object obj4 : arrayList2) {
            linkedHashMap3.put(((gintrap) obj4).getName(), obj4);
        }
        this.f30480beachfront = linkedHashMap3;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.attabal
    public Set<marial> attabal() {
        Sequence sequencePreprohormone = SequencesKt___SequencesKt.preprohormone(CollectionsKt.clubfoot(this.f30479attabal.getMethods()), this.f30481dern);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = sequencePreprohormone.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((polloi) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.attabal
    public triweekly beachfront(marial name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f30482marial.get(name);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.attabal
    public Collection<polloi> dern(marial name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<polloi> list = this.f30484wireman.get(name);
        return list != null ? list : adultoid.formularize();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.attabal
    public Set<marial> marial() {
        Sequence sequencePreprohormone = SequencesKt___SequencesKt.preprohormone(CollectionsKt.clubfoot(this.f30479attabal.getFields()), this.f30483saneness);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = sequencePreprohormone.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((triweekly) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.attabal
    public gintrap saneness(marial name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f30480beachfront.get(name);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.attabal
    public Set<marial> wireman() {
        return this.f30480beachfront.keySet();
    }
}
