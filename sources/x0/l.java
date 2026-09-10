package x0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import com.google.android.gms.internal.play_billing.q1;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f53527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0.c f53528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final un.a f53529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f53530d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f53531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f53532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f53533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.c f53534h;

    public l(Context context, j0.c cVar) {
        q1.e(context, "Context cannot be null");
        this.f53527a = context.getApplicationContext();
        this.f53528b = cVar;
        this.f53529c = m.f53535d;
    }

    public final void a() {
        synchronized (this.f53530d) {
            try {
                this.f53534h = null;
                Handler handler = this.f53531e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f53531e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f53533g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f53532f = null;
                this.f53533g = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final j0.i b() {
        try {
            un.a aVar = this.f53529c;
            Context context = this.f53527a;
            j0.c cVar = this.f53528b;
            aVar.getClass();
            j0.h hVarA = j0.b.a(context, List.of(cVar));
            int i10 = hVarA.f43567a;
            if (i10 != 0) {
                throw new RuntimeException(defpackage.e.h(i10, "fetchFonts failed (", ")"));
            }
            j0.i[] iVarArr = (j0.i[]) hVarA.f43568b.get(0);
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("provider not found", e10);
        }
    }

    @Override // x0.f
    public final void c(com.bumptech.glide.c cVar) {
        synchronized (this.f53530d) {
            this.f53534h = cVar;
        }
        synchronized (this.f53530d) {
            try {
                if (this.f53534h == null) {
                    return;
                }
                if (this.f53532f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ch.b("emojiCompat", 3));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f53533g = threadPoolExecutor;
                    this.f53532f = threadPoolExecutor;
                }
                this.f53532f.execute(new q1.c(this, 10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
