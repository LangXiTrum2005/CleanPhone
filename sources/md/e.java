package md;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f45961a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f45962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gd.a f45963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gd.a f45964d;

    public e(View view, gd.a aVar, gd.a aVar2) {
        this.f45962b = new AtomicReference(view);
        this.f45963c = aVar;
        this.f45964d = aVar2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.f45962b.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        gd.a aVar = this.f45963c;
        Handler handler = this.f45961a;
        handler.post(aVar);
        handler.postAtFrontOfQueue(this.f45964d);
        return true;
    }
}
