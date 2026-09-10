package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Vb0 extends B9 {
    public final StringBuilder D;
    public final RectF E;
    public final Matrix F;
    public final Tb0 G;
    public final Tb0 H;
    public final HashMap I;
    public final LongSparseArray J;
    public final ArrayList K;
    public final Sb0 L;
    public final C3160cK M;
    public final MJ N;
    public final Xb0 O;
    public final AbstractC5170z9 P;
    public C3103bh0 Q;
    public final AbstractC5170z9 R;
    public C3103bh0 S;
    public final C3915kv T;
    public C3103bh0 U;
    public final C3915kv V;
    public C3103bh0 W;
    public final AbstractC5170z9 X;
    public C3103bh0 Y;
    public C3103bh0 Z;
    public final AbstractC5170z9 a0;
    public final AbstractC5170z9 b0;
    public final AbstractC5170z9 c0;

    public Vb0(C3160cK c3160cK, ZG zg) {
        C3844k50 c3844k50;
        C3844k50 c3844k51;
        C3844k50 c3844k52;
        C3844k50 c3844k53;
        L4 l4;
        L4 l5;
        L4 l6;
        L4 l7;
        L4 l8;
        super(c3160cK, zg);
        this.D = new StringBuilder(2);
        this.E = new RectF();
        this.F = new Matrix();
        this.G = new Tb0(0);
        this.H = new Tb0(1);
        this.I = new HashMap();
        this.J = new LongSparseArray();
        this.K = new ArrayList();
        this.O = Xb0.b;
        this.M = c3160cK;
        this.N = zg.b;
        Sb0 sb0 = new Sb0((List) zg.q.b);
        this.L = sb0;
        sb0.a(this);
        e(sb0);
        C3692iN c3692iN = zg.r;
        if (c3692iN != null && (l8 = (L4) c3692iN.b) != null) {
            Object obj = l8.f3336a;
            if (((F4) obj) != null) {
                AbstractC5170z9 abstractC5170z9D = ((F4) obj).d();
                this.P = abstractC5170z9D;
                abstractC5170z9D.a(this);
                e(abstractC5170z9D);
            }
        }
        if (c3692iN != null && (l7 = (L4) c3692iN.b) != null) {
            Object obj2 = l7.d;
            if (((F4) obj2) != null) {
                AbstractC5170z9 abstractC5170z9D2 = ((F4) obj2).d();
                this.R = abstractC5170z9D2;
                abstractC5170z9D2.a(this);
                e(abstractC5170z9D2);
            }
        }
        if (c3692iN != null && (l6 = (L4) c3692iN.b) != null) {
            Object obj3 = l6.b;
            if (((G4) obj3) != null) {
                C3915kv c3915kvD = ((G4) obj3).d();
                this.T = c3915kvD;
                c3915kvD.a(this);
                e(c3915kvD);
            }
        }
        if (c3692iN != null && (l5 = (L4) c3692iN.b) != null) {
            Object obj4 = l5.c;
            if (((G4) obj4) != null) {
                C3915kv c3915kvD2 = ((G4) obj4).d();
                this.V = c3915kvD2;
                c3915kvD2.a(this);
                e(c3915kvD2);
            }
        }
        if (c3692iN != null && (l4 = (L4) c3692iN.b) != null) {
            Object obj5 = l4.e;
            if (((F4) obj5) != null) {
                AbstractC5170z9 abstractC5170z9D3 = ((F4) obj5).d();
                this.X = abstractC5170z9D3;
                abstractC5170z9D3.a(this);
                e(abstractC5170z9D3);
            }
        }
        if (c3692iN != null && (c3844k53 = (C3844k50) c3692iN.c) != null) {
            Object obj6 = c3844k53.b;
            if (((F4) obj6) != null) {
                AbstractC5170z9 abstractC5170z9D4 = ((F4) obj6).d();
                this.a0 = abstractC5170z9D4;
                abstractC5170z9D4.a(this);
                e(abstractC5170z9D4);
            }
        }
        if (c3692iN != null && (c3844k52 = (C3844k50) c3692iN.c) != null) {
            Object obj7 = c3844k52.c;
            if (((F4) obj7) != null) {
                AbstractC5170z9 abstractC5170z9D5 = ((F4) obj7).d();
                this.b0 = abstractC5170z9D5;
                abstractC5170z9D5.a(this);
                e(abstractC5170z9D5);
            }
        }
        if (c3692iN != null && (c3844k51 = (C3844k50) c3692iN.c) != null) {
            Object obj8 = c3844k51.d;
            if (((F4) obj8) != null) {
                AbstractC5170z9 abstractC5170z9D6 = ((F4) obj8).d();
                this.c0 = abstractC5170z9D6;
                abstractC5170z9D6.a(this);
                e(abstractC5170z9D6);
            }
        }
        if (c3692iN == null || (c3844k50 = (C3844k50) c3692iN.c) == null) {
            return;
        }
        this.O = (Xb0) c3844k50.e;
    }

    public static void t(String str, Tb0 tb0, Canvas canvas) {
        if (tb0.getColor() == 0) {
            return;
        }
        if (tb0.getStyle() == Paint.Style.STROKE && tb0.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, (Paint) tb0);
    }

    public static void u(Path path, Tb0 tb0, Canvas canvas) {
        if (tb0.getColor() == 0) {
            return;
        }
        if (tb0.getStyle() == Paint.Style.STROKE && tb0.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, tb0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2837Vp
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        MJ mj = this.N;
        rectF.set(0.0f, 0.0f, mj.k.width(), mj.k.height());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4826vG
    public final void g(C4215oK c4215oK, Object obj) {
        super.g(c4215oK, obj);
        PointF pointF = InterfaceC3689iK.f4497a;
        if (obj == 1) {
            C3103bh0 c3103bh0 = this.Q;
            if (c3103bh0 != null) {
                o(c3103bh0);
            }
            if (c4215oK == null) {
                this.Q = null;
                return;
            }
            C3103bh0 c3103bh1 = new C3103bh0(c4215oK, null);
            this.Q = c3103bh1;
            c3103bh1.a(this);
            e(this.Q);
            return;
        }
        if (obj == 2) {
            C3103bh0 c3103bh2 = this.S;
            if (c3103bh2 != null) {
                o(c3103bh2);
            }
            if (c4215oK == null) {
                this.S = null;
                return;
            }
            C3103bh0 c3103bh3 = new C3103bh0(c4215oK, null);
            this.S = c3103bh3;
            c3103bh3.a(this);
            e(this.S);
            return;
        }
        if (obj == InterfaceC3689iK.n) {
            C3103bh0 c3103bh4 = this.U;
            if (c3103bh4 != null) {
                o(c3103bh4);
            }
            if (c4215oK == null) {
                this.U = null;
                return;
            }
            C3103bh0 c3103bh5 = new C3103bh0(c4215oK, null);
            this.U = c3103bh5;
            c3103bh5.a(this);
            e(this.U);
            return;
        }
        if (obj == InterfaceC3689iK.o) {
            C3103bh0 c3103bh6 = this.W;
            if (c3103bh6 != null) {
                o(c3103bh6);
            }
            if (c4215oK == null) {
                this.W = null;
                return;
            }
            C3103bh0 c3103bh7 = new C3103bh0(c4215oK, null);
            this.W = c3103bh7;
            c3103bh7.a(this);
            e(this.W);
            return;
        }
        if (obj == InterfaceC3689iK.A) {
            C3103bh0 c3103bh8 = this.Y;
            if (c3103bh8 != null) {
                o(c3103bh8);
            }
            if (c4215oK == null) {
                this.Y = null;
                return;
            }
            C3103bh0 c3103bh9 = new C3103bh0(c4215oK, null);
            this.Y = c3103bh9;
            c3103bh9.a(this);
            e(this.Y);
            return;
        }
        if (obj != InterfaceC3689iK.H) {
            if (obj == InterfaceC3689iK.J) {
                Sb0 sb0 = this.L;
                sb0.getClass();
                sb0.j(new Rb0(new C3337eK(), c4215oK, new C5228zp()));
                return;
            }
            return;
        }
        C3103bh0 c3103bh10 = this.Z;
        if (c3103bh10 != null) {
            o(c3103bh10);
        }
        if (c4215oK == null) {
            this.Z = null;
            return;
        }
        C3103bh0 c3103bh11 = new C3103bh0(c4215oK, null);
        this.Z = c3103bh11;
        c3103bh11.a(this);
        e(this.Z);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0350  */
    /* JADX WARN: Code duplicated, block: B:119:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:121:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:122:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:126:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:128:0x0409  */
    /* JADX WARN: Code duplicated, block: B:131:0x0412  */
    /* JADX WARN: Code duplicated, block: B:134:0x042a  */
    /* JADX WARN: Code duplicated, block: B:150:0x047b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0484  */
    /* JADX WARN: Code duplicated, block: B:153:0x048f A[LOOP:9: B:152:0x048d->B:153:0x048f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:158:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:166:0x021a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x04d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x046e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:24:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:29:0x0114  */
    /* JADX WARN: Code duplicated, block: B:31:0x0129  */
    /* JADX WARN: Code duplicated, block: B:34:0x0132  */
    /* JADX WARN: Code duplicated, block: B:36:0x0146  */
    /* JADX WARN: Code duplicated, block: B:37:0x0154  */
    /* JADX WARN: Code duplicated, block: B:39:0x0163  */
    /* JADX WARN: Code duplicated, block: B:40:0x0174  */
    /* JADX WARN: Code duplicated, block: B:42:0x0188 A[LOOP:4: B:41:0x0186->B:42:0x0188, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x01ed  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B9
    public final void j(Canvas canvas, Matrix matrix, int i) {
        C3916kw c3916kw;
        String str;
        String str2;
        Typeface typeface;
        Typeface typefaceCreate;
        int i2;
        float fFloatValue;
        float fC;
        List listAsList;
        int size;
        int i3;
        int length;
        PointF pointF;
        float f;
        List listY;
        int i4;
        Ub0 ub0;
        int i5;
        String str3;
        int length2;
        int iCodePointAt;
        int iCharCount;
        C3916kw c3916kw2;
        int i6;
        long j;
        LongSparseArray longSparseArray;
        StringBuilder sb;
        int iCharCount2;
        String string;
        int iCodePointAt2;
        float fFloatValue2;
        float f2;
        int i7;
        PointF pointF2;
        float f3;
        float f4;
        Tb0 tb0;
        String str4;
        String str5;
        List listY2;
        int i8;
        Ub0 ub1;
        int i9;
        String str6;
        int i10;
        C4180nw c4180nw;
        HashMap map;
        List list;
        int size2;
        ArrayList arrayList;
        int i11;
        int i12;
        List list2;
        int i13;
        Path path;
        C5228zp c5228zp = (C5228zp) this.L.e();
        MJ mj = this.N;
        C3916kw c3916kw3 = (C3916kw) mj.f.get(c5228zp.b);
        if (c3916kw3 == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        s(c5228zp, i, 0);
        C3160cK c3160cK = this.M;
        Map map2 = c3160cK.j;
        C3915kv c3915kv = this.V;
        Tb0 tb1 = this.G;
        int i14 = -1;
        Tb0 tb2 = this.H;
        String str7 = c3916kw3.c;
        String str8 = c3916kw3.f4622a;
        if (map2 != null || c3160cK.f4216a.h.size() <= 0) {
            C3103bh0 c3103bh0 = this.Z;
            if (c3103bh0 == null || (typefaceCreate = (Typeface) c3103bh0.e()) == null) {
                Map map3 = c3160cK.j;
                if (map3 != null) {
                    str2 = str8;
                    if (map3.containsKey(str2)) {
                        typefaceCreate = (Typeface) map3.get(str2);
                        c3916kw = c3916kw3;
                    } else {
                        c3916kw = c3916kw3;
                        String str9 = c3916kw.b;
                        if (map3.containsKey(str9)) {
                            typeface = (Typeface) map3.get(str9);
                        } else {
                            str = str7;
                            String strI = DM.i(str2, "-", str);
                            if (map3.containsKey(strI)) {
                                typeface = (Typeface) map3.get(strI);
                            }
                        }
                        typefaceCreate = typeface;
                    }
                    if (typefaceCreate == null) {
                        typefaceCreate = c3916kw.d;
                    }
                } else {
                    c3916kw = c3916kw3;
                    str = str7;
                    str2 = str8;
                }
                C4092mw c4092mwI = c3160cK.i();
                if (c4092mwI != null) {
                    C3957lQ c3957lQ = (C3957lQ) c4092mwI.c;
                    c3957lQ.f4645a = str2;
                    c3957lQ.b = str;
                    typefaceCreate = (Typeface) ((Map) c4092mwI.b).get(c3957lQ);
                    if (typefaceCreate == null) {
                        typefaceCreate = (Typeface) ((Map) c4092mwI.d).get(str2);
                        if (typefaceCreate == null) {
                            AbstractC3950lJ.z(c4092mwI.f);
                            AbstractC3950lJ.z(c4092mwI.f);
                            typefaceCreate = c3916kw.d;
                            if (typefaceCreate == null) {
                                typefaceCreate = Typeface.createFromAsset((AssetManager) c4092mwI.e, "fonts/" + str2 + ((String) c4092mwI.f4722a));
                                ((Map) c4092mwI.d).put(str2, typefaceCreate);
                            }
                        }
                        boolean zContains = str.contains("Italic");
                        boolean zContains2 = str.contains("Bold");
                        if (zContains && zContains2) {
                            i2 = 3;
                        } else if (zContains) {
                            i2 = 2;
                        } else {
                            i2 = zContains2 ? 1 : 0;
                        }
                        if (typefaceCreate.getStyle() != i2) {
                            typefaceCreate = Typeface.create(typefaceCreate, i2);
                        }
                        ((Map) c4092mwI.b).put((C3957lQ) c4092mwI.c, typefaceCreate);
                    }
                } else {
                    typeface = null;
                    typefaceCreate = typeface;
                }
                if (typefaceCreate == null) {
                    typefaceCreate = c3916kw.d;
                }
            } else {
                c3916kw = c3916kw3;
            }
            if (typefaceCreate != null) {
                String str10 = c5228zp.f5346a;
                tb1.setTypeface(typefaceCreate);
                C3103bh0 c3103bh1 = this.Y;
                float fFloatValue3 = c3103bh1 != null ? ((Float) c3103bh1.e()).floatValue() : c5228zp.c;
                tb1.setTextSize(AbstractC3014ah0.c() * fFloatValue3);
                tb2.setTypeface(tb1.getTypeface());
                tb2.setTextSize(tb1.getTextSize());
                float f5 = c5228zp.e / 10.0f;
                C3103bh0 c3103bh2 = this.W;
                if (c3103bh2 != null) {
                    fFloatValue = ((Float) c3103bh2.e()).floatValue();
                } else {
                    if (c3915kv != null) {
                        fFloatValue = ((Float) c3915kv.e()).floatValue();
                    }
                    fC = ((AbstractC3014ah0.c() * f5) * fFloatValue3) / 100.0f;
                    listAsList = Arrays.asList(str10.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
                    size = listAsList.size();
                    i3 = 0;
                    length = 0;
                    while (i3 < size) {
                        String str11 = (String) listAsList.get(i3);
                        pointF = c5228zp.m;
                        if (pointF == null) {
                            f = 0.0f;
                        } else {
                            f = pointF.x;
                        }
                        int i15 = i3;
                        List list3 = listAsList;
                        listY = y(str11, f, c3916kw, 0.0f, fC, false);
                        i4 = 0;
                        while (i4 < listY.size()) {
                            ub0 = (Ub0) listY.get(i4);
                            i5 = i14 + 1;
                            canvas.save();
                            if (x(canvas, c5228zp, i5, ub0.b)) {
                                str3 = ub0.f3827a;
                                length2 = 0;
                                while (length2 < str3.length()) {
                                    iCodePointAt = str3.codePointAt(length2);
                                    int i16 = i5;
                                    List list4 = listY;
                                    iCharCount = Character.charCount(iCodePointAt) + length2;
                                    while (true) {
                                        if (iCharCount < str3.length()) {
                                            c3916kw2 = c3916kw;
                                            i6 = size;
                                            break;
                                        }
                                        iCodePointAt2 = str3.codePointAt(iCharCount);
                                        c3916kw2 = c3916kw;
                                        i6 = size;
                                        if (Character.getType(iCodePointAt2) == 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                                            break;
                                        }
                                        iCharCount += Character.charCount(iCodePointAt2);
                                        iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                        size = i6;
                                        c3916kw = c3916kw2;
                                    }
                                    j = iCodePointAt;
                                    longSparseArray = this.J;
                                    if (longSparseArray.containsKey(j)) {
                                        string = (String) longSparseArray.get(j);
                                    } else {
                                        sb = this.D;
                                        sb.setLength(0);
                                        iCharCount2 = length2;
                                        while (iCharCount2 < iCharCount) {
                                            int i17 = iCharCount;
                                            int iCodePointAt3 = str3.codePointAt(iCharCount2);
                                            sb.appendCodePoint(iCodePointAt3);
                                            iCharCount2 += Character.charCount(iCodePointAt3);
                                            iCharCount = i17;
                                        }
                                        string = sb.toString();
                                        longSparseArray.put(j, string);
                                    }
                                    s(c5228zp, i, length + length2);
                                    if (c5228zp.k) {
                                        t(string, tb1, canvas);
                                        t(string, tb2, canvas);
                                    } else {
                                        t(string, tb2, canvas);
                                        t(string, tb1, canvas);
                                    }
                                    canvas.translate(tb1.measureText(string) + fC, 0.0f);
                                    length2 += string.length();
                                    listY = list4;
                                    i5 = i16;
                                    size = i6;
                                    c3916kw = c3916kw2;
                                    i4 = i4;
                                }
                            }
                            i14 = i5;
                            length = ub0.f3827a.length() + length;
                            canvas.restore();
                            i4++;
                            listY = listY;
                            size = size;
                            c3916kw = c3916kw;
                        }
                        i3 = i15 + 1;
                        listAsList = list3;
                    }
                }
                f5 += fFloatValue;
                fC = ((AbstractC3014ah0.c() * f5) * fFloatValue3) / 100.0f;
                listAsList = Arrays.asList(str10.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
                size = listAsList.size();
                i3 = 0;
                length = 0;
                while (i3 < size) {
                    String str12 = (String) listAsList.get(i3);
                    pointF = c5228zp.m;
                    if (pointF == null) {
                        f = 0.0f;
                    } else {
                        f = pointF.x;
                    }
                    int i18 = i3;
                    List list5 = listAsList;
                    listY = y(str12, f, c3916kw, 0.0f, fC, false);
                    i4 = 0;
                    while (i4 < listY.size()) {
                        ub0 = (Ub0) listY.get(i4);
                        i5 = i14 + 1;
                        canvas.save();
                        if (x(canvas, c5228zp, i5, ub0.b)) {
                            str3 = ub0.f3827a;
                            length2 = 0;
                            while (length2 < str3.length()) {
                                iCodePointAt = str3.codePointAt(length2);
                                int i19 = i5;
                                List list6 = listY;
                                iCharCount = Character.charCount(iCodePointAt) + length2;
                                while (true) {
                                    if (iCharCount < str3.length()) {
                                        c3916kw2 = c3916kw;
                                        i6 = size;
                                        break;
                                    }
                                    iCodePointAt2 = str3.codePointAt(iCharCount);
                                    c3916kw2 = c3916kw;
                                    i6 = size;
                                    if (Character.getType(iCodePointAt2) == 16) {
                                    }
                                    iCharCount += Character.charCount(iCodePointAt2);
                                    iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                    size = i6;
                                    c3916kw = c3916kw2;
                                }
                                j = iCodePointAt;
                                longSparseArray = this.J;
                                if (longSparseArray.containsKey(j)) {
                                    string = (String) longSparseArray.get(j);
                                } else {
                                    sb = this.D;
                                    sb.setLength(0);
                                    iCharCount2 = length2;
                                    while (iCharCount2 < iCharCount) {
                                        int i110 = iCharCount;
                                        int iCodePointAt4 = str3.codePointAt(iCharCount2);
                                        sb.appendCodePoint(iCodePointAt4);
                                        iCharCount2 += Character.charCount(iCodePointAt4);
                                        iCharCount = i110;
                                    }
                                    string = sb.toString();
                                    longSparseArray.put(j, string);
                                }
                                s(c5228zp, i, length + length2);
                                if (c5228zp.k) {
                                    t(string, tb1, canvas);
                                    t(string, tb2, canvas);
                                } else {
                                    t(string, tb2, canvas);
                                    t(string, tb1, canvas);
                                }
                                canvas.translate(tb1.measureText(string) + fC, 0.0f);
                                length2 += string.length();
                                listY = list6;
                                i5 = i19;
                                size = i6;
                                c3916kw = c3916kw2;
                                i4 = i4;
                            }
                        }
                        i14 = i5;
                        length = ub0.f3827a.length() + length;
                        canvas.restore();
                        i4++;
                        listY = listY;
                        size = size;
                        c3916kw = c3916kw;
                    }
                    i3 = i18 + 1;
                    listAsList = list5;
                }
            }
        } else {
            C3103bh0 c3103bh3 = this.Y;
            float fFloatValue4 = (c3103bh3 != null ? ((Float) c3103bh3.e()).floatValue() : c5228zp.c) / 100.0f;
            float[] fArr = (float[]) AbstractC3014ah0.d.get();
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f6 = AbstractC3014ah0.e;
            fArr[2] = f6;
            fArr[3] = f6;
            matrix.mapPoints(fArr);
            C3160cK c3160cK2 = c3160cK;
            Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
            List listAsList2 = Arrays.asList(c5228zp.f5346a.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
            int size3 = listAsList2.size();
            float f7 = c5228zp.e / 10.0f;
            C3103bh0 c3103bh4 = this.W;
            if (c3103bh4 != null) {
                fFloatValue2 = ((Float) c3103bh4.e()).floatValue();
            } else {
                if (c3915kv != null) {
                    fFloatValue2 = ((Float) c3915kv.e()).floatValue();
                }
                f2 = f7;
                i7 = 0;
                while (i7 < size3) {
                    String str13 = (String) listAsList2.get(i7);
                    pointF2 = c5228zp.m;
                    if (pointF2 == null) {
                        f3 = 0.0f;
                    } else {
                        f3 = pointF2.x;
                    }
                    f4 = fFloatValue4;
                    C3916kw c3916kw4 = c3916kw3;
                    List list7 = listAsList2;
                    int i20 = size3;
                    int i21 = i7;
                    tb0 = tb2;
                    str4 = str8;
                    C3916kw c3916kw5 = c3916kw3;
                    str5 = str7;
                    listY2 = y(str13, f3, c3916kw4, f4, f2, true);
                    i8 = 0;
                    while (i8 < listY2.size()) {
                        ub1 = (Ub0) listY2.get(i8);
                        i9 = i14 + 1;
                        canvas.save();
                        if (x(canvas, c5228zp, i9, ub1.b)) {
                            str6 = ub1.f3827a;
                            i10 = 0;
                            while (i10 < str6.length()) {
                                List list8 = listY2;
                                c4180nw = (C4180nw) mj.h.get(C4180nw.a(str6.charAt(i10), str4, str5));
                                if (c4180nw == null) {
                                    i12 = i8;
                                    i9 = i9;
                                    str5 = str5;
                                    str4 = str4;
                                    c3160cK2 = c3160cK2;
                                } else {
                                    s(c5228zp, i, i10);
                                    map = this.I;
                                    if (map.containsKey(c4180nw)) {
                                        list2 = (List) map.get(c4180nw);
                                        i12 = i8;
                                    } else {
                                        list = c4180nw.f4767a;
                                        size2 = list.size();
                                        arrayList = new ArrayList(size2);
                                        i11 = 0;
                                        while (i11 < size2) {
                                            arrayList.add(new C2623Nj(c3160cK2, this, (C3408f60) list.get(i11), mj));
                                            i11++;
                                            size2 = size2;
                                            list = list;
                                            i8 = i8;
                                        }
                                        i12 = i8;
                                        map.put(c4180nw, arrayList);
                                        list2 = arrayList;
                                    }
                                    i13 = 0;
                                    while (i13 < list2.size()) {
                                        path = ((C2623Nj) list2.get(i13)).getPath();
                                        path.computeBounds(this.E, false);
                                        Matrix matrix2 = this.F;
                                        matrix2.reset();
                                        List list9 = list2;
                                        matrix2.preTranslate(0.0f, (-c5228zp.g) * AbstractC3014ah0.c());
                                        matrix2.preScale(f4, f4);
                                        path.transform(matrix2);
                                        if (c5228zp.k) {
                                            u(path, tb1, canvas);
                                            u(path, tb0, canvas);
                                        } else {
                                            u(path, tb0, canvas);
                                            u(path, tb1, canvas);
                                        }
                                        i13++;
                                        list2 = list9;
                                    }
                                    canvas.translate((AbstractC3014ah0.c() * ((float) c4180nw.c) * f4) + f2, 0.0f);
                                }
                                i10++;
                                c3160cK2 = c3160cK2;
                                listY2 = list8;
                                str6 = str6;
                                i9 = i9;
                                str5 = str5;
                                str4 = str4;
                                i8 = i12;
                            }
                        }
                        canvas.restore();
                        c3160cK2 = c3160cK2;
                        i14 = i9;
                        str5 = str5;
                        str4 = str4;
                        i8++;
                        listY2 = listY2;
                    }
                    String str14 = str5;
                    String str15 = str4;
                    i7 = i21 + 1;
                    c3916kw3 = c3916kw5;
                    str7 = str14;
                    str8 = str15;
                    fFloatValue4 = f4;
                    tb2 = tb0;
                    size3 = i20;
                    listAsList2 = list7;
                }
            }
            f7 += fFloatValue2;
            f2 = f7;
            i7 = 0;
            while (i7 < size3) {
                String str16 = (String) listAsList2.get(i7);
                pointF2 = c5228zp.m;
                if (pointF2 == null) {
                    f3 = 0.0f;
                } else {
                    f3 = pointF2.x;
                }
                f4 = fFloatValue4;
                C3916kw c3916kw6 = c3916kw3;
                List list10 = listAsList2;
                int i22 = size3;
                int i23 = i7;
                tb0 = tb2;
                str4 = str8;
                C3916kw c3916kw7 = c3916kw3;
                str5 = str7;
                listY2 = y(str16, f3, c3916kw6, f4, f2, true);
                i8 = 0;
                while (i8 < listY2.size()) {
                    ub1 = (Ub0) listY2.get(i8);
                    i9 = i14 + 1;
                    canvas.save();
                    if (x(canvas, c5228zp, i9, ub1.b)) {
                        str6 = ub1.f3827a;
                        i10 = 0;
                        while (i10 < str6.length()) {
                            List list11 = listY2;
                            c4180nw = (C4180nw) mj.h.get(C4180nw.a(str6.charAt(i10), str4, str5));
                            if (c4180nw == null) {
                                i12 = i8;
                                i9 = i9;
                                str5 = str5;
                                str4 = str4;
                                c3160cK2 = c3160cK2;
                            } else {
                                s(c5228zp, i, i10);
                                map = this.I;
                                if (map.containsKey(c4180nw)) {
                                    list2 = (List) map.get(c4180nw);
                                    i12 = i8;
                                } else {
                                    list = c4180nw.f4767a;
                                    size2 = list.size();
                                    arrayList = new ArrayList(size2);
                                    i11 = 0;
                                    while (i11 < size2) {
                                        arrayList.add(new C2623Nj(c3160cK2, this, (C3408f60) list.get(i11), mj));
                                        i11++;
                                        size2 = size2;
                                        list = list;
                                        i8 = i8;
                                    }
                                    i12 = i8;
                                    map.put(c4180nw, arrayList);
                                    list2 = arrayList;
                                }
                                i13 = 0;
                                while (i13 < list2.size()) {
                                    path = ((C2623Nj) list2.get(i13)).getPath();
                                    path.computeBounds(this.E, false);
                                    Matrix matrix3 = this.F;
                                    matrix3.reset();
                                    List list12 = list2;
                                    matrix3.preTranslate(0.0f, (-c5228zp.g) * AbstractC3014ah0.c());
                                    matrix3.preScale(f4, f4);
                                    path.transform(matrix3);
                                    if (c5228zp.k) {
                                        u(path, tb1, canvas);
                                        u(path, tb0, canvas);
                                    } else {
                                        u(path, tb0, canvas);
                                        u(path, tb1, canvas);
                                    }
                                    i13++;
                                    list2 = list12;
                                }
                                canvas.translate((AbstractC3014ah0.c() * ((float) c4180nw.c) * f4) + f2, 0.0f);
                            }
                            i10++;
                            c3160cK2 = c3160cK2;
                            listY2 = list11;
                            str6 = str6;
                            i9 = i9;
                            str5 = str5;
                            str4 = str4;
                            i8 = i12;
                        }
                    }
                    canvas.restore();
                    c3160cK2 = c3160cK2;
                    i14 = i9;
                    str5 = str5;
                    str4 = str4;
                    i8++;
                    listY2 = listY2;
                }
                String str17 = str5;
                String str18 = str4;
                i7 = i23 + 1;
                c3916kw3 = c3916kw7;
                str7 = str17;
                str8 = str18;
                fFloatValue4 = f4;
                tb2 = tb0;
                size3 = i22;
                listAsList2 = list10;
            }
        }
        canvas.restore();
    }

    public final void s(C5228zp c5228zp, int i, int i2) {
        C3103bh0 c3103bh0 = this.Q;
        Tb0 tb0 = this.G;
        if (c3103bh0 != null) {
            tb0.setColor(((Integer) c3103bh0.e()).intValue());
        } else {
            AbstractC5170z9 abstractC5170z9 = this.P;
            if (abstractC5170z9 == null || !w(i2)) {
                tb0.setColor(c5228zp.h);
            } else {
                tb0.setColor(((Integer) abstractC5170z9.e()).intValue());
            }
        }
        C3103bh0 c3103bh1 = this.S;
        Tb0 tb1 = this.H;
        if (c3103bh1 != null) {
            tb1.setColor(((Integer) c3103bh1.e()).intValue());
        } else {
            AbstractC5170z9 abstractC5170z10 = this.R;
            if (abstractC5170z10 == null || !w(i2)) {
                tb1.setColor(c5228zp.i);
            } else {
                tb1.setColor(((Integer) abstractC5170z10.e()).intValue());
            }
        }
        AbstractC5170z9 abstractC5170z11 = this.w.j;
        int iIntValue = 100;
        int iIntValue2 = abstractC5170z11 == null ? 100 : ((Integer) abstractC5170z11.e()).intValue();
        AbstractC5170z9 abstractC5170z12 = this.X;
        if (abstractC5170z12 != null && w(i2)) {
            iIntValue = ((Integer) abstractC5170z12.e()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i) / 255.0f);
        tb0.setAlpha(iRound);
        tb1.setAlpha(iRound);
        C3103bh0 c3103bh2 = this.U;
        if (c3103bh2 != null) {
            tb1.setStrokeWidth(((Float) c3103bh2.e()).floatValue());
            return;
        }
        C3915kv c3915kv = this.T;
        if (c3915kv == null || !w(i2)) {
            tb1.setStrokeWidth(AbstractC3014ah0.c() * c5228zp.j);
        } else {
            tb1.setStrokeWidth(((Float) c3915kv.e()).floatValue());
        }
    }

    public final Ub0 v(int i) {
        ArrayList arrayList = this.K;
        for (int size = arrayList.size(); size < i; size++) {
            Ub0 ub0 = new Ub0();
            ub0.f3827a = "";
            ub0.b = 0.0f;
            arrayList.add(ub0);
        }
        return (Ub0) arrayList.get(i - 1);
    }

    public final boolean w(int i) {
        AbstractC5170z9 abstractC5170z9;
        int length = ((C5228zp) this.L.e()).f5346a.length();
        AbstractC5170z9 abstractC5170z10 = this.a0;
        if (abstractC5170z10 == null || (abstractC5170z9 = this.b0) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) abstractC5170z10.e()).intValue(), ((Integer) abstractC5170z9.e()).intValue());
        int iMax = Math.max(((Integer) abstractC5170z10.e()).intValue(), ((Integer) abstractC5170z9.e()).intValue());
        AbstractC5170z9 abstractC5170z11 = this.c0;
        if (abstractC5170z11 != null) {
            int iIntValue = ((Integer) abstractC5170z11.e()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.O == Xb0.b) {
            return i >= iMin && i < iMax;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) iMin) && f < ((float) iMax);
    }

    public final boolean x(Canvas canvas, C5228zp c5228zp, int i, float f) {
        PointF pointF = c5228zp.l;
        PointF pointF2 = c5228zp.m;
        float fC = AbstractC3014ah0.c();
        float fA = DM.A(i, c5228zp.f, fC, pointF == null ? 0.0f : (c5228zp.f * fC) + pointF.y);
        if (this.M.t && pointF2 != null && pointF != null && fA >= pointF.y + pointF2.y + c5228zp.c) {
            return false;
        }
        float f2 = pointF == null ? 0.0f : pointF.x;
        float f3 = pointF2 != null ? pointF2.x : 0.0f;
        int iD = DM.D(c5228zp.d);
        if (iD == 0) {
            canvas.translate(f2, fA);
        } else if (iD == 1) {
            canvas.translate((f2 + f3) - f, fA);
        } else if (iD == 2) {
            canvas.translate(((f3 / 2.0f) + f2) - (f / 2.0f), fA);
        }
        return true;
    }

    public final List y(String str, float f, C3916kw c3916kw, float f2, float f3, boolean z) {
        float fMeasureText;
        float f4 = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        float f5 = 0.0f;
        int i3 = 0;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                C4180nw c4180nw = (C4180nw) this.N.h.get(C4180nw.a(cCharAt, c3916kw.f4622a, c3916kw.c));
                if (c4180nw != null) {
                    fMeasureText = (AbstractC3014ah0.c() * ((float) c4180nw.c) * f2) + f3;
                }
            } else {
                fMeasureText = this.G.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (cCharAt == ' ') {
                z2 = true;
                f6 = fMeasureText;
            } else if (z2) {
                i3 = i4;
                f5 = fMeasureText;
                z2 = false;
            } else {
                f5 += fMeasureText;
            }
            f4 += fMeasureText;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i++;
                Ub0 ub0V = v(i);
                if (i3 == i2) {
                    String strSubstring = str.substring(i2, i4);
                    String strTrim = strSubstring.trim();
                    float length = (f4 - fMeasureText) - ((strTrim.length() - strSubstring.length()) * f6);
                    ub0V.f3827a = strTrim;
                    ub0V.b = length;
                    i2 = i4;
                    i3 = i2;
                    f4 = fMeasureText;
                    f5 = f4;
                } else {
                    String strSubstring2 = str.substring(i2, i3 - 1);
                    String strTrim2 = strSubstring2.trim();
                    float length2 = ((f4 - f5) - ((strSubstring2.length() - strTrim2.length()) * f6)) - f6;
                    ub0V.f3827a = strTrim2;
                    ub0V.b = length2;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            Ub0 ub0V2 = v(i);
            ub0V2.f3827a = str.substring(i2);
            ub0V2.b = f4;
        }
        return this.K.subList(0, i);
    }
}
