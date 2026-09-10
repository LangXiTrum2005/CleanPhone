package p002kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.util.TypeRegistry;
import p002kotlin.reflect.jvm.internal.impl.util.dern;
import p002kotlin.reflect.jvm.internal.impl.util.marial;

/* JADX INFO: compiled from: TypeAttributes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class overspeculate extends marial<mathsort<?>, mathsort<?>> implements Iterable<mathsort<?>>, unready.attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final attabal f31797arytenoidectomy = new attabal(null);

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final overspeculate f31798monoploid = new overspeculate((List<? extends mathsort<?>>) adultoid.formularize());

    /* JADX INFO: compiled from: TypeAttributes.kt */
    public static final class attabal extends TypeRegistry<mathsort<?>, mathsort<?>> {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final overspeculate impromptu(List<? extends mathsort<?>> attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            return attributes.isEmpty() ? taiyuan() : new overspeculate(attributes, null);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.util.TypeRegistry
        public int saneness(ConcurrentHashMap<String, Integer> concurrentHashMap, String key, Function1<? super String, Integer> compute) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(concurrentHashMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(compute, "compute");
            Integer num = concurrentHashMap.get(key);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = concurrentHashMap.get(key);
                    if (num2 == null) {
                        Integer numInvoke = compute.invoke(key);
                        concurrentHashMap.putIfAbsent(key, Integer.valueOf(numInvoke.intValue()));
                        num2 = numInvoke;
                    }
                    Intrinsics.beachfront(num2);
                    iIntValue = num2.intValue();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return iIntValue;
        }

        public final overspeculate taiyuan() {
            return overspeculate.f31798monoploid;
        }

        public attabal() {
        }
    }

    public /* synthetic */ overspeculate(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<? extends mathsort<?>>) list);
    }

    public final overspeculate cutely(overspeculate other) {
        mathsort mathsortVarDern;
        Intrinsics.checkNotNullParameter(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f31797arytenoidectomy.beachfront().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            mathsort<?> mathsortVar = saneness().get(iIntValue);
            mathsort<?> mathsortVar2 = other.saneness().get(iIntValue);
            if (mathsortVar == null) {
                mathsortVarDern = mathsortVar2 != null ? mathsortVar2.dern(mathsortVar) : null;
            } else {
                mathsortVarDern = mathsortVar.dern(mathsortVar2);
            }
            lyreflower.attabal.attabal(arrayList, mathsortVarDern);
        }
        return f31797arytenoidectomy.impromptu(arrayList);
    }

    public final overspeculate impassible(mathsort<?> attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        if (taiyuan(attribute)) {
            return this;
        }
        if (isEmpty()) {
            return new overspeculate(attribute);
        }
        return f31797arytenoidectomy.impromptu(CollectionsKt.claque(CollectionsKt.molet(this), attribute));
    }

    public final overspeculate impromptu(overspeculate other) {
        mathsort mathsortVarAttabal;
        Intrinsics.checkNotNullParameter(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f31797arytenoidectomy.beachfront().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            mathsort<?> mathsortVar = saneness().get(iIntValue);
            mathsort<?> mathsortVar2 = other.saneness().get(iIntValue);
            if (mathsortVar == null) {
                mathsortVarAttabal = mathsortVar2 != null ? mathsortVar2.attabal(mathsortVar) : null;
            } else {
                mathsortVarAttabal = mathsortVar.attabal(mathsortVar2);
            }
            lyreflower.attabal.attabal(arrayList, mathsortVarAttabal);
        }
        return f31797arytenoidectomy.impromptu(arrayList);
    }

    public final boolean taiyuan(mathsort<?> attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        return saneness().get(f31797arytenoidectomy.marial(attribute.saneness())) != null;
    }

    public final overspeculate triweekly(mathsort<?> attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        if (!isEmpty()) {
            dern<mathsort<?>> dernVarSaneness = saneness();
            ArrayList arrayList = new ArrayList();
            for (mathsort<?> mathsortVar : dernVarSaneness) {
                if (!Intrinsics.wireman(mathsortVar, attribute)) {
                    arrayList.add(mathsortVar);
                }
            }
            if (arrayList.size() != saneness().saneness()) {
                return f31797arytenoidectomy.impromptu(arrayList);
            }
        }
        return this;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.attabal
    public TypeRegistry<mathsort<?>, mathsort<?>> wireman() {
        return f31797arytenoidectomy;
    }

    public overspeculate(List<? extends mathsort<?>> list) {
        for (mathsort<?> mathsortVar : list) {
            beachfront(mathsortVar.saneness(), mathsortVar);
        }
    }

    public overspeculate(mathsort<?> mathsortVar) {
        this((List<? extends mathsort<?>>) graveside.marial(mathsortVar));
    }
}
