package com.bytedance.sdk.openadsdk.jyq;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.applovin.impl.Z;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.bqt;
import com.bytedance.sdk.component.utils.jpc;
import com.bytedance.sdk.openadsdk.core.bch;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.core.settings.rq;
import com.bytedance.sdk.openadsdk.core.settings.tvp;
import com.bytedance.sdk.openadsdk.core.to.ud;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.oth.lnr;
import com.bytedance.sdk.openadsdk.oth.mml;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.jyq;
import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.mediationsdk.metadata.a;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    private static volatile lnr lnr;
    public static final ConcurrentHashMap<String, Object> qdl = new ConcurrentHashMap<>();
    public static String ud;

    public static boolean jpc() {
        return qdl("no_call_close", 0) == 1;
    }

    public static boolean lnr() {
        return ud() && qdl("ad_load_and_render_opt", "thread_switch_opt", 0) == 1;
    }

    public static boolean mml() {
        return ud() && qdl("ad_load_and_render_opt", "sync_barrier_switch_opt", 0) == 1;
    }

    public static int mo() {
        if (ud()) {
            return qdl("ad_load_and_render_opt", "webview_preload_cache_v3", 0);
        }
        return 0;
    }

    public static int mzz() {
        if (ud()) {
            return qdl("ad_load_and_render_opt", "webview_preload_cache", 0);
        }
        return 0;
    }

    public static lnr qdl(final Context context, final String str) {
        if (lnr == null) {
            synchronized (qdl.class) {
                try {
                    if (lnr == null) {
                        try {
                            lnr lnrVar = new lnr(new mml() { // from class: com.bytedance.sdk.openadsdk.jyq.qdl.1
                                @Override // com.bytedance.sdk.openadsdk.oth.mml
                                public String lnr() {
                                    return "pag_adn_strategy_center";
                                }

                                @Override // com.bytedance.sdk.openadsdk.oth.mml
                                public Handler mml() {
                                    return rdp.ud();
                                }

                                @Override // com.bytedance.sdk.openadsdk.oth.mml
                                public JSONObject mo() {
                                    try {
                                        JSONObject jSONObjectQdl = tvp.qdl(bqt.qdl(yt.qdl(), 0L));
                                        if (!jSONObjectQdl.has("app_id")) {
                                            if (!TextUtils.isEmpty(str)) {
                                                jSONObjectQdl.put("app_id", str);
                                            } else {
                                                if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.tvp.ud().mml())) {
                                                    return null;
                                                }
                                                jSONObjectQdl.put("app_id", com.bytedance.sdk.openadsdk.core.tvp.ud().mml());
                                            }
                                        }
                                        return com.bytedance.sdk.component.utils.qdl.qdl(jSONObjectQdl);
                                    } catch (Throwable th) {
                                        aaj.lnr("StrategyUtils", th.getMessage());
                                        return null;
                                    }
                                }

                                @Override // com.bytedance.sdk.openadsdk.oth.mml
                                public String mzz() {
                                    String strQdl = gy.qdl("/api/ad/union/sdk/strategies/adn", false, true);
                                    qdl.ud = strQdl;
                                    return strQdl;
                                }

                                @Override // com.bytedance.sdk.openadsdk.oth.mml
                                public ExecutorService qdl() {
                                    return fco.mzz();
                                }

                                @Override // com.bytedance.sdk.openadsdk.oth.mml
                                public Context ud() {
                                    Context context2 = context;
                                    return context2 != null ? context2 : yt.qdl();
                                }

                                @Override // com.bytedance.sdk.openadsdk.oth.mml
                                public Map<String, String> wd() {
                                    HashMap map = new HashMap();
                                    map.put(Command.HTTP_HEADER_USER_AGENT, gy.mml());
                                    String strUd = com.bytedance.sdk.openadsdk.multipro.mml.mml.ud("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                                    if (!strUd.isEmpty()) {
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("ipv6", strUd);
                                        } catch (JSONException unused) {
                                        }
                                        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new bch(PangleEncryptConstant.CryptDataScene.UNKNOWN));
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
                                        map.put("x-pangle-target-idc", rq.lnr().ca());
                                    } catch (Throwable unused2) {
                                    }
                                    return map;
                                }

                                @Override // com.bytedance.sdk.openadsdk.oth.mml
                                public JSONObject qdl(JSONObject jSONObject) {
                                    int iOptInt = jSONObject.optInt("cypher", -1);
                                    if (iOptInt != -1 && iOptInt == 3) {
                                        String strLnr = com.bytedance.sdk.component.utils.qdl.lnr(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                                        if (!TextUtils.isEmpty(strLnr)) {
                                            try {
                                                return new JSONObject(strLnr);
                                            } catch (Throwable unused) {
                                            }
                                        }
                                    }
                                    return jSONObject;
                                }

                                @Override // com.bytedance.sdk.openadsdk.oth.mml
                                public HandlerThread qdl(String str2, int i2) {
                                    return jpc.qdl(str2, i2);
                                }
                            });
                            lnr = lnrVar;
                            lnrVar.qdl(new com.bytedance.sdk.openadsdk.oth.qdl() { // from class: com.bytedance.sdk.openadsdk.jyq.qdl.2
                                @Override // com.bytedance.sdk.openadsdk.oth.qdl
                                public void qdl() {
                                    com.bytedance.sdk.openadsdk.yt.lnr.qdl(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.jyq.qdl.2.1
                                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                            return Z.i("strategy_fetch");
                                        }
                                    });
                                }

                                @Override // com.bytedance.sdk.openadsdk.oth.qdl
                                public void ud() {
                                    com.bytedance.sdk.openadsdk.yt.lnr.ud(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.jyq.qdl.2.2
                                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                            return Z.i("strategy_fetch");
                                        }
                                    });
                                    com.bytedance.sdk.openadsdk.mo.qdl.qdl().ud();
                                    com.bytedance.sdk.openadsdk.aaj.qdl.lnr.qdl().ud();
                                    jyq.ud();
                                    HashMap map = new HashMap();
                                    String strQdl = qdl.qdl(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
                                    if (!TextUtils.isEmpty(strQdl)) {
                                        map.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, strQdl);
                                    }
                                    ud.ud().qdl(map);
                                }

                                @Override // com.bytedance.sdk.openadsdk.oth.qdl
                                public void qdl(int i2, String str2) {
                                    com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.jyq.qdl.2.3
                                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                            return Z.i("strategy_fetch");
                                        }
                                    });
                                    jyq.qdl(qdl.ud);
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
        return lnr;
    }

    private static lnr to() {
        return qdl(yt.qdl(), com.bytedance.sdk.openadsdk.core.tvp.ud().mml());
    }

    public static boolean tvp() {
        return qdl("iv_rv_listen_new_arch", 0) == 1;
    }

    public static boolean ud() {
        return qdl("ad_load_and_render_opt", a.j, 0) == 1;
    }

    public static boolean wd() {
        return qdl("jsb_opt_enable", 0) == 1;
    }

    public static int qdl(String str, int i2) {
        lnr lnrVar = to();
        return lnrVar != null ? lnrVar.qdl(str, i2) : i2;
    }

    public static boolean qdl(String str, boolean z2) {
        lnr lnrVar = to();
        return lnrVar != null ? lnrVar.qdl(str, z2) : z2;
    }

    public static String qdl(String str, String str2) {
        lnr lnrVar = to();
        return lnrVar != null ? lnrVar.qdl(str, str2) : str2;
    }

    public static int qdl(String str, String str2, int i2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String strD = android.support.v4.media.a.D(str, "_", str2);
            ConcurrentHashMap<String, Object> concurrentHashMap = qdl;
            Object obj = concurrentHashMap.get(strD);
            if (obj != null && (obj instanceof Integer)) {
                return ((Integer) obj).intValue();
            }
            try {
                String strQdl = to().qdl(str, "");
                if (!TextUtils.isEmpty(strQdl)) {
                    int iOptInt = new JSONObject(strQdl).optInt(str2, i2);
                    concurrentHashMap.put(strD, Integer.valueOf(iOptInt));
                    return iOptInt;
                }
            } catch (Throwable th) {
                aaj.lnr("StrategyUtils", th.getMessage());
            }
        }
        return i2;
    }

    public static String qdl(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String strD = android.support.v4.media.a.D(str, "_", str2);
            ConcurrentHashMap<String, Object> concurrentHashMap = qdl;
            Object obj = concurrentHashMap.get(strD);
            if (obj != null && (obj instanceof String)) {
                return (String) obj;
            }
            try {
                String strQdl = to().qdl(str, "");
                if (!TextUtils.isEmpty(strQdl)) {
                    String strOptString = new JSONObject(strQdl).optString(str2, str3);
                    concurrentHashMap.put(strD, strOptString);
                    return strOptString;
                }
            } catch (Throwable th) {
                aaj.lnr("StrategyUtils", th.getMessage());
            }
        }
        return str3;
    }

    public static void qdl() {
        lnr lnrVar = to();
        if (lnrVar != null) {
            lnrVar.qdl();
        }
    }
}
