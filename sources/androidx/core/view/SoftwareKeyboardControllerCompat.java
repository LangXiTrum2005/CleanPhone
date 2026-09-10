package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class SoftwareKeyboardControllerCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Impl20 f4457a;

    public static class Impl {
    }

    public static class Impl20 extends Impl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f4458a;

        public Impl20(View view) {
            this.f4458a = view;
        }

        public void a() {
            View view = this.f4458a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }

    public static class Impl30 extends Impl20 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f4459b;

        /* JADX WARN: Type inference failed for: r4v0, types: [androidx.core.view.d] */
        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20
        public final void a() {
            View view = this.f4459b;
            WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r4 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.d
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i2) {
                    atomicBoolean.set((i2 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r4);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r4);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }
    }

    public SoftwareKeyboardControllerCompat(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            this.f4457a = new Impl20(view);
            return;
        }
        Impl30 impl30 = new Impl30(view);
        impl30.f4459b = view;
        this.f4457a = impl30;
    }
}
