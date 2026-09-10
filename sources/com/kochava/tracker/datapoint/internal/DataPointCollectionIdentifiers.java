package com.kochava.tracker.datapoint.internal;

import android.content.Context;
import com.kochava.core.json.internal.JsonElement;
import com.kochava.core.json.internal.JsonElementApi;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.tracker.huaweireferrer.internal.HuaweiReferrerApi;
import com.kochava.tracker.installreferrer.internal.InstallReferrerApi;
import com.kochava.tracker.payload.internal.PayloadMetadata;
import com.kochava.tracker.payload.internal.PayloadType;
import com.kochava.tracker.samsungreferrer.SamsungReferrerApi;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class DataPointCollectionIdentifiers extends DataPointCollection implements DataPointCollectionIdentifiersApi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28134c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f28135e;
    public String f;
    public Boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f28136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f28137i;
    public Boolean j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f28138l;
    public Integer m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InstallReferrerApi f28139n;
    public HuaweiReferrerApi o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SamsungReferrerApi f28140p;
    public JsonObjectApi q;

    @Override // com.kochava.tracker.datapoint.internal.DataPointCollection
    public final synchronized DataPointApi[] a() {
        PayloadType payloadType;
        PayloadType payloadType2;
        payloadType = PayloadType.l0;
        payloadType2 = PayloadType.m0;
        return new DataPointApi[]{DataPoint.e("android_id", false, false, payloadType, payloadType2), DataPoint.e("adid", false, false, payloadType, payloadType2), DataPoint.e("fire_adid", false, false, payloadType, payloadType2), DataPoint.e("oaid", false, false, payloadType, payloadType2), DataPoint.e("device_limit_tracking", false, false, payloadType, payloadType2), DataPoint.e("app_limit_tracking", false, false, payloadType, payloadType2), DataPoint.e("fb_attribution_id", false, false, payloadType), DataPoint.e("asid", false, false, payloadType, payloadType2), DataPoint.e("asid_scope", false, false, payloadType), DataPoint.e("install_referrer", false, false, payloadType), DataPoint.e("huawei_referrer", false, false, payloadType), DataPoint.e("samsung_referrer", false, false, payloadType), DataPoint.e("custom_device_ids", false, true, payloadType), DataPoint.e("conversion_data", false, false, payloadType), DataPoint.e("conversion_type", false, false, payloadType)};
    }

    @Override // com.kochava.tracker.datapoint.internal.DataPointCollection
    public final synchronized JsonElementApi b(Context context, PayloadMetadata payloadMetadata, String str, ArrayList arrayList, List list) {
        try {
            str.getClass();
            switch (str) {
                case "device_limit_tracking":
                    Boolean boolD = d();
                    return boolD != null ? new JsonElement(boolD) : JsonElement.h();
                case "fire_adid":
                    String str2 = this.f;
                    return str2 != null ? new JsonElement(str2) : JsonElement.h();
                case "adid":
                    String str3 = this.d;
                    return str3 != null ? new JsonElement(str3) : JsonElement.h();
                case "asid":
                    String str4 = this.f28138l;
                    return str4 != null ? new JsonElement(str4) : JsonElement.h();
                case "oaid":
                    String str5 = this.f28136h;
                    return str5 != null ? new JsonElement(str5) : JsonElement.h();
                case "asid_scope":
                    Integer num = this.m;
                    return num != null ? new JsonElement(num) : JsonElement.h();
                case "custom_device_ids":
                    return e(arrayList);
                case "conversion_data":
                    JsonElement jsonElementL = (this.q != null && arrayList.contains("conversion_data") && this.q.i("legacy_referrer")) ? this.q.l("legacy_referrer", true) : JsonElement.h();
                    return jsonElementL;
                case "conversion_type":
                    JsonElement jsonElement = (this.q != null && arrayList.contains("conversion_type") && this.q.i("legacy_referrer")) ? new JsonElement("gplay") : JsonElement.h();
                    return jsonElement;
                case "android_id":
                    String str6 = this.f28134c;
                    return str6 != null ? new JsonElement(str6) : JsonElement.h();
                case "app_limit_tracking":
                    Boolean bool = this.j;
                    return bool != null ? new JsonElement(bool) : JsonElement.h();
                case "install_referrer":
                    InstallReferrerApi installReferrerApi = this.f28139n;
                    return installReferrerApi != null ? installReferrerApi.toJson().p() : JsonElement.h();
                case "samsung_referrer":
                    SamsungReferrerApi samsungReferrerApi = this.f28140p;
                    return samsungReferrerApi != null ? samsungReferrerApi.a().p() : JsonElement.h();
                case "fb_attribution_id":
                    String str7 = this.k;
                    return str7 != null ? new JsonElement(str7) : JsonElement.h();
                case "huawei_referrer":
                    HuaweiReferrerApi huaweiReferrerApi = this.o;
                    return huaweiReferrerApi != null ? huaweiReferrerApi.toJson().p() : JsonElement.h();
                default:
                    throw new Exception("Invalid key name");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Boolean d() {
        Boolean bool;
        Boolean bool2;
        Boolean bool3 = this.f28135e;
        if (bool3 == null && this.g == null && this.f28137i == null) {
            return null;
        }
        return Boolean.valueOf((bool3 != null && bool3.booleanValue()) || ((bool = this.g) != null && bool.booleanValue()) || ((bool2 = this.f28137i) != null && bool2.booleanValue()));
    }

    public final JsonElementApi e(ArrayList arrayList) {
        if (this.q == null) {
            return JsonElement.h();
        }
        JsonObject jsonObjectW = JsonObject.w();
        for (String str : this.q.h()) {
            if (arrayList.contains(str)) {
                if ("email".equals(str)) {
                    String string = this.q.getString(str, "");
                    JsonObject jsonObjectW2 = JsonObject.w();
                    jsonObjectW2.g("email", d9.i.d + string + d9.i.f24752e);
                    jsonObjectW.r("ids", jsonObjectW2);
                } else {
                    jsonObjectW.e(str, this.q.l(str, true));
                }
            }
        }
        return jsonObjectW.p();
    }

    public final synchronized boolean f() {
        Boolean boolD;
        boolD = d();
        return boolD != null && boolD.booleanValue();
    }

    public final synchronized void g(String str) {
        this.f28134c = str;
    }

    public final synchronized void h(Boolean bool) {
        this.j = bool;
    }

    public final synchronized void i(JsonObjectApi jsonObjectApi) {
        this.q = jsonObjectApi;
    }

    public final synchronized void j(String str) {
        this.k = str;
    }

    public final synchronized void k(String str, Boolean bool) {
        this.f = str;
        this.g = bool;
    }

    public final synchronized void l(String str, Boolean bool) {
        this.d = str;
        this.f28135e = bool;
    }

    public final synchronized void m(Integer num, String str) {
        this.f28138l = str;
        this.m = num;
    }

    public final synchronized void n(String str, Boolean bool) {
        this.f28136h = str;
        this.f28137i = bool;
    }

    public final synchronized void o(HuaweiReferrerApi huaweiReferrerApi) {
        this.o = huaweiReferrerApi;
    }

    public final synchronized void p(InstallReferrerApi installReferrerApi) {
        this.f28139n = installReferrerApi;
    }

    public final synchronized void q(SamsungReferrerApi samsungReferrerApi) {
        this.f28140p = samsungReferrerApi;
    }
}
