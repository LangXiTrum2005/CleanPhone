package l3;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l1.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f44958i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f44959j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f44960k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f44963o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f44964p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f44965q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f44966r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f44967s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f44968t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f44969u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte f44970v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f44972x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f44973y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f44956z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, InterfaceC0435l1.d.b.f29105b, InterfaceC0435l1.d.b.f29106c, InterfaceC0435l1.d.b.f29107d, InterfaceC0435l1.d.b.f29108e, InterfaceC0435l1.d.b.f29109f, 106, 107, 108, InterfaceC0435l1.d.b.f29110g, InterfaceC0435l1.d.b.f29111h, InterfaceC0435l1.d.b.f29112i, InterfaceC0435l1.d.b.f29113j, InterfaceC0435l1.d.b.f29114k, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, PsExtractor.PRIVATE_STREAM_1, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, InterfaceC0435l1.c.b.f29096b, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, PsExtractor.AUDIO_STREAM, 194, 199, 200, InterfaceC0435l1.c.b.f29097c, InterfaceC0435l1.c.b.f29098d, 235, InterfaceC0435l1.c.b.f29101g, InterfaceC0435l1.c.b.f29102h, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, InterfaceC0435l1.c.b.f29100f, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, WebSocketProtocol.PAYLOAD_SHORT, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f44957h = new q();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f44961m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f44962n = new b(0, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f44971w = 0;
    public final long l = 16000000;

    public c(String str, int i10) {
        this.f44958i = MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f44960k = 0;
            this.f44959j = 0;
        } else if (i10 == 2) {
            this.f44960k = 1;
            this.f44959j = 0;
        } else if (i10 == 3) {
            this.f44960k = 0;
            this.f44959j = 1;
        } else if (i10 != 4) {
            l1.a.s("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f44960k = 0;
            this.f44959j = 0;
        } else {
            this.f44960k = 1;
            this.f44959j = 1;
        }
        i(0);
        h();
        this.f44972x = true;
        this.f44973y = C.TIME_UNSET;
    }

    @Override // l3.h
    public final i c() {
        List list = this.f44963o;
        this.f44964p = list;
        list.getClass();
        return new i(list);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x019a  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01da  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207 A[LOOP:1: B:146:0x0201->B:148:0x0207, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0213  */
    /* JADX WARN: Code duplicated, block: B:153:0x0218  */
    /* JADX WARN: Code duplicated, block: B:154:0x021f  */
    /* JADX WARN: Code duplicated, block: B:155:0x022a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0235  */
    /* JADX WARN: Code duplicated, block: B:157:0x0240  */
    /* JADX WARN: Code duplicated, block: B:158:0x0245  */
    /* JADX WARN: Code duplicated, block: B:159:0x024a  */
    /* JADX WARN: Code duplicated, block: B:161:0x025b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e  */
    @Override // l3.h
    public final void d(g gVar) {
        boolean z10;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = gVar.f47035e;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        q qVar = this.f44957h;
        qVar.K(bArrArray, iLimit);
        boolean z11 = false;
        while (true) {
            int iA = qVar.a();
            int i14 = this.f44958i;
            if (iA < i14) {
                if (z11) {
                    int i15 = this.f44965q;
                    if (i15 == 1 || i15 == 3) {
                        this.f44963o = g();
                        this.f44973y = this.f45016e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iZ = i14 == 2 ? -4 : qVar.z();
            int iZ2 = qVar.z();
            int iZ3 = qVar.z();
            if ((iZ & 2) == 0 && (iZ & 1) == this.f44959j) {
                byte b10 = (byte) (iZ2 & 127);
                byte b11 = (byte) (iZ3 & 127);
                if (b10 != 0 || b11 != 0) {
                    boolean z12 = this.f44967s;
                    if ((iZ & 4) == 4) {
                        boolean[] zArr = G;
                        if (zArr[iZ2] && zArr[iZ3]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    this.f44967s = z10;
                    if (!z10 || (b10 & 240) != 16) {
                        this.f44968t = false;
                        if (!z10) {
                            if (1 > b10 && b10 <= 15) {
                                this.f44972x = false;
                            } else if ((b10 & 246) == 20) {
                                if (b11 == 32 && b11 != 47) {
                                    switch (b11) {
                                        default:
                                            switch (b11) {
                                                case 42:
                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                                                    this.f44972x = false;
                                                    break;
                                            }
                                        case 37:
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                        case 39:
                                            this.f44972x = true;
                                            break;
                                    }
                                } else {
                                    this.f44972x = true;
                                }
                            }
                            if (this.f44972x) {
                                i10 = b10 & 224;
                                if (i10 == 0) {
                                    this.f44971w = (b10 >> 3) & 1;
                                }
                                if (this.f44971w != this.f44960k) {
                                    if (i10 == 0) {
                                        i11 = b10 & 247;
                                        if (i11 == 17 || (b11 & 240) != 48) {
                                            i12 = b10 & 246;
                                            if (i12 != 18 && (b11 & 224) == 32) {
                                                this.f44962n.b();
                                                this.f44962n.a((char) ((b10 & 1) == 0 ? E[b11 & 31] : F[b11 & 31]));
                                            } else if (i11 != 17 && (b11 & 240) == 32) {
                                                this.f44962n.a(' ');
                                                boolean z13 = (b11 & 1) == 1;
                                                b bVar = this.f44962n;
                                                bVar.f44948a.add(new a((b11 >> 1) & 7, z13, bVar.f44950c.length()));
                                            } else if ((b10 & 240) != 16 && (b11 & 192) == 64) {
                                                int i16 = f44956z[b10 & 7];
                                                if ((b11 & 32) != 0) {
                                                    i16++;
                                                }
                                                b bVar2 = this.f44962n;
                                                if (i16 != bVar2.f44951d) {
                                                    if (this.f44965q != 1 && !bVar2.e()) {
                                                        b bVar3 = new b(this.f44965q, this.f44966r);
                                                        this.f44962n = bVar3;
                                                        this.f44961m.add(bVar3);
                                                    }
                                                    this.f44962n.f44951d = i16;
                                                }
                                                boolean z14 = (b11 & 16) == 16;
                                                boolean z15 = (b11 & 1) == 1;
                                                int i17 = (b11 >> 1) & 7;
                                                b bVar4 = this.f44962n;
                                                bVar4.f44948a.add(new a(z14 ? 8 : i17, z15, bVar4.f44950c.length()));
                                                if (z14) {
                                                    this.f44962n.f44952e = A[i17];
                                                }
                                            } else if (i11 != 23 && b11 >= 33 && b11 <= 35) {
                                                this.f44962n.f44953f = b11 - 32;
                                            } else if (i12 == 20 && (b11 & 240) == 32) {
                                                if (b11 == 32) {
                                                    i(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case 37:
                                                            i(1);
                                                            this.f44966r = 2;
                                                            this.f44962n.f44955h = 2;
                                                            break;
                                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                            i(1);
                                                            this.f44966r = 3;
                                                            this.f44962n.f44955h = 3;
                                                            break;
                                                        case 39:
                                                            i(1);
                                                            this.f44966r = 4;
                                                            this.f44962n.f44955h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f44965q;
                                                            if (i13 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case 44:
                                                                            this.f44963o = Collections.EMPTY_LIST;
                                                                            if (i13 != 1 || i13 == 3) {
                                                                                h();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i13 == 1 && !this.f44962n.e()) {
                                                                                b bVar5 = this.f44962n;
                                                                                arrayList = bVar5.f44949b;
                                                                                arrayList.add(bVar5.d());
                                                                                bVar5.f44950c.setLength(0);
                                                                                bVar5.f44948a.clear();
                                                                                iMin = Math.min(bVar5.f44955h, bVar5.f44951d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                            h();
                                                                            break;
                                                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                            this.f44963o = g();
                                                                            h();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f44962n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    i(3);
                                                }
                                            }
                                        } else {
                                            this.f44962n.a((char) D[b11 & 15]);
                                        }
                                    } else {
                                        b bVar6 = this.f44962n;
                                        iArr = C;
                                        bVar6.a((char) iArr[(b10 & 127) - 32]);
                                        if ((b11 & 224) != 0) {
                                            this.f44962n.a((char) iArr[(b11 & 127) - 32]);
                                        }
                                    }
                                    z11 = true;
                                }
                            }
                        } else if (z12) {
                            h();
                            z11 = true;
                        }
                    } else if (this.f44968t && this.f44969u == b10 && this.f44970v == b11) {
                        this.f44968t = false;
                    } else {
                        this.f44968t = true;
                        this.f44969u = b10;
                        this.f44970v = b11;
                        if (!z10) {
                            if (1 > b10) {
                                if ((b10 & 246) == 20) {
                                    if (b11 == 32) {
                                        this.f44972x = true;
                                    } else {
                                        this.f44972x = true;
                                    }
                                }
                            } else if ((b10 & 246) == 20) {
                                if (b11 == 32) {
                                    this.f44972x = true;
                                } else {
                                    this.f44972x = true;
                                }
                            }
                            if (this.f44972x) {
                                i10 = b10 & 224;
                                if (i10 == 0) {
                                    this.f44971w = (b10 >> 3) & 1;
                                }
                                if (this.f44971w != this.f44960k) {
                                    if (i10 == 0) {
                                        i11 = b10 & 247;
                                        if (i11 == 17) {
                                            i12 = b10 & 246;
                                            if (i12 != 18) {
                                                if (i11 != 17) {
                                                    if ((b10 & 240) != 16) {
                                                        if (i11 != 23) {
                                                            if (i12 == 20) {
                                                                if (b11 == 32) {
                                                                    i(2);
                                                                } else if (b11 != 41) {
                                                                    switch (b11) {
                                                                        case 37:
                                                                            i(1);
                                                                            this.f44966r = 2;
                                                                            this.f44962n.f44955h = 2;
                                                                            break;
                                                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                            i(1);
                                                                            this.f44966r = 3;
                                                                            this.f44962n.f44955h = 3;
                                                                            break;
                                                                        case 39:
                                                                            i(1);
                                                                            this.f44966r = 4;
                                                                            this.f44962n.f44955h = 4;
                                                                            break;
                                                                        default:
                                                                            i13 = this.f44965q;
                                                                            if (i13 != 0) {
                                                                                if (b11 != 33) {
                                                                                    switch (b11) {
                                                                                        case 44:
                                                                                            this.f44963o = Collections.EMPTY_LIST;
                                                                                            if (i13 != 1) {
                                                                                                h();
                                                                                            } else {
                                                                                                h();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i13 == 1) {
                                                                                                b bVar7 = this.f44962n;
                                                                                                arrayList = bVar7.f44949b;
                                                                                                arrayList.add(bVar7.d());
                                                                                                bVar7.f44950c.setLength(0);
                                                                                                bVar7.f44948a.clear();
                                                                                                iMin = Math.min(bVar7.f44955h, bVar7.f44951d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                            h();
                                                                                            break;
                                                                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                            this.f44963o = g();
                                                                                            h();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f44962n.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    i(3);
                                                                }
                                                            }
                                                        } else if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                i(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        i(1);
                                                                        this.f44966r = 2;
                                                                        this.f44962n.f44955h = 2;
                                                                        break;
                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                        i(1);
                                                                        this.f44966r = 3;
                                                                        this.f44962n.f44955h = 3;
                                                                        break;
                                                                    case 39:
                                                                        i(1);
                                                                        this.f44966r = 4;
                                                                        this.f44962n.f44955h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f44965q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f44963o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar8 = this.f44962n;
                                                                                            arrayList = bVar8.f44949b;
                                                                                            arrayList.add(bVar8.d());
                                                                                            bVar8.f44950c.setLength(0);
                                                                                            bVar8.f44948a.clear();
                                                                                            iMin = Math.min(bVar8.f44955h, bVar8.f44951d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                        h();
                                                                                        break;
                                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                        this.f44963o = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f44962n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                i(3);
                                                            }
                                                        }
                                                    } else if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                i(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        i(1);
                                                                        this.f44966r = 2;
                                                                        this.f44962n.f44955h = 2;
                                                                        break;
                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                        i(1);
                                                                        this.f44966r = 3;
                                                                        this.f44962n.f44955h = 3;
                                                                        break;
                                                                    case 39:
                                                                        i(1);
                                                                        this.f44966r = 4;
                                                                        this.f44962n.f44955h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f44965q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f44963o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar9 = this.f44962n;
                                                                                            arrayList = bVar9.f44949b;
                                                                                            arrayList.add(bVar9.d());
                                                                                            bVar9.f44950c.setLength(0);
                                                                                            bVar9.f44948a.clear();
                                                                                            iMin = Math.min(bVar9.f44955h, bVar9.f44951d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                        h();
                                                                                        break;
                                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                        this.f44963o = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f44962n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                i(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            i(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    i(1);
                                                                    this.f44966r = 2;
                                                                    this.f44962n.f44955h = 2;
                                                                    break;
                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                    i(1);
                                                                    this.f44966r = 3;
                                                                    this.f44962n.f44955h = 3;
                                                                    break;
                                                                case 39:
                                                                    i(1);
                                                                    this.f44966r = 4;
                                                                    this.f44962n.f44955h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f44965q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f44963o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar10 = this.f44962n;
                                                                                        arrayList = bVar10.f44949b;
                                                                                        arrayList.add(bVar10.d());
                                                                                        bVar10.f44950c.setLength(0);
                                                                                        bVar10.f44948a.clear();
                                                                                        iMin = Math.min(bVar10.f44955h, bVar10.f44951d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                    h();
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                    this.f44963o = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f44962n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            i(3);
                                                        }
                                                    }
                                                } else if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                i(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        i(1);
                                                                        this.f44966r = 2;
                                                                        this.f44962n.f44955h = 2;
                                                                        break;
                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                        i(1);
                                                                        this.f44966r = 3;
                                                                        this.f44962n.f44955h = 3;
                                                                        break;
                                                                    case 39:
                                                                        i(1);
                                                                        this.f44966r = 4;
                                                                        this.f44962n.f44955h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f44965q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f44963o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar11 = this.f44962n;
                                                                                            arrayList = bVar11.f44949b;
                                                                                            arrayList.add(bVar11.d());
                                                                                            bVar11.f44950c.setLength(0);
                                                                                            bVar11.f44948a.clear();
                                                                                            iMin = Math.min(bVar11.f44955h, bVar11.f44951d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                        h();
                                                                                        break;
                                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                        this.f44963o = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f44962n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                i(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            i(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    i(1);
                                                                    this.f44966r = 2;
                                                                    this.f44962n.f44955h = 2;
                                                                    break;
                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                    i(1);
                                                                    this.f44966r = 3;
                                                                    this.f44962n.f44955h = 3;
                                                                    break;
                                                                case 39:
                                                                    i(1);
                                                                    this.f44966r = 4;
                                                                    this.f44962n.f44955h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f44965q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f44963o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar12 = this.f44962n;
                                                                                        arrayList = bVar12.f44949b;
                                                                                        arrayList.add(bVar12.d());
                                                                                        bVar12.f44950c.setLength(0);
                                                                                        bVar12.f44948a.clear();
                                                                                        iMin = Math.min(bVar12.f44955h, bVar12.f44951d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                    h();
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                    this.f44963o = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f44962n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            i(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            i(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    i(1);
                                                                    this.f44966r = 2;
                                                                    this.f44962n.f44955h = 2;
                                                                    break;
                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                    i(1);
                                                                    this.f44966r = 3;
                                                                    this.f44962n.f44955h = 3;
                                                                    break;
                                                                case 39:
                                                                    i(1);
                                                                    this.f44966r = 4;
                                                                    this.f44962n.f44955h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f44965q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f44963o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar13 = this.f44962n;
                                                                                        arrayList = bVar13.f44949b;
                                                                                        arrayList.add(bVar13.d());
                                                                                        bVar13.f44950c.setLength(0);
                                                                                        bVar13.f44948a.clear();
                                                                                        iMin = Math.min(bVar13.f44955h, bVar13.f44951d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                    h();
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                    this.f44963o = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f44962n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            i(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        i(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                i(1);
                                                                this.f44966r = 2;
                                                                this.f44962n.f44955h = 2;
                                                                break;
                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                i(1);
                                                                this.f44966r = 3;
                                                                this.f44962n.f44955h = 3;
                                                                break;
                                                            case 39:
                                                                i(1);
                                                                this.f44966r = 4;
                                                                this.f44962n.f44955h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f44965q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f44963o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar14 = this.f44962n;
                                                                                    arrayList = bVar14.f44949b;
                                                                                    arrayList.add(bVar14.d());
                                                                                    bVar14.f44950c.setLength(0);
                                                                                    bVar14.f44948a.clear();
                                                                                    iMin = Math.min(bVar14.f44955h, bVar14.f44951d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                h();
                                                                                break;
                                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                this.f44963o = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f44962n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        i(3);
                                                    }
                                                }
                                            } else if (i11 != 17) {
                                                if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                i(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        i(1);
                                                                        this.f44966r = 2;
                                                                        this.f44962n.f44955h = 2;
                                                                        break;
                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                        i(1);
                                                                        this.f44966r = 3;
                                                                        this.f44962n.f44955h = 3;
                                                                        break;
                                                                    case 39:
                                                                        i(1);
                                                                        this.f44966r = 4;
                                                                        this.f44962n.f44955h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f44965q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f44963o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar15 = this.f44962n;
                                                                                            arrayList = bVar15.f44949b;
                                                                                            arrayList.add(bVar15.d());
                                                                                            bVar15.f44950c.setLength(0);
                                                                                            bVar15.f44948a.clear();
                                                                                            iMin = Math.min(bVar15.f44955h, bVar15.f44951d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                        h();
                                                                                        break;
                                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                        this.f44963o = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f44962n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                i(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            i(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    i(1);
                                                                    this.f44966r = 2;
                                                                    this.f44962n.f44955h = 2;
                                                                    break;
                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                    i(1);
                                                                    this.f44966r = 3;
                                                                    this.f44962n.f44955h = 3;
                                                                    break;
                                                                case 39:
                                                                    i(1);
                                                                    this.f44966r = 4;
                                                                    this.f44962n.f44955h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f44965q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f44963o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar16 = this.f44962n;
                                                                                        arrayList = bVar16.f44949b;
                                                                                        arrayList.add(bVar16.d());
                                                                                        bVar16.f44950c.setLength(0);
                                                                                        bVar16.f44948a.clear();
                                                                                        iMin = Math.min(bVar16.f44955h, bVar16.f44951d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                    h();
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                    this.f44963o = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f44962n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            i(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            i(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    i(1);
                                                                    this.f44966r = 2;
                                                                    this.f44962n.f44955h = 2;
                                                                    break;
                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                    i(1);
                                                                    this.f44966r = 3;
                                                                    this.f44962n.f44955h = 3;
                                                                    break;
                                                                case 39:
                                                                    i(1);
                                                                    this.f44966r = 4;
                                                                    this.f44962n.f44955h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f44965q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f44963o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar17 = this.f44962n;
                                                                                        arrayList = bVar17.f44949b;
                                                                                        arrayList.add(bVar17.d());
                                                                                        bVar17.f44950c.setLength(0);
                                                                                        bVar17.f44948a.clear();
                                                                                        iMin = Math.min(bVar17.f44955h, bVar17.f44951d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                    h();
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                    this.f44963o = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f44962n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            i(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        i(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                i(1);
                                                                this.f44966r = 2;
                                                                this.f44962n.f44955h = 2;
                                                                break;
                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                i(1);
                                                                this.f44966r = 3;
                                                                this.f44962n.f44955h = 3;
                                                                break;
                                                            case 39:
                                                                i(1);
                                                                this.f44966r = 4;
                                                                this.f44962n.f44955h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f44965q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f44963o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar18 = this.f44962n;
                                                                                    arrayList = bVar18.f44949b;
                                                                                    arrayList.add(bVar18.d());
                                                                                    bVar18.f44950c.setLength(0);
                                                                                    bVar18.f44948a.clear();
                                                                                    iMin = Math.min(bVar18.f44955h, bVar18.f44951d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                h();
                                                                                break;
                                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                this.f44963o = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f44962n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        i(3);
                                                    }
                                                }
                                            } else if ((b10 & 240) != 16) {
                                                if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            i(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    i(1);
                                                                    this.f44966r = 2;
                                                                    this.f44962n.f44955h = 2;
                                                                    break;
                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                    i(1);
                                                                    this.f44966r = 3;
                                                                    this.f44962n.f44955h = 3;
                                                                    break;
                                                                case 39:
                                                                    i(1);
                                                                    this.f44966r = 4;
                                                                    this.f44962n.f44955h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f44965q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f44963o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar19 = this.f44962n;
                                                                                        arrayList = bVar19.f44949b;
                                                                                        arrayList.add(bVar19.d());
                                                                                        bVar19.f44950c.setLength(0);
                                                                                        bVar19.f44948a.clear();
                                                                                        iMin = Math.min(bVar19.f44955h, bVar19.f44951d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                    h();
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                    this.f44963o = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f44962n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            i(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        i(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                i(1);
                                                                this.f44966r = 2;
                                                                this.f44962n.f44955h = 2;
                                                                break;
                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                i(1);
                                                                this.f44966r = 3;
                                                                this.f44962n.f44955h = 3;
                                                                break;
                                                            case 39:
                                                                i(1);
                                                                this.f44966r = 4;
                                                                this.f44962n.f44955h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f44965q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f44963o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar110 = this.f44962n;
                                                                                    arrayList = bVar110.f44949b;
                                                                                    arrayList.add(bVar110.d());
                                                                                    bVar110.f44950c.setLength(0);
                                                                                    bVar110.f44948a.clear();
                                                                                    iMin = Math.min(bVar110.f44955h, bVar110.f44951d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                h();
                                                                                break;
                                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                this.f44963o = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f44962n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        i(3);
                                                    }
                                                }
                                            } else if (i11 != 23) {
                                                if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        i(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                i(1);
                                                                this.f44966r = 2;
                                                                this.f44962n.f44955h = 2;
                                                                break;
                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                i(1);
                                                                this.f44966r = 3;
                                                                this.f44962n.f44955h = 3;
                                                                break;
                                                            case 39:
                                                                i(1);
                                                                this.f44966r = 4;
                                                                this.f44962n.f44955h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f44965q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f44963o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar111 = this.f44962n;
                                                                                    arrayList = bVar111.f44949b;
                                                                                    arrayList.add(bVar111.d());
                                                                                    bVar111.f44950c.setLength(0);
                                                                                    bVar111.f44948a.clear();
                                                                                    iMin = Math.min(bVar111.f44955h, bVar111.f44951d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                h();
                                                                                break;
                                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                this.f44963o = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f44962n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        i(3);
                                                    }
                                                }
                                            } else if (i12 == 20) {
                                                if (b11 == 32) {
                                                    i(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case 37:
                                                            i(1);
                                                            this.f44966r = 2;
                                                            this.f44962n.f44955h = 2;
                                                            break;
                                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                            i(1);
                                                            this.f44966r = 3;
                                                            this.f44962n.f44955h = 3;
                                                            break;
                                                        case 39:
                                                            i(1);
                                                            this.f44966r = 4;
                                                            this.f44962n.f44955h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f44965q;
                                                            if (i13 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case 44:
                                                                            this.f44963o = Collections.EMPTY_LIST;
                                                                            if (i13 != 1) {
                                                                                h();
                                                                            } else {
                                                                                h();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i13 == 1) {
                                                                                b bVar112 = this.f44962n;
                                                                                arrayList = bVar112.f44949b;
                                                                                arrayList.add(bVar112.d());
                                                                                bVar112.f44950c.setLength(0);
                                                                                bVar112.f44948a.clear();
                                                                                iMin = Math.min(bVar112.f44955h, bVar112.f44951d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                            h();
                                                                            break;
                                                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                            this.f44963o = g();
                                                                            h();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f44962n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    i(3);
                                                }
                                            }
                                        } else {
                                            i12 = b10 & 246;
                                            if (i12 != 18) {
                                                if (i11 != 17) {
                                                    if ((b10 & 240) != 16) {
                                                        if (i11 != 23) {
                                                            if (i12 == 20) {
                                                                if (b11 == 32) {
                                                                    i(2);
                                                                } else if (b11 != 41) {
                                                                    switch (b11) {
                                                                        case 37:
                                                                            i(1);
                                                                            this.f44966r = 2;
                                                                            this.f44962n.f44955h = 2;
                                                                            break;
                                                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                            i(1);
                                                                            this.f44966r = 3;
                                                                            this.f44962n.f44955h = 3;
                                                                            break;
                                                                        case 39:
                                                                            i(1);
                                                                            this.f44966r = 4;
                                                                            this.f44962n.f44955h = 4;
                                                                            break;
                                                                        default:
                                                                            i13 = this.f44965q;
                                                                            if (i13 != 0) {
                                                                                if (b11 != 33) {
                                                                                    switch (b11) {
                                                                                        case 44:
                                                                                            this.f44963o = Collections.EMPTY_LIST;
                                                                                            if (i13 != 1) {
                                                                                                h();
                                                                                            } else {
                                                                                                h();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i13 == 1) {
                                                                                                b bVar113 = this.f44962n;
                                                                                                arrayList = bVar113.f44949b;
                                                                                                arrayList.add(bVar113.d());
                                                                                                bVar113.f44950c.setLength(0);
                                                                                                bVar113.f44948a.clear();
                                                                                                iMin = Math.min(bVar113.f44955h, bVar113.f44951d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                            h();
                                                                                            break;
                                                                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                            this.f44963o = g();
                                                                                            h();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f44962n.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    i(3);
                                                                }
                                                            }
                                                        } else if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                i(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        i(1);
                                                                        this.f44966r = 2;
                                                                        this.f44962n.f44955h = 2;
                                                                        break;
                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                        i(1);
                                                                        this.f44966r = 3;
                                                                        this.f44962n.f44955h = 3;
                                                                        break;
                                                                    case 39:
                                                                        i(1);
                                                                        this.f44966r = 4;
                                                                        this.f44962n.f44955h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f44965q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f44963o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar114 = this.f44962n;
                                                                                            arrayList = bVar114.f44949b;
                                                                                            arrayList.add(bVar114.d());
                                                                                            bVar114.f44950c.setLength(0);
                                                                                            bVar114.f44948a.clear();
                                                                                            iMin = Math.min(bVar114.f44955h, bVar114.f44951d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                        h();
                                                                                        break;
                                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                        this.f44963o = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f44962n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                i(3);
                                                            }
                                                        }
                                                    } else if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                i(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        i(1);
                                                                        this.f44966r = 2;
                                                                        this.f44962n.f44955h = 2;
                                                                        break;
                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                        i(1);
                                                                        this.f44966r = 3;
                                                                        this.f44962n.f44955h = 3;
                                                                        break;
                                                                    case 39:
                                                                        i(1);
                                                                        this.f44966r = 4;
                                                                        this.f44962n.f44955h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f44965q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f44963o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar115 = this.f44962n;
                                                                                            arrayList = bVar115.f44949b;
                                                                                            arrayList.add(bVar115.d());
                                                                                            bVar115.f44950c.setLength(0);
                                                                                            bVar115.f44948a.clear();
                                                                                            iMin = Math.min(bVar115.f44955h, bVar115.f44951d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                        h();
                                                                                        break;
                                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                        this.f44963o = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f44962n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                i(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            i(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    i(1);
                                                                    this.f44966r = 2;
                                                                    this.f44962n.f44955h = 2;
                                                                    break;
                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                    i(1);
                                                                    this.f44966r = 3;
                                                                    this.f44962n.f44955h = 3;
                                                                    break;
                                                                case 39:
                                                                    i(1);
                                                                    this.f44966r = 4;
                                                                    this.f44962n.f44955h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f44965q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f44963o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar116 = this.f44962n;
                                                                                        arrayList = bVar116.f44949b;
                                                                                        arrayList.add(bVar116.d());
                                                                                        bVar116.f44950c.setLength(0);
                                                                                        bVar116.f44948a.clear();
                                                                                        iMin = Math.min(bVar116.f44955h, bVar116.f44951d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                    h();
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                    this.f44963o = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f44962n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            i(3);
                                                        }
                                                    }
                                                } else if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                i(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        i(1);
                                                                        this.f44966r = 2;
                                                                        this.f44962n.f44955h = 2;
                                                                        break;
                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                        i(1);
                                                                        this.f44966r = 3;
                                                                        this.f44962n.f44955h = 3;
                                                                        break;
                                                                    case 39:
                                                                        i(1);
                                                                        this.f44966r = 4;
                                                                        this.f44962n.f44955h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f44965q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f44963o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar117 = this.f44962n;
                                                                                            arrayList = bVar117.f44949b;
                                                                                            arrayList.add(bVar117.d());
                                                                                            bVar117.f44950c.setLength(0);
                                                                                            bVar117.f44948a.clear();
                                                                                            iMin = Math.min(bVar117.f44955h, bVar117.f44951d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                        h();
                                                                                        break;
                                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                        this.f44963o = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f44962n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                i(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            i(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    i(1);
                                                                    this.f44966r = 2;
                                                                    this.f44962n.f44955h = 2;
                                                                    break;
                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                    i(1);
                                                                    this.f44966r = 3;
                                                                    this.f44962n.f44955h = 3;
                                                                    break;
                                                                case 39:
                                                                    i(1);
                                                                    this.f44966r = 4;
                                                                    this.f44962n.f44955h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f44965q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f44963o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar118 = this.f44962n;
                                                                                        arrayList = bVar118.f44949b;
                                                                                        arrayList.add(bVar118.d());
                                                                                        bVar118.f44950c.setLength(0);
                                                                                        bVar118.f44948a.clear();
                                                                                        iMin = Math.min(bVar118.f44955h, bVar118.f44951d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                    h();
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                    this.f44963o = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f44962n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            i(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            i(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    i(1);
                                                                    this.f44966r = 2;
                                                                    this.f44962n.f44955h = 2;
                                                                    break;
                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                    i(1);
                                                                    this.f44966r = 3;
                                                                    this.f44962n.f44955h = 3;
                                                                    break;
                                                                case 39:
                                                                    i(1);
                                                                    this.f44966r = 4;
                                                                    this.f44962n.f44955h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f44965q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f44963o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar119 = this.f44962n;
                                                                                        arrayList = bVar119.f44949b;
                                                                                        arrayList.add(bVar119.d());
                                                                                        bVar119.f44950c.setLength(0);
                                                                                        bVar119.f44948a.clear();
                                                                                        iMin = Math.min(bVar119.f44955h, bVar119.f44951d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                    h();
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                    this.f44963o = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f44962n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            i(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        i(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                i(1);
                                                                this.f44966r = 2;
                                                                this.f44962n.f44955h = 2;
                                                                break;
                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                i(1);
                                                                this.f44966r = 3;
                                                                this.f44962n.f44955h = 3;
                                                                break;
                                                            case 39:
                                                                i(1);
                                                                this.f44966r = 4;
                                                                this.f44962n.f44955h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f44965q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f44963o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar1110 = this.f44962n;
                                                                                    arrayList = bVar1110.f44949b;
                                                                                    arrayList.add(bVar1110.d());
                                                                                    bVar1110.f44950c.setLength(0);
                                                                                    bVar1110.f44948a.clear();
                                                                                    iMin = Math.min(bVar1110.f44955h, bVar1110.f44951d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                h();
                                                                                break;
                                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                this.f44963o = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f44962n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        i(3);
                                                    }
                                                }
                                            } else if (i11 != 17) {
                                                if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                i(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        i(1);
                                                                        this.f44966r = 2;
                                                                        this.f44962n.f44955h = 2;
                                                                        break;
                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                        i(1);
                                                                        this.f44966r = 3;
                                                                        this.f44962n.f44955h = 3;
                                                                        break;
                                                                    case 39:
                                                                        i(1);
                                                                        this.f44966r = 4;
                                                                        this.f44962n.f44955h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f44965q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f44963o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar1111 = this.f44962n;
                                                                                            arrayList = bVar1111.f44949b;
                                                                                            arrayList.add(bVar1111.d());
                                                                                            bVar1111.f44950c.setLength(0);
                                                                                            bVar1111.f44948a.clear();
                                                                                            iMin = Math.min(bVar1111.f44955h, bVar1111.f44951d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                        h();
                                                                                        break;
                                                                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                        this.f44963o = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f44962n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                i(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            i(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    i(1);
                                                                    this.f44966r = 2;
                                                                    this.f44962n.f44955h = 2;
                                                                    break;
                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                    i(1);
                                                                    this.f44966r = 3;
                                                                    this.f44962n.f44955h = 3;
                                                                    break;
                                                                case 39:
                                                                    i(1);
                                                                    this.f44966r = 4;
                                                                    this.f44962n.f44955h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f44965q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f44963o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar1112 = this.f44962n;
                                                                                        arrayList = bVar1112.f44949b;
                                                                                        arrayList.add(bVar1112.d());
                                                                                        bVar1112.f44950c.setLength(0);
                                                                                        bVar1112.f44948a.clear();
                                                                                        iMin = Math.min(bVar1112.f44955h, bVar1112.f44951d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                    h();
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                    this.f44963o = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f44962n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            i(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            i(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    i(1);
                                                                    this.f44966r = 2;
                                                                    this.f44962n.f44955h = 2;
                                                                    break;
                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                    i(1);
                                                                    this.f44966r = 3;
                                                                    this.f44962n.f44955h = 3;
                                                                    break;
                                                                case 39:
                                                                    i(1);
                                                                    this.f44966r = 4;
                                                                    this.f44962n.f44955h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f44965q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f44963o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar1113 = this.f44962n;
                                                                                        arrayList = bVar1113.f44949b;
                                                                                        arrayList.add(bVar1113.d());
                                                                                        bVar1113.f44950c.setLength(0);
                                                                                        bVar1113.f44948a.clear();
                                                                                        iMin = Math.min(bVar1113.f44955h, bVar1113.f44951d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                    h();
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                    this.f44963o = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f44962n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            i(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        i(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                i(1);
                                                                this.f44966r = 2;
                                                                this.f44962n.f44955h = 2;
                                                                break;
                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                i(1);
                                                                this.f44966r = 3;
                                                                this.f44962n.f44955h = 3;
                                                                break;
                                                            case 39:
                                                                i(1);
                                                                this.f44966r = 4;
                                                                this.f44962n.f44955h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f44965q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f44963o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar1114 = this.f44962n;
                                                                                    arrayList = bVar1114.f44949b;
                                                                                    arrayList.add(bVar1114.d());
                                                                                    bVar1114.f44950c.setLength(0);
                                                                                    bVar1114.f44948a.clear();
                                                                                    iMin = Math.min(bVar1114.f44955h, bVar1114.f44951d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                h();
                                                                                break;
                                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                this.f44963o = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f44962n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        i(3);
                                                    }
                                                }
                                            } else if ((b10 & 240) != 16) {
                                                if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            i(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    i(1);
                                                                    this.f44966r = 2;
                                                                    this.f44962n.f44955h = 2;
                                                                    break;
                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                    i(1);
                                                                    this.f44966r = 3;
                                                                    this.f44962n.f44955h = 3;
                                                                    break;
                                                                case 39:
                                                                    i(1);
                                                                    this.f44966r = 4;
                                                                    this.f44962n.f44955h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f44965q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f44963o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar1115 = this.f44962n;
                                                                                        arrayList = bVar1115.f44949b;
                                                                                        arrayList.add(bVar1115.d());
                                                                                        bVar1115.f44950c.setLength(0);
                                                                                        bVar1115.f44948a.clear();
                                                                                        iMin = Math.min(bVar1115.f44955h, bVar1115.f44951d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                    h();
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                    this.f44963o = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f44962n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            i(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        i(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                i(1);
                                                                this.f44966r = 2;
                                                                this.f44962n.f44955h = 2;
                                                                break;
                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                i(1);
                                                                this.f44966r = 3;
                                                                this.f44962n.f44955h = 3;
                                                                break;
                                                            case 39:
                                                                i(1);
                                                                this.f44966r = 4;
                                                                this.f44962n.f44955h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f44965q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f44963o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar1116 = this.f44962n;
                                                                                    arrayList = bVar1116.f44949b;
                                                                                    arrayList.add(bVar1116.d());
                                                                                    bVar1116.f44950c.setLength(0);
                                                                                    bVar1116.f44948a.clear();
                                                                                    iMin = Math.min(bVar1116.f44955h, bVar1116.f44951d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                h();
                                                                                break;
                                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                this.f44963o = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f44962n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        i(3);
                                                    }
                                                }
                                            } else if (i11 != 23) {
                                                if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        i(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                i(1);
                                                                this.f44966r = 2;
                                                                this.f44962n.f44955h = 2;
                                                                break;
                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                                i(1);
                                                                this.f44966r = 3;
                                                                this.f44962n.f44955h = 3;
                                                                break;
                                                            case 39:
                                                                i(1);
                                                                this.f44966r = 4;
                                                                this.f44962n.f44955h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f44965q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f44963o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar1117 = this.f44962n;
                                                                                    arrayList = bVar1117.f44949b;
                                                                                    arrayList.add(bVar1117.d());
                                                                                    bVar1117.f44950c.setLength(0);
                                                                                    bVar1117.f44948a.clear();
                                                                                    iMin = Math.min(bVar1117.f44955h, bVar1117.f44951d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                                h();
                                                                                break;
                                                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                                this.f44963o = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f44962n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        i(3);
                                                    }
                                                }
                                            } else if (i12 == 20) {
                                                if (b11 == 32) {
                                                    i(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case 37:
                                                            i(1);
                                                            this.f44966r = 2;
                                                            this.f44962n.f44955h = 2;
                                                            break;
                                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                            i(1);
                                                            this.f44966r = 3;
                                                            this.f44962n.f44955h = 3;
                                                            break;
                                                        case 39:
                                                            i(1);
                                                            this.f44966r = 4;
                                                            this.f44962n.f44955h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f44965q;
                                                            if (i13 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case 44:
                                                                            this.f44963o = Collections.EMPTY_LIST;
                                                                            if (i13 != 1) {
                                                                                h();
                                                                            } else {
                                                                                h();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i13 == 1) {
                                                                                b bVar1118 = this.f44962n;
                                                                                arrayList = bVar1118.f44949b;
                                                                                arrayList.add(bVar1118.d());
                                                                                bVar1118.f44950c.setLength(0);
                                                                                bVar1118.f44948a.clear();
                                                                                iMin = Math.min(bVar1118.f44955h, bVar1118.f44951d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                                            h();
                                                                            break;
                                                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                                            this.f44963o = g();
                                                                            h();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f44962n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    i(3);
                                                }
                                            }
                                        }
                                    } else {
                                        b bVar20 = this.f44962n;
                                        iArr = C;
                                        bVar20.a((char) iArr[(b10 & 127) - 32]);
                                        if ((b11 & 224) != 0) {
                                            this.f44962n.a((char) iArr[(b11 & 127) - 32]);
                                        }
                                    }
                                    z11 = true;
                                }
                            }
                        } else if (z12) {
                            h();
                            z11 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // l3.h, o1.b
    /* JADX INFO: renamed from: e */
    public final k3.c dequeueOutputBuffer() {
        k3.c cVar;
        k3.c cVarDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (cVarDequeueOutputBuffer != null) {
            return cVarDequeueOutputBuffer;
        }
        long j10 = this.l;
        if (j10 == C.TIME_UNSET) {
            return null;
        }
        long j11 = this.f44973y;
        if (j11 == C.TIME_UNSET || this.f45016e - j11 < j10 || (cVar = (k3.c) this.f45013b.pollFirst()) == null) {
            return null;
        }
        this.f44963o = Collections.EMPTY_LIST;
        this.f44973y = C.TIME_UNSET;
        i iVarC = c();
        long j12 = this.f45016e;
        cVar.f47040c = j12;
        cVar.f44275e = iVarC;
        cVar.f44276f = j12;
        return cVar;
    }

    @Override // l3.h
    public final boolean f() {
        return this.f44963o != this.f44964p;
    }

    @Override // l3.h, o1.b
    public final void flush() {
        super.flush();
        this.f44963o = null;
        this.f44964p = null;
        i(0);
        this.f44966r = 4;
        this.f44962n.f44955h = 4;
        h();
        this.f44967s = false;
        this.f44968t = false;
        this.f44969u = (byte) 0;
        this.f44970v = (byte) 0;
        this.f44971w = 0;
        this.f44972x = true;
        this.f44973y = C.TIME_UNSET;
    }

    public final ArrayList g() {
        ArrayList arrayList = this.f44961m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            k1.b bVarC = ((b) arrayList.get(i10)).c(Integer.MIN_VALUE);
            arrayList2.add(bVarC);
            if (bVarC != null) {
                iMin = Math.min(iMin, bVarC.f44233i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            k1.b bVarC2 = (k1.b) arrayList2.get(i11);
            if (bVarC2 != null) {
                if (bVarC2.f44233i != iMin) {
                    bVarC2 = ((b) arrayList.get(i11)).c(iMin);
                    bVarC2.getClass();
                }
                arrayList3.add(bVarC2);
            }
        }
        return arrayList3;
    }

    public final void h() {
        b bVar = this.f44962n;
        bVar.f44954g = this.f44965q;
        bVar.f44948a.clear();
        bVar.f44949b.clear();
        bVar.f44950c.setLength(0);
        bVar.f44951d = 15;
        bVar.f44952e = 0;
        bVar.f44953f = 0;
        ArrayList arrayList = this.f44961m;
        arrayList.clear();
        arrayList.add(this.f44962n);
    }

    public final void i(int i10) {
        int i11 = this.f44965q;
        if (i11 == i10) {
            return;
        }
        this.f44965q = i10;
        if (i10 != 3) {
            h();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f44963o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f44961m;
            if (i12 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i12)).f44954g = i10;
            i12++;
        }
    }

    @Override // l3.h, o1.b
    public final void release() {
    }
}
