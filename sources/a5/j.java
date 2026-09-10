package a5;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import io.flutter.plugin.platform.v;
import io.flutter.plugin.platform.w;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3394a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3396c;

    public j(View view, io.flutter.plugin.platform.k kVar) {
        this.f3395b = view;
        this.f3396c = kVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.f3394a) {
            case 0:
                n.f(view, "view");
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.f3396c).get();
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity != null && iBinder != null) {
                    ((k) this.f3395b).c(iBinder, activity);
                }
                break;
            default:
                View view2 = (View) this.f3395b;
                view2.getViewTreeObserver().addOnDrawListener(new w(view2, new v(this, 0)));
                view2.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f3394a) {
            case 0:
                n.f(view, "view");
                break;
        }
    }

    public j(k sidecarCompat, Activity activity) {
        n.f(sidecarCompat, "sidecarCompat");
        this.f3395b = sidecarCompat;
        this.f3396c = new WeakReference(activity);
    }

    private final void a(View view) {
    }
}
