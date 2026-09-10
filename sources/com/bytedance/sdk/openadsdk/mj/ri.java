package com.bytedance.sdk.openadsdk.mj;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.ri.lr.di;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.fr;
import com.bytedance.sdk.component.utils.jbs;
import com.bytedance.sdk.component.utils.mj;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.component.utils.wjv;
import com.bytedance.sdk.component.utils.zf;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.ay.lr.xha;
import com.bytedance.sdk.openadsdk.core.aw;
import com.bytedance.sdk.openadsdk.core.bgr;
import com.bytedance.sdk.openadsdk.core.hcw;
import com.bytedance.sdk.openadsdk.core.jbs.co;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.oh;
import com.bytedance.sdk.openadsdk.core.qt;
import com.bytedance.sdk.openadsdk.core.settings.sf;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.ka.ri.lr;
import com.bytedance.sdk.openadsdk.nr.ik;
import com.bytedance.sdk.openadsdk.nr.ka;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.ihz;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.slm;
import com.bytedance.sdk.openadsdk.utils.su;
import com.bytedance.sdk.openadsdk.wjv.fi;
import com.ironsource.L6;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    public static final List<PAGSdk.PAGInitCallback> ri = new ArrayList();
    private static long lr = 0;

    private static void di() {
        vr.ri(1);
        try {
            List<PAGSdk.PAGInitCallback> list = ri;
            synchronized (list) {
                try {
                    Iterator<PAGSdk.PAGInitCallback> it = list.iterator();
                    while (it.hasNext()) {
                        PAGSdk.PAGInitCallback next = it.next();
                        if (next != null) {
                            it.remove();
                            next.success();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ik.lr(new ka() { // from class: com.bytedance.sdk.openadsdk.mj.ri.8
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar.lr(X3.a.f);
                    return riVar;
                }
            });
        } catch (Throwable th2) {
            ac.ik(th2.getMessage(), new Object[0]);
        }
    }

    private static void fi(final Context context, final InitConfig initConfig) {
        dzy.ri(new com.bytedance.sdk.component.mj.lr.ik("init_sync") { // from class: com.bytedance.sdk.openadsdk.mj.ri.6
            @Override // java.lang.Runnable
            public void run() {
                vr.ri(initConfig.getData());
                fi.ri(context, initConfig.getAppId());
                fi.ri();
                ik.ri();
                ik.lr();
                new slm();
                di.ri(ihz.ri() * 10);
                lr.ri(context);
                com.bytedance.sdk.openadsdk.core.slm.ri().lr();
                com.bytedance.sdk.openadsdk.core.sf.ik.ri();
                com.bytedance.sdk.openadsdk.core.co.ik.ri();
                sf.fi = sf.ri(context);
                sf.ka = sf.lr(context);
                xha.lr();
                phytopathogen.attabal.cutely(nr.ka().pc());
                phytopathogen.attabal.impromptu(CacheDirFactory.getICacheDir(0));
                sf sfVarKa = nr.ka();
                if (!sfVarKa.tw()) {
                    synchronized (sfVarKa) {
                        try {
                            if (!sfVarKa.tw()) {
                                sfVarKa.ik();
                                sfVarKa.ig();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                vr.di();
                DeviceUtils.sf();
                ri.ri(context);
                DeviceUtils.ri(context);
                DeviceUtils.sf(context);
                DeviceUtils.co(context);
                com.bytedance.sdk.openadsdk.slm.ri.ri();
                com.bytedance.sdk.openadsdk.core.settings.ka.ri();
                com.bytedance.sdk.openadsdk.slm.ka.ka();
                ig.jbs(context);
                com.bytedance.sdk.openadsdk.ka.ik.ri();
                ri.fi();
                com.bytedance.sdk.openadsdk.core.sf.ik.lr();
                com.bytedance.sdk.openadsdk.core.fi.ri.ri().lr();
                com.bytedance.sdk.component.mj.lr.ka.ri(vr.lr());
                if (com.bytedance.sdk.openadsdk.component.xha.ri.fi()) {
                    com.bytedance.sdk.openadsdk.common.nr.ri().ka();
                }
                com.bytedance.sdk.component.utils.lr.ri(new com.bytedance.sdk.component.utils.lr.ri() { // from class: com.bytedance.sdk.openadsdk.mj.ri.6.1
                    @Override // com.bytedance.sdk.component.utils.lr.ri
                    public ExecutorService ik() {
                        return dzy.jbs();
                    }

                    @Override // com.bytedance.sdk.component.utils.lr.ri
                    public boolean lr() {
                        return fi.ri("start_act_asy", 0) == 1;
                    }

                    @Override // com.bytedance.sdk.component.utils.lr.ri
                    public boolean ri() {
                        return fi.ri("start_activity_async", 0) == 1;
                    }
                });
                ig.ik();
                wjv.ri(new wjv.lr() { // from class: com.bytedance.sdk.openadsdk.mj.ri.6.2
                    @Override // com.bytedance.sdk.component.utils.wjv.lr
                    public void ri(final String str, boolean z, final wjv.ri riVar) {
                        com.bytedance.sdk.openadsdk.slm.ka.ri(str, z, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.mj.ri.6.2.1
                            @Override // com.bytedance.sdk.openadsdk.slm.lr
                            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri(str).lr(riVar.lr());
                            }
                        });
                    }
                });
                zf.ri(fi.ri("webview_reuse_config", (String) null));
                phytopathogen.attabal.taiyuan(fi.ri("video_play_config", (String) null));
                com.bytedance.sdk.openadsdk.slm.ik.ri();
            }
        });
    }

    private static void ka() {
        com.bytedance.sdk.openadsdk.core.ik.ri().ri("uuid", su.ri());
    }

    public static void lr() {
        nr.ka();
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_compliance_file", "a", 0);
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("ttopenadsdk", "a", 0);
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_global_file", "a", 0);
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_global_app_id", "a", 0);
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tpl_fetch_model", "a", 0);
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_sp", "a", 0);
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("pag_sp_bad_par", "did");
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("pag_sp_bad_par", L6.V0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fi() {
        ShortcutManager shortcutManagerAttabal;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context contextRi = nr.ri();
                if (contextRi == null || (shortcutManagerAttabal = saneness.attabal(contextRi.getSystemService(attabal.attabal()))) == null) {
                    return;
                }
                qt.lr().ri(shortcutManagerAttabal.isRequestPinShortcutSupported());
            } catch (Throwable unused) {
            }
        }
    }

    private static void ik(Context context, InitConfig initConfig) {
        if (TextUtils.isEmpty(initConfig.getPackageName())) {
            uq.ri((String) null);
            com.bytedance.adsdk.ugeno.xha.ka.ri((String) null);
        } else {
            uq.ri(initConfig.getPackageName());
            com.bytedance.adsdk.ugeno.xha.ka.ri(initConfig.getPackageName());
        }
        com.bytedance.sdk.openadsdk.tan.ri.ri(context);
        try {
            if (lr(initConfig)) {
                oh.ri().lr();
                com.bytedance.sdk.openadsdk.utils.nr.ri();
            }
        } catch (Throwable unused) {
        }
        nr.lr(context);
        co.ri();
        com.bytedance.sdk.openadsdk.core.co.ik.ri(context);
    }

    private static void ka(Context context, InitConfig initConfig) {
        if (com.bytedance.sdk.openadsdk.core.settings.xha.ri()) {
            com.bytedance.sdk.openadsdk.xha.lr.ik();
            vr.lr.set(true);
            try {
                com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ri(new com.bytedance.sdk.openadsdk.qt.ri());
            } catch (Exception e) {
                ac.ik("PAGSdk", e.getMessage());
            }
            ik(initConfig);
            lr(context, initConfig);
            logician.attabal.competently(context, null);
            logician.attabal.beachfront(2);
            logician.attabal.impromptu(com.bytedance.sdk.openadsdk.ac.lr.lr().ik().xha());
        }
    }

    public static final void ri() {
        try {
            com.bytedance.sdk.component.lr.ri(new com.bytedance.sdk.component.lr.ri() { // from class: com.bytedance.sdk.openadsdk.mj.ri.1
                @Override // com.bytedance.sdk.component.lr.ri
                public ExecutorService ri() {
                    return dzy.fi();
                }

                @Override // com.bytedance.sdk.component.lr.ri
                public HandlerThread ri(String str, int i) {
                    return mj.ri(str, i);
                }
            });
            dzy.ri(new com.bytedance.sdk.component.mj.lr.ik("tt_init_memory_data") { // from class: com.bytedance.sdk.openadsdk.mj.ri.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.ihz.ri.lr.ri.ri().ri(false);
                    ApmHelper.initAPM();
                    ri.lr();
                }
            });
            vr.ri(System.currentTimeMillis());
            vr.lr();
            com.bytedance.sdk.component.jbs.di.setWebViewProvider(new com.bytedance.sdk.component.jbs.di.ka() { // from class: com.bytedance.sdk.openadsdk.mj.ri.3
                @Override // com.bytedance.sdk.component.jbs.di.ka
                public WebView ri(Context context, AttributeSet attributeSet, int i, com.bytedance.sdk.component.jbs.di.ik ikVar) {
                    if (zf.lr(ikVar)) {
                        return zf.lr(context, attributeSet, i, ikVar);
                    }
                    if (!(context instanceof MutableContextWrapper)) {
                        context = context.getApplicationContext();
                    }
                    try {
                        return i == 0 ? new com.bytedance.sdk.component.jbs.fi(context, attributeSet) : new com.bytedance.sdk.component.jbs.fi(context, attributeSet, i);
                    } catch (Exception unused) {
                        return i == 0 ? new com.bytedance.sdk.component.jbs.fi(context, attributeSet) : new com.bytedance.sdk.component.jbs.fi(context, attributeSet, i);
                    }
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void ri(Context context) {
        com.bytedance.sdk.openadsdk.core.ri.ri.ri(context);
        com.bytedance.sdk.openadsdk.utils.oh.ri();
        qd.ri(context);
        ka();
        nr.fi();
        String strRi = aw.ri(context);
        com.bytedance.sdk.openadsdk.core.sf.ik.lr(strRi);
        lr.ri(strRi, true);
        co.lr();
        com.bytedance.sdk.openadsdk.core.bgr.ik.ri.ri().lr();
    }

    private static void lr(Context context, InitConfig initConfig) {
        vr.ri = true;
        oh.ri().ri(initConfig.getAppId()).ka(initConfig.getPA()).ik(fr.ri(context)).ri(initConfig.getTitleBarTheme()).ik(initConfig.getAdxId());
        qt.ihz();
        if (initConfig instanceof PAGConfig) {
            oh.ri().lr(((PAGConfig) initConfig).getDebugLog() ? 1 : 0);
        }
        jbs.ri();
    }

    private static void ik(InitConfig initConfig) {
        if (initConfig == null) {
            return;
        }
        if (!TextUtils.isEmpty(initConfig.getData())) {
            qt.lr().ik(initConfig.getData());
        }
        qt.lr().ik(lr(initConfig));
    }

    public static void ri(Context context, InitConfig initConfig, PAGSdk.PAGInitCallback pAGInitCallback) {
        Context applicationContext;
        int pa;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        lr = jElapsedRealtime;
        vr.ik = jElapsedRealtime;
        nr.lr(context);
        if (pAGInitCallback != null) {
            List<PAGSdk.PAGInitCallback> list = ri;
            synchronized (list) {
                if (!list.contains(pAGInitCallback)) {
                    list.add(pAGInitCallback);
                    if (vr.ka() == 3) {
                        return;
                    }
                }
            }
        }
        if (com.bytedance.sdk.openadsdk.common.di.ri()) {
            lr(-1, "DisableSDK is called, interrupt initialization");
            return;
        }
        if (PAGSdk.isInitSuccess()) {
            di();
            ik(initConfig);
            return;
        }
        if (initConfig == null) {
            lr(4000, "PAGConfig is null, please check.");
            return;
        }
        vr.ri(3);
        if (com.bytedance.sdk.openadsdk.core.qt.lr.ri().sf() && ((pa = initConfig.getPA()) < -1 || pa > 1)) {
            lr(10004, com.bytedance.sdk.openadsdk.core.jbs.ri(10004));
            return;
        }
        if (context == null) {
            lr(4000, "Context is null, please check. ");
            return;
        }
        if (!(context instanceof Application) && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        ik(context, initConfig);
        try {
            ApmHelper.initApm(context, initConfig.getAppId());
            qt.ri(new bgr() { // from class: com.bytedance.sdk.openadsdk.mj.ri.4
                @Override // com.bytedance.sdk.openadsdk.core.bgr
                public void ri(int i, String str) {
                    ri.lr(i, str);
                }
            });
            try {
                uq.ri(nr.ri(), "tt_ad_logo_txt");
                if (uq.ka(context, "tt_ad_logo") == 0) {
                    ri(initConfig, pAGInitCallback);
                    return;
                }
                if (PAGSdk.isInitSuccess()) {
                    if (pAGInitCallback != null) {
                        di();
                    }
                } else {
                    final com.bytedance.sdk.openadsdk.fi.ri riVar = new com.bytedance.sdk.openadsdk.fi.ri();
                    SDKTypeConfig.setSdkTypeFactory(new ISDKTypeFactory() { // from class: com.bytedance.sdk.openadsdk.mj.ri.5
                        @Override // com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory
                        public IADTypeLoaderFactory createADTypeLoaderFactory(String str) {
                            return riVar;
                        }
                    });
                    ri(context, initConfig);
                }
            } catch (Throwable unused) {
                ri(initConfig, pAGInitCallback);
            }
        } catch (Throwable unused2) {
            lr(4000, "Internal Error, setting exception. ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lr(InitConfig initConfig) {
        return ((PAGConfig) initConfig).getDebugLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lr(int i, String str) {
        vr.ri(2);
        try {
            List<PAGSdk.PAGInitCallback> list = ri;
            synchronized (list) {
                try {
                    Iterator<PAGSdk.PAGInitCallback> it = list.iterator();
                    while (it.hasNext()) {
                        PAGSdk.PAGInitCallback next = it.next();
                        if (next != null) {
                            it.remove();
                            next.fail(i, str);
                        }
                    }
                    ik.ik(new ka() { // from class: com.bytedance.sdk.openadsdk.mj.ri.9
                        @Override // com.bytedance.sdk.openadsdk.nr.ka
                        public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                            com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                            riVar.lr(X3.a.f);
                            return riVar;
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            ac.ik(th2.getMessage(), new Object[0]);
        }
    }

    private static void ri(InitConfig initConfig, PAGSdk.PAGInitCallback pAGInitCallback) {
        vr.ri(2);
        if (pAGInitCallback != null) {
            if (initConfig instanceof PAGConfig) {
                lr(4000, "resources not found, if you use aab please call PAGConfig.setPackageName");
            } else {
                lr(4000, "resources not found, if you use aab please call TTAdConfig.setPackageName");
            }
        }
    }

    private static void ri(Context context, InitConfig initConfig) {
        long j;
        try {
            if (PAGSdk.isInitSuccess()) {
                di();
                return;
            }
            ka(context, initConfig);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - lr;
            di();
            fi(context, initConfig);
            j = jElapsedRealtime;
            ri(context, PAGSdk.isInitSuccess(), initConfig, SystemClock.elapsedRealtime() - lr, j);
        } catch (Throwable th) {
            th.getMessage();
            ac.ik("PAGSdk", th.getMessage());
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - lr;
            lr(4000, th.getMessage());
            j = jElapsedRealtime2;
        }
    }

    private static void ri(final Context context, final boolean z, final InitConfig initConfig, final long j, final long j2) {
        com.bytedance.sdk.openadsdk.slm.ka.ri("pangle_sdk_init", false, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.mj.ri.7
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    boolean zIk = qt.lr().ik();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                    jSONObject.put("sdk_init_time", j2);
                    jSONObject.put("is_async", true);
                    jSONObject.put("is_multi_process", true ^ com.bytedance.sdk.component.utils.ihz.ri(context));
                    jSONObject.put("is_debug", ri.lr(initConfig));
                    jSONObject.put("is_use_texture_view", initConfig.isUseTextureView());
                    jSONObject.put("is_activate_init", zIk);
                    jSONObject.put("minSdkVersion", ig.xha(context));
                    jSONObject.put("targetSdkVersion", ig.di(context));
                    jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                    jSONObject.put("is_success", z);
                    jSONObject.put("support_hevc_levels", shimmery.saneness.wireman());
                    qt.lr().lr(false);
                } catch (Exception e) {
                    ac.ri("PAGSdk", "run: ", e);
                }
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("pangle_sdk_init").lr(jSONObject.toString());
            }
        });
    }

    public static void ri(PAGBiddingRequest pAGBiddingRequest, PAGBidCallback pAGBidCallback) {
        if (pAGBidCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.di.ri()) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10009, com.bytedance.sdk.openadsdk.core.jbs.ri(10009)));
            return;
        }
        if (nr.ri() == null) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, "Context is null, please check."));
            return;
        }
        hcw hcwVarRi = oh.ri();
        if (hcwVarRi != null) {
            hcwVarRi.ri(pAGBiddingRequest, pAGBidCallback);
        } else {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, "Internal exception"));
        }
    }
}
