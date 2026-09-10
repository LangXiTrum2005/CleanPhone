package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Closeable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5021xZ implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HY f5227a;
    public final EnumC5106yW b;
    public final String c;
    public final int d;
    public final C3657hz e;
    public final C4447qz f;
    public final CZ g;
    public final C5021xZ h;
    public final C5021xZ i;
    public final C5021xZ j;
    public final long k;
    public final long l;
    public final C4813v60 m;
    public C4938wc n;

    public C5021xZ(HY hy, EnumC5106yW enumC5106yW, String str, int i, C3657hz c3657hz, C4447qz c4447qz, CZ cz, C5021xZ c5021xZ, C5021xZ c5021xZ2, C5021xZ c5021xZ3, long j, long j2, C4813v60 c4813v60) {
        this.f5227a = hy;
        this.b = enumC5106yW;
        this.c = str;
        this.d = i;
        this.e = c3657hz;
        this.f = c4447qz;
        this.g = cz;
        this.h = c5021xZ;
        this.i = c5021xZ2;
        this.j = c5021xZ3;
        this.k = j;
        this.l = j2;
        this.m = c4813v60;
    }

    public static String i(C5021xZ c5021xZ, String str) {
        c5021xZ.getClass();
        String strA = c5021xZ.f.a(str);
        if (strA == null) {
            return null;
        }
        return strA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        CZ cz = this.g;
        if (cz == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        cz.close();
    }

    public final C4938wc h() {
        C4938wc c4938wc = this.n;
        if (c4938wc != null) {
            return c4938wc;
        }
        int i = C4938wc.n;
        C4938wc c4938wcQ = C3336eJ.q(this.f);
        this.n = c4938wcQ;
        return c4938wcQ;
    }

    public final boolean k() {
        int i = this.d;
        return 200 <= i && i < 300;
    }

    public final C4845vZ m() {
        C4845vZ c4845vZ = new C4845vZ();
        c4845vZ.f5136a = this.f5227a;
        c4845vZ.b = this.b;
        c4845vZ.c = this.d;
        c4845vZ.d = this.c;
        c4845vZ.e = this.e;
        c4845vZ.f = this.f.c();
        c4845vZ.g = this.g;
        c4845vZ.h = this.h;
        c4845vZ.i = this.i;
        c4845vZ.j = this.j;
        c4845vZ.k = this.k;
        c4845vZ.l = this.l;
        c4845vZ.m = this.m;
        return c4845vZ;
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.f5227a.f3175a + '}';
    }
}
