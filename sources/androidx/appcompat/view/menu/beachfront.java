package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: compiled from: MenuDialogHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, apical.attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public androidx.appcompat.app.attabal f4863arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public marial f4864kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public ListMenuPresenter f4865monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public apical.attabal f4866polloi;

    public beachfront(marial marialVar) {
        this.f4864kowloon = marialVar;
    }

    @Override // androidx.appcompat.view.menu.apical.attabal
    public boolean attabal(marial marialVar) {
        apical.attabal attabalVar = this.f4866polloi;
        if (attabalVar != null) {
            return attabalVar.attabal(marialVar);
        }
        return false;
    }

    public void dern(IBinder iBinder) {
        marial marialVar = this.f4864kowloon;
        androidx.appcompat.app.attabal.C0029attabal c0029attabal = new androidx.appcompat.app.attabal.C0029attabal(marialVar.gintrap());
        ListMenuPresenter listMenuPresenter = new ListMenuPresenter(c0029attabal.saneness(), beachfront.competently.abc_list_menu_item_layout);
        this.f4865monoploid = listMenuPresenter;
        listMenuPresenter.setCallback(this);
        this.f4864kowloon.saneness(this.f4865monoploid);
        c0029attabal.dern(this.f4865monoploid.getAdapter(), this);
        View viewCuirassed = marialVar.cuirassed();
        if (viewCuirassed != null) {
            c0029attabal.wireman(viewCuirassed);
        } else {
            c0029attabal.marial(marialVar.preprohormone()).impromptu(marialVar.cord());
        }
        c0029attabal.beachfront(this);
        androidx.appcompat.app.attabal attabalVarAttabal = c0029attabal.attabal();
        this.f4863arytenoidectomy = attabalVarAttabal;
        attabalVarAttabal.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f4863arytenoidectomy.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f4863arytenoidectomy.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f4864kowloon.privatdozent((competently) this.f4865monoploid.getAdapter().getItem(i), 0);
    }

    @Override // androidx.appcompat.view.menu.apical.attabal
    public void onCloseMenu(marial marialVar, boolean z) {
        if (z || marialVar == this.f4864kowloon) {
            saneness();
        }
        apical.attabal attabalVar = this.f4866polloi;
        if (attabalVar != null) {
            attabalVar.onCloseMenu(marialVar, z);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f4865monoploid.onCloseMenu(this.f4864kowloon, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f4863arytenoidectomy.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f4863arytenoidectomy.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f4864kowloon.marial(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f4864kowloon.performShortcut(i, keyEvent, 0);
    }

    public void saneness() {
        androidx.appcompat.app.attabal attabalVar = this.f4863arytenoidectomy;
        if (attabalVar != null) {
            attabalVar.dismiss();
        }
    }
}
