package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AlertDialog;

/* JADX INFO: loaded from: classes.dex */
class MenuDialogHelper implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, MenuPresenter.Callback {
    public SubMenuBuilder X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public AlertDialog f3489Y;
    public ListMenuPresenter Z;

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public final void b(MenuBuilder menuBuilder, boolean z2) {
        AlertDialog alertDialog;
        if ((z2 || menuBuilder == this.X) && (alertDialog = this.f3489Y) != null) {
            alertDialog.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public final boolean c(MenuBuilder menuBuilder) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.X.q((MenuItemImpl) this.Z.a().getItem(i2), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.Z.b(this.X, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuBuilder subMenuBuilder = this.X;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f3489Y.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f3489Y.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuBuilder.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuBuilder.performShortcut(i2, keyEvent, 0);
    }
}
