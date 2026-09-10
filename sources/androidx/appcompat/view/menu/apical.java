package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;

/* JADX INFO: compiled from: MenuPresenter.java */
/* JADX INFO: loaded from: classes.dex */
public interface apical {

    /* JADX INFO: compiled from: MenuPresenter.java */
    public interface attabal {
        boolean attabal(marial marialVar);

        void onCloseMenu(marial marialVar, boolean z);
    }

    boolean collapseItemActionView(marial marialVar, competently competentlyVar);

    boolean expandItemActionView(marial marialVar, competently competentlyVar);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context context, marial marialVar);

    void onCloseMenu(marial marialVar, boolean z);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(arytenoidectomy arytenoidectomyVar);

    void setCallback(attabal attabalVar);

    void updateMenuView(boolean z);
}
