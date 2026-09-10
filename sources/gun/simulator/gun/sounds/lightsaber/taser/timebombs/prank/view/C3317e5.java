package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.e5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3317e5 extends AbstractC3405f5 {
    public final int c;
    public final InterfaceC3919kz d;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C3317e5(int i, int i2, AbstractC3413f9 abstractC3413f9) {
        StringBuilder sbQ = AbstractC5044xl.q("28|", i2, "|");
        InterfaceC3919kz interfaceC3919kz = (InterfaceC3919kz) abstractC3413f9;
        sbQ.append(interfaceC3919kz.a().f5014a);
        super(i, sbQ.toString());
        this.c = i2;
        this.d = interfaceC3919kz;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0083 A[PHI: r1 r7
  0x0083: PHI (r1v4 int) = (r1v1 int), (r1v5 int) binds: [B:44:0x009d, B:35:0x0081] A[DONT_GENERATE, DONT_INLINE]
  0x0083: PHI (r7v9 int) = (r7v7 int), (r7v11 int) binds: [B:44:0x009d, B:35:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0086 A[PHI: r1
  0x0086: PHI (r1v3 int) = (r1v1 int), (r1v5 int) binds: [B:44:0x009d, B:35:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3405f5
    public final void a(C4991x70 c4991x70, float f, float f2, Array array, float f3, int i, int i2) {
        C4633t40 c4633t40A;
        int i3;
        int i4;
        N70 n70 = (N70) c4991x70.c.get(this.c);
        if (n70.b.A) {
            O4 o4 = n70.e;
            InterfaceC3919kz interfaceC3919kz = this.d;
            if ((o4 == interfaceC3919kz || ((o4 instanceof AbstractC3806jh0) && ((AbstractC3806jh0) o4).d == interfaceC3919kz)) && (c4633t40A = ((InterfaceC3919kz) o4).a()) != null) {
                if (i2 == 2) {
                    if (i == 1) {
                        n70.f = -1;
                        return;
                    }
                    return;
                }
                float[] fArr = this.b;
                if (f2 < fArr[0]) {
                    if (i == 1 || i == 2) {
                        n70.f = -1;
                        return;
                    }
                    return;
                }
                int iD = AbstractC3405f5.d(f2, fArr, 3);
                float f4 = fArr[iD];
                int i5 = (int) fArr[iD + 1];
                float f5 = fArr[iD + 2];
                int iMin = i5 >> 4;
                int length = ((TextureRegion[]) c4633t40A.e).length;
                EnumC4457r40 enumC4457r40 = EnumC4457r40.b[i5 & 15];
                if (enumC4457r40 != EnumC4457r40.f4914a) {
                    iMin = (int) (((f2 - f4) / f5) + 1.0E-4f + iMin);
                    switch (enumC4457r40.ordinal()) {
                        case 1:
                            iMin = Math.min(length - 1, iMin);
                            break;
                        case 2:
                            iMin %= length;
                            break;
                        case 3:
                            i3 = (length << 1) - 2;
                            i4 = i3 != 0 ? iMin % i3 : 0;
                            if (i4 < length) {
                                iMin = i4;
                            } else {
                                iMin = i3 - i4;
                            }
                            break;
                        case 4:
                            iMin = Math.max((length - 1) - iMin, 0);
                            break;
                        case 5:
                            iMin = (length - 1) - (iMin % length);
                            break;
                        case 6:
                            i3 = (length << 1) - 2;
                            i4 = i3 != 0 ? ((iMin + length) - 1) % i3 : 0;
                            if (i4 < length) {
                                iMin = i4;
                            } else {
                                iMin = i3 - i4;
                            }
                            break;
                    }
                }
                n70.f = iMin;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3405f5
    public final int c() {
        return 3;
    }
}
