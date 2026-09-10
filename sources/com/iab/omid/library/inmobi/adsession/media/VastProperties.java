package com.iab.omid.library.inmobi.adsession.media;

import com.iab.omid.library.inmobi.utils.d;
import com.iab.omid.library.inmobi.utils.g;
import com.smartdigimkt.expressad.advanced.js.NativeAdvancedJsUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f21930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21931c;
    private final Position d;

    private VastProperties(boolean z2, Float f, boolean z3, Position position) {
        this.f21929a = z2;
        this.f21930b = f;
        this.f21931c = z3;
        this.d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z2, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z2, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z2, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z2, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f21929a);
            if (this.f21929a) {
                jSONObject.put("skipOffset", this.f21930b);
            }
            jSONObject.put(NativeAdvancedJsUtils.f34667l, this.f21931c);
            jSONObject.put("position", this.d);
            return jSONObject;
        } catch (JSONException e2) {
            d.a("VastProperties: JSON error", e2);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.d;
    }

    public Float getSkipOffset() {
        return this.f21930b;
    }

    public boolean isAutoPlay() {
        return this.f21931c;
    }

    public boolean isSkippable() {
        return this.f21929a;
    }
}
