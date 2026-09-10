package com.mbridge.msdk.reward.adapter;

import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.system.NoProGuard;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class RewardUnitCacheManager implements NoProGuard {
    private static final String TAG = "RewardUnitCacheManager";
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.setting.c> rewardUnitSettings;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final RewardUnitCacheManager f35149a = new RewardUnitCacheManager();
    }

    public static RewardUnitCacheManager getInstance() {
        return b.f35149a;
    }

    public void add(String str, String str2, com.mbridge.msdk.videocommon.setting.c cVar) {
        try {
            String str3 = str + "_" + str2;
            if (cVar != null && this.rewardUnitSettings.containsKey(str3)) {
                this.rewardUnitSettings.remove(str3);
            }
            this.rewardUnitSettings.put(str3, cVar);
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    public com.mbridge.msdk.videocommon.setting.c get(String str, String str2) {
        try {
            try {
                return this.rewardUnitSettings.remove(str + "_" + str2);
            } catch (Exception e10) {
                q0.b(TAG, e10.getMessage());
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    private RewardUnitCacheManager() {
        this.rewardUnitSettings = new ConcurrentHashMap<>();
    }
}
