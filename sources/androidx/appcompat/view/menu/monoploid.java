package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: SubMenuWrapperICS.java */
/* JADX INFO: loaded from: classes.dex */
public class monoploid extends impassible implements SubMenu {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final julian.dern f4976marial;

    public monoploid(Context context, julian.dern dernVar) {
        super(context, dernVar);
        this.f4976marial = dernVar;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f4976marial.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return dern(this.f4976marial.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        this.f4976marial.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        this.f4976marial.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f4976marial.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f4976marial.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f4976marial.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f4976marial.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f4976marial.setIcon(drawable);
        return this;
    }
}
