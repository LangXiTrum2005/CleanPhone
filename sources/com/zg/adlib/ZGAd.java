package com.zg.adlib;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.zg.adlib.service.ZGADLogManager;
import com.zg.adlib.storage.AppPreferences;
import com.zg.adlib.util.MAnalysisUtil;

/* JADX INFO: loaded from: classes6.dex */
public class ZGAd {
    private static ZGAd instance;
    private String country = "";
    private Context ctx;

    private ZGAd(Context context) {
        this.ctx = context;
    }

    public static ZGAd getInstance() {
        return instance;
    }

    public static void init(final Context context) {
        if (instance == null) {
            instance = new ZGAd(context);
        }
        AppPreferences appPreferences = AppPreferences.INSTANCE;
        if (appPreferences.getFirst_install_time() <= 10) {
            appPreferences.setFirst_install_time(System.currentTimeMillis());
            new Thread(new Runnable() { // from class: com.zg.adlib.ZGAd.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                        ZGADLogManager.INSTANCE.getInstance().sendCustomLog(MAnalysisUtil.EVENT_GOOGLE_ID, advertisingIdInfo.getId(), String.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                    } catch (Exception unused) {
                    }
                }
            }).start();
        }
    }

    public Context getContext() {
        return this.ctx;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String str) {
        this.country = str;
    }
}
