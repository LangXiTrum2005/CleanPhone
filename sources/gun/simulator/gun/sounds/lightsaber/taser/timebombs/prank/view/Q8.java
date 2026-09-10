package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.badlogic.gdx.backends.android.SpineActivity;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class Q8 implements InterfaceC3680iB {
    public static volatile Q8 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3680iB f3591a = C3044b1.b.f4152a.f();

    public static Q8 a() {
        if (b == null) {
            synchronized (Q8.class) {
                try {
                    if (b == null) {
                        b = new Q8();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FB
    public final void b(ConstraintLayout constraintLayout) {
        InterfaceC3680iB interfaceC3680iB = this.f3591a;
        if (interfaceC3680iB != null) {
            interfaceC3680iB.b(constraintLayout);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FB
    public final void c(ConstraintLayout constraintLayout) {
        InterfaceC3680iB interfaceC3680iB = this.f3591a;
        if (interfaceC3680iB != null) {
            interfaceC3680iB.c(constraintLayout);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3680iB
    public final void d(SpineActivity spineActivity, ConstraintLayout constraintLayout, C3491g4 c3491g4, String str, M10 m10) {
        InterfaceC3680iB interfaceC3680iB = this.f3591a;
        if (interfaceC3680iB != null) {
            interfaceC3680iB.d(spineActivity, constraintLayout, c3491g4, str, m10);
            return;
        }
        byte[] bArr = {91, 63, -114, -65, -40, 44, -122, -79, 119, 18, -127, -65, -40, 35, -124, -90, 68, 86, -91, -83, -106, 44, -106, -81, 90};
        byte[] bArr2 = {54, 118, -52, -34, -74, 66, -29, -61};
        int i = 0;
        int i2 = 0;
        while (i < 25) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FB
    public final void j(ViewGroup viewGroup) {
        InterfaceC3680iB interfaceC3680iB = this.f3591a;
        if (interfaceC3680iB != null) {
            interfaceC3680iB.j(viewGroup);
        }
    }
}
