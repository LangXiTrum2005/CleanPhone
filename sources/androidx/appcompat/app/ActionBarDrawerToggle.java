package androidx.appcompat.app;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {

    /* JADX INFO: renamed from: androidx.appcompat.app.ActionBarDrawerToggle$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            throw null;
        }
    }

    public interface Delegate {
    }

    public interface DelegateProvider {
    }

    public static class FrameworkActionBarDelegate implements Delegate {

        public static class Api18Impl {
            public static void a(android.app.ActionBar actionBar, int i2) {
                actionBar.setHomeActionContentDescription(i2);
            }

            public static void b(android.app.ActionBar actionBar, Drawable drawable) {
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }
    }

    public static class ToolbarCompatDelegate implements Delegate {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public final void a() {
        throw null;
    }
}
