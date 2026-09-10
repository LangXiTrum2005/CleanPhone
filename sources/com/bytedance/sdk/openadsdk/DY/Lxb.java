package com.bytedance.sdk.openadsdk.DY;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.HD;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.Sfi.ZU;
import com.bytedance.sdk.openadsdk.Sfi.lk;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.nJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4783um0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private static volatile lk LD;
    public static final ConcurrentHashMap<String, Object> Lxb = new ConcurrentHashMap<>();

    public static int JXs() {
        if (LD()) {
            return Lxb("ad_load_and_render_opt", "webview_preload_cache", 0);
        }
        return 0;
    }

    public static boolean LD() {
        return Lxb("ad_load_and_render_opt", "enable", 0) == 1;
    }

    public static lk Lxb(final Context context, final String str) {
        if (LD == null) {
            synchronized (Lxb.class) {
                try {
                    if (LD == null) {
                        try {
                            lk lkVar = new lk(new ZU() { // from class: com.bytedance.sdk.openadsdk.DY.Lxb.1
                                @Override // com.bytedance.sdk.openadsdk.Sfi.ZU
                                public String JXs() {
                                    return nJ.ZU("/api/ad/union/sdk/strategies/adn");
                                }

                                @Override // com.bytedance.sdk.openadsdk.Sfi.ZU
                                public Context LD() {
                                    Context context2 = context;
                                    return context2 != null ? context2 : kqm.Lxb();
                                }

                                @Override // com.bytedance.sdk.openadsdk.Sfi.ZU
                                public ExecutorService Lxb() {
                                    return hg.ZU();
                                }

                                @Override // com.bytedance.sdk.openadsdk.Sfi.ZU
                                public Handler ZU() {
                                    return STP.LD();
                                }

                                @Override // com.bytedance.sdk.openadsdk.Sfi.ZU
                                public Map<String, String> ebl() {
                                    HashMap map = new HashMap();
                                    map.put("User-Agent", nJ.lk());
                                    return map;
                                }

                                @Override // com.bytedance.sdk.openadsdk.Sfi.ZU
                                public JSONObject lc() {
                                    try {
                                        JSONObject jSONObjectLxb = com.bytedance.sdk.openadsdk.core.settings.STP.Lxb(HD.Lxb(kqm.Lxb(), 0L));
                                        if (!jSONObjectLxb.has("app_id")) {
                                            if (!TextUtils.isEmpty(str)) {
                                                jSONObjectLxb.put("app_id", str);
                                            } else {
                                                if (TextUtils.isEmpty(QAg.LD().ZU())) {
                                                    return null;
                                                }
                                                jSONObjectLxb.put("app_id", QAg.LD().ZU());
                                            }
                                        }
                                        return com.bytedance.sdk.component.utils.Lxb.Lxb(jSONObjectLxb);
                                    } catch (Throwable th) {
                                        sLN.Lxb("StrategyUtils", th.getMessage());
                                        return null;
                                    }
                                }

                                @Override // com.bytedance.sdk.openadsdk.Sfi.ZU
                                public String lk() {
                                    return "pag_adn_strategy_center";
                                }

                                @Override // com.bytedance.sdk.openadsdk.Sfi.ZU
                                public JSONObject Lxb(JSONObject jSONObject) {
                                    int iOptInt = jSONObject.optInt("cypher", -1);
                                    if (iOptInt == -1 || iOptInt != 3) {
                                        return jSONObject;
                                    }
                                    String strLk = com.bytedance.sdk.component.utils.Lxb.lk(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                                    if (TextUtils.isEmpty(strLk)) {
                                        return jSONObject;
                                    }
                                    try {
                                        return new JSONObject(strLk);
                                    } catch (Throwable unused) {
                                        return jSONObject;
                                    }
                                }
                            });
                            LD = lkVar;
                            lkVar.Lxb(new com.bytedance.sdk.openadsdk.Sfi.Lxb() { // from class: com.bytedance.sdk.openadsdk.DY.Lxb.2
                                @Override // com.bytedance.sdk.openadsdk.Sfi.Lxb
                                public void LD() {
                                    com.bytedance.sdk.openadsdk.VVE.lk.LD(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.DY.Lxb.2.2
                                        @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                                        public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                                            return AbstractC3950lJ.l("strategy_fetch");
                                        }
                                    });
                                    com.bytedance.sdk.openadsdk.lc.Lxb.Lxb().LD();
                                    com.bytedance.sdk.openadsdk.tD.Lxb.lk.Lxb().LD();
                                    AbstractC4783um0.lk(!com.bytedance.sdk.openadsdk.core.NXR.JXs.Lxb.Lxb());
                                }

                                @Override // com.bytedance.sdk.openadsdk.Sfi.Lxb
                                public void Lxb() {
                                    com.bytedance.sdk.openadsdk.VVE.lk.Lxb(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.DY.Lxb.2.1
                                        @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                                        public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                                            return AbstractC3950lJ.l("strategy_fetch");
                                        }
                                    });
                                }

                                @Override // com.bytedance.sdk.openadsdk.Sfi.Lxb
                                public void Lxb(int i, String str2) {
                                    com.bytedance.sdk.openadsdk.VVE.lk.lk(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.DY.Lxb.2.3
                                        @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                                        public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                                            return AbstractC3950lJ.l("strategy_fetch");
                                        }
                                    });
                                }
                            });
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return LD;
    }

    public static boolean ZU() {
        return LD() && Lxb("ad_load_and_render_opt", "sync_barrier_switch_opt", 0) == 1;
    }

    private static lk ebl() {
        return Lxb(kqm.Lxb(), QAg.LD().ZU());
    }

    public static int lc() {
        if (LD()) {
            return Lxb("ad_load_and_render_opt", "webview_preload_cache_v3", 0);
        }
        return 0;
    }

    public static boolean lk() {
        return LD() && Lxb("ad_load_and_render_opt", "thread_switch_opt", 0) == 1;
    }

    public static int Lxb(String str, int i) {
        lk lkVarEbl = ebl();
        return lkVarEbl != null ? lkVarEbl.Lxb(str, i) : i;
    }

    public static boolean Lxb(String str, boolean z) {
        lk lkVarEbl = ebl();
        return lkVarEbl != null ? lkVarEbl.Lxb(str, z) : z;
    }

    public static String Lxb(String str, String str2) {
        lk lkVarEbl = ebl();
        return lkVarEbl != null ? lkVarEbl.Lxb(str, str2) : str2;
    }

    public static int Lxb(String str, String str2, int i) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String strI = DM.i(str, "_", str2);
            ConcurrentHashMap<String, Object> concurrentHashMap = Lxb;
            Object obj = concurrentHashMap.get(strI);
            if (obj != null && (obj instanceof Integer)) {
                return ((Integer) obj).intValue();
            }
            try {
                String strLxb = ebl().Lxb(str, "");
                if (TextUtils.isEmpty(strLxb)) {
                    return i;
                }
                int iOptInt = new JSONObject(strLxb).optInt(str2, i);
                concurrentHashMap.put(strI, Integer.valueOf(iOptInt));
                return iOptInt;
            } catch (Throwable th) {
                sLN.Lxb("StrategyUtils", th.getMessage());
            }
        }
        return i;
    }

    public static String Lxb(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String strI = DM.i(str, "_", str2);
            ConcurrentHashMap<String, Object> concurrentHashMap = Lxb;
            Object obj = concurrentHashMap.get(strI);
            if (obj != null && (obj instanceof String)) {
                return (String) obj;
            }
            try {
                String strLxb = ebl().Lxb(str, "");
                if (TextUtils.isEmpty(strLxb)) {
                    return str3;
                }
                String strOptString = new JSONObject(strLxb).optString(str2, str3);
                concurrentHashMap.put(strI, strOptString);
                return strOptString;
            } catch (Throwable th) {
                sLN.Lxb("StrategyUtils", th.getMessage());
            }
        }
        return str3;
    }

    public static void Lxb() {
        lk lkVarEbl = ebl();
        if (lkVarEbl != null) {
            lkVarEbl.Lxb();
        }
    }
}
