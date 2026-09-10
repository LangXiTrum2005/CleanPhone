package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class Jh0 extends AbstractC3413f9 {
    public final JT c;
    public final JT d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;

    public Jh0(InterfaceC4326pd0 interfaceC4326pd0) {
        super(interfaceC4326pd0, 4);
        this.c = new JT(AbstractC5188zQ.f5325a);
        this.d = new JT(4);
    }

    public final boolean i(JT jt) throws Ua0 {
        int iT = jt.t();
        int i = (iT >> 4) & 15;
        int i2 = iT & 15;
        if (i2 != 7) {
            throw new Ua0(AbstractC3950lJ.p("Video format not supported: ", i2), 0);
        }
        this.h = i;
        return i != 5;
    }

    public final boolean j(long j, JT jt) throws KT {
        int iT = jt.t();
        byte[] bArr = jt.f3266a;
        int i = jt.b;
        int i2 = ((bArr[i + 1] & 255) << 8) | (((bArr[i] & 255) << 24) >> 8);
        jt.b = i + 3;
        long j2 = (((long) ((bArr[i + 2] & 255) | i2)) * 1000) + j;
        Object obj = this.b;
        if (iT == 0 && !this.f) {
            byte[] bArr2 = new byte[jt.a()];
            JT jt2 = new JT(bArr2);
            jt.d(bArr2, 0, jt.a());
            C4464r8 c4464r8A = C4464r8.a(jt2);
            this.e = c4464r8A.b;
            C4531rw c4531rw = new C4531rw();
            c4531rw.k = "video/avc";
            c4531rw.h = c4464r8A.f;
            c4531rw.p = c4464r8A.c;
            c4531rw.q = c4464r8A.d;
            c4531rw.t = c4464r8A.e;
            c4531rw.m = c4464r8A.f4918a;
            ((InterfaceC4326pd0) obj).e(new C4619sw(c4531rw));
            this.f = true;
            return false;
        }
        if (iT != 1 || !this.f) {
            return false;
        }
        int i3 = this.h == 1 ? 1 : 0;
        if (!this.g && i3 == 0) {
            return false;
        }
        JT jt3 = this.d;
        byte[] bArr3 = jt3.f3266a;
        bArr3[0] = 0;
        bArr3[1] = 0;
        bArr3[2] = 0;
        int i4 = 4 - this.e;
        int i5 = 0;
        while (jt.a() > 0) {
            jt.d(jt3.f3266a, i4, this.e);
            jt3.E(0);
            int iW = jt3.w();
            JT jt4 = this.c;
            jt4.E(0);
            InterfaceC4326pd0 interfaceC4326pd0 = (InterfaceC4326pd0) obj;
            interfaceC4326pd0.d(4, jt4);
            interfaceC4326pd0.d(iW, jt);
            i5 = i5 + 4 + iW;
        }
        ((InterfaceC4326pd0) obj).a(j2, i3, i5, 0, null);
        this.g = true;
        return true;
    }
}
