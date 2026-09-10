package com.inmobi.media;

import com.inmobi.ads.core.Trackers;
import com.inmobi.ads.core.TrackingInfo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableCollection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3296x0 {
    public static C3191q6 a() {
        return new C3191q6().a(new Ec("ads", C3312y0.class), (Dc) new U6(new C3216s0(), C3040h.class)).a(new Ec("trackingInfo", C3040h.class), (Dc) new U6(new C3232t0(), TrackingInfo.class)).a(new Ec("trackers", TrackingInfo.class), (Dc) new U6(new C3248u0(), Trackers.class)).a(new Ec("url", Trackers.class), (Dc) new U6(new C3264v0(), String.class)).a(new Ec("imExts", Trackers.class), (Dc) new U6(new C3280w0(), String.class));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f4 A[Catch: JSONException -> 0x0105, TRY_ENTER, TryCatch #1 {JSONException -> 0x0105, blocks: (B:30:0x00b2, B:53:0x012b, B:54:0x0157, B:56:0x015f, B:59:0x0164, B:60:0x0169, B:61:0x016a, B:62:0x016d, B:42:0x00f4, B:45:0x0108, B:47:0x011d, B:48:0x0122, B:63:0x0175), top: B:74:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x012b A[Catch: JSONException -> 0x0105, TryCatch #1 {JSONException -> 0x0105, blocks: (B:30:0x00b2, B:53:0x012b, B:54:0x0157, B:56:0x015f, B:59:0x0164, B:60:0x0169, B:61:0x016a, B:62:0x016d, B:42:0x00f4, B:45:0x0108, B:47:0x011d, B:48:0x0122, B:63:0x0175), top: B:74:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x016d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static C3312y0 a(JSONObject adContent, long j, String str, String requestId, InterfaceC3333z5 interfaceC3333z5) throws Throwable {
        Throwable th;
        Object obj;
        LinkedList<C3040h> linkedListF;
        C3040h c3040h;
        Intrinsics.f(adContent, "adContent");
        Intrinsics.f(requestId, "requestId");
        Throwable th2 = null;
        try {
            long jOptLong = adContent.optLong("expiry", -1L);
            long millis = jOptLong > 0 ? TimeUnit.SECONDS.toMillis(jOptLong) : -1L;
            JSONArray jSONArray = adContent.getJSONArray("ads");
            if (jSONArray.length() == 0) {
                if (interfaceC3333z5 == null) {
                    return null;
                }
                String str2 = C3312y0.TAG;
                Intrinsics.e(str2, "access$getTAG$cp(...)");
                ((A5) interfaceC3333z5).b(str2, "no ads");
                return null;
            }
            C3312y0 c3312y0 = (C3312y0) a().a(adContent, C3312y0.class);
            if (interfaceC3333z5 != null) {
                String str3 = C3312y0.TAG;
                Intrinsics.e(str3, "access$getTAG$cp(...)");
                ((A5) interfaceC3333z5).a(str3, "adSet parsing success");
            }
            if (c3312y0 == null || c3312y0.c().length() <= 0) {
                th = null;
            } else {
                c3312y0.placementId = j;
                c3312y0.requestId = requestId;
                String str4 = str;
                c3312y0.adType = str4;
                int length = jSONArray.length();
                int i2 = 0;
                while (i2 < length) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    Iterator<T> it = c3312y0.f().iterator();
                    int i3 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                Throwable th3 = th2;
                                CollectionsKt.f0();
                                throw th3;
                            }
                            C3040h c3040h2 = (C3040h) next;
                            th = th2;
                            try {
                                if (Intrinsics.a(jSONObject.optString("impressionId"), c3040h2.s())) {
                                    if (interfaceC3333z5 != null) {
                                        try {
                                            String str5 = C3312y0.TAG;
                                            Intrinsics.e(str5, "access$getTAG$cp(...)");
                                            ((A5) interfaceC3333z5).a(str5, "inflating ad at index - " + i3);
                                        } catch (Exception e2) {
                                            e = e2;
                                            c3040h = c3040h2;
                                            if (interfaceC3333z5 != null) {
                                                String str6 = C3312y0.TAG;
                                                Intrinsics.e(str6, "access$getTAG$cp(...)");
                                                ((A5) interfaceC3333z5).a(str6, "Error inflating ad", e);
                                            }
                                            S5 s5 = S5.f23167a;
                                            S5.d.a(new C3011f2(e));
                                            obj = c3040h;
                                            if (obj == null) {
                                                if (interfaceC3333z5 != null) {
                                                    String str7 = C3312y0.TAG;
                                                    Intrinsics.e(str7, "access$getTAG$cp(...)");
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("removing invalid ad  at index - ");
                                                    LinkedList<C3040h> linkedListF2 = c3312y0.f();
                                                    Intrinsics.f(linkedListF2, "<this>");
                                                    sb.append(linkedListF2.indexOf(obj));
                                                    ((A5) interfaceC3333z5).b(str7, sb.toString());
                                                }
                                                linkedListF = c3312y0.f();
                                                if (linkedListF instanceof KMappedMarker) {
                                                    TypeIntrinsics.f(linkedListF, "kotlin.collections.MutableCollection");
                                                    throw th;
                                                }
                                                linkedListF.remove(obj);
                                            }
                                            i2++;
                                            str4 = str;
                                            th2 = th;
                                        }
                                    }
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                                    Intrinsics.e(jSONObject2, "getJSONObject(...)");
                                    c3040h = c3040h2;
                                    try {
                                        J.a(c3040h, jSONObject2, str4, millis, interfaceC3333z5);
                                    } catch (Exception e3) {
                                        e = e3;
                                        if (interfaceC3333z5 != null) {
                                            String str8 = C3312y0.TAG;
                                            Intrinsics.e(str8, "access$getTAG$cp(...)");
                                            ((A5) interfaceC3333z5).a(str8, "Error inflating ad", e);
                                        }
                                        S5 s6 = S5.f23167a;
                                        S5.d.a(new C3011f2(e));
                                        obj = c3040h;
                                        break;
                                    }
                                } else {
                                    str4 = str;
                                    i3 = i4;
                                    th2 = th;
                                }
                            } catch (JSONException e4) {
                                e = e4;
                                if (interfaceC3333z5 != null) {
                                    String str9 = C3312y0.TAG;
                                    Intrinsics.e(str9, "access$getTAG$cp(...)");
                                    ((A5) interfaceC3333z5).a(str9, "Exception while inflating AdSet", e);
                                }
                                return th;
                            }
                        } else {
                            th = th2;
                        }
                        obj = th;
                        break;
                    }
                    if (obj == null) {
                        if (interfaceC3333z5 != null) {
                            String str10 = C3312y0.TAG;
                            Intrinsics.e(str10, "access$getTAG$cp(...)");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("removing invalid ad  at index - ");
                            LinkedList<C3040h> linkedListF3 = c3312y0.f();
                            Intrinsics.f(linkedListF3, "<this>");
                            sb2.append(linkedListF3.indexOf(obj));
                            ((A5) interfaceC3333z5).b(str10, sb2.toString());
                        }
                        linkedListF = c3312y0.f();
                        if ((linkedListF instanceof KMappedMarker) && !(linkedListF instanceof KMutableCollection)) {
                            TypeIntrinsics.f(linkedListF, "kotlin.collections.MutableCollection");
                            throw th;
                        }
                        linkedListF.remove(obj);
                    }
                    i2++;
                    str4 = str;
                    th2 = th;
                }
                th = th2;
                if (!c3312y0.f().isEmpty()) {
                    return c3312y0;
                }
            }
            return th;
        } catch (JSONException e5) {
            e = e5;
            th = null;
        }
    }
}
