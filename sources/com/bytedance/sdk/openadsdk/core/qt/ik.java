package com.bytedance.sdk.openadsdk.core.qt;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.core.ay;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.qt;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.slm.ri.fi;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.uq;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private ka lr;
    private final AtomicInteger ri = new AtomicInteger(0);
    private final Runnable ik = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qt.ik.3
        @Override // java.lang.Runnable
        public void run() {
            ik.this.ri();
        }
    };

    private JSONObject ik() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_id", qt.lr().ka());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr() {
        if (!lr.ri().xha()) {
            ri(false);
            return;
        }
        int iIncrementAndGet = this.ri.incrementAndGet();
        if (iIncrementAndGet > 3) {
            ri(false);
        } else {
            vr.lr().removeCallbacks(this.ik);
            vr.lr().postDelayed(this.ik, iIncrementAndGet * 10000);
        }
    }

    public void ri(ka kaVar) {
        this.lr = kaVar;
    }

    public void ri() {
        try {
            if (lr.ri().di()) {
                ri(true);
                return;
            }
            JSONObject jSONObjectIk = ik();
            com.bytedance.sdk.component.xha.lr.ka kaVarLr = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().lr();
            final String strRi = ig.ri("/api/ad/union/sdk/register_status/", false, true);
            kaVarLr.ik(strRi);
            kaVarLr.lr(Command.HTTP_HEADER_USER_AGENT, "");
            kaVarLr.fi(lr(jSONObjectIk).toString());
            kaVarLr.ri(6);
            kaVarLr.lr("register_stats");
            com.bytedance.sdk.openadsdk.nr.ik.ri(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.qt.ik.1
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar.lr("register_status");
                    riVar.xha(ik.this.ri(nr.ri()).toString());
                    return riVar;
                }
            });
            kaVarLr.ri(new com.bytedance.sdk.component.xha.ri.ri() { // from class: com.bytedance.sdk.openadsdk.core.qt.ik.2
                @Override // com.bytedance.sdk.component.xha.ri.ri
                public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, com.bytedance.sdk.component.xha.lr lrVar) {
                    String strKa = lrVar.ka();
                    if (!lrVar.di() || TextUtils.isEmpty(strKa)) {
                        ik.this.lr();
                        com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.qt.ik.2.2
                            @Override // com.bytedance.sdk.openadsdk.nr.ka
                            public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                riVar.lr("register_status");
                                riVar.xha(ik.this.ri(nr.ri()).toString());
                                return riVar;
                            }
                        });
                        if (ikVar != null) {
                            uq.ri(ikVar.fi());
                            fi.ri("register_status", strRi, lrVar.ri(), lrVar.lr(), null, null);
                            return;
                        }
                        return;
                    }
                    try {
                        com.bytedance.sdk.openadsdk.nr.ik.lr(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.qt.ik.2.1
                            @Override // com.bytedance.sdk.openadsdk.nr.ka
                            public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                riVar.lr("register_status");
                                riVar.xha(ik.this.ri(nr.ri()).toString());
                                return riVar;
                            }
                        });
                        uq.lr();
                        JSONObject jSONObject = new JSONObject(strKa);
                        String strRi2 = ay.ri(jSONObject.optInt("cypher", -1), jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                        if (TextUtils.isEmpty(strRi2)) {
                            ik.this.lr();
                            return;
                        }
                        ik.this.ri(ik.this.ri(new JSONObject(strRi2)));
                    } catch (Throwable unused) {
                        ik.this.lr();
                    }
                }

                @Override // com.bytedance.sdk.component.xha.ri.ri
                public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, IOException iOException) {
                    ik.this.lr();
                    com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.qt.ik.2.3
                        @Override // com.bytedance.sdk.openadsdk.nr.ka
                        public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                            com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                            riVar.lr("register_status");
                            riVar.xha(ik.this.ri(nr.ri()).toString());
                            return riVar;
                        }
                    });
                    if (ikVar != null) {
                        uq.ri(ikVar.fi());
                        fi.ri("register_status", ikVar.fi(), -1, iOException != null ? iOException.getMessage() : null, null, null);
                    }
                }
            });
        } catch (Throwable unused) {
            lr();
        }
    }

    private JSONObject lr(JSONObject jSONObject) {
        return ay.ri(PangleEncryptConstant.CryptDataScene.REGISTER_STATUS, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(boolean z) {
        ka kaVar = this.lr;
        if (kaVar != null) {
            kaVar.ri(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ri(JSONObject jSONObject) {
        int iIk = lr.ri().ik();
        if (jSONObject.has("app_reg")) {
            iIk = jSONObject.optInt("app_reg", -1);
            lr.ri().ri(iIk);
        }
        return iIk == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject ri(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("net_status", com.bytedance.sdk.component.utils.nr.ri(context) ? 1 : 0);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
