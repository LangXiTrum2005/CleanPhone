package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMenuPresenter implements MenuPresenter {
    public Context X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Context f3466Y;
    public MenuBuilder Z;
    public LayoutInflater e0;
    public MenuPresenter.Callback f0;
    public int g0;
    public int h0;
    public MenuView i0;

    public abstract void a(MenuItemImpl menuItemImpl, MenuView.ItemView itemView);

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void b(MenuBuilder menuBuilder, boolean z2) {
        MenuPresenter.Callback callback = this.f0;
        if (callback != null) {
            callback.b(menuBuilder, z2);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean d(MenuItemImpl menuItemImpl) {
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean e(SubMenuBuilder subMenuBuilder) {
        MenuPresenter.Callback callback = this.f0;
        MenuBuilder menuBuilder = subMenuBuilder;
        if (callback == null) {
            return false;
        }
        if (subMenuBuilder == null) {
            menuBuilder = this.Z;
        }
        return callback.c(menuBuilder);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean f(MenuItemImpl menuItemImpl) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void g(boolean z2) {
        ViewGroup viewGroup = (ViewGroup) this.i0;
        if (viewGroup == null) {
            return;
        }
        MenuBuilder menuBuilder = this.Z;
        int i2 = 0;
        if (menuBuilder != null) {
            menuBuilder.i();
            ArrayList arrayListL = this.Z.l();
            int size = arrayListL.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                MenuItemImpl menuItemImpl = (MenuItemImpl) arrayListL.get(i4);
                if (l(menuItemImpl)) {
                    View childAt = viewGroup.getChildAt(i3);
                    MenuItemImpl itemData = childAt instanceof MenuView.ItemView ? ((MenuView.ItemView) childAt).getItemData() : null;
                    View viewK = k(menuItemImpl, childAt, viewGroup);
                    if (menuItemImpl != itemData) {
                        viewK.setPressed(false);
                        viewK.jumpDrawablesToCurrentState();
                    }
                    if (viewK != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) viewK.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewK);
                        }
                        ((ViewGroup) this.i0).addView(viewK, i3);
                    }
                    i3++;
                }
            }
            i2 = i3;
        }
        while (i2 < viewGroup.getChildCount()) {
            if (!j(viewGroup, i2)) {
                i2++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void i(Context context, MenuBuilder menuBuilder) {
        this.f3466Y = context;
        LayoutInflater.from(context);
        this.Z = menuBuilder;
    }

    public boolean j(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View k(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        MenuView.ItemView itemView = view instanceof MenuView.ItemView ? (MenuView.ItemView) view : (MenuView.ItemView) this.e0.inflate(this.h0, viewGroup, false);
        a(menuItemImpl, itemView);
        return (View) itemView;
    }

    public boolean l(MenuItemImpl menuItemImpl) {
        return true;
    }
}
