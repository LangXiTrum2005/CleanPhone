package apical;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: StandaloneActionMode.java */
/* JADX INFO: loaded from: classes.dex */
public class marial extends saneness implements androidx.appcompat.view.menu.marial.attabal {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public boolean f14290adultoid;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public boolean f14291dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public androidx.appcompat.view.menu.marial f14292gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public WeakReference<View> f14293graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public saneness.attabal f14294molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public Context f14295monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public ActionBarContextView f14296polloi;

    public marial(Context context, ActionBarContextView actionBarContextView, saneness.attabal attabalVar, boolean z) {
        this.f14295monoploid = context;
        this.f14296polloi = actionBarContextView;
        this.f14294molybdenite = attabalVar;
        androidx.appcompat.view.menu.marial marialVarClubfoot = new androidx.appcompat.view.menu.marial(actionBarContextView.getContext()).clubfoot(1);
        this.f14292gintrap = marialVarClubfoot;
        marialVarClubfoot.overspeculate(this);
        this.f14291dovishness = z;
    }

    @Override // apical.saneness
    public void apical() {
        this.f14294molybdenite.saneness(this, this.f14292gintrap);
    }

    @Override // androidx.appcompat.view.menu.marial.attabal
    public boolean attabal(androidx.appcompat.view.menu.marial marialVar, MenuItem menuItem) {
        return this.f14294molybdenite.attabal(this, menuItem);
    }

    @Override // apical.saneness
    public MenuInflater beachfront() {
        return new competently(this.f14296polloi.getContext());
    }

    @Override // apical.saneness
    public CharSequence competently() {
        return this.f14296polloi.getSubtitle();
    }

    @Override // apical.saneness
    public void dern() {
        if (this.f14290adultoid) {
            return;
        }
        this.f14290adultoid = true;
        this.f14294molybdenite.wireman(this);
    }

    @Override // apical.saneness
    public boolean formularize() {
        return this.f14296polloi.cutely();
    }

    @Override // apical.saneness
    public void impassible(View view) {
        this.f14296polloi.setCustomView(view);
        this.f14293graveside = view != null ? new WeakReference<>(view) : null;
    }

    @Override // apical.saneness
    public void kowloon(CharSequence charSequence) {
        this.f14296polloi.setSubtitle(charSequence);
    }

    @Override // apical.saneness
    public Menu marial() {
        return this.f14292gintrap;
    }

    @Override // apical.saneness
    public void molybdenite(boolean z) {
        super.molybdenite(z);
        this.f14296polloi.setTitleOptional(z);
    }

    @Override // apical.saneness
    public void monoploid(int i) {
        polloi(this.f14295monoploid.getString(i));
    }

    @Override // apical.saneness
    public void polloi(CharSequence charSequence) {
        this.f14296polloi.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.menu.marial.attabal
    public void saneness(androidx.appcompat.view.menu.marial marialVar) {
        apical();
        this.f14296polloi.formularize();
    }

    @Override // apical.saneness
    public CharSequence taiyuan() {
        return this.f14296polloi.getTitle();
    }

    @Override // apical.saneness
    public void triweekly(int i) {
        kowloon(this.f14295monoploid.getString(i));
    }

    @Override // apical.saneness
    public View wireman() {
        WeakReference<View> weakReference = this.f14293graveside;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
