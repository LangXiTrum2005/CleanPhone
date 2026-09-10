package com.smartdigimkt.c8;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f34340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f34341c;
    String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f34342e;
    int f;
    String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f34343h;

    public a(com.smartdigimkt.v6.a aVar) {
        this.f34340b = aVar.f39168i;
        this.f34341c = aVar.f;
        this.d = aVar.f39163a;
        this.f34342e = aVar.f39165c;
        this.f = aVar.d;
        this.g = aVar.f39169l;
        this.f34343h = aVar.q;
    }

    @Override // com.smartdigimkt.c8.d
    public JSONObject d() {
        JSONObject jSONObjectD = super.d();
        try {
            jSONObjectD.put("app_id", com.smartdigimkt.m6.b.p().f());
            jSONObjectD.put("pl_id", this.d);
            jSONObjectD.put("session_id", com.smartdigimkt.m6.b.p().d(this.d));
            String strR = com.smartdigimkt.m6.b.p().r();
            if (!TextUtils.isEmpty(strR)) {
                jSONObjectD.put(com.smartdigimkt.w7.a.h0, strR);
            }
            jSONObjectD.put(com.smartdigimkt.w7.a.m0, com.smartdigimkt.n8.c.v(com.smartdigimkt.m6.b.p().k()));
        } catch (Exception unused) {
        }
        return jSONObjectD;
    }

    @Override // com.smartdigimkt.c8.d
    public int e() {
        return 34;
    }

    @Override // com.smartdigimkt.c8.d
    public com.smartdigimkt.x7.c h() {
        return com.smartdigimkt.x7.c.a("request");
    }

    @Override // com.smartdigimkt.c8.d
    public String k() {
        HashMap map = new HashMap();
        String strB = com.smartdigimkt.n8.b.b(d().toString());
        String strB2 = com.smartdigimkt.n8.b.b(i().toString());
        map.put("p", strB);
        map.put("p2", strB2);
        map.put("request_id", this.f34341c);
        map.put("bid_id", this.f34340b);
        return new JSONObject(map).toString();
    }

    @Override // com.smartdigimkt.c8.d
    public int l() {
        return 1;
    }

    @Override // com.smartdigimkt.c8.d
    public String m() {
        return !TextUtils.isEmpty(this.f34343h) ? this.f34343h : com.smartdigimkt.w7.d.a();
    }
}
