package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.applovin.shadow.okio.Segment;
import com.ironsource.Xa;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f14774a;

    static {
        String str = uu0.f20901a;
        f14774a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int a(int i10) {
        return (i10 >> 24) & 255;
    }

    /* JADX WARN: Code duplicated, block: B:663:0x1008  */
    /* JADX WARN: Code duplicated, block: B:71:0x0146  */
    /* JADX WARN: Code duplicated, block: B:72:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x014a  */
    /* JADX WARN: Code duplicated, block: B:74:0x014c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x014e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0151  */
    /* JADX WARN: Code duplicated, block: B:80:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x015c  */
    /* JADX WARN: Code duplicated, block: B:82:0x015f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0162  */
    /* JADX WARN: Code duplicated, block: B:85:0x0165  */
    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(j01 j01Var, v2 v2Var, long j10, g02 g02Var, boolean z10, boolean z11, d81 d81Var) {
        int i10;
        long jP;
        int i11;
        int i12;
        boolean z12;
        int i13;
        long j11;
        long jV;
        long jV2;
        String str;
        long j12;
        Object obj;
        ArrayList arrayList;
        int i14;
        j01 j01Var2;
        int iB;
        ec1 ec1Var;
        ec1 ec1Var2;
        boolean z13;
        w6 w6Var;
        s8 s8Var;
        j01 j01VarH;
        Pair pairH;
        w01 w01VarG;
        g02 g02VarA;
        String str2;
        j01 j01Var3;
        String str3;
        String str4;
        int i15;
        String str5;
        byte[] bArrArray;
        int i16;
        String str6;
        uw uwVar;
        k3 k3Var;
        int i17;
        boolean z14;
        int i18;
        String str7;
        boolean z15;
        uw uwVar2;
        boolean z16;
        boolean z17;
        String str8;
        long j13;
        ya1 ya1VarU;
        boolean z18;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        int i19 = 0;
        while (true) {
            ArrayList arrayList4 = j01Var.f15891e;
            if (i19 >= arrayList4.size()) {
                return arrayList3;
            }
            j01 j01Var4 = (j01) arrayList4.get(i19);
            if (j01Var4.f22444b != 1953653099) {
                arrayList2 = arrayList3;
                i14 = i19;
            } else {
                w01 w01VarG2 = j01Var.g(1836476516);
                w01VarG2.getClass();
                j01 j01VarH2 = j01Var4.h(1835297121);
                j01VarH2.getClass();
                w01 w01VarG3 = j01VarH2.g(1751411826);
                w01VarG3.getClass();
                np0 np0Var = w01VarG3.f21353c;
                np0Var.E(16);
                int iB2 = np0Var.b();
                int i20 = 1;
                if (iB2 == 1936684398) {
                    i10 = 1;
                } else if (iB2 == 1986618469) {
                    i10 = 2;
                } else if (iB2 == 1952807028 || iB2 == 1935832172 || iB2 == 1937072756 || iB2 == 1668047728 || iB2 == 1937072752) {
                    i10 = 3;
                } else {
                    i10 = iB2 == 1835365473 ? 5 : -1;
                }
                int i21 = 0;
                if (i10 == -1) {
                    arrayList = arrayList3;
                    i14 = i19;
                    j01Var2 = j01Var4;
                    w6Var = null;
                } else {
                    w01 w01VarG4 = j01Var4.g(1953196132);
                    w01VarG4.getClass();
                    np0 np0Var2 = w01VarG4.f21353c;
                    np0Var2.E(8);
                    int iA = a(np0Var2.b());
                    np0Var2.G(iA == 0 ? 8 : 16);
                    int iB3 = np0Var2.b();
                    np0Var2.G(4);
                    int i22 = np0Var2.f17881b;
                    int i23 = 0;
                    while (true) {
                        int i24 = iA == 0 ? 4 : 8;
                        int i25 = i22;
                        if (i23 >= i24) {
                            np0Var2.G(i24);
                        } else {
                            if (np0Var2.f17880a[i25 + i23] != -1) {
                                jP = iA == 0 ? np0Var2.P() : np0Var2.j();
                                if (jP != 0) {
                                    break;
                                }
                                break;
                            }
                            i23++;
                            i22 = i25;
                        }
                        jP = C.TIME_UNSET;
                        break;
                    }
                    np0Var2.G(10);
                    int iL = np0Var2.L();
                    np0Var2.G(4);
                    int iB4 = np0Var2.b();
                    long j14 = C.TIME_UNSET;
                    int iB5 = np0Var2.b();
                    np0Var2.G(4);
                    int iB6 = np0Var2.b();
                    int iB7 = np0Var2.b();
                    if (iB4 != 0) {
                        if (iB4 == 0) {
                            if (iB5 == -65536) {
                                if (iB6 != 65536) {
                                    if (iB6 == -65536) {
                                        if (iB7 == 0) {
                                            z12 = false;
                                        } else {
                                            z12 = true;
                                        }
                                        iB6 = -65536;
                                    }
                                    iB5 = -65536;
                                } else if (iB7 == 0) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                                if (true != z12) {
                                    i13 = 270;
                                    i12 = i13;
                                    i20 = 1;
                                }
                                iB5 = -65536;
                            }
                            i11 = 0;
                        } else {
                            i11 = iB4;
                        }
                        i12 = ((i11 != -65536 || i11 == 65536) && iB5 == 0 && iB6 == 0 && iB7 == -65536) ? 180 : 0;
                    } else {
                        if (iB5 == 65536) {
                            if (iB6 != -65536) {
                                if (iB6 == 65536) {
                                    z18 = iB7 != 0;
                                    iB6 = 65536;
                                }
                                iB5 = 65536;
                            } else {
                                z18 = iB7 != 0;
                            }
                            if (true != z18) {
                                i13 = 90;
                            } else {
                                iB5 = 65536;
                            }
                            i12 = i13;
                            i20 = 1;
                        }
                        iB4 = 0;
                        if (iB4 == 0) {
                            if (iB5 == -65536) {
                                if (iB6 != 65536) {
                                    if (iB6 == -65536) {
                                        if (iB7 == 0) {
                                            z12 = false;
                                        } else {
                                            z12 = true;
                                        }
                                        iB6 = -65536;
                                    }
                                    iB5 = -65536;
                                } else if (iB7 == 0) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                                if (true != z12) {
                                    i13 = 270;
                                    i12 = i13;
                                    i20 = 1;
                                }
                                iB5 = -65536;
                            }
                            i11 = 0;
                        } else {
                            i11 = iB4;
                        }
                        if (i11 != -65536) {
                        }
                    }
                    np0Var2.G(16);
                    short sN = np0Var2.N();
                    np0Var2.G(2);
                    short sN2 = np0Var2.N();
                    long j15 = j10 == C.TIME_UNSET ? jP : j10;
                    long j16 = d(w01VarG2.f21353c).f13373c;
                    if (j15 == C.TIME_UNSET) {
                        j11 = j16;
                        jV = -9223372036854775807L;
                    } else {
                        j11 = j16;
                        jV = uu0.v(j15, 1000000L, j11, RoundingMode.DOWN);
                    }
                    j01 j01VarH3 = j01VarH2.h(1835626086);
                    j01VarH3.getClass();
                    j01 j01VarH4 = j01VarH3.h(1937007212);
                    j01VarH4.getClass();
                    w01 w01VarG5 = j01VarH2.g(1835296868);
                    w01VarG5.getClass();
                    np0 np0Var3 = w01VarG5.f21353c;
                    np0Var3.E(8);
                    int iA2 = a(np0Var3.b());
                    np0Var3.G(iA2 == 0 ? 8 : 16);
                    long jP2 = np0Var3.P();
                    int i26 = np0Var3.f17881b;
                    int i27 = 0;
                    while (true) {
                        int i28 = iA2 == 0 ? 4 : 8;
                        if (i27 >= i28) {
                            np0Var3.G(i28);
                            jV2 = -9223372036854775807L;
                            break;
                        }
                        int i29 = i27;
                        if (np0Var3.f17880a[i26 + i27] != -1) {
                            long jP3 = iA2 == 0 ? np0Var3.P() : np0Var3.j();
                            if (jP3 != 0) {
                                jV2 = uu0.v(jP3, 1000000L, jP2, RoundingMode.DOWN);
                                break;
                            }
                            jV2 = -9223372036854775807L;
                            break;
                        }
                        i27 = i29 + 1;
                        i26 = i26;
                    }
                    int iL2 = np0Var3.L();
                    char c4 = (char) (((iL2 >> 10) & 31) + 96);
                    char c5 = (char) (((iL2 >> 5) & 31) + 96);
                    char c10 = (char) ((iL2 & 31) + 96);
                    int i30 = 3;
                    char[] cArr = new char[3];
                    cArr[0] = c4;
                    cArr[i20] = c5;
                    char c11 = 2;
                    cArr[2] = c10;
                    int i31 = 0;
                    while (true) {
                        if (i31 >= i30) {
                            str = new String(cArr);
                            break;
                        }
                        char c12 = cArr[i31];
                        if (c12 < 'a' || c12 > 'z') {
                            str = null;
                            break;
                        }
                        i31++;
                        i30 = 3;
                    }
                    w01 w01VarG6 = j01VarH4.g(1937011556);
                    if (w01VarG6 == null) {
                        v71.y("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                        arrayList = arrayList3;
                        i14 = i19;
                        j01Var2 = j01Var4;
                        w6Var = null;
                    } else {
                        np0 np0Var4 = w01VarG6.f21353c;
                        np0Var4.E(12);
                        int iB8 = np0Var4.b();
                        char c13 = '\f';
                        String str9 = "BoxParsers";
                        k3 k3Var2 = new k3(iB8, i20);
                        int i32 = i10;
                        int i33 = 0;
                        while (true) {
                            j12 = jV;
                            obj = k3Var2.f16295c;
                            if (i33 >= iB8) {
                                break;
                            }
                            int i34 = np0Var4.f17881b;
                            int iB9 = np0Var4.b();
                            int i35 = i34;
                            String str10 = "childAtomSize must be positive";
                            v71.m("childAtomSize must be positive", iB9 > 0 ? 1 : i21);
                            int iB10 = np0Var4.b();
                            if (iB10 == 1635148593 || iB10 == 1635148595 || iB10 == 1701733238 || iB10 == 1831958048 || iB10 == 1836070006 || iB10 == 1752589105 || iB10 == 1751479857 || iB10 == 1987470129 || iB10 == 1987471665 || iB10 == 1932670515 || iB10 == 1211250227 || iB10 == 1748121139 || iB10 == 1987063864 || iB10 == 1987063865 || iB10 == 1635135537 || iB10 == 1685479798 || iB10 == 1685479729 || iB10 == 1685481573 || iB10 == 1685481521 || iB10 == 1634760241 || iB10 == 1684108849) {
                                sN = sN;
                                int i36 = iB3;
                                iL = iL;
                                iB8 = iB8;
                                arrayList3 = arrayList3;
                                sN2 = sN2;
                                i19 = i19;
                                String str11 = str9;
                                i32 = i32;
                                j12 = j12;
                                int i37 = iB9;
                                int i38 = i33;
                                i35 = i35;
                                np0Var4 = np0Var4;
                                String str12 = str;
                                np0Var4.E(i35 + 16);
                                np0Var4.G(16);
                                int iL3 = np0Var4.L();
                                int iL4 = np0Var4.L();
                                np0Var4.G(50);
                                int i39 = np0Var4.f17881b;
                                int iIntValue = 1701733238;
                                if (iB10 == 1701733238) {
                                    Pair pairK = k(np0Var4, i35, i37);
                                    if (pairK != null) {
                                        iIntValue = ((Integer) pairK.first).intValue();
                                        g02VarA = g02Var == null ? null : g02Var.a(((x6) pairK.second).f21750b);
                                        ((x6[]) obj)[i38] = (x6) pairK.second;
                                    } else {
                                        i35 = i35;
                                        g02VarA = g02Var;
                                    }
                                    np0Var4.E(i39);
                                } else {
                                    i35 = i35;
                                    iIntValue = iB10;
                                    g02VarA = g02Var;
                                }
                                if (iIntValue == 1831958048) {
                                    str2 = MimeTypes.VIDEO_MPEG;
                                } else if (iIntValue == 1211250227) {
                                    iIntValue = 1211250227;
                                    str2 = MimeTypes.VIDEO_H263;
                                } else {
                                    str2 = null;
                                }
                                g02 g02Var2 = g02VarA;
                                i33 = i38;
                                int i40 = i12;
                                float fH = 1.0f;
                                int i41 = -1;
                                int iC = -1;
                                uw uwVar3 = null;
                                int i42 = 8;
                                int i43 = 8;
                                List listU = null;
                                int i44 = -1;
                                int i45 = -1;
                                int i46 = -1;
                                int i47 = -1;
                                int i48 = -1;
                                boolean z19 = false;
                                ByteBuffer byteBufferOrder = null;
                                String string = null;
                                tf1 tf1VarA = null;
                                byte[] bArrCopyOfRange = null;
                                e1 e1Var = null;
                                d6 d6Var = null;
                                j01Var3 = j01Var4;
                                String str13 = str2;
                                int i49 = -1;
                                while (i39 - i35 < i37) {
                                    np0Var4.E(i39);
                                    int i50 = np0Var4.f17881b;
                                    int iB11 = np0Var4.b();
                                    int i51 = i39;
                                    if (iB11 != 0) {
                                        i16 = iB11;
                                    } else {
                                        if (np0Var4.f17881b - i35 == i37) {
                                            break;
                                        }
                                        i16 = 0;
                                    }
                                    v71.m(str10, i16 > 0);
                                    int iB12 = np0Var4.b();
                                    if (iB12 == 1635148611) {
                                        int i52 = i50 + 8;
                                        v71.m(null, str13 == null);
                                        np0Var4.E(i52);
                                        z1 z1VarB = z1.b(np0Var4);
                                        listU = z1VarB.f22446a;
                                        k3Var2.f16293a = z1VarB.f22447b;
                                        if (z19) {
                                            z17 = true;
                                        } else {
                                            fH = z1VarB.f22456k;
                                            z17 = false;
                                        }
                                        String str14 = z1VarB.l;
                                        int i53 = z1VarB.f22455j;
                                        int i54 = z1VarB.f22452g;
                                        int i55 = z1VarB.f22453h;
                                        int i56 = z1VarB.f22454i;
                                        i44 = i54;
                                        i42 = z1VarB.f22450e;
                                        str6 = str10;
                                        uwVar = uwVar3;
                                        string = str14;
                                        k3Var = k3Var2;
                                        z19 = z17;
                                        i17 = iIntValue;
                                        i43 = z1VarB.f22451f;
                                        iC = i56;
                                        str13 = "video/avc";
                                        i46 = i53;
                                        i49 = i55;
                                    } else {
                                        if (iB12 == 1752589123) {
                                            int i57 = i50 + 8;
                                            v71.m(null, str13 == null);
                                            np0Var4.E(i57);
                                            w2 w2VarB = w2.b(np0Var4, false, null);
                                            listU = w2VarB.f21376a;
                                            k3Var2.f16293a = w2VarB.f21377b;
                                            if (z19) {
                                                z16 = true;
                                            } else {
                                                fH = w2VarB.l;
                                                z16 = false;
                                            }
                                            int i58 = w2VarB.f21387m;
                                            int i59 = w2VarB.f21378c;
                                            String str15 = w2VarB.f21388n;
                                            int i60 = w2VarB.f21386k;
                                            if (i60 == -1) {
                                                i60 = i41;
                                            }
                                            int i61 = w2VarB.f21379d;
                                            int i62 = w2VarB.f21380e;
                                            i44 = w2VarB.f21383h;
                                            int i63 = w2VarB.f21384i;
                                            int i64 = w2VarB.f21385j;
                                            int i65 = w2VarB.f21381f;
                                            int i66 = w2VarB.f21382g;
                                            i46 = i58;
                                            iC = i64;
                                            str6 = str10;
                                            uwVar = (uw) w2VarB.f21389o;
                                            string = str15;
                                            k3Var = k3Var2;
                                            z19 = z16;
                                            i49 = i63;
                                            i17 = iIntValue;
                                            i43 = i66;
                                            i41 = i60;
                                            i42 = i65;
                                            i47 = i62;
                                            str13 = "video/hevc";
                                            i48 = i61;
                                            i45 = i59;
                                            str11 = str11;
                                        } else if (iB12 == 1818785347) {
                                            int i67 = i50 + 8;
                                            v71.m("lhvC must follow hvcC atom", "video/hevc".equals(str13));
                                            if (uwVar3 == null) {
                                                z15 = false;
                                                uwVar2 = null;
                                            } else if (((ca1) uwVar3.f20919c).size() >= 2) {
                                                uwVar2 = uwVar3;
                                                z15 = true;
                                            } else {
                                                uwVar2 = uwVar3;
                                                z15 = false;
                                            }
                                            v71.m("must have at least two layers", z15);
                                            np0Var4.E(i67);
                                            uwVar2.getClass();
                                            w2 w2VarB2 = w2.b(np0Var4, true, uwVar2);
                                            v71.m("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", k3Var2.f16293a == w2VarB2.f21377b);
                                            int i68 = w2VarB2.f21383h;
                                            if (i68 != -1) {
                                                v71.m("colorSpace must be the same for both views", i44 == i68);
                                            }
                                            int i69 = w2VarB2.f21384i;
                                            if (i69 != -1) {
                                                v71.m("colorRange must be the same for both views", i49 == i69);
                                            }
                                            int i70 = w2VarB2.f21385j;
                                            if (i70 != -1) {
                                                v71.m("colorTransfer must be the same for both views", iC == i70);
                                            }
                                            v71.m("bitdepthLuma must be the same for both views", i42 == w2VarB2.f21381f);
                                            v71.m("bitdepthChroma must be the same for both views", i43 == w2VarB2.f21382g);
                                            if (listU != null) {
                                                aa1 aa1Var = ca1.f13122b;
                                                z91 z91Var = new z91(4);
                                                z91Var.b(listU);
                                                z91Var.b(w2VarB2.f21376a);
                                                listU = z91Var.f();
                                            } else {
                                                v71.m("initializationData must be already set from hvcC atom", false);
                                            }
                                            str6 = str10;
                                            string = w2VarB2.f21388n;
                                            uwVar = uwVar2;
                                            k3Var = k3Var2;
                                            str13 = "video/mv-hevc";
                                            i17 = iIntValue;
                                        } else if (iB12 == 1987470147) {
                                            int i71 = i50 + 8;
                                            v71.m(null, str13 == null);
                                            np0Var4.E(i71);
                                            k3 k3VarC = k3.C(np0Var4);
                                            listU = (List) k3VarC.f16295c;
                                            k3Var2.f16293a = k3VarC.f16293a;
                                            string = (String) k3VarC.f16296d;
                                            str6 = str10;
                                            uwVar = uwVar3;
                                            i43 = k3VarC.f16294b;
                                            str13 = "video/vvc";
                                            k3Var = k3Var2;
                                            i17 = iIntValue;
                                            str11 = str11;
                                            i46 = 16;
                                            i42 = i43;
                                        } else {
                                            if (iB12 == 1986361461) {
                                                np0Var4.E(i50 + 8);
                                                int i72 = np0Var4.f17881b;
                                                i49 = i49;
                                                so0 so0Var = null;
                                                while (i72 - i50 < i16) {
                                                    np0Var4.E(i72);
                                                    int iB13 = np0Var4.b();
                                                    v71.m(str10, iB13 > 0);
                                                    int i73 = i42;
                                                    if (np0Var4.b() == 1702454643) {
                                                        np0Var4.E(i72 + 8);
                                                        int i74 = np0Var4.f17881b;
                                                        while (true) {
                                                            if (i74 - i72 >= iB13) {
                                                                str7 = str10;
                                                                iB13 = iB13;
                                                                so0Var = null;
                                                                break;
                                                            }
                                                            np0Var4.E(i74);
                                                            int iB14 = np0Var4.b();
                                                            v71.m(str10, iB14 > 0);
                                                            str7 = str10;
                                                            if (np0Var4.b() == 1937011305) {
                                                                np0Var4.G(4);
                                                                int iK = np0Var4.K();
                                                                so0Var = new so0(new f6(1 == (iK & 1), (iK & 2) == 2, (iK & 8) == 8), 3);
                                                            } else {
                                                                i74 += iB14;
                                                                str10 = str7;
                                                            }
                                                        }
                                                        i72 += iB13;
                                                        i42 = i73;
                                                        str10 = str7;
                                                    } else {
                                                        str7 = str10;
                                                    }
                                                    i72 += iB13;
                                                    i42 = i73;
                                                    str10 = str7;
                                                }
                                                str6 = str10;
                                                i42 = i42;
                                                x11 x11Var = so0Var == null ? null : new x11(so0Var, 3);
                                                if (x11Var != null) {
                                                    so0 so0Var2 = (so0) x11Var.f21703b;
                                                    if (uwVar3 == null) {
                                                        uwVar3 = null;
                                                    } else if (((ca1) uwVar3.f20919c).size() >= 2) {
                                                        f6 f6Var = (f6) so0Var2.f20013b;
                                                        v71.m("both eye views must be marked as available", f6Var.f14258a && f6Var.f14259b);
                                                        v71.m("for MV-HEVC, eye_views_reversed must be set to false", !((f6) so0Var2.f20013b).f14260c);
                                                    }
                                                    if (i41 == -1) {
                                                        uwVar = uwVar3;
                                                        k3Var = k3Var2;
                                                        i17 = iIntValue;
                                                        if (true != ((f6) so0Var2.f20013b).f14260c) {
                                                            i49 = i49;
                                                            i42 = i42;
                                                            i41 = 4;
                                                        } else {
                                                            i41 = 5;
                                                        }
                                                    } else {
                                                        uwVar = uwVar3;
                                                        k3Var = k3Var2;
                                                        i17 = iIntValue;
                                                    }
                                                    i49 = i49;
                                                    i42 = i42;
                                                }
                                                uwVar = uwVar3;
                                                k3Var = k3Var2;
                                                i43 = i43;
                                                i17 = iIntValue;
                                                str13 = str13;
                                            } else {
                                                str6 = str10;
                                                i49 = i49;
                                                i42 = i42;
                                                if (iB12 == 1685480259 || iB12 == 1685485123 || iB12 == 1685485379) {
                                                    uwVar = uwVar3;
                                                    k3Var = k3Var2;
                                                    i43 = i43;
                                                    i17 = iIntValue;
                                                    str13 = str13;
                                                    tf1VarA = tf1.a(np0Var4);
                                                } else if (iB12 == 1987076931) {
                                                    int i75 = i50 + 12;
                                                    v71.m(null, str13 == null);
                                                    np0Var4.E(i75);
                                                    byte bK = (byte) np0Var4.K();
                                                    byte bK2 = (byte) np0Var4.K();
                                                    int iK2 = np0Var4.K();
                                                    i43 = iK2 >> 4;
                                                    int i76 = iK2 >> 1;
                                                    String str16 = iIntValue == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                                                    if (str16.equals(MimeTypes.VIDEO_VP9)) {
                                                        byte b10 = (byte) (i76 & 7);
                                                        byte[] bArr = re0.f19567a;
                                                        i18 = 1;
                                                        listU = ca1.u(new byte[]{1, 1, bK, 2, 1, bK2, 3, 1, (byte) i43, 4, 1, b10});
                                                    } else {
                                                        i18 = 1;
                                                    }
                                                    int i77 = iK2 & 1;
                                                    int iK3 = np0Var4.K();
                                                    int iK4 = np0Var4.K();
                                                    int iB15 = lq1.b(iK3);
                                                    int i78 = i18 != i77 ? 2 : 1;
                                                    iC = lq1.c(iK4);
                                                    uwVar = uwVar3;
                                                    i49 = i78;
                                                    k3Var = k3Var2;
                                                    i42 = i43;
                                                    i17 = iIntValue;
                                                    str13 = str16;
                                                    str11 = str11;
                                                    i44 = iB15;
                                                } else {
                                                    int i79 = 6;
                                                    if (iB12 == 1635135811) {
                                                        int i80 = i16 - 8;
                                                        byte[] bArr2 = new byte[i80];
                                                        np0Var4.H(bArr2, 0, i80);
                                                        listU = ca1.u(bArr2);
                                                        y1 y1VarB = y1.b(bArr2);
                                                        if (y1VarB != null) {
                                                            string = (String) y1VarB.f22071e;
                                                            iC = y1VarB.f22070d;
                                                            i49 = y1VarB.f22069c;
                                                            i44 = y1VarB.f22068b;
                                                            i42 = y1VarB.f22067a;
                                                            i43 = i42;
                                                        } else {
                                                            i49 = i49;
                                                            i42 = i42;
                                                        }
                                                        uwVar = uwVar3;
                                                        str13 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                                        k3Var = k3Var2;
                                                        i17 = iIntValue;
                                                    } else if (iB12 == 1668050025) {
                                                        if (byteBufferOrder == null) {
                                                            byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                        }
                                                        ByteBuffer byteBuffer = byteBufferOrder;
                                                        byteBuffer.position(21);
                                                        byteBuffer.putShort(np0Var4.N());
                                                        byteBuffer.putShort(np0Var4.N());
                                                        uwVar = uwVar3;
                                                        byteBufferOrder = byteBuffer;
                                                        k3Var = k3Var2;
                                                        i17 = iIntValue;
                                                        i49 = i49;
                                                        i42 = i42;
                                                    } else {
                                                        if (iB12 == 1835295606) {
                                                            if (byteBufferOrder == null) {
                                                                byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                            }
                                                            ByteBuffer byteBuffer2 = byteBufferOrder;
                                                            short sN3 = np0Var4.N();
                                                            short sN4 = np0Var4.N();
                                                            short sN5 = np0Var4.N();
                                                            short sN6 = np0Var4.N();
                                                            uwVar = uwVar3;
                                                            short sN7 = np0Var4.N();
                                                            i43 = i43;
                                                            short sN8 = np0Var4.N();
                                                            i17 = iIntValue;
                                                            short sN9 = np0Var4.N();
                                                            str13 = str13;
                                                            short sN10 = np0Var4.N();
                                                            long jP4 = np0Var4.P();
                                                            long jP5 = np0Var4.P();
                                                            k3Var = k3Var2;
                                                            byteBuffer2.position(1);
                                                            byteBuffer2.putShort(sN7);
                                                            byteBuffer2.putShort(sN8);
                                                            byteBuffer2.putShort(sN3);
                                                            byteBuffer2.putShort(sN4);
                                                            byteBuffer2.putShort(sN5);
                                                            byteBuffer2.putShort(sN6);
                                                            byteBuffer2.putShort(sN9);
                                                            byteBuffer2.putShort(sN10);
                                                            byteBuffer2.putShort((short) (jP4 / Xa.f27908s));
                                                            byteBuffer2.putShort((short) (jP5 / Xa.f27908s));
                                                            byteBufferOrder = byteBuffer2;
                                                        } else {
                                                            uwVar = uwVar3;
                                                            k3Var = k3Var2;
                                                            i43 = i43;
                                                            i17 = iIntValue;
                                                            str13 = str13;
                                                            if (iB12 == 1681012275) {
                                                                v71.m(null, str13 == null);
                                                                str13 = MimeTypes.VIDEO_H263;
                                                            } else if (iB12 == 1702061171) {
                                                                v71.m(null, str13 == null);
                                                                d6 d6VarJ = j(i50, np0Var4);
                                                                String str17 = d6VarJ.f13428a;
                                                                byte[] bArr3 = d6VarJ.f13429b;
                                                                if (bArr3 != null) {
                                                                    listU = ca1.u(bArr3);
                                                                }
                                                                d6Var = d6VarJ;
                                                                str13 = str17;
                                                            } else if (iB12 == 1651798644) {
                                                                np0Var4.E(i50 + 8);
                                                                np0Var4.G(4);
                                                                e1Var = new e1(np0Var4.P(), np0Var4.P());
                                                            } else if (iB12 == 1885434736) {
                                                                np0Var4.E(i50 + 8);
                                                                fH = np0Var4.h() / np0Var4.h();
                                                                str11 = str11;
                                                                i49 = i49;
                                                                i42 = i42;
                                                                i43 = i43;
                                                                str13 = str13;
                                                                z19 = true;
                                                            } else if (iB12 == 1937126244) {
                                                                int i81 = i50 + 8;
                                                                while (true) {
                                                                    if (i81 - i50 >= i16) {
                                                                        bArrCopyOfRange = null;
                                                                        break;
                                                                    }
                                                                    np0Var4.E(i81);
                                                                    int iB16 = np0Var4.b() + i81;
                                                                    if (np0Var4.b() == 1886547818) {
                                                                        bArrCopyOfRange = Arrays.copyOfRange(np0Var4.f17880a, i81, iB16);
                                                                        break;
                                                                    }
                                                                    i81 = iB16;
                                                                }
                                                            } else if (iB12 == 1936995172) {
                                                                int iK5 = np0Var4.K();
                                                                np0Var4.G(3);
                                                                if (iK5 == 0) {
                                                                    int iK6 = np0Var4.K();
                                                                    if (iK6 == 0) {
                                                                        i49 = i49;
                                                                        i42 = i42;
                                                                        i43 = i43;
                                                                        str13 = str13;
                                                                        i41 = 0;
                                                                    } else if (iK6 == 1) {
                                                                        i49 = i49;
                                                                        i42 = i42;
                                                                        i43 = i43;
                                                                        str13 = str13;
                                                                        i41 = 1;
                                                                    } else if (iK6 == 2) {
                                                                        i49 = i49;
                                                                        i42 = i42;
                                                                        i43 = i43;
                                                                        str13 = str13;
                                                                        i41 = 2;
                                                                    } else if (iK6 == 3) {
                                                                        i41 = 3;
                                                                    }
                                                                }
                                                            } else if (iB12 == 1634760259) {
                                                                int i82 = i16 - 12;
                                                                byte[] bArr4 = new byte[i82];
                                                                np0Var4.E(i50 + 12);
                                                                np0Var4.H(bArr4, 0, i82);
                                                                byte[] bArr5 = re0.f19567a;
                                                                ps1.N(i82, "Invalid APV CSD length: %s", i82 >= 17);
                                                                byte b11 = bArr4[0];
                                                                ps1.N(b11, "Invalid APV CSD version: %s", b11 == 1);
                                                                int unsignedInt = Byte.toUnsignedInt(bArr4[5]);
                                                                int unsignedInt2 = Byte.toUnsignedInt(bArr4[6]);
                                                                int unsignedInt3 = Byte.toUnsignedInt(bArr4[7]);
                                                                String str18 = uu0.f20901a;
                                                                Locale locale = Locale.US;
                                                                StringBuilder sbL = l1.d.l("apv1.apvf", unsignedInt, ".apvl", unsignedInt2, ".apvb");
                                                                sbL.append(unsignedInt3);
                                                                string = sbL.toString();
                                                                listU = ca1.u(bArr4);
                                                                np0 np0Var5 = new np0(bArr4);
                                                                gp0 gp0Var = new gp0(bArr4, bArr4.length);
                                                                gp0Var.d(np0Var5.f17881b * 8);
                                                                int i83 = 1;
                                                                gp0Var.l(1);
                                                                int i84 = 8;
                                                                int iH = gp0Var.h(8);
                                                                int i85 = 0;
                                                                int i86 = -1;
                                                                int i87 = -1;
                                                                int iC2 = -1;
                                                                int i88 = -1;
                                                                int iH2 = -1;
                                                                while (i85 < iH) {
                                                                    gp0Var.l(i83);
                                                                    int iH3 = gp0Var.h(i84);
                                                                    int i89 = 0;
                                                                    while (i89 < iH3) {
                                                                        gp0Var.f(i79);
                                                                        boolean zG = gp0Var.g();
                                                                        gp0Var.e();
                                                                        gp0Var.l(11);
                                                                        gp0Var.f(4);
                                                                        iH2 = gp0Var.h(4) + 8;
                                                                        gp0Var.l(1);
                                                                        if (zG) {
                                                                            int iH4 = gp0Var.h(i84);
                                                                            int iH5 = gp0Var.h(i84);
                                                                            gp0Var.l(1);
                                                                            boolean zG2 = gp0Var.g();
                                                                            int iB17 = lq1.b(iH4);
                                                                            int i90 = true != zG2 ? 2 : 1;
                                                                            iC2 = lq1.c(iH5);
                                                                            i87 = iB17;
                                                                            i86 = i90;
                                                                        }
                                                                        i89++;
                                                                        i88 = iH2;
                                                                        i84 = 8;
                                                                        i79 = 6;
                                                                    }
                                                                    i85++;
                                                                    i84 = 8;
                                                                    i83 = 1;
                                                                    i79 = 6;
                                                                }
                                                                i49 = i86;
                                                                iC = iC2;
                                                                i42 = i88;
                                                                i43 = iH2;
                                                                str11 = str11;
                                                                str13 = "video/apv";
                                                                i44 = i87;
                                                            } else if (iB12 == 1668246642 && i44 == -1) {
                                                                if (iC == -1) {
                                                                    int iB18 = np0Var4.b();
                                                                    if (iB18 == 1852009592 || iB18 == 1852009571) {
                                                                        str11 = str11;
                                                                        int iL5 = np0Var4.L();
                                                                        int iL6 = np0Var4.L();
                                                                        np0Var4.G(2);
                                                                        if (i16 != 19) {
                                                                            z14 = false;
                                                                        } else if ((np0Var4.K() & 128) != 0) {
                                                                            i16 = 19;
                                                                            z14 = true;
                                                                        } else {
                                                                            i16 = 19;
                                                                            z14 = false;
                                                                        }
                                                                        int iB19 = lq1.b(iL5);
                                                                        int i91 = true != z14 ? 2 : 1;
                                                                        iC = lq1.c(iL6);
                                                                        i44 = iB19;
                                                                        i49 = i91;
                                                                        i42 = i42;
                                                                        i43 = i43;
                                                                        str13 = str13;
                                                                    } else {
                                                                        str11 = str11;
                                                                        v71.y(str11, "Unsupported color type: ".concat(z01.e(iB18)));
                                                                        iC = -1;
                                                                    }
                                                                } else {
                                                                    str11 = str11;
                                                                }
                                                                i44 = -1;
                                                            }
                                                            i49 = i49;
                                                            i42 = i42;
                                                            i43 = i43;
                                                        }
                                                        i49 = i49;
                                                        i42 = i42;
                                                        i43 = i43;
                                                        str13 = str13;
                                                    }
                                                }
                                            }
                                            i49 = i49;
                                            i42 = i42;
                                            i43 = i43;
                                            str13 = str13;
                                        }
                                        i39 = i51 + i16;
                                        str11 = str11;
                                        uwVar3 = uwVar;
                                        str10 = str6;
                                        i37 = i37;
                                        iIntValue = i17;
                                        k3Var2 = k3Var;
                                    }
                                    i39 = i51 + i16;
                                    str11 = str11;
                                    uwVar3 = uwVar;
                                    str10 = str6;
                                    i37 = i37;
                                    iIntValue = i17;
                                    k3Var2 = k3Var;
                                }
                                iB9 = i37;
                                int i92 = i49;
                                int i93 = i42;
                                k3 k3Var3 = k3Var2;
                                int i94 = i43;
                                String str19 = str13;
                                str9 = str11;
                                c11 = 2;
                                c13 = '\f';
                                if (tf1VarA != null) {
                                    str3 = tf1VarA.f20372b;
                                    str4 = "video/dolby-vision";
                                } else {
                                    str3 = string;
                                    str4 = str19;
                                }
                                if (str4 == null) {
                                    str5 = str12;
                                    i15 = i40;
                                    iB3 = i36;
                                    k3Var2 = k3Var3;
                                } else {
                                    i12 i12Var = new i12();
                                    iB3 = i36;
                                    i12Var.c(iB3);
                                    i12Var.e(str4);
                                    i12Var.f15508j = str3;
                                    i12Var.f15518u = iL3;
                                    i12Var.f15519v = iL4;
                                    i12Var.f15520w = i48;
                                    i12Var.f15521x = i47;
                                    i12Var.A = fH;
                                    i15 = i40;
                                    i12Var.f15523z = i15;
                                    i12Var.B = bArrCopyOfRange;
                                    i12Var.C = i41;
                                    i12Var.f15514q = listU;
                                    i12Var.f15513p = i46;
                                    i12Var.E = i45;
                                    i12Var.f15515r = g02Var2;
                                    i12Var.f15502d = str5;
                                    if (byteBufferOrder != null) {
                                        str5 = str12;
                                        bArrArray = byteBufferOrder.array();
                                    } else {
                                        str5 = str12;
                                        bArrArray = null;
                                    }
                                    i12Var.D = new lq1(i44, i92, iC, i93, i94, bArrArray);
                                    e1 e1Var2 = e1Var;
                                    if (e1Var2 != null) {
                                        i12Var.f15506h = gc1.e(e1Var2.f13801a);
                                        i12Var.f15507i = gc1.e(e1Var2.f13802b);
                                    } else {
                                        d6 d6Var2 = d6Var;
                                        if (d6Var2 != null) {
                                            i12Var.f15506h = gc1.e(d6Var2.f13430c);
                                            i12Var.f15507i = gc1.e(d6Var2.f13431d);
                                        }
                                    }
                                    k3Var2 = k3Var3;
                                    k3Var2.f16296d = i12Var.b();
                                }
                            } else if (iB10 == 1836069985 || iB10 == 1701733217 || iB10 == 1633889587 || iB10 == 1700998451 || iB10 == 1633889588 || iB10 == 1835823201 || iB10 == 1685353315 || iB10 == 1685353317 || iB10 == 1685353320 || iB10 == 1685353324 || iB10 == 1685353336 || iB10 == 1935764850 || iB10 == 1935767394 || iB10 == 1819304813 || iB10 == 1936684916 || iB10 == 1953984371 || iB10 == 778924082 || iB10 == 778924083 || iB10 == 1835557169 || iB10 == 1835560241 || iB10 == 1634492771 || iB10 == 1634492791 || iB10 == 1970037111 || iB10 == 1332770163 || iB10 == 1716281667 || iB10 == 1767992678 || iB10 == 1768973165 || iB10 == 1718641517) {
                                i(np0Var4, iB10, i35, iB9, iB3, str, z11, g02Var, k3Var2, i33);
                                np0Var4 = np0Var4;
                                str5 = str;
                                i35 = i35;
                                iB9 = iB9;
                                iB3 = iB3;
                                i33 = i33;
                                j01Var3 = j01Var4;
                                i15 = i12;
                                str9 = str9;
                                c11 = 2;
                                c13 = '\f';
                            } else {
                                if (iB10 != 1414810956 && iB10 != 1954034535 && iB10 != 2004251764 && iB10 != 1937010800 && iB10 != 1664495672 && iB10 != 1836070003) {
                                    if (iB10 != 1952807028) {
                                        if (iB10 == 1835365492) {
                                            np0Var4.E(i35 + 16);
                                            np0Var4.m();
                                            String strM = np0Var4.m();
                                            if (strM != null) {
                                                i12 i12Var2 = new i12();
                                                i12Var2.c(iB3);
                                                i12Var2.e(strM);
                                                k3Var2.f16296d = new g22(i12Var2);
                                            }
                                        } else if (iB10 == 1667329389) {
                                            i12 i12Var3 = new i12();
                                            i12Var3.c(iB3);
                                            i12Var3.e(MimeTypes.APPLICATION_CAMERA_MOTION);
                                            k3Var2.f16296d = new g22(i12Var3);
                                        }
                                    }
                                    str5 = str;
                                    arrayList3 = arrayList3;
                                    j01Var3 = j01Var4;
                                    i15 = i12;
                                }
                                np0Var4.E(i35 + 16);
                                String str20 = MimeTypes.APPLICATION_TTML;
                                if (iB10 == 1414810956) {
                                    str8 = str20;
                                    j13 = Long.MAX_VALUE;
                                    ya1VarU = null;
                                } else if (iB10 == 1954034535) {
                                    int i95 = iB9 - 16;
                                    byte[] bArr6 = new byte[i95];
                                    np0Var4.H(bArr6, i21, i95);
                                    np0Var4 = np0Var4;
                                    ya1VarU = ca1.u(bArr6);
                                    str8 = MimeTypes.APPLICATION_TX3G;
                                    iL = iL;
                                    j13 = Long.MAX_VALUE;
                                } else {
                                    if (iB10 == 2004251764) {
                                        str20 = MimeTypes.APPLICATION_MP4VTT;
                                    } else if (iB10 == 1937010800) {
                                        str8 = MimeTypes.APPLICATION_TTML;
                                        j13 = 0;
                                        ya1VarU = null;
                                    } else if (iB10 == 1664495672) {
                                        k3Var2.f16294b = 1;
                                        str20 = MimeTypes.APPLICATION_MP4CEA608;
                                    } else if (iB10 == 1836070003) {
                                        int i96 = np0Var4.f17881b;
                                        np0Var4.G(4);
                                        if (np0Var4.b() == 1702061171) {
                                            byte[] bArr7 = j(i96, np0Var4).f13429b;
                                            if (bArr7 == null || bArr7.length != 64) {
                                                str5 = str;
                                                arrayList3 = arrayList3;
                                                j01Var3 = j01Var4;
                                                i15 = i12;
                                            } else {
                                                ps1.c0(bArr7.length == 64);
                                                ArrayList arrayList5 = new ArrayList(16);
                                                int i97 = 0;
                                                while (i97 < bArr7.length - 3) {
                                                    np0 np0Var6 = np0Var4;
                                                    byte[] bArr8 = bArr7;
                                                    int iL7 = gc1.l(bArr7[i97], bArr7[i97 + 1], bArr8[i97 + 2], bArr8[i97 + 3]);
                                                    String str21 = uu0.f20901a;
                                                    int i98 = ((iL7 >> 8) & 255) - 128;
                                                    int i99 = (iL7 >> 16) & 255;
                                                    int i100 = (iL7 & 255) - 128;
                                                    arrayList5.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(((i100 * 17790) / 10000) + i99, 255)) | (Math.max(0, Math.min(((i98 * 14075) / 10000) + i99, 255)) << 16) | (Math.max(0, Math.min((i99 - ((i100 * 3455) / 10000)) - ((i98 * 7169) / 10000), 255)) << 8))));
                                                    i97 += 4;
                                                    np0Var4 = np0Var6;
                                                    bArr7 = bArr8;
                                                    iL = iL;
                                                }
                                                np0Var4 = np0Var4;
                                                iL = iL;
                                                Iterator it = arrayList5.iterator();
                                                StringBuilder sb2 = new StringBuilder();
                                                v71.z(sb2, it, ", ");
                                                String string2 = sb2.toString();
                                                StringBuilder sb3 = new StringBuilder(com.applovin.impl.ca.i(com.applovin.impl.ca.i(String.valueOf((int) sN).length() + 7, 10, String.valueOf((int) sN2)), 1, string2));
                                                sb3.append("size: ");
                                                sb3.append((int) sN);
                                                sb3.append("x");
                                                sb3.append((int) sN2);
                                                String strJ = q4.a.j(sb3, "\npalette: ", string2, "\n");
                                                String str22 = uu0.f20901a;
                                                ya1VarU = ca1.u(strJ.getBytes(StandardCharsets.UTF_8));
                                                str8 = MimeTypes.APPLICATION_VOBSUB;
                                            }
                                        } else {
                                            np0Var4 = np0Var4;
                                            iL = iL;
                                            ya1VarU = null;
                                            str8 = null;
                                        }
                                        j13 = Long.MAX_VALUE;
                                    } else {
                                        np0Var4 = np0Var4;
                                        iL = iL;
                                        str8 = "text/x-unknown";
                                        j13 = Long.MAX_VALUE;
                                        ya1VarU = null;
                                    }
                                    str8 = str20;
                                    j13 = Long.MAX_VALUE;
                                    ya1VarU = null;
                                }
                                if (str8 != null) {
                                    i12 i12Var4 = new i12();
                                    i12Var4.c(iB3);
                                    i12Var4.e(str8);
                                    i12Var4.f15502d = str;
                                    i12Var4.f15516s = j13;
                                    i12Var4.f15514q = ya1VarU;
                                    k3Var2.f16296d = new g22(i12Var4);
                                }
                                str5 = str;
                                sN = sN;
                                iB8 = iB8;
                                sN2 = sN2;
                                i19 = i19;
                                i15 = i12;
                                c11 = c11;
                                c13 = c13;
                                str9 = str9;
                                i32 = i32;
                                j12 = j12;
                                iB9 = iB9;
                                np0Var4 = np0Var4;
                                iL = iL;
                                arrayList3 = arrayList3;
                                j01Var3 = j01Var4;
                            }
                            np0Var4.E(i35 + iB9);
                            i12 = i15;
                            str = str5;
                            np0Var4 = np0Var4;
                            i33++;
                            str9 = str9;
                            sN = sN;
                            i19 = i19;
                            iB8 = iB8;
                            arrayList3 = arrayList3;
                            j01Var4 = j01Var3;
                            i32 = i32;
                            iL = iL;
                            jV = j12;
                            c13 = c13;
                            i21 = 0;
                            j14 = C.TIME_UNSET;
                            c11 = c11;
                            sN2 = sN2;
                        }
                        int i101 = iL;
                        arrayList = arrayList3;
                        i14 = i19;
                        int i102 = i32;
                        j01Var2 = j01Var4;
                        j01 j01VarH5 = j01Var2.h(1953654118);
                        if (j01VarH5 == null || (w01VarG = j01VarH5.g(1667785072)) == null) {
                            iB = -1;
                        } else {
                            np0 np0Var7 = w01VarG.f21353c;
                            np0Var7.E(8);
                            if (np0Var7.B() >= 4) {
                                iB = np0Var7.b();
                            } else {
                                iB = -1;
                            }
                        }
                        if (z10 || (j01VarH = j01Var2.h(1701082227)) == null || (pairH = h(j01VarH)) == null) {
                            ec1Var = null;
                            ec1Var2 = null;
                        } else {
                            ec1Var2 = (ec1) pairH.first;
                            ec1Var = (ec1) pairH.second;
                        }
                        g22 g22VarB = (g22) k3Var2.f16296d;
                        if (g22VarB == null) {
                            w6Var = null;
                        } else {
                            if (i101 != 0) {
                                uz0 uz0Var = new uz0(i101);
                                i12 i12VarA = g22VarB.a();
                                s8 s8Var2 = g22VarB.l;
                                if (s8Var2 != null) {
                                    z13 = true;
                                    s8Var = s8Var2.c(uz0Var);
                                } else {
                                    z13 = true;
                                    s8Var = new s8(uz0Var);
                                }
                                i12VarA.f15509k = s8Var;
                                g22VarB = i12VarA.b();
                            } else {
                                z13 = true;
                            }
                            boolean zEquals = Objects.equals(g22VarB.f14678o, "text/x-unknown") ^ z13;
                            v6 v6Var = new v6();
                            v6Var.f21037b = -1;
                            v6Var.f21038c = -1L;
                            v6Var.f21039d = -1L;
                            v6Var.f21040e = C.TIME_UNSET;
                            v6Var.f21041f = C.TIME_UNSET;
                            v6Var.f21043h = 0;
                            v6Var.f21047m = z13;
                            v6Var.f21048n = -1;
                            v6Var.f21036a = iB3;
                            v6Var.f21037b = i102;
                            v6Var.f21038c = jP2;
                            v6Var.f21039d = j11;
                            v6Var.f21040e = j12;
                            v6Var.f21041f = jV2;
                            v6Var.f21042g = g22VarB;
                            v6Var.f21043h = k3Var2.f16294b;
                            v6Var.f21044i = (x6[]) ((x6[]) obj).clone();
                            v6Var.f21045j = k3Var2.f16293a;
                            v6Var.f21046k = ec1Var2;
                            v6Var.l = ec1Var;
                            v6Var.f21047m = zEquals;
                            v6Var.f21048n = iB;
                            v6Var.f21042g.getClass();
                            w6Var = new w6(v6Var);
                            d81Var = d81Var;
                        }
                    }
                }
                w6 w6Var2 = (w6) d81Var.apply(w6Var);
                if (w6Var2 != null) {
                    j01 j01VarH6 = j01Var2.h(1835297121);
                    j01VarH6.getClass();
                    j01 j01VarH7 = j01VarH6.h(1835626086);
                    j01VarH7.getClass();
                    j01 j01VarH8 = j01VarH7.h(1937007212);
                    j01VarH8.getClass();
                    z6 z6VarG = g(w6Var2, j01VarH8, v2Var);
                    arrayList2 = arrayList;
                    arrayList2.add(z6VarG);
                } else {
                    arrayList2 = arrayList;
                }
            }
            i19 = i14 + 1;
            arrayList3 = arrayList2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x02d5 A[Catch: all -> 0x0094, TryCatch #2 {all -> 0x0094, blocks: (B:22:0x007d, B:24:0x0089, B:27:0x0097, B:31:0x00a4, B:34:0x00b1, B:37:0x00be, B:40:0x00cb, B:43:0x00d8, B:45:0x00e4, B:53:0x0100, B:54:0x011e, B:55:0x0131, B:58:0x013d, B:61:0x014a, B:64:0x0157, B:67:0x0164, B:70:0x0171, B:73:0x017e, B:76:0x018b, B:79:0x0198, B:82:0x01a5, B:85:0x01b2, B:89:0x01c4, B:91:0x01c8, B:93:0x01d9, B:95:0x01e2, B:97:0x01e9, B:103:0x01f6, B:109:0x0205, B:153:0x02d5, B:110:0x021b, B:112:0x0222, B:114:0x022e, B:115:0x0242, B:128:0x026b, B:131:0x0278, B:134:0x0285, B:137:0x0292, B:140:0x029e, B:143:0x02aa, B:146:0x02b4, B:149:0x02c0, B:152:0x02cc, B:154:0x02f3, B:155:0x02fa), top: B:254:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:203:0x039e  */
    /* JADX WARN: Code duplicated, block: B:212:0x03b7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v32 */
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
    public static s8 c(w01 w01Var) {
        int i10;
        boolean z10;
        s8 s8Var;
        s8 s8Var2;
        s8 s8VarB;
        s8 s8Var3;
        s8 s8Var4;
        int iF;
        s8 s8Var5;
        Object objM;
        String str;
        np0 np0Var = w01Var.f21353c;
        int i11 = 8;
        np0Var.E(8);
        boolean z11 = false;
        s8 s8Var6 = new s8(new v7[0]);
        while (np0Var.B() >= i11) {
            int i12 = np0Var.f17881b;
            int iB = np0Var.b() + i12;
            int iB2 = np0Var.b();
            boolean z12 = true;
            String str2 = null;
            if (iB2 == 1835365473) {
                np0Var.E(i12);
                np0Var.G(i11);
                f(np0Var);
                boolean z13 = z11;
                while (true) {
                    int i13 = np0Var.f17881b;
                    if (i13 < iB) {
                        int iB3 = np0Var.b() + i13;
                        if (np0Var.b() == 1768715124) {
                            np0Var.E(i13);
                            np0Var.G(i11);
                            ArrayList arrayList = new ArrayList();
                            ?? r3 = z13;
                            while (true) {
                                int i14 = np0Var.f17881b;
                                if (i14 >= iB3) {
                                    break;
                                }
                                int iB4 = np0Var.b() + i14;
                                int iB5 = np0Var.b();
                                int i15 = (iB5 >> 24) & 255;
                                if (i15 == 169 || i15 == 253) {
                                    int i16 = iB5 & 16777215;
                                    if (i16 == 6516084) {
                                        int iB6 = np0Var.b();
                                        if (np0Var.b() == 1684108385) {
                                            np0Var.G(8);
                                            String strL = np0Var.l(iB6 - 16);
                                            objM = new v4(C.LANGUAGE_UNDETERMINED, strL, strL);
                                        } else {
                                            v71.y("MetadataUtil", "Failed to parse comment attribute: ".concat(z01.e(iB5)));
                                            objM = null;
                                        }
                                    } else if (i16 == 7233901 || i16 == 7631467) {
                                        objM = ps1.M(iB5, "TIT2", np0Var);
                                    } else if (i16 == 6516589 || i16 == 7828084) {
                                        objM = ps1.M(iB5, "TCOM", np0Var);
                                    } else if (i16 == 6578553) {
                                        objM = ps1.M(iB5, "TDRC", np0Var);
                                    } else if (i16 == 4280916) {
                                        objM = ps1.M(iB5, "TPE1", np0Var);
                                    } else if (i16 == 7630703) {
                                        objM = ps1.M(iB5, "TSSE", np0Var);
                                    } else if (i16 == 6384738) {
                                        objM = ps1.M(iB5, "TALB", np0Var);
                                    } else if (i16 == 7108978) {
                                        objM = ps1.M(iB5, "USLT", np0Var);
                                    } else if (i16 == 6776174) {
                                        objM = ps1.M(iB5, "TCON", np0Var);
                                    } else if (i16 == 6779504) {
                                        objM = ps1.M(iB5, "TIT1", np0Var);
                                    } else if (i16 == 7173742) {
                                        objM = ps1.M(iB5, "MVNM", np0Var);
                                    } else if (i16 == 7173737) {
                                        objM = ps1.Q(iB5, "MVIN", np0Var, true, false);
                                    } else {
                                        String strE = z01.e(iB5);
                                        StringBuilder sb2 = new StringBuilder(strE.length() + 32);
                                        sb2.append("Skipped unknown metadata entry: ");
                                        sb2.append(strE);
                                        v71.l("MetadataUtil", sb2.toString());
                                        objM = null;
                                    }
                                } else if (iB5 == 1735291493) {
                                    try {
                                        String strA = y4.a(ps1.T(np0Var) - 1);
                                        if (strA != null) {
                                            objM = new c5("TCON", str2, ca1.u(strA));
                                        } else {
                                            v71.y("MetadataUtil", "Failed to parse standard genre code");
                                            objM = str2;
                                        }
                                    } catch (Throwable th2) {
                                        np0Var.E(iB4);
                                        throw th2;
                                    }
                                } else if (iB5 == 1684632427) {
                                    objM = ps1.Y(1684632427, "TPOS", np0Var);
                                } else if (iB5 == 1953655662) {
                                    objM = ps1.Y(1953655662, "TRCK", np0Var);
                                } else if (iB5 == 1953329263) {
                                    objM = ps1.Q(1953329263, "TBPM", np0Var, z12, r3);
                                } else if (iB5 == 1668311404) {
                                    objM = ps1.Q(1668311404, "TCMP", np0Var, z12, z12);
                                } else if (iB5 == 1668249202) {
                                    int iB7 = np0Var.b();
                                    if (np0Var.b() == 1684108385) {
                                        int iB8 = np0Var.b() & 16777215;
                                        if (iB8 == 13) {
                                            str = "image/jpeg";
                                        } else if (iB8 == 14) {
                                            str = "image/png";
                                            iB8 = 14;
                                        } else {
                                            str = str2;
                                        }
                                        if (str == null) {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(iB8).length() + 30);
                                            sb3.append("Unrecognized cover art flags: ");
                                            sb3.append(iB8);
                                            v71.y("MetadataUtil", sb3.toString());
                                        } else {
                                            np0Var.G(4);
                                            int i17 = iB7 - 16;
                                            byte[] bArr = new byte[i17];
                                            np0Var.H(bArr, r3, i17);
                                            objM = new r4(str, str2, 3, bArr);
                                        }
                                    } else {
                                        v71.y("MetadataUtil", "Failed to parse cover art attribute");
                                    }
                                    objM = str2;
                                } else if (iB5 == 1631670868) {
                                    objM = ps1.M(1631670868, "TPE2", np0Var);
                                } else if (iB5 == 1936682605) {
                                    objM = ps1.M(1936682605, "TSOT", np0Var);
                                } else if (iB5 == 1936679276) {
                                    objM = ps1.M(1936679276, "TSOA", np0Var);
                                } else if (iB5 == 1936679282) {
                                    objM = ps1.M(1936679282, "TSOP", np0Var);
                                } else if (iB5 == 1936679265) {
                                    objM = ps1.M(1936679265, "TSO2", np0Var);
                                } else if (iB5 == 1936679791) {
                                    objM = ps1.M(1936679791, "TSOC", np0Var);
                                } else if (iB5 == 1920233063) {
                                    objM = ps1.Q(1920233063, "ITUNESADVISORY", np0Var, r3, r3);
                                } else if (iB5 == 1885823344) {
                                    objM = ps1.Q(1885823344, "ITUNESGAPLESS", np0Var, r3, z12);
                                } else if (iB5 == 1936683886) {
                                    objM = ps1.M(1936683886, "TVSHOWSORT", np0Var);
                                } else if (iB5 == 1953919848) {
                                    objM = ps1.M(1953919848, "TVSHOW", np0Var);
                                } else {
                                    if (iB5 == 757935405) {
                                        String strL2 = str2;
                                        String strL3 = strL2;
                                        int i18 = -1;
                                        int i19 = -1;
                                        while (true) {
                                            int i20 = np0Var.f17881b;
                                            if (i20 >= iB4) {
                                                break;
                                            }
                                            int iB9 = np0Var.b();
                                            int iB10 = np0Var.b();
                                            np0Var.G(4);
                                            if (iB10 == 1835360622) {
                                                strL2 = np0Var.l(iB9 - 12);
                                            } else {
                                                int i21 = iB9 - 12;
                                                if (iB10 == 1851878757) {
                                                    strL3 = np0Var.l(i21);
                                                } else {
                                                    if (iB10 == 1684108385) {
                                                        i19 = iB9;
                                                    }
                                                    if (iB10 == 1684108385) {
                                                        i18 = i20;
                                                    }
                                                    np0Var.G(i21);
                                                }
                                            }
                                        }
                                        if (strL2 != null && strL3 != null && i18 != -1) {
                                            np0Var.E(i18);
                                            np0Var.G(16);
                                            objM = new z4(strL2, strL3, np0Var.l(i19 - 16));
                                        }
                                    } else {
                                        String strE2 = z01.e(iB5);
                                        StringBuilder sb4 = new StringBuilder(strE2.length() + 32);
                                        sb4.append("Skipped unknown metadata entry: ");
                                        sb4.append(strE2);
                                        v71.l("MetadataUtil", sb4.toString());
                                    }
                                    objM = null;
                                }
                                np0Var.E(iB4);
                                if (objM != null) {
                                    arrayList.add(objM);
                                }
                                r3 = 0;
                                z12 = true;
                                str2 = null;
                            }
                            if (!arrayList.isEmpty()) {
                                s8Var5 = new s8(arrayList);
                                break;
                            }
                            break;
                        }
                        np0Var.E(iB3);
                        i11 = 8;
                        z13 = false;
                        z12 = true;
                        str2 = null;
                    }
                    s8Var5 = null;
                    break;
                }
                s8Var6 = s8Var6.b(s8Var5);
                i10 = 8;
            } else {
                if (iB2 == 1936553057) {
                    np0Var.E(i12);
                    np0Var.G(12);
                    while (true) {
                        int i22 = np0Var.f17881b;
                        if (i22 < iB) {
                            int iB11 = np0Var.b();
                            if (np0Var.b() == 1935766900) {
                                if (iB11 >= 16) {
                                    np0Var.G(4);
                                    int i23 = 0;
                                    int i24 = -1;
                                    for (int i25 = 0; i25 < 2; i25++) {
                                        int iK = np0Var.K();
                                        int iK2 = np0Var.K();
                                        if (iK == 0) {
                                            i24 = iK2;
                                        } else if (iK == 1) {
                                            i23 = iK2;
                                        }
                                    }
                                    if (i24 == 12) {
                                        iF = PsExtractor.VIDEO_STREAM_MASK;
                                    } else if (i24 == 13) {
                                        iF = 120;
                                    } else {
                                        if (i24 != 21) {
                                            iF = -2147483647;
                                        } else {
                                            i10 = 8;
                                            if (np0Var.B() < 8 || np0Var.f17881b + 8 > iB) {
                                                iF = -2147483647;
                                            } else {
                                                int iB12 = np0Var.b();
                                                int iB13 = np0Var.b();
                                                if (iB12 < 12 || iB13 != 1936877170) {
                                                    iF = -2147483647;
                                                } else {
                                                    iF = np0Var.f();
                                                }
                                            }
                                        }
                                        if (iF == -2147483647) {
                                            s8Var4 = new s8(new h5(iF, i23));
                                        }
                                        s8Var6 = s8Var6.b(s8Var4);
                                    }
                                    i10 = 8;
                                    if (iF == -2147483647) {
                                        s8Var4 = new s8(new h5(iF, i23));
                                    }
                                    s8Var6 = s8Var6.b(s8Var4);
                                }
                                s8Var4 = null;
                                s8Var6 = s8Var6.b(s8Var4);
                            } else {
                                np0Var.E(i22 + iB11);
                            }
                        }
                        i10 = 8;
                        s8Var4 = null;
                        s8Var6 = s8Var6.b(s8Var4);
                    }
                } else {
                    i10 = 8;
                    if (iB2 == -1451722374) {
                        short sN = np0Var.N();
                        np0Var.G(2);
                        String strK = np0Var.k(sN, StandardCharsets.UTF_8);
                        int iMax = Math.max(strK.lastIndexOf(43), strK.lastIndexOf(45));
                        try {
                            try {
                                n11 n11Var = new n11(Float.parseFloat(strK.substring(0, iMax)), Float.parseFloat(strK.substring(iMax, strK.length() - 1)));
                                v7[] v7VarArr = new v7[1];
                                z10 = false;
                                try {
                                    v7VarArr[0] = n11Var;
                                    s8Var3 = new s8(v7VarArr);
                                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                    s8Var3 = null;
                                }
                            } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                                z10 = false;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                            z10 = false;
                        }
                        s8VarB = s8Var6.b(s8Var3);
                    } else {
                        z10 = false;
                        if (iB2 == 1667788908) {
                            try {
                                np0Var.G(5);
                                int iB14 = np0Var.b();
                                ArrayList arrayList2 = new ArrayList();
                                for (int i26 = 0; i26 < iB14; i26++) {
                                    long jD = np0Var.d() / Xa.f27908s;
                                    if (jD < 0) {
                                        jD = C.TIME_UNSET;
                                    }
                                    s8Var = null;
                                    try {
                                        arrayList2.add(new l4(jD, C.TIME_UNSET, false, new i32(null, np0Var.k(np0Var.K(), StandardCharsets.UTF_8))));
                                    } catch (IndexOutOfBoundsException unused4) {
                                    }
                                }
                                s8Var = null;
                                s8Var2 = arrayList2.isEmpty() ? s8Var : new s8(arrayList2);
                            } catch (IndexOutOfBoundsException unused5) {
                                s8Var = null;
                            }
                            s8VarB = s8Var6.b(s8Var2);
                        }
                    }
                    s8Var6 = s8VarB;
                }
                np0Var.E(iB);
                i11 = i10;
                z11 = z10;
            }
            z10 = false;
            np0Var.E(iB);
            i11 = i10;
            z11 = z10;
        }
        return s8Var6;
    }

    public static d21 d(np0 np0Var) {
        long jD;
        long jD2;
        np0Var.E(8);
        if (a(np0Var.b()) == 0) {
            jD = np0Var.P();
            jD2 = np0Var.P();
        } else {
            jD = np0Var.d();
            jD2 = np0Var.d();
        }
        return new d21(jD, jD2, np0Var.P());
    }

    public static s8 e(j01 j01Var) {
        jz0 jz0Var;
        w01 w01VarG = j01Var.g(1751411826);
        w01 w01VarG2 = j01Var.g(1801812339);
        w01 w01VarG3 = j01Var.g(1768715124);
        if (w01VarG != null && w01VarG2 != null && w01VarG3 != null) {
            np0 np0Var = w01VarG.f21353c;
            np0Var.E(16);
            if (np0Var.b() == 1835299937) {
                np0 np0Var2 = w01VarG2.f21353c;
                np0Var2.E(12);
                int iB = np0Var2.b();
                String[] strArr = new String[iB];
                for (int i10 = 0; i10 < iB; i10++) {
                    int iB2 = np0Var2.b();
                    np0Var2.G(4);
                    strArr[i10] = np0Var2.k(iB2 - 8, StandardCharsets.UTF_8);
                }
                np0 np0Var3 = w01VarG3.f21353c;
                np0Var3.E(8);
                ArrayList arrayList = new ArrayList();
                while (np0Var3.B() > 8) {
                    int iB3 = np0Var3.b() + np0Var3.f17881b;
                    int iB4 = np0Var3.b() - 1;
                    if (iB4 < 0 || iB4 >= iB) {
                        com.applovin.impl.ca.r(new StringBuilder(String.valueOf(iB4).length() + 41), "Skipped metadata with unknown key index: ", iB4, "BoxParsers");
                    } else {
                        String str = strArr[iB4];
                        while (true) {
                            int i11 = np0Var3.f17881b;
                            if (i11 < iB3) {
                                int iB5 = np0Var3.b();
                                if (np0Var3.b() == 1684108385) {
                                    int iB6 = np0Var3.b();
                                    int iB7 = np0Var3.b();
                                    int i12 = iB5 - 16;
                                    byte[] bArr = new byte[i12];
                                    np0Var3.H(bArr, 0, i12);
                                    try {
                                        jz0Var = new jz0(bArr, iB7, iB6, str);
                                        break;
                                    } catch (Exception unused) {
                                        com.applovin.impl.ca.q(str, "Failed to parse metadata entry with key: ", "MetadataUtil");
                                        jz0Var = null;
                                        break;
                                    }
                                }
                                np0Var3.E(i11 + iB5);
                            }
                            jz0Var = null;
                            break;
                        }
                        if (jz0Var != null) {
                            arrayList.add(jz0Var);
                        }
                    }
                    np0Var3.E(iB3);
                }
                if (!arrayList.isEmpty()) {
                    return new s8(arrayList);
                }
            }
        }
        return null;
    }

    public static void f(np0 np0Var) {
        int i10 = np0Var.f17881b;
        np0Var.G(4);
        if (np0Var.b() != 1751411826) {
            i10 += 4;
        }
        np0Var.E(i10);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x02a7 A[ADDED_TO_REGION, LOOP:14: B:104:0x02a7->B:106:0x02ab, LOOP_START, PHI: r11 r35 r36
  0x02a7: PHI (r11v10 int) = (r11v7 int), (r11v11 int) binds: [B:102:0x02a4, B:106:0x02ab] A[DONT_GENERATE, DONT_INLINE]
  0x02a7: PHI (r35v4 int) = (r35v1 int), (r35v8 int) binds: [B:102:0x02a4, B:106:0x02ab] A[DONT_GENERATE, DONT_INLINE]
  0x02a7: PHI (r36v5 int) = (r36v1 int), (r36v6 int) binds: [B:102:0x02a4, B:106:0x02ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:105:0x02a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x02ab A[LOOP:14: B:104:0x02a7->B:106:0x02ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:114:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:122:0x02f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:124:0x0306  */
    /* JADX WARN: Code duplicated, block: B:125:0x0309  */
    /* JADX WARN: Code duplicated, block: B:130:0x0330 A[DONT_INVERT, LOOP:15: B:130:0x0330->B:134:0x033a, LOOP_START, PHI: r36
  0x0330: PHI (r36v2 int) = (r36v1 int), (r36v3 int) binds: [B:129:0x032e, B:134:0x033a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x0332  */
    /* JADX WARN: Code duplicated, block: B:134:0x033a A[LOOP:15: B:130:0x0330->B:134:0x033a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:135:0x0340 A[EDGE_INSN: B:135:0x0340->B:136:0x0342 BREAK  A[LOOP:15: B:130:0x0330->B:134:0x033a]] */
    /* JADX WARN: Code duplicated, block: B:137:0x0344 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x0346 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x0348 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x034a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x034c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x034e  */
    /* JADX WARN: Code duplicated, block: B:143:0x035e  */
    /* JADX WARN: Code duplicated, block: B:144:0x036c  */
    /* JADX WARN: Code duplicated, block: B:145:0x037c  */
    /* JADX WARN: Code duplicated, block: B:146:0x038d  */
    /* JADX WARN: Code duplicated, block: B:148:0x039f  */
    /* JADX WARN: Code duplicated, block: B:149:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:152:0x040c  */
    /* JADX WARN: Code duplicated, block: B:153:0x040f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0456  */
    /* JADX WARN: Code duplicated, block: B:163:0x048b  */
    /* JADX WARN: Code duplicated, block: B:166:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:168:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:196:0x056a  */
    /* JADX WARN: Code duplicated, block: B:198:0x056e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0579  */
    /* JADX WARN: Code duplicated, block: B:203:0x0584 A[LOOP:4: B:201:0x0581->B:203:0x0584, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:209:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:210:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:213:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:215:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:217:0x0611  */
    /* JADX WARN: Code duplicated, block: B:218:0x0613 A[LOOP:9: B:218:0x0613->B:223:0x061f, LOOP_START, PHI: r7
  0x0613: PHI (r7v25 int) = (r7v24 int), (r7v27 int) binds: [B:216:0x060f, B:223:0x061f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:225:0x0623  */
    /* JADX WARN: Code duplicated, block: B:229:0x062c  */
    /* JADX WARN: Code duplicated, block: B:231:0x0632  */
    /* JADX WARN: Code duplicated, block: B:232:0x0634  */
    /* JADX WARN: Code duplicated, block: B:244:0x0659  */
    /* JADX WARN: Code duplicated, block: B:246:0x0661  */
    /* JADX WARN: Code duplicated, block: B:252:0x0676  */
    /* JADX WARN: Code duplicated, block: B:255:0x067f  */
    /* JADX WARN: Code duplicated, block: B:256:0x0681  */
    /* JADX WARN: Code duplicated, block: B:258:0x068a  */
    /* JADX WARN: Code duplicated, block: B:262:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:263:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:266:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:267:0x06da  */
    /* JADX WARN: Code duplicated, block: B:269:0x06de  */
    /* JADX WARN: Code duplicated, block: B:271:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:273:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:275:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:276:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:278:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:279:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:282:0x0706  */
    /* JADX WARN: Code duplicated, block: B:284:0x0714  */
    /* JADX WARN: Code duplicated, block: B:285:0x0728  */
    /* JADX WARN: Code duplicated, block: B:288:0x0736  */
    /* JADX WARN: Code duplicated, block: B:290:0x0773  */
    /* JADX WARN: Code duplicated, block: B:292:0x0777  */
    /* JADX WARN: Code duplicated, block: B:298:0x078b  */
    /* JADX WARN: Code duplicated, block: B:308:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:322:0x063e A[EDGE_INSN: B:322:0x063e->B:236:0x063e BREAK  A[LOOP:6: B:227:0x0629->B:235:0x063b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x063b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x031f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x0340 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x019c  */
    /* JADX WARN: Code duplicated, block: B:73:0x019f  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01af A[LOOP:0: B:76:0x01a9->B:78:0x01af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c2 A[LOOP:1: B:80:0x01c0->B:81:0x01c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f0 A[LOOP:3: B:85:0x01ee->B:86:0x01f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x0236  */
    /* JADX WARN: Code duplicated, block: B:92:0x0261  */
    /* JADX WARN: Code duplicated, block: B:94:0x0267  */
    /* JADX WARN: Code duplicated, block: B:96:0x026f A[LOOP:13: B:93:0x0265->B:96:0x026f, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r30v10, types: [int[]] */
    /* JADX WARN: Type inference failed for: r30v11 */
    /* JADX WARN: Type inference failed for: r30v12 */
    /* JADX WARN: Type inference failed for: r30v13 */
    /* JADX WARN: Type inference failed for: r30v14 */
    /* JADX WARN: Type inference failed for: r30v17 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v7, types: [int[]] */
    /* JADX WARN: Type inference failed for: r30v8 */
    /* JADX WARN: Type inference failed for: r30v9 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public static z6 g(w6 w6Var, j01 j01Var, v2 v2Var) throws ab {
        e6 y1Var;
        boolean z10;
        int iH;
        int iH2;
        int iH3;
        int i10;
        boolean z11;
        ArrayList arrayList;
        ?? r32;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        ?? r10;
        int i11;
        np0 np0Var;
        int iH4;
        int iH5;
        long j10;
        long j11;
        int i12;
        int i13;
        int iB;
        int i14;
        int i15;
        int iH6;
        e6 e6Var;
        long j12;
        int i16;
        g22 g22Var;
        w6 w6Var2;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        ?? CopyOf;
        boolean z12;
        int i17;
        int i18;
        ?? r16;
        int i19;
        ?? r30;
        long j13;
        long j14;
        long[] jArr3;
        int i20;
        String str;
        long j15;
        boolean zB;
        int i21;
        int iZzc;
        int i22;
        int[] iArr2;
        long j16;
        w6 w6Var3;
        int i23;
        g22 g22Var2;
        ec1 ec1Var;
        long j17;
        long jV;
        int[] iArrM;
        ec1 ec1Var2;
        int i24;
        int i25;
        w6 w6Var4;
        long[] jArr4;
        w6 w6Var5;
        long[] jArr5;
        int[] iArr3;
        ?? r15;
        boolean z13;
        int[] iArr4;
        int[] iArr5;
        int i26;
        int i27;
        int i28;
        boolean z14;
        w6 w6Var6;
        int[] iArr6;
        int[] iArr7;
        int i29;
        ec1 ec1Var3;
        int[] iArr8;
        ?? r31;
        long[] jArr6;
        long[] jArr7;
        boolean z15;
        boolean z16;
        long[] jArr8;
        int[] iArr9;
        ?? r17;
        ArrayList arrayList2;
        long[] jArr9;
        int i30;
        boolean z17;
        int i31;
        long jA;
        ?? r33;
        boolean z18;
        w6 w6Var7;
        long jA2;
        int i32;
        int i33;
        boolean z19;
        ?? r2;
        int i34;
        int i35;
        int i36;
        boolean z20;
        ?? r3;
        int i37;
        long jV2;
        boolean z21;
        ?? r34;
        long jA3;
        boolean z22;
        int[] iArr10;
        int[] iArr11;
        int i38;
        long[] jArr10;
        int i39;
        long jV3;
        int iBinarySearch;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        boolean z23;
        boolean z24;
        long jA4;
        int i46;
        long j18;
        long jV4;
        int i47;
        long[] jArr11;
        int[] iArr12;
        long j19;
        int i48;
        int i49;
        int i50;
        long[] jArr12;
        int[] iArr13;
        int i51;
        int i52;
        int i53;
        int iMax;
        int i54;
        long j20;
        int i55;
        w6 w6Var8 = w6Var;
        g22 g22Var3 = w6Var8.f21422g;
        w01 w01VarG = j01Var.g(1937011578);
        if (w01VarG != null) {
            q5 q5Var = new q5();
            np0 np0Var2 = w01VarG.f21353c;
            q5Var.f18934c = np0Var2;
            np0Var2.E(12);
            int iH7 = np0Var2.h();
            if (MimeTypes.AUDIO_RAW.equals(g22Var3.f14678o)) {
                int iF = uu0.f(g22Var3.J) * g22Var3.G;
                if (iH7 % iF != 0) {
                    v71.y("BoxParsers", l1.d.j(new StringBuilder(String.valueOf(iF).length() + 66 + String.valueOf(iH7).length()), iF, "Audio sample size mismatch. stsd sample size: ", iH7, ", stsz sample size: "));
                    iH7 = iF;
                }
            }
            if (iH7 == 0) {
                iH7 = -1;
            }
            q5Var.f18932a = iH7;
            q5Var.f18933b = np0Var2.h();
            y1Var = q5Var;
        } else {
            w01 w01VarG2 = j01Var.g(1937013298);
            if (w01VarG2 == null) {
                throw ab.a(null, "Track has no sample table size information");
            }
            y1Var = new y1(w01VarG2);
        }
        int iZza = y1Var.zza();
        if (iZza == 0) {
            return new z6(w6Var8, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
        }
        if (w6Var8.f21417b == 2) {
            long j21 = w6Var8.f21421f;
            if (j21 > 0) {
                g22Var3.getClass();
                i12 i12Var = new i12(g22Var3);
                float f10 = iZza / (j21 / 1000000.0f);
                ps1.v(f10 == -1.0f || f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i12Var.f15522y = f10;
                g22 g22Var4 = new g22(i12Var);
                v6 v6Var = new v6(w6Var8);
                v6Var.f21042g = g22Var4;
                w6Var8 = new w6(v6Var);
            }
        }
        w01 w01VarG3 = j01Var.g(1937007471);
        if (w01VarG3 == null) {
            w01VarG3 = j01Var.g(1668232756);
            w01VarG3.getClass();
            z10 = true;
        } else {
            z10 = false;
        }
        w01 w01VarG4 = j01Var.g(1937011555);
        w01VarG4.getClass();
        np0 np0Var3 = w01VarG4.f21353c;
        w01 w01VarG5 = j01Var.g(1937011827);
        w01VarG5.getClass();
        np0 np0Var4 = w01VarG5.f21353c;
        w01 w01VarG6 = j01Var.g(1937011571);
        np0 np0Var5 = w01VarG6 != null ? w01VarG6.f21353c : null;
        w01 w01VarG7 = j01Var.g(1668576371);
        np0 np0Var6 = w01VarG7 != null ? w01VarG7.f21353c : null;
        c6 c6Var = new c6(np0Var3, w01VarG3.f21353c, z10);
        np0Var4.E(12);
        int iH8 = np0Var4.h() - 1;
        int iH9 = np0Var4.h();
        int iH10 = np0Var4.h();
        if (np0Var6 != null) {
            np0Var6.E(12);
            iH = np0Var6.h();
        } else {
            iH = 0;
        }
        if (np0Var5 != null) {
            np0Var5.E(12);
            iH3 = np0Var5.h();
            if (iH3 > 0) {
                iH2 = np0Var5.h() - 1;
            } else {
                iH2 = -1;
                np0Var5 = null;
            }
        } else {
            iH2 = -1;
            iH3 = 0;
        }
        int iZzb = y1Var.zzb();
        np0 np0Var7 = np0Var6;
        g22 g22Var5 = w6Var8.f21422g;
        if (iZzb != -1) {
            String str2 = g22Var5.f14678o;
            if ((MimeTypes.AUDIO_RAW.equals(str2) || MimeTypes.AUDIO_MLAW.equals(str2) || MimeTypes.AUDIO_ALAW.equals(str2)) && iH8 == 0) {
                z11 = iH == 0 && iH3 == 0;
                i10 = 0;
            }
            arrayList = new ArrayList();
            if (np0Var5 == null) {
                r32 = 1;
            } else {
                r32 = 0;
            }
            if (z11) {
                i47 = c6Var.f13048a;
                jArr11 = new long[i47];
                iArr12 = new int[i47];
                while (c6Var.b()) {
                    int i56 = c6Var.f13049b;
                    jArr11[i56] = c6Var.f13051d;
                    iArr12[i56] = c6Var.f13050c;
                }
                j19 = iH10;
                i48 = Segment.SIZE / iZzb;
                i50 = 0;
                for (i49 = 0; i49 < i47; i49++) {
                    int i57 = iArr12[i49];
                    String str3 = uu0.f20901a;
                    i50 += ((i57 + i48) - 1) / i48;
                }
                jArr12 = new long[i50];
                iArrCopyOf = new int[i50];
                jArrCopyOf = new long[i50];
                iArr13 = new int[i50];
                i51 = 0;
                i52 = 0;
                i53 = 0;
                iMax = 0;
                i54 = 0;
                while (i51 < i47) {
                    int i58 = iArr12[i51];
                    j20 = jArr11[i51];
                    int i59 = i47;
                    i55 = i58;
                    while (i55 > 0) {
                        int iMin = Math.min(i48, i55);
                        jArr12[i54] = j20;
                        int i60 = i55;
                        int i61 = iZzb * iMin;
                        iArrCopyOf[i54] = i61;
                        i53 += i61;
                        iMax = Math.max(iMax, i61);
                        jArrCopyOf[i54] = ((long) i52) * j19;
                        iArr13[i54] = 1;
                        j20 += (long) iArrCopyOf[i54];
                        i52 += iMin;
                        i55 = i60 - iMin;
                        i54++;
                        i51 = i51;
                    }
                    i51++;
                    i47 = i59;
                }
                long j22 = ((long) i52) * j19;
                j14 = i53;
                g22Var = g22Var5;
                j13 = j22;
                i20 = iMax;
                arrayList = arrayList;
                jArr3 = jArr12;
                i19 = i50;
                r30 = iArr13;
                w6Var2 = w6Var8;
            } else {
                jArr = new long[iZza];
                iArr = new int[iZza];
                int i62 = i10;
                jArr2 = new long[iZza];
                int i63 = iH3;
                r10 = new int[iZza];
                i11 = i62;
                np0Var = np0Var5;
                iH4 = iH9;
                iH5 = iH2;
                j10 = 0;
                j11 = 0;
                i12 = iH;
                i13 = i63;
                iB = 0;
                i14 = 0;
                i15 = 0;
                iH6 = 0;
                e6Var = y1Var;
                j12 = 0;
                i16 = 0;
                while (true) {
                    if (i16 < iZza) {
                        g22Var = g22Var5;
                        w6Var2 = w6Var8;
                        jArrCopyOf = jArr2;
                        iArrCopyOf = iArr;
                        jArrCopyOf2 = jArr;
                        CopyOf = r10;
                        break;
                    }
                    j15 = j12;
                    zB = true;
                    while (true) {
                        if (i15 == 0) {
                            g22Var = g22Var5;
                            i21 = i15;
                            break;
                        }
                        zB = c6Var.b();
                        g22Var = g22Var5;
                        if (zB) {
                            i21 = 0;
                            break;
                        }
                        j15 = c6Var.f13051d;
                        i15 = c6Var.f13050c;
                        w6Var8 = w6Var8;
                        g22Var5 = g22Var;
                    }
                    w6Var2 = w6Var8;
                    if (!zB) {
                        v71.y("BoxParsers", "Unexpected end of chunk data");
                        jArrCopyOf2 = Arrays.copyOf(jArr, i16);
                        iArrCopyOf = Arrays.copyOf(iArr, i16);
                        jArrCopyOf = Arrays.copyOf(jArr2, i16);
                        CopyOf = Arrays.copyOf((int[]) r10, i16);
                        iZza = i16;
                        break;
                    }
                    if (np0Var7 != null) {
                        while (iH6 == 0) {
                            if (i12 > 0) {
                                iH6 = 0;
                                break;
                            }
                            i12--;
                            iH6 = np0Var7.h();
                            iB = np0Var7.b();
                        }
                        iH6--;
                    }
                    iZzc = e6Var.zzc();
                    long[] jArr13 = jArr;
                    int i64 = iZza;
                    long j23 = iZzc;
                    j11 += j23;
                    if (iZzc > i14) {
                        i14 = iZzc;
                    }
                    jArr13[i16] = j15;
                    iArr[i16] = iZzc;
                    int i65 = i21;
                    jArr2[i16] = j10 + ((long) iB);
                    r10[i16] = r32;
                    if (i16 == iH5) {
                        r10[i16] = 1;
                        arrayList.add(Integer.valueOf(i16));
                    }
                    if (np0Var != null && i16 == iH5 && (i13 = i13 - 1) > 0) {
                        iH5 = np0Var.h() - 1;
                    }
                    j10 += (long) iH10;
                    i22 = iH4 - 1;
                    if (i22 == 0) {
                        iH4 = i22;
                    } else if (i11 > 0) {
                        i11--;
                        iH4 = np0Var4.h();
                        iH10 = np0Var4.b();
                    } else {
                        iH4 = 0;
                    }
                    long j24 = j15 + j23;
                    i15 = i65 - 1;
                    i16++;
                    iZza = i64;
                    jArr = jArr13;
                    w6Var8 = w6Var2;
                    j12 = j24;
                    g22Var5 = g22Var;
                }
                long j25 = j10 + ((long) iB);
                if (np0Var7 != null) {
                    z12 = true;
                    break;
                }
                while (true) {
                    if (i12 > 0) {
                        z12 = true;
                        break;
                    }
                    if (np0Var7.h() != 0) {
                        z12 = false;
                        break;
                    }
                    np0Var7.b();
                    i12--;
                }
                if (i13 == 0) {
                    i17 = iH4;
                    i18 = i13;
                } else if (iH4 == 0) {
                    if (i15 == 0) {
                        if (i11 == 0) {
                            jArrCopyOf2 = jArrCopyOf2;
                            z12 = z12;
                            iZza = iZza;
                            w6Var2 = w6Var2;
                            i11 = i11;
                            iH6 = iH6;
                            i18 = 0;
                            i17 = 0;
                            i15 = 0;
                        } else if (iH6 == 0) {
                            jArrCopyOf2 = jArrCopyOf2;
                            z12 = z12;
                            iZza = iZza;
                            w6Var2 = w6Var2;
                            iH6 = iH6;
                            i18 = 0;
                            i17 = 0;
                            i15 = 0;
                            i11 = 0;
                        } else if (z12) {
                            jArrCopyOf2 = jArrCopyOf2;
                            iZza = iZza;
                            r16 = CopyOf;
                            w6Var2 = w6Var2;
                        } else {
                            jArrCopyOf2 = jArrCopyOf2;
                            iZza = iZza;
                            w6Var2 = w6Var2;
                            z12 = false;
                            i18 = 0;
                            i17 = 0;
                            i15 = 0;
                            i11 = 0;
                            iH6 = 0;
                        }
                        int i66 = w6Var2.f21416a;
                        int length = String.valueOf(i11).length() + String.valueOf(i15).length() + String.valueOf(i17).length() + String.valueOf(i18).length() + String.valueOf(i66).length() + 66 + 35 + 26 + 33 + 36;
                        int length2 = String.valueOf(iH6).length();
                        if (true != z12) {
                            str = ", ctts invalid";
                        } else {
                            str = "";
                        }
                        StringBuilder sb2 = new StringBuilder(str.length() + length + length2);
                        l1.d.p(sb2, "Inconsistent stbl box for track ", i66, ": remainingSynchronizationSamples ", i18);
                        l1.d.p(sb2, ", remainingSamplesAtTimestampDelta ", i17, ", remainingSamplesInChunk ", i15);
                        l1.d.p(sb2, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", iH6);
                        sb2.append(str);
                        v71.y("BoxParsers", sb2.toString());
                        r16 = CopyOf;
                    } else {
                        i18 = 0;
                        i17 = 0;
                    }
                    i19 = iZza;
                    r30 = r16;
                    j13 = j25;
                    j14 = j11;
                    jArr3 = jArrCopyOf2;
                    i20 = i14;
                } else {
                    i17 = iH4;
                    i18 = 0;
                }
                int i67 = w6Var2.f21416a;
                int length3 = String.valueOf(i11).length() + String.valueOf(i15).length() + String.valueOf(i17).length() + String.valueOf(i18).length() + String.valueOf(i67).length() + 66 + 35 + 26 + 33 + 36;
                int length4 = String.valueOf(iH6).length();
                if (true != z12) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                StringBuilder sb3 = new StringBuilder(str.length() + length3 + length4);
                l1.d.p(sb3, "Inconsistent stbl box for track ", i67, ": remainingSynchronizationSamples ", i18);
                l1.d.p(sb3, ", remainingSamplesAtTimestampDelta ", i17, ", remainingSamplesInChunk ", i15);
                l1.d.p(sb3, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", iH6);
                sb3.append(str);
                v71.y("BoxParsers", sb3.toString());
                r16 = CopyOf;
                i19 = iZza;
                r30 = r16;
                j13 = j25;
                j14 = j11;
                jArr3 = jArrCopyOf2;
                i20 = i14;
            }
            iArr2 = iArrCopyOf;
            j16 = w6Var2.f21421f;
            if (j16 > 0) {
                jV4 = uu0.v(j14 * 8, 1000000L, j16, RoundingMode.HALF_DOWN);
                if (jV4 > 0 || jV4 >= 2147483647L) {
                    w6Var3 = w6Var2;
                } else {
                    g22Var.getClass();
                    i12 i12Var2 = new i12(g22Var);
                    i12Var2.f15506h = (int) jV4;
                    g22 g22Var6 = new g22(i12Var2);
                    v6 v6Var2 = new v6(w6Var2);
                    v6Var2.f21042g = g22Var6;
                    w6Var3 = new w6(v6Var2);
                }
            } else {
                w6Var3 = w6Var2;
            }
            i23 = w6Var3.f21417b;
            g22Var2 = w6Var3.f21422g;
            ec1Var = w6Var3.f21425j;
            j17 = w6Var3.f21418c;
            RoundingMode roundingMode = RoundingMode.DOWN;
            jV = uu0.v(j13, 1000000L, j17, roundingMode);
            iArrM = gc1.m(arrayList);
            ec1Var2 = w6Var3.f21424i;
            if (ec1Var2 == null) {
                uu0.w(jArrCopyOf, j17);
                return new z6(w6Var3, jArr3, iArr2, i20, jArrCopyOf, r30, iArrM, r32, jV, i19);
            }
            i24 = ec1Var2.f13932b;
            i25 = 1;
            if (i24 == 1 || i23 != 1) {
                w6Var4 = w6Var3;
            } else {
                int length5 = jArrCopyOf.length;
                if (length5 >= 2) {
                    ec1Var.getClass();
                    long jA5 = ec1Var.a(0);
                    long jA6 = ec1Var2.a(0);
                    long j26 = w6Var3.f21419d;
                    long jV5 = jA5 + uu0.v(jA6, j17, j26, roundingMode);
                    int i68 = length5 - 1;
                    int iMax2 = Math.max(0, Math.min(4, i68));
                    w6Var4 = w6Var3;
                    int iMax3 = Math.max(0, Math.min(length5 - 4, i68));
                    if (jArrCopyOf[0] <= jA5 && jA5 < jArrCopyOf[iMax2] && jArrCopyOf[iMax3] < jV5 && jV5 <= j13 + 2) {
                        long jMax = Math.max(0L, j13 - jV5);
                        long j27 = jA5 - jArrCopyOf[0];
                        long j28 = g22Var2.I;
                        long jV6 = uu0.v(j27, j28, j17, roundingMode);
                        long jV7 = uu0.v(jMax, j28, j17, roundingMode);
                        if (jV6 != 0) {
                            j17 = j17;
                            j18 = jV6;
                        } else if (jV7 != 0) {
                            j17 = j17;
                            j18 = 0;
                        }
                        if (j18 <= 2147483647L && jV7 <= 2147483647L) {
                            v2Var.f21004a = (int) j18;
                            v2Var.f21005b = (int) jV7;
                            uu0.w(jArrCopyOf, j17);
                            return new z6(w6Var4, jArr3, iArr2, i20, jArrCopyOf, r30, iArrM, r32, uu0.v(ec1Var2.a(0), 1000000L, j26, roundingMode), i19);
                        }
                    }
                } else {
                    w6Var4 = w6Var3;
                }
                j17 = j17;
                j17 = j17;
                j17 = j17;
                j17 = j17;
                j17 = j17;
                i25 = 1;
            }
            if (i24 == i25) {
                if (ec1Var2.a(0) == 0) {
                    ec1Var.getClass();
                    jA4 = ec1Var.a(0);
                    for (i46 = 0; i46 < jArrCopyOf.length; i46++) {
                        jArrCopyOf[i46] = uu0.v(jArrCopyOf[i46] - jA4, 1000000L, j17, RoundingMode.DOWN);
                    }
                    return new z6(w6Var4, jArr3, iArr2, i20, jArrCopyOf, r30, iArrM, r32, uu0.v(j13 - jA4, 1000000L, j17, RoundingMode.DOWN), i19);
                }
                i25 = 1;
            }
            jArr4 = jArrCopyOf;
            w6Var5 = w6Var4;
            jArr5 = jArr3;
            iArr3 = iArr2;
            r15 = r30;
            if (i23 == i25) {
                z13 = true;
            } else {
                z13 = false;
            }
            iArr4 = new int[i24];
            iArr5 = new int[i24];
            ec1Var.getClass();
            i26 = 0;
            i27 = 0;
            i28 = 0;
            z14 = false;
            while (i26 < i24) {
                int[] iArr14 = iArr3;
                r34 = r15;
                jA3 = ec1Var.a(i26);
                if (jA3 != -1) {
                    long j29 = j17;
                    i39 = i28;
                    iArr11 = iArr5;
                    iArr10 = iArr4;
                    jArr10 = jArr4;
                    z22 = z13;
                    i38 = i26;
                    int i69 = i27;
                    j17 = j29;
                    jV3 = uu0.v(ec1Var2.a(i26), j29, w6Var5.f21419d, RoundingMode.DOWN) + jA3;
                    iArr10[i38] = uu0.r(jArr10, jA3, true);
                    iBinarySearch = Arrays.binarySearch(jArr10, jV3);
                    if (iBinarySearch < 0) {
                        iBinarySearch = ~iBinarySearch;
                    } else {
                        while (true) {
                            i40 = iBinarySearch + 1;
                            if (i40 >= jArr10.length || jArr10[i40] != jV3) {
                                break;
                            }
                            iBinarySearch = i40;
                        }
                        if (!z22) {
                            iBinarySearch = i40;
                        }
                    }
                    i41 = iBinarySearch - 1;
                    i43 = 0;
                    for (i42 = iBinarySearch; i42 < jArr10.length; i42++) {
                        if (jArr10[i42] < jV3) {
                            i43++;
                            if (i43 > g22Var2.f14680q) {
                                break;
                            }
                        } else {
                            i41 = i42;
                        }
                    }
                    iArr11[i38] = i41 + 1;
                    i44 = iArr10[i38];
                    while (true) {
                        i45 = iArr10[i38];
                        if (i45 > 0 || (r34[i45] & 1) != 0) {
                            break;
                            break;
                        }
                        iArr10[i38] = i45 - 1;
                    }
                    if (i45 == 0) {
                        z23 = false;
                        if ((r34[0] & 1) == 0) {
                            iArr10[i38] = i44;
                            while (true) {
                                i45 = iArr10[i38];
                                if (i45 >= iArr11[i38] || (r34[i45] & 1) != 0) {
                                    break;
                                }
                                iArr10[i38] = i45 + 1;
                            }
                        }
                    } else {
                        z23 = false;
                    }
                    int i70 = iArr11[i38];
                    int i71 = (i70 - i45) + i69;
                    if (i39 != i45) {
                        z24 = true;
                    } else {
                        z24 = z23;
                    }
                    z14 |= z24;
                    i28 = i70;
                    i27 = i71;
                } else {
                    z22 = z13;
                    iArr10 = iArr4;
                    iArr11 = iArr5;
                    i38 = i26;
                    jArr10 = jArr4;
                }
                i26 = i38 + 1;
                i19 = i19;
                iArr4 = iArr10;
                iArr5 = iArr11;
                w6Var5 = w6Var5;
                iArr3 = iArr14;
                jArr5 = jArr5;
                r15 = r34;
                z13 = z22;
                jArr4 = jArr10;
                ec1Var2 = ec1Var2;
            }
            w6Var6 = w6Var5;
            iArr6 = iArr4;
            iArr7 = iArr5;
            i29 = i27;
            ec1Var3 = ec1Var2;
            iArr8 = iArr3;
            r31 = r15;
            jArr6 = jArr4;
            jArr7 = jArr5;
            if (i29 != i19) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z14 | z15;
            if (z16) {
                jArr8 = new long[i29];
            } else {
                jArr8 = jArr7;
            }
            if (z16) {
                iArr9 = new int[i29];
            } else {
                iArr9 = iArr8;
            }
            if (true == z16) {
                i20 = 0;
            }
            if (z16) {
                r17 = new int[i29];
            } else {
                r17 = r31;
            }
            if (z16) {
                arrayList2 = new ArrayList();
            } else {
                arrayList2 = arrayList;
            }
            jArr9 = new long[i29];
            i30 = 0;
            z17 = false;
            i31 = 0;
            jA = 0;
            r33 = r31;
            while (i30 < i24) {
                jA2 = ec1Var.a(i30);
                i32 = iArr6[i30];
                boolean z25 = z17;
                i33 = iArr7[i30];
                z19 = z16;
                if (z16) {
                    int i72 = i33 - i32;
                    System.arraycopy(jArr7, i32, jArr8, i31, i72);
                    System.arraycopy(iArr8, i32, iArr9, i31, i72);
                    ?? r11 = r33;
                    System.arraycopy(r11, i32, r17, i31, i72);
                    r2 = r11;
                } else {
                    r2 = r33;
                }
                int i73 = i20;
                i34 = i31;
                i35 = i32;
                i36 = i73;
                z20 = z25;
                r3 = r2;
                while (i35 < i33) {
                    boolean z26 = z20;
                    ?? r35 = r3;
                    int i74 = i33;
                    long j30 = w6Var6.f21419d;
                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                    long jV8 = uu0.v(jA, 1000000L, j30, roundingMode2);
                    long j31 = jArr6[i35] - jA2;
                    int i75 = i35;
                    i37 = i36;
                    w6 w6Var9 = w6Var6;
                    ec1 ec1Var4 = ec1Var;
                    ArrayList arrayList3 = arrayList2;
                    long[] jArr14 = jArr6;
                    int i76 = i30;
                    jV2 = uu0.v(j31, 1000000L, j17, roundingMode2);
                    if (jV2 < 0) {
                        z21 = false;
                    } else {
                        z21 = true;
                    }
                    boolean z27 = (!z21) | z26;
                    jArr9[i34] = jV8 + jV2;
                    if (z19 || iArr9[i34] <= i37) {
                        i36 = i37;
                    } else {
                        i36 = iArr8[i75];
                    }
                    if (!z19 && r32 == 0 && (r17[i34] & 1) != 0) {
                        arrayList3.add(Integer.valueOf(i34));
                    }
                    i34++;
                    i35 = i75 + 1;
                    arrayList2 = arrayList3;
                    z20 = z27;
                    i30 = i76;
                    ec1Var = ec1Var4;
                    jArr6 = jArr14;
                    i33 = i74;
                    w6Var6 = w6Var9;
                    r3 = r35;
                }
                r33 = r3;
                long[] jArr15 = jArr6;
                int i77 = i30;
                jA = ec1Var3.a(i77) + jA;
                i30 = i77 + 1;
                z17 = z20;
                i31 = i34;
                jArr6 = jArr15;
                i20 = i36;
                arrayList2 = arrayList2;
                ec1Var = ec1Var;
                z16 = z19;
                w6Var6 = w6Var6;
                jArr9 = jArr9;
            }
            long[] jArr16 = jArr9;
            ArrayList arrayList4 = arrayList2;
            z18 = z17;
            w6Var7 = w6Var6;
            long jV9 = uu0.v(jA, 1000000L, w6Var7.f21419d, RoundingMode.DOWN);
            if (z18) {
                g22Var2.getClass();
                i12 i12Var3 = new i12(g22Var2);
                i12Var3.f15517t = true;
                g22 g22Var7 = new g22(i12Var3);
                v6 v6Var3 = new v6(w6Var7);
                v6Var3.f21042g = g22Var7;
                w6Var7 = new w6(v6Var3);
            }
            return new z6(w6Var7, jArr8, iArr9, i20, jArr16, r17, gc1.m(arrayList4), r32, jV9, jArr8.length);
        }
        i10 = iH8;
        z11 = false;
        arrayList = new ArrayList();
        if (np0Var5 == null) {
            r32 = 1;
        } else {
            r32 = 0;
        }
        if (z11) {
            i47 = c6Var.f13048a;
            jArr11 = new long[i47];
            iArr12 = new int[i47];
            while (c6Var.b()) {
                int i510 = c6Var.f13049b;
                jArr11[i510] = c6Var.f13051d;
                iArr12[i510] = c6Var.f13050c;
            }
            j19 = iH10;
            i48 = Segment.SIZE / iZzb;
            i50 = 0;
            while (i49 < i47) {
                int i511 = iArr12[i49];
                String str4 = uu0.f20901a;
                i50 += ((i511 + i48) - 1) / i48;
            }
            jArr12 = new long[i50];
            iArrCopyOf = new int[i50];
            jArrCopyOf = new long[i50];
            iArr13 = new int[i50];
            i51 = 0;
            i52 = 0;
            i53 = 0;
            iMax = 0;
            i54 = 0;
            while (i51 < i47) {
                int i512 = iArr12[i51];
                j20 = jArr11[i51];
                int i513 = i47;
                i55 = i512;
                while (i55 > 0) {
                    int iMin2 = Math.min(i48, i55);
                    jArr12[i54] = j20;
                    int i610 = i55;
                    int i611 = iZzb * iMin2;
                    iArrCopyOf[i54] = i611;
                    i53 += i611;
                    iMax = Math.max(iMax, i611);
                    jArrCopyOf[i54] = ((long) i52) * j19;
                    iArr13[i54] = 1;
                    j20 += (long) iArrCopyOf[i54];
                    i52 += iMin2;
                    i55 = i610 - iMin2;
                    i54++;
                    i51 = i51;
                }
                i51++;
                i47 = i513;
            }
            long j210 = ((long) i52) * j19;
            j14 = i53;
            g22Var = g22Var5;
            j13 = j210;
            i20 = iMax;
            arrayList = arrayList;
            jArr3 = jArr12;
            i19 = i50;
            r30 = iArr13;
            w6Var2 = w6Var8;
        } else {
            jArr = new long[iZza];
            iArr = new int[iZza];
            int i612 = i10;
            jArr2 = new long[iZza];
            int i613 = iH3;
            r10 = new int[iZza];
            i11 = i612;
            np0Var = np0Var5;
            iH4 = iH9;
            iH5 = iH2;
            j10 = 0;
            j11 = 0;
            i12 = iH;
            i13 = i613;
            iB = 0;
            i14 = 0;
            i15 = 0;
            iH6 = 0;
            e6Var = y1Var;
            j12 = 0;
            i16 = 0;
            while (true) {
                if (i16 < iZza) {
                    g22Var = g22Var5;
                    w6Var2 = w6Var8;
                    jArrCopyOf = jArr2;
                    iArrCopyOf = iArr;
                    jArrCopyOf2 = jArr;
                    CopyOf = r10;
                    break;
                }
                j15 = j12;
                zB = true;
                while (true) {
                    if (i15 == 0) {
                        g22Var = g22Var5;
                        i21 = i15;
                        break;
                    }
                    zB = c6Var.b();
                    g22Var = g22Var5;
                    if (zB) {
                        i21 = 0;
                        break;
                    }
                    j15 = c6Var.f13051d;
                    i15 = c6Var.f13050c;
                    w6Var8 = w6Var8;
                    g22Var5 = g22Var;
                }
                w6Var2 = w6Var8;
                if (!zB) {
                    v71.y("BoxParsers", "Unexpected end of chunk data");
                    jArrCopyOf2 = Arrays.copyOf(jArr, i16);
                    iArrCopyOf = Arrays.copyOf(iArr, i16);
                    jArrCopyOf = Arrays.copyOf(jArr2, i16);
                    CopyOf = Arrays.copyOf((int[]) r10, i16);
                    iZza = i16;
                    break;
                }
                if (np0Var7 != null) {
                    while (iH6 == 0) {
                        if (i12 > 0) {
                            iH6 = 0;
                            break;
                        }
                        i12--;
                        iH6 = np0Var7.h();
                        iB = np0Var7.b();
                    }
                    iH6--;
                }
                iZzc = e6Var.zzc();
                long[] jArr17 = jArr;
                int i614 = iZza;
                long j211 = iZzc;
                j11 += j211;
                if (iZzc > i14) {
                    i14 = iZzc;
                }
                jArr17[i16] = j15;
                iArr[i16] = iZzc;
                int i615 = i21;
                jArr2[i16] = j10 + ((long) iB);
                r10[i16] = r32;
                if (i16 == iH5) {
                    r10[i16] = 1;
                    arrayList.add(Integer.valueOf(i16));
                }
                if (np0Var != null) {
                    iH5 = np0Var.h() - 1;
                }
                j10 += (long) iH10;
                i22 = iH4 - 1;
                if (i22 == 0) {
                    iH4 = i22;
                } else if (i11 > 0) {
                    i11--;
                    iH4 = np0Var4.h();
                    iH10 = np0Var4.b();
                } else {
                    iH4 = 0;
                }
                long j212 = j15 + j211;
                i15 = i615 - 1;
                i16++;
                iZza = i614;
                jArr = jArr17;
                w6Var8 = w6Var2;
                j12 = j212;
                g22Var5 = g22Var;
            }
            long j213 = j10 + ((long) iB);
            if (np0Var7 != null) {
                z12 = true;
                break;
            }
            while (true) {
                if (i12 > 0) {
                    z12 = true;
                    break;
                }
                if (np0Var7.h() != 0) {
                    z12 = false;
                    break;
                }
                np0Var7.b();
                i12--;
            }
            if (i13 == 0) {
                i17 = iH4;
                i18 = i13;
            } else if (iH4 == 0) {
                if (i15 == 0) {
                    if (i11 == 0) {
                        jArrCopyOf2 = jArrCopyOf2;
                        z12 = z12;
                        iZza = iZza;
                        w6Var2 = w6Var2;
                        i11 = i11;
                        iH6 = iH6;
                        i18 = 0;
                        i17 = 0;
                        i15 = 0;
                    } else if (iH6 == 0) {
                        jArrCopyOf2 = jArrCopyOf2;
                        z12 = z12;
                        iZza = iZza;
                        w6Var2 = w6Var2;
                        iH6 = iH6;
                        i18 = 0;
                        i17 = 0;
                        i15 = 0;
                        i11 = 0;
                    } else if (z12) {
                        jArrCopyOf2 = jArrCopyOf2;
                        iZza = iZza;
                        w6Var2 = w6Var2;
                        z12 = false;
                        i18 = 0;
                        i17 = 0;
                        i15 = 0;
                        i11 = 0;
                        iH6 = 0;
                    } else {
                        jArrCopyOf2 = jArrCopyOf2;
                        iZza = iZza;
                        r16 = CopyOf;
                        w6Var2 = w6Var2;
                    }
                    int i616 = w6Var2.f21416a;
                    int length6 = String.valueOf(i11).length() + String.valueOf(i15).length() + String.valueOf(i17).length() + String.valueOf(i18).length() + String.valueOf(i616).length() + 66 + 35 + 26 + 33 + 36;
                    int length7 = String.valueOf(iH6).length();
                    if (true != z12) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    StringBuilder sb4 = new StringBuilder(str.length() + length6 + length7);
                    l1.d.p(sb4, "Inconsistent stbl box for track ", i616, ": remainingSynchronizationSamples ", i18);
                    l1.d.p(sb4, ", remainingSamplesAtTimestampDelta ", i17, ", remainingSamplesInChunk ", i15);
                    l1.d.p(sb4, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", iH6);
                    sb4.append(str);
                    v71.y("BoxParsers", sb4.toString());
                    r16 = CopyOf;
                } else {
                    i18 = 0;
                    i17 = 0;
                }
                i19 = iZza;
                r30 = r16;
                j13 = j213;
                j14 = j11;
                jArr3 = jArrCopyOf2;
                i20 = i14;
            } else {
                i17 = iH4;
                i18 = 0;
            }
            int i617 = w6Var2.f21416a;
            int length8 = String.valueOf(i11).length() + String.valueOf(i15).length() + String.valueOf(i17).length() + String.valueOf(i18).length() + String.valueOf(i617).length() + 66 + 35 + 26 + 33 + 36;
            int length9 = String.valueOf(iH6).length();
            if (true != z12) {
                str = ", ctts invalid";
            } else {
                str = "";
            }
            StringBuilder sb5 = new StringBuilder(str.length() + length8 + length9);
            l1.d.p(sb5, "Inconsistent stbl box for track ", i617, ": remainingSynchronizationSamples ", i18);
            l1.d.p(sb5, ", remainingSamplesAtTimestampDelta ", i17, ", remainingSamplesInChunk ", i15);
            l1.d.p(sb5, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", iH6);
            sb5.append(str);
            v71.y("BoxParsers", sb5.toString());
            r16 = CopyOf;
            i19 = iZza;
            r30 = r16;
            j13 = j213;
            j14 = j11;
            jArr3 = jArrCopyOf2;
            i20 = i14;
        }
        iArr2 = iArrCopyOf;
        j16 = w6Var2.f21421f;
        if (j16 > 0) {
            jV4 = uu0.v(j14 * 8, 1000000L, j16, RoundingMode.HALF_DOWN);
            if (jV4 > 0) {
                w6Var3 = w6Var2;
            } else {
                w6Var3 = w6Var2;
            }
        } else {
            w6Var3 = w6Var2;
        }
        i23 = w6Var3.f21417b;
        g22Var2 = w6Var3.f21422g;
        ec1Var = w6Var3.f21425j;
        j17 = w6Var3.f21418c;
        RoundingMode roundingMode3 = RoundingMode.DOWN;
        jV = uu0.v(j13, 1000000L, j17, roundingMode3);
        iArrM = gc1.m(arrayList);
        ec1Var2 = w6Var3.f21424i;
        if (ec1Var2 == null) {
            uu0.w(jArrCopyOf, j17);
            return new z6(w6Var3, jArr3, iArr2, i20, jArrCopyOf, r30, iArrM, r32, jV, i19);
        }
        i24 = ec1Var2.f13932b;
        i25 = 1;
        if (i24 == 1) {
            w6Var4 = w6Var3;
        } else {
            w6Var4 = w6Var3;
        }
        if (i24 == i25) {
            if (ec1Var2.a(0) == 0) {
                ec1Var.getClass();
                jA4 = ec1Var.a(0);
                while (i46 < jArrCopyOf.length) {
                    jArrCopyOf[i46] = uu0.v(jArrCopyOf[i46] - jA4, 1000000L, j17, RoundingMode.DOWN);
                }
                return new z6(w6Var4, jArr3, iArr2, i20, jArrCopyOf, r30, iArrM, r32, uu0.v(j13 - jA4, 1000000L, j17, RoundingMode.DOWN), i19);
            }
            i25 = 1;
        }
        jArr4 = jArrCopyOf;
        w6Var5 = w6Var4;
        jArr5 = jArr3;
        iArr3 = iArr2;
        r15 = r30;
        if (i23 == i25) {
            z13 = true;
        } else {
            z13 = false;
        }
        iArr4 = new int[i24];
        iArr5 = new int[i24];
        ec1Var.getClass();
        i26 = 0;
        i27 = 0;
        i28 = 0;
        z14 = false;
        while (i26 < i24) {
            int[] iArr15 = iArr3;
            r34 = r15;
            jA3 = ec1Var.a(i26);
            if (jA3 != -1) {
                long j214 = j17;
                i39 = i28;
                iArr11 = iArr5;
                iArr10 = iArr4;
                jArr10 = jArr4;
                z22 = z13;
                i38 = i26;
                int i618 = i27;
                j17 = j214;
                jV3 = uu0.v(ec1Var2.a(i26), j214, w6Var5.f21419d, RoundingMode.DOWN) + jA3;
                iArr10[i38] = uu0.r(jArr10, jA3, true);
                iBinarySearch = Arrays.binarySearch(jArr10, jV3);
                if (iBinarySearch < 0) {
                    iBinarySearch = ~iBinarySearch;
                } else {
                    while (true) {
                        i40 = iBinarySearch + 1;
                        if (i40 >= jArr10.length) {
                            break;
                        }
                        break;
                        break;
                        iBinarySearch = i40;
                    }
                    if (!z22) {
                        iBinarySearch = i40;
                    }
                }
                i41 = iBinarySearch - 1;
                i43 = 0;
                while (i42 < jArr10.length) {
                    if (jArr10[i42] < jV3) {
                        i43++;
                        if (i43 > g22Var2.f14680q) {
                            break;
                            break;
                        }
                    } else {
                        i41 = i42;
                    }
                }
                iArr11[i38] = i41 + 1;
                i44 = iArr10[i38];
                while (true) {
                    i45 = iArr10[i38];
                    if (i45 > 0) {
                        break;
                    }
                    iArr10[i38] = i45 - 1;
                }
                if (i45 == 0) {
                    z23 = false;
                    if ((r34[0] & 1) == 0) {
                        iArr10[i38] = i44;
                        while (true) {
                            i45 = iArr10[i38];
                            if (i45 >= iArr11[i38]) {
                                break;
                            }
                            break;
                            break;
                            iArr10[i38] = i45 + 1;
                        }
                    }
                } else {
                    z23 = false;
                }
                int i78 = iArr11[i38];
                int i79 = (i78 - i45) + i618;
                if (i39 != i45) {
                    z24 = true;
                } else {
                    z24 = z23;
                }
                z14 |= z24;
                i28 = i78;
                i27 = i79;
            } else {
                z22 = z13;
                iArr10 = iArr4;
                iArr11 = iArr5;
                i38 = i26;
                jArr10 = jArr4;
            }
            i26 = i38 + 1;
            i19 = i19;
            iArr4 = iArr10;
            iArr5 = iArr11;
            w6Var5 = w6Var5;
            iArr3 = iArr15;
            jArr5 = jArr5;
            r15 = r34;
            z13 = z22;
            jArr4 = jArr10;
            ec1Var2 = ec1Var2;
        }
        w6Var6 = w6Var5;
        iArr6 = iArr4;
        iArr7 = iArr5;
        i29 = i27;
        ec1Var3 = ec1Var2;
        iArr8 = iArr3;
        r31 = r15;
        jArr6 = jArr4;
        jArr7 = jArr5;
        if (i29 != i19) {
            z15 = true;
        } else {
            z15 = false;
        }
        z16 = z14 | z15;
        if (z16) {
            jArr8 = new long[i29];
        } else {
            jArr8 = jArr7;
        }
        if (z16) {
            iArr9 = new int[i29];
        } else {
            iArr9 = iArr8;
        }
        if (true == z16) {
            i20 = 0;
        }
        if (z16) {
            r17 = new int[i29];
        } else {
            r17 = r31;
        }
        if (z16) {
            arrayList2 = new ArrayList();
        } else {
            arrayList2 = arrayList;
        }
        jArr9 = new long[i29];
        i30 = 0;
        z17 = false;
        i31 = 0;
        jA = 0;
        r33 = r31;
        while (i30 < i24) {
            jA2 = ec1Var.a(i30);
            i32 = iArr6[i30];
            boolean z28 = z17;
            i33 = iArr7[i30];
            z19 = z16;
            if (z16) {
                int i710 = i33 - i32;
                System.arraycopy(jArr7, i32, jArr8, i31, i710);
                System.arraycopy(iArr8, i32, iArr9, i31, i710);
                ?? r12 = r33;
                System.arraycopy(r12, i32, r17, i31, i710);
                r2 = r12;
            } else {
                r2 = r33;
            }
            int i711 = i20;
            i34 = i31;
            i35 = i32;
            i36 = i711;
            z20 = z28;
            r3 = r2;
            while (i35 < i33) {
                boolean z29 = z20;
                ?? r36 = r3;
                int i712 = i33;
                long j32 = w6Var6.f21419d;
                RoundingMode roundingMode4 = RoundingMode.DOWN;
                long jV10 = uu0.v(jA, 1000000L, j32, roundingMode4);
                long j33 = jArr6[i35] - jA2;
                int i713 = i35;
                i37 = i36;
                w6 w6Var10 = w6Var6;
                ec1 ec1Var5 = ec1Var;
                ArrayList arrayList5 = arrayList2;
                long[] jArr18 = jArr6;
                int i714 = i30;
                jV2 = uu0.v(j33, 1000000L, j17, roundingMode4);
                if (jV2 < 0) {
                    z21 = false;
                } else {
                    z21 = true;
                }
                boolean z210 = (!z21) | z29;
                jArr9[i34] = jV10 + jV2;
                if (z19) {
                    i36 = i37;
                } else {
                    i36 = i37;
                }
                if (!z19) {
                }
                i34++;
                i35 = i713 + 1;
                arrayList2 = arrayList5;
                z20 = z210;
                i30 = i714;
                ec1Var = ec1Var5;
                jArr6 = jArr18;
                i33 = i712;
                w6Var6 = w6Var10;
                r3 = r36;
            }
            r33 = r3;
            long[] jArr19 = jArr6;
            int i715 = i30;
            jA = ec1Var3.a(i715) + jA;
            i30 = i715 + 1;
            z17 = z20;
            i31 = i34;
            jArr6 = jArr19;
            i20 = i36;
            arrayList2 = arrayList2;
            ec1Var = ec1Var;
            z16 = z19;
            w6Var6 = w6Var6;
            jArr9 = jArr9;
        }
        long[] jArr110 = jArr9;
        ArrayList arrayList6 = arrayList2;
        z18 = z17;
        w6Var7 = w6Var6;
        long jV11 = uu0.v(jA, 1000000L, w6Var7.f21419d, RoundingMode.DOWN);
        if (z18) {
            g22Var2.getClass();
            i12 i12Var4 = new i12(g22Var2);
            i12Var4.f15517t = true;
            g22 g22Var8 = new g22(i12Var4);
            v6 v6Var4 = new v6(w6Var7);
            v6Var4.f21042g = g22Var8;
            w6Var7 = new w6(v6Var4);
        }
        return new z6(w6Var7, jArr8, iArr9, i20, jArr110, r17, gc1.m(arrayList6), r32, jV11, jArr8.length);
    }

    public static Pair h(j01 j01Var) {
        w01 w01VarG = j01Var.g(1701606260);
        if (w01VarG == null) {
            return null;
        }
        np0 np0Var = w01VarG.f21353c;
        np0Var.E(8);
        int iA = a(np0Var.b());
        int iH = np0Var.h();
        long[] jArrCopyOf = new long[iH];
        long[] jArrCopyOf2 = new long[iH];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < iH; i12++) {
            long j10 = iA == 1 ? np0Var.j() : np0Var.P();
            int i13 = i10 + 1;
            int length = jArrCopyOf.length;
            if (i13 > length) {
                int i14 = length + (length >> 1) + 1;
                if (i14 < i13) {
                    int iHighestOneBit = Integer.highestOneBit(i10);
                    i14 = iHighestOneBit + iHighestOneBit;
                }
                if (i14 < 0) {
                    i14 = Integer.MAX_VALUE;
                }
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i14);
            }
            jArrCopyOf[i10] = j10;
            i10++;
            long jD = iA == 1 ? np0Var.d() : np0Var.b();
            int i15 = i11 + 1;
            int length2 = jArrCopyOf2.length;
            if (i15 > length2) {
                int i16 = length2 + (length2 >> 1) + 1;
                if (i16 < i15) {
                    int iHighestOneBit2 = Integer.highestOneBit(i11);
                    i16 = iHighestOneBit2 + iHighestOneBit2;
                }
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i16 >= 0 ? i16 : Integer.MAX_VALUE);
            }
            jArrCopyOf2[i11] = jD;
            i11++;
            if (np0Var.N() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            np0Var.G(2);
        }
        ec1 ec1Var = ec1.f13930c;
        ec1 ec1Var2 = i10 == 0 ? ec1Var : new ec1(jArrCopyOf, i10);
        if (i11 != 0) {
            ec1Var = new ec1(jArrCopyOf2, i11);
        }
        return Pair.create(ec1Var2, ec1Var);
    }

    /* JADX WARN: Code duplicated, block: B:203:0x0446  */
    /* JADX WARN: Code duplicated, block: B:296:0x060f  */
    /* JADX WARN: Code duplicated, block: B:358:0x06cd A[LOOP:5: B:357:0x06cb->B:358:0x06cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:377:0x0721  */
    /* JADX WARN: Code duplicated, block: B:418:0x07ce A[PHI: r35
  0x07ce: PHI (r35v16 int) = (r35v14 int), (r35v13 int) binds: [B:423:0x07d9, B:416:0x07cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0153  */
    public static void i(np0 np0Var, int i10, int i11, int i12, int i13, String str, boolean z10, g02 g02Var, k3 k3Var, int i14) throws ab {
        int iL;
        int iL2;
        int iB;
        int i15;
        int iC;
        String str2;
        String str3;
        String str4;
        int i16;
        int i17;
        String str5;
        d6 d6Var;
        int i18;
        List listU;
        int i19;
        String str6;
        int i20;
        int i21;
        int i22;
        int i23;
        int iH;
        int i24;
        boolean z11;
        boolean z12;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z13;
        int iH2;
        int i32;
        String str7;
        np0 np0Var2 = np0Var;
        int i33 = i10;
        int i34 = i12;
        g02 g02VarA = g02Var;
        int[] iArr = x10.f21679e;
        int[] iArr2 = x10.f21677c;
        np0Var2.E(i11 + 16);
        if (z10) {
            iL = np0Var2.L();
            np0Var2.G(6);
        } else {
            np0Var2.G(8);
            iL = 0;
        }
        int i35 = 2;
        if (iL == 0 || iL == 1) {
            iL2 = np0Var2.L();
            np0Var2.G(6);
            int iF = np0Var2.f();
            np0Var2.E(np0Var2.f17881b - 4);
            iB = np0Var2.b();
            if (iL == 1) {
                np0Var2.G(16);
            }
            i15 = iF;
            iC = -1;
        } else {
            if (iL != 2) {
                return;
            }
            np0Var2.G(16);
            int iRound = (int) Math.round(Double.longBitsToDouble(np0Var2.d()));
            int iH3 = np0Var2.h();
            np0Var2.G(4);
            int iH4 = np0Var2.h();
            int iH5 = np0Var2.h();
            int i36 = iH5 & 1;
            int i37 = iH5 & 2;
            iC = i36 != 0 ? uu0.c(iH4, i37 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN) : uu0.b(iH4, i37 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            if (iC == 0) {
                iC = -1;
            }
            np0Var2.G(8);
            i15 = iRound;
            iL2 = iH3;
            iB = 0;
        }
        if (i33 == 1767992678) {
            i15 = -1;
            iL2 = -1;
        } else {
            if (i33 == 1935764850) {
                i15 = 8000;
            } else if (i33 == 1935767394) {
                i15 = 16000;
                i33 = 1935767394;
            }
            iL2 = 1;
        }
        int i38 = np0Var2.f17881b;
        int iIntValue = 1701733217;
        if (i33 == 1701733217) {
            Pair pairK = k(np0Var2, i11, i34);
            if (pairK != null) {
                iIntValue = ((Integer) pairK.first).intValue();
                g02VarA = g02VarA == null ? null : g02VarA.a(((x6) pairK.second).f21750b);
                ((x6[]) k3Var.f16295c)[i14] = (x6) pairK.second;
            }
            i33 = iIntValue;
            np0Var2.E(i38);
        }
        String str8 = "audio/mhm1";
        String str9 = MimeTypes.AUDIO_AC3;
        if (i33 == 1633889587) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (i33 == 1700998451) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (i33 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i33 == 1685353315) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (i33 == 1685353320 || i33 == 1685353324) {
            str2 = MimeTypes.AUDIO_DTS_HD;
        } else if (i33 == 1685353317) {
            str2 = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (i33 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i33 == 1935764850) {
            str2 = MimeTypes.AUDIO_AMR_NB;
        } else if (i33 == 1935767394) {
            str2 = MimeTypes.AUDIO_AMR_WB;
        } else if (i33 != 1936684916) {
            if (i33 == 1953984371) {
                iC = 268435456;
            } else if (i33 == 1819304813) {
                if (iC == -1) {
                    iC = i35;
                }
            } else if (i33 == 778924082 || i33 == 778924083) {
                str2 = MimeTypes.AUDIO_MPEG;
            } else if (i33 == 1835557169) {
                str2 = "audio/mha1";
            } else if (i33 == 1835560241) {
                str2 = "audio/mhm1";
            } else if (i33 == 1634492771) {
                str2 = MimeTypes.AUDIO_ALAC;
            } else if (i33 == 1634492791) {
                str2 = MimeTypes.AUDIO_ALAW;
            } else if (i33 == 1970037111) {
                str2 = MimeTypes.AUDIO_MLAW;
            } else if (i33 == 1332770163) {
                str2 = MimeTypes.AUDIO_OPUS;
            } else if (i33 == 1716281667) {
                str2 = MimeTypes.AUDIO_FLAC;
            } else if (i33 == 1835823201) {
                str2 = MimeTypes.AUDIO_TRUEHD;
            } else if (i33 == 1767992678) {
                str2 = "audio/iamf";
                i33 = 1767992678;
            } else {
                str2 = null;
            }
            str2 = MimeTypes.AUDIO_RAW;
        } else {
            iC = i35;
            str2 = MimeTypes.AUDIO_RAW;
        }
        int i39 = i15;
        int i40 = iC;
        List listU2 = null;
        String strJ = null;
        d6 d6Var2 = null;
        e1 e1Var = null;
        while (i38 - i11 < i34) {
            np0Var2.E(i38);
            int iB2 = np0Var2.b();
            iL2 = iL2;
            v71.m("childAtomSize must be positive", iB2 > 0);
            int iB3 = np0Var2.b();
            if (iB3 == 1835557187) {
                np0Var2.E(i38 + 8);
                np0Var2.G(1);
                int iK = np0Var2.K();
                np0Var2.G(1);
                String str10 = Objects.equals(str2, str8) ? String.format("mhm1.%02X", Integer.valueOf(iK)) : String.format("mha1.%02X", Integer.valueOf(iK));
                int iL3 = np0Var2.L();
                byte[] bArr = new byte[iL3];
                strJ = str10;
                np0Var2.H(bArr, 0, iL3);
                if (listU2 == null) {
                    listU2 = ca1.u(bArr);
                    iL2 = iL2;
                    str9 = str9;
                    str2 = str2;
                    i38 = i38;
                    iB2 = iB2;
                    str3 = str8;
                    i33 = i33;
                } else {
                    listU2 = ca1.v(bArr, (byte[]) listU2.get(0));
                    str3 = str8;
                    i33 = i33;
                }
            } else if (iB3 == 1835557200) {
                np0Var2.E(i38 + 8);
                int iK2 = np0Var2.K();
                if (iK2 > 0) {
                    byte[] bArr2 = new byte[iK2];
                    np0Var2.H(bArr2, 0, iK2);
                    if (listU2 == null) {
                        listU2 = ca1.u(bArr2);
                        str9 = str9;
                        str2 = str2;
                        i38 = i38;
                        iB2 = iB2;
                        str3 = str8;
                        i33 = i33;
                        iL2 = iL2;
                    } else {
                        listU2 = ca1.v((byte[]) listU2.get(0), bArr2);
                        str3 = str8;
                        i33 = i33;
                    }
                } else {
                    str4 = str2;
                    i38 = i38;
                    str3 = str8;
                    str2 = str4;
                    i39 = i39;
                    listU2 = listU2;
                }
            } else {
                str3 = str8;
                if (iB3 == 1702061171) {
                    str4 = str2;
                    i38 = i38;
                    i16 = i38;
                    i17 = -1;
                } else if (z10 && iB3 == 2002876005) {
                    int i41 = np0Var2.f17881b;
                    v71.m(null, i41 >= i38);
                    while (true) {
                        if (i41 - i38 < iB2) {
                            np0Var2.E(i41);
                            int iB4 = np0Var2.b();
                            v71.m("childAtomSize must be positive", iB4 > 0);
                            int i42 = i41;
                            if (np0Var2.b() != 1702061171) {
                                i41 = i42 + iB4;
                            } else {
                                str4 = str2;
                                i38 = i38;
                                i17 = -1;
                                i16 = i42;
                            }
                        } else {
                            str4 = str2;
                            i38 = i38;
                            i17 = -1;
                            i16 = -1;
                        }
                    }
                } else if (iB3 == 1651798644) {
                    np0Var2.E(i38 + 8);
                    np0Var2.G(4);
                    e1Var = new e1(np0Var2.P(), np0Var2.P());
                    i33 = i33;
                } else {
                    i38 = i38;
                    if (iB3 == 1684103987) {
                        np0Var2.E(i38 + 8);
                        String string = Integer.toString(i13);
                        gp0 gp0Var = new gp0();
                        gp0Var.a(np0Var2);
                        int i43 = iArr2[gp0Var.h(i35)];
                        gp0Var.f(8);
                        int i44 = iArr[gp0Var.h(3)];
                        if (gp0Var.h(1) != 0) {
                            i44++;
                        }
                        int i45 = x10.f21680f[gp0Var.h(5)] * 1000;
                        gp0Var.k();
                        np0Var2.E(gp0Var.c());
                        i12 i12Var = new i12();
                        i12Var.f15499a = string;
                        i12Var.e(str9);
                        i12Var.F = i44;
                        i12Var.H = i43;
                        i12Var.f15515r = g02VarA;
                        i12Var.f15502d = str;
                        i12Var.f15506h = i45;
                        i12Var.f15507i = i45;
                        k3Var.f16296d = new g22(i12Var);
                        str4 = str2;
                    } else if (iB3 == 1684366131) {
                        np0Var2.E(i38 + 8);
                        String string2 = Integer.toString(i13);
                        gp0 gp0Var2 = new gp0();
                        gp0Var2.a(np0Var2);
                        int iH6 = gp0Var2.h(13) * 1000;
                        gp0Var2.f(3);
                        int i46 = iArr2[gp0Var2.h(2)];
                        gp0Var2.f(10);
                        int i47 = iArr[gp0Var2.h(3)];
                        if (gp0Var2.h(1) != 0) {
                            i47++;
                        }
                        gp0Var2.f(3);
                        int iH7 = gp0Var2.h(4);
                        gp0Var2.f(1);
                        int i48 = i47;
                        if (iH7 > 0) {
                            gp0Var2.f(6);
                            i47 = gp0Var2.h(1) != 0 ? i48 + 2 : i48;
                            gp0Var2.f(1);
                        }
                        if (gp0Var2.b() > 7) {
                            gp0Var2.f(7);
                            if (gp0Var2.h(1) != 0) {
                                str7 = MimeTypes.AUDIO_E_AC3_JOC;
                            } else {
                                str7 = MimeTypes.AUDIO_E_AC3;
                            }
                        } else {
                            str7 = MimeTypes.AUDIO_E_AC3;
                        }
                        gp0Var2.k();
                        np0Var2.E(gp0Var2.c());
                        i12 i12Var2 = new i12();
                        i12Var2.f15499a = string2;
                        i12Var2.e(str7);
                        i12Var2.F = i47;
                        i12Var2.H = i46;
                        i12Var2.f15515r = g02VarA;
                        i12Var2.f15502d = str;
                        i12Var2.f15507i = iH6;
                        k3Var.f16296d = new g22(i12Var2);
                        str4 = str2;
                    } else {
                        str9 = str9;
                        iB2 = iB2;
                        if (iB3 == 1684103988) {
                            np0Var2.E(i38 + 8);
                            String string3 = Integer.toString(i13);
                            gp0 gp0Var3 = new gp0();
                            gp0Var3.a(np0Var2);
                            int iB5 = gp0Var3.b();
                            int iH8 = gp0Var3.h(3);
                            if (iH8 > 1) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(iH8).length() + 30);
                                sb2.append("Unsupported AC-4 DSI version: ");
                                sb2.append(iH8);
                                throw ab.b(sb2.toString());
                            }
                            int iH9 = gp0Var3.h(7);
                            int i49 = true != gp0Var3.g() ? 44100 : 48000;
                            gp0Var3.f(4);
                            int iH10 = gp0Var3.h(9);
                            if (iH9 > 1) {
                                if (iH8 == 0) {
                                    throw ab.b("Invalid AC-4 DSI version: 0");
                                }
                                if (gp0Var3.g()) {
                                    gp0Var3.f(16);
                                    if (gp0Var3.g()) {
                                        gp0Var3.f(128);
                                    }
                                }
                            }
                            if (iH8 == 1) {
                                if (gp0Var3.b() < 66) {
                                    throw ab.b("Invalid AC-4 DSI bitrate.");
                                }
                                gp0Var3.f(66);
                                gp0Var3.k();
                            }
                            x1 x1Var = new x1();
                            x1Var.f21668a = true;
                            x1Var.f21669b = -1;
                            x1Var.f21670c = -1;
                            x1Var.f21671d = true;
                            x1Var.f21672e = 2;
                            x1Var.f21673f = 1;
                            x1Var.f21674g = 0;
                            int i50 = 0;
                            while (true) {
                                if (i50 < iH10) {
                                    if (iH8 == 0) {
                                        boolean zG = gp0Var3.g();
                                        int iH11 = gp0Var3.h(5);
                                        i19 = i33;
                                        str6 = str2;
                                        iH = gp0Var3.h(5);
                                        i24 = 0;
                                        z11 = false;
                                        z12 = zG;
                                        i25 = iH11;
                                        i26 = 0;
                                    } else {
                                        int i51 = iH10;
                                        int iH12 = gp0Var3.h(8);
                                        str6 = str2;
                                        int iH13 = gp0Var3.h(8);
                                        i19 = i33;
                                        int iH14 = iH13 == 255 ? gp0Var3.h(16) + 255 : iH13;
                                        if (iH12 > 2) {
                                            gp0Var3.f(iH14 * 8);
                                            i50++;
                                            iH10 = i51;
                                            str2 = str6;
                                            i33 = i19;
                                        } else {
                                            int iB6 = (iB5 - gp0Var3.b()) / 8;
                                            int i52 = iH14;
                                            int iH15 = gp0Var3.h(5);
                                            z11 = iH15 == 31;
                                            i26 = iB6;
                                            iH = iH12;
                                            z12 = false;
                                            i25 = iH15;
                                            i24 = i52;
                                        }
                                    }
                                    x1Var.f21673f = iH;
                                    boolean z14 = z11;
                                    if (z12 || z14 || i25 != 6) {
                                        x1Var.f21674g = gp0Var3.h(3);
                                        if (gp0Var3.g()) {
                                            gp0Var3.f(5);
                                        }
                                        gp0Var3.f(2);
                                        if (iH8 == 1) {
                                            if (iH == 1) {
                                                gp0Var3.f(2);
                                            } else if (iH == 2) {
                                                iH = 2;
                                                gp0Var3.f(2);
                                            }
                                        }
                                        gp0Var3.f(5);
                                        gp0Var3.f(10);
                                        if (iH8 == 1) {
                                            if (iH > 0) {
                                                x1Var.f21668a = gp0Var3.g();
                                            }
                                            if (x1Var.f21668a) {
                                                if (iH != 1) {
                                                    if (iH == 2) {
                                                        i31 = 2;
                                                    } else {
                                                        i29 = iH;
                                                    }
                                                    gp0Var3.f(24);
                                                    i28 = 1;
                                                } else {
                                                    i31 = 1;
                                                }
                                                int iH16 = gp0Var3.h(5);
                                                if (iH16 >= 0 && iH16 <= 15) {
                                                    x1Var.f21669b = iH16;
                                                }
                                                if (iH16 >= 11 && iH16 <= 14) {
                                                    x1Var.f21671d = gp0Var3.g();
                                                    x1Var.f21672e = gp0Var3.h(2);
                                                }
                                                i29 = i31;
                                                gp0Var3.f(24);
                                                i28 = 1;
                                            } else {
                                                i28 = 1;
                                                i29 = iH;
                                            }
                                            if (iH != i28) {
                                                i30 = 2;
                                                if (iH != 2) {
                                                    i27 = i29;
                                                }
                                            } else {
                                                i30 = 2;
                                            }
                                            if (gp0Var3.g() && gp0Var3.g()) {
                                                gp0Var3.f(i30);
                                            }
                                            if (gp0Var3.g()) {
                                                gp0Var3.e();
                                                int i53 = 8;
                                                int iH17 = gp0Var3.h(8);
                                                i27 = i29;
                                                int i54 = 0;
                                                while (i54 < iH17) {
                                                    gp0Var3.f(i53);
                                                    i54++;
                                                    i53 = 8;
                                                }
                                            } else {
                                                i27 = i29;
                                            }
                                        } else {
                                            i27 = iH;
                                        }
                                        if (!z12 && !z14) {
                                            gp0Var3.e();
                                            if (i25 == 0 || i25 == 1 || i25 == 2) {
                                                if (i27 == 0) {
                                                    for (int i55 = 0; i55 < 2; i55++) {
                                                        rb0.B(gp0Var3, x1Var);
                                                    }
                                                    i27 = 0;
                                                } else {
                                                    for (int i56 = 0; i56 < 2; i56++) {
                                                        rb0.E(gp0Var3, x1Var);
                                                    }
                                                }
                                            } else if (i25 == 3 || i25 == 4) {
                                                if (i27 == 0) {
                                                    for (int i57 = 0; i57 < 3; i57++) {
                                                        rb0.B(gp0Var3, x1Var);
                                                    }
                                                    i27 = 0;
                                                } else {
                                                    for (int i58 = 0; i58 < 3; i58++) {
                                                        rb0.E(gp0Var3, x1Var);
                                                    }
                                                }
                                            } else if (i25 != 5) {
                                                int iH18 = gp0Var3.h(7);
                                                for (int i59 = 0; i59 < iH18; i59++) {
                                                    gp0Var3.f(8);
                                                }
                                            } else if (i27 == 0) {
                                                rb0.B(gp0Var3, x1Var);
                                                i27 = 0;
                                            } else {
                                                int iH19 = gp0Var3.h(3);
                                                for (int i60 = 0; i60 < iH19 + 2; i60++) {
                                                    rb0.E(gp0Var3, x1Var);
                                                }
                                            }
                                        } else if (i27 == 0) {
                                            rb0.B(gp0Var3, x1Var);
                                            i27 = 0;
                                        } else {
                                            rb0.E(gp0Var3, x1Var);
                                        }
                                        gp0Var3.e();
                                        if (gp0Var3.g()) {
                                            iH = i27;
                                            iH2 = gp0Var3.h(7);
                                            for (i32 = 0; i32 < iH2; i32++) {
                                                gp0Var3.f(15);
                                            }
                                            i27 = iH;
                                        }
                                    } else {
                                        iH2 = gp0Var3.h(7);
                                        while (i32 < iH2) {
                                            gp0Var3.f(15);
                                        }
                                        i27 = iH;
                                    }
                                    if (i27 > 0) {
                                        if (gp0Var3.g()) {
                                            if (gp0Var3.b() < 66) {
                                                z13 = false;
                                            } else {
                                                gp0Var3.f(66);
                                                z13 = true;
                                            }
                                            if (!z13) {
                                                throw ab.b("Can't parse bitrate DSI.");
                                            }
                                        }
                                        if (gp0Var3.g()) {
                                            gp0Var3.k();
                                            gp0Var3.l(gp0Var3.h(16));
                                            int iH20 = gp0Var3.h(5);
                                            for (int i61 = 0; i61 < iH20; i61++) {
                                                gp0Var3.f(3);
                                                gp0Var3.f(8);
                                            }
                                        }
                                    }
                                    i20 = 8;
                                    gp0Var3.k();
                                    if (iH8 == 1) {
                                        int iB7 = ((iB5 - gp0Var3.b()) / 8) - i26;
                                        if (i24 < iB7) {
                                            throw ab.b("pres_bytes is smaller than presentation bytes read.");
                                        }
                                        gp0Var3.l(i24 - iB7);
                                    }
                                    if (x1Var.f21668a && x1Var.f21669b == -1) {
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(i50).length() + 45);
                                        sb3.append("Can't determine channel mode of presentation ");
                                        sb3.append(i50);
                                        throw ab.b(sb3.toString());
                                    }
                                } else {
                                    i19 = i33;
                                    str6 = str2;
                                    i20 = 8;
                                }
                                if (x1Var.f21668a) {
                                    int i62 = x1Var.f21669b;
                                    boolean z15 = x1Var.f21671d;
                                    int i63 = x1Var.f21672e;
                                    switch (i62) {
                                        case 0:
                                            i22 = 11;
                                            i23 = 1;
                                            break;
                                        case 1:
                                            i22 = 11;
                                            i23 = 2;
                                            break;
                                        case 2:
                                            i22 = 11;
                                            i23 = 3;
                                            break;
                                        case 3:
                                            i22 = 11;
                                            i23 = 5;
                                            break;
                                        case 4:
                                            i22 = 11;
                                            i23 = 6;
                                            break;
                                        case 5:
                                        case 7:
                                        case 9:
                                            i22 = 11;
                                            i23 = 7;
                                            break;
                                        case 6:
                                        case 8:
                                        case 10:
                                            i23 = i20;
                                            i22 = 11;
                                            break;
                                        case 11:
                                            i22 = 11;
                                            i23 = 11;
                                            break;
                                        case 12:
                                            i23 = 12;
                                            i22 = 11;
                                            break;
                                        case 13:
                                            i22 = 11;
                                            i23 = 13;
                                            break;
                                        case 14:
                                            i22 = 11;
                                            i23 = 14;
                                            break;
                                        case 15:
                                            i22 = 11;
                                            i23 = 24;
                                            break;
                                        default:
                                            i22 = 11;
                                            i23 = -1;
                                            break;
                                    }
                                    if (i62 == i22 || i62 == 12 || i62 == 13 || i62 == 14) {
                                        if (!z15) {
                                            i23 -= 2;
                                        }
                                        if (i63 == 0) {
                                            i21 = i23 - 4;
                                        } else if (i63 != 1) {
                                            i21 = i23;
                                        } else {
                                            i21 = i23 - 2;
                                        }
                                    } else {
                                        i21 = i23;
                                    }
                                } else {
                                    int i64 = x1Var.f21670c;
                                    if (i64 > 0) {
                                        i21 = i64 + 1;
                                        if (x1Var.f21674g == 4 && i21 == 17) {
                                            i21 = 21;
                                        }
                                    } else {
                                        int i65 = x1Var.f21674g;
                                        if (i65 == 0) {
                                            i21 = 2;
                                        } else if (i65 == 1) {
                                            i21 = 6;
                                        } else if (i65 == 2) {
                                            i21 = i20;
                                        } else if (i65 == 3) {
                                            i21 = 10;
                                        } else if (i65 != 4) {
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(i65).length() + 33);
                                            sb4.append("AC-4 level ");
                                            sb4.append(i65);
                                            sb4.append(" has not been defined.");
                                            v71.y("Ac4Util", sb4.toString());
                                            i21 = 2;
                                        } else {
                                            i21 = 12;
                                        }
                                    }
                                }
                                if (i21 <= 0) {
                                    throw ab.b("Cannot determine channel count of presentation.");
                                }
                                Object[] objArr = {Integer.valueOf(iH9), Integer.valueOf(x1Var.f21673f), Integer.valueOf(x1Var.f21674g)};
                                String str11 = uu0.f20901a;
                                String str12 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                i12 i12Var3 = new i12();
                                i12Var3.f15499a = string3;
                                i12Var3.e("audio/ac4");
                                i12Var3.F = i21;
                                i12Var3.H = i49;
                                i12Var3.f15515r = g02VarA;
                                i12Var3.f15502d = str;
                                i12Var3.f15508j = str12;
                                k3Var.f16296d = new g22(i12Var3);
                                iL2 = iL2;
                                str4 = str6;
                                i33 = i19;
                                str2 = str4;
                                i39 = i39;
                                listU2 = listU2;
                            }
                        } else {
                            i33 = i33;
                            str2 = str2;
                            listU2 = listU2;
                            if (iB3 != 1684892784) {
                                if (iB3 == 1684305011 || iB3 == 1969517683) {
                                    i33 = i33;
                                    i12 i12Var4 = new i12();
                                    i12Var4.c(i13);
                                    str4 = str2;
                                    i12Var4.e(str4);
                                    iL2 = iL2;
                                    i12Var4.F = iL2;
                                    i39 = i39;
                                    i12Var4.H = i39;
                                    i12Var4.f15515r = g02VarA;
                                    i12Var4.f15502d = str;
                                    k3Var.f16296d = new g22(i12Var4);
                                } else {
                                    if (iB3 == 1682927731) {
                                        int i66 = iB2 - 8;
                                        byte[] bArr3 = f14774a;
                                        int length = bArr3.length;
                                        byte[] bArrCopyOf = Arrays.copyOf(bArr3, length + i66);
                                        np0Var.E(i38 + 8);
                                        np0Var.H(bArrCopyOf, length, i66);
                                        listU = x10.f(bArrCopyOf);
                                    } else if (iB3 == 1684425825) {
                                        byte[] bArr4 = new byte[iB2 - 8];
                                        bArr4[0] = 102;
                                        bArr4[1] = 76;
                                        bArr4[2] = 97;
                                        bArr4[3] = 67;
                                        np0Var.E(i38 + 12);
                                        np0Var.H(bArr4, 4, iB2 - 12);
                                        listU = ca1.u(bArr4);
                                    } else if (iB3 == 1634492771) {
                                        int i67 = iB2 - 12;
                                        byte[] bArr5 = new byte[i67];
                                        np0Var.E(i38 + 12);
                                        np0Var.H(bArr5, 0, i67);
                                        byte[] bArr6 = re0.f19567a;
                                        np0 np0Var3 = new np0(bArr5);
                                        np0Var3.E(5);
                                        int iK3 = np0Var3.K();
                                        np0Var3.E(9);
                                        int iK4 = np0Var3.K();
                                        np0Var3.E(20);
                                        int[] iArr3 = {np0Var3.h(), iK4, iK3};
                                        int i68 = iArr3[0];
                                        int i69 = iArr3[1];
                                        int iB8 = uu0.b(iK3, ByteOrder.LITTLE_ENDIAN);
                                        if (iB8 == 0) {
                                            iB8 = -1;
                                        }
                                        listU2 = ca1.u(bArr5);
                                        iL2 = i69;
                                        i40 = iB8;
                                        i39 = i68;
                                    } else if (iB3 == 1767990114) {
                                        np0Var.E(i38 + 9);
                                        int iA = gc1.a(np0Var.p());
                                        byte[] bArr7 = new byte[iA];
                                        np0Var.H(bArr7, 0, iA);
                                        byte[] bArr8 = re0.f19567a;
                                        np0 np0Var4 = new np0(bArr7);
                                        String str13 = null;
                                        String str14 = null;
                                        while (np0Var4.B() > 0 && (str13 == null || str14 == null)) {
                                            int iK5 = np0Var4.K();
                                            int i70 = iK5 >> 3;
                                            int i71 = iK5 & 2;
                                            int i72 = iK5 & 1;
                                            int iA2 = gc1.a(np0Var4.p());
                                            if (i70 > 4 && i70 < 24 && i71 != 0) {
                                                do {
                                                } while ((np0Var4.K() & 128) != 0);
                                                for (i18 = 128; (np0Var4.K() & i18) != 0; i18 = 128) {
                                                }
                                            }
                                            if (i72 != 0) {
                                                np0Var4.G(gc1.a(np0Var4.p()));
                                            }
                                            int i73 = np0Var4.f17881b + iA2;
                                            if (i70 == 31) {
                                                np0Var4.G(4);
                                                Object[] objArr2 = {Integer.valueOf(np0Var4.K()), Integer.valueOf(np0Var4.K())};
                                                String str15 = uu0.f20901a;
                                                str13 = String.format(Locale.US, "iamf.%03X.%03X", objArr2);
                                            } else {
                                                if (i70 == 0) {
                                                    while ((np0Var4.K() & 128) != 0) {
                                                    }
                                                    String strK = np0Var4.k(4, StandardCharsets.UTF_8);
                                                    if (strK.equals("mp4a")) {
                                                        while ((np0Var4.K() & 128) != 0) {
                                                        }
                                                        np0Var4.G(2);
                                                        gp0 gp0Var4 = new gp0();
                                                        gp0Var4.a(np0Var4);
                                                        int iH21 = gp0Var4.h(5);
                                                        if (iH21 == 31) {
                                                            iH21 = gp0Var4.h(6) + 32;
                                                        }
                                                        StringBuilder sb5 = new StringBuilder(strK.length() + 4 + String.valueOf(iH21).length());
                                                        sb5.append(strK);
                                                        sb5.append(".40.");
                                                        sb5.append(iH21);
                                                        strK = sb5.toString();
                                                    }
                                                    str14 = strK;
                                                }
                                                np0Var4.E(i73);
                                            }
                                            np0Var4.E(i73);
                                        }
                                        strJ = (str13 == null || str14 == null) ? null : q4.a.j(new StringBuilder(str13.length() + 1 + str14.length()), str13, ".", str14);
                                        listU2 = ca1.u(bArr7);
                                        i33 = i33;
                                    } else if (iB3 == 1885564227) {
                                        np0Var.E(i38 + 12);
                                        ByteOrder byteOrder = (np0Var.K() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                        int iK6 = np0Var.K();
                                        i33 = i33;
                                        int iB9 = i33 == 1768973165 ? uu0.b(iK6, byteOrder) : i33 == 1718641517 ? uu0.c(iK6, byteOrder) : i40;
                                        if (iB9 == 0) {
                                            iB9 = -1;
                                        }
                                        i40 = iB9;
                                        if (iB9 != -1) {
                                            str2 = MimeTypes.AUDIO_RAW;
                                        }
                                        listU2 = listU2;
                                    } else {
                                        i33 = i33;
                                        iL2 = iL2;
                                        i39 = i39;
                                        str4 = str2;
                                    }
                                    iL2 = iL2;
                                    listU2 = listU;
                                }
                                str2 = str4;
                                i39 = i39;
                                listU2 = listU2;
                            } else {
                                if (iB <= 0) {
                                    StringBuilder sb6 = new StringBuilder(String.valueOf(iB).length() + 49);
                                    sb6.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                    sb6.append(iB);
                                    throw ab.a(null, sb6.toString());
                                }
                                i39 = iB;
                                listU2 = listU2;
                                iL2 = 2;
                            }
                        }
                    }
                    str2 = str4;
                    i39 = i39;
                    listU2 = listU2;
                }
                if (i16 != i17) {
                    d6 d6VarJ = j(i16, np0Var2);
                    str4 = d6VarJ.f13428a;
                    byte[] bArr9 = d6VarJ.f13429b;
                    if (bArr9 == null) {
                        d6Var2 = d6VarJ;
                    } else if (MimeTypes.AUDIO_VORBIS.equals(str4)) {
                        dc1 dc1Var = j3.f15942a;
                        np0 np0Var5 = new np0(bArr9);
                        int i74 = 1;
                        np0Var5.G(1);
                        int i75 = 0;
                        while (true) {
                            d6Var = d6VarJ;
                            if (np0Var5.B() > 0 && np0Var5.I() == 255) {
                                np0Var5.G(i74);
                                i75 += 255;
                                d6VarJ = d6Var;
                                i74 = 1;
                            }
                        }
                        int iK7 = np0Var5.K() + i75;
                        int i76 = 0;
                        while (np0Var5.B() > 0 && np0Var5.I() == 255) {
                            np0Var5.G(1);
                            i76 += 255;
                        }
                        int iK8 = np0Var5.K() + i76;
                        byte[] bArr10 = new byte[iK7];
                        int i77 = np0Var5.f17881b;
                        System.arraycopy(bArr9, i77, bArr10, 0, iK7);
                        int i78 = i77 + iK7 + iK8;
                        int length2 = bArr9.length - i78;
                        byte[] bArr11 = new byte[length2];
                        System.arraycopy(bArr9, i78, bArr11, 0, length2);
                        listU2 = ca1.v(bArr10, bArr11);
                        d6Var2 = d6Var;
                        str2 = str4;
                        i39 = i39;
                    } else {
                        if (MimeTypes.AUDIO_AAC.equals(str4)) {
                            v1 v1VarP = dv.p(new gp0(bArr9, bArr9.length), false);
                            i39 = v1VarP.f20994b;
                            iL2 = v1VarP.f20995c;
                            str5 = v1VarP.f20993a;
                        } else {
                            str5 = strJ;
                        }
                        d6Var2 = d6VarJ;
                        str2 = str4;
                        i39 = i39;
                        strJ = str5;
                        listU2 = ca1.u(bArr9);
                    }
                }
                str2 = str4;
                i39 = i39;
                listU2 = listU2;
            }
            i38 += iB2;
            i35 = 2;
            np0Var2 = np0Var;
            i34 = i12;
            i33 = i33;
            str8 = str3;
            str9 = str9;
            str2 = str2;
        }
        String str16 = str2;
        List list = listU2;
        int i79 = i39;
        if (((g22) k3Var.f16296d) != null || str16 == null) {
            return;
        }
        i12 i12Var5 = new i12();
        i12Var5.c(i13);
        i12Var5.e(str16);
        i12Var5.f15508j = strJ;
        i12Var5.F = iL2;
        i12Var5.H = i79;
        i12Var5.I = i40;
        i12Var5.f15514q = list;
        i12Var5.f15515r = g02VarA;
        i12Var5.f15502d = str;
        d6 d6Var3 = d6Var2;
        if (d6Var3 != null) {
            i12Var5.f15506h = gc1.e(d6Var3.f13430c);
            i12Var5.f15507i = gc1.e(d6Var3.f13431d);
        } else {
            e1 e1Var2 = e1Var;
            if (e1Var2 != null) {
                i12Var5.f15506h = gc1.e(e1Var2.f13801a);
                i12Var5.f15507i = gc1.e(e1Var2.f13802b);
            }
        }
        k3Var.f16296d = new g22(i12Var5);
    }

    public static d6 j(int i10, np0 np0Var) {
        np0Var.E(i10 + 12);
        np0Var.G(1);
        l(np0Var);
        np0Var.G(2);
        int iK = np0Var.K();
        if ((iK & 128) != 0) {
            np0Var.G(2);
        }
        if ((iK & 64) != 0) {
            np0Var.G(np0Var.K());
        }
        if ((iK & 32) != 0) {
            np0Var.G(2);
        }
        np0Var.G(1);
        l(np0Var);
        String strD = na.d(np0Var.K());
        if (MimeTypes.AUDIO_MPEG.equals(strD) || MimeTypes.AUDIO_DTS.equals(strD) || MimeTypes.AUDIO_DTS_HD.equals(strD)) {
            return new d6(strD, null, -1L, -1L);
        }
        np0Var.G(4);
        long jP = np0Var.P();
        long jP2 = np0Var.P();
        np0Var.G(1);
        int iL = l(np0Var);
        long j10 = jP2;
        byte[] bArr = new byte[iL];
        np0Var.H(bArr, 0, iL);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new d6(strD, bArr, j10, jP > 0 ? jP : -1L);
    }

    public static Pair k(np0 np0Var, int i10, int i11) throws ab {
        x6 x6Var;
        Pair pairCreate;
        int i12;
        int i13;
        int i14 = np0Var.f17881b;
        while (i14 - i10 < i11) {
            np0Var.E(i14);
            int iB = np0Var.b();
            v71.m("childAtomSize must be positive", iB > 0);
            if (np0Var.b() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = 0;
                int i17 = -1;
                Integer numValueOf = null;
                String strK = null;
                while (i15 - i14 < iB) {
                    np0Var.E(i15);
                    int iB2 = np0Var.b();
                    int iB3 = np0Var.b();
                    if (iB3 == 1718775137) {
                        numValueOf = Integer.valueOf(np0Var.b());
                    } else if (iB3 == 1935894637) {
                        np0Var.G(4);
                        strK = np0Var.k(4, StandardCharsets.UTF_8);
                    } else if (iB3 == 1935894633) {
                        i17 = i15;
                        i16 = iB2;
                    }
                    i15 += iB2;
                }
                byte[] bArr = null;
                if (C.CENC_TYPE_cenc.equals(strK) || C.CENC_TYPE_cbc1.equals(strK) || C.CENC_TYPE_cens.equals(strK) || C.CENC_TYPE_cbcs.equals(strK)) {
                    v71.m("frma atom is mandatory", numValueOf != null);
                    v71.m("schi atom is mandatory", i17 != -1);
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 >= i16) {
                            x6Var = null;
                            break;
                        }
                        np0Var.E(i18);
                        int iB4 = np0Var.b();
                        if (np0Var.b() == 1952804451) {
                            int iA = a(np0Var.b());
                            np0Var.G(1);
                            if (iA == 0) {
                                np0Var.G(1);
                                i13 = 0;
                                i12 = 0;
                            } else {
                                int iK = np0Var.K();
                                i12 = iK & 15;
                                i13 = (iK & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                            }
                            boolean z10 = np0Var.K() == 1;
                            int iK2 = np0Var.K();
                            byte[] bArr2 = new byte[16];
                            np0Var.H(bArr2, 0, 16);
                            if (z10 && iK2 == 0) {
                                int iK3 = np0Var.K();
                                byte[] bArr3 = new byte[iK3];
                                np0Var.H(bArr3, 0, iK3);
                                bArr = bArr3;
                            }
                            x6Var = new x6(z10, strK, iK2, bArr2, i13, i12, bArr);
                            break;
                        }
                        i18 += iB4;
                    }
                    v71.m("tenc atom is mandatory", x6Var != null);
                    String str = uu0.f20901a;
                    pairCreate = Pair.create(numValueOf, x6Var);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i14 += iB;
        }
        return null;
    }

    public static int l(np0 np0Var) {
        int iK = np0Var.K();
        int i10 = iK & 127;
        while ((iK & 128) == 128) {
            iK = np0Var.K();
            i10 = (i10 << 7) | (iK & 127);
        }
        return i10;
    }
}
