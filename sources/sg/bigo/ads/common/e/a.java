package sg.bigo.ads.common.e;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: sg.bigo.ads.common.e.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0836a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f47134a = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: sg.bigo.ads.common.e.a.a.1
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z2) {
                AbstractC0836a.this.a(z2);
            }
        };

        public final ViewTreeObserver.OnWindowFocusChangeListener a() {
            Object obj = this.f47134a;
            if (obj instanceof ViewTreeObserver.OnWindowFocusChangeListener) {
                return (ViewTreeObserver.OnWindowFocusChangeListener) obj;
            }
            return null;
        }

        public abstract void a(boolean z2);
    }

    public static void a(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void b(View view, AbstractC0836a abstractC0836a) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListenerA;
        if (view == null || abstractC0836a == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive() || (onWindowFocusChangeListenerA = abstractC0836a.a()) == null) {
            return;
        }
        viewTreeObserver.removeOnWindowFocusChangeListener(onWindowFocusChangeListenerA);
    }

    public static void a(View view, float f) {
        if (view == null) {
            return;
        }
        view.setZ(f);
    }

    public static void a(View view, int i2) {
        if (view == null) {
            return;
        }
        view.setElevation(i2);
    }

    public static void a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void a(View view, AbstractC0836a abstractC0836a) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListenerA;
        if (view == null || abstractC0836a == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive() || (onWindowFocusChangeListenerA = abstractC0836a.a()) == null) {
            return;
        }
        viewTreeObserver.addOnWindowFocusChangeListener(onWindowFocusChangeListenerA);
    }
}
