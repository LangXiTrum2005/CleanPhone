package com.bytedance.sdk.openadsdk.api.init;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebView;
import androidx.core.view.inputmethod.a;
import com.applovin.impl.Z;
import com.bytedance.adsdk.ugeno.wd.mml;
import com.bytedance.sdk.component.jpc.to;
import com.bytedance.sdk.component.qdl;
import com.bytedance.sdk.component.tvp.mo;
import com.bytedance.sdk.component.tvp.mzz;
import com.bytedance.sdk.component.utils.bch;
import com.bytedance.sdk.component.utils.jpc;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.component.utils.vu;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;
import com.bytedance.sdk.openadsdk.bch.ud.wd;
import com.bytedance.sdk.openadsdk.core.bjy;
import com.bytedance.sdk.openadsdk.core.exu;
import com.bytedance.sdk.openadsdk.core.kdv;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.core.settings.rq;
import com.bytedance.sdk.openadsdk.core.tvp;
import com.bytedance.sdk.openadsdk.core.tvp.fs;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.multipro.lnr;
import com.bytedance.sdk.openadsdk.multipro.ud;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.aaj;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.jl;
import com.bytedance.sdk.openadsdk.utils.jtx;
import com.p004ironsource.d9;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class PAGSdk {
    public static final int INIT_LOCAL_FAIL_CODE = 4000;
    private static long qdl;

    public interface PAGInitCallback {
        void fail(int i2, String str);

        void success();
    }

    static {
        try {
            qdl.qdl(new qdl.InterfaceC0090qdl() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.1
                @Override // com.bytedance.sdk.component.qdl.InterfaceC0090qdl
                public ExecutorService getExecutorService() {
                    return fco.mzz();
                }

                @Override // com.bytedance.sdk.component.qdl.InterfaceC0090qdl
                public HandlerThread getSafeHandlerThread(String str, int i2) {
                    return jpc.qdl(str, i2);
                }
            });
            fco.qdl(new com.bytedance.sdk.component.jpc.jpc("tt_init_memory_data") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.exc.qdl.ud.qdl.qdl().qdl(false);
                    PAGInitHelper.initAPM();
                    PAGInitHelper.initMemoryData();
                }
            });
            rdp.qdl(System.currentTimeMillis());
            rdp.ud();
            mo.setWebViewProvider(new mo.mml() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.3
                @Override // com.bytedance.sdk.component.tvp.mo.mml
                public WebView createWebView(Context context, AttributeSet attributeSet, int i2, mo.lnr lnrVar) {
                    if (vu.ud(lnrVar)) {
                        return vu.ud(context, attributeSet, i2, lnrVar);
                    }
                    if (!(context instanceof MutableContextWrapper)) {
                        context = context.getApplicationContext();
                    }
                    try {
                        return i2 == 0 ? new mzz(context, attributeSet) : new mzz(context, attributeSet, i2);
                    } catch (Exception unused) {
                        return i2 == 0 ? new mzz(context, attributeSet) : new mzz(context, attributeSet, i2);
                    }
                }
            });
        } catch (Throwable th) {
            Log.i("TTAD.PAGSdk", th.getMessage());
        }
        qdl = 0L;
    }

    public static void addPAGInitCallback(PAGInitCallback pAGInitCallback) {
        if (pAGInitCallback != null && rdp.mml() == 0) {
            PAGInitHelper.CALLBACK_LIST.add(pAGInitCallback);
        }
    }

    public static void closeMultiWebViewFileLock() {
        lnr.qdl();
    }

    public static void getBiddingToken(final Context context, final PAGBiddingRequest pAGBiddingRequest, final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.mzz.qdl()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            fco.mzz(new com.bytedance.sdk.component.jpc.jpc("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.13
                @Override // java.lang.Runnable
                public void run() {
                    yt.ud(context);
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.ud(pAGBiddingRequest));
                    com.bytedance.sdk.openadsdk.exc.qdl.ud.qdl.qdl().qdl(false);
                }
            });
        }
    }

    public static String getSDKVersion() {
        return kdv.qdl() != null ? kdv.qdl().lnr() : "";
    }

    public static void init(final Context context, final PAGConfig pAGConfig, final PAGInitCallback pAGInitCallback) {
        rdp.ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.12
            @Override // java.lang.Runnable
            public void run() {
                PAGSdk.ud(context, pAGConfig, pAGInitCallback);
            }
        });
        rdp.jpc();
    }

    public static boolean isInitSuccess() {
        return rdp.mml() == 1;
    }

    private static void lnr(Context context, InitConfig initConfig) {
        rdp.qdl = true;
        kdv.qdl().qdl(initConfig.getAppId()).ud(initConfig.getGdpr()).mzz(initConfig.getPA()).mml(initConfig.getAppIconId()).qdl(initConfig.getTitleBarTheme()).lnr(initConfig.getAdxId());
        tvp.ljh();
        if (initConfig instanceof PAGConfig) {
            kdv.qdl().lnr(((PAGConfig) initConfig).getDebugLog() ? 1 : 0);
        }
        try {
            if (ud(initConfig)) {
                kdv.qdl().qdl();
                jl.qdl();
            }
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.utils.tvp.qdl();
    }

    private static void mml(Context context, InitConfig initConfig) {
        if (TextUtils.isEmpty(initConfig.getPackageName())) {
            ljh.qdl((String) null);
            mml.qdl((String) null);
        } else {
            ljh.qdl(initConfig.getPackageName());
            mml.qdl(initConfig.getPackageName());
        }
        yt.ud(context);
        if (initConfig.isSupportMultiProcess()) {
            ud.qdl();
        } else {
            ud.ud();
        }
        fs.qdl();
        com.bytedance.sdk.openadsdk.core.rq.ud.qdl(context);
    }

    private static void mo(final Context context, final InitConfig initConfig) {
        SystemClock.elapsedRealtime();
        fco.qdl(new com.bytedance.sdk.component.jpc.jpc("init_sync") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.8
            @Override // java.lang.Runnable
            public void run() {
                rdp.qdl(initConfig.getData());
                com.bytedance.sdk.openadsdk.jyq.qdl.qdl(context, initConfig.getAppId());
                com.bytedance.sdk.openadsdk.jyq.qdl.qdl();
                com.bytedance.sdk.openadsdk.yt.lnr.qdl();
                com.bytedance.sdk.openadsdk.yt.lnr.ud();
                new jtx();
                com.bytedance.sdk.component.adexpress.qdl.ud.mo.qdl(aaj.qdl() * 10);
                com.bytedance.sdk.openadsdk.mml.qdl.ud.qdl(context, initConfig.isSupportMultiProcess());
                bjy.qdl().ud();
                com.bytedance.sdk.openadsdk.core.to.lnr.qdl();
                com.bytedance.sdk.openadsdk.ljh.qdl.qdl(new com.bytedance.sdk.openadsdk.ljh.qdl.InterfaceC0143qdl() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.8.1
                    public void onGdprChanged(int i2) {
                        PAGConfig.setGDPRConsent(i2);
                    }
                });
                rq.mml = rq.ud(context);
                wd.ud();
                com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl(yt.mml().ra());
                com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl(CacheDirFactory.getICacheDir(0));
                rq rqVarMml = yt.mml();
                if (!rqVarMml.lte()) {
                    synchronized (rqVarMml) {
                        try {
                            if (!rqVarMml.lte()) {
                                rqVarMml.mml();
                                rqVarMml.gy();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                DeviceUtils.rq();
                PAGInitHelper.maybeAsyncInitTask(context);
                PAGSdk.getBiddingToken();
                com.bytedance.sdk.component.jpc.mo.qdl(true);
                com.bytedance.sdk.component.jpc.mo.qdl(new com.bytedance.sdk.openadsdk.bjy.ud.qdl());
                DeviceUtils.qdl(context);
                DeviceUtils.rq(context);
                DeviceUtils.fs(context);
                com.bytedance.sdk.openadsdk.bjy.qdl.qdl();
                com.bytedance.sdk.openadsdk.core.settings.mml.qdl();
                com.bytedance.sdk.openadsdk.bjy.lnr.mml();
                gy.tvp(context);
                com.bytedance.sdk.openadsdk.mml.lnr.qdl();
                PAGSdk.lnr();
                com.bytedance.sdk.openadsdk.core.to.lnr.ud();
                com.bytedance.sdk.openadsdk.core.mzz.qdl.qdl().ud();
                com.bytedance.sdk.component.jpc.lnr.lnr.qdl(rdp.ud());
                com.bytedance.sdk.component.utils.ud.qdl(new com.bytedance.sdk.component.utils.ud.qdl() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.8.2
                    @Override // com.bytedance.sdk.component.utils.ud.qdl
                    public ExecutorService getAsyncStartActivityThreadPool() {
                        return fco.tvp();
                    }

                    @Override // com.bytedance.sdk.component.utils.ud.qdl
                    public boolean isEnableAsyncStartActivity() {
                        return com.bytedance.sdk.openadsdk.jyq.qdl.qdl("start_activity_async", 0) == 1;
                    }

                    @Override // com.bytedance.sdk.component.utils.ud.qdl
                    public boolean isStartActivityBySubThread() {
                        return com.bytedance.sdk.openadsdk.jyq.qdl.qdl("start_act_asy", 0) == 1;
                    }
                });
                gy.lnr();
                bch.qdl(new bch.ud() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.8.3
                    @Override // com.bytedance.sdk.component.utils.bch.ud
                    public void reportStatsByRate(final String str, boolean z2, final bch.qdl qdlVar) {
                        com.bytedance.sdk.openadsdk.bjy.lnr.qdl(str, z2, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.8.3.1
                            @Override // com.bytedance.sdk.openadsdk.bjy.ud
                            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                                return com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl(str).ud(qdlVar.ud());
                            }
                        });
                    }
                });
                vu.qdl(com.bytedance.sdk.openadsdk.jyq.qdl.qdl("webview_reuse_config", (String) null));
            }
        });
    }

    private static void mzz(Context context, InitConfig initConfig) {
        if (com.bytedance.sdk.openadsdk.core.settings.wd.qdl()) {
            com.bytedance.sdk.component.jpc.mo.lnr(-1);
            com.bytedance.sdk.component.jpc.mzz.qdl(new to() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.7
                @Override // com.bytedance.sdk.component.jpc.to
                public com.bytedance.sdk.component.jpc.tvp createThreadFactory(int i2, String str) {
                    return new com.bytedance.sdk.component.jpc.tvp(i2, str) { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.7.1
                        @Override // com.bytedance.sdk.component.jpc.tvp, java.util.concurrent.ThreadFactory
                        public Thread newThread(Runnable runnable) {
                            if (com.bytedance.sdk.component.jpc.tvp.sCrashHappened) {
                                return null;
                            }
                            int iRzg = rq.lnr().rzg();
                            if (iRzg < -524288 || iRzg >= 0) {
                                return super.newThread(runnable);
                            }
                            Thread thread = new Thread(this.qdl, runnable, this.ud, iRzg);
                            if (thread.isDaemon()) {
                                thread.setDaemon(false);
                            }
                            int i3 = this.lnr;
                            if (i3 > 10 || i3 <= 0) {
                                this.lnr = 5;
                            }
                            thread.setPriority(this.lnr);
                            return thread;
                        }
                    };
                }
            });
            lnr.qdl(context);
            com.bytedance.sdk.openadsdk.wd.ud.lnr();
            rdp.ud.set(true);
            try {
                com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().qdl(new com.bytedance.sdk.openadsdk.tvp.qdl());
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.aaj.lnr("TTAD.PAGSdk", e2.getMessage());
            }
            lnr(initConfig);
            lnr(context, initConfig);
            com.bykv.vk.openvk.qdl.qdl.qdl.lnr.qdl(context, null);
            com.bykv.vk.openvk.qdl.qdl.qdl.lnr.qdl(2);
            com.bykv.vk.openvk.qdl.qdl.qdl.lnr.qdl(initConfig.isSupportMultiProcess());
            com.bykv.vk.openvk.qdl.qdl.qdl.lnr.qdl(com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().mo());
        }
    }

    public static boolean onlyVerityPlayable(String str, int i2, String str2, String str3, String str4) {
        if (kdv.qdl() != null) {
            return kdv.qdl().qdl(str, i2, str2, str3, str4);
        }
        return false;
    }

    public static void setAabPackageName(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ljh.qdl(str);
        mml.qdl(str);
    }

    public static void setAdRevenue(JSONObject jSONObject) {
        if (jSONObject != null && yt.mml().exc() && isInitSuccess()) {
            com.bytedance.sdk.openadsdk.bjy.lnr.qdl().qdl(jSONObject);
        }
    }

    private static void setSdkDisable(boolean z2) {
        com.bytedance.sdk.openadsdk.common.mzz.qdl(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ud(final Context context, final InitConfig initConfig, PAGInitCallback pAGInitCallback) {
        Context applicationContext;
        qdl = SystemClock.elapsedRealtime();
        yt.ud(context);
        if (pAGInitCallback != null) {
            List<PAGInitCallback> list = PAGInitHelper.CALLBACK_LIST;
            synchronized (list) {
                if (!list.contains(pAGInitCallback)) {
                    list.add(pAGInitCallback);
                    if (rdp.mml() == 3) {
                        return;
                    }
                }
            }
        }
        if (com.bytedance.sdk.openadsdk.common.mzz.qdl()) {
            ud(-1, "DisableSDK is called, interrupt initialization");
            return;
        }
        if (isInitSuccess()) {
            mml();
            lnr(initConfig);
            return;
        }
        if (initConfig == null) {
            ud(4000, "PAGConfig is null, please check.");
            return;
        }
        rdp.qdl(3);
        int pa = initConfig.getPA();
        if (pa < -1 || pa > 1) {
            ud(10004, com.bytedance.sdk.openadsdk.core.jpc.qdl(10004));
            return;
        }
        if (context == null) {
            ud(4000, "Context is null, please check. ");
            return;
        }
        if (!(context instanceof Application) && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        mml(context, initConfig);
        ApmHelper.initApm(context, initConfig);
        try {
            tvp.qdl(new exu() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.4
                @Override // com.bytedance.sdk.openadsdk.core.exu
                public void fail(int i2, String str) {
                    PAGSdk.ud(i2, str);
                }

                public void success() {
                    PAGSdk.mml();
                }
            });
            try {
                ljh.qdl(yt.qdl(), "tt_ad_logo_txt");
                if (ljh.mml(context, "tt_ad_logo") == 0) {
                    qdl(initConfig, pAGInitCallback);
                    return;
                }
                if (isInitSuccess()) {
                    if (pAGInitCallback != null) {
                        mml();
                        return;
                    }
                    return;
                }
                final com.bytedance.sdk.openadsdk.mzz.qdl qdlVar = new com.bytedance.sdk.openadsdk.mzz.qdl();
                SDKTypeConfig.setSdkTypeFactory(new ISDKTypeFactory() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.5
                    @Override // com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory
                    public IADTypeLoaderFactory createADTypeLoaderFactory(String str) {
                        return qdlVar;
                    }
                });
                if (!initConfig.isSupportMultiProcess()) {
                    ud(context, initConfig);
                } else {
                    com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl().qdl(new com.bytedance.sdk.openadsdk.multipro.aidl.ud() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.6
                        @Override // com.bytedance.sdk.openadsdk.multipro.aidl.ud
                        public void onServiceConnected() {
                            rdp.ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.6.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                    PAGSdk.ud(context, initConfig);
                                }
                            });
                        }
                    });
                    com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl().lnr();
                }
            } catch (Throwable unused) {
                qdl(initConfig, pAGInitCallback);
            }
        } catch (Throwable unused2) {
            ud(4000, "Internal Error, setting exception. ");
        }
    }

    public static void getBiddingToken(final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.mzz.qdl()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            fco.mzz(new com.bytedance.sdk.component.jpc.jpc("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.14
                @Override // java.lang.Runnable
                public void run() {
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.getBiddingToken());
                    com.bytedance.sdk.openadsdk.exc.qdl.ud.qdl.qdl().qdl(false);
                }
            });
        }
    }

    public static void getBiddingToken(final String str, final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.mzz.qdl()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            fco.mzz(new com.bytedance.sdk.component.jpc.jpc("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.15
                @Override // java.lang.Runnable
                public void run() {
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.getBiddingToken(str));
                    com.bytedance.sdk.openadsdk.exc.qdl.ud.qdl.qdl().qdl(false);
                }
            });
        }
    }

    private static void qdl(InitConfig initConfig, PAGInitCallback pAGInitCallback) {
        rdp.qdl(2);
        if (pAGInitCallback != null) {
            if (initConfig instanceof PAGConfig) {
                ud(4000, "resources not found, if you use aab please call PAGConfig.setPackageName");
            } else {
                ud(4000, "resources not found, if you use aab please call TTAdConfig.setPackageName");
            }
        }
    }

    public static String getBiddingToken(Context context) {
        if (com.bytedance.sdk.openadsdk.common.mzz.qdl()) {
            return null;
        }
        yt.ud(context);
        return getBiddingToken();
    }

    private static void qdl(final Context context, final boolean z2, final InitConfig initConfig, final long j, final long j2) {
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl();
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl("pangle_sdk_init", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.9
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    boolean zLnr = tvp.ud().lnr();
                    jSONObject.put("duration", j);
                    jSONObject.put("sdk_init_time", j2);
                    jSONObject.put("is_async", true);
                    jSONObject.put("is_multi_process", initConfig.isSupportMultiProcess());
                    jSONObject.put("is_debug", PAGSdk.ud(initConfig));
                    jSONObject.put("is_use_texture_view", initConfig.isUseTextureView());
                    jSONObject.put("is_activate_init", zLnr);
                    jSONObject.put("minSdkVersion", gy.wd(context));
                    jSONObject.put("targetSdkVersion", gy.mo(context));
                    jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                    jSONObject.put("is_success", z2);
                    tvp.ud().ud(false);
                } catch (Exception e2) {
                    com.bytedance.sdk.component.utils.aaj.qdl("TTAD.PAGSdk", "run: ", e2);
                }
                return com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl("pangle_sdk_init").ud(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mml() {
        rdp.qdl(1);
        try {
            List<PAGInitCallback> list = PAGInitHelper.CALLBACK_LIST;
            synchronized (list) {
                try {
                    Iterator<PAGInitCallback> it = list.iterator();
                    while (it.hasNext()) {
                        PAGInitCallback next = it.next();
                        if (next != null) {
                            it.remove();
                            next.success();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            com.bytedance.sdk.openadsdk.yt.lnr.ud(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.10
                @Override // com.bytedance.sdk.openadsdk.yt.mml
                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                    return Z.i(d9.a.f);
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.lnr(th2.getMessage(), new Object[0]);
        }
    }

    public static String getBiddingToken(Context context, String str) {
        if (com.bytedance.sdk.openadsdk.common.mzz.qdl()) {
            return null;
        }
        yt.ud(context);
        return getBiddingToken(str);
    }

    public static String getBiddingToken(String str) {
        if (com.bytedance.sdk.openadsdk.common.mzz.qdl()) {
            return null;
        }
        if (yt.qdl() == null || kdv.qdl() == null) {
            return "";
        }
        PAGBiddingRequest pAGBiddingRequest = new PAGBiddingRequest();
        pAGBiddingRequest.setSlotId(str);
        return kdv.qdl().qdl(pAGBiddingRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lnr() {
        ShortcutManager shortcutManagerA;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context contextQdl = yt.qdl();
                if (contextQdl == null || (shortcutManagerA = a.a(contextQdl.getSystemService(a.b()))) == null) {
                    return;
                }
                tvp.ud().qdl(shortcutManagerA.isRequestPinShortcutSupported());
            } catch (Throwable unused) {
            }
        }
    }

    private static void lnr(InitConfig initConfig) {
        if (initConfig == null) {
            return;
        }
        if (!TextUtils.isEmpty(initConfig.getData())) {
            tvp.ud().lnr(initConfig.getData());
        }
        tvp.ud().lnr(ud(initConfig));
    }

    public static String getBiddingToken() {
        if (com.bytedance.sdk.openadsdk.common.mzz.qdl()) {
            return null;
        }
        return (yt.qdl() == null || kdv.qdl() == null) ? "" : kdv.qdl().qdl((PAGBiddingRequest) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ud(Context context, InitConfig initConfig) {
        long j;
        try {
            if (isInitSuccess()) {
                mml();
                return;
            }
            mzz(context, initConfig);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - qdl;
            mml();
            mo(context, initConfig);
            j = jElapsedRealtime;
            qdl(context, isInitSuccess(), initConfig, SystemClock.elapsedRealtime() - qdl, j);
        } catch (Throwable th) {
            th.getMessage();
            com.bytedance.sdk.component.utils.aaj.lnr("TTAD.PAGSdk", th.getMessage());
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - qdl;
            ud(4000, th.getMessage());
            j = jElapsedRealtime2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean ud(InitConfig initConfig) {
        return ((PAGConfig) initConfig).getDebugLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ud(int i2, String str) {
        rdp.qdl(2);
        try {
            List<PAGInitCallback> list = PAGInitHelper.CALLBACK_LIST;
            synchronized (list) {
                try {
                    Iterator<PAGInitCallback> it = list.iterator();
                    while (it.hasNext()) {
                        PAGInitCallback next = it.next();
                        if (next != null) {
                            it.remove();
                            next.fail(i2, str);
                        }
                    }
                    com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.11
                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                            return Z.i(d9.a.f);
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.lnr(th2.getMessage(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String ud(PAGBiddingRequest pAGBiddingRequest) {
        if (com.bytedance.sdk.openadsdk.common.mzz.qdl()) {
            return null;
        }
        return (yt.qdl() == null || kdv.qdl() == null) ? "" : kdv.qdl().qdl(pAGBiddingRequest);
    }
}
