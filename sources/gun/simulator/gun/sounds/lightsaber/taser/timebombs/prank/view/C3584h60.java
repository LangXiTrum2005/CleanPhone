package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.h60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3584h60 extends AbstractC5170z9 {
    public final C3055b60 i;
    public final Path j;
    public Path k;
    public Path l;
    public List m;

    public C3584h60(List list) {
        super(list);
        this.i = new C3055b60();
        this.j = new Path();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0152  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5170z9
    public final Object f(C5090yG c5090yG, float f) {
        C3055b60 c3055b60;
        C3055b60 c3055b61;
        C3055b60 c3055b62;
        C3055b60 c3055b63;
        C3055b60 c3055b64;
        C3055b60 c3055b65;
        int i;
        int i2;
        int i3;
        C3055b60 c3055b66 = (C3055b60) c5090yG.b;
        C3055b60 c3055b67 = (C3055b60) c5090yG.c;
        C3055b60 c3055b68 = c3055b67 == null ? c3055b66 : c3055b67;
        C3055b60 c3055b69 = this.i;
        if (c3055b69.b == null) {
            c3055b69.b = new PointF();
        }
        c3055b69.c = c3055b66.c || c3055b68.c;
        ArrayList arrayList = c3055b66.f4157a;
        int size = arrayList.size();
        int size2 = c3055b68.f4157a.size();
        ArrayList arrayList2 = c3055b68.f4157a;
        if (size != size2) {
            AbstractC5005xJ.b("Curves must have the same number of control points. Shape 1: " + arrayList.size() + "\tShape 2: " + arrayList2.size());
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = c3055b69.f4157a;
        if (arrayList3.size() < iMin) {
            for (int size3 = arrayList3.size(); size3 < iMin; size3++) {
                arrayList3.add(new C2365Dk());
            }
        } else if (arrayList3.size() > iMin) {
            for (int size4 = arrayList3.size() - 1; size4 >= iMin; size4--) {
                arrayList3.remove(arrayList3.size() - 1);
            }
        }
        PointF pointF = c3055b66.b;
        PointF pointF2 = c3055b68.b;
        c3055b69.a(AbstractC5187zP.e(pointF.x, pointF2.x, f), AbstractC5187zP.e(pointF.y, pointF2.y, f));
        int size5 = arrayList3.size() - 1;
        while (size5 >= 0) {
            C2365Dk c2365Dk = (C2365Dk) arrayList.get(size5);
            C2365Dk c2365Dk2 = (C2365Dk) arrayList2.get(size5);
            PointF pointF3 = c2365Dk.f2985a;
            PointF pointF4 = c2365Dk2.f2985a;
            C3055b60 c3055b610 = c3055b69;
            ((C2365Dk) arrayList3.get(size5)).f2985a.set(AbstractC5187zP.e(pointF3.x, pointF4.x, f), AbstractC5187zP.e(pointF3.y, pointF4.y, f));
            C2365Dk c2365Dk3 = (C2365Dk) arrayList3.get(size5);
            PointF pointF5 = c2365Dk.b;
            float f2 = pointF5.x;
            PointF pointF6 = c2365Dk2.b;
            c2365Dk3.b.set(AbstractC5187zP.e(f2, pointF6.x, f), AbstractC5187zP.e(pointF5.y, pointF6.y, f));
            C2365Dk c2365Dk4 = (C2365Dk) arrayList3.get(size5);
            PointF pointF7 = c2365Dk.c;
            float f3 = pointF7.x;
            PointF pointF8 = c2365Dk2.c;
            c2365Dk4.c.set(AbstractC5187zP.e(f3, pointF8.x, f), AbstractC5187zP.e(pointF7.y, pointF8.y, f));
            size5--;
            c3055b69 = c3055b610;
        }
        C3055b60 c3055b611 = c3055b69;
        List list = this.m;
        if (list != null) {
            int size6 = list.size() - 1;
            c3055b62 = c3055b611;
            while (size6 >= 0) {
                C3660i00 c3660i00 = (C3660i00) this.m.get(size6);
                c3660i00.getClass();
                ArrayList arrayList4 = c3055b62.f4157a;
                if (arrayList4.size() <= 2) {
                    c3055b64 = c3055b66;
                    c3055b65 = c3055b67;
                    i = size6;
                } else {
                    float fFloatValue = ((Float) c3660i00.b.e()).floatValue();
                    if (fFloatValue == 0.0f) {
                        c3055b64 = c3055b66;
                        c3055b65 = c3055b67;
                        i = size6;
                    } else {
                        boolean z = c3055b62.c;
                        int size7 = arrayList4.size() - 1;
                        int i4 = 0;
                        while (size7 >= 0) {
                            C2365Dk c2365Dk5 = (C2365Dk) arrayList4.get(size7);
                            C2365Dk c2365Dk6 = (C2365Dk) arrayList4.get(C3660i00.c(size7 - 1, arrayList4.size()));
                            PointF pointF9 = (size7 != 0 || z) ? c2365Dk6.c : c3055b62.b;
                            i4 = (((size7 != 0 || z) ? c2365Dk6.b : pointF9).equals(pointF9) && c2365Dk5.f2985a.equals(pointF9) && !(!c3055b62.c && (size7 == 0 || size7 == arrayList4.size() + (-1)))) ? i4 + 2 : i4 + 1;
                            size7--;
                        }
                        C3055b60 c3055b612 = c3660i00.c;
                        if (c3055b612 == null || c3055b612.f4157a.size() != i4) {
                            ArrayList arrayList5 = new ArrayList(i4);
                            for (int i5 = 0; i5 < i4; i5++) {
                                arrayList5.add(new C2365Dk());
                            }
                            c3660i00.c = new C3055b60(new PointF(0.0f, 0.0f), false, arrayList5);
                        }
                        C3055b60 c3055b613 = c3660i00.c;
                        c3055b613.c = z;
                        PointF pointF10 = c3055b62.b;
                        c3055b613.a(pointF10.x, pointF10.y);
                        ArrayList arrayList6 = c3055b613.f4157a;
                        boolean z2 = c3055b62.c;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < arrayList4.size()) {
                            C2365Dk c2365Dk7 = (C2365Dk) arrayList4.get(i6);
                            C2365Dk c2365Dk8 = (C2365Dk) arrayList4.get(C3660i00.c(i6 - 1, arrayList4.size()));
                            C2365Dk c2365Dk9 = (C2365Dk) arrayList4.get(C3660i00.c(i6 - 2, arrayList4.size()));
                            PointF pointF11 = (i6 != 0 || z2) ? c2365Dk8.c : c3055b62.b;
                            PointF pointF12 = (i6 != 0 || z2) ? c2365Dk8.b : pointF11;
                            PointF pointF13 = c2365Dk7.f2985a;
                            PointF pointF14 = c2365Dk9.c;
                            C3055b60 c3055b614 = c3055b66;
                            boolean z3 = !c3055b62.c && (i6 == 0 || i6 == arrayList4.size() + (-1));
                            if (pointF12.equals(pointF11) && pointF13.equals(pointF11) && !z3) {
                                float f4 = pointF11.x;
                                float f5 = f4 - pointF14.x;
                                float f6 = pointF11.y;
                                float f7 = f6 - pointF14.y;
                                PointF pointF15 = c2365Dk7.c;
                                float f8 = pointF15.x - f4;
                                float f9 = pointF15.y - f6;
                                i2 = size6;
                                i3 = i6;
                                float fHypot = (float) Math.hypot(f5, f7);
                                float fHypot2 = (float) Math.hypot(f8, f9);
                                float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                                float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                                float f10 = pointF11.x;
                                float fW = AbstractC5044xl.w(pointF14.x, f10, fMin, f10);
                                float f11 = pointF11.y;
                                float fW2 = AbstractC5044xl.w(pointF14.y, f11, fMin, f11);
                                float fW3 = AbstractC5044xl.w(pointF15.x, f10, fMin2, f10);
                                float fW4 = AbstractC5044xl.w(pointF15.y, f11, fMin2, f11);
                                float f12 = fW - ((fW - f10) * 0.5519f);
                                float f13 = fW2 - ((fW2 - f11) * 0.5519f);
                                float f14 = fW3 - ((fW3 - f10) * 0.5519f);
                                float f15 = fW4 - ((fW4 - f11) * 0.5519f);
                                C2365Dk c2365Dk10 = (C2365Dk) arrayList6.get(C3660i00.c(i7 - 1, arrayList6.size()));
                                C2365Dk c2365Dk11 = (C2365Dk) arrayList6.get(i7);
                                c2365Dk10.b.set(fW, fW2);
                                c2365Dk10.c.set(fW, fW2);
                                if (i3 == 0) {
                                    c3055b613.a(fW, fW2);
                                }
                                c2365Dk11.f2985a.set(f12, f13);
                                C2365Dk c2365Dk12 = (C2365Dk) arrayList6.get(i7 + 1);
                                c2365Dk11.b.set(f14, f15);
                                c2365Dk11.c.set(fW3, fW4);
                                c2365Dk12.f2985a.set(fW3, fW4);
                                i7 += 2;
                            } else {
                                i2 = size6;
                                i3 = i6;
                                C2365Dk c2365Dk13 = (C2365Dk) arrayList6.get(C3660i00.c(i7 - 1, arrayList6.size()));
                                C2365Dk c2365Dk14 = (C2365Dk) arrayList6.get(i7);
                                PointF pointF16 = c2365Dk8.b;
                                c2365Dk13.b.set(pointF16.x, pointF16.y);
                                PointF pointF17 = c2365Dk8.c;
                                c2365Dk13.c.set(pointF17.x, pointF17.y);
                                PointF pointF18 = c2365Dk7.f2985a;
                                c2365Dk14.f2985a.set(pointF18.x, pointF18.y);
                                i7++;
                            }
                            i6 = i3 + 1;
                            z2 = z2;
                            c3055b67 = c3055b67;
                            c3055b66 = c3055b614;
                            c3055b62 = c3055b62;
                            size6 = i2;
                            arrayList4 = arrayList4;
                        }
                        c3055b64 = c3055b66;
                        c3055b65 = c3055b67;
                        i = size6;
                        c3055b62 = c3055b613;
                    }
                }
                size6 = i - 1;
                c3055b67 = c3055b65;
                c3055b66 = c3055b64;
            }
            c3055b60 = c3055b66;
            c3055b61 = c3055b67;
        } else {
            c3055b60 = c3055b66;
            c3055b61 = c3055b67;
            c3055b62 = c3055b611;
        }
        Path path = this.j;
        AbstractC5187zP.d(c3055b62, path);
        if (this.e == null) {
            return path;
        }
        if (this.k == null) {
            this.k = new Path();
            this.l = new Path();
        }
        AbstractC5187zP.d(c3055b60, this.k);
        if (c3055b61 != null) {
            c3055b63 = c3055b61;
            AbstractC5187zP.d(c3055b63, this.l);
        } else {
            c3055b63 = c3055b61;
        }
        C4215oK c4215oK = this.e;
        float fFloatValue2 = c5090yG.h.floatValue();
        Path path2 = this.k;
        return (Path) c4215oK.b(c5090yG.g, fFloatValue2, path2, c3055b63 == null ? path2 : this.l, f, d(), this.d);
    }
}
