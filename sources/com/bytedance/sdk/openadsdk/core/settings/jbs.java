package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.su;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.aw;
import com.bytedance.sdk.openadsdk.core.ay;
import com.bytedance.sdk.openadsdk.core.co;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.oh;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.dw;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.uq;
import com.ironsource.L6;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import shimmery.dern;

/* JADX INFO: loaded from: classes2.dex */
public class jbs extends com.bytedance.sdk.component.mj.lr.ik {
    private final Set<fi> ik;
    private final mj lr;
    private final ri ri;

    public interface ri {
        void ri(boolean z);
    }

    public jbs(ri riVar, mj mjVar, fi... fiVarArr) {
        super("SetF");
        HashSet hashSet = new HashSet();
        this.ik = hashSet;
        this.ri = riVar;
        this.lr = mjVar;
        hashSet.addAll(Arrays.asList(fiVarArr));
    }

    private JSONObject lr(JSONObject jSONObject) {
        return ay.ri(PangleEncryptConstant.CryptDataScene.SETTINGS, jSONObject);
    }

    @Override // java.lang.Runnable
    public void run() {
        int iRi = su.ri(nr.ri(), 0L);
        if (iRi == 0) {
            this.ri.ri(false);
            return;
        }
        JSONObject jSONObjectRi = ri(iRi);
        com.bytedance.sdk.component.xha.lr.ka kaVarLr = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().lr();
        try {
            kaVarLr.ik(com.bytedance.sdk.openadsdk.jbs.ka.ri(kaVarLr, ig.ri("/api/ad/union/sdk/settings/", false, true)));
            kaVarLr.lr(Command.HTTP_HEADER_USER_AGENT, ig.ka());
        } catch (Exception unused) {
        }
        String string = lr(jSONObjectRi).toString();
        if (nr.ka().qh() && oh.ri().ka() == 1) {
            ig.ri("Pangle_Debug_Mode", string, nr.ri());
        }
        kaVarLr.ri(string, nr.ka().bu());
        kaVarLr.ri(6);
        kaVarLr.lr("setting");
        com.bytedance.sdk.openadsdk.nr.ik.ri(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.settings.jbs.1
            @Override // com.bytedance.sdk.openadsdk.nr.ka
            public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                riVar.lr("settings_fetch");
                return riVar;
            }
        });
        kaVarLr.ri(new com.bytedance.sdk.component.xha.ri.ri() { // from class: com.bytedance.sdk.openadsdk.core.settings.jbs.2
            @Override // com.bytedance.sdk.component.xha.ri.ri
            public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, com.bytedance.sdk.component.xha.lr lrVar) {
                JSONObject jSONObject;
                int iRi2 = lrVar.ri();
                String strKa = lrVar.ka();
                if (nr.ka().qh() && oh.ri().ka() == 1) {
                    ig.ri("Pangle_Debug_Mode", strKa, nr.ri());
                }
                if (lrVar.di() && !TextUtils.isEmpty(strKa)) {
                    try {
                        jSONObject = new JSONObject(strKa);
                    } catch (JSONException unused2) {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        String strRi = ay.ri(jSONObject.optInt("cypher", -1), jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                        if (!TextUtils.isEmpty(strRi)) {
                            try {
                                jSONObject = new JSONObject(strRi);
                            } catch (JSONException unused3) {
                            }
                        }
                        try {
                            jbs.this.ri(strRi, lrVar.ik());
                        } catch (Throwable unused4) {
                        }
                        try {
                            jbs.this.ri(jSONObject);
                            nr.ka().ri(System.currentTimeMillis());
                            com.bytedance.sdk.openadsdk.nr.ik.lr(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.settings.jbs.2.1
                                @Override // com.bytedance.sdk.openadsdk.nr.ka
                                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                    riVar.lr("settings_fetch");
                                    return riVar;
                                }
                            });
                            uq.lr();
                        } catch (Throwable unused5) {
                        }
                        jbs.this.ri.ri(true);
                        return;
                    }
                } else if (ikVar != null) {
                    uq.ri(ikVar.fi());
                }
                com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.settings.jbs.2.2
                    @Override // com.bytedance.sdk.openadsdk.nr.ka
                    public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                        com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                        riVar.lr("settings_fetch");
                        return riVar;
                    }
                });
                if (!lrVar.di()) {
                    com.bytedance.sdk.openadsdk.slm.ri.fi.ri("settings_fetch", ikVar.fi(), iRi2, lrVar.lr(), null, null);
                }
                jbs.this.ri.ri(false);
            }

            @Override // com.bytedance.sdk.component.xha.ri.ri
            public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, IOException iOException) {
                jbs.this.ri.ri(false);
                com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.settings.jbs.2.3
                    @Override // com.bytedance.sdk.openadsdk.nr.ka
                    public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                        com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                        riVar.lr("settings_fetch");
                        return riVar;
                    }
                });
                if (ikVar != null) {
                    uq.ri(ikVar.fi());
                    com.bytedance.sdk.openadsdk.slm.ri.fi.ri("settings_fetch", ikVar.fi(), -1, iOException != null ? iOException.getMessage() : null, null, null);
                }
            }
        });
        co.lr(aw.ri(nr.ri()));
        DeviceUtils.co();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(String str, Map<String, String> map) {
        int i = 1;
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                HashMap map2 = new HashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        map2.put(key.toLowerCase(Locale.US), entry.getValue());
                    }
                }
                String str2 = (String) map2.get("active-control");
                if (str2 != null) {
                    int i2 = Integer.parseInt(str2);
                    String str3 = (String) map2.get("ts");
                    if (str3 != null) {
                        long j = Long.parseLong(str3);
                        String str4 = (String) map2.get("pst");
                        String strAttabal = dern.attabal(str + i2 + j);
                        if (strAttabal != null && strAttabal.equalsIgnoreCase(str4)) {
                            i = i2;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        xha.ri(i);
    }

    public static JSONObject ri(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            sf sfVarKa = nr.ka();
            jSONObject.put(L6.B, Build.MODEL);
            jSONObject.put("device_city", ig.wjv());
            com.bytedance.sdk.openadsdk.ihz.ri.lr.ri.ri().ri(jSONObject);
            if (com.bytedance.sdk.openadsdk.core.qt.lr.ri().sf()) {
                jSONObject.put("pa_consent", com.bytedance.sdk.openadsdk.core.qt.lr().qt());
            }
            if (sfVarKa.igq("mcc")) {
                jSONObject.put("mcc", dw.lr());
            }
            Context contextRi = nr.ri();
            jSONObject.put("conn_type", ig.xha(i));
            jSONObject.put(L6.F, 1);
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("aos_api_level", Build.VERSION.SDK_INT);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("language", aw.lr());
            jSONObject.put("time_zone", ig.su());
            jSONObject.put("package_name", ig.di());
            jSONObject.put(X3.i.L, ig.ri() ? 1 : 2);
            jSONObject.put("app_version", ig.mj());
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("uuid", aw.ik(contextRi));
            String strKa = com.bytedance.sdk.openadsdk.core.qt.lr().ka();
            if (strKa != null) {
                jSONObject.put("app_id", strKa);
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put("ts", jCurrentTimeMillis);
            String strConcat = "";
            if (strKa != null) {
                strConcat = strKa.concat(String.valueOf(jCurrentTimeMillis)).concat(BuildConfig.VERSION_NAME);
            }
            jSONObject.put("req_sign", com.bytedance.sdk.component.utils.fi.ri(strConcat));
            jSONObject.put("tcstring", sf.lr(contextRi));
            jSONObject.put("tcf_gdpr", sf.ri(contextRi));
            jSONObject.put("lmt", DeviceUtils.ik());
            jSONObject.put("locale_language", DeviceUtils.ka());
            jSONObject.put(AppsFlyerProperties.CHANNEL, X3.i.Z);
            JSONObject jSONObjectDi = sfVarKa.di();
            if (jSONObjectDi != null) {
                jSONObject.put("digest", jSONObjectDi);
            }
            jSONObject.put("data_time", sfVarKa.xha());
            jSONObject.put("app_set_id_scope", ka.lr());
            jSONObject.put("app_set_id", ka.ik());
            jSONObject.put("installed_source", ka.ka());
            jSONObject.put("did", aw.ri(nr.ri()));
            jSONObject.put(L6.V0, com.bytedance.sdk.openadsdk.ihz.ri.lr.ri.ri().lr());
            String strXha = com.bytedance.sdk.openadsdk.core.qt.lr().xha();
            if (!TextUtils.isEmpty(strXha)) {
                jSONObject.put("mediation", strXha);
            }
            jSONObject.put(X3.i.G, DeviceUtils.ri(contextRi, true));
            jSONObject.put("adx_id", com.bytedance.sdk.openadsdk.core.qt.lr().uq());
            jSONObject.put("user_compliance_status", com.bytedance.sdk.openadsdk.core.qt.lr.ri().mj());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public boolean ri(JSONObject jSONObject) {
        this.lr.ri(jSONObject);
        for (fi fiVar : this.ik) {
            if (fiVar != null) {
                fiVar.ri(jSONObject);
            }
        }
        return this.lr.ik;
    }
}
