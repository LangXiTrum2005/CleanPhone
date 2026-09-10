package t3;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.internal.ads.z8;
import com.ironsource.X3;
import go.k;
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
import l1.q;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f50474a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f50475b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f50476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f50477d;

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
        f50476c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        q4.a.n(255, 255, 255, map2, "bg_white");
        q4.a.n(0, 255, 0, map2, "bg_lime");
        q4.a.n(0, 255, 255, map2, "bg_cyan");
        q4.a.n(255, 0, 0, map2, "bg_red");
        q4.a.n(255, 255, 0, map2, "bg_yellow");
        q4.a.n(255, 0, 255, map2, "bg_magenta");
        q4.a.n(0, 0, 255, map2, "bg_blue");
        q4.a.n(0, 0, 0, map2, "bg_black");
        f50477d = Collections.unmodifiableMap(map2);
    }

    public static void a(String str, e eVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i10;
        int i11;
        int i12;
        int i13 = eVar.f50469b;
        int length = spannableStringBuilder.length();
        String str2 = eVar.f50468a;
        str2.getClass();
        int i14 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                l1.d.m(1, spannableStringBuilder, i13, length, 33);
                break;
            case "c":
                for (String str3 : eVar.f50471d) {
                    Map map = f50476c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i13, length, 33);
                    } else {
                        Map map2 = f50477d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i13, length, 33);
                        }
                    }
                }
                break;
            case "i":
                l1.d.m(2, spannableStringBuilder, i13, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, 33);
                break;
            case "v":
                spannableStringBuilder.setSpan(new k1.h(eVar.f50470c), i13, length, 33);
                break;
            case "ruby":
                int iC = c(list2, str, eVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, d.f50465c);
                int i15 = eVar.f50469b;
                int i16 = 0;
                int length2 = 0;
                while (i16 < arrayList.size()) {
                    if ("rt".equals(((d) arrayList.get(i16)).f50466a.f50468a)) {
                        d dVar = (d) arrayList.get(i16);
                        int iC2 = c(list2, str, dVar.f50466a);
                        if (iC2 == i14) {
                            iC2 = iC != i14 ? iC : 1;
                        }
                        int i17 = dVar.f50466a.f50469b - length2;
                        int i18 = dVar.f50467b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i17, i18);
                        spannableStringBuilder.delete(i17, i18);
                        spannableStringBuilder.setSpan(new k1.f(charSequenceSubSequence.toString(), iC2), i15, i17, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i15 = i17;
                    }
                    i16++;
                    i14 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListB = b(list2, str, eVar);
        for (int i19 = 0; i19 < arrayListB.size(); i19++) {
            b bVar = ((f) arrayListB.get(i19)).f50473b;
            int i20 = bVar.l;
            if (i20 == -1 && bVar.f50457m == -1) {
                i10 = -1;
            } else {
                i10 = (bVar.f50457m == 1 ? (char) 2 : (char) 0) | (i20 == 1 ? (char) 1 : (char) 0);
            }
            if (i10 != -1) {
                int i21 = bVar.l;
                if (i21 == -1 && bVar.f50457m == -1) {
                    i12 = -1;
                    i11 = 1;
                } else {
                    i11 = 1;
                    i12 = (i21 == 1 ? 1 : 0) | (bVar.f50457m == 1 ? 2 : 0);
                }
                no.b.c(spannableStringBuilder, new StyleSpan(i12), i13, length);
            } else {
                i11 = 1;
            }
            if (bVar.f50455j == i11) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i13, length, 33);
            }
            if (bVar.f50456k == i11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, 33);
            }
            if (bVar.f50452g) {
                if (!bVar.f50452g) {
                    throw new IllegalStateException("Font color not defined");
                }
                no.b.c(spannableStringBuilder, new ForegroundColorSpan(bVar.f50451f), i13, length);
            }
            if (bVar.f50454i) {
                if (!bVar.f50454i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                no.b.c(spannableStringBuilder, new BackgroundColorSpan(bVar.f50453h), i13, length);
            }
            if (bVar.f50450e != null) {
                no.b.c(spannableStringBuilder, new TypefaceSpan(bVar.f50450e), i13, length);
            }
            int i22 = bVar.f50458n;
            if (i22 == 1) {
                no.b.c(spannableStringBuilder, new AbsoluteSizeSpan((int) bVar.f50459o, true), i13, length);
            } else if (i22 == 2) {
                no.b.c(spannableStringBuilder, new RelativeSizeSpan(bVar.f50459o), i13, length);
            } else if (i22 == 3) {
                no.b.c(spannableStringBuilder, new RelativeSizeSpan(bVar.f50459o / 100.0f), i13, length);
            }
            if (bVar.f50461q) {
                spannableStringBuilder.setSpan(new k1.e(), i13, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static ArrayList b(List list, String str, e eVar) {
        ?? r10;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            b bVar = (b) list.get(i10);
            String str2 = eVar.f50468a;
            Set set = eVar.f50471d;
            String str3 = eVar.f50470c;
            if (bVar.f50446a.isEmpty() && bVar.f50447b.isEmpty() && bVar.f50448c.isEmpty() && bVar.f50449d.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iA = b.a(b.a(b.a(0, bVar.f50446a, str, 1073741824), bVar.f50447b, str2, 2), bVar.f50449d, str3, 4);
                if (iA == -1 || !set.containsAll(bVar.f50448c)) {
                    r10 = 0;
                } else {
                    size = iA + (bVar.f50448c.size() * 4);
                }
            }
            if (r10 > 0) {
                r10 = size;
                r10 = zIsEmpty;
                arrayList.add(new f(r10, bVar));
            } else {
                r10 = size;
                r10 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, e eVar) {
        ArrayList arrayListB = b(list, str, eVar);
        for (int i10 = 0; i10 < arrayListB.size(); i10++) {
            int i11 = ((f) arrayListB.get(i10)).f50473b.f50460p;
            if (i11 != -1) {
                return i11;
            }
        }
        return -1;
    }

    public static c d(String str, Matcher matcher, q qVar, ArrayList arrayList) {
        z8 z8Var = new z8();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            z8Var.f22548a = h.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            z8Var.f22549b = h.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, z8Var);
            StringBuilder sb2 = new StringBuilder();
            qVar.getClass();
            String strN = qVar.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strN)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strN.trim());
                strN = qVar.n(StandardCharsets.UTF_8);
            }
            z8Var.f22550c = f(str, sb2.toString(), arrayList);
            return new c(z8Var.a().a(), z8Var.f22548a, z8Var.f22549b);
        } catch (IllegalArgumentException unused) {
            l1.a.s("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, z8 z8Var) {
        int i10;
        int i11;
        int i12;
        Matcher matcher = f50475b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    g(strGroup2, z8Var);
                } else {
                    if ("align".equals(strGroup)) {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
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
                                l1.a.s("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i10 = 2;
                                break;
                        }
                        z8Var.f22551d = i10;
                    } else if (X3.i.L.equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            String strSubstring = strGroup2.substring(iIndexOf + 1);
                            strSubstring.getClass();
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i11 = 0;
                                    break;
                                case "center":
                                case "middle":
                                    i11 = 1;
                                    break;
                                case "line-right":
                                case "end":
                                    i11 = 2;
                                    break;
                                default:
                                    l1.a.s("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                    i11 = Integer.MIN_VALUE;
                                    break;
                            }
                            z8Var.f22556i = i11;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        z8Var.f22555h = h.b(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        z8Var.f22557j = h.b(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i12 = 2;
                        } else if (strGroup2.equals("rl")) {
                            i12 = 1;
                        } else {
                            l1.a.s("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i12 = Integer.MIN_VALUE;
                        }
                        z8Var.f22558k = i12;
                    } else {
                        l1.a.s("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                    }
                }
            } catch (NumberFormatException unused) {
                l1.a.s("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString f(String str, String str2, List list) {
        char c4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            String strTrim = "";
            if (i10 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (e) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new e("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i10);
            if (cCharAt == '&') {
                i10++;
                int iIndexOf = str2.indexOf(59, i10);
                int iIndexOf2 = str2.indexOf(32, i10);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i10, iIndexOf);
                    strSubstring.getClass();
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            l1.a.s("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i10++;
            } else {
                int length = i10 + 1;
                if (length < str2.length()) {
                    boolean z10 = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i11 = length - 2;
                    boolean z11 = str2.charAt(i11) == '/';
                    int i12 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i11 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i12, i11);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        k.i(!strTrim2.isEmpty());
                        String str3 = y.f44830a;
                        String str4 = strTrim2.split("[ \\.]", 2)[0];
                        str4.getClass();
                        switch (str4) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (!z10) {
                                    if (!z11) {
                                        int length2 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring2.trim();
                                        k.i(!strTrim3.isEmpty());
                                        int iIndexOf4 = strTrim3.indexOf(" ");
                                        if (iIndexOf4 == -1) {
                                            c4 = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf4).trim();
                                            c4 = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf4);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str5 = strArrSplit[c4];
                                        HashSet hashSet = new HashSet();
                                        for (int i13 = 1; i13 < strArrSplit.length; i13++) {
                                            hashSet.add(strArrSplit[i13]);
                                        }
                                        arrayDeque.push(new e(str5, length2, strTrim, hashSet));
                                    }
                                    break;
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        e eVar = (e) arrayDeque.pop();
                                        a(str, eVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new d(eVar, spannableStringBuilder.length()));
                                        }
                                        if (eVar.f50468a.equals(str4)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                }
                i10 = length;
            }
        }
    }

    public static void g(String str, z8 z8Var) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            int i10 = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i10 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i10 = 0;
                    break;
                default:
                    l1.a.s("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            z8Var.f22554g = i10;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            z8Var.f22552e = h.b(str);
            z8Var.f22553f = 0;
        } else {
            z8Var.f22552e = Integer.parseInt(str);
            z8Var.f22553f = 1;
        }
    }
}
