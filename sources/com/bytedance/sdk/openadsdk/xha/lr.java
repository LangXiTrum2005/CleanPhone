package com.bytedance.sdk.openadsdk.xha;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AppsFlyerProperties;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.GeckoHubImp;
import com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.aw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.ka.ik;
import com.bytedance.sdk.openadsdk.slm.ka;
import com.bytedance.sdk.openadsdk.utils.dzy;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private static final String[] ri = {"gecko16-normal-useast5.tiktokv.us"};

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.xha.lr$lr, reason: collision with other inner class name */
    public static class C0281lr {
        private static final lr ri = new lr();
    }

    public interface ri {
        void ri();
    }

    public static void ik() {
        try {
            GeckoHubImp.setThreadPoolExecutorCallback(new IThreadPoolCallback() { // from class: com.bytedance.sdk.openadsdk.xha.lr.2
                @Override // com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback
                public ExecutorService getThreadPool() {
                    return dzy.fi();
                }
            });
        } catch (Throwable th) {
            ac.ri("GeckoHub", "setThreadPoolExecutor error", th);
        }
    }

    private static String ka() {
        String[] strArrYjm = nr.ka().yjm();
        if (strArrYjm == null) {
            strArrYjm = ri;
        }
        String str = strArrYjm[new SecureRandom().nextInt(strArrYjm.length)];
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        SecureRandom secureRandom = new SecureRandom();
        String[] strArr = ri;
        return strArr[secureRandom.nextInt(strArr.length)];
    }

    public ILoader lr() {
        try {
            return GeckoHubImp.inst(nr.ri()).getGeckoResLoader();
        } catch (Throwable th) {
            ac.ri("GeckoHub", "getGeckoResLoader error", th);
            return null;
        }
    }

    private lr() {
        try {
            GeckoHubImp.inst(nr.ri());
        } catch (Throwable th) {
            ac.ri("GeckoHub", "GeckoHubImp init error", th);
        }
    }

    public static lr ri() {
        return C0281lr.ri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lr(Map<String, wjv> map, JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject == null) {
                jSONObject2.put("success", false);
                jSONObject2.put(NotificationCompat.CATEGORY_MESSAGE, str);
                jSONObject2.put("code", 1);
                jSONObject = jSONObject2;
            }
            Iterator<wjv> it = map.values().iterator();
            while (it.hasNext()) {
                ka.ri(it.next(), jSONObject);
            }
        } catch (Throwable th) {
            ac.ri("GeckoHub", "upLoadStateEvent error", th);
        }
    }

    public void ri(Map<String, wjv> map) {
        ri(map, (ri) null, false);
    }

    public void ri(final Map<String, wjv> map, final ri riVar, boolean z) {
        try {
            String strRi = aw.ri(nr.ri());
            if (TextUtils.isEmpty(strRi)) {
                return;
            }
            for (wjv wjvVar : map.values()) {
                if (wjvVar != null) {
                    if (!z && wjvVar.wm()) {
                        map.remove(wjvVar.mvf());
                    } else {
                        ka.lr(wjvVar);
                    }
                }
            }
            if (map.isEmpty()) {
                return;
            }
            GeckoHubImp.setRandomHost(ka());
            GeckoHubImp.inst(nr.ri()).preload(strRi, new IStatisticMonitor() { // from class: com.bytedance.sdk.openadsdk.xha.lr.1
                @Override // com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor
                public void upload(String str, JSONObject jSONObject) {
                    if ("geckosdk_update_stats".equals(str)) {
                        wjv wjvVar2 = (wjv) map.get(jSONObject.optString(AppsFlyerProperties.CHANNEL));
                        if (wjvVar2 != null) {
                            ik.ri.ri(str, jSONObject, wjvVar2);
                            return;
                        }
                        return;
                    }
                    if ("download_gecko_end".equals(str)) {
                        ri riVar2 = riVar;
                        if (riVar2 != null) {
                            riVar2.ri();
                        }
                        lr.lr(map, jSONObject, "");
                    }
                }
            }, map.keySet(), new com.bytedance.sdk.openadsdk.xha.ri());
        } catch (Throwable th) {
            lr(map, null, th.toString());
            ac.ri("GeckoHub", "releaseGeckoResLoader error", th);
        }
    }

    public void ri(ILoader iLoader) {
        if (iLoader != null) {
            try {
                GeckoHubImp.inst(nr.ri()).releaseGeckoResLoader(iLoader);
            } catch (Throwable th) {
                ac.ri("GeckoHub", "releaseGeckoResLoader error", th);
            }
        }
    }

    public WebResourceResponseModel ri(ILoader iLoader, String str, String str2) {
        if (iLoader == null) {
            return null;
        }
        try {
            return GeckoHubImp.inst(nr.ri()).findResAndMsg(iLoader, str, str2);
        } catch (Throwable th) {
            ac.ri("GeckoHub", "findRes error", th);
            return null;
        }
    }

    public int ri(ILoader iLoader, String str) {
        try {
            return GeckoHubImp.inst(nr.ri()).getResCount(iLoader, str);
        } catch (Throwable th) {
            ac.ri("GeckoHub", "getResCount error", th);
            return 0;
        }
    }
}
