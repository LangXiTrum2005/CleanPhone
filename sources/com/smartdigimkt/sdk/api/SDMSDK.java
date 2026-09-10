package com.smartdigimkt.sdk.api;

import android.content.Context;
import com.smartdigimkt.n7.b;
import com.smartdigimkt.p3.a;
import com.smartdigimkt.q7.c;
import com.smartdigimkt.sdk.api.format.IMyOfferAdManager;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class SDMSDK {
    private static volatile SDMSDK instance;
    private static Object lockObject = new Object();
    private volatile boolean mHasInit = false;
    private volatile SDMSetting mSdmSetting = new SDMSetting();
    private volatile ISDMDirectlyOfferSetting mDirectlyOfferSetting = new a();

    public interface InitCallBack {
        void fail(String str);

        void success();
    }

    private SDMSDK() {
    }

    public static SDMSDK getInstance() {
        if (instance == null) {
            synchronized (lockObject) {
                try {
                    if (instance == null) {
                        instance = new SDMSDK();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public ISDMDirectlyOfferSetting getDirectlyOfferSetting() {
        return this.mDirectlyOfferSetting;
    }

    public IMyOfferAdManager getMyOfferAdManager() {
        return c.a();
    }

    public String getSDKVersion() {
        return "UA_6.5.45";
    }

    public ISDMAdManager getSDMAdManager() {
        return b.a();
    }

    public SDMSetting getSetting() {
        return this.mSdmSetting;
    }

    public void init(Context context, SDMInitConfig sDMInitConfig) {
        try {
            if (this.mHasInit) {
                return;
            }
            this.mHasInit = true;
            com.smartdigimkt.m6.b.p().a(context, sDMInitConfig);
        } catch (Throwable unused) {
        }
    }

    public void integrationChecking(Context context, Map<String, Object> map, IntegrationCheckListener integrationCheckListener) {
        if (context != null) {
            com.smartdigimkt.m6.b.p().a(context, map, integrationCheckListener);
        } else if (integrationCheckListener != null) {
            integrationCheckListener.onValidationFail(com.smartdigimkt.d0.b.f34375a);
        }
    }

    public boolean isNetworkLogDebug() {
        return com.smartdigimkt.m6.b.p().D();
    }

    public void start(InitCallBack initCallBack) {
        com.smartdigimkt.m6.b.p().a(initCallBack);
    }
}
