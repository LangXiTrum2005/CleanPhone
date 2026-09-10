package pitchy;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.ReferrerDetails;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: InstallReferrerSetupFinishedHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public Context f35385attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public Handler f35387saneness = null;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public dern f35386dern = null;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public ExecutorService f35388wireman = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: pitchy.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: InstallReferrerSetupFinishedHandler.java */
    public class RunnableC0771attabal implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ InstallReferrerClient f35390kowloon;

        public RunnableC0771attabal(InstallReferrerClient installReferrerClient) {
            this.f35390kowloon = installReferrerClient;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                attabal.this.dern(this.f35390kowloon.getInstallReferrer());
            } catch (RemoteException unused) {
                attabal.this.dern(null);
            }
        }
    }

    /* JADX INFO: compiled from: InstallReferrerSetupFinishedHandler.java */
    public interface dern {
        void attabal(ReferrerDetails referrerDetails);
    }

    /* JADX INFO: compiled from: InstallReferrerSetupFinishedHandler.java */
    public class saneness implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ ReferrerDetails f35392kowloon;

        public saneness(ReferrerDetails referrerDetails) {
            this.f35392kowloon = referrerDetails;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (attabal.this.f35386dern != null) {
                attabal.this.f35386dern.attabal(this.f35392kowloon);
            }
        }
    }

    public attabal(Context context) {
        this.f35385attabal = context;
    }

    public final void dern(ReferrerDetails referrerDetails) {
        if (this.f35387saneness == null) {
            this.f35387saneness = new Handler(this.f35385attabal.getMainLooper());
        }
        this.f35387saneness.post(new saneness(referrerDetails));
    }

    public void marial(InstallReferrerClient installReferrerClient) {
        this.f35388wireman.submit(new RunnableC0771attabal(installReferrerClient));
    }

    public void wireman(dern dernVar) {
        this.f35386dern = dernVar;
    }
}
