package com.bytedance.sdk.openadsdk.wjv;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.ihz;
import com.bytedance.sdk.component.utils.mj;
import com.bytedance.sdk.component.utils.su;
import com.bytedance.sdk.openadsdk.core.ay;
import com.bytedance.sdk.openadsdk.core.fr;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.qt;
import com.bytedance.sdk.openadsdk.core.settings.jbs;
import com.bytedance.sdk.openadsdk.core.settings.sf;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.uq;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.download.Command;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class fi {
    private static volatile ka ka;
    public static String lr;
    private static final AtomicBoolean ik = new AtomicBoolean(false);
    public static final ConcurrentHashMap<String, Object> ri = new ConcurrentHashMap<>();

    public static int di() {
        if (lr()) {
            return ri("ad_load_and_render_opt", "webview_preload_cache_v3", 0);
        }
        return 0;
    }

    public static int fi() {
        if (lr()) {
            return ri("ad_load_and_render_opt", "webview_preload_cache", 0);
        }
        return 0;
    }

    public static boolean ik() {
        return lr() && ri("ad_load_and_render_opt", "thread_switch_opt", 0) == 1;
    }

    public static boolean jbs() {
        return ri("iv_rv_listen_new_arch", 0) == 1;
    }

    public static boolean ka() {
        return lr() && ri("ad_load_and_render_opt", "sync_barrier_switch_opt", 0) == 1;
    }

    public static boolean lr() {
        return ri("ad_load_and_render_opt", a.j, 0) == 1;
    }

    public static boolean mj() {
        return ri("no_call_close", 0) == 1;
    }

    public static boolean qt() {
        return ri("iv_rv_top_bar_listen_new", 0) == 1;
    }

    public static ka ri(final Context context, final String str) {
        if (ka == null) {
            synchronized (fi.class) {
                try {
                    if (ka == null) {
                        try {
                            ka kaVar = new ka(new di() { // from class: com.bytedance.sdk.openadsdk.wjv.fi.1
                                @Override // com.bytedance.sdk.openadsdk.wjv.di
                                public JSONObject di() {
                                    try {
                                        JSONObject jSONObjectRi = jbs.ri(su.ri(nr.ri(), 0L));
                                        if (!jSONObjectRi.has("app_id")) {
                                            if (!TextUtils.isEmpty(str)) {
                                                jSONObjectRi.put("app_id", str);
                                            } else {
                                                if (TextUtils.isEmpty(qt.lr().ka())) {
                                                    return null;
                                                }
                                                jSONObjectRi.put("app_id", qt.lr().ka());
                                            }
                                        }
                                        return ay.ri(PangleEncryptConstant.CryptDataScene.STRATEGY, jSONObjectRi);
                                    } catch (Throwable th) {
                                        ac.ik("StrategyUtils", th.getMessage());
                                        return null;
                                    }
                                }

                                @Override // com.bytedance.sdk.openadsdk.wjv.di
                                public String fi() {
                                    String strRi = ig.ri("/api/ad/union/sdk/strategies/adn", false, true);
                                    fi.lr = strRi;
                                    return strRi;
                                }

                                @Override // com.bytedance.sdk.openadsdk.wjv.di
                                public String ik() {
                                    if (ihz.ri(lr())) {
                                        return "pag_adn_strategy_center";
                                    }
                                    return "pag_adn_strategy_center_" + ihz.ik(lr());
                                }

                                @Override // com.bytedance.sdk.openadsdk.wjv.di
                                public Handler ka() {
                                    return vr.lr();
                                }

                                @Override // com.bytedance.sdk.openadsdk.wjv.di
                                public Context lr() {
                                    Context context2 = context;
                                    return context2 != null ? context2 : nr.ri();
                                }

                                @Override // com.bytedance.sdk.openadsdk.wjv.di
                                public boolean mj() {
                                    return com.bytedance.sdk.openadsdk.core.qt.lr.ri().fi();
                                }

                                @Override // com.bytedance.sdk.openadsdk.wjv.di
                                public ExecutorService ri() {
                                    return dzy.fi();
                                }

                                @Override // com.bytedance.sdk.openadsdk.wjv.di
                                public Map<String, String> xha() {
                                    HashMap map = new HashMap();
                                    map.put(Command.HTTP_HEADER_USER_AGENT, ig.ka());
                                    String strLr = com.bytedance.sdk.openadsdk.tan.ka.ri.lr("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                                    if (!strLr.isEmpty()) {
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("ipv6", strLr);
                                        } catch (JSONException unused) {
                                        }
                                        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new fr(PangleEncryptConstant.CryptDataScene.UNKNOWN));
                                        if (jSONObjectEncryptType4 != null) {
                                            map.put("transfer-param", jSONObjectEncryptType4.optString(PglCryptUtils.KEY_MESSAGE));
                                            if (jSONObjectEncryptType4.optInt("cypher") == 4) {
                                                map.put("cypher", "4");
                                            } else {
                                                map.put("cypher", "3");
                                            }
                                        }
                                    }
                                    try {
                                        map.put("x-pangle-target-idc", sf.lr().tpb());
                                    } catch (Throwable unused2) {
                                    }
                                    return map;
                                }

                                @Override // com.bytedance.sdk.openadsdk.wjv.di
                                public JSONObject ri(JSONObject jSONObject) {
                                    String strRi = ay.ri(jSONObject.optInt("cypher", -1), jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                                    if (!TextUtils.isEmpty(strRi)) {
                                        try {
                                            return new JSONObject(strRi);
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    return jSONObject;
                                }

                                @Override // com.bytedance.sdk.openadsdk.wjv.di
                                public HandlerThread ri(String str2, int i) {
                                    return mj.ri(str2, i);
                                }
                            });
                            ka = kaVar;
                            kaVar.ri(new ri() { // from class: com.bytedance.sdk.openadsdk.wjv.fi.2
                                @Override // com.bytedance.sdk.openadsdk.wjv.ri
                                public void lr() {
                                    com.bytedance.sdk.openadsdk.nr.ik.lr(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.wjv.fi.2.2
                                        @Override // com.bytedance.sdk.openadsdk.nr.ka
                                        public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                            com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                            riVar.lr("strategy_fetch");
                                            return riVar;
                                        }
                                    });
                                    com.bytedance.sdk.openadsdk.di.ri.ri().lr();
                                    com.bytedance.sdk.openadsdk.uq.ri.ik.ri().lr();
                                    uq.lr();
                                    HashMap map = new HashMap();
                                    String strRi = fi.ri(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
                                    if (!TextUtils.isEmpty(strRi)) {
                                        map.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, strRi);
                                    }
                                    com.bytedance.sdk.openadsdk.core.sf.ik.ri(map);
                                }

                                @Override // com.bytedance.sdk.openadsdk.wjv.ri
                                public void ri() {
                                    com.bytedance.sdk.openadsdk.nr.ik.ri(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.wjv.fi.2.1
                                        @Override // com.bytedance.sdk.openadsdk.nr.ka
                                        public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                            com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                            riVar.lr("strategy_fetch");
                                            return riVar;
                                        }
                                    });
                                }

                                @Override // com.bytedance.sdk.openadsdk.wjv.ri
                                public void ri(int i, String str2) {
                                    com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.wjv.fi.2.3
                                        @Override // com.bytedance.sdk.openadsdk.nr.ka
                                        public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                            com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                            riVar.lr("strategy_fetch");
                                            return riVar;
                                        }
                                    });
                                    uq.ri(fi.lr);
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
        return ka;
    }

    private static ka sf() {
        return ri(nr.ri(), qt.lr().ka());
    }

    public static boolean xha() {
        return ri("jsb_opt_enable", 0) == 1;
    }

    public static int ri(String str, int i) {
        ka kaVarSf = sf();
        return kaVarSf != null ? kaVarSf.ri(str, i) : i;
    }

    public static boolean ri(String str, boolean z) {
        ka kaVarSf = sf();
        return kaVarSf != null ? kaVarSf.ri(str, z) : z;
    }

    public static String ri(String str, String str2) {
        ka kaVarSf = sf();
        return kaVarSf != null ? kaVarSf.ri(str, str2) : str2;
    }

    public static <T> T ri(String str, T t, lr.ri<T> riVar) {
        ka kaVarSf = sf();
        return kaVarSf != null ? (T) kaVarSf.ri(str, t, riVar) : t;
    }

    public static int ri(String str, String str2, int i) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str3 = str + "_" + str2;
            ConcurrentHashMap<String, Object> concurrentHashMap = ri;
            Object obj = concurrentHashMap.get(str3);
            if (obj != null && (obj instanceof Integer)) {
                return ((Integer) obj).intValue();
            }
            try {
                String strRi = sf().ri(str, "");
                if (!TextUtils.isEmpty(strRi)) {
                    int iOptInt = new JSONObject(strRi).optInt(str2, i);
                    concurrentHashMap.put(str3, Integer.valueOf(iOptInt));
                    return iOptInt;
                }
            } catch (Throwable th) {
                ac.ik("StrategyUtils", th.getMessage());
            }
        }
        return i;
    }

    public static String ri(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str4 = str + "_" + str2;
            ConcurrentHashMap<String, Object> concurrentHashMap = ri;
            Object obj = concurrentHashMap.get(str4);
            if (obj != null && (obj instanceof String)) {
                return (String) obj;
            }
            try {
                String strRi = sf().ri(str, "");
                if (!TextUtils.isEmpty(strRi)) {
                    String strOptString = new JSONObject(strRi).optString(str2, str3);
                    concurrentHashMap.put(str4, strOptString);
                    return strOptString;
                }
            } catch (Throwable th) {
                ac.ik("StrategyUtils", th.getMessage());
            }
        }
        return str3;
    }

    public static void ri() {
        ka kaVarSf;
        if (com.bytedance.sdk.openadsdk.core.qt.lr.ri().fi() || (kaVarSf = sf()) == null || ik.getAndSet(true)) {
            return;
        }
        kaVarSf.ri();
    }
}
