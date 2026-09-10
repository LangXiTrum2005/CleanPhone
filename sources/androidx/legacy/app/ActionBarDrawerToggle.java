package androidx.legacy.app;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {

    @Deprecated
    public interface Delegate {
    }

    @Deprecated
    public interface DelegateProvider {
    }

    public static class SetIndicatorInfo {
    }

    public class SlideDrawable extends InsetDrawable implements Drawable.Callback {
        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            copyBounds(null);
            canvas.save();
            throw null;
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public final void a() {
        throw null;
    }
}
