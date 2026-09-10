package md;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f45955a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f45956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gd.a f45957c;

    public b(View view, gd.a aVar) {
        this.f45956b = new AtomicReference(view);
        this.f45957c = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View view = (View) this.f45956b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: md.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                b bVar = this.f45953a;
                bVar.getClass();
                view.getViewTreeObserver().removeOnDrawListener(bVar);
            }
        });
        this.f45955a.postAtFrontOfQueue(this.f45957c);
    }
}
