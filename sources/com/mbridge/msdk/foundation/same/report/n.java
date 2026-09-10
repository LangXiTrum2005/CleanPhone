package com.mbridge.msdk.foundation.same.report;

import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.v;
import com.mbridge.msdk.tracker.w;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class n extends w {
    @Override // com.mbridge.msdk.tracker.w
    public v<String> a(q qVar) {
        String str;
        try {
            str = new String(qVar.f36961b, com.mbridge.msdk.tracker.network.toolbox.f.a(qVar.f36962c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(qVar.f36961b);
        }
        return v.a(str, com.mbridge.msdk.tracker.network.toolbox.f.a(qVar));
    }
}
