package com.inmobi.media;

import A.RunnableC0883c;
import A.RunnableC0907o;
import android.content.Context;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Ya {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Sa f23376c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f23375b = {Reflection.f43333a.i(new PropertyReference1Impl("cachedJson", Ya.class, "getCachedJson()Lorg/json/JSONObject;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ya f23374a = new Ya();
    public static final C3297x1 d = new C3297x1((Object) new JSONObject(), (Function0) Xa.f23347a, true, true);

    public static void b() {
        Context contextD = Uc.d();
        if (contextD != null) {
            Uc.a(new RunnableC0907o(contextD, 2));
        }
    }

    public final LinkedHashMap a() {
        String str;
        Iterator<Map.Entry<String, String>> it;
        JSONObject jSONObject = (JSONObject) d.getValue(this, f23375b[0]);
        LinkedHashMap linkedHashMap = O2.f23027a;
        SignalsConfig.PublisherConfig publisher = ((SignalsConfig) AbstractC3174p5.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getPublisher();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, String> entry : publisher.getGeneralKeys().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (jSONObject.has(key)) {
                int iHashCode = value.hashCode();
                if (iHashCode != -1325958191) {
                    if (iHashCode != -891985903) {
                        if (iHashCode != 104431) {
                            if (iHashCode == 3029738 && value.equals("bool")) {
                                linkedHashMap2.put(key, Boolean.valueOf(jSONObject.optBoolean(key)));
                            }
                        } else if (value.equals("int")) {
                            linkedHashMap2.put(key, Integer.valueOf(jSONObject.optInt(key)));
                        }
                    } else if (value.equals(com.smartdigimkt.v0.k.f38992h)) {
                        String strOptString = jSONObject.optString(key);
                        Intrinsics.e(strOptString, "optString(...)");
                        linkedHashMap2.put(key, strOptString);
                    }
                } else if (value.equals("double")) {
                    linkedHashMap2.put(key, Double.valueOf(jSONObject.optDouble(key)));
                }
            }
        }
        Iterator<Map.Entry<String, String>> it2 = publisher.getAdSpecificKeys().entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, String> next = it2.next();
            String key2 = next.getKey();
            String value2 = next.getValue();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(key2);
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                int i2 = 0;
                while (i2 < length) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(key2);
                    sb.append('_');
                    if (i2 == 0) {
                        str = "ban";
                    } else if (i2 == 1) {
                        str = "int";
                    } else if (i2 != 2) {
                        if (i2 != 3) {
                            it = it2;
                        } else {
                            str = "nat";
                        }
                        i2++;
                        it2 = it;
                    } else {
                        str = "rew";
                    }
                    sb.append(str);
                    String string = sb.toString();
                    int iHashCode2 = value2.hashCode();
                    it = it2;
                    if (iHashCode2 != -1325958191) {
                        if (iHashCode2 != -891985903) {
                            if (iHashCode2 != 104431) {
                                if (iHashCode2 == 3029738 && value2.equals("bool")) {
                                    linkedHashMap2.put(string, Boolean.valueOf(jSONArrayOptJSONArray.optBoolean(i2)));
                                }
                            } else if (value2.equals("int")) {
                                linkedHashMap2.put(string, Integer.valueOf(jSONArrayOptJSONArray.optInt(i2)));
                            }
                        } else if (value2.equals(com.smartdigimkt.v0.k.f38992h)) {
                            String strOptString2 = jSONArrayOptJSONArray.optString(i2);
                            Intrinsics.e(strOptString2, "optString(...)");
                            linkedHashMap2.put(string, strOptString2);
                        }
                    } else if (value2.equals("double")) {
                        linkedHashMap2.put(string, Double.valueOf(jSONArrayOptJSONArray.optDouble(i2)));
                    }
                    i2++;
                    it2 = it;
                }
            }
        }
        return linkedHashMap2;
    }

    public static final void b(JSONObject this_saveSignalsToPersistentCache) {
        Intrinsics.f(this_saveSignalsToPersistentCache, "$this_saveSignalsToPersistentCache");
        Context contextD = Uc.d();
        if (contextD != null) {
            f23374a.getClass();
            if (f23376c == null) {
                f23376c = new Sa(contextD, "pub_signals_store");
            }
            Sa sa = f23376c;
            if (sa != null) {
                String string = this_saveSignalsToPersistentCache.toString();
                Intrinsics.e(string, "toString(...)");
                sa.a("saved_signals", string);
                d.a();
                AbstractC3048h7.a((byte) 2, "PubSignalsStore", "Publisher Signals saved successfully.");
                return;
            }
            Intrinsics.m("prefDao");
            throw null;
        }
    }

    public static final void a(Context context) {
        Intrinsics.f(context, "$context");
        try {
            f23374a.getClass();
            if (f23376c == null) {
                f23376c = new Sa(context, "pub_signals_store");
            }
            Sa sa = f23376c;
            if (sa != null) {
                sa.c("saved_signals");
                d.a();
            } else {
                Intrinsics.m("prefDao");
                throw null;
            }
        } catch (Exception e2) {
            AbstractC3048h7.a((byte) 1, "PubSignalsStore", "Publisher signals could not be reset.");
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    public static LinkedHashMap a(LinkedHashMap linkedHashMap, SignalsConfig.PublisherConfig publisherConfig) {
        Object objA;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.putAll(linkedHashMap);
        for (Map.Entry<String, String> entry : publisherConfig.getGeneralKeys().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Object obj = linkedHashMap.get(key);
            if (obj != null && (objA = a(obj, value)) != null) {
                linkedHashMap3.remove(key);
                linkedHashMap2.put(key, objA);
            }
        }
        for (Map.Entry<String, String> entry2 : publisherConfig.getAdSpecificKeys().entrySet()) {
            String key2 = entry2.getKey();
            String value2 = entry2.getValue();
            String strM = android.support.v4.media.a.m(key2, "_ban");
            String strM2 = android.support.v4.media.a.m(key2, "_int");
            String strM3 = android.support.v4.media.a.m(key2, "_rew");
            String strM4 = android.support.v4.media.a.m(key2, "_nat");
            Object obj2 = linkedHashMap.get(strM);
            Object objA2 = obj2 != null ? a(obj2, value2) : null;
            Object obj3 = linkedHashMap.get(strM2);
            Object objA3 = obj3 != null ? a(obj3, value2) : null;
            Object obj4 = linkedHashMap.get(strM3);
            Object objA4 = obj4 != null ? a(obj4, value2) : null;
            Object obj5 = linkedHashMap.get(strM4);
            Object objA5 = obj5 != null ? a(obj5, value2) : null;
            if (objA2 != null || objA3 != null || objA4 != null || objA5 != null) {
                if (objA2 != null) {
                    linkedHashMap3.remove(strM);
                }
                if (objA3 != null) {
                    linkedHashMap3.remove(strM2);
                }
                if (objA4 != null) {
                    linkedHashMap3.remove(strM3);
                }
                if (objA5 != null) {
                    linkedHashMap3.remove(strM4);
                }
                JSONArray jSONArray = new JSONArray();
                if (objA2 == null) {
                    objA2 = a(value2);
                }
                JSONArray jSONArrayPut = jSONArray.put(objA2);
                if (objA3 == null) {
                    objA3 = a(value2);
                }
                JSONArray jSONArrayPut2 = jSONArrayPut.put(objA3);
                if (objA4 == null) {
                    objA4 = a(value2);
                }
                JSONArray jSONArrayPut3 = jSONArrayPut2.put(objA4);
                if (objA5 == null) {
                    objA5 = a(value2);
                }
                JSONArray jSONArrayPut4 = jSONArrayPut3.put(objA5);
                Intrinsics.e(jSONArrayPut4, "put(...)");
                linkedHashMap2.put(key2, jSONArrayPut4);
            }
        }
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            AbstractC3048h7.a((byte) 1, "PubSignalsStore", "Publisher Signal, " + ((String) entry3.getKey()) + com.p004ironsource.dc.T + entry3.getValue() + " Not supported");
        }
        return linkedHashMap2;
    }

    public static Object a(Object obj, String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1325958191) {
            if (!str.equals("double")) {
                return null;
            }
            if (obj instanceof Double) {
                return (Double) obj;
            }
            if (obj instanceof Integer) {
                return Double.valueOf(((Number) obj).intValue());
            }
            if (obj instanceof Float) {
                return Double.valueOf(((Number) obj).floatValue());
            }
            return null;
        }
        if (iHashCode == -891985903) {
            if (str.equals(com.smartdigimkt.v0.k.f38992h) && (obj instanceof String)) {
                return (String) obj;
            }
            return null;
        }
        if (iHashCode != 104431) {
            if (iHashCode == 3029738 && str.equals("bool") && (obj instanceof Boolean)) {
                return (Boolean) obj;
            }
            return null;
        }
        if (str.equals("int") && (obj instanceof Integer)) {
            return (Integer) obj;
        }
        return null;
    }

    public static Object a(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1325958191) {
            if (iHashCode == -891985903) {
                str.equals(com.smartdigimkt.v0.k.f38992h);
            } else if (iHashCode != 104431) {
                if (iHashCode == 3029738) {
                    str.equals("bool");
                }
            } else if (str.equals("int")) {
                return Integer.valueOf(Integer.parseInt(com.p004ironsource.x4.DISABLED_AUCTION_FALLBACK_ID));
            }
        } else if (str.equals("double")) {
            return Double.valueOf(Double.parseDouble(com.p004ironsource.x4.DISABLED_AUCTION_FALLBACK_ID));
        }
        return com.p004ironsource.x4.DISABLED_AUCTION_FALLBACK_ID;
    }

    public static JSONObject a(LinkedHashMap linkedHashMap) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                jSONObject.put(str, value);
            } else if (value instanceof Integer) {
                jSONObject.put(str, ((Number) value).intValue());
            } else if (value instanceof Boolean) {
                jSONObject.put(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Double) {
                jSONObject.put(str, ((Number) value).doubleValue());
            } else if (value instanceof JSONArray) {
                jSONObject.put(str, value);
            }
        }
        return jSONObject;
    }

    public static void a(JSONObject jSONObject) {
        Uc.a(new RunnableC0883c(jSONObject, 11));
    }

    public static JSONObject a(JSONObject jSONObject, SignalsConfig.PublisherConfig publisherConfig) {
        if (jSONObject.toString().length() <= publisherConfig.getPayloadSize()) {
            return jSONObject;
        }
        AbstractC3048h7.a((byte) 1, "PubSignalsStore", "Publisher Signal payload size exceeded.");
        S5 s5 = S5.f23167a;
        S5.d.a(new C3011f2(new IllegalStateException("Publisher signals size exceeds the limit")));
        return null;
    }
}
