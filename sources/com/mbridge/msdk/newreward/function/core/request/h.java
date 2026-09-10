package com.mbridge.msdk.newreward.function.core.request;

import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.tracker.network.c0;
import com.mbridge.msdk.tracker.network.d0;
import com.mbridge.msdk.tracker.network.r;
import com.mbridge.msdk.tracker.network.u;
import com.mbridge.msdk.tracker.network.w;
import com.mbridge.msdk.tracker.network.y;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class h extends u<JSONObject> implements w.a {
    public static int A = 1;
    public static int z;
    private e w;
    private HashMap<String, String> x;
    private Map<String, String> y;

    public h(String str) {
        super(0, str, 0, "setting");
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public boolean a() {
        return true;
    }

    public void b(String str, String str2) {
        if (this.y == null) {
            this.y = new HashMap();
        }
        this.y.put(str, str2);
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public Map<String, String> f() {
        Map<String, String> map = this.y;
        if (map != null) {
            map.put("Charset", C.UTF8_NAME);
            return this.y;
        }
        HashMap map2 = new HashMap();
        this.y = map2;
        return map2;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public Map<String, String> i() {
        if (this.x == null) {
            this.x = new HashMap<>();
        }
        return this.x;
    }

    public void a(e eVar) {
        this.w = eVar;
    }

    public void a(Map<String, String> map) {
        if (this.x == null) {
            this.x = new HashMap<>();
        }
        if (map == null || map.isEmpty()) {
            return;
        }
        this.x.putAll(map);
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public w<JSONObject> a(r rVar) {
        if (rVar != null) {
            try {
                byte[] bArr = rVar.b;
                if (bArr != null && bArr.length != 0) {
                    return w.a(new JSONObject(new String(bArr, com.mbridge.msdk.tracker.network.toolbox.f.a(rVar.c))), com.mbridge.msdk.tracker.network.toolbox.f.a(rVar));
                }
            } catch (UnsupportedEncodingException e) {
                o0.b("RewardSettingRequest", "parseNetworkResponse UnsupportedEncodingException: ", e);
                return w.a(new com.mbridge.msdk.tracker.network.f(e));
            } catch (Exception e2) {
                o0.b("RewardSettingRequest", "parseNetworkResponse Exception: ", e2);
                return w.a(new c0(e2));
            }
        }
        return w.a(new y());
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public void a(JSONObject jSONObject) {
        e eVar = this.w;
        if (eVar == null) {
            return;
        }
        try {
            if (jSONObject == null) {
                eVar.a(this, new d(-1));
            } else {
                eVar.a(jSONObject, this);
            }
        } catch (Exception e) {
            o0.b("RewardSettingRequest", "onError Exception: ", e);
        }
    }

    @Override // com.mbridge.msdk.tracker.network.w.a
    public void a(d0 d0Var) {
        this.w.a(this, new d(-1, d0Var.getMessage()));
    }
}
