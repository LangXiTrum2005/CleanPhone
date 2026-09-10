package p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.IndexedValue;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.polder;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.wireman;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import p002kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import patroclinal.formularize;

/* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<String, competently> f30643attabal = new LinkedHashMap();

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f30644attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ impromptu f30645saneness;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.impromptu$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
        public final class C0682attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final String f30646attabal;

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public Pair<String, apical> f30647dern;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public final List<Pair<String, apical>> f30648saneness;

            /* JADX INFO: renamed from: wireman, reason: collision with root package name */
            public final /* synthetic */ attabal f30649wireman;

            public C0682attabal(attabal attabalVar, String functionName) {
                Intrinsics.checkNotNullParameter(functionName, "functionName");
                this.f30649wireman = attabalVar;
                this.f30646attabal = functionName;
                this.f30648saneness = new ArrayList();
                this.f30647dern = formularize.attabal("V", null);
            }

            public final Pair<String, competently> attabal() {
                SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f30687attabal;
                String strSaneness = this.f30649wireman.saneness();
                String str = this.f30646attabal;
                List<Pair<String, apical>> list = this.f30648saneness;
                ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).getFirst());
                }
                String strApical = signatureBuildingComponents.apical(strSaneness, signatureBuildingComponents.cutely(str, arrayList, this.f30647dern.getFirst()));
                apical second = this.f30647dern.getSecond();
                List<Pair<String, apical>> list2 = this.f30648saneness;
                ArrayList arrayList2 = new ArrayList(dovishness.gintrap(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((apical) ((Pair) it2.next()).getSecond());
                }
                return formularize.attabal(strApical, new competently(second, arrayList2));
            }

            public final void dern(String type, wireman... qualifiers) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
                Iterable<IndexedValue> iterableLibyan = polloi.libyan(qualifiers);
                LinkedHashMap linkedHashMap = new LinkedHashMap(wireman.wireman(polder.marial(dovishness.gintrap(iterableLibyan, 10)), 16));
                for (IndexedValue indexedValue : iterableLibyan) {
                    linkedHashMap.put(Integer.valueOf(indexedValue.dern()), (wireman) indexedValue.wireman());
                }
                this.f30647dern = formularize.attabal(type, new apical(linkedHashMap));
            }

            public final void saneness(String type, wireman... qualifiers) {
                apical apicalVar;
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
                List<Pair<String, apical>> list = this.f30648saneness;
                if (qualifiers.length == 0) {
                    apicalVar = null;
                } else {
                    Iterable<IndexedValue> iterableLibyan = polloi.libyan(qualifiers);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(wireman.wireman(polder.marial(dovishness.gintrap(iterableLibyan, 10)), 16));
                    for (IndexedValue indexedValue : iterableLibyan) {
                        linkedHashMap.put(Integer.valueOf(indexedValue.dern()), (wireman) indexedValue.wireman());
                    }
                    apicalVar = new apical(linkedHashMap);
                }
                list.add(formularize.attabal(type, apicalVar));
            }

            public final void wireman(JvmPrimitiveType type) {
                Intrinsics.checkNotNullParameter(type, "type");
                String desc = type.getDesc();
                Intrinsics.checkNotNullExpressionValue(desc, "getDesc(...)");
                this.f30647dern = formularize.attabal(desc, null);
            }
        }

        public attabal(impromptu impromptuVar, String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f30645saneness = impromptuVar;
            this.f30644attabal = className;
        }

        public final void attabal(String name, Function1<? super C0682attabal, Unit> block) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(block, "block");
            Map map = this.f30645saneness.f30643attabal;
            C0682attabal c0682attabal = new C0682attabal(this, name);
            block.invoke(c0682attabal);
            Pair<String, competently> pairAttabal = c0682attabal.attabal();
            map.put(pairAttabal.getFirst(), pairAttabal.getSecond());
        }

        public final String saneness() {
            return this.f30644attabal;
        }
    }

    public final Map<String, competently> saneness() {
        return this.f30643attabal;
    }
}
