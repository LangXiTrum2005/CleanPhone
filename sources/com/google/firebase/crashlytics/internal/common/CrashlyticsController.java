package com.google.firebase.crashlytics.internal.common;

import A.C0880a0;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.EventMetadata;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData;
import com.google.firebase.sessions.api.CrashEventReceiver;
import com.smartdigimkt.v0.k;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Stack;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
class CrashlyticsController {
    public static final b r = new b(0);
    public static final Charset s = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataCollectionArbiter f20319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CrashlyticsFileMarker f20320c;
    public final UserMetadata d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CrashlyticsWorkers f20321e;
    public final IdManager f;
    public final FileStore g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppData f20322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LogFileManager f20323i;
    public final CrashlyticsNativeComponentDeferredProxy j;
    public final com.google.firebase.crashlytics.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CrashlyticsAppQualitySessionsSubscriber f20324l;
    public final SessionReportingCoordinator m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CrashlyticsUncaughtExceptionHandler f20325n;
    public final TaskCompletionSource o = new TaskCompletionSource();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TaskCompletionSource f20326p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$1, reason: invalid class name */
    class AnonymousClass1 implements CrashlyticsUncaughtExceptionHandler.CrashListener {
        public AnonymousClass1() {
        }

        public final void a(final SettingsController settingsController, final Thread thread, final Throwable th) {
            Task taskContinueWithTask;
            final CrashlyticsController crashlyticsController = CrashlyticsController.this;
            synchronized (crashlyticsController) {
                Logger.f20289a.b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName(), null);
                CrashEventReceiver.notifyCrashOccurred();
                final long jCurrentTimeMillis = System.currentTimeMillis();
                CrashlyticsWorker crashlyticsWorker = crashlyticsController.f20321e.f20376a;
                Callable<Task<Void>> callable = new Callable<Task<Void>>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2
                    @Override // java.util.concurrent.Callable
                    public final Task<Void> call() throws Throwable {
                        MiddleOutFallbackStrategy middleOutFallbackStrategy;
                        Logger logger = Logger.f20289a;
                        b bVar = CrashlyticsController.r;
                        long j = jCurrentTimeMillis;
                        long j2 = j / 1000;
                        CrashlyticsController crashlyticsController2 = CrashlyticsController.this;
                        NavigableSet navigableSetC = crashlyticsController2.m.f20365b.c();
                        Boolean bool = null;
                        String str = !navigableSetC.isEmpty() ? (String) navigableSetC.first() : null;
                        if (str == null) {
                            logger.c(null, "Tried to write a fatal exception while no session was open.");
                            return Tasks.forResult(null);
                        }
                        crashlyticsController2.f20320c.a();
                        SessionReportingCoordinator sessionReportingCoordinator = crashlyticsController2.m;
                        sessionReportingCoordinator.getClass();
                        logger.e("Persisting fatal event for session ".concat(str));
                        EventMetadata eventMetadata = new EventMetadata(str, j2);
                        CrashlyticsReportDataCapture crashlyticsReportDataCapture = sessionReportingCoordinator.f20364a;
                        Context context = crashlyticsReportDataCapture.f20341a;
                        int i2 = context.getResources().getConfiguration().orientation;
                        Stack stack = new Stack();
                        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                            stack.push(cause);
                        }
                        TrimmedThrowableData trimmedThrowableData = null;
                        while (true) {
                            boolean zIsEmpty = stack.isEmpty();
                            middleOutFallbackStrategy = crashlyticsReportDataCapture.d;
                            if (zIsEmpty) {
                                break;
                            }
                            Throwable th2 = (Throwable) stack.pop();
                            trimmedThrowableData = new TrimmedThrowableData(th2.getLocalizedMessage(), th2.getClass().getName(), middleOutFallbackStrategy.a(th2.getStackTrace()), trimmedThrowableData);
                            bool = bool;
                            stack = stack;
                            str = str;
                        }
                        String str2 = str;
                        Boolean bool2 = bool;
                        CrashlyticsReport.Session.Event.Builder builderA = CrashlyticsReport.Session.Event.a();
                        builderA.g(AppMeasurement.CRASH_ORIGIN);
                        builderA.f(eventMetadata.f20387b);
                        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetailsC = ProcessDetailsProvider.f20290a.c(context);
                        Boolean boolValueOf = processDetailsC.b() > 0 ? Boolean.valueOf(processDetailsC.b() != 100) : bool2;
                        CrashlyticsReport.Session.Event.Application.Builder builderA2 = CrashlyticsReport.Session.Event.Application.a();
                        builderA2.c(boolValueOf);
                        builderA2.d(processDetailsC);
                        builderA2.b(ProcessDetailsProvider.b(context));
                        builderA2.h(i2);
                        CrashlyticsReport.Session.Event.Application.Execution.Builder builderA3 = CrashlyticsReport.Session.Event.Application.Execution.a();
                        ArrayList arrayList = new ArrayList();
                        StackTraceElement[] stackTraceElementArr = trimmedThrowableData.f20773c;
                        CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder builderA4 = CrashlyticsReport.Session.Event.Application.Execution.Thread.a();
                        Thread thread2 = thread;
                        builderA4.d(thread2.getName());
                        builderA4.c(4);
                        builderA4.b(CrashlyticsReportDataCapture.d(stackTraceElementArr, 4));
                        arrayList.add(builderA4.a());
                        for (Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator(); it.hasNext(); it = it) {
                            Map.Entry<Thread, StackTraceElement[]> next = it.next();
                            Thread key = next.getKey();
                            if (!key.equals(thread2)) {
                                StackTraceElement[] stackTraceElementArrA = middleOutFallbackStrategy.a(next.getValue());
                                CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder builderA5 = CrashlyticsReport.Session.Event.Application.Execution.Thread.a();
                                builderA5.d(key.getName());
                                builderA5.c(0);
                                builderA5.b(CrashlyticsReportDataCapture.d(stackTraceElementArrA, 0));
                                arrayList.add(builderA5.a());
                            }
                        }
                        builderA3.f(Collections.unmodifiableList(arrayList));
                        builderA3.d(CrashlyticsReportDataCapture.c(trimmedThrowableData, 0));
                        CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builderA6 = CrashlyticsReport.Session.Event.Application.Execution.Signal.a();
                        builderA6.d("0");
                        builderA6.c("0");
                        builderA6.b(0L);
                        builderA3.e(builderA6.a());
                        builderA3.c(crashlyticsReportDataCapture.a());
                        builderA2.f(builderA3.a());
                        builderA.b(builderA2.a());
                        builderA.c(crashlyticsReportDataCapture.b(i2));
                        CrashlyticsReport.Session.Event eventA = builderA.a();
                        LogFileManager logFileManager = sessionReportingCoordinator.d;
                        UserMetadata userMetadata = sessionReportingCoordinator.f20367e;
                        sessionReportingCoordinator.f20365b.d(SessionReportingCoordinator.b(SessionReportingCoordinator.a(eventA, logFileManager, userMetadata, eventMetadata.f20388c), userMetadata), eventMetadata.f20386a, true);
                        crashlyticsController2.getClass();
                        try {
                            FileStore fileStore = crashlyticsController2.g;
                            String str3 = ".ae" + j;
                            fileStore.getClass();
                            if (!new File(fileStore.f20729c, str3).createNewFile()) {
                                throw new IOException("Create new file failed.");
                            }
                        } catch (IOException e2) {
                            logger.f(e2, "Could not create app exception marker file.");
                        }
                        SettingsController settingsController2 = settingsController;
                        crashlyticsController2.b(false, settingsController2, false);
                        crashlyticsController2.c(new CLSUUID().f20309a, Boolean.FALSE);
                        return !crashlyticsController2.f20319b.a() ? Tasks.forResult(bool2) : settingsController2.c().onSuccessTask(crashlyticsController2.f20321e.f20376a, new SuccessContinuation<Settings, Void>(str2) { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2.1
                            @Override // com.google.android.gms.tasks.SuccessContinuation
                            public final Task<Void> then(Settings settings) {
                                if (settings == null) {
                                    Logger.f20289a.f(null, "Received null app settings, cannot send reports at crash time.");
                                    return Tasks.forResult(null);
                                }
                                CrashlyticsController crashlyticsController3 = CrashlyticsController.this;
                                return Tasks.whenAll((Task<?>[]) new Task[]{CrashlyticsController.a(crashlyticsController3), crashlyticsController3.m.e(null, crashlyticsController3.f20321e.f20376a)});
                            }
                        });
                    }
                };
                synchronized (crashlyticsWorker.f20375Y) {
                    taskContinueWithTask = crashlyticsWorker.Z.continueWithTask(crashlyticsWorker.X, new C0880a0(callable, 20));
                    crashlyticsWorker.Z = taskContinueWithTask;
                }
                try {
                    Utils.a(taskContinueWithTask);
                } catch (TimeoutException unused) {
                    Logger.f20289a.c(null, "Cannot send reports. Timed out while fetching settings.");
                } catch (Exception e2) {
                    Logger.f20289a.c(e2, "Error handling uncaught exception");
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$3, reason: invalid class name */
    class AnonymousClass3 implements SuccessContinuation<Void, Boolean> {
        @Override // com.google.android.gms.tasks.SuccessContinuation
        public final Task<Boolean> then(Void r1) {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    public CrashlyticsController(Context context, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, FileStore fileStore, CrashlyticsFileMarker crashlyticsFileMarker, AppData appData, UserMetadata userMetadata, LogFileManager logFileManager, SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy, com.google.firebase.crashlytics.a aVar, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, CrashlyticsWorkers crashlyticsWorkers) {
        new AtomicBoolean(false);
        this.f20318a = context;
        this.f = idManager;
        this.f20319b = dataCollectionArbiter;
        this.g = fileStore;
        this.f20320c = crashlyticsFileMarker;
        this.f20322h = appData;
        this.d = userMetadata;
        this.f20323i = logFileManager;
        this.j = crashlyticsNativeComponentDeferredProxy;
        this.k = aVar;
        this.f20324l = crashlyticsAppQualitySessionsSubscriber;
        this.m = sessionReportingCoordinator;
        this.f20321e = crashlyticsWorkers;
    }

    public static Task a(CrashlyticsController crashlyticsController) {
        Task taskCall;
        crashlyticsController.getClass();
        Logger logger = Logger.f20289a;
        ArrayList arrayList = new ArrayList();
        for (File file : FileStore.e(crashlyticsController.g.f20729c.listFiles(r))) {
            try {
                final long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    logger.f(null, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
                    taskCall = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    logger.b("Logging app exception event to Firebase Analytics", null);
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new Callable<Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.5
                        @Override // java.util.concurrent.Callable
                        public final Void call() {
                            Bundle bundle = new Bundle();
                            bundle.putInt("fatal", 1);
                            bundle.putLong("timestamp", j);
                            CrashlyticsController.this.k.d(bundle);
                            return null;
                        }
                    });
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                logger.f(null, "Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0427  */
    /* JADX WARN: Code duplicated, block: B:41:0x0183  */
    /* JADX WARN: Code duplicated, block: B:54:0x02dd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [int] */
    /* JADX WARN: Type inference failed for: r22v0, types: [boolean] */
    public final void b(boolean z2, SettingsController settingsController, boolean z3) throws Throwable {
        String str;
        boolean z4;
        String str2;
        String strSubstring;
        String[] list;
        ApplicationExitInfo applicationExitInfoF;
        String strC;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo;
        List listUnmodifiableList;
        CrashlyticsWorkers.a();
        SessionReportingCoordinator sessionReportingCoordinator = this.m;
        ArrayList arrayList = new ArrayList(sessionReportingCoordinator.f20365b.c());
        int size = arrayList.size();
        Logger logger = Logger.f20289a;
        if (size <= z2) {
            logger.e("No open sessions to be closed.");
            return;
        }
        String str3 = (String) arrayList.get(z2 == true ? 1 : 0);
        CrashlyticsReportPersistence crashlyticsReportPersistence = sessionReportingCoordinator.f20365b;
        if (z3 && settingsController.d().f20747b.f20751b) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                List historicalProcessExitReasons = ((ActivityManager) this.f20318a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    FileStore fileStore = this.g;
                    LogFileManager logFileManager = new LogFileManager(fileStore);
                    logFileManager.b(str3);
                    UserMetadata userMetadataC = UserMetadata.c(str3, fileStore, this.f20321e);
                    long jLastModified = crashlyticsReportPersistence.f20725b.b(str3, "start-time").lastModified();
                    Iterator it = historicalProcessExitReasons.iterator();
                    do {
                        if (it.hasNext()) {
                            applicationExitInfoF = androidx.media3.exoplayer.source.mediaparser.b.f(it.next());
                            if (applicationExitInfoF.getTimestamp() < jLastModified) {
                            }
                        }
                        applicationExitInfoF = null;
                        break;
                    } while (applicationExitInfoF.getReason() != 6);
                    if (applicationExitInfoF == null) {
                        logger.e("No relevant ApplicationExitInfo occurred during session: " + str3);
                    } else {
                        try {
                            InputStream traceInputStream = applicationExitInfoF.getTraceInputStream();
                            strC = traceInputStream != null ? SessionReportingCoordinator.c(traceInputStream) : null;
                        } catch (IOException e2) {
                            logger.f(null, "Could not get input trace in application exit info: " + applicationExitInfoF.toString() + " Error: " + e2);
                        }
                        CrashlyticsReport.ApplicationExitInfo.Builder builderA = CrashlyticsReport.ApplicationExitInfo.a();
                        builderA.c(applicationExitInfoF.getImportance());
                        builderA.e(applicationExitInfoF.getProcessName());
                        builderA.g(applicationExitInfoF.getReason());
                        builderA.i(applicationExitInfoF.getTimestamp());
                        builderA.d(applicationExitInfoF.getPid());
                        builderA.f(applicationExitInfoF.getPss());
                        builderA.h(applicationExitInfoF.getRss());
                        builderA.j(strC);
                        CrashlyticsReport.ApplicationExitInfo applicationExitInfoA = builderA.a();
                        CrashlyticsReportDataCapture crashlyticsReportDataCapture = sessionReportingCoordinator.f20364a;
                        int i3 = crashlyticsReportDataCapture.f20341a.getResources().getConfiguration().orientation;
                        CrashlyticsReport.Session.Event.Builder builderA2 = CrashlyticsReport.Session.Event.a();
                        builderA2.g("anr");
                        builderA2.f(applicationExitInfoA.i());
                        if (crashlyticsReportDataCapture.f20344e.d().f20747b.f20752c) {
                            ArrayList<BuildIdInfo> arrayList2 = crashlyticsReportDataCapture.f20343c.f20295c;
                            if (arrayList2.size() > 0) {
                                ArrayList arrayList3 = new ArrayList();
                                for (BuildIdInfo buildIdInfo : arrayList2) {
                                    CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder builderA3 = CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.a();
                                    builderA3.d(buildIdInfo.f20304a);
                                    builderA3.b(buildIdInfo.f20305b);
                                    builderA3.c(buildIdInfo.f20306c);
                                    arrayList3.add(builderA3.a());
                                    applicationExitInfoA = applicationExitInfoA;
                                }
                                applicationExitInfo = applicationExitInfoA;
                                listUnmodifiableList = Collections.unmodifiableList(arrayList3);
                            } else {
                                applicationExitInfo = applicationExitInfoA;
                                listUnmodifiableList = null;
                            }
                        } else {
                            applicationExitInfo = applicationExitInfoA;
                            listUnmodifiableList = null;
                        }
                        CrashlyticsReport.ApplicationExitInfo.Builder builderA4 = CrashlyticsReport.ApplicationExitInfo.a();
                        builderA4.c(applicationExitInfo.c());
                        builderA4.e(applicationExitInfo.e());
                        builderA4.g(applicationExitInfo.g());
                        builderA4.i(applicationExitInfo.i());
                        builderA4.d(applicationExitInfo.d());
                        builderA4.f(applicationExitInfo.f());
                        builderA4.h(applicationExitInfo.h());
                        builderA4.j(applicationExitInfo.j());
                        builderA4.b(listUnmodifiableList);
                        CrashlyticsReport.ApplicationExitInfo applicationExitInfoA2 = builderA4.a();
                        boolean z5 = applicationExitInfoA2.c() != 100;
                        CrashlyticsReport.Session.Event.Application.Builder builderA5 = CrashlyticsReport.Session.Event.Application.a();
                        builderA5.c(Boolean.valueOf(z5));
                        ProcessDetailsProvider processDetailsProvider = ProcessDetailsProvider.f20290a;
                        String processName = applicationExitInfoA2.e();
                        int iD = applicationExitInfoA2.d();
                        int iC = applicationExitInfoA2.c();
                        Intrinsics.f(processName, "processName");
                        builderA5.d(ProcessDetailsProvider.a(processDetailsProvider, processName, iD, iC, 8));
                        builderA5.h(i3);
                        CrashlyticsReport.Session.Event.Application.Execution.Builder builderA6 = CrashlyticsReport.Session.Event.Application.Execution.a();
                        builderA6.b(applicationExitInfoA2);
                        CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builderA7 = CrashlyticsReport.Session.Event.Application.Execution.Signal.a();
                        builderA7.d("0");
                        builderA7.c("0");
                        builderA7.b(0L);
                        builderA6.e(builderA7.a());
                        builderA6.c(crashlyticsReportDataCapture.a());
                        builderA5.f(builderA6.a());
                        builderA2.b(builderA5.a());
                        builderA2.c(crashlyticsReportDataCapture.b(i3));
                        CrashlyticsReport.Session.Event eventA = builderA2.a();
                        logger.b("Persisting anr for session " + str3, null);
                        crashlyticsReportPersistence.d(SessionReportingCoordinator.b(SessionReportingCoordinator.a(eventA, logFileManager, userMetadataC, Collections.EMPTY_MAP), userMetadataC), str3, true);
                    }
                } else {
                    logger.e("No ApplicationExitInfo available. Session: " + str3);
                }
            } else {
                logger.e("ANR feature enabled, but device is API " + i2);
            }
        } else {
            logger.e("ANR feature disabled.");
        }
        if (z3) {
            CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy = this.j;
            if (crashlyticsNativeComponentDeferredProxy.d(str3)) {
                logger.e("Finalizing native report for session " + str3);
                crashlyticsNativeComponentDeferredProxy.a(str3).getClass();
                str = null;
                logger.f(null, "No minidump data found for session " + str3);
                logger.d("No Tombstones data found for session " + str3);
                logger.f(null, "No native core present");
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (z2 != 0) {
            z4 = false;
            str2 = (String) arrayList.get(0);
        } else {
            z4 = false;
            this.f20324l.a(str);
            str2 = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        FileStore fileStore2 = crashlyticsReportPersistence.f20725b;
        fileStore2.a(".com.google.firebase.crashlytics");
        fileStore2.a(".com.google.firebase.crashlytics-ndk");
        if (!fileStore2.f20727a.isEmpty()) {
            fileStore2.a(".com.google.firebase.crashlytics.files.v1");
            final String str4 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file = fileStore2.f20728b;
            if (file.exists() && (list = file.list(new FilenameFilter() { // from class: u.b
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str5) {
                    return str5.startsWith(str4);
                }
            })) != null) {
                int length = list.length;
                for (?? r11 = z4; r11 < length; r11++) {
                    fileStore2.a(list[r11]);
                }
            }
        }
        NavigableSet<String> navigableSetC = crashlyticsReportPersistence.c();
        if (str2 != null) {
            navigableSetC.remove(str2);
        }
        int size2 = navigableSetC.size();
        File file2 = fileStore2.d;
        if (size2 > 8) {
            while (navigableSetC.size() > 8) {
                String str5 = (String) navigableSetC.last();
                logger.b("Removing session over cap: " + str5, null);
                FileStore.d(new File(file2, str5));
                navigableSetC.remove(str5);
            }
        }
        for (String str6 : navigableSetC) {
            logger.e("Finalizing report for session " + str6);
            p009u.a aVar = CrashlyticsReportPersistence.f20723i;
            File file3 = new File(file2, str6);
            file3.mkdirs();
            List listE = FileStore.e(file3.listFiles(aVar));
            if (listE.isEmpty()) {
                logger.e("Session " + str6 + " has no events.");
            } else {
                Collections.sort(listE);
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = listE.iterator();
                boolean z6 = z4;
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = CrashlyticsReportPersistence.g;
                    if (!zHasNext) {
                        if (!arrayList4.isEmpty()) {
                            String strD = UserMetadata.d(str6, fileStore2);
                            CrashlyticsAppQualitySessionsStore crashlyticsAppQualitySessionsStore = crashlyticsReportPersistence.d.f20317b;
                            synchronized (crashlyticsAppQualitySessionsStore) {
                                if (Objects.equals(crashlyticsAppQualitySessionsStore.f20314b, str6)) {
                                    strSubstring = crashlyticsAppQualitySessionsStore.f20315c;
                                } else {
                                    FileStore fileStore3 = crashlyticsAppQualitySessionsStore.f20313a;
                                    b bVar = CrashlyticsAppQualitySessionsStore.d;
                                    File file4 = new File(fileStore3.d, str6);
                                    file4.mkdirs();
                                    List listE2 = FileStore.e(file4.listFiles(bVar));
                                    if (listE2.isEmpty()) {
                                        Logger.f20289a.f(null, "Unable to read App Quality Sessions session id.");
                                        strSubstring = null;
                                    } else {
                                        strSubstring = ((File) Collections.min(listE2, CrashlyticsAppQualitySessionsStore.f20312e)).getName().substring(4);
                                    }
                                }
                            }
                            File fileB = fileStore2.b(str6, "report");
                            try {
                                String strE = CrashlyticsReportPersistence.e(fileB);
                                crashlyticsReportJsonTransform.getClass();
                                CrashlyticsReport crashlyticsReportO = CrashlyticsReportJsonTransform.i(strE).p(jCurrentTimeMillis, z6, strD).o(strSubstring);
                                if (crashlyticsReportO.m() == null) {
                                    throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                                }
                                CrashlyticsReport.Builder builderN = crashlyticsReportO.n();
                                CrashlyticsReport.Session.Builder builderN2 = crashlyticsReportO.m().n();
                                builderN2.g(arrayList4);
                                builderN.m(builderN2.a());
                                CrashlyticsReport crashlyticsReportA = builderN.a();
                                CrashlyticsReport.Session sessionM = crashlyticsReportA.m();
                                if (sessionM != null) {
                                    try {
                                        logger.b("appQualitySessionId: " + strSubstring, null);
                                        CrashlyticsReportPersistence.f(z6 ? new File(fileStore2.f, sessionM.i()) : new File(fileStore2.f20730e, sessionM.i()), CrashlyticsReportJsonTransform.f20714a.b(crashlyticsReportA));
                                        break;
                                    } catch (IOException e3) {
                                        e = e3;
                                        logger.f(e, "Could not synthesize final report file for " + fileB);
                                        break;
                                    }
                                }
                                e = e3;
                            } catch (IOException e4) {
                                e = e4;
                            }
                            logger.f(e, "Could not synthesize final report file for " + fileB);
                            break;
                            break;
                        }
                        logger.f(null, "Could not parse event files for session " + str6);
                        break;
                    }
                    File file5 = (File) it2.next();
                    try {
                        String strE2 = CrashlyticsReportPersistence.e(file5);
                        crashlyticsReportJsonTransform.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(strE2));
                            try {
                                CrashlyticsReport.Session.Event eventE = CrashlyticsReportJsonTransform.e(jsonReader);
                                jsonReader.close();
                                arrayList4.add(eventE);
                                if (z6) {
                                    z6 = true;
                                } else {
                                    String name = file5.getName();
                                    if (name.startsWith("event") && name.endsWith("_")) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                }
                            } catch (Throwable th) {
                                try {
                                    jsonReader.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IllegalStateException e5) {
                            throw new IOException(e5);
                        }
                    } catch (IOException e6) {
                        logger.f(e6, "Could not add event to report for " + file5);
                    }
                }
                FileStore.d(new File(file2, str6));
                z4 = false;
            }
            FileStore.d(new File(file2, str6));
            z4 = false;
        }
        Settings.SessionData sessionData = crashlyticsReportPersistence.f20726c.d().f20746a;
        ArrayList arrayListB = crashlyticsReportPersistence.b();
        int size3 = arrayListB.size();
        if (size3 <= 4) {
            return;
        }
        Iterator it3 = arrayListB.subList(4, size3).iterator();
        while (it3.hasNext()) {
            ((File) it3.next()).delete();
        }
    }

    public final void c(String str, Boolean bool) {
        Integer num;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Logger logger = Logger.f20289a;
        logger.b("Opening a new session with ID " + str, null);
        Locale locale = Locale.US;
        IdManager idManager = this.f;
        String str2 = idManager.f20359c;
        AppData appData = this.f20322h;
        StaticSessionData.AppData appDataB = StaticSessionData.AppData.b(str2, appData.f, appData.g, ((AutoValue_InstallIdProvider_InstallIds) idManager.c()).f20301a, (appData.d != null ? DeliveryMechanism.APP_STORE : DeliveryMechanism.DEVELOPER).X, appData.f20297h);
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.VERSION.CODENAME;
        StaticSessionData.OsData osDataA = StaticSessionData.OsData.a(CommonUtils.g());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        CommonUtils.Architecture architecture = CommonUtils.Architecture.X;
        String str5 = Build.CPU_ABI;
        boolean zIsEmpty = TextUtils.isEmpty(str5);
        CommonUtils.Architecture architecture2 = CommonUtils.Architecture.X;
        if (zIsEmpty) {
            logger.e("Architecture#getValue()::Build.CPU_ABI returned null or empty");
        } else {
            CommonUtils.Architecture architecture3 = (CommonUtils.Architecture) CommonUtils.Architecture.f20311Y.get(str5.toLowerCase(locale));
            if (architecture3 != null) {
                architecture2 = architecture3;
            }
        }
        int iOrdinal = architecture2.ordinal();
        String str6 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = CommonUtils.a(this.f20318a);
        boolean zF = CommonUtils.f();
        int iC = CommonUtils.c();
        String str7 = Build.MANUFACTURER;
        String str8 = Build.PRODUCT;
        this.j.c(str, jCurrentTimeMillis, StaticSessionData.b(appDataB, osDataA, StaticSessionData.DeviceData.c(iOrdinal, iAvailableProcessors, jA, blockCount, zF, iC)));
        if (bool.booleanValue() && str != null) {
            this.d.f(str);
        }
        this.f20323i.b(str);
        this.f20324l.a(str);
        SessionReportingCoordinator sessionReportingCoordinator = this.m;
        CrashlyticsReportDataCapture crashlyticsReportDataCapture = sessionReportingCoordinator.f20364a;
        CrashlyticsReport.Builder builderA = CrashlyticsReport.a();
        builderA.l("20.0.3");
        AppData appData2 = crashlyticsReportDataCapture.f20343c;
        builderA.h(appData2.f20293a);
        IdManager idManager2 = crashlyticsReportDataCapture.f20342b;
        builderA.i(((AutoValue_InstallIdProvider_InstallIds) idManager2.c()).f20301a);
        builderA.g(((AutoValue_InstallIdProvider_InstallIds) idManager2.c()).f20302b);
        builderA.f(((AutoValue_InstallIdProvider_InstallIds) idManager2.c()).f20303c);
        String str9 = appData2.f;
        builderA.d(str9);
        String str10 = appData2.g;
        builderA.e(str10);
        builderA.k(4);
        CrashlyticsReport.Session.Builder builderA2 = CrashlyticsReport.Session.a();
        builderA2.l(jCurrentTimeMillis);
        builderA2.j(str);
        builderA2.h(CrashlyticsReportDataCapture.g);
        CrashlyticsReport.Session.Application.Builder builderA3 = CrashlyticsReport.Session.Application.a();
        builderA3.e(idManager2.f20359c);
        builderA3.g(str9);
        builderA3.d(str10);
        builderA3.f(((AutoValue_InstallIdProvider_InstallIds) idManager2.c()).f20301a);
        DevelopmentPlatformProvider developmentPlatformProvider = appData2.f20297h;
        builderA3.b(developmentPlatformProvider.a());
        builderA3.c(developmentPlatformProvider.b());
        builderA2.b(builderA3.a());
        CrashlyticsReport.Session.OperatingSystem.Builder builderA4 = CrashlyticsReport.Session.OperatingSystem.a();
        builderA4.d(3);
        builderA4.e(str3);
        builderA4.b(str4);
        builderA4.c(CommonUtils.g());
        builderA2.k(builderA4.a());
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str5) && (num = (Integer) CrashlyticsReportDataCapture.f.get(str5.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = CommonUtils.a(crashlyticsReportDataCapture.f20341a);
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zF2 = CommonUtils.f();
        int iC2 = CommonUtils.c();
        CrashlyticsReport.Session.Device.Builder builderA5 = CrashlyticsReport.Session.Device.a();
        builderA5.b(iIntValue);
        builderA5.f(str6);
        builderA5.c(iAvailableProcessors2);
        builderA5.h(jA2);
        builderA5.d(blockCount2);
        builderA5.i(zF2);
        builderA5.j(iC2);
        builderA5.e(str7);
        builderA5.g(str8);
        builderA2.e(builderA5.a());
        builderA2.i(3);
        builderA.m(builderA2.a());
        CrashlyticsReport crashlyticsReportA = builderA.a();
        FileStore fileStore = sessionReportingCoordinator.f20365b.f20725b;
        CrashlyticsReport.Session sessionM = crashlyticsReportA.m();
        if (sessionM == null) {
            logger.b("Could not get session for report", null);
            return;
        }
        String strI = sessionM.i();
        try {
            CrashlyticsReportPersistence.g.getClass();
            CrashlyticsReportPersistence.f(fileStore.b(strI, "report"), CrashlyticsReportJsonTransform.f20714a.b(crashlyticsReportA));
            File fileB = fileStore.b(strI, "start-time");
            long jK = sessionM.k();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileB), CrashlyticsReportPersistence.f20721e);
            try {
                outputStreamWriter.write("");
                fileB.setLastModified(jK * 1000);
                outputStreamWriter.close();
            } catch (Throwable th) {
                try {
                    outputStreamWriter.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e2) {
            logger.b("Could not persist report for session " + strI, e2);
        }
    }

    public final boolean d(SettingsController settingsController) throws Throwable {
        CrashlyticsWorkers.a();
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = this.f20325n;
        boolean z2 = crashlyticsUncaughtExceptionHandler != null && crashlyticsUncaughtExceptionHandler.f20348e.get();
        Logger logger = Logger.f20289a;
        if (z2) {
            logger.f(null, "Skipping session finalization because a crash has already occurred.");
            return false;
        }
        logger.e("Finalizing previously open sessions.");
        try {
            b(true, settingsController, true);
            logger.e("Closed all previously open sessions.");
            return true;
        } catch (Exception e2) {
            logger.c(e2, "Unable to finalize previously open sessions.");
            return false;
        }
    }

    public final String e() throws IOException {
        InputStream resourceAsStream;
        Context context = this.f20318a;
        int iD = CommonUtils.d(context, "com.google.firebase.crashlytics.version_control_info", k.f38992h);
        String string = iD == 0 ? null : context.getResources().getString(iD);
        Logger logger = Logger.f20289a;
        if (string != null) {
            logger.b("Read version control info from string resource", null);
            return Base64.encodeToString(string.getBytes(s), 0);
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            logger.f(null, "Couldn't get Class Loader");
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            logger.d("No version control information found");
            return null;
        }
        try {
            logger.b("Read version control info from file", null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i2 = resourceAsStream.read(bArr);
                    if (i2 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return strEncodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            resourceAsStream.close();
            throw th4;
        }
    }

    public final void f() {
        Logger logger = Logger.f20289a;
        try {
            String strE = e();
            if (strE != null) {
                try {
                    this.d.e(strE);
                } catch (IllegalArgumentException e2) {
                    Context context = this.f20318a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e2;
                    }
                    logger.c(null, "Attempting to set custom attribute with null key, ignoring.");
                }
                logger.d("Saved version control info");
            }
        } catch (IOException e3) {
            logger.f(e3, "Unable to save version control info");
        }
    }

    public final void g(final Task task) {
        Task task2;
        Task taskA;
        FileStore fileStore = this.m.f20365b.f20725b;
        boolean zIsEmpty = FileStore.e(fileStore.f20730e.listFiles()).isEmpty();
        TaskCompletionSource taskCompletionSource = this.o;
        Logger logger = Logger.f20289a;
        if (zIsEmpty && FileStore.e(fileStore.f.listFiles()).isEmpty() && FileStore.e(fileStore.g.listFiles()).isEmpty()) {
            logger.e("No crash reports are available to be sent.");
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        logger.e("Crash reports are available to be sent.");
        DataCollectionArbiter dataCollectionArbiter = this.f20319b;
        if (dataCollectionArbiter.a()) {
            logger.b("Automatic data collection is enabled. Allowing upload.", null);
            taskCompletionSource.trySetResult(Boolean.FALSE);
            taskA = Tasks.forResult(Boolean.TRUE);
        } else {
            logger.b("Automatic data collection is disabled.", null);
            logger.e("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (dataCollectionArbiter.f20350b) {
                task2 = dataCollectionArbiter.f20351c.getTask();
            }
            Task taskOnSuccessTask = task2.onSuccessTask(new AnonymousClass3());
            logger.b("Waiting for send/deleteUnsentReports to be called.", null);
            taskA = CrashlyticsTasks.a(taskOnSuccessTask, this.f20326p.getTask());
        }
        taskA.onSuccessTask(this.f20321e.f20376a, new SuccessContinuation<Boolean, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task<Void> then(Boolean bool) {
                Boolean bool2 = bool;
                boolean zBooleanValue = bool2.booleanValue();
                Logger logger2 = Logger.f20289a;
                CrashlyticsController crashlyticsController = CrashlyticsController.this;
                if (zBooleanValue) {
                    logger2.b("Sending cached crash reports...", null);
                    boolean zBooleanValue2 = bool2.booleanValue();
                    DataCollectionArbiter dataCollectionArbiter2 = crashlyticsController.f20319b;
                    if (!zBooleanValue2) {
                        dataCollectionArbiter2.getClass();
                        throw new IllegalStateException("An invalid data collection token was used.");
                    }
                    dataCollectionArbiter2.f.trySetResult(null);
                    return task.onSuccessTask(crashlyticsController.f20321e.f20376a, new SuccessContinuation<Settings, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4.1
                        @Override // com.google.android.gms.tasks.SuccessContinuation
                        public final Task<Void> then(Settings settings) {
                            if (settings == null) {
                                Logger.f20289a.f(null, "Received null app settings at app startup. Cannot send cached reports");
                                return Tasks.forResult(null);
                            }
                            CrashlyticsController crashlyticsController2 = CrashlyticsController.this;
                            CrashlyticsController.a(crashlyticsController2);
                            crashlyticsController2.m.e(null, crashlyticsController2.f20321e.f20376a);
                            crashlyticsController2.q.trySetResult(null);
                            return Tasks.forResult(null);
                        }
                    });
                }
                logger2.e("Deleting cached crash reports...");
                Iterator it = FileStore.e(crashlyticsController.g.f20729c.listFiles(CrashlyticsController.r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                FileStore fileStore2 = crashlyticsController.m.f20365b.f20725b;
                CrashlyticsReportPersistence.a(FileStore.e(fileStore2.f20730e.listFiles()));
                CrashlyticsReportPersistence.a(FileStore.e(fileStore2.f.listFiles()));
                CrashlyticsReportPersistence.a(FileStore.e(fileStore2.g.listFiles()));
                crashlyticsController.q.trySetResult(null);
                return Tasks.forResult(null);
            }
        });
    }
}
