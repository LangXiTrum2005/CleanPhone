package g1;

import android.os.Handler;
import android.os.Looper;
import g9.d;
import java.util.concurrent.atomic.AtomicBoolean;
import ta.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Handler f41334f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f41339e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f41336b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f41337c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f41338d = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f41335a = new b(this, new c6.a(this, 3));

    public a(d dVar) {
        this.f41339e = dVar;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f41334f == null) {
                    f41334f = new Handler(Looper.getMainLooper());
                }
                handler = f41334f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new i0(this, false, obj, 22));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41339e.b();
    }
}
