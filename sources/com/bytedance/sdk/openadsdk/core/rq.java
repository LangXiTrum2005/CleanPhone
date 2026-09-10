package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.impl.Z;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.foundation.download.Command;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.smartdigimkt.x.g;
import com.zg.adlib.storage.AppPreferencesKeys;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class rq {
    private static final AtomicInteger qdl = new AtomicInteger(0);
    private static final AtomicBoolean ud = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static void lnr() {
        qdl.set(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mml() {
        if (qdl.getAndIncrement() <= 0) {
            com.bytedance.sdk.openadsdk.utils.fco.qdl().schedule(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rq.2
                @Override // java.lang.Runnable
                public void run() {
                    rq.ud(fs.qdl(yt.qdl()));
                }
            }, 10000L, TimeUnit.MILLISECONDS);
        }
    }

    public static void ud(final String str) {
        com.bytedance.sdk.openadsdk.utils.fco.lnr(new com.bytedance.sdk.component.jpc.jpc("ipv6") { // from class: com.bytedance.sdk.openadsdk.core.rq.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObjectQdl;
                final String strExc = com.bytedance.sdk.openadsdk.utils.gy.exc();
                com.bytedance.sdk.openadsdk.bjy.lnr.qdl(0, strExc);
                com.bytedance.sdk.openadsdk.yt.lnr.qdl(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.rq.1.1
                    @Override // com.bytedance.sdk.openadsdk.yt.mml
                    public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                        return Z.i("ipv6");
                    }
                });
                if (TextUtils.isEmpty(strExc)) {
                    com.bytedance.sdk.openadsdk.bjy.lnr.qdl(-1, strExc, -1, "url is null");
                    com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("ipv6", "", -2, "url is null");
                    com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.rq.1.2
                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                            return Z.i("ipv6");
                        }
                    });
                    return;
                }
                com.bytedance.sdk.component.wd.ud.mml mmlVarUd = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().ud();
                try {
                    mmlVarUd.ud(strExc);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("connect_type", com.bytedance.sdk.component.utils.bqt.qdl(yt.qdl(), 0L));
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put(AppPreferencesKeys.DEVICE_ID, Long.parseLong(str));
                    }
                    jSONObject.put(g.f39716B, com.bytedance.sdk.openadsdk.mml.qdl.qdl.qdl().ud());
                    if (com.bytedance.sdk.openadsdk.core.settings.rq.lnr().qdl(PangleEncryptConstant.CryptDataScene.APP_LOG)) {
                        jSONObjectQdl = PangleEncryptManager.encryptType4(jSONObject, new bch(PangleEncryptConstant.CryptDataScene.DUAL_EVENT));
                        if (jSONObjectQdl == null || jSONObjectQdl.optInt("cypher") != 4) {
                            uw.ud(false);
                        } else {
                            uw.ud(true);
                            mmlVarUd.ud("x-pgli18n", "4");
                            mmlVarUd.ud("Content-Type", "application/json; charset=utf-8");
                        }
                    } else {
                        jSONObjectQdl = com.bytedance.sdk.component.utils.qdl.qdl(jSONObject);
                        if (rq.ud(jSONObjectQdl)) {
                            mmlVarUd.ud("Content-Encoding", "union_sdk_encode");
                        }
                    }
                    if (rq.ud(jSONObjectQdl)) {
                        jSONObject = jSONObjectQdl;
                    }
                    mmlVarUd.ud("Content-Type", "application/json; charset=utf-8");
                    mmlVarUd.ud(Command.HTTP_HEADER_USER_AGENT, com.bytedance.sdk.openadsdk.utils.gy.mml());
                    mmlVarUd.qdl(jSONObject);
                    mmlVarUd.qdl(6);
                    mmlVarUd.qdl("send_i_p_v6");
                    mmlVarUd.qdl(new com.bytedance.sdk.component.wd.qdl.qdl() { // from class: com.bytedance.sdk.openadsdk.core.rq.1.3
                        @Override // com.bytedance.sdk.component.wd.qdl.qdl
                        public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, com.bytedance.sdk.component.wd.ud udVar) {
                            if (udVar.mo()) {
                                rq.ud(udVar.mml(), strExc);
                                return;
                            }
                            com.bytedance.sdk.openadsdk.bjy.lnr.qdl(-1, strExc, udVar.qdl(), udVar.ud());
                            com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("ipv6", strExc, udVar.qdl(), udVar.ud());
                            com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.rq.1.3.1
                                @Override // com.bytedance.sdk.openadsdk.yt.mml
                                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                    return Z.i("ipv6");
                                }
                            });
                            rq.mml();
                        }

                        @Override // com.bytedance.sdk.component.wd.qdl.qdl
                        public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, IOException iOException) {
                            if (iOException != null) {
                                com.bytedance.sdk.openadsdk.bjy.lnr.qdl(-1, strExc, 1, iOException.getMessage());
                                com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("ipv6", strExc, -1, iOException.getMessage());
                                com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.rq.1.3.2
                                    @Override // com.bytedance.sdk.openadsdk.yt.mml
                                    public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                        return Z.i("ipv6");
                                    }
                                });
                            }
                            rq.mml();
                        }
                    });
                } catch (Exception e2) {
                    com.bytedance.sdk.openadsdk.bjy.lnr.qdl(-1, strExc, -2, e2.getMessage());
                    com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("ipv6", strExc, -3, e2.getMessage());
                    com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.rq.1.4
                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                            return Z.i("ipv6");
                        }
                    });
                    com.bytedance.sdk.component.utils.aaj.lnr(Z.m(e2, new StringBuilder("build ipv6 request failed:")), new Object[0]);
                }
            }
        });
    }

    public static class qdl implements com.bytedance.sdk.component.utils.bqt.qdl {
        private static final AtomicBoolean qdl = new AtomicBoolean(false);
        private static volatile long ud = -1;

        private qdl() {
        }

        public static void qdl() {
            if (qdl.compareAndSet(false, true)) {
                ud = System.currentTimeMillis();
                com.bytedance.sdk.component.utils.bqt.qdl(new qdl(), yt.qdl());
            }
        }

        public void ud() {
            com.bytedance.sdk.component.utils.bqt.qdl(this);
        }

        @Override // com.bytedance.sdk.component.utils.bqt.qdl
        public void qdl(Context context, Intent intent, boolean z2, int i2) {
            if (System.currentTimeMillis() - ud >= 2000 && i2 != 0) {
                rq.lnr();
                rq.ud(fs.qdl(yt.qdl()));
                ud();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    public static void ud(String str, String str2) {
        byte b2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("cypher") != 4) {
                com.bytedance.sdk.openadsdk.bjy.lnr.qdl(-1, str2, 1, "cypher type error");
                com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("ipv6", str2, -4, "cypher type error");
                com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.rq.3
                    @Override // com.bytedance.sdk.openadsdk.yt.mml
                    public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                        return Z.i("ipv6");
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
                            b2 = 2;
                        } else {
                            b2 = -1;
                        }
                    } else if (strOptString.equals("ipv6")) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                } else if (strOptString.equals("ipv4")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
                if (b2 == 0) {
                    if (jSONObject2.has("ip")) {
                        String strOptString2 = jSONObject2.optString("ip");
                        com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, strOptString2);
                        com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("ttopenadsdk", "key_ipv4");
                        HashMap map = new HashMap();
                        map.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, strOptString2);
                        com.bytedance.sdk.openadsdk.core.to.ud.ud().qdl(map);
                        com.bytedance.sdk.openadsdk.bjy.lnr.qdl(1, str2);
                        com.bytedance.sdk.openadsdk.yt.lnr.ud(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.rq.5
                            @Override // com.bytedance.sdk.openadsdk.yt.mml
                            public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                return Z.i("ipv6");
                            }
                        });
                        return;
                    }
                    com.bytedance.sdk.openadsdk.bjy.lnr.qdl(-1, str2, 4, "no ip");
                    com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("ipv6", str2, -6, "no ip");
                    com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.rq.6
                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                            return Z.i("ipv6");
                        }
                    });
                    return;
                }
                if (b2 != 1) {
                    if (b2 != 2) {
                        com.bytedance.sdk.openadsdk.bjy.lnr.qdl(-1, str2, 3, "no ip type ");
                        com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("ipv6", str2, -7, "no ip type ");
                        com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.rq.9
                            @Override // com.bytedance.sdk.openadsdk.yt.mml
                            public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                return Z.i("ipv6");
                            }
                        });
                        return;
                    }
                    return;
                }
                if (jSONObject2.has("ip")) {
                    com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("ttopenadsdk", "key_ipv4", jSONObject2.optString("ip"));
                    com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6);
                    com.bytedance.sdk.openadsdk.bjy.lnr.qdl(1, str2);
                    com.bytedance.sdk.openadsdk.yt.lnr.ud(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.rq.7
                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                            return Z.i("ipv6");
                        }
                    });
                    return;
                }
                com.bytedance.sdk.openadsdk.bjy.lnr.qdl(-1, str2, 4, "no ip");
                com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("ipv6", str2, -6, "no ip");
                com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.rq.8
                    @Override // com.bytedance.sdk.openadsdk.yt.mml
                    public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                        return Z.i("ipv6");
                    }
                });
                return;
            }
            int iIntValue = ((Integer) pairDecryptType4.first).intValue();
            com.bytedance.sdk.openadsdk.bjy.lnr.qdl(-1, str2, 2, "decrypt failed ".concat(String.valueOf(iIntValue)));
            com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("ipv6", str2, -5, "decrypt failed ".concat(String.valueOf(iIntValue)));
            com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.rq.4
                @Override // com.bytedance.sdk.openadsdk.yt.mml
                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                    return Z.i("ipv6");
                }
            });
        } catch (JSONException unused) {
            com.bytedance.sdk.openadsdk.bjy.lnr.qdl(-1, str2, 2, "decrypt failed, wrong data ");
            com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("ipv6", str2, -8, "decrypt failed, wrong data ");
            com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.rq.10
                @Override // com.bytedance.sdk.openadsdk.yt.mml
                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                    return Z.i("ipv6");
                }
            });
        }
    }

    public static void qdl(String str) {
        AtomicBoolean atomicBoolean = ud;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!com.bytedance.sdk.component.utils.jl.jpc(yt.qdl())) {
                atomicBoolean.set(false);
            } else {
                qdl.qdl();
                ud(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean ud(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }
}
