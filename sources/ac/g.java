package ac;

import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f3461d = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f3462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f3463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f3464c;

    public g(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        n.f(backgroundExecutorService, "backgroundExecutorService");
        n.f(blockingExecutorService, "blockingExecutorService");
        this.f3462a = new d(backgroundExecutorService);
        this.f3463b = new d(backgroundExecutorService);
        Tasks.forResult(null);
        this.f3464c = new d(blockingExecutorService);
    }

    public static final void a() {
        if (((Boolean) new e(0, f3461d, f.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 0).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void b() {
        if (((Boolean) new e(0, f3461d, f.class, "isBlockingThread", "isBlockingThread()Z", 0, 1).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }
}
