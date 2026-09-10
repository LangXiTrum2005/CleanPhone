package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.DialogInterface;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ia0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC3706ia0 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4507a;
    public final /* synthetic */ Object b;

    public /* synthetic */ DialogInterfaceOnDismissListenerC3706ia0(Object obj, int i) {
        this.f4507a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.f4507a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((C2547Kk) obj).destroy();
                break;
            case 1:
                C3520gR.m244showGdpr$lambda9((C3520gR) obj, dialogInterface);
                break;
            default:
                ((C4068mg0) obj).f4706a.set(false);
                byte[] bArr = {10, -68, -128, 60, -11, -71, 119, 97, 30, -91, -90, 33, -8, -85, 112, 69, 56, -68, -106, 38, -53, -93, 112, 72, 42, -80, -107, 48, -23, -90, 112};
                byte[] bArr2 = {110, -43, -13, 81, -100, -54, 4, 32};
                int i2 = 0;
                int i3 = 0;
                while (i2 < 31) {
                    if (i3 >= 8) {
                        i3 = 0;
                    }
                    bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
                    i2++;
                    i3++;
                }
                new String(bArr, StandardCharsets.UTF_8);
                break;
        }
    }
}
