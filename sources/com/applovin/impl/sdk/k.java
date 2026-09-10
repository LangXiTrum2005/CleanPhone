package com.applovin.impl.sdk;

import android.os.Bundle;
import android.view.View;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.a3;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.d3;
import com.applovin.impl.e3;
import com.applovin.impl.f3;
import com.applovin.impl.f6;
import com.applovin.impl.g8;
import com.applovin.impl.j3;
import com.applovin.impl.k5;
import com.applovin.impl.k7;
import com.applovin.impl.o0;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.y3;
import com.applovin.impl.z4;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.C0375hc;
import com.ironsource.Ve;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class k implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f9472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppLovinCommunicator f9473b;

    public k(l lVar) {
        this.f9472a = lVar;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(l.p());
        this.f9473b = appLovinCommunicator;
        if (((Boolean) lVar.a(z4.f10229p7)).booleanValue()) {
            appLovinCommunicator.a(lVar);
            appLovinCommunicator.subscribe(this, k7.f8308a);
        }
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (b("safedk_init") && com.applovin.impl.j.c()) {
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f9472a.k0());
            bundle.putString("applovin_random_token", this.f9472a.j0());
            bundle.putString("compass_random_token", this.f9472a.v());
            bundle.putString("device_type", AppLovinSdkUtils.isTablet(l.p()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z10));
            bundle.putParcelableArrayList("installed_mediation_adapters", JsonUtils.toBundle(y3.b(this.f9472a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", (JSONObject) null);
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putString("user_id", this.f9472a.y0().e());
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new JSONObject());
            if (!((Boolean) this.f9472a.a(z4.f10237q7)).booleanValue()) {
                JSONObject jSONObject4 = new JSONObject();
                JsonUtils.putBoolean(jSONObject4, "deactivated", true);
                JsonUtils.putJSONObject(jSONObject3, "safeDKDeactivation", jSONObject4);
            }
            bundle2.putBundle("settings", JsonUtils.toBundle(jSONObject3));
            this.f9472a.Q();
            if (p.a()) {
                this.f9472a.Q().a("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            a(bundle2, "safedk_init");
        }
    }

    public void b(String str, String str2) {
        if (b("user_info") && com.applovin.impl.j.c()) {
            Bundle bundle = new Bundle(2);
            bundle.putString("user_id", StringUtils.emptyIfNull(str));
            bundle.putString("applovin_random_token", str2);
            a(bundle, "user_info");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        Map<String, Object> map;
        Map<String, Object> map2;
        if (((Boolean) this.f9472a.a(z4.f10229p7)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map3 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString("id", "");
                if (!map3.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                    map3.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f9472a.k0());
                }
                this.f9472a.h0().e(new com.applovin.impl.sdk.network.d.b().d(messageData.getString("url")).a(messageData.getString("backup_url")).b(stringMap).c(map3).a(stringMap2).a(((Boolean) this.f9472a.a(z4.f10227p5)).booleanValue()).b(string).a());
                return;
            }
            if (!"send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f9472a.l().addCustomQueryParams(q7.a((Map) BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
                    return;
                } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f9472a.l().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                    return;
                } else {
                    if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                        this.f9472a.Z().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                        return;
                    }
                    return;
                }
            }
            Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
            String string2 = messageData2.getString("http_method", C0375hc.f28789b);
            long millis = messageData2.containsKey("timeout_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((Long) this.f9472a.a(z4.f10218o3)).longValue();
            int i10 = messageData2.getInt("retry_count", ((Integer) this.f9472a.a(z4.f10225p3)).intValue());
            long millis2 = messageData2.containsKey("retry_delay_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((Long) this.f9472a.a(z4.f10234q3)).longValue();
            Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
            if (C0375hc.f28788a.equalsIgnoreCase(string2)) {
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    map2 = null;
                    stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(this.f9472a.B().a((Map) null, false, false))));
                } else {
                    map2 = null;
                }
                millis = millis;
                i10 = i10;
                map = map2;
            } else {
                map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    Map mapG = this.f9472a.B().G();
                    Map mapP = this.f9472a.B().p();
                    if (mapP.containsKey("idfv") && mapP.containsKey("idfv_scope")) {
                        String str = (String) mapP.get("idfv");
                        Integer num = (Integer) mapP.get("idfv_scope");
                        num.getClass();
                        mapP.remove("idfv");
                        mapP.remove("idfv_scope");
                        mapG.put("idfv", str);
                        mapG.put("idfv_scope", num);
                    }
                    mapG.put("server_installed_at", this.f9472a.a(z4.f10214o));
                    mapG.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f9472a.k0());
                    map.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, mapG);
                    map.put(X3.i.G, mapP);
                } else {
                    millis = millis;
                    i10 = i10;
                }
            }
            this.f9472a.s0().a((k5) new o0(appLovinCommunicatorMessage.getPublisherId(), com.applovin.impl.sdk.network.a.a(this.f9472a).b(messageData2.getString("url")).a(messageData2.getString("backup_url")).b(stringMap3).c(string2).a((Map) BundleUtils.toStringMap(messageData2.getBundle("headers"))).a(map != null ? new JSONObject(map) : null).c((int) millis).a(i10).b((int) millis2).a((Object) new JSONObject()).a(messageData2.getBoolean("is_encoding_enabled", false)).a(), this.f9472a), f6.b.OTHER);
        }
    }

    public void b(a3 a3Var, String str) {
        if (b("max_ad_events")) {
            Bundle bundleA = a(a3Var);
            bundleA.putString("type", str);
            this.f9472a.Q();
            if (p.a()) {
                this.f9472a.Q().a("CommunicatorService", "Sending \"max_ad_events\" message: " + bundleA);
            }
            a(bundleA, "max_ad_events");
        }
    }

    public void b(a3 a3Var) {
        if (b("max_revenue_events")) {
            Bundle bundleA = a(a3Var);
            bundleA.putAll(JsonUtils.toBundle(a3Var.S()));
            bundleA.putString("country_code", this.f9472a.w().getCountryCode());
            a(bundleA, "max_revenue_events");
        }
    }

    public void b(List list) {
        if (b("test_mode_networks_updated")) {
            if (list == null || list.isEmpty()) {
                a(Bundle.EMPTY, "test_mode_networks_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("test_mode_networks", new ArrayList<>(list));
            a(bundle, "test_mode_networks_updated");
        }
    }

    public void a(a3 a3Var, String str) {
        if (b("ad_callback_blocked_after_hidden")) {
            Bundle bundleA = a(a3Var);
            bundleA.putString("callback_name", str);
            a(bundleA, "ad_callback_blocked_after_hidden");
        }
    }

    private boolean b(String str) {
        if (((Boolean) this.f9472a.a(z4.f10229p7)).booleanValue()) {
            return this.f9472a.c(z4.o7).contains(str) || this.f9473b.hasSubscriber(str);
        }
        return false;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (b("adapter_initialization_status")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            a(bundle, "adapter_initialization_status");
        }
    }

    public void a() {
        if (b("privacy_setting_updated")) {
            a(new Bundle(), "privacy_setting_updated");
        }
    }

    public void a(String str, String str2) {
        if (b("network_sdk_version_updated")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            a(bundle, "network_sdk_version_updated");
        }
    }

    public void a(List list) {
        if (b("live_networks_updated")) {
            if (list == null || list.isEmpty()) {
                a(Bundle.EMPTY, "live_networks_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("live_networks", new ArrayList<>(list));
            a(bundle, "live_networks_updated");
        }
    }

    public void a(String str, String str2, String str3) {
        if (b("responses")) {
            String strMaybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String strMaybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", strMaybeConvertToIndentedString);
            bundle.putString(Ve.f27442n, strMaybeConvertToIndentedString2);
            a(bundle, "responses");
        }
    }

    public void a(String str, String str2, int i10, Object obj, String str3, boolean z10) {
        if (b("receive_http_response")) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putString("url", str2);
            bundle.putInt("code", i10);
            bundle.putBundle("body", JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z10);
            BundleUtils.putString("error_message", str3, bundle);
            a(bundle, "receive_http_response");
        }
    }

    public void a(Bundle bundle, String str) {
        if (b(str)) {
            this.f9473b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this, this.f9472a.c(z4.o7).contains(str)));
        }
    }

    public boolean a(String str) {
        return k7.f8308a.contains(str);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a0  */
    private Bundle a(a3 a3Var) {
        View viewV0;
        Bundle bundle = new Bundle();
        bundle.putString("id", a3Var.T());
        bundle.putString("network_name", a3Var.c());
        bundle.putString("max_ad_unit_id", a3Var.getAdUnitId());
        bundle.putString("third_party_ad_placement_id", a3Var.U());
        bundle.putString("ad_format", a3Var.getFormat().getLabel());
        BundleUtils.putStringIfValid(CampaignEx.JSON_KEY_CREATIVE_ID, a3Var.getCreativeId(), bundle);
        BundleUtils.putStringIfValid("adomain", a3Var.v(), bundle);
        BundleUtils.putStringIfValid("dsp_name", a3Var.getDspName(), bundle);
        if ("CUSTOM_NETWORK_SDK".equalsIgnoreCase(a3Var.c())) {
            bundle.putString("custom_sdk_network_name", a3Var.getNetworkName());
        }
        bundle.putAll(JsonUtils.toBundle(a3Var.y()));
        if (a3Var instanceof j3) {
            if (a3Var instanceof d3) {
                viewV0 = ((d3) a3Var).z();
            } else if (a3Var instanceof f3) {
                f3 f3Var = (f3) a3Var;
                if (f3Var.A0()) {
                    viewV0 = null;
                } else {
                    viewV0 = f3Var.v0() != null ? f3Var.v0() : f3Var.w0();
                }
            } else {
                viewV0 = null;
            }
            bundle.putString("ad_view", viewV0 != null ? g8.a(viewV0) : "N/A");
            return bundle;
        }
        if (a3Var instanceof e3) {
            Bundle bundle2 = ((e3) a3Var).t0().getBundle("applovin_ad_view_info");
            bundle.putString("ad_view", BundleUtils.getString("ad_view_address", "N/A", bundle2));
            bundle.putString("video_view", BundleUtils.getString("video_view_address", "N/A", bundle2));
        }
        return bundle;
    }
}
