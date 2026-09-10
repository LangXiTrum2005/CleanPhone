package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements h0.a {
    public p A;
    public MenuItem.OnActionExpandListener B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f46989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f46990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f46991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f46992h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f46994j;
    public Drawable l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m f46997n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e0 f46998o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f46999p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f47000q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f47001r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f47008y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f47009z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f46993i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f46995k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f46996m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f47002s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f47003t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f47004u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f47005v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f47006w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f47007x = 16;
    public boolean C = false;

    public o(m mVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f46997n = mVar;
        this.f46985a = i11;
        this.f46986b = i10;
        this.f46987c = i12;
        this.f46988d = i13;
        this.f46989e = charSequence;
        this.f47008y = i14;
    }

    public static void c(int i10, int i11, String str, StringBuilder sb2) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override // h0.a
    public final p a() {
        return this.A;
    }

    @Override // h0.a
    public final h0.a b(p pVar) {
        this.f47009z = null;
        this.A = pVar;
        this.f46997n.p(true);
        p pVar2 = this.A;
        if (pVar2 != null) {
            pVar2.f47010a = new od.c(this, 23);
            pVar2.f47011b.setVisibilityListener(pVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f47008y & 8) == 0) {
            return false;
        }
        if (this.f47009z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f46997n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f47006w && (this.f47004u || this.f47005v)) {
            drawable = drawable.mutate();
            if (this.f47004u) {
                drawable.setTintList(this.f47002s);
            }
            if (this.f47005v) {
                drawable.setTintMode(this.f47003t);
            }
            this.f47006w = false;
        }
        return drawable;
    }

    public final boolean e() {
        p pVar;
        if ((this.f47008y & 8) != 0) {
            if (this.f47009z == null && (pVar = this.A) != null) {
                this.f47009z = pVar.f47011b.onCreateActionView(this);
            }
            if (this.f47009z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f46997n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f47007x |= 32;
        } else {
            this.f47007x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f47009z;
        if (view != null) {
            return view;
        }
        p pVar = this.A;
        if (pVar == null) {
            return null;
        }
        View viewOnCreateActionView = pVar.f47011b.onCreateActionView(this);
        this.f47009z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // h0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f46995k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f46994j;
    }

    @Override // h0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f47000q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f46986b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f46996m;
        if (i10 == 0) {
            return null;
        }
        Drawable drawableI = com.google.android.gms.internal.auth.o.i(this.f46997n.f46959a, i10);
        this.f46996m = 0;
        this.l = drawableI;
        return d(drawableI);
    }

    @Override // h0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f47002s;
    }

    @Override // h0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f47003t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f46991g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f46985a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // h0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f46993i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f46992h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f46987c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f46998o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f46989e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f46990f;
        return charSequence != null ? charSequence : this.f46989e;
    }

    @Override // h0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f47001r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f46998o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f47007x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f47007x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f47007x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        p pVar = this.A;
        if (pVar == null || !pVar.f47011b.overridesItemVisibility()) {
            return (this.f47007x & 8) == 0;
        }
        return (this.f47007x & 8) == 0 && this.A.f47011b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f47009z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f46985a) > 0) {
            view.setId(i10);
        }
        m mVar = this.f46997n;
        mVar.f46969k = true;
        mVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4) {
        if (this.f46994j == c4) {
            return this;
        }
        this.f46994j = Character.toLowerCase(c4);
        this.f46997n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f47007x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f47007x = i11;
        if (i10 != i11) {
            this.f46997n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        int i10 = this.f47007x;
        int i11 = i10 & 4;
        m mVar = this.f46997n;
        if (i11 == 0) {
            int i12 = (i10 & (-3)) | (z10 ? 2 : 0);
            this.f47007x = i12;
            if (i10 != i12) {
                mVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = mVar.f46964f;
        int size = arrayList.size();
        mVar.w();
        for (int i13 = 0; i13 < size; i13++) {
            o oVar = (o) arrayList.get(i13);
            if (oVar.f46986b == this.f46986b && (oVar.f47007x & 4) != 0 && oVar.isCheckable()) {
                boolean z11 = oVar == this;
                int i14 = oVar.f47007x;
                int i15 = (z11 ? 2 : 0) | (i14 & (-3));
                oVar.f47007x = i15;
                if (i14 != i15) {
                    oVar.f46997n.p(false);
                }
            }
        }
        mVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f47007x |= 16;
        } else {
            this.f47007x &= -17;
        }
        this.f46997n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f46996m = 0;
        this.l = drawable;
        this.f47006w = true;
        this.f46997n.p(false);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f47002s = colorStateList;
        this.f47004u = true;
        this.f47006w = true;
        this.f46997n.p(false);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f47003t = mode;
        this.f47005v = true;
        this.f47006w = true;
        this.f46997n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f46991g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4) {
        if (this.f46992h == c4) {
            return this;
        }
        this.f46992h = c4;
        this.f46997n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f46999p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5) {
        this.f46992h = c4;
        this.f46994j = Character.toLowerCase(c5);
        this.f46997n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f47008y = i10;
        m mVar = this.f46997n;
        mVar.f46969k = true;
        mVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f46989e = charSequence;
        this.f46997n.p(false);
        e0 e0Var = this.f46998o;
        if (e0Var != null) {
            e0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f46990f = charSequence;
        this.f46997n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10 = this.f47007x;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f47007x = i11;
        if (i10 != i11) {
            m mVar = this.f46997n;
            mVar.f46966h = true;
            mVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f46989e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // h0.a, android.view.MenuItem
    public final h0.a setContentDescription(CharSequence charSequence) {
        this.f47000q = charSequence;
        this.f46997n.p(false);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final h0.a setTooltipText(CharSequence charSequence) {
        this.f47001r = charSequence;
        this.f46997n.p(false);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4, int i10) {
        if (this.f46994j == c4 && this.f46995k == i10) {
            return this;
        }
        this.f46994j = Character.toLowerCase(c4);
        this.f46995k = KeyEvent.normalizeMetaState(i10);
        this.f46997n.p(false);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4, int i10) {
        if (this.f46992h == c4 && this.f46993i == i10) {
            return this;
        }
        this.f46992h = c4;
        this.f46993i = KeyEvent.normalizeMetaState(i10);
        this.f46997n.p(false);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5, int i10, int i11) {
        this.f46992h = c4;
        this.f46993i = KeyEvent.normalizeMetaState(i10);
        this.f46994j = Character.toLowerCase(c5);
        this.f46995k = KeyEvent.normalizeMetaState(i11);
        this.f46997n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.l = null;
        this.f46996m = i10;
        this.f47006w = true;
        this.f46997n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f46997n.f46959a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        m mVar = this.f46997n;
        Context context = mVar.f46959a;
        View viewInflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f47009z = viewInflate;
        this.A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i11 = this.f46985a) > 0) {
            viewInflate.setId(i11);
        }
        mVar.f46969k = true;
        mVar.p(true);
        return this;
    }
}
