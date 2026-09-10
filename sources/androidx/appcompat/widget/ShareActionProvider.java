package androidx.appcompat.widget;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.ActionProvider;

/* JADX INFO: loaded from: classes.dex */
public class ShareActionProvider extends ActionProvider {

    public interface OnShareTargetSelectedListener {
    }

    public class ShareActivityChooserModelPolicy implements ActivityChooserModel.OnChooseActivityListener {
    }

    public class ShareMenuItemOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {
        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            throw null;
        }
    }

    @Override // androidx.core.view.ActionProvider
    public final View c() {
        new ActivityChooserView();
        throw null;
    }

    @Override // androidx.core.view.ActionProvider
    public final void f(SubMenuBuilder subMenuBuilder) {
        subMenuBuilder.clear();
        ActivityChooserModel.b();
        throw null;
    }
}
