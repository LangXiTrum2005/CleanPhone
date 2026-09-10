package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class JA implements Closeable {
    public static final Logger e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2460Hb f3258a;
    public final boolean b;
    public final IA c;
    public final C3765jA d;

    static {
        Logger logger = Logger.getLogger(AbstractC4644tA.class.getName());
        AbstractC2995aW.p(logger, "getLogger(Http2::class.java.name)");
        e = logger;
    }

    public JA(InterfaceC2460Hb interfaceC2460Hb, boolean z) {
        this.f3258a = interfaceC2460Hb;
        this.b = z;
        IA ia = new IA(interfaceC2460Hb);
        this.c = ia;
        this.d = new C3765jA(ia);
    }

    public final boolean a(boolean z, AA aa) throws IOException {
        EnumC2502Ir enumC2502Ir;
        int i;
        int i2 = 0;
        AbstractC2995aW.q(aa, "handler");
        try {
            this.f3258a.D(9L);
            int iS = Vg0.s(this.f3258a);
            if (iS > 16384) {
                throw new IOException(AbstractC2995aW.v0(Integer.valueOf(iS), "FRAME_SIZE_ERROR: "));
            }
            int i3 = this.f3258a.readByte() & 255;
            byte b = this.f3258a.readByte();
            int i4 = b & 255;
            int i5 = this.f3258a.readInt();
            int i6 = i5 & Integer.MAX_VALUE;
            Logger logger = e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(AbstractC4644tA.a(i6, iS, i3, i4, true));
            }
            if (z && i3 != 4) {
                String[] strArr = AbstractC4644tA.b;
                throw new IOException(AbstractC2995aW.v0(i3 < strArr.length ? strArr[i3] : Vg0.h("0x%02x", Integer.valueOf(i3)), "Expected a SETTINGS frame but was "));
            }
            switch (i3) {
                case 0:
                    c(aa, iS, i4, i6);
                    return true;
                case 1:
                    g(aa, iS, i4, i6);
                    return true;
                case 2:
                    if (iS != 5) {
                        throw new IOException(AbstractC5044xl.g("TYPE_PRIORITY length: ", iS, " != 5"));
                    }
                    if (i6 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    InterfaceC2460Hb interfaceC2460Hb = this.f3258a;
                    interfaceC2460Hb.readInt();
                    interfaceC2460Hb.readByte();
                    return true;
                case 3:
                    if (iS != 4) {
                        throw new IOException(AbstractC5044xl.g("TYPE_RST_STREAM length: ", iS, " != 4"));
                    }
                    if (i6 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i7 = this.f3258a.readInt();
                    EnumC2502Ir[] enumC2502IrArrValues = EnumC2502Ir.values();
                    int length = enumC2502IrArrValues.length;
                    while (true) {
                        if (i2 < length) {
                            EnumC2502Ir enumC2502Ir2 = enumC2502IrArrValues[i2];
                            if (enumC2502Ir2.f3242a == i7) {
                                enumC2502Ir = enumC2502Ir2;
                            } else {
                                i2++;
                            }
                        } else {
                            enumC2502Ir = null;
                        }
                    }
                    if (enumC2502Ir == null) {
                        throw new IOException(AbstractC2995aW.v0(Integer.valueOf(i7), "TYPE_RST_STREAM unexpected error code: "));
                    }
                    GA ga = aa.b;
                    ga.getClass();
                    if (i6 == 0 || (i5 & 1) != 0) {
                        MA maG = ga.g(i6);
                        if (maG != null) {
                            maG.k(enumC2502Ir);
                        }
                    } else {
                        ga.j.c(new DA(ga.d + '[' + i6 + "] onReset", ga, i6, enumC2502Ir, 0), 0L);
                    }
                    return true;
                case 4:
                    if (i6 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((b & 1) == 0) {
                        if (iS % 6 != 0) {
                            throw new IOException(AbstractC2995aW.v0(Integer.valueOf(iS), "TYPE_SETTINGS length % 6 != 0: "));
                        }
                        R50 r50 = new R50();
                        C4999xD c4999xDA0 = AbstractC3375el.a0(AbstractC3375el.f0(0, iS), 6);
                        int i8 = c4999xDA0.f5212a;
                        int i9 = c4999xDA0.b;
                        int i10 = c4999xDA0.c;
                        if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                            while (true) {
                                int i11 = i8 + i10;
                                InterfaceC2460Hb interfaceC2460Hb2 = this.f3258a;
                                short s = interfaceC2460Hb2.readShort();
                                byte[] bArr = Vg0.f3884a;
                                int i12 = s & 65535;
                                i = interfaceC2460Hb2.readInt();
                                if (i12 != 2) {
                                    if (i12 == 3) {
                                        i12 = 4;
                                    } else if (i12 == 4) {
                                        if (i < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i12 = 7;
                                    } else if (i12 == 5 && (i < 16384 || i > 16777215)) {
                                    }
                                } else if (i != 0 && i != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                r50.c(i12, i);
                                if (i8 != i9) {
                                    i8 = i11;
                                }
                            }
                            throw new IOException(AbstractC2995aW.v0(Integer.valueOf(i), "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                        }
                        GA ga2 = aa.b;
                        ga2.i.c(new C5172zA(AbstractC2995aW.v0(" applyAndAckSettings", ga2.d), aa, r50), 0L);
                    } else if (iS != 0) {
                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    return true;
                case 5:
                    i(aa, iS, i4, i6);
                    return true;
                case 6:
                    h(aa, iS, i4, i6);
                    return true;
                case 7:
                    e(aa, iS, i6);
                    return true;
                case 8:
                    if (iS != 4) {
                        throw new IOException(AbstractC2995aW.v0(Integer.valueOf(iS), "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long j = ((long) this.f3258a.readInt()) & 2147483647L;
                    if (j == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i6 != 0) {
                        MA maC = aa.b.c(i6);
                        if (maC != null) {
                            synchronized (maC) {
                                maC.f += j;
                                if (j > 0) {
                                    maC.notifyAll();
                                }
                            }
                        }
                        break;
                    } else {
                        GA ga3 = aa.b;
                        synchronized (ga3) {
                            ga3.w += j;
                            ga3.notifyAll();
                        }
                    }
                    return true;
                default:
                    this.f3258a.skip(iS);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void b(AA aa) throws IOException {
        AbstractC2995aW.q(aa, "handler");
        if (this.b) {
            if (!a(true, aa)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        C3971lc c3971lc = AbstractC4644tA.f5023a;
        C3971lc c3971lcF = this.f3258a.F(c3971lc.f4653a.length);
        Level level = Level.FINE;
        Logger logger = e;
        if (logger.isLoggable(level)) {
            logger.fine(Vg0.h(AbstractC2995aW.v0(c3971lcF.d(), "<< CONNECTION "), new Object[0]));
        }
        if (!AbstractC2995aW.i(c3971lc, c3971lcF)) {
            throw new IOException(AbstractC2995aW.v0(c3971lcF.j(), "Expected a connection header but was "));
        }
    }

    public final void c(AA aa, int i, int i2, int i3) throws IOException {
        int i4;
        boolean z;
        boolean z2;
        long j;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z3 = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i2 & 8) != 0) {
            byte b = this.f3258a.readByte();
            byte[] bArr = Vg0.f3884a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int iS = C3887ke.s(i, i2, i4);
        InterfaceC2460Hb interfaceC2460Hb = this.f3258a;
        aa.getClass();
        AbstractC2995aW.q(interfaceC2460Hb, "source");
        aa.b.getClass();
        if (i3 != 0 && (i3 & 1) == 0) {
            GA ga = aa.b;
            ga.getClass();
            C4848vb c4848vb = new C4848vb();
            long j2 = iS;
            interfaceC2460Hb.D(j2);
            interfaceC2460Hb.read(c4848vb, j2);
            ga.j.c(new BA(ga.d + '[' + i3 + "] onData", ga, i3, c4848vb, iS, z3), 0L);
        } else {
            MA maC = aa.b.c(i3);
            if (maC == null) {
                aa.b.m(i3, EnumC2502Ir.PROTOCOL_ERROR);
                long j3 = iS;
                aa.b.i(j3);
                interfaceC2460Hb.skip(j3);
            } else {
                byte[] bArr2 = Vg0.f3884a;
                LA la = maC.i;
                long j4 = iS;
                la.getClass();
                for (long j5 = 0; j4 > j5; j5 = 0) {
                    synchronized (la.f) {
                        z = la.b;
                        z2 = la.d.b + j4 > la.f3343a;
                    }
                    if (z2) {
                        interfaceC2460Hb.skip(j4);
                        la.f.e(EnumC2502Ir.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z) {
                        interfaceC2460Hb.skip(j4);
                        break;
                    }
                    long j6 = interfaceC2460Hb.read(la.c, j4);
                    if (j6 == -1) {
                        throw new EOFException();
                    }
                    j4 -= j6;
                    MA ma = la.f;
                    synchronized (ma) {
                        if (la.e) {
                            C4848vb c4848vb2 = la.c;
                            j = c4848vb2.b;
                            c4848vb2.skip(j);
                        } else {
                            C4848vb c4848vb3 = la.d;
                            boolean z4 = c4848vb3.b == 0;
                            c4848vb3.B(la.c);
                            if (z4) {
                                ma.notifyAll();
                            }
                            j = 0;
                        }
                    }
                    if (j > 0) {
                        la.f(j);
                    }
                }
                if (z3) {
                    maC.j(Vg0.b, true);
                }
            }
        }
        this.f3258a.skip(i4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f3258a.close();
    }

    public final void e(AA aa, int i, int i2) throws IOException {
        EnumC2502Ir enumC2502Ir;
        Object[] array;
        if (i < 8) {
            throw new IOException(AbstractC2995aW.v0(Integer.valueOf(i), "TYPE_GOAWAY length < 8: "));
        }
        if (i2 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i3 = this.f3258a.readInt();
        int i4 = this.f3258a.readInt();
        int i5 = i - 8;
        EnumC2502Ir[] enumC2502IrArrValues = EnumC2502Ir.values();
        int length = enumC2502IrArrValues.length;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                enumC2502Ir = null;
                break;
            }
            enumC2502Ir = enumC2502IrArrValues[i7];
            if (enumC2502Ir.f3242a == i4) {
                break;
            } else {
                i7++;
            }
        }
        if (enumC2502Ir == null) {
            throw new IOException(AbstractC2995aW.v0(Integer.valueOf(i4), "TYPE_GOAWAY unexpected error code: "));
        }
        C3971lc c3971lcF = C3971lc.d;
        if (i5 > 0) {
            c3971lcF = this.f3258a.F(i5);
        }
        aa.getClass();
        AbstractC2995aW.q(c3971lcF, "debugData");
        c3971lcF.c();
        GA ga = aa.b;
        synchronized (ga) {
            array = ga.c.values().toArray(new MA[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            ga.g = true;
        }
        MA[] maArr = (MA[]) array;
        int length2 = maArr.length;
        while (i6 < length2) {
            MA ma = maArr[i6];
            i6++;
            if (ma.f3396a > i3 && ma.h()) {
                ma.k(EnumC2502Ir.REFUSED_STREAM);
                aa.b.g(ma.f3396a);
            }
        }
    }

    public final List f(int i, int i2, int i3, int i4) throws IOException {
        IA ia = this.c;
        ia.e = i;
        ia.b = i;
        ia.f = i2;
        ia.c = i3;
        ia.d = i4;
        while (true) {
            C3765jA c3765jA = this.d;
            EX ex = c3765jA.d;
            boolean zK = ex.K();
            ArrayList arrayList = c3765jA.c;
            if (zK) {
                List listU0 = AbstractC2853Wf.u0(arrayList);
                arrayList.clear();
                return listU0;
            }
            byte b = ex.readByte();
            byte[] bArr = Vg0.f3884a;
            int i5 = b & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((b & 128) == 128) {
                int iE = c3765jA.e(i5, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                int i6 = iE - 1;
                if (i6 >= 0) {
                    C4183nz[] c4183nzArr = AbstractC3941lA.f4638a;
                    if (i6 <= c4183nzArr.length - 1) {
                        arrayList.add(c4183nzArr[i6]);
                    }
                }
                int length = c3765jA.f + 1 + (i6 - AbstractC3941lA.f4638a.length);
                if (length >= 0) {
                    C4183nz[] c4183nzArr2 = c3765jA.e;
                    if (length < c4183nzArr2.length) {
                        C4183nz c4183nz = c4183nzArr2[length];
                        AbstractC2995aW.n(c4183nz);
                        arrayList.add(c4183nz);
                    }
                }
                throw new IOException(AbstractC2995aW.v0(Integer.valueOf(iE), "Header index too large "));
            }
            if (i5 == 64) {
                C4183nz[] c4183nzArr3 = AbstractC3941lA.f4638a;
                C3971lc c3971lcD = c3765jA.d();
                AbstractC3941lA.a(c3971lcD);
                c3765jA.c(new C4183nz(c3971lcD, c3765jA.d()));
            } else if ((b & 64) == 64) {
                c3765jA.c(new C4183nz(c3765jA.b(c3765jA.e(i5, 63) - 1), c3765jA.d()));
            } else if ((b & 32) == 32) {
                int iE2 = c3765jA.e(i5, 31);
                c3765jA.b = iE2;
                if (iE2 < 0 || iE2 > c3765jA.f4542a) {
                    throw new IOException(AbstractC2995aW.v0(Integer.valueOf(c3765jA.b), "Invalid dynamic table size update "));
                }
                int i7 = c3765jA.h;
                if (iE2 < i7) {
                    if (iE2 == 0) {
                        C4183nz[] c4183nzArr4 = c3765jA.e;
                        U5.l0(null, c4183nzArr4, 0, c4183nzArr4.length);
                        c3765jA.f = c3765jA.e.length - 1;
                        c3765jA.g = 0;
                        c3765jA.h = 0;
                    } else {
                        c3765jA.a(i7 - iE2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                C4183nz[] c4183nzArr5 = AbstractC3941lA.f4638a;
                C3971lc c3971lcD2 = c3765jA.d();
                AbstractC3941lA.a(c3971lcD2);
                arrayList.add(new C4183nz(c3971lcD2, c3765jA.d()));
            } else {
                arrayList.add(new C4183nz(c3765jA.b(c3765jA.e(i5, 15) - 1), c3765jA.d()));
            }
        }
    }

    public final void g(AA aa, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = false;
        int i5 = 1;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.f3258a.readByte();
            byte[] bArr = Vg0.f3884a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            InterfaceC2460Hb interfaceC2460Hb = this.f3258a;
            interfaceC2460Hb.readInt();
            interfaceC2460Hb.readByte();
            byte[] bArr2 = Vg0.f3884a;
            aa.getClass();
            i -= 5;
        }
        List listF = f(C3887ke.s(i, i2, i4), i4, i2, i3);
        aa.getClass();
        aa.b.getClass();
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            GA ga = aa.b;
            ga.getClass();
            ga.j.c(new CA(ga.d + '[' + i3 + "] onHeaders", ga, i3, listF, z2), 0L);
            return;
        }
        GA ga2 = aa.b;
        synchronized (ga2) {
            MA maC = ga2.c(i3);
            if (maC != null) {
                maC.j(Vg0.u(listF), z2);
                return;
            }
            if (ga2.g) {
                return;
            }
            if (i3 <= ga2.e) {
                return;
            }
            if (i3 % 2 == ga2.f % 2) {
                return;
            }
            MA ma = new MA(i3, ga2, false, z2, Vg0.u(listF));
            ga2.e = i3;
            ga2.c.put(Integer.valueOf(i3), ma);
            ga2.h.f().c(new C4996xA(ga2.d + '[' + i3 + "] onStream", ga2, ma, i5), 0L);
        }
    }

    public final void h(AA aa, int i, int i2, int i3) throws IOException {
        if (i != 8) {
            throw new IOException(AbstractC2995aW.v0(Integer.valueOf(i), "TYPE_PING length != 8: "));
        }
        if (i3 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        int i4 = this.f3258a.readInt();
        int i5 = this.f3258a.readInt();
        if ((i2 & 1) == 0) {
            GA ga = aa.b;
            ga.i.c(new C5084yA(AbstractC2995aW.v0(" ping", ga.d), aa.b, i4, i5), 0L);
            return;
        }
        GA ga2 = aa.b;
        synchronized (ga2) {
            try {
                if (i4 == 1) {
                    ga2.n++;
                } else if (i4 == 2) {
                    ga2.p++;
                } else if (i4 == 3) {
                    ga2.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(AA aa, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i2 & 8) != 0) {
            byte b = this.f3258a.readByte();
            byte[] bArr = Vg0.f3884a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i5 = this.f3258a.readInt() & Integer.MAX_VALUE;
        List listF = f(C3887ke.s(i - 4, i2, i4), i4, i2, i3);
        aa.getClass();
        GA ga = aa.b;
        ga.getClass();
        synchronized (ga) {
            if (ga.A.contains(Integer.valueOf(i5))) {
                ga.m(i5, EnumC2502Ir.PROTOCOL_ERROR);
                return;
            }
            ga.A.add(Integer.valueOf(i5));
            ga.j.c(new DA(ga.d + '[' + i5 + "] onRequest", ga, i5, listF, 2), 0L);
        }
    }
}
