package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.umeng.analytics.pro.bc;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class KPU implements id {
    private static final Map<Integer, String> JXs = new HashMap<Integer, String>(12) { // from class: com.bytedance.sdk.openadsdk.core.KPU.1
        {
            put(1, "abtest");
            put(2, "user_data");
            put(3, "gaid");
            put(4, "apk-sign");
            put(5, "app_set_id_scope");
            put(6, "app_set_id");
            put(7, "installed_source");
            put(8, "app_running_time");
            put(9, "vendor");
            put(10, "model");
            put(11, "user_agent_device");
            put(12, "user_agent_webview");
            put(13, "sys_compiling_time");
            put(14, "sec_did");
            put(15, "url");
            put(16, "X-Argus");
            put(17, "X-Ladon");
            put(18, "X-Khronos");
            put(19, "X-Gorgon");
            put(20, "pangle_m");
            put(21, "screen_height");
            put(22, "screen_width");
            put(23, "rom_version");
            put(24, "carrier_name");
            put(25, bc.y);
            put(26, "conn_type");
            put(27, "boot");
            put(28, "feature_data");
            put(29, bc.bu);
            put(30, CampaignEx.JSON_KEY_AAB);
            put(31, "w_ver");
            put(32, "is_fold");
            put(33, "abi");
        }
    };
    boolean Lxb = false;
    boolean LD = false;
    String lk = "com.union_test.internationad";
    String ZU = "8025677";
    private int lc = 0;

    @Override // com.bytedance.sdk.openadsdk.core.id
    /* JADX INFO: renamed from: JXs, reason: merged with bridge method [inline-methods] */
    public KPU LD(String str) {
        QAg.LD().lk(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.id
    /* JADX INFO: renamed from: ZU, reason: merged with bridge method [inline-methods] */
    public KPU Lxb(String str) {
        QAg.LD().Lxb(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.id
    public int ebl() {
        return this.lc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.id
    public int lc() {
        return QAg.LD().DY();
    }

    @Override // com.bytedance.sdk.openadsdk.core.id
    public id lk(int i) {
        QAg.LD().lk(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.id
    public String JXs() {
        return lk((String) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.id
    public id LD(int i) {
        QAg.LD().LD(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.id
    public id Lxb(int i) {
        QAg.LD().JXs(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.id
    public String ZU() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.core.id
    public id lc(int i) {
        QAg.LD().Lxb(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.id
    public int lk() {
        return QAg.LD().QAg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.id
    public id JXs(int i) {
        this.lc = i;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.id
    public int LD() {
        return QAg.LD().OY();
    }

    @Override // com.bytedance.sdk.openadsdk.core.id
    public id Lxb() {
        com.bytedance.sdk.component.utils.sLN.Lxb("PangleSDK-6504");
        com.bytedance.sdk.component.utils.sLN.LD();
        com.bytedance.sdk.component.ebl.Lxb.Lxb();
        com.bytedance.sdk.openadsdk.utils.Sfi.Lxb();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.id
    public id ZU(int i) {
        QAg.LD().lc(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.id
    public String lk(String str) {
        int size;
        nJ.nBu("getBiddingToken");
        com.bytedance.sdk.openadsdk.core.QAg.lk.Lxb();
        try {
            JSONObject jSONObject = new JSONObject();
            boolean z = false;
            jSONObject.put("is_init", STP.JXs() ? 1 : 0);
            String strNBu = kqm.ZU().nBu();
            String strDY = kqm.ZU().DY();
            if (strNBu != null && strDY != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("version", strNBu);
                jSONObject2.put("param", strDY);
                jSONObject.put("abtest", jSONObject2);
            }
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("package_name", nJ.JXs());
            jSONObject.put("user_data", DY.Lxb(TextUtils.isEmpty(str) ? null : new AdSlot.Builder().setCodeId(str).build()));
            jSONObject.put("ts", System.currentTimeMillis() / 1000);
            if (jSONObject.toString().getBytes().length <= 2680) {
                com.bytedance.sdk.openadsdk.core.settings.lc lcVarZU = kqm.ZU();
                if (lcVarZU.KPU("gaid")) {
                    jSONObject.put("gaid", com.bytedance.sdk.openadsdk.brP.Lxb.LD.Lxb.Lxb().LD());
                }
                jSONObject.put("app_reg", lcVarZU.Iyd() ? 1 : 0);
                Context contextLxb = kqm.Lxb();
                jSONObject.put("apk-sign", com.bytedance.sdk.openadsdk.common.LD.ebl());
                jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.ZU.LD());
                jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.ZU.lk());
                jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.ZU.ZU());
                jSONObject.put("app_running_time", (System.currentTimeMillis() - STP.Lxb()) / 1000);
                jSONObject.put("rewardedfull_link", com.bytedance.sdk.openadsdk.core.settings.VVE.TA().bm() ? 1 : 0);
                jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.OY.sLN.LD());
                jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.OY.sLN.lk());
                jSONObject.put("vendor", Build.MANUFACTURER);
                jSONObject.put("model", Build.MODEL);
                jSONObject.put("user_agent_device", nJ.LD());
                jSONObject.put("user_agent_webview", nJ.lk());
                jSONObject.put("sys_compiling_time", sLN.LD(contextLxb));
                jSONObject.put("screen_height", le.ZU(contextLxb));
                jSONObject.put("screen_width", le.lk(contextLxb));
                jSONObject.put("rom_version", com.bytedance.sdk.openadsdk.utils.CSn.Lxb());
                jSONObject.put("carrier_name", com.bytedance.sdk.openadsdk.utils.foI.Lxb());
                jSONObject.put(bc.y, Build.VERSION.RELEASE);
                jSONObject.put("conn_type", nJ.sLN(contextLxb));
                if (lcVarZU.KPU("boot")) {
                    jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                }
                nJ.Lxb(jSONObject);
                com.bytedance.sdk.openadsdk.core.QAg.lk.Lxb(jSONObject);
                com.bytedance.sdk.openadsdk.utils.lc.Lxb(jSONObject, contextLxb);
                size = JXs.size();
            } else {
                size = 2;
            }
            while (size > 0 && jSONObject.toString().getBytes().length > 2680) {
                jSONObject.remove(JXs.get(Integer.valueOf(size)));
                size--;
            }
            com.bytedance.sdk.openadsdk.lc.LD.Lxb().Lxb(jSONObject);
            if (com.bytedance.sdk.openadsdk.core.settings.VVE.Bj() && com.bytedance.sdk.openadsdk.core.settings.VVE.TA().Lxb(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN)) {
                z = true;
            }
            JSONObject jSONObjectLxb = Lxb(jSONObject, z);
            while (size > 0 && jSONObjectLxb.toString().getBytes().length > 4096) {
                jSONObject.remove(JXs.get(Integer.valueOf(size)));
                jSONObjectLxb = Lxb(jSONObject, z);
                size--;
            }
            if (com.bytedance.sdk.component.utils.sLN.ZU()) {
                Objects.toString(jSONObjectLxb);
                int length = jSONObjectLxb.toString().getBytes().length;
            }
            Objects.toString(jSONObjectLxb);
            return jSONObjectLxb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    private JSONObject Lxb(JSONObject jSONObject, boolean z) {
        JSONObject jSONObjectLxb;
        if (z) {
            jSONObjectLxb = PangleEncryptManager.encryptType4(jSONObject, new Sfi(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN));
            HD.Lxb(jSONObjectLxb);
        } else {
            jSONObjectLxb = com.bytedance.sdk.component.utils.Lxb.Lxb(jSONObject);
        }
        return jSONObjectLxb != null ? jSONObjectLxb : new JSONObject();
    }

    @Override // com.bytedance.sdk.openadsdk.core.id
    public boolean Lxb(String str, int i, String str2, String str3, String str4) {
        if (!this.lk.equals(kqm.Lxb().getPackageName()) || !this.ZU.equals(QAg.LD().ZU()) || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Method methodLxb = com.bytedance.sdk.component.utils.eK.Lxb("com.bytedance.sdk.openadsdk.TTC3Proxy", "verityPlayable", String.class, Integer.TYPE, String.class, String.class, String.class);
            if (methodLxb != null) {
                methodLxb.invoke(null, str, Integer.valueOf(i), str2, str3, str4);
            }
        } catch (Throwable unused) {
        }
        return true;
    }
}
