package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PP implements InterfaceC4177nt, O30 {
    public int i;
    public long j;
    public int k;
    public JT l;
    public int n;
    public int o;
    public int p;
    public long[][] s;
    public int t;
    public long u;
    public int v;
    public int h = 0;
    public final U30 f = new U30();
    public final ArrayList g = new ArrayList();
    public final JT d = new JT(16);
    public final ArrayDeque e = new ArrayDeque();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JT f3551a = new JT(AbstractC5188zQ.f5325a);
    public final JT b = new JT(4);
    public final JT c = new JT();
    public int m = -1;
    public InterfaceC4353pt q = InterfaceC4353pt.f1;
    public OP[] r = new OP[0];

    /* JADX WARN: Code duplicated, block: B:331:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x0158 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final int a(InterfaceC4265ot interfaceC4265ot, C2868Wu c2868Wu) throws KT {
        int i;
        ArrayList arrayList;
        byte b;
        char c;
        int i2;
        ArrayList arrayList2;
        List listA;
        int i3;
        List listA2;
        M6 m6;
        while (true) {
            int i4 = this.h;
            ArrayDeque arrayDeque = this.e;
            int i5 = 4;
            boolean z = false;
            JT jt = this.c;
            if (i4 == 0) {
                int i6 = this.k;
                JT jt2 = this.d;
                if (i6 == 0) {
                    if (!interfaceC4265ot.readFully(jt2.f3266a, 0, 8, true)) {
                        return -1;
                    }
                    this.k = 8;
                    jt2.E(0);
                    this.j = jt2.u();
                    this.i = jt2.f();
                }
                long j = this.j;
                if (j == 1) {
                    interfaceC4265ot.readFully(jt2.f3266a, 8, 8);
                    this.k += 8;
                    this.j = jt2.x();
                } else if (j == 0) {
                    long length = interfaceC4265ot.getLength();
                    if (length == -1 && (m6 = (M6) arrayDeque.peek()) != null) {
                        length = m6.c;
                    }
                    if (length != -1) {
                        this.j = (length - interfaceC4265ot.getPosition()) + ((long) this.k);
                    }
                }
                long j2 = this.j;
                int i7 = this.k;
                if (j2 < i7) {
                    throw KT.c("Atom size less than header length (unsupported).");
                }
                int i8 = this.i;
                if (i8 == 1836019574 || i8 == 1953653099 || i8 == 1835297121 || i8 == 1835626086 || i8 == 1937007212 || i8 == 1701082227 || i8 == 1835365473) {
                    long position = interfaceC4265ot.getPosition();
                    long j3 = this.j;
                    long j4 = this.k;
                    long j5 = (position + j3) - j4;
                    if (j3 != j4 && this.i == 1835365473) {
                        jt.B(8);
                        interfaceC4265ot.peekFully(jt.f3266a, 0, 8);
                        byte[] bArr = R6.f3644a;
                        int i9 = jt.b;
                        jt.F(4);
                        if (jt.f() != 1751411826) {
                            i9 += 4;
                        }
                        jt.E(i9);
                        interfaceC4265ot.skipFully(jt.b);
                        interfaceC4265ot.resetPeekPosition();
                    }
                    arrayDeque.push(new M6(this.i, j5));
                    if (this.j == this.k) {
                        e(j5);
                    } else {
                        this.h = 0;
                        this.k = 0;
                    }
                } else if (i8 == 1835296868 || i8 == 1836476516 || i8 == 1751411826 || i8 == 1937011556 || i8 == 1937011827 || i8 == 1937011571 || i8 == 1668576371 || i8 == 1701606260 || i8 == 1937011555 || i8 == 1937011578 || i8 == 1937013298 || i8 == 1937007471 || i8 == 1668232756 || i8 == 1953196132 || i8 == 1718909296 || i8 == 1969517665 || i8 == 1801812339 || i8 == 1768715124) {
                    FW.s(i7 == 8);
                    FW.s(this.j <= 2147483647L);
                    JT jt3 = new JT((int) this.j);
                    System.arraycopy(jt2.f3266a, 0, jt3.f3266a, 0, 8);
                    this.l = jt3;
                    this.h = 1;
                } else {
                    long position2 = interfaceC4265ot.getPosition();
                    long j6 = this.k;
                    long j7 = position2 - j6;
                    if (this.i == 1836086884) {
                        new MotionPhotoMetadata(0L, j7, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, j7 + j6, this.j - j6);
                    }
                    this.l = null;
                    this.h = 1;
                }
            } else {
                if (i4 != 1) {
                    if (i4 == 2) {
                        long position3 = interfaceC4265ot.getPosition();
                        if (this.m == -1) {
                            long j8 = Long.MAX_VALUE;
                            long j9 = Long.MAX_VALUE;
                            long j10 = Long.MAX_VALUE;
                            int i10 = -1;
                            int i11 = -1;
                            boolean z2 = true;
                            boolean z3 = true;
                            int i12 = 0;
                            while (true) {
                                OP[] opArr = this.r;
                                if (i12 >= opArr.length) {
                                    break;
                                }
                                OP op = opArr[i12];
                                int i13 = op.e;
                                C4414qd0 c4414qd0 = op.b;
                                if (i13 != c4414qd0.b) {
                                    long j11 = c4414qd0.c[i13];
                                    long[][] jArr = this.s;
                                    int i14 = Ug0.f3833a;
                                    long j12 = jArr[i12][i13];
                                    long j13 = j11 - position3;
                                    boolean z4 = j13 < 0 || j13 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                    if ((!z4 && z3) || (z4 == z3 && j13 < j10)) {
                                        i11 = i12;
                                        z3 = z4;
                                        j9 = j12;
                                        j10 = j13;
                                    }
                                    if (j12 < j8) {
                                        i10 = i12;
                                        z2 = z4;
                                        j8 = j12;
                                    }
                                }
                                i12++;
                            }
                            if (j8 == Long.MAX_VALUE || !z2 || j9 < j8 + 10485760) {
                                i10 = i11;
                            }
                            this.m = i10;
                            if (i10 == -1) {
                                return -1;
                            }
                        }
                        OP op2 = this.r[this.m];
                        InterfaceC4326pd0 interfaceC4326pd0 = op2.c;
                        int i15 = op2.e;
                        C4414qd0 c4414qd1 = op2.b;
                        long j14 = c4414qd1.c[i15];
                        int i16 = c4414qd1.d[i15];
                        long j15 = (j14 - position3) + ((long) this.n);
                        if (j15 < 0 || j15 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                            c2868Wu.b = j14;
                            return 1;
                        }
                        C3712id0 c3712id0 = op2.f3504a;
                        if (c3712id0.g == 1) {
                            j15 += 8;
                            i16 -= 8;
                        }
                        interfaceC4265ot.skipFully((int) j15);
                        int i17 = c3712id0.j;
                        C3626he0 c3626he0 = op2.d;
                        if (i17 == 0) {
                            if ("audio/ac4".equals(c3712id0.f.l)) {
                                if (this.o == 0) {
                                    AbstractC2995aW.E(i16, jt);
                                    interfaceC4326pd0.d(7, jt);
                                    this.o += 7;
                                }
                                i16 += 7;
                            } else if (c3626he0 != null) {
                                c3626he0.c(interfaceC4265ot);
                            }
                            while (true) {
                                int i18 = this.o;
                                if (i18 >= i16) {
                                    break;
                                }
                                int iC = interfaceC4326pd0.c(interfaceC4265ot, i16 - i18, false);
                                this.n += iC;
                                this.o += iC;
                                this.p -= iC;
                            }
                        } else {
                            JT jt4 = this.b;
                            byte[] bArr2 = jt4.f3266a;
                            bArr2[0] = 0;
                            bArr2[1] = 0;
                            bArr2[2] = 0;
                            int i19 = 4 - i17;
                            while (this.o < i16) {
                                int i20 = this.p;
                                if (i20 == 0) {
                                    interfaceC4265ot.readFully(bArr2, i19, i17);
                                    this.n += i17;
                                    jt4.E(0);
                                    int iF = jt4.f();
                                    if (iF < 0) {
                                        throw KT.a("Invalid NAL length", null);
                                    }
                                    this.p = iF;
                                    JT jt5 = this.f3551a;
                                    jt5.E(0);
                                    interfaceC4326pd0.d(4, jt5);
                                    this.o += 4;
                                    i16 += i19;
                                } else {
                                    int iC2 = interfaceC4326pd0.c(interfaceC4265ot, i20, false);
                                    this.n += iC2;
                                    this.o += iC2;
                                    this.p -= iC2;
                                }
                            }
                        }
                        int i21 = i16;
                        long j16 = c4414qd1.f[i15];
                        int i22 = c4414qd1.g[i15];
                        if (c3626he0 != null) {
                            c3626he0.b(interfaceC4326pd0, j16, i22, i21, 0, null);
                            if (i15 + 1 == c4414qd1.b) {
                                c3626he0.a(interfaceC4326pd0, null);
                            }
                        } else {
                            interfaceC4326pd0.a(j16, i22, i21, 0, null);
                        }
                        op2.e++;
                        this.m = -1;
                        this.n = 0;
                        this.o = 0;
                        this.p = 0;
                        return 0;
                    }
                    if (i4 != 3) {
                        throw new IllegalStateException();
                    }
                    ArrayList arrayList3 = this.g;
                    U30 u30 = this.f;
                    int i23 = u30.b;
                    if (i23 != 0) {
                        if (i23 != 1) {
                            ArrayList arrayList4 = u30.f3809a;
                            short s = 2816;
                            char c2 = 2819;
                            short s2 = 2192;
                            if (i23 == 2) {
                                ArrayList arrayList5 = arrayList4;
                                long length2 = interfaceC4265ot.getLength();
                                int i24 = u30.c - 20;
                                JT jt6 = new JT(i24);
                                interfaceC4265ot.readFully(jt6.f3266a, 0, i24);
                                int i25 = 0;
                                while (i25 < i24 / 12) {
                                    jt6.F(2);
                                    short sJ = jt6.j();
                                    if (sJ == s2 || sJ == s || sJ == 2817) {
                                        arrayList = arrayList5;
                                        arrayList.add(new T30((length2 - ((long) u30.c)) - ((long) jt6.h()), jt6.h()));
                                    } else if (sJ == 2819 || sJ == 2820) {
                                        arrayList = arrayList5;
                                        arrayList.add(new T30((length2 - ((long) u30.c)) - ((long) jt6.h()), jt6.h()));
                                    } else {
                                        jt6.F(8);
                                        arrayList = arrayList5;
                                    }
                                    i25++;
                                    arrayList5 = arrayList;
                                    s2 = 2192;
                                    s = 2816;
                                }
                                ArrayList arrayList6 = arrayList5;
                                if (arrayList6.isEmpty()) {
                                    c2868Wu.b = 0L;
                                } else {
                                    u30.b = 3;
                                    c2868Wu.b = ((T30) arrayList6.get(0)).f3751a;
                                }
                            } else {
                                if (i23 != 3) {
                                    throw new IllegalStateException();
                                }
                                long position4 = interfaceC4265ot.getPosition();
                                int length3 = (int) ((interfaceC4265ot.getLength() - interfaceC4265ot.getPosition()) - ((long) u30.c));
                                JT jt7 = new JT(length3);
                                interfaceC4265ot.readFully(jt7.f3266a, 0, length3);
                                int i26 = 0;
                                while (i26 < arrayList4.size()) {
                                    T30 t30 = (T30) arrayList4.get(i26);
                                    ArrayList arrayList7 = arrayList4;
                                    jt7.E((int) (t30.f3751a - position4));
                                    jt7.F(i5);
                                    int iH = jt7.h();
                                    Charset charset = AbstractC2333Ce.c;
                                    String strR = jt7.r(iH, charset);
                                    switch (strR.hashCode()) {
                                        case -1711564334:
                                            if (strR.equals("SlowMotion_Data")) {
                                                b = 0;
                                            }
                                            switch (b) {
                                                case 0:
                                                    c = 2192;
                                                    break;
                                                case 1:
                                                    c = 2819;
                                                    break;
                                                case 2:
                                                    c = 2816;
                                                    break;
                                                case 3:
                                                    c = 2820;
                                                    break;
                                                case 4:
                                                    c = 2817;
                                                    break;
                                                default:
                                                    throw KT.a("Invalid SEF name", null);
                                            }
                                            i2 = t30.b - (iH + 8);
                                            if (c != 2192) {
                                                arrayList2 = new ArrayList();
                                                listA = U30.e.a(jt7.r(i2, charset));
                                                for (i3 = 0; i3 < listA.size(); i3++) {
                                                    listA2 = U30.d.a((CharSequence) listA.get(i3));
                                                    if (listA2.size() == 3) {
                                                        throw KT.a(null, null);
                                                    }
                                                    try {
                                                        arrayList2.add(new SlowMotionData.Segment(Long.parseLong((String) listA2.get(0)), Long.parseLong((String) listA2.get(1)), 1 << (Integer.parseInt((String) listA2.get(2)) - 1)));
                                                    } catch (NumberFormatException e) {
                                                        throw KT.a(null, e);
                                                    }
                                                }
                                                arrayList3.add(new SlowMotionData(arrayList2));
                                            } else if (c != 2816 && c != 2817 && c != c2 && c != 2820) {
                                                throw new IllegalStateException();
                                            }
                                            i26++;
                                            arrayList4 = arrayList7;
                                            i5 = 4;
                                            c2 = 2819;
                                            break;
                                        case -1332107749:
                                            if (strR.equals("Super_SlowMotion_Edit_Data")) {
                                                b = 1;
                                            }
                                            switch (b) {
                                                case 0:
                                                    c = 2192;
                                                    break;
                                                case 1:
                                                    c = 2819;
                                                    break;
                                                case 2:
                                                    c = 2816;
                                                    break;
                                                case 3:
                                                    c = 2820;
                                                    break;
                                                case 4:
                                                    c = 2817;
                                                    break;
                                                default:
                                                    throw KT.a("Invalid SEF name", null);
                                            }
                                            i2 = t30.b - (iH + 8);
                                            if (c != 2192) {
                                                arrayList2 = new ArrayList();
                                                listA = U30.e.a(jt7.r(i2, charset));
                                                while (i3 < listA.size()) {
                                                    listA2 = U30.d.a((CharSequence) listA.get(i3));
                                                    if (listA2.size() == 3) {
                                                        throw KT.a(null, null);
                                                    }
                                                    arrayList2.add(new SlowMotionData.Segment(Long.parseLong((String) listA2.get(0)), Long.parseLong((String) listA2.get(1)), 1 << (Integer.parseInt((String) listA2.get(2)) - 1)));
                                                }
                                                arrayList3.add(new SlowMotionData(arrayList2));
                                            } else if (c != 2816) {
                                                continue;
                                            }
                                            i26++;
                                            arrayList4 = arrayList7;
                                            i5 = 4;
                                            c2 = 2819;
                                            break;
                                        case -1251387154:
                                            if (strR.equals("Super_SlowMotion_Data")) {
                                                b = 2;
                                            }
                                            switch (b) {
                                                case 0:
                                                    c = 2192;
                                                    break;
                                                case 1:
                                                    c = 2819;
                                                    break;
                                                case 2:
                                                    c = 2816;
                                                    break;
                                                case 3:
                                                    c = 2820;
                                                    break;
                                                case 4:
                                                    c = 2817;
                                                    break;
                                                default:
                                                    throw KT.a("Invalid SEF name", null);
                                            }
                                            i2 = t30.b - (iH + 8);
                                            if (c != 2192) {
                                                arrayList2 = new ArrayList();
                                                listA = U30.e.a(jt7.r(i2, charset));
                                                while (i3 < listA.size()) {
                                                    listA2 = U30.d.a((CharSequence) listA.get(i3));
                                                    if (listA2.size() == 3) {
                                                        throw KT.a(null, null);
                                                    }
                                                    arrayList2.add(new SlowMotionData.Segment(Long.parseLong((String) listA2.get(0)), Long.parseLong((String) listA2.get(1)), 1 << (Integer.parseInt((String) listA2.get(2)) - 1)));
                                                }
                                                arrayList3.add(new SlowMotionData(arrayList2));
                                            } else if (c != 2816) {
                                                continue;
                                            }
                                            i26++;
                                            arrayList4 = arrayList7;
                                            i5 = 4;
                                            c2 = 2819;
                                            break;
                                        case -830665521:
                                            if (strR.equals("Super_SlowMotion_Deflickering_On")) {
                                                b = 3;
                                            }
                                            switch (b) {
                                                case 0:
                                                    c = 2192;
                                                    break;
                                                case 1:
                                                    c = 2819;
                                                    break;
                                                case 2:
                                                    c = 2816;
                                                    break;
                                                case 3:
                                                    c = 2820;
                                                    break;
                                                case 4:
                                                    c = 2817;
                                                    break;
                                                default:
                                                    throw KT.a("Invalid SEF name", null);
                                            }
                                            i2 = t30.b - (iH + 8);
                                            if (c != 2192) {
                                                arrayList2 = new ArrayList();
                                                listA = U30.e.a(jt7.r(i2, charset));
                                                while (i3 < listA.size()) {
                                                    listA2 = U30.d.a((CharSequence) listA.get(i3));
                                                    if (listA2.size() == 3) {
                                                        throw KT.a(null, null);
                                                    }
                                                    arrayList2.add(new SlowMotionData.Segment(Long.parseLong((String) listA2.get(0)), Long.parseLong((String) listA2.get(1)), 1 << (Integer.parseInt((String) listA2.get(2)) - 1)));
                                                }
                                                arrayList3.add(new SlowMotionData(arrayList2));
                                            } else if (c != 2816) {
                                                continue;
                                            }
                                            i26++;
                                            arrayList4 = arrayList7;
                                            i5 = 4;
                                            c2 = 2819;
                                            break;
                                        case 1760745220:
                                            if (strR.equals("Super_SlowMotion_BGM")) {
                                                b = 4;
                                            }
                                            switch (b) {
                                                case 0:
                                                    c = 2192;
                                                    break;
                                                case 1:
                                                    c = 2819;
                                                    break;
                                                case 2:
                                                    c = 2816;
                                                    break;
                                                case 3:
                                                    c = 2820;
                                                    break;
                                                case 4:
                                                    c = 2817;
                                                    break;
                                                default:
                                                    throw KT.a("Invalid SEF name", null);
                                            }
                                            i2 = t30.b - (iH + 8);
                                            if (c != 2192) {
                                                arrayList2 = new ArrayList();
                                                listA = U30.e.a(jt7.r(i2, charset));
                                                while (i3 < listA.size()) {
                                                    listA2 = U30.d.a((CharSequence) listA.get(i3));
                                                    if (listA2.size() == 3) {
                                                        throw KT.a(null, null);
                                                    }
                                                    arrayList2.add(new SlowMotionData.Segment(Long.parseLong((String) listA2.get(0)), Long.parseLong((String) listA2.get(1)), 1 << (Integer.parseInt((String) listA2.get(2)) - 1)));
                                                }
                                                arrayList3.add(new SlowMotionData(arrayList2));
                                            } else if (c != 2816) {
                                                continue;
                                            }
                                            i26++;
                                            arrayList4 = arrayList7;
                                            i5 = 4;
                                            c2 = 2819;
                                            break;
                                    }
                                    b = -1;
                                    switch (b) {
                                        case 0:
                                            c = 2192;
                                            break;
                                        case 1:
                                            c = 2819;
                                            break;
                                        case 2:
                                            c = 2816;
                                            break;
                                        case 3:
                                            c = 2820;
                                            break;
                                        case 4:
                                            c = 2817;
                                            break;
                                        default:
                                            throw KT.a("Invalid SEF name", null);
                                    }
                                    i2 = t30.b - (iH + 8);
                                    if (c != 2192) {
                                        arrayList2 = new ArrayList();
                                        listA = U30.e.a(jt7.r(i2, charset));
                                        while (i3 < listA.size()) {
                                            listA2 = U30.d.a((CharSequence) listA.get(i3));
                                            if (listA2.size() == 3) {
                                                throw KT.a(null, null);
                                            }
                                            arrayList2.add(new SlowMotionData.Segment(Long.parseLong((String) listA2.get(0)), Long.parseLong((String) listA2.get(1)), 1 << (Integer.parseInt((String) listA2.get(2)) - 1)));
                                        }
                                        arrayList3.add(new SlowMotionData(arrayList2));
                                    } else if (c != 2816) {
                                        continue;
                                    }
                                    i26++;
                                    arrayList4 = arrayList7;
                                    i5 = 4;
                                    c2 = 2819;
                                }
                                c2868Wu.b = 0L;
                            }
                        } else {
                            JT jt8 = new JT(8);
                            interfaceC4265ot.readFully(jt8.f3266a, 0, 8);
                            u30.c = jt8.h() + 8;
                            if (jt8.f() != 1397048916) {
                                c2868Wu.b = 0L;
                            } else {
                                c2868Wu.b = interfaceC4265ot.getPosition() - ((long) (u30.c - 12));
                                u30.b = 2;
                            }
                        }
                        i = 1;
                    } else {
                        long length4 = interfaceC4265ot.getLength();
                        c2868Wu.b = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                        i = 1;
                        u30.b = 1;
                    }
                    if (c2868Wu.b == 0) {
                        this.h = 0;
                        this.k = 0;
                    }
                    return i;
                }
                long j17 = this.j - ((long) this.k);
                long position5 = interfaceC4265ot.getPosition() + j17;
                JT jt9 = this.l;
                if (jt9 != null) {
                    interfaceC4265ot.readFully(jt9.f3266a, this.k, (int) j17);
                    if (this.i == 1718909296) {
                        jt9.E(8);
                        int iF2 = jt9.f();
                        int i27 = iF2 != 1751476579 ? iF2 != 1903435808 ? 0 : 1 : 2;
                        if (i27 == 0) {
                            jt9.F(4);
                            do {
                                if (jt9.a() <= 0) {
                                    i27 = 0;
                                    break;
                                }
                                int iF3 = jt9.f();
                                i27 = iF3 != 1751476579 ? iF3 != 1903435808 ? 0 : 1 : 2;
                            } while (i27 == 0);
                        }
                        this.v = i27;
                    } else if (!arrayDeque.isEmpty()) {
                        ((M6) arrayDeque.peek()).d.add(new N6(this.i, jt9));
                    }
                } else if (j17 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                    interfaceC4265ot.skipFully((int) j17);
                } else {
                    c2868Wu.b = interfaceC4265ot.getPosition() + j17;
                    z = true;
                }
                e(position5);
                if (z && this.h != 2) {
                    return 1;
                }
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final boolean b(InterfaceC4265ot interfaceC4265ot) {
        return FW.d0(interfaceC4265ot, false, false);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void d(InterfaceC4353pt interfaceC4353pt) {
        this.q = interfaceC4353pt;
    }

    /* JADX WARN: Code duplicated, block: B:236:0x047d  */
    /* JADX WARN: Code duplicated, block: B:296:0x0597 A[LOOP:10: B:294:0x0594->B:296:0x0597, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:299:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:302:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:306:0x05be A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r5v39, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v54 */
    public final void e(long j) {
        Metadata metadata;
        Metadata metadata2;
        ArrayDeque arrayDeque;
        ArrayList arrayList;
        Metadata metadata3;
        long j2;
        C4884vx c4884vx;
        Metadata metadata4;
        int i;
        Metadata metadata5;
        int i2;
        int i3;
        ArrayList arrayList2;
        int i4;
        int i5;
        int i6;
        String[] strArr;
        MdtaMetadataEntry mdtaMetadataEntry;
        int i7;
        Id3Frame id3FrameD;
        while (true) {
            int i8 = 4;
            boolean z = true;
            ArrayDeque arrayDeque2 = this.e;
            if (arrayDeque2.isEmpty() || ((M6) arrayDeque2.peek()).c != j) {
                break;
            }
            M6 m6 = (M6) arrayDeque2.pop();
            if (m6.b == 1836019574) {
                ArrayList arrayList3 = new ArrayList();
                boolean z2 = this.v == 1;
                C4884vx c4884vx2 = new C4884vx();
                N6 n6F = m6.f(1969517665);
                int i9 = 1751411826;
                int i10 = 1768715124;
                int i11 = 1835365473;
                int i12 = 8;
                if (n6F != null) {
                    byte[] bArr = R6.f3644a;
                    JT jt = n6F.c;
                    jt.E(8);
                    Metadata metadata6 = null;
                    Metadata metadata7 = null;
                    while (jt.a() >= i12) {
                        int i13 = jt.b;
                        int iF = jt.f();
                        int iF2 = jt.f();
                        if (iF2 == i11) {
                            jt.E(i13);
                            int i14 = i13 + iF;
                            jt.F(i12);
                            int i15 = jt.b;
                            jt.F(i8);
                            if (jt.f() != i9) {
                                i15 += i8;
                            }
                            jt.E(i15);
                            boolean z3 = z;
                            while (true) {
                                int i16 = jt.b;
                                if (i16 >= i14) {
                                    metadata6 = null;
                                    break;
                                }
                                int iF3 = jt.f();
                                if (jt.f() == i10) {
                                    jt.E(i16);
                                    int i17 = i16 + iF3;
                                    jt.F(i12);
                                    ArrayList arrayList4 = new ArrayList();
                                    ?? r5 = z3;
                                    while (true) {
                                        int i18 = jt.b;
                                        if (i18 >= i17) {
                                            break;
                                        }
                                        int iF4 = jt.f() + i18;
                                        int iF5 = jt.f();
                                        int i19 = (iF5 >> 24) & 255;
                                        if (i19 == 169 || i19 == 253) {
                                            i7 = i17;
                                            int i20 = 16777215 & iF5;
                                            if (i20 == 6516084) {
                                                id3FrameD = AbstractC4835vP.a(iF5, jt);
                                            } else if (i20 == 7233901 || i20 == 7631467) {
                                                id3FrameD = AbstractC4835vP.d(iF5, jt, "TIT2");
                                            } else if (i20 == 6516589 || i20 == 7828084) {
                                                id3FrameD = AbstractC4835vP.d(iF5, jt, "TCOM");
                                            } else if (i20 == 6578553) {
                                                id3FrameD = AbstractC4835vP.d(iF5, jt, "TDRC");
                                            } else if (i20 == 4280916) {
                                                id3FrameD = AbstractC4835vP.d(iF5, jt, "TPE1");
                                            } else if (i20 == 7630703) {
                                                id3FrameD = AbstractC4835vP.d(iF5, jt, "TSSE");
                                            } else if (i20 == 6384738) {
                                                id3FrameD = AbstractC4835vP.d(iF5, jt, "TALB");
                                            } else if (i20 == 7108978) {
                                                id3FrameD = AbstractC4835vP.d(iF5, jt, "USLT");
                                            } else if (i20 == 6776174) {
                                                id3FrameD = AbstractC4835vP.d(iF5, jt, "TCON");
                                            } else if (i20 == 6779504) {
                                                id3FrameD = AbstractC4835vP.d(iF5, jt, "TIT1");
                                            } else {
                                                AbstractC4936wb.b(iF5);
                                                AbstractC4038mJ.b();
                                                jt.E(iF4);
                                                id3FrameD = null;
                                            }
                                            jt.E(iF4);
                                        } else {
                                            if (iF5 == 1735291493) {
                                                try {
                                                    int iF6 = AbstractC4835vP.f(jt);
                                                    String str = (iF6 <= 0 || iF6 > 192) ? null : AbstractC4835vP.f5128a[iF6 - r5];
                                                    if (str != null) {
                                                        id3FrameD = new TextInformationFrame("TCON", (String) null, AC.p(str));
                                                    } else {
                                                        AbstractC4038mJ.f();
                                                        id3FrameD = null;
                                                    }
                                                } catch (Throwable th) {
                                                    jt.E(iF4);
                                                    throw th;
                                                }
                                            } else if (iF5 == 1684632427) {
                                                id3FrameD = AbstractC4835vP.c(iF5, jt, "TPOS");
                                            } else if (iF5 == 1953655662) {
                                                id3FrameD = AbstractC4835vP.c(iF5, jt, "TRCK");
                                            } else if (iF5 == 1953329263) {
                                                id3FrameD = AbstractC4835vP.e(iF5, "TBPM", jt, r5, false);
                                            } else if (iF5 == 1668311404) {
                                                id3FrameD = AbstractC4835vP.e(iF5, "TCMP", jt, r5, r5);
                                            } else if (iF5 == 1668249202) {
                                                id3FrameD = AbstractC4835vP.b(jt);
                                            } else if (iF5 == 1631670868) {
                                                id3FrameD = AbstractC4835vP.d(iF5, jt, "TPE2");
                                            } else if (iF5 == 1936682605) {
                                                id3FrameD = AbstractC4835vP.d(iF5, jt, "TSOT");
                                            } else if (iF5 == 1936679276) {
                                                id3FrameD = AbstractC4835vP.d(iF5, jt, "TSO2");
                                            } else if (iF5 == 1936679282) {
                                                id3FrameD = AbstractC4835vP.d(iF5, jt, "TSOA");
                                            } else if (iF5 == 1936679265) {
                                                id3FrameD = AbstractC4835vP.d(iF5, jt, "TSOP");
                                            } else if (iF5 == 1936679791) {
                                                id3FrameD = AbstractC4835vP.d(iF5, jt, "TSOC");
                                            } else if (iF5 == 1920233063) {
                                                id3FrameD = AbstractC4835vP.e(iF5, "ITUNESADVISORY", jt, false, false);
                                            } else if (iF5 == 1885823344) {
                                                id3FrameD = AbstractC4835vP.e(iF5, "ITUNESGAPLESS", jt, false, r5);
                                            } else if (iF5 == 1936683886) {
                                                id3FrameD = AbstractC4835vP.d(iF5, jt, "TVSHOWSORT");
                                            } else if (iF5 == 1953919848) {
                                                id3FrameD = AbstractC4835vP.d(iF5, jt, "TVSHOW");
                                            } else if (iF5 == 757935405) {
                                                String strP = null;
                                                String strP2 = null;
                                                int i21 = -1;
                                                int i22 = -1;
                                                while (true) {
                                                    int i23 = jt.b;
                                                    if (i23 >= iF4) {
                                                        break;
                                                    }
                                                    int iF7 = jt.f();
                                                    int iF8 = jt.f();
                                                    int i24 = i17;
                                                    jt.F(4);
                                                    if (iF8 == 1835360622) {
                                                        strP = jt.p(iF7 - 12);
                                                    } else if (iF8 == 1851878757) {
                                                        strP2 = jt.p(iF7 - 12);
                                                    } else {
                                                        if (iF8 == 1684108385) {
                                                            i21 = i23;
                                                            i22 = iF7;
                                                        }
                                                        jt.F(iF7 - 12);
                                                    }
                                                    i17 = i24;
                                                }
                                                i7 = i17;
                                                if (strP == null || strP2 == null || i21 == -1) {
                                                    id3FrameD = null;
                                                } else {
                                                    jt.E(i21);
                                                    jt.F(16);
                                                    id3FrameD = new InternalFrame(strP, strP2, jt.p(i22 - 16));
                                                }
                                                jt.E(iF4);
                                            } else {
                                                i7 = i17;
                                                AbstractC4936wb.b(iF5);
                                                AbstractC4038mJ.b();
                                                jt.E(iF4);
                                                id3FrameD = null;
                                            }
                                            jt.E(iF4);
                                            i7 = i17;
                                        }
                                        if (id3FrameD != null) {
                                            arrayList4.add(id3FrameD);
                                        }
                                        i17 = i7;
                                        r5 = 1;
                                    }
                                    metadata6 = arrayList4.isEmpty() ? null : new Metadata(arrayList4);
                                    break;
                                }
                                jt.E(i16 + iF3);
                                z3 = true;
                                i10 = 1768715124;
                                i12 = 8;
                            }
                        } else if (iF2 == 1936553057) {
                            jt.E(i13);
                            int i25 = i13 + iF;
                            jt.F(12);
                            while (true) {
                                int i26 = jt.b;
                                if (i26 < i25) {
                                    int iF9 = jt.f();
                                    if (jt.f() != 1935766900) {
                                        jt.E(i26 + iF9);
                                    } else if (iF9 >= 14) {
                                        jt.F(5);
                                        int iT = jt.t();
                                        if (iT == 12 || iT == 13) {
                                            float f = iT == 12 ? 240.0f : 120.0f;
                                            jt.F(1);
                                            metadata7 = new Metadata(new SmtaMetadataEntry(f, jt.t()));
                                            break;
                                        }
                                    }
                                }
                                metadata7 = null;
                                break;
                            }
                        }
                        jt.E(i13 + iF);
                        i8 = 4;
                        i11 = 1835365473;
                        z = true;
                        i10 = 1768715124;
                        i9 = 1751411826;
                        i12 = 8;
                    }
                    Pair pairCreate = Pair.create(metadata6, metadata7);
                    metadata2 = (Metadata) pairCreate.first;
                    metadata = (Metadata) pairCreate.second;
                    if (metadata2 != null) {
                        c4884vx2.b(metadata2);
                    }
                    i11 = 1835365473;
                } else {
                    metadata = null;
                    metadata2 = null;
                }
                M6 m6E = m6.e(i11);
                if (m6E != null) {
                    byte[] bArr2 = R6.f3644a;
                    N6 n6F2 = m6E.f(1751411826);
                    N6 n6F3 = m6E.f(1801812339);
                    N6 n6F4 = m6E.f(1768715124);
                    if (n6F2 == null || n6F3 == null || n6F4 == null) {
                        arrayDeque = arrayDeque2;
                        arrayList = arrayList3;
                        metadata3 = null;
                    } else {
                        JT jt2 = n6F2.c;
                        jt2.E(16);
                        if (jt2.f() != 1835299937) {
                            arrayDeque = arrayDeque2;
                            arrayList = arrayList3;
                        } else {
                            JT jt3 = n6F3.c;
                            jt3.E(12);
                            int iF10 = jt3.f();
                            String[] strArr2 = new String[iF10];
                            for (int i27 = 0; i27 < iF10; i27++) {
                                int iF11 = jt3.f();
                                jt3.F(4);
                                strArr2[i27] = jt3.r(iF11 - 8, AbstractC2333Ce.c);
                            }
                            JT jt4 = n6F4.c;
                            jt4.E(8);
                            ArrayList arrayList5 = new ArrayList();
                            for (int i28 = 8; jt4.a() > i28; i28 = 8) {
                                int i29 = jt4.b;
                                int iF12 = jt4.f();
                                int iF13 = jt4.f() - 1;
                                if (iF13 < 0 || iF13 >= iF10) {
                                    arrayDeque2 = arrayDeque2;
                                    arrayList3 = arrayList3;
                                    i6 = iF10;
                                    strArr = strArr2;
                                    AbstractC4038mJ.f();
                                } else {
                                    String str2 = strArr2[iF13];
                                    int i30 = i29 + iF12;
                                    i6 = iF10;
                                    while (true) {
                                        int i31 = jt4.b;
                                        if (i31 >= i30) {
                                            strArr = strArr2;
                                            mdtaMetadataEntry = null;
                                            break;
                                        }
                                        int iF14 = jt4.f();
                                        int i32 = i30;
                                        strArr = strArr2;
                                        if (jt4.f() == 1684108385) {
                                            int iF15 = jt4.f();
                                            int iF16 = jt4.f();
                                            int i33 = iF14 - 16;
                                            byte[] bArr3 = new byte[i33];
                                            jt4.d(bArr3, 0, i33);
                                            mdtaMetadataEntry = new MdtaMetadataEntry(str2, bArr3, iF16, iF15);
                                            break;
                                        }
                                        jt4.E(i31 + iF14);
                                        i30 = i32;
                                        strArr2 = strArr;
                                    }
                                    if (mdtaMetadataEntry != null) {
                                        arrayList5.add(mdtaMetadataEntry);
                                    }
                                }
                                jt4.E(i29 + iF12);
                                iF10 = i6;
                                strArr2 = strArr;
                                arrayDeque2 = arrayDeque2;
                                arrayList3 = arrayList3;
                            }
                            arrayDeque = arrayDeque2;
                            arrayList = arrayList3;
                            if (!arrayList5.isEmpty()) {
                                metadata3 = new Metadata(arrayList5);
                            }
                        }
                        metadata3 = null;
                    }
                } else {
                    arrayDeque = arrayDeque2;
                    arrayList = arrayList3;
                    metadata3 = null;
                }
                C4884vx c4884vx3 = c4884vx2;
                ArrayList arrayListE = R6.e(m6, c4884vx2, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, null, false, z2, new C2953a0(1));
                int size = arrayListE.size();
                long j3 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                long jMax = -9223372036854775807L;
                int i34 = 0;
                int size2 = -1;
                while (true) {
                    j2 = 0;
                    if (i34 >= size) {
                        break;
                    }
                    C4414qd0 c4414qd0 = (C4414qd0) arrayListE.get(i34);
                    if (c4414qd0.b == 0) {
                        metadata5 = metadata2;
                        c4884vx = c4884vx3;
                        arrayList2 = arrayList;
                    } else {
                        C3712id0 c3712id0 = c4414qd0.f4891a;
                        C4884vx c4884vx4 = c4884vx3;
                        long j4 = c3712id0.e;
                        if (j4 == j3) {
                            j4 = c4414qd0.h;
                        }
                        jMax = Math.max(jMax, j4);
                        InterfaceC4353pt interfaceC4353pt = this.q;
                        int i35 = c3712id0.b;
                        OP op = new OP(c3712id0, c4414qd0, interfaceC4353pt.track(i34, i35));
                        C4619sw c4619sw = c3712id0.f;
                        boolean zEquals = MimeTypes.AUDIO_TRUEHD.equals(c4619sw.l);
                        int i36 = c4414qd0.e;
                        int i37 = zEquals ? i36 * 16 : i36 + 30;
                        C4531rw c4531rwA = c4619sw.a();
                        c4531rwA.l = i37;
                        if (i35 == 2 && j4 > 0 && (i5 = c4414qd0.b) > 1) {
                            c4531rwA.r = i5 / (j4 / 1000000.0f);
                        }
                        if (i35 == 1) {
                            c4884vx = c4884vx4;
                            int i38 = c4884vx.f5162a;
                            if (i38 != -1 && (i4 = c4884vx.b) != -1) {
                                c4531rwA.A = i38;
                                c4531rwA.B = i4;
                            }
                        } else {
                            c4884vx = c4884vx4;
                        }
                        Metadata[] metadataArr = new Metadata[2];
                        metadataArr[0] = metadata;
                        ArrayList arrayList6 = this.g;
                        if (arrayList6.isEmpty()) {
                            i = 1;
                            metadata4 = null;
                        } else {
                            metadata4 = new Metadata(arrayList6);
                            i = 1;
                        }
                        metadataArr[i] = metadata4;
                        Metadata metadata8 = new Metadata(new Metadata.Entry[0]);
                        if (i35 == i) {
                            if (metadata2 != null) {
                                metadata8 = metadata2;
                                metadata5 = metadata8;
                            }
                            i2 = 1;
                            for (i3 = 0; i3 < 2; i3 += i2) {
                                metadata8 = metadata8.c(metadataArr[i3]);
                            }
                            if (metadata8.f() > 0) {
                                c4531rwA.i = metadata8;
                            }
                            op.c.e(new C4619sw(c4531rwA));
                            if (i35 != 2 && size2 == -1) {
                                size2 = arrayList.size();
                            }
                            arrayList2 = arrayList;
                            arrayList2.add(op);
                        } else if (i35 == 2 && metadata3 != null) {
                            int i39 = 0;
                            while (true) {
                                if (i39 < metadata3.f()) {
                                    Metadata.Entry entryE = metadata3.e(i39);
                                    if (entryE instanceof MdtaMetadataEntry) {
                                        MdtaMetadataEntry mdtaMetadataEntry2 = (MdtaMetadataEntry) entryE;
                                        metadata5 = metadata2;
                                        if (MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS.equals(mdtaMetadataEntry2.key)) {
                                            i2 = 1;
                                            metadata8 = new Metadata(mdtaMetadataEntry2);
                                        }
                                    } else {
                                        metadata5 = metadata2;
                                    }
                                    i39++;
                                    metadata2 = metadata5;
                                }
                                while (i3 < 2) {
                                    metadata8 = metadata8.c(metadataArr[i3]);
                                }
                                if (metadata8.f() > 0) {
                                    c4531rwA.i = metadata8;
                                }
                                op.c.e(new C4619sw(c4531rwA));
                                if (i35 != 2) {
                                    size2 = arrayList.size();
                                }
                                arrayList2 = arrayList;
                                arrayList2.add(op);
                            }
                        }
                        metadata5 = metadata2;
                        i2 = 1;
                        while (i3 < 2) {
                            metadata8 = metadata8.c(metadataArr[i3]);
                        }
                        if (metadata8.f() > 0) {
                            c4531rwA.i = metadata8;
                        }
                        op.c.e(new C4619sw(c4531rwA));
                        if (i35 != 2) {
                            size2 = arrayList.size();
                        }
                        arrayList2 = arrayList;
                        arrayList2.add(op);
                    }
                    i34++;
                    arrayList = arrayList2;
                    c4884vx3 = c4884vx;
                    metadata = metadata;
                    arrayListE = arrayListE;
                    size = size;
                    metadata2 = metadata5;
                    j3 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                }
                this.t = size2;
                this.u = jMax;
                OP[] opArr = (OP[]) arrayList.toArray(new OP[0]);
                this.r = opArr;
                long[][] jArr = new long[opArr.length][];
                int[] iArr = new int[opArr.length];
                long[] jArr2 = new long[opArr.length];
                boolean[] zArr = new boolean[opArr.length];
                for (int i40 = 0; i40 < opArr.length; i40++) {
                    jArr[i40] = new long[opArr[i40].b.b];
                    jArr2[i40] = opArr[i40].b.f[0];
                }
                int i41 = 0;
                while (i41 < opArr.length) {
                    long j5 = Long.MAX_VALUE;
                    int i42 = -1;
                    for (int i43 = 0; i43 < opArr.length; i43++) {
                        if (!zArr[i43]) {
                            long j6 = jArr2[i43];
                            if (j6 <= j5) {
                                i42 = i43;
                                j5 = j6;
                            }
                        }
                    }
                    int i44 = iArr[i42];
                    long[] jArr3 = jArr[i42];
                    jArr3[i44] = j2;
                    C4414qd0 c4414qd1 = opArr[i42].b;
                    j2 += (long) c4414qd1.d[i44];
                    int i45 = i44 + 1;
                    iArr[i42] = i45;
                    if (i45 < jArr3.length) {
                        jArr2[i42] = c4414qd1.f[i45];
                    } else {
                        zArr[i42] = true;
                        i41++;
                    }
                }
                this.s = jArr;
                this.q.endTracks();
                this.q.a(this);
                arrayDeque.clear();
                this.h = 2;
            } else if (!arrayDeque2.isEmpty()) {
                ((M6) arrayDeque2.peek()).e.add(m6);
            }
        }
        if (this.h != 2) {
            this.h = 0;
            this.k = 0;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final long getDurationUs() {
        return this.u;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final N30 getSeekPoints(long j) {
        long j2;
        long j3;
        long jMin;
        int[] iArr;
        long j4;
        int iA;
        PP pp = this;
        long j5 = j;
        OP[] opArr = pp.r;
        int length = opArr.length;
        Q30 q30 = Q30.c;
        if (length == 0) {
            return new N30(q30, q30);
        }
        int i = pp.t;
        boolean z = false;
        if (i != -1) {
            C4414qd0 c4414qd0 = opArr[i].b;
            int iF = Ug0.f(c4414qd0.f, j5, false);
            while (true) {
                if (iF < 0) {
                    iF = -1;
                    break;
                }
                if ((c4414qd0.g[iF] & 1) != 0) {
                    break;
                }
                iF--;
            }
            if (iF == -1) {
                iF = c4414qd0.a(j5);
            }
            if (iF == -1) {
                return new N30(q30, q30);
            }
            long[] jArr = c4414qd0.f;
            long j6 = jArr[iF];
            long[] jArr2 = c4414qd0.c;
            j2 = jArr2[iF];
            if (j6 >= j5 || iF >= c4414qd0.b - 1 || (iA = c4414qd0.a(j5)) == -1 || iA == iF) {
                j4 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                jMin = -1;
            } else {
                j4 = jArr[iA];
                jMin = jArr2[iA];
            }
            j3 = j4;
            j5 = j6;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            jMin = -1;
        }
        long jMin2 = j2;
        int i2 = 0;
        while (true) {
            OP[] opArr2 = pp.r;
            if (i2 >= opArr2.length) {
                break;
            }
            if (i2 != pp.t) {
                C4414qd0 c4414qd1 = opArr2[i2].b;
                int iF2 = Ug0.f(c4414qd1.f, j5, z);
                while (true) {
                    iArr = c4414qd1.g;
                    if (iF2 < 0) {
                        iF2 = -1;
                        break;
                    }
                    if ((iArr[iF2] & 1) != 0) {
                        break;
                    }
                    iF2--;
                }
                if (iF2 == -1) {
                    iF2 = c4414qd1.a(j5);
                }
                long[] jArr3 = c4414qd1.c;
                if (iF2 != -1) {
                    jMin2 = Math.min(jArr3[iF2], jMin2);
                }
                if (j3 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    int iF3 = Ug0.f(c4414qd1.f, j3, false);
                    while (true) {
                        if (iF3 < 0) {
                            iF3 = -1;
                            break;
                        }
                        if ((iArr[iF3] & 1) != 0) {
                            break;
                        }
                        iF3--;
                    }
                    if (iF3 == -1) {
                        iF3 = c4414qd1.a(j3);
                    }
                    if (iF3 != -1) {
                        jMin = Math.min(jArr3[iF3], jMin);
                    }
                }
                i2++;
                pp = this;
                j5 = j5;
                z = false;
            } else {
                j5 = j5;
            }
            i2++;
            pp = this;
            j5 = j5;
            z = false;
        }
        Q30 q31 = new Q30(j5, jMin2);
        return j3 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? new N30(q31, q31) : new N30(q31, new Q30(j3, jMin));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final boolean isSeekable() {
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void seek(long j, long j2) {
        this.e.clear();
        this.k = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        if (j == 0) {
            if (this.h != 3) {
                this.h = 0;
                this.k = 0;
                return;
            } else {
                U30 u30 = this.f;
                u30.f3809a.clear();
                u30.b = 0;
                this.g.clear();
                return;
            }
        }
        for (OP op : this.r) {
            C4414qd0 c4414qd0 = op.b;
            int iF = Ug0.f(c4414qd0.f, j2, false);
            while (true) {
                if (iF < 0) {
                    iF = -1;
                    break;
                } else if ((c4414qd0.g[iF] & 1) != 0) {
                    break;
                } else {
                    iF--;
                }
            }
            if (iF == -1) {
                iF = c4414qd0.a(j2);
            }
            op.e = iF;
            C3626he0 c3626he0 = op.d;
            if (c3626he0 != null) {
                c3626he0.b = false;
                c3626he0.c = 0;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void release() {
    }
}
