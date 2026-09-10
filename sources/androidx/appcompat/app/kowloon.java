package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: AppCompatDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class kowloon extends androidx.p000activity.monoploid implements saneness {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final androidx.core.view.graveside.attabal f4811molybdenite;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public wireman f4812polloi;

    public kowloon(Context context) {
        this(context, 0);
    }

    private static int taiyuan(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(beachfront.attabal.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.p000activity.monoploid, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        wireman();
        impromptu().marial(view, layoutParams);
    }

    public boolean apical(int i) {
        return impromptu().sealless(i);
    }

    public boolean cutely(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        impromptu().rotuma();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.graveside.marial(this.f4811molybdenite, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) impromptu().cutely(i);
    }

    public wireman impromptu() {
        if (this.f4812polloi == null) {
            this.f4812polloi = wireman.taiyuan(this, this);
        }
        return this.f4812polloi;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        impromptu().graveside();
    }

    @Override // androidx.appcompat.app.saneness
    public apical.saneness marial(apical.saneness.attabal attabalVar) {
        return null;
    }

    @Override // androidx.p000activity.monoploid, android.app.Dialog
    public void onCreate(Bundle bundle) {
        impromptu().molybdenite();
        super.onCreate(bundle);
        impromptu().gintrap(bundle);
    }

    @Override // androidx.p000activity.monoploid, android.app.Dialog
    public void onStop() {
        super.onStop();
        impromptu().trm();
    }

    @Override // androidx.p000activity.monoploid, android.app.Dialog
    public void setContentView(int i) {
        wireman();
        impromptu().kattegat(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        impromptu().seminary(charSequence);
    }

    public kowloon(Context context, int i) {
        super(context, taiyuan(context, i));
        this.f4811molybdenite = new androidx.core.view.graveside.attabal() { // from class: androidx.appcompat.app.triweekly
            @Override // androidx.core.view.graveside.attabal
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f4824kowloon.cutely(keyEvent);
            }
        };
        wireman wiremanVarImpromptu = impromptu();
        wiremanVarImpromptu.polder(taiyuan(context, i));
        wiremanVarImpromptu.gintrap(null);
    }

    @Override // androidx.p000activity.monoploid, android.app.Dialog
    public void setContentView(View view) {
        wireman();
        impromptu().supplicat(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        impromptu().seminary(getContext().getString(i));
    }

    @Override // androidx.p000activity.monoploid, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        wireman();
        impromptu().restrictive(view, layoutParams);
    }

    @Override // androidx.appcompat.app.saneness
    public void attabal(apical.saneness sanenessVar) {
    }

    @Override // androidx.appcompat.app.saneness
    public void beachfront(apical.saneness sanenessVar) {
    }
}
