package com.thinkup.core.basead.adx.api;

import android.text.TextUtils;
import android.util.Log;
import com.thinkup.core.common.ooo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class TUAdxSetting {
    public static final int MODE_MEDIATION = 0;
    public static final int MODE_NETWORK = 1;
    public static final String TAG = "tpn_thinkup_adx_setting";
    private static volatile TUAdxSetting instance;
    private Map<String, Integer> modeMap;

    public static TUAdxSetting getInstance() {
        if (instance == null) {
            synchronized (TUAdxSetting.class) {
                try {
                    if (instance == null) {
                        instance = new TUAdxSetting();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public boolean isAdxNetworkMode(String str) {
        Integer num;
        return (this.modeMap == null || TextUtils.isEmpty(str) || (num = this.modeMap.get(str)) == null || num.intValue() != 1) ? false : true;
    }

    public void openAdxNetworkMode(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "openAdxNetworkMode: placementId is empty");
            return;
        }
        Log.i(TAG, "openAdxNetworkMode: ".concat(String.valueOf(str)));
        if (this.modeMap == null) {
            this.modeMap = new ConcurrentHashMap();
        }
        this.modeMap.put(str, 1);
        ooo.o().o(str, false);
    }
}
