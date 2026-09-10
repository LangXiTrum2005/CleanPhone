package asosan;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.Result;
import p002kotlin.Triple;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.KTypeProjection;
import vinyl.claque;
import vinyl.cultivated;
import vinyl.deadwork;
import vinyl.privatdozent;
import vinyl.starveling;
import vinyl.timberyard;
import vinyl.unconsolidated;

/* JADX INFO: compiled from: Serializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a!\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0006\u001a-\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a9\u0010\u000e\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0018\u00010\f*\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0010*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aI\u0010\u0018\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00020\u00040\u00112\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\f2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a9\u0010\u001a\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00020\u00040\u00112\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001aI\u0010\u001c\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00020\u00040\u00112\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\f2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u0019\u001a3\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003\"\b\b\u0000\u0010\u0010*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcerebral/dern;", "Lkurbash/arytenoidectomy;", "type", "Lasosan/wireman;", "", "beachfront", "(Lcerebral/dern;Lkurbash/arytenoidectomy;)Lasosan/wireman;", "taiyuan", "", "failOnMissingTypeArgSerializer", "competently", "(Lcerebral/dern;Lkurbash/arytenoidectomy;Z)Lasosan/wireman;", "", "typeArguments", "apical", "(Lcerebral/dern;Ljava/util/List;Z)Ljava/util/List;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkurbash/wireman;", "cutely", "(Lkurbash/wireman;)Lasosan/wireman;", "serializers", "Lkotlin/Function0;", "Lkurbash/beachfront;", "elementClassifierIfArray", "marial", "(Lkurbash/wireman;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Lasosan/wireman;", "dern", "(Lkurbash/wireman;Ljava/util/List;)Lasosan/wireman;", "saneness", "shouldBeNullable", "wireman", "(Lasosan/wireman;Z)Lasosan/wireman;", "kotlinx-serialization-core"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
public final /* synthetic */ class gintrap {
    public static final List<wireman<Object>> apical(cerebral.dern dernVar, List<? extends kurbash.arytenoidectomy> typeArguments, boolean z) {
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (z) {
            List<? extends kurbash.arytenoidectomy> list = typeArguments;
            ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(adultoid.saneness(dernVar, (kurbash.arytenoidectomy) it.next()));
            }
            return arrayList;
        }
        List<? extends kurbash.arytenoidectomy> list2 = typeArguments;
        ArrayList arrayList2 = new ArrayList(p002kotlin.collections.dovishness.gintrap(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            wireman<Object> wiremanVarDern = adultoid.dern(dernVar, (kurbash.arytenoidectomy) it2.next());
            if (wiremanVarDern == null) {
                return null;
            }
            arrayList2.add(wiremanVarDern);
        }
        return arrayList2;
    }

    public static final wireman<Object> beachfront(cerebral.dern dernVar, kurbash.arytenoidectomy type) {
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        wireman<Object> wiremanVarCompetently = competently(dernVar, type, true);
        if (wiremanVarCompetently != null) {
            return wiremanVarCompetently;
        }
        unconsolidated.arytenoidectomy(claque.dern(type));
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    public static final wireman<Object> competently(cerebral.dern dernVar, kurbash.arytenoidectomy arytenoidectomyVar, boolean z) {
        wireman<Object> wiremanVarImpassible;
        wireman<? extends Object> wiremanVarSaneness;
        impromptu impromptuVar;
        kurbash.wireman<Object> wiremanVarDern = claque.dern(arytenoidectomyVar);
        boolean zAttabal = arytenoidectomyVar.attabal();
        List<KTypeProjection> listWireman = arytenoidectomyVar.wireman();
        final ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(listWireman, 10));
        Iterator<T> it = listWireman.iterator();
        while (it.hasNext()) {
            arrayList.add(claque.competently((KTypeProjection) it.next()));
        }
        if (arrayList.isEmpty()) {
            if (!unconsolidated.formularize(wiremanVarDern) || cerebral.dern.dern(dernVar, wiremanVarDern, null, 2, null) == null) {
                wiremanVarImpassible = graveside.impassible(wiremanVarDern, zAttabal);
            } else {
                wiremanVarImpassible = null;
            }
        } else if (dernVar.getHasInterfaceContextualSerializers()) {
            wiremanVarImpassible = null;
        } else {
            Object objTriweekly = graveside.triweekly(wiremanVarDern, arrayList, zAttabal);
            if (Result.m3356isFailureimpl(objTriweekly)) {
                objTriweekly = null;
            }
            wiremanVarImpassible = (wireman) objTriweekly;
        }
        if (wiremanVarImpassible != null) {
            return wiremanVarImpassible;
        }
        if (arrayList.isEmpty()) {
            wiremanVarSaneness = adultoid.wireman(wiremanVarDern);
            if (wiremanVarSaneness == null && (wiremanVarSaneness = cerebral.dern.dern(dernVar, wiremanVarDern, null, 2, null)) == null) {
                if (unconsolidated.formularize(wiremanVarDern)) {
                    impromptuVar = new impromptu(wiremanVarDern);
                    wiremanVarSaneness = impromptuVar;
                } else {
                    wiremanVarSaneness = null;
                }
            }
        } else {
            List<wireman<Object>> listMarial = adultoid.marial(dernVar, arrayList, z);
            if (listMarial == null) {
                return null;
            }
            wireman<? extends Object> wiremanVarAttabal = adultoid.attabal(wiremanVarDern, listMarial, new Function0() { // from class: asosan.dovishness
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return gintrap.impromptu(arrayList);
                }
            });
            if (wiremanVarAttabal == null) {
                wiremanVarSaneness = dernVar.saneness(wiremanVarDern, listMarial);
                if (wiremanVarSaneness == null) {
                    if (unconsolidated.formularize(wiremanVarDern)) {
                        impromptuVar = new impromptu(wiremanVarDern);
                        wiremanVarSaneness = impromptuVar;
                    } else {
                        wiremanVarSaneness = null;
                    }
                }
            } else {
                wiremanVarSaneness = wiremanVarAttabal;
            }
        }
        if (wiremanVarSaneness != null) {
            return wireman(wiremanVarSaneness, zAttabal);
        }
        return null;
    }

    public static final <T> wireman<T> cutely(kurbash.wireman<T> wiremanVar) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        wireman<T> wiremanVarSaneness = unconsolidated.saneness(wiremanVar);
        return wiremanVarSaneness == null ? deadwork.saneness(wiremanVar) : wiremanVarSaneness;
    }

    public static final wireman<? extends Object> dern(kurbash.wireman<Object> wiremanVar, List<? extends wireman<Object>> list) {
        wireman[] wiremanVarArr = (wireman[]) list.toArray(new wireman[0]);
        return unconsolidated.wireman(wiremanVar, (wireman[]) Arrays.copyOf(wiremanVarArr, wiremanVarArr.length));
    }

    public static final kurbash.beachfront impromptu(List list) {
        return ((kurbash.arytenoidectomy) list.get(0)).dern();
    }

    public static final wireman<? extends Object> marial(kurbash.wireman<Object> wiremanVar, List<? extends wireman<Object>> serializers, Function0<? extends kurbash.beachfront> elementClassifierIfArray) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        Intrinsics.checkNotNullParameter(serializers, "serializers");
        Intrinsics.checkNotNullParameter(elementClassifierIfArray, "elementClassifierIfArray");
        wireman<? extends Object> wiremanVarSaneness = saneness(wiremanVar, serializers, elementClassifierIfArray);
        return wiremanVarSaneness == null ? dern(wiremanVar, serializers) : wiremanVarSaneness;
    }

    public static final wireman<? extends Object> saneness(kurbash.wireman<Object> wiremanVar, List<? extends wireman<Object>> list, Function0<? extends kurbash.beachfront> function0) {
        if (Intrinsics.wireman(wiremanVar, p002kotlin.jvm.internal.polloi.saneness(Collection.class)) || Intrinsics.wireman(wiremanVar, p002kotlin.jvm.internal.polloi.saneness(List.class)) || Intrinsics.wireman(wiremanVar, p002kotlin.jvm.internal.polloi.saneness(List.class)) || Intrinsics.wireman(wiremanVar, p002kotlin.jvm.internal.polloi.saneness(ArrayList.class))) {
            return new vinyl.beachfront(list.get(0));
        }
        if (Intrinsics.wireman(wiremanVar, p002kotlin.jvm.internal.polloi.saneness(HashSet.class))) {
            return new starveling(list.get(0));
        }
        if (Intrinsics.wireman(wiremanVar, p002kotlin.jvm.internal.polloi.saneness(Set.class)) || Intrinsics.wireman(wiremanVar, p002kotlin.jvm.internal.polloi.saneness(Set.class)) || Intrinsics.wireman(wiremanVar, p002kotlin.jvm.internal.polloi.saneness(LinkedHashSet.class))) {
            return new timberyard(list.get(0));
        }
        if (Intrinsics.wireman(wiremanVar, p002kotlin.jvm.internal.polloi.saneness(HashMap.class))) {
            return new privatdozent(list.get(0), list.get(1));
        }
        if (Intrinsics.wireman(wiremanVar, p002kotlin.jvm.internal.polloi.saneness(Map.class)) || Intrinsics.wireman(wiremanVar, p002kotlin.jvm.internal.polloi.saneness(Map.class)) || Intrinsics.wireman(wiremanVar, p002kotlin.jvm.internal.polloi.saneness(LinkedHashMap.class))) {
            return new cultivated(list.get(0), list.get(1));
        }
        if (Intrinsics.wireman(wiremanVar, p002kotlin.jvm.internal.polloi.saneness(Map.Entry.class))) {
            return defendable.attabal.cutely(list.get(0), list.get(1));
        }
        if (Intrinsics.wireman(wiremanVar, p002kotlin.jvm.internal.polloi.saneness(Pair.class))) {
            return defendable.attabal.impassible(list.get(0), list.get(1));
        }
        if (Intrinsics.wireman(wiremanVar, p002kotlin.jvm.internal.polloi.saneness(Triple.class))) {
            return defendable.attabal.kowloon(list.get(0), list.get(1), list.get(2));
        }
        if (!unconsolidated.kowloon(wiremanVar)) {
            return null;
        }
        kurbash.beachfront beachfrontVarInvoke = function0.invoke();
        Intrinsics.competently(beachfrontVarInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return defendable.attabal.attabal((kurbash.wireman) beachfrontVarInvoke, list.get(0));
    }

    public static final wireman<Object> taiyuan(cerebral.dern dernVar, kurbash.arytenoidectomy type) {
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return competently(dernVar, type, false);
    }

    public static final <T> wireman<T> wireman(wireman<T> wiremanVar, boolean z) {
        if (z) {
            return defendable.attabal.graveside(wiremanVar);
        }
        Intrinsics.competently(wiremanVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return wiremanVar;
    }
}
