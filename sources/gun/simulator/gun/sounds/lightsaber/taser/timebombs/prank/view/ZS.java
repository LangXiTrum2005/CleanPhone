package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ZS extends K90 {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(JT jt, byte[] bArr) {
        if (jt.a() < bArr.length) {
            return false;
        }
        int i = jt.b;
        byte[] bArr2 = new byte[bArr.length];
        jt.d(bArr2, 0, bArr.length);
        jt.E(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K90
    public final long b(JT jt) {
        byte[] bArr = jt.f3266a;
        return (((long) this.i) * AbstractC2340Cl.A(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K90
    public final boolean c(JT jt, long j, C3491g4 c3491g4) {
        if (e(jt, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(jt.f3266a, jt.c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListL = AbstractC2340Cl.l(bArrCopyOf);
            if (((C4619sw) c3491g4.b) != null) {
                return true;
            }
            C4531rw c4531rw = new C4531rw();
            c4531rw.k = MimeTypes.AUDIO_OPUS;
            c4531rw.x = i;
            c4531rw.y = 48000;
            c4531rw.m = arrayListL;
            c3491g4.b = new C4619sw(c4531rw);
            return true;
        }
        if (!e(jt, p)) {
            FW.t((C4619sw) c3491g4.b);
            return false;
        }
        FW.t((C4619sw) c3491g4.b);
        if (this.n) {
            return true;
        }
        this.n = true;
        jt.F(8);
        Metadata metadataB = Zh0.b(AC.k((String[]) Zh0.c(jt, false, false).d));
        if (metadataB == null) {
            return true;
        }
        C4531rw c4531rwA = ((C4619sw) c3491g4.b).a();
        c4531rwA.i = metadataB.c(((C4619sw) c3491g4.b).j);
        c3491g4.b = new C4619sw(c4531rwA);
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K90
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
