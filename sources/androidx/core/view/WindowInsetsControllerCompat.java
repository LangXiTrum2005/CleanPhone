package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.collection.SimpleArrayMap;
import com.applovin.shadow.okio.Segment;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsControllerCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Impl f4525a;

    public static class Impl20 extends Impl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Window f4526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SoftwareKeyboardControllerCompat f4527b;

        public Impl20(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.f4526a = window;
            this.f4527b = softwareKeyboardControllerCompat;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void a(int i2) {
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    if (i3 == 1) {
                        f(4);
                    } else if (i3 == 2) {
                        f(2);
                    } else if (i3 == 8) {
                        this.f4527b.f4457a.a();
                    }
                }
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void e() {
            g(com.p004ironsource.mediationsdk.metadata.a.f25965n);
            f(4096);
        }

        public final void f(int i2) {
            View decorView = this.f4526a.getDecorView();
            decorView.setSystemUiVisibility(i2 | decorView.getSystemUiVisibility());
        }

        public final void g(int i2) {
            View decorView = this.f4526a.getDecorView();
            decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
        }
    }

    public static class Impl23 extends Impl20 {
        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final boolean b() {
            return (this.f4526a.getDecorView().getSystemUiVisibility() & Segment.SIZE) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void d(boolean z2) {
            if (!z2) {
                g(Segment.SIZE);
                return;
            }
            Window window = this.f4526a;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            f(Segment.SIZE);
        }
    }

    public static class Impl26 extends Impl23 {
        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void c(boolean z2) {
            if (!z2) {
                g(16);
                return;
            }
            Window window = this.f4526a;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            f(16);
        }
    }

    public static class Impl30 extends Impl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowInsetsController f4528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SoftwareKeyboardControllerCompat f4529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Window f4530c;

        /* JADX INFO: renamed from: androidx.core.view.WindowInsetsControllerCompat$Impl30$1, reason: invalid class name */
        class AnonymousClass1 implements WindowInsetsAnimationControlListener {
            public final void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
                throw null;
            }

            public final void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
                throw null;
            }

            public final void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i2) {
                throw null;
            }
        }

        public Impl30(WindowInsetsController windowInsetsController, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            new SimpleArrayMap(0);
            this.f4528a = windowInsetsController;
            this.f4529b = softwareKeyboardControllerCompat;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void a(int i2) {
            if ((i2 & 8) != 0) {
                this.f4529b.f4457a.a();
            }
            this.f4528a.hide(i2 & (-9));
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final boolean b() {
            this.f4528a.setSystemBarsAppearance(0, 0);
            return (this.f4528a.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void c(boolean z2) {
            Window window = this.f4530c;
            if (z2) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
                this.f4528a.setSystemBarsAppearance(16, 16);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
            }
            this.f4528a.setSystemBarsAppearance(0, 16);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void d(boolean z2) {
            Window window = this.f4530c;
            if (z2) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | Segment.SIZE);
                }
                this.f4528a.setSystemBarsAppearance(8, 8);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
            }
            this.f4528a.setSystemBarsAppearance(0, 8);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void e() {
            this.f4528a.setSystemBarsBehavior(2);
        }
    }

    public interface OnControllableInsetsChangedListener {
    }

    public WindowInsetsControllerCompat(Window window, View view) {
        SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            Impl30 impl30 = new Impl30(window.getInsetsController(), softwareKeyboardControllerCompat);
            impl30.f4530c = window;
            this.f4525a = impl30;
        } else if (i2 >= 26) {
            this.f4525a = new Impl26(window, softwareKeyboardControllerCompat);
        } else {
            this.f4525a = new Impl23(window, softwareKeyboardControllerCompat);
        }
    }

    public final void a(int i2) {
        this.f4525a.a(i2);
    }

    public final boolean b() {
        return this.f4525a.b();
    }

    public final void c(boolean z2) {
        this.f4525a.c(z2);
    }

    public final void d(boolean z2) {
        this.f4525a.d(z2);
    }

    public final void e() {
        this.f4525a.e();
    }

    public static class Impl {
        public void a(int i2) {
        }

        public boolean b() {
            return false;
        }

        public void c(boolean z2) {
        }

        public void d(boolean z2) {
        }

        public void e() {
        }
    }
}
