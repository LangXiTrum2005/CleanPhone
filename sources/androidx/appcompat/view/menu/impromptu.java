package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: MenuItemWrapperICS.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu extends androidx.appcompat.view.menu.dern implements MenuItem {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public Method f4916marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final julian.saneness f4917wireman;

    /* JADX INFO: compiled from: MenuItemWrapperICS.java */
    public class attabal extends androidx.core.view.saneness implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final ActionProvider f4919marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public androidx.core.view.saneness.InterfaceC0061saneness f4920wireman;

        public attabal(Context context, ActionProvider actionProvider) {
            super(context);
            this.f4919marial = actionProvider;
        }

        @Override // androidx.core.view.saneness
        public boolean attabal() {
            return this.f4919marial.hasSubMenu();
        }

        @Override // androidx.core.view.saneness
        public void beachfront(SubMenu subMenu) {
            this.f4919marial.onPrepareSubMenu(impromptu.this.wireman(subMenu));
        }

        @Override // androidx.core.view.saneness
        public boolean competently() {
            return this.f4919marial.overridesItemVisibility();
        }

        @Override // androidx.core.view.saneness
        public void cutely(androidx.core.view.saneness.InterfaceC0061saneness interfaceC0061saneness) {
            this.f4920wireman = interfaceC0061saneness;
            this.f4919marial.setVisibilityListener(interfaceC0061saneness != null ? this : null);
        }

        @Override // androidx.core.view.saneness
        public View dern() {
            return this.f4919marial.onCreateActionView();
        }

        @Override // androidx.core.view.saneness
        public boolean marial() {
            return this.f4919marial.onPerformDefaultAction();
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            androidx.core.view.saneness.InterfaceC0061saneness interfaceC0061saneness = this.f4920wireman;
            if (interfaceC0061saneness != null) {
                interfaceC0061saneness.onActionProviderVisibilityChanged(z);
            }
        }

        @Override // androidx.core.view.saneness
        public boolean saneness() {
            return this.f4919marial.isVisible();
        }

        @Override // androidx.core.view.saneness
        public View wireman(MenuItem menuItem) {
            return this.f4919marial.onCreateActionView(menuItem);
        }
    }

    /* JADX INFO: compiled from: MenuItemWrapperICS.java */
    public class dern implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f4921attabal;

        public dern(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f4921attabal = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f4921attabal.onMenuItemActionCollapse(impromptu.this.dern(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f4921attabal.onMenuItemActionExpand(impromptu.this.dern(menuItem));
        }
    }

    /* JADX INFO: compiled from: MenuItemWrapperICS.java */
    public static class saneness extends FrameLayout implements apical.dern {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final CollapsibleActionView f4923kowloon;

        /* JADX WARN: Multi-variable type inference failed */
        public saneness(View view) {
            super(view.getContext());
            this.f4923kowloon = (CollapsibleActionView) view;
            addView(view);
        }

        public View attabal() {
            return (View) this.f4923kowloon;
        }

        @Override // apical.dern
        public void onActionViewCollapsed() {
            this.f4923kowloon.onActionViewCollapsed();
        }

        @Override // apical.dern
        public void onActionViewExpanded() {
            this.f4923kowloon.onActionViewExpanded();
        }
    }

    /* JADX INFO: compiled from: MenuItemWrapperICS.java */
    public class wireman implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f4924attabal;

        public wireman(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f4924attabal = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f4924attabal.onMenuItemClick(impromptu.this.dern(menuItem));
        }
    }

    public impromptu(Context context, julian.saneness sanenessVar) {
        super(context);
        if (sanenessVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f4917wireman = sanenessVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f4917wireman.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f4917wireman.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        androidx.core.view.saneness sanenessVarAttabal = this.f4917wireman.attabal();
        if (sanenessVarAttabal instanceof attabal) {
            return ((attabal) sanenessVarAttabal).f4919marial;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f4917wireman.getActionView();
        return actionView instanceof saneness ? ((saneness) actionView).attabal() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f4917wireman.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f4917wireman.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f4917wireman.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f4917wireman.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f4917wireman.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f4917wireman.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f4917wireman.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f4917wireman.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f4917wireman.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f4917wireman.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f4917wireman.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f4917wireman.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f4917wireman.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return wireman(this.f4917wireman.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f4917wireman.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f4917wireman.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f4917wireman.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f4917wireman.hasSubMenu();
    }

    public void impromptu(boolean z) {
        try {
            if (this.f4916marial == null) {
                this.f4916marial = this.f4917wireman.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f4916marial.invoke(this.f4917wireman, Boolean.valueOf(z));
        } catch (Exception unused) {
        }
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f4917wireman.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f4917wireman.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f4917wireman.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f4917wireman.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f4917wireman.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        attabal attabalVar = new attabal(this.f4912attabal, actionProvider);
        julian.saneness sanenessVar = this.f4917wireman;
        if (actionProvider == null) {
            attabalVar = null;
        }
        sanenessVar.saneness(attabalVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new saneness(view);
        }
        this.f4917wireman.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f4917wireman.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f4917wireman.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f4917wireman.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f4917wireman.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f4917wireman.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f4917wireman.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4917wireman.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4917wireman.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f4917wireman.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f4917wireman.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f4917wireman.setOnActionExpandListener(onActionExpandListener != null ? new dern(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4917wireman.setOnMenuItemClickListener(onMenuItemClickListener != null ? new wireman(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f4917wireman.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.f4917wireman.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.f4917wireman.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f4917wireman.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4917wireman.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f4917wireman.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f4917wireman.setVisible(z);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f4917wireman.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f4917wireman.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f4917wireman.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f4917wireman.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f4917wireman.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f4917wireman.setActionView(i);
        View actionView = this.f4917wireman.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f4917wireman.setActionView(new saneness(actionView));
        }
        return this;
    }
}
