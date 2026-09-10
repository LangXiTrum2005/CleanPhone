package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.HD;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.foI;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SG;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class STP extends com.bytedance.sdk.component.OY.OY {
    private final NXR LD;
    private final Lxb Lxb;
    private final Set<JXs> lk;

    public interface Lxb {
        void Lxb(boolean z);
    }

    public STP(Lxb lxb, NXR nxr, JXs... jXsArr) {
        super("SetF");
        HashSet hashSet = new HashSet();
        this.lk = hashSet;
        this.Lxb = lxb;
        this.LD = nxr;
        hashSet.addAll(Arrays.asList(jXsArr));
    }

    private JSONObject LD(JSONObject jSONObject) {
        return com.bytedance.sdk.component.utils.Lxb.Lxb(jSONObject);
    }

    @Override // java.lang.Runnable
    public void run() {
        int iLxb = HD.Lxb(kqm.Lxb(), 0L);
        if (iLxb == 0) {
            this.Lxb.Lxb(false);
            return;
        }
        final com.bytedance.sdk.openadsdk.STP.Lxb.JXs jXs = new com.bytedance.sdk.openadsdk.STP.Lxb.JXs(1);
        JSONObject jSONObjectLxb = Lxb(iLxb);
        com.bytedance.sdk.component.ebl.LD.ZU zuLD = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().LD();
        try {
            String strLxb = com.bytedance.sdk.openadsdk.OY.ZU.Lxb(zuLD, nJ.ZU("/api/ad/union/sdk/settings/"));
            zuLD.LD(strLxb);
            zuLD.LD("User-Agent", nJ.lk());
            jXs.Lxb(strLxb);
        } catch (Exception unused) {
        }
        String string = LD(jSONObjectLxb).toString();
        if (kqm.ZU().Ld() && foI.Lxb().ebl() == 1) {
            nJ.Lxb("Pangle_Debug_Mode", string, kqm.Lxb());
        }
        zuLD.Lxb(string, kqm.ZU().kqm());
        jXs.Lxb(zuLD.ZU()).Lxb();
        zuLD.Lxb(6);
        zuLD.Lxb("setting");
        com.bytedance.sdk.openadsdk.VVE.lk.Lxb(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.core.settings.STP.1
            @Override // com.bytedance.sdk.openadsdk.VVE.ZU
            public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                return AbstractC3950lJ.l("settings_fetch");
            }
        });
        zuLD.Lxb(new com.bytedance.sdk.component.ebl.Lxb.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.settings.STP.2
            @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
            public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, com.bytedance.sdk.component.ebl.LD ld) {
                JSONObject jSONObject;
                int iOptInt;
                int iLxb2 = ld.Lxb();
                String strZU = ld.ZU();
                if (kqm.ZU().Ld() && foI.Lxb().ebl() == 1) {
                    nJ.Lxb("Pangle_Debug_Mode", strZU, kqm.Lxb());
                }
                if (!ld.lc() || TextUtils.isEmpty(strZU)) {
                    com.bytedance.sdk.openadsdk.VVE.lk.lk(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.core.settings.STP.2.2
                        @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                        public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                            return AbstractC3950lJ.l("settings_fetch");
                        }
                    });
                } else {
                    jXs.lk(strZU).Lxb(iLxb2).Lxb(true);
                    String strLk = null;
                    try {
                        jSONObject = new JSONObject(strZU);
                    } catch (JSONException unused2) {
                        jSONObject = null;
                    }
                    if (jSONObject != null && (iOptInt = jSONObject.optInt("cypher", -1)) != -1) {
                        if (iOptInt == 3) {
                            strLk = com.bytedance.sdk.component.utils.Lxb.lk(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                            if (!TextUtils.isEmpty(strLk)) {
                                try {
                                    jSONObject = new JSONObject(strLk);
                                } catch (Throwable unused3) {
                                }
                            }
                        }
                        try {
                            STP.this.Lxb(strLk, ld.lk());
                        } catch (Throwable unused4) {
                        }
                        try {
                            STP.this.Lxb(jSONObject);
                            kqm.ZU().Lxb(System.currentTimeMillis());
                            com.bytedance.sdk.openadsdk.VVE.lk.LD(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.core.settings.STP.2.1
                                @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                                public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                                    return AbstractC3950lJ.l("settings_fetch");
                                }
                            });
                        } catch (Throwable unused5) {
                        }
                        STP.this.Lxb.Lxb(true);
                        com.bytedance.sdk.openadsdk.core.nBu.Lxb.Lxb();
                        return;
                    }
                }
                jXs.lk(strZU).Lxb(iLxb2).ZU(ld.LD()).Lxb(ld.lc());
                STP.this.Lxb.Lxb(false);
            }

            @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
            public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, IOException iOException) {
                jXs.ZU(iOException != null ? iOException.getMessage() : null).Lxb(false);
                STP.this.Lxb.Lxb(false);
                com.bytedance.sdk.openadsdk.core.nBu.Lxb.Lxb();
                com.bytedance.sdk.openadsdk.VVE.lk.lk(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.core.settings.STP.2.3
                    @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                    public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                        return AbstractC3950lJ.l("settings_fetch");
                    }
                });
            }
        });
        DeviceUtils.JVA();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(String str, Map<String, String> map) {
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
                int i2 = Integer.parseInt((String) map2.get("active-control"));
                long j = Long.parseLong((String) map2.get("ts"));
                String str2 = (String) map2.get("pst");
                String strA = SG.a(str + i2 + j);
                if (strA != null && strA.equalsIgnoreCase(str2)) {
                    i = i2;
                }
            }
        } catch (Throwable unused) {
        }
        sLN.Lxb(i);
    }

    public static JSONObject Lxb(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            lc lcVarZU = kqm.ZU();
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("device_city", nJ.IeN());
            if (lcVarZU.KPU("gaid")) {
                jSONObject.put("gaid", com.bytedance.sdk.openadsdk.brP.Lxb.LD.Lxb.Lxb().LD());
            }
            jSONObject.put("gdpr", com.bytedance.sdk.openadsdk.core.QAg.LD().QAg());
            jSONObject.put("coppa", com.bytedance.sdk.openadsdk.core.QAg.LD().OY());
            jSONObject.put("ccpa", com.bytedance.sdk.openadsdk.core.QAg.LD().DY());
            if (lcVarZU.KPU("mcc")) {
                jSONObject.put("mcc", com.bytedance.sdk.openadsdk.utils.foI.LD());
            }
            Context contextLxb = kqm.Lxb();
            jSONObject.put("conn_type", nJ.ebl(i));
            jSONObject.put(bc.x, 1);
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(bc.y, Build.VERSION.RELEASE);
            jSONObject.put("aos_api_level", Build.VERSION.SDK_INT);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put(bc.N, com.bytedance.sdk.openadsdk.core.sLN.LD());
            jSONObject.put("time_zone", nJ.brP());
            jSONObject.put("package_name", nJ.JXs());
            jSONObject.put("position", nJ.Lxb() ? 1 : 2);
            jSONObject.put("app_version", nJ.ebl());
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.sLN.lk(contextLxb));
            String strZU = com.bytedance.sdk.openadsdk.core.QAg.LD().ZU();
            if (strZU != null) {
                jSONObject.put("app_id", strZU);
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put("ts", jCurrentTimeMillis);
            String strConcat = "";
            if (strZU != null) {
                strConcat = strZU.concat(String.valueOf(jCurrentTimeMillis)).concat(BuildConfig.VERSION_NAME);
            }
            jSONObject.put("req_sign", com.bytedance.sdk.component.utils.JXs.Lxb(strConcat));
            jSONObject.put("tcstring", VVE.lk(contextLxb));
            jSONObject.put("tcf_gdpr", VVE.LD(contextLxb));
            jSONObject.put("lmt", DeviceUtils.lk());
            jSONObject.put("locale_language", DeviceUtils.ZU());
            jSONObject.put("channel", "main");
            JSONObject jSONObjectJXs = lcVarZU.JXs();
            if (jSONObjectJXs != null) {
                jSONObject.put("digest", jSONObjectJXs);
            }
            jSONObject.put("data_time", lcVarZU.lc());
            jSONObject.put("app_set_id_scope", ZU.LD());
            jSONObject.put("app_set_id", ZU.lk());
            jSONObject.put("installed_source", ZU.ZU());
            if (lcVarZU.KPU("gaid")) {
                jSONObject.put("did", com.bytedance.sdk.openadsdk.core.sLN.Lxb(kqm.Lxb()));
            }
            String strJXs = com.bytedance.sdk.openadsdk.core.QAg.LD().JXs();
            if (!TextUtils.isEmpty(strJXs)) {
                jSONObject.put("mediation", strJXs);
            }
            jSONObject.put("device", DeviceUtils.Lxb(contextLxb, true));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public boolean Lxb(@NonNull JSONObject jSONObject) {
        this.LD.Lxb(jSONObject);
        for (JXs jXs : this.lk) {
            if (jXs != null) {
                jXs.Lxb(jSONObject);
            }
        }
        return this.LD.lk;
    }

    public static boolean Lxb() {
        return BinderPoolService.Lxb;
    }
}
