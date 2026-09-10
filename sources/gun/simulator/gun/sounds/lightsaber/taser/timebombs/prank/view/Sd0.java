package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Base64;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Sd0 {
    public static C4201o8 a() {
        C4201o8 c4201o8 = new C4201o8();
        c4201o8.c(HV.f3174a);
        return c4201o8;
    }

    public final String toString() {
        C4289p8 c4289p8 = (C4289p8) this;
        byte[] bArr = c4289p8.b;
        return "TransportContext(" + c4289p8.f4824a + ", " + c4289p8.c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
