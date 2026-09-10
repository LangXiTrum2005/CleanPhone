package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f11936a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f11937b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f11938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f11939d;

    static {
        HashMap map = new HashMap();
        q4.a.n(255, 255, 255, map, "white");
        q4.a.n(0, 255, 0, map, "lime");
        q4.a.n(0, 255, 255, map, "cyan");
        q4.a.n(255, 0, 0, map, "red");
        q4.a.n(255, 255, 0, map, "yellow");
        q4.a.n(255, 0, 255, map, "magenta");
        q4.a.n(0, 0, 255, map, "blue");
        q4.a.n(0, 0, 0, map, "black");
        f11938c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        q4.a.n(255, 255, 255, map2, "bg_white");
        q4.a.n(0, 255, 0, map2, "bg_lime");
        q4.a.n(0, 255, 255, map2, "bg_cyan");
        q4.a.n(255, 0, 0, map2, "bg_red");
        q4.a.n(255, 255, 0, map2, "bg_yellow");
        q4.a.n(255, 0, 255, map2, "bg_magenta");
        q4.a.n(0, 0, 255, map2, "bg_blue");
        q4.a.n(0, 0, 0, map2, "bg_black");
        f11939d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0214  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
    public static SpannedString a(String str, String str2, List list) {
        int i10;
        int i11;
        int i12;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            String strTrim = "";
            if (i14 >= str2.length()) {
                break;
            }
            int i15 = i14 + 1;
            char cCharAt = str2.charAt(i14);
            if (cCharAt == '&') {
                int iIndexOf = str2.indexOf(59, i15);
                int iIndexOf2 = str2.indexOf(32, i15);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i15, iIndexOf);
                    int iHashCode = strSubstring.hashCode();
                    if (iHashCode != 3309) {
                        if (iHashCode != 3464) {
                            if (iHashCode != 96708) {
                                if (iHashCode == 3374865 && strSubstring.equals("nbsp")) {
                                    spannableStringBuilder.append(' ');
                                } else {
                                    StringBuilder sb2 = new StringBuilder(strSubstring.length() + 33);
                                    sb2.append("ignoring unsupported entity: '&");
                                    sb2.append(strSubstring);
                                    sb2.append(";'");
                                    v71.y("WebvttCueParser", sb2.toString());
                                }
                            } else if (strSubstring.equals("amp")) {
                                spannableStringBuilder.append('&');
                            } else {
                                StringBuilder sb3 = new StringBuilder(strSubstring.length() + 33);
                                sb3.append("ignoring unsupported entity: '&");
                                sb3.append(strSubstring);
                                sb3.append(";'");
                                v71.y("WebvttCueParser", sb3.toString());
                            }
                        } else if (strSubstring.equals("lt")) {
                            spannableStringBuilder.append('<');
                        } else {
                            StringBuilder sb4 = new StringBuilder(strSubstring.length() + 33);
                            sb4.append("ignoring unsupported entity: '&");
                            sb4.append(strSubstring);
                            sb4.append(";'");
                            v71.y("WebvttCueParser", sb4.toString());
                        }
                    } else if (strSubstring.equals("gt")) {
                        spannableStringBuilder.append('>');
                    } else {
                        StringBuilder sb5 = new StringBuilder(strSubstring.length() + 33);
                        sb5.append("ignoring unsupported entity: '&");
                        sb5.append(strSubstring);
                        sb5.append(";'");
                        v71.y("WebvttCueParser", sb5.toString());
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i14 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
                i13 = 0;
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
            } else if (i15 < str2.length()) {
                char cCharAt2 = str2.charAt(i15);
                int iIndexOf3 = str2.indexOf(62, i15);
                int length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                int i16 = length - 2;
                if (str2.charAt(i16) == '/') {
                    i11 = i13;
                    i10 = 1;
                } else {
                    i10 = i13;
                    i11 = i10;
                }
                int i17 = i14 + (cCharAt2 == '/' ? 2 : 1);
                if (i10 == 0) {
                    i16 = length - 1;
                }
                String strSubstring2 = str2.substring(i17, i16);
                if (strSubstring2.trim().isEmpty()) {
                    i12 = i11;
                } else {
                    String strTrim2 = strSubstring2.trim();
                    ps1.v(!strTrim2.isEmpty());
                    String str3 = uu0.f20901a;
                    String str4 = strTrim2.split("[ \\.]", 2)[i11];
                    int iHashCode2 = str4.hashCode();
                    if (iHashCode2 == 98 ? !str4.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B) : iHashCode2 == 99 ? !str4.equals("c") : iHashCode2 == 105 ? !str4.equals("i") : iHashCode2 == 3650 ? !str4.equals("rt") : iHashCode2 == 3314158 ? !str4.equals(O6.f26741q) : iHashCode2 == 3511770 ? !str4.equals("ruby") : iHashCode2 == 117 ? !str4.equals("u") : !(iHashCode2 == 118 && str4.equals("v"))) {
                        i12 = i11;
                    } else {
                        if (cCharAt2 == '/') {
                            while (!arrayDeque.isEmpty()) {
                                x8 x8Var = (x8) arrayDeque.pop();
                                d(str, x8Var, arrayList, spannableStringBuilder, list);
                                if (arrayDeque.isEmpty()) {
                                    arrayList.clear();
                                } else {
                                    arrayList.add(new w8(x8Var, spannableStringBuilder.length()));
                                }
                                if (x8Var.f21776a.equals(str4)) {
                                    break;
                                }
                            }
                        } else if (i10 == 0) {
                            int length2 = spannableStringBuilder.length();
                            String strTrim3 = strSubstring2.trim();
                            ps1.v(!strTrim3.isEmpty());
                            int iIndexOf4 = strTrim3.indexOf(" ");
                            if (iIndexOf4 == -1) {
                                i12 = i11;
                            } else {
                                strTrim = strTrim3.substring(iIndexOf4).trim();
                                i12 = i11;
                                strTrim3 = strTrim3.substring(i12, iIndexOf4);
                            }
                            String[] strArrSplit = strTrim3.split("\\.", -1);
                            String str5 = strArrSplit[i12];
                            HashSet hashSet = new HashSet();
                            for (int i18 = 1; i18 < strArrSplit.length; i18++) {
                                hashSet.add(strArrSplit[i18]);
                            }
                            arrayDeque.push(new x8(str5, length2, strTrim, hashSet));
                        }
                        i12 = i11;
                    }
                }
                i14 = length;
                i13 = i12;
            }
            i14 = i15;
            i13 = 0;
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (x8) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, new x8("", i13, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static v8 b(String str, Matcher matcher, np0 np0Var, ArrayList arrayList) {
        z8 z8Var = new z8();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            z8Var.f22548a = ps1.p(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            z8Var.f22549b = ps1.p(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            c(strGroup3, z8Var);
            StringBuilder sb2 = new StringBuilder();
            String strN = np0Var.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strN)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strN.trim());
                strN = np0Var.n(StandardCharsets.UTF_8);
            }
            z8Var.f22550c = a(str, sb2.toString(), arrayList);
            return new v8(z8Var.b().a(), z8Var.f22548a, z8Var.f22549b);
        } catch (IllegalArgumentException unused) {
            v71.y("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0081 A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00cf A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0132  */
    /* JADX WARN: Code duplicated, block: B:75:0x013a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0144  */
    /* JADX WARN: Code duplicated, block: B:79:0x0146 A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x018e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0190 A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    public static void c(String str, z8 z8Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        Matcher matcher = f11937b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring) {
                            case "center":
                            case "middle":
                                i13 = 1;
                                break;
                            case "end":
                                i13 = 2;
                                break;
                            case "start":
                                i13 = 0;
                                break;
                            default:
                                v71.y("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                i13 = Integer.MIN_VALUE;
                                break;
                        }
                        z8Var.f22554g = i13;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        z8Var.f22552e = ps1.x(strGroup2);
                        z8Var.f22553f = 0;
                    } else {
                        z8Var.f22552e = Integer.parseInt(strGroup2);
                        z8Var.f22553f = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2) {
                        case "center":
                        case "middle":
                            if (!strGroup2.equals(TtmlNode.CENTER)) {
                                v71.y("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            }
                            i10 = 2;
                            break;
                        case "end":
                            i10 = 3;
                            break;
                        case "left":
                            i10 = 4;
                            break;
                        case "right":
                            i10 = 5;
                            break;
                        case "start":
                            i10 = 1;
                            break;
                        default:
                            v71.y("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                    }
                    z8Var.f22551d = i10;
                } else if (X3.i.L.equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2) {
                            case "line-left":
                                i12 = 0;
                                break;
                            case "center":
                                i12 = 1;
                                break;
                            case "line-right":
                                i12 = 2;
                                break;
                            case "middle":
                                i12 = 1;
                                break;
                            case "end":
                                i12 = 2;
                                break;
                            case "start":
                                i12 = 0;
                                break;
                            default:
                                v71.y("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                i12 = Integer.MIN_VALUE;
                                break;
                        }
                        z8Var.f22556i = i12;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    z8Var.f22555h = ps1.x(strGroup2);
                } else if ("size".equals(strGroup)) {
                    z8Var.f22557j = ps1.x(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode == 3642 && strGroup2.equals("rl")) {
                            i11 = 1;
                        } else {
                            v71.y("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i11 = Integer.MIN_VALUE;
                        }
                    } else if (strGroup2.equals("lr")) {
                        i11 = 2;
                    } else {
                        v71.y("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                        i11 = Integer.MIN_VALUE;
                    }
                    z8Var.f22558k = i11;
                } else {
                    StringBuilder sb2 = new StringBuilder(strGroup.length() + 21 + strGroup2.length());
                    sb2.append("Unknown cue setting ");
                    sb2.append(strGroup);
                    sb2.append(":");
                    sb2.append(strGroup2);
                    v71.y("WebvttCueParser", sb2.toString());
                }
            } catch (NumberFormatException unused) {
                v71.y("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }

    public static void d(String str, x8 x8Var, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i10;
        int i11;
        int i12;
        int i13 = x8Var.f21777b;
        int length = spannableStringBuilder.length();
        String str2 = x8Var.f21776a;
        int iHashCode = str2.hashCode();
        int i14 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode == 3511770) {
                        if (!str2.equals("ruby")) {
                            return;
                        }
                        int iE = e(list2, str, x8Var);
                        ArrayList arrayList = new ArrayList(list.size());
                        arrayList.addAll(list);
                        Collections.sort(arrayList, b.f12567m);
                        int i15 = i13;
                        int i16 = 0;
                        int length2 = 0;
                        while (i16 < arrayList.size()) {
                            if ("rt".equals(((w8) arrayList.get(i16)).f21440a.f21776a)) {
                                w8 w8Var = (w8) arrayList.get(i16);
                                int iE2 = e(list2, str, w8Var.f21440a);
                                if (iE2 == i14) {
                                    iE2 = iE != i14 ? iE : 1;
                                }
                                int i17 = w8Var.f21440a.f21777b - length2;
                                int i18 = w8Var.f21441b - length2;
                                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i17, i18);
                                spannableStringBuilder.delete(i17, i18);
                                spannableStringBuilder.setSpan(new ea0(charSequenceSubSequence.toString(), iE2), i15, i17, 33);
                                length2 += charSequenceSubSequence.length();
                                i15 = i17;
                            }
                            i16++;
                            i14 = -1;
                        }
                    } else if (iHashCode != 98) {
                        if (iHashCode == 99) {
                            if (!str2.equals("c")) {
                                return;
                            }
                            for (String str3 : x8Var.f21779d) {
                                Map map = f11938c;
                                if (map.containsKey(str3)) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i13, length, 33);
                                } else {
                                    Map map2 = f11939d;
                                    if (map2.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i13, length, 33);
                                    }
                                }
                            }
                        } else if (iHashCode != 117) {
                            if (iHashCode != 118 || !str2.equals("v")) {
                                return;
                            } else {
                                spannableStringBuilder.setSpan(new ib0(x8Var.f21778c), i13, length, 33);
                            }
                        } else if (!str2.equals("u")) {
                            return;
                        } else {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, 33);
                        }
                    } else if (!str2.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                        return;
                    } else {
                        l1.d.m(1, spannableStringBuilder, i13, length, 33);
                    }
                } else if (!str2.equals(O6.f26741q)) {
                    return;
                }
            } else if (!str2.equals("i")) {
                return;
            } else {
                l1.d.m(2, spannableStringBuilder, i13, length, 33);
            }
        } else if (!str2.equals("")) {
            return;
        }
        ArrayList arrayListF = f(list2, str, x8Var);
        for (int i19 = 0; i19 < arrayListF.size(); i19++) {
            u8 u8Var = ((y8) arrayListF.get(i19)).f22191b;
            int i20 = u8Var.f20689k;
            if (i20 == -1 && u8Var.l == -1) {
                i10 = -1;
            } else {
                i10 = (u8Var.l == 1 ? (char) 2 : (char) 0) | (i20 == 1 ? (char) 1 : (char) 0);
            }
            if (i10 != -1) {
                int i21 = u8Var.f20689k;
                if (i21 == -1 && u8Var.l == -1) {
                    i12 = -1;
                    i11 = 1;
                } else {
                    i11 = 1;
                    i12 = (i21 == 1 ? 1 : 0) | (u8Var.l == 1 ? 2 : 0);
                }
                ps1.u(spannableStringBuilder, new StyleSpan(i12), i13, length);
            } else {
                i11 = 1;
            }
            if (u8Var.f20688j == i11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, 33);
            }
            if (u8Var.f20685g) {
                if (!u8Var.f20685g) {
                    throw new IllegalStateException("Font color not defined");
                }
                ps1.u(spannableStringBuilder, new ForegroundColorSpan(u8Var.f20684f), i13, length);
            }
            if (u8Var.f20687i) {
                if (!u8Var.f20687i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                ps1.u(spannableStringBuilder, new BackgroundColorSpan(u8Var.f20686h), i13, length);
            }
            if (u8Var.f20683e != null) {
                ps1.u(spannableStringBuilder, new TypefaceSpan(u8Var.f20683e), i13, length);
            }
            int i22 = u8Var.f20690m;
            if (i22 == 1) {
                ps1.u(spannableStringBuilder, new AbsoluteSizeSpan((int) u8Var.f20691n, true), i13, length);
            } else if (i22 == 2) {
                ps1.u(spannableStringBuilder, new RelativeSizeSpan(u8Var.f20691n), i13, length);
            } else if (i22 == 3) {
                ps1.u(spannableStringBuilder, new RelativeSizeSpan(u8Var.f20691n / 100.0f), i13, length);
            }
            if (u8Var.f20693p) {
                spannableStringBuilder.setSpan(new p90(), i13, length, 33);
            }
        }
    }

    public static int e(List list, String str, x8 x8Var) {
        ArrayList arrayListF = f(list, str, x8Var);
        for (int i10 = 0; i10 < arrayListF.size(); i10++) {
            int i11 = ((y8) arrayListF.get(i10)).f22191b.f20692o;
            if (i11 != -1) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    public static ArrayList f(List list, String str, x8 x8Var) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            u8 u8Var = (u8) list.get(i10);
            String str2 = x8Var.f21776a;
            Set set = x8Var.f21779d;
            String str3 = x8Var.f21778c;
            if (!u8Var.f20679a.isEmpty() || !u8Var.f20680b.isEmpty() || !u8Var.f20681c.isEmpty() || !u8Var.f20682d.isEmpty()) {
                int iA = u8.a(u8.a(u8.a(0, 1073741824, u8Var.f20679a, str), 2, u8Var.f20680b, str2), 4, u8Var.f20682d, str3);
                if (iA == -1 || !set.containsAll(u8Var.f20681c)) {
                    size = 0;
                } else {
                    size = iA + (u8Var.f20681c.size() * 4);
                }
            } else if (TextUtils.isEmpty(str2)) {
                size = 1;
            } else {
                size = 0;
            }
            if (size > 0) {
                arrayList.add(new y8(size, u8Var));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
