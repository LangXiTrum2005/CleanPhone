package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.Logger;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Continuation {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f20373Y;

    public /* synthetic */ g(Object obj, int i2) {
        this.X = i2;
        this.f20373Y = obj;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        boolean z2;
        Object obj = this.f20373Y;
        switch (this.X) {
            case 0:
                ((SessionReportingCoordinator) obj).getClass();
                boolean zIsSuccessful = task.isSuccessful();
                Logger logger = Logger.f20289a;
                if (zIsSuccessful) {
                    CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) task.getResult();
                    logger.b("Crashlytics report successfully enqueued to DataTransport: " + crashlyticsReportWithSessionId.c(), null);
                    File fileB = crashlyticsReportWithSessionId.b();
                    if (fileB.delete()) {
                        logger.b("Deleted report file: " + fileB.getPath(), null);
                    } else {
                        logger.f(null, "Crashlytics could not delete report file: " + fileB.getPath());
                    }
                    z2 = true;
                } else {
                    logger.f(task.getException(), "Crashlytics report could not be enqueued to DataTransport");
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            default:
                ExecutorService executorService = Utils.f20368a;
                ((CountDownLatch) obj).countDown();
                return null;
        }
    }
}
