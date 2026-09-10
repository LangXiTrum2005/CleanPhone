package com.kochava.tracker.payload.internal;

import android.net.Uri;
import com.kochava.core.json.internal.JsonArrayApi;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.core.util.internal.ObjectUtil;
import com.kochava.core.util.internal.TextUtil;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.init.internal.InitResponseNetworkingUrlsApi;
import com.kochava.tracker.payload.internal.url.RotationUrl;
import com.kochava.tracker.payload.internal.url.RotationUrlApi;
import com.kochava.tracker.payload.internal.url.RotationUrlVariationApi;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class PayloadType implements PayloadTypeApi {
    public static final PayloadType k0;
    public static final PayloadType l0;
    public static final PayloadType m0;
    public static final PayloadType n0;
    public static final PayloadType o0;
    public static final PayloadType p0;
    public static final PayloadType q0;
    public static final PayloadType r0;
    public static final PayloadType s0;
    public static final PayloadType t0;
    public static final PayloadType u0;
    public static final PayloadType v0;
    public static final PayloadType[] w0;
    public static final /* synthetic */ PayloadType[] x0;
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f28266Y;
    public final Uri Z;
    public final RotationUrl e0;
    public Uri f0;
    public HashMap g0;
    public int h0;
    public int i0;
    public boolean j0;

    static {
        Uri uri = Uri.EMPTY;
        Uri uriO = ObjectUtil.o(BuildConfig.URL_INIT);
        Uri uri2 = uriO != null ? uriO : uri;
        JsonObject jsonObjectX = JsonObject.x(BuildConfig.URL_INIT_ROTATION, true);
        jsonObjectX.getString("type_id", "");
        JsonArrayApi jsonArrayApiD = jsonObjectX.d("variations");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jsonArrayApiD.length(); i2++) {
            JsonObjectApi jsonObjectApiB = jsonArrayApiD.b(i2);
            if (jsonObjectApiB != null) {
                final String string = jsonObjectApiB.getString("start_ymd", "");
                JsonArrayApi jsonArrayApiD2 = jsonObjectApiB.d("urls");
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < jsonArrayApiD2.length(); i3++) {
                    Uri uriO2 = ObjectUtil.o(jsonArrayApiD2.getString(i3));
                    if (uriO2 != null) {
                        arrayList2.add(uriO2);
                    }
                }
                final Uri[] uriArr = (Uri[]) arrayList2.toArray(new Uri[0]);
                arrayList.add(new RotationUrlVariationApi(uriArr, string) { // from class: com.kochava.tracker.payload.internal.url.RotationUrlVariation

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final String f28268a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Uri[] f28269b;

                    {
                        this.f28268a = string;
                        this.f28269b = uriArr;
                    }

                    @Override // com.kochava.tracker.payload.internal.url.RotationUrlVariationApi
                    public final int a() {
                        Integer numH = ObjectUtil.h(this.f28268a);
                        return (numH != null ? numH : 0).intValue();
                    }

                    @Override // com.kochava.tracker.payload.internal.url.RotationUrlVariationApi
                    public final Uri[] b() {
                        return this.f28269b;
                    }
                });
            }
        }
        PayloadType payloadType = new PayloadType("Init", 0, d9.a.f, d9.a.f, uri2, new RotationUrl((RotationUrlVariationApi[]) arrayList.toArray(new RotationUrlVariationApi[0])));
        k0 = payloadType;
        Uri uri3 = Uri.EMPTY;
        Uri uriO3 = ObjectUtil.o("https://control.kochava.com/track/json");
        PayloadType payloadType2 = new PayloadType("Install", 1, "install", "install", uriO3 != null ? uriO3 : uri3, null);
        l0 = payloadType2;
        Uri uriO4 = ObjectUtil.o("https://control.kochava.com/track/json");
        PayloadType payloadType3 = new PayloadType("Update", 2, "update", "update", uriO4 != null ? uriO4 : uri3, null);
        m0 = payloadType3;
        Uri uriO5 = ObjectUtil.o(BuildConfig.URL_GET_ATTRIBUTION);
        PayloadType payloadType4 = new PayloadType("GetAttribution", 3, "get_attribution", "get_attribution", uriO5 != null ? uriO5 : uri3, null);
        n0 = payloadType4;
        Uri uriO6 = ObjectUtil.o("https://control.kochava.com/track/json");
        PayloadType payloadType5 = new PayloadType("IdentityLink", 4, "identityLink", "identityLink", uriO6 != null ? uriO6 : uri3, null);
        o0 = payloadType5;
        Uri uriO7 = ObjectUtil.o(BuildConfig.URL_PUSH_TOKEN_ADD);
        PayloadType payloadType6 = new PayloadType("PushTokenAdd", 5, "push_token_add", "push_token_add", uriO7 != null ? uriO7 : uri3, null);
        p0 = payloadType6;
        Uri uriO8 = ObjectUtil.o(BuildConfig.URL_PUSH_TOKEN_REMOVE);
        PayloadType payloadType7 = new PayloadType("PushTokenRemove", 6, "push_token_remove", "push_token_remove", uriO8 != null ? uriO8 : uri3, null);
        q0 = payloadType7;
        Uri uriO9 = ObjectUtil.o("https://control.kochava.com/track/json");
        PayloadType payloadType8 = new PayloadType("SessionBegin", 7, "session_begin", "session", uriO9 != null ? uriO9 : uri3, null);
        r0 = payloadType8;
        Uri uriO10 = ObjectUtil.o("https://control.kochava.com/track/json");
        PayloadType payloadType9 = new PayloadType("SessionEnd", 8, "session_end", "session", uriO10 != null ? uriO10 : uri3, null);
        s0 = payloadType9;
        Uri uriO11 = ObjectUtil.o("https://control.kochava.com/track/json");
        PayloadType payloadType10 = new PayloadType("Event", 9, "event", "event", uriO11 != null ? uriO11 : uri3, null);
        t0 = payloadType10;
        Uri uriO12 = ObjectUtil.o(BuildConfig.URL_SMARTLINK);
        PayloadType payloadType11 = new PayloadType("Smartlink", 10, "smartlink", "smartlink", uriO12 != null ? uriO12 : uri3, null);
        u0 = payloadType11;
        PayloadType payloadType12 = new PayloadType("Click", 11, "click", "click", uri3, null);
        v0 = payloadType12;
        x0 = new PayloadType[]{payloadType, payloadType2, payloadType3, payloadType4, payloadType5, payloadType6, payloadType7, payloadType8, payloadType9, payloadType10, payloadType11, payloadType12};
        w0 = new PayloadType[]{payloadType, payloadType2, payloadType3, payloadType4, payloadType5, payloadType6, payloadType7, payloadType8, payloadType9, payloadType10};
    }

    public PayloadType(String str, int i2, String str2, String str3, Uri uri, RotationUrl rotationUrl) {
        super(str, i2);
        this.f0 = null;
        this.g0 = null;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = false;
        this.X = str2;
        this.f28266Y = str3;
        this.Z = uri;
        this.e0 = rotationUrl;
    }

    public static void f(InitResponseNetworkingUrlsApi initResponseNetworkingUrlsApi) {
        k0.d(initResponseNetworkingUrlsApi.j());
        l0.d(initResponseNetworkingUrlsApi.c());
        m0.d(initResponseNetworkingUrlsApi.d());
        n0.d(initResponseNetworkingUrlsApi.b());
        o0.d(initResponseNetworkingUrlsApi.f());
        p0.d(initResponseNetworkingUrlsApi.h());
        q0.d(initResponseNetworkingUrlsApi.g());
        r0.d(initResponseNetworkingUrlsApi.a());
        s0.d(initResponseNetworkingUrlsApi.k());
        t0.d(initResponseNetworkingUrlsApi.i());
        u0.d(initResponseNetworkingUrlsApi.l());
        JsonObjectApi jsonObjectApiE = initResponseNetworkingUrlsApi.e();
        for (String str : jsonObjectApiE.h()) {
            Uri uriO = ObjectUtil.o(jsonObjectApiE.getString(str, null));
            Uri uri = uriO != null ? uriO : null;
            PayloadType payloadType = t0;
            synchronized (payloadType) {
                try {
                    if (payloadType.g0 == null) {
                        payloadType.g0 = new HashMap();
                    }
                    if (uri == null) {
                        payloadType.g0.remove(str);
                    } else {
                        payloadType.g0.put(str, uri);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static PayloadType valueOf(String str) {
        return (PayloadType) Enum.valueOf(PayloadType.class, str);
    }

    public static PayloadType[] values() {
        return (PayloadType[]) x0.clone();
    }

    public final Uri a(RotationUrlApi rotationUrlApi) {
        RotationUrlVariationApi rotationUrlVariationApiA;
        int i2 = this.h0;
        if (i2 == 0 || (rotationUrlVariationApiA = rotationUrlApi.a(i2)) == null) {
            return null;
        }
        if (this.i0 >= rotationUrlVariationApiA.b().length) {
            this.i0 = 0;
            this.j0 = true;
        }
        return rotationUrlVariationApiA.b()[this.i0];
    }

    public final synchronized Uri b(String str) {
        HashMap map;
        if (!TextUtil.b(str) && (map = this.g0) != null && map.containsKey(str)) {
            Uri uri = (Uri) this.g0.get(str);
            if (ObjectUtil.d(uri)) {
                return uri;
            }
        }
        if (ObjectUtil.d(this.f0)) {
            return this.f0;
        }
        RotationUrl rotationUrl = this.e0;
        if (rotationUrl != null) {
            Uri uriA = a(rotationUrl);
            if (ObjectUtil.d(uriA)) {
                return uriA;
            }
        }
        return this.Z;
    }

    public final synchronized void d(Uri uri) {
        this.f0 = uri;
    }
}
