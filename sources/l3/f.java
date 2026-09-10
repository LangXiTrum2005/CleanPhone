package l3;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.internal.ads.xd1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import d5.u;
import go.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l1.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f45002h = new q();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final xd1 f45003i = new xd1();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45004j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f45005k;
    public final e[] l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f45006m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f45007n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f45008o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public xd1 f45009p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f45010q;

    public f(int i10, List list) {
        this.f45005k = i10 == -1 ? 1 : i10;
        if (list != null) {
            byte[] bArr = l1.c.f44778a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b10 = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new e[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.l[i11] = new e();
        }
        this.f45006m = this.l[0];
    }

    @Override // l3.h
    public final i c() {
        List list = this.f45007n;
        this.f45008o = list;
        list.getClass();
        return new i(list);
    }

    @Override // l3.h
    public final void d(g gVar) {
        ByteBuffer byteBuffer = gVar.f47035e;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        q qVar = this.f45002h;
        qVar.K(bArrArray, iLimit);
        while (qVar.a() >= 3) {
            int iZ = qVar.z();
            int i10 = iZ & 3;
            boolean z10 = (iZ & 4) == 4;
            byte bZ = (byte) qVar.z();
            byte bZ2 = (byte) qVar.z();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        g();
                        int i11 = (bZ & 192) >> 6;
                        int i12 = this.f45004j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            i();
                            l1.a.s("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f45004j + " current=" + i11);
                        }
                        this.f45004j = i11;
                        int i13 = bZ & Utf8.REPLACEMENT_BYTE;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        xd1 xd1Var = new xd1(i11, i13);
                        this.f45009p = xd1Var;
                        byte[] bArr = xd1Var.f21843b;
                        xd1Var.f21846e = 1;
                        bArr[0] = bZ2;
                    } else {
                        k.i(i10 == 2);
                        xd1 xd1Var2 = this.f45009p;
                        if (xd1Var2 == null) {
                            l1.a.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = xd1Var2.f21843b;
                            int i14 = xd1Var2.f21846e;
                            int i15 = i14 + 1;
                            xd1Var2.f21846e = i15;
                            bArr2[i14] = bZ;
                            xd1Var2.f21846e = i14 + 2;
                            bArr2[i15] = bZ2;
                        }
                    }
                    xd1 xd1Var3 = this.f45009p;
                    if (xd1Var3.f21846e == (xd1Var3.f21845d * 2) - 1) {
                        g();
                    }
                }
            }
        }
    }

    @Override // l3.h
    public final boolean f() {
        return this.f45007n != this.f45008o;
    }

    @Override // l3.h, o1.b
    public final void flush() {
        super.flush();
        this.f45007n = null;
        this.f45008o = null;
        this.f45010q = 0;
        this.f45006m = this.l[0];
        i();
        this.f45009p = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:227:0x053f  */
    public final void g() {
        char c4;
        boolean z10;
        xd1 xd1Var = this.f45009p;
        if (xd1Var == null) {
            return;
        }
        int i10 = 2;
        if (xd1Var.f21846e != (xd1Var.f21845d * 2) - 1) {
            l1.a.d("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f45009p.f21845d * 2) - 1) + ", but current index is " + this.f45009p.f21846e + " (sequence number " + this.f45009p.f21844c + ");");
        }
        xd1 xd1Var2 = this.f45009p;
        byte[] bArr = xd1Var2.f21843b;
        int i11 = xd1Var2.f21846e;
        xd1 xd1Var3 = this.f45003i;
        xd1Var3.p(bArr, i11);
        boolean z11 = false;
        while (xd1Var3.b() > 0) {
            int i12 = 3;
            int i13 = xd1Var3.i(3);
            int i14 = xd1Var3.i(5);
            if (i13 == 7) {
                xd1Var3.t(i10);
                i13 = xd1Var3.i(6);
                if (i13 < 7) {
                    u.v(i13, "Invalid extended service number: ", "Cea708Decoder");
                }
            }
            if (i14 == 0) {
                if (i13 != 0) {
                    l1.a.s("Cea708Decoder", "serviceNumber is non-zero (" + i13 + ") when blockSize is 0");
                }
                if (z11) {
                    this.f45007n = h();
                }
                this.f45009p = null;
            }
            if (i13 != this.f45005k) {
                xd1Var3.u(i14);
            } else {
                int iG = (i14 * 8) + xd1Var3.g();
                while (xd1Var3.g() < iG) {
                    int i15 = xd1Var3.i(8);
                    if (i15 != 16) {
                        if (i15 <= 31) {
                            if (i15 != 0) {
                                if (i15 == i12) {
                                    this.f45007n = h();
                                } else if (i15 != 8) {
                                    switch (i15) {
                                        case 12:
                                            i();
                                            break;
                                        case 13:
                                            this.f45006m.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (i15 >= 17 && i15 <= 23) {
                                                l1.a.s("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i15);
                                                xd1Var3.t(8);
                                            } else if (i15 < 24 || i15 > 31) {
                                                u.v(i15, "Invalid C0 command: ", "Cea708Decoder");
                                            } else {
                                                l1.a.s("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i15);
                                                xd1Var3.t(16);
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.f45006m.f44983b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (i15 <= 127) {
                            if (i15 == 127) {
                                this.f45006m.a((char) 9835);
                            } else {
                                this.f45006m.a((char) (i15 & 255));
                            }
                            z11 = true;
                        } else {
                            if (i15 <= 159) {
                                e[] eVarArr = this.l;
                                switch (i15) {
                                    case 128:
                                    case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                                    case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                                    case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                                        z10 = true;
                                        int i16 = i15 - 128;
                                        if (this.f45010q != i16) {
                                            this.f45010q = i16;
                                            this.f45006m = eVarArr[i16];
                                        }
                                        break;
                                    case 136:
                                        z10 = true;
                                        for (int i17 = 1; i17 <= 8; i17++) {
                                            if (xd1Var3.h()) {
                                                e eVar = eVarArr[8 - i17];
                                                eVar.f44982a.clear();
                                                eVar.f44983b.clear();
                                                eVar.f44995o = -1;
                                                eVar.f44996p = -1;
                                                eVar.f44997q = -1;
                                                eVar.f44999s = -1;
                                                eVar.f45001u = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i18 = 1; i18 <= 8; i18++) {
                                            if (xd1Var3.h()) {
                                                eVarArr[8 - i18].f44985d = true;
                                            }
                                        }
                                        z10 = true;
                                        break;
                                    case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                                        for (int i19 = 1; i19 <= 8; i19++) {
                                            if (xd1Var3.h()) {
                                                eVarArr[8 - i19].f44985d = false;
                                            }
                                        }
                                        z10 = true;
                                        break;
                                    case 139:
                                        for (int i20 = 1; i20 <= 8; i20++) {
                                            if (xd1Var3.h()) {
                                                e eVar2 = eVarArr[8 - i20];
                                                eVar2.f44985d = !eVar2.f44985d;
                                            }
                                        }
                                        z10 = true;
                                        break;
                                    case 140:
                                        for (int i21 = 1; i21 <= 8; i21++) {
                                            if (xd1Var3.h()) {
                                                eVarArr[8 - i21].d();
                                            }
                                        }
                                        z10 = true;
                                        break;
                                    case 141:
                                        xd1Var3.t(8);
                                        z10 = true;
                                        break;
                                    case 142:
                                        z10 = true;
                                        break;
                                    case 143:
                                        i();
                                        z10 = true;
                                        break;
                                    case 144:
                                        int i22 = i10;
                                        if (this.f45006m.f44984c) {
                                            xd1Var3.i(4);
                                            xd1Var3.i(i22);
                                            xd1Var3.i(i22);
                                            boolean zH = xd1Var3.h();
                                            boolean zH2 = xd1Var3.h();
                                            i12 = 3;
                                            xd1Var3.i(3);
                                            xd1Var3.i(3);
                                            this.f45006m.e(zH, zH2);
                                            z10 = true;
                                        } else {
                                            xd1Var3.t(16);
                                            z10 = true;
                                            i12 = 3;
                                        }
                                        break;
                                    case 145:
                                        if (this.f45006m.f44984c) {
                                            int iC = e.c(xd1Var3.i(2), xd1Var3.i(2), xd1Var3.i(2), xd1Var3.i(2));
                                            int iC2 = e.c(xd1Var3.i(2), xd1Var3.i(2), xd1Var3.i(2), xd1Var3.i(2));
                                            xd1Var3.t(2);
                                            e.c(xd1Var3.i(2), xd1Var3.i(2), xd1Var3.i(2), 0);
                                            this.f45006m.f(iC, iC2);
                                        } else {
                                            xd1Var3.t(24);
                                        }
                                        z10 = true;
                                        i12 = 3;
                                        break;
                                    case 146:
                                        if (this.f45006m.f44984c) {
                                            xd1Var3.t(4);
                                            int i23 = xd1Var3.i(4);
                                            xd1Var3.t(2);
                                            xd1Var3.i(6);
                                            e eVar3 = this.f45006m;
                                            if (eVar3.f45001u != i23) {
                                                eVar3.a('\n');
                                            }
                                            eVar3.f45001u = i23;
                                        } else {
                                            xd1Var3.t(16);
                                        }
                                        z10 = true;
                                        i12 = 3;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        u.v(i15, "Invalid C1 command: ", "Cea708Decoder");
                                        z10 = true;
                                        break;
                                    case 151:
                                        if (this.f45006m.f44984c) {
                                            int iC3 = e.c(xd1Var3.i(2), xd1Var3.i(2), xd1Var3.i(2), xd1Var3.i(2));
                                            xd1Var3.i(2);
                                            e.c(xd1Var3.i(2), xd1Var3.i(2), xd1Var3.i(2), 0);
                                            xd1Var3.h();
                                            xd1Var3.h();
                                            xd1Var3.i(2);
                                            xd1Var3.i(2);
                                            int i24 = xd1Var3.i(2);
                                            xd1Var3.t(8);
                                            e eVar4 = this.f45006m;
                                            eVar4.f44994n = iC3;
                                            eVar4.f44992k = i24;
                                        } else {
                                            xd1Var3.t(32);
                                        }
                                        z10 = true;
                                        i12 = 3;
                                        break;
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i25 = i15 - 152;
                                        e eVar5 = eVarArr[i25];
                                        xd1Var3.t(i10);
                                        boolean zH3 = xd1Var3.h();
                                        xd1Var3.t(i10);
                                        int i26 = xd1Var3.i(i12);
                                        boolean zH4 = xd1Var3.h();
                                        int i27 = xd1Var3.i(7);
                                        int i28 = xd1Var3.i(8);
                                        int i29 = xd1Var3.i(4);
                                        int i30 = xd1Var3.i(4);
                                        xd1Var3.t(i10);
                                        xd1Var3.t(6);
                                        xd1Var3.t(i10);
                                        int i31 = xd1Var3.i(3);
                                        int i32 = xd1Var3.i(3);
                                        ArrayList arrayList = eVar5.f44982a;
                                        eVar5.f44984c = true;
                                        eVar5.f44985d = zH3;
                                        eVar5.f44986e = i26;
                                        eVar5.f44987f = zH4;
                                        eVar5.f44988g = i27;
                                        eVar5.f44989h = i28;
                                        eVar5.f44990i = i29;
                                        int i33 = i30 + 1;
                                        if (eVar5.f44991j != i33) {
                                            eVar5.f44991j = i33;
                                            while (true) {
                                                if (arrayList.size() >= eVar5.f44991j || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (i31 != 0 && eVar5.l != i31) {
                                            eVar5.l = i31;
                                            int i34 = i31 - 1;
                                            int i35 = e.B[i34];
                                            boolean z12 = e.A[i34];
                                            int i36 = e.f44980y[i34];
                                            int i37 = e.f44981z[i34];
                                            int i38 = e.f44979x[i34];
                                            eVar5.f44994n = i35;
                                            eVar5.f44992k = i38;
                                        }
                                        if (i32 != 0 && eVar5.f44993m != i32) {
                                            eVar5.f44993m = i32;
                                            int i39 = i32 - 1;
                                            int i40 = e.D[i39];
                                            int i41 = e.C[i39];
                                            eVar5.e(false, false);
                                            eVar5.f(e.f44977v, e.E[i39]);
                                        }
                                        if (this.f45010q != i25) {
                                            this.f45010q = i25;
                                            this.f45006m = eVarArr[i25];
                                        }
                                        z10 = true;
                                        i12 = 3;
                                        break;
                                }
                            } else {
                                z10 = true;
                                if (i15 <= 255) {
                                    this.f45006m.a((char) (i15 & 255));
                                } else {
                                    u.v(i15, "Invalid base command: ", "Cea708Decoder");
                                }
                                i10 = 2;
                                c4 = 7;
                            }
                            z11 = z10;
                            i10 = 2;
                            c4 = 7;
                        }
                        c4 = 7;
                    } else {
                        int i42 = xd1Var3.i(8);
                        if (i42 <= 31) {
                            c4 = 7;
                            if (i42 > 7) {
                                if (i42 <= 15) {
                                    xd1Var3.t(8);
                                } else if (i42 <= 23) {
                                    xd1Var3.t(16);
                                } else if (i42 <= 31) {
                                    xd1Var3.t(24);
                                }
                            }
                        } else {
                            c4 = 7;
                            if (i42 <= 127) {
                                if (i42 == 32) {
                                    this.f45006m.a(' ');
                                } else if (i42 == 33) {
                                    this.f45006m.a((char) 160);
                                } else if (i42 == 37) {
                                    this.f45006m.a((char) 8230);
                                } else if (i42 == 42) {
                                    this.f45006m.a((char) 352);
                                } else if (i42 == 44) {
                                    this.f45006m.a((char) 338);
                                } else if (i42 == 63) {
                                    this.f45006m.a((char) 376);
                                } else if (i42 == 57) {
                                    this.f45006m.a((char) 8482);
                                } else if (i42 == 58) {
                                    this.f45006m.a((char) 353);
                                } else if (i42 == 60) {
                                    this.f45006m.a((char) 339);
                                } else if (i42 != 61) {
                                    switch (i42) {
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                                            this.f45006m.a((char) 9608);
                                            break;
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                                            this.f45006m.a((char) 8216);
                                            break;
                                        case 50:
                                            this.f45006m.a((char) 8217);
                                            break;
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                                            this.f45006m.a((char) 8220);
                                            break;
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                                            this.f45006m.a((char) 8221);
                                            break;
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                                            this.f45006m.a((char) 8226);
                                            break;
                                        default:
                                            switch (i42) {
                                                case 118:
                                                    this.f45006m.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.f45006m.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.f45006m.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.f45006m.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.f45006m.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.f45006m.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.f45006m.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.f45006m.a((char) 9472);
                                                    break;
                                                case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                                                    this.f45006m.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f45006m.a((char) 9484);
                                                    break;
                                                default:
                                                    u.v(i42, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.f45006m.a((char) 8480);
                                }
                                i10 = 2;
                                z11 = true;
                            } else if (i42 > 159) {
                                i10 = 2;
                                if (i42 <= 255) {
                                    if (i42 == 160) {
                                        this.f45006m.a((char) 13252);
                                    } else {
                                        u.v(i42, "Invalid G3 character: ", "Cea708Decoder");
                                        this.f45006m.a('_');
                                    }
                                    z11 = true;
                                } else {
                                    u.v(i42, "Invalid extended command: ", "Cea708Decoder");
                                }
                            } else if (i42 <= 135) {
                                xd1Var3.t(32);
                            } else if (i42 <= 143) {
                                xd1Var3.t(40);
                            } else if (i42 <= 159) {
                                i10 = 2;
                                xd1Var3.t(2);
                                xd1Var3.t(xd1Var3.i(6) * 8);
                            }
                        }
                        i10 = 2;
                    }
                    i10 = i10;
                }
            }
        }
        if (z11) {
            this.f45007n = h();
        }
        this.f45009p = null;
    }

    public final List h() {
        d dVar;
        Layout.Alignment alignment;
        float f10;
        float f11;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            e[] eVarArr = this.l;
            e eVar = eVarArr[i10];
            if (eVar.f44984c && (!eVar.f44982a.isEmpty() || eVar.f44983b.length() != 0)) {
                e eVar2 = eVarArr[i10];
                if (eVar2.f44985d) {
                    ArrayList arrayList2 = eVar2.f44982a;
                    if (!eVar2.f44984c || (arrayList2.isEmpty() && eVar2.f44983b.length() == 0)) {
                        dVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i11));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) eVar2.b());
                        int i12 = eVar2.f44992k;
                        if (i12 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i12 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i12 != 2) {
                            if (i12 != 3) {
                                throw new IllegalArgumentException("Unexpected justification value: " + eVar2.f44992k);
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        if (eVar2.f44987f) {
                            f10 = eVar2.f44989h / 99.0f;
                            f11 = eVar2.f44988g / 99.0f;
                        } else {
                            f10 = eVar2.f44989h / 209.0f;
                            f11 = eVar2.f44988g / 74.0f;
                        }
                        float f12 = (f10 * 0.9f) + 0.05f;
                        float f13 = (f11 * 0.9f) + 0.05f;
                        int i13 = eVar2.f44990i;
                        int i14 = i13 / 3;
                        int i15 = i14 == 0 ? 0 : i14 == 1 ? 1 : 2;
                        int i16 = i13 % 3;
                        int i17 = i16 == 0 ? 0 : i16 == 1 ? 1 : 2;
                        int i18 = eVar2.f44994n;
                        dVar = new d(spannableStringBuilder, alignment2, f13, i15, f12, i17, i18 != e.f44978w, i18, eVar2.f44986e);
                    }
                    if (dVar != null) {
                        arrayList.add(dVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, d.f44974c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            arrayList3.add(((d) arrayList.get(i19)).f44975a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void i() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.l[i10].d();
        }
    }
}
