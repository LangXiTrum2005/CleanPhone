package com.inmobi.media;

import android.os.Build;
import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S0 f22708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S0 f22709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z f22710c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22711e;
    public InterfaceC3333z5 f;
    public final A0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3328z0 f22712h;

    public B0(S0 mAdStoreListener, S0 mTelemetryListener, Z mAdPlacement) {
        Intrinsics.f(mAdStoreListener, "mAdStoreListener");
        Intrinsics.f(mTelemetryListener, "mTelemetryListener");
        Intrinsics.f(mAdPlacement, "mAdPlacement");
        this.f22708a = mAdStoreListener;
        this.f22709b = mTelemetryListener;
        this.f22710c = mAdPlacement;
        this.d = "B0";
        this.g = new A0(this);
        this.f22712h = new C3328z0(this);
    }

    public final C3312y0 a(T networkRequest, Integer num) {
        V v;
        Intrinsics.f(networkRequest, "networkRequest");
        if (num != null) {
            if (SystemClock.elapsedRealtime() - this.f22711e < num.intValue() * 1000) {
                throw new K(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST), (short) 2009);
            }
        }
        Map map = networkRequest.D;
        if (map == null) {
            map = new HashMap();
        }
        networkRequest.D = map;
        this.f22711e = SystemClock.elapsedRealtime();
        try {
            P9 p9B = networkRequest.b();
            v = new V(p9B);
            try {
                p9B.b();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            v = null;
        }
        I9 i9 = v != null ? v.f23286a.d : null;
        if (v == null) {
            a(MapsKt.l(new Pair("errorCode", (short) 2108)));
            throw new K(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
        }
        if (i9 != null) {
            a(MapsKt.l(new Pair("errorCode", i9.f22886a.toString())));
            InMobiAdRequestStatus inMobiAdRequestStatus = v.f23287b;
            if (inMobiAdRequestStatus == null) {
                return null;
            }
            throw new K(inMobiAdRequestStatus, (short) 0);
        }
        this.f22708a.g0();
        try {
            return a(new JSONObject(v.f23286a.a()));
        } catch (JSONException e2) {
            a(MapsKt.l(new Pair("errorCode", (short) 2113)));
            InterfaceC3333z5 interfaceC3333z5 = this.f;
            if (interfaceC3333z5 != null) {
                String TAG = this.d;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).a(TAG, "Error while parsing ad response.", e2);
            }
            throw new K(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
        }
    }

    public static String a() throws JSONException {
        String strB = Uc.b();
        if (strB == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        LinkedHashMap linkedHashMap = O2.f23027a;
        jSONObject.put("root", M2.a("root", strB, null).getLastUpdateTimeStamp());
        jSONObject.put("ads", M2.a("ads", strB, null).getLastUpdateTimeStamp());
        jSONObject.put("telemetry", M2.a("telemetry", strB, null).getLastUpdateTimeStamp());
        jSONObject.put("crashReporting", M2.a("crashReporting", strB, null).getLastUpdateTimeStamp());
        jSONObject.put("signals", M2.a("signals", strB, null).getLastUpdateTimeStamp());
        return jSONObject.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    public final C3312y0 a(JSONObject jSONObject) throws Throwable {
        ?? r16;
        Object obj;
        ?? r17;
        C3312y0 c3312y0A;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        InterfaceC3333z5 interfaceC3333z5;
        try {
            InterfaceC3333z5 interfaceC3333z6 = this.f;
            if (interfaceC3333z6 != null) {
                String TAG = this.d;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z6).c(TAG, "response - " + jSONObject);
            }
            JSONArray jSONArray3 = jSONObject.getJSONArray("adSets");
            Intrinsics.e(jSONArray3, "getJSONArray(...)");
            if (B2.a(jSONArray3)) {
                r17 = "networkType";
                obj = "adType";
            } else {
                JSONObject jSONObject2 = jSONObject.getJSONArray("adSets").getJSONObject(0);
                InterfaceC3333z5 interfaceC3333z7 = this.f;
                if (interfaceC3333z7 != null) {
                    String strOptString = jSONObject.optString(C3312y0.KEY_REQUEST_ID);
                    Intrinsics.e(strOptString, "optString(...)");
                    ((A5) interfaceC3333z7).e("requestID", strOptString);
                }
                InterfaceC3333z5 interfaceC3333z8 = this.f;
                if (interfaceC3333z8 != null) {
                    String strOptString2 = jSONObject.optString("placementId");
                    Intrinsics.e(strOptString2, "optString(...)");
                    ((A5) interfaceC3333z8).e("placementID", strOptString2);
                }
                InterfaceC3333z5 interfaceC3333z9 = this.f;
                if (interfaceC3333z9 != null) {
                    ((A5) interfaceC3333z9).e("adType", String.valueOf(this.f22710c.b()));
                }
                InterfaceC3333z5 interfaceC3333z10 = this.f;
                if (interfaceC3333z10 != null) {
                    ((A5) interfaceC3333z10).e("placementType", String.valueOf(this.f22710c.m()));
                }
                InterfaceC3333z5 interfaceC3333z11 = this.f;
                if (interfaceC3333z11 != null) {
                    ((A5) interfaceC3333z11).e("bundleID", String.valueOf(C2994e1.f23537a));
                }
                InterfaceC3333z5 interfaceC3333z12 = this.f;
                if (interfaceC3333z12 != null) {
                    ((A5) interfaceC3333z12).e(com.ironsource.d9.i.f24756n, (String) L3.f22938a.c().f43249Y);
                }
                InterfaceC3333z5 interfaceC3333z13 = this.f;
                if (interfaceC3333z13 != null) {
                    ((A5) interfaceC3333z13).e("networkType", L3.q());
                }
                InterfaceC3333z5 interfaceC3333z14 = this.f;
                if (interfaceC3333z14 != null) {
                    String MODEL = Build.MODEL;
                    Intrinsics.e(MODEL, "MODEL");
                    ((A5) interfaceC3333z14).e(com.ironsource.d9.i.f24755l, MODEL);
                }
                InterfaceC3333z5 interfaceC3333z15 = this.f;
                if (interfaceC3333z15 != null) {
                    ((A5) interfaceC3333z15).e("publisherID", String.valueOf(Uc.b()));
                }
                InterfaceC3333z5 interfaceC3333z16 = this.f;
                if (interfaceC3333z16 != null) {
                    ((A5) interfaceC3333z16).e("sdkAdPod", String.valueOf(jSONObject2.optBoolean("isPod")));
                }
                InterfaceC3333z5 interfaceC3333z17 = this.f;
                if (interfaceC3333z17 != null) {
                    ((A5) interfaceC3333z17).e("sdkVersion", "10.8.7");
                }
                InterfaceC3333z5 interfaceC3333z18 = this.f;
                if (interfaceC3333z18 != null) {
                    ((A5) interfaceC3333z18).e("tpName", String.valueOf(Vc.d()));
                }
                InterfaceC3333z5 interfaceC3333z19 = this.f;
                if (interfaceC3333z19 != null) {
                    ((A5) interfaceC3333z19).e("tpVersion", String.valueOf(Vc.f()));
                }
                InterfaceC3333z5 interfaceC3333z20 = this.f;
                if (interfaceC3333z20 != null) {
                    ((A5) interfaceC3333z20).e("source", "sdk_android");
                }
                InterfaceC3333z5 interfaceC3333z21 = this.f;
                if (interfaceC3333z21 != null) {
                    ((A5) interfaceC3333z21).e("mkVersion", Vc.a());
                }
                InterfaceC3333z5 interfaceC3333z22 = this.f;
                if (interfaceC3333z22 != null) {
                    ((A5) interfaceC3333z22).e("isServerSideLogging", String.valueOf(jSONObject2.optBoolean("logEnabled", false)));
                }
                InterfaceC3333z5 interfaceC3333z23 = this.f;
                if (interfaceC3333z23 != null) {
                    String strOptString3 = jSONObject2.optString("transactionId", "Not Set");
                    Intrinsics.e(strOptString3, "optString(...)");
                    ((A5) interfaceC3333z23).e("transactionID", strOptString3);
                }
                InterfaceC3333z5 interfaceC3333z24 = this.f;
                if (interfaceC3333z24 != null) {
                    ((A5) interfaceC3333z24).e("webViewUserAgent", Uc.k());
                }
                String strA = a();
                if (strA != null && (interfaceC3333z5 = this.f) != null) {
                    ((A5) interfaceC3333z5).e("configData", strA);
                }
                boolean zOptBoolean = jSONObject2.optBoolean("isPod");
                obj = "adType";
                try {
                    if (zOptBoolean) {
                        try {
                            ArrayList arrayList = new ArrayList();
                            Object obj2 = "networkType";
                            ArrayList arrayList2 = new ArrayList();
                            if (jSONObject2.has("ads") && (jSONArray = jSONObject2.getJSONArray("ads")) != null && !B2.a(jSONArray)) {
                                JSONArray jSONArray4 = jSONObject2.getJSONArray("ads");
                                int i2 = 0;
                                for (int length = jSONArray4.length(); i2 < length; length = length) {
                                    arrayList.add(i2, jSONArray4.getJSONObject(i2).optString("creativeId"));
                                    arrayList2.add(i2, jSONArray4.getJSONObject(i2).optString("impressionId"));
                                    i2++;
                                }
                                InterfaceC3333z5 interfaceC3333z25 = this.f;
                                if (interfaceC3333z25 != null) {
                                    ((A5) interfaceC3333z25).e("creativeID", CollectionsKt.D(arrayList, " , ", null, null, null, 62));
                                }
                                InterfaceC3333z5 interfaceC3333z26 = this.f;
                                r17 = obj2;
                                if (interfaceC3333z26 != null) {
                                    ((A5) interfaceC3333z26).e("impressionID", CollectionsKt.D(arrayList2, " , ", null, null, null, 62));
                                    r17 = obj2;
                                }
                            } else {
                                InterfaceC3333z5 interfaceC3333z27 = this.f;
                                r17 = obj2;
                                if (interfaceC3333z27 != null) {
                                    String TAG2 = this.d;
                                    Intrinsics.e(TAG2, "TAG");
                                    ((A5) interfaceC3333z27).b(TAG2, "no ads. cannot update vitals");
                                    r17 = obj2;
                                }
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            r16 = "networkType";
                            InterfaceC3333z5 interfaceC3333z28 = this.f;
                            r17 = r16;
                            if (interfaceC3333z28 != null) {
                                String TAG3 = this.d;
                                Intrinsics.e(TAG3, "TAG");
                                ((A5) interfaceC3333z28).a(TAG3, "error while update vitals", e);
                                r17 = r16;
                            }
                        }
                    } else {
                        Object obj3 = "networkType";
                        if (jSONObject2.has("ads") && (jSONArray2 = jSONObject2.getJSONArray("ads")) != null && !B2.a(jSONArray2)) {
                            InterfaceC3333z5 interfaceC3333z29 = this.f;
                            if (interfaceC3333z29 != null) {
                                String strOptString4 = jSONObject2.getJSONArray("ads").getJSONObject(0).optString("creativeId");
                                Intrinsics.e(strOptString4, "optString(...)");
                                ((A5) interfaceC3333z29).e("creativeID", strOptString4);
                            }
                            InterfaceC3333z5 interfaceC3333z30 = this.f;
                            r17 = obj3;
                            if (interfaceC3333z30 != null) {
                                String strOptString5 = jSONObject2.getJSONArray("ads").getJSONObject(0).optString("impressionId");
                                Intrinsics.e(strOptString5, "optString(...)");
                                ((A5) interfaceC3333z30).e("impressionID", strOptString5);
                                r17 = obj3;
                            }
                        } else {
                            InterfaceC3333z5 interfaceC3333z31 = this.f;
                            r17 = obj3;
                            if (interfaceC3333z31 != null) {
                                String TAG4 = this.d;
                                Intrinsics.e(TAG4, "TAG");
                                ((A5) interfaceC3333z31).b(TAG4, "no ads. cannot update vitals");
                                r17 = obj3;
                            }
                        }
                    }
                } catch (JSONException e3) {
                    e = e3;
                    r16 = zOptBoolean;
                }
            }
        } catch (JSONException e4) {
            e = e4;
            r16 = "networkType";
            obj = "adType";
        }
        try {
            if (jSONObject.optJSONArray("adSets") != null) {
                boolean zOptBoolean2 = jSONObject.getJSONArray("adSets").getJSONObject(0).optBoolean("logEnabled", false);
                InterfaceC3333z5 interfaceC3333z32 = this.f;
                if (interfaceC3333z32 != null) {
                    String TAG5 = this.d;
                    Intrinsics.e(TAG5, "TAG");
                    ((A5) interfaceC3333z32).a(TAG5, "server side logger lever - " + zOptBoolean2);
                }
                InterfaceC3333z5 interfaceC3333z33 = this.f;
                if (interfaceC3333z33 != null) {
                    ((A5) interfaceC3333z33).a(zOptBoolean2);
                }
            }
        } catch (JSONException e5) {
            InterfaceC3333z5 interfaceC3333z34 = this.f;
            if (interfaceC3333z34 != null) {
                String TAG6 = this.d;
                Intrinsics.e(TAG6, "TAG");
                ((A5) interfaceC3333z34).a(TAG6, "error while setting server-side logging lever", e5);
            }
            InterfaceC3333z5 interfaceC3333z35 = this.f;
            if (interfaceC3333z35 != null) {
                ((A5) interfaceC3333z35).a(false);
            }
        }
        C3312y0 c3312y0 = null;
        try {
            InterfaceC3333z5 interfaceC3333z36 = this.f;
            if (interfaceC3333z36 != null) {
                String TAG7 = this.d;
                Intrinsics.e(TAG7, "TAG");
                ((A5) interfaceC3333z36).c(TAG7, "parseAdResponse called");
            }
            JSONArray jSONArray5 = jSONObject.getJSONArray("adSets");
            String string = jSONObject.getString(C3312y0.KEY_REQUEST_ID);
            if (jSONArray5.length() != 0) {
                InterfaceC3333z5 interfaceC3333z37 = this.f;
                if (interfaceC3333z37 != null) {
                    String TAG8 = this.d;
                    Intrinsics.e(TAG8, "TAG");
                    ((A5) interfaceC3333z37).a(TAG8, "parseAdResponse responses available");
                }
                if (this.f22710c.b() != null) {
                    C3296x0 c3296x0 = C3312y0.Companion;
                    JSONObject jSONObject3 = jSONArray5.getJSONObject(0);
                    Intrinsics.e(jSONObject3, "getJSONObject(...)");
                    long jL = this.f22710c.l();
                    String strB = this.f22710c.b();
                    Intrinsics.c(string);
                    InterfaceC3333z5 interfaceC3333z38 = this.f;
                    c3296x0.getClass();
                    c3312y0A = C3296x0.a(jSONObject3, jL, strB, string, interfaceC3333z38);
                } else {
                    c3312y0A = null;
                }
                if (c3312y0A == null) {
                    InterfaceC3333z5 interfaceC3333z39 = this.f;
                    if (interfaceC3333z39 != null) {
                        String TAG9 = this.d;
                        Intrinsics.e(TAG9, "TAG");
                        ((A5) interfaceC3333z39).b(TAG9, "adSet is null");
                    }
                    a(MapsKt.l(new Pair("errorCode", (short) 2114)));
                    throw new K(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
                }
                c3312y0 = c3312y0A;
                if (c3312y0 == null) {
                    InterfaceC3333z5 interfaceC3333z40 = this.f;
                    if (interfaceC3333z40 != null) {
                        String TAG10 = this.d;
                        Intrinsics.e(TAG10, "TAG");
                        ((A5) interfaceC3333z40).b(TAG10, "Could not parse ad response:" + jSONObject);
                    }
                    a(MapsKt.l(new Pair("errorCode", (short) 2115)));
                    throw new K(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
                }
                if (c3312y0.m()) {
                    if (c3312y0.p() == null) {
                        LinkedHashMap linkedHashMapL = MapsKt.l(new Pair("errorCode", (short) 2116));
                        Boolean boolO = c3312y0.o();
                        if (boolO != null) {
                            linkedHashMapL.put("isRewarded", boolO);
                        }
                        a(linkedHashMapL);
                        throw new K(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
                    }
                    a(c3312y0.o());
                    InterfaceC3333z5 interfaceC3333z41 = this.f;
                    if (interfaceC3333z41 != null) {
                        String TAG11 = this.d;
                        Intrinsics.e(TAG11, "TAG");
                        ((A5) interfaceC3333z41).a(TAG11, "==== CHECKPOINT REACHED - PARSING COMPLETE ====");
                    }
                    InterfaceC3333z5 interfaceC3333z42 = this.f;
                    if (interfaceC3333z42 != null) {
                        ((A5) interfaceC3333z42).b();
                    }
                } else {
                    a(c3312y0.o());
                }
                return c3312y0;
            }
            InterfaceC3333z5 interfaceC3333z43 = this.f;
            if (interfaceC3333z43 != null) {
                String TAG12 = this.d;
                Intrinsics.e(TAG12, "TAG");
                ((A5) interfaceC3333z43).b(TAG12, "Ad response received but no ad available:" + jSONObject);
            }
            LinkedHashMap linkedHashMapL2 = MapsKt.l(new Pair("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f22711e)), new Pair(r17, L3.q()), new Pair("plId", Long.valueOf(this.f22710c.l())));
            String strM = this.f22710c.m();
            if (strM != null) {
                linkedHashMapL2.put("plType", strM);
            }
            String strB2 = this.f22710c.b();
            if (strB2 != null) {
                linkedHashMapL2.put(obj, strB2);
            }
            this.f22709b.b("ServerNoFill", linkedHashMapL2);
            throw new K(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), (short) 0);
        } catch (JSONException e6) {
            InterfaceC3333z5 interfaceC3333z44 = this.f;
            if (interfaceC3333z44 != null) {
                String TAG13 = this.d;
                Intrinsics.e(TAG13, "TAG");
                ((A5) interfaceC3333z44).a(TAG13, "Error while parsing ad response.", e6);
            }
        }
    }

    public final void a(Boolean bool) {
        LinkedHashMap linkedHashMapL = MapsKt.l(new Pair("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f22711e)), new Pair("networkType", L3.q()), new Pair("plId", Long.valueOf(this.f22710c.l())));
        String strM = this.f22710c.m();
        if (strM != null) {
            linkedHashMapL.put("plType", strM);
        }
        if (bool != null) {
            linkedHashMapL.put("isRewarded", bool);
        }
        String strB = this.f22710c.b();
        if (strB != null) {
            linkedHashMapL.put("adType", strB);
        }
        this.f22709b.b("ServerFill", linkedHashMapL);
    }

    public final void a(Map payload) {
        Intrinsics.f(payload, "payload");
        payload.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f22711e));
        String strB = this.f22710c.b();
        if (strB != null) {
            payload.put("adType", strB);
        }
        payload.put("networkType", L3.q());
        payload.put("plId", Long.valueOf(this.f22710c.l()));
        String strM = this.f22710c.m();
        if (strM != null) {
            payload.put("plType", strM);
        }
        this.f22709b.b("ServerError", (Map<String, Object>) payload);
    }
}
