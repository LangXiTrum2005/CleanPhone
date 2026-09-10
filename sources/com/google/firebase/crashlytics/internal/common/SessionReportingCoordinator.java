package com.google.firebase.crashlytics.internal.common;

import com.applovin.shadow.okio.Segment;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.RolloutAssignment;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class SessionReportingCoordinator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsReportDataCapture f20364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CrashlyticsReportPersistence f20365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DataTransportCrashlyticsReportSender f20366c;
    public final LogFileManager d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final UserMetadata f20367e;
    public final IdManager f;

    public SessionReportingCoordinator(CrashlyticsReportDataCapture crashlyticsReportDataCapture, CrashlyticsReportPersistence crashlyticsReportPersistence, DataTransportCrashlyticsReportSender dataTransportCrashlyticsReportSender, LogFileManager logFileManager, UserMetadata userMetadata, IdManager idManager, CrashlyticsWorkers crashlyticsWorkers) {
        this.f20364a = crashlyticsReportDataCapture;
        this.f20365b = crashlyticsReportPersistence;
        this.f20366c = dataTransportCrashlyticsReportSender;
        this.d = logFileManager;
        this.f20367e = userMetadata;
        this.f = idManager;
    }

    public static CrashlyticsReport.Session.Event a(CrashlyticsReport.Session.Event event, LogFileManager logFileManager, UserMetadata userMetadata, Map map) {
        CrashlyticsReport.Session.Event.Builder builderH = event.h();
        String strA = logFileManager.a();
        if (strA != null) {
            CrashlyticsReport.Session.Event.Log.Builder builderA = CrashlyticsReport.Session.Event.Log.a();
            builderA.b(strA);
            builderH.d(builderA.a());
        } else {
            Logger.f20289a.e("No log data to include with this event.");
        }
        List listD = d(userMetadata.a(map));
        List listD2 = d(userMetadata.b());
        if (!listD.isEmpty() || !listD2.isEmpty()) {
            CrashlyticsReport.Session.Event.Application.Builder builderI = event.b().i();
            builderI.e(listD);
            builderI.g(listD2);
            builderH.b(builderI.a());
        }
        return builderH.a();
    }

    public static CrashlyticsReport.Session.Event b(CrashlyticsReport.Session.Event event, UserMetadata userMetadata) {
        List listA = userMetadata.f.a();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < listA.size(); i2++) {
            RolloutAssignment rolloutAssignment = (RolloutAssignment) listA.get(i2);
            CrashlyticsReport.Session.Event.RolloutAssignment.Builder builderA = CrashlyticsReport.Session.Event.RolloutAssignment.a();
            CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder builderA2 = CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.a();
            builderA2.c(rolloutAssignment.f());
            builderA2.b(rolloutAssignment.d());
            builderA.d(builderA2.a());
            builderA.b(rolloutAssignment.b());
            builderA.c(rolloutAssignment.c());
            builderA.e(rolloutAssignment.e());
            arrayList.add(builderA.a());
        }
        if (arrayList.isEmpty()) {
            return event;
        }
        CrashlyticsReport.Session.Event.Builder builderH = event.h();
        CrashlyticsReport.Session.Event.RolloutsState.Builder builderA3 = CrashlyticsReport.Session.Event.RolloutsState.a();
        builderA3.b(arrayList);
        builderH.e(builderA3.a());
        return builderH.a();
    }

    public static String c(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[Segment.SIZE];
                while (true) {
                    int i2 = bufferedInputStream.read(bArr);
                    if (i2 == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                    try {
                        bufferedInputStream.close();
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
            bufferedInputStream.close();
            throw th4;
        }
    }

    public static List d(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            CrashlyticsReport.CustomAttribute.Builder builderA = CrashlyticsReport.CustomAttribute.a();
            builderA.b((String) entry.getKey());
            builderA.c((String) entry.getValue());
            arrayList.add(builderA.a());
        }
        Collections.sort(arrayList, new a(1));
        return Collections.unmodifiableList(arrayList);
    }

    public final Task e(String str, Executor executor) {
        ArrayList<File> arrayListB = this.f20365b.b();
        ArrayList<CrashlyticsReportWithSessionId> arrayList = new ArrayList();
        for (File file : arrayListB) {
            try {
                CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = CrashlyticsReportPersistence.g;
                String strE = CrashlyticsReportPersistence.e(file);
                crashlyticsReportJsonTransform.getClass();
                arrayList.add(new AutoValue_CrashlyticsReportWithSessionId(CrashlyticsReportJsonTransform.i(strE), file.getName(), file));
            } catch (IOException e2) {
                Logger.f20289a.f(e2, "Could not load report file " + file + "; deleting");
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (CrashlyticsReportWithSessionId autoValue_CrashlyticsReportWithSessionId : arrayList) {
            if (str == null || str.equals(autoValue_CrashlyticsReportWithSessionId.c())) {
                if (autoValue_CrashlyticsReportWithSessionId.a().g() == null || autoValue_CrashlyticsReportWithSessionId.a().f() == null) {
                    FirebaseInstallationId firebaseInstallationIdB = this.f.b(true);
                    CrashlyticsReport.Builder builderN = autoValue_CrashlyticsReportWithSessionId.a().n();
                    builderN.g(firebaseInstallationIdB.f20354a);
                    CrashlyticsReport.Builder builderN2 = builderN.a().n();
                    builderN2.f(firebaseInstallationIdB.f20355b);
                    autoValue_CrashlyticsReportWithSessionId = new AutoValue_CrashlyticsReportWithSessionId(builderN2.a(), autoValue_CrashlyticsReportWithSessionId.c(), autoValue_CrashlyticsReportWithSessionId.b());
                }
                arrayList2.add(this.f20366c.b(autoValue_CrashlyticsReportWithSessionId, str != null).continueWith(executor, new g(this, 0)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }
}
