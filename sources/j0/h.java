package j0;

import com.google.android.gms.internal.ads.h9;
import com.google.android.gms.internal.ads.i9;
import com.google.android.gms.internal.ads.s9;
import com.google.android.gms.internal.ads.t9;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.ads.v9;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import h9.k;
import i1.d0;
import i1.o;
import i1.p;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l1.q;
import r1.s;
import u3.m;
import u3.n;
import u3.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f43568b;

    public h(int i10, List list) {
        this.f43567a = i10;
        this.f43568b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x005f  */
    public v a(int i10, k kVar) {
        String str = (String) kVar.f42287b;
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new n(new u9(kVar.c(), 1, str, "video/mp2t"));
            }
            if (i10 == 21) {
                return new n(new i9(3));
            }
            if (i10 == 27) {
                if (c(4)) {
                    return null;
                }
                return new n(new m(new s(b(kVar)), c(1), c(8)));
            }
            if (i10 == 36) {
                return new n(new s9(new s(b(kVar))));
            }
            if (i10 == 45) {
                return new n(new v9(1));
            }
            if (i10 == 89) {
                return new n(new i9((List) kVar.f42288c, 2));
            }
            if (i10 == 172) {
                return new n(new u3.b(kVar.c(), 1, str, "video/mp2t"));
            }
            if (i10 == 257) {
                return new u3.s(new qd.i("application/vnd.dvb.ait"));
            }
            if (i10 != 138) {
                if (i10 == 139) {
                    return new n(new h9(str, kVar.c(), 5408, 1));
                }
                switch (i10) {
                    case 15:
                        if (c(2)) {
                            return null;
                        }
                        return new n(new u3.e(str, kVar.c(), "video/mp2t", false));
                    case 16:
                        return new n(new u3.j(new qd.i(b(kVar))));
                    case 17:
                        if (c(2)) {
                            return null;
                        }
                        return new n(new t9(str, kVar.c(), 1));
                    default:
                        switch (i10) {
                            case 128:
                                break;
                            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                                return new n(new u3.b(kVar.c(), 0, str, "video/mp2t"));
                            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                                if (!c(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i10) {
                                    case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                                        if (c(16)) {
                                            return null;
                                        }
                                        return new u3.s(new qd.i(MimeTypes.APPLICATION_SCTE35));
                                    case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                                        return new n(new u3.b(kVar.c(), 0, str, "video/mp2t"));
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return new n(new h9(str, kVar.c(), 4096, 1));
        }
        return new n(new u3.h(new qd.i(b(kVar)), "video/mp2t"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public List b(k kVar) {
        String str;
        int i10;
        List listSingletonList;
        boolean zC = c(32);
        List list = this.f43568b;
        if (zC) {
            return list;
        }
        q qVar = new q((byte[]) kVar.f42289d);
        ArrayList arrayList = list;
        while (qVar.a() > 0) {
            int iZ = qVar.z();
            int iZ2 = qVar.f44814b + qVar.z();
            if (iZ == 134) {
                arrayList = new ArrayList();
                int iZ3 = qVar.z() & 31;
                for (int i11 = 0; i11 < iZ3; i11++) {
                    String strX = qVar.x(3, StandardCharsets.UTF_8);
                    int iZ4 = qVar.z();
                    boolean z10 = (iZ4 & 128) != 0;
                    if (z10) {
                        i10 = iZ4 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i10 = 1;
                    }
                    byte bZ = (byte) qVar.z();
                    qVar.N(1);
                    if (z10) {
                        boolean z11 = (bZ & 64) != 0;
                        byte[] bArr = l1.c.f44778a;
                        listSingletonList = Collections.singletonList(z11 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    o oVar = new o();
                    oVar.f42600m = d0.n(str);
                    oVar.f42592d = strX;
                    oVar.J = i10;
                    oVar.f42603p = listSingletonList;
                    arrayList.add(new p(oVar));
                }
            }
            qVar.M(iZ2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public boolean c(int i10) {
        return (this.f43567a & i10) != 0;
    }

    public h() {
        this.f43567a = 1;
        this.f43568b = Collections.singletonList(null);
    }

    public h(ArrayList arrayList) {
        this.f43567a = 0;
        this.f43568b = arrayList;
    }
}
