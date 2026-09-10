package A;

import com.applovin.impl.n7;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.inmobi.media.AbstractC3167oe;
import com.inmobi.media.C3215s;
import com.inmobi.media.C3246te;
import com.inmobi.media.C3298x2;
import com.inmobi.media.Cb;
import com.inmobi.media.D5;
import com.inmobi.media.L3;
import com.inmobi.media.O2;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.p004ironsource.bt;
import com.vungle.ads.AnalyticsClient;

/* JADX INFO: renamed from: A.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0895i implements Runnable {
    public final /* synthetic */ int X;

    public /* synthetic */ RunnableC0895i(int i2) {
        this.X = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                Cb.c();
                return;
            case 1:
                Cb.a();
                return;
            case 2:
                D5.c();
                return;
            case 3:
                L3.P();
                return;
            case 4:
                L3.R();
                return;
            case 5:
                L3.N();
                return;
            case 6:
                L3.L();
                return;
            case 7:
                O2.a();
                return;
            case 8:
                AbstractC3167oe.b();
                return;
            case 9:
                C3215s.e();
                return;
            case 10:
                C3215s.d();
                return;
            case 11:
                C3246te.f();
                return;
            case 12:
                C3298x2.a();
                return;
            case 13:
                InMobiSdk.b();
                return;
            case 14:
                InMobiUnifiedIdService.a();
                return;
            case 15:
                throw null;
            case 16:
                n7.c();
                return;
            case 17:
                int i2 = AlarmManagerSchedulerBroadcastReceiver.f16909a;
                return;
            case 18:
                bt.f();
                return;
            default:
                AnalyticsClient.m3138initOrUpdate$lambda1$lambda0();
                return;
        }
    }
}
