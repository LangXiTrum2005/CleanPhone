package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4260oo0 {
    public static final C4260oo0 b = new C4260oo0();
    public static final C4260oo0 c = new C4260oo0();
    public static final C4260oo0 d = new C4260oo0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f4809a;

    public C4412qc0 a(int i, int i2, boolean z) {
        int color;
        if (z) {
            color = -1;
        } else {
            TypedArray typedArrayObtainStyledAttributes = this.f4809a.obtainStyledAttributes(new int[]{i2});
            try {
                color = typedArrayObtainStyledAttributes.getColor(0, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        return b(i, color);
    }

    public C4412qc0 b(int i, int i2) {
        Drawable drawable = AppCompatResources.getDrawable(this.f4809a, i);
        C4412qc0 c4412qc0 = new C4412qc0();
        c4412qc0.f4890a = 255;
        c4412qc0.d = PorterDuff.Mode.SRC_IN;
        c4412qc0.f = new C3939l9(c4412qc0);
        c4412qc0.h = -1;
        c4412qc0.g = drawable;
        c4412qc0.mutate();
        if (i2 != -1) {
            c4412qc0.setTint(i2);
        }
        return c4412qc0;
    }
}
