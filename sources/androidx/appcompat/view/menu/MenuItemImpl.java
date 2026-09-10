package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class MenuItemImpl implements SupportMenuItem {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ActionProvider f3490A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f3491B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3494c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f3495e;
    public CharSequence f;
    public Intent g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f3496h;
    public char j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f3498l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final MenuBuilder f3499n;
    public SubMenuBuilder o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f3500p;
    public CharSequence q;
    public CharSequence r;
    public int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f3503z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3497i = 4096;
    public int k = 4096;
    public int m = 0;
    public ColorStateList s = null;
    public PorterDuff.Mode t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3501u = false;
    public boolean v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3502w = false;
    public int x = 16;
    public boolean C = false;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.MenuItemImpl$1, reason: invalid class name */
    class AnonymousClass1 implements ActionProvider.VisibilityListener {
        public AnonymousClass1() {
        }
    }

    public MenuItemImpl(MenuBuilder menuBuilder, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f3499n = menuBuilder;
        this.f3492a = i3;
        this.f3493b = i2;
        this.f3494c = i4;
        this.d = i5;
        this.f3495e = charSequence;
        this.y = i6;
    }

    public static void c(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final ActionProvider a() {
        return this.f3490A;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final SupportMenuItem b(ActionProvider actionProvider) {
        ActionProvider actionProvider2 = this.f3490A;
        if (actionProvider2 != null) {
            actionProvider2.f4422c = null;
            actionProvider2.f4421b = null;
        }
        this.f3503z = null;
        this.f3490A = actionProvider;
        this.f3499n.p(true);
        ActionProvider actionProvider3 = this.f3490A;
        if (actionProvider3 != null) {
            actionProvider3.h(new AnonymousClass1());
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.f3503z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3491B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3499n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f3502w && (this.f3501u || this.v)) {
            drawable = drawable.mutate();
            if (this.f3501u) {
                DrawableCompat.j(drawable, this.s);
            }
            if (this.v) {
                DrawableCompat.k(drawable, this.t);
            }
            this.f3502w = false;
        }
        return drawable;
    }

    public final boolean e() {
        ActionProvider actionProvider;
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.f3503z == null && (actionProvider = this.f3490A) != null) {
            this.f3503z = actionProvider.d(this);
        }
        return this.f3503z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3491B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3499n.f(this);
        }
        return false;
    }

    public final void f(boolean z2) {
        this.x = (z2 ? 4 : 0) | (this.x & (-5));
    }

    public final void g(boolean z2) {
        if (z2) {
            this.x |= 32;
        } else {
            this.x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f3503z;
        if (view != null) {
            return view;
        }
        ActionProvider actionProvider = this.f3490A;
        if (actionProvider == null) {
            return null;
        }
        View viewD = actionProvider.d(this);
        this.f3503z = viewD;
        return viewD;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f3493b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f3498l;
        if (drawable != null) {
            return d(drawable);
        }
        int i2 = this.m;
        if (i2 == 0) {
            return null;
        }
        Drawable drawableA = AppCompatResources.a(this.f3499n.f3478a, i2);
        this.m = 0;
        this.f3498l = drawableA;
        return d(drawableA);
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.s;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f3492a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f3497i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3496h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f3494c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3495e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        return charSequence != null ? charSequence : this.f3495e;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProvider actionProvider = this.f3490A;
        if (actionProvider == null || !actionProvider.g()) {
            return (this.x & 8) == 0;
        }
        return (this.x & 8) == 0 && this.f3490A.b();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i2;
        this.f3503z = view;
        this.f3490A = null;
        if (view != null && view.getId() == -1 && (i2 = this.f3492a) > 0) {
            view.setId(i2);
        }
        MenuBuilder menuBuilder = this.f3499n;
        menuBuilder.k = true;
        menuBuilder.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.j == c2) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.f3499n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.x;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.x = i3;
        if (i2 != i3) {
            this.f3499n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i2 = this.x;
        if ((i2 & 4) == 0) {
            int i3 = (i2 & (-3)) | (z2 ? 2 : 0);
            this.x = i3;
            if (i2 != i3) {
                this.f3499n.p(false);
            }
            return this;
        }
        MenuBuilder menuBuilder = this.f3499n;
        menuBuilder.getClass();
        ArrayList arrayList = menuBuilder.f;
        int size = arrayList.size();
        menuBuilder.w();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i4);
            if (menuItemImpl.f3493b == this.f3493b && (menuItemImpl.x & 4) != 0 && menuItemImpl.isCheckable()) {
                boolean z3 = menuItemImpl == this;
                int i5 = menuItemImpl.x;
                int i6 = (z3 ? 2 : 0) | (i5 & (-3));
                menuItemImpl.x = i6;
                if (i5 != i6) {
                    menuItemImpl.f3499n.p(false);
                }
            }
        }
        menuBuilder.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.x |= 16;
        } else {
            this.x &= -17;
        }
        this.f3499n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.f3498l = drawable;
        this.f3502w = true;
        this.f3499n.p(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.f3501u = true;
        this.f3502w = true;
        this.f3499n.p(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.t = mode;
        this.v = true;
        this.f3502w = true;
        this.f3499n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f3496h == c2) {
            return this;
        }
        this.f3496h = c2;
        this.f3499n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3491B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3500p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f3496h = c2;
        this.j = Character.toLowerCase(c3);
        this.f3499n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.y = i2;
        MenuBuilder menuBuilder = this.f3499n;
        menuBuilder.k = true;
        menuBuilder.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3495e = charSequence;
        this.f3499n.p(false);
        SubMenuBuilder subMenuBuilder = this.o;
        if (subMenuBuilder != null) {
            subMenuBuilder.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.f3499n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i2 = this.x;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.x = i3;
        if (i2 != i3) {
            MenuBuilder menuBuilder = this.f3499n;
            menuBuilder.f3482h = true;
            menuBuilder.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f3495e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.f3499n.p(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.f3499n.p(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.j == c2 && this.k == i2) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i2);
        this.f3499n.p(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f3496h == c2 && this.f3497i == i2) {
            return this;
        }
        this.f3496h = c2;
        this.f3497i = KeyEvent.normalizeMetaState(i2);
        this.f3499n.p(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f3496h = c2;
        this.f3497i = KeyEvent.normalizeMetaState(i2);
        this.j = Character.toLowerCase(c3);
        this.k = KeyEvent.normalizeMetaState(i3);
        this.f3499n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f3498l = null;
        this.m = i2;
        this.f3502w = true;
        this.f3499n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        setTitle(this.f3499n.f3478a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        int i3;
        Context context = this.f3499n.f3478a;
        View viewInflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false);
        this.f3503z = viewInflate;
        this.f3490A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i3 = this.f3492a) > 0) {
            viewInflate.setId(i3);
        }
        MenuBuilder menuBuilder = this.f3499n;
        menuBuilder.k = true;
        menuBuilder.p(true);
        return this;
    }
}
