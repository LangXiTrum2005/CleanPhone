package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.DialogInterface;
import android.view.Window;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnShowListenerC3577h3 implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4444a;
    public final /* synthetic */ Object b;

    public /* synthetic */ DialogInterfaceOnShowListenerC3577h3(Object obj, int i) {
        this.f4444a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        DialogC3665i3 dialogC3665i3;
        int i = this.f4444a;
        Object obj = this.b;
        switch (i) {
            case 0:
                C3927l3 c3927l3 = (C3927l3) ((C3751j3) obj).b;
                if (c3927l3.o != null && (dialogC3665i3 = c3927l3.v) != null && dialogC3665i3.isShowing()) {
                    C3751j3 c3751j3 = X0.j.r().p;
                    c3751j3.a();
                    break;
                }
                break;
            default:
                C4068mg0 c4068mg0 = (C4068mg0) obj;
                c4068mg0.f4706a.set(true);
                byte[] bArr = {-98, -5, -66, 103, 70, -8, 93, 25, -99, -9, -80, 100, 98, -34, 68, 41, -102, -60, -72, 100, 111, -52, 72, 42, -116, -26, -67, 100};
                byte[] bArr2 = {-19, -109, -47, com.umeng.analytics.pro.cw.n, 7, -120, 45, 76};
                int i2 = 0;
                int i3 = 0;
                while (i2 < 28) {
                    if (i3 >= 8) {
                        i3 = 0;
                    }
                    bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
                    i2++;
                    i3++;
                }
                new String(bArr, StandardCharsets.UTF_8);
                Window window = c4068mg0.e.getWindow();
                if (window != null) {
                    window.getDecorView().setSystemUiVisibility(2054);
                }
                break;
        }
    }
}
