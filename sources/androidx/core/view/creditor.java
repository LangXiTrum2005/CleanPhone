package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: SoftwareKeyboardControllerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class creditor {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final dern f9294attabal;

    /* JADX INFO: compiled from: SoftwareKeyboardControllerCompat.java */
    public static class attabal extends dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final View f9295attabal;

        public attabal(View view) {
            this.f9295attabal = view;
        }

        @Override // androidx.core.view.creditor.dern
        public void attabal() {
            View view = this.f9295attabal;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f9295attabal.getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.creditor.dern
        public void saneness() {
            final View viewFindViewById = this.f9295attabal;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f9295attabal.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: androidx.core.view.privatdozent
                @Override // java.lang.Runnable
                public final void run() {
                    View view = viewFindViewById;
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                }
            });
        }
    }

    /* JADX INFO: compiled from: SoftwareKeyboardControllerCompat.java */
    public static class dern {
        public void attabal() {
            throw null;
        }

        public void saneness() {
            throw null;
        }
    }

    public creditor(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f9294attabal = new saneness(view);
        } else {
            this.f9294attabal = new attabal(view);
        }
    }

    public void attabal() {
        this.f9294attabal.attabal();
    }

    public void saneness() {
        this.f9294attabal.saneness();
    }

    /* JADX INFO: compiled from: SoftwareKeyboardControllerCompat.java */
    public static class saneness extends attabal {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public WindowInsetsController f9296dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public View f9297saneness;

        public saneness(View view) {
            super(view);
            this.f9297saneness = view;
        }

        @Override // androidx.core.view.creditor.attabal, androidx.core.view.creditor.dern
        public void attabal() {
            View view;
            WindowInsetsController windowInsetsController = this.f9296dern;
            if (windowInsetsController == null) {
                View view2 = this.f9297saneness;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.attabal();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.overspeculate
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                    atomicBoolean.set((i & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f9297saneness) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f9297saneness.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // androidx.core.view.creditor.attabal, androidx.core.view.creditor.dern
        public void saneness() {
            View view = this.f9297saneness;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f9296dern;
            if (windowInsetsController == null) {
                View view2 = this.f9297saneness;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.saneness();
        }

        public saneness(WindowInsetsController windowInsetsController) {
            super(null);
            this.f9296dern = windowInsetsController;
        }
    }

    @Deprecated
    public creditor(WindowInsetsController windowInsetsController) {
        this.f9294attabal = new saneness(windowInsetsController);
    }
}
