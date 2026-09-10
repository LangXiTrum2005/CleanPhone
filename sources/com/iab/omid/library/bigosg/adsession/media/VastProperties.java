package com.iab.omid.library.bigosg.adsession.media;

import com.iab.omid.library.bigosg.d.c;
import com.iab.omid.library.bigosg.d.e;
import com.smartdigimkt.expressad.advanced.js.NativeAdvancedJsUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f21643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21644c;
    private final Position d;

    private VastProperties(boolean z2, Float f, boolean z3, Position position) {
        this.f21642a = z2;
        this.f21643b = f;
        this.f21644c = z3;
        this.d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z2, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(false, null, z2, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z2, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z2, position);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f21642a);
            if (this.f21642a) {
                jSONObject.put("skipOffset", this.f21643b);
            }
            jSONObject.put(NativeAdvancedJsUtils.f34667l, this.f21644c);
            jSONObject.put("position", this.d);
            return jSONObject;
        } catch (JSONException e2) {
            c.a("VastProperties: JSON error", e2);
            return jSONObject;
        }
    }

    public final Position getPosition() {
        return this.d;
    }

    public final Float getSkipOffset() {
        return this.f21643b;
    }

    public final boolean isAutoPlay() {
        return this.f21644c;
    }

    public final boolean isSkippable() {
        return this.f21642a;
    }
}
