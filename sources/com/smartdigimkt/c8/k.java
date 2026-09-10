package com.smartdigimkt.c8;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class k extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f34362c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f34363e;
    private com.smartdigimkt.w6.l f;
    private Map<String, Object> g;

    public k(int i2, com.smartdigimkt.w6.l lVar, String str, Map<String, Object> map) {
        this.d = i2;
        this.f = lVar;
        this.f34363e = str;
        this.g = map;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f34362c = new JSONObject(str);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                this.f34362c.put(entry.getKey(), entry.getValue());
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.c8.d
    public Map<String, String> g() {
        com.smartdigimkt.w6.g gVarI;
        Map<String, String> mapG = super.g();
        com.smartdigimkt.w6.l lVar = this.f;
        if (lVar != null && (gVarI = lVar.i()) != null && com.smartdigimkt.m3.f.a(this.d, gVarI)) {
            String strW = com.smartdigimkt.n8.c.w();
            if (!TextUtils.isEmpty(strW)) {
                mapG.put(Command.HTTP_HEADER_USER_AGENT, strW);
            }
        }
        return mapG;
    }

    @Override // com.smartdigimkt.c8.d
    public byte[] j() {
        return a(this.f34362c.toString());
    }

    @Override // com.smartdigimkt.c8.d
    public int l() {
        return 1;
    }

    @Override // com.smartdigimkt.c8.d
    public String m() {
        String strB = com.smartdigimkt.w7.d.b();
        this.f34361b = strB;
        return strB;
    }

    public JSONObject n() {
        return this.f34362c;
    }
}
