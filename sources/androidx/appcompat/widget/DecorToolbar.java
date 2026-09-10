package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Window;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.view.ViewPropertyAnimatorCompat;

/* JADX INFO: loaded from: classes.dex */
public interface DecorToolbar {
    boolean a();

    void b(MenuBuilder menuBuilder, MenuPresenter.Callback callback);

    boolean c();

    void collapseActionView();

    boolean d();

    boolean e();

    void f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    void i(int i2);

    ViewPropertyAnimatorCompat j(int i2, long j);

    void k();

    void l(boolean z2);

    void m();

    void n();

    void o(int i2);

    int p();

    void q();

    void setIcon(int i2);

    void setIcon(Drawable drawable);

    void setVisibility(int i2);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
