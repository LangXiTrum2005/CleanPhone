package com.kochava.tracker.datapoint.internal;

import android.content.Context;
import com.kochava.core.json.internal.JsonArrayApi;
import com.kochava.core.json.internal.JsonElement;
import com.kochava.core.json.internal.JsonElementApi;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.deeplinks.internal.InstantAppDeeplinkApi;
import com.kochava.tracker.init.internal.InitResponseDeeplinksDeferredPrefetchApi;
import com.kochava.tracker.install.internal.LastInstallApi;
import com.kochava.tracker.payload.internal.PayloadMetadata;
import com.kochava.tracker.payload.internal.PayloadType;
import com.p004ironsource.d9;
import com.smartdigimkt.b0.a;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class DataPointCollectionInstance extends DataPointCollection implements DataPointCollectionInstanceApi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28141c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f28142e;
    public String f;
    public String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f28143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f28144i;
    public JsonObjectApi j;
    public JsonObjectApi k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f28145l;
    public LastInstallApi m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f28146n;
    public InstantAppDeeplinkApi o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f28147p;
    public JsonArrayApi q;
    public JsonObject r;
    public InitResponseDeeplinksDeferredPrefetchApi s;

    @Override // com.kochava.tracker.datapoint.internal.DataPointCollection
    public final synchronized DataPointApi[] a() {
        DataPoint dataPointF;
        DataPoint dataPointF2;
        DataPoint dataPointF3;
        DataPoint dataPointF4;
        DataPoint dataPointF5;
        DataPoint dataPointF6;
        DataPoint dataPointF7;
        PayloadType payloadType;
        DataPoint dataPointF8;
        DataPoint dataPointF9;
        DataPoint dataPointE;
        DataPoint dataPointE2;
        DataPoint dataPointE3;
        PayloadType payloadType2;
        PayloadType payloadType3;
        DataPoint dataPointE4;
        PayloadType payloadType4;
        PayloadType[] payloadTypeArr = PayloadType.w0;
        dataPointF = DataPoint.f("action", true, false, payloadTypeArr);
        dataPointF2 = DataPoint.f("kochava_app_id", true, true, payloadTypeArr);
        dataPointF3 = DataPoint.f("kochava_device_id", true, true, payloadTypeArr);
        dataPointF4 = DataPoint.f(a.s1, true, false, payloadTypeArr);
        dataPointF5 = DataPoint.f("sdk_protocol", true, false, payloadTypeArr);
        dataPointF6 = DataPoint.f("nt_id", true, false, payloadTypeArr);
        dataPointF7 = DataPoint.f("init_token", false, false, payloadTypeArr);
        payloadType = PayloadType.k0;
        dataPointF8 = DataPoint.f("modules", true, false, payloadType);
        dataPointF9 = DataPoint.f(d9.i.f24748b0, true, true, payloadTypeArr);
        dataPointE = DataPoint.e("usertime", false, false, payloadTypeArr);
        dataPointE2 = DataPoint.e("uptime", false, false, payloadTypeArr);
        dataPointE3 = DataPoint.e("starttime", false, false, payloadTypeArr);
        payloadType2 = PayloadType.r0;
        payloadType3 = PayloadType.s0;
        dataPointE4 = DataPoint.e("state", false, false, payloadType2, payloadType3);
        payloadType4 = PayloadType.l0;
        return new DataPointApi[]{dataPointF, dataPointF2, dataPointF3, dataPointF4, dataPointF5, dataPointF6, dataPointF7, dataPointF8, dataPointF9, dataPointE, dataPointE2, dataPointE3, dataPointE4, DataPoint.e("state_active", false, false, payloadType4, payloadType2, payloadType3, PayloadType.t0), DataPoint.e("state_active_count", false, false, payloadType3), DataPoint.e("partner_name", true, false, payloadType), DataPoint.e("platform", false, false, payloadType, payloadType4), DataPoint.e("identity_link", false, false, payloadType4), DataPoint.e("token", false, false, PayloadType.p0, PayloadType.q0), DataPoint.e("last_install", false, false, payloadType), DataPoint.e("deeplinks", false, false, payloadType4), DataPoint.e("deeplinks_augmentation", false, false, payloadType), DataPoint.e("deeplinks_deferred_prefetch", false, false, payloadType4)};
    }

    @Override // com.kochava.tracker.datapoint.internal.DataPointCollection
    public final synchronized JsonElementApi b(Context context, PayloadMetadata payloadMetadata, String str, ArrayList arrayList, List list) {
        JsonElement jsonElementP;
        try {
            str.getClass();
            switch (str) {
                case "starttime":
                    long j = payloadMetadata.f28259c;
                    if (j == 0) {
                        j = payloadMetadata.f28260e;
                    }
                    return new JsonElement(Long.valueOf(j / 1000));
                case "deeplinks_deferred_prefetch":
                    InitResponseDeeplinksDeferredPrefetchApi initResponseDeeplinksDeferredPrefetchApi = this.s;
                    return initResponseDeeplinksDeferredPrefetchApi != null ? initResponseDeeplinksDeferredPrefetchApi.toJson().p() : JsonElement.h();
                case "sdk_protocol":
                    String str2 = this.g;
                    return str2 != null ? new JsonElement(str2) : JsonElement.h();
                case "deeplinks":
                    InstantAppDeeplinkApi instantAppDeeplinkApi = this.o;
                    return instantAppDeeplinkApi != null ? instantAppDeeplinkApi.toJson().p() : JsonElement.h();
                case "last_install":
                    LastInstallApi lastInstallApi = this.m;
                    return lastInstallApi != null ? lastInstallApi.toJson().p() : JsonElement.h();
                case "action":
                    return new JsonElement(payloadMetadata.f28257a.f28266Y);
                case "uptime":
                    return new JsonElement(Double.valueOf(payloadMetadata.f / 1000.0d));
                case "kochava_app_id":
                    String str3 = this.f28141c;
                    return str3 != null ? new JsonElement(str3) : JsonElement.h();
                case "sdk_version":
                    String str4 = this.f;
                    return str4 != null ? new JsonElement(str4) : JsonElement.h();
                case "usertime":
                    return new JsonElement(Long.valueOf(payloadMetadata.f28260e / 1000));
                case "state_active":
                    return JsonElement.f(payloadMetadata.g);
                case "kochava_device_id":
                    String str5 = this.f28142e;
                    return str5 != null ? new JsonElement(str5) : JsonElement.h();
                case "nt_id":
                    return this.f28143h != null ? new JsonElement(this.f28143h + TokenBuilder.TOKEN_DELIMITER + this.f28144i + TokenBuilder.TOKEN_DELIMITER + UUID.randomUUID().toString()) : JsonElement.h();
                case "state":
                    PayloadType payloadType = payloadMetadata.f28257a;
                    return payloadType == PayloadType.r0 ? new JsonElement("resume") : payloadType == PayloadType.s0 ? new JsonElement("pause") : JsonElement.h();
                case "token":
                    String str6 = this.f28145l;
                    return str6 != null ? new JsonElement(str6) : JsonElement.h();
                case "partner_name":
                    String str7 = this.d;
                    return str7 != null ? new JsonElement(str7) : JsonElement.h();
                case "state_active_count":
                    return JsonElement.g(payloadMetadata.f28261h);
                case "identity_link":
                    if (this.j == null) {
                        jsonElementP = JsonElement.h();
                    } else {
                        JsonObject jsonObjectW = JsonObject.w();
                        for (String str8 : this.j.h()) {
                            if (!list.contains(str8)) {
                                jsonObjectW.e(str8, this.j.l(str8, true));
                            }
                        }
                        jsonElementP = jsonObjectW.p();
                    }
                    return jsonElementP;
                case "init_token":
                    String str9 = this.f28147p;
                    return str9 != null ? new JsonElement(str9) : JsonElement.h();
                case "consent":
                    JsonObject jsonObject = this.r;
                    return jsonObject != null ? new JsonElement(jsonObject) : JsonElement.h();
                case "deeplinks_augmentation":
                    JsonObjectApi jsonObjectApi = this.k;
                    return jsonObjectApi != null ? jsonObjectApi.p() : JsonElement.h();
                case "modules":
                    JsonArrayApi jsonArrayApi = this.q;
                    return jsonArrayApi != null ? new JsonElement(jsonArrayApi) : JsonElement.h();
                case "platform":
                    String str10 = this.f28146n;
                    return str10 != null ? new JsonElement(str10) : JsonElement.h();
                default:
                    throw new Exception("Invalid key name");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(String str) {
        this.f28141c = str;
    }

    public final synchronized void e(JsonObject jsonObject) {
        this.r = jsonObject;
    }

    public final synchronized void f(InitResponseDeeplinksDeferredPrefetchApi initResponseDeeplinksDeferredPrefetchApi) {
        this.s = initResponseDeeplinksDeferredPrefetchApi;
    }

    public final synchronized void g(String str) {
        this.f28142e = str;
    }

    public final synchronized void h(JsonObjectApi jsonObjectApi) {
        this.j = jsonObjectApi;
    }

    public final synchronized void i(String str) {
        this.f28147p = str;
    }

    public final synchronized void j(String str) {
        this.f28143h = str;
    }

    public final synchronized void k(InstantAppDeeplinkApi instantAppDeeplinkApi) {
        this.o = instantAppDeeplinkApi;
    }

    public final synchronized void l(LastInstallApi lastInstallApi) {
        this.m = lastInstallApi;
    }

    public final synchronized void m(JsonArrayApi jsonArrayApi) {
        this.q = jsonArrayApi;
    }

    public final synchronized void n(String str) {
        this.f28145l = str;
    }

    public final synchronized void o() {
        this.g = BuildConfig.SDK_PROTOCOL;
    }

    public final synchronized void p(long j) {
        this.f28144i = Math.max(0L, j);
    }
}
