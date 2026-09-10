package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.C0474n4;
import kotlin.jvm.internal.n;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class NativeAdProperties {
    private final AdOptionsPosition adOptionsPosition;
    private final AdOptionsPosition defaultAdOptionPosition;

    public NativeAdProperties(JSONObject config) {
        n.f(config, "config");
        this.defaultAdOptionPosition = AdOptionsPosition.BOTTOM_LEFT;
        this.adOptionsPosition = getAdOptionsPosition(config);
    }

    public final AdOptionsPosition getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    private final AdOptionsPosition getAdOptionsPosition(JSONObject jSONObject) {
        String position = jSONObject.optString(AdOptionsPosition.AD_OPTIONS_POSITION_KEY, this.defaultAdOptionPosition.toString());
        try {
            n.e(position, "position");
            return AdOptionsPosition.valueOf(position);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return this.defaultAdOptionPosition;
        }
    }
}
