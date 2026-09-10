package com.applovin.impl.sdk.ad;

import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import cj.h;
import com.applovin.impl.h1;
import com.applovin.impl.h4;
import com.applovin.impl.j5;
import com.applovin.impl.o8;
import com.applovin.impl.p0;
import com.applovin.impl.q4;
import com.applovin.impl.q7;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends AppLovinAdImpl implements s4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f9349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f9350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f9351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f9352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Bundle f9353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f9354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f9355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f9356k;
    private int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f9357m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private d f9358n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f9359o;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.ad.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum EnumC0016b {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum c {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f9371d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f9372e;

        private d() {
            this.f9368a = AppLovinSdkUtils.dpToPx(l.p(), b.this.o());
            this.f9369b = AppLovinSdkUtils.dpToPx(l.p(), b.this.q());
            this.f9370c = AppLovinSdkUtils.dpToPx(l.p(), b.this.m());
            this.f9371d = AppLovinSdkUtils.dpToPx(l.p(), ((Integer) ((AppLovinAdBase) b.this).sdk.a(z4.f10208n1)).intValue());
            this.f9372e = AppLovinSdkUtils.dpToPx(l.p(), ((Integer) ((AppLovinAdBase) b.this).sdk.a(z4.f10200m1)).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum e {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2, l lVar) {
        super(jSONObject, jSONObject2, lVar);
        this.f9349d = defpackage.e.w();
        this.f9350e = new AtomicBoolean();
        this.f9351f = new AtomicBoolean();
        this.f9352g = new AtomicReference();
        this.f9353h = new Bundle();
        this.f9359o = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List d(j5 j5Var) {
        return q7.a(defpackage.e.y(j5Var, "custom_tabs_navigation_aborted_urls"), getClCode(), (String) null, this.sdk);
    }

    private String g0() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List i(j5 j5Var) {
        return q7.a(defpackage.e.y(j5Var, "custom_tabs_tab_hidden_urls"), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List k(j5 j5Var) {
        return q7.a(defpackage.e.y(j5Var, "imp_urls"), getClCode(), null, null, J(), J0(), this.sdk);
    }

    public abstract boolean A0();

    public boolean B0() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", Boolean.valueOf(q7.j(l.p()) || q7.h(l.p()) || ((Boolean) this.sdk.a(z4.D6)).booleanValue()));
    }

    public abstract void C0();

    public boolean D0() {
        return getBooleanFromAdObject("aarwdc", (Boolean) this.sdk.a(z4.A2));
    }

    public boolean E0() {
        return getBooleanFromAdObject("always_reward_user", (Boolean) this.sdk.a(z4.f10183k1));
    }

    public boolean F0() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", Boolean.FALSE);
    }

    public boolean G0() {
        return this.f9351f.get();
    }

    public boolean H0() {
        return Q0() || O0() || P0();
    }

    public abstract String I();

    public boolean I0() {
        return getBooleanFromAdObject("serfaad", (Boolean) this.sdk.a(z4.S0));
    }

    public Map J() {
        HashMap map = new HashMap();
        try {
            j5 j5Var = this.synchronizedAdObject;
            map.putAll(j5Var != null ? (Map) j5Var.a(new ae.b(25)) : JsonUtils.toStringMap(getJsonObjectFromAdObject("http_headers_for_postbacks", new JSONObject())));
        } catch (JSONException e10) {
            this.sdk.Q();
            if (p.a()) {
                this.sdk.Q().a("DirectAd", "Failed to retrieve http headers for postbacks", e10);
            }
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", Boolean.FALSE)) {
            map.put(Command.HTTP_HEADER_USER_AGENT, o8.a());
        }
        return map;
    }

    public boolean J0() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", Boolean.FALSE);
    }

    public EnumC0016b K() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0016b.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0016b.DO_NOT_DISMISS;
            }
        }
        return EnumC0016b.UNSPECIFIED;
    }

    public boolean K0() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", Boolean.FALSE);
    }

    public int L() {
        return getColorFromAdObject("postitial_progress_bar_color", -922746881);
    }

    public boolean L0() {
        return getBooleanFromAdObject("fmsstwvoar", Boolean.FALSE);
    }

    public long M() {
        return getLongFromAdObject("postitial_progress_bar_total_ms", -1L);
    }

    public boolean M0() {
        return getBooleanFromAdObject("sftbpn", Boolean.FALSE);
    }

    public List N() {
        return getStringListFromAdObject("pbpn", this.sdk.c(z4.S6));
    }

    public boolean N0() {
        return getBooleanFromAdObject("fvcetwv", Boolean.FALSE);
    }

    public long O() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1L;
    }

    public boolean O0() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.c(z4.f10297z2)).contains(NotificationCompat.CATEGORY_NAVIGATION);
    }

    public int P() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    public boolean P0() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.c(z4.f10297z2)).contains("none");
    }

    public List Q() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.EMPTY_LIST;
    }

    public boolean Q0() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.c(z4.f10297z2)).contains("status");
    }

    public int R() {
        return this.l;
    }

    public boolean R0() {
        return getBooleanFromAdObject("avoms", Boolean.FALSE);
    }

    public List S() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        ArrayList arrayList = stringFromAdObject != null ? new ArrayList(CollectionUtils.explode(stringFromAdObject)) : new ArrayList(this.sdk.c(z4.G0));
        if (q7.j(l.p())) {
            arrayList.add("https://p.applov.in/");
        }
        return arrayList;
    }

    public boolean S0() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", Boolean.TRUE);
    }

    public List T() {
        return getStringListFromAdObject("rea", Q());
    }

    public boolean T0() {
        return getBooleanFromAdObject("require_interaction_for_click", Boolean.FALSE);
    }

    public com.applovin.impl.adview.e.a U() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? p() : a(intFromAdObject);
    }

    public boolean U0() {
        return getBooleanFromAdObject("sruifwvc", Boolean.FALSE);
    }

    public List V() {
        return getStringListFromAdObject("substrings_for_disabled_click_logic", Collections.EMPTY_LIST);
    }

    public boolean V0() {
        return g() >= 0;
    }

    public c W() {
        c cVar = c.DEFAULT;
        String upperCase = getStringFromAdObject("ad_target", cVar.toString()).toUpperCase(Locale.ENGLISH);
        if ("ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase)) {
            return c.ACTIVITY_PORTRAIT;
        }
        return "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? c.ACTIVITY_LANDSCAPE : cVar;
    }

    public boolean W0() {
        return getBooleanFromAdObject("respect_adview_fully_watched", Boolean.FALSE);
    }

    public String X() {
        return this.f9357m;
    }

    public boolean X0() {
        return getBooleanFromAdObject("sscomt", Boolean.FALSE);
    }

    public String Y() {
        return this.f9356k;
    }

    public boolean Y0() {
        return getBooleanFromAdObject("sudbia", (Boolean) this.sdk.a(z4.R6));
    }

    public List Z() {
        return this.f9359o;
    }

    public boolean Z0() {
        return getBooleanFromAdObject("upiosp", Boolean.FALSE);
    }

    public Uri a0() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "https://assets.applovin.com/sound_on.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public abstract Uri b0();

    public void c(String str) {
        this.f9356k = str;
    }

    public long c0() {
        return getLongFromAdObject("close_delay", 0L);
    }

    public long d0() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    public List e() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new com.applovin.impl.sdk.ad.e(this, 8));
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public int e0() {
        return q7.c(getIntFromAdObject("video_completion_percent", -1));
    }

    public long f() {
        return getLongFromAdObject("ad_dismiss_delay_on_app_launch_ms", TimeUnit.SECONDS.toMillis(3L));
    }

    public List f0() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new com.applovin.impl.sdk.ad.e(this, 9));
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("video_end_urls", new JSONObject()), getClCode(), g0(), this.sdk);
        }
        return listA;
    }

    public long g() {
        return getLongFromAdObject("ad_reshow_delay_on_app_launch_ms", -1L);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public abstract h4 getAdEventTracker();

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    public Bundle getCustomTabsHeaders() {
        Map map;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            map = (Map) j5Var.a(new com.applovin.impl.sdk.ad.e(this, 7));
        } else {
            try {
                map = JsonUtils.toStringMap(getJsonObjectFromAdObject("custom_tabs_http_headers", new JSONObject()));
            } catch (JSONException e10) {
                this.sdk.Q();
                if (p.a()) {
                    this.sdk.Q().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e10);
                }
                map = new HashMap();
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (getBooleanFromAdObject("custom_tabs_should_use_webview_ua", Boolean.FALSE)) {
            bundle.putString(Command.HTTP_HEADER_USER_AGENT, o8.a());
        }
        return bundle;
    }

    public List getCustomTabsNavigationAbortedPostbacks() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new com.applovin.impl.sdk.ad.e(this, 11));
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List getCustomTabsNavigationFailedPostbacks() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new com.applovin.impl.sdk.ad.e(this, 3));
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List getCustomTabsNavigationFinishedPostbacks() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new com.applovin.impl.sdk.ad.e(this, 5));
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List getCustomTabsNavigationStartedPostbacks() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new com.applovin.impl.sdk.ad.e(this, 1));
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public h1 getCustomTabsSettings() {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (h1) j5Var.a(new ae.b(26));
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("custom_tabs_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new h1(jsonObjectFromAdObject);
        }
        return null;
    }

    public List getCustomTabsTabHiddenPostbacks() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new com.applovin.impl.sdk.ad.e(this, 10));
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List getCustomTabsTabShownPostbacks() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new com.applovin.impl.sdk.ad.e(this, 0));
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List getCustomTabsWarmupUrls() {
        return getStringListFromAdObject("custom_tabs_warmup_urls", Collections.EMPTY_LIST);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public List getOpenMeasurementVerificationScriptResources() {
        List listA;
        com.applovin.impl.sdk.ad.e eVar = new com.applovin.impl.sdk.ad.e(this, 6);
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new a4.a(eVar, 11));
        }
        synchronized (this.adObjectLock) {
            listA = a(getJsonArrayFromAdObject("omid_verification_script_resources", null));
        }
        return listA;
    }

    public Bundle h() {
        return this.f9353h;
    }

    public e h0() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", null);
        if (ViewHierarchyConstants.DIMENSION_TOP_KEY.equals(stringFromAdObject)) {
            return e.TOP;
        }
        if ("bottom".equals(stringFromAdObject)) {
            return e.BOTTOM;
        }
        if ("left".equals(stringFromAdObject)) {
            return e.LEFT;
        }
        return TtmlNode.RIGHT.equals(stringFromAdObject) ? e.RIGHT : e.RESIZE_ASPECT;
    }

    public int i0() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    public boolean isCustomTabsClientWarmupEnabled() {
        return getBooleanFromAdObject("custom_tabs_client_warmup_enabled", Boolean.FALSE);
    }

    public boolean isCustomTabsEnabled() {
        return getBooleanFromAdObject("custom_tabs_enabled", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public abstract boolean isOpenMeasurementEnabled();

    public List j() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new com.applovin.impl.sdk.ad.e(this, 4));
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public boolean j0() {
        return getBooleanFromAdObject("progress_bar_enabled", Boolean.FALSE);
    }

    public abstract Uri k0();

    public Map l() {
        return this.f9349d;
    }

    public int l0() {
        int i10;
        if (q7.a(getSize())) {
            i10 = 1;
        } else {
            i10 = ((Boolean) this.sdk.a(z4.f10154g6)).booleanValue() ? 0 : -1;
        }
        return getIntFromAdObject("whalt", i10);
    }

    public int m() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.a(z4.Q1)).intValue());
    }

    public com.applovin.impl.adview.l m0() {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (com.applovin.impl.adview.l) j5Var.a(new ae.b(24));
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new com.applovin.impl.adview.l(jsonObjectFromAdObject);
        }
        return null;
    }

    public d n() {
        if (this.f9358n == null) {
            this.f9358n = new d();
        }
        return this.f9358n;
    }

    public List n0() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    public int o() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.a(z4.R1)).intValue());
    }

    public List o0() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    public void p0() {
        this.l++;
    }

    public int q() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.a(z4.S1)).intValue());
    }

    public boolean q0() {
        return this.l > 0;
    }

    public long r() {
        List listF = F();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (listF == null || listF.size() <= 0) ? 0L : ((Integer) listF.get(0)).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0L;
        }
        return longFromAdObject;
    }

    public boolean r0() {
        return getBooleanFromAdObject("bvde", (Boolean) this.sdk.a(z4.f10212n6));
    }

    public boolean s0() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.a(z4.P1));
    }

    public boolean shouldCustomTabsTrackEvents() {
        return getBooleanFromAdObject("custom_tabs_should_track_events", Boolean.FALSE);
    }

    public boolean t0() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", Boolean.FALSE);
    }

    public boolean u0() {
        return getBooleanFromAdObject("gase", Boolean.FALSE);
    }

    public boolean v0() {
        return getBooleanFromAdObject("lock_current_orientation", Boolean.FALSE);
    }

    public abstract boolean w0();

    public AtomicBoolean x0() {
        return this.f9350e;
    }

    public boolean y0() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.a(z4.f10117c2));
    }

    public boolean z0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE);
    }

    private List E() {
        return getIntegerListFromAdObject("multi_close_style", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List f(j5 j5Var) {
        return q7.a(defpackage.e.y(j5Var, "custom_tabs_navigation_finished_urls"), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List g(j5 j5Var) {
        return q7.a(defpackage.e.y(j5Var, "custom_tabs_navigation_started_urls"), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h1 h(j5 j5Var) {
        JSONObject jSONObjectA = j5Var.a("custom_tabs_settings", (JSONObject) null);
        if (jSONObjectA != null) {
            return new h1(jSONObjectA);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map l(j5 j5Var) {
        try {
            return JsonUtils.toStringMap(j5Var.a("http_headers_for_postbacks", new JSONObject()));
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List m(j5 j5Var) {
        return q7.a(defpackage.e.y(j5Var, "video_end_urls"), getClCode(), g0(), this.sdk);
    }

    public List A() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new com.applovin.impl.sdk.ad.e(this, 2));
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("imp_urls", new JSONObject()), getClCode(), null, null, J(), J0(), this.sdk);
        }
        return listA;
    }

    public int B() {
        return getIntFromAdObject("mdafra", ((Integer) this.sdk.a(z4.T0)).intValue());
    }

    public boolean C() {
        return getBooleanFromAdObject("playback_requires_user_action", Boolean.TRUE);
    }

    public List D() {
        List listE = E();
        if (listE == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listE.size());
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(a(((Integer) it.next()).intValue()));
        }
        return arrayList;
    }

    public List F() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", null);
    }

    public Uri G() {
        String stringFromAdObject = getStringFromAdObject("mute_image", "https://assets.applovin.com/sound_off.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public List H() {
        String stringFromAdObject = getStringFromAdObject("optional_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.EMPTY_LIST;
    }

    public void a(String str) {
        this.f9354i = str;
    }

    public void b(String str) {
        this.f9357m = str;
    }

    public long c() {
        return getLongFromAdObject("batfort", TimeUnit.SECONDS.toMillis(1L));
    }

    public com.applovin.impl.adview.e.a p() {
        List listE = E();
        int intFromAdObject = getIntFromAdObject("close_style", (listE == null || listE.size() <= 0) ? -1 : ((Integer) listE.get(0)).intValue());
        return intFromAdObject == -1 ? a(hasVideoUrl()) : a(intFromAdObject);
    }

    public int s() {
        return getColorFromAdObject("countdown_color", -922746881);
    }

    public int t() {
        return getIntFromAdObject("countdown_length", 0);
    }

    public boolean u() {
        return getBooleanFromAdObject("dismiss_on_skip", Boolean.FALSE);
    }

    public String v() {
        return this.f9354i;
    }

    public int w() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    public int x() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    public int y() {
        return q7.a(getIntFromAdObject("graphic_completion_percent", -1), 90);
    }

    public long z() {
        return this.f9355j;
    }

    private String c(MotionEvent motionEvent, boolean z10) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        Map mapA = a(motionEvent, z10);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, mapA);
        }
        return null;
    }

    public void a(long j10) {
        this.f9355j = j10;
    }

    public void b(boolean z10) {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            j5Var.a("html_resources_cached", z10);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putBoolean(this.adObject, "html_resources_cached", z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.adview.l n(j5 j5Var) {
        JSONObject jSONObjectA = j5Var.a("web_view_settings", (JSONObject) null);
        if (jSONObjectA != null) {
            return new com.applovin.impl.adview.l(jSONObjectA);
        }
        return null;
    }

    public void a(List list) {
        this.f9359o = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            try {
                URL url = new URL(JsonUtils.getString(jSONObject, "url", null));
                String string = JsonUtils.getString(jSONObject, "vendor_key", null);
                String string2 = JsonUtils.getString(jSONObject, "parameters", null);
                if (StringUtils.isValidString(string) && StringUtils.isValidString(string2)) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                }
            } catch (Throwable th2) {
                this.sdk.Q();
                if (p.a()) {
                    this.sdk.Q().a("DirectAd", "Failed to parse OMID verification script resource", th2);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map c(j5 j5Var) {
        try {
            return JsonUtils.toStringMap(j5Var.a("custom_tabs_http_headers", new JSONObject()));
        } catch (JSONException e10) {
            this.sdk.Q();
            if (p.a()) {
                this.sdk.Q().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e10);
            }
            return new HashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List e(j5 j5Var) {
        return q7.a(defpackage.e.y(j5Var, "custom_tabs_navigation_failed_urls"), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List j(j5 j5Var) {
        return q7.a(defpackage.e.y(j5Var, "custom_tabs_tab_shown_urls"), getClCode(), (String) null, this.sdk);
    }

    public void d() {
        this.f9351f.set(true);
    }

    public q4 i() {
        return (q4) this.f9352g.getAndSet(null);
    }

    public String k() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List b(j5 j5Var) {
        return q7.a(defpackage.e.y(j5Var, "app_killed_urls"), getClCode(), (String) null, this.sdk);
    }

    private List b(MotionEvent motionEvent, boolean z10) {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new f(this, motionEvent, z10));
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("click_tracking_urls", new JSONObject()), a(motionEvent, z10), c(motionEvent, z10), J(), J0(), this.sdk);
        }
        return listA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List a(s.a aVar, j5 j5Var) {
        return (List) aVar.apply(j5Var.a("omid_verification_script_resources", (JSONArray) null));
    }

    public void a(String str, String str2) {
        this.f9349d.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(j5 j5Var) {
        return q7.a(defpackage.e.y(j5Var, "ad_closed_urls"), getClCode(), (String) null, this.sdk);
    }

    public List b(MotionEvent motionEvent) {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            listA = (List) j5Var.a(new h(11, this, motionEvent));
        } else {
            synchronized (this.adObjectLock) {
                listA = q7.a(getJsonObjectFromAdObject("video_click_tracking_urls", new JSONObject()), a(motionEvent, true), null, J(), J0(), this.sdk);
            }
        }
        return listA.isEmpty() ? b(motionEvent, true) : listA;
    }

    public List a(MotionEvent motionEvent) {
        return b(motionEvent, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(MotionEvent motionEvent, boolean z10, j5 j5Var) {
        return q7.a(defpackage.e.y(j5Var, "click_tracking_urls"), a(motionEvent, z10), c(motionEvent, z10), J(), J0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(MotionEvent motionEvent, j5 j5Var) {
        return q7.a(defpackage.e.y(j5Var, "video_click_tracking_urls"), a(motionEvent, true), null, J(), J0(), this.sdk);
    }

    private Map a(MotionEvent motionEvent, boolean z10) {
        Point pointB = p0.b(l.p());
        HashMap map = new HashMap(7);
        map.put("{CLCODE}", getClCode());
        map.put("{CLICK_X}", String.valueOf(motionEvent != null ? motionEvent.getRawX() : -1.0f));
        map.put("{CLICK_Y}", String.valueOf(motionEvent != null ? motionEvent.getRawY() : -1.0f));
        map.put("{SCREEN_WIDTH}", String.valueOf(pointB.x));
        map.put("{SCREEN_HEIGHT}", String.valueOf(pointB.y));
        map.put("{IS_VIDEO_CLICK}", String.valueOf(z10));
        return map;
    }

    public void a(q4 q4Var) {
        this.f9352g.set(q4Var);
    }

    private com.applovin.impl.adview.e.a a(boolean z10) {
        return z10 ? com.applovin.impl.adview.e.a.WHITE_ON_TRANSPARENT : com.applovin.impl.adview.e.a.WHITE_ON_BLACK;
    }

    public com.applovin.impl.adview.e.a a(int i10) {
        if (i10 == 1) {
            return com.applovin.impl.adview.e.a.WHITE_ON_TRANSPARENT;
        }
        if (i10 == 2) {
            return com.applovin.impl.adview.e.a.INVISIBLE;
        }
        if (i10 == 3) {
            return com.applovin.impl.adview.e.a.TRANSPARENT_SKIP;
        }
        return com.applovin.impl.adview.e.a.WHITE_ON_BLACK;
    }
}
