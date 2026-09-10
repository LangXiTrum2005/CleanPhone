package p2;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import d5.u;
import i1.d0;
import i1.o;
import i1.p;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import l1.q;
import l1.y;
import oa.b0;
import oa.f0;
import oa.j0;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f48246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48247b;

    public f(int i10, n1 n1Var) {
        this.f48247b = i10;
        this.f48246a = n1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i10, q qVar) {
        String str;
        a gVar;
        String str2;
        int i11 = 4;
        oa.q.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i12 = qVar.f44815c;
        int iA = -2;
        int i13 = 0;
        while (qVar.a() > 8) {
            int iO = qVar.o();
            int iO2 = qVar.f44814b + qVar.o();
            qVar.L(iO2);
            if (iO != 1414744396) {
                d dVar = null;
                switch (iO) {
                    case 1718776947:
                        if (iA != 2) {
                            if (iA == 1) {
                                int iS = qVar.s();
                                if (iS == 1) {
                                    str = MimeTypes.AUDIO_RAW;
                                } else if (iS == 85) {
                                    str = MimeTypes.AUDIO_MPEG;
                                } else if (iS == 255) {
                                    str = MimeTypes.AUDIO_AAC;
                                } else if (iS != 8192) {
                                    str = iS != 8193 ? null : MimeTypes.AUDIO_DTS;
                                } else {
                                    str = MimeTypes.AUDIO_AC3;
                                }
                                if (str != null) {
                                    int iS2 = qVar.s();
                                    int iO3 = qVar.o();
                                    qVar.N(6);
                                    int iS3 = qVar.s();
                                    String str3 = y.f44830a;
                                    int iC = y.C(iS3, ByteOrder.LITTLE_ENDIAN);
                                    int iS4 = qVar.a() > 0 ? qVar.s() : 0;
                                    o oVar = new o();
                                    oVar.f42600m = d0.n(str);
                                    oVar.E = iS2;
                                    oVar.F = iO3;
                                    if (str.equals(MimeTypes.AUDIO_RAW) && iC != 0) {
                                        oVar.G = iC;
                                    }
                                    if (str.equals(MimeTypes.AUDIO_AAC) && iS4 > 0) {
                                        byte[] bArr = new byte[iS4];
                                        qVar.k(bArr, 0, iS4);
                                        oVar.f42603p = j0.B(bArr);
                                    }
                                    gVar = new g(new p(oVar));
                                } else {
                                    u.v(iS, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                l1.a.s("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + y.E(iA));
                            }
                            gVar = dVar;
                            break;
                        } else {
                            qVar.N(i11);
                            int iO4 = qVar.o();
                            int iO5 = qVar.o();
                            qVar.N(i11);
                            int iO6 = qVar.o();
                            switch (iO6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = MimeTypes.VIDEO_MP4V;
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                o oVar2 = new o();
                                oVar2.f42607t = iO4;
                                oVar2.f42608u = iO5;
                                oVar2.f42600m = d0.n(str2);
                                gVar = new g(new p(oVar2));
                            } else {
                                u.v(iO6, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                gVar = dVar;
                            }
                        }
                        break;
                    case 1751742049:
                        int iO7 = qVar.o();
                        qVar.N(8);
                        int iO8 = qVar.o();
                        int iO9 = qVar.o();
                        qVar.N(i11);
                        qVar.o();
                        qVar.N(12);
                        gVar = new c(iO7, iO8, iO9);
                        break;
                    case 1752331379:
                        int iO10 = qVar.o();
                        qVar.N(12);
                        qVar.o();
                        int iO11 = qVar.o();
                        int iO12 = qVar.o();
                        qVar.N(i11);
                        int iO13 = qVar.o();
                        int iO14 = qVar.o();
                        qVar.N(i11);
                        dVar = new d(iO10, iO11, iO12, iO13, iO14, qVar.o());
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(qVar.x(qVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            } else {
                gVar = b(qVar.o(), qVar);
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    iA = ((d) gVar).a();
                }
                int i14 = i13 + 1;
                int iF = b0.f(objArrCopyOf.length, i14);
                if (iF > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
                }
                objArrCopyOf[i13] = gVar;
                i13 = i14;
            }
            qVar.M(iO2);
            qVar.L(i12);
            i11 = 4;
        }
        return new f(i10, j0.t(i13, objArrCopyOf));
    }

    public final a a(Class cls) {
        f0 f0VarListIterator = this.f48246a.listIterator(0);
        while (f0VarListIterator.hasNext()) {
            a aVar = (a) f0VarListIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // p2.a
    public final int getType() {
        return this.f48247b;
    }
}
