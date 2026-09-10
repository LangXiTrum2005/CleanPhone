package kotlinx.serialization.json.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JsonNamesMap.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0017\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0017\u0010\u0013\u001a-\u0010\u0019\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\",\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040!0\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\"\u0010\u001f¨\u0006$"}, d2 = {"Lbristol/beachfront;", "Lcutwater/attabal;", "json", "", "", "", "saneness", "(Lbristol/beachfront;Lcutwater/attabal;)Ljava/util/Map;", "descriptor", "marial", "(Lcutwater/attabal;Lbristol/beachfront;)Ljava/util/Map;", "index", "impromptu", "(Lbristol/beachfront;Lcutwater/attabal;I)Ljava/lang/String;", "Lcutwater/preprohormone;", "impassible", "(Lbristol/beachfront;Lcutwater/attabal;)Lcutwater/preprohormone;", "name", "formularize", "(Lbristol/beachfront;Lcutwater/attabal;Ljava/lang/String;)I", "", "wireman", "(Lcutwater/attabal;Lbristol/beachfront;)Z", "taiyuan", "suffix", "cutely", "(Lbristol/beachfront;Lcutwater/attabal;Ljava/lang/String;Ljava/lang/String;)I", "Lkotlinx/serialization/json/internal/dovishness$attabal;", "attabal", "Lkotlinx/serialization/json/internal/dovishness$attabal;", "competently", "()Lkotlinx/serialization/json/internal/dovishness$attabal;", "JsonDeserializationNamesKey", "", "getJsonSerializationNamesKey", "JsonSerializationNamesKey", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class cuirassed {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dovishness.attabal<Map<String, Integer>> f32499attabal = new dovishness.attabal<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final dovishness.attabal<String[]> f32500saneness = new dovishness.attabal<>();

    public static /* synthetic */ int apical(bristol.beachfront beachfrontVar, cutwater.attabal attabalVar, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return cutely(beachfrontVar, attabalVar, str, str2);
    }

    public static final Map beachfront(bristol.beachfront beachfrontVar, cutwater.attabal attabalVar) {
        return saneness(beachfrontVar, attabalVar);
    }

    public static final dovishness.attabal<Map<String, Integer>> competently() {
        return f32499attabal;
    }

    public static final int cutely(bristol.beachfront beachfrontVar, cutwater.attabal json, String name, String suffix) {
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int iTaiyuan = taiyuan(beachfrontVar, json, name);
        if (iTaiyuan != -3) {
            return iTaiyuan;
        }
        throw new SerializationException(beachfrontVar.getSerialName() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static final void dern(Map<String, Integer> map, bristol.beachfront beachfrontVar, String str, int i) {
        String str2 = Intrinsics.wireman(beachfrontVar.getKind(), bristol.impassible.saneness.f15156attabal) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + beachfrontVar.marial(i) + " is already one of the names for " + str2 + ' ' + beachfrontVar.marial(((Number) p002kotlin.collections.seminary.cutely(map, str)).intValue()) + " in " + beachfrontVar);
    }

    public static final int formularize(bristol.beachfront beachfrontVar, cutwater.attabal attabalVar, String str) {
        Integer num = marial(attabalVar, beachfrontVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final cutwater.preprohormone impassible(bristol.beachfront beachfrontVar, cutwater.attabal json) {
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.wireman(beachfrontVar.getKind(), bristol.triweekly.attabal.f15179attabal)) {
            json.getConfiguration().formularize();
        }
        return null;
    }

    public static final String impromptu(bristol.beachfront beachfrontVar, cutwater.attabal json, int i) {
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        impassible(beachfrontVar, json);
        return beachfrontVar.marial(i);
    }

    public static final Map<String, Integer> marial(final cutwater.attabal attabalVar, final bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(attabalVar, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (Map) cutwater.supplicat.attabal(attabalVar).saneness(descriptor, f32499attabal, new Function0() { // from class: kotlinx.serialization.json.internal.cord
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return cuirassed.beachfront(descriptor, attabalVar);
            }
        });
    }

    public static final Map<String, Integer> saneness(bristol.beachfront beachfrontVar, cutwater.attabal attabalVar) {
        String lowerCase;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zWireman = wireman(attabalVar, beachfrontVar);
        impassible(beachfrontVar, attabalVar);
        int elementsCount = beachfrontVar.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            List<Annotation> listBeachfront = beachfrontVar.beachfront(i);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listBeachfront) {
                if (obj instanceof cutwater.rotuma) {
                    arrayList.add(obj);
                }
            }
            cutwater.rotuma rotumaVar = (cutwater.rotuma) CollectionsKt.outmarry(arrayList);
            if (rotumaVar != null && (strArrNames = rotumaVar.names()) != null) {
                for (String lowerCase2 : strArrNames) {
                    if (zWireman) {
                        lowerCase2 = lowerCase2.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    }
                    dern(linkedHashMap, beachfrontVar, lowerCase2, i);
                }
            }
            if (zWireman) {
                lowerCase = beachfrontVar.marial(i).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                dern(linkedHashMap, beachfrontVar, lowerCase, i);
            }
        }
        return linkedHashMap.isEmpty() ? p002kotlin.collections.seminary.taiyuan() : linkedHashMap;
    }

    public static final int taiyuan(bristol.beachfront beachfrontVar, cutwater.attabal json, String name) {
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        if (wireman(json, beachfrontVar)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return formularize(beachfrontVar, json, lowerCase);
        }
        impassible(beachfrontVar, json);
        int iDern = beachfrontVar.dern(name);
        return (iDern == -3 && json.getConfiguration().getUseAlternativeNames()) ? formularize(beachfrontVar, json, name) : iDern;
    }

    public static final boolean wireman(cutwater.attabal attabalVar, bristol.beachfront beachfrontVar) {
        return attabalVar.getConfiguration().getDecodeEnumsCaseInsensitive() && Intrinsics.wireman(beachfrontVar.getKind(), bristol.impassible.saneness.f15156attabal);
    }
}
