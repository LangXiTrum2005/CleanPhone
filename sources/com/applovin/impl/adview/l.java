package com.applovin.impl.adview;

import android.webkit.WebSettings;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f7514a;

    public l(JSONObject jSONObject) {
        this.f7514a = jSONObject;
    }

    public Integer a() {
        String string = JsonUtils.getString(this.f7514a, "mixed_content_mode", null);
        if (StringUtils.isValidString(string)) {
            if ("always_allow".equalsIgnoreCase(string)) {
                return 0;
            }
            if ("never_allow".equalsIgnoreCase(string)) {
                return 1;
            }
            if ("compatibility_mode".equalsIgnoreCase(string)) {
                return 2;
            }
        }
        return null;
    }

    public WebSettings.PluginState b() {
        String string = JsonUtils.getString(this.f7514a, "plugin_state", null);
        if (StringUtils.isValidString(string)) {
            if ("on".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON;
            }
            if ("on_demand".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON_DEMAND;
            }
            if ("off".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.OFF;
            }
        }
        return null;
    }

    public Boolean c() {
        return JsonUtils.getBoolean(this.f7514a, "geolocation_enabled", null);
    }

    public Boolean d() {
        return JsonUtils.getBoolean(this.f7514a, "allow_content_access", null);
    }

    public Boolean e() {
        return JsonUtils.getBoolean(this.f7514a, "allow_file_access", null);
    }

    public Boolean f() {
        return JsonUtils.getBoolean(this.f7514a, "allow_file_access_from_file_urls", null);
    }

    public Boolean g() {
        return JsonUtils.getBoolean(this.f7514a, "allow_universal_access_from_file_urls", null);
    }

    public Boolean h() {
        return JsonUtils.getBoolean(this.f7514a, "display_zoom_controls", null);
    }

    public Boolean i() {
        return JsonUtils.getBoolean(this.f7514a, "load_with_overview_mode", null);
    }

    public Boolean j() {
        return JsonUtils.getBoolean(this.f7514a, "need_initial_focus", null);
    }

    public Boolean k() {
        return JsonUtils.getBoolean(this.f7514a, "offscreen_pre_raster", null);
    }

    public Boolean l() {
        return JsonUtils.getBoolean(this.f7514a, "save_form_data", null);
    }

    public Boolean m() {
        return JsonUtils.getBoolean(this.f7514a, "algorithmic_darkening_allowed", null);
    }

    public Boolean n() {
        return JsonUtils.getBoolean(this.f7514a, "block_network_image", null);
    }

    public Boolean o() {
        return JsonUtils.getBoolean(this.f7514a, "loads_images_automatically", null);
    }

    public Boolean p() {
        return JsonUtils.getBoolean(this.f7514a, "use_built_in_zoom_controls", null);
    }

    public Boolean q() {
        return JsonUtils.getBoolean(this.f7514a, "use_wide_view_port", null);
    }
}
