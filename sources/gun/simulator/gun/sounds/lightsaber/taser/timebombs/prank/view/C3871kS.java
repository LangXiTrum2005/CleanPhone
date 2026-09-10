package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.EOFException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3871kS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3959lS f4598a = new C3959lS();
    public final JT b = new JT(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            C3959lS c3959lS = this.f4598a;
            if (i5 >= c3959lS.c) {
                break;
            }
            int[] iArr = c3959lS.f;
            this.d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean b(InterfaceC4265ot interfaceC4265ot) {
        int i;
        boolean z = this.e;
        JT jt = this.b;
        if (z) {
            this.e = false;
            jt.B(0);
        }
        while (true) {
            if (this.e) {
                return true;
            }
            int i2 = this.c;
            C3959lS c3959lS = this.f4598a;
            if (i2 < 0) {
                if (c3959lS.b(interfaceC4265ot, -1L) && c3959lS.a(interfaceC4265ot, true)) {
                    int iA = c3959lS.d;
                    if ((c3959lS.f4646a & 1) == 1 && jt.c == 0) {
                        iA += a(0);
                        i = this.d;
                    } else {
                        i = 0;
                    }
                    try {
                        interfaceC4265ot.skipFully(iA);
                        this.c = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.c);
            int i3 = this.c + this.d;
            if (iA2 > 0) {
                jt.b(jt.c + iA2);
                try {
                    interfaceC4265ot.readFully(jt.f3266a, jt.c, iA2);
                    jt.D(jt.c + iA2);
                    this.e = c3959lS.f[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == c3959lS.c) {
                i3 = -1;
            }
            this.c = i3;
        }
    }
}
