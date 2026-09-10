package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.m90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4028m90 extends LayerDrawable {
    public final C4412qc0 a(int i) {
        Drawable drawableFindDrawableByLayerId = findDrawableByLayerId(i);
        if (i == 16908288) {
            return (C4412qc0) drawableFindDrawableByLayerId;
        }
        if (i == 16908301 || i == 16908303) {
            ClipDrawable clipDrawable = (ClipDrawable) drawableFindDrawableByLayerId;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                return (C4412qc0) clipDrawable.getDrawable();
            }
            try {
                Field declaredField = clipDrawable.getClass().getDeclaredField(i2 >= 22 ? "mState" : "mClipState");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(clipDrawable);
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawable");
                declaredField2.setAccessible(true);
                return (C4412qc0) declaredField2.get(obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        throw new RuntimeException();
    }
}
