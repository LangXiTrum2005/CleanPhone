package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class MenuItemWrapperICS extends BaseMenuWrapper implements MenuItem {
    public final SupportMenuItem d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Method f3505e;

    public class ActionProviderWrapper extends ActionProvider {
        public final android.view.ActionProvider d;

        public ActionProviderWrapper(Context context, android.view.ActionProvider actionProvider) {
            super(context);
            this.d = actionProvider;
        }

        @Override // androidx.core.view.ActionProvider
        public final boolean a() {
            return this.d.hasSubMenu();
        }

        @Override // androidx.core.view.ActionProvider
        public final View c() {
            return this.d.onCreateActionView();
        }

        @Override // androidx.core.view.ActionProvider
        public final boolean e() {
            return this.d.onPerformDefaultAction();
        }

        @Override // androidx.core.view.ActionProvider
        public final void f(SubMenuBuilder subMenuBuilder) {
            this.d.onPrepareSubMenu(MenuItemWrapperICS.this.d(subMenuBuilder));
        }
    }

    public class ActionProviderWrapperJB extends ActionProviderWrapper implements android.view.ActionProvider.VisibilityListener {
        public ActionProvider.VisibilityListener f;

        @Override // androidx.core.view.ActionProvider
        public final boolean b() {
            return this.d.isVisible();
        }

        @Override // androidx.core.view.ActionProvider
        public final View d(MenuItemImpl menuItemImpl) {
            return this.d.onCreateActionView(menuItemImpl);
        }

        @Override // androidx.core.view.ActionProvider
        public final boolean g() {
            return this.d.overridesItemVisibility();
        }

        @Override // androidx.core.view.ActionProvider
        public final void h(ActionProvider.VisibilityListener visibilityListener) {
            this.f = visibilityListener;
            this.d.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public final void onActionProviderVisibilityChanged(boolean z2) {
            ActionProvider.VisibilityListener visibilityListener = this.f;
            if (visibilityListener != null) {
                MenuBuilder menuBuilder = MenuItemImpl.this.f3499n;
                menuBuilder.f3482h = true;
                menuBuilder.p(true);
            }
        }
    }

    public static class CollapsibleActionViewWrapper extends FrameLayout implements CollapsibleActionView {
        public final android.view.CollapsibleActionView e0;

        /* JADX WARN: Multi-variable type inference failed */
        public CollapsibleActionViewWrapper(View view) {
            super(view.getContext());
            this.e0 = (android.view.CollapsibleActionView) view;
            addView(view);
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        public final void b() {
            this.e0.onActionViewExpanded();
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        public final void e() {
            this.e0.onActionViewCollapsed();
        }
    }

    public class OnActionExpandListenerWrapper implements MenuItem.OnActionExpandListener {
        public final MenuItem.OnActionExpandListener X;

        public OnActionExpandListenerWrapper(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.X = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.X.onMenuItemActionCollapse(MenuItemWrapperICS.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.X.onMenuItemActionExpand(MenuItemWrapperICS.this.c(menuItem));
        }
    }

    public class OnMenuItemClickListenerWrapper implements MenuItem.OnMenuItemClickListener {
        public final MenuItem.OnMenuItemClickListener X;

        public OnMenuItemClickListenerWrapper(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.X = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.X.onMenuItemClick(MenuItemWrapperICS.this.c(menuItem));
        }
    }

    public MenuItemWrapperICS(Context context, SupportMenuItem supportMenuItem) {
        super(context);
        if (supportMenuItem == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.d = supportMenuItem;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.d.expandActionView();
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
        ActionProvider actionProviderA = this.d.a();
        if (actionProviderA instanceof ActionProviderWrapper) {
            return ((ActionProviderWrapper) actionProviderA).d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.d.getActionView();
        return actionView instanceof CollapsibleActionViewWrapper ? (View) ((CollapsibleActionViewWrapper) actionView).e0 : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.d.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.d.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.d.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.d.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.d.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return d(this.d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.d.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.d.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.d.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.d.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.d.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        ActionProviderWrapperJB actionProviderWrapperJB = new ActionProviderWrapperJB(this.f3467a, actionProvider);
        if (actionProvider == null) {
            actionProviderWrapperJB = null;
        }
        this.d.b(actionProviderWrapperJB);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof android.view.CollapsibleActionView) {
            view = new CollapsibleActionViewWrapper(view);
        }
        this.d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        this.d.setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.d.setCheckable(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.d.setChecked(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.d.setEnabled(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        this.d.setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.d.setOnActionExpandListener(onActionExpandListener != null ? new OnActionExpandListenerWrapper(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new OnMenuItemClickListenerWrapper(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.d.setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        this.d.setShowAsAction(i2);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        this.d.setShowAsActionFlags(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        return this.d.setVisible(z2);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.d.setAlphabeticShortcut(c2, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.d.setIcon(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        this.d.setNumericShortcut(c2, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.d.setShortcut(c2, c3, i2, i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        this.d.setTitle(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        SupportMenuItem supportMenuItem = this.d;
        supportMenuItem.setActionView(i2);
        View actionView = supportMenuItem.getActionView();
        if (actionView instanceof android.view.CollapsibleActionView) {
            supportMenuItem.setActionView(new CollapsibleActionViewWrapper(actionView));
        }
        return this;
    }
}
