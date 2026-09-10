package l1;

import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.d0;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f44778a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f44779b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f44780c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String b(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        Object[] objArr = {f44779b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i13)};
        String str = y.f44830a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x019e  */
    /* JADX WARN: Code duplicated, block: B:102:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:113:0x01be  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:118:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:125:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:126:0x01df  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:133:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:137:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:138:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:141:0x0206  */
    /* JADX WARN: Code duplicated, block: B:144:0x020d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0212  */
    /* JADX WARN: Code duplicated, block: B:146:0x0217  */
    /* JADX WARN: Code duplicated, block: B:147:0x021a  */
    /* JADX WARN: Code duplicated, block: B:148:0x021d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0220  */
    /* JADX WARN: Code duplicated, block: B:150:0x0223  */
    /* JADX WARN: Code duplicated, block: B:151:0x0226  */
    /* JADX WARN: Code duplicated, block: B:152:0x0228  */
    /* JADX WARN: Code duplicated, block: B:153:0x022b  */
    /* JADX WARN: Code duplicated, block: B:154:0x022e  */
    /* JADX WARN: Code duplicated, block: B:155:0x0231  */
    /* JADX WARN: Code duplicated, block: B:157:0x0235  */
    /* JADX WARN: Code duplicated, block: B:159:0x023b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0253  */
    /* JADX WARN: Code duplicated, block: B:324:0x0431  */
    /* JADX WARN: Code duplicated, block: B:527:0x0704  */
    /* JADX WARN: Code duplicated, block: B:81:0x0161  */
    /* JADX WARN: Code duplicated, block: B:83:0x0167  */
    /* JADX WARN: Code duplicated, block: B:85:0x016b  */
    /* JADX WARN: Code duplicated, block: B:86:0x016f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0176  */
    /* JADX WARN: Code duplicated, block: B:89:0x017a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0183  */
    /* JADX WARN: Code duplicated, block: B:93:0x0186  */
    /* JADX WARN: Code duplicated, block: B:96:0x018f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0195  */
    public static Pair c(i1.p pVar) {
        byte b10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Integer num;
        byte b11;
        Integer num2;
        String str;
        byte b12;
        byte b13;
        Integer numValueOf = 1;
        String str2 = pVar.f42641k;
        String str3 = pVar.f42641k;
        if (str2 == null) {
            return null;
        }
        String[] strArrSplit = str2.split("\\.");
        if ("video/dolby-vision".equals(pVar.f42643n)) {
            Integer numValueOf2 = Integer.valueOf(NotificationCompat.FLAG_LOCAL_ONLY);
            if (strArrSplit.length < 3) {
                d5.u.q("Ignoring malformed Dolby Vision codec string: ", str3, "CodecSpecificDataUtil");
                return null;
            }
            Matcher matcher = f44780c.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                d5.u.q("Ignoring malformed Dolby Vision codec string: ", str3, "CodecSpecificDataUtil");
                return null;
            }
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                switch (strGroup.hashCode()) {
                    case 1536:
                        num = 16;
                        b11 = !strGroup.equals("00") ? (byte) -1 : (byte) 0;
                        break;
                    case 1537:
                        if (!strGroup.equals("01")) {
                            num = 16;
                        } else {
                            num = 16;
                            b11 = 1;
                        }
                        break;
                    case 1538:
                        if (!strGroup.equals("02")) {
                            num = 16;
                        } else {
                            num = 16;
                            b11 = 2;
                        }
                        break;
                    case 1539:
                        if (!strGroup.equals("03")) {
                            num = 16;
                        } else {
                            num = 16;
                            b11 = 3;
                        }
                        break;
                    case 1540:
                        if (!strGroup.equals("04")) {
                            num = 16;
                        } else {
                            num = 16;
                            b11 = 4;
                        }
                        break;
                    case 1541:
                        if (!strGroup.equals("05")) {
                            num = 16;
                        } else {
                            num = 16;
                            b11 = 5;
                        }
                        break;
                    case 1542:
                        if (!strGroup.equals("06")) {
                            num = 16;
                        } else {
                            num = 16;
                            b11 = 6;
                        }
                        break;
                    case 1543:
                        if (!strGroup.equals("07")) {
                            num = 16;
                        } else {
                            num = 16;
                            b11 = 7;
                        }
                        break;
                    case 1544:
                        if (!strGroup.equals("08")) {
                            num = 16;
                        } else {
                            num = 16;
                            b11 = 8;
                        }
                        break;
                    case 1545:
                        if (!strGroup.equals("09")) {
                            num = 16;
                        } else {
                            num = 16;
                            b11 = 9;
                        }
                        break;
                    case 1567:
                        if (!strGroup.equals("10")) {
                            num = 16;
                        } else {
                            num = 16;
                            b11 = 10;
                        }
                        break;
                    default:
                        num = 16;
                        break;
                }
                switch (b11) {
                    case 0:
                        num2 = numValueOf;
                        break;
                    case 1:
                        num2 = 2;
                        break;
                    case 2:
                        num2 = 4;
                        break;
                    case 3:
                        num2 = 8;
                        break;
                    case 4:
                        num2 = num;
                        break;
                    case 5:
                        num2 = 32;
                        break;
                    case 6:
                        num2 = 64;
                        break;
                    case 7:
                        num2 = 128;
                        break;
                    case 8:
                        num2 = numValueOf2;
                        break;
                    case 9:
                        num2 = 512;
                        break;
                    case 10:
                        num2 = 1024;
                        break;
                }
                if (num2 == null) {
                    d5.u.q("Unknown Dolby Vision profile string: ", strGroup, "CodecSpecificDataUtil");
                    return null;
                }
                str = strArrSplit[2];
                if (str == null) {
                    switch (str.hashCode()) {
                        case 1537:
                            if (str.equals("01")) {
                                b12 = -1;
                            } else {
                                b12 = 0;
                            }
                            break;
                        case 1538:
                            if (str.equals("02")) {
                                b12 = -1;
                            } else {
                                b12 = 1;
                            }
                            break;
                        case 1539:
                            if (str.equals("03")) {
                                b12 = -1;
                            } else {
                                b12 = 2;
                            }
                            break;
                        case 1540:
                            if (str.equals("04")) {
                                b12 = -1;
                            } else {
                                b12 = 3;
                            }
                            break;
                        case 1541:
                            if (str.equals("05")) {
                                b12 = -1;
                            } else {
                                b12 = 4;
                            }
                            break;
                        case 1542:
                            if (str.equals("06")) {
                                b12 = -1;
                            } else {
                                b12 = 5;
                            }
                            break;
                        case 1543:
                            if (str.equals("07")) {
                                b12 = -1;
                            } else {
                                b12 = 6;
                            }
                            break;
                        case 1544:
                            if (str.equals("08")) {
                                b12 = -1;
                            } else {
                                b12 = 7;
                            }
                            break;
                        case 1545:
                            if (str.equals("09")) {
                                b12 = -1;
                            } else {
                                b12 = 8;
                            }
                            break;
                        case 1567:
                            if (str.equals("10")) {
                                b12 = -1;
                            } else {
                                b12 = 9;
                            }
                            break;
                        case 1568:
                            if (str.equals("11")) {
                                b12 = -1;
                            } else {
                                b12 = 10;
                            }
                            break;
                        case 1569:
                            if (str.equals("12")) {
                                b12 = -1;
                            } else {
                                b13 = 11;
                                b12 = b13;
                            }
                            break;
                        case 1570:
                            if (str.equals("13")) {
                                b12 = -1;
                            } else {
                                b13 = 12;
                                b12 = b13;
                            }
                            break;
                        default:
                            b12 = -1;
                            break;
                    }
                    switch (b12) {
                        case 0:
                            break;
                        case 1:
                            numValueOf = 2;
                            break;
                        case 2:
                            numValueOf = 4;
                            break;
                        case 3:
                            numValueOf = 8;
                            break;
                        case 4:
                            numValueOf = num;
                            break;
                        case 5:
                            numValueOf = 32;
                            break;
                        case 6:
                            numValueOf = 64;
                            break;
                        case 7:
                            numValueOf = 128;
                            break;
                        case 8:
                            numValueOf = numValueOf2;
                            break;
                        case 9:
                            numValueOf = 512;
                            break;
                        case 10:
                            numValueOf = 1024;
                            break;
                        case 11:
                            numValueOf = Integer.valueOf(com.ironsource.mediationsdk.metadata.a.f29616n);
                            break;
                        case 12:
                            numValueOf = 4096;
                            break;
                        default:
                            numValueOf = null;
                            break;
                    }
                } else {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    return new Pair(num2, numValueOf);
                }
                d5.u.q("Unknown Dolby Vision level string: ", str, "CodecSpecificDataUtil");
                return null;
            }
            num = 16;
            num2 = null;
            if (num2 == null) {
                d5.u.q("Unknown Dolby Vision profile string: ", strGroup, "CodecSpecificDataUtil");
                return null;
            }
            str = strArrSplit[2];
            if (str == null) {
                switch (str.hashCode()) {
                    case 1537:
                        if (str.equals("01")) {
                            b12 = 0;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1538:
                        if (str.equals("02")) {
                            b12 = 1;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1539:
                        if (str.equals("03")) {
                            b12 = 2;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1540:
                        if (str.equals("04")) {
                            b12 = 3;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1541:
                        if (str.equals("05")) {
                            b12 = 4;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1542:
                        if (str.equals("06")) {
                            b12 = 5;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1543:
                        if (str.equals("07")) {
                            b12 = 6;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1544:
                        if (str.equals("08")) {
                            b12 = 7;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1545:
                        if (str.equals("09")) {
                            b12 = 8;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1567:
                        if (str.equals("10")) {
                            b12 = 9;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1568:
                        if (str.equals("11")) {
                            b12 = 10;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1569:
                        if (str.equals("12")) {
                            b13 = 11;
                            b12 = b13;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1570:
                        if (str.equals("13")) {
                            b13 = 12;
                            b12 = b13;
                        } else {
                            b12 = -1;
                        }
                        break;
                    default:
                        b12 = -1;
                        break;
                }
                switch (b12) {
                    case 0:
                        break;
                    case 1:
                        numValueOf = 2;
                        break;
                    case 2:
                        numValueOf = 4;
                        break;
                    case 3:
                        numValueOf = 8;
                        break;
                    case 4:
                        numValueOf = num;
                        break;
                    case 5:
                        numValueOf = 32;
                        break;
                    case 6:
                        numValueOf = 64;
                        break;
                    case 7:
                        numValueOf = 128;
                        break;
                    case 8:
                        numValueOf = numValueOf2;
                        break;
                    case 9:
                        numValueOf = 512;
                        break;
                    case 10:
                        numValueOf = 1024;
                        break;
                    case 11:
                        numValueOf = Integer.valueOf(com.ironsource.mediationsdk.metadata.a.f29616n);
                        break;
                    case 12:
                        numValueOf = 4096;
                        break;
                    default:
                        numValueOf = null;
                        break;
                }
            } else {
                numValueOf = null;
            }
            if (numValueOf == null) {
                return new Pair(num2, numValueOf);
            }
            d5.u.q("Unknown Dolby Vision level string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String str4 = strArrSplit[0];
        str4.getClass();
        switch (str4) {
            case "ac-4":
                b10 = 0;
                break;
            case "apv1":
                b10 = 1;
                break;
            case "av01":
                b10 = 2;
                break;
            case "avc1":
                b10 = 3;
                break;
            case "avc2":
                b10 = 4;
                break;
            case "hev1":
                b10 = 5;
                break;
            case "hvc1":
                b10 = 6;
                break;
            case "iamf":
                b10 = 7;
                break;
            case "mp4a":
                b10 = 8;
                break;
            case "s263":
                b10 = 9;
                break;
            case "vp09":
                b10 = 10;
                break;
            default:
                b10 = -1;
                break;
        }
        int i22 = Segment.SIZE;
        switch (b10) {
            case 0:
                if (strArrSplit.length != 4) {
                    d5.u.q("Ignoring malformed AC-4 codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i23 = Integer.parseInt(strArrSplit[1]);
                    int i24 = Integer.parseInt(strArrSplit[2]);
                    int i25 = Integer.parseInt(strArrSplit[3]);
                    if (i23 != 0) {
                        if (i23 != 1) {
                            if (i23 != 2) {
                                i10 = -1;
                            } else if (i24 == 1) {
                                i10 = 1026;
                            } else if (i24 == 2) {
                                i10 = IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED;
                            } else {
                                i10 = -1;
                            }
                        } else if (i24 == 0) {
                            i10 = 513;
                        } else if (i24 == 1) {
                            i10 = 514;
                        } else {
                            i10 = -1;
                        }
                    } else if (i24 == 0) {
                        i10 = 257;
                    } else {
                        i10 = -1;
                    }
                    if (i10 == -1) {
                        a.s("CodecSpecificDataUtil", "Unknown AC-4 profile: " + i23 + "." + i24);
                        return null;
                    }
                    if (i25 == 0) {
                        i11 = 1;
                    } else if (i25 == 1) {
                        i11 = 2;
                    } else if (i25 == 2) {
                        i11 = 4;
                    } else if (i25 != 3) {
                        i11 = i25 != 4 ? -1 : 16;
                    } else {
                        i11 = 8;
                    }
                    if (i11 != -1) {
                        return new Pair(Integer.valueOf(i10), Integer.valueOf(i11));
                    }
                    d5.u.v(i25, "Unknown AC-4 level: ", "CodecSpecificDataUtil");
                    return null;
                } catch (NumberFormatException unused) {
                    d5.u.q("Ignoring malformed AC-4 codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
            case 1:
                if (strArrSplit.length < 4) {
                    d5.u.q("Ignoring malformed APV codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i26 = Integer.parseInt(strArrSplit[1].substring(4));
                    int i27 = Integer.parseInt(strArrSplit[2].substring(4));
                    int i28 = Integer.parseInt(strArrSplit[3].substring(4));
                    if (i26 == 33) {
                        i22 = 1;
                    } else if (i26 != 44) {
                        d5.u.v(i26, "Ignoring invalid APV profile: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    int i29 = (i27 / 30) * 2;
                    if (i27 % 30 == 0) {
                        i29--;
                    }
                    return new Pair(Integer.valueOf(i22), Integer.valueOf((NotificationCompat.FLAG_LOCAL_ONLY << (i29 - 1)) | (1 << i28)));
                } catch (NumberFormatException e10) {
                    a.t("CodecSpecificDataUtil", "Ignoring malformed APV codec string: " + str3, e10);
                    return null;
                }
            case 2:
                i1.h hVar = pVar.D;
                if (strArrSplit.length < 4) {
                    d5.u.q("Ignoring malformed AV1 codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i30 = Integer.parseInt(strArrSplit[1]);
                    int i31 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                    int i32 = Integer.parseInt(strArrSplit[3]);
                    if (i30 != 0) {
                        d5.u.v(i30, "Unknown AV1 profile: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    if (i32 != 8 && i32 != 10) {
                        d5.u.v(i32, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    int i33 = i32 == 8 ? 1 : (hVar == null || !(hVar.f42551d != null || (i12 = hVar.f42550c) == 7 || i12 == 6)) ? 2 : 4096;
                    switch (i31) {
                        case 0:
                            i13 = -1;
                            i14 = 1;
                            break;
                        case 1:
                            i13 = -1;
                            i14 = 2;
                            break;
                        case 2:
                            i13 = -1;
                            i14 = 4;
                            break;
                        case 3:
                            i14 = 8;
                            i13 = -1;
                            break;
                        case 4:
                            i14 = 16;
                            i13 = -1;
                            break;
                        case 5:
                            i14 = 32;
                            i13 = -1;
                            break;
                        case 6:
                            i14 = 64;
                            i13 = -1;
                            break;
                        case 7:
                            i14 = 128;
                            i13 = -1;
                            break;
                        case 8:
                            i14 = 256;
                            i13 = -1;
                            break;
                        case 9:
                            i14 = 512;
                            i13 = -1;
                            break;
                        case 10:
                            i14 = 1024;
                            i13 = -1;
                            break;
                        case 11:
                            i14 = 2048;
                            i13 = -1;
                            break;
                        case 12:
                            i14 = 4096;
                            i13 = -1;
                            break;
                        case 13:
                            i14 = 8192;
                            i13 = -1;
                            break;
                        case 14:
                            i14 = Http2.INITIAL_MAX_FRAME_SIZE;
                            i13 = -1;
                            break;
                        case 15:
                            i14 = 32768;
                            i13 = -1;
                            break;
                        case 16:
                            i14 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                            i13 = -1;
                            break;
                        case 17:
                            i14 = 131072;
                            i13 = -1;
                            break;
                        case 18:
                            i14 = 262144;
                            i13 = -1;
                            break;
                        case 19:
                            i14 = 524288;
                            i13 = -1;
                            break;
                        case 20:
                            i14 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            i13 = -1;
                            break;
                        case 21:
                            i14 = 2097152;
                            i13 = -1;
                            break;
                        case 22:
                            i14 = 4194304;
                            i13 = -1;
                            break;
                        case 23:
                            i14 = 8388608;
                            i13 = -1;
                            break;
                        default:
                            i13 = -1;
                            i14 = -1;
                            break;
                    }
                    if (i14 != i13) {
                        return new Pair(Integer.valueOf(i33), Integer.valueOf(i14));
                    }
                    d5.u.v(i31, "Unknown AV1 level: ", "CodecSpecificDataUtil");
                    return null;
                } catch (NumberFormatException unused2) {
                    d5.u.q("Ignoring malformed AV1 codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
            case 3:
            case 4:
                if (strArrSplit.length < 2) {
                    d5.u.q("Ignoring malformed AVC codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    if (strArrSplit[1].length() == 6) {
                        i15 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                        i16 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                    } else {
                        if (strArrSplit.length < 3) {
                            a.s("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str3);
                            return null;
                        }
                        i15 = Integer.parseInt(strArrSplit[1]);
                        i16 = Integer.parseInt(strArrSplit[2]);
                    }
                    if (i15 == 66) {
                        i17 = -1;
                        i18 = 1;
                    } else if (i15 == 77) {
                        i17 = -1;
                        i18 = 2;
                    } else if (i15 != 88) {
                        if (i15 == 100) {
                            i18 = 8;
                        } else if (i15 == 110) {
                            i18 = 16;
                        } else if (i15 == 122) {
                            i18 = 32;
                        } else if (i15 != 244) {
                            i17 = -1;
                            i18 = -1;
                        } else {
                            i18 = 64;
                        }
                        i17 = -1;
                    } else {
                        i17 = -1;
                        i18 = 4;
                    }
                    if (i18 == i17) {
                        d5.u.v(i15, "Unknown AVC profile: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    switch (i16) {
                        case 10:
                            i19 = 1;
                            break;
                        case 11:
                            i19 = 4;
                            break;
                        case 12:
                            i19 = 8;
                            break;
                        case 13:
                            i19 = 16;
                            break;
                        default:
                            switch (i16) {
                                case 20:
                                    i19 = 32;
                                    break;
                                case 21:
                                    i19 = 64;
                                    break;
                                case 22:
                                    i19 = 128;
                                    break;
                                default:
                                    switch (i16) {
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                                            i19 = 256;
                                            break;
                                        case 31:
                                            i19 = 512;
                                            break;
                                        case 32:
                                            i19 = 1024;
                                            break;
                                        default:
                                            switch (i16) {
                                                case 40:
                                                    i19 = 2048;
                                                    break;
                                                case 41:
                                                    i19 = 4096;
                                                    break;
                                                case 42:
                                                    i19 = 8192;
                                                    break;
                                                default:
                                                    switch (i16) {
                                                        case 50:
                                                            i19 = Http2.INITIAL_MAX_FRAME_SIZE;
                                                            break;
                                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                                                            i19 = 32768;
                                                            break;
                                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                                                            i19 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                                                            break;
                                                        default:
                                                            i19 = -1;
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    if (i19 != -1) {
                        return new Pair(Integer.valueOf(i18), Integer.valueOf(i19));
                    }
                    d5.u.v(i16, "Unknown AVC level: ", "CodecSpecificDataUtil");
                    return null;
                } catch (NumberFormatException unused3) {
                    d5.u.q("Ignoring malformed AVC codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
            case 5:
            case 6:
                return d(str3, strArrSplit, pVar.D);
            case 7:
                if (strArrSplit.length < 4) {
                    d5.u.q("Ignoring malformed IAMF codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i34 = 1 << (Integer.parseInt(strArrSplit[1]) + 16);
                    String str5 = strArrSplit[3];
                    str5.getClass();
                    switch (str5) {
                        case "Opus":
                            i20 = 1;
                            break;
                        case "fLaC":
                            i20 = 4;
                            break;
                        case "ipcm":
                            i20 = 8;
                            break;
                        case "mp4a":
                            i20 = 2;
                            break;
                        default:
                            a.s("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: " + strArrSplit[3]);
                            return null;
                    }
                    return new Pair(Integer.valueOf(i34 | 16777216 | i20), 0);
                } catch (NumberFormatException e11) {
                    a.t("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: " + strArrSplit[1], e11);
                    return null;
                }
            case 8:
                if (strArrSplit.length != 3) {
                    d5.u.q("Ignoring malformed MP4A codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    if (MimeTypes.AUDIO_AAC.equals(d0.e(Integer.parseInt(strArrSplit[1], 16)))) {
                        int i35 = Integer.parseInt(strArrSplit[2]);
                        int i36 = 17;
                        if (i35 != 17) {
                            i36 = 20;
                            if (i35 != 20) {
                                i36 = 23;
                                if (i35 != 23) {
                                    i36 = 29;
                                    if (i35 != 29) {
                                        i36 = 39;
                                        if (i35 != 39) {
                                            i36 = 42;
                                            if (i35 != 42) {
                                                switch (i35) {
                                                    case 1:
                                                        i36 = 1;
                                                        break;
                                                    case 2:
                                                        i36 = 2;
                                                        break;
                                                    case 3:
                                                        i36 = 3;
                                                        break;
                                                    case 4:
                                                        i36 = 4;
                                                        break;
                                                    case 5:
                                                        i36 = 5;
                                                        break;
                                                    case 6:
                                                        i36 = 6;
                                                        break;
                                                    default:
                                                        i36 = -1;
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (i36 != -1) {
                            return new Pair(Integer.valueOf(i36), 0);
                        }
                    }
                } catch (NumberFormatException unused4) {
                    d5.u.q("Ignoring malformed MP4A codec string: ", str3, "CodecSpecificDataUtil");
                }
                return null;
            case 9:
                Pair pair = new Pair(numValueOf, numValueOf);
                if (strArrSplit.length < 3) {
                    d5.u.q("Ignoring malformed H263 codec string: ", str3, "CodecSpecificDataUtil");
                    return pair;
                }
                try {
                    return new Pair(Integer.valueOf(Integer.parseInt(strArrSplit[1])), Integer.valueOf(Integer.parseInt(strArrSplit[2])));
                } catch (NumberFormatException unused5) {
                    d5.u.q("Ignoring malformed H263 codec string: ", str3, "CodecSpecificDataUtil");
                    return pair;
                }
            case 10:
                if (strArrSplit.length < 3) {
                    d5.u.q("Ignoring malformed VP9 codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i37 = Integer.parseInt(strArrSplit[1]);
                    int i38 = Integer.parseInt(strArrSplit[2]);
                    if (i37 == 0) {
                        i21 = 1;
                    } else if (i37 == 1) {
                        i21 = 2;
                    } else if (i37 != 2) {
                        i21 = i37 != 3 ? -1 : 8;
                    } else {
                        i21 = 4;
                    }
                    if (i21 == -1) {
                        d5.u.v(i37, "Unknown VP9 profile: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    if (i38 == 10) {
                        i22 = 1;
                    } else if (i38 == 11) {
                        i22 = 2;
                    } else if (i38 == 20) {
                        i22 = 4;
                    } else if (i38 == 21) {
                        i22 = 8;
                    } else if (i38 == 30) {
                        i22 = 16;
                    } else if (i38 == 31) {
                        i22 = 32;
                    } else if (i38 == 40) {
                        i22 = 64;
                    } else if (i38 == 41) {
                        i22 = 128;
                    } else if (i38 == 50) {
                        i22 = 256;
                    } else if (i38 != 51) {
                        switch (i38) {
                            case 60:
                                i22 = 2048;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                                i22 = 4096;
                                break;
                            case 62:
                                break;
                            default:
                                i22 = -1;
                                break;
                        }
                    } else {
                        i22 = 512;
                    }
                    if (i22 != -1) {
                        return new Pair(Integer.valueOf(i21), Integer.valueOf(i22));
                    }
                    d5.u.v(i38, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                    return null;
                } catch (NumberFormatException unused6) {
                    d5.u.q("Ignoring malformed VP9 codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
            default:
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    public static Pair d(String str, String[] strArr, i1.h hVar) {
        int i10;
        Integer numValueOf;
        if (strArr.length < 4) {
            d5.u.q("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = f44780c.matcher(strArr[1]);
        if (!matcher.matches()) {
            d5.u.q("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i10 = 1;
        } else if ("2".equals(strGroup)) {
            i10 = (hVar == null || hVar.f42550c != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(strGroup)) {
                d5.u.q("Unknown HEVC profile string: ", strGroup, "CodecSpecificDataUtil");
                return null;
            }
            i10 = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2) {
                case "H30":
                    numValueOf = 2;
                    break;
                case "H60":
                    numValueOf = 8;
                    break;
                case "H63":
                    numValueOf = 32;
                    break;
                case "H90":
                    numValueOf = 128;
                    break;
                case "H93":
                    numValueOf = 512;
                    break;
                case "L30":
                    numValueOf = 1;
                    break;
                case "L60":
                    numValueOf = 4;
                    break;
                case "L63":
                    numValueOf = 16;
                    break;
                case "L90":
                    numValueOf = 64;
                    break;
                case "L93":
                    numValueOf = Integer.valueOf(NotificationCompat.FLAG_LOCAL_ONLY);
                    break;
                case "H120":
                    numValueOf = Integer.valueOf(com.ironsource.mediationsdk.metadata.a.f29616n);
                    break;
                case "H123":
                    numValueOf = Integer.valueOf(Segment.SIZE);
                    break;
                case "H150":
                    numValueOf = 32768;
                    break;
                case "H153":
                    numValueOf = 131072;
                    break;
                case "H156":
                    numValueOf = 524288;
                    break;
                case "H180":
                    numValueOf = 2097152;
                    break;
                case "H183":
                    numValueOf = 8388608;
                    break;
                case "H186":
                    numValueOf = 33554432;
                    break;
                case "L120":
                    numValueOf = 1024;
                    break;
                case "L123":
                    numValueOf = 4096;
                    break;
                case "L150":
                    numValueOf = Integer.valueOf(Http2.INITIAL_MAX_FRAME_SIZE);
                    break;
                case "L153":
                    numValueOf = Integer.valueOf(C.DEFAULT_BUFFER_SEGMENT_SIZE);
                    break;
                case "L156":
                    numValueOf = 262144;
                    break;
                case "L180":
                    numValueOf = Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    break;
                case "L183":
                    numValueOf = 4194304;
                    break;
                case "L186":
                    numValueOf = 16777216;
                    break;
                default:
                    numValueOf = null;
                    break;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return new Pair(Integer.valueOf(i10), numValueOf);
        }
        d5.u.q("Unknown HEVC level string: ", str2, "CodecSpecificDataUtil");
        return null;
    }
}
