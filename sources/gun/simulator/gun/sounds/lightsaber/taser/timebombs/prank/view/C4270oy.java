package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4270oy extends AbstractC5178zG {
    public final /* synthetic */ int i;
    public final Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4270oy(List list, int i) {
        super(list);
        this.i = i;
        if (i == 1) {
            super(list);
            this.j = new PointF();
            return;
        }
        if (i == 2) {
            super(list);
            this.j = new Z20();
            return;
        }
        int iMax = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C4182ny c4182ny = (C4182ny) ((C5090yG) list.get(i2)).b;
            if (c4182ny != null) {
                iMax = Math.max(iMax, c4182ny.b.length);
            }
        }
        this.j = new C4182ny(new float[iMax], new int[iMax]);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5170z9
    public final Object f(C5090yG c5090yG, float f) {
        Object obj;
        Object obj2 = c5090yG.b;
        int i = this.i;
        Object obj3 = this.j;
        switch (i) {
            case 0:
                C4182ny c4182ny = (C4182ny) obj3;
                C4182ny c4182ny2 = (C4182ny) obj2;
                C4182ny c4182ny3 = (C4182ny) c5090yG.c;
                c4182ny.getClass();
                if (c4182ny2.equals(c4182ny3) || f <= 0.0f) {
                    c4182ny.a(c4182ny2);
                } else if (f >= 1.0f) {
                    c4182ny.a(c4182ny3);
                } else {
                    int[] iArr = c4182ny2.b;
                    int length = iArr.length;
                    int[] iArr2 = c4182ny3.b;
                    if (length != iArr2.length) {
                        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb.append(iArr.length);
                        sb.append(" vs ");
                        throw new IllegalArgumentException(AbstractC5044xl.o(sb, iArr2.length, ")"));
                    }
                    int i2 = 0;
                    while (true) {
                        int length2 = iArr.length;
                        int[] iArr3 = c4182ny.b;
                        float[] fArr = c4182ny.f4768a;
                        if (i2 < length2) {
                            fArr[i2] = AbstractC5187zP.e(c4182ny2.f4768a[i2], c4182ny3.f4768a[i2], f);
                            iArr3[i2] = AbstractC2340Cl.u(f, iArr[i2], iArr2[i2]);
                            i2++;
                        } else {
                            for (int length3 = iArr.length; length3 < fArr.length; length3++) {
                                fArr[length3] = fArr[iArr.length - 1];
                                iArr3[length3] = iArr3[iArr.length - 1];
                            }
                        }
                    }
                }
                return c4182ny;
            case 1:
                return k(c5090yG, f, f, f);
            default:
                if (obj2 == null || (obj = c5090yG.c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                Z20 z20 = (Z20) obj2;
                Z20 z21 = (Z20) obj;
                C4215oK c4215oK = this.e;
                if (c4215oK != null) {
                    Z20 z22 = (Z20) c4215oK.b(c5090yG.g, c5090yG.h.floatValue(), z20, z21, f, d(), this.d);
                    if (z22 != null) {
                        return z22;
                    }
                }
                Z20 z23 = (Z20) obj3;
                float fE = AbstractC5187zP.e(z20.f4054a, z21.f4054a, f);
                float fE2 = AbstractC5187zP.e(z20.b, z21.b, f);
                z23.f4054a = fE;
                z23.b = fE2;
                return z23;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5170z9
    public final /* bridge */ /* synthetic */ Object g(C5090yG c5090yG, float f, float f2, float f3) {
        switch (this.i) {
            case 1:
                return k(c5090yG, f, f2, f3);
            default:
                super.g(c5090yG, f, f2, f3);
                throw null;
        }
    }

    public final PointF k(C5090yG c5090yG, float f, float f2, float f3) {
        Object obj;
        Object obj2 = c5090yG.b;
        if (obj2 == null || (obj = c5090yG.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        C4215oK c4215oK = this.e;
        if (c4215oK != null) {
            PointF pointF3 = (PointF) c4215oK.b(c5090yG.g, c5090yG.h.floatValue(), pointF, pointF2, f, d(), this.d);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = (PointF) this.j;
        float f4 = pointF.x;
        float fW = AbstractC5044xl.w(pointF2.x, f4, f2, f4);
        float f5 = pointF.y;
        pointF4.set(fW, AbstractC5044xl.w(pointF2.y, f5, f3, f5));
        return pointF4;
    }
}
