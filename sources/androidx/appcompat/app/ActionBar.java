package androidx.appcompat.app;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.view.ActionMode;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActionBar {

    @Retention(RetentionPolicy.SOURCE)
    public @interface DisplayOptions {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface NavigationMode {
    }

    public interface OnMenuVisibilityListener {
        void a();
    }

    @Deprecated
    public interface OnNavigationListener {
    }

    @Deprecated
    public static abstract class Tab {
    }

    @Deprecated
    public interface TabListener {
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public void g(boolean z2) {
    }

    public abstract int h();

    public Context i() {
        return null;
    }

    public boolean j() {
        return false;
    }

    public void l() {
    }

    public boolean m(int i2, KeyEvent keyEvent) {
        return false;
    }

    public boolean n(KeyEvent keyEvent) {
        return false;
    }

    public boolean o() {
        return false;
    }

    public void p(boolean z2) {
    }

    public void q(boolean z2) {
    }

    public void r(CharSequence charSequence) {
    }

    public ActionMode s(ActionMode.Callback callback) {
        return null;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3289a;

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f3289a = 0;
            this.f3289a = layoutParams.f3289a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3289a = 0;
        }
    }

    public void k() {
    }
}
