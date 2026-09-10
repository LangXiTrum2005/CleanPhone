package com.mbridge.msdk.system;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.q9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AuthorityInfoBean;
import com.mbridge.msdk.foundation.controller.authoritycontroller.CallBackForDeveloper;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.same.report.f;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.MIMManager;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.DeveloperTransferIdInfo;
import com.mbridge.msdk.out.OnCompletionListener;
import com.mbridge.msdk.out.SDKInitStatusListener;
import d5.u;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements MBridgeSDK {
    protected static final String LOG_TAG = "com.mbridge.msdk";
    public static Map<String, Object> componentParams = new HashMap();
    public static Map<String, String> map;
    private com.mbridge.msdk.system.b mBridgeSDKImplDiff;
    protected volatile Context mContext;
    protected SDKInitStatusListener mStatusListener;
    protected volatile AtomicBoolean sdkInited;
    public boolean isCoolStart = true;
    protected volatile MBridgeSDK.PLUGIN_LOAD_STATUS STATUS = MBridgeSDK.PLUGIN_LOAD_STATUS.INITIAL;
    protected boolean initCallbacked = false;
    protected boolean isRegisteredLifeCycle = false;
    protected volatile boolean isMIMinited = false;
    protected volatile boolean isInitStarted = false;
    private final Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new C0185a();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f36096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f36097b;

        public b(boolean z10, String str) {
            this.f36096a = z10;
            this.f36097b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKInitStatusListener sDKInitStatusListener = a.this.mStatusListener;
            if (sDKInitStatusListener != null) {
                if (this.f36096a) {
                    sDKInitStatusListener.onInitSuccess();
                } else {
                    sDKInitStatusListener.onInitFail(this.f36097b);
                }
            }
        }
    }

    private void callbackToDeveloper(boolean z10, long j10, boolean z11, String str) {
        this.isInitStarted = false;
        if (z10) {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new b(z11, str));
        } else {
            SDKInitStatusListener sDKInitStatusListener = this.mStatusListener;
            if (sDKInitStatusListener != null) {
                if (z11) {
                    sDKInitStatusListener.onInitSuccess();
                } else {
                    sDKInitStatusListener.onInitFail(str);
                }
            }
        }
        j.a(z11, j10, str);
    }

    private void initMIMManager() {
        try {
            String str = Build.MANUFACTURER;
            if (TextUtils.isEmpty(str) || !str.equals("Xiaomi")) {
                return;
            }
            this.isMIMinited = true;
            MIMManager.b().b(this.mContext.getApplicationContext());
        } catch (Throwable th2) {
            q0.b("com.mbridge.msdk", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public /* synthetic */ void lambda$init$0(boolean z10, long j10) {
        try {
            t0.a(this.mContext);
            com.mbridge.msdk.system.b bVar = new com.mbridge.msdk.system.b();
            this.mBridgeSDKImplDiff = bVar;
            bVar.a(map);
            com.mbridge.msdk.foundation.controller.d.a().a(map, this.mContext);
            this.STATUS = MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED;
            this.mBridgeSDKImplDiff.a(this.mContext);
            f.a().c();
            v0.f();
            initMIMManager();
            g0.a().c();
            this.sdkInited.set(true);
            if (!this.initCallbacked) {
                this.initCallbacked = true;
                callbackToDeveloper(z10, System.currentTimeMillis() - j10, true, "");
            }
            try {
                com.mbridge.msdk.foundation.same.report.e.c().b();
            } catch (Throwable th2) {
                q0.b("com.mbridge.msdk", th2.getMessage());
            }
            try {
                if (this.mContext instanceof Application) {
                    registerActivityLifecycleListener((Application) this.mContext);
                    return;
                }
                return;
            } catch (Throwable th3) {
                q0.b("com.mbridge.msdk", th3.getMessage());
                return;
            }
        } catch (Throwable th4) {
            this.sdkInited.set(false);
            if (this.initCallbacked) {
            }
            this.initCallbacked = true;
            callbackToDeveloper(z10, System.currentTimeMillis() - j10, false, th4.getMessage());
        }
        this.sdkInited.set(false);
        if (this.initCallbacked) {
            this.initCallbacked = true;
            callbackToDeveloper(z10, System.currentTimeMillis() - j10, false, th4.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(boolean z10, Map map2) {
        try {
            com.mbridge.msdk.config.manager.a.c().a();
            if (map2 == null || map2.isEmpty()) {
                return;
            }
            Object obj = map2.get("result");
            String strValueOf = String.valueOf(map2.get("reason"));
            Object obj2 = map2.get(IronSourceConstants.EVENTS_DURATION);
            if (this.initCallbacked) {
                return;
            }
            this.initCallbacked = true;
            long jLongValue = obj2 != null ? ((Long) obj2).longValue() : 0L;
            boolean z11 = obj != null && ((Integer) obj).intValue() == 1;
            if (TextUtils.isEmpty(strValueOf) || strValueOf.equalsIgnoreCase("null")) {
                strValueOf = "";
            }
            callbackToDeveloper(z10, jLongValue, z11, strValueOf);
        } catch (Throwable th2) {
            q0.b("com.mbridge.msdk", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(final boolean z10) {
        try {
            com.mbridge.msdk.foundation.controller.c.n().b(this.mContext);
            setDefaultComponentValue();
            com.mbridge.msdk.config.manager.callback.a aVar = new com.mbridge.msdk.config.manager.callback.a() { // from class: com.mbridge.msdk.system.d
                @Override // com.mbridge.msdk.config.manager.callback.a
                public final void a(Map map2) {
                    this.f36099a.lambda$init$1(z10, map2);
                }
            };
            com.mbridge.msdk.config.manager.a.c().a(componentParams, aVar);
            com.mbridge.msdk.config.manager.b.a(this.mContext, componentParams, aVar);
            if (componentParams.containsKey(MBridgeConstans.APP_ID)) {
                Object obj = componentParams.get(MBridgeConstans.APP_ID);
                Object obj2 = componentParams.get(MBridgeConstans.APP_KEY);
                if (obj instanceof String) {
                    com.mbridge.msdk.config.component.common.util.b.a(this.mContext).b(MBridgeConstans.APP_ID, String.valueOf(obj));
                    com.mbridge.msdk.config.component.common.util.b.a(this.mContext).b(MBridgeConstans.APP_KEY, String.valueOf(obj2));
                }
            }
        } catch (Throwable th2) {
            q0.b("com.mbridge.msdk", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$registerActivityLifecycleListener$3(com.mbridge.msdk.config.component.base.b bVar) {
        String strC = bVar.c();
        strC.getClass();
        if (strC.equals("916003")) {
            j.a("1");
        } else if (strC.equals("916004")) {
            j.a("2");
        }
    }

    private void sendApiCallEvent(String str, String str2) {
        if (this.mContext != null && com.mbridge.msdk.config.manager.a.c().d()) {
            com.mbridge.msdk.config.manager.a.c().a(str, str2, componentParams);
        }
    }

    private void setDefaultComponentValue() {
        try {
            if (!componentParams.containsKey("allow_acquire_id")) {
                componentParams.put("allow_acquire_id", 1);
            }
            if (!componentParams.containsKey("allow_transfer_ids_if_limit")) {
                componentParams.put("allow_transfer_ids_if_limit", 1);
            }
            if (!componentParams.containsKey("consent_status")) {
                componentParams.put("consent_status", 3);
            }
            if (!componentParams.containsKey("do_not_track")) {
                componentParams.put("do_not_track", 0);
            }
            if (!componentParams.containsKey("coppa")) {
                componentParams.put("coppa", 0);
            }
            if (componentParams.containsKey("channel")) {
                return;
            }
            componentParams.put("channel", Aa.a());
        } catch (Throwable th2) {
            q0.b("com.mbridge.msdk", th2.getMessage());
        }
    }

    private void unregisterActivityLifecycleListener(Application application) {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
        if (!this.isRegisteredLifeCycle || (activityLifecycleCallbacks = this.activityLifecycleCallbacks) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    public void checkAliveContext(Context context) {
        if (com.mbridge.msdk.foundation.controller.c.n().d() != null || context == null) {
            return;
        }
        this.mContext = context.getApplicationContext();
        com.mbridge.msdk.foundation.controller.c.n().b(context);
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public boolean getConsentStatus(Context context) {
        checkAliveContext(context);
        return com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().b();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public Map<String, String> getMBConfigurationMap(String str, String str2) {
        return getMBConfigurationMap(str, str2, "");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public MBridgeSDK.PLUGIN_LOAD_STATUS getStatus() {
        return this.STATUS;
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void init(Map<String, String> map2, Application application) {
        this.mContext = application.getApplicationContext();
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void initAsync(Map<String, String> map2, Application application) {
        this.mContext = application.getApplicationContext();
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void preload(Map<String, Object> map2) {
        if (this.STATUS == MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            com.mbridge.msdk.foundation.controller.d.a().a(map2, 0);
        }
        componentParams.put("preload", map2);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c21");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void preloadFrame(Map<String, Object> map2) {
        com.mbridge.msdk.foundation.controller.d.a().a(map2, 1);
    }

    public void registerActivityLifecycleListener(Application application) {
        boolean z10;
        try {
            z10 = s0.a().b("c_r_a_l_c", 0) == 0;
        } catch (Exception e10) {
            q0.b("com.mbridge.msdk", e10.getMessage());
        }
        try {
            com.mbridge.msdk.config.component.status.b bVar = com.mbridge.msdk.foundation.controller.a.f33386s;
            if (bVar != null) {
                bVar.a(new c());
                this.isRegisteredLifeCycle = true;
            } else {
                if (application == null || !z10) {
                    return;
                }
                application.registerActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
                this.isRegisteredLifeCycle = true;
            }
        } catch (Throwable th2) {
            q0.b("com.mbridge.msdk", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void release() {
        try {
            if (this.STATUS == MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
                com.mbridge.msdk.foundation.controller.d.a().f();
            }
            if (this.mContext instanceof Application) {
                unregisterActivityLifecycleListener((Application) this.mContext);
            }
            com.mbridge.msdk.system.b bVar = this.mBridgeSDKImplDiff;
            if (bVar != null) {
                bVar.a();
            }
            g0.a().e();
            sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c24");
            MIMManager.b().i();
        } catch (Throwable th2) {
            q0.b("com.mbridge.msdk", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setAllowAcquireIds(boolean z10) {
        componentParams.put("allow_acquire_ids", Integer.valueOf(z10 ? 1 : 2));
        com.mbridge.msdk.foundation.controller.authoritycontroller.b.a(z10);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c5");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setAllowTransferIdsIfLimit(boolean z10) {
        componentParams.put("allow_transfer_ids_if_limit", Integer.valueOf(z10 ? 1 : 2));
        com.mbridge.msdk.foundation.controller.authoritycontroller.b.b(z10);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c25");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setConsentStatus(Context context, int i10) {
        checkAliveContext(context);
        componentParams.put("consent_status", Integer.valueOf(i10 != 1 ? 2 : 1));
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().a(i10);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c8");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setCoppaStatus(Context context, boolean z10) {
        checkAliveContext(context);
        componentParams.put("coppa", Integer.valueOf(z10 ? 1 : 2));
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().b(z10 ? 1 : 2);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c7");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setDeveloperIds(DeveloperTransferIdInfo developerTransferIdInfo) {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.i() || developerTransferIdInfo == null || TextUtils.isEmpty(developerTransferIdInfo.getGaid())) {
            return;
        }
        g.a(developerTransferIdInfo.getGaid());
        componentParams.put("developer_gaid", developerTransferIdInfo.getGaid());
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c9");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    @Deprecated
    public void setDoNotTrackStatus(boolean z10) {
        componentParams.put("do_not_track", Integer.valueOf(z10 ? 1 : 2));
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(z10 ? 1 : 0);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c10");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setPlayVideoMute(int i10, int i11) {
        HashMap map2 = new HashMap();
        if (i10 == 94) {
            com.mbridge.msdk.foundation.same.a.Z = i11;
        } else if (i10 == 287) {
            com.mbridge.msdk.foundation.same.a.f33715a0 = i11;
        }
        u.p(i10, map2, "ad_type", i11, "mute_state");
        componentParams.put("player_video_mute", map2);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c12");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setUserPrivateInfoType(Context context, String str, int i10) {
        checkAliveContext(context);
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().a(str, i10);
        try {
            if (componentParams.containsKey("device_info_range_limit")) {
                Object obj = componentParams.get("device_info_range_limit");
                if (obj instanceof Map) {
                    ((Map) obj).put(str, Integer.valueOf(i10 == 1 ? 1 : 2));
                }
            } else {
                HashMap map2 = new HashMap();
                map2.put(str, Integer.valueOf(i10 == 1 ? 1 : 2));
                componentParams.put("device_info_range_limit", map2);
            }
            sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c11");
        } catch (Throwable th2) {
            q0.b("com.mbridge.msdk", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void updateDialogWeakActivity(WeakReference<Activity> weakReference) {
        com.mbridge.msdk.foundation.controller.c.n().a(weakReference);
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public AuthorityInfoBean userPrivateInfo(Context context) {
        checkAliveContext(context);
        return com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().a();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public Map<String, String> getMBConfigurationMap(String str, String str2, boolean z10) {
        return getMBConfigurationMap(str, str2, "");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public Map<String, String> getMBConfigurationMap(String str, String str2, String str3) {
        HashMap map2 = new HashMap();
        map2.put(MBridgeConstans.ID_MBRIDGE_APPID, str);
        map2.put(MBridgeConstans.ID_MBRIDGE_APPKEY, str2);
        map2.put(MBridgeConstans.ID_MBRIDGE_WX_APPID, str3);
        map2.put(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH, String.valueOf(1));
        componentParams.put(MBridgeConstans.APP_ID, str);
        componentParams.put(MBridgeConstans.APP_KEY, str2);
        componentParams.put("wx_app_id", str3);
        componentParams.put("crash_report", String.valueOf(1));
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "get_configuration_map");
        return map2;
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void init(Map<String, String> map2, Context context) {
        this.mContext = context.getApplicationContext();
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void initAsync(Map<String, String> map2, Context context) {
        this.mContext = context.getApplicationContext();
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setDoNotTrackStatus(Context context, boolean z10) {
        checkAliveContext(context);
        componentParams.put("do_not_track", Integer.valueOf(z10 ? 1 : 2));
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(z10 ? 1 : 0);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c10");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setConsentStatus(Context context) {
        checkAliveContext(context);
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().a(context, (OnCompletionListener) null);
        componentParams.put("consent_status", 3);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c8");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void init(Map<String, String> map2, Application application, SDKInitStatusListener sDKInitStatusListener) {
        this.mContext = application;
        this.mStatusListener = sDKInitStatusListener;
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void initAsync(Map<String, String> map2, Application application, SDKInitStatusListener sDKInitStatusListener) {
        this.mContext = application;
        this.mStatusListener = sDKInitStatusListener;
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setConsentStatus(Context context, OnCompletionListener onCompletionListener) {
        checkAliveContext(context);
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().a(context, onCompletionListener);
        componentParams.put("consent_status", 3);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c8");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void init(Map<String, String> map2, Context context, SDKInitStatusListener sDKInitStatusListener) {
        this.mContext = context.getApplicationContext();
        this.mStatusListener = sDKInitStatusListener;
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void initAsync(Map<String, String> map2, Context context, SDKInitStatusListener sDKInitStatusListener) {
        this.mContext = context.getApplicationContext();
        this.mStatusListener = sDKInitStatusListener;
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public Map<String, String> getMBConfigurationMap(String str, String str2, String str3, boolean z10) {
        return getMBConfigurationMap(str, str2, "");
    }

    private void init() {
        SDKInitStatusListener sDKInitStatusListener;
        SDKInitStatusListener sDKInitStatusListener2;
        if (this.sdkInited == null) {
            this.sdkInited = new AtomicBoolean(false);
        }
        this.initCallbacked = false;
        try {
            if (this.sdkInited.get() && (sDKInitStatusListener2 = this.mStatusListener) != null && !this.initCallbacked) {
                this.initCallbacked = true;
                sDKInitStatusListener2.onInitSuccess();
                return;
            }
        } catch (Exception e10) {
            q0.b("com.mbridge.msdk", e10.getMessage());
        }
        if (this.mContext == null && (sDKInitStatusListener = this.mStatusListener) != null) {
            this.initCallbacked = true;
            sDKInitStatusListener.onInitFail("Context can not be null.");
            return;
        }
        if (this.isInitStarted) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final boolean z10 = Looper.myLooper() == Looper.getMainLooper();
        this.isInitStarted = true;
        try {
            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.system.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36101a.lambda$init$0(z10, jCurrentTimeMillis);
                }
            };
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new q9(2, this, z10));
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(runnable);
        } catch (Exception e11) {
            q0.b("com.mbridge.msdk", "INIT FAIL", e11);
            if (this.sdkInited != null) {
                this.sdkInited.set(false);
            }
            if (this.initCallbacked) {
                return;
            }
            this.initCallbacked = true;
            callbackToDeveloper(z10, System.currentTimeMillis() - jCurrentTimeMillis, false, e11.getMessage());
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.system.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0185a implements Application.ActivityLifecycleCallbacks {
        public C0185a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            if (a.this.isMIMinited) {
                MIMManager.b().f();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
            if (a.this.isMIMinited) {
                MIMManager.b().g();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
            q0.b("com.mbridge.msdk", "onActivityPaused currentActivityNum:" + com.mbridge.msdk.foundation.controller.c.n().g());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
            int iG = com.mbridge.msdk.foundation.controller.c.n().g();
            q0.b("com.mbridge.msdk", "onActivityStarted currentActivityNum:" + iG);
            q0.b("com.mbridge.msdk", "onActivityStarted isCoolStart:" + a.this.isCoolStart);
            if (!a.this.isCoolStart && iG == 0) {
                j.a("1");
            }
            if (a.this.mBridgeSDKImplDiff != null) {
                com.mbridge.msdk.system.b bVar = a.this.mBridgeSDKImplDiff;
                a aVar = a.this;
                bVar.a(activity, iG, aVar.isCoolStart, aVar.mContext);
            }
            a.this.isCoolStart = false;
            com.mbridge.msdk.foundation.controller.c.n().a(iG + 1);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
            int iG = com.mbridge.msdk.foundation.controller.c.n().g();
            q0.b("com.mbridge.msdk", "onActivityStopped currentActivityNum:" + iG);
            if (iG == 1 || iG == 0) {
                j.a("2");
            }
            com.mbridge.msdk.foundation.controller.c.n().a(iG - 1);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setThirdPartyFeatures(Map<String, Object> map2) {
    }

    public void init(Application application) {
        this.mContext = application.getApplicationContext();
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    @Deprecated
    public void showUserPrivateInfoTips(Context context, CallBackForDeveloper callBackForDeveloper) {
    }
}
