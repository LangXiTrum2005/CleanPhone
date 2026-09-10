package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class R3 implements InterfaceC4177nt {
    public static final int[] p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final int t;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public boolean g;
    public long h;
    public int j;
    public long k;
    public InterfaceC4353pt l;
    public InterfaceC4326pd0 m;
    public O30 n;
    public boolean o;
    public final int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3642a = new byte[1];
    public int i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        q = iArr;
        int i = Ug0.f3833a;
        Charset charset = AbstractC2333Ce.c;
        r = "#!AMR\n".getBytes(charset);
        s = "#!AMR-WB\n".getBytes(charset);
        t = iArr[8];
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final int a(InterfaceC4265ot interfaceC4265ot, C2868Wu c2868Wu) throws KT {
        int i;
        int i2;
        int iC;
        int i3;
        FW.t(this.m);
        int i4 = Ug0.f3833a;
        if (interfaceC4265ot.getPosition() == 0 && !e(interfaceC4265ot)) {
            throw KT.a("Could not find AMR header.", null);
        }
        if (!this.o) {
            this.o = true;
            boolean z = this.c;
            String str = z ? MimeTypes.AUDIO_AMR_WB : MimeTypes.AUDIO_AMR_NB;
            int i5 = z ? 16000 : 8000;
            InterfaceC4326pd0 interfaceC4326pd0 = this.m;
            C4531rw c4531rw = new C4531rw();
            c4531rw.k = str;
            c4531rw.l = t;
            c4531rw.x = 1;
            c4531rw.y = i5;
            interfaceC4326pd0.e(new C4619sw(c4531rw));
        }
        if (this.f == 0) {
            try {
                int iC2 = c(interfaceC4265ot);
                this.e = iC2;
                this.f = iC2;
                if (this.i == -1) {
                    this.h = interfaceC4265ot.getPosition();
                    this.i = this.e;
                }
                if (this.i == this.e) {
                    this.j++;
                }
                iC = this.m.c(interfaceC4265ot, this.f, true);
                if (iC == -1) {
                    i = -1;
                } else {
                    i3 = this.f - iC;
                    this.f = i3;
                    if (i3 <= 0) {
                        this.m.a(this.k + this.d, 1, this.e, 0, null);
                        this.d += 20000;
                    }
                    i = 0;
                }
            } catch (EOFException unused) {
            }
        } else {
            iC = this.m.c(interfaceC4265ot, this.f, true);
            if (iC == -1) {
                i = -1;
            } else {
                i3 = this.f - iC;
                this.f = i3;
                if (i3 <= 0) {
                    this.m.a(this.k + this.d, 1, this.e, 0, null);
                    this.d += 20000;
                }
                i = 0;
            }
        }
        long length = interfaceC4265ot.getLength();
        if (!this.g) {
            int i6 = this.b;
            if ((i6 & 1) == 0 || length == -1 || !((i2 = this.i) == -1 || i2 == this.e)) {
                C2946Zu c2946Zu = new C2946Zu(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                this.n = c2946Zu;
                this.l.a(c2946Zu);
                this.g = true;
            } else if (this.j >= 20 || i == -1) {
                C2338Cj c2338Cj = new C2338Cj(length, this.h, (int) ((((long) i2) * 8000000) / 20000), i2, (i6 & 2) != 0);
                this.n = c2338Cj;
                this.l.a(c2338Cj);
                this.g = true;
            }
        }
        return i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final boolean b(InterfaceC4265ot interfaceC4265ot) {
        return e(interfaceC4265ot);
    }

    public final int c(InterfaceC4265ot interfaceC4265ot) throws KT {
        boolean z;
        interfaceC4265ot.resetPeekPosition();
        byte[] bArr = this.f3642a;
        interfaceC4265ot.peekFully(bArr, 0, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw KT.a("Invalid padding bits for frame header " + ((int) b), null);
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? q[i] : p[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw KT.a(sb.toString(), null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void d(InterfaceC4353pt interfaceC4353pt) {
        this.l = interfaceC4353pt;
        this.m = interfaceC4353pt.track(0, 1);
        interfaceC4353pt.endTracks();
    }

    public final boolean e(InterfaceC4265ot interfaceC4265ot) {
        interfaceC4265ot.resetPeekPosition();
        byte[] bArr = r;
        byte[] bArr2 = new byte[bArr.length];
        interfaceC4265ot.peekFully(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            interfaceC4265ot.skipFully(bArr.length);
            return true;
        }
        interfaceC4265ot.resetPeekPosition();
        byte[] bArr3 = s;
        byte[] bArr4 = new byte[bArr3.length];
        interfaceC4265ot.peekFully(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        interfaceC4265ot.skipFully(bArr3.length);
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void seek(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        if (j != 0) {
            O30 o30 = this.n;
            if (o30 instanceof C2338Cj) {
                C2338Cj c2338Cj = (C2338Cj) o30;
                this.k = (Math.max(0L, j - c2338Cj.b) * 8000000) / ((long) c2338Cj.e);
                return;
            }
        }
        this.k = 0L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void release() {
    }
}
