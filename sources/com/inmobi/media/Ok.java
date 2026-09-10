package com.inmobi.media;

import com.inmobi.media.Ok;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.cutely;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.arytenoidectomy;
import patroclinal.formularize;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Ok {
    /* JADX WARN: Code duplicated, block: B:56:0x012a  */
    /* JADX WARN: Code duplicated, block: B:59:0x013d A[LOOP:1: B:57:0x0137->B:59:0x013d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0156  */
    public static Pk a() throws JSONException {
        JSONArray jSONArray;
        C3180qh c3180qh = Yi.a;
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        boolean enabled = ((SignalsConfig) Y3.a.a(SignalsConfig.class)).getUnifiedIdServiceConfig().getEnabled();
        if (!enabled) {
            InMobiUnifiedIdService.reset();
        }
        if (!enabled) {
            return new Pk();
        }
        if (c()) {
            return new Pk();
        }
        HashMap map = new HashMap();
        JSONObject jSONObjectA = F9.a();
        Iterator<String> itKeys = jSONObjectA != null ? jSONObjectA.keys() : null;
        if (itKeys != null) {
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("src", next);
                    jSONObject.put("envelope", jSONObjectA.get(next));
                    map.put(next, jSONObject);
                } catch (JSONException e) {
                    arytenoidectomy.formularize(" Error in looping through publisher provided unif id " + e.getMessage() + "\n                                        " + jSONObjectA.get(next) + "\n                    ", null, 1, null);
                }
            }
        }
        JSONObject jSONObjectB = F9.b();
        boolean z = false;
        z = false;
        z = false;
        if (jSONObjectB != null) {
            try {
                if (jSONObjectB.has("ufids")) {
                    JSONArray jSONArray2 = jSONObjectB.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    boolean z2 = false;
                    boolean z3 = false;
                    for (int i = 0; i < length; i++) {
                        try {
                            String string = jSONArray2.getJSONObject(i).has("src") ? jSONArray2.getJSONObject(i).getString("src") : null;
                            String string2 = jSONArray2.getJSONObject(i).has("envelope") ? jSONArray2.getJSONObject(i).getString("envelope") : null;
                            if (System.currentTimeMillis() > jSONArray2.getJSONObject(i).getLong("expiry")) {
                                z2 = true;
                            } else if (string != null && string2 != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("src", string);
                                jSONObject2.put("envelope", string2);
                                map.put(string, jSONObject2);
                                z3 = true;
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            z = z3;
                            e.getMessage();
                            jSONObjectB.toString();
                            if (!map.isEmpty()) {
                                return new Pk();
                            }
                            jSONArray = new JSONArray();
                            for (Object obj : map.values()) {
                                Intrinsics.checkNotNullExpressionValue(obj, "next(...)");
                                jSONArray.put((JSONObject) obj);
                            }
                            return new Pk(jSONArray.toString(), z);
                        }
                    }
                    if (z2) {
                        cutely.wireman(A9.c, null, null, new Nk(null), 3, null);
                    }
                    z = z3;
                }
            } catch (JSONException e3) {
                e = e3;
            }
        }
        if (!map.isEmpty()) {
            return new Pk();
        }
        jSONArray = new JSONArray();
        while (r1.hasNext()) {
            Intrinsics.checkNotNullExpressionValue(obj, "next(...)");
            jSONArray.put((JSONObject) obj);
        }
        return new Pk(jSONArray.toString(), z);
    }

    public static boolean b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return true;
        }
        try {
            JSONArray jSONArray = jSONObject.has("ufids") ? jSONObject.getJSONArray("ufids") : null;
            return jSONArray == null || jSONArray.length() == 0;
        } catch (JSONException unused) {
        }
    }

    public static boolean c(JSONObject ufids) {
        boolean z;
        Intrinsics.checkNotNullParameter(ufids, "ufids");
        try {
            if (ufids.has("ufids")) {
                JSONArray jSONArray = ufids.getJSONArray("ufids");
                int length = jSONArray.length();
                z = true;
                for (int i = 0; i < length; i++) {
                    try {
                        z &= System.currentTimeMillis() <= jSONArray.getJSONObject(i).getLong("expiry");
                    } catch (JSONException unused) {
                        Objects.toString(ufids);
                        return !z;
                    }
                }
            } else {
                z = true;
            }
        } catch (JSONException unused2) {
            z = true;
        }
        return !z;
    }

    public static final void b(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, JSONObject jSONObject, Error error) {
        if (inMobiUnifiedIdInterface != null) {
            inMobiUnifiedIdInterface.onFetchCompleted(jSONObject, error);
        }
    }

    public static JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObjectB = F9.b();
        if (jSONObjectB != null) {
            try {
                if (jSONObjectB.has("ufids")) {
                    JSONArray jSONArray2 = jSONObjectB.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        String string = jSONArray2.getJSONObject(i).has("src") ? jSONArray2.getJSONObject(i).getString("src") : null;
                        String string2 = jSONArray2.getJSONObject(i).has(InAppPurchaseMetaData.KEY_SIGNATURE) ? jSONArray2.getJSONObject(i).getString(InAppPurchaseMetaData.KEY_SIGNATURE) : null;
                        boolean z = System.currentTimeMillis() > jSONArray2.getJSONObject(i).getLong("expiry");
                        if (string != null && string2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("src", string);
                            jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, string2);
                            jSONObject.put("expired", z);
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (JSONException e) {
                e.getMessage();
                jSONObjectB.toString();
            }
        }
        return jSONArray;
    }

    public static boolean c() {
        C3238t1 c3238t1 = AbstractC3407zk.a;
        Boolean bool = c3238t1 != null ? c3238t1.c : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        if (zBooleanValue) {
            InMobiUnifiedIdService.reset();
        }
        return zBooleanValue;
    }

    public static void a(final InMobiUnifiedIdInterface inMobiUnifiedIdInterface, final JSONObject jSONObject, final Error error) {
        short s;
        String message = error != null ? error.getMessage() : null;
        if (Intrinsics.wireman(message, InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT)) {
            s = 93;
        } else {
            s = Intrinsics.wireman(message, InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT) ? (short) 94 : (short) -1;
        }
        if (s >= 0) {
            Map mapKowloon = seminary.kowloon(formularize.attabal(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s)));
            Wj wj = Wj.a;
            Wj.b("FetchCallbackFailure", mapKowloon, EnumC2779ak.SDK);
        }
        Oj.a(new Runnable() { // from class: adsuki.polyfoil
            @Override // java.lang.Runnable
            public final void run() {
                Ok.b(inMobiUnifiedIdInterface, jSONObject, error);
            }
        });
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            try {
                if (jSONObject.has("ufids")) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                        if (System.currentTimeMillis() < jSONObject3.getLong("expiry")) {
                            jSONArray.put(jSONObject3);
                        }
                    }
                }
            } catch (JSONException e) {
                e.getMessage();
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
                    for (int i = 0; i < length; i++) {
                        map.put(jSONArray2.getJSONObject(i).getString("src"), jSONArray2.getJSONObject(i));
                    }
                }
            } catch (JSONException e) {
                e.getMessage();
                Objects.toString(jSONObject2);
                Objects.toString(jSONObject);
                return jSONObject3;
            }
        }
        if (jSONObject != null && jSONObject.has("ufids")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("ufids");
            int length2 = jSONArray3.length();
            for (int i2 = 0; i2 < length2; i2++) {
                map.put(jSONArray3.getJSONObject(i2).getString("src"), jSONArray3.getJSONObject(i2));
            }
        }
        Collection collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            jSONArray.put((JSONObject) it.next());
        }
        jSONObject3.put("ufids", jSONArray);
        return jSONObject3;
    }
}
