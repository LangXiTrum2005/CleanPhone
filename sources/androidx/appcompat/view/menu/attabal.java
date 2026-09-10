package androidx.appcompat.view.menu;

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
import androidx.core.graphics.drawable.DrawableCompat;

/* JADX INFO: compiled from: ActionMenuItem.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal implements julian.saneness {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public Drawable f4843apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f4845attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public Intent f4846beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public char f4847competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f4849dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public Context f4850formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f4852impassible;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public CharSequence f4854kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public CharSequence f4855marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f4859saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public char f4860taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public CharSequence f4861triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public CharSequence f4862wireman;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f4853impromptu = 4096;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f4848cutely = 4096;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public ColorStateList f4844arytenoidectomy = null;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public PorterDuff.Mode f4857monoploid = null;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f4858polloi = false;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public boolean f4856molybdenite = false;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public int f4851graveside = 16;

    public attabal(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f4850formularize = context;
        this.f4845attabal = i2;
        this.f4859saneness = i;
        this.f4849dern = i4;
        this.f4862wireman = charSequence;
    }

    @Override // julian.saneness
    public androidx.core.view.saneness attabal() {
        return null;
    }

    @Override // julian.saneness, android.view.MenuItem
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public julian.saneness setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // julian.saneness, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    public final void dern() {
        Drawable drawable = this.f4843apical;
        if (drawable != null) {
            if (this.f4858polloi || this.f4856molybdenite) {
                Drawable drawableWrap = DrawableCompat.wrap(drawable);
                this.f4843apical = drawableWrap;
                Drawable drawableMutate = drawableWrap.mutate();
                this.f4843apical = drawableMutate;
                if (this.f4858polloi) {
                    DrawableCompat.setTintList(drawableMutate, this.f4844arytenoidectomy);
                }
                if (this.f4856molybdenite) {
                    DrawableCompat.setTintMode(this.f4843apical, this.f4857monoploid);
                }
            }
        }
    }

    @Override // julian.saneness, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // julian.saneness, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // julian.saneness, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f4848cutely;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f4860taiyuan;
    }

    @Override // julian.saneness, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f4861triweekly;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f4859saneness;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f4843apical;
    }

    @Override // julian.saneness, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f4844arytenoidectomy;
    }

    @Override // julian.saneness, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f4857monoploid;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f4846beachfront;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f4845attabal;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // julian.saneness, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f4853impromptu;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f4847competently;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f4849dern;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f4862wireman;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4855marial;
        return charSequence != null ? charSequence : this.f4862wireman;
    }

    @Override // julian.saneness, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f4854kowloon;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // julian.saneness, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f4851graveside & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f4851graveside & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f4851graveside & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f4851graveside & 8) == 0;
    }

    @Override // julian.saneness, android.view.MenuItem
    /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
    public julian.saneness setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // julian.saneness
    public julian.saneness saneness(androidx.core.view.saneness sanenessVar) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f4860taiyuan = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f4851graveside = (z ? 1 : 0) | (this.f4851graveside & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f4851graveside = (z ? 2 : 0) | (this.f4851graveside & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f4851graveside = (z ? 16 : 0) | (this.f4851graveside & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f4843apical = drawable;
        dern();
        return this;
    }

    @Override // julian.saneness, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4844arytenoidectomy = colorStateList;
        this.f4858polloi = true;
        dern();
        return this;
    }

    @Override // julian.saneness, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4857monoploid = mode;
        this.f4856molybdenite = true;
        dern();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f4846beachfront = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f4847competently = c;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4852impassible = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f4847competently = c;
        this.f4860taiyuan = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f4862wireman = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4855marial = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f4851graveside = (this.f4851graveside & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // julian.saneness, android.view.MenuItem
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public julian.saneness setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // julian.saneness, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f4860taiyuan = Character.toLowerCase(c);
        this.f4848cutely = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // julian.saneness, android.view.MenuItem
    public julian.saneness setContentDescription(CharSequence charSequence) {
        this.f4861triweekly = charSequence;
        return this;
    }

    @Override // julian.saneness, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f4847competently = c;
        this.f4853impromptu = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f4862wireman = this.f4850formularize.getResources().getString(i);
        return this;
    }

    @Override // julian.saneness, android.view.MenuItem
    public julian.saneness setTooltipText(CharSequence charSequence) {
        this.f4854kowloon = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f4843apical = picketboat.saneness.getDrawable(this.f4850formularize, i);
        dern();
        return this;
    }

    @Override // julian.saneness, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f4847competently = c;
        this.f4853impromptu = KeyEvent.normalizeMetaState(i);
        this.f4860taiyuan = Character.toLowerCase(c2);
        this.f4848cutely = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // julian.saneness, android.view.MenuItem
    public void setShowAsAction(int i) {
    }
}
