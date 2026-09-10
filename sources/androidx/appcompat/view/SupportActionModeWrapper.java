package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class SupportActionModeWrapper extends android.view.ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionMode f3426b;

    public static class CallbackWrapper implements ActionMode.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.ActionMode.Callback f3427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f3428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f3429c = new ArrayList();
        public final SimpleArrayMap d = new SimpleArrayMap(0);

        public CallbackWrapper(Context context, android.view.ActionMode.Callback callback) {
            this.f3428b = context;
            this.f3427a = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final void a(ActionMode actionMode) {
            this.f3427a.onDestroyActionMode(e(actionMode));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean b(ActionMode actionMode, MenuBuilder menuBuilder) {
            SupportActionModeWrapper supportActionModeWrapperE = e(actionMode);
            SimpleArrayMap simpleArrayMap = this.d;
            Menu menuWrapperICS = (Menu) simpleArrayMap.get(menuBuilder);
            if (menuWrapperICS == null) {
                menuWrapperICS = new MenuWrapperICS(this.f3428b, menuBuilder);
                simpleArrayMap.put(menuBuilder, menuWrapperICS);
            }
            return this.f3427a.onCreateActionMode(supportActionModeWrapperE, menuWrapperICS);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean c(ActionMode actionMode, MenuItem menuItem) {
            return this.f3427a.onActionItemClicked(e(actionMode), new MenuItemWrapperICS(this.f3428b, (SupportMenuItem) menuItem));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean d(ActionMode actionMode, MenuBuilder menuBuilder) {
            SupportActionModeWrapper supportActionModeWrapperE = e(actionMode);
            SimpleArrayMap simpleArrayMap = this.d;
            Menu menuWrapperICS = (Menu) simpleArrayMap.get(menuBuilder);
            if (menuWrapperICS == null) {
                menuWrapperICS = new MenuWrapperICS(this.f3428b, menuBuilder);
                simpleArrayMap.put(menuBuilder, menuWrapperICS);
            }
            return this.f3427a.onPrepareActionMode(supportActionModeWrapperE, menuWrapperICS);
        }

        public final SupportActionModeWrapper e(ActionMode actionMode) {
            ArrayList arrayList = this.f3429c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                SupportActionModeWrapper supportActionModeWrapper = (SupportActionModeWrapper) arrayList.get(i2);
                if (supportActionModeWrapper != null && supportActionModeWrapper.f3426b == actionMode) {
                    return supportActionModeWrapper;
                }
            }
            SupportActionModeWrapper supportActionModeWrapper2 = new SupportActionModeWrapper(this.f3428b, actionMode);
            arrayList.add(supportActionModeWrapper2);
            return supportActionModeWrapper2;
        }
    }

    public SupportActionModeWrapper(Context context, ActionMode actionMode) {
        this.f3425a = context;
        this.f3426b = actionMode;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f3426b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f3426b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuWrapperICS(this.f3425a, this.f3426b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f3426b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f3426b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f3426b.X;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f3426b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f3426b.f3420Y;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f3426b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f3426b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f3426b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f3426b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f3426b.X = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f3426b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f3426b.p(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i2) {
        this.f3426b.l(i2);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i2) {
        this.f3426b.n(i2);
    }
}
