package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.id, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3711id {
    public static final P70 c = new P70(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2417Fk f4511a;
    public final int b;

    public C3711id(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        boolean z2;
        int i5;
        if (z) {
            i5 = i3;
            z2 = true;
        } else {
            z2 = false;
            i5 = ViewCompat.MEASURED_STATE_MASK;
        }
        this.f4511a = new C2417Fk(spannableStringBuilder, alignment, null, null, f, 0, i, f2, i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z2, i5, Integer.MIN_VALUE, 0.0f);
        this.b = i4;
    }
}
