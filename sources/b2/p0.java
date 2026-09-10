package b2;

import android.net.Uri;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f5366a = Pattern.compile("([a-z])=\\s?((?:.|\f)++)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f5367b = Pattern.compile("^([a-z])=$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f5368c = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::((?:.|\f)*+))?");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f5369d = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    public static o0 a(String str) throws i1.e0 {
        String str2;
        n0 n0Var = new n0();
        String str3 = j0.f5310h;
        if (!str.contains(str3)) {
            str3 = j0.f5309g;
        }
        String str4 = l1.y.f44830a;
        String[] strArrSplit = str.split(str3, -1);
        int length = strArrSplit.length;
        a aVar = null;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            oa.e0 e0Var = n0Var.f5338b;
            if (i10 >= length) {
                if (aVar != null) {
                    try {
                        e0Var.b(aVar.a());
                    } catch (IllegalArgumentException | IllegalStateException e10) {
                        throw i1.e0.b(null, e10);
                    }
                }
                try {
                    return new o0(n0Var);
                } catch (IllegalArgumentException | IllegalStateException e11) {
                    throw i1.e0.b(null, e11);
                }
            }
            String strTrim = strArrSplit[i10].trim();
            if (!strTrim.isEmpty()) {
                Matcher matcher = f5366a.matcher(strTrim);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    String strGroup2 = matcher.group(2);
                    strGroup2.getClass();
                    switch (strGroup.hashCode()) {
                        case 97:
                            if (!strGroup.equals("a")) {
                                continue;
                            } else if (z10) {
                                continue;
                            } else {
                                Matcher matcher2 = f5368c.matcher(strGroup2);
                                if (!matcher2.matches()) {
                                    throw i1.e0.b("Malformed Attribute line: ".concat(strTrim), null);
                                }
                                String strGroup3 = matcher2.group(1);
                                strGroup3.getClass();
                                String strGroup4 = matcher2.group(2);
                                if (strGroup4 == null) {
                                    strGroup4 = "";
                                }
                                if (aVar != null) {
                                    ((HashMap) aVar.f5219i).put(strGroup3, strGroup4);
                                } else {
                                    n0Var.f5337a.put(strGroup3, strGroup4);
                                }
                            }
                            break;
                        case 98:
                            if (!strGroup.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                                continue;
                            } else if (!z10) {
                                String[] strArrSplit2 = strGroup2.split(":\\s?", -1);
                                go.k.i(strArrSplit2.length == 2);
                                int i11 = Integer.parseInt(strArrSplit2[1]);
                                if (aVar != null) {
                                    aVar.f5213c = i11 * 1000;
                                } else {
                                    n0Var.f5339c = i11 * 1000;
                                }
                            }
                            break;
                        case 99:
                            if (!strGroup.equals("c")) {
                                continue;
                            } else if (!z10) {
                                if (aVar != null) {
                                    aVar.f5217g = strGroup2;
                                } else {
                                    n0Var.f5344h = strGroup2;
                                }
                            }
                            break;
                        case 100:
                        case InterfaceC0435l1.d.b.f29106c /* 102 */:
                        case InterfaceC0435l1.d.b.f29107d /* 103 */:
                        case InterfaceC0435l1.d.b.f29108e /* 104 */:
                        case 106:
                        case 108:
                        case InterfaceC0435l1.d.b.f29111h /* 110 */:
                        case InterfaceC0435l1.d.b.f29114k /* 113 */:
                        case 119:
                        case 120:
                        case 121:
                        default:
                            continue;
                        case InterfaceC0435l1.d.b.f29105b /* 101 */:
                            if (!strGroup.equals("e")) {
                                continue;
                            } else {
                                n0Var.f5347k = strGroup2;
                            }
                            break;
                        case InterfaceC0435l1.d.b.f29109f /* 105 */:
                            if (!strGroup.equals("i")) {
                                continue;
                            } else if (!z10) {
                                if (aVar != null) {
                                    aVar.f5216f = strGroup2;
                                } else {
                                    n0Var.f5346j = strGroup2;
                                }
                            }
                            break;
                        case 107:
                            if (!strGroup.equals(CampaignEx.JSON_KEY_AD_K)) {
                                continue;
                            } else if (!z10) {
                                if (aVar != null) {
                                    aVar.f5218h = strGroup2;
                                } else {
                                    n0Var.f5345i = strGroup2;
                                }
                            }
                            break;
                        case InterfaceC0435l1.d.b.f29110g /* 109 */:
                            if (!strGroup.equals("m")) {
                                continue;
                            } else {
                                if (aVar != null) {
                                    try {
                                        e0Var.b(aVar.a());
                                    } catch (IllegalArgumentException | IllegalStateException e12) {
                                        throw i1.e0.b(null, e12);
                                    }
                                }
                                Matcher matcher3 = f5369d.matcher(strGroup2);
                                if (!matcher3.matches()) {
                                    throw i1.e0.b("Malformed SDP media description line: ".concat(strGroup2), null);
                                }
                                String strGroup5 = matcher3.group(1);
                                strGroup5.getClass();
                                String strGroup6 = matcher3.group(2);
                                strGroup6.getClass();
                                String strGroup7 = matcher3.group(3);
                                strGroup7.getClass();
                                String strGroup8 = matcher3.group(4);
                                strGroup8.getClass();
                                try {
                                    aVar = new a(Integer.parseInt(strGroup6), Integer.parseInt(strGroup8), strGroup5, strGroup7);
                                } catch (NumberFormatException e13) {
                                    l1.a.t("SDPParser", "Malformed SDP media description line: ".concat(strGroup2), e13);
                                    aVar = null;
                                }
                                z10 = aVar == null;
                            }
                            break;
                        case InterfaceC0435l1.d.b.f29112i /* 111 */:
                            if (!strGroup.equals("o")) {
                                continue;
                            } else {
                                n0Var.f5341e = strGroup2;
                            }
                            break;
                        case InterfaceC0435l1.d.b.f29113j /* 112 */:
                            if (!strGroup.equals(TtmlNode.TAG_P)) {
                                continue;
                            } else {
                                n0Var.l = strGroup2;
                            }
                            break;
                        case 114:
                            str2 = "r";
                            break;
                        case 115:
                            if (!strGroup.equals("s")) {
                                continue;
                            } else {
                                n0Var.f5340d = strGroup2;
                            }
                            break;
                        case 116:
                            if (!strGroup.equals("t")) {
                                continue;
                            } else {
                                n0Var.f5342f = strGroup2;
                            }
                            break;
                        case 117:
                            if (!strGroup.equals("u")) {
                                continue;
                            } else {
                                n0Var.f5343g = Uri.parse(strGroup2);
                            }
                            break;
                        case 118:
                            if (!strGroup.equals("v")) {
                                continue;
                            } else {
                                if (!"0".equals(strGroup2)) {
                                    throw i1.e0.b("SDP version " + strGroup2 + " is not supported.", null);
                                }
                            }
                            break;
                        case 122:
                            str2 = "z";
                            break;
                    }
                    strGroup.equals(str2);
                } else {
                    Matcher matcher4 = f5367b.matcher(strTrim);
                    if (!matcher4.matches() || !Objects.equals(matcher4.group(1), "i")) {
                        throw i1.e0.b("Malformed SDP line: ".concat(strTrim), null);
                    }
                }
            }
            i10++;
        }
    }
}
