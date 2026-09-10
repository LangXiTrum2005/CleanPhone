package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.Og;
import com.inmobi.media.core.config.models.SignalsConfig;
import formularization.attabal;
import formularization.beachfront;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.cutely;
import kurbash.formularize;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.Pair;
import p002kotlin.Triple;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.text.dovishness;
import patroclinal.taiyuan;

/* JADX INFO: loaded from: classes3.dex */
public final class Og {
    public static C3403zg d;
    public static final /* synthetic */ formularize[] b = {polloi.cutely(new PropertyReference1Impl(Og.class, "cachedJson", "getCachedJson()Lorg/json/JSONObject;", 0)), polloi.cutely(new PropertyReference1Impl(Og.class, "impressionDepth", "getImpressionDepth()Lorg/json/JSONObject;", 0))};
    public static final Og a = new Og();
    public static final List c = adultoid.kowloon("ban", "int", "rew", "nat");
    public static final I1 e = new I1(new JSONObject(), new Function0() { // from class: adsuki.ethene
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Og.a();
        }
    }, true, true);
    public static final I1 f = new I1(new JSONObject(), new Function0() { // from class: adsuki.microanalysis
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Og.f();
        }
    }, true, true);
    public static final attabal g = beachfront.saneness(false, 1, null);

    public static final JSONObject a(Og og) throws JSONException {
        og.getClass();
        JSONObject jSONObject = new JSONObject();
        Iterator<String> itKeys = a.b().keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Intrinsics.beachfront(next);
            if (dovishness.starveling(next, "obj_", false, 2, null) || dovishness.starveling(next, "auto_", false, 2, null) || dovishness.starveling(next, "dir_", false, 2, null)) {
                jSONObject.put(next, a.b().opt(next));
            }
        }
        return jSONObject;
    }

    public static final Object b(Og og, Map map, SignalsConfig.PublisherConfig publisherConfig, Mg mg) throws JSONException {
        og.getClass();
        if (!publisherConfig.getDirect().getEnabled()) {
            Kb.a((byte) 1, "PubSignals", "Direct signals are disabled by InMobi");
            return Unit.f29295attabal;
        }
        int count = publisherConfig.getDirect().getCount();
        Triple tripleC = Pg.c(map, publisherConfig);
        String str = (String) tripleC.component1();
        JSONObject jSONObject = (JSONObject) tripleC.component2();
        String str2 = (String) tripleC.component3();
        if (jSONObject == null) {
            return Unit.f29295attabal;
        }
        og.a(str2, "d_i_dep");
        Object objA = og.a(Pg.a(og.b(), str, jSONObject, count), mg);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    public static final Object c(Og og, Map map, SignalsConfig.PublisherConfig publisherConfig, Mg mg) throws JSONException {
        og.getClass();
        if (!publisherConfig.getObj().getEnabled()) {
            Kb.a((byte) 1, "PubSignals", "Object signals are disabled by InMobi");
            return Unit.f29295attabal;
        }
        int count = publisherConfig.getObj().getCount();
        Triple tripleB = Pg.b(map, publisherConfig);
        String str = (String) tripleB.component1();
        JSONObject jSONObject = (JSONObject) tripleB.component2();
        String str2 = (String) tripleB.component3();
        if (jSONObject == null) {
            return Unit.f29295attabal;
        }
        og.a(str2, "o_i_dep");
        Object objA = og.a(Pg.a(og.b(), str, jSONObject, count), mg);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    public static final JSONObject f() {
        a.getClass();
        Context context = Ji.a;
        JSONObject jSONObject = null;
        if (context != null) {
            if (d == null) {
                d = new C3403zg(context, "pub_signals_store");
            }
            C3403zg c3403zg = d;
            if (c3403zg == null) {
                Intrinsics.preprohormone("prefDao");
                c3403zg = null;
            }
            String strA = c3403zg.a("imp_depth");
            if (strA != null) {
                jSONObject = new JSONObject(strA);
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public final LinkedHashMap d() {
        JSONObject jSONObjectB = b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = c().getObj().getAllowedKeysAnd();
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = c().getAuto().getAllowedKeys();
        List<String> list = c;
        SignalsConfig.PublisherConfig publisherConfigC = c();
        for (String str : list) {
            Pg.a(Pg.a(Pg.a(linkedHashMap, jSONObjectB, "obj_", str, Pg.c(allowedKeysAnd)), jSONObjectB, "auto_", str, Pg.c(allowedKeys)), jSONObjectB, "dir_", str, publisherConfigC.getDirect().getAllowedKeys());
        }
        return linkedHashMap;
    }

    public final JSONObject e() throws JSONException {
        JSONObject jSONObjectB = b();
        JSONObject jSONObject = new JSONObject();
        Iterator<String> itKeys = jSONObjectB.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Intrinsics.beachfront(next);
            if (!dovishness.starveling(next, "obj_", false, 2, null) && !dovishness.starveling(next, "auto_", false, 2, null) && !dovishness.starveling(next, "dir_", false, 2, null)) {
                jSONObject.put(next, jSONObjectB.opt(next));
            }
        }
        for (String str : c) {
            a.getClass();
            if (c().getObj().getEnabled()) {
                Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = c().getObj().getAllowedKeysAnd();
                ArrayList arrayList = new ArrayList(allowedKeysAnd.size());
                Iterator<Map.Entry<String, SignalsConfig.PublisherConfig.KeyData>> it = allowedKeysAnd.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getValue().getName());
                }
                Pg.a(jSONObject, jSONObjectB, str, "obj_", CollectionsKt.prefect(arrayList));
            }
            a.getClass();
            if (c().getAuto().getEnabled()) {
                Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = c().getAuto().getAllowedKeys();
                ArrayList arrayList2 = new ArrayList(allowedKeys.size());
                Iterator<Map.Entry<String, SignalsConfig.PublisherConfig.KeyData>> it2 = allowedKeys.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().getValue().getName());
                }
                Pg.a(jSONObject, jSONObjectB, str, "auto_", CollectionsKt.prefect(arrayList2));
            }
            a.getClass();
            if (c().getDirect().getEnabled()) {
                Pg.a(jSONObject, jSONObjectB, str, "dir_", c().getDirect().getAllowedKeys().keySet());
            }
        }
        for (Pair pair : adultoid.kowloon(patroclinal.formularize.attabal(c().getObj(), "o_i_dep"), patroclinal.formularize.attabal(c().getDirect(), "d_i_dep"), patroclinal.formularize.attabal(c().getAuto(), "a_i_dep"))) {
            SignalsConfig.PublisherConfig.BaseInputData baseInputData = (SignalsConfig.PublisherConfig.BaseInputData) pair.component1();
            String str2 = (String) pair.component2();
            if (baseInputData.getDepth().getEnabled()) {
                Og og = a;
                og.getClass();
                JSONArray jSONArrayOptJSONArray = ((JSONObject) f.getValue(og, b[1])).optJSONArray(str2);
                if (jSONArrayOptJSONArray == null) {
                    Map map = Pg.a;
                    jSONArrayOptJSONArray = new JSONArray();
                    jSONArrayOptJSONArray.put(0);
                    jSONArrayOptJSONArray.put(0);
                    jSONArrayOptJSONArray.put(0);
                    jSONArrayOptJSONArray.put(0);
                }
                jSONObject.put(str2, jSONArrayOptJSONArray);
            }
        }
        jSONObject.toString();
        return jSONObject;
    }

    public static final Object a(Og og, Map map, SignalsConfig.PublisherConfig publisherConfig, Mg mg) throws JSONException {
        og.getClass();
        if (!publisherConfig.getAuto().getEnabled()) {
            return Unit.f29295attabal;
        }
        int count = publisherConfig.getAuto().getCount();
        Triple tripleA = Pg.a(map, publisherConfig);
        String str = (String) tripleA.component1();
        JSONObject jSONObject = (JSONObject) tripleA.component2();
        String str2 = (String) tripleA.component3();
        if (jSONObject == null) {
            return Unit.f29295attabal;
        }
        og.a(str2, "a_i_dep");
        Object objA = og.a(Pg.a(og.b(), str, jSONObject, count), mg);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    public static SignalsConfig.PublisherConfig c() {
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        return ((SignalsConfig) Y3.a.a(SignalsConfig.class)).getPublisher();
    }

    public final JSONObject b() {
        return (JSONObject) e.getValue(this, b[0]);
    }

    public static final JSONObject a() {
        a.getClass();
        Context context = Ji.a;
        JSONObject jSONObject = null;
        if (context != null) {
            if (d == null) {
                d = new C3403zg(context, "pub_signals_store");
            }
            C3403zg c3403zg = d;
            if (c3403zg == null) {
                Intrinsics.preprohormone("prefDao");
                c3403zg = null;
            }
            String strA = c3403zg.a("saved_signals");
            if (strA != null) {
                jSONObject = new JSONObject(strA);
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static void a(Map signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        try {
            SignalsConfig.PublisherConfig publisherConfigC = c();
            Map map = Pg.a;
            Intrinsics.checkNotNullParameter(publisherConfigC, "<this>");
            if (!publisherConfigC.getEnableMCO() && !publisherConfigC.getEnableAB()) {
                Kb.a((byte) 1, "PubSignals", "Publisher signals are disabled from InMobi");
                return;
            }
            cutely.wireman(A9.e, null, null, new Mg(signals, publisherConfigC, null), 3, null);
        } catch (Exception e2) {
            taiyuan taiyuanVar = P9.a;
            P9.a(new L2(e2));
            Kb.a((byte) 1, "PubSignals", "Publisher signals could not be saved due to an Internal Error.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(JSONObject jSONObject, ContinuationImpl continuationImpl) {
        Ng ng;
        JSONObject jSONObject2;
        attabal attabalVar;
        if (continuationImpl instanceof Ng) {
            ng = (Ng) continuationImpl;
            int i = ng.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ng.e = i - Integer.MIN_VALUE;
            } else {
                ng = new Ng(this, continuationImpl);
            }
        } else {
            ng = new Ng(this, continuationImpl);
        }
        Object obj = ng.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ng.e;
        try {
            if (i2 == 0) {
                dern.saneness(obj);
                Context context = Ji.a;
                if (context != null) {
                    a.getClass();
                    if (d == null) {
                        d = new C3403zg(context, "pub_signals_store");
                    }
                    attabal attabalVar2 = g;
                    ng.a = jSONObject;
                    ng.b = attabalVar2;
                    ng.e = 1;
                    if (attabalVar2.attabal(null, ng) == objBeachfront) {
                        return objBeachfront;
                    }
                    jSONObject2 = jSONObject;
                    attabalVar = attabalVar2;
                }
                return Unit.f29295attabal;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = ng.b;
            jSONObject2 = ng.a;
            dern.saneness(obj);
            C3403zg c3403zg = d;
            if (c3403zg == null) {
                Intrinsics.preprohormone("prefDao");
                c3403zg = null;
            }
            String value = jSONObject2.toString();
            Intrinsics.checkNotNullExpressionValue(value, "toString(...)");
            c3403zg.getClass();
            Intrinsics.checkNotNullParameter("saved_signals", com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter(value, "value");
            c3403zg.a.a("saved_signals", value, true);
            Unit unit = Unit.f29295attabal;
            attabalVar.wireman(null);
            I1 i1 = e;
            i1.c = i1.a.invoke();
            Kb.a((byte) 2, "PubSignals", "Publisher Signals saved successfully.");
            jSONObject2.toString();
            return Unit.f29295attabal;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }

    public static void a(JSONObject jSONObject, String key, JSONArray value) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        jSONObject.put(key, value);
        Context context = Ji.a;
        if (context != null) {
            a.getClass();
            if (d == null) {
                d = new C3403zg(context, "pub_signals_store");
            }
            jSONObject.toString();
            C3403zg c3403zg = d;
            if (c3403zg == null) {
                Intrinsics.preprohormone("prefDao");
                c3403zg = null;
            }
            String value2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(value2, "toString(...)");
            c3403zg.getClass();
            Intrinsics.checkNotNullParameter("imp_depth", com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter(value2, "value");
            Ea ea = c3403zg.a;
            ConcurrentHashMap concurrentHashMap = Ea.b;
            ea.a("imp_depth", value2, false);
            I1 i1 = f;
            i1.c = i1.a.invoke();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    public final void a(String adFormat, String key) throws JSONException {
        int i;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(key, "key");
        I1 i1 = f;
        i1.c = i1.a.invoke();
        JSONObject jSONObject = (JSONObject) i1.getValue(this, b[1]);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(key);
        if (jSONArrayOptJSONArray == null) {
            Map map = Pg.a;
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(0);
            jSONArrayOptJSONArray.put(0);
            jSONArrayOptJSONArray.put(0);
            jSONArrayOptJSONArray.put(0);
        }
        int iHashCode = adFormat.hashCode();
        if (iHashCode != 97295) {
            if (iHashCode != 104431) {
                if (iHashCode != 108833) {
                    if (iHashCode == 112804 && adFormat.equals("rew")) {
                        i = 2;
                    } else {
                        i = -1;
                    }
                } else if (adFormat.equals("nat")) {
                    i = 3;
                } else {
                    i = -1;
                }
            } else if (adFormat.equals("int")) {
                i = 1;
            } else {
                i = -1;
            }
        } else if (adFormat.equals("ban")) {
            i = 0;
        } else {
            i = -1;
        }
        if (i != -1) {
            jSONArrayOptJSONArray.put(i, jSONArrayOptJSONArray.optInt(i, 0) + 1);
            a(jSONObject, key, jSONArrayOptJSONArray);
        }
    }
}
