package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.Array;

/* JADX INFO: loaded from: classes2.dex */
public final class Q4 extends S4 {
    public final /* synthetic */ int e;
    public final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q4(int i, int i2, int i3, int i4) {
        super(i, i2, AbstractC3950lJ.p("9|", i3));
        this.e = i4;
        switch (i4) {
            case 1:
                super(i, i2, AbstractC3950lJ.p("17|", i3));
                this.f = i3;
                break;
            case 2:
                super(i, i2, AbstractC3950lJ.p("18|", i3));
                this.f = i3;
                break;
            case 3:
                super(i, i2, AbstractC3950lJ.p("3|", i3));
                this.f = i3;
                break;
            case 4:
                super(i, i2, AbstractC3950lJ.p("4|", i3));
                this.f = i3;
                break;
            case 5:
                super(i, i2, AbstractC3950lJ.p("5|", i3));
                this.f = i3;
                break;
            case 6:
                super(i, i2, AbstractC3950lJ.p("6|", i3));
                this.f = i3;
                break;
            case 7:
                super(i, i2, AbstractC3950lJ.p("1|", i3));
                this.f = i3;
                break;
            case 8:
                super(i, i2, AbstractC3950lJ.p("2|", i3));
                this.f = i3;
                break;
            default:
                this.f = i3;
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3405f5
    public final void a(C4991x70 c4991x70, float f, float f2, Array array, float f3, int i, int i2) {
        int i3 = this.e;
        int i4 = this.f;
        switch (i3) {
            case 0:
                N70 n70 = (N70) c4991x70.c.get(i4);
                if (n70.b.A) {
                    Color color = n70.c;
                    float f4 = this.b[0];
                    O70 o70 = n70.f3442a;
                    if (f2 >= f4) {
                        float fK = k(f2);
                        if (f3 != 1.0f) {
                            if (i == 1) {
                                color.f202a = o70.d.f202a;
                            }
                            float f5 = color.f202a;
                            color.f202a = AbstractC5044xl.w(fK, f5, f3, f5);
                        } else {
                            color.f202a = fK;
                        }
                        break;
                    } else {
                        Color color2 = o70.d;
                        int iD = DM.D(i);
                        if (iD == 0) {
                            color.f202a = color2.f202a;
                            break;
                        } else if (iD == 1) {
                            float f6 = color.f202a;
                            color.f202a = AbstractC5044xl.w(color2.f202a, f6, f3, f6);
                            break;
                        }
                    }
                }
                break;
            case 1:
                PT pt = (PT) c4991x70.g.get(i4);
                if (pt.i) {
                    pt.d = j(f2, f3, i, pt.d, pt.f3553a.j);
                }
                break;
            case 2:
                PT pt2 = (PT) c4991x70.g.get(i4);
                if (pt2.i) {
                    pt2.e = j(f2, f3, i, pt2.e, pt2.f3553a.k);
                }
                break;
            case 3:
                C3443fb c3443fb = (C3443fb) c4991x70.b.get(i4);
                if (c3443fb.A) {
                    c3443fb.h = m(f2, f3, i, i2, c3443fb.h, c3443fb.f4371a.h);
                }
                break;
            case 4:
                C3443fb c3443fb2 = (C3443fb) c4991x70.b.get(i4);
                if (c3443fb2.A) {
                    c3443fb2.i = m(f2, f3, i, i2, c3443fb2.i, c3443fb2.f4371a.i);
                }
                break;
            case 5:
                C3443fb c3443fb3 = (C3443fb) c4991x70.b.get(i4);
                if (c3443fb3.A) {
                    c3443fb3.j = l(f2, f3, i, c3443fb3.j, c3443fb3.f4371a.j);
                }
                break;
            case 6:
                C3443fb c3443fb4 = (C3443fb) c4991x70.b.get(i4);
                if (c3443fb4.A) {
                    c3443fb4.k = l(f2, f3, i, c3443fb4.k, c3443fb4.f4371a.k);
                }
                break;
            case 7:
                C3443fb c3443fb5 = (C3443fb) c4991x70.b.get(i4);
                if (c3443fb5.A) {
                    c3443fb5.e = l(f2, f3, i, c3443fb5.e, c3443fb5.f4371a.e);
                }
                break;
            default:
                C3443fb c3443fb6 = (C3443fb) c4991x70.b.get(i4);
                if (c3443fb6.A) {
                    c3443fb6.f = l(f2, f3, i, c3443fb6.f, c3443fb6.f4371a.f);
                }
                break;
        }
    }
}
