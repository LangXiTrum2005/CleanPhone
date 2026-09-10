package com.inmobi.media;

import com.inmobi.ads.exceptions.VastException;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f22894a = "h";

    public static void a(C3040h ad, JSONObject adJson, String str, long j, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(ad, "ad");
        Intrinsics.f(adJson, "adJson");
        ad.a();
        long jOptLong = adJson.optLong("expiry", TimeUnit.MILLISECONDS.toSeconds(j));
        ad.a(adJson, str, jOptLong <= 0 ? -1L : TimeUnit.SECONDS.toMillis(jOptLong));
        if ("inmobiJson".equals(ad.u())) {
            try {
                JSONObject jSONObject = adJson.getJSONObject("pubContent");
                if (interfaceC3333z5 != null) {
                    String TAG = f22894a;
                    Intrinsics.e(TAG, "TAG");
                    String string = jSONObject.toString();
                    Intrinsics.e(string, "toString(...)");
                    ((A5) interfaceC3333z5).a(TAG, string);
                }
                if (jSONObject.isNull("rootContainer")) {
                    if (interfaceC3333z5 != null) {
                        String TAG2 = f22894a;
                        Intrinsics.e(TAG2, "TAG");
                        ((A5) interfaceC3333z5).b(TAG2, "Missing key (rootContainer) in the ad markup");
                        return;
                    }
                    return;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("rootContainer");
                JSONArray jSONArray = new JSONArray();
                Intrinsics.c(jSONObject2);
                Iterator it = b(jSONObject2, interfaceC3333z5).iterator();
                while (it.hasNext()) {
                    a(jSONArray, (String) it.next(), (byte) 2);
                }
                Iterator it2 = a(jSONObject2, interfaceC3333z5).iterator();
                while (it2.hasNext()) {
                    a(jSONArray, (String) it2.next(), (byte) 1);
                }
                boolean zD = d(jSONObject2, interfaceC3333z5);
                ad.a(jSONArray);
                ad.a(zD);
            } catch (Exception e2) {
                Intrinsics.e(f22894a, "TAG");
                S5 s5 = S5.f23167a;
                S5.d.a(AbstractC3285w5.a(e2, "event"));
            }
        }
    }

    public static ArrayList b(JSONObject jSONObject, InterfaceC3333z5 interfaceC3333z5) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            Intrinsics.c(jSONArray);
            if (!B2.a(jSONArray)) {
                String string = jSONObject.getString("assetType");
                if (com.smartdigimkt.x.d.c.k.equalsIgnoreCase(string)) {
                    if (!jSONObject.isNull("preload") && jSONObject.getBoolean("preload")) {
                        String string2 = jSONArray.getString(0);
                        Intrinsics.e(string2, "getString(...)");
                        arrayList.add(string2);
                        return arrayList;
                    }
                } else if ("container".equalsIgnoreCase(string)) {
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        Intrinsics.c(jSONObject2);
                        arrayList.addAll(b(jSONObject2, interfaceC3333z5));
                    }
                }
            }
        } catch (JSONException e2) {
            if (interfaceC3333z5 != null) {
                String str = f22894a;
                StringBuilder sbA = H6.a(str, "TAG", "Error getting getImageAssetUrls (");
                sbA.append(e2.getMessage());
                sbA.append(')');
                ((A5) interfaceC3333z5).b(str, sbA.toString());
            }
        }
        return arrayList;
    }

    public static String c(JSONObject jSONObject, InterfaceC3333z5 interfaceC3333z5) {
        String string;
        String strC;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            Intrinsics.c(jSONArray);
            if (B2.a(jSONArray)) {
                return "";
            }
            String string2 = jSONObject.getString("assetType");
            if (!"video".equalsIgnoreCase(string2)) {
                if ("container".equalsIgnoreCase(string2)) {
                    int length = jSONArray.length();
                    strC = "";
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        Intrinsics.c(jSONObject2);
                        strC = c(jSONObject2, interfaceC3333z5);
                        int length2 = strC.length() - 1;
                        int i3 = 0;
                        boolean z2 = false;
                        while (i3 <= length2) {
                            boolean z3 = Intrinsics.h(strC.charAt(!z2 ? i3 : length2), 32) <= 0;
                            if (z2) {
                                if (!z3) {
                                    break;
                                }
                                length2--;
                            } else if (z3) {
                                i3++;
                            } else {
                                z2 = true;
                            }
                        }
                        if (strC.subSequence(i3, length2 + 1).toString().length() > 0) {
                            break;
                        }
                    }
                } else {
                    string = "";
                }
                Intrinsics.c(strC);
                return strC;
            }
            string = jSONArray.getString(0);
            strC = string;
            Intrinsics.c(strC);
            return strC;
        } catch (JSONException e2) {
            if (interfaceC3333z5 != null) {
                String str = f22894a;
                StringBuilder sbA = H6.a(str, "TAG", "Error getting VAST video XML (");
                sbA.append(e2.getMessage());
                sbA.append(')');
                ((A5) interfaceC3333z5).b(str, sbA.toString());
            }
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
            return "";
        }
    }

    public static boolean d(JSONObject jSONObject, InterfaceC3333z5 interfaceC3333z5) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            Intrinsics.c(jSONArray);
            if (B2.a(jSONArray)) {
                return false;
            }
            String string = jSONObject.getString("assetType");
            if (com.ironsource.d9.h.K.equalsIgnoreCase(string)) {
                if (!jSONObject.isNull("preload") && jSONObject.getBoolean("preload")) {
                    return true;
                }
            } else if ("container".equalsIgnoreCase(string)) {
                int length = jSONArray.length();
                boolean zD = false;
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    Intrinsics.c(jSONObject2);
                    zD = d(jSONObject2, interfaceC3333z5);
                    if (zD) {
                        return zD;
                    }
                }
                return zD;
            }
            return false;
        } catch (JSONException e2) {
            if (interfaceC3333z5 != null) {
                String str = f22894a;
                StringBuilder sbA = H6.a(str, "TAG", "Error getting preload webview flag (");
                sbA.append(e2.getMessage());
                sbA.append(')');
                ((A5) interfaceC3333z5).b(str, sbA.toString());
            }
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
        }
    }

    public static final C3040h a(C3040h ad, AdConfig adConfig, InterfaceC3333z5 interfaceC3333z5) {
        byte b2;
        int i2;
        int i3;
        char c2;
        int i4;
        Intrinsics.f(ad, "ad");
        Intrinsics.f(adConfig, "adConfig");
        if ("inmobiJson".equals(ad.u())) {
            JSONObject jSONObject = new JSONObject(ad.x());
            JSONObject jSONObject2 = jSONObject.getJSONObject("rootContainer");
            Intrinsics.c(jSONObject2);
            String strC = c(jSONObject2, interfaceC3333z5);
            int length = strC.length() - 1;
            int i5 = 0;
            int i6 = 0;
            boolean z2 = false;
            while (i6 <= length) {
                boolean z3 = Intrinsics.h(strC.charAt(!z2 ? i6 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    }
                    length--;
                } else if (z3) {
                    i6++;
                } else {
                    z2 = true;
                }
            }
            if (strC.subSequence(i6, length + 1).toString().length() != 0) {
                Ue ueA = new Pe(adConfig.getVastVideo(), interfaceC3333z5).a(strC);
                JSONArray jSONArrayK = ad.k();
                if (ueA.f23285l != 0) {
                    if (interfaceC3333z5 != null) {
                        String TAG = f22894a;
                        Intrinsics.e(TAG, "TAG");
                        ((A5) interfaceC3333z5).b(TAG, "Processing VAST XML to build a video descriptor failed");
                    }
                    throw new VastException(ueA.f23285l);
                }
                String strB = ueA.b();
                if (strB != null && strB.length() != 0) {
                    if (jSONArrayK != null) {
                        a(jSONArrayK, strB, (byte) 0);
                    }
                    AdConfig.VastVideoConfig vastVideo = adConfig.getVastVideo();
                    ArrayList<String> arrayList = new ArrayList();
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("pages");
                        b2 = 1;
                        try {
                            int length2 = jSONArray.length();
                            while (i5 < length2) {
                                if (jSONArray.getJSONObject(i5).isNull("rootContainer")) {
                                    i2 = length2;
                                    i3 = i5;
                                    c2 = ' ';
                                } else {
                                    JSONObject jSONObject3 = jSONArray.getJSONObject(i5).getJSONObject("rootContainer");
                                    Intrinsics.e(jSONObject3, "getJSONObject(...)");
                                    String strC2 = c(jSONObject3, interfaceC3333z5);
                                    i2 = length2;
                                    int length3 = strC2.length() - 1;
                                    int i7 = 0;
                                    boolean z4 = false;
                                    while (true) {
                                        i4 = length3;
                                        if (i7 > length3) {
                                            i3 = i5;
                                            c2 = ' ';
                                            break;
                                        }
                                        if (!z4) {
                                            length3 = i7;
                                        }
                                        i3 = i5;
                                        c2 = ' ';
                                        boolean z5 = Intrinsics.h(strC2.charAt(length3), 32) <= 0;
                                        if (!z4) {
                                            if (z5) {
                                                i7++;
                                            } else {
                                                z4 = true;
                                            }
                                            length3 = i4;
                                        } else {
                                            if (!z5) {
                                                break;
                                            }
                                            length3 = i4 - 1;
                                        }
                                        i5 = i3;
                                    }
                                    if (strC2.subSequence(i7, i4 + 1).toString().length() != 0) {
                                        Ue ueA2 = new Pe(vastVideo, interfaceC3333z5).a(strC2);
                                        if (ueA2.f23285l == 0) {
                                            String strB2 = ueA2.b();
                                            if (strB2 != null && !arrayList.isEmpty()) {
                                                arrayList.add(strB2);
                                            }
                                        } else if (interfaceC3333z5 != null) {
                                            String TAG2 = f22894a;
                                            Intrinsics.e(TAG2, "TAG");
                                            ((A5) interfaceC3333z5).b(TAG2, "No video present of error for video descriptor in pages array");
                                        }
                                    } else if (interfaceC3333z5 != null) {
                                        String TAG3 = f22894a;
                                        Intrinsics.e(TAG3, "TAG");
                                        ((A5) interfaceC3333z5).b(TAG3, "Missing VAST video XML in the ad markup");
                                    }
                                }
                                length2 = i2;
                                i5 = i3 + 1;
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            if (interfaceC3333z5 != null) {
                                String TAG4 = f22894a;
                                Intrinsics.e(TAG4, "TAG");
                                ((A5) interfaceC3333z5).a(TAG4, "JSONException in getPagesVideo", e);
                            }
                        }
                    } catch (JSONException e3) {
                        e = e3;
                        b2 = 1;
                    }
                    if (interfaceC3333z5 != null) {
                        String str = f22894a;
                        StringBuilder sbA = H6.a(str, "TAG", "Media size for pages ");
                        sbA.append(arrayList.size());
                        ((A5) interfaceC3333z5).a(str, sbA.toString());
                    }
                    for (String str2 : arrayList) {
                        if (jSONArrayK != null) {
                            a(jSONArrayK, str2, (byte) 0);
                        }
                    }
                    ArrayList<String> arrayList2 = new ArrayList();
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("pages");
                        int length4 = jSONArray2.length();
                        for (int i8 = 0; i8 < length4; i8++) {
                            if (!jSONArray2.getJSONObject(i8).isNull("rootContainer")) {
                                JSONObject jSONObject4 = jSONArray2.getJSONObject(i8).getJSONObject("rootContainer");
                                Intrinsics.e(jSONObject4, "getJSONObject(...)");
                                arrayList2.addAll(b(jSONObject4, interfaceC3333z5));
                            }
                        }
                    } catch (JSONException e4) {
                        if (interfaceC3333z5 != null) {
                            String TAG5 = f22894a;
                            Intrinsics.e(TAG5, "TAG");
                            ((A5) interfaceC3333z5).a(TAG5, "JSONException in getPagesImage", e4);
                        }
                    }
                    for (String str3 : arrayList2) {
                        if (jSONArrayK != null) {
                            a(jSONArrayK, str3, (byte) 2);
                        }
                    }
                    ArrayList<String> arrayList3 = new ArrayList();
                    try {
                        JSONArray jSONArray3 = jSONObject.getJSONArray("pages");
                        int length5 = jSONArray3.length();
                        for (int i9 = 0; i9 < length5; i9++) {
                            if (!jSONArray3.getJSONObject(i9).isNull("rootContainer")) {
                                JSONObject jSONObject5 = jSONArray3.getJSONObject(i9).getJSONObject("rootContainer");
                                Intrinsics.e(jSONObject5, "getJSONObject(...)");
                                arrayList3.addAll(a(jSONObject5, interfaceC3333z5));
                            }
                        }
                    } catch (JSONException e5) {
                        if (interfaceC3333z5 != null) {
                            String TAG6 = f22894a;
                            Intrinsics.e(TAG6, "TAG");
                            ((A5) interfaceC3333z5).a(TAG6, "JSONException in getPagesGif", e5);
                        }
                    }
                    for (String str4 : arrayList3) {
                        if (jSONArrayK != null) {
                            a(jSONArrayK, str4, b2);
                        }
                    }
                    String strB3 = ueA.b();
                    String str5 = ueA.g;
                    if (strB3 == null || str5 == null) {
                        return null;
                    }
                    return new W8(ad, jSONArrayK, strB3, str5, ueA.k, ueA.f23283h, ueA.f23284i);
                }
                if (interfaceC3333z5 != null) {
                    String TAG7 = f22894a;
                    Intrinsics.e(TAG7, "TAG");
                    ((A5) interfaceC3333z5).b(TAG7, "No Media URL to download.Returning..");
                }
                throw new VastException(401);
            }
            if (interfaceC3333z5 != null) {
                String TAG8 = f22894a;
                Intrinsics.e(TAG8, "TAG");
                ((A5) interfaceC3333z5).b(TAG8, "Missing VAST video XML in the ad markup");
            }
        }
        return ad;
    }

    public static void a(JSONArray jSONArray, String str, byte b2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (int) b2);
        jSONObject.put("url", str);
        jSONArray.put(jSONObject);
    }

    public static ArrayList a(JSONObject jSONObject, InterfaceC3333z5 interfaceC3333z5) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            Intrinsics.c(jSONArray);
            if (!B2.a(jSONArray)) {
                String string = jSONObject.getString("assetType");
                if ("gif".equalsIgnoreCase(string)) {
                    String string2 = jSONArray.getString(0);
                    Intrinsics.e(string2, "getString(...)");
                    arrayList.add(string2);
                    return arrayList;
                }
                if ("container".equalsIgnoreCase(string)) {
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        Intrinsics.c(jSONObject2);
                        arrayList.addAll(a(jSONObject2, interfaceC3333z5));
                    }
                }
            }
        } catch (JSONException e2) {
            if (interfaceC3333z5 != null) {
                String str = f22894a;
                StringBuilder sbA = H6.a(str, "TAG", "Error getting getGifAssetUrls (");
                sbA.append(e2.getMessage());
                sbA.append(')');
                ((A5) interfaceC3333z5).b(str, sbA.toString());
            }
        }
        return arrayList;
    }
}
