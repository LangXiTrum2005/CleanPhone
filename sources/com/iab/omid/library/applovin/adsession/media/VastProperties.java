package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.utils.d;
import com.iab.omid.library.applovin.utils.g;
import com.ironsource.X3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f25081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f25082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f25084d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f25081a = z10;
        this.f25082b = f10;
        this.f25083c = z11;
        this.f25084d = position;
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
            jSONObject.put("skippable", this.f25081a);
            if (this.f25081a) {
                jSONObject.put("skipOffset", this.f25082b);
            }
            jSONObject.put("autoPlay", this.f25083c);
            jSONObject.put(X3.i.L, this.f25084d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f25084d;
    }

    public Float getSkipOffset() {
        return this.f25082b;
    }

    public boolean isAutoPlay() {
        return this.f25083c;
    }

    public boolean isSkippable() {
        return this.f25081a;
    }
}
