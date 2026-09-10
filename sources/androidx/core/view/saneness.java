package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: ActionProvider.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f9413attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public InterfaceC0061saneness f9414dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public attabal f9415saneness;

    /* JADX INFO: compiled from: ActionProvider.java */
    public interface attabal {
        void attabal(boolean z);
    }

    /* JADX INFO: renamed from: androidx.core.view.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActionProvider.java */
    public interface InterfaceC0061saneness {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public saneness(Context context) {
        this.f9413attabal = context;
    }

    public void apical(boolean z) {
        attabal attabalVar = this.f9415saneness;
        if (attabalVar != null) {
            attabalVar.attabal(z);
        }
    }

    public boolean attabal() {
        return false;
    }

    public boolean competently() {
        return false;
    }

    public void cutely(InterfaceC0061saneness interfaceC0061saneness) {
        this.f9414dern = interfaceC0061saneness;
    }

    public abstract View dern();

    public void impromptu() {
        this.f9414dern = null;
        this.f9415saneness = null;
    }

    public boolean marial() {
        return false;
    }

    public boolean saneness() {
        return true;
    }

    public void taiyuan(attabal attabalVar) {
        this.f9415saneness = attabalVar;
    }

    public View wireman(MenuItem menuItem) {
        return dern();
    }

    public void beachfront(SubMenu subMenu) {
    }
}
