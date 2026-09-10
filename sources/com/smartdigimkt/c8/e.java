package com.smartdigimkt.c8;

import android.text.TextUtils;
import com.smartdigimkt.sdk.api.SDMAdxSetting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class e extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.smartdigimkt.l8.e f34350c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f34351e;
    private String f;

    public e(String str, com.smartdigimkt.l8.e eVar, List<JSONObject> list) {
        this.f34351e = "";
        this.f = "";
        this.f34349b = str;
        this.f34350c = eVar;
        try {
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                Iterator<JSONObject> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
            }
            this.d = com.smartdigimkt.n8.b.a(jSONArray.toString().getBytes());
            this.f34351e = com.smartdigimkt.n8.b.a(eVar.i().getBytes());
            this.f = com.smartdigimkt.n8.b.a(n().getBytes());
        } catch (Throwable unused) {
        }
    }

    private String n() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.smartdigimkt.b7.a.a(com.smartdigimkt.m6.b.p().k()).a(jSONObject);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.smartdigimkt.c8.d
    public JSONObject d() {
        JSONObject jSONObjectG;
        JSONObject jSONObjectD = super.d();
        com.smartdigimkt.l8.e eVar = this.f34350c;
        String strI = eVar != null ? eVar.I() : "";
        try {
            jSONObjectD.put("app_id", b());
            jSONObjectD.put("pl_id", strI);
            jSONObjectD.put("session_id", com.smartdigimkt.m6.b.p().d(strI));
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
            jSONObjectD.put(com.smartdigimkt.w7.a.n0, com.smartdigimkt.o6.a.b().d());
            jSONObjectD.put(com.smartdigimkt.w7.a.o0, com.smartdigimkt.o6.a.b().e());
            com.smartdigimkt.w7.a.a(jSONObjectD);
            com.smartdigimkt.l8.e eVar2 = this.f34350c;
            if (eVar2 != null && (jSONObjectG = eVar2.G()) != null) {
                jSONObjectD.put("p_c", jSONObjectG);
            }
            if (SDMAdxSetting.getInstance().isAdxNetworkMode(strI)) {
                jSONObjectD.put("is_s", 1);
            }
            boolean zB = com.smartdigimkt.n8.f.b();
            com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
            jSONObjectD.put("coppa", (aVarB.z() == 2 && zB) ? 1 : 2);
            jSONObjectD.put(com.smartdigimkt.w7.a.r0, aVarB.y() == 3 ? 1 : 2);
            jSONObjectD.put(com.smartdigimkt.w7.a.s0, 1);
            com.smartdigimkt.s6.c cVarB = com.smartdigimkt.m6.b.p().b();
            if (cVarB != null) {
                cVarB.fillRequestDataForDl(jSONObjectD);
            }
        } catch (Throwable unused) {
        }
        return jSONObjectD;
    }

    @Override // com.smartdigimkt.c8.d
    public int e() {
        return 246;
    }

    @Override // com.smartdigimkt.c8.d
    public List<String> f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("anti");
        return arrayList;
    }

    @Override // com.smartdigimkt.c8.d
    public com.smartdigimkt.x7.c h() {
        return com.smartdigimkt.x7.c.a("bid");
    }

    @Override // com.smartdigimkt.c8.d
    public JSONObject i() {
        return super.i();
    }

    @Override // com.smartdigimkt.c8.d
    public String k() {
        String string = d().toString();
        String string2 = i().toString();
        HashMap map = new HashMap();
        String strB = com.smartdigimkt.n8.b.b(string);
        String strB2 = com.smartdigimkt.n8.b.b(string2);
        map.put("p", strB);
        map.put("p2", strB2);
        map.put("hb_list", this.d);
        map.put("request_id", this.f34349b);
        com.smartdigimkt.l8.e eVar = this.f34350c;
        int iL = eVar != null ? eVar.L() : 0;
        if (iL > 0) {
            map.put(com.smartdigimkt.w7.a.v0, Integer.valueOf(iL));
        }
        map.put("adx_ext", this.f34351e);
        if (com.smartdigimkt.m6.b.p().c() != null) {
            map.put("ex_pkg", com.smartdigimkt.n8.b.b(com.smartdigimkt.m6.b.p().c().toString()));
        }
        if (com.smartdigimkt.m6.b.p().D() && com.smartdigimkt.m6.b.p().F()) {
            map.put("debug", 1);
        }
        if (!TextUtils.isEmpty(this.f)) {
            map.put("sdk_ext", this.f);
        }
        Set<String> setKeySet = map.keySet();
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : setKeySet) {
                jSONObject.put(str, map.get(str));
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        } catch (OutOfMemoryError unused2) {
            System.gc();
            return null;
        }
    }

    @Override // com.smartdigimkt.c8.d
    public int l() {
        return 1;
    }

    @Override // com.smartdigimkt.c8.d
    public String m() {
        return com.smartdigimkt.w7.d.f();
    }

    public com.smartdigimkt.l8.e o() {
        return this.f34350c;
    }
}
