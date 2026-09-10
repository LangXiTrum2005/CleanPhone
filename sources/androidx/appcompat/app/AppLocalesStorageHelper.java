package androidx.appcompat.app;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes.dex */
class AppLocalesStorageHelper {

    public static class SerialExecutor implements Executor {
        public final Object X = new Object();

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ArrayDeque f3350Y = new ArrayDeque();
        public final Executor Z;
        public Runnable e0;

        public SerialExecutor(Executor executor) {
            this.Z = executor;
        }

        public final void a() {
            synchronized (this.X) {
                try {
                    Runnable runnable = (Runnable) this.f3350Y.poll();
                    this.e0 = runnable;
                    if (runnable != null) {
                        ((ThreadPerTaskExecutor) this.Z).execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(final Runnable runnable) {
            synchronized (this.X) {
                try {
                    this.f3350Y.add(new Runnable() { // from class: androidx.appcompat.app.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            Runnable runnable2 = runnable;
                            AppLocalesStorageHelper.SerialExecutor serialExecutor = this.X;
                            serialExecutor.getClass();
                            try {
                                runnable2.run();
                            } finally {
                                serialExecutor.a();
                            }
                        }
                    });
                    if (this.e0 == null) {
                        a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static class ThreadPerTaskExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static void a(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
            try {
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "locales");
                        xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                        xmlSerializerNewSerializer.endTag(null, "locales");
                        xmlSerializerNewSerializer.endDocument();
                        Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                    } catch (Exception e2) {
                        Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e2);
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                    }
                } catch (Throwable th) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0045 A[EXC_TOP_SPLITTER, PHI: r2
  0x0045: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:25:0x004e, B:21:0x0043] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static String b(Context context) {
        String attributeValue = "";
        try {
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                    int depth = xmlPullParserNewPullParser.getDepth();
                    while (true) {
                        int next = xmlPullParserNewPullParser.next();
                        if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                            if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th) {
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException | XmlPullParserException unused3) {
                Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                if (fileInputStreamOpenFileInput != null) {
                    fileInputStreamOpenFileInput.close();
                }
            }
            if (attributeValue.isEmpty()) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            } else {
                Log.d("AppLocalesStorageHelper", "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: ".concat(attributeValue));
            }
            return attributeValue;
        } catch (FileNotFoundException unused4) {
            Log.w("AppLocalesStorageHelper", "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return "";
        }
    }
}
