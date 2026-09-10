package com.inmobi.media;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Ke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f22932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22933b;

    public Ke(byte b2, String str) {
        this.f22932a = b2;
        this.f22933b = str;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            byte b2 = this.f22932a;
            String str = "unknown";
            if (b2 != 0) {
                if (b2 == 1) {
                    str = "static";
                } else if (b2 == 2) {
                    str = "html";
                } else if (b2 == 3) {
                    str = "iframe";
                }
            }
            jSONObject.put("type", str);
            jSONObject.put("content", this.f22933b);
            String string = jSONObject.toString();
            Intrinsics.e(string, "toString(...)");
            return string;
        } catch (JSONException e2) {
            List list = Le.f22955h;
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
            return "";
        }
    }
}
