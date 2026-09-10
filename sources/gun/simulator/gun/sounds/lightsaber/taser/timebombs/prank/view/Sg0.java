package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Sg0 {
    @DoNotInline
    public static Drawable a(Context context, Resources resources, @DrawableRes int i) {
        return resources.getDrawable(i, context.getTheme());
    }
}
