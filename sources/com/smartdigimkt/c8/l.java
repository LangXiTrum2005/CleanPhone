package com.smartdigimkt.c8;

import android.text.TextUtils;
import com.smartdigimkt.sdk.api.SDMAdxSetting;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class l extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f34365c;

    public l(String str) {
        this.f34364b = str;
    }

    public void a(Map<String, String> map) {
        this.f34365c = map;
    }

    @Override // com.smartdigimkt.c8.d
    public JSONObject d() {
        JSONObject jSONObjectD = super.d();
        try {
            jSONObjectD.put("app_id", b());
            jSONObjectD.put("pl_id", this.f34364b);
            jSONObjectD.put("session_id", com.smartdigimkt.m6.b.p().d(this.f34364b));
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
            Map<String, String> map = this.f34365c;
            if (map != null && !map.isEmpty()) {
                jSONObjectD.put("cached", new JSONObject(this.f34365c));
            }
            if (com.smartdigimkt.m6.b.p().c() != null) {
                jSONObjectD.put("ecpoffer", com.smartdigimkt.m6.b.p().c());
            }
            jSONObjectD.put(com.smartdigimkt.w7.a.H0, new JSONArray());
            jSONObjectD.put(com.smartdigimkt.w7.a.m0, com.smartdigimkt.n8.c.v(com.smartdigimkt.m6.b.p().k()));
            if (com.smartdigimkt.m6.b.p().C()) {
                com.smartdigimkt.m6.b.p().l().fillRequestParam(jSONObjectD);
            }
            jSONObjectD.put(com.smartdigimkt.w7.a.Q1, 1);
            if (SDMAdxSetting.getInstance().isAdxNetworkMode(this.f34364b)) {
                jSONObjectD.put("is_s", 1);
            }
        } catch (Throwable unused) {
        }
        return jSONObjectD;
    }

    @Override // com.smartdigimkt.c8.d
    public int e() {
        return 191;
    }

    @Override // com.smartdigimkt.c8.d
    public List<String> f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("anti");
        return arrayList;
    }

    @Override // com.smartdigimkt.c8.d
    public com.smartdigimkt.x7.c h() {
        return com.smartdigimkt.x7.c.a("placement_strategy", this.f34364b);
    }

    @Override // com.smartdigimkt.c8.d
    public int l() {
        return 1;
    }

    @Override // com.smartdigimkt.c8.d
    public String m() {
        return com.smartdigimkt.w7.d.g();
    }

    public String n() {
        return this.f34364b;
    }
}
