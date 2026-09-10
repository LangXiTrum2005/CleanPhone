package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3051ha extends U8 {
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f23662h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3051ha(String vendorKey, String str, String url, HashMap map) {
        super(url, 0, "OMID_VIEWABILITY", map);
        Intrinsics.f(vendorKey, "vendorKey");
        Intrinsics.f(url, "url");
        this.f23662h = vendorKey;
        this.g = str;
    }

    @Override // com.inmobi.media.U8
    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "url_ping");
            jSONObject.put("url", this.d);
            jSONObject.put("eventType", this.f23265b);
            jSONObject.put("eventId", this.f23264a);
            if (B2.a(this.f23662h)) {
                jSONObject.put("vendorKey", this.f23662h);
            }
            if (B2.a(this.g)) {
                jSONObject.put("verificationParams", this.g);
            }
            Map map = this.f23266c;
            boolean z2 = T9.f23231a;
            if (map == null) {
                map = new HashMap();
            }
            jSONObject.put("extras", T9.a(",", map));
            String string = jSONObject.toString();
            Intrinsics.e(string, "toString(...)");
            return string;
        } catch (JSONException e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
            return "";
        }
    }
}
