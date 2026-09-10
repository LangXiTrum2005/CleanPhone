package com.mbridge.msdk.reward.controller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f35507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35508b;

    public c(Context context, String str) {
        this.f35507a = context;
        this.f35508b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListC;
        if (this.f35507a == null || TextUtils.isEmpty(this.f35508b)) {
            return;
        }
        try {
            com.mbridge.msdk.reward.report.a.a(this.f35507a, this.f35508b);
            o0.a();
            o0.a(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_RES));
            o0.a(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML));
            com.mbridge.msdk.videocommon.setting.b.b().b(this.f35508b);
            if (s0.a().a("c_d_v_w_i", false) || TextUtils.isEmpty(this.f35508b) || (copyOnWriteArrayListC = com.mbridge.msdk.videocommon.cache.a.a().c(this.f35508b, 1)) == null || copyOnWriteArrayListC.size() <= 0) {
                return;
            }
            com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f35507a, this.f35508b, copyOnWriteArrayListC, 94, (com.mbridge.msdk.videocommon.listener.a) null);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoControllerInitTask", "initRewardVideoController task ", e10);
            }
        }
    }
}
