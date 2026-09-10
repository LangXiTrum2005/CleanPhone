package scannable;

import android.app.Application;
import babyless.beachfront;
import java.util.concurrent.ExecutorService;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import reuter.molybdenite;

/* JADX INFO: compiled from: IapInit.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lscannable/attabal;", "", "<init>", "()V", "Landroid/app/Application;", "application", "saneness", "(Landroid/app/Application;)Lscannable/attabal;", "", "attabal", "Landroid/app/Application;", "mApplication", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ExecutorService;", "mExecutorService", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public Application mApplication;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public ExecutorService mExecutorService;

    public final void attabal() {
        Application application = this.mApplication;
        if (application == null) {
            throw new IllegalStateException("application is null");
        }
        molybdenite molybdeniteVar = molybdenite.f36681attabal;
        Intrinsics.beachfront(application);
        molybdeniteVar.lotta(application);
        ExecutorService executorService = this.mExecutorService;
        if (executorService != null) {
            Intrinsics.beachfront(executorService);
            molybdeniteVar.sayid(executorService);
        }
        beachfront.cutely(this.mApplication);
    }

    public final attabal saneness(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.mApplication = application;
        return this;
    }
}
