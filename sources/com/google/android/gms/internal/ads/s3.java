package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.BuildConfig;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s3 implements m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ca1 f19811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19812b;

    public s3(int i10, ya1 ya1Var) {
        this.f19812b = i10;
        this.f19811a = ya1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static s3 a(int i10, np0 np0Var) {
        String str;
        String str2;
        m3 u3Var;
        String str3;
        rb0.p(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = np0Var.f17882c;
        int iA = -2;
        int i12 = 0;
        while (np0Var.B() > 8) {
            int iC = np0Var.c();
            int iC2 = np0Var.f17881b + np0Var.c();
            np0Var.C(iC2);
            if (iC != 1414744396) {
                q3 q3Var = null;
                switch (iC) {
                    case 1718776947:
                        if (iA != 2) {
                            if (iA == 1) {
                                int iM = np0Var.M();
                                if (iM == 1) {
                                    str2 = MimeTypes.AUDIO_RAW;
                                } else if (iM == 85) {
                                    str2 = MimeTypes.AUDIO_MPEG;
                                } else if (iM == 255) {
                                    str2 = MimeTypes.AUDIO_AAC;
                                } else if (iM != 8192) {
                                    str2 = iM != 8193 ? null : MimeTypes.AUDIO_DTS;
                                } else {
                                    str2 = MimeTypes.AUDIO_AC3;
                                }
                                if (str2 != null) {
                                    int iM2 = np0Var.M();
                                    int iC3 = np0Var.c();
                                    np0Var.G(6);
                                    int iB = uu0.b(np0Var.M(), ByteOrder.LITTLE_ENDIAN);
                                    int iM3 = np0Var.B() > 0 ? np0Var.M() : 0;
                                    i12 i12Var = new i12();
                                    i12Var.e(str2);
                                    i12Var.F = iM2;
                                    i12Var.H = iC3;
                                    if (str2.equals(MimeTypes.AUDIO_RAW) && iB != 0) {
                                        i12Var.I = iB;
                                    }
                                    if (str2.equals(MimeTypes.AUDIO_AAC) && iM3 > 0) {
                                        byte[] bArr = new byte[iM3];
                                        np0Var.H(bArr, 0, iM3);
                                        i12Var.f15514q = ca1.u(bArr);
                                    }
                                    u3Var = new u3(new g22(i12Var));
                                } else {
                                    com.applovin.impl.ca.r(new StringBuilder(String.valueOf(iM).length() + 43), "Ignoring track with unsupported format tag ", iM, "StreamFormatChunk");
                                }
                            } else {
                                String str4 = uu0.f20901a;
                                switch (iA) {
                                    case -2:
                                        str = "none";
                                        break;
                                    case -1:
                                        str = "unknown";
                                        break;
                                    case 0:
                                        str = BuildConfig.FLAVOR;
                                        break;
                                    case 1:
                                        str = "audio";
                                        break;
                                    case 2:
                                        str = "video";
                                        break;
                                    case 3:
                                        str = "text";
                                        break;
                                    case 4:
                                        str = "image";
                                        break;
                                    case 5:
                                        str = TtmlNode.TAG_METADATA;
                                        break;
                                    default:
                                        str = "camera motion";
                                        break;
                                }
                                v71.y("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(str));
                            }
                            u3Var = q3Var;
                            break;
                        } else {
                            np0Var.G(4);
                            int iC4 = np0Var.c();
                            int iC5 = np0Var.c();
                            np0Var.G(4);
                            int iC6 = np0Var.c();
                            switch (iC6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str3 = MimeTypes.VIDEO_MP4V;
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str3 = "video/avc";
                                    break;
                                case 842289229:
                                    str3 = "video/mp42";
                                    break;
                                case 859066445:
                                    str3 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str3 = "video/mjpeg";
                                    break;
                                default:
                                    str3 = null;
                                    break;
                            }
                            if (str3 != null) {
                                i12 i12Var2 = new i12();
                                i12Var2.f15518u = iC4;
                                i12Var2.f15519v = iC5;
                                i12Var2.e(str3);
                                u3Var = new u3(new g22(i12Var2));
                            } else {
                                com.applovin.impl.ca.r(new StringBuilder(String.valueOf(iC6).length() + 44), "Ignoring track with unsupported compression ", iC6, "StreamFormatChunk");
                                u3Var = q3Var;
                            }
                        }
                        break;
                    case 1751742049:
                        int iC7 = np0Var.c();
                        np0Var.G(8);
                        int iC8 = np0Var.c();
                        int iC9 = np0Var.c();
                        np0Var.G(4);
                        np0Var.c();
                        np0Var.G(12);
                        u3Var = new p3(iC7, iC8, iC9);
                        break;
                    case 1752331379:
                        int iC10 = np0Var.c();
                        np0Var.G(12);
                        np0Var.c();
                        int iC11 = np0Var.c();
                        int iC12 = np0Var.c();
                        np0Var.G(4);
                        int iC13 = np0Var.c();
                        int iC14 = np0Var.c();
                        np0Var.G(4);
                        q3Var = new q3(iC10, iC11, iC12, iC13, iC14, np0Var.c());
                        u3Var = q3Var;
                        break;
                    case 1852994675:
                        u3Var = new v3(np0Var.k(np0Var.B(), StandardCharsets.UTF_8));
                        break;
                    default:
                        u3Var = q3Var;
                        break;
                }
            } else {
                u3Var = a(np0Var.c(), np0Var);
            }
            if (u3Var != null) {
                if (u3Var.zza() == 1752331379) {
                    iA = ((q3) u3Var).a();
                }
                int length = objArrCopyOf.length;
                int i13 = i12 + 1;
                int iD = x91.d(length, i13);
                if (iD > length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                }
                objArrCopyOf[i12] = u3Var;
                i12 = i13;
            }
            np0Var.E(iC2);
            np0Var.C(i11);
        }
        return new s3(i10, ca1.A(i12, objArrCopyOf));
    }

    public final m3 b(Class cls) {
        ca1 ca1Var = this.f19811a;
        int size = ca1Var.size();
        int i10 = 0;
        while (i10 < size) {
            m3 m3Var = (m3) ca1Var.get(i10);
            i10++;
            if (m3Var.getClass() == cls) {
                return m3Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.m3
    public final int zza() {
        return this.f19812b;
    }
}
