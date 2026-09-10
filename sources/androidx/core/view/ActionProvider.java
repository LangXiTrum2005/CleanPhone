package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ShareActionProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActionProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SubUiVisibilityListener f4421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VisibilityListener f4422c;

    public interface SubUiVisibilityListener {
    }

    public interface VisibilityListener {
    }

    public ActionProvider(Context context) {
        this.f4420a = context;
    }

    public boolean a() {
        return this instanceof ShareActionProvider;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItemImpl menuItemImpl) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public void h(VisibilityListener visibilityListener) {
        if (this.f4422c != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f4422c = visibilityListener;
    }

    public void f(SubMenuBuilder subMenuBuilder) {
    }
}
