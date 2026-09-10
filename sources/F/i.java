package f;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40221a = SystemClock.uptimeMillis() + ((long) 10000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f40222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f40224d;

    public i(ComponentActivity componentActivity) {
        this.f40224d = componentActivity;
    }

    public final void a(View view) {
        if (this.f40223c) {
            return;
        }
        this.f40223c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        this.f40222b = runnable;
        View decorView = this.f40224d.getWindow().getDecorView();
        kotlin.jvm.internal.n.e(decorView, "getDecorView(...)");
        if (!this.f40223c) {
            decorView.postOnAnimation(new com.mbridge.msdk.config.component.info.provider.subprovider.f(this, 14));
        } else if (kotlin.jvm.internal.n.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z10;
        Runnable runnable = this.f40222b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f40221a) {
                this.f40223c = false;
                this.f40224d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f40222b = null;
        m fullyDrawnReporter = this.f40224d.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f40233b) {
            z10 = fullyDrawnReporter.f40234c;
        }
        if (z10) {
            this.f40223c = false;
            this.f40224d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40224d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
