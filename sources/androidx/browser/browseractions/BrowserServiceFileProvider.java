package androidx.browser.browseractions;

import android.os.AsyncTask;
import androidx.core.content.FileProvider;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class BrowserServiceFileProvider extends FileProvider {
    public static final Object X = new Object();

    /* JADX INFO: renamed from: androidx.browser.browseractions.BrowserServiceFileProvider$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static class FileCleanupTask extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final long f3685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f3686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f3687c;

        static {
            TimeUnit timeUnit = TimeUnit.DAYS;
            f3685a = timeUnit.toMillis(7L);
            f3686b = timeUnit.toMillis(7L);
            f3687c = timeUnit.toMillis(1L);
        }

        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) {
            throw null;
        }
    }

    public static class FileSaveTask extends AsyncTask<String, Void, Void> {
        @Override // android.os.AsyncTask
        public final Void doInBackground(String[] strArr) {
            throw null;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r1) {
            new FileCleanupTask();
            throw null;
        }
    }
}
