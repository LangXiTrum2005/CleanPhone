package com.mbridge.msdk.videocommon.download;

import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicBoolean f38246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicBoolean f38247b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final j f38248a = new j();
    }

    public static j a() {
        return b.f38248a;
    }

    public boolean b(int i10) {
        if (MBridgeConstans.DEBUG) {
            q0.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i10 + ", key: REWARD_VIDEO_REFACTOR_FOR_LOAD");
        }
        if (i10 != 94 && i10 != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f38246a;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f38246a = new AtomicBoolean(s0.a().a("r_v_r_f_l", false));
        } catch (Exception e10) {
            this.f38246a = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                f2.q(e10, new StringBuilder("isRewardVideoRefactor error: "), "RewardVideoRefactorManager");
            }
        }
        return this.f38246a.get();
    }

    private j() {
    }

    public boolean a(int i10) {
        if (MBridgeConstans.DEBUG) {
            q0.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i10 + ", key: REWARD_VIDEO_REFACTOR_FOR_CAMPAIGN_REQUEST");
        }
        if (i10 != 94 && i10 != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f38247b;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f38247b = new AtomicBoolean(s0.a().a("r_v_r_f_c_r", false));
        } catch (Exception e10) {
            this.f38247b = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                f2.q(e10, new StringBuilder("isRewardVideoRefactor error: "), "RewardVideoRefactorManager");
            }
        }
        return this.f38247b.get();
    }
}
