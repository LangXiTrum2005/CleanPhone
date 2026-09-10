package androidx.arch.core.executor;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class ArchTaskExecutor extends TaskExecutor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile ArchTaskExecutor f3674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3675c = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultTaskExecutor f3676a = new DefaultTaskExecutor();

    public static ArchTaskExecutor a() {
        if (f3674b != null) {
            return f3674b;
        }
        synchronized (ArchTaskExecutor.class) {
            try {
                if (f3674b == null) {
                    f3674b = new ArchTaskExecutor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3674b;
    }

    public final void b(Runnable runnable) {
        DefaultTaskExecutor defaultTaskExecutor = this.f3676a;
        if (defaultTaskExecutor.f3679c == null) {
            synchronized (defaultTaskExecutor.f3677a) {
                try {
                    if (defaultTaskExecutor.f3679c == null) {
                        defaultTaskExecutor.f3679c = DefaultTaskExecutor.a(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        defaultTaskExecutor.f3679c.post(runnable);
    }
}
