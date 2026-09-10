package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class U8 {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f23266c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f23267e;

    public U8(String url, int i2, String eventType, HashMap map) {
        Intrinsics.f(url, "url");
        Intrinsics.f(eventType, "eventType");
        this.f23264a = i2;
        this.f23265b = eventType;
        this.f23266c = map;
        int length = url.length() - 1;
        int i3 = 0;
        boolean z2 = false;
        while (i3 <= length) {
            boolean z3 = Intrinsics.h(url.charAt(!z2 ? i3 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                } else {
                    length--;
                }
            } else if (z3) {
                i3++;
            } else {
                z2 = true;
            }
        }
        this.d = I7.a(length, 1, url, i3);
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "url_ping");
            jSONObject.put("url", this.d);
            jSONObject.put("eventType", this.f23265b);
            jSONObject.put("eventId", this.f23264a);
            boolean z2 = T9.f23231a;
            Map map = this.f23266c;
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
