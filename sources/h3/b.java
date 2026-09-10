package h3;

import android.util.Pair;
import androidx.recyclerview.widget.p1;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.c6;
import com.google.android.gms.internal.ads.d6;
import com.google.android.gms.internal.ads.e1;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.k3;
import com.google.android.gms.internal.ads.w2;
import com.google.android.gms.internal.ads.x1;
import com.google.android.gms.internal.ads.xd1;
import com.google.android.gms.internal.ads.y1;
import com.google.android.gms.internal.ads.z01;
import com.google.android.gms.internal.ads.z1;
import com.ironsource.Xa;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import d5.u;
import i1.b0;
import i1.c0;
import i1.d0;
import i1.e0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import l1.y;
import oa.j0;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f42089a;

    static {
        String str = y.f44830a;
        f42089a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(l1.q qVar) {
        int i10 = qVar.f44814b;
        qVar.N(4);
        if (qVar.m() != 1751411826) {
            i10 += 4;
        }
        qVar.M(i10);
    }

    /* JADX WARN: Code duplicated, block: B:202:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:273:0x0596  */
    /* JADX WARN: Code duplicated, block: B:285:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:291:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:368:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0176  */
    public static void b(l1.q qVar, int i10, int i11, int i12, int i13, String str, boolean z10, i1.m mVar, k3 k3Var, int i14) throws e0 {
        int iG;
        int i15;
        int i16;
        int iG2;
        int iM;
        int i17;
        int i18;
        int i19;
        i1.m mVarA;
        String str2;
        int i20;
        int i21;
        int i22;
        int i23;
        int iC;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean zH;
        int i32;
        int i33;
        int i34;
        int i35;
        boolean z11;
        boolean zH2;
        int i36;
        int i37;
        boolean z12;
        String str3;
        l1.q qVar2 = qVar;
        int iIntValue = i10;
        int i38 = i12;
        int[] iArr = n2.b.f46428f;
        int[] iArr2 = n2.b.f46426d;
        qVar2.M(i11 + 16);
        if (z10) {
            iG = qVar2.G();
            qVar2.N(6);
        } else {
            qVar2.N(8);
            iG = 0;
        }
        if (iG == 0 || iG == 1) {
            i15 = 2;
            i16 = 4;
            iG2 = qVar2.G();
            qVar2.N(6);
            int iA = qVar2.A();
            qVar2.M(qVar2.f44814b - 4);
            iM = qVar2.m();
            if (iG == 1) {
                qVar2.N(16);
            }
            i17 = iA;
            i18 = -1;
        } else {
            if (iG != 2) {
                return;
            }
            qVar2.N(16);
            i15 = 2;
            int iRound = (int) Math.round(Double.longBitsToDouble(qVar2.t()));
            int iD = qVar2.D();
            qVar2.N(4);
            i16 = 4;
            int iD2 = qVar2.D();
            int iD3 = qVar2.D();
            boolean z13 = (iD3 & 1) != 0;
            boolean z14 = (iD3 & 2) != 0;
            if (z13) {
                if (iD2 == 32) {
                    i18 = 4;
                } else {
                    i18 = -1;
                }
            } else if (iD2 == 8) {
                i18 = 3;
            } else if (iD2 == 16) {
                i18 = z14 ? 268435456 : 2;
            } else if (iD2 == 24) {
                i18 = z14 ? 1342177280 : 21;
            } else if (iD2 == 32) {
                i18 = z14 ? 1610612736 : 22;
            } else {
                i18 = -1;
            }
            qVar2.N(8);
            i17 = iRound;
            iG2 = iD;
            iM = 0;
        }
        if (iIntValue == 1767992678) {
            iG2 = -1;
            i17 = -1;
        } else {
            if (iIntValue != 1935764850) {
                i19 = iIntValue == 1935767394 ? 16000 : 8000;
            }
            i17 = i19;
            iG2 = 1;
        }
        int i39 = qVar2.f44814b;
        if (iIntValue == 1701733217) {
            Pair pairH = h(qVar2, i11, i38);
            if (pairH != null) {
                iIntValue = ((Integer) pairH.first).intValue();
                mVarA = mVar == null ? null : mVar.a(((q) pairH.second).f42193b);
                ((q[]) k3Var.f16295c)[i14] = (q) pairH.second;
            } else {
                mVarA = mVar;
            }
            qVar2.M(i39);
        } else {
            mVarA = mVar;
        }
        String str4 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (iIntValue == 1700998451) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = MimeTypes.AUDIO_DTS_HD;
        } else if (iIntValue == 1685353317) {
            str2 = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = MimeTypes.AUDIO_AMR_NB;
        } else if (iIntValue == 1935767394) {
            str2 = MimeTypes.AUDIO_AMR_WB;
        } else if (iIntValue == 1936684916) {
            i18 = i15;
            str2 = MimeTypes.AUDIO_RAW;
        } else if (iIntValue == 1953984371) {
            str2 = MimeTypes.AUDIO_RAW;
            i18 = 268435456;
        } else if (iIntValue == 1819304813) {
            if (i18 == -1) {
                i18 = i15;
            }
            str2 = MimeTypes.AUDIO_RAW;
        } else if (iIntValue == 778924082 || iIntValue == 778924083) {
            str2 = MimeTypes.AUDIO_MPEG;
        } else if (iIntValue == 1835557169) {
            str2 = "audio/mha1";
        } else if (iIntValue == 1835560241) {
            str2 = "audio/mhm1";
        } else if (iIntValue == 1634492771) {
            str2 = MimeTypes.AUDIO_ALAC;
        } else if (iIntValue == 1634492791) {
            str2 = MimeTypes.AUDIO_ALAW;
        } else if (iIntValue == 1970037111) {
            str2 = MimeTypes.AUDIO_MLAW;
        } else if (iIntValue == 1332770163) {
            str2 = MimeTypes.AUDIO_OPUS;
        } else if (iIntValue == 1716281667) {
            str2 = MimeTypes.AUDIO_FLAC;
        } else if (iIntValue == 1835823201) {
            str2 = MimeTypes.AUDIO_TRUEHD;
        } else {
            str2 = iIntValue == 1767992678 ? "audio/iamf" : null;
        }
        d6 d6VarC = null;
        String strI = null;
        List listB = null;
        e1 e1Var = null;
        while (i39 - i11 < i38) {
            qVar2.M(i39);
            int iM2 = qVar2.m();
            int i40 = i18;
            n2.b.e("childAtomSize must be positive", iM2 > 0);
            int iM3 = qVar2.m();
            strI = strI;
            if (iM3 == 1835557187) {
                qVar2.M(i39 + 8);
                qVar2.N(1);
                int iZ = qVar2.z();
                qVar2.N(1);
                String str5 = Objects.equals(str2, str4) ? String.format("mhm1.%02X", Integer.valueOf(iZ)) : String.format("mha1.%02X", Integer.valueOf(iZ));
                int iG3 = qVar2.G();
                byte[] bArr = new byte[iG3];
                String str6 = str5;
                qVar2.k(bArr, 0, iG3);
                strI = str6;
                listB = listB == null ? j0.B(bArr) : j0.C(bArr, (byte[]) listB.get(0));
            } else if (iM3 == 1835557200) {
                qVar2.M(i39 + 8);
                int iZ2 = qVar2.z();
                if (iZ2 > 0) {
                    byte[] bArr2 = new byte[iZ2];
                    qVar2.k(bArr2, 0, iZ2);
                    listB = listB == null ? j0.B(bArr2) : j0.C((byte[]) listB.get(0), bArr2);
                }
                listB = listB;
                strI = strI;
            } else {
                if (iM3 == 1702061171 || (z10 && iM3 == 2002876005)) {
                    String str7 = str2;
                    listB = listB;
                    int i41 = iM2;
                    int i42 = i39;
                    int i43 = iG2;
                    str4 = str4;
                    i20 = iIntValue;
                    if (iM3 == 1702061171) {
                        i22 = i41;
                        i21 = i42;
                        i39 = i21;
                    } else {
                        i21 = qVar2.f44814b;
                        i39 = i42;
                        n2.b.e(null, i21 >= i39);
                        while (true) {
                            i22 = i41;
                            if (i21 - i39 < i22) {
                                qVar2.M(i21);
                                int iM4 = qVar2.m();
                                n2.b.e("childAtomSize must be positive", iM4 > 0);
                                if (qVar2.m() != 1702061171) {
                                    i21 += iM4;
                                    i41 = i22;
                                }
                            } else {
                                i21 = -1;
                            }
                        }
                    }
                    if (i21 != -1) {
                        d6VarC = c(i21, qVar2);
                        String str8 = d6VarC.f13428a;
                        byte[] bArr3 = d6VarC.f13429b;
                        if (bArr3 == null) {
                            iM2 = i22;
                        } else if (MimeTypes.AUDIO_VORBIS.equals(str8)) {
                            l1.q qVar3 = new l1.q(bArr3);
                            qVar3.N(1);
                            int i44 = 0;
                            while (qVar3.a() > 0 && qVar3.j() == 255) {
                                i44 += 255;
                                qVar3.N(1);
                            }
                            int iZ3 = qVar3.z() + i44;
                            int i45 = 0;
                            while (true) {
                                if (qVar3.a() > 0) {
                                    iM2 = i22;
                                    if (qVar3.j() == 255) {
                                        i45 += 255;
                                        qVar3.N(1);
                                        i22 = iM2;
                                    }
                                } else {
                                    iM2 = i22;
                                }
                            }
                            int iZ4 = qVar3.z() + i45;
                            byte[] bArr4 = new byte[iZ3];
                            int i46 = qVar3.f44814b;
                            System.arraycopy(bArr3, i46, bArr4, 0, iZ3);
                            int i47 = i46 + iZ3 + iZ4;
                            int length = bArr3.length - i47;
                            byte[] bArr5 = new byte[length];
                            System.arraycopy(bArr3, i47, bArr5, 0, length);
                            listB = j0.C(bArr4, bArr5);
                        } else {
                            iM2 = i22;
                            if (MimeTypes.AUDIO_AAC.equals(str8)) {
                                n2.a aVarS = n2.b.s(new xd1(bArr3, bArr3.length), false);
                                i17 = aVarS.f46421b;
                                iG2 = aVarS.f46422c;
                                strI = aVarS.f46420a;
                            } else {
                                iG2 = i43;
                                strI = strI;
                            }
                            listB = j0.B(bArr3);
                            str2 = str8;
                        }
                        str2 = str8;
                        iG2 = i43;
                        strI = strI;
                    } else {
                        iM2 = i22;
                        d6VarC = d6VarC;
                        iG2 = i43;
                        strI = strI;
                        str2 = str7;
                    }
                } else if (iM3 == 1651798644) {
                    qVar2.M(i39 + 8);
                    qVar2.N(i16);
                    e1Var = new e1(qVar2.B(), qVar2.B());
                    listB = listB;
                    strI = strI;
                    str2 = str2;
                } else {
                    str2 = str2;
                    str4 = str4;
                    if (iM3 == 1684103987) {
                        qVar2.M(i39 + 8);
                        String string = Integer.toString(i13);
                        xd1 xd1Var = new xd1();
                        xd1Var.o(qVar2);
                        int i48 = iArr2[xd1Var.i(i15)];
                        xd1Var.t(8);
                        int i49 = iArr[xd1Var.i(3)];
                        if (xd1Var.i(1) != 0) {
                            i49++;
                        }
                        int i50 = n2.b.f46429g[xd1Var.i(5)] * 1000;
                        xd1Var.c();
                        qVar2.M(xd1Var.f());
                        i1.o oVar = new i1.o();
                        oVar.f42589a = string;
                        oVar.f42600m = d0.n(MimeTypes.AUDIO_AC3);
                        oVar.E = i49;
                        oVar.F = i48;
                        oVar.f42604q = mVarA;
                        oVar.f42592d = str;
                        oVar.f42596h = i50;
                        oVar.f42597i = i50;
                        k3Var.f16296d = new i1.p(oVar);
                        listB = listB;
                        iM2 = iM2;
                        i39 = i39;
                        i23 = iG2;
                        i20 = iIntValue;
                    } else if (iM3 == 1684366131) {
                        qVar2.M(i39 + 8);
                        String string2 = Integer.toString(i13);
                        xd1 xd1Var2 = new xd1();
                        xd1Var2.o(qVar2);
                        int i51 = xd1Var2.i(13) * 1000;
                        xd1Var2.t(3);
                        int i52 = iArr2[xd1Var2.i(2)];
                        xd1Var2.t(10);
                        int i53 = iArr[xd1Var2.i(3)];
                        if (xd1Var2.i(1) != 0) {
                            i53++;
                        }
                        int i54 = i53;
                        xd1Var2.t(3);
                        int i55 = xd1Var2.i(4);
                        xd1Var2.t(1);
                        if (i55 > 0) {
                            xd1Var2.t(6);
                            if (xd1Var2.i(1) != 0) {
                                i54 += 2;
                            }
                            xd1Var2.t(1);
                        }
                        int i56 = i54;
                        iM2 = iM2;
                        if (xd1Var2.b() > 7) {
                            xd1Var2.t(7);
                            if (xd1Var2.i(1) != 0) {
                                str3 = MimeTypes.AUDIO_E_AC3_JOC;
                            } else {
                                str3 = MimeTypes.AUDIO_E_AC3;
                            }
                        } else {
                            str3 = MimeTypes.AUDIO_E_AC3;
                        }
                        xd1Var2.c();
                        qVar2.M(xd1Var2.f());
                        i1.o oVar2 = new i1.o();
                        oVar2.f42589a = string2;
                        oVar2.f42600m = d0.n(str3);
                        oVar2.E = i56;
                        oVar2.F = i52;
                        oVar2.f42604q = mVarA;
                        oVar2.f42592d = str;
                        oVar2.f42597i = i51;
                        k3Var.f16296d = new i1.p(oVar2);
                        i20 = iIntValue;
                        i23 = iG2;
                    } else {
                        listB = listB;
                        iM2 = iM2;
                        if (iM3 == 1684103988) {
                            qVar2.M(i39 + 8);
                            String string3 = Integer.toString(i13);
                            xd1 xd1Var3 = new xd1();
                            xd1Var3.o(qVar2);
                            int iB = xd1Var3.b();
                            int i57 = xd1Var3.i(3);
                            if (i57 > 1) {
                                throw e0.c("Unsupported AC-4 DSI version: " + i57);
                            }
                            int i58 = xd1Var3.i(7);
                            int i59 = xd1Var3.h() ? 48000 : 44100;
                            xd1Var3.t(4);
                            int i60 = xd1Var3.i(9);
                            if (i58 > 1) {
                                if (i57 == 0) {
                                    throw e0.c("Invalid AC-4 DSI version: " + i57);
                                }
                                if (xd1Var3.h()) {
                                    xd1Var3.t(16);
                                    if (xd1Var3.h()) {
                                        xd1Var3.t(128);
                                    }
                                }
                            }
                            if (i57 == 1) {
                                if (xd1Var3.b() < 66) {
                                    throw e0.c("Invalid AC-4 DSI bitrate.");
                                }
                                xd1Var3.t(66);
                                xd1Var3.c();
                            }
                            x1 x1Var = new x1();
                            x1Var.f21668a = true;
                            x1Var.f21669b = -1;
                            x1Var.f21670c = -1;
                            x1Var.f21671d = true;
                            x1Var.f21672e = 2;
                            x1Var.f21673f = 1;
                            x1Var.f21674g = 0;
                            int i61 = 0;
                            while (true) {
                                if (i61 < i60) {
                                    if (i57 == 0) {
                                        i27 = i17;
                                        zH = xd1Var3.h();
                                        i32 = xd1Var3.i(5);
                                        i33 = xd1Var3.i(5);
                                        i34 = 0;
                                        i35 = 0;
                                        z11 = false;
                                    } else {
                                        int i62 = i60;
                                        int i63 = xd1Var3.i(8);
                                        i27 = i17;
                                        int i64 = xd1Var3.i(8);
                                        int i65 = i64 == 255 ? xd1Var3.i(16) + i64 : i64;
                                        if (i63 > 2) {
                                            xd1Var3.t(i65 * 8);
                                            i61++;
                                            i60 = i62;
                                            i17 = i27;
                                        } else {
                                            int iB2 = (iB - xd1Var3.b()) / 8;
                                            int i66 = xd1Var3.i(5);
                                            i35 = iB2;
                                            z11 = i66 == 31;
                                            zH = false;
                                            i33 = i63;
                                            i32 = i66;
                                            i34 = i65;
                                        }
                                    }
                                    x1Var.f21673f = i33;
                                    i26 = iG2;
                                    if (zH || z11 || i32 != 6) {
                                        x1Var.f21674g = xd1Var3.i(3);
                                        if (xd1Var3.h()) {
                                            xd1Var3.t(5);
                                        }
                                        xd1Var3.t(2);
                                        int i67 = 1;
                                        if (i57 == 1 && (i33 == 1 || i33 == 2)) {
                                            xd1Var3.t(2);
                                        }
                                        xd1Var3.t(5);
                                        xd1Var3.t(10);
                                        if (i57 == 1) {
                                            if (i33 > 0) {
                                                x1Var.f21668a = xd1Var3.h();
                                            }
                                            if (x1Var.f21668a) {
                                                if (i33 != 1) {
                                                    i36 = 2;
                                                    if (i33 == 2) {
                                                        i37 = xd1Var3.i(5);
                                                        if (i37 >= 0 && i37 <= 15) {
                                                            x1Var.f21669b = i37;
                                                        }
                                                        if (i37 >= 11 || i37 > 14) {
                                                            i36 = 2;
                                                        } else {
                                                            x1Var.f21671d = xd1Var3.h();
                                                            i36 = 2;
                                                            x1Var.f21672e = xd1Var3.i(2);
                                                        }
                                                    }
                                                } else {
                                                    i37 = xd1Var3.i(5);
                                                    if (i37 >= 0) {
                                                        x1Var.f21669b = i37;
                                                    }
                                                    if (i37 >= 11) {
                                                        i36 = 2;
                                                    } else {
                                                        i36 = 2;
                                                    }
                                                }
                                                xd1Var3.t(24);
                                                i67 = 1;
                                            } else {
                                                i36 = 2;
                                            }
                                            if (i33 == i67 || i33 == i36) {
                                                if (xd1Var3.h() && xd1Var3.h()) {
                                                    xd1Var3.t(i36);
                                                }
                                                if (xd1Var3.h()) {
                                                    xd1Var3.s();
                                                    int i68 = 8;
                                                    int i69 = xd1Var3.i(8);
                                                    int i70 = 0;
                                                    while (i70 < i69) {
                                                        xd1Var3.t(i68);
                                                        i70++;
                                                        i68 = 8;
                                                    }
                                                }
                                            }
                                        }
                                        if (!zH && !z11) {
                                            xd1Var3.s();
                                            if (i32 == 0 || i32 == 1 || i32 == 2) {
                                                if (i33 == 0) {
                                                    for (int i71 = 0; i71 < 2; i71++) {
                                                        n2.b.t(xd1Var3, x1Var);
                                                    }
                                                } else {
                                                    for (int i72 = 0; i72 < 2; i72++) {
                                                        n2.b.u(xd1Var3, x1Var);
                                                    }
                                                }
                                            } else if (i32 == 3 || i32 == 4) {
                                                if (i33 == 0) {
                                                    for (int i73 = 0; i73 < 3; i73++) {
                                                        n2.b.t(xd1Var3, x1Var);
                                                    }
                                                } else {
                                                    for (int i74 = 0; i74 < 3; i74++) {
                                                        n2.b.u(xd1Var3, x1Var);
                                                    }
                                                }
                                            } else if (i32 != 5) {
                                                int i75 = xd1Var3.i(7);
                                                for (int i76 = 0; i76 < i75; i76++) {
                                                    xd1Var3.t(8);
                                                }
                                            } else if (i33 == 0) {
                                                n2.b.t(xd1Var3, x1Var);
                                            } else {
                                                int i77 = xd1Var3.i(3);
                                                for (int i78 = 0; i78 < i77 + 2; i78++) {
                                                    n2.b.u(xd1Var3, x1Var);
                                                }
                                            }
                                        } else if (i33 == 0) {
                                            n2.b.t(xd1Var3, x1Var);
                                        } else {
                                            n2.b.u(xd1Var3, x1Var);
                                        }
                                        xd1Var3.s();
                                        zH2 = xd1Var3.h();
                                    } else {
                                        i33 = i33;
                                        zH2 = true;
                                    }
                                    if (zH2) {
                                        int i79 = xd1Var3.i(7);
                                        for (int i80 = 0; i80 < i79; i80++) {
                                            xd1Var3.t(15);
                                        }
                                    }
                                    if (i33 <= 0) {
                                        i28 = 8;
                                    } else {
                                        if (xd1Var3.h()) {
                                            if (xd1Var3.b() < 66) {
                                                z12 = false;
                                            } else {
                                                xd1Var3.t(66);
                                                z12 = true;
                                            }
                                            if (!z12) {
                                                throw e0.c("Can't parse bitrate DSI.");
                                            }
                                        }
                                        if (xd1Var3.h()) {
                                            xd1Var3.c();
                                            xd1Var3.u(xd1Var3.i(16));
                                            int i81 = xd1Var3.i(5);
                                            for (int i82 = 0; i82 < i81; i82++) {
                                                xd1Var3.t(3);
                                                xd1Var3.t(8);
                                            }
                                            i28 = 8;
                                        } else {
                                            i28 = 8;
                                        }
                                    }
                                    xd1Var3.c();
                                    if (i57 == 1) {
                                        int iB3 = ((iB - xd1Var3.b()) / 8) - i35;
                                        if (i34 < iB3) {
                                            throw e0.c("pres_bytes is smaller than presentation bytes read.");
                                        }
                                        xd1Var3.u(i34 - iB3);
                                    }
                                    if (x1Var.f21668a && x1Var.f21669b == -1) {
                                        throw e0.c("Can't determine channel mode of presentation " + i61);
                                    }
                                } else {
                                    iIntValue = iIntValue;
                                    i26 = iG2;
                                    i27 = i17;
                                    i28 = 8;
                                }
                                if (x1Var.f21668a) {
                                    int i83 = x1Var.f21669b;
                                    boolean z15 = x1Var.f21671d;
                                    int i84 = x1Var.f21672e;
                                    switch (i83) {
                                        case 0:
                                            i30 = 11;
                                            i31 = 1;
                                            break;
                                        case 1:
                                            i30 = 11;
                                            i31 = 2;
                                            break;
                                        case 2:
                                            i30 = 11;
                                            i31 = 3;
                                            break;
                                        case 3:
                                            i30 = 11;
                                            i31 = 5;
                                            break;
                                        case 4:
                                            i30 = 11;
                                            i31 = 6;
                                            break;
                                        case 5:
                                        case 7:
                                        case 9:
                                            i30 = 11;
                                            i31 = 7;
                                            break;
                                        case 6:
                                        case 8:
                                        case 10:
                                            i31 = i28;
                                            i30 = 11;
                                            break;
                                        case 11:
                                            i30 = 11;
                                            i31 = 11;
                                            break;
                                        case 12:
                                            i31 = 12;
                                            i30 = 11;
                                            break;
                                        case 13:
                                            i30 = 11;
                                            i31 = 13;
                                            break;
                                        case 14:
                                            i30 = 11;
                                            i31 = 14;
                                            break;
                                        case 15:
                                            i30 = 11;
                                            i31 = 24;
                                            break;
                                        default:
                                            i30 = 11;
                                            i31 = -1;
                                            break;
                                    }
                                    if (i83 == i30 || i83 == 12 || i83 == 13 || i83 == 14) {
                                        if (!z15) {
                                            i31 -= 2;
                                        }
                                        if (i84 == 0) {
                                            i31 -= 4;
                                        } else if (i84 == 1) {
                                            i31 -= 2;
                                        }
                                    }
                                    i29 = i31;
                                } else {
                                    int i85 = x1Var.f21670c;
                                    if (i85 > 0) {
                                        i29 = i85 + 1;
                                        if (x1Var.f21674g == 4 && i29 == 17) {
                                            i29 = 21;
                                        }
                                    } else {
                                        int i86 = x1Var.f21674g;
                                        if (i86 == 0) {
                                            i29 = 2;
                                        } else if (i86 == 1) {
                                            i29 = 6;
                                        } else if (i86 == 2) {
                                            i29 = i28;
                                        } else if (i86 == 3) {
                                            i29 = 10;
                                        } else if (i86 != 4) {
                                            l1.a.s("Ac4Util", "AC-4 level " + x1Var.f21674g + " has not been defined.");
                                            i29 = 2;
                                        } else {
                                            i29 = 12;
                                        }
                                    }
                                }
                                if (i29 <= 0) {
                                    throw e0.c("Cannot determine channel count of presentation.");
                                }
                                Object[] objArr = {Integer.valueOf(i58), Integer.valueOf(x1Var.f21673f), Integer.valueOf(x1Var.f21674g)};
                                String str9 = y.f44830a;
                                String str10 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                i1.o oVar3 = new i1.o();
                                oVar3.f42589a = string3;
                                oVar3.f42600m = d0.n("audio/ac4");
                                oVar3.E = i29;
                                oVar3.F = i59;
                                oVar3.f42604q = mVarA;
                                oVar3.f42592d = str;
                                oVar3.f42598j = str10;
                                k3Var.f16296d = new i1.p(oVar3);
                                i17 = i27;
                                i23 = i26;
                                i20 = iIntValue;
                            }
                        } else {
                            i20 = iIntValue;
                            i39 = i39;
                            int i87 = iG2;
                            int i88 = i17;
                            if (iM3 == 1684892784) {
                                if (iM <= 0) {
                                    throw e0.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + iM);
                                }
                                i17 = iM;
                                iG2 = 2;
                            } else if (iM3 == 1684305011 || iM3 == 1969517683) {
                                i20 = i20;
                                i1.o oVar4 = new i1.o();
                                oVar4.f42589a = Integer.toString(i13);
                                oVar4.f42600m = d0.n(str2);
                                i23 = i87;
                                oVar4.E = i23;
                                i17 = i88;
                                oVar4.F = i17;
                                oVar4.f42604q = mVarA;
                                oVar4.f42592d = str;
                                k3Var.f16296d = new i1.p(oVar4);
                            } else if (iM3 == 1682927731) {
                                int i89 = iM2 - 8;
                                byte[] bArr6 = f42089a;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr6, bArr6.length + i89);
                                qVar2.M(i39 + 8);
                                qVar2.k(bArrCopyOf, bArr6.length, i89);
                                listB = n2.b.c(bArrCopyOf);
                                i17 = i88;
                                iG2 = i87;
                            } else {
                                if (iM3 == 1684425825) {
                                    byte[] bArr7 = new byte[iM2 - 8];
                                    bArr7[0] = 102;
                                    bArr7[1] = 76;
                                    bArr7[2] = 97;
                                    bArr7[3] = 67;
                                    qVar2.M(i39 + 12);
                                    qVar2.k(bArr7, 4, iM2 - 12);
                                    listB = j0.B(bArr7);
                                    strI = strI;
                                } else if (iM3 == 1634492771) {
                                    int i90 = iM2 - 12;
                                    byte[] bArr8 = new byte[i90];
                                    qVar2.M(i39 + 12);
                                    qVar2.k(bArr8, 0, i90);
                                    byte[] bArr9 = l1.c.f44778a;
                                    l1.q qVar4 = new l1.q(bArr8);
                                    qVar4.M(5);
                                    int iZ5 = qVar4.z();
                                    qVar4.M(9);
                                    int iZ6 = qVar4.z();
                                    qVar4.M(20);
                                    int[] iArr3 = {qVar4.D(), iZ6, iZ5};
                                    int i91 = iArr3[0];
                                    int i92 = iArr3[1];
                                    int i93 = iArr3[2];
                                    String str11 = y.f44830a;
                                    int iC2 = y.C(i93, ByteOrder.LITTLE_ENDIAN);
                                    listB = j0.B(bArr8);
                                    i40 = iC2;
                                    i17 = i91;
                                    iG2 = i92;
                                    strI = strI;
                                    str2 = str2;
                                    i39 = i39;
                                    i20 = i20;
                                    d6VarC = d6VarC;
                                } else if (iM3 == 1767990114) {
                                    qVar2.M(i39 + 9);
                                    int iE = qVar2.E();
                                    byte[] bArr10 = new byte[iE];
                                    qVar2.k(bArr10, 0, iE);
                                    byte[] bArr11 = l1.c.f44778a;
                                    l1.q qVar5 = new l1.q(bArr10);
                                    String str12 = null;
                                    String strX = null;
                                    while (qVar5.a() > 0 && (str12 == null || strX == null)) {
                                        int iZ7 = qVar5.z();
                                        int i94 = iZ7 >> 3;
                                        boolean z16 = (iZ7 & 2) != 0;
                                        boolean z17 = (iZ7 & 1) != 0;
                                        int iE2 = qVar5.E();
                                        if (i94 > 4 && i94 < 24 && z16) {
                                            do {
                                            } while ((qVar5.z() & 128) != 0);
                                            for (i25 = 128; (qVar5.z() & i25) != 0; i25 = 128) {
                                            }
                                        }
                                        if (z17) {
                                            qVar5.N(qVar5.E());
                                        }
                                        int i95 = qVar5.f44814b + iE2;
                                        if (i94 == 31) {
                                            qVar5.N(4);
                                            Object[] objArr2 = {Integer.valueOf(qVar5.z()), Integer.valueOf(qVar5.z())};
                                            String str13 = y.f44830a;
                                            str12 = String.format(Locale.US, "iamf.%03X.%03X", objArr2);
                                        } else {
                                            if (i94 == 0) {
                                                while ((qVar5.z() & 128) != 0) {
                                                }
                                                strX = qVar5.x(4, StandardCharsets.UTF_8);
                                                if (strX.equals("mp4a")) {
                                                    while ((qVar5.z() & 128) != 0) {
                                                    }
                                                    qVar5.N(2);
                                                    xd1 xd1Var4 = new xd1();
                                                    xd1Var4.o(qVar5);
                                                    int i96 = xd1Var4.i(5);
                                                    if (i96 == 31) {
                                                        i96 = xd1Var4.i(6) + 32;
                                                    }
                                                    strX = strX + ".40." + i96;
                                                }
                                            }
                                            qVar5.M(i95);
                                        }
                                        qVar5.M(i95);
                                    }
                                    strI = (str12 == null || strX == null) ? null : wi.d.i(str12, ".", strX);
                                    listB = j0.B(bArr10);
                                } else if (iM3 == 1885564227) {
                                    qVar2.M(i39 + 12);
                                    ByteOrder byteOrder = (qVar2.z() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                    int iZ8 = qVar2.z();
                                    i20 = i20;
                                    if (i20 == 1768973165) {
                                        iC = y.C(iZ8, byteOrder);
                                        i24 = -1;
                                    } else {
                                        iC = (i20 == 1718641517 && iZ8 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : i40;
                                        i24 = -1;
                                    }
                                    d6VarC = d6VarC;
                                    i40 = iC;
                                    strI = strI;
                                    str2 = iC != i24 ? MimeTypes.AUDIO_RAW : str2;
                                    i39 = i39;
                                    i17 = i88;
                                    iG2 = i87;
                                } else {
                                    i20 = i20;
                                    i17 = i88;
                                    i23 = i87;
                                }
                                str2 = str2;
                                i39 = i39;
                                i17 = i88;
                                iG2 = i87;
                                i20 = i20;
                            }
                        }
                    }
                    d6VarC = d6VarC;
                    iG2 = i23;
                    strI = strI;
                    str2 = str2;
                    i39 = i39;
                }
                i39 += iM2;
                i16 = 4;
                i15 = 2;
                qVar2 = qVar;
                i38 = i12;
                iIntValue = i20;
                d6VarC = d6VarC;
                i18 = i40;
                str4 = str4;
                listB = listB;
            }
            d6VarC = d6VarC;
            i20 = iIntValue;
            i39 += iM2;
            i16 = 4;
            i15 = 2;
            qVar2 = qVar;
            i38 = i12;
            iIntValue = i20;
            d6VarC = d6VarC;
            i18 = i40;
            str4 = str4;
            listB = listB;
        }
        String str14 = strI;
        String str15 = str2;
        List list = listB;
        int i97 = iG2;
        int i98 = i18;
        if (((i1.p) k3Var.f16296d) != null || str15 == null) {
            return;
        }
        i1.o oVar5 = new i1.o();
        oVar5.f42589a = Integer.toString(i13);
        oVar5.f42600m = d0.n(str15);
        oVar5.f42598j = str14;
        oVar5.E = i97;
        oVar5.F = i17;
        oVar5.G = i98;
        oVar5.f42603p = list;
        oVar5.f42604q = mVarA;
        oVar5.f42592d = str;
        if (d6VarC != null) {
            d6 d6Var = d6VarC;
            oVar5.f42596h = com.bumptech.glide.c.D(d6Var.f13430c);
            oVar5.f42597i = com.bumptech.glide.c.D(d6Var.f13431d);
        } else {
            e1 e1Var2 = e1Var;
            if (e1Var2 != null) {
                oVar5.f42596h = com.bumptech.glide.c.D(e1Var2.f13801a);
                oVar5.f42597i = com.bumptech.glide.c.D(e1Var2.f13802b);
            }
        }
        k3Var.f16296d = new i1.p(oVar5);
    }

    public static d6 c(int i10, l1.q qVar) {
        qVar.M(i10 + 12);
        qVar.N(1);
        d(qVar);
        qVar.N(2);
        int iZ = qVar.z();
        if ((iZ & 128) != 0) {
            qVar.N(2);
        }
        if ((iZ & 64) != 0) {
            qVar.N(qVar.z());
        }
        if ((iZ & 32) != 0) {
            qVar.N(2);
        }
        qVar.N(1);
        d(qVar);
        String strE = d0.e(qVar.z());
        if (MimeTypes.AUDIO_MPEG.equals(strE) || MimeTypes.AUDIO_DTS.equals(strE) || MimeTypes.AUDIO_DTS_HD.equals(strE)) {
            return new d6(strE, null, -1L, -1L);
        }
        qVar.N(4);
        long jB = qVar.B();
        long jB2 = qVar.B();
        qVar.N(1);
        int iD = d(qVar);
        long j10 = jB2;
        byte[] bArr = new byte[iD];
        qVar.k(bArr, 0, iD);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new d6(strE, bArr, j10, jB > 0 ? jB : -1L);
    }

    public static int d(l1.q qVar) {
        int iZ = qVar.z();
        int i10 = iZ & 127;
        while ((iZ & 128) == 128) {
            iZ = qVar.z();
            i10 = (i10 << 7) | (iZ & 127);
        }
        return i10;
    }

    public static int e(int i10) {
        return (i10 >> 24) & 255;
    }

    public static c0 f(m1.c cVar) {
        m1.a aVar;
        m1.d dVarH = cVar.h(1751411826);
        m1.d dVarH2 = cVar.h(1801812339);
        m1.d dVarH3 = cVar.h(1768715124);
        if (dVarH != null && dVarH2 != null && dVarH3 != null) {
            l1.q qVar = dVarH.f45776c;
            qVar.M(16);
            if (qVar.m() == 1835299937) {
                l1.q qVar2 = dVarH2.f45776c;
                qVar2.M(12);
                int iM = qVar2.m();
                String[] strArr = new String[iM];
                for (int i10 = 0; i10 < iM; i10++) {
                    int iM2 = qVar2.m();
                    qVar2.N(4);
                    strArr[i10] = qVar2.x(iM2 - 8, StandardCharsets.UTF_8);
                }
                l1.q qVar3 = dVarH3.f45776c;
                qVar3.M(8);
                ArrayList arrayList = new ArrayList();
                while (qVar3.a() > 8) {
                    int i11 = qVar3.f44814b;
                    int iM3 = qVar3.m();
                    int iM4 = qVar3.m() - 1;
                    if (iM4 < 0 || iM4 >= iM) {
                        u.v(iM4, "Skipped metadata with unknown key index: ", "BoxParsers");
                    } else {
                        String str = strArr[iM4];
                        int i12 = i11 + iM3;
                        while (true) {
                            int i13 = qVar3.f44814b;
                            if (i13 >= i12) {
                                aVar = null;
                                break;
                            }
                            int iM5 = qVar3.m();
                            if (qVar3.m() == 1684108385) {
                                int iM6 = qVar3.m();
                                int iM7 = qVar3.m();
                                int i14 = iM5 - 16;
                                byte[] bArr = new byte[i14];
                                qVar3.k(bArr, 0, i14);
                                aVar = new m1.a(bArr, iM7, iM6, str);
                                break;
                            }
                            qVar3.M(i13 + iM5);
                        }
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                    }
                    qVar3.M(i11 + iM3);
                }
                if (!arrayList.isEmpty()) {
                    return new c0(arrayList);
                }
            }
        }
        return null;
    }

    public static m1.f g(l1.q qVar) {
        long jT;
        long jT2;
        qVar.M(8);
        if (e(qVar.m()) == 0) {
            jT = qVar.B();
            jT2 = qVar.B();
        } else {
            jT = qVar.t();
            jT2 = qVar.t();
        }
        return new m1.f(jT, jT2, qVar.B());
    }

    public static Pair h(l1.q qVar, int i10, int i11) throws e0 {
        q qVar2;
        Pair pairCreate;
        int i12;
        int i13;
        int i14 = qVar.f44814b;
        while (i14 - i10 < i11) {
            qVar.M(i14);
            int iM = qVar.m();
            n2.b.e("childAtomSize must be positive", iM > 0);
            if (qVar.m() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = 0;
                int i17 = -1;
                Integer numValueOf = null;
                String strX = null;
                while (i15 - i14 < iM) {
                    qVar.M(i15);
                    int iM2 = qVar.m();
                    int iM3 = qVar.m();
                    if (iM3 == 1718775137) {
                        numValueOf = Integer.valueOf(qVar.m());
                    } else if (iM3 == 1935894637) {
                        qVar.N(4);
                        strX = qVar.x(4, StandardCharsets.UTF_8);
                    } else if (iM3 == 1935894633) {
                        i17 = i15;
                        i16 = iM2;
                    }
                    i15 += iM2;
                }
                byte[] bArr = null;
                if (C.CENC_TYPE_cenc.equals(strX) || C.CENC_TYPE_cbc1.equals(strX) || C.CENC_TYPE_cens.equals(strX) || C.CENC_TYPE_cbcs.equals(strX)) {
                    n2.b.e("frma atom is mandatory", numValueOf != null);
                    n2.b.e("schi atom is mandatory", i17 != -1);
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 >= i16) {
                            qVar2 = null;
                            break;
                        }
                        qVar.M(i18);
                        int iM4 = qVar.m();
                        if (qVar.m() == 1952804451) {
                            int iE = e(qVar.m());
                            qVar.N(1);
                            if (iE == 0) {
                                qVar.N(1);
                                i13 = 0;
                                i12 = 0;
                            } else {
                                int iZ = qVar.z();
                                i12 = iZ & 15;
                                i13 = (iZ & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                            }
                            boolean z10 = qVar.z() == 1;
                            int iZ2 = qVar.z();
                            byte[] bArr2 = new byte[16];
                            qVar.k(bArr2, 0, 16);
                            if (z10 && iZ2 == 0) {
                                int iZ3 = qVar.z();
                                byte[] bArr3 = new byte[iZ3];
                                qVar.k(bArr3, 0, iZ3);
                                bArr = bArr3;
                            }
                            qVar2 = new q(z10, strX, iZ2, bArr2, i13, i12, bArr);
                            break;
                        }
                        i18 += iM4;
                    }
                    n2.b.e("tenc atom is mandatory", qVar2 != null);
                    String str = y.f44830a;
                    pairCreate = Pair.create(numValueOf, qVar2);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i14 += iM;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:371:0x0805  */
    /* JADX WARN: Code duplicated, block: B:373:0x0825  */
    /* JADX WARN: Code duplicated, block: B:375:0x082b  */
    /* JADX WARN: Code duplicated, block: B:376:0x083a  */
    /* JADX WARN: Code duplicated, block: B:381:0x085c  */
    /* JADX WARN: Code duplicated, block: B:383:0x086a  */
    /* JADX WARN: Code duplicated, block: B:384:0x0879  */
    /* JADX WARN: Code duplicated, block: B:386:0x087f  */
    /* JADX WARN: Code duplicated, block: B:387:0x088e  */
    /* JADX WARN: Code duplicated, block: B:389:0x0894  */
    /* JADX WARN: Code duplicated, block: B:390:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:392:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:394:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:398:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:399:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:402:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:405:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:406:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:408:0x0903  */
    /* JADX WARN: Code duplicated, block: B:413:0x090f  */
    /* JADX WARN: Code duplicated, block: B:416:0x091c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:420:0x0924  */
    /* JADX WARN: Code duplicated, block: B:423:0x092c  */
    /* JADX WARN: Code duplicated, block: B:426:0x0933  */
    /* JADX WARN: Code duplicated, block: B:428:0x0944 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:432:0x094c  */
    /* JADX WARN: Code duplicated, block: B:435:0x0958  */
    /* JADX WARN: Code duplicated, block: B:436:0x095b  */
    /* JADX WARN: Code duplicated, block: B:438:0x096a  */
    /* JADX WARN: Code duplicated, block: B:597:0x08bd A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:371:0x0805, please report this as an issue */
    public static k3 i(l1.q qVar, p1 p1Var, String str, i1.m mVar, boolean z10) throws e0 {
        int i10;
        i1.m mVar2;
        String str2;
        int i11;
        int i12;
        int i13;
        char c4;
        char c5;
        String str3;
        String str4;
        String str5;
        int i14;
        int i15;
        k5.g gVar;
        int i16;
        byte[] bArrCopyOfRange;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean zH;
        int i21;
        int i22;
        int i23;
        int i24;
        char c10;
        int i25;
        boolean zH2;
        int i26;
        int i27;
        boolean z11;
        int i28;
        int iG;
        i1.h hVar;
        int i29;
        int i30;
        i1.h hVar2;
        int i31;
        int i32;
        n5.f fVar;
        i1.m mVarA;
        int i33;
        int i34;
        String str6;
        n1 n1VarB;
        long j10;
        l1.q qVar2 = qVar;
        p1 p1Var2 = p1Var;
        String str7 = str;
        int i35 = p1Var2.f4883a;
        qVar2.M(12);
        int iM = qVar2.m();
        k3 k3Var = new k3(iM, 4);
        int i36 = 0;
        while (i36 < iM) {
            int i37 = qVar2.f44814b;
            int iM2 = qVar2.m();
            String str8 = "childAtomSize must be positive";
            n2.b.e("childAtomSize must be positive", iM2 > 0);
            int iM3 = qVar2.m();
            int i38 = 8;
            byte b10 = 3;
            if (iM3 == 1635148593 || iM3 == 1635148595 || iM3 == 1701733238 || iM3 == 1831958048 || iM3 == 1836070006 || iM3 == 1752589105 || iM3 == 1751479857 || iM3 == 1932670515 || iM3 == 1211250227 || iM3 == 1748121139 || iM3 == 1987063864 || iM3 == 1987063865 || iM3 == 1635135537 || iM3 == 1685479798 || iM3 == 1685479729 || iM3 == 1685481573 || iM3 == 1685481521 || iM3 == 1634760241) {
                int i39 = p1Var2.f4885c;
                qVar2.M(i37 + 16);
                qVar2.N(16);
                int iG2 = qVar2.G();
                int iG3 = qVar2.G();
                qVar2.N(50);
                int i40 = qVar2.f44814b;
                i10 = i36;
                if (iM3 == 1701733238) {
                    Pair pairH = h(qVar2, i37, iM2);
                    if (pairH != null) {
                        iM3 = ((Integer) pairH.first).intValue();
                        mVarA = mVar == null ? null : mVar.a(((q) pairH.second).f42193b);
                        ((q[]) k3Var.f16295c)[i10] = (q) pairH.second;
                    } else {
                        i37 = i37;
                        mVarA = mVar;
                    }
                    qVar2.M(i40);
                    mVar2 = mVarA;
                } else {
                    i37 = i37;
                    mVar2 = mVar;
                }
                if (iM3 == 1831958048) {
                    str2 = MimeTypes.VIDEO_MPEG;
                } else {
                    str2 = iM3 == 1211250227 ? MimeTypes.VIDEO_H263 : null;
                }
                i1.m mVar3 = mVar2;
                i11 = i35;
                i12 = iM;
                int i41 = 8;
                int i42 = 8;
                String str9 = str2;
                float fD = 1.0f;
                int i43 = -1;
                int i44 = -1;
                int iF = -1;
                List listB = null;
                k5.g gVar2 = null;
                ByteBuffer byteBufferOrder = null;
                String string = null;
                boolean z12 = false;
                int i45 = -1;
                int i46 = -1;
                byte[] bArr = null;
                int i47 = -1;
                int i48 = -1;
                hn.u uVarB = null;
                e1 e1Var = null;
                d6 d6Var = null;
                int i49 = i40;
                int iG4 = -1;
                while (i49 - i37 < iM2) {
                    qVar2.M(i49);
                    int i50 = qVar2.f44814b;
                    int i51 = i49;
                    int iM4 = qVar2.m();
                    if (iM4 == 0 && qVar2.f44814b - i37 == iM2) {
                        break;
                    }
                    n2.b.e(str8, iM4 > 0);
                    int iM5 = qVar2.m();
                    int i52 = iM2;
                    if (iM5 == 1635148611) {
                        n2.b.e(null, str9 == null);
                        qVar2.M(i50 + 8);
                        z1 z1VarA = z1.a(qVar2);
                        listB = z1VarA.f22446a;
                        k3Var.f16293a = z1VarA.f22447b;
                        float f10 = !z12 ? z1VarA.f22456k : fD;
                        String str10 = z1VarA.l;
                        int i53 = z1VarA.f22455j;
                        iF = z1VarA.f22452g;
                        int i54 = z1VarA.f22453h;
                        iG4 = z1VarA.f22454i;
                        int i55 = z1VarA.f22450e;
                        i41 = z1VarA.f22451f;
                        i46 = i53;
                        i14 = iM3;
                        i15 = i43;
                        str8 = str8;
                        i44 = i54;
                        k3Var = k3Var;
                        fD = f10;
                        i16 = i38;
                        b10 = b10;
                        str9 = "video/avc";
                        string = str10;
                        i42 = i55;
                    } else {
                        i14 = iM3;
                        if (iM5 == 1752589123) {
                            n2.b.e(null, str9 == null);
                            qVar2.M(i50 + 8);
                            w2 w2VarA = w2.a(qVar2, false, null);
                            listB = w2VarA.f21376a;
                            k3Var.f16293a = w2VarA.f21377b;
                            float f11 = !z12 ? w2VarA.l : fD;
                            int i56 = w2VarA.f21387m;
                            int i57 = w2VarA.f21378c;
                            String str11 = w2VarA.f21388n;
                            int i58 = w2VarA.f21386k;
                            if (i58 != -1) {
                                i43 = i58;
                            }
                            int i59 = w2VarA.f21379d;
                            int i60 = w2VarA.f21380e;
                            iF = w2VarA.f21383h;
                            int i61 = w2VarA.f21384i;
                            int i62 = w2VarA.f21385j;
                            int i63 = w2VarA.f21381f;
                            i41 = w2VarA.f21382g;
                            i46 = i56;
                            i42 = i63;
                            str9 = "video/hevc";
                            str8 = str8;
                            k3Var = k3Var;
                            fD = f11;
                            i48 = i59;
                            i44 = i61;
                            i47 = i60;
                            i16 = i38;
                            iG4 = i62;
                            gVar2 = (k5.g) w2VarA.f21389o;
                            i15 = i43;
                            b10 = b10;
                            i45 = i57;
                            string = str11;
                        } else {
                            int i64 = i43;
                            if (iM5 == 1818785347) {
                                n2.b.e("lhvC must follow hvcC atom", "video/hevc".equals(str9));
                                n2.b.e("must have at least two layers", gVar2 != null && ((j0) gVar2.f44325a).size() >= 2);
                                qVar2.M(i50 + 8);
                                gVar2.getClass();
                                w2 w2VarA2 = w2.a(qVar2, true, gVar2);
                                n2.b.e("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", k3Var.f16293a == w2VarA2.f21377b);
                                int i65 = w2VarA2.f21383h;
                                if (i65 != -1) {
                                    n2.b.e("colorSpace must be the same for both views", iF == i65);
                                }
                                int i66 = w2VarA2.f21384i;
                                if (i66 != -1) {
                                    n2.b.e("colorRange must be the same for both views", i44 == i66);
                                }
                                int i67 = w2VarA2.f21385j;
                                if (i67 != -1) {
                                    n2.b.e("colorTransfer must be the same for both views", iG4 == i67);
                                }
                                n2.b.e("bitdepthLuma must be the same for both views", i42 == w2VarA2.f21381f);
                                n2.b.e("bitdepthChroma must be the same for both views", i41 == w2VarA2.f21382g);
                                if (listB != null) {
                                    oa.e0 e0VarU = j0.u();
                                    e0VarU.d(listB);
                                    e0VarU.d(w2VarA2.f21376a);
                                    listB = e0VarU.g();
                                } else {
                                    n2.b.e("initializationData must be already set from hvcC atom", false);
                                }
                                string = w2VarA2.f21388n;
                                str9 = "video/mv-hevc";
                                k3Var = k3Var;
                                i44 = i44;
                                i16 = i38;
                                b10 = b10;
                                i15 = i64;
                                str8 = str8;
                            } else {
                                if (iM5 == 1986361461) {
                                    qVar2.M(i50 + 8);
                                    int i68 = qVar2.f44814b;
                                    n5.f fVar2 = null;
                                    while (i68 - i50 < iM4) {
                                        qVar2.M(i68);
                                        int iM6 = qVar2.m();
                                        n2.b.e(str8, iM6 > 0);
                                        int i69 = i41;
                                        if (qVar2.m() == 1702454643) {
                                            qVar2.M(i68 + 8);
                                            int i70 = qVar2.f44814b;
                                            while (true) {
                                                if (i70 - i68 >= iM6) {
                                                    fVar = null;
                                                    break;
                                                }
                                                qVar2.M(i70);
                                                int iM7 = qVar2.m();
                                                n2.b.e(str8, iM7 > 0);
                                                int i71 = i70;
                                                if (qVar2.m() == 1937011305) {
                                                    qVar2.N(4);
                                                    int iZ = qVar2.z();
                                                    fVar = new n5.f(new f6((iZ & 1) == 1, (iZ & 2) == 2, (iZ & 8) == i38), 14);
                                                    break;
                                                }
                                                i70 = i71 + iM7;
                                                i38 = 8;
                                            }
                                            fVar2 = fVar;
                                        } else {
                                            i42 = i42;
                                            i68 = i68;
                                            iM6 = iM6;
                                        }
                                        i68 += iM6;
                                        i41 = i69;
                                        i42 = i42;
                                        i38 = 8;
                                    }
                                    int i72 = i41;
                                    int i73 = i42;
                                    am.e eVar = fVar2 == null ? null : new am.e(fVar2, 8);
                                    if (eVar != null) {
                                        f6 f6Var = (f6) ((n5.f) eVar.f3698b).f46523b;
                                        boolean z13 = f6Var.f14260c;
                                        if (gVar2 == null || ((j0) gVar2.f44325a).size() < 2) {
                                            i31 = i64;
                                            if (i31 == -1) {
                                                i32 = z13 ? 5 : 4;
                                            } else {
                                                i32 = i31;
                                            }
                                        } else {
                                            n2.b.e("both eye views must be marked as available", f6Var.f14258a && f6Var.f14259b);
                                            n2.b.e("for MV-HEVC, eye_views_reversed must be set to false", !z13);
                                            i31 = i64;
                                            i32 = i31;
                                        }
                                    } else {
                                        i31 = i64;
                                        i32 = i31;
                                    }
                                    i15 = i32;
                                    str9 = str9;
                                    i44 = i44;
                                    i41 = i72;
                                    i42 = i73;
                                } else {
                                    i41 = i41;
                                    i42 = i42;
                                    i15 = i64;
                                    if (iM5 == 1685480259 || iM5 == 1685485123 || iM5 == 1685485379) {
                                        str8 = str8;
                                        str9 = str9;
                                        k3Var = k3Var;
                                        i44 = i44;
                                        gVar = gVar2;
                                        b10 = b10;
                                        i16 = 8;
                                        uVarB = hn.u.b(qVar2);
                                    } else {
                                        int i74 = 6;
                                        if (iM5 == 1987076931) {
                                            n2.b.e(null, str9 == null);
                                            String str12 = i14 == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                                            qVar2.M(i50 + 12);
                                            byte bZ = (byte) qVar2.z();
                                            byte bZ2 = (byte) qVar2.z();
                                            int iZ2 = qVar2.z();
                                            int i75 = iZ2 >> 4;
                                            byte b11 = (byte) ((iZ2 >> 1) & 7);
                                            if (str12.equals(MimeTypes.VIDEO_VP9)) {
                                                byte[] bArr2 = l1.c.f44778a;
                                                byte[] bArr3 = new byte[12];
                                                bArr3[0] = 1;
                                                bArr3[1] = 1;
                                                bArr3[2] = bZ;
                                                bArr3[b10] = 2;
                                                bArr3[4] = 1;
                                                bArr3[5] = bZ2;
                                                bArr3[6] = b10;
                                                bArr3[7] = 1;
                                                bArr3[8] = (byte) i75;
                                                bArr3[9] = 4;
                                                bArr3[10] = 1;
                                                bArr3[11] = b11;
                                                listB = j0.B(bArr3);
                                            }
                                            boolean z14 = (iZ2 & 1) != 0;
                                            int iZ3 = qVar2.z();
                                            int iZ4 = qVar2.z();
                                            iF = i1.h.f(iZ3);
                                            int i76 = z14 ? 1 : 2;
                                            iG4 = i1.h.g(iZ4);
                                            i15 = i15;
                                            i14 = i14;
                                            i41 = i75;
                                            i42 = i41;
                                            str9 = str12;
                                            i44 = i76;
                                        } else {
                                            int i77 = 7;
                                            int i78 = 11;
                                            if (iM5 == 1635135811) {
                                                int i79 = iM4 - 8;
                                                byte[] bArr4 = new byte[i79];
                                                qVar2.k(bArr4, 0, i79);
                                                listB = j0.B(bArr4);
                                                qVar2.M(i50 + 8);
                                                byte[] bArr5 = qVar2.f44813a;
                                                xd1 xd1Var = new xd1(bArr5, bArr5.length);
                                                xd1Var.q(qVar2.f44814b * 8);
                                                xd1Var.u(1);
                                                int i80 = xd1Var.i(b10);
                                                xd1Var.t(6);
                                                boolean zH3 = xd1Var.h();
                                                boolean zH4 = xd1Var.h();
                                                int i81 = -1;
                                                if (i80 == 2 && zH3) {
                                                    int i82 = zH4 ? 12 : 10;
                                                    i19 = zH4 ? 12 : 10;
                                                    i17 = i82;
                                                } else {
                                                    if (i80 <= 2) {
                                                        int i83 = zH3 ? 10 : 8;
                                                        i19 = zH3 ? 10 : 8;
                                                        i17 = i83;
                                                    } else {
                                                        i17 = -1;
                                                        i18 = -1;
                                                    }
                                                    xd1Var.t(13);
                                                    xd1Var.s();
                                                    i20 = xd1Var.i(4);
                                                    if (i20 != 1) {
                                                        l1.a.j("BoxParsers", "Unsupported obu_type: " + i20);
                                                        hVar2 = new i1.h(-1, -1, -1, i17, i18, null);
                                                    } else if (xd1Var.h()) {
                                                        l1.a.j("BoxParsers", "Unsupported obu_extension_flag");
                                                        hVar2 = new i1.h(-1, -1, -1, i17, i18, null);
                                                    } else {
                                                        zH = xd1Var.h();
                                                        xd1Var.s();
                                                        if (zH || xd1Var.i(8) <= 127) {
                                                            i21 = xd1Var.i(3);
                                                            xd1Var.s();
                                                            if (xd1Var.h()) {
                                                                l1.a.j("BoxParsers", "Unsupported reduced_still_picture_header");
                                                                hVar2 = new i1.h(-1, -1, -1, i17, i18, null);
                                                            } else if (xd1Var.h()) {
                                                                l1.a.j("BoxParsers", "Unsupported timing_info_present_flag");
                                                                hVar2 = new i1.h(-1, -1, -1, i17, i18, null);
                                                            } else {
                                                                if (xd1Var.h()) {
                                                                    l1.a.j("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                                    hVar2 = new i1.h(-1, -1, -1, i17, i18, null);
                                                                } else {
                                                                    i22 = 5;
                                                                    i23 = xd1Var.i(5);
                                                                    i24 = 0;
                                                                    while (i24 <= i23) {
                                                                        xd1Var.t(12);
                                                                        if (xd1Var.i(i22) > i77) {
                                                                            xd1Var.s();
                                                                        }
                                                                        i24++;
                                                                        i22 = 5;
                                                                        i77 = 7;
                                                                    }
                                                                    c10 = '\f';
                                                                    int i84 = xd1Var.i(4);
                                                                    int i85 = xd1Var.i(4);
                                                                    xd1Var.t(i84 + 1);
                                                                    xd1Var.t(i85 + 1);
                                                                    if (xd1Var.h()) {
                                                                        i25 = 7;
                                                                        xd1Var.t(7);
                                                                    } else {
                                                                        i25 = 7;
                                                                    }
                                                                    xd1Var.t(i25);
                                                                    zH2 = xd1Var.h();
                                                                    if (zH2) {
                                                                        xd1Var.t(2);
                                                                    }
                                                                    if (xd1Var.h()) {
                                                                        i26 = 1;
                                                                        i27 = 2;
                                                                    } else {
                                                                        i26 = 1;
                                                                        i27 = xd1Var.i(1);
                                                                    }
                                                                    if (i27 > 0 && !xd1Var.h()) {
                                                                        xd1Var.t(i26);
                                                                    }
                                                                    if (zH2) {
                                                                        xd1Var.t(3);
                                                                    }
                                                                    xd1Var.t(3);
                                                                    boolean zH5 = xd1Var.h();
                                                                    if (i21 == 2 && zH5) {
                                                                        xd1Var.s();
                                                                    }
                                                                    if (i21 == 1 && xd1Var.h()) {
                                                                        z11 = true;
                                                                    } else {
                                                                        z11 = false;
                                                                    }
                                                                    if (xd1Var.h()) {
                                                                        int i86 = xd1Var.i(8);
                                                                        int i87 = xd1Var.i(8);
                                                                        int i88 = xd1Var.i(8);
                                                                        if (z11 && i86 == 1 && i87 == 13 && i88 == 0) {
                                                                            i29 = 1;
                                                                        } else {
                                                                            i29 = xd1Var.i(1);
                                                                        }
                                                                        int iF2 = i1.h.f(i86);
                                                                        if (i29 == 1) {
                                                                            i30 = 1;
                                                                        } else {
                                                                            i30 = 2;
                                                                        }
                                                                        i28 = iF2;
                                                                        iG = i1.h.g(i87);
                                                                        i81 = i30;
                                                                    } else {
                                                                        i28 = -1;
                                                                        iG = -1;
                                                                    }
                                                                    hVar = new i1.h(i28, i81, iG, i17, i18, null);
                                                                }
                                                                int i89 = hVar.f42552e;
                                                                int i90 = hVar.f42553f;
                                                                iF = hVar.f42548a;
                                                                int i91 = hVar.f42549b;
                                                                iG4 = hVar.f42550c;
                                                                str9 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                                                i42 = i89;
                                                                str8 = str8;
                                                                k3Var = k3Var;
                                                                i44 = i91;
                                                                i16 = 8;
                                                                i15 = i15;
                                                                i41 = i90;
                                                                b10 = 3;
                                                            }
                                                        } else {
                                                            l1.a.j("BoxParsers", "Excessive obu_size");
                                                            hVar2 = new i1.h(-1, -1, -1, i17, i18, null);
                                                        }
                                                    }
                                                    hVar = hVar2;
                                                    c10 = '\f';
                                                    int i810 = hVar.f42552e;
                                                    int i92 = hVar.f42553f;
                                                    iF = hVar.f42548a;
                                                    int i93 = hVar.f42549b;
                                                    iG4 = hVar.f42550c;
                                                    str9 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                                    i42 = i810;
                                                    str8 = str8;
                                                    k3Var = k3Var;
                                                    i44 = i93;
                                                    i16 = 8;
                                                    i15 = i15;
                                                    i41 = i92;
                                                    b10 = 3;
                                                }
                                                i18 = i19;
                                                xd1Var.t(13);
                                                xd1Var.s();
                                                i20 = xd1Var.i(4);
                                                if (i20 != 1) {
                                                    l1.a.j("BoxParsers", "Unsupported obu_type: " + i20);
                                                    hVar2 = new i1.h(-1, -1, -1, i17, i18, null);
                                                } else if (xd1Var.h()) {
                                                    l1.a.j("BoxParsers", "Unsupported obu_extension_flag");
                                                    hVar2 = new i1.h(-1, -1, -1, i17, i18, null);
                                                } else {
                                                    zH = xd1Var.h();
                                                    xd1Var.s();
                                                    if (zH) {
                                                        i21 = xd1Var.i(3);
                                                        xd1Var.s();
                                                        if (xd1Var.h()) {
                                                            l1.a.j("BoxParsers", "Unsupported reduced_still_picture_header");
                                                            hVar2 = new i1.h(-1, -1, -1, i17, i18, null);
                                                        } else if (xd1Var.h()) {
                                                            l1.a.j("BoxParsers", "Unsupported timing_info_present_flag");
                                                            hVar2 = new i1.h(-1, -1, -1, i17, i18, null);
                                                        } else if (xd1Var.h()) {
                                                            l1.a.j("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                            hVar2 = new i1.h(-1, -1, -1, i17, i18, null);
                                                        } else {
                                                            i22 = 5;
                                                            i23 = xd1Var.i(5);
                                                            i24 = 0;
                                                            while (i24 <= i23) {
                                                                xd1Var.t(12);
                                                                if (xd1Var.i(i22) > i77) {
                                                                    xd1Var.s();
                                                                }
                                                                i24++;
                                                                i22 = 5;
                                                                i77 = 7;
                                                            }
                                                            c10 = '\f';
                                                            int i811 = xd1Var.i(4);
                                                            int i812 = xd1Var.i(4);
                                                            xd1Var.t(i811 + 1);
                                                            xd1Var.t(i812 + 1);
                                                            if (xd1Var.h()) {
                                                                i25 = 7;
                                                                xd1Var.t(7);
                                                            } else {
                                                                i25 = 7;
                                                            }
                                                            xd1Var.t(i25);
                                                            zH2 = xd1Var.h();
                                                            if (zH2) {
                                                                xd1Var.t(2);
                                                            }
                                                            if (xd1Var.h()) {
                                                                i26 = 1;
                                                                i27 = 2;
                                                            } else {
                                                                i26 = 1;
                                                                i27 = xd1Var.i(1);
                                                            }
                                                            if (i27 > 0) {
                                                                xd1Var.t(i26);
                                                            }
                                                            if (zH2) {
                                                                xd1Var.t(3);
                                                            }
                                                            xd1Var.t(3);
                                                            boolean zH6 = xd1Var.h();
                                                            if (i21 == 2) {
                                                                xd1Var.s();
                                                            }
                                                            if (i21 == 1) {
                                                                z11 = false;
                                                            } else {
                                                                z11 = false;
                                                            }
                                                            if (xd1Var.h()) {
                                                                int i813 = xd1Var.i(8);
                                                                int i814 = xd1Var.i(8);
                                                                int i815 = xd1Var.i(8);
                                                                if (z11) {
                                                                    i29 = xd1Var.i(1);
                                                                } else {
                                                                    i29 = xd1Var.i(1);
                                                                }
                                                                int iF3 = i1.h.f(i813);
                                                                if (i29 == 1) {
                                                                    i30 = 1;
                                                                } else {
                                                                    i30 = 2;
                                                                }
                                                                i28 = iF3;
                                                                iG = i1.h.g(i814);
                                                                i81 = i30;
                                                            } else {
                                                                i28 = -1;
                                                                iG = -1;
                                                            }
                                                            hVar = new i1.h(i28, i81, iG, i17, i18, null);
                                                        }
                                                    } else {
                                                        i21 = xd1Var.i(3);
                                                        xd1Var.s();
                                                        if (xd1Var.h()) {
                                                            l1.a.j("BoxParsers", "Unsupported reduced_still_picture_header");
                                                            hVar2 = new i1.h(-1, -1, -1, i17, i18, null);
                                                        } else if (xd1Var.h()) {
                                                            l1.a.j("BoxParsers", "Unsupported timing_info_present_flag");
                                                            hVar2 = new i1.h(-1, -1, -1, i17, i18, null);
                                                        } else if (xd1Var.h()) {
                                                            l1.a.j("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                            hVar2 = new i1.h(-1, -1, -1, i17, i18, null);
                                                        } else {
                                                            i22 = 5;
                                                            i23 = xd1Var.i(5);
                                                            i24 = 0;
                                                            while (i24 <= i23) {
                                                                xd1Var.t(12);
                                                                if (xd1Var.i(i22) > i77) {
                                                                    xd1Var.s();
                                                                }
                                                                i24++;
                                                                i22 = 5;
                                                                i77 = 7;
                                                            }
                                                            c10 = '\f';
                                                            int i816 = xd1Var.i(4);
                                                            int i817 = xd1Var.i(4);
                                                            xd1Var.t(i816 + 1);
                                                            xd1Var.t(i817 + 1);
                                                            if (xd1Var.h()) {
                                                                i25 = 7;
                                                                xd1Var.t(7);
                                                            } else {
                                                                i25 = 7;
                                                            }
                                                            xd1Var.t(i25);
                                                            zH2 = xd1Var.h();
                                                            if (zH2) {
                                                                xd1Var.t(2);
                                                            }
                                                            if (xd1Var.h()) {
                                                                i26 = 1;
                                                                i27 = 2;
                                                            } else {
                                                                i26 = 1;
                                                                i27 = xd1Var.i(1);
                                                            }
                                                            if (i27 > 0) {
                                                                xd1Var.t(i26);
                                                            }
                                                            if (zH2) {
                                                                xd1Var.t(3);
                                                            }
                                                            xd1Var.t(3);
                                                            boolean zH7 = xd1Var.h();
                                                            if (i21 == 2) {
                                                                xd1Var.s();
                                                            }
                                                            if (i21 == 1) {
                                                                z11 = false;
                                                            } else {
                                                                z11 = false;
                                                            }
                                                            if (xd1Var.h()) {
                                                                int i818 = xd1Var.i(8);
                                                                int i819 = xd1Var.i(8);
                                                                int i8110 = xd1Var.i(8);
                                                                if (z11) {
                                                                    i29 = xd1Var.i(1);
                                                                } else {
                                                                    i29 = xd1Var.i(1);
                                                                }
                                                                int iF4 = i1.h.f(i818);
                                                                if (i29 == 1) {
                                                                    i30 = 1;
                                                                } else {
                                                                    i30 = 2;
                                                                }
                                                                i28 = iF4;
                                                                iG = i1.h.g(i819);
                                                                i81 = i30;
                                                            } else {
                                                                i28 = -1;
                                                                iG = -1;
                                                            }
                                                            hVar = new i1.h(i28, i81, iG, i17, i18, null);
                                                        }
                                                    }
                                                    int i8111 = hVar.f42552e;
                                                    int i94 = hVar.f42553f;
                                                    iF = hVar.f42548a;
                                                    int i95 = hVar.f42549b;
                                                    iG4 = hVar.f42550c;
                                                    str9 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                                    i42 = i8111;
                                                    str8 = str8;
                                                    k3Var = k3Var;
                                                    i44 = i95;
                                                    i16 = 8;
                                                    i15 = i15;
                                                    i41 = i94;
                                                    b10 = 3;
                                                }
                                                hVar = hVar2;
                                                c10 = '\f';
                                                int i8112 = hVar.f42552e;
                                                int i96 = hVar.f42553f;
                                                iF = hVar.f42548a;
                                                int i97 = hVar.f42549b;
                                                iG4 = hVar.f42550c;
                                                str9 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                                i42 = i8112;
                                                str8 = str8;
                                                k3Var = k3Var;
                                                i44 = i97;
                                                i16 = 8;
                                                i15 = i15;
                                                i41 = i96;
                                                b10 = 3;
                                            } else {
                                                if (iM5 == 1668050025) {
                                                    if (byteBufferOrder == null) {
                                                        byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                    }
                                                    ByteBuffer byteBuffer = byteBufferOrder;
                                                    byteBuffer.position(21);
                                                    byteBuffer.putShort(qVar2.w());
                                                    byteBuffer.putShort(qVar2.w());
                                                    byteBufferOrder = byteBuffer;
                                                } else if (iM5 == 1835295606) {
                                                    if (byteBufferOrder == null) {
                                                        byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                    }
                                                    ByteBuffer byteBuffer2 = byteBufferOrder;
                                                    short sW = qVar2.w();
                                                    short sW2 = qVar2.w();
                                                    short sW3 = qVar2.w();
                                                    short sW4 = qVar2.w();
                                                    short sW5 = qVar2.w();
                                                    short sW6 = qVar2.w();
                                                    short sW7 = qVar2.w();
                                                    k5.g gVar3 = gVar2;
                                                    short sW8 = qVar2.w();
                                                    long jB = qVar2.B();
                                                    long jB2 = qVar2.B();
                                                    byteBuffer2.position(1);
                                                    byteBuffer2.putShort(sW5);
                                                    byteBuffer2.putShort(sW6);
                                                    byteBuffer2.putShort(sW);
                                                    byteBuffer2.putShort(sW2);
                                                    byteBuffer2.putShort(sW3);
                                                    byteBuffer2.putShort(sW4);
                                                    byteBuffer2.putShort(sW7);
                                                    byteBuffer2.putShort(sW8);
                                                    byteBuffer2.putShort((short) (jB / Xa.f27908s));
                                                    byteBuffer2.putShort((short) (jB2 / Xa.f27908s));
                                                    byteBufferOrder = byteBuffer2;
                                                    gVar2 = gVar3;
                                                } else {
                                                    str8 = str8;
                                                    str9 = str9;
                                                    k3Var = k3Var;
                                                    i44 = i44;
                                                    gVar = gVar2;
                                                    if (iM5 == 1681012275) {
                                                        n2.b.e(null, str9 == null);
                                                        i15 = i15;
                                                        str9 = MimeTypes.VIDEO_H263;
                                                        i41 = i41;
                                                        i42 = i42;
                                                        gVar2 = gVar;
                                                        b10 = 3;
                                                    } else if (iM5 == 1702061171) {
                                                        n2.b.e(null, str9 == null);
                                                        d6 d6VarC = c(i50, qVar2);
                                                        String str13 = d6VarC.f13428a;
                                                        byte[] bArr6 = d6VarC.f13429b;
                                                        if (bArr6 != null) {
                                                            listB = j0.B(bArr6);
                                                        }
                                                        d6Var = d6VarC;
                                                        str9 = str13;
                                                        i42 = i42;
                                                        gVar2 = gVar;
                                                        b10 = 3;
                                                        i16 = 8;
                                                        i15 = i15;
                                                        i41 = i41;
                                                    } else {
                                                        if (iM5 == 1651798644) {
                                                            qVar2.M(i50 + 8);
                                                            qVar2.N(4);
                                                            e1Var = new e1(qVar2.B(), qVar2.B());
                                                        } else if (iM5 == 1885434736) {
                                                            qVar2.M(i50 + 8);
                                                            i15 = i15;
                                                            fD = qVar2.D() / qVar2.D();
                                                            i41 = i41;
                                                            i42 = i42;
                                                            gVar2 = gVar;
                                                            b10 = 3;
                                                            i16 = 8;
                                                            z12 = true;
                                                        } else if (iM5 == 1937126244) {
                                                            int i98 = i50 + 8;
                                                            while (true) {
                                                                if (i98 - i50 >= iM4) {
                                                                    bArrCopyOfRange = null;
                                                                    break;
                                                                }
                                                                qVar2.M(i98);
                                                                int iM8 = qVar2.m();
                                                                if (qVar2.m() == 1886547818) {
                                                                    bArrCopyOfRange = Arrays.copyOfRange(qVar2.f44813a, i98, iM8 + i98);
                                                                    break;
                                                                }
                                                                i98 += iM8;
                                                            }
                                                            bArr = bArrCopyOfRange;
                                                        } else if (iM5 == 1936995172) {
                                                            int iZ5 = qVar2.z();
                                                            b10 = 3;
                                                            qVar2.N(3);
                                                            if (iZ5 == 0) {
                                                                int iZ6 = qVar2.z();
                                                                if (iZ6 == 0) {
                                                                    i15 = 0;
                                                                } else if (iZ6 == 1) {
                                                                    i15 = 1;
                                                                } else if (iZ6 == 2) {
                                                                    i15 = 2;
                                                                } else if (iZ6 == 3) {
                                                                    i15 = 3;
                                                                }
                                                            }
                                                            i15 = i15;
                                                            i41 = i41;
                                                            i42 = i42;
                                                            gVar2 = gVar;
                                                        } else {
                                                            b10 = 3;
                                                            if (iM5 == 1634760259) {
                                                                int i99 = iM4 - 12;
                                                                byte[] bArr7 = new byte[i99];
                                                                qVar2.M(i50 + 12);
                                                                qVar2.k(bArr7, 0, i99);
                                                                byte[] bArr8 = l1.c.f44778a;
                                                                go.k.e(i99, "Invalid APV CSD length: %s", i99 >= 17);
                                                                byte b12 = bArr7[0];
                                                                go.k.e(b12, "Invalid APV CSD version: %s", b12 == 1);
                                                                byte b13 = bArr7[5];
                                                                byte b14 = bArr7[6];
                                                                byte b15 = bArr7[7];
                                                                String str14 = y.f44830a;
                                                                Locale locale = Locale.US;
                                                                StringBuilder sbL = l1.d.l("apv1.apvf", b13, ".apvl", b14, ".apvb");
                                                                sbL.append((int) b15);
                                                                string = sbL.toString();
                                                                listB = j0.B(bArr7);
                                                                l1.q qVar3 = new l1.q(bArr7);
                                                                xd1 xd1Var2 = new xd1(bArr7, i99);
                                                                i16 = 8;
                                                                xd1Var2.q(qVar3.f44814b * 8);
                                                                xd1Var2.u(1);
                                                                int i100 = xd1Var2.i(8);
                                                                int i101 = 0;
                                                                int i102 = -1;
                                                                int i103 = -1;
                                                                int i104 = -1;
                                                                int i105 = -1;
                                                                int i106 = -1;
                                                                while (i101 < i100) {
                                                                    xd1Var2.u(1);
                                                                    int i107 = xd1Var2.i(8);
                                                                    int iG5 = i106;
                                                                    int i108 = i105;
                                                                    int i109 = i104;
                                                                    int i110 = i103;
                                                                    int i111 = i102;
                                                                    int i112 = 0;
                                                                    while (i112 < i107) {
                                                                        xd1Var2.t(i74);
                                                                        boolean zH8 = xd1Var2.h();
                                                                        xd1Var2.s();
                                                                        xd1Var2.u(i78);
                                                                        xd1Var2.t(4);
                                                                        i110 = xd1Var2.i(4) + 8;
                                                                        xd1Var2.u(1);
                                                                        if (zH8) {
                                                                            int i113 = xd1Var2.i(8);
                                                                            int i114 = xd1Var2.i(8);
                                                                            xd1Var2.u(1);
                                                                            boolean zH9 = xd1Var2.h();
                                                                            int iF5 = i1.h.f(i113);
                                                                            int i115 = zH9 ? 1 : 2;
                                                                            iG5 = i1.h.g(i114);
                                                                            i109 = i115;
                                                                            i108 = iF5;
                                                                        }
                                                                        i112++;
                                                                        i111 = i110;
                                                                        i74 = 6;
                                                                        i78 = 11;
                                                                    }
                                                                    i101++;
                                                                    i102 = i111;
                                                                    i103 = i110;
                                                                    i104 = i109;
                                                                    i105 = i108;
                                                                    i106 = iG5;
                                                                    i74 = 6;
                                                                    i78 = 11;
                                                                }
                                                                i15 = i15;
                                                                str9 = "video/apv";
                                                                i41 = i102;
                                                                i42 = i103;
                                                                i44 = i104;
                                                                iF = i105;
                                                                iG4 = i106;
                                                            } else {
                                                                i16 = 8;
                                                                if (iM5 == 1668246642 && iF == -1 && iG4 == -1) {
                                                                    int iM9 = qVar2.m();
                                                                    if (iM9 == 1852009592 || iM9 == 1852009571) {
                                                                        int iG6 = qVar2.G();
                                                                        int iG7 = qVar2.G();
                                                                        qVar2.N(2);
                                                                        boolean z15 = iM4 == 19 && (qVar2.z() & 128) != 0;
                                                                        int iF6 = i1.h.f(iG6);
                                                                        int i116 = z15 ? 1 : 2;
                                                                        iG4 = i1.h.g(iG7);
                                                                        iF = iF6;
                                                                        i44 = i116;
                                                                    } else {
                                                                        l1.a.s("BoxParsers", "Unsupported color type: " + z01.b(iM9));
                                                                    }
                                                                }
                                                            }
                                                            gVar2 = gVar;
                                                        }
                                                        i41 = i41;
                                                        i42 = i42;
                                                        gVar2 = gVar;
                                                        b10 = 3;
                                                    }
                                                    i16 = 8;
                                                }
                                                b10 = 3;
                                                i16 = 8;
                                            }
                                        }
                                    }
                                    i41 = i41;
                                    i42 = i42;
                                    gVar2 = gVar;
                                }
                                i16 = 8;
                            }
                        }
                    }
                    i49 = i51 + iM4;
                    b10 = b10;
                    i38 = i16;
                    iM3 = i14;
                    str8 = str8;
                    str9 = str9;
                    i44 = i44;
                    k3Var = k3Var;
                    i43 = i15;
                    iM2 = i52;
                }
                int i117 = i41;
                int i118 = i42;
                i13 = iM2;
                int i119 = i43;
                String str15 = str9;
                k3 k3Var2 = k3Var;
                int i120 = i44;
                c4 = 4;
                c5 = '\f';
                if (uVarB != null) {
                    str3 = uVarB.f42458b;
                    str4 = "video/dolby-vision";
                } else {
                    str3 = string;
                    str4 = str15;
                }
                if (str4 == null) {
                    str5 = str;
                    k3Var = k3Var2;
                } else {
                    i1.o oVar = new i1.o();
                    oVar.f42589a = Integer.toString(i11);
                    oVar.f42600m = d0.n(str4);
                    oVar.f42598j = str3;
                    oVar.f42607t = iG2;
                    oVar.f42608u = iG3;
                    oVar.f42609v = i48;
                    oVar.f42610w = i47;
                    oVar.f42613z = fD;
                    oVar.f42612y = i39;
                    oVar.A = bArr;
                    oVar.B = i119;
                    oVar.f42603p = listB;
                    oVar.f42602o = i46;
                    oVar.D = i45;
                    oVar.f42604q = mVar3;
                    str5 = str;
                    oVar.f42592d = str5;
                    oVar.C = new i1.h(iF, i120, iG4, i118, i117, byteBufferOrder != null ? byteBufferOrder.array() : null);
                    e1 e1Var2 = e1Var;
                    if (e1Var2 != null) {
                        oVar.f42596h = com.bumptech.glide.c.D(e1Var2.f13801a);
                        oVar.f42597i = com.bumptech.glide.c.D(e1Var2.f13802b);
                    } else {
                        d6 d6Var2 = d6Var;
                        if (d6Var2 != null) {
                            oVar.f42596h = com.bumptech.glide.c.D(d6Var2.f13430c);
                            oVar.f42597i = com.bumptech.glide.c.D(d6Var2.f13431d);
                        }
                    }
                    k3Var = k3Var2;
                    k3Var.f16296d = new i1.p(oVar);
                }
            } else {
                if (iM3 == 1836069985 || iM3 == 1701733217 || iM3 == 1633889587 || iM3 == 1700998451 || iM3 == 1633889588 || iM3 == 1835823201 || iM3 == 1685353315 || iM3 == 1685353317 || iM3 == 1685353320 || iM3 == 1685353324 || iM3 == 1685353336 || iM3 == 1935764850 || iM3 == 1935767394 || iM3 == 1819304813 || iM3 == 1936684916 || iM3 == 1953984371 || iM3 == 778924082 || iM3 == 778924083 || iM3 == 1835557169 || iM3 == 1835560241 || iM3 == 1634492771 || iM3 == 1634492791 || iM3 == 1970037111 || iM3 == 1332770163 || iM3 == 1716281667 || iM3 == 1767992678 || iM3 == 1768973165 || iM3 == 1718641517) {
                    qVar2 = qVar;
                    b(qVar2, iM3, i37, iM2, p1Var2.f4883a, str7, z10, mVar, k3Var, i36);
                    str5 = str;
                    i37 = i37;
                    i13 = iM2;
                } else if (iM3 == 1414810956 || iM3 == 1954034535 || iM3 == 2004251764 || iM3 == 1937010800 || iM3 == 1664495672 || iM3 == 1836070003) {
                    qVar2.M(i37 + 16);
                    String str16 = MimeTypes.APPLICATION_TTML;
                    long j11 = Long.MAX_VALUE;
                    if (iM3 != 1414810956) {
                        if (iM3 == 1954034535) {
                            int i121 = iM2 - 16;
                            byte[] bArr9 = new byte[i121];
                            qVar2.k(bArr9, 0, i121);
                            n1VarB = j0.B(bArr9);
                            str16 = MimeTypes.APPLICATION_TX3G;
                            i33 = i37;
                            i34 = iM2;
                        } else {
                            if (iM3 == 2004251764) {
                                str16 = MimeTypes.APPLICATION_MP4VTT;
                            } else if (iM3 == 1937010800) {
                                j11 = 0;
                            } else if (iM3 == 1664495672) {
                                k3Var.f16294b = 1;
                                str16 = MimeTypes.APPLICATION_MP4CEA608;
                            } else {
                                if (iM3 != 1836070003) {
                                    throw new IllegalStateException();
                                }
                                int i122 = qVar2.f44814b;
                                qVar2.N(4);
                                if (qVar2.m() == 1702061171) {
                                    byte[] bArr10 = c(i122, qVar2).f13429b;
                                    if (bArr10 == null || bArr10.length != 64) {
                                        i33 = i37;
                                        i34 = iM2;
                                    } else {
                                        int i123 = p1Var2.f4886d;
                                        int i124 = p1Var2.f4887e;
                                        go.k.t(bArr10.length == 64);
                                        ArrayList arrayList = new ArrayList(16);
                                        int i125 = 0;
                                        while (i125 < bArr10.length - 3) {
                                            byte[] bArr11 = bArr10;
                                            int iM10 = com.bumptech.glide.c.m(bArr10[i125], bArr10[i125 + 1], bArr10[i125 + 2], bArr11[i125 + 3]);
                                            int i126 = (iM10 >> 16) & 255;
                                            int i127 = ((iM10 >> 8) & 255) - 128;
                                            int i128 = (iM10 & 255) - 128;
                                            arrayList.add(String.format("%06x", Integer.valueOf(y.j(defpackage.e.D(i128, 17790, 10000, i126), 0, 255) | (y.j((i126 - ((i128 * 3455) / 10000)) - ((i127 * 7169) / 10000), 0, 255) << 8) | (y.j(defpackage.e.D(i127, 14075, 10000, i126), 0, 255) << 16))));
                                            i125 += 4;
                                            bArr10 = bArr11;
                                            i37 = i37;
                                            iM2 = iM2;
                                        }
                                        i33 = i37;
                                        i34 = iM2;
                                        StringBuilder sbL2 = l1.d.l("size: ", i123, "x", i124, "\npalette: ");
                                        sbL2.append(new na.g(", ").C(arrayList));
                                        sbL2.append("\n");
                                        String string2 = sbL2.toString();
                                        String str17 = y.f44830a;
                                        n1VarB = j0.B(string2.getBytes(StandardCharsets.UTF_8));
                                        str6 = MimeTypes.APPLICATION_VOBSUB;
                                    }
                                } else {
                                    i33 = i37;
                                    i34 = iM2;
                                    str6 = null;
                                    n1VarB = null;
                                }
                                str16 = str6;
                            }
                            i33 = i37;
                            i34 = iM2;
                            j10 = j11;
                            n1VarB = null;
                            if (str16 != null) {
                                i1.o oVar2 = new i1.o();
                                oVar2.f42589a = Integer.toString(i35);
                                oVar2.f42600m = d0.n(str16);
                                oVar2.f42592d = str7;
                                oVar2.f42605r = j10;
                                oVar2.f42603p = n1VarB;
                                k3Var.f16296d = new i1.p(oVar2);
                            }
                        }
                        j10 = Long.MAX_VALUE;
                        if (str16 != null) {
                            i1.o oVar3 = new i1.o();
                            oVar3.f42589a = Integer.toString(i35);
                            oVar3.f42600m = d0.n(str16);
                            oVar3.f42592d = str7;
                            oVar3.f42605r = j10;
                            oVar3.f42603p = n1VarB;
                            k3Var.f16296d = new i1.p(oVar3);
                        }
                    } else {
                        i33 = i37;
                        i34 = iM2;
                        j10 = j11;
                        n1VarB = null;
                        if (str16 != null) {
                            i1.o oVar4 = new i1.o();
                            oVar4.f42589a = Integer.toString(i35);
                            oVar4.f42600m = d0.n(str16);
                            oVar4.f42592d = str7;
                            oVar4.f42605r = j10;
                            oVar4.f42603p = n1VarB;
                            k3Var.f16296d = new i1.p(oVar4);
                        }
                    }
                    qVar2 = qVar;
                    str5 = str7;
                    i11 = i35;
                    i12 = iM;
                    i37 = i33;
                    i13 = i34;
                    c4 = 4;
                    c5 = '\f';
                    i10 = i36;
                } else {
                    if (iM3 == 1835365492) {
                        qVar2.M(i37 + 16);
                        if (iM3 == 1835365492) {
                            qVar2.u();
                            String strU = qVar2.u();
                            if (strU != null) {
                                i1.o oVar5 = new i1.o();
                                oVar5.f42589a = Integer.toString(i35);
                                oVar5.f42600m = d0.n(strU);
                                k3Var.f16296d = new i1.p(oVar5);
                            }
                        }
                    } else if (iM3 == 1667329389) {
                        i1.o oVar6 = new i1.o();
                        oVar6.f42589a = Integer.toString(i35);
                        oVar6.f42600m = d0.n(MimeTypes.APPLICATION_CAMERA_MOTION);
                        k3Var.f16296d = new i1.p(oVar6);
                    }
                    i37 = i37;
                    i13 = iM2;
                    str5 = str7;
                }
                i10 = i36;
                i11 = i35;
                i12 = iM;
                c4 = 4;
                c5 = '\f';
            }
            qVar2.M(i37 + i13);
            i36 = i10 + 1;
            p1Var2 = p1Var;
            str7 = str5;
            i35 = i11;
            iM = i12;
        }
        return k3Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:102:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f4 A[EDGE_INSN: B:106:0x01f4->B:105:0x01f1 BREAK  A[LOOP:18: B:96:0x01d4->B:107:0x0200]] */
    /* JADX WARN: Code duplicated, block: B:107:0x0200 A[LOOP:18: B:96:0x01d4->B:107:0x0200, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x022d  */
    /* JADX WARN: Code duplicated, block: B:121:0x024b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0255  */
    /* JADX WARN: Code duplicated, block: B:148:0x02de  */
    /* JADX WARN: Code duplicated, block: B:152:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:156:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:157:0x0309  */
    /* JADX WARN: Code duplicated, block: B:159:0x031d  */
    /* JADX WARN: Code duplicated, block: B:214:0x0494  */
    /* JADX WARN: Code duplicated, block: B:217:0x049c  */
    /* JADX WARN: Code duplicated, block: B:218:0x049f  */
    /* JADX WARN: Code duplicated, block: B:220:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:223:0x04af A[LOOP:1: B:221:0x04a9->B:223:0x04af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:226:0x04c2 A[LOOP:2: B:225:0x04c0->B:226:0x04c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:229:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:231:0x04f7 A[LOOP:4: B:230:0x04f5->B:231:0x04f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:235:0x053a  */
    /* JADX WARN: Code duplicated, block: B:237:0x053e  */
    /* JADX WARN: Code duplicated, block: B:239:0x0542  */
    /* JADX WARN: Code duplicated, block: B:241:0x0546  */
    /* JADX WARN: Code duplicated, block: B:244:0x0557  */
    /* JADX WARN: Code duplicated, block: B:246:0x055a  */
    /* JADX WARN: Code duplicated, block: B:247:0x055d  */
    /* JADX WARN: Code duplicated, block: B:250:0x0563  */
    /* JADX WARN: Code duplicated, block: B:251:0x0566  */
    /* JADX WARN: Code duplicated, block: B:254:0x056c  */
    /* JADX WARN: Code duplicated, block: B:255:0x056f  */
    /* JADX WARN: Code duplicated, block: B:258:0x0575  */
    /* JADX WARN: Code duplicated, block: B:259:0x0578  */
    /* JADX WARN: Code duplicated, block: B:262:0x0599  */
    /* JADX WARN: Code duplicated, block: B:264:0x059d  */
    /* JADX WARN: Code duplicated, block: B:266:0x05a3 A[LOOP:14: B:263:0x059b->B:266:0x05a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:271:0x05c1 A[EDGE_INSN: B:271:0x05c1->B:303:0x0678 BREAK  A[LOOP:13: B:261:0x0597->B:301:0x065a]] */
    /* JADX WARN: Code duplicated, block: B:272:0x05dc A[EDGE_INSN: B:272:0x05dc->B:303:0x0678 BREAK  A[LOOP:13: B:261:0x0597->B:301:0x065a]] */
    /* JADX WARN: Code duplicated, block: B:273:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:275:0x05ea A[ADDED_TO_REGION, LOOP:15: B:275:0x05ea->B:277:0x05ee, LOOP_START, PHI: r3 r23 r24
  0x05ea: PHI (r3v16 int) = (r3v14 int), (r3v17 int) binds: [B:274:0x05e8, B:277:0x05ee] A[DONT_GENERATE, DONT_INLINE]
  0x05ea: PHI (r23v10 int) = (r23v8 int), (r23v12 int) binds: [B:274:0x05e8, B:277:0x05ee] A[DONT_GENERATE, DONT_INLINE]
  0x05ea: PHI (r24v8 int) = (r24v4 int), (r24v9 int) binds: [B:274:0x05e8, B:277:0x05ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:281:0x0608  */
    /* JADX WARN: Code duplicated, block: B:283:0x060b  */
    /* JADX WARN: Code duplicated, block: B:285:0x0619  */
    /* JADX WARN: Code duplicated, block: B:286:0x061b  */
    /* JADX WARN: Code duplicated, block: B:289:0x0620  */
    /* JADX WARN: Code duplicated, block: B:290:0x062c  */
    /* JADX WARN: Code duplicated, block: B:295:0x0637  */
    /* JADX WARN: Code duplicated, block: B:296:0x0643  */
    /* JADX WARN: Code duplicated, block: B:305:0x067d A[DONT_INVERT, LOOP:16: B:305:0x067d->B:309:0x0687, LOOP_START, PHI: r24
  0x067d: PHI (r24v5 int) = (r24v4 int), (r24v6 int) binds: [B:304:0x067b, B:309:0x0687] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:306:0x067f  */
    /* JADX WARN: Code duplicated, block: B:309:0x0687 A[LOOP:16: B:305:0x067d->B:309:0x0687, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:310:0x068d A[EDGE_INSN: B:310:0x068d->B:311:0x068e BREAK  A[LOOP:16: B:305:0x067d->B:309:0x0687]] */
    /* JADX WARN: Code duplicated, block: B:319:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:321:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:322:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:327:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:334:0x0734 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:335:0x0736  */
    /* JADX WARN: Code duplicated, block: B:338:0x0748  */
    /* JADX WARN: Code duplicated, block: B:340:0x074e  */
    /* JADX WARN: Code duplicated, block: B:346:0x076f  */
    /* JADX WARN: Code duplicated, block: B:349:0x0776  */
    /* JADX WARN: Code duplicated, block: B:351:0x077c  */
    /* JADX WARN: Code duplicated, block: B:355:0x0796  */
    /* JADX WARN: Code duplicated, block: B:384:0x0859  */
    /* JADX WARN: Code duplicated, block: B:387:0x0865  */
    /* JADX WARN: Code duplicated, block: B:396:0x08af  */
    /* JADX WARN: Code duplicated, block: B:397:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:401:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:403:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:406:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:408:0x0901  */
    /* JADX WARN: Code duplicated, block: B:409:0x0903  */
    /* JADX WARN: Code duplicated, block: B:416:0x0917  */
    /* JADX WARN: Code duplicated, block: B:422:0x092a  */
    /* JADX WARN: Code duplicated, block: B:427:0x0938  */
    /* JADX WARN: Code duplicated, block: B:432:0x094e  */
    /* JADX WARN: Code duplicated, block: B:433:0x0950  */
    /* JADX WARN: Code duplicated, block: B:435:0x0958  */
    /* JADX WARN: Code duplicated, block: B:439:0x0976  */
    /* JADX WARN: Code duplicated, block: B:440:0x0978  */
    /* JADX WARN: Code duplicated, block: B:443:0x097e  */
    /* JADX WARN: Code duplicated, block: B:444:0x0981  */
    /* JADX WARN: Code duplicated, block: B:446:0x0984  */
    /* JADX WARN: Code duplicated, block: B:447:0x0987  */
    /* JADX WARN: Code duplicated, block: B:449:0x098a  */
    /* JADX WARN: Code duplicated, block: B:451:0x098e  */
    /* JADX WARN: Code duplicated, block: B:452:0x0991  */
    /* JADX WARN: Code duplicated, block: B:454:0x0994  */
    /* JADX WARN: Code duplicated, block: B:455:0x099a  */
    /* JADX WARN: Code duplicated, block: B:459:0x09a9  */
    /* JADX WARN: Code duplicated, block: B:461:0x09b5  */
    /* JADX WARN: Code duplicated, block: B:464:0x09c4  */
    /* JADX WARN: Code duplicated, block: B:466:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:469:0x09f5  */
    /* JADX WARN: Code duplicated, block: B:473:0x09fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:481:0x0a35  */
    /* JADX WARN: Code duplicated, block: B:501:0x077f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x090d A[EDGE_INSN: B:507:0x090d->B:413:0x090d BREAK  A[LOOP:8: B:404:0x08f8->B:412:0x090a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x090a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x0924 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x0945 A[ADDED_TO_REGION, EDGE_INSN: B:512:0x0945->B:430:0x0945 BREAK  A[LOOP:10: B:425:0x0932->B:429:0x093e], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x0a0e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x066b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:0x05ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:0x05b4 A[EDGE_INSN: B:526:0x05b4->B:267:0x05b4 BREAK  A[LOOP:14: B:263:0x059b->B:266:0x05a3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:529:0x068d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x0685 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x01df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x016a  */
    /* JADX WARN: Code duplicated, block: B:81:0x016d  */
    /* JADX WARN: Code duplicated, block: B:84:0x017b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0183  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d6  */
    public static ArrayList j(m1.c cVar, n2.q qVar, long j10, i1.m mVar, boolean z10, boolean z11, na.e eVar, boolean z12) {
        int i10;
        int i11;
        long j11;
        long jU;
        long jB;
        ArrayList arrayList;
        int i12;
        p1 p1Var;
        long j12;
        long j13;
        long j14;
        long jU2;
        l1.q qVar2;
        int iE;
        int i13;
        long jB2;
        int i14;
        int i15;
        int i16;
        long j15;
        char[] cArr;
        int i17;
        String str;
        m1.d dVarH;
        k3 k3VarI;
        long[] jArr;
        long[] jArr2;
        i1.p pVar;
        int i18;
        i1.p pVar2;
        p pVar3;
        m1.b bVar;
        c0 c0Var;
        c0 c0Var2;
        m1.c cVarG;
        Pair pairCreate;
        char c4;
        long jF;
        long j16;
        a y1Var;
        boolean z13;
        int iD;
        int iD2;
        int iD3;
        int iA;
        l1.q qVar3;
        boolean z14;
        ArrayList arrayList2;
        boolean z15;
        long[] jArr3;
        a aVar;
        int[] iArr;
        long[] jArr4;
        int[] iArrCopyOf;
        int i19;
        int i20;
        int i21;
        long j17;
        long j18;
        long j19;
        int i22;
        int iM;
        int i23;
        int iD4;
        int iM2;
        int iD5;
        int iD6;
        l1.q qVar4;
        int i24;
        int i25;
        long[] jArr5;
        long[] jArrCopyOf;
        int i26;
        int[] iArr2;
        boolean z16;
        String str2;
        int i27;
        int[] iArr3;
        int i28;
        long j20;
        long j21;
        boolean zA;
        int i29;
        int nextSampleSize;
        int[] iArr4;
        int i30;
        long[] jArr6;
        int i31;
        int i32;
        long[] jArr7;
        int[] iArr5;
        long[] jArr8;
        long j22;
        int i33;
        long j23;
        i1.p pVar4;
        long[] jArr9;
        long[] jArr10;
        long jU3;
        int[] iArrH;
        long[] jArr11;
        ArrayList arrayList3;
        long j24;
        int[] iArr6;
        int i34;
        boolean z17;
        int[] iArr7;
        int[] iArr8;
        ArrayList arrayList4;
        int i35;
        int i36;
        int i37;
        boolean z18;
        int[] iArr9;
        long[] jArr12;
        boolean z19;
        boolean z20;
        long[] jArr13;
        int[] iArr10;
        int[] iArr11;
        ArrayList arrayList5;
        long[] jArr14;
        int i38;
        boolean z21;
        int i39;
        long j25;
        i1.p pVar5;
        r rVar;
        long j26;
        int i40;
        boolean z22;
        int i41;
        int i42;
        int i43;
        long jU4;
        int[] iArr12;
        int i44;
        long j27;
        int[] iArr13;
        long jU5;
        int iB;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        boolean z23;
        int i50;
        r rVar2;
        long j28;
        int i51;
        long jU6;
        long jU7;
        int i52;
        long[] jArr15;
        int[] iArr14;
        long j29;
        int i53;
        int i54;
        int iG;
        int[] iArr15;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        long j30;
        int iMax;
        int i60;
        int i61;
        m1.c cVar2 = cVar;
        ArrayList arrayList6 = new ArrayList();
        int i62 = 0;
        for (ArrayList arrayList7 = cVar2.f45775e; i62 < arrayList7.size(); arrayList7 = arrayList) {
            m1.c cVar3 = (m1.c) arrayList7.get(i62);
            if (cVar3.f22444b != 1953653099) {
                arrayList = arrayList7;
                arrayList6 = arrayList6;
                i11 = i62;
            } else {
                m1.d dVarH2 = cVar2.h(1836476516);
                dVarH2.getClass();
                m1.c cVarG2 = cVar3.g(1835297121);
                cVarG2.getClass();
                m1.d dVarH3 = cVarG2.h(1751411826);
                dVarH3.getClass();
                l1.q qVar5 = dVarH3.f45776c;
                qVar5.M(16);
                int iM3 = qVar5.m();
                if (iM3 == 1936684398) {
                    i10 = 1;
                } else if (iM3 == 1986618469) {
                    i10 = 2;
                } else if (iM3 == 1952807028 || iM3 == 1935832172 || iM3 == 1937072756 || iM3 == 1668047728 || iM3 == 1937072752) {
                    i10 = 3;
                } else {
                    i10 = iM3 == 1835365473 ? 5 : -1;
                }
                int i63 = 1;
                i11 = i62;
                if (i10 == -1) {
                    arrayList = arrayList7;
                    pVar3 = null;
                    j11 = 0;
                } else {
                    j11 = 0;
                    m1.d dVarH4 = cVar3.h(1953196132);
                    dVarH4.getClass();
                    l1.q qVar6 = dVarH4.f45776c;
                    qVar6.M(8);
                    int iE2 = e(qVar6.m());
                    qVar6.N(iE2 != 0 ? 16 : 8);
                    int iM4 = qVar6.m();
                    qVar6.N(4);
                    int i64 = qVar6.f44814b;
                    int i65 = iE2 == 0 ? 4 : 8;
                    int i66 = 0;
                    while (true) {
                        jU = C.TIME_UNSET;
                        if (i66 >= i65) {
                            qVar6.N(i65);
                        } else {
                            if (qVar6.f44813a[i64 + i66] != -1) {
                                jB = iE2 == 0 ? qVar6.B() : qVar6.F();
                                if (jB != 0) {
                                    break;
                                }
                                break;
                            }
                            i66++;
                        }
                        jB = -9223372036854775807L;
                        break;
                    }
                    qVar6.N(10);
                    int iG2 = qVar6.G();
                    qVar6.N(4);
                    int iM5 = qVar6.m();
                    int iM6 = qVar6.m();
                    qVar6.N(4);
                    int iM7 = qVar6.m();
                    int iM8 = qVar6.m();
                    if (iM5 == 0 && iM6 == 65536) {
                        arrayList = arrayList7;
                        if ((iM7 == -65536 || iM7 == 65536) && iM8 == 0) {
                            i12 = 90;
                        }
                        qVar6.N(16);
                        short sW = qVar6.w();
                        qVar6.N(2);
                        short sW2 = qVar6.w();
                        p1Var = new p1();
                        p1Var.f4883a = iM4;
                        p1Var.f4884b = iG2;
                        p1Var.f4885c = i12;
                        p1Var.f4886d = sW;
                        p1Var.f4887e = sW2;
                        if (j10 == C.TIME_UNSET) {
                            j12 = jB;
                        } else {
                            j12 = j10;
                        }
                        j13 = g(dVarH2.f45776c).f45781c;
                        if (j12 == C.TIME_UNSET) {
                            j14 = j13;
                            jU2 = -9223372036854775807L;
                        } else {
                            String str3 = y.f44830a;
                            j14 = j13;
                            jU2 = y.U(j12, 1000000L, j14, RoundingMode.DOWN);
                        }
                        m1.c cVarG3 = cVarG2.g(1835626086);
                        cVarG3.getClass();
                        m1.c cVarG4 = cVarG3.g(1937007212);
                        cVarG4.getClass();
                        m1.d dVarH5 = cVarG2.h(1835296868);
                        dVarH5.getClass();
                        qVar2 = dVarH5.f45776c;
                        qVar2.M(8);
                        iE = e(qVar2.m());
                        if (iE == 0) {
                            i13 = 8;
                        } else {
                            i13 = 16;
                        }
                        qVar2.N(i13);
                        jB2 = qVar2.B();
                        i14 = qVar2.f44814b;
                        if (iE == 0) {
                            i15 = 4;
                        } else {
                            i15 = 8;
                        }
                        i16 = 0;
                        while (true) {
                            if (i16 < i15) {
                                qVar2.N(i15);
                                break;
                            }
                            if (qVar2.f44813a[i14 + i16] != -1) {
                                if (iE == 0) {
                                    jF = qVar2.B();
                                } else {
                                    jF = qVar2.F();
                                }
                                j16 = jF;
                                if (j16 != 0) {
                                    break;
                                }
                                String str4 = y.f44830a;
                                jU = y.U(j16, 1000000L, jB2, RoundingMode.DOWN);
                                break;
                            }
                            i16++;
                        }
                        j15 = jU;
                        int iG3 = qVar2.G();
                        cArr = new char[]{(char) (((iG3 >> 10) & 31) + 96), (char) (((iG3 >> 5) & 31) + 96), (char) ((iG3 & 31) + 96)};
                        i17 = 0;
                        while (true) {
                            if (i17 < 3) {
                                str = new String(cArr);
                                break;
                            }
                            c4 = cArr[i17];
                            if (c4 >= 'a' || c4 > 'z') {
                                str = null;
                                break;
                            }
                            i17++;
                        }
                        dVarH = cVarG4.h(1937011556);
                        if (dVarH == null) {
                            l1.a.s("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                        } else {
                            k3VarI = i(dVarH.f45776c, p1Var, str, mVar, z11);
                            if (!z10 || (cVarG = cVar3.g(1701082227)) == null) {
                                jArr = null;
                                jArr2 = null;
                            } else {
                                m1.d dVarH6 = cVarG.h(1701606260);
                                if (dVarH6 == null) {
                                    pairCreate = null;
                                } else {
                                    l1.q qVar7 = dVarH6.f45776c;
                                    qVar7.M(8);
                                    int iE3 = e(qVar7.m());
                                    int iD7 = qVar7.D();
                                    long[] jArr16 = new long[iD7];
                                    long[] jArr17 = new long[iD7];
                                    int i67 = 0;
                                    while (i67 < iD7) {
                                        int i68 = i63;
                                        jArr16[i67] = iE3 == i68 ? qVar7.F() : qVar7.B();
                                        jArr17[i67] = iE3 == i68 ? qVar7.t() : qVar7.m();
                                        if (qVar7.w() != 1) {
                                            throw new IllegalArgumentException("Unsupported media rate.");
                                        }
                                        qVar7.N(2);
                                        i67++;
                                        i63 = 1;
                                    }
                                    pairCreate = Pair.create(jArr16, jArr17);
                                }
                                if (pairCreate != null) {
                                    long[] jArr18 = (long[]) pairCreate.first;
                                    jArr2 = (long[]) pairCreate.second;
                                    jArr = jArr18;
                                } else {
                                    jArr = null;
                                    jArr2 = null;
                                }
                            }
                            pVar = (i1.p) k3VarI.f16296d;
                            if (pVar == null) {
                                i18 = p1Var.f4884b;
                                if (i18 != 0) {
                                    bVar = new m1.b(i18);
                                    i1.o oVarA = pVar.a();
                                    c0Var = ((i1.p) k3VarI.f16296d).l;
                                    if (c0Var != null) {
                                        c0Var2 = c0Var.a(bVar);
                                    } else {
                                        c0Var2 = new c0(bVar);
                                    }
                                    oVarA.f42599k = c0Var2;
                                    pVar2 = new i1.p(oVarA);
                                } else {
                                    pVar2 = pVar;
                                }
                                pVar3 = new p(p1Var.f4883a, i10, jB2, j14, jU2, j15, pVar2, k3VarI.f16294b, (q[]) k3VarI.f16295c, k3VarI.f16293a, jArr, jArr2);
                            }
                        }
                        pVar3 = null;
                    } else {
                        arrayList = arrayList7;
                    }
                    i12 = (iM5 == 0 && iM6 == -65536 && (iM7 == 65536 || iM7 == -65536) && iM8 == 0) ? 270 : ((iM5 == -65536 || iM5 == 65536) && iM6 == 0 && iM7 == 0 && iM8 == -65536) ? 180 : 0;
                    qVar6.N(16);
                    short sW3 = qVar6.w();
                    qVar6.N(2);
                    short sW4 = qVar6.w();
                    p1Var = new p1();
                    p1Var.f4883a = iM4;
                    p1Var.f4884b = iG2;
                    p1Var.f4885c = i12;
                    p1Var.f4886d = sW3;
                    p1Var.f4887e = sW4;
                    if (j10 == C.TIME_UNSET) {
                        j12 = jB;
                    } else {
                        j12 = j10;
                    }
                    j13 = g(dVarH2.f45776c).f45781c;
                    if (j12 == C.TIME_UNSET) {
                        j14 = j13;
                        jU2 = -9223372036854775807L;
                    } else {
                        String str5 = y.f44830a;
                        j14 = j13;
                        jU2 = y.U(j12, 1000000L, j14, RoundingMode.DOWN);
                    }
                    m1.c cVarG5 = cVarG2.g(1835626086);
                    cVarG5.getClass();
                    m1.c cVarG6 = cVarG5.g(1937007212);
                    cVarG6.getClass();
                    m1.d dVarH7 = cVarG2.h(1835296868);
                    dVarH7.getClass();
                    qVar2 = dVarH7.f45776c;
                    qVar2.M(8);
                    iE = e(qVar2.m());
                    if (iE == 0) {
                        i13 = 8;
                    } else {
                        i13 = 16;
                    }
                    qVar2.N(i13);
                    jB2 = qVar2.B();
                    i14 = qVar2.f44814b;
                    if (iE == 0) {
                        i15 = 4;
                    } else {
                        i15 = 8;
                    }
                    i16 = 0;
                    while (true) {
                        if (i16 < i15) {
                            qVar2.N(i15);
                            break;
                        }
                        if (qVar2.f44813a[i14 + i16] != -1) {
                            if (iE == 0) {
                                jF = qVar2.B();
                            } else {
                                jF = qVar2.F();
                            }
                            j16 = jF;
                            if (j16 != 0) {
                                break;
                            }
                            String str6 = y.f44830a;
                            jU = y.U(j16, 1000000L, jB2, RoundingMode.DOWN);
                            break;
                        }
                        i16++;
                    }
                    j15 = jU;
                    int iG4 = qVar2.G();
                    cArr = new char[]{(char) (((iG4 >> 10) & 31) + 96), (char) (((iG4 >> 5) & 31) + 96), (char) ((iG4 & 31) + 96)};
                    i17 = 0;
                    while (true) {
                        if (i17 < 3) {
                            c4 = cArr[i17];
                            if (c4 >= 'a') {
                            }
                            str = null;
                            break;
                        }
                        str = new String(cArr);
                        break;
                        i17++;
                    }
                    dVarH = cVarG6.h(1937011556);
                    if (dVarH == null) {
                        l1.a.s("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                    } else {
                        k3VarI = i(dVarH.f45776c, p1Var, str, mVar, z11);
                        if (z10) {
                            jArr = null;
                            jArr2 = null;
                        } else {
                            jArr = null;
                            jArr2 = null;
                        }
                        pVar = (i1.p) k3VarI.f16296d;
                        if (pVar == null) {
                            i18 = p1Var.f4884b;
                            if (i18 != 0) {
                                bVar = new m1.b(i18);
                                i1.o oVarA2 = pVar.a();
                                c0Var = ((i1.p) k3VarI.f16296d).l;
                                if (c0Var != null) {
                                    c0Var2 = c0Var.a(bVar);
                                } else {
                                    c0Var2 = new c0(bVar);
                                }
                                oVarA2.f42599k = c0Var2;
                                pVar2 = new i1.p(oVarA2);
                            } else {
                                pVar2 = pVar;
                            }
                            pVar3 = new p(p1Var.f4883a, i10, jB2, j14, jU2, j15, pVar2, k3VarI.f16294b, (q[]) k3VarI.f16295c, k3VarI.f16293a, jArr, jArr2);
                        }
                    }
                    pVar3 = null;
                }
                p pVarA = (p) eVar.apply(pVar3);
                if (pVarA == null) {
                    arrayList6 = arrayList6;
                } else {
                    i1.p pVar6 = pVarA.f42187g;
                    m1.c cVarG7 = cVar3.g(1835297121);
                    cVarG7.getClass();
                    m1.c cVarG8 = cVarG7.g(1835626086);
                    cVarG8.getClass();
                    m1.c cVarG9 = cVarG8.g(1937007212);
                    cVarG9.getClass();
                    m1.d dVarH8 = cVarG9.h(1937011578);
                    if (dVarH8 != null) {
                        y1Var = new a7.b(dVarH8, pVar6);
                    } else {
                        m1.d dVarH9 = cVarG9.h(1937013298);
                        if (dVarH9 == null) {
                            throw e0.a(null, "Track has no sample table size information");
                        }
                        y1Var = new y1(dVarH9);
                    }
                    int sampleCount = y1Var.getSampleCount();
                    if (sampleCount == 0) {
                        rVar = new r(pVarA, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                    } else {
                        if (pVarA.f42182b == 2) {
                            long j31 = pVarA.f42186f;
                            if (j31 > j11) {
                                i1.o oVarA3 = pVar6.a();
                                oVarA3.f42611x = sampleCount / (j31 / 1000000.0f);
                                pVarA = pVarA.a(new i1.p(oVarA3));
                            }
                        }
                        i1.p pVar7 = pVarA.f42187g;
                        m1.d dVarH10 = cVarG9.h(1937007471);
                        if (dVarH10 == null) {
                            dVarH10 = cVarG9.h(1668232756);
                            dVarH10.getClass();
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        l1.q qVar8 = dVarH10.f45776c;
                        m1.d dVarH11 = cVarG9.h(1937011555);
                        dVarH11.getClass();
                        l1.q qVar9 = dVarH11.f45776c;
                        m1.d dVarH12 = cVarG9.h(1937011827);
                        dVarH12.getClass();
                        l1.q qVar10 = dVarH12.f45776c;
                        m1.d dVarH13 = cVarG9.h(1937011571);
                        l1.q qVar11 = dVarH13 != null ? dVarH13.f45776c : null;
                        m1.d dVarH14 = cVarG9.h(1668576371);
                        l1.q qVar12 = dVarH14 != null ? dVarH14.f45776c : null;
                        c6 c6Var = new c6(qVar9, qVar8, z13);
                        qVar10.M(12);
                        int iD8 = qVar10.D() - 1;
                        int iD9 = qVar10.D();
                        int iD10 = qVar10.D();
                        if (qVar12 != null) {
                            qVar12.M(12);
                            iD = qVar12.D();
                        } else {
                            iD = 0;
                        }
                        if (qVar11 != null) {
                            qVar11.M(12);
                            iD2 = qVar11.D();
                            if (iD2 > 0) {
                                iD3 = qVar11.D() - 1;
                            } else {
                                qVar11 = null;
                            }
                            iA = y1Var.a();
                            qVar3 = qVar12;
                            String str7 = pVar7.f42643n;
                            if (iA == -1 && ((MimeTypes.AUDIO_RAW.equals(str7) || MimeTypes.AUDIO_MLAW.equals(str7) || MimeTypes.AUDIO_ALAW.equals(str7)) && iD8 == 0 && iD == 0 && iD2 == 0)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            arrayList2 = new ArrayList();
                            if (qVar11 == null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z14) {
                                i52 = c6Var.f13048a;
                                jArr15 = new long[i52];
                                iArr14 = new int[i52];
                                while (c6Var.a()) {
                                    int i69 = c6Var.f13049b;
                                    jArr15[i69] = c6Var.f13051d;
                                    iArr14[i69] = c6Var.f13050c;
                                }
                                j29 = iD10;
                                i53 = Segment.SIZE / iA;
                                iG = 0;
                                for (i54 = 0; i54 < i52; i54++) {
                                    iG += y.g(iArr14[i54], i53);
                                }
                                jArr5 = new long[iG];
                                iArr2 = new int[iG];
                                jArrCopyOf = new long[iG];
                                iArr15 = new int[iG];
                                i55 = 0;
                                i56 = 0;
                                i57 = 0;
                                i58 = 0;
                                i59 = 0;
                                while (i55 < i52) {
                                    int i70 = iArr14[i55];
                                    j30 = jArr15[i55];
                                    int i71 = i59;
                                    int i72 = i55;
                                    iMax = i58;
                                    i60 = i71;
                                    int i73 = i52;
                                    i61 = i70;
                                    while (i61 > 0) {
                                        int iMin = Math.min(i53, i61);
                                        jArr5[i60] = j30;
                                        int i74 = i61;
                                        int i75 = iA * iMin;
                                        iArr2[i60] = i75;
                                        iMax = Math.max(iMax, i75);
                                        long j32 = j29;
                                        jArrCopyOf[i60] = j32 * ((long) i56);
                                        iArr15[i60] = 1;
                                        j30 += (long) iArr2[i60];
                                        i56 += iMin;
                                        i60++;
                                        i57 += i75;
                                        i61 = i74 - iMin;
                                        j29 = j32;
                                    }
                                    int i76 = i72 + 1;
                                    i59 = i60;
                                    i58 = iMax;
                                    i55 = i76;
                                    i52 = i73;
                                }
                                j20 = ((long) i56) * j29;
                                j21 = i57;
                                if (z12) {
                                    jArr5 = new long[0];
                                }
                                if (z12) {
                                    iArr2 = new int[0];
                                }
                                if (z12) {
                                    jArrCopyOf = new long[0];
                                }
                                if (z12) {
                                    iArr15 = new int[0];
                                }
                                i27 = iG;
                                iArr3 = iArr15;
                                i28 = i58;
                            } else {
                                if (z12) {
                                    jArr3 = new long[0];
                                } else {
                                    jArr3 = new long[sampleCount];
                                }
                                aVar = y1Var;
                                if (z12) {
                                    iArr = new int[0];
                                } else {
                                    iArr = new int[sampleCount];
                                }
                                int i77 = iD2;
                                if (z12) {
                                    jArr4 = new long[0];
                                } else {
                                    jArr4 = new long[sampleCount];
                                }
                                if (z12) {
                                    iArrCopyOf = new int[0];
                                } else {
                                    iArrCopyOf = new int[sampleCount];
                                }
                                i19 = iD;
                                i20 = i77;
                                i21 = iD8;
                                j17 = j11;
                                j18 = j17;
                                j19 = j18;
                                i22 = 0;
                                iM = 0;
                                i23 = 0;
                                iD4 = 0;
                                iM2 = iD10;
                                iD5 = iD9;
                                iD6 = iD3;
                                qVar4 = qVar11;
                                i24 = 0;
                                while (true) {
                                    if (i24 < sampleCount) {
                                        i25 = i20;
                                        jArr5 = jArr3;
                                        jArrCopyOf = jArr4;
                                        i26 = i23;
                                        iArr2 = iArr;
                                        break;
                                    }
                                    zA = true;
                                    while (i23 == 0) {
                                        zA = c6Var.a();
                                        if (zA) {
                                            break;
                                        }
                                        j19 = c6Var.f13051d;
                                        i23 = c6Var.f13050c;
                                        i20 = i20;
                                        iM = iM;
                                    }
                                    i29 = iM;
                                    i25 = i20;
                                    if (!zA) {
                                        l1.a.s("BoxParsers", "Unexpected end of chunk data");
                                        if (z12) {
                                            long[] jArrCopyOf2 = Arrays.copyOf(jArr3, i24);
                                            int[] iArrCopyOf2 = Arrays.copyOf(iArr, i24);
                                            jArr5 = jArrCopyOf2;
                                            jArrCopyOf = Arrays.copyOf(jArr4, i24);
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i24);
                                            sampleCount = i24;
                                            i26 = i23;
                                            iArr2 = iArrCopyOf2;
                                            iM = i29;
                                            break;
                                        }
                                        jArr5 = jArr3;
                                        jArrCopyOf = jArr4;
                                        sampleCount = i24;
                                        i26 = i23;
                                        iM = i29;
                                        iArr2 = iArr;
                                        break;
                                    }
                                    iM = i29;
                                    if (qVar3 != null) {
                                        while (iD4 == 0 && i19 > 0) {
                                            iD4 = qVar3.D();
                                            iM = qVar3.m();
                                            i19--;
                                        }
                                        iD4--;
                                    }
                                    nextSampleSize = aVar.readNextSampleSize();
                                    int i78 = sampleCount;
                                    iArr4 = iArr;
                                    long j33 = nextSampleSize;
                                    j18 += j33;
                                    if (nextSampleSize > i22) {
                                        i22 = nextSampleSize;
                                    }
                                    if (z12) {
                                        i30 = i22;
                                        jArr6 = jArr3;
                                    } else {
                                        jArr3[i24] = j19;
                                        iArr4[i24] = nextSampleSize;
                                        i30 = i22;
                                        jArr6 = jArr3;
                                        jArr4[i24] = j17 + ((long) iM);
                                        if (qVar4 == null) {
                                            i32 = 1;
                                        } else {
                                            i32 = 0;
                                        }
                                        iArrCopyOf[i24] = i32;
                                        if (i24 == iD6) {
                                            iArrCopyOf[i24] = 1;
                                            arrayList2.add(Integer.valueOf(i24));
                                        }
                                    }
                                    if (qVar4 != null && i24 == iD6) {
                                        i31 = i25 - 1;
                                        if (i31 > 0) {
                                            i25 = i31;
                                            iD6 = qVar4.D() - 1;
                                        } else {
                                            i25 = i31;
                                        }
                                    }
                                    j17 += (long) iM2;
                                    iD5--;
                                    if (iD5 != 0 && i21 > 0) {
                                        i21--;
                                        iD5 = qVar10.D();
                                        iM2 = qVar10.m();
                                    }
                                    j19 += j33;
                                    i23--;
                                    i24++;
                                    jArr3 = jArr6;
                                    sampleCount = i78;
                                    i20 = i25;
                                    i22 = i30;
                                    iArr = iArr4;
                                }
                                long j34 = j17 + ((long) iM);
                                if (qVar3 != null) {
                                    z16 = true;
                                    break;
                                }
                                while (true) {
                                    if (i19 > 0) {
                                        z16 = true;
                                        break;
                                    }
                                    if (qVar3.D() != 0) {
                                        z16 = false;
                                        break;
                                    }
                                    qVar3.m();
                                    i19--;
                                }
                                if (i25 == 0 || iD5 != 0 || i26 != 0 || i21 != 0 || iD4 != 0 || !z16) {
                                    StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                    l1.d.o(sb2, pVarA.f42181a, ": remainingSynchronizationSamples ", i25, ", remainingSamplesAtTimestampDelta ");
                                    l1.d.o(sb2, iD5, ", remainingSamplesInChunk ", i26, ", remainingTimestampDeltaChanges ");
                                    sb2.append(i21);
                                    sb2.append(", remainingSamplesAtTimestampOffset ");
                                    sb2.append(iD4);
                                    if (z16) {
                                        str2 = "";
                                    } else {
                                        str2 = ", ctts invalid";
                                    }
                                    sb2.append(str2);
                                    l1.a.s("BoxParsers", sb2.toString());
                                }
                                i27 = sampleCount;
                                iArr3 = iArrCopyOf;
                                i28 = i22;
                                j20 = j34;
                                j21 = j18;
                            }
                            jArr7 = jArr5;
                            iArr5 = iArr2;
                            jArr8 = jArrCopyOf;
                            j22 = pVarA.f42186f;
                            if (j22 > j11) {
                                jU7 = y.U(j21 * 8, 1000000L, j22, RoundingMode.HALF_DOWN);
                                if (jU7 > j11 && jU7 < 2147483647L) {
                                    i1.o oVarA4 = pVar7.a();
                                    oVarA4.f42596h = (int) jU7;
                                    pVarA = pVarA.a(new i1.p(oVarA4));
                                }
                            }
                            i33 = pVarA.f42182b;
                            j23 = pVarA.f42183c;
                            pVar4 = pVarA.f42187g;
                            jArr9 = pVarA.f42190j;
                            jArr10 = pVarA.f42189i;
                            RoundingMode roundingMode = RoundingMode.DOWN;
                            jU3 = y.U(j20, 1000000L, j23, roundingMode);
                            iArrH = com.bumptech.glide.c.H(arrayList2);
                            if (jArr10 == null) {
                                if (!z12) {
                                    y.T(jArr8, j23);
                                }
                                rVar2 = new r(pVarA, jArr7, iArr5, i28, jArr8, iArr3, iArrH, z15, jU3, i27);
                            } else if (z12) {
                                jArr9.getClass();
                                if (jArr10.length == 1 || jArr10[0] != j11) {
                                    j28 = j11;
                                    for (i51 = 0; i51 < jArr10.length; i51++) {
                                        if (jArr9[i51] != -1) {
                                            j28 += jArr10[i51];
                                        }
                                    }
                                    jU6 = y.U(j28, 1000000L, pVarA.f42184d, RoundingMode.DOWN);
                                } else {
                                    jU6 = y.U(j20 - jArr9[0], 1000000L, pVarA.f42183c, roundingMode);
                                }
                                rVar2 = new r(pVarA, jArr7, iArr5, i28, jArr8, iArr3, iArrH, z15, jU6, i27);
                            } else {
                                jArr11 = jArr9;
                                if (jArr10.length == 1 || i33 != 1 || jArr8.length < 2) {
                                    arrayList3 = arrayList2;
                                    j24 = -1;
                                } else {
                                    jArr11.getClass();
                                    long j35 = jArr11[0];
                                    j24 = -1;
                                    arrayList3 = arrayList2;
                                    long jU8 = j35 + y.U(jArr10[0], pVarA.f42183c, pVarA.f42184d, roundingMode);
                                    int length = jArr8.length - 1;
                                    if (jArr8[0] <= j35 && j35 < jArr8[y.j(4, 0, length)] && jArr8[y.j(jArr8.length + (-4), 0, length)] < jU8 && jU8 <= 2 + j20) {
                                        long jMax = Math.max(j11, j20 - jU8);
                                        long jU9 = y.U(j35 - jArr8[0], pVar4.G, pVarA.f42183c, roundingMode);
                                        j20 = j20;
                                        long jU10 = y.U(jMax, pVar4.G, pVarA.f42183c, roundingMode);
                                        if (!(jU9 == j11 && jU10 == j11) && jU9 <= 2147483647L && jU10 <= 2147483647L) {
                                            qVar.f46485a = (int) jU9;
                                            qVar.f46486b = (int) jU10;
                                            y.T(jArr8, j23);
                                            rVar2 = new r(pVarA, jArr7, iArr5, i28, jArr8, iArr3, iArrH, z15, y.U(jArr10[0], 1000000L, pVarA.f42184d, roundingMode), i27);
                                        } else {
                                            if (jArr10.length == 1 || jArr10[0] != 0) {
                                                iArr6 = iArr3;
                                                i34 = i27;
                                                if (i33 == 1) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                                iArr7 = new int[jArr10.length];
                                                iArr8 = new int[jArr10.length];
                                                jArr11.getClass();
                                                arrayList4 = arrayList3;
                                                i35 = 0;
                                                i36 = 0;
                                                i37 = 0;
                                                z18 = false;
                                                while (i37 < jArr10.length) {
                                                    iArr12 = iArr8;
                                                    i44 = i37;
                                                    j27 = jArr11[i44];
                                                    if (j27 != j24) {
                                                        boolean z24 = z18;
                                                        jU5 = y.U(jArr10[i44], pVarA.f42183c, pVarA.f42184d, RoundingMode.DOWN) + j27;
                                                        iArr13 = iArr12;
                                                        iArr7[i44] = y.f(jArr8, j27, true);
                                                        iB = y.b(jArr8, jU5, z17) - 1;
                                                        i46 = 0;
                                                        for (i45 = r5; i45 < jArr8.length; i45++) {
                                                            if (jArr8[i45] < jU5) {
                                                                i46++;
                                                                if (i46 > pVar4.f42645p) {
                                                                    break;
                                                                }
                                                            } else {
                                                                iB = i45;
                                                            }
                                                        }
                                                        iArr13[i44] = iB + 1;
                                                        i47 = iArr7[i44];
                                                        while (true) {
                                                            i48 = iArr7[i44];
                                                            if (i48 > 0 || (iArr6[i48] & 1) != 0) {
                                                                break;
                                                                break;
                                                            }
                                                            iArr7[i44] = i48 - 1;
                                                        }
                                                        if (i48 == 0 && (iArr6[0] & 1) == 0) {
                                                            iArr7[i44] = i47;
                                                            while (true) {
                                                                i50 = iArr7[i44];
                                                                if (i50 >= iArr13[i44] || (iArr6[i50] & 1) != 0) {
                                                                    break;
                                                                }
                                                                iArr7[i44] = i50 + 1;
                                                            }
                                                        }
                                                        int i79 = iArr13[i44];
                                                        i49 = iArr7[i44];
                                                        int i80 = (i79 - i49) + i35;
                                                        if (i36 != i49) {
                                                            z23 = true;
                                                        } else {
                                                            z23 = false;
                                                        }
                                                        z18 = z24 | z23;
                                                        i36 = i79;
                                                        i35 = i80;
                                                    } else {
                                                        iArr13 = iArr12;
                                                    }
                                                    i37 = i44 + 1;
                                                    jArr11 = jArr11;
                                                    iArr8 = iArr13;
                                                    z17 = z17;
                                                }
                                                iArr9 = iArr8;
                                                jArr12 = jArr11;
                                                boolean z25 = z18;
                                                if (i35 != i34) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                z20 = z25 | z19;
                                                if (z20) {
                                                    jArr13 = new long[i35];
                                                } else {
                                                    jArr13 = jArr7;
                                                }
                                                if (z20) {
                                                    iArr10 = new int[i35];
                                                } else {
                                                    iArr10 = iArr5;
                                                }
                                                if (z20) {
                                                    i28 = 0;
                                                }
                                                if (z20) {
                                                    iArr11 = new int[i35];
                                                } else {
                                                    iArr11 = iArr6;
                                                }
                                                if (z20) {
                                                    arrayList5 = new ArrayList();
                                                } else {
                                                    arrayList5 = arrayList4;
                                                }
                                                jArr14 = new long[i35];
                                                i38 = 0;
                                                z21 = false;
                                                i39 = 0;
                                                j25 = 0;
                                                while (i38 < jArr10.length) {
                                                    j26 = jArr12[i38];
                                                    i40 = iArr7[i38];
                                                    z22 = z20;
                                                    i41 = iArr9[i38];
                                                    i1.p pVar8 = pVar4;
                                                    if (z22) {
                                                        int i81 = i41 - i40;
                                                        System.arraycopy(jArr7, i40, jArr13, i39, i81);
                                                        System.arraycopy(iArr5, i40, iArr10, i39, i81);
                                                        System.arraycopy(iArr6, i40, iArr11, i39, i81);
                                                    }
                                                    i42 = i28;
                                                    while (i40 < i41) {
                                                        i43 = i40;
                                                        int i82 = i41;
                                                        long j36 = pVarA.f42184d;
                                                        RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                        long jU11 = y.U(j25, 1000000L, j36, roundingMode2);
                                                        jU4 = y.U(jArr8[i43] - j26, 1000000L, pVarA.f42183c, roundingMode2);
                                                        if (jU4 < 0) {
                                                            z21 = true;
                                                        }
                                                        jArr14[i39] = jU11 + jU4;
                                                        if (z22 && iArr10[i39] > i42) {
                                                            i42 = iArr5[i43];
                                                        }
                                                        if (!z22 && !z15 && (iArr11[i39] & 1) != 0) {
                                                            arrayList5.add(Integer.valueOf(i39));
                                                        }
                                                        i39++;
                                                        i40 = i43 + 1;
                                                        i41 = i82;
                                                    }
                                                    j25 += jArr10[i38];
                                                    i38++;
                                                    i28 = i42;
                                                    z20 = z22;
                                                    pVar4 = pVar8;
                                                }
                                                pVar5 = pVar4;
                                                long jU12 = y.U(j25, 1000000L, pVarA.f42184d, RoundingMode.DOWN);
                                                if (z21) {
                                                    i1.o oVarA5 = pVar5.a();
                                                    oVarA5.f42606s = true;
                                                    pVarA = pVarA.a(new i1.p(oVarA5));
                                                }
                                                rVar = new r(pVarA, jArr13, iArr10, i28, jArr14, iArr11, com.bumptech.glide.c.H(arrayList5), z15, jU12, jArr13.length);
                                                arrayList6 = arrayList6;
                                            } else {
                                                jArr11.getClass();
                                                long j37 = jArr11[0];
                                                for (int i83 = 0; i83 < jArr8.length; i83++) {
                                                    jArr8[i83] = y.U(jArr8[i83] - j37, 1000000L, pVarA.f42183c, RoundingMode.DOWN);
                                                }
                                                rVar2 = new r(pVarA, jArr7, iArr5, i28, jArr8, iArr3, iArrH, z15, y.U(j20 - j37, 1000000L, pVarA.f42183c, RoundingMode.DOWN), i27);
                                            }
                                            arrayList6.add(rVar);
                                        }
                                    }
                                }
                                if (jArr10.length == 1) {
                                }
                                iArr6 = iArr3;
                                i34 = i27;
                                if (i33 == 1) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                iArr7 = new int[jArr10.length];
                                iArr8 = new int[jArr10.length];
                                jArr11.getClass();
                                arrayList4 = arrayList3;
                                i35 = 0;
                                i36 = 0;
                                i37 = 0;
                                z18 = false;
                                while (i37 < jArr10.length) {
                                    iArr12 = iArr8;
                                    i44 = i37;
                                    j27 = jArr11[i44];
                                    if (j27 != j24) {
                                        boolean z26 = z18;
                                        jU5 = y.U(jArr10[i44], pVarA.f42183c, pVarA.f42184d, RoundingMode.DOWN) + j27;
                                        iArr13 = iArr12;
                                        iArr7[i44] = y.f(jArr8, j27, true);
                                        iB = y.b(jArr8, jU5, z17) - 1;
                                        i46 = 0;
                                        while (i45 < jArr8.length) {
                                            if (jArr8[i45] < jU5) {
                                                i46++;
                                                if (i46 > pVar4.f42645p) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                iB = i45;
                                            }
                                        }
                                        iArr13[i44] = iB + 1;
                                        i47 = iArr7[i44];
                                        while (true) {
                                            i48 = iArr7[i44];
                                            if (i48 > 0) {
                                                break;
                                            }
                                            iArr7[i44] = i48 - 1;
                                        }
                                        if (i48 == 0) {
                                            iArr7[i44] = i47;
                                            while (true) {
                                                i50 = iArr7[i44];
                                                if (i50 >= iArr13[i44]) {
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr7[i44] = i50 + 1;
                                            }
                                        }
                                        int i710 = iArr13[i44];
                                        i49 = iArr7[i44];
                                        int i84 = (i710 - i49) + i35;
                                        if (i36 != i49) {
                                            z23 = true;
                                        } else {
                                            z23 = false;
                                        }
                                        z18 = z26 | z23;
                                        i36 = i710;
                                        i35 = i84;
                                    } else {
                                        iArr13 = iArr12;
                                    }
                                    i37 = i44 + 1;
                                    jArr11 = jArr11;
                                    iArr8 = iArr13;
                                    z17 = z17;
                                }
                                iArr9 = iArr8;
                                jArr12 = jArr11;
                                boolean z27 = z18;
                                if (i35 != i34) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                z20 = z27 | z19;
                                if (z20) {
                                    jArr13 = new long[i35];
                                } else {
                                    jArr13 = jArr7;
                                }
                                if (z20) {
                                    iArr10 = new int[i35];
                                } else {
                                    iArr10 = iArr5;
                                }
                                if (z20) {
                                    i28 = 0;
                                }
                                if (z20) {
                                    iArr11 = new int[i35];
                                } else {
                                    iArr11 = iArr6;
                                }
                                if (z20) {
                                    arrayList5 = new ArrayList();
                                } else {
                                    arrayList5 = arrayList4;
                                }
                                jArr14 = new long[i35];
                                i38 = 0;
                                z21 = false;
                                i39 = 0;
                                j25 = 0;
                                while (i38 < jArr10.length) {
                                    j26 = jArr12[i38];
                                    i40 = iArr7[i38];
                                    z22 = z20;
                                    i41 = iArr9[i38];
                                    i1.p pVar9 = pVar4;
                                    if (z22) {
                                        int i85 = i41 - i40;
                                        System.arraycopy(jArr7, i40, jArr13, i39, i85);
                                        System.arraycopy(iArr5, i40, iArr10, i39, i85);
                                        System.arraycopy(iArr6, i40, iArr11, i39, i85);
                                    }
                                    i42 = i28;
                                    while (i40 < i41) {
                                        i43 = i40;
                                        int i86 = i41;
                                        long j38 = pVarA.f42184d;
                                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                                        long jU13 = y.U(j25, 1000000L, j38, roundingMode3);
                                        jU4 = y.U(jArr8[i43] - j26, 1000000L, pVarA.f42183c, roundingMode3);
                                        if (jU4 < 0) {
                                            z21 = true;
                                        }
                                        jArr14[i39] = jU13 + jU4;
                                        if (z22) {
                                            i42 = iArr5[i43];
                                        }
                                        if (!z22) {
                                        }
                                        i39++;
                                        i40 = i43 + 1;
                                        i41 = i86;
                                    }
                                    j25 += jArr10[i38];
                                    i38++;
                                    i28 = i42;
                                    z20 = z22;
                                    pVar4 = pVar9;
                                }
                                pVar5 = pVar4;
                                long jU14 = y.U(j25, 1000000L, pVarA.f42184d, RoundingMode.DOWN);
                                if (z21) {
                                    i1.o oVarA6 = pVar5.a();
                                    oVarA6.f42606s = true;
                                    pVarA = pVarA.a(new i1.p(oVarA6));
                                }
                                rVar = new r(pVarA, jArr13, iArr10, i28, jArr14, iArr11, com.bumptech.glide.c.H(arrayList5), z15, jU14, jArr13.length);
                                arrayList6 = arrayList6;
                                arrayList6.add(rVar);
                            }
                            rVar = rVar2;
                        } else {
                            iD2 = 0;
                        }
                        iD3 = -1;
                        iA = y1Var.a();
                        qVar3 = qVar12;
                        String str8 = pVar7.f42643n;
                        if (iA == -1) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        arrayList2 = new ArrayList();
                        if (qVar11 == null) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z14) {
                            i52 = c6Var.f13048a;
                            jArr15 = new long[i52];
                            iArr14 = new int[i52];
                            while (c6Var.a()) {
                                int i610 = c6Var.f13049b;
                                jArr15[i610] = c6Var.f13051d;
                                iArr14[i610] = c6Var.f13050c;
                            }
                            j29 = iD10;
                            i53 = Segment.SIZE / iA;
                            iG = 0;
                            while (i54 < i52) {
                                iG += y.g(iArr14[i54], i53);
                            }
                            jArr5 = new long[iG];
                            iArr2 = new int[iG];
                            jArrCopyOf = new long[iG];
                            iArr15 = new int[iG];
                            i55 = 0;
                            i56 = 0;
                            i57 = 0;
                            i58 = 0;
                            i59 = 0;
                            while (i55 < i52) {
                                int i711 = iArr14[i55];
                                j30 = jArr15[i55];
                                int i712 = i59;
                                int i713 = i55;
                                iMax = i58;
                                i60 = i712;
                                int i714 = i52;
                                i61 = i711;
                                while (i61 > 0) {
                                    int iMin2 = Math.min(i53, i61);
                                    jArr5[i60] = j30;
                                    int i715 = i61;
                                    int i716 = iA * iMin2;
                                    iArr2[i60] = i716;
                                    iMax = Math.max(iMax, i716);
                                    long j39 = j29;
                                    jArrCopyOf[i60] = j39 * ((long) i56);
                                    iArr15[i60] = 1;
                                    j30 += (long) iArr2[i60];
                                    i56 += iMin2;
                                    i60++;
                                    i57 += i716;
                                    i61 = i715 - iMin2;
                                    j29 = j39;
                                }
                                int i717 = i713 + 1;
                                i59 = i60;
                                i58 = iMax;
                                i55 = i717;
                                i52 = i714;
                            }
                            j20 = ((long) i56) * j29;
                            j21 = i57;
                            if (z12) {
                                jArr5 = new long[0];
                            }
                            if (z12) {
                                iArr2 = new int[0];
                            }
                            if (z12) {
                                jArrCopyOf = new long[0];
                            }
                            if (z12) {
                                iArr15 = new int[0];
                            }
                            i27 = iG;
                            iArr3 = iArr15;
                            i28 = i58;
                        } else {
                            if (z12) {
                                jArr3 = new long[0];
                            } else {
                                jArr3 = new long[sampleCount];
                            }
                            aVar = y1Var;
                            if (z12) {
                                iArr = new int[0];
                            } else {
                                iArr = new int[sampleCount];
                            }
                            int i718 = iD2;
                            if (z12) {
                                jArr4 = new long[0];
                            } else {
                                jArr4 = new long[sampleCount];
                            }
                            if (z12) {
                                iArrCopyOf = new int[0];
                            } else {
                                iArrCopyOf = new int[sampleCount];
                            }
                            i19 = iD;
                            i20 = i718;
                            i21 = iD8;
                            j17 = j11;
                            j18 = j17;
                            j19 = j18;
                            i22 = 0;
                            iM = 0;
                            i23 = 0;
                            iD4 = 0;
                            iM2 = iD10;
                            iD5 = iD9;
                            iD6 = iD3;
                            qVar4 = qVar11;
                            i24 = 0;
                            while (true) {
                                if (i24 < sampleCount) {
                                    i25 = i20;
                                    jArr5 = jArr3;
                                    jArrCopyOf = jArr4;
                                    i26 = i23;
                                    iArr2 = iArr;
                                    break;
                                }
                                zA = true;
                                while (i23 == 0) {
                                    zA = c6Var.a();
                                    if (zA) {
                                        break;
                                        break;
                                    }
                                    j19 = c6Var.f13051d;
                                    i23 = c6Var.f13050c;
                                    i20 = i20;
                                    iM = iM;
                                }
                                i29 = iM;
                                i25 = i20;
                                if (!zA) {
                                    l1.a.s("BoxParsers", "Unexpected end of chunk data");
                                    if (z12) {
                                        jArr5 = jArr3;
                                        jArrCopyOf = jArr4;
                                        sampleCount = i24;
                                        i26 = i23;
                                        iM = i29;
                                        iArr2 = iArr;
                                        break;
                                    }
                                    long[] jArrCopyOf3 = Arrays.copyOf(jArr3, i24);
                                    int[] iArrCopyOf3 = Arrays.copyOf(iArr, i24);
                                    jArr5 = jArrCopyOf3;
                                    jArrCopyOf = Arrays.copyOf(jArr4, i24);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i24);
                                    sampleCount = i24;
                                    i26 = i23;
                                    iArr2 = iArrCopyOf3;
                                    iM = i29;
                                    break;
                                }
                                iM = i29;
                                if (qVar3 != null) {
                                    while (iD4 == 0) {
                                        iD4 = qVar3.D();
                                        iM = qVar3.m();
                                        i19--;
                                    }
                                    iD4--;
                                }
                                nextSampleSize = aVar.readNextSampleSize();
                                int i719 = sampleCount;
                                iArr4 = iArr;
                                long j310 = nextSampleSize;
                                j18 += j310;
                                if (nextSampleSize > i22) {
                                    i22 = nextSampleSize;
                                }
                                if (z12) {
                                    jArr3[i24] = j19;
                                    iArr4[i24] = nextSampleSize;
                                    i30 = i22;
                                    jArr6 = jArr3;
                                    jArr4[i24] = j17 + ((long) iM);
                                    if (qVar4 == null) {
                                        i32 = 1;
                                    } else {
                                        i32 = 0;
                                    }
                                    iArrCopyOf[i24] = i32;
                                    if (i24 == iD6) {
                                        iArrCopyOf[i24] = 1;
                                        arrayList2.add(Integer.valueOf(i24));
                                    }
                                } else {
                                    i30 = i22;
                                    jArr6 = jArr3;
                                }
                                if (qVar4 != null) {
                                    i31 = i25 - 1;
                                    if (i31 > 0) {
                                        i25 = i31;
                                        iD6 = qVar4.D() - 1;
                                    } else {
                                        i25 = i31;
                                    }
                                }
                                j17 += (long) iM2;
                                iD5--;
                                if (iD5 != 0) {
                                }
                                j19 += j310;
                                i23--;
                                i24++;
                                jArr3 = jArr6;
                                sampleCount = i719;
                                i20 = i25;
                                i22 = i30;
                                iArr = iArr4;
                            }
                            long j311 = j17 + ((long) iM);
                            if (qVar3 != null) {
                                z16 = true;
                                break;
                            }
                            while (true) {
                                if (i19 > 0) {
                                    z16 = true;
                                    break;
                                }
                                if (qVar3.D() != 0) {
                                    z16 = false;
                                    break;
                                }
                                qVar3.m();
                                i19--;
                            }
                            if (i25 == 0) {
                                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                l1.d.o(sb3, pVarA.f42181a, ": remainingSynchronizationSamples ", i25, ", remainingSamplesAtTimestampDelta ");
                                l1.d.o(sb3, iD5, ", remainingSamplesInChunk ", i26, ", remainingTimestampDeltaChanges ");
                                sb3.append(i21);
                                sb3.append(", remainingSamplesAtTimestampOffset ");
                                sb3.append(iD4);
                                if (z16) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb3.append(str2);
                                l1.a.s("BoxParsers", sb3.toString());
                            } else {
                                StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
                                l1.d.o(sb4, pVarA.f42181a, ": remainingSynchronizationSamples ", i25, ", remainingSamplesAtTimestampDelta ");
                                l1.d.o(sb4, iD5, ", remainingSamplesInChunk ", i26, ", remainingTimestampDeltaChanges ");
                                sb4.append(i21);
                                sb4.append(", remainingSamplesAtTimestampOffset ");
                                sb4.append(iD4);
                                if (z16) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb4.append(str2);
                                l1.a.s("BoxParsers", sb4.toString());
                            }
                            i27 = sampleCount;
                            iArr3 = iArrCopyOf;
                            i28 = i22;
                            j20 = j311;
                            j21 = j18;
                        }
                        jArr7 = jArr5;
                        iArr5 = iArr2;
                        jArr8 = jArrCopyOf;
                        j22 = pVarA.f42186f;
                        if (j22 > j11) {
                            jU7 = y.U(j21 * 8, 1000000L, j22, RoundingMode.HALF_DOWN);
                            if (jU7 > j11) {
                                i1.o oVarA7 = pVar7.a();
                                oVarA7.f42596h = (int) jU7;
                                pVarA = pVarA.a(new i1.p(oVarA7));
                            }
                        }
                        i33 = pVarA.f42182b;
                        j23 = pVarA.f42183c;
                        pVar4 = pVarA.f42187g;
                        jArr9 = pVarA.f42190j;
                        jArr10 = pVarA.f42189i;
                        RoundingMode roundingMode4 = RoundingMode.DOWN;
                        jU3 = y.U(j20, 1000000L, j23, roundingMode4);
                        iArrH = com.bumptech.glide.c.H(arrayList2);
                        if (jArr10 == null) {
                            if (!z12) {
                                y.T(jArr8, j23);
                            }
                            rVar2 = new r(pVarA, jArr7, iArr5, i28, jArr8, iArr3, iArrH, z15, jU3, i27);
                        } else if (z12) {
                            jArr9.getClass();
                            if (jArr10.length == 1) {
                                j28 = j11;
                                while (i51 < jArr10.length) {
                                    if (jArr9[i51] != -1) {
                                        j28 += jArr10[i51];
                                    }
                                }
                                jU6 = y.U(j28, 1000000L, pVarA.f42184d, RoundingMode.DOWN);
                            } else {
                                j28 = j11;
                                while (i51 < jArr10.length) {
                                    if (jArr9[i51] != -1) {
                                        j28 += jArr10[i51];
                                    }
                                }
                                jU6 = y.U(j28, 1000000L, pVarA.f42184d, RoundingMode.DOWN);
                            }
                            rVar2 = new r(pVarA, jArr7, iArr5, i28, jArr8, iArr3, iArrH, z15, jU6, i27);
                        } else {
                            jArr11 = jArr9;
                            if (jArr10.length == 1) {
                                arrayList3 = arrayList2;
                                j24 = -1;
                                if (jArr10.length == 1) {
                                }
                                iArr6 = iArr3;
                                i34 = i27;
                                if (i33 == 1) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                iArr7 = new int[jArr10.length];
                                iArr8 = new int[jArr10.length];
                                jArr11.getClass();
                                arrayList4 = arrayList3;
                                i35 = 0;
                                i36 = 0;
                                i37 = 0;
                                z18 = false;
                                while (i37 < jArr10.length) {
                                    iArr12 = iArr8;
                                    i44 = i37;
                                    j27 = jArr11[i44];
                                    if (j27 != j24) {
                                        boolean z28 = z18;
                                        jU5 = y.U(jArr10[i44], pVarA.f42183c, pVarA.f42184d, RoundingMode.DOWN) + j27;
                                        iArr13 = iArr12;
                                        iArr7[i44] = y.f(jArr8, j27, true);
                                        iB = y.b(jArr8, jU5, z17) - 1;
                                        i46 = 0;
                                        while (i45 < jArr8.length) {
                                            if (jArr8[i45] < jU5) {
                                                i46++;
                                                if (i46 > pVar4.f42645p) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                iB = i45;
                                            }
                                        }
                                        iArr13[i44] = iB + 1;
                                        i47 = iArr7[i44];
                                        while (true) {
                                            i48 = iArr7[i44];
                                            if (i48 > 0) {
                                                break;
                                                break;
                                            }
                                            iArr7[i44] = i48 - 1;
                                        }
                                        if (i48 == 0) {
                                            iArr7[i44] = i47;
                                            while (true) {
                                                i50 = iArr7[i44];
                                                if (i50 >= iArr13[i44]) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr7[i44] = i50 + 1;
                                            }
                                        }
                                        int i7110 = iArr13[i44];
                                        i49 = iArr7[i44];
                                        int i87 = (i7110 - i49) + i35;
                                        if (i36 != i49) {
                                            z23 = true;
                                        } else {
                                            z23 = false;
                                        }
                                        z18 = z28 | z23;
                                        i36 = i7110;
                                        i35 = i87;
                                    } else {
                                        iArr13 = iArr12;
                                    }
                                    i37 = i44 + 1;
                                    jArr11 = jArr11;
                                    iArr8 = iArr13;
                                    z17 = z17;
                                }
                                iArr9 = iArr8;
                                jArr12 = jArr11;
                                boolean z29 = z18;
                                if (i35 != i34) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                z20 = z29 | z19;
                                if (z20) {
                                    jArr13 = new long[i35];
                                } else {
                                    jArr13 = jArr7;
                                }
                                if (z20) {
                                    iArr10 = new int[i35];
                                } else {
                                    iArr10 = iArr5;
                                }
                                if (z20) {
                                    i28 = 0;
                                }
                                if (z20) {
                                    iArr11 = new int[i35];
                                } else {
                                    iArr11 = iArr6;
                                }
                                if (z20) {
                                    arrayList5 = new ArrayList();
                                } else {
                                    arrayList5 = arrayList4;
                                }
                                jArr14 = new long[i35];
                                i38 = 0;
                                z21 = false;
                                i39 = 0;
                                j25 = 0;
                                while (i38 < jArr10.length) {
                                    j26 = jArr12[i38];
                                    i40 = iArr7[i38];
                                    z22 = z20;
                                    i41 = iArr9[i38];
                                    i1.p pVar10 = pVar4;
                                    if (z22) {
                                        int i88 = i41 - i40;
                                        System.arraycopy(jArr7, i40, jArr13, i39, i88);
                                        System.arraycopy(iArr5, i40, iArr10, i39, i88);
                                        System.arraycopy(iArr6, i40, iArr11, i39, i88);
                                    }
                                    i42 = i28;
                                    while (i40 < i41) {
                                        i43 = i40;
                                        int i89 = i41;
                                        long j312 = pVarA.f42184d;
                                        RoundingMode roundingMode5 = RoundingMode.DOWN;
                                        long jU15 = y.U(j25, 1000000L, j312, roundingMode5);
                                        jU4 = y.U(jArr8[i43] - j26, 1000000L, pVarA.f42183c, roundingMode5);
                                        if (jU4 < 0) {
                                            z21 = true;
                                        }
                                        jArr14[i39] = jU15 + jU4;
                                        if (z22) {
                                            i42 = iArr5[i43];
                                        }
                                        if (!z22) {
                                        }
                                        i39++;
                                        i40 = i43 + 1;
                                        i41 = i89;
                                    }
                                    j25 += jArr10[i38];
                                    i38++;
                                    i28 = i42;
                                    z20 = z22;
                                    pVar4 = pVar10;
                                }
                                pVar5 = pVar4;
                                long jU16 = y.U(j25, 1000000L, pVarA.f42184d, RoundingMode.DOWN);
                                if (z21) {
                                    i1.o oVarA8 = pVar5.a();
                                    oVarA8.f42606s = true;
                                    pVarA = pVarA.a(new i1.p(oVarA8));
                                }
                                rVar = new r(pVarA, jArr13, iArr10, i28, jArr14, iArr11, com.bumptech.glide.c.H(arrayList5), z15, jU16, jArr13.length);
                                arrayList6 = arrayList6;
                                arrayList6.add(rVar);
                            } else {
                                arrayList3 = arrayList2;
                                j24 = -1;
                                if (jArr10.length == 1) {
                                }
                                iArr6 = iArr3;
                                i34 = i27;
                                if (i33 == 1) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                iArr7 = new int[jArr10.length];
                                iArr8 = new int[jArr10.length];
                                jArr11.getClass();
                                arrayList4 = arrayList3;
                                i35 = 0;
                                i36 = 0;
                                i37 = 0;
                                z18 = false;
                                while (i37 < jArr10.length) {
                                    iArr12 = iArr8;
                                    i44 = i37;
                                    j27 = jArr11[i44];
                                    if (j27 != j24) {
                                        boolean z210 = z18;
                                        jU5 = y.U(jArr10[i44], pVarA.f42183c, pVarA.f42184d, RoundingMode.DOWN) + j27;
                                        iArr13 = iArr12;
                                        iArr7[i44] = y.f(jArr8, j27, true);
                                        iB = y.b(jArr8, jU5, z17) - 1;
                                        i46 = 0;
                                        while (i45 < jArr8.length) {
                                            if (jArr8[i45] < jU5) {
                                                i46++;
                                                if (i46 > pVar4.f42645p) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                iB = i45;
                                            }
                                        }
                                        iArr13[i44] = iB + 1;
                                        i47 = iArr7[i44];
                                        while (true) {
                                            i48 = iArr7[i44];
                                            if (i48 > 0) {
                                                break;
                                                break;
                                            }
                                            iArr7[i44] = i48 - 1;
                                        }
                                        if (i48 == 0) {
                                            iArr7[i44] = i47;
                                            while (true) {
                                                i50 = iArr7[i44];
                                                if (i50 >= iArr13[i44]) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr7[i44] = i50 + 1;
                                            }
                                        }
                                        int i7111 = iArr13[i44];
                                        i49 = iArr7[i44];
                                        int i810 = (i7111 - i49) + i35;
                                        if (i36 != i49) {
                                            z23 = true;
                                        } else {
                                            z23 = false;
                                        }
                                        z18 = z210 | z23;
                                        i36 = i7111;
                                        i35 = i810;
                                    } else {
                                        iArr13 = iArr12;
                                    }
                                    i37 = i44 + 1;
                                    jArr11 = jArr11;
                                    iArr8 = iArr13;
                                    z17 = z17;
                                }
                                iArr9 = iArr8;
                                jArr12 = jArr11;
                                boolean z211 = z18;
                                if (i35 != i34) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                z20 = z211 | z19;
                                if (z20) {
                                    jArr13 = new long[i35];
                                } else {
                                    jArr13 = jArr7;
                                }
                                if (z20) {
                                    iArr10 = new int[i35];
                                } else {
                                    iArr10 = iArr5;
                                }
                                if (z20) {
                                    i28 = 0;
                                }
                                if (z20) {
                                    iArr11 = new int[i35];
                                } else {
                                    iArr11 = iArr6;
                                }
                                if (z20) {
                                    arrayList5 = new ArrayList();
                                } else {
                                    arrayList5 = arrayList4;
                                }
                                jArr14 = new long[i35];
                                i38 = 0;
                                z21 = false;
                                i39 = 0;
                                j25 = 0;
                                while (i38 < jArr10.length) {
                                    j26 = jArr12[i38];
                                    i40 = iArr7[i38];
                                    z22 = z20;
                                    i41 = iArr9[i38];
                                    i1.p pVar11 = pVar4;
                                    if (z22) {
                                        int i811 = i41 - i40;
                                        System.arraycopy(jArr7, i40, jArr13, i39, i811);
                                        System.arraycopy(iArr5, i40, iArr10, i39, i811);
                                        System.arraycopy(iArr6, i40, iArr11, i39, i811);
                                    }
                                    i42 = i28;
                                    while (i40 < i41) {
                                        i43 = i40;
                                        int i812 = i41;
                                        long j313 = pVarA.f42184d;
                                        RoundingMode roundingMode6 = RoundingMode.DOWN;
                                        long jU17 = y.U(j25, 1000000L, j313, roundingMode6);
                                        jU4 = y.U(jArr8[i43] - j26, 1000000L, pVarA.f42183c, roundingMode6);
                                        if (jU4 < 0) {
                                            z21 = true;
                                        }
                                        jArr14[i39] = jU17 + jU4;
                                        if (z22) {
                                            i42 = iArr5[i43];
                                        }
                                        if (!z22) {
                                        }
                                        i39++;
                                        i40 = i43 + 1;
                                        i41 = i812;
                                    }
                                    j25 += jArr10[i38];
                                    i38++;
                                    i28 = i42;
                                    z20 = z22;
                                    pVar4 = pVar11;
                                }
                                pVar5 = pVar4;
                                long jU18 = y.U(j25, 1000000L, pVarA.f42184d, RoundingMode.DOWN);
                                if (z21) {
                                    i1.o oVarA9 = pVar5.a();
                                    oVarA9.f42606s = true;
                                    pVarA = pVarA.a(new i1.p(oVarA9));
                                }
                                rVar = new r(pVarA, jArr13, iArr10, i28, jArr14, iArr11, com.bumptech.glide.c.H(arrayList5), z15, jU18, jArr13.length);
                                arrayList6 = arrayList6;
                                arrayList6.add(rVar);
                            }
                        }
                        rVar = rVar2;
                    }
                    arrayList6.add(rVar);
                }
            }
            i62 = i11 + 1;
            cVar2 = cVar;
            arrayList6 = arrayList6;
        }
        return arrayList6;
    }

    /* JADX WARN: Code duplicated, block: B:198:0x0327  */
    /* JADX WARN: Code duplicated, block: B:201:0x032c A[EDGE_INSN: B:201:0x032c->B:204:0x034c BREAK  A[LOOP:4: B:162:0x02b8->B:202:0x033e]] */
    public static c0 k(m1.d dVar) {
        int i10;
        boolean z10;
        c0 c0Var;
        c0 c0Var2;
        int iA;
        c0 c0Var3;
        Object objJ;
        l1.q qVar = dVar.f45776c;
        int i11 = 8;
        qVar.M(8);
        boolean z11 = false;
        c0 c0Var4 = new c0(new b0[0]);
        while (qVar.a() >= i11) {
            int i12 = qVar.f44814b;
            int iM = qVar.m();
            int iM2 = qVar.m();
            String str = null;
            if (iM2 == 1835365473) {
                qVar.M(i12);
                int i13 = i12 + iM;
                qVar.N(i11);
                a(qVar);
                while (true) {
                    int i14 = qVar.f44814b;
                    if (i14 < i13) {
                        int iM3 = qVar.m();
                        if (qVar.m() == 1768715124) {
                            qVar.M(i14);
                            int i15 = i14 + iM3;
                            qVar.N(i11);
                            ArrayList arrayList = new ArrayList();
                            while (true) {
                                int i16 = qVar.f44814b;
                                if (i16 >= i15) {
                                    break;
                                }
                                int iM4 = qVar.m() + i16;
                                int iM5 = qVar.m();
                                int i17 = (iM5 >> 24) & 255;
                                if (i17 == 169 || i17 == 253) {
                                    int i18 = 16777215 & iM5;
                                    if (i18 == 6516084) {
                                        objJ = o.d(iM5, qVar);
                                    } else if (i18 == 7233901 || i18 == 7631467) {
                                        objJ = o.j(iM5, "TIT2", qVar);
                                    } else if (i18 == 6516589 || i18 == 7828084) {
                                        objJ = o.j(iM5, "TCOM", qVar);
                                    } else if (i18 == 6578553) {
                                        objJ = o.j(iM5, "TDRC", qVar);
                                    } else if (i18 == 4280916) {
                                        objJ = o.j(iM5, "TPE1", qVar);
                                    } else if (i18 == 7630703) {
                                        objJ = o.j(iM5, "TSSE", qVar);
                                    } else if (i18 == 6384738) {
                                        objJ = o.j(iM5, "TALB", qVar);
                                    } else if (i18 == 7108978) {
                                        objJ = o.j(iM5, "USLT", qVar);
                                    } else if (i18 == 6776174) {
                                        objJ = o.j(iM5, "TCON", qVar);
                                    } else if (i18 == 6779504) {
                                        objJ = o.j(iM5, "TIT1", qVar);
                                    } else if (i18 == 7173742) {
                                        objJ = o.j(iM5, "MVNM", qVar);
                                    } else if (i18 == 7173737) {
                                        objJ = o.h(iM5, "MVIN", qVar, true, false);
                                    } else {
                                        l1.a.d("MetadataUtil", "Skipped unknown metadata entry: " + z01.b(iM5));
                                        qVar.M(iM4);
                                        objJ = null;
                                    }
                                    qVar.M(iM4);
                                } else {
                                    if (iM5 == 1735291493) {
                                        try {
                                            String strA = b3.k.a(o.g(qVar) - 1);
                                            if (strA != null) {
                                                objJ = new b3.o("TCON", str, j0.B(strA));
                                            } else {
                                                l1.a.s("MetadataUtil", "Failed to parse standard genre code");
                                                objJ = str;
                                            }
                                        } catch (Throwable th2) {
                                            qVar.M(iM4);
                                            throw th2;
                                        }
                                    } else if (iM5 == 1684632427) {
                                        objJ = o.f(iM5, "TPOS", qVar);
                                    } else if (iM5 == 1953655662) {
                                        objJ = o.f(iM5, "TRCK", qVar);
                                    } else if (iM5 == 1953329263) {
                                        objJ = o.h(iM5, "TBPM", qVar, true, z11);
                                    } else if (iM5 == 1668311404) {
                                        objJ = o.h(iM5, "TCMP", qVar, true, true);
                                    } else if (iM5 == 1668249202) {
                                        objJ = o.e(qVar);
                                    } else if (iM5 == 1631670868) {
                                        objJ = o.j(iM5, "TPE2", qVar);
                                    } else if (iM5 == 1936682605) {
                                        objJ = o.j(iM5, "TSOT", qVar);
                                    } else if (iM5 == 1936679276) {
                                        objJ = o.j(iM5, "TSOA", qVar);
                                    } else if (iM5 == 1936679282) {
                                        objJ = o.j(iM5, "TSOP", qVar);
                                    } else if (iM5 == 1936679265) {
                                        objJ = o.j(iM5, "TSO2", qVar);
                                    } else if (iM5 == 1936679791) {
                                        objJ = o.j(iM5, "TSOC", qVar);
                                    } else if (iM5 == 1920233063) {
                                        objJ = o.h(iM5, "ITUNESADVISORY", qVar, z11, z11);
                                    } else if (iM5 == 1885823344) {
                                        objJ = o.h(iM5, "ITUNESGAPLESS", qVar, z11, true);
                                    } else if (iM5 == 1936683886) {
                                        objJ = o.j(iM5, "TVSHOWSORT", qVar);
                                    } else if (iM5 == 1953919848) {
                                        objJ = o.j(iM5, "TVSHOW", qVar);
                                    } else if (iM5 == 757935405) {
                                        String strV = str;
                                        String strV2 = strV;
                                        int i19 = -1;
                                        int i20 = -1;
                                        while (true) {
                                            int i21 = qVar.f44814b;
                                            if (i21 >= iM4) {
                                                break;
                                            }
                                            int iM6 = qVar.m();
                                            int iM7 = qVar.m();
                                            qVar.N(4);
                                            if (iM7 == 1835360622) {
                                                strV = qVar.v(iM6 - 12);
                                            } else if (iM7 == 1851878757) {
                                                strV2 = qVar.v(iM6 - 12);
                                            } else {
                                                if (iM7 == 1684108385) {
                                                    i19 = i21;
                                                    i20 = iM6;
                                                }
                                                qVar.N(iM6 - 12);
                                            }
                                        }
                                        if (strV == null || strV2 == null || i19 == -1) {
                                            objJ = null;
                                        } else {
                                            qVar.M(i19);
                                            qVar.N(16);
                                            objJ = new b3.l(strV, strV2, qVar.v(i20 - 16));
                                        }
                                        qVar.M(iM4);
                                    } else {
                                        l1.a.d("MetadataUtil", "Skipped unknown metadata entry: " + z01.b(iM5));
                                        qVar.M(iM4);
                                        objJ = null;
                                    }
                                    qVar.M(iM4);
                                }
                                if (objJ != null) {
                                    arrayList.add(objJ);
                                }
                                z11 = false;
                                str = null;
                            }
                            if (!arrayList.isEmpty()) {
                                c0Var3 = new c0(arrayList);
                                break;
                            }
                            break;
                        }
                        qVar.M(i14 + iM3);
                        i11 = 8;
                        z11 = false;
                        str = null;
                    }
                    c0Var3 = null;
                    break;
                }
                c0Var4 = c0Var4.b(c0Var3);
                i10 = 8;
            } else if (iM2 == 1936553057) {
                qVar.M(i12);
                int i22 = i12 + iM;
                qVar.N(12);
                while (true) {
                    int i23 = qVar.f44814b;
                    if (i23 < i22) {
                        int iM8 = qVar.m();
                        if (qVar.m() == 1935766900) {
                            if (iM8 >= 16) {
                                qVar.N(4);
                                int i24 = -1;
                                int i25 = 0;
                                for (int i26 = 0; i26 < 2; i26++) {
                                    int iZ = qVar.z();
                                    int iZ2 = qVar.z();
                                    if (iZ == 0) {
                                        i24 = iZ2;
                                    } else if (iZ == 1) {
                                        i25 = iZ2;
                                    }
                                }
                                if (i24 != 12) {
                                    if (i24 != 13) {
                                        if (i24 != 21) {
                                            iA = -2147483647;
                                        } else {
                                            i10 = 8;
                                            if (qVar.a() < 8 || qVar.f44814b + 8 > i22) {
                                                iA = -2147483647;
                                            } else {
                                                int iM9 = qVar.m();
                                                int iM10 = qVar.m();
                                                if (iM9 < 12 || iM10 != 1936877170) {
                                                    iA = -2147483647;
                                                } else {
                                                    iA = qVar.A();
                                                }
                                            }
                                        }
                                        if (iA == -2147483647) {
                                            c0Var2 = new c0(new c3.c(iA, i25));
                                            break;
                                        }
                                        break;
                                    }
                                    iA = 120;
                                } else {
                                    iA = PsExtractor.VIDEO_STREAM_MASK;
                                }
                                i10 = 8;
                                if (iA == -2147483647) {
                                    c0Var2 = new c0(new c3.c(iA, i25));
                                    break;
                                }
                                break;
                            }
                            c0Var2 = null;
                            i10 = 8;
                            break;
                        }
                        qVar.M(i23 + iM8);
                    } else {
                        i10 = 8;
                    }
                    c0Var2 = null;
                    break;
                }
                c0Var4 = c0Var4.b(c0Var2);
            } else {
                i10 = 8;
                if (iM2 == -1451722374) {
                    short sW = qVar.w();
                    qVar.N(2);
                    String strX = qVar.x(sW, StandardCharsets.UTF_8);
                    int iMax = Math.max(strX.lastIndexOf(43), strX.lastIndexOf(45));
                    try {
                        try {
                            m1.e eVar = new m1.e(Float.parseFloat(strX.substring(0, iMax)), Float.parseFloat(strX.substring(iMax, strX.length() - 1)));
                            b0[] b0VarArr = new b0[1];
                            z10 = false;
                            try {
                                b0VarArr[0] = eVar;
                                c0Var = new c0(b0VarArr);
                            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                c0Var = null;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                            z10 = false;
                        }
                    } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                        z10 = false;
                    }
                    c0Var4 = c0Var4.b(c0Var);
                }
                qVar.M(i12 + iM);
                i11 = i10;
                z11 = z10;
            }
            z10 = false;
            qVar.M(i12 + iM);
            i11 = i10;
            z11 = z10;
        }
        return c0Var4;
    }
}
