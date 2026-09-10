package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.send.ReportQueue.ReportRunnable;
import com.google.firebase.crashlytics.internal.settings.SettingsController;

/* JADX INFO: loaded from: classes4.dex */
public class DataTransportCrashlyticsReportSender {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CrashlyticsReportJsonTransform f20731b = new CrashlyticsReportJsonTransform();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20732c = c("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String d = c("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.common.net.a f20733e = new com.google.common.net.a(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReportQueue f20734a;

    public DataTransportCrashlyticsReportSender(ReportQueue reportQueue, com.google.common.net.a aVar) {
        this.f20734a = reportQueue;
    }

    public static DataTransportCrashlyticsReportSender a(Context context, SettingsController settingsController, OnDemandCounter onDemandCounter) {
        TransportRuntime.b(context);
        TransportFactory transportFactoryC = TransportRuntime.a().c(new CCTDestination(f20732c, d));
        Encoding encoding = new Encoding("json");
        com.google.common.net.a aVar = f20733e;
        return new DataTransportCrashlyticsReportSender(new ReportQueue(transportFactoryC.a("FIREBASE_CRASHLYTICS_REPORT", encoding, aVar), settingsController.d(), onDemandCounter), aVar);
    }

    public static String c(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }

    public final Task b(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z2) {
        TaskCompletionSource taskCompletionSource;
        ReportQueue reportQueue = this.f20734a;
        synchronized (reportQueue.f) {
            try {
                taskCompletionSource = new TaskCompletionSource();
                if (z2) {
                    reportQueue.f20740i.f20362a.getAndIncrement();
                    if (reportQueue.f.size() < reportQueue.f20738e) {
                        Logger logger = Logger.f20289a;
                        logger.b("Enqueueing report: " + crashlyticsReportWithSessionId.c(), null);
                        logger.b("Queue size: " + reportQueue.f.size(), null);
                        reportQueue.g.execute(reportQueue.new ReportRunnable(crashlyticsReportWithSessionId, taskCompletionSource));
                        logger.b("Closing task for report: " + crashlyticsReportWithSessionId.c(), null);
                        taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                    } else {
                        reportQueue.a();
                        Logger.f20289a.b("Dropping report due to queue being full: " + crashlyticsReportWithSessionId.c(), null);
                        reportQueue.f20740i.f20363b.getAndIncrement();
                        taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                    }
                } else {
                    reportQueue.b(crashlyticsReportWithSessionId, taskCompletionSource);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return taskCompletionSource.getTask();
    }
}
