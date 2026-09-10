package com.umeng.analytics.pro;

import android.content.SharedPreferences;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes3.dex */
public class ai implements ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2489a;

    public ai(int i) {
        this.f2489a = i;
    }

    @Override // com.umeng.analytics.pro.ac
    public boolean a() {
        long j = 0;
        try {
            SharedPreferences sharedPreferencesA = au.a(UMGlobalContext.getAppContext());
            if (sharedPreferencesA != null) {
                j = sharedPreferencesA.getLong(au.f2499a, 0L);
                if (j >= this.f2489a) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        StringBuilder sbP = DM.p("launch times skipped. times: ", j, " ; config: ");
        sbP.append(this.f2489a);
        UMRTLog.i(UMRTLog.RTLOG_TAG, sbP.toString());
        return false;
    }

    @Override // com.umeng.analytics.pro.ac
    public boolean b() {
        return !a();
    }

    @Override // com.umeng.analytics.pro.ac
    public long c() {
        return 0L;
    }
}
