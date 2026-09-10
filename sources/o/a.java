package o;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f46876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f46877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent f46878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f46879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f46881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f46882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f46883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f46884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f46885j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f46886k;
    public ColorStateList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f46887m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f46888n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f46889o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f46890p;

    @Override // h0.a
    public final p a() {
        return null;
    }

    @Override // h0.a
    public final h0.a b(p pVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f46883h;
        if (drawable != null) {
            if (this.f46888n || this.f46889o) {
                this.f46883h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f46883h = drawableMutate;
                if (this.f46888n) {
                    drawableMutate.setTintList(this.l);
                }
                if (this.f46889o) {
                    this.f46883h.setTintMode(this.f46887m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // h0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f46882g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f46881f;
    }

    @Override // h0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f46885j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f46883h;
    }

    @Override // h0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.l;
    }

    @Override // h0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f46887m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f46878c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // h0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f46880e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f46879d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f46876a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f46877b;
        return charSequence != null ? charSequence : this.f46876a;
    }

    @Override // h0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f46886k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f46890p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f46890p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f46890p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f46890p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4) {
        this.f46881f = Character.toLowerCase(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f46890p = (z10 ? 1 : 0) | (this.f46890p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.f46890p = (z10 ? 2 : 0) | (this.f46890p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f46885j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f46890p = (z10 ? 16 : 0) | (this.f46890p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f46883h = drawable;
        c();
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        this.f46888n = true;
        c();
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f46887m = mode;
        this.f46889o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f46878c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4) {
        this.f46879d = c4;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5) {
        this.f46879d = c4;
        this.f46881f = Character.toLowerCase(c5);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f46876a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f46877b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f46886k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        this.f46890p = (this.f46890p & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4, int i10) {
        this.f46881f = Character.toLowerCase(c4);
        this.f46882g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final h0.a setContentDescription(CharSequence charSequence) {
        this.f46885j = charSequence;
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4, int i10) {
        this.f46879d = c4;
        this.f46880e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f46876a = this.f46884i.getResources().getString(i10);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final h0.a setTooltipText(CharSequence charSequence) {
        this.f46886k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f46883h = this.f46884i.getDrawable(i10);
        c();
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5, int i10, int i11) {
        this.f46879d = c4;
        this.f46880e = KeyEvent.normalizeMetaState(i10);
        this.f46881f = Character.toLowerCase(c5);
        this.f46882g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }
}
