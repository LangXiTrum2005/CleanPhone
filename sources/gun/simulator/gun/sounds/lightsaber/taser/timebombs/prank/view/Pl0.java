package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

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
import com.badlogic.gdx.Input;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Pl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f3571a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap map = new HashMap();
        AbstractC3888ke0.n(255, 255, 255, map, "white");
        AbstractC3888ke0.n(0, 255, 0, map, "lime");
        AbstractC3888ke0.n(0, 255, 255, map, "cyan");
        AbstractC3888ke0.n(255, 0, 0, map, "red");
        AbstractC3888ke0.n(255, 255, 0, map, "yellow");
        AbstractC3888ke0.n(255, 0, 255, map, "magenta");
        AbstractC3888ke0.n(0, 0, 255, map, "blue");
        AbstractC3888ke0.n(0, 0, 0, map, "black");
        c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        AbstractC3888ke0.n(255, 255, 255, map2, "bg_white");
        AbstractC3888ke0.n(0, 255, 0, map2, "bg_lime");
        AbstractC3888ke0.n(0, 255, 255, map2, "bg_cyan");
        AbstractC3888ke0.n(255, 0, 0, map2, "bg_red");
        AbstractC3888ke0.n(255, 255, 0, map2, "bg_yellow");
        AbstractC3888ke0.n(255, 0, 255, map2, "bg_magenta");
        AbstractC3888ke0.n(0, 0, 255, map2, "bg_blue");
        AbstractC3888ke0.n(0, 0, 0, map2, "bg_black");
        d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:90:0x0186  */
    public static void a(SpannableStringBuilder spannableStringBuilder, Ml0 ml0, String str, List list, List list2) {
        byte b2;
        int i;
        int i2;
        int i3 = ml0.b;
        int length = spannableStringBuilder.length();
        String str2 = ml0.f3421a;
        str2.getClass();
        int iHashCode = str2.hashCode();
        int i4 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode != 3511770) {
                        if (iHashCode != 98) {
                            if (iHashCode != 99) {
                                if (iHashCode != 117) {
                                    if (iHashCode == 118 && str2.equals(com.umeng.analytics.pro.bc.aK)) {
                                        b2 = 5;
                                    } else {
                                        b2 = -1;
                                    }
                                } else if (str2.equals(com.umeng.analytics.pro.bc.aN)) {
                                    b2 = 4;
                                } else {
                                    b2 = -1;
                                }
                            } else if (str2.equals(com.umeng.analytics.pro.bc.aL)) {
                                b2 = 2;
                            } else {
                                b2 = -1;
                            }
                        } else if (str2.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                    } else if (str2.equals("ruby")) {
                        b2 = 7;
                    } else {
                        b2 = -1;
                    }
                } else if (str2.equals("lang")) {
                    b2 = 6;
                } else {
                    b2 = -1;
                }
            } else if (str2.equals(com.umeng.analytics.pro.bc.aI)) {
                b2 = 3;
            } else {
                b2 = -1;
            }
        } else if (str2.equals("")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        switch (b2) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                DM.v(1, spannableStringBuilder, i3, length, 33);
                break;
            case 2:
                for (String str3 : ml0.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i3, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i3, length, 33);
                        }
                    }
                }
                break;
            case 3:
                DM.v(2, spannableStringBuilder, i3, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, length, 33);
                break;
            case 7:
                int iC = c(list2, str, ml0);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, Ll0.c);
                int i5 = ml0.b;
                int i6 = 0;
                int length2 = 0;
                while (i6 < arrayList.size()) {
                    if ("rt".equals(((Ll0) arrayList.get(i6)).f3371a.f3421a)) {
                        Ll0 ll0 = (Ll0) arrayList.get(i6);
                        int iC2 = c(list2, str, ll0.f3371a);
                        if (iC2 == i4) {
                            iC2 = iC != i4 ? iC : 1;
                        }
                        int i7 = ll0.f3371a.b - length2;
                        int i8 = ll0.b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i7, i8);
                        spannableStringBuilder.delete(i7, i8);
                        spannableStringBuilder.setSpan(new C3836k10(charSequenceSubSequence.toString(), iC2), i5, i7, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i5 = i7;
                    }
                    i6++;
                    i4 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListB = b(list2, str, ml0);
        for (int i9 = 0; i9 < arrayListB.size(); i9++) {
            Jl0 jl0 = ((Nl0) arrayListB.get(i9)).b;
            if (jl0 != null) {
                int i10 = jl0.l;
                if (i10 == -1 && jl0.m == -1) {
                    i = 1;
                } else if (((i10 == 1 ? (char) 1 : (char) 0) | (jl0.m == 1 ? (char) 2 : (char) 0)) != -1) {
                    int i11 = jl0.l;
                    if (i11 == -1 && jl0.m == -1) {
                        i2 = -1;
                        i = 1;
                    } else {
                        i = 1;
                        i2 = (i11 == 1 ? 1 : 0) | (jl0.m == 1 ? 2 : 0);
                    }
                    AbstractC2995aW.g(spannableStringBuilder, new StyleSpan(i2), i3, length);
                } else {
                    i = 1;
                }
                if (jl0.j == i) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i3, length, 33);
                }
                if (jl0.k == i) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i3, length, 33);
                }
                if (jl0.g) {
                    if (!jl0.g) {
                        throw new IllegalStateException("Font color not defined");
                    }
                    AbstractC2995aW.g(spannableStringBuilder, new ForegroundColorSpan(jl0.f), i3, length);
                }
                if (jl0.i) {
                    if (!jl0.i) {
                        throw new IllegalStateException("Background color not defined.");
                    }
                    AbstractC2995aW.g(spannableStringBuilder, new BackgroundColorSpan(jl0.h), i3, length);
                }
                if (jl0.e != null) {
                    AbstractC2995aW.g(spannableStringBuilder, new TypefaceSpan(jl0.e), i3, length);
                }
                int i12 = jl0.n;
                if (i12 == 1) {
                    AbstractC2995aW.g(spannableStringBuilder, new AbsoluteSizeSpan((int) jl0.o, true), i3, length);
                } else if (i12 == 2) {
                    AbstractC2995aW.g(spannableStringBuilder, new RelativeSizeSpan(jl0.o), i3, length);
                } else if (i12 == 3) {
                    AbstractC2995aW.g(spannableStringBuilder, new RelativeSizeSpan(jl0.o / 100.0f), i3, length);
                }
                if (jl0.q) {
                    spannableStringBuilder.setSpan(new C3679iA(), i3, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static ArrayList b(List list, String str, Ml0 ml0) {
        ?? r4;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Jl0 jl0 = (Jl0) list.get(i);
            String str2 = ml0.f3421a;
            if (jl0.f3281a.isEmpty() && jl0.b.isEmpty() && jl0.c.isEmpty() && jl0.d.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iA = Jl0.a(Jl0.a(Jl0.a(0, jl0.f3281a, str, 1073741824), jl0.b, str2, 2), jl0.d, ml0.c, 4);
                if (iA != -1) {
                    if (ml0.d.containsAll(jl0.c)) {
                        size = iA + (jl0.c.size() * 4);
                    } else {
                        r4 = 0;
                    }
                } else {
                    r4 = 0;
                }
            }
            if (r4 > 0) {
                r4 = size;
                r4 = zIsEmpty;
                arrayList.add(new Nl0(r4, jl0));
            } else {
                r4 = size;
                r4 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, Ml0 ml0) {
        ArrayList arrayListB = b(list, str, ml0);
        for (int i = 0; i < arrayListB.size(); i++) {
            int i2 = ((Nl0) arrayListB.get(i)).b.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static Kl0 d(String str, Matcher matcher, JT jt, ArrayList arrayList) {
        Ol0 ol0 = new Ol0();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            ol0.f3520a = Sl0.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            ol0.b = Sl0.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, ol0);
            StringBuilder sb = new StringBuilder();
            String strG = jt.g(AbstractC2333Ce.c);
            while (!TextUtils.isEmpty(strG)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strG.trim());
                strG = jt.g(AbstractC2333Ce.c);
            }
            ol0.c = f(str, sb.toString(), arrayList);
            return new Kl0(ol0.a().a(), ol0.f3520a, ol0.b);
        } catch (NumberFormatException unused) {
            matcher.group();
            AbstractC4038mJ.f();
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:53:0x00ba  */
    public static void e(String str, Ol0 ol0) {
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    g(strGroup2, ol0);
                } else {
                    if ("align".equals(strGroup)) {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i = 2;
                                break;
                            case "end":
                                i = 3;
                                break;
                            case "left":
                                i = 4;
                                break;
                            case "right":
                                i = 5;
                                break;
                            case "start":
                                break;
                            default:
                                "Invalid alignment value: ".concat(strGroup2);
                                AbstractC4038mJ.f();
                                i = 2;
                                break;
                        }
                        ol0.d = i;
                    } else if ("position".equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            String strSubstring = strGroup2.substring(iIndexOf + 1);
                            strSubstring.getClass();
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i = 0;
                                    break;
                                case "center":
                                case "middle":
                                    break;
                                case "line-right":
                                case "end":
                                    i = 2;
                                    break;
                                default:
                                    "Invalid anchor value: ".concat(strSubstring);
                                    AbstractC4038mJ.f();
                                    i = Integer.MIN_VALUE;
                                    break;
                            }
                            ol0.i = i;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        ol0.h = Sl0.b(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        ol0.j = Sl0.b(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i = 2;
                        } else if (!strGroup2.equals("rl")) {
                            "Invalid 'vertical' value: ".concat(strGroup2);
                            AbstractC4038mJ.f();
                            i = Integer.MIN_VALUE;
                        }
                        ol0.k = i;
                    } else {
                        AbstractC4038mJ.f();
                    }
                }
            } catch (NumberFormatException unused) {
                matcher.group();
                AbstractC4038mJ.f();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    public static SpannedString f(String str, String str2, List list) {
        char c2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String strTrim = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(spannableStringBuilder, (Ml0) arrayDeque.pop(), str, arrayList, list);
                }
                a(spannableStringBuilder, new Ml0("", 0, "", Collections.emptySet()), str, Collections.emptyList(), list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i);
            byte b2 = 2;
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i, iIndexOf);
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
                            AbstractC4038mJ.f();
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int length = i + 1;
                if (length < str2.length()) {
                    boolean z = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i2 = length - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i3, i2);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        FW.h(!strTrim2.isEmpty());
                        int i4 = Ug0.f3833a;
                        String str3 = strTrim2.split("[ \\.]", 2)[0];
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case Input.Keys.BUTTON_C /* 98 */:
                                if (str3.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                                    b2 = 0;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case Input.Keys.BUTTON_X /* 99 */:
                                if (str3.equals(com.umeng.analytics.pro.bc.aL)) {
                                    b2 = 1;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 105:
                                if (!str3.equals(com.umeng.analytics.pro.bc.aI)) {
                                    b2 = -1;
                                }
                                break;
                            case ASSET_FAILED_STATUS_CODE_VALUE:
                                if (str3.equals(com.umeng.analytics.pro.bc.aN)) {
                                    b2 = 3;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                if (str3.equals(com.umeng.analytics.pro.bc.aK)) {
                                    b2 = 4;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 3650:
                                if (str3.equals("rt")) {
                                    b2 = 5;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 3314158:
                                if (str3.equals("lang")) {
                                    b2 = 6;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 3511770:
                                if (str3.equals("ruby")) {
                                    b2 = 7;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                if (z) {
                                    while (!arrayDeque.isEmpty()) {
                                        Ml0 ml0 = (Ml0) arrayDeque.pop();
                                        a(spannableStringBuilder, ml0, str, arrayList, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new Ll0(ml0, spannableStringBuilder.length()));
                                        }
                                        if (ml0.f3421a.equals(str3)) {
                                            break;
                                        }
                                    }
                                } else if (!z2) {
                                    int length2 = spannableStringBuilder.length();
                                    String strTrim3 = strSubstring2.trim();
                                    FW.h(!strTrim3.isEmpty());
                                    int iIndexOf4 = strTrim3.indexOf(" ");
                                    if (iIndexOf4 == -1) {
                                        c2 = 0;
                                    } else {
                                        strTrim = strTrim3.substring(iIndexOf4).trim();
                                        c2 = 0;
                                        strTrim3 = strTrim3.substring(0, iIndexOf4);
                                    }
                                    String[] strArrSplit = strTrim3.split("\\.", -1);
                                    String str4 = strArrSplit[c2];
                                    HashSet hashSet = new HashSet();
                                    for (int i5 = 1; i5 < strArrSplit.length; i5++) {
                                        hashSet.add(strArrSplit[i5]);
                                    }
                                    arrayDeque.push(new Ml0(str4, length2, strTrim, hashSet));
                                }
                                break;
                        }
                    }
                }
                i = length;
            }
        }
    }

    public static void g(String str, Ol0 ol0) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            int i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    "Invalid anchor value: ".concat(strSubstring);
                    AbstractC4038mJ.f();
                    i = Integer.MIN_VALUE;
                    break;
            }
            ol0.g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            ol0.e = Sl0.b(str);
            ol0.f = 0;
        } else {
            ol0.e = Integer.parseInt(str);
            ol0.f = 1;
        }
    }
}
