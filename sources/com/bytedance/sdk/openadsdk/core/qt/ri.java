package com.bytedance.sdk.openadsdk.core.qt;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.core.ay;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.settings.sf;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.slm.ri.fi;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.uq;
import com.ironsource.L6;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private boolean ik;
    private final AtomicInteger ri = new AtomicInteger(0);
    private ka lr = null;
    private final Runnable ka = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qt.ri.3
        @Override // java.lang.Runnable
        public void run() {
            ri.this.ri();
        }
    };

    public ri(boolean z) {
        this.ik = false;
        this.ik = z;
    }

    private JSONObject ik() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tcstring", sf.lr(nr.ri()));
            jSONObject.put("tcf_gdpr", sf.ri(nr.ri()));
            jSONObject.put(L6.V0, com.bytedance.sdk.openadsdk.ihz.ri.lr.ri.ri().lr());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr() {
        if (!lr.ri().qt()) {
            ri(false);
            return;
        }
        int iIncrementAndGet = this.ri.incrementAndGet();
        if (iIncrementAndGet > 3) {
            ri(false);
        } else {
            vr.lr().removeCallbacks(this.ka);
            vr.lr().postDelayed(this.ka, iIncrementAndGet * 10000);
        }
    }

    public void ri(ka kaVar) {
        this.lr = kaVar;
    }

    public void ri() {
        try {
            if (!this.ik) {
                String strLr = sf.lr(nr.ri());
                int iRi = sf.ri(nr.ri());
                if (TextUtils.equals(strLr, sf.ka) && iRi == sf.fi && lr.ri().jbs()) {
                    ri(true);
                    return;
                }
            }
            JSONObject jSONObjectIk = ik();
            com.bytedance.sdk.component.xha.lr.ka kaVarLr = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().lr();
            final String strRi = ig.ri("/api/ad/union/sdk/compliance_status/", false, true);
            kaVarLr.ik(strRi);
            kaVarLr.lr(Command.HTTP_HEADER_USER_AGENT, "");
            kaVarLr.fi(lr(jSONObjectIk).toString());
            kaVarLr.ri(6);
            kaVarLr.lr("compliance_stats");
            com.bytedance.sdk.openadsdk.nr.ik.ri(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.qt.ri.1
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar.lr("compliance_status");
                    riVar.xha(ri.this.ri(nr.ri()).toString());
                    return riVar;
                }
            });
            kaVarLr.ri(new com.bytedance.sdk.component.xha.ri.ri() { // from class: com.bytedance.sdk.openadsdk.core.qt.ri.2
                @Override // com.bytedance.sdk.component.xha.ri.ri
                public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, com.bytedance.sdk.component.xha.lr lrVar) {
                    String strKa = lrVar.ka();
                    if (!lrVar.di() || TextUtils.isEmpty(strKa)) {
                        ri.this.lr();
                        com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.qt.ri.2.2
                            @Override // com.bytedance.sdk.openadsdk.nr.ka
                            public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                riVar.lr("compliance_status");
                                riVar.xha(ri.this.ri(nr.ri()).toString());
                                return riVar;
                            }
                        });
                        if (ikVar != null) {
                            uq.ri(ikVar.fi());
                            fi.ri("compliance_status", strRi, lrVar.ri(), lrVar.lr(), null, null);
                            return;
                        }
                        return;
                    }
                    try {
                        com.bytedance.sdk.openadsdk.nr.ik.lr(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.qt.ri.2.1
                            @Override // com.bytedance.sdk.openadsdk.nr.ka
                            public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                riVar.lr("compliance_status");
                                riVar.xha(ri.this.ri(nr.ri()).toString());
                                return riVar;
                            }
                        });
                        uq.lr();
                        JSONObject jSONObject = new JSONObject(strKa);
                        String strRi2 = ay.ri(jSONObject.optInt("cypher", -1), jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                        if (TextUtils.isEmpty(strRi2)) {
                            ri.this.lr();
                            return;
                        }
                        if (!ri.this.ri(new JSONObject(strRi2))) {
                            ri.this.ri(false);
                        } else if (!ri.this.ik || TextUtils.isEmpty(sf.lr().ta())) {
                            ri.this.ri(true);
                        } else {
                            ri.this.ri(false);
                        }
                    } catch (Throwable unused) {
                        ri.this.lr();
                    }
                }

                @Override // com.bytedance.sdk.component.xha.ri.ri
                public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, IOException iOException) {
                    ri.this.lr();
                    com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.qt.ri.2.3
                        @Override // com.bytedance.sdk.openadsdk.nr.ka
                        public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                            com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                            riVar.lr("compliance_status");
                            riVar.xha(ri.this.ri(nr.ri()).toString());
                            return riVar;
                        }
                    });
                    if (ikVar != null) {
                        uq.ri(ikVar.fi());
                        fi.ri("compliance_status", ikVar.fi(), -1, iOException != null ? iOException.getMessage() : null, null, null);
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
        int iMj = lr.ri().mj();
        if (jSONObject.has("user_compliance_status")) {
            iMj = jSONObject.optInt("user_compliance_status", -1);
            lr.ri().lr(iMj);
        }
        if (jSONObject.has("user_compliance_status_reason")) {
            lr.ri().ri(jSONObject.optString("user_compliance_status_reason", ""));
        }
        if (jSONObject.has("allow_req_time")) {
            lr.ri().ri(jSONObject.optLong("allow_req_time", lr.ri.longValue()));
        }
        return iMj == 1 || iMj == 2;
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
