package orcelite;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;

/* JADX INFO: compiled from: SafeToastContext.java */
/* JADX INFO: loaded from: classes5.dex */
public final class saneness extends ContextWrapper {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public Toast f34760attabal;

    /* JADX INFO: compiled from: SafeToastContext.java */
    public final class dern implements WindowManager {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final WindowManager f34762kowloon;

        @Override // android.view.ViewManager
        public void addView(View view, ViewGroup.LayoutParams layoutParams) {
            try {
                this.f34762kowloon.addView(view, layoutParams);
            } catch (WindowManager.BadTokenException e) {
                e.getMessage();
                saneness.attabal(saneness.this);
            } catch (Throwable unused) {
            }
        }

        @Override // android.view.WindowManager
        public Display getDefaultDisplay() {
            return this.f34762kowloon.getDefaultDisplay();
        }

        @Override // android.view.ViewManager
        public void removeView(View view) {
            this.f34762kowloon.removeView(view);
        }

        @Override // android.view.WindowManager
        public void removeViewImmediate(View view) {
            this.f34762kowloon.removeViewImmediate(view);
        }

        @Override // android.view.ViewManager
        public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
            this.f34762kowloon.updateViewLayout(view, layoutParams);
        }

        public dern(WindowManager windowManager) {
            this.f34762kowloon = windowManager;
        }
    }

    /* JADX INFO: renamed from: orcelite.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SafeToastContext.java */
    public final class C0763saneness extends ContextWrapper {
        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "window".equals(str) ? new dern((WindowManager) getBaseContext().getSystemService(str)) : super.getSystemService(str);
        }

        public C0763saneness(Context context) {
            super(context);
        }
    }

    public saneness(Context context, Toast toast) {
        super(context);
        this.f34760attabal = toast;
    }

    public static /* synthetic */ orcelite.attabal attabal(saneness sanenessVar) {
        sanenessVar.getClass();
        return null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        return new C0763saneness(getBaseContext().getApplicationContext());
    }

    public void saneness(orcelite.attabal attabalVar) {
    }
}
