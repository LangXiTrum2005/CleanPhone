package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.utils.d;
import com.iab.omid.library.ironsrc.utils.g;
import com.ironsource.X3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f25215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f25216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f25218d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f25215a = z10;
        this.f25216b = f10;
        this.f25217c = z11;
        this.f25218d = position;
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
            jSONObject.put("skippable", this.f25215a);
            if (this.f25215a) {
                jSONObject.put("skipOffset", this.f25216b);
            }
            jSONObject.put("autoPlay", this.f25217c);
            jSONObject.put(X3.i.L, this.f25218d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f25218d;
    }

    public Float getSkipOffset() {
        return this.f25216b;
    }

    public boolean isAutoPlay() {
        return this.f25217c;
    }

    public boolean isSkippable() {
        return this.f25215a;
    }
}
