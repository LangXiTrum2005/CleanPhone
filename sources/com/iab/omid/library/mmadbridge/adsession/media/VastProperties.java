package com.iab.omid.library.mmadbridge.adsession.media;

import com.iab.omid.library.mmadbridge.utils.d;
import com.iab.omid.library.mmadbridge.utils.g;
import com.ironsource.X3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f25349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f25350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f25352d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f25349a = z10;
        this.f25350b = f10;
        this.f25351c = z11;
        this.f25352d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f25349a);
            if (this.f25349a) {
                jSONObject.put("skipOffset", this.f25350b);
            }
            jSONObject.put("autoPlay", this.f25351c);
            jSONObject.put(X3.i.L, this.f25352d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f25352d;
    }

    public Float getSkipOffset() {
        return this.f25350b;
    }

    public boolean isAutoPlay() {
        return this.f25351c;
    }

    public boolean isSkippable() {
        return this.f25349a;
    }
}
