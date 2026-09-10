package com.google.firebase.crashlytics.internal.persistence;

import androidx.core.provider.a;
import com.applovin.shadow.okio.Segment;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class CrashlyticsReportPersistence {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f20721e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final CrashlyticsReportJsonTransform g = new CrashlyticsReportJsonTransform();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f20722h = new a(3);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p009u.a f20723i = new p009u.a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f20724a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileStore f20725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SettingsController f20726c;
    public final CrashlyticsAppQualitySessionsSubscriber d;

    public CrashlyticsReportPersistence(FileStore fileStore, SettingsController settingsController, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        this.f20725b = fileStore;
        this.f20726c = settingsController;
        this.d = crashlyticsAppQualitySessionsSubscriber;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) throws IOException {
        byte[] bArr = new byte[Segment.SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f20721e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f20721e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        FileStore fileStore = this.f20725b;
        arrayList.addAll(FileStore.e(fileStore.f.listFiles()));
        arrayList.addAll(FileStore.e(fileStore.g.listFiles()));
        a aVar = f20722h;
        Collections.sort(arrayList, aVar);
        List listE = FileStore.e(fileStore.f20730e.listFiles());
        Collections.sort(listE, aVar);
        arrayList.addAll(listE);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(FileStore.e(this.f20725b.d.list())).descendingSet();
    }

    public final void d(CrashlyticsReport.Session.Event event, String str, boolean z2) {
        FileStore fileStore = this.f20725b;
        Settings.SessionData sessionData = this.f20726c.d().f20746a;
        g.getClass();
        try {
            f(fileStore.b(str, android.support.v4.media.a.n("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f20724a.getAndIncrement())), z2 ? "_" : "")), CrashlyticsReportJsonTransform.f20714a.b(event));
        } catch (IOException e2) {
            Logger.f20289a.f(e2, "Could not persist event for session " + str);
        }
        p009u.a aVar = new p009u.a(1);
        fileStore.getClass();
        File file = new File(fileStore.d, str);
        file.mkdirs();
        List<File> listE = FileStore.e(file.listFiles(aVar));
        Collections.sort(listE, new a(4));
        int size = listE.size();
        for (File file2 : listE) {
            if (size <= sessionData.f20753a) {
                return;
            }
            FileStore.d(file2);
            size--;
        }
    }
}
