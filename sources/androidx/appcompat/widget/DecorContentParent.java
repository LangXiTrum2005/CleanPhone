package androidx.appcompat.widget;

import android.view.Window;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;

/* JADX INFO: loaded from: classes.dex */
public interface DecorContentParent {
    boolean a();

    void b(MenuBuilder menuBuilder, MenuPresenter.Callback callback);

    boolean c();

    boolean d();

    boolean e();

    void f();

    boolean g();

    void h(int i2);

    void l();

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
