package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import androidx.work.WorkRequest;
import com.google.android.gms.ads.AdActivity;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Cm0 implements InterfaceC3854kB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2940a = AbstractC4969wu.b;
    public long b = 6000;
    public C2346Cr c = null;
    public LD d = null;
    public UZ e = null;
    public UZ f = null;
    public H5 g = null;
    public L8 h = null;
    public C3872kT i = null;
    public QQ j = null;
    public boolean k = false;
    public boolean l = false;
    public int m = -1;
    public final int n = 1000;
    public final String o = AbstractC4969wu.f5203a;
    public final String p = AbstractC4969wu.e;
    public float q = 1.0f;
    public final String r = AbstractC4969wu.c;
    public final String s = AbstractC4969wu.d;
    public C2443Gk t = null;
    public final boolean u = true;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB a() {
        this.l = false;
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB b(C2346Cr c2346Cr) {
        this.c = c2346Cr;
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3416fB build() {
        if (this.d == null) {
            this.d = new LD();
        }
        if (this.c == null) {
            C2346Cr c2346Cr = new C2346Cr();
            c2346Cr.h = null;
            c2346Cr.i = 1;
            c2346Cr.g = 3000000L;
            this.c = c2346Cr;
        }
        if (this.g == null) {
            H5 h5 = new H5();
            this.g = h5;
            Class[] clsArr = {AdActivity.class};
            ArrayList arrayList = h5.c;
            arrayList.removeAll(Arrays.asList(clsArr));
            arrayList.addAll(Arrays.asList(clsArr));
        }
        if (this.e == null) {
            this.e = new UZ(0);
        }
        if (this.f == null) {
            this.f = new UZ(1);
        }
        if (this.h == null) {
            this.h = new L8();
        }
        if (this.j == null) {
            this.j = new QQ();
        }
        if (this.i == null) {
            C3872kT c3872kT = new C3872kT();
            byte[] bArr = {91, 83, 18, -64, 81, -105, 112, 116, 78, 111, 41, -49, 68, -126};
            byte[] bArr2 = {43, 48, 77, -82, 48, -29, 25, 2};
            int i = 0;
            int i2 = 0;
            while (i < 14) {
                if (i2 >= 8) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            c3872kT.c = Qm0.D(new byte[]{-116, 71, 43, -11, -49, 126, 63, -44, -103, 123, com.umeng.analytics.pro.cw.n, -6, -38, 107}, new byte[]{-4, 36, 116, -101, -82, 10, 86, -94});
            c3872kT.d = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
            c3872kT.e = Qm0.D(new byte[]{-91, -39, -74, -112, -64}, new byte[]{-54, -85, -46, -11, -78, -114, 63, 103});
            c3872kT.f = Qm0.D(new byte[]{-50, 86, -28, -74, 116, -88, -93, -80, -56, 90, -6, -69}, new byte[]{-70, 63, -119, -45, 43, -38, -58, -42});
            c3872kT.g = Qm0.D(new byte[]{76, 35, -68, -20, 115, -25}, new byte[]{62, 66, -46, -120, 28, -118, -122, 7});
            c3872kT.h = true;
            c3872kT.i = -1;
            c3872kT.j = -1;
            this.i = c3872kT;
        }
        if (this.m < 0) {
            byte[] bArr3 = {-110, -35, -66, 20, 97, com.umeng.analytics.pro.cw.l, 95, 112, -89, -42, -21, 81, 106, 3, 83, 112, -65, -41, -21, 22, 97, 3, 68, 85, -71, -41, -89, 91, 115, 2, 100, 108, -90, -41, -29, 29, 48, 70, 86, 108, -71, -63, -65, 88, 107, 71, com.umeng.analytics.pro.cw.n, 72, -66, -63, -65, 20, 127, 7, 91, 96, -21, -63, -66, 70, 119, 70, 68, 109, -82, -110, -101, 70, 119, 10, 95, 100, -81, -26, -94, 89, 119, 70, 89, 118, -21, -47, -92, 70, 96, 3, 83, 113, -22};
            byte[] bArr4 = {-53, -78, -53, 52, 18, 102, 48, 5};
            int i3 = 0;
            int i4 = 0;
            while (i3 < 89) {
                if (i4 >= 8) {
                    i4 = 0;
                }
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i4]);
                i3++;
                i4++;
            }
            new String(bArr3, StandardCharsets.UTF_8);
            this.m = PathInterpolatorCompat.MAX_NUM_POINTS;
        }
        Om0 om0 = new Om0();
        om0.f3522a = AbstractC4969wu.b;
        om0.b = 6000L;
        om0.c = null;
        om0.d = null;
        om0.e = null;
        om0.f = null;
        om0.g = null;
        om0.h = null;
        om0.i = null;
        om0.j = null;
        om0.k = false;
        om0.l = false;
        om0.m = -1;
        om0.n = 1000;
        om0.o = AbstractC4969wu.f5203a;
        om0.p = AbstractC4969wu.e;
        om0.q = 1.0f;
        om0.r = false;
        String str = AbstractC4969wu.f5203a;
        om0.f3522a = this.f2940a;
        om0.b = this.b;
        om0.c = this.c;
        om0.d = this.d;
        om0.e = this.e;
        om0.f = this.f;
        om0.g = this.g;
        om0.h = this.h;
        om0.i = this.i;
        om0.j = this.j;
        om0.k = this.k;
        om0.l = this.l;
        om0.m = this.m;
        om0.n = this.n;
        om0.o = this.o;
        om0.p = this.p;
        om0.q = this.q;
        om0.r = false;
        om0.s = this.r;
        om0.t = this.s;
        om0.u = this.t;
        om0.v = this.u;
        return om0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB c() {
        this.q = 0.3f;
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB d(LD ld) {
        this.d = ld;
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB g() {
        this.m = 20000;
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB h(L8 l8) {
        this.h = l8;
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB j(C2443Gk c2443Gk) {
        this.t = c2443Gk;
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB k() {
        this.k = false;
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB m() {
        this.b = 6000L;
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB o(QQ qq) {
        this.j = qq;
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB q(H5 h5) {
        this.g = h5;
        return this;
    }
}
