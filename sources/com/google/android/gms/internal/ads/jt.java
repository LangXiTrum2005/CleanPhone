package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jt implements d81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16179c;

    public /* synthetic */ jt(int i10, Object obj, Object obj2) {
        this.f16177a = i10;
        this.f16178b = obj;
        this.f16179c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.d81
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f16177a) {
            case 0:
                xs xsVar = (xs) obj;
                xsVar.k((String) this.f16178b, (oq) this.f16179c);
                return xsVar;
            default:
                tf0 tf0Var = (tf0) this.f16178b;
                JSONObject jSONObject = (JSONObject) this.f16179c;
                List list = (List) obj;
                tf0Var.getClass();
                if (list == null || list.isEmpty()) {
                    return null;
                }
                String strOptString = jSONObject.optString("text");
                Integer numC = tf0.c("bg_color", jSONObject);
                Integer numC2 = tf0.c("text_color", jSONObject);
                int iOptInt = jSONObject.optInt("text_size", -1);
                jSONObject.optBoolean("allow_pub_rendering");
                int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
                return new wn(strOptString, list, numC, numC2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, tf0Var.f20351h.f14034e);
        }
    }
}
