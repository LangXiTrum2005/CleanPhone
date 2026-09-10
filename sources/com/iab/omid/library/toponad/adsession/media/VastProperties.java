package com.iab.omid.library.toponad.adsession.media;

import com.iab.omid.library.toponad.utils.d;
import com.iab.omid.library.toponad.utils.g;
import com.smartdigimkt.expressad.advanced.js.NativeAdvancedJsUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f22326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f22327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f22328c;
    private final Position d;

    private VastProperties(boolean z2, Float f, boolean z3, Position position) {
        this.f22326a = z2;
        this.f22327b = f;
        this.f22328c = z3;
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
            jSONObject.put("skippable", this.f22326a);
            if (this.f22326a) {
                jSONObject.put("skipOffset", this.f22327b);
            }
            jSONObject.put(NativeAdvancedJsUtils.f34667l, this.f22328c);
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
        return this.f22327b;
    }

    public boolean isAutoPlay() {
        return this.f22328c;
    }

    public boolean isSkippable() {
        return this.f22326a;
    }
}
