package com.smartdigimkt.c8;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class c extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f34346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34347c;

    public void a(boolean z2) {
        this.f34347c = z2;
    }

    @Override // com.smartdigimkt.c8.d
    public JSONObject d() {
        JSONObject jSONObjectD = super.d();
        try {
            jSONObjectD.put("app_id", b());
            Map<String, String> map = this.f34346b;
            if (map != null && !map.isEmpty()) {
                jSONObjectD.put("cached", new JSONObject(this.f34346b));
            }
            String strR = com.smartdigimkt.m6.b.p().r();
            if (!TextUtils.isEmpty(strR)) {
                jSONObjectD.put(com.smartdigimkt.w7.a.h0, strR);
            }
            String strH = com.smartdigimkt.m6.b.p().h();
            if (TextUtils.isEmpty(strH)) {
                String strT = com.smartdigimkt.m6.b.p().t();
                com.smartdigimkt.m6.b.p().e(strT);
                jSONObjectD.put(com.smartdigimkt.w7.a.i0, strT);
            } else {
                jSONObjectD.put(com.smartdigimkt.w7.a.i0, strH);
            }
            jSONObjectD.put(com.smartdigimkt.w7.a.m0, com.smartdigimkt.n8.c.v(com.smartdigimkt.m6.b.p().k()));
            if (com.smartdigimkt.m6.b.p().C()) {
                jSONObjectD.put("is_test", 1);
            }
            jSONObjectD.put(com.smartdigimkt.w7.a.g0, com.smartdigimkt.r6.h.e().g());
            try {
                JSONObject jSONObject = new JSONObject();
                com.smartdigimkt.b7.a.a(com.smartdigimkt.m6.b.p().k()).a(jSONObject);
                if (jSONObject.length() > 0) {
                    jSONObjectD.put("sdk_ext", jSONObject.toString());
                }
            } catch (Throwable unused) {
            }
            jSONObjectD.putOpt("pil_s_fu", 1);
        } catch (Throwable unused2) {
        }
        return jSONObjectD;
    }

    @Override // com.smartdigimkt.c8.d
    public int e() {
        return 187;
    }

    @Override // com.smartdigimkt.c8.d
    public List<String> f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("anti");
        return arrayList;
    }

    @Override // com.smartdigimkt.c8.d
    public com.smartdigimkt.x7.c h() {
        return com.smartdigimkt.x7.c.a("app_strategy", b());
    }

    @Override // com.smartdigimkt.c8.d
    public int l() {
        return 1;
    }

    @Override // com.smartdigimkt.c8.d
    public String m() {
        return com.smartdigimkt.w7.d.e();
    }

    public Map<String, String> n() {
        return this.f34346b;
    }

    public boolean o() {
        return this.f34347c;
    }

    public void a(Map<String, String> map) {
        this.f34346b = map;
    }
}
