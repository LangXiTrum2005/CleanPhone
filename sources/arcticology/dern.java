package arcticology;

import android.os.Bundle;
import gelandelaufer.competently;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: BlockingAnalyticsEventLogger.java */
/* JADX INFO: loaded from: classes3.dex */
public class dern implements saneness, attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final marial f14337attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final TimeUnit f14339dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public CountDownLatch f14340marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f14341saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Object f14342wireman = new Object();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f14338beachfront = false;

    public dern(marial marialVar, int i, TimeUnit timeUnit) {
        this.f14337attabal = marialVar;
        this.f14341saneness = i;
        this.f14339dern = timeUnit;
    }

    @Override // arcticology.attabal
    public void attabal(String str, Bundle bundle) {
        synchronized (this.f14342wireman) {
            try {
                competently.beachfront().taiyuan("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f14340marial = new CountDownLatch(1);
                this.f14338beachfront = false;
                this.f14337attabal.attabal(str, bundle);
                competently.beachfront().taiyuan("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f14340marial.await(this.f14341saneness, this.f14339dern)) {
                        this.f14338beachfront = true;
                        competently.beachfront().taiyuan("App exception callback received from Analytics listener.");
                    } else {
                        competently.beachfront().apical("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    competently.beachfront().wireman("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f14340marial = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // arcticology.saneness
    public void saneness(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f14340marial;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
