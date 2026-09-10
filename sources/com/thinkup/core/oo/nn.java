package com.thinkup.core.oo;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.datastore.preferences.protobuf.a;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.common.on.nnn;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class nn {
    private static final String o = "nn";
    private nm m;

    public nn(nm nmVar) {
        this.m = nmVar;
    }

    public nn() {
    }

    public final void o(Context context, final nnn nnnVar) {
        if (nnnVar == null) {
            return;
        }
        o(context, nnnVar, new com.thinkup.core.common.n0.o0o() { // from class: com.thinkup.core.oo.nn.1
            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadCanceled(int i2) {
            }

            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadError(int i2, String str, AdError adError) {
            }

            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadFinish(int i2, Object obj) {
                n0 n0VarO;
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    try {
                        jSONObject.put("updateTime", System.currentTimeMillis());
                        int iOptInt = jSONObject.optInt("pl_wf_st_type", 0);
                        if (nn.this.m != null && (n0VarO = nn.this.m.o(nnnVar.o0(), iOptInt)) != null) {
                            n0VarO.o(jSONObject, nnnVar.o0());
                        }
                    } catch (Throwable th) {
                        Log.e(nn.o, "parse place strategy error:" + th.getMessage());
                    }
                    n0 n0VarO2 = n0.o(nnnVar.o0(), jSONObject);
                    if (nn.this.m == null || n0VarO2 == null) {
                        return;
                    }
                    String unused = nn.o;
                    nnnVar.o0();
                    nnnVar.m0();
                    n0VarO2.omon();
                    nm nmVar = nn.this.m;
                    String strO0 = nnnVar.o0();
                    if (n0VarO2.o0om() != 1) {
                        jSONObject = null;
                    }
                    nmVar.o(strO0, n0VarO2, jSONObject, n0VarO2.omon());
                }
            }

            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadStart(int i2) {
            }
        });
    }

    public final void o(final Context context, final nnn nnnVar, com.thinkup.core.common.n0.o0o o0oVar) {
        if (nnnVar == null) {
            return;
        }
        com.thinkup.core.common.n.o0n.m().mnn();
        if (nnnVar.nm()) {
            com.thinkup.core.common.om.n.o();
            if (com.thinkup.core.common.om.n.n()) {
                final com.thinkup.core.common.n0.nm nmVar = new com.thinkup.core.common.n0.nm(o0oVar);
                com.thinkup.core.common.mo.o();
                String strN = com.thinkup.core.common.mo.n();
                final String strOo = com.thinkup.core.common.ooo.o00.oo(strN);
                new com.thinkup.core.common.n0.o0n(context, nnnVar).m(strN).o(0, (com.thinkup.core.common.n0.o0o) nmVar);
                com.thinkup.core.common.om.n.o().o(new com.thinkup.core.common.om.o0() { // from class: com.thinkup.core.oo.nn.2
                    @Override // com.thinkup.core.common.om.o0
                    public final void o(String str) {
                        String unused = nn.o;
                        if (TextUtils.isEmpty(str) || str.equals(strOo)) {
                            String strN2 = a.n("The cdnDomain(", str, ") is not equal to curPlDomain(", strOo, ").");
                            nmVar.onLoadError(0, strN2, ErrorCode.getErrorCode(ErrorCode.exception, "", strN2));
                            return;
                        }
                        boolean zO = nmVar.o();
                        String unused2 = nn.o;
                        nnnVar.o0();
                        if (zO) {
                            return;
                        }
                        com.thinkup.core.common.om.n.o();
                        com.thinkup.core.common.mo.o();
                        String strM = com.thinkup.core.common.om.n.m(com.thinkup.core.common.mo.n(), str);
                        String unused3 = nn.o;
                        new com.thinkup.core.common.n0.o0n(context, nnnVar).m(strM).oo0().o(0, (com.thinkup.core.common.n0.o0o) nmVar);
                    }
                });
                return;
            }
        }
        new com.thinkup.core.common.n0.o0n(context, nnnVar).o(0, o0oVar);
    }
}
