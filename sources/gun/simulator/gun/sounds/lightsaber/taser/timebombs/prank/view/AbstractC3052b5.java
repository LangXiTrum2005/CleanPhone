package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.utils.Array;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3052b5 extends S4 {
    public final int e;

    public AbstractC3052b5(int i, int i2, int i3, int i4) {
        super(i, i2, DM.D(i4) + "|" + i3);
        this.e = i3;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3405f5
    public final void a(C4991x70 c4991x70, float f, float f2, Array array, float f3, int i, int i2) {
        float f4;
        boolean z;
        float fW;
        int i3 = this.e;
        if (i3 != -1) {
            C4049mU c4049mU = (C4049mU) c4991x70.h.get(i3);
            if (c4049mU.y) {
                int i4 = ((Z4) this).f;
                switch (i4) {
                    case 0:
                        f4 = c4049mU.e;
                        break;
                    case 1:
                        f4 = c4049mU.h;
                        break;
                    case 2:
                        f4 = c4049mU.c;
                        break;
                    case 3:
                        f4 = 1.0f / c4049mU.f;
                        break;
                    case 4:
                        f4 = c4049mU.i;
                        break;
                    case 5:
                        f4 = c4049mU.d;
                        break;
                    default:
                        f4 = c4049mU.g;
                        break;
                }
                float fJ = j(f2, f3, i, f4, n(c4049mU));
                switch (i4) {
                    case 0:
                        c4049mU.e = fJ;
                        break;
                    case 1:
                        c4049mU.h = fJ;
                        break;
                    case 2:
                        c4049mU.c = fJ;
                        break;
                    case 3:
                        c4049mU.f = 1.0f / fJ;
                        break;
                    case 4:
                        c4049mU.i = fJ;
                        break;
                    case 5:
                        c4049mU.d = fJ;
                        break;
                    default:
                        c4049mU.g = fJ;
                        break;
                }
                return;
            }
            return;
        }
        float[] fArr = this.b;
        float fK = f2 >= fArr[0] ? k(f2) : 0.0f;
        Array array2 = c4991x70.h;
        Object[] objArr = array2.items;
        int i5 = array2.size;
        for (int i6 = 0; i6 < i5; i6++) {
            C4049mU c4049mU2 = (C4049mU) objArr[i6];
            if (c4049mU2.y) {
                int i7 = ((Z4) this).f;
                C4137nU c4137nU = c4049mU2.f4695a;
                switch (i7) {
                    case 0:
                        z = c4137nU.u;
                        break;
                    case 1:
                        z = c4137nU.x;
                        break;
                    case 2:
                        z = c4137nU.s;
                        break;
                    case 3:
                        z = c4137nU.v;
                        break;
                    case 4:
                        z = c4137nU.y;
                        break;
                    case 5:
                        z = c4137nU.t;
                        break;
                    default:
                        z = c4137nU.w;
                        break;
                }
                if (z) {
                    switch (i7) {
                        case 0:
                            fW = c4049mU2.e;
                            break;
                        case 1:
                            fW = c4049mU2.h;
                            break;
                        case 2:
                            fW = c4049mU2.c;
                            break;
                        case 3:
                            fW = 1.0f / c4049mU2.f;
                            break;
                        case 4:
                            fW = c4049mU2.i;
                            break;
                        case 5:
                            fW = c4049mU2.d;
                            break;
                        default:
                            fW = c4049mU2.g;
                            break;
                    }
                    float fN = n(c4049mU2);
                    if (f2 < fArr[0]) {
                        int iD = DM.D(i);
                        if (iD == 0) {
                            fW = fN;
                        } else if (iD == 1) {
                            fW = AbstractC5044xl.w(fN, fW, f3, fW);
                        }
                    } else {
                        fW = i == 1 ? AbstractC5044xl.w(fK, fN, f3, fN) : AbstractC5044xl.w(fK, fW, f3, fW);
                    }
                    switch (i7) {
                        case 0:
                            c4049mU2.e = fW;
                            break;
                        case 1:
                            c4049mU2.h = fW;
                            break;
                        case 2:
                            c4049mU2.c = fW;
                            break;
                        case 3:
                            c4049mU2.f = 1.0f / fW;
                            break;
                        case 4:
                            c4049mU2.i = fW;
                            break;
                        case 5:
                            c4049mU2.d = fW;
                            break;
                        default:
                            c4049mU2.g = fW;
                            break;
                    }
                }
            }
        }
    }

    public abstract float n(C4049mU c4049mU);
}
