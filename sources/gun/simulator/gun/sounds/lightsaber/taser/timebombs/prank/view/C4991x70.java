package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.OrderedSet;
import java.util.Objects;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.x70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4991x70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D70 f5208a;
    public final Array b;
    public final Array c;
    public final Array d;
    public final Array e;
    public final Array f;
    public final Array g;
    public final Array h;
    public final Color j;
    public float k;
    public float l;
    public final Array i = new Array();
    public final float m = 1.0f;
    public final float n = 1.0f;

    /* JADX WARN: Multi-variable type inference failed */
    public C4991x70(D70 d70) {
        Object[] objArr;
        int i;
        int i2;
        Object[] objArr2;
        Object[] objArr3;
        int i3;
        C3443fb c3443fb;
        if (d70 == null) {
            throw new IllegalArgumentException("data cannot be null.");
        }
        this.f5208a = d70;
        Array array = d70.b;
        Array array2 = new Array(array.size);
        this.b = array2;
        Object[] objArr4 = array2.items;
        Array.ArrayIterator it = array.iterator();
        while (it.hasNext()) {
            C3619hb c3619hb = (C3619hb) it.next();
            C3619hb c3619hb2 = c3619hb.c;
            if (c3619hb2 == null) {
                c3443fb = new C3443fb(c3619hb, this, null);
            } else {
                C3443fb c3443fb2 = (C3443fb) objArr4[c3619hb2.f4458a];
                C3443fb c3443fb3 = new C3443fb(c3619hb, this, c3443fb2);
                c3443fb2.d.add(c3443fb3);
                c3443fb = c3443fb3;
            }
            this.b.add(c3443fb);
        }
        Array array3 = d70.c;
        this.c = new Array(array3.size);
        this.d = new Array(array3.size);
        Array.ArrayIterator it2 = array3.iterator();
        while (it2.hasNext()) {
            O70 o70 = (O70) it2.next();
            N70 n70 = new N70(o70, (C3443fb) objArr4[o70.c.f4458a]);
            this.c.add(n70);
            this.d.add(n70);
        }
        Array array4 = d70.h;
        this.e = new Array(array4.size);
        Array.ArrayIterator it3 = array4.iterator();
        while (it3.hasNext()) {
            this.e.add(new C3417fC((C3505gC) it3.next(), this));
        }
        Array array5 = d70.i;
        this.f = new Array(array5.size);
        Array.ArrayIterator it4 = array5.iterator();
        while (it4.hasNext()) {
            this.f.add(new Dd0((Ed0) it4.next(), this));
        }
        Array array6 = d70.j;
        this.g = new Array(array6.size);
        Array.ArrayIterator it5 = array6.iterator();
        while (it5.hasNext()) {
            this.g.add(new PT((TT) it5.next(), this));
        }
        Array array7 = d70.k;
        this.h = new Array(array7.size);
        Array.ArrayIterator it6 = array7.iterator();
        while (it6.hasNext()) {
            this.h.add(new C4049mU((C4137nU) it6.next(), this));
        }
        this.j = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        Array array8 = this.i;
        array8.clear();
        Array array9 = this.b;
        int i4 = array9.size;
        Object[] objArr5 = array9.items;
        for (int i5 = 0; i5 < i4; i5++) {
            C3443fb c3443fb4 = (C3443fb) objArr5[i5];
            boolean z = c3443fb4.f4371a.m;
            c3443fb4.z = z;
            c3443fb4.A = !z;
        }
        Array array10 = this.e;
        int i6 = array10.size;
        Array array11 = this.f;
        int i7 = array11.size;
        Array array12 = this.g;
        int i8 = array12.size;
        Array array13 = this.h;
        int i9 = array13.size;
        Object[] objArr6 = array10.items;
        Object[] objArr7 = array11.items;
        Object[] objArr8 = array12.items;
        Object[] objArr9 = array13.items;
        int i10 = i6 + i7 + i8 + i9;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = 0;
            while (true) {
                if (i12 < i6) {
                    C3417fC c3417fC = (C3417fC) objArr6[i12];
                    objArr = objArr6;
                    C3505gC c3505gC = c3417fC.f4359a;
                    i = i6;
                    if (c3505gC.b == i11) {
                        C3443fb c3443fb5 = c3417fC.c;
                        boolean z2 = c3443fb5.A && !c3505gC.c;
                        c3417fC.i = z2;
                        if (z2) {
                            e(c3443fb5);
                            Array array14 = c3417fC.b;
                            C3443fb c3443fb6 = (C3443fb) array14.first();
                            e(c3443fb6);
                            int i13 = array14.size;
                            Array array15 = c3443fb6.d;
                            i2 = i10;
                            if (i13 == 1) {
                                array8.add(c3417fC);
                                g(array15);
                            } else {
                                C3443fb c3443fb7 = (C3443fb) array14.peek();
                                e(c3443fb7);
                                array8.add(c3417fC);
                                g(array15);
                                c3443fb7.z = true;
                            }
                        } else {
                            i2 = i10;
                        }
                    } else {
                        i12++;
                        objArr6 = objArr;
                        i6 = i;
                    }
                } else {
                    objArr = objArr6;
                    i = i6;
                    i2 = i10;
                    int i14 = 0;
                    while (true) {
                        if (i14 < i7) {
                            Dd0 dd0 = (Dd0) objArr7[i14];
                            Ed0 ed0 = dd0.f2979a;
                            if (ed0.b == i11) {
                                C3443fb c3443fb8 = dd0.c;
                                boolean z3 = c3443fb8.A && !ed0.c;
                                dd0.j = z3;
                                if (z3) {
                                    e(c3443fb8);
                                    Array array16 = dd0.b;
                                    Object[] objArr10 = array16.items;
                                    int i15 = array16.size;
                                    if (ed0.s) {
                                        int i16 = 0;
                                        while (i16 < i15) {
                                            C3443fb c3443fb9 = (C3443fb) objArr10[i16];
                                            e(c3443fb9.c);
                                            e(c3443fb9);
                                            i16++;
                                            objArr7 = objArr7;
                                        }
                                        objArr2 = objArr7;
                                    } else {
                                        objArr2 = objArr7;
                                        for (int i17 = 0; i17 < i15; i17++) {
                                            e((C3443fb) objArr10[i17]);
                                        }
                                    }
                                    array8.add(dd0);
                                    for (int i18 = 0; i18 < i15; i18++) {
                                        g(((C3443fb) objArr10[i18]).d);
                                    }
                                    for (int i19 = 0; i19 < i15; i19++) {
                                        ((C3443fb) objArr10[i19]).z = true;
                                    }
                                }
                            } else {
                                i14++;
                            }
                        } else {
                            objArr2 = objArr7;
                            int i20 = 0;
                            while (true) {
                                if (i20 >= i8) {
                                    i7 = i7;
                                    objArr3 = objArr8;
                                    i3 = i8;
                                    for (int i21 = 0; i21 < i9; i21++) {
                                        C4049mU c4049mU = (C4049mU) objArr9[i21];
                                        C4137nU c4137nU = c4049mU.f4695a;
                                        if (c4137nU.b == i11) {
                                            C3443fb c3443fb10 = c4049mU.b;
                                            boolean z4 = c3443fb10.A && !c4137nU.c;
                                            c4049mU.y = z4;
                                            if (!z4) {
                                                break;
                                            }
                                            e(c3443fb10);
                                            array8.add(c4049mU);
                                            g(c3443fb10.d);
                                            c3443fb10.z = true;
                                            break;
                                        }
                                    }
                                    break;
                                }
                                PT pt = (PT) objArr8[i20];
                                TT tt = pt.f3553a;
                                if (tt.b == i11) {
                                    N70 n71 = pt.c;
                                    C3443fb c3443fb11 = n71.b;
                                    boolean z5 = c3443fb11.A && !tt.c;
                                    pt.i = z5;
                                    if (z5) {
                                        int i22 = n71.f3442a.f3494a;
                                        I70 i70 = this.f5208a.e;
                                        if (i70 != null) {
                                            OrderedSet orderedSet = i70.b;
                                            Object[] objArr11 = orderedSet.orderedItems().items;
                                            int i23 = orderedSet.size;
                                            int i24 = 0;
                                            while (i24 < i23) {
                                                Object[] objArr12 = objArr8;
                                                H70 h70 = (H70) objArr11[i24];
                                                int i25 = i8;
                                                if (h70.f3156a == i22) {
                                                    f(h70.c, c3443fb11);
                                                }
                                                i24++;
                                                i8 = i25;
                                                objArr8 = objArr12;
                                            }
                                        }
                                        objArr3 = objArr8;
                                        i3 = i8;
                                        AbstractC3413f9 abstractC3413f9 = n71.e;
                                        if (abstractC3413f9 instanceof OT) {
                                            f(abstractC3413f9, c3443fb11);
                                        }
                                        Array array17 = pt.b;
                                        Object[] objArr13 = array17.items;
                                        int i26 = array17.size;
                                        for (int i27 = 0; i27 < i26; i27++) {
                                            e((C3443fb) objArr13[i27]);
                                        }
                                        array8.add(pt);
                                        for (int i28 = 0; i28 < i26; i28++) {
                                            g(((C3443fb) objArr13[i28]).d);
                                        }
                                        for (int i29 = 0; i29 < i26; i29++) {
                                            ((C3443fb) objArr13[i29]).z = true;
                                        }
                                        break;
                                    }
                                } else {
                                    i20++;
                                }
                            }
                            i11++;
                            objArr6 = objArr;
                            i6 = i;
                            i10 = i2;
                            objArr7 = objArr2;
                            i7 = i7;
                            i8 = i3;
                            objArr8 = objArr3;
                        }
                        i7 = i7;
                        objArr3 = objArr8;
                        i3 = i8;
                        i11++;
                        objArr6 = objArr;
                        i6 = i;
                        i10 = i2;
                        objArr7 = objArr2;
                        i7 = i7;
                        i8 = i3;
                        objArr8 = objArr3;
                    }
                }
                objArr2 = objArr7;
                i7 = i7;
                objArr3 = objArr8;
                i3 = i8;
                i11++;
                objArr6 = objArr;
                i6 = i;
                i10 = i2;
                objArr7 = objArr2;
                i7 = i7;
                i8 = i3;
                objArr8 = objArr3;
            }
        }
        for (int i30 = 0; i30 < i4; i30++) {
            e((C3443fb) objArr5[i30]);
        }
    }

    public static void g(Array array) {
        Object[] objArr = array.items;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            C3443fb c3443fb = (C3443fb) objArr[i2];
            if (c3443fb.A) {
                if (c3443fb.z) {
                    g(c3443fb.d);
                }
                c3443fb.z = false;
            }
        }
    }

    public final C3443fb a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("boneName cannot be null.");
        }
        Array array = this.b;
        Object[] objArr = array.items;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            C3443fb c3443fb = (C3443fb) objArr[i2];
            if (c3443fb.f4371a.b.equals(str)) {
                return c3443fb;
            }
        }
        return null;
    }

    public final N70 b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("slotName cannot be null.");
        }
        Array array = this.c;
        Object[] objArr = array.items;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            N70 n70 = (N70) objArr[i2];
            if (n70.f3442a.b.equals(str)) {
                return n70;
            }
        }
        return null;
    }

    public final AbstractC3413f9 c(int i, String str) {
        if (str == null) {
            throw new IllegalArgumentException("attachmentName cannot be null.");
        }
        I70 i70 = this.f5208a.e;
        if (i70 != null) {
            return i70.a(i, str);
        }
        return null;
    }

    public final void d() {
        Array array = this.b;
        Object[] objArr = array.items;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            C3443fb c3443fb = (C3443fb) objArr[i2];
            C3619hb c3619hb = c3443fb.f4371a;
            c3443fb.e = c3619hb.e;
            c3443fb.f = c3619hb.f;
            c3443fb.g = c3619hb.g;
            c3443fb.j = c3619hb.j;
            c3443fb.k = c3619hb.k;
            c3443fb.y = c3619hb.l;
        }
        Array array2 = this.e;
        Object[] objArr2 = array2.items;
        int i3 = array2.size;
        for (int i4 = 0; i4 < i3; i4++) {
            C3417fC c3417fC = (C3417fC) objArr2[i4];
            C3505gC c3505gC = c3417fC.f4359a;
            c3417fC.g = c3505gC.j;
            c3417fC.h = c3505gC.k;
            c3417fC.d = c3505gC.f;
            c3417fC.e = c3505gC.g;
            c3417fC.f = c3505gC.h;
        }
        Array array3 = this.f;
        Object[] objArr3 = array3.items;
        int i5 = array3.size;
        for (int i6 = 0; i6 < i5; i6++) {
            Dd0 dd0 = (Dd0) objArr3[i6];
            Ed0 ed0 = dd0.f2979a;
            dd0.d = ed0.f;
            dd0.e = ed0.g;
            dd0.f = ed0.h;
            dd0.g = ed0.i;
            dd0.h = ed0.j;
            dd0.i = ed0.k;
        }
        Array array4 = this.g;
        Object[] objArr4 = array4.items;
        int i7 = array4.size;
        for (int i8 = 0; i8 < i7; i8++) {
            PT pt = (PT) objArr4[i8];
            TT tt = pt.f3553a;
            pt.d = tt.j;
            pt.e = tt.k;
            pt.f = tt.l;
            pt.g = tt.m;
            pt.h = tt.n;
        }
        Array array5 = this.h;
        Object[] objArr5 = array5.items;
        int i9 = array5.size;
        for (int i10 = 0; i10 < i9; i10++) {
            C4049mU c4049mU = (C4049mU) objArr5[i10];
            C4137nU c4137nU = c4049mU.f4695a;
            c4049mU.c = c4137nU.l;
            c4049mU.d = c4137nU.m;
            c4049mU.e = c4137nU.n;
            c4049mU.f = c4137nU.o;
            c4049mU.g = c4137nU.p;
            c4049mU.h = c4137nU.q;
            c4049mU.i = c4137nU.r;
        }
        Array array6 = this.c;
        Object[] objArr6 = array6.items;
        int i11 = array6.size;
        AbstractC2340Cl.i(0, i11, objArr6, this.d.items);
        for (int i12 = 0; i12 < i11; i12++) {
            if (!Objects.equals(((N70) objArr6[i12]).f3442a.b, "banji_hong") && !Objects.equals(((N70) objArr6[i12]).f3442a.b, "dancao_hong") && !Objects.equals(((N70) objArr6[i12]).f3442a.b, "jichui_hong")) {
                ((N70) objArr6[i12]).b();
            }
        }
    }

    public final void e(C3443fb c3443fb) {
        if (c3443fb.z) {
            return;
        }
        C3443fb c3443fb2 = c3443fb.c;
        if (c3443fb2 != null) {
            e(c3443fb2);
        }
        c3443fb.z = true;
        this.i.add(c3443fb);
    }

    public final void f(AbstractC3413f9 abstractC3413f9, C3443fb c3443fb) {
        if (abstractC3413f9 instanceof OT) {
            int[] iArr = ((OT) abstractC3413f9).e;
            if (iArr == null) {
                e(c3443fb);
                return;
            }
            Object[] objArr = this.b.items;
            int length = iArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                int i3 = iArr[i] + i2;
                while (i2 < i3) {
                    e((C3443fb) objArr[iArr[i2]]);
                    i2++;
                }
                i = i2;
            }
        }
    }

    public final void h(int i) {
        Array array = this.b;
        Object[] objArr = array.items;
        int i2 = array.size;
        for (int i3 = 0; i3 < i2; i3++) {
            C3443fb c3443fb = (C3443fb) objArr[i3];
            c3443fb.l = c3443fb.e;
            c3443fb.m = c3443fb.f;
            c3443fb.n = c3443fb.g;
            c3443fb.o = c3443fb.h;
            c3443fb.p = c3443fb.i;
            c3443fb.q = c3443fb.j;
            c3443fb.r = c3443fb.k;
        }
        Array array2 = this.i;
        Object[] objArr2 = array2.items;
        int i4 = array2.size;
        for (int i5 = 0; i5 < i4; i5++) {
            ((InterfaceC3630hg0) objArr2[i5]).a(i);
        }
    }

    public final String toString() {
        String str = this.f5208a.f2957a;
        return str != null ? str : super.toString();
    }
}
