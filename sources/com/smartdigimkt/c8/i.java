package com.smartdigimkt.c8;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class i extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f34357c;

    public i(String str, String str2, boolean z2) {
        this.f34357c = z2;
        this.f34356b = str.replaceAll("\\{req_id\\}", str2 == null ? "" : str2);
    }

    @Override // com.smartdigimkt.c8.d
    public Map<String, String> g() {
        if (!this.f34357c) {
            return null;
        }
        HashMap map = new HashMap();
        String strW = com.smartdigimkt.n8.c.w();
        if (!TextUtils.isEmpty(strW)) {
            map.put(Command.HTTP_HEADER_USER_AGENT, strW);
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
        return this.f34356b;
    }
}
