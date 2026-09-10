package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class cig {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final competently f9281attabal;

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    public static class attabal extends competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Window f9282attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final creditor f9283saneness;

        public attabal(Window window, creditor creditorVar) {
            this.f9282attabal = window;
            this.f9283saneness = creditorVar;
        }

        public void apical(int i) {
            View decorView = this.f9282attabal.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        @Override // androidx.core.view.cig.competently
        public void attabal(int i) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    competently(i2);
                }
            }
        }

        @Override // androidx.core.view.cig.competently
        public void beachfront(int i) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    cutely(i2);
                }
            }
        }

        public final void competently(int i) {
            if (i == 1) {
                impromptu(4);
            } else if (i == 2) {
                impromptu(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.f9283saneness.attabal();
            }
        }

        public final void cutely(int i) {
            if (i == 1) {
                apical(4);
                formularize(1024);
            } else if (i == 2) {
                apical(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.f9283saneness.saneness();
            }
        }

        public void formularize(int i) {
            this.f9282attabal.clearFlags(i);
        }

        public void impromptu(int i) {
            View decorView = this.f9282attabal.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        @Override // androidx.core.view.cig.competently
        public void marial(int i) {
            this.f9282attabal.getDecorView().setTag(356039078, Integer.valueOf(i));
            if (i == 0) {
                apical(6144);
                return;
            }
            if (i == 1) {
                apical(4096);
                impromptu(2048);
            } else {
                if (i != 2) {
                    return;
                }
                apical(2048);
                impromptu(4096);
            }
        }

        public void taiyuan(int i) {
            this.f9282attabal.addFlags(i);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    public static class beachfront extends marial {
        public beachfront(Window window, cig cigVar, creditor creditorVar) {
            super(window, cigVar, creditorVar);
        }

        @Override // androidx.core.view.cig.wireman, androidx.core.view.cig.competently
        public boolean saneness() {
            return (this.f9287saneness.getSystemBarsAppearance() & 8) != 0;
        }

        public beachfront(WindowInsetsController windowInsetsController, cig cigVar, creditor creditorVar) {
            super(windowInsetsController, cigVar, creditorVar);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    public static class dern extends saneness {
        public dern(Window window, creditor creditorVar) {
            super(window, creditorVar);
        }

        @Override // androidx.core.view.cig.competently
        public void dern(boolean z) {
            if (!z) {
                apical(16);
                return;
            }
            formularize(134217728);
            taiyuan(Integer.MIN_VALUE);
            impromptu(16);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    public static class marial extends wireman {
        public marial(Window window, cig cigVar, creditor creditorVar) {
            super(window, cigVar, creditorVar);
        }

        @Override // androidx.core.view.cig.wireman, androidx.core.view.cig.competently
        public void marial(int i) {
            this.f9287saneness.setSystemBarsBehavior(i);
        }

        public marial(WindowInsetsController windowInsetsController, cig cigVar, creditor creditorVar) {
            super(windowInsetsController, cigVar, creditorVar);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    public static class saneness extends attabal {
        public saneness(Window window, creditor creditorVar) {
            super(window, creditorVar);
        }

        @Override // androidx.core.view.cig.competently
        public boolean saneness() {
            return (this.f9282attabal.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.cig.competently
        public void wireman(boolean z) {
            if (!z) {
                apical(8192);
                return;
            }
            formularize(67108864);
            taiyuan(Integer.MIN_VALUE);
            impromptu(8192);
        }
    }

    @Deprecated
    public cig(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f9281attabal = new beachfront(windowInsetsController, this, new creditor(windowInsetsController));
        } else {
            this.f9281attabal = new wireman(windowInsetsController, this, new creditor(windowInsetsController));
        }
    }

    @Deprecated
    public static cig competently(WindowInsetsController windowInsetsController) {
        return new cig(windowInsetsController);
    }

    public void attabal(int i) {
        this.f9281attabal.attabal(i);
    }

    public void beachfront(int i) {
        this.f9281attabal.beachfront(i);
    }

    public void dern(boolean z) {
        this.f9281attabal.dern(z);
    }

    public void marial(int i) {
        this.f9281attabal.marial(i);
    }

    public boolean saneness() {
        return this.f9281attabal.saneness();
    }

    public void wireman(boolean z) {
        this.f9281attabal.wireman(z);
    }

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    public static class wireman extends competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final cig f9284attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final creditor f9285dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public Window f9286marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final WindowInsetsController f9287saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final androidx.collection.splinterproof<Object, WindowInsetsController.OnControllableInsetsChangedListener> f9288wireman;

        public wireman(Window window, cig cigVar, creditor creditorVar) {
            this(window.getInsetsController(), cigVar, creditorVar);
            this.f9286marial = window;
        }

        @Override // androidx.core.view.cig.competently
        public void attabal(int i) {
            if ((i & 8) != 0) {
                this.f9285dern.attabal();
            }
            this.f9287saneness.hide(i & (-9));
        }

        @Override // androidx.core.view.cig.competently
        public void beachfront(int i) {
            if ((i & 8) != 0) {
                this.f9285dern.saneness();
            }
            this.f9287saneness.show(i & (-9));
        }

        public void competently(int i) {
            View decorView = this.f9286marial.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        @Override // androidx.core.view.cig.competently
        public void dern(boolean z) {
            if (z) {
                if (this.f9286marial != null) {
                    competently(16);
                }
                this.f9287saneness.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f9286marial != null) {
                    impromptu(16);
                }
                this.f9287saneness.setSystemBarsAppearance(0, 16);
            }
        }

        public void impromptu(int i) {
            View decorView = this.f9286marial.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        @Override // androidx.core.view.cig.competently
        public void marial(int i) {
            Window window = this.f9286marial;
            if (window == null) {
                this.f9287saneness.setSystemBarsBehavior(i);
                return;
            }
            window.getDecorView().setTag(356039078, Integer.valueOf(i));
            if (i == 0) {
                impromptu(6144);
                return;
            }
            if (i == 1) {
                impromptu(4096);
                competently(2048);
            } else {
                if (i != 2) {
                    return;
                }
                impromptu(2048);
                competently(4096);
            }
        }

        @Override // androidx.core.view.cig.competently
        public boolean saneness() {
            this.f9287saneness.setSystemBarsAppearance(0, 0);
            return (this.f9287saneness.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.cig.competently
        public void wireman(boolean z) {
            if (z) {
                if (this.f9286marial != null) {
                    competently(8192);
                }
                this.f9287saneness.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f9286marial != null) {
                    impromptu(8192);
                }
                this.f9287saneness.setSystemBarsAppearance(0, 8);
            }
        }

        public wireman(WindowInsetsController windowInsetsController, cig cigVar, creditor creditorVar) {
            this.f9288wireman = new androidx.collection.splinterproof<>();
            this.f9287saneness = windowInsetsController;
            this.f9284attabal = cigVar;
            this.f9285dern = creditorVar;
        }
    }

    public cig(Window window, View view) {
        creditor creditorVar = new creditor(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f9281attabal = new beachfront(window, this, creditorVar);
            return;
        }
        if (i >= 30) {
            this.f9281attabal = new wireman(window, this, creditorVar);
        } else if (i >= 26) {
            this.f9281attabal = new dern(window, creditorVar);
        } else {
            this.f9281attabal = new saneness(window, creditorVar);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    public static class competently {
        public void attabal(int i) {
            throw null;
        }

        public void beachfront(int i) {
            throw null;
        }

        public void marial(int i) {
            throw null;
        }

        public boolean saneness() {
            throw null;
        }

        public void wireman(boolean z) {
            throw null;
        }

        public void dern(boolean z) {
        }
    }
}
