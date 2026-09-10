package com.smartdigimkt.c8;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class j extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34359c;
    private final com.smartdigimkt.w6.l d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, Object> f34360e;

    public j(int i2, String str, com.smartdigimkt.w6.l lVar, Map<String, Object> map) {
        this.f34358b = i2;
        this.f34359c = str;
        this.d = lVar;
        this.f34360e = map;
    }

    @Override // com.smartdigimkt.c8.d
    public Map<String, String> g() {
        if (this.d == null) {
            return null;
        }
        HashMap map = new HashMap();
        com.smartdigimkt.w6.g gVarI = this.d.i();
        if (gVarI != null && com.smartdigimkt.m3.f.a(this.f34358b, gVarI)) {
            String strW = com.smartdigimkt.n8.c.w();
            if (!TextUtils.isEmpty(strW)) {
                map.put(Command.HTTP_HEADER_USER_AGENT, strW);
            }
        }
        return map;
    }

    @Override // com.smartdigimkt.c8.d
    public byte[] j() {
        return new byte[0];
    }

    @Override // com.smartdigimkt.c8.d
    public int l() {
        return 2;
    }

    @Override // com.smartdigimkt.c8.d
    public String m() {
        if (this.f34360e != null && !TextUtils.isEmpty(this.f34359c)) {
            try {
                for (Map.Entry<String, Object> entry : this.f34360e.entrySet()) {
                    String key = entry.getKey();
                    this.f34359c = this.f34359c.replaceAll("\\{" + key + "\\}", (String) entry.getValue());
                }
            } catch (Throwable unused) {
            }
        }
        return this.f34359c;
    }

    public com.smartdigimkt.w6.l n() {
        return this.d;
    }
}
