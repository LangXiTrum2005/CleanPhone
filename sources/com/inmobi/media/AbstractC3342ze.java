package com.inmobi.media;

import A.RunnableC0887e;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3342ze {
    /* JADX WARN: Code duplicated, block: B:60:0x011f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0132 A[LOOP:1: B:61:0x012c->B:63:0x0132, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x0146  */
    public static Ae a() {
        JSONArray jSONArray;
        Iterator it;
        LinkedHashMap linkedHashMap = O2.f23027a;
        boolean enabled = ((SignalsConfig) AbstractC3174p5.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getUnifiedIdServiceConfig().getEnabled();
        if (!enabled) {
            InMobiUnifiedIdService.reset();
        }
        if (!enabled) {
            return new Ae();
        }
        Boolean boolC = C3246te.f24014a.c();
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
        if (zBooleanValue) {
            InMobiUnifiedIdService.reset();
        }
        if (zBooleanValue) {
            return new Ae();
        }
        HashMap map = new HashMap();
        JSONObject jSONObjectA = Q5.a();
        Iterator<String> itKeys = jSONObjectA != null ? jSONObjectA.keys() : null;
        if (itKeys != null) {
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("src", next);
                    jSONObject.put("envelope", jSONObjectA.get(next));
                    Intrinsics.c(next);
                    map.put(next, jSONObject);
                } catch (JSONException e2) {
                    StringsKt.d0(" Error in looping through publisher provided unif id " + e2.getMessage() + "  \n                                        " + jSONObjectA.get(next));
                }
            }
        }
        JSONObject jSONObjectB = Q5.b();
        boolean z2 = false;
        int i2 = 0;
        z2 = false;
        z2 = false;
        if (jSONObjectB != null) {
            try {
                if (jSONObjectB.has("ufids")) {
                    JSONArray jSONArray2 = jSONObjectB.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    boolean z3 = false;
                    boolean z4 = false;
                    while (i2 < length) {
                        try {
                            String string = jSONArray2.getJSONObject(i2).has("src") ? jSONArray2.getJSONObject(i2).getString("src") : null;
                            String string2 = jSONArray2.getJSONObject(i2).has("envelope") ? jSONArray2.getJSONObject(i2).getString("envelope") : null;
                            if (System.currentTimeMillis() > jSONArray2.getJSONObject(i2).getLong("expiry")) {
                                z3 = true;
                            } else if (string != null && string2 != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("src", string);
                                jSONObject2.put("envelope", string2);
                                map.put(string, jSONObject2);
                                z4 = true;
                            }
                            i2++;
                            z3 = z3;
                        } catch (JSONException unused) {
                            z2 = z4;
                            jSONObjectB.toString();
                            if (!map.isEmpty()) {
                                return new Ae();
                            }
                            jSONArray = new JSONArray();
                            it = map.values().iterator();
                            while (it.hasNext()) {
                                jSONArray.put((JSONObject) it.next());
                            }
                            return new Ae(jSONArray.toString(), z2);
                        }
                    }
                    if (z3) {
                        InMobiUnifiedIdService.fetchUnifiedIdsInternal$media_release(null);
                    }
                    z2 = z4;
                }
            } catch (JSONException unused2) {
            }
        }
        if (!map.isEmpty()) {
            return new Ae();
        }
        jSONArray = new JSONArray();
        it = map.values().iterator();
        while (it.hasNext()) {
            jSONArray.put((JSONObject) it.next());
        }
        return new Ae(jSONArray.toString(), z2);
    }

    public static final void b(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, JSONObject jSONObject, Error error) {
        if (inMobiUnifiedIdInterface != null) {
            inMobiUnifiedIdInterface.onFetchCompleted(jSONObject, error);
        }
    }

    public static void a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, JSONObject jSONObject, Error error) {
        short s;
        String message = error != null ? error.getMessage() : null;
        if (Intrinsics.a(message, InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT)) {
            s = 93;
        } else {
            s = Intrinsics.a(message, InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT) ? (short) 94 : (short) -1;
        }
        if (s >= 0) {
            LinkedHashMap linkedHashMapL = MapsKt.l(new Pair("errorCode", Short.valueOf(s)));
            Pd pd = Pd.f23077a;
            Pd.b("FetchCallbackFailure", linkedHashMapL, Td.SDK);
        }
        Md.a(new RunnableC0887e(inMobiUnifiedIdInterface, jSONObject, error, 11));
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            try {
                if (jSONObject.has("ufids")) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                        if (System.currentTimeMillis() < jSONObject3.getLong("expiry")) {
                            jSONArray.put(jSONObject3);
                        }
                    }
                }
            } catch (JSONException unused) {
                return null;
            }
        }
        if (jSONArray.length() <= 0) {
            return null;
        }
        jSONObject2.put("ufids", jSONArray);
        return jSONObject2;
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        HashMap map = new HashMap();
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject2 != null) {
            try {
                if (jSONObject2.has("ufids")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = jSONArray2.getJSONObject(i2).getString("src");
                        Intrinsics.c(string);
                        JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                        Intrinsics.e(jSONObject4, "getJSONObject(...)");
                        map.put(string, jSONObject4);
                    }
                }
            } catch (JSONException unused) {
                Objects.toString(jSONObject2);
                Objects.toString(jSONObject);
                return jSONObject3;
            }
        }
        if (jSONObject != null && jSONObject.has("ufids")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("ufids");
            int length2 = jSONArray3.length();
            for (int i3 = 0; i3 < length2; i3++) {
                String string2 = jSONArray3.getJSONObject(i3).getString("src");
                Intrinsics.c(string2);
                JSONObject jSONObject5 = jSONArray3.getJSONObject(i3);
                Intrinsics.e(jSONObject5, "getJSONObject(...)");
                map.put(string2, jSONObject5);
            }
        }
        Collection collectionValues = map.values();
        Intrinsics.e(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            jSONArray.put((JSONObject) it.next());
        }
        jSONObject3.put("ufids", jSONArray);
        return jSONObject3;
    }
}
