package com.bytedance.sdk.openadsdk.ebl;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.GeckoHubImp;
import com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.STP.lk;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.hg;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    private static final String[] Lxb = {"gecko-pangle-sg.byteoversea.com"};

    public static class Lxb {
        private static final LD Lxb = new LD();
    }

    private static String ZU() {
        String[] strArrNu = kqm.ZU().Nu();
        if (strArrNu == null) {
            strArrNu = Lxb;
        }
        String str = strArrNu[new SecureRandom().nextInt(strArrNu.length)];
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        SecureRandom secureRandom = new SecureRandom();
        String[] strArr = Lxb;
        return strArr[secureRandom.nextInt(strArr.length)];
    }

    public static void lk() {
        try {
            GeckoHubImp.setThreadPoolExecutorCallback(new IThreadPoolCallback() { // from class: com.bytedance.sdk.openadsdk.ebl.LD.2
                @Override // com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback
                public ExecutorService getThreadPool() {
                    return hg.ZU();
                }
            });
        } catch (Throwable th) {
            sLN.Lxb("GeckoHub", "setThreadPoolExecutor error", th);
        }
    }

    public ILoader LD() {
        try {
            return GeckoHubImp.inst(kqm.Lxb()).getGeckoResLoader();
        } catch (Throwable th) {
            sLN.Lxb("GeckoHub", "getGeckoResLoader error", th);
            return null;
        }
    }

    private LD() {
        try {
            GeckoHubImp.inst(kqm.Lxb());
        } catch (Throwable th) {
            sLN.Lxb("GeckoHub", "GeckoHubImp init error", th);
        }
    }

    public static LD Lxb() {
        return Lxb.Lxb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void LD(Map<String, tD> map, JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject == null) {
                jSONObject2.put("success", false);
                jSONObject2.put(NotificationCompat.CATEGORY_MESSAGE, str);
                jSONObject2.put("code", 1);
                jSONObject = jSONObject2;
            }
            Iterator<tD> it = map.values().iterator();
            while (it.hasNext()) {
                lk.Lxb(it.next(), jSONObject);
            }
        } catch (Throwable th) {
            sLN.Lxb("GeckoHub", "upLoadStateEvent error", th);
        }
    }

    public void Lxb(final Map<String, tD> map) {
        try {
            String strLxb = com.bytedance.sdk.openadsdk.core.sLN.Lxb(kqm.Lxb());
            if (TextUtils.isEmpty(strLxb)) {
                return;
            }
            Iterator<tD> it = map.values().iterator();
            while (it.hasNext()) {
                lk.LD(it.next());
            }
            GeckoHubImp.setRandomHost(ZU());
            GeckoHubImp.inst(kqm.Lxb()).preload(strLxb, new IStatisticMonitor() { // from class: com.bytedance.sdk.openadsdk.ebl.LD.1
                @Override // com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor
                public void upload(String str, JSONObject jSONObject) {
                    if (!"geckosdk_update_stats".equals(str)) {
                        if ("download_gecko_end".equals(str)) {
                            LD.LD(map, jSONObject, "");
                        }
                    } else {
                        tD tDVar = (tD) map.get(jSONObject.optString("channel"));
                        if (tDVar != null) {
                            com.bytedance.sdk.openadsdk.ZU.lk.Lxb.Lxb(str, jSONObject, tDVar);
                        }
                    }
                }
            }, map.keySet(), new com.bytedance.sdk.openadsdk.ebl.Lxb());
        } catch (Throwable th) {
            LD(map, null, th.toString());
            sLN.Lxb("GeckoHub", "releaseGeckoResLoader error", th);
        }
    }

    public void Lxb(ILoader iLoader) {
        if (iLoader != null) {
            try {
                GeckoHubImp.inst(kqm.Lxb()).releaseGeckoResLoader(iLoader);
            } catch (Throwable th) {
                sLN.Lxb("GeckoHub", "releaseGeckoResLoader error", th);
            }
        }
    }

    public WebResourceResponseModel Lxb(ILoader iLoader, String str, String str2) {
        if (iLoader == null) {
            return null;
        }
        try {
            return GeckoHubImp.inst(kqm.Lxb()).findResAndMsg(iLoader, str, str2);
        } catch (Throwable th) {
            sLN.Lxb("GeckoHub", "findRes error", th);
            return null;
        }
    }

    public int Lxb(ILoader iLoader, String str) {
        try {
            return GeckoHubImp.inst(kqm.Lxb()).getResCount(iLoader, str);
        } catch (Throwable th) {
            sLN.Lxb("GeckoHub", "getResCount error", th);
            return 0;
        }
    }
}
