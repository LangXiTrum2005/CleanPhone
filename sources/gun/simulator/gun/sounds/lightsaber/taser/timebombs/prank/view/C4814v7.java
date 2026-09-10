package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.v7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4814v7 extends AbstractC3413f9 {
    public static final int[] f = {5512, 11025, 22050, 44100};
    public boolean c;
    public boolean d;
    public int e;

    public final boolean i(JT jt) throws Ua0 {
        if (this.c) {
            jt.F(1);
        } else {
            int iT = jt.t();
            int i = (iT >> 4) & 15;
            this.e = i;
            Object obj = this.b;
            if (i == 2) {
                int i2 = f[(iT >> 2) & 3];
                C4531rw c4531rw = new C4531rw();
                c4531rw.k = MimeTypes.AUDIO_MPEG;
                c4531rw.x = 1;
                c4531rw.y = i2;
                ((InterfaceC4326pd0) obj).e(c4531rw.a());
                this.d = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW;
                C4531rw c4531rw2 = new C4531rw();
                c4531rw2.k = str;
                c4531rw2.x = 1;
                c4531rw2.y = 8000;
                ((InterfaceC4326pd0) obj).e(c4531rw2.a());
                this.d = true;
            } else if (i != 10) {
                throw new Ua0("Audio format not supported: " + this.e, 0);
            }
            this.c = true;
        }
        return true;
    }

    public final boolean j(long j, JT jt) throws KT {
        int i = this.e;
        Object obj = this.b;
        if (i == 2) {
            int iA = jt.a();
            InterfaceC4326pd0 interfaceC4326pd0 = (InterfaceC4326pd0) obj;
            interfaceC4326pd0.d(iA, jt);
            interfaceC4326pd0.a(j, 1, iA, 0, null);
            return true;
        }
        int iT = jt.t();
        if (iT != 0 || this.d) {
            if (this.e == 10 && iT != 1) {
                return false;
            }
            int iA2 = jt.a();
            InterfaceC4326pd0 interfaceC4326pd1 = (InterfaceC4326pd0) obj;
            interfaceC4326pd1.d(iA2, jt);
            interfaceC4326pd1.a(j, 1, iA2, 0, null);
            return true;
        }
        int iA3 = jt.a();
        byte[] bArr = new byte[iA3];
        jt.d(bArr, 0, iA3);
        C3129c c3129cA0 = AbstractC2845Vx.a0(new Uh0(bArr, 2, (Object) null), false);
        C4531rw c4531rw = new C4531rw();
        c4531rw.k = MimeTypes.AUDIO_AAC;
        c4531rw.h = c3129cA0.f4197a;
        c4531rw.x = c3129cA0.c;
        c4531rw.y = c3129cA0.b;
        c4531rw.m = Collections.singletonList(bArr);
        ((InterfaceC4326pd0) obj).e(new C4619sw(c4531rw));
        this.d = true;
        return false;
    }
}
