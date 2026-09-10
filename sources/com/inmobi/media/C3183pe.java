package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.appset.AppSetIdInfo;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.RootConfig;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.p004ironsource.ko;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3183pe extends N9 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f23899A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f23900B;
    public Map C;
    public final RootConfig y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AdConfig f23901z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3183pe(C3262ue uidMap, A5 a5, RootConfig rootConfig, AdConfig adConfig) {
        super(ko.f25535b, (String) null, uidMap, false, (InterfaceC3333z5) a5, com.smartdigimkt.o0.b.f37293e, 64);
        Intrinsics.f(uidMap, "uidMap");
        Intrinsics.f(rootConfig, "rootConfig");
        Intrinsics.f(adConfig, "adConfig");
        this.y = rootConfig;
        this.f23901z = adConfig;
        this.f23899A = "pe";
        this.m = Uc.b();
        this.t = true;
        this.f23014u = true;
        this.o = Uc.o();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:104:0x0204  */
    /* JADX WARN: Code duplicated, block: B:106:0x021b  */
    /* JADX WARN: Code duplicated, block: B:109:0x022d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0238 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x023a  */
    /* JADX WARN: Code duplicated, block: B:114:0x024d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0266  */
    /* JADX WARN: Code duplicated, block: B:119:0x027b  */
    /* JADX WARN: Code duplicated, block: B:122:0x029e  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:128:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:131:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:140:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:143:0x0300  */
    /* JADX WARN: Code duplicated, block: B:146:0x030d  */
    /* JADX WARN: Code duplicated, block: B:149:0x031a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0327  */
    /* JADX WARN: Code duplicated, block: B:155:0x0334  */
    /* JADX WARN: Code duplicated, block: B:164:0x0372  */
    /* JADX WARN: Code duplicated, block: B:166:0x038d  */
    /* JADX WARN: Code duplicated, block: B:167:0x039e  */
    /* JADX WARN: Code duplicated, block: B:171:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:173:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:176:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:44:0x011b  */
    /* JADX WARN: Code duplicated, block: B:45:0x011e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0121  */
    /* JADX WARN: Code duplicated, block: B:48:0x0126  */
    /* JADX WARN: Code duplicated, block: B:54:0x0132  */
    /* JADX WARN: Code duplicated, block: B:56:0x0135  */
    /* JADX WARN: Code duplicated, block: B:59:0x0149  */
    /* JADX WARN: Code duplicated, block: B:60:0x014f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0152  */
    /* JADX WARN: Code duplicated, block: B:73:0x017d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0196  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01af  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ec  */
    @Override // com.inmobi.media.N9
    public final void f() {
        boolean zBooleanValue;
        String str;
        String str2;
        String str3;
        Map map;
        Config configA;
        SignalsConfig signalsConfig;
        JSONObject ext;
        boolean z2;
        LinkedHashMap linkedHashMap;
        String str4;
        boolean z3;
        String strValueOf;
        SignalsConfig signalsConfig2;
        boolean z4;
        Context contextD;
        Map map2;
        Lazy lazy;
        JSONObject jSONObjectA;
        Pair<String, String> pairI;
        Pair<String, String> pairK;
        Pair<String, String> pairC;
        Pair<String, String> pairF;
        Pair<String, String> pairT;
        Pair<String, String> pairD;
        Pair<String, String> pairU;
        Pair<String, String> pairG;
        Pair<String, String> pairH;
        Pair<String, String> pairB;
        Pair<String, String> pairJ;
        JSONObject jSONObjectB;
        Context contextD2;
        int i2;
        AppSetIdInfo appSetIdInfo;
        Z9 z9;
        InterfaceC3333z5 interfaceC3333z5;
        X9 x9;
        JSONObject jSONObject;
        SignalsConfig.PublisherConfig publisher;
        Context contextD3;
        String packageName;
        String strR;
        SharedPreferences sharedPreferences;
        String strE;
        super.f();
        HashMap map3 = this.k;
        if (map3 != null) {
            Boolean bool = AbstractC2936ab.f23444b;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                Context contextD4 = Uc.d();
                if (contextD4 != null) {
                    ConcurrentHashMap concurrentHashMap = C6.f22734b;
                    AbstractC2936ab.f23444b = Boolean.valueOf(B6.a(contextD4, "user_info_store").f22735a.getBoolean("user_age_restricted", false));
                }
                Boolean bool2 = AbstractC2936ab.f23444b;
                zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
            }
            if (!zBooleanValue) {
                if (CollectionsKt.o(this.y.getIpAddrTPSupport(), Vc.d())) {
                    Intrinsics.c(I5.f22884c);
                    str = I5.f22883b;
                    if (str == null || str.length() == 0) {
                        String TAG = this.f23899A;
                        Intrinsics.e(TAG, "TAG");
                    }
                } else {
                    String TAG2 = this.f23899A;
                    Intrinsics.e(TAG2, "TAG");
                    Objects.toString(this.y.getIpAddrTPSupport());
                    Vc.d();
                }
                if (str != null) {
                }
                Ae aeA = AbstractC3342ze.a();
                str2 = aeA.f22703a;
                if (str2 != null) {
                }
                map3.put("is-unifid-service-used", String.valueOf(aeA.f22704b));
                map3.putAll(X6.f23341a.b());
                map3.putAll(Y4.a());
                map3.put("d-media-volume", String.valueOf(L3.f22938a.a(Uc.d(), this.o)));
                a(map3);
                str3 = this.f23900B;
                if (str3 != null) {
                }
                HashMap map4 = new HashMap();
                map4.putAll(F2.f22806a);
                map3.putAll(map4);
                map = this.C;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!map3.containsKey(entry.getKey())) {
                            map3.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                LinkedHashMap linkedHashMap2 = O2.f23027a;
                configA = M2.a("signals", this.m, null);
                if (configA instanceof SignalsConfig) {
                    signalsConfig = (SignalsConfig) configA;
                } else {
                    signalsConfig = null;
                }
                if (signalsConfig != null) {
                    ext = signalsConfig.getExt();
                } else {
                    ext = null;
                }
                if (ext != null || ext.length() <= 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    map3.put("im-ext", String.valueOf(ext));
                }
                String str5 = C2987db.f23526a;
                linkedHashMap = new LinkedHashMap();
                str4 = C2987db.f23526a;
                if (str4 != null) {
                    linkedHashMap.put("u-nip", str4);
                } else {
                    linkedHashMap = null;
                }
                if (linkedHashMap != null) {
                    map3.putAll(linkedHashMap);
                }
                if (Build.VERSION.SDK_INT >= 29 && (strE = U3.e()) != null) {
                }
                if (this.f23901z.getCctEnabled() || AbstractC3299x3.a(Uc.d()) == null) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                map3.put("cct-enabled", String.valueOf(z3));
                map3.putAll(AbstractC2936ab.a());
                if (Uc.d() != null) {
                    contextD3 = Uc.d();
                    StringBuilder sb = new StringBuilder();
                    if (contextD3 != null) {
                        packageName = contextD3.getPackageName();
                    } else {
                        packageName = null;
                    }
                    strR = android.support.v4.media.a.r(sb, packageName, "_preferences");
                    if (contextD3 != null) {
                        sharedPreferences = contextD3.getSharedPreferences(strR, 0);
                    } else {
                        sharedPreferences = null;
                    }
                    if (sharedPreferences == null && sharedPreferences.contains("IABGPP_HDR_GppString")) {
                        strValueOf = String.valueOf(sharedPreferences.getString("IABGPP_HDR_GppString", ""));
                    } else {
                        strValueOf = "";
                    }
                } else {
                    strValueOf = "";
                }
                if (B2.a(strValueOf)) {
                    map3.put("gpp", strValueOf);
                }
                map3.putAll(U3.c());
                map3.putAll(AbstractC3043h2.a());
                Config configA2 = M2.a("signals", this.m, null);
                signalsConfig2 = configA2 instanceof SignalsConfig ? (SignalsConfig) configA2 : null;
                if (signalsConfig2 == null && (publisher = signalsConfig2.getPublisher()) != null && publisher.getEnableAB()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    Ya ya = Ya.f23374a;
                    ya.getClass();
                    jSONObject = (JSONObject) Ya.d.getValue(ya, Ya.f23375b[0]);
                    if (jSONObject.length() > 0) {
                        String string = jSONObject.toString();
                        Intrinsics.e(string, "toString(...)");
                        map3.put(com.ironsource.d9.h.l0, string);
                    }
                }
                contextD = Uc.d();
                if (contextD != null) {
                    interfaceC3333z5 = this.f23008e;
                    z9 = new Z9(contextD, interfaceC3333z5);
                    if (z9.d) {
                        x9 = new X9(MapsKt.g(new Pair("n-h-id", z9.f23409c)));
                    } else {
                        if (interfaceC3333z5 != null) {
                            ((A5) interfaceC3333z5).a("NovatiqDataHandler", "Novatiq disabled. skip");
                        }
                        x9 = new X9(EmptyMap.X);
                    }
                    map2 = x9.f23346a;
                } else {
                    map2 = EmptyMap.X;
                }
                map3.putAll(map2);
                lazy = C3009f0.f23596c;
                if (!((CopyOnWriteArrayList) lazy.getX()).isEmpty()) {
                    String string2 = new JSONArray((Collection) lazy.getX()).toString();
                    Intrinsics.e(string2, "toString(...)");
                    map3.put("u-r-crid", string2);
                }
                jSONObjectA = C3269v5.f24048c.a();
                if (jSONObjectA.length() > 0) {
                    String string3 = jSONObjectA.toString();
                    Intrinsics.e(string3, "toString(...)");
                    map3.put("audioObject", string3);
                }
                L3 l3 = L3.f22938a;
                pairI = l3.i();
                if (pairI != null) {
                    map3.put(pairI.X, pairI.f43249Y);
                }
                pairK = l3.k();
                if (pairK != null) {
                    map3.put(pairK.X, pairK.f43249Y);
                }
                pairC = l3.c();
                if (pairC != null) {
                    map3.put(pairC.X, pairC.f43249Y);
                }
                pairF = l3.f();
                if (pairF != null) {
                    map3.put(pairF.X, pairF.f43249Y);
                }
                pairT = l3.t();
                if (pairT != null) {
                    map3.put(pairT.X, pairT.f43249Y);
                }
                pairD = l3.d();
                if (pairD != null) {
                    map3.put(pairD.X, pairD.f43249Y);
                }
                pairU = l3.u();
                if (pairU != null) {
                    map3.put(pairU.X, pairU.f43249Y);
                }
                pairG = l3.g();
                if (pairG != null) {
                    map3.put(pairG.X, pairG.f43249Y);
                }
                pairH = l3.h();
                if (pairH != null) {
                    map3.put(pairH.X, pairH.f43249Y);
                }
                pairB = l3.b();
                if (pairB != null) {
                    map3.put(pairB.X, pairB.f43249Y);
                }
                pairJ = l3.j();
                if (pairJ != null) {
                    map3.put(pairJ.X, pairJ.f43249Y);
                }
                if (AbstractC3026g1.a() && (appSetIdInfo = AbstractC3026g1.f23620a) != null) {
                    String id = appSetIdInfo.getId();
                    Intrinsics.e(id, "getId(...)");
                    map3.put("d-app-set-id", id);
                }
                if (C3044h3.d()) {
                    map3.put("ik", C3044h3.g);
                    map3.put("c_data", C3044h3.c());
                    StringBuilder sb2 = new StringBuilder("");
                    contextD2 = Uc.d();
                    if (contextD2 != null) {
                        ConcurrentHashMap concurrentHashMap2 = C6.f22734b;
                        i2 = B6.a(contextD2, "c_data_store").f22735a.getInt("akv", 1);
                    } else {
                        i2 = 1;
                    }
                    sb2.append(i2);
                    map3.put("aKV", sb2.toString());
                }
                jSONObjectB = Zc.f23411a.b();
                if (jSONObjectB.length() > 0) {
                    String string4 = jSONObjectB.toString();
                    Intrinsics.e(string4, "toString(...)");
                    map3.put("sData", string4);
                }
            }
            String TAG3 = this.f23899A;
            Intrinsics.e(TAG3, "TAG");
            str = null;
            if (str != null) {
            }
            Ae aeA2 = AbstractC3342ze.a();
            str2 = aeA2.f22703a;
            if (str2 != null) {
            }
            map3.put("is-unifid-service-used", String.valueOf(aeA2.f22704b));
            map3.putAll(X6.f23341a.b());
            map3.putAll(Y4.a());
            map3.put("d-media-volume", String.valueOf(L3.f22938a.a(Uc.d(), this.o)));
            a(map3);
            str3 = this.f23900B;
            if (str3 != null) {
            }
            HashMap map5 = new HashMap();
            map5.putAll(F2.f22806a);
            map3.putAll(map5);
            map = this.C;
            if (map != null) {
                while (r1.hasNext()) {
                    if (!map3.containsKey(entry.getKey())) {
                        map3.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            LinkedHashMap linkedHashMap3 = O2.f23027a;
            configA = M2.a("signals", this.m, null);
            if (configA instanceof SignalsConfig) {
                signalsConfig = (SignalsConfig) configA;
            } else {
                signalsConfig = null;
            }
            if (signalsConfig != null) {
                ext = signalsConfig.getExt();
            } else {
                ext = null;
            }
            if (ext != null) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (z2) {
                map3.put("im-ext", String.valueOf(ext));
            }
            String str6 = C2987db.f23526a;
            linkedHashMap = new LinkedHashMap();
            str4 = C2987db.f23526a;
            if (str4 != null) {
                linkedHashMap.put("u-nip", str4);
            } else {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                map3.putAll(linkedHashMap);
            }
            if (Build.VERSION.SDK_INT >= 29) {
            }
            if (this.f23901z.getCctEnabled()) {
                z3 = false;
            } else {
                z3 = false;
            }
            map3.put("cct-enabled", String.valueOf(z3));
            map3.putAll(AbstractC2936ab.a());
            if (Uc.d() != null) {
                contextD3 = Uc.d();
                StringBuilder sb3 = new StringBuilder();
                if (contextD3 != null) {
                    packageName = contextD3.getPackageName();
                } else {
                    packageName = null;
                }
                strR = android.support.v4.media.a.r(sb3, packageName, "_preferences");
                if (contextD3 != null) {
                    sharedPreferences = contextD3.getSharedPreferences(strR, 0);
                } else {
                    sharedPreferences = null;
                }
                if (sharedPreferences == null) {
                    strValueOf = "";
                } else {
                    strValueOf = "";
                }
            } else {
                strValueOf = "";
            }
            if (B2.a(strValueOf)) {
                map3.put("gpp", strValueOf);
            }
            map3.putAll(U3.c());
            map3.putAll(AbstractC3043h2.a());
            Config configA3 = M2.a("signals", this.m, null);
            if (configA3 instanceof SignalsConfig) {
            }
            if (signalsConfig2 == null) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (z4) {
                Ya ya2 = Ya.f23374a;
                ya2.getClass();
                jSONObject = (JSONObject) Ya.d.getValue(ya2, Ya.f23375b[0]);
                if (jSONObject.length() > 0) {
                    String string5 = jSONObject.toString();
                    Intrinsics.e(string5, "toString(...)");
                    map3.put(com.ironsource.d9.h.l0, string5);
                }
            }
            contextD = Uc.d();
            if (contextD != null) {
                interfaceC3333z5 = this.f23008e;
                z9 = new Z9(contextD, interfaceC3333z5);
                if (z9.d) {
                    if (interfaceC3333z5 != null) {
                        ((A5) interfaceC3333z5).a("NovatiqDataHandler", "Novatiq disabled. skip");
                    }
                    x9 = new X9(EmptyMap.X);
                } else {
                    x9 = new X9(MapsKt.g(new Pair("n-h-id", z9.f23409c)));
                }
                map2 = x9.f23346a;
            } else {
                map2 = EmptyMap.X;
            }
            map3.putAll(map2);
            lazy = C3009f0.f23596c;
            if (!((CopyOnWriteArrayList) lazy.getX()).isEmpty()) {
                String string6 = new JSONArray((Collection) lazy.getX()).toString();
                Intrinsics.e(string6, "toString(...)");
                map3.put("u-r-crid", string6);
            }
            jSONObjectA = C3269v5.f24048c.a();
            if (jSONObjectA.length() > 0) {
                String string7 = jSONObjectA.toString();
                Intrinsics.e(string7, "toString(...)");
                map3.put("audioObject", string7);
            }
            L3 l4 = L3.f22938a;
            pairI = l4.i();
            if (pairI != null) {
                map3.put(pairI.X, pairI.f43249Y);
            }
            pairK = l4.k();
            if (pairK != null) {
                map3.put(pairK.X, pairK.f43249Y);
            }
            pairC = l4.c();
            if (pairC != null) {
                map3.put(pairC.X, pairC.f43249Y);
            }
            pairF = l4.f();
            if (pairF != null) {
                map3.put(pairF.X, pairF.f43249Y);
            }
            pairT = l4.t();
            if (pairT != null) {
                map3.put(pairT.X, pairT.f43249Y);
            }
            pairD = l4.d();
            if (pairD != null) {
                map3.put(pairD.X, pairD.f43249Y);
            }
            pairU = l4.u();
            if (pairU != null) {
                map3.put(pairU.X, pairU.f43249Y);
            }
            pairG = l4.g();
            if (pairG != null) {
                map3.put(pairG.X, pairG.f43249Y);
            }
            pairH = l4.h();
            if (pairH != null) {
                map3.put(pairH.X, pairH.f43249Y);
            }
            pairB = l4.b();
            if (pairB != null) {
                map3.put(pairB.X, pairB.f43249Y);
            }
            pairJ = l4.j();
            if (pairJ != null) {
                map3.put(pairJ.X, pairJ.f43249Y);
            }
            if (AbstractC3026g1.a()) {
                String id2 = appSetIdInfo.getId();
                Intrinsics.e(id2, "getId(...)");
                map3.put("d-app-set-id", id2);
            }
            if (C3044h3.d()) {
                map3.put("ik", C3044h3.g);
                map3.put("c_data", C3044h3.c());
                StringBuilder sb4 = new StringBuilder("");
                contextD2 = Uc.d();
                if (contextD2 != null) {
                    ConcurrentHashMap concurrentHashMap3 = C6.f22734b;
                    i2 = B6.a(contextD2, "c_data_store").f22735a.getInt("akv", 1);
                } else {
                    i2 = 1;
                }
                sb4.append(i2);
                map3.put("aKV", sb4.toString());
            }
            jSONObjectB = Zc.f23411a.b();
            if (jSONObjectB.length() > 0) {
                String string8 = jSONObjectB.toString();
                Intrinsics.e(string8, "toString(...)");
                map3.put("sData", string8);
            }
        }
    }
}
