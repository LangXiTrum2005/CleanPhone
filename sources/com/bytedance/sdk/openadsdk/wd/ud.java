package com.bytedance.sdk.openadsdk.wd;

import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.GeckoHubImp;
import com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.bjy.lnr;
import com.bytedance.sdk.openadsdk.core.fs;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.fco;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ud {
    private static final String[] qdl = {"gecko16-normal-useast5.tiktokv.us"};

    public interface qdl {
        void qdl();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.wd.ud$ud, reason: collision with other inner class name */
    public static class C0158ud {
        private static final ud qdl = new ud();
    }

    public static void lnr() {
        try {
            GeckoHubImp.setThreadPoolExecutorCallback(new IThreadPoolCallback() { // from class: com.bytedance.sdk.openadsdk.wd.ud.2
                @Override // com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback
                public ExecutorService getThreadPool() {
                    return fco.mzz();
                }
            });
        } catch (Throwable th) {
            aaj.qdl("GeckoHub", "setThreadPoolExecutor error", th);
        }
    }

    private static String mml() {
        String[] strArrNz = yt.mml().nz();
        if (strArrNz == null) {
            strArrNz = qdl;
        }
        String str = strArrNz[new SecureRandom().nextInt(strArrNz.length)];
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        SecureRandom secureRandom = new SecureRandom();
        String[] strArr = qdl;
        return strArr[secureRandom.nextInt(strArr.length)];
    }

    public ILoader ud() {
        try {
            return GeckoHubImp.inst(yt.qdl()).getGeckoResLoader();
        } catch (Throwable th) {
            aaj.qdl("GeckoHub", "getGeckoResLoader error", th);
            return null;
        }
    }

    private ud() {
        try {
            GeckoHubImp.inst(yt.qdl());
        } catch (Throwable th) {
            aaj.qdl("GeckoHub", "GeckoHubImp init error", th);
        }
    }

    public static ud qdl() {
        return C0158ud.qdl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ud(Map<String, ljh> map, JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject == null) {
                jSONObject2.put("success", false);
                jSONObject2.put("msg", str);
                jSONObject2.put("code", 1);
                jSONObject = jSONObject2;
            }
            Iterator<ljh> it = map.values().iterator();
            while (it.hasNext()) {
                lnr.qdl(it.next(), jSONObject);
            }
        } catch (Throwable th) {
            aaj.qdl("GeckoHub", "upLoadStateEvent error", th);
        }
    }

    public void qdl(Map<String, ljh> map) {
        qdl(map, (qdl) null, false);
    }

    public void qdl(final Map<String, ljh> map, final qdl qdlVar, boolean z2) {
        try {
            String strQdl = fs.qdl(yt.qdl());
            if (TextUtils.isEmpty(strQdl)) {
                return;
            }
            for (ljh ljhVar : map.values()) {
                if (ljhVar != null) {
                    if (!z2 && ljhVar.tu()) {
                        map.remove(ljhVar.xmr());
                    } else {
                        lnr.ud(ljhVar);
                    }
                }
            }
            if (map.isEmpty()) {
                return;
            }
            GeckoHubImp.setRandomHost(mml());
            GeckoHubImp.inst(yt.qdl()).preload(strQdl, new IStatisticMonitor() { // from class: com.bytedance.sdk.openadsdk.wd.ud.1
                @Override // com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor
                public void upload(String str, JSONObject jSONObject) {
                    if ("geckosdk_update_stats".equals(str)) {
                        ljh ljhVar2 = (ljh) map.get(jSONObject.optString("channel"));
                        if (ljhVar2 != null) {
                            com.bytedance.sdk.openadsdk.mml.lnr.qdl.qdl(str, jSONObject, ljhVar2);
                            return;
                        }
                        return;
                    }
                    if ("download_gecko_end".equals(str)) {
                        qdl qdlVar2 = qdlVar;
                        if (qdlVar2 != null) {
                            qdlVar2.qdl();
                        }
                        ud.ud(map, jSONObject, "");
                    }
                }
            }, map.keySet(), new com.bytedance.sdk.openadsdk.wd.qdl());
        } catch (Throwable th) {
            ud(map, null, th.toString());
            aaj.qdl("GeckoHub", "releaseGeckoResLoader error", th);
        }
    }

    public void qdl(ILoader iLoader) {
        if (iLoader != null) {
            try {
                GeckoHubImp.inst(yt.qdl()).releaseGeckoResLoader(iLoader);
            } catch (Throwable th) {
                aaj.qdl("GeckoHub", "releaseGeckoResLoader error", th);
            }
        }
    }

    public WebResourceResponseModel qdl(ILoader iLoader, String str, String str2) {
        if (iLoader == null) {
            return null;
        }
        try {
            return GeckoHubImp.inst(yt.qdl()).findResAndMsg(iLoader, str, str2);
        } catch (Throwable th) {
            aaj.qdl("GeckoHub", "findRes error", th);
            return null;
        }
    }

    public int qdl(ILoader iLoader, String str) {
        try {
            return GeckoHubImp.inst(yt.qdl()).getResCount(iLoader, str);
        } catch (Throwable th) {
            aaj.qdl("GeckoHub", "getResCount error", th);
            return 0;
        }
    }
}
