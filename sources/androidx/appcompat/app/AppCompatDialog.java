package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentDialog;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.KeyEventDispatcher;
import com.charging.screenshow.battery.animations.themes.R;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatDialog extends ComponentDialog implements AppCompatCallback {
    public AppCompatDelegate e0;
    public final c f0;

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.appcompat.app.c] */
    public AppCompatDialog(Context context, int i2) {
        int i3;
        if (i2 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i3 = typedValue.resourceId;
        } else {
            i3 = i2;
        }
        super(context, i3);
        this.f0 = new KeyEventDispatcher.Component() { // from class: androidx.appcompat.app.c
            @Override // androidx.core.view.KeyEventDispatcher.Component
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.X.d(keyEvent);
            }
        };
        AppCompatDelegate appCompatDelegateC = c();
        if (i2 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i2 = typedValue2.resourceId;
        }
        appCompatDelegateC.A(i2);
        appCompatDelegateC.o();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().c(view, layoutParams);
    }

    public final AppCompatDelegate c() {
        if (this.e0 == null) {
            AppLocalesStorageHelper.SerialExecutor serialExecutor = AppCompatDelegate.X;
            this.e0 = new AppCompatDelegateImpl(getContext(), getWindow(), this, this);
        }
        return this.e0;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().p();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return KeyEventDispatcher.b(this.f0, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i2) {
        return c().e(i2);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().l();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        c().k();
        super.onCreate(bundle);
        c().o();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStop() {
        super.onStop();
        c().t();
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public final void onSupportActionModeFinished(ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public final void onSupportActionModeStarted(ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public final ActionMode onWindowStartingSupportActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(int i2) {
        c().w(i2);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().B(charSequence);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        c().x(view);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().y(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i2) {
        super.setTitle(i2);
        c().B(getContext().getString(i2));
    }
}
