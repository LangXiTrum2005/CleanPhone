package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.badlogic.gdx.Input;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3885kd extends AbstractC4149nd {
    public final JT g = new JT();
    public final Uh0 h = new Uh0();
    public int i = -1;
    public final int j;
    public final C3797jd[] k;
    public C3797jd l;
    public List m;
    public List n;
    public Uh0 o;
    public int p;

    public C3885kd(int i, List list) {
        this.j = i == -1 ? 1 : i;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b = ((byte[]) list.get(0))[0];
        }
        this.k = new C3797jd[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.k[i2] = new C3797jd();
        }
        this.l = this.k[0];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4149nd
    public final C4237od b() {
        List list = this.m;
        this.n = list;
        list.getClass();
        return new C4237od(list, 0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4149nd
    public final void c(C3973ld c3973ld) {
        ByteBuffer byteBuffer = c3973ld.d;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        JT jt = this.g;
        jt.C(bArrArray, iLimit);
        while (jt.a() >= 3) {
            int iT = jt.t();
            int i = iT & 3;
            boolean z = (iT & 4) == 4;
            byte bT = (byte) jt.t();
            byte bT2 = (byte) jt.t();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        f();
                        int i2 = (bT & 192) >> 6;
                        int i3 = this.i;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            h();
                            AbstractC4038mJ.f();
                        }
                        this.i = i2;
                        int i4 = bT & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        Uh0 uh0 = new Uh0(i2, i4);
                        this.o = uh0;
                        byte[] bArr = uh0.d;
                        int i5 = uh0.e;
                        uh0.e = i5 + 1;
                        bArr[i5] = bT2;
                    } else {
                        FW.h(i == 2);
                        Uh0 uh1 = this.o;
                        if (uh1 == null) {
                            AbstractC4038mJ.c();
                        } else {
                            byte[] bArr2 = uh1.d;
                            int i6 = uh1.e;
                            bArr2[i6] = bT;
                            uh1.e = i6 + 2;
                            bArr2[i6 + 1] = bT2;
                        }
                    }
                    Uh0 uh2 = this.o;
                    if (uh2.e == (uh2.c * 2) - 1) {
                        f();
                    }
                }
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4149nd
    public final boolean e() {
        return this.m != this.n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:234:0x04ff  */
    public final void f() {
        Uh0 uh0 = this.o;
        if (uh0 == null) {
            return;
        }
        int i = 2;
        if (uh0.e != (uh0.c * 2) - 1) {
            int i2 = uh0.b;
            AbstractC4038mJ.b();
        }
        Uh0 uh1 = this.o;
        byte[] bArr = uh1.d;
        int i3 = uh1.e;
        Uh0 uh2 = this.h;
        uh2.o(bArr, i3);
        boolean z = false;
        while (uh2.b() > 0) {
            int i4 = 3;
            int i5 = uh2.i(3);
            int i6 = uh2.i(5);
            int i7 = 7;
            if (i5 == 7) {
                uh2.s(i);
                i5 = uh2.i(6);
                if (i5 < 7) {
                    AbstractC4038mJ.f();
                }
            }
            if (i6 == 0) {
                if (i5 != 0) {
                    AbstractC4038mJ.f();
                }
                if (z) {
                    this.m = g();
                }
                this.o = null;
            }
            if (i5 != this.j) {
                uh2.t(i6);
            } else {
                int iG = (i6 * 8) + uh2.g();
                while (uh2.g() < iG) {
                    int i8 = uh2.i(8);
                    if (i8 == 16) {
                        iG = iG;
                        int i9 = uh2.i(8);
                        if (i9 <= 31) {
                            i7 = 7;
                            if (i9 > 7) {
                                if (i9 <= 15) {
                                    uh2.s(8);
                                } else if (i9 <= 23) {
                                    uh2.s(16);
                                } else if (i9 <= 31) {
                                    uh2.s(24);
                                }
                            }
                        } else {
                            i7 = 7;
                            if (i9 <= 127) {
                                if (i9 == 32) {
                                    this.l.a(' ');
                                } else if (i9 == 33) {
                                    this.l.a((char) 160);
                                } else if (i9 == 37) {
                                    this.l.a((char) 8230);
                                } else if (i9 == 42) {
                                    this.l.a((char) 352);
                                } else if (i9 == 44) {
                                    this.l.a((char) 338);
                                } else if (i9 == 63) {
                                    this.l.a((char) 376);
                                } else if (i9 == 57) {
                                    this.l.a((char) 8482);
                                } else if (i9 == 58) {
                                    this.l.a((char) 353);
                                } else if (i9 == 60) {
                                    this.l.a((char) 339);
                                } else if (i9 != 61) {
                                    switch (i9) {
                                        case 48:
                                            this.l.a((char) 9608);
                                            break;
                                        case 49:
                                            this.l.a((char) 8216);
                                            break;
                                        case 50:
                                            this.l.a((char) 8217);
                                            break;
                                        case 51:
                                            this.l.a((char) 8220);
                                            break;
                                        case 52:
                                            this.l.a((char) 8221);
                                            break;
                                        case 53:
                                            this.l.a((char) 8226);
                                            break;
                                        default:
                                            switch (i9) {
                                                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                                    this.l.a((char) 8539);
                                                    break;
                                                case JSON_ENCODE_ERROR_VALUE:
                                                    this.l.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.l.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.l.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.l.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.l.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.l.a((char) 9492);
                                                    break;
                                                case INVALID_METRICS_ENDPOINT_VALUE:
                                                    this.l.a((char) 9472);
                                                    break;
                                                case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                                                    this.l.a((char) 9496);
                                                    break;
                                                case ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:
                                                    this.l.a((char) 9484);
                                                    break;
                                                default:
                                                    AbstractC4038mJ.f();
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.l.a((char) 8480);
                                }
                                z = true;
                            } else {
                                if (i9 <= 159) {
                                    if (i9 <= 135) {
                                        uh2.s(32);
                                    } else if (i9 <= 143) {
                                        uh2.s(40);
                                    } else if (i9 <= 159) {
                                        uh2.s(2);
                                        uh2.s(uh2.i(6) * 8);
                                    }
                                } else if (i9 <= 255) {
                                    if (i9 == 160) {
                                        this.l.a((char) 13252);
                                    } else {
                                        AbstractC4038mJ.f();
                                        this.l.a('_');
                                    }
                                    z = true;
                                } else {
                                    AbstractC4038mJ.f();
                                }
                                iG = iG;
                                i = 2;
                                i4 = 3;
                            }
                        }
                    } else if (i8 <= 31) {
                        if (i8 != 0) {
                            if (i8 == i4) {
                                this.m = g();
                            } else if (i8 != 8) {
                                switch (i8) {
                                    case 12:
                                        h();
                                        break;
                                    case 13:
                                        this.l.a('\n');
                                        break;
                                    case 14:
                                        break;
                                    default:
                                        if (i8 >= 17 && i8 <= 23) {
                                            AbstractC4038mJ.f();
                                            uh2.s(8);
                                        } else if (i8 < 24 || i8 > 31) {
                                            AbstractC4038mJ.f();
                                        } else {
                                            AbstractC4038mJ.f();
                                            uh2.s(16);
                                        }
                                        break;
                                }
                            } else {
                                SpannableStringBuilder spannableStringBuilder = this.l.b;
                                int length = spannableStringBuilder.length();
                                if (length > 0) {
                                    spannableStringBuilder.delete(length - 1, length);
                                }
                            }
                        }
                    } else if (i8 <= 127) {
                        if (i8 == 127) {
                            this.l.a((char) 9835);
                        } else {
                            this.l.a((char) (i8 & 255));
                        }
                        z = true;
                    } else {
                        if (i8 <= 159) {
                            C3797jd[] c3797jdArr = this.k;
                            switch (i8) {
                                case 128:
                                case 129:
                                case 130:
                                case 131:
                                case 132:
                                case 133:
                                case 134:
                                case 135:
                                    iG = iG;
                                    int i10 = i8 - 128;
                                    if (this.p != i10) {
                                        this.p = i10;
                                        this.l = c3797jdArr[i10];
                                    }
                                    break;
                                case 136:
                                    iG = iG;
                                    for (int i11 = 1; i11 <= 8; i11++) {
                                        if (uh2.h()) {
                                            C3797jd c3797jd = c3797jdArr[8 - i11];
                                            c3797jd.f4560a.clear();
                                            c3797jd.b.clear();
                                            c3797jd.p = -1;
                                            c3797jd.q = -1;
                                            c3797jd.r = -1;
                                            c3797jd.t = -1;
                                            c3797jd.v = 0;
                                        }
                                    }
                                    break;
                                case 137:
                                    iG = iG;
                                    for (int i12 = 1; i12 <= 8; i12++) {
                                        if (uh2.h()) {
                                            c3797jdArr[8 - i12].d = true;
                                        }
                                    }
                                    break;
                                case 138:
                                    iG = iG;
                                    for (int i13 = 1; i13 <= 8; i13++) {
                                        if (uh2.h()) {
                                            c3797jdArr[8 - i13].d = false;
                                        }
                                    }
                                    break;
                                case Input.Keys.F9 /* 139 */:
                                    iG = iG;
                                    for (int i14 = 1; i14 <= 8; i14++) {
                                        if (uh2.h()) {
                                            C3797jd c3797jd2 = c3797jdArr[8 - i14];
                                            c3797jd2.d = !c3797jd2.d;
                                        }
                                    }
                                    break;
                                case Input.Keys.F10 /* 140 */:
                                    iG = iG;
                                    for (int i15 = 1; i15 <= 8; i15++) {
                                        if (uh2.h()) {
                                            c3797jdArr[8 - i15].d();
                                        }
                                    }
                                    break;
                                case Input.Keys.F11 /* 141 */:
                                    iG = iG;
                                    uh2.s(8);
                                    break;
                                case Input.Keys.F12 /* 142 */:
                                    iG = iG;
                                    break;
                                case Input.Keys.NUM_LOCK /* 143 */:
                                    iG = iG;
                                    h();
                                    break;
                                case Input.Keys.NUMPAD_0 /* 144 */:
                                    iG = iG;
                                    if (this.l.c) {
                                        uh2.i(4);
                                        uh2.i(2);
                                        uh2.i(2);
                                        boolean zH = uh2.h();
                                        boolean zH2 = uh2.h();
                                        uh2.i(3);
                                        uh2.i(3);
                                        this.l.e(zH, zH2);
                                    } else {
                                        uh2.s(16);
                                    }
                                    break;
                                case Input.Keys.NUMPAD_1 /* 145 */:
                                    iG = iG;
                                    if (this.l.c) {
                                        int iC = C3797jd.c(uh2.i(2), uh2.i(2), uh2.i(2), uh2.i(2));
                                        int iC2 = C3797jd.c(uh2.i(2), uh2.i(2), uh2.i(2), uh2.i(2));
                                        uh2.s(2);
                                        C3797jd.c(uh2.i(2), uh2.i(2), uh2.i(2), 0);
                                        this.l.f(iC, iC2);
                                    } else {
                                        uh2.s(24);
                                    }
                                    break;
                                case Input.Keys.NUMPAD_2 /* 146 */:
                                    iG = iG;
                                    if (this.l.c) {
                                        uh2.s(4);
                                        int i16 = uh2.i(4);
                                        uh2.s(2);
                                        uh2.i(6);
                                        C3797jd c3797jd3 = this.l;
                                        if (c3797jd3.v != i16) {
                                            c3797jd3.a('\n');
                                        }
                                        c3797jd3.v = i16;
                                    } else {
                                        uh2.s(16);
                                    }
                                    break;
                                case Input.Keys.NUMPAD_3 /* 147 */:
                                case Input.Keys.NUMPAD_4 /* 148 */:
                                case Input.Keys.NUMPAD_5 /* 149 */:
                                case Input.Keys.NUMPAD_6 /* 150 */:
                                default:
                                    AbstractC4038mJ.f();
                                    iG = iG;
                                    break;
                                case Input.Keys.NUMPAD_7 /* 151 */:
                                    iG = iG;
                                    if (this.l.c) {
                                        int iC3 = C3797jd.c(uh2.i(2), uh2.i(2), uh2.i(2), uh2.i(2));
                                        uh2.i(2);
                                        C3797jd.c(uh2.i(2), uh2.i(2), uh2.i(2), 0);
                                        uh2.h();
                                        uh2.h();
                                        uh2.i(2);
                                        uh2.i(2);
                                        int i17 = uh2.i(2);
                                        uh2.s(8);
                                        C3797jd c3797jd4 = this.l;
                                        c3797jd4.o = iC3;
                                        c3797jd4.l = i17;
                                    } else {
                                        uh2.s(32);
                                    }
                                    break;
                                case Input.Keys.NUMPAD_8 /* 152 */:
                                case Input.Keys.NUMPAD_9 /* 153 */:
                                case Input.Keys.NUMPAD_DIVIDE /* 154 */:
                                case Input.Keys.NUMPAD_MULTIPLY /* 155 */:
                                case Input.Keys.NUMPAD_SUBTRACT /* 156 */:
                                case Input.Keys.NUMPAD_ADD /* 157 */:
                                case Input.Keys.NUMPAD_DOT /* 158 */:
                                case Input.Keys.NUMPAD_COMMA /* 159 */:
                                    int i18 = i8 - 152;
                                    C3797jd c3797jd5 = c3797jdArr[i18];
                                    uh2.s(i);
                                    boolean zH3 = uh2.h();
                                    boolean zH4 = uh2.h();
                                    uh2.h();
                                    int i19 = uh2.i(i4);
                                    boolean zH5 = uh2.h();
                                    int i20 = uh2.i(i7);
                                    int i21 = uh2.i(8);
                                    int i22 = uh2.i(4);
                                    int i23 = uh2.i(4);
                                    uh2.s(i);
                                    uh2.i(6);
                                    uh2.s(i);
                                    int i24 = uh2.i(3);
                                    iG = iG;
                                    int i25 = uh2.i(3);
                                    c3797jd5.c = true;
                                    c3797jd5.d = zH3;
                                    c3797jd5.k = zH4;
                                    c3797jd5.e = i19;
                                    c3797jd5.f = zH5;
                                    c3797jd5.g = i20;
                                    c3797jd5.h = i21;
                                    c3797jd5.i = i22;
                                    int i26 = i23 + 1;
                                    if (c3797jd5.j != i26) {
                                        c3797jd5.j = i26;
                                        while (true) {
                                            ArrayList arrayList = c3797jd5.f4560a;
                                            if ((zH4 && arrayList.size() >= c3797jd5.j) || arrayList.size() >= 15) {
                                                arrayList.remove(0);
                                            }
                                        }
                                    }
                                    if (i24 != 0 && c3797jd5.m != i24) {
                                        c3797jd5.m = i24;
                                        int i27 = i24 - 1;
                                        int i28 = C3797jd.C[i27];
                                        boolean z2 = C3797jd.B[i27];
                                        int i29 = C3797jd.z[i27];
                                        int i30 = C3797jd.A[i27];
                                        int i31 = C3797jd.y[i27];
                                        c3797jd5.o = i28;
                                        c3797jd5.l = i31;
                                    }
                                    if (i25 != 0 && c3797jd5.n != i25) {
                                        c3797jd5.n = i25;
                                        int i32 = i25 - 1;
                                        int i33 = C3797jd.E[i32];
                                        int i34 = C3797jd.D[i32];
                                        c3797jd5.e(false, false);
                                        c3797jd5.f(C3797jd.w, C3797jd.F[i32]);
                                    }
                                    if (this.p != i18) {
                                        this.p = i18;
                                        this.l = c3797jdArr[i18];
                                    }
                                    break;
                            }
                        } else {
                            iG = iG;
                            if (i8 <= 255) {
                                this.l.a((char) (i8 & 255));
                            } else {
                                AbstractC4038mJ.f();
                            }
                            i7 = 7;
                        }
                        z = true;
                        i7 = 7;
                    }
                    iG = iG;
                    i = 2;
                    i4 = 3;
                }
            }
        }
        if (z) {
            this.m = g();
        }
        this.o = null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4149nd, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2574Ll
    public final void flush() {
        super.flush();
        this.m = null;
        this.n = null;
        this.p = 0;
        this.l = this.k[0];
        h();
        this.o = null;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    public final List g() {
        C3711id c3711id;
        Layout.Alignment alignment;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C3797jd[] c3797jdArr = this.k;
            C3797jd c3797jd = c3797jdArr[i];
            if (c3797jd.c && (!c3797jd.f4560a.isEmpty() || c3797jd.b.length() != 0)) {
                C3797jd c3797jd2 = c3797jdArr[i];
                if (c3797jd2.d) {
                    if (c3797jd2.c) {
                        ArrayList arrayList2 = c3797jd2.f4560a;
                        if (arrayList2.isEmpty() && c3797jd2.b.length() == 0) {
                            c3711id = null;
                        } else {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                                spannableStringBuilder.append((CharSequence) arrayList2.get(i2));
                                spannableStringBuilder.append('\n');
                            }
                            spannableStringBuilder.append((CharSequence) c3797jd2.b());
                            int i3 = c3797jd2.l;
                            if (i3 == 0) {
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            } else if (i3 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i3 != 2) {
                                if (i3 != 3) {
                                    throw new IllegalArgumentException("Unexpected justification value: " + c3797jd2.l);
                                }
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            } else {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            }
                            Layout.Alignment alignment2 = alignment;
                            if (c3797jd2.f) {
                                f = c3797jd2.h / 99.0f;
                                f2 = c3797jd2.g / 99.0f;
                            } else {
                                f = c3797jd2.h / 209.0f;
                                f2 = c3797jd2.g / 74.0f;
                            }
                            float f3 = (f * 0.9f) + 0.05f;
                            float f4 = (f2 * 0.9f) + 0.05f;
                            int i4 = c3797jd2.i;
                            int i5 = i4 / 3;
                            int i6 = i5 == 0 ? 0 : i5 == 1 ? 1 : 2;
                            int i7 = i4 % 3;
                            int i8 = i7 == 0 ? 0 : i7 == 1 ? 1 : 2;
                            int i9 = c3797jd2.o;
                            c3711id = new C3711id(spannableStringBuilder, alignment2, f4, i6, f3, i8, i9 != C3797jd.x, i9, c3797jd2.e);
                        }
                    } else {
                        c3711id = null;
                    }
                    if (c3711id != null) {
                        arrayList.add(c3711id);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, C3711id.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList3.add(((C3711id) arrayList.get(i10)).f4511a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void h() {
        for (int i = 0; i < 8; i++) {
            this.k[i].d();
        }
    }
}
