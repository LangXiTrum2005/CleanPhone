package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.Ua;
import com.mbridge.msdk.foundation.download.Command;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class co {
    private static final AtomicInteger ri = new AtomicInteger(0);
    private static final AtomicBoolean lr = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static void ik() {
        ri.set(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ka() {
        if (ri.getAndIncrement() <= 0) {
            com.bytedance.sdk.openadsdk.utils.dzy.ri().schedule(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.co.2
                @Override // java.lang.Runnable
                public void run() {
                    co.lr(aw.ri(nr.ri()));
                }
            }, Ua.s, TimeUnit.MILLISECONDS);
        }
    }

    public static void lr(final String str) {
        if (com.bytedance.sdk.openadsdk.core.qt.lr.ri().fi()) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.dzy.lr(new com.bytedance.sdk.component.mj.lr.ik("ipv6") { // from class: com.bytedance.sdk.openadsdk.core.co.1
            @Override // java.lang.Runnable
            public void run() {
                final String strTan = com.bytedance.sdk.openadsdk.utils.ig.tan();
                com.bytedance.sdk.openadsdk.slm.ka.ri(0, strTan);
                com.bytedance.sdk.openadsdk.nr.ik.ri(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.co.1.1
                    @Override // com.bytedance.sdk.openadsdk.nr.ka
                    public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                        com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                        riVar.lr("ipv6");
                        return riVar;
                    }
                });
                if (TextUtils.isEmpty(strTan)) {
                    com.bytedance.sdk.openadsdk.slm.ka.ri(-1, strTan, -1, "url is null");
                    com.bytedance.sdk.openadsdk.slm.ri.fi.ri("ipv6", "", -2, "url is null", null, null);
                    com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.co.1.2
                        @Override // com.bytedance.sdk.openadsdk.nr.ka
                        public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                            com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                            riVar.lr("ipv6");
                            return riVar;
                        }
                    });
                    return;
                }
                com.bytedance.sdk.component.xha.lr.ka kaVarLr = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().lr();
                try {
                    kaVarLr.ik(strTan);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("connect_type", com.bytedance.sdk.component.utils.su.ri(nr.ri(), 0L));
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("device_id", Long.parseLong(str));
                    }
                    jSONObject.put("header", com.bytedance.sdk.openadsdk.ka.ri.ri.ri().lr());
                    JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new fr(PangleEncryptConstant.CryptDataScene.DUAL_EVENT));
                    if (jSONObjectEncryptType4 == null || jSONObjectEncryptType4.optInt("cypher") != 4) {
                        su.lr(false);
                    } else {
                        su.lr(true);
                        kaVarLr.lr("x-pgli18n", "4");
                        kaVarLr.lr("Content-Type", "application/json; charset=utf-8");
                    }
                    if (co.lr(jSONObjectEncryptType4)) {
                        jSONObject = jSONObjectEncryptType4;
                    }
                    kaVarLr.lr("Content-Type", "application/json; charset=utf-8");
                    kaVarLr.lr(Command.HTTP_HEADER_USER_AGENT, com.bytedance.sdk.openadsdk.utils.ig.ka());
                    kaVarLr.ri(jSONObject);
                    kaVarLr.ri(6);
                    kaVarLr.lr("send_i_p_v6");
                    kaVarLr.ri(new com.bytedance.sdk.component.xha.ri.ri() { // from class: com.bytedance.sdk.openadsdk.core.co.1.3
                        @Override // com.bytedance.sdk.component.xha.ri.ri
                        public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, com.bytedance.sdk.component.xha.lr lrVar) {
                            if (lrVar.di()) {
                                co.lr(lrVar.ka(), strTan);
                                return;
                            }
                            com.bytedance.sdk.openadsdk.slm.ka.ri(-1, strTan, lrVar.ri(), lrVar.lr());
                            com.bytedance.sdk.openadsdk.slm.ri.fi.ri("ipv6", strTan, lrVar.ri(), lrVar.lr(), null, null);
                            com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.co.1.3.1
                                @Override // com.bytedance.sdk.openadsdk.nr.ka
                                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                    riVar.lr("ipv6");
                                    return riVar;
                                }
                            });
                            co.ka();
                        }

                        @Override // com.bytedance.sdk.component.xha.ri.ri
                        public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, IOException iOException) {
                            if (iOException != null) {
                                com.bytedance.sdk.openadsdk.slm.ka.ri(-1, strTan, 1, iOException.getMessage());
                                com.bytedance.sdk.openadsdk.slm.ri.fi.ri("ipv6", strTan, -1, iOException.getMessage(), null, null);
                                com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.co.1.3.2
                                    @Override // com.bytedance.sdk.openadsdk.nr.ka
                                    public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                        com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                        riVar.lr("ipv6");
                                        return riVar;
                                    }
                                });
                            }
                            co.ka();
                        }
                    });
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.slm.ka.ri(-1, strTan, -2, e.getMessage());
                    com.bytedance.sdk.openadsdk.slm.ri.fi.ri("ipv6", strTan, -3, e.getMessage(), null, null);
                    com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.co.1.4
                        @Override // com.bytedance.sdk.openadsdk.nr.ka
                        public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                            com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                            riVar.lr("ipv6");
                            return riVar;
                        }
                    });
                    com.bytedance.sdk.component.utils.ac.ik("build ipv6 request failed:" + e.getMessage(), new Object[0]);
                }
            }
        });
    }

    public static class ri implements com.bytedance.sdk.component.utils.su.ri {
        private static final AtomicBoolean ri = new AtomicBoolean(false);
        private static volatile long lr = -1;

        private ri() {
        }

        public static void ri() {
            if (ri.compareAndSet(false, true)) {
                lr = System.currentTimeMillis();
                com.bytedance.sdk.component.utils.su.ri(new ri(), nr.ri());
            }
        }

        public void lr() {
            com.bytedance.sdk.component.utils.su.ri(this);
        }

        @Override // com.bytedance.sdk.component.utils.su.ri
        public void ri(Context context, Intent intent, boolean z, int i) {
            if (System.currentTimeMillis() - lr >= 2000 && i != 0) {
                co.ik();
                co.lr(aw.ri(nr.ri()));
                lr();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lr(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("cypher") != 4) {
                com.bytedance.sdk.openadsdk.slm.ka.ri(-1, str2, 1, "cypher type error");
                com.bytedance.sdk.openadsdk.slm.ri.fi.ri("ipv6", str2, -4, "cypher type error", null, null);
                com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.co.3
                    @Override // com.bytedance.sdk.openadsdk.nr.ka
                    public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                        com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                        riVar.lr("ipv6");
                        return riVar;
                    }
                });
                return;
            }
            Pair<Integer, String> pairDecryptType4 = PangleEncryptManager.decryptType4(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
            if (pairDecryptType4.second != null) {
                JSONObject jSONObject2 = new JSONObject((String) pairDecryptType4.second);
                String strOptString = jSONObject2.optString("ip_type");
                int iHashCode = strOptString.hashCode();
                if (iHashCode != 3239397) {
                    if (iHashCode != 3239399) {
                        if (iHashCode == 1959784951 && strOptString.equals("invalid")) {
                            return;
                        }
                    } else if (strOptString.equals("ipv6")) {
                        if (jSONObject2.has("ip")) {
                            String strOptString2 = jSONObject2.optString("ip");
                            com.bytedance.sdk.openadsdk.tan.ka.ri.ri("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, strOptString2);
                            com.bytedance.sdk.openadsdk.tan.ka.ri.ri("ttopenadsdk", "key_ipv4");
                            HashMap map = new HashMap();
                            map.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, strOptString2);
                            com.bytedance.sdk.openadsdk.core.sf.ik.ri(map);
                            com.bytedance.sdk.openadsdk.slm.ka.ri(1, str2);
                            com.bytedance.sdk.openadsdk.nr.ik.lr(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.co.5
                                @Override // com.bytedance.sdk.openadsdk.nr.ka
                                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                    riVar.lr("ipv6");
                                    return riVar;
                                }
                            });
                            return;
                        }
                        com.bytedance.sdk.openadsdk.slm.ka.ri(-1, str2, 4, "no ip");
                        com.bytedance.sdk.openadsdk.slm.ri.fi.ri("ipv6", str2, -6, "no ip", null, null);
                        com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.co.6
                            @Override // com.bytedance.sdk.openadsdk.nr.ka
                            public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                riVar.lr("ipv6");
                                return riVar;
                            }
                        });
                        return;
                    }
                } else if (strOptString.equals("ipv4")) {
                    if (jSONObject2.has("ip")) {
                        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("ttopenadsdk", "key_ipv4", jSONObject2.optString("ip"));
                        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6);
                        com.bytedance.sdk.openadsdk.slm.ka.ri(1, str2);
                        com.bytedance.sdk.openadsdk.nr.ik.lr(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.co.7
                            @Override // com.bytedance.sdk.openadsdk.nr.ka
                            public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                riVar.lr("ipv6");
                                return riVar;
                            }
                        });
                        return;
                    }
                    com.bytedance.sdk.openadsdk.slm.ka.ri(-1, str2, 4, "no ip");
                    com.bytedance.sdk.openadsdk.slm.ri.fi.ri("ipv6", str2, -6, "no ip", null, null);
                    com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.co.8
                        @Override // com.bytedance.sdk.openadsdk.nr.ka
                        public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                            com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                            riVar.lr("ipv6");
                            return riVar;
                        }
                    });
                    return;
                }
                com.bytedance.sdk.openadsdk.slm.ka.ri(-1, str2, 3, "no ip type ");
                com.bytedance.sdk.openadsdk.slm.ri.fi.ri("ipv6", str2, -7, "no ip type ", null, null);
                com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.co.9
                    @Override // com.bytedance.sdk.openadsdk.nr.ka
                    public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                        com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                        riVar.lr("ipv6");
                        return riVar;
                    }
                });
                return;
            }
            int iIntValue = ((Integer) pairDecryptType4.first).intValue();
            com.bytedance.sdk.openadsdk.slm.ka.ri(-1, str2, 2, "decrypt failed ".concat(String.valueOf(iIntValue)));
            com.bytedance.sdk.openadsdk.slm.ri.fi.ri("ipv6", str2, -5, "decrypt failed ".concat(String.valueOf(iIntValue)), null, null);
            com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.co.4
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar.lr("ipv6");
                    return riVar;
                }
            });
        } catch (JSONException unused) {
            com.bytedance.sdk.openadsdk.slm.ka.ri(-1, str2, 2, "decrypt failed, wrong data ");
            com.bytedance.sdk.openadsdk.slm.ri.fi.ri("ipv6", str2, -8, "decrypt failed, wrong data ", null, null);
            com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.co.10
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar.lr("ipv6");
                    return riVar;
                }
            });
        }
    }

    public static void ri(String str) {
        AtomicBoolean atomicBoolean = lr;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!com.bytedance.sdk.component.utils.nr.mj(nr.ri())) {
                atomicBoolean.set(false);
            } else {
                ri.ri();
                lr(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lr(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }
}
