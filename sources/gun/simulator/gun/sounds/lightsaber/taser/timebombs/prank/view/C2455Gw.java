package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2455Gw implements InterfaceC4177nt {
    public static final byte[] I = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final C4619sw J;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public InterfaceC4353pt E;
    public InterfaceC4326pd0[] F;
    public InterfaceC4326pd0[] G;
    public boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3144a;
    public final C3712id0 b;
    public final List c;
    public final SparseArray d;
    public final JT e;
    public final JT f;
    public final JT g;
    public final byte[] h;
    public final JT i;
    public final Mc0 j;
    public final C3491g4 k;
    public final JT l;
    public final ArrayDeque m;
    public final ArrayDeque n;
    public final InterfaceC4326pd0 o;
    public int p;
    public int q;
    public long r;
    public int s;
    public JT t;
    public long u;
    public int v;
    public long w;
    public long x;
    public long y;
    public C2429Fw z;

    static {
        C4531rw c4531rw = new C4531rw();
        c4531rw.k = MimeTypes.APPLICATION_EMSG;
        J = c4531rw.a();
    }

    public C2455Gw() {
        this(0, null, null, Collections.emptyList(), null);
    }

    public static DrmInitData c(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            N6 n6 = (N6) arrayList.get(i);
            if (n6.b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = n6.c.f3266a;
                A70 a70R = FW.R(bArr);
                UUID uuid = a70R == null ? null : (UUID) a70R.c;
                if (uuid == null) {
                    AbstractC4038mJ.f();
                } else {
                    arrayList2.add(new DrmInitData.SchemeData(uuid, MimeTypes.VIDEO_MP4, bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new DrmInitData(arrayList2);
    }

    public static void e(JT jt, int i, C3886kd0 c3886kd0) throws KT {
        jt.E(i + 8);
        int iF = jt.f();
        if ((iF & 1) != 0) {
            throw KT.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iF & 2) != 0;
        int iW = jt.w();
        if (iW == 0) {
            Arrays.fill(c3886kd0.l, 0, c3886kd0.e, false);
            return;
        }
        if (iW != c3886kd0.e) {
            StringBuilder sbQ = AbstractC5044xl.q("Senc sample count ", iW, " is different from fragment sample count");
            sbQ.append(c3886kd0.e);
            throw KT.a(sbQ.toString(), null);
        }
        Arrays.fill(c3886kd0.l, 0, iW, z);
        int iA = jt.a();
        JT jt2 = c3886kd0.n;
        jt2.B(iA);
        c3886kd0.k = true;
        c3886kd0.o = true;
        jt.d(jt2.f3266a, 0, jt2.c);
        jt2.E(0);
        c3886kd0.o = false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final int a(InterfaceC4265ot interfaceC4265ot, C2868Wu c2868Wu) throws KT {
        ArrayDeque arrayDeque;
        Mc0 mc0;
        C2429Fw c2429Fw;
        Mc0 mc1;
        int iC;
        int i;
        boolean z;
        long jR;
        String str;
        long j;
        String str2;
        long jU;
        long jA;
        long jX;
        long jX2;
        while (true) {
            int i2 = this.p;
            ArrayDeque arrayDeque2 = this.m;
            SparseArray sparseArray = this.d;
            if (i2 != 0) {
                arrayDeque = this.n;
                mc0 = this.j;
                if (i2 != 1) {
                    long j2 = Long.MAX_VALUE;
                    if (i2 != 2) {
                        c2429Fw = this.z;
                        if (c2429Fw != null) {
                            break;
                        }
                        int size = sparseArray.size();
                        long j3 = Long.MAX_VALUE;
                        C2429Fw c2429Fw2 = null;
                        for (int i3 = 0; i3 < size; i3++) {
                            C2429Fw c2429Fw3 = (C2429Fw) sparseArray.valueAt(i3);
                            boolean z2 = c2429Fw3.l;
                            if (z2 || c2429Fw3.f != c2429Fw3.d.b) {
                                C3886kd0 c3886kd0 = c2429Fw3.b;
                                if (!z2 || c2429Fw3.h != c3886kd0.d) {
                                    long j4 = !z2 ? c2429Fw3.d.c[c2429Fw3.f] : c3886kd0.f[c2429Fw3.h];
                                    if (j4 < j3) {
                                        c2429Fw2 = c2429Fw3;
                                        j3 = j4;
                                    }
                                }
                            }
                        }
                        if (c2429Fw2 != null) {
                            int position = (int) ((!c2429Fw2.l ? c2429Fw2.d.c[c2429Fw2.f] : c2429Fw2.b.f[c2429Fw2.h]) - interfaceC4265ot.getPosition());
                            if (position < 0) {
                                AbstractC4038mJ.f();
                                position = 0;
                            }
                            interfaceC4265ot.skipFully(position);
                            this.z = c2429Fw2;
                            c2429Fw = c2429Fw2;
                            break;
                        }
                        int position2 = (int) (this.u - interfaceC4265ot.getPosition());
                        if (position2 < 0) {
                            throw KT.a("Offset to end of mdat was negative.", null);
                        }
                        interfaceC4265ot.skipFully(position2);
                        this.p = 0;
                        this.s = 0;
                    } else {
                        int size2 = sparseArray.size();
                        C2429Fw c2429Fw4 = null;
                        for (int i4 = 0; i4 < size2; i4++) {
                            C3886kd0 c3886kd1 = ((C2429Fw) sparseArray.valueAt(i4)).b;
                            if (c3886kd1.o) {
                                long j5 = c3886kd1.c;
                                if (j5 < j2) {
                                    c2429Fw4 = (C2429Fw) sparseArray.valueAt(i4);
                                    j2 = j5;
                                }
                            }
                        }
                        if (c2429Fw4 == null) {
                            this.p = 3;
                        } else {
                            int position3 = (int) (j2 - interfaceC4265ot.getPosition());
                            if (position3 < 0) {
                                throw KT.a("Offset to encryption data was negative.", null);
                            }
                            interfaceC4265ot.skipFully(position3);
                            C3886kd0 c3886kd2 = c2429Fw4.b;
                            JT jt = c3886kd2.n;
                            interfaceC4265ot.readFully(jt.f3266a, 0, jt.c);
                            jt.E(0);
                            c3886kd2.o = false;
                        }
                    }
                } else {
                    int i5 = ((int) this.r) - this.s;
                    JT jt2 = this.t;
                    if (jt2 != null) {
                        interfaceC4265ot.readFully(jt2.f3266a, 8, i5);
                        N6 n6 = new N6(this.q, jt2);
                        long position4 = interfaceC4265ot.getPosition();
                        if (arrayDeque2.isEmpty()) {
                            int i6 = n6.b;
                            if (i6 == 1936286840) {
                                jt2.E(8);
                                int iD = AbstractC4936wb.d(jt2.f());
                                jt2.F(4);
                                long jU2 = jt2.u();
                                if (iD == 0) {
                                    jX = jt2.u();
                                    jX2 = jt2.u();
                                } else {
                                    jX = jt2.x();
                                    jX2 = jt2.x();
                                }
                                long j6 = jX2 + position4;
                                long jR2 = Ug0.R(jX, 1000000L, jU2);
                                jt2.F(2);
                                int iY = jt2.y();
                                int[] iArr = new int[iY];
                                long[] jArr = new long[iY];
                                long[] jArr2 = new long[iY];
                                long[] jArr3 = new long[iY];
                                long j7 = j6;
                                long jR3 = jR2;
                                int i7 = 0;
                                while (i7 < iY) {
                                    int iF = jt2.f();
                                    if ((iF & Integer.MIN_VALUE) != 0) {
                                        throw KT.a("Unhandled indirect reference", null);
                                    }
                                    long jU3 = jt2.u();
                                    iArr[i7] = iF & Integer.MAX_VALUE;
                                    jArr[i7] = j7;
                                    jArr3[i7] = jR3;
                                    long j8 = jX + jU3;
                                    jR3 = Ug0.R(j8, 1000000L, jU2);
                                    jArr2[i7] = jR3 - jArr3[i7];
                                    jt2.F(4);
                                    j7 += (long) iArr[i7];
                                    i7++;
                                    jX = j8;
                                }
                                Pair pairCreate = Pair.create(Long.valueOf(jR2), new C2644Oe(iArr, jArr, jArr2, jArr3));
                                this.y = ((Long) pairCreate.first).longValue();
                                this.E.a((O30) pairCreate.second);
                                this.H = true;
                            } else if (i6 == 1701671783 && this.F.length != 0) {
                                jt2.E(8);
                                int iD2 = AbstractC4936wb.d(jt2.f());
                                long j9 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                                if (iD2 == 0) {
                                    String strO = jt2.o();
                                    strO.getClass();
                                    String strO2 = jt2.o();
                                    strO2.getClass();
                                    long jU4 = jt2.u();
                                    long jR4 = Ug0.R(jt2.u(), 1000000L, jU4);
                                    long j10 = this.y;
                                    long j11 = j10 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? j10 + jR4 : -9223372036854775807L;
                                    jR = Ug0.R(jt2.u(), 1000L, jU4);
                                    str = strO;
                                    j = jR4;
                                    str2 = strO2;
                                    jU = jt2.u();
                                    jA = j11;
                                } else if (iD2 != 1) {
                                    AbstractC4038mJ.f();
                                } else {
                                    long jU5 = jt2.u();
                                    jA = Ug0.R(jt2.x(), 1000000L, jU5);
                                    long jR5 = Ug0.R(jt2.u(), 1000L, jU5);
                                    long jU6 = jt2.u();
                                    String strO3 = jt2.o();
                                    strO3.getClass();
                                    String strO4 = jt2.o();
                                    strO4.getClass();
                                    jR = jR5;
                                    str = strO3;
                                    j = -9223372036854775807L;
                                    str2 = strO4;
                                    jU = jU6;
                                }
                                byte[] bArr = new byte[jt2.a()];
                                jt2.d(bArr, 0, jt2.a());
                                JT jt3 = new JT(this.k.v(new EventMessage(str, str2, jR, jU, bArr)));
                                int iA = jt3.a();
                                InterfaceC4326pd0[] interfaceC4326pd0Arr = this.F;
                                int length = interfaceC4326pd0Arr.length;
                                int i8 = 0;
                                while (i8 < length) {
                                    InterfaceC4326pd0 interfaceC4326pd0 = interfaceC4326pd0Arr[i8];
                                    jt3.E(0);
                                    interfaceC4326pd0.d(iA, jt3);
                                    i8++;
                                    j9 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                                }
                                if (jA == j9) {
                                    arrayDeque.addLast(new C2403Ew(j, true, iA));
                                    this.v += iA;
                                } else if (arrayDeque.isEmpty()) {
                                    if (mc0 != null) {
                                        jA = mc0.a(jA);
                                    }
                                    for (InterfaceC4326pd0 interfaceC4326pd1 : this.F) {
                                        interfaceC4326pd1.a(jA, 1, iA, 0, null);
                                    }
                                } else {
                                    arrayDeque.addLast(new C2403Ew(jA, false, iA));
                                    this.v += iA;
                                }
                            }
                        } else {
                            ((M6) arrayDeque2.peek()).d.add(n6);
                        }
                    } else {
                        interfaceC4265ot.skipFully(i5);
                    }
                    f(interfaceC4265ot.getPosition());
                }
            } else {
                int i9 = this.s;
                JT jt4 = this.l;
                if (i9 == 0) {
                    if (!interfaceC4265ot.readFully(jt4.f3266a, 0, 8, true)) {
                        return -1;
                    }
                    this.s = 8;
                    jt4.E(0);
                    this.r = jt4.u();
                    this.q = jt4.f();
                }
                long j12 = this.r;
                if (j12 == 1) {
                    interfaceC4265ot.readFully(jt4.f3266a, 8, 8);
                    this.s += 8;
                    this.r = jt4.x();
                } else if (j12 == 0) {
                    long length2 = interfaceC4265ot.getLength();
                    if (length2 == -1 && !arrayDeque2.isEmpty()) {
                        length2 = ((M6) arrayDeque2.peek()).c;
                    }
                    if (length2 != -1) {
                        this.r = (length2 - interfaceC4265ot.getPosition()) + ((long) this.s);
                    }
                }
                if (this.r < this.s) {
                    throw KT.c("Atom size less than header length (unsupported).");
                }
                long position5 = interfaceC4265ot.getPosition() - ((long) this.s);
                int i10 = this.q;
                if ((i10 == 1836019558 || i10 == 1835295092) && !this.H) {
                    this.E.a(new C2946Zu(this.x, position5));
                    this.H = true;
                }
                if (this.q == 1836019558) {
                    int size3 = sparseArray.size();
                    for (int i11 = 0; i11 < size3; i11++) {
                        C3886kd0 c3886kd3 = ((C2429Fw) sparseArray.valueAt(i11)).b;
                        c3886kd3.getClass();
                        c3886kd3.c = position5;
                        c3886kd3.b = position5;
                    }
                }
                int i12 = this.q;
                if (i12 == 1835295092) {
                    this.z = null;
                    this.u = position5 + this.r;
                    this.p = 2;
                } else if (i12 == 1836019574 || i12 == 1953653099 || i12 == 1835297121 || i12 == 1835626086 || i12 == 1937007212 || i12 == 1836019558 || i12 == 1953653094 || i12 == 1836475768 || i12 == 1701082227) {
                    long position6 = (interfaceC4265ot.getPosition() + this.r) - 8;
                    arrayDeque2.push(new M6(this.q, position6));
                    if (this.r == this.s) {
                        f(position6);
                    } else {
                        this.p = 0;
                        this.s = 0;
                    }
                } else if (i12 == 1751411826 || i12 == 1835296868 || i12 == 1836476516 || i12 == 1936286840 || i12 == 1937011556 || i12 == 1937011827 || i12 == 1668576371 || i12 == 1937011555 || i12 == 1937011578 || i12 == 1937013298 || i12 == 1937007471 || i12 == 1668232756 || i12 == 1937011571 || i12 == 1952867444 || i12 == 1952868452 || i12 == 1953196132 || i12 == 1953654136 || i12 == 1953658222 || i12 == 1886614376 || i12 == 1935763834 || i12 == 1935763823 || i12 == 1936027235 || i12 == 1970628964 || i12 == 1935828848 || i12 == 1936158820 || i12 == 1701606260 || i12 == 1835362404 || i12 == 1701671783) {
                    if (this.s != 8) {
                        throw KT.c("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.r > 2147483647L) {
                        throw KT.c("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    JT jt5 = new JT((int) this.r);
                    System.arraycopy(jt4.f3266a, 0, jt5.f3266a, 0, 8);
                    this.t = jt5;
                    this.p = 1;
                } else {
                    if (this.r > 2147483647L) {
                        throw KT.c("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.t = null;
                    this.p = 1;
                }
            }
        }
        int i13 = this.p;
        C3886kd0 c3886kd4 = c2429Fw.b;
        if (i13 == 3) {
            int i14 = !c2429Fw.l ? c2429Fw.d.d[c2429Fw.f] : c3886kd4.h[c2429Fw.f];
            this.A = i14;
            if (c2429Fw.f < c2429Fw.i) {
                interfaceC4265ot.skipFully(i14);
                C3798jd0 c3798jd0A = c2429Fw.a();
                if (c3798jd0A != null) {
                    JT jt6 = c3886kd4.n;
                    int i15 = c3798jd0A.d;
                    if (i15 != 0) {
                        jt6.F(i15);
                    }
                    int i16 = c2429Fw.f;
                    if (c3886kd4.k && c3886kd4.l[i16]) {
                        jt6.F(jt6.y() * 6);
                    }
                }
                if (!c2429Fw.b()) {
                    this.z = null;
                }
                this.p = 3;
                return 0;
            }
            if (c2429Fw.d.f4891a.g == 1) {
                this.A = i14 - 8;
                interfaceC4265ot.skipFully(8);
            }
            if ("audio/ac4".equals(c2429Fw.d.f4891a.f.l)) {
                this.B = c2429Fw.c(this.A, 7);
                int i17 = this.A;
                JT jt7 = this.i;
                AbstractC2995aW.E(i17, jt7);
                c2429Fw.f3094a.d(7, jt7);
                this.B += 7;
            } else {
                this.B = c2429Fw.c(this.A, 0);
            }
            this.A += this.B;
            this.p = 4;
            this.C = 0;
        }
        C4414qd0 c4414qd0 = c2429Fw.d;
        C3712id0 c3712id0 = c4414qd0.f4891a;
        long jA2 = c2429Fw.l ? c3886kd4.i[c2429Fw.f] : c4414qd0.f[c2429Fw.f];
        if (mc0 != null) {
            jA2 = mc0.a(jA2);
        }
        int i18 = c3712id0.j;
        InterfaceC4326pd0 interfaceC4326pd2 = c2429Fw.f3094a;
        if (i18 == 0) {
            mc1 = mc0;
            while (true) {
                int i19 = this.B;
                int i20 = this.A;
                if (i19 >= i20) {
                    break;
                }
                this.B += interfaceC4326pd2.c(interfaceC4265ot, i20 - i19, false);
            }
        } else {
            JT jt8 = this.f;
            byte[] bArr2 = jt8.f3266a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i21 = i18 + 1;
            int i22 = 4 - i18;
            while (this.B < this.A) {
                int i23 = this.C;
                Mc0 mc2 = mc0;
                C4619sw c4619sw = c3712id0.f;
                if (i23 == 0) {
                    interfaceC4265ot.readFully(bArr2, i22, i21);
                    jt8.E(0);
                    int iF2 = jt8.f();
                    C3712id0 c3712id1 = c3712id0;
                    if (iF2 < 1) {
                        throw KT.a("Invalid NAL length", null);
                    }
                    this.C = iF2 - 1;
                    JT jt9 = this.e;
                    jt9.E(0);
                    interfaceC4326pd2.d(4, jt9);
                    interfaceC4326pd2.d(1, jt8);
                    if (this.G.length > 0) {
                        String str3 = c4619sw.l;
                        int i24 = bArr2[4];
                        byte[] bArr3 = AbstractC5188zQ.f5325a;
                        if ("video/avc".equals(str3)) {
                            i = i21;
                            if ((i24 & 31) != 6) {
                            }
                            z = true;
                            this.D = z;
                            this.B += 5;
                            this.A += i22;
                            c3712id0 = c3712id1;
                            i21 = i;
                        } else {
                            i = i21;
                        }
                        if ("video/hevc".equals(str3) && ((i24 & EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) >> 1) == 39) {
                            z = true;
                        }
                        this.D = z;
                        this.B += 5;
                        this.A += i22;
                        c3712id0 = c3712id1;
                        i21 = i;
                    } else {
                        i = i21;
                    }
                    z = false;
                    this.D = z;
                    this.B += 5;
                    this.A += i22;
                    c3712id0 = c3712id1;
                    i21 = i;
                } else {
                    C3712id0 c3712id2 = c3712id0;
                    int i25 = i21;
                    if (this.D) {
                        JT jt10 = this.g;
                        jt10.B(i23);
                        interfaceC4265ot.readFully(jt10.f3266a, 0, this.C);
                        interfaceC4326pd2.d(this.C, jt10);
                        iC = this.C;
                        int iE = AbstractC5188zQ.e(jt10.f3266a, jt10.c);
                        jt10.E("video/hevc".equals(c4619sw.l) ? 1 : 0);
                        jt10.D(iE);
                        AbstractC2845Vx.Q(jA2, jt10, this.G);
                    } else {
                        iC = interfaceC4326pd2.c(interfaceC4265ot, i23, false);
                    }
                    this.B += iC;
                    this.C -= iC;
                    c3712id0 = c3712id2;
                    i21 = i25;
                    i22 = i22;
                }
                mc0 = mc2;
            }
            mc1 = mc0;
        }
        int i26 = c2429Fw.l ? c3886kd4.j[c2429Fw.f] ? 1 : 0 : c2429Fw.d.g[c2429Fw.f];
        int i27 = c2429Fw.a() != null ? 1073741824 | i26 : i26;
        C3798jd0 c3798jd0A2 = c2429Fw.a();
        interfaceC4326pd2.a(jA2, i27, this.A, 0, c3798jd0A2 != null ? c3798jd0A2.c : null);
        while (!arrayDeque.isEmpty()) {
            C2403Ew c2403Ew = (C2403Ew) arrayDeque.removeFirst();
            this.v -= c2403Ew.c;
            boolean z3 = c2403Ew.b;
            long jA3 = c2403Ew.f3046a;
            if (z3) {
                jA3 += jA2;
            }
            Mc0 mc3 = mc1;
            if (mc1 != null) {
                jA3 = mc3.a(jA3);
            }
            for (InterfaceC4326pd0 interfaceC4326pd3 : this.F) {
                interfaceC4326pd3.a(jA3, 1, c2403Ew.c, this.v, null);
            }
            mc1 = mc3;
        }
        if (!c2429Fw.b()) {
            this.z = null;
        }
        this.p = 3;
        return 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final boolean b(InterfaceC4265ot interfaceC4265ot) {
        return FW.d0(interfaceC4265ot, true, false);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void d(InterfaceC4353pt interfaceC4353pt) {
        int i;
        this.E = interfaceC4353pt;
        this.p = 0;
        this.s = 0;
        InterfaceC4326pd0[] interfaceC4326pd0Arr = new InterfaceC4326pd0[2];
        this.F = interfaceC4326pd0Arr;
        InterfaceC4326pd0 interfaceC4326pd0 = this.o;
        if (interfaceC4326pd0 != null) {
            interfaceC4326pd0Arr[0] = interfaceC4326pd0;
            i = 1;
        } else {
            i = 0;
        }
        int i2 = 100;
        if ((this.f3144a & 4) != 0) {
            interfaceC4326pd0Arr[i] = interfaceC4353pt.track(100, 5);
            i2 = 101;
            i++;
        }
        InterfaceC4326pd0[] interfaceC4326pd0Arr2 = (InterfaceC4326pd0[]) Ug0.N(this.F, i);
        this.F = interfaceC4326pd0Arr2;
        for (InterfaceC4326pd0 interfaceC4326pd1 : interfaceC4326pd0Arr2) {
            interfaceC4326pd1.e(J);
        }
        List list = this.c;
        this.G = new InterfaceC4326pd0[list.size()];
        int i3 = 0;
        while (i3 < this.G.length) {
            InterfaceC4326pd0 interfaceC4326pd0Track = this.E.track(i2, 3);
            interfaceC4326pd0Track.e((C4619sw) list.get(i3));
            this.G[i3] = interfaceC4326pd0Track;
            i3++;
            i2++;
        }
        C3712id0 c3712id0 = this.b;
        if (c3712id0 != null) {
            this.d.put(0, new C2429Fw(interfaceC4353pt.track(0, c3712id0.b), new C4414qd0(this.b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new C2601Mn(0, 0, 0, 0)));
            this.E.endTracks();
        }
    }

    /* JADX WARN: Code duplicated, block: B:171:0x03af  */
    /* JADX WARN: Code duplicated, block: B:174:0x03c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:175:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:176:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:179:0x03d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:181:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:183:0x03e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:185:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:188:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:190:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:191:0x0407  */
    /* JADX WARN: Code duplicated, block: B:194:0x0423  */
    /* JADX WARN: Code duplicated, block: B:195:0x0431  */
    /* JADX WARN: Code duplicated, block: B:201:0x0447  */
    /* JADX WARN: Code duplicated, block: B:301:0x0670  */
    /* JADX WARN: Code duplicated, block: B:362:0x0474 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x0462 A[SYNTHETIC] */
    public final void f(long j) throws KT {
        C2455Gw c2455Gw;
        ArrayList arrayList;
        int i;
        int i2;
        ArrayList arrayList2;
        int i3;
        SparseArray sparseArray;
        C2455Gw c2455Gw2;
        int i4;
        byte[] bArr;
        int i5;
        boolean z;
        int i6;
        ArrayList arrayList3;
        int i7;
        C2429Fw c2429Fw;
        boolean z2;
        boolean z3;
        boolean z4;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        boolean z5;
        int i8;
        long j2;
        int i9;
        int iF;
        int iF2;
        int iF3;
        int iF4;
        long jR;
        C2429Fw c2429Fw2;
        boolean z6;
        long[] jArr2;
        C2601Mn c2601Mn;
        C2601Mn c2601Mn2;
        ArrayList arrayList4;
        final C2455Gw c2455Gw3 = this;
        while (true) {
            ArrayDeque arrayDeque = c2455Gw3.m;
            if (arrayDeque.isEmpty() || ((M6) arrayDeque.peek()).c != j) {
                break;
            }
            M6 m6 = (M6) arrayDeque.pop();
            int i10 = m6.b;
            SparseArray sparseArray2 = c2455Gw3.d;
            ArrayList arrayList5 = m6.d;
            int i11 = 1;
            int i12 = c2455Gw3.f3144a;
            int i13 = 12;
            C3712id0 c3712id0 = c2455Gw3.b;
            if (i10 == 1836019574) {
                if (!(c3712id0 == null)) {
                    throw new IllegalStateException("Unexpected moov box.");
                }
                DrmInitData drmInitDataC = c(arrayList5);
                M6 m6E = m6.e(1836475768);
                m6E.getClass();
                SparseArray sparseArray3 = new SparseArray();
                ArrayList arrayList6 = m6E.d;
                int size = arrayList6.size();
                int i14 = 0;
                long jU = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                while (i14 < size) {
                    N6 n6 = (N6) arrayList6.get(i14);
                    int i15 = n6.b;
                    JT jt = n6.c;
                    if (i15 == 1953654136) {
                        jt.E(i13);
                        arrayList4 = arrayList6;
                        Pair pairCreate = Pair.create(Integer.valueOf(jt.f()), new C2601Mn(jt.f() - i11, jt.f(), jt.f(), jt.f()));
                        sparseArray3.put(((Integer) pairCreate.first).intValue(), (C2601Mn) pairCreate.second);
                    } else {
                        arrayList4 = arrayList6;
                        if (i15 == 1835362404) {
                            jt.E(8);
                            jU = AbstractC4936wb.d(jt.f()) == 0 ? jt.u() : jt.x();
                        }
                    }
                    i14++;
                    arrayList6 = arrayList4;
                    i13 = 12;
                    i11 = 1;
                }
                ArrayList arrayListE = R6.e(m6, new C4884vx(), jU, drmInitDataC, (i12 & 16) != 0, false, new InterfaceC4269ox() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Dw
                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4269ox
                    public final Object apply(Object obj) {
                        C3712id0 c3712id1 = (C3712id0) obj;
                        this.f2998a.getClass();
                        return c3712id1;
                    }
                });
                int size2 = arrayListE.size();
                if (sparseArray2.size() == 0) {
                    for (int i16 = 0; i16 < size2; i16++) {
                        C4414qd0 c4414qd0 = (C4414qd0) arrayListE.get(i16);
                        C3712id0 c3712id1 = c4414qd0.f4891a;
                        InterfaceC4326pd0 interfaceC4326pd0Track = c2455Gw3.E.track(i16, c3712id1.b);
                        int size3 = sparseArray3.size();
                        int i17 = c3712id1.f4512a;
                        if (size3 == 1) {
                            c2601Mn2 = (C2601Mn) sparseArray3.valueAt(0);
                        } else {
                            c2601Mn2 = (C2601Mn) sparseArray3.get(i17);
                            c2601Mn2.getClass();
                        }
                        sparseArray2.put(i17, new C2429Fw(interfaceC4326pd0Track, c4414qd0, c2601Mn2));
                        c2455Gw3.x = Math.max(c2455Gw3.x, c3712id1.e);
                    }
                    c2455Gw3.E.endTracks();
                } else {
                    FW.s(sparseArray2.size() == size2);
                    for (int i18 = 0; i18 < size2; i18++) {
                        C4414qd0 c4414qd1 = (C4414qd0) arrayListE.get(i18);
                        C3712id0 c3712id2 = c4414qd1.f4891a;
                        C2429Fw c2429Fw3 = (C2429Fw) sparseArray2.get(c3712id2.f4512a);
                        if (sparseArray3.size() == 1) {
                            c2601Mn = (C2601Mn) sparseArray3.valueAt(0);
                        } else {
                            c2601Mn = (C2601Mn) sparseArray3.get(c3712id2.f4512a);
                            c2601Mn.getClass();
                        }
                        c2429Fw3.d = c4414qd1;
                        c2429Fw3.e = c2601Mn;
                        c2429Fw3.f3094a.e(c4414qd1.f4891a.f);
                        c2429Fw3.d();
                    }
                }
                c2455Gw = c2455Gw3;
            } else if (i10 == 1836019558) {
                boolean z7 = c3712id0 != null;
                ArrayList arrayList7 = m6.e;
                int size4 = arrayList7.size();
                int i19 = 0;
                while (i19 < size4) {
                    M6 m7 = (M6) arrayList7.get(i19);
                    if (m7.b == 1953653094) {
                        N6 n6F = m7.f(1952868452);
                        n6F.getClass();
                        JT jt2 = n6F.c;
                        jt2.E(8);
                        int iF5 = jt2.f();
                        C2429Fw c2429Fw4 = (C2429Fw) (z7 ? sparseArray2.valueAt(0) : sparseArray2.get(jt2.f()));
                        if (c2429Fw4 == null) {
                            z7 = z7;
                            m7 = m7;
                            c2429Fw4 = null;
                        } else {
                            int i20 = iF5 & 1;
                            C3886kd0 c3886kd0 = c2429Fw4.b;
                            if (i20 != 0) {
                                long jX = jt2.x();
                                c3886kd0.b = jX;
                                c3886kd0.c = jX;
                            }
                            C2601Mn c2601Mn3 = c2429Fw4.e;
                            c3886kd0.f4605a = new C2601Mn((iF5 & 2) != 0 ? jt2.f() - 1 : c2601Mn3.f3424a, (iF5 & 8) != 0 ? jt2.f() : c2601Mn3.b, (iF5 & 16) != 0 ? jt2.f() : c2601Mn3.c, (iF5 & 32) != 0 ? jt2.f() : c2601Mn3.d);
                        }
                        if (c2429Fw4 != null) {
                            C3886kd0 c3886kd1 = c2429Fw4.b;
                            long j3 = c3886kd1.p;
                            boolean z8 = c3886kd1.q;
                            c2429Fw4.d();
                            c2429Fw4.l = true;
                            M6 m8 = m7;
                            N6 n6F2 = m8.f(1952867444);
                            if (n6F2 == null || (i12 & 2) != 0) {
                                c3886kd1.p = j3;
                                c3886kd1.q = z8;
                            } else {
                                JT jt3 = n6F2.c;
                                jt3.E(8);
                                c3886kd1.p = AbstractC4936wb.d(jt3.f()) == 1 ? jt3.x() : jt3.u();
                                c3886kd1.q = true;
                            }
                            ArrayList arrayList8 = m8.d;
                            int size5 = arrayList8.size();
                            int i21 = 0;
                            int i22 = 0;
                            int i23 = 0;
                            while (true) {
                                i4 = 1953658222;
                                if (i21 >= size5) {
                                    break;
                                }
                                ArrayList arrayList9 = arrayList7;
                                N6 n7 = (N6) arrayList8.get(i21);
                                int i24 = size4;
                                if (n7.b == 1953658222) {
                                    JT jt4 = n7.c;
                                    jt4.E(12);
                                    int iW = jt4.w();
                                    if (iW > 0) {
                                        i23 += iW;
                                        i22++;
                                    }
                                }
                                i21++;
                                size4 = i24;
                                arrayList7 = arrayList9;
                            }
                            arrayList = arrayList7;
                            i = size4;
                            c2429Fw4.h = 0;
                            c2429Fw4.g = 0;
                            c2429Fw4.f = 0;
                            c3886kd1.d = i22;
                            c3886kd1.e = i23;
                            if (c3886kd1.g.length < i22) {
                                c3886kd1.f = new long[i22];
                                c3886kd1.g = new int[i22];
                            }
                            if (c3886kd1.h.length < i23) {
                                int i25 = (i23 * EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE) / 100;
                                c3886kd1.h = new int[i25];
                                c3886kd1.i = new long[i25];
                                c3886kd1.j = new boolean[i25];
                                c3886kd1.l = new boolean[i25];
                            }
                            int i26 = 0;
                            int i27 = 0;
                            int i28 = 0;
                            while (true) {
                                long j4 = 0;
                                if (i26 >= size5) {
                                    i2 = i19;
                                    arrayList2 = arrayList5;
                                    ArrayList arrayList10 = arrayList8;
                                    i3 = i12;
                                    sparseArray = sparseArray2;
                                    M6 m9 = m8;
                                    C3712id0 c3712id3 = c2429Fw4.d.f4891a;
                                    C2601Mn c2601Mn4 = c3886kd1.f4605a;
                                    c2601Mn4.getClass();
                                    C3798jd0[] c3798jd0Arr = c3712id3.k;
                                    C3798jd0 c3798jd0 = c3798jd0Arr == null ? null : c3798jd0Arr[c2601Mn4.f3424a];
                                    N6 n6F3 = m9.f(1935763834);
                                    if (n6F3 != null) {
                                        c3798jd0.getClass();
                                        JT jt5 = n6F3.c;
                                        jt5.E(8);
                                        if ((jt5.f() & 1) == 1) {
                                            jt5.F(8);
                                        }
                                        int iT = jt5.t();
                                        int iW2 = jt5.w();
                                        if (iW2 > c3886kd1.e) {
                                            StringBuilder sbQ = AbstractC5044xl.q("Saiz sample count ", iW2, " is greater than fragment sample count");
                                            sbQ.append(c3886kd1.e);
                                            throw KT.a(sbQ.toString(), null);
                                        }
                                        int i29 = c3798jd0.d;
                                        if (iT == 0) {
                                            boolean[] zArr2 = c3886kd1.l;
                                            i5 = 0;
                                            for (int i30 = 0; i30 < iW2; i30++) {
                                                int iT2 = jt5.t();
                                                i5 += iT2;
                                                zArr2[i30] = iT2 > i29;
                                            }
                                            z = false;
                                        } else {
                                            boolean z9 = iT > i29;
                                            i5 = iT * iW2;
                                            z = false;
                                            Arrays.fill(c3886kd1.l, 0, iW2, z9);
                                        }
                                        Arrays.fill(c3886kd1.l, iW2, c3886kd1.e, z);
                                        if (i5 > 0) {
                                            c3886kd1.n.B(i5);
                                            c3886kd1.k = true;
                                            c3886kd1.o = true;
                                        }
                                    }
                                    N6 n6F4 = m9.f(1935763823);
                                    if (n6F4 != null) {
                                        JT jt6 = n6F4.c;
                                        jt6.E(8);
                                        int iF6 = jt6.f();
                                        if ((iF6 & 1) == 1) {
                                            jt6.F(8);
                                        }
                                        int iW3 = jt6.w();
                                        if (iW3 != 1) {
                                            throw KT.a("Unexpected saio entry count: " + iW3, null);
                                        }
                                        c3886kd1.c += AbstractC4936wb.d(iF6) == 0 ? jt6.u() : jt6.x();
                                    }
                                    N6 n6F5 = m9.f(1936027235);
                                    if (n6F5 != null) {
                                        e(n6F5.c, 0, c3886kd1);
                                    }
                                    String str = c3798jd0 != null ? c3798jd0.b : null;
                                    JT jt7 = null;
                                    JT jt8 = null;
                                    int i31 = 0;
                                    while (i31 < arrayList10.size()) {
                                        ArrayList arrayList11 = arrayList10;
                                        N6 n8 = (N6) arrayList11.get(i31);
                                        JT jt9 = n8.c;
                                        int i32 = n8.b;
                                        if (i32 == 1935828848) {
                                            jt9.E(12);
                                            if (jt9.f() == 1936025959) {
                                                jt7 = jt9;
                                            }
                                        } else if (i32 == 1936158820) {
                                            jt9.E(12);
                                            if (jt9.f() == 1936025959) {
                                                jt8 = jt9;
                                            }
                                        }
                                        i31++;
                                        arrayList10 = arrayList11;
                                    }
                                    ArrayList arrayList12 = arrayList10;
                                    if (jt7 != null && jt8 != null) {
                                        jt7.E(8);
                                        int iD = AbstractC4936wb.d(jt7.f());
                                        jt7.F(4);
                                        if (iD == 1) {
                                            jt7.F(4);
                                        }
                                        if (jt7.f() != 1) {
                                            throw KT.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        jt8.E(8);
                                        int iD2 = AbstractC4936wb.d(jt8.f());
                                        jt8.F(4);
                                        if (iD2 == 1) {
                                            if (jt8.u() == 0) {
                                                throw KT.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (iD2 >= 2) {
                                            jt8.F(4);
                                        }
                                        if (jt8.u() != 1) {
                                            throw KT.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        jt8.F(1);
                                        int iT3 = jt8.t();
                                        int i33 = (iT3 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                                        int i34 = iT3 & 15;
                                        boolean z10 = jt8.t() == 1;
                                        if (z10) {
                                            int iT4 = jt8.t();
                                            byte[] bArr2 = new byte[16];
                                            jt8.d(bArr2, 0, 16);
                                            if (iT4 == 0) {
                                                int iT5 = jt8.t();
                                                bArr = new byte[iT5];
                                                jt8.d(bArr, 0, iT5);
                                            } else {
                                                bArr = null;
                                            }
                                            c3886kd1.k = true;
                                            c3886kd1.m = new C3798jd0(z10, str, iT4, bArr2, i33, i34, bArr);
                                        }
                                    }
                                    int size6 = arrayList12.size();
                                    for (int i35 = 0; i35 < size6; i35++) {
                                        N6 n9 = (N6) arrayList12.get(i35);
                                        if (n9.b == 1970628964) {
                                            JT jt10 = n9.c;
                                            jt10.E(8);
                                            byte[] bArr3 = this.h;
                                            jt10.d(bArr3, 0, 16);
                                            if (Arrays.equals(bArr3, I)) {
                                                e(jt10, 16, c3886kd1);
                                            }
                                        }
                                    }
                                    c2455Gw2 = this;
                                    break;
                                }
                                N6 n10 = (N6) arrayList8.get(i26);
                                if (n10.b == i4) {
                                    int i36 = i27 + 1;
                                    JT jt11 = n10.c;
                                    jt11.E(8);
                                    int iF7 = jt11.f();
                                    C3712id0 c3712id4 = c2429Fw4.d.f4891a;
                                    C2601Mn c2601Mn5 = c3886kd1.f4605a;
                                    int i37 = Ug0.f3833a;
                                    c3886kd1.g[i27] = jt11.w();
                                    long[] jArr3 = c3886kd1.f;
                                    long j5 = c3886kd1.b;
                                    jArr3[i27] = j5;
                                    if ((iF7 & 1) != 0) {
                                        jArr3[i27] = j5 + ((long) jt11.f());
                                    }
                                    boolean z11 = (iF7 & 4) != 0;
                                    int iF8 = c2601Mn5.d;
                                    if (z11) {
                                        iF8 = jt11.f();
                                    }
                                    boolean z12 = (iF7 & 256) != 0;
                                    boolean z13 = (iF7 & 512) != 0;
                                    boolean z14 = (iF7 & 1024) != 0;
                                    boolean z15 = (iF7 & 2048) != 0;
                                    long[] jArr4 = c3712id4.h;
                                    int i38 = iF8;
                                    if (jArr4 != null) {
                                        arrayList3 = arrayList8;
                                        if (jArr4.length == 1 && (jArr2 = c3712id4.i) != null) {
                                            long j6 = jArr4[0];
                                            if (j6 == 0) {
                                                z2 = z13;
                                                z3 = z14;
                                                z4 = z15;
                                            } else {
                                                z4 = z15;
                                                long jR2 = Ug0.R(j6 + jArr2[0], 1000000L, c3712id4.d);
                                                z2 = z13;
                                                z3 = z14;
                                                if (jR2 >= c3712id4.e) {
                                                }
                                            }
                                            j4 = jArr2[0];
                                        }
                                        iArr = c3886kd1.h;
                                        jArr = c3886kd1.i;
                                        zArr = c3886kd1.j;
                                        if (c3712id4.b == 2 || (i12 & 1) == 0) {
                                            z5 = false;
                                        } else {
                                            z5 = true;
                                        }
                                        i8 = c3886kd1.g[i27] + i28;
                                        int i39 = i12;
                                        j2 = c3886kd1.p;
                                        i7 = i39;
                                        i9 = i28;
                                        while (i9 < i8) {
                                            if (z12) {
                                                iF = jt11.f();
                                            } else {
                                                iF = c2601Mn5.b;
                                            }
                                            if (iF >= 0) {
                                                throw KT.a("Unexpected negative value: " + iF, null);
                                            }
                                            if (z2) {
                                                iF2 = jt11.f();
                                            } else {
                                                iF2 = c2601Mn5.c;
                                            }
                                            if (iF2 >= 0) {
                                                throw KT.a("Unexpected negative value: " + iF2, null);
                                            }
                                            if (z3) {
                                                iF3 = jt11.f();
                                            } else if (i9 == 0 || !z11) {
                                                iF3 = c2601Mn5.d;
                                            } else {
                                                iF3 = i38;
                                            }
                                            if (z4) {
                                                iF4 = jt11.f();
                                            } else {
                                                iF4 = 0;
                                            }
                                            jR = Ug0.R((((long) iF4) + j2) - j4, 1000000L, c3712id4.c);
                                            jArr[i9] = jR;
                                            if (c3886kd1.q) {
                                                c2429Fw2 = c2429Fw4;
                                            } else {
                                                c2429Fw2 = c2429Fw4;
                                                jArr[i9] = jR + c2429Fw2.d.h;
                                            }
                                            iArr[i9] = iF2;
                                            if (((iF3 >> 16) & 1) == 0 || (z5 && i9 != 0)) {
                                                z6 = false;
                                            } else {
                                                z6 = true;
                                            }
                                            zArr[i9] = z6;
                                            j2 += (long) iF;
                                            i9++;
                                            z4 = z4;
                                            i8 = i8;
                                            z12 = z12;
                                            i26 = i26;
                                            jt11 = jt11;
                                            c2601Mn5 = c2601Mn5;
                                            c3712id4 = c3712id4;
                                            c2429Fw4 = c2429Fw2;
                                            z11 = z11;
                                        }
                                        i6 = i26;
                                        int i40 = i8;
                                        c2429Fw = c2429Fw4;
                                        c3886kd1.p = j2;
                                        i27 = i36;
                                        i28 = i40;
                                    } else {
                                        arrayList3 = arrayList8;
                                    }
                                    z2 = z13;
                                    z3 = z14;
                                    z4 = z15;
                                    iArr = c3886kd1.h;
                                    jArr = c3886kd1.i;
                                    zArr = c3886kd1.j;
                                    if (c3712id4.b == 2) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    i8 = c3886kd1.g[i27] + i28;
                                    int i310 = i12;
                                    j2 = c3886kd1.p;
                                    i7 = i310;
                                    i9 = i28;
                                    while (i9 < i8) {
                                        if (z12) {
                                            iF = jt11.f();
                                        } else {
                                            iF = c2601Mn5.b;
                                        }
                                        if (iF >= 0) {
                                            throw KT.a("Unexpected negative value: " + iF, null);
                                        }
                                        if (z2) {
                                            iF2 = jt11.f();
                                        } else {
                                            iF2 = c2601Mn5.c;
                                        }
                                        if (iF2 >= 0) {
                                            throw KT.a("Unexpected negative value: " + iF2, null);
                                        }
                                        if (z3) {
                                            iF3 = jt11.f();
                                        } else if (i9 == 0) {
                                            iF3 = c2601Mn5.d;
                                        } else {
                                            iF3 = c2601Mn5.d;
                                        }
                                        if (z4) {
                                            iF4 = jt11.f();
                                        } else {
                                            iF4 = 0;
                                        }
                                        jR = Ug0.R((((long) iF4) + j2) - j4, 1000000L, c3712id4.c);
                                        jArr[i9] = jR;
                                        if (c3886kd1.q) {
                                            c2429Fw2 = c2429Fw4;
                                            jArr[i9] = jR + c2429Fw2.d.h;
                                        } else {
                                            c2429Fw2 = c2429Fw4;
                                        }
                                        iArr[i9] = iF2;
                                        if (((iF3 >> 16) & 1) == 0) {
                                            z6 = false;
                                        } else {
                                            z6 = false;
                                        }
                                        zArr[i9] = z6;
                                        j2 += (long) iF;
                                        i9++;
                                        z4 = z4;
                                        i8 = i8;
                                        z12 = z12;
                                        i26 = i26;
                                        jt11 = jt11;
                                        c2601Mn5 = c2601Mn5;
                                        c3712id4 = c3712id4;
                                        c2429Fw4 = c2429Fw2;
                                        z11 = z11;
                                    }
                                    i6 = i26;
                                    int i41 = i8;
                                    c2429Fw = c2429Fw4;
                                    c3886kd1.p = j2;
                                    i27 = i36;
                                    i28 = i41;
                                } else {
                                    i6 = i26;
                                    arrayList3 = arrayList8;
                                    i7 = i12;
                                    m8 = m8;
                                    c2429Fw = c2429Fw4;
                                }
                                i26 = i6 + 1;
                                c2429Fw4 = c2429Fw;
                                size5 = size5;
                                sparseArray2 = sparseArray2;
                                arrayList5 = arrayList5;
                                i19 = i19;
                                m8 = m8;
                                arrayList8 = arrayList3;
                                i12 = i7;
                                i4 = 1953658222;
                            }
                        }
                        i19 = i2 + 1;
                        c2455Gw3 = c2455Gw2;
                        z7 = z7;
                        size4 = i;
                        arrayList7 = arrayList;
                        sparseArray2 = sparseArray;
                        arrayList5 = arrayList2;
                        i12 = i3;
                    } else {
                        z7 = z7;
                    }
                    arrayList = arrayList7;
                    i = size4;
                    i2 = i19;
                    arrayList2 = arrayList5;
                    i3 = i12;
                    sparseArray = sparseArray2;
                    c2455Gw2 = c2455Gw3;
                    i19 = i2 + 1;
                    c2455Gw3 = c2455Gw2;
                    z7 = z7;
                    size4 = i;
                    arrayList7 = arrayList;
                    sparseArray2 = sparseArray;
                    arrayList5 = arrayList2;
                    i12 = i3;
                }
                ArrayList arrayList13 = arrayList5;
                SparseArray sparseArray4 = sparseArray2;
                c2455Gw = c2455Gw3;
                DrmInitData drmInitDataC2 = c(arrayList13);
                if (drmInitDataC2 != null) {
                    int size7 = sparseArray4.size();
                    int i42 = 0;
                    while (i42 < size7) {
                        SparseArray sparseArray5 = sparseArray4;
                        C2429Fw c2429Fw5 = (C2429Fw) sparseArray5.valueAt(i42);
                        C3712id0 c3712id5 = c2429Fw5.d.f4891a;
                        C2601Mn c2601Mn6 = c2429Fw5.b.f4605a;
                        int i43 = Ug0.f3833a;
                        int i44 = c2601Mn6.f3424a;
                        C3798jd0[] c3798jd0Arr2 = c3712id5.k;
                        C3798jd0 c3798jd1 = c3798jd0Arr2 == null ? null : c3798jd0Arr2[i44];
                        DrmInitData drmInitDataB = drmInitDataC2.b(c3798jd1 != null ? c3798jd1.b : null);
                        C4531rw c4531rwA = c2429Fw5.d.f4891a.f.a();
                        c4531rwA.n = drmInitDataB;
                        c2429Fw5.f3094a.e(new C4619sw(c4531rwA));
                        i42++;
                        sparseArray4 = sparseArray5;
                    }
                }
                SparseArray sparseArray6 = sparseArray4;
                if (c2455Gw.w != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    int size8 = sparseArray6.size();
                    for (int i45 = 0; i45 < size8; i45++) {
                        C2429Fw c2429Fw6 = (C2429Fw) sparseArray6.valueAt(i45);
                        long j7 = c2455Gw.w;
                        int i46 = c2429Fw6.f;
                        while (true) {
                            C3886kd0 c3886kd2 = c2429Fw6.b;
                            if (i46 >= c3886kd2.e || c3886kd2.i[i46] > j7) {
                                break;
                            }
                            if (c3886kd2.j[i46]) {
                                c2429Fw6.i = i46;
                            }
                            i46++;
                        }
                    }
                    c2455Gw.w = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                }
            } else {
                c2455Gw = c2455Gw3;
                if (!arrayDeque.isEmpty()) {
                    ((M6) arrayDeque.peek()).e.add(m6);
                }
            }
            c2455Gw3 = c2455Gw;
        }
        C2455Gw c2455Gw4 = c2455Gw3;
        c2455Gw4.p = 0;
        c2455Gw4.s = 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void seek(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((C2429Fw) sparseArray.valueAt(i)).d();
        }
        this.n.clear();
        this.v = 0;
        this.w = j2;
        this.m.clear();
        this.p = 0;
        this.s = 0;
    }

    public C2455Gw(int i, Mc0 mc0, C3712id0 c3712id0, List list, InterfaceC4326pd0 interfaceC4326pd0) {
        this.f3144a = i;
        this.j = mc0;
        this.b = c3712id0;
        this.c = Collections.unmodifiableList(list);
        this.o = interfaceC4326pd0;
        this.k = new C3491g4(8);
        this.l = new JT(16);
        this.e = new JT(AbstractC5188zQ.f5325a);
        this.f = new JT(5);
        this.g = new JT();
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new JT(bArr);
        this.m = new ArrayDeque();
        this.n = new ArrayDeque();
        this.d = new SparseArray();
        this.x = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.w = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.y = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.E = InterfaceC4353pt.f1;
        this.F = new InterfaceC4326pd0[0];
        this.G = new InterfaceC4326pd0[0];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void release() {
    }
}
