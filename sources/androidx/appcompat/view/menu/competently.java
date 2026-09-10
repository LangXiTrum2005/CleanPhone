package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.graphics.drawable.DrawableCompat;

/* JADX INFO: compiled from: MenuItemImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class competently implements julian.saneness {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public Runnable f4869arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f4870attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public CharSequence f4871beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public Intent f4872competently;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public int f4873cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public View f4874cuirassed;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public char f4875cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f4876dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public Drawable f4878formularize;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public char f4882impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public arytenoidectomy f4883kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public CharSequence f4884marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public CharSequence f4885molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f4886monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public CharSequence f4888polloi;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f4891saneness;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public androidx.core.view.saneness f4892stratoscope;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public marial f4894triweekly;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f4895trm;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f4896wireman;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f4897yemenite;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f4893taiyuan = 4096;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f4868apical = 4096;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public int f4881impassible = 0;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public ColorStateList f4880graveside = null;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public PorterDuff.Mode f4867adultoid = null;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public boolean f4877dovishness = false;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public boolean f4879gintrap = false;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public boolean f4890rotuma = false;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public int f4889preprohormone = 16;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public boolean f4887oilcan = false;

    /* JADX INFO: compiled from: MenuItemImpl.java */
    public class attabal implements androidx.core.view.saneness.InterfaceC0061saneness {
        public attabal() {
        }

        @Override // androidx.core.view.saneness.InterfaceC0061saneness
        public void onActionProviderVisibilityChanged(boolean z) {
            competently competentlyVar = competently.this;
            competentlyVar.f4894triweekly.grimness(competentlyVar);
        }
    }

    public competently(marial marialVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f4894triweekly = marialVar;
        this.f4870attabal = i2;
        this.f4891saneness = i;
        this.f4876dern = i3;
        this.f4896wireman = i4;
        this.f4884marial = charSequence;
        this.f4873cord = i5;
    }

    public static void wireman(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public void adultoid(boolean z) {
        if (z) {
            this.f4889preprohormone |= 32;
        } else {
            this.f4889preprohormone &= -33;
        }
    }

    public boolean apical() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f4886monoploid;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        marial marialVar = this.f4894triweekly;
        if (marialVar.impromptu(marialVar, this)) {
            return true;
        }
        Runnable runnable = this.f4869arytenoidectomy;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f4872competently != null) {
            try {
                this.f4894triweekly.gintrap().startActivity(this.f4872competently);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        androidx.core.view.saneness sanenessVar = this.f4892stratoscope;
        return sanenessVar != null && sanenessVar.marial();
    }

    @Override // julian.saneness, android.view.MenuItem
    /* JADX INFO: renamed from: arytenoidectomy, reason: merged with bridge method [inline-methods] */
    public julian.saneness setActionView(int i) {
        Context contextGintrap = this.f4894triweekly.gintrap();
        setActionView(LayoutInflater.from(contextGintrap).inflate(i, (ViewGroup) new LinearLayout(contextGintrap), false));
        return this;
    }

    @Override // julian.saneness
    public androidx.core.view.saneness attabal() {
        return this.f4892stratoscope;
    }

    public int beachfront() {
        return this.f4896wireman;
    }

    @Override // julian.saneness, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f4873cord & 8) == 0) {
            return false;
        }
        if (this.f4874cuirassed == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4895trm;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f4894triweekly.beachfront(this);
        }
        return false;
    }

    public char competently() {
        return this.f4894triweekly.merc() ? this.f4875cutely : this.f4882impromptu;
    }

    public boolean cord() {
        return this.f4894triweekly.trm();
    }

    public boolean cuirassed() {
        return this.f4894triweekly.polder() && competently() != 0;
    }

    public boolean cutely() {
        androidx.core.view.saneness sanenessVar;
        if ((this.f4873cord & 8) != 0) {
            if (this.f4874cuirassed == null && (sanenessVar = this.f4892stratoscope) != null) {
                this.f4874cuirassed = sanenessVar.wireman(this);
            }
            if (this.f4874cuirassed != null) {
                return true;
            }
        }
        return false;
    }

    public void dern() {
        this.f4894triweekly.seminary(this);
    }

    public void dovishness(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f4897yemenite = contextMenuInfo;
    }

    @Override // julian.saneness, android.view.MenuItem
    public boolean expandActionView() {
        if (!cutely()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4895trm;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f4894triweekly.impassible(this);
        }
        return false;
    }

    public boolean formularize() {
        return (this.f4889preprohormone & 32) == 32;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // julian.saneness, android.view.MenuItem
    public View getActionView() {
        View view = this.f4874cuirassed;
        if (view != null) {
            return view;
        }
        androidx.core.view.saneness sanenessVar = this.f4892stratoscope;
        if (sanenessVar == null) {
            return null;
        }
        View viewWireman = sanenessVar.wireman(this);
        this.f4874cuirassed = viewWireman;
        return viewWireman;
    }

    @Override // julian.saneness, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f4868apical;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f4875cutely;
    }

    @Override // julian.saneness, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f4888polloi;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f4891saneness;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f4878formularize;
        if (drawable != null) {
            return marial(drawable);
        }
        if (this.f4881impassible == 0) {
            return null;
        }
        Drawable drawableSaneness = competently.attabal.saneness(this.f4894triweekly.gintrap(), this.f4881impassible);
        this.f4881impassible = 0;
        this.f4878formularize = drawableSaneness;
        return marial(drawableSaneness);
    }

    @Override // julian.saneness, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f4880graveside;
    }

    @Override // julian.saneness, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f4867adultoid;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f4872competently;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f4870attabal;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f4897yemenite;
    }

    @Override // julian.saneness, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f4893taiyuan;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f4882impromptu;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f4876dern;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f4883kowloon;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f4884marial;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4871beachfront;
        return charSequence != null ? charSequence : this.f4884marial;
    }

    @Override // julian.saneness, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f4885molybdenite;
    }

    @Override // julian.saneness, android.view.MenuItem
    /* JADX INFO: renamed from: gintrap, reason: merged with bridge method [inline-methods] */
    public julian.saneness setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public void graveside(boolean z) {
        this.f4889preprohormone = (z ? 4 : 0) | (this.f4889preprohormone & (-5));
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f4883kowloon != null;
    }

    public boolean impassible() {
        return (this.f4889preprohormone & 4) != 0;
    }

    public String impromptu() {
        char cCompetently = competently();
        if (cCompetently == 0) {
            return "";
        }
        Resources resources = this.f4894triweekly.gintrap().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f4894triweekly.gintrap()).hasPermanentMenuKey()) {
            sb.append(resources.getString(beachfront.impromptu.abc_prepend_shortcut_label));
        }
        int i = this.f4894triweekly.merc() ? this.f4868apical : this.f4893taiyuan;
        wireman(sb, i, 65536, resources.getString(beachfront.impromptu.abc_menu_meta_shortcut_label));
        wireman(sb, i, 4096, resources.getString(beachfront.impromptu.abc_menu_ctrl_shortcut_label));
        wireman(sb, i, 2, resources.getString(beachfront.impromptu.abc_menu_alt_shortcut_label));
        wireman(sb, i, 1, resources.getString(beachfront.impromptu.abc_menu_shift_shortcut_label));
        wireman(sb, i, 4, resources.getString(beachfront.impromptu.abc_menu_sym_shortcut_label));
        wireman(sb, i, 8, resources.getString(beachfront.impromptu.abc_menu_function_shortcut_label));
        if (cCompetently == '\b') {
            sb.append(resources.getString(beachfront.impromptu.abc_menu_delete_shortcut_label));
        } else if (cCompetently == '\n') {
            sb.append(resources.getString(beachfront.impromptu.abc_menu_enter_shortcut_label));
        } else if (cCompetently != ' ') {
            sb.append(cCompetently);
        } else {
            sb.append(resources.getString(beachfront.impromptu.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    @Override // julian.saneness, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f4887oilcan;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f4889preprohormone & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f4889preprohormone & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f4889preprohormone & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.saneness sanenessVar = this.f4892stratoscope;
        if (sanenessVar == null || !sanenessVar.competently()) {
            return (this.f4889preprohormone & 8) == 0;
        }
        return (this.f4889preprohormone & 8) == 0 && this.f4892stratoscope.saneness();
    }

    public boolean kowloon() {
        return (this.f4873cord & 2) == 2;
    }

    public final Drawable marial(Drawable drawable) {
        if (drawable != null && this.f4890rotuma && (this.f4877dovishness || this.f4879gintrap)) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (this.f4877dovishness) {
                DrawableCompat.setTintList(drawable, this.f4880graveside);
            }
            if (this.f4879gintrap) {
                DrawableCompat.setTintMode(drawable, this.f4867adultoid);
            }
            this.f4890rotuma = false;
        }
        return drawable;
    }

    public void molybdenite(boolean z) {
        int i = this.f4889preprohormone;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f4889preprohormone = i2;
        if (i != i2) {
            this.f4894triweekly.saran(false);
        }
    }

    @Override // julian.saneness, android.view.MenuItem
    /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
    public julian.saneness setActionView(View view) {
        int i;
        this.f4874cuirassed = view;
        this.f4892stratoscope = null;
        if (view != null && view.getId() == -1 && (i = this.f4870attabal) > 0) {
            view.setId(i);
        }
        this.f4894triweekly.seminary(this);
        return this;
    }

    public void polloi(boolean z) {
        this.f4887oilcan = z;
        this.f4894triweekly.saran(false);
    }

    public boolean preprohormone(boolean z) {
        int i = this.f4889preprohormone;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f4889preprohormone = i2;
        return i != i2;
    }

    public void rotuma(arytenoidectomy arytenoidectomyVar) {
        this.f4883kowloon = arytenoidectomyVar;
        arytenoidectomyVar.setHeaderTitle(getTitle());
    }

    @Override // julian.saneness
    public julian.saneness saneness(androidx.core.view.saneness sanenessVar) {
        androidx.core.view.saneness sanenessVar2 = this.f4892stratoscope;
        if (sanenessVar2 != null) {
            sanenessVar2.impromptu();
        }
        this.f4874cuirassed = null;
        this.f4892stratoscope = sanenessVar;
        this.f4894triweekly.saran(true);
        androidx.core.view.saneness sanenessVar3 = this.f4892stratoscope;
        if (sanenessVar3 != null) {
            sanenessVar3.cutely(new attabal());
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f4875cutely == c) {
            return this;
        }
        this.f4875cutely = Character.toLowerCase(c);
        this.f4894triweekly.saran(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f4889preprohormone;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f4889preprohormone = i2;
        if (i != i2) {
            this.f4894triweekly.saran(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f4889preprohormone & 4) != 0) {
            this.f4894triweekly.dent(this);
            return this;
        }
        molybdenite(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f4889preprohormone |= 16;
        } else {
            this.f4889preprohormone &= -17;
        }
        this.f4894triweekly.saran(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f4881impassible = 0;
        this.f4878formularize = drawable;
        this.f4890rotuma = true;
        this.f4894triweekly.saran(false);
        return this;
    }

    @Override // julian.saneness, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4880graveside = colorStateList;
        this.f4877dovishness = true;
        this.f4890rotuma = true;
        this.f4894triweekly.saran(false);
        return this;
    }

    @Override // julian.saneness, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4867adultoid = mode;
        this.f4879gintrap = true;
        this.f4890rotuma = true;
        this.f4894triweekly.saran(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f4872competently = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f4882impromptu == c) {
            return this;
        }
        this.f4882impromptu = c;
        this.f4894triweekly.saran(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f4895trm = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4886monoploid = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f4882impromptu = c;
        this.f4875cutely = Character.toLowerCase(c2);
        this.f4894triweekly.saran(false);
        return this;
    }

    @Override // julian.saneness, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f4873cord = i;
        this.f4894triweekly.seminary(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f4884marial = charSequence;
        this.f4894triweekly.saran(false);
        arytenoidectomy arytenoidectomyVar = this.f4883kowloon;
        if (arytenoidectomyVar != null) {
            arytenoidectomyVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4871beachfront = charSequence;
        this.f4894triweekly.saran(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (preprohormone(z)) {
            this.f4894triweekly.grimness(this);
        }
        return this;
    }

    public boolean stratoscope() {
        return (this.f4873cord & 4) == 4;
    }

    public CharSequence taiyuan(formularize.attabal attabalVar) {
        return (attabalVar == null || !attabalVar.prefersCondensedTitle()) ? getTitle() : getTitleCondensed();
    }

    public String toString() {
        CharSequence charSequence = this.f4884marial;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public boolean triweekly() {
        return (this.f4873cord & 1) == 1;
    }

    @Override // julian.saneness, android.view.MenuItem
    public julian.saneness setContentDescription(CharSequence charSequence) {
        this.f4888polloi = charSequence;
        this.f4894triweekly.saran(false);
        return this;
    }

    @Override // julian.saneness, android.view.MenuItem
    public julian.saneness setTooltipText(CharSequence charSequence) {
        this.f4885molybdenite = charSequence;
        this.f4894triweekly.saran(false);
        return this;
    }

    @Override // julian.saneness, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f4875cutely == c && this.f4868apical == i) {
            return this;
        }
        this.f4875cutely = Character.toLowerCase(c);
        this.f4868apical = KeyEvent.normalizeMetaState(i);
        this.f4894triweekly.saran(false);
        return this;
    }

    @Override // julian.saneness, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f4882impromptu == c && this.f4893taiyuan == i) {
            return this;
        }
        this.f4882impromptu = c;
        this.f4893taiyuan = KeyEvent.normalizeMetaState(i);
        this.f4894triweekly.saran(false);
        return this;
    }

    @Override // julian.saneness, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f4882impromptu = c;
        this.f4893taiyuan = KeyEvent.normalizeMetaState(i);
        this.f4875cutely = Character.toLowerCase(c2);
        this.f4868apical = KeyEvent.normalizeMetaState(i2);
        this.f4894triweekly.saran(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f4878formularize = null;
        this.f4881impassible = i;
        this.f4890rotuma = true;
        this.f4894triweekly.saran(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.f4894triweekly.gintrap().getString(i));
    }
}
