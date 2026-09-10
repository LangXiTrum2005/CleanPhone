package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ZB implements InterfaceC4429ql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4429ql f4059a;
    public final int b;
    public final C3172cW c;
    public final byte[] d;
    public int e;

    public ZB(B90 b90, int i, C3172cW c3172cW) {
        FW.h(i > 0);
        this.f4059a = b90;
        this.b = i;
        this.c = c3172cW;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final void c(Bd0 bd0) {
        bd0.getClass();
        this.f4059a.c(bd0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final long d(C4868vl c4868vl) {
        throw new UnsupportedOperationException();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final Map getResponseHeaders() {
        return this.f4059a.getResponseHeaders();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final Uri getUri() {
        return this.f4059a.getUri();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3813jl
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        InterfaceC4429ql interfaceC4429ql = this.f4059a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (interfaceC4429ql.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int i7 = interfaceC4429ql.read(bArr3, i4, i6);
                        if (i7 != -1) {
                            i4 += i7;
                            i6 -= i7;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        JT jt = new JT(bArr3, i5);
                        C3172cW c3172cW = this.c;
                        long jMax = !c3172cW.l ? c3172cW.i : Math.max(c3172cW.m.i(true), c3172cW.i);
                        int iA = jt.a();
                        V20 v20 = c3172cW.k;
                        v20.getClass();
                        v20.d(iA, jt);
                        v20.a(jMax, 1, iA, 0, null);
                        c3172cW.l = true;
                    }
                }
                this.e = this.b;
            }
            return -1;
        }
        int i8 = interfaceC4429ql.read(bArr, i, Math.min(this.e, i2));
        if (i8 != -1) {
            this.e -= i8;
        }
        return i8;
    }
}
