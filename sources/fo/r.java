package fo;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f41292d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lo.g f41293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f41294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f41295c;

    static {
        Logger logger = Logger.getLogger(f.class.getName());
        kotlin.jvm.internal.n.e(logger, "getLogger(Http2::class.java.name)");
        f41292d = logger;
    }

    public r(lo.n source) {
        kotlin.jvm.internal.n.f(source, "source");
        this.f41293a = source;
        q qVar = new q(source);
        this.f41294b = qVar;
        this.f41295c = new c(qVar);
    }

    public final boolean a(boolean z10, cl.i iVar) throws IOException {
        int i10;
        int i11;
        int i12;
        Object[] array;
        int i13 = 0;
        try {
            this.f41293a.require(9L);
            int iR = yn.a.r(this.f41293a);
            if (iR > 16384) {
                throw new IOException(l1.d.e(iR, "FRAME_SIZE_ERROR: "));
            }
            int i14 = this.f41293a.readByte() & 255;
            byte b10 = this.f41293a.readByte();
            int i15 = b10 & 255;
            int i16 = this.f41293a.readInt();
            int i17 = i16 & Integer.MAX_VALUE;
            Logger logger = f41292d;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(f.a(true, i17, iR, i14, i15));
            }
            if (z10 && i14 != 4) {
                StringBuilder sb2 = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = f.f41231b;
                sb2.append(i14 < strArr.length ? strArr[i14] : yn.a.h("0x%02x", Integer.valueOf(i14)));
                throw new IOException(sb2.toString());
            }
            int i18 = 2;
            switch (i14) {
                case 0:
                    b(iVar, iR, i15, i17);
                    return true;
                case 1:
                    d(iVar, iR, i15, i17);
                    return true;
                case 2:
                    if (iR != 5) {
                        throw new IOException(defpackage.e.h(iR, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i17 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    lo.g gVar = this.f41293a;
                    gVar.readInt();
                    gVar.readByte();
                    return true;
                case 3:
                    if (iR != 4) {
                        throw new IOException(defpackage.e.h(iR, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i17 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i19 = this.f41293a.readInt();
                    int[] iArrD = v0.i.d(14);
                    int length = iArrD.length;
                    int i20 = 0;
                    while (true) {
                        if (i20 < length) {
                            int i21 = iArrD[i20];
                            if (v0.i.c(i21) == i19) {
                                i10 = i21;
                            } else {
                                i20++;
                            }
                        } else {
                            i10 = 0;
                        }
                    }
                    if (i10 == 0) {
                        throw new IOException(l1.d.e(i19, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    n nVar = (n) iVar.f6522c;
                    if (i17 != 0 && (i16 & 1) == 0) {
                        i13 = 1;
                    }
                    if (i13 == 0) {
                        v vVarC = nVar.c(i17);
                        if (vVarC == null) {
                            return true;
                        }
                        vVarC.j(i10);
                        return true;
                    }
                    nVar.f41262i.c(new j(nVar.f41256c + '[' + i17 + "] onReset", nVar, i17, i10, 1), 0L);
                    return true;
                case 4:
                    lo.g gVar2 = this.f41293a;
                    if (i17 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((b10 & 1) == 0) {
                        if (iR % 6 != 0) {
                            throw new IOException(l1.d.e(iR, "TYPE_SETTINGS length % 6 != 0: "));
                        }
                        z zVar = new z();
                        pk.a aVarM = com.bumptech.glide.d.M(com.bumptech.glide.d.O(0, iR), 6);
                        int i22 = aVarM.f48393a;
                        int i23 = aVarM.f48394b;
                        int i24 = aVarM.f48395c;
                        if ((i24 > 0 && i22 <= i23) || (i24 < 0 && i23 <= i22)) {
                            while (true) {
                                short s10 = gVar2.readShort();
                                byte[] bArr = yn.a.f54560a;
                                int i25 = s10 & 65535;
                                i11 = gVar2.readInt();
                                if (i25 != 2) {
                                    if (i25 == 3) {
                                        i25 = 4;
                                    } else if (i25 == 4) {
                                        if (i11 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i25 = 7;
                                    } else if (i25 == 5 && (i11 < 16384 || i11 > 16777215)) {
                                    }
                                } else if (i11 != 0 && i11 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                zVar.c(i25, i11);
                                if (i22 != i23) {
                                    i22 += i24;
                                }
                            }
                            throw new IOException(l1.d.e(i11, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                        }
                        n nVar2 = (n) iVar.f6522c;
                        nVar2.f41261h.c(new i(i18, iVar, zVar, defpackage.e.q(nVar2.f41256c, " applyAndAckSettings", new StringBuilder())), 0L);
                        return true;
                    }
                    if (iR != 0) {
                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    break;
                case 5:
                    h(iVar, iR, i15, i17);
                    return true;
                case 6:
                    if (iR != 8) {
                        throw new IOException(l1.d.e(iR, "TYPE_PING length != 8: "));
                    }
                    if (i17 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int i26 = this.f41293a.readInt();
                    int i27 = this.f41293a.readInt();
                    if (((b10 & 1) != 0 ? 1 : 0) == 0) {
                        ((n) iVar.f6522c).f41261h.c(new j(defpackage.e.q(((n) iVar.f6522c).f41256c, " ping", new StringBuilder()), (n) iVar.f6522c, i26, i27, 0), 0L);
                        return true;
                    }
                    n nVar3 = (n) iVar.f6522c;
                    synchronized (nVar3) {
                        try {
                            if (i26 == 1) {
                                nVar3.l++;
                            } else if (i26 == 2) {
                                nVar3.f41266n++;
                            } else if (i26 == 3) {
                                nVar3.notifyAll();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return true;
                case 7:
                    if (iR < 8) {
                        throw new IOException(l1.d.e(iR, "TYPE_GOAWAY length < 8: "));
                    }
                    if (i17 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i28 = this.f41293a.readInt();
                    int i29 = this.f41293a.readInt();
                    int i30 = iR - 8;
                    int[] iArrD2 = v0.i.d(14);
                    int length2 = iArrD2.length;
                    int i31 = 0;
                    while (true) {
                        if (i31 < length2) {
                            i12 = iArrD2[i31];
                            if (v0.i.c(i12) != i29) {
                                i31++;
                            }
                        } else {
                            i12 = 0;
                        }
                    }
                    if (i12 == 0) {
                        throw new IOException(l1.d.e(i29, "TYPE_GOAWAY unexpected error code: "));
                    }
                    lo.h debugData = lo.h.f45638d;
                    if (i30 > 0) {
                        debugData = this.f41293a.readByteString(i30);
                    }
                    kotlin.jvm.internal.n.f(debugData, "debugData");
                    debugData.d();
                    n nVar4 = (n) iVar.f6522c;
                    synchronized (nVar4) {
                        array = nVar4.f41255b.values().toArray(new v[0]);
                        nVar4.f41259f = true;
                    }
                    v[] vVarArr = (v[]) array;
                    int length3 = vVarArr.length;
                    while (i13 < length3) {
                        v vVar = vVarArr[i13];
                        if (vVar.f41307a > i28 && vVar.g()) {
                            vVar.j(8);
                            ((n) iVar.f6522c).c(vVar.f41307a);
                        }
                        i13++;
                    }
                    break;
                    break;
                case 8:
                    if (iR != 4) {
                        throw new IOException(l1.d.e(iR, "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long j10 = 2147483647L & ((long) this.f41293a.readInt());
                    if (j10 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i17 == 0) {
                        n nVar5 = (n) iVar.f6522c;
                        synchronized (nVar5) {
                            nVar5.f41273u += j10;
                            nVar5.notifyAll();
                        }
                        return true;
                    }
                    v vVarB = ((n) iVar.f6522c).b(i17);
                    if (vVarB != null) {
                        synchronized (vVarB) {
                            vVarB.f41312f += j10;
                            if (j10 > 0) {
                                vVarB.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    break;
                default:
                    this.f41293a.skip(iR);
                    return true;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void b(cl.i iVar, int i10, int i11, int i12) throws IOException {
        int i13;
        boolean z10;
        boolean z11;
        long j10;
        boolean z12;
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z13 = (i11 & 1) != 0;
        if ((i11 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i11 & 8) != 0) {
            byte b10 = this.f41293a.readByte();
            byte[] bArr = yn.a.f54560a;
            i13 = b10 & 255;
        } else {
            i13 = 0;
        }
        int iA = p.a(i10, i11, i13);
        lo.g source = this.f41293a;
        kotlin.jvm.internal.n.f(source, "source");
        n nVar = (n) iVar.f6522c;
        long j11 = 0;
        if (i12 == 0 || (i12 & 1) != 0) {
            v vVarB = nVar.b(i12);
            if (vVarB == null) {
                ((n) iVar.f6522c).k(i12, 2);
                long j12 = iA;
                ((n) iVar.f6522c).h(j12);
                source.skip(j12);
            } else {
                byte[] bArr2 = yn.a.f54560a;
                t tVar = vVarB.f41315i;
                long j13 = iA;
                tVar.getClass();
                long j14 = j13;
                while (true) {
                    if (j14 <= j11) {
                        z10 = z13;
                        v vVar = tVar.f41305f;
                        byte[] bArr3 = yn.a.f54560a;
                        vVar.f41308b.h(j13);
                        break;
                    }
                    synchronized (tVar.f41305f) {
                        z11 = tVar.f41301b;
                        j10 = j11;
                        z10 = z13;
                        z12 = tVar.f41303d.f45637b + j14 > tVar.f41300a;
                    }
                    if (z12) {
                        source.skip(j14);
                        tVar.f41305f.e(4);
                        break;
                    }
                    if (z11) {
                        source.skip(j14);
                        break;
                    }
                    long jL = source.l(j14, tVar.f41302c);
                    if (jL == -1) {
                        throw new EOFException();
                    }
                    j14 -= jL;
                    v vVar2 = tVar.f41305f;
                    synchronized (vVar2) {
                        try {
                            if (tVar.f41304e) {
                                lo.e eVar = tVar.f41302c;
                                eVar.skip(eVar.f45637b);
                            } else {
                                lo.e eVar2 = tVar.f41303d;
                                boolean z14 = eVar2.f45637b == j10;
                                eVar2.p(tVar.f41302c);
                                if (z14) {
                                    vVar2.notifyAll();
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    j11 = j10;
                    z13 = z10;
                }
                if (z10) {
                    vVarB.i(yn.a.f54561b, true);
                }
            }
        } else {
            lo.e eVar3 = new lo.e();
            long j15 = iA;
            source.require(j15);
            source.l(j15, eVar3);
            nVar.f41262i.c(new k(nVar.f41256c + '[' + i12 + "] onData", nVar, i12, eVar3, iA, z13), 0L);
        }
        this.f41293a.skip(i13);
    }

    public final List c(int i10, int i11, int i12, int i13) throws IOException {
        q qVar = this.f41294b;
        qVar.f41290e = i10;
        qVar.f41287b = i10;
        qVar.f41291f = i11;
        qVar.f41288c = i12;
        qVar.f41289d = i13;
        c cVar = this.f41295c;
        lo.n nVar = cVar.f41215c;
        ArrayList arrayList = cVar.f41214b;
        while (!nVar.exhausted()) {
            byte b10 = nVar.readByte();
            byte[] bArr = yn.a.f54560a;
            int i14 = b10 & 255;
            if (i14 == 128) {
                throw new IOException("index == 0");
            }
            if ((b10 & 128) == 128) {
                int iE = cVar.e(i14, 127);
                int i15 = iE - 1;
                if (i15 >= 0) {
                    b[] bVarArr = e.f41228a;
                    if (i15 <= bVarArr.length - 1) {
                        arrayList.add(bVarArr[i15]);
                    }
                }
                int length = cVar.f41217e + 1 + (i15 - e.f41228a.length);
                if (length >= 0) {
                    b[] bVarArr2 = cVar.f41216d;
                    if (length < bVarArr2.length) {
                        b bVar = bVarArr2[length];
                        kotlin.jvm.internal.n.c(bVar);
                        arrayList.add(bVar);
                    }
                }
                throw new IOException(l1.d.e(iE, "Header index too large "));
            }
            if (i14 == 64) {
                b[] bVarArr3 = e.f41228a;
                lo.h hVarD = cVar.d();
                e.a(hVarD);
                cVar.c(new b(hVarD, cVar.d()));
            } else if ((b10 & 64) == 64) {
                cVar.c(new b(cVar.b(cVar.e(i14, 63) - 1), cVar.d()));
            } else if ((b10 & 32) == 32) {
                int iE2 = cVar.e(i14, 31);
                cVar.f41213a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + cVar.f41213a);
                }
                int i16 = cVar.f41219g;
                if (iE2 < i16) {
                    if (iE2 == 0) {
                        b[] bVarArr4 = cVar.f41216d;
                        xj.k.k0(bVarArr4, null, 0, bVarArr4.length);
                        cVar.f41217e = cVar.f41216d.length - 1;
                        cVar.f41218f = 0;
                        cVar.f41219g = 0;
                    } else {
                        cVar.a(i16 - iE2);
                    }
                }
            } else if (i14 == 16 || i14 == 0) {
                b[] bVarArr5 = e.f41228a;
                lo.h hVarD2 = cVar.d();
                e.a(hVarD2);
                arrayList.add(new b(hVarD2, cVar.d()));
            } else {
                arrayList.add(new b(cVar.b(cVar.e(i14, 15) - 1), cVar.d()));
            }
        }
        List listN0 = xj.n.N0(arrayList);
        arrayList.clear();
        return listN0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f41293a.close();
    }

    public final void d(cl.i iVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i13 = 0;
        int i14 = 1;
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 8) != 0) {
            byte b10 = this.f41293a.readByte();
            byte[] bArr = yn.a.f54560a;
            i13 = b10 & 255;
        }
        if ((i11 & 32) != 0) {
            lo.g gVar = this.f41293a;
            gVar.readInt();
            gVar.readByte();
            byte[] bArr2 = yn.a.f54560a;
            i10 -= 5;
        }
        List listC = c(p.a(i10, i11, i13), i13, i11, i12);
        n nVar = (n) iVar.f6522c;
        if (i12 != 0 && (i12 & 1) == 0) {
            nVar.f41262i.c(new l(nVar.f41256c + '[' + i12 + "] onHeaders", nVar, i12, listC, z10), 0L);
            return;
        }
        synchronized (nVar) {
            v vVarB = nVar.b(i12);
            if (vVarB != null) {
                vVarB.i(yn.a.t(listC), z10);
                return;
            }
            if (nVar.f41259f) {
                return;
            }
            if (i12 <= nVar.f41257d) {
                return;
            }
            if (i12 % 2 == nVar.f41258e % 2) {
                return;
            }
            v vVar = new v(i12, nVar, false, z10, yn.a.t(listC));
            nVar.f41257d = i12;
            nVar.f41255b.put(Integer.valueOf(i12), vVar);
            nVar.f41260g.e().c(new i(i14, nVar, vVar, nVar.f41256c + '[' + i12 + "] onStream"), 0L);
        }
    }

    public final void h(cl.i iVar, int i10, int i11, int i12) throws IOException {
        int i13;
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i11 & 8) != 0) {
            byte b10 = this.f41293a.readByte();
            byte[] bArr = yn.a.f54560a;
            i13 = b10 & 255;
        } else {
            i13 = 0;
        }
        int i14 = this.f41293a.readInt() & Integer.MAX_VALUE;
        List listC = c(p.a(i10 - 4, i11, i13), i13, i11, i12);
        n nVar = (n) iVar.f6522c;
        synchronized (nVar) {
            if (nVar.f41277y.contains(Integer.valueOf(i14))) {
                nVar.k(i14, 2);
                return;
            }
            nVar.f41277y.add(Integer.valueOf(i14));
            nVar.f41262i.c(new l(nVar.f41256c + '[' + i14 + "] onRequest", nVar, i14, listC), 0L);
        }
    }
}
