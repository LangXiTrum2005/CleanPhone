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
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.smartdigimkt.q8.i;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class zzanp {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        androidx.media3.extractor.text.ttml.a.w(255, 255, 255, map, "white");
        androidx.media3.extractor.text.ttml.a.w(0, 255, 0, map, "lime");
        androidx.media3.extractor.text.ttml.a.w(0, 255, 255, map, "cyan");
        androidx.media3.extractor.text.ttml.a.w(255, 0, 0, map, "red");
        androidx.media3.extractor.text.ttml.a.w(255, 255, 0, map, "yellow");
        androidx.media3.extractor.text.ttml.a.w(255, 0, 255, map, "magenta");
        androidx.media3.extractor.text.ttml.a.w(0, 0, 255, map, "blue");
        androidx.media3.extractor.text.ttml.a.w(0, 0, 0, map, "black");
        zzc = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        androidx.media3.extractor.text.ttml.a.w(255, 255, 255, map2, "bg_white");
        androidx.media3.extractor.text.ttml.a.w(0, 255, 0, map2, "bg_lime");
        androidx.media3.extractor.text.ttml.a.w(0, 255, 255, map2, "bg_cyan");
        androidx.media3.extractor.text.ttml.a.w(255, 0, 0, map2, "bg_red");
        androidx.media3.extractor.text.ttml.a.w(255, 255, 0, map2, "bg_yellow");
        androidx.media3.extractor.text.ttml.a.w(255, 0, 255, map2, "bg_magenta");
        androidx.media3.extractor.text.ttml.a.w(0, 0, 255, map2, "bg_blue");
        androidx.media3.extractor.text.ttml.a.w(0, 0, 0, map2, "bg_black");
        zzd = Collections.unmodifiableMap(map2);
    }

    public static zzanj zza(zzer zzerVar, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String strZzN = zzerVar.zzN(charset);
        if (strZzN != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(strZzN);
            if (matcher.matches()) {
                return zzd(null, matcher, zzerVar, list);
            }
            String strZzN2 = zzerVar.zzN(charset);
            if (strZzN2 != null) {
                Matcher matcher2 = pattern.matcher(strZzN2);
                if (matcher2.matches()) {
                    return zzd(strZzN.trim(), matcher2, zzerVar, list);
                }
            }
        }
        return null;
    }

    public static zzcw zzb(String str) {
        zzano zzanoVar = new zzano();
        zze(str, zzanoVar);
        return zzanoVar.zza();
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x0127  */
    public static SpannedString zzc(String str, String str2, List list) {
        byte b2;
        int i2;
        int i3 = -1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 < str2.length()) {
            int i5 = i4 + 1;
            char cCharAt = str2.charAt(i4);
            if (cCharAt == '&') {
                int iIndexOf = str2.indexOf(59, i5);
                int iIndexOf2 = str2.indexOf(32, i5);
                if (iIndexOf == i3) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != i3) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != i3) {
                    String strSubstring = str2.substring(i5, iIndexOf);
                    int iHashCode = strSubstring.hashCode();
                    if (iHashCode != 3309) {
                        if (iHashCode != 3464) {
                            if (iHashCode != 96708) {
                                if (iHashCode == 3374865 && strSubstring.equals("nbsp")) {
                                    b2 = 2;
                                } else {
                                    b2 = -1;
                                }
                            } else if (strSubstring.equals("amp")) {
                                b2 = 3;
                            } else {
                                b2 = -1;
                            }
                        } else if (strSubstring.equals("lt")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                    } else if (strSubstring.equals("gt")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                    if (b2 == 0) {
                        spannableStringBuilder.append('<');
                    } else if (b2 == 1) {
                        spannableStringBuilder.append('>');
                    } else if (b2 == 2) {
                        spannableStringBuilder.append(' ');
                    } else if (b2 != 3) {
                        StringBuilder sb = new StringBuilder(strSubstring.length() + 33);
                        sb.append("ignoring unsupported entity: '&");
                        sb.append(strSubstring);
                        sb.append(";'");
                        zzee.zzc("WebvttCueParser", sb.toString());
                    } else {
                        spannableStringBuilder.append('&');
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i4 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
                i3 = -1;
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
            } else if (i5 < str2.length()) {
                char cCharAt2 = str2.charAt(i5);
                int iIndexOf3 = str2.indexOf(62, i5);
                int length = iIndexOf3 == i3 ? str2.length() : iIndexOf3 + 1;
                int i6 = length - 2;
                boolean z2 = str2.charAt(i6) == '/';
                int i7 = i4 + (cCharAt2 == '/' ? 2 : 1);
                if (!z2) {
                    i6 = length - 1;
                }
                String strSubstring2 = str2.substring(i7, i6);
                if (!strSubstring2.trim().isEmpty()) {
                    String strTrim = strSubstring2.trim();
                    zzgqa.zza(!strTrim.isEmpty());
                    String str3 = zzfj.zza;
                    String str4 = strTrim.split("[ \\.]", 2)[0];
                    int iHashCode2 = str4.hashCode();
                    if (iHashCode2 != 98) {
                        if (iHashCode2 != 99) {
                            if (iHashCode2 != 105) {
                                if (iHashCode2 != 3650) {
                                    if (iHashCode2 != 3314158) {
                                        if (iHashCode2 != 3511770) {
                                            if (iHashCode2 != 117) {
                                                if (iHashCode2 == 118 && str4.equals("v")) {
                                                    i2 = 7;
                                                } else {
                                                    i2 = i3;
                                                }
                                            } else if (str4.equals("u")) {
                                                i2 = 6;
                                            } else {
                                                i2 = i3;
                                            }
                                        } else if (str4.equals("ruby")) {
                                            i2 = 4;
                                        } else {
                                            i2 = i3;
                                        }
                                    } else if (str4.equals("lang")) {
                                        i2 = 3;
                                    } else {
                                        i2 = i3;
                                    }
                                } else if (str4.equals("rt")) {
                                    i2 = 5;
                                } else {
                                    i2 = i3;
                                }
                            } else if (str4.equals(i.f37957c)) {
                                i2 = 2;
                            } else {
                                i2 = i3;
                            }
                        } else if (str4.equals("c")) {
                            i2 = 1;
                        } else {
                            i2 = i3;
                        }
                    } else if (str4.equals("b")) {
                        i2 = 0;
                    } else {
                        i2 = i3;
                    }
                    switch (i2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            if (cCharAt2 == '/') {
                                while (!arrayDeque.isEmpty()) {
                                    zzanm zzanmVar = (zzanm) arrayDeque.pop();
                                    zzf(str, zzanmVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new zzanl(zzanmVar, spannableStringBuilder.length(), null));
                                    }
                                    if (zzanmVar.zza.equals(str4)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(zzanm.zza(strSubstring2, spannableStringBuilder.length()));
                            }
                            break;
                    }
                }
                i4 = length;
            }
            i4 = i5;
            i3 = -1;
        }
        while (!arrayDeque.isEmpty()) {
            zzf(str, (zzanm) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        zzf(str, zzanm.zzb(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static zzanj zzd(String str, Matcher matcher, zzer zzerVar, List list) {
        zzano zzanoVar = new zzano();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            zzanoVar.zza = zzanr.zza(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            zzanoVar.zzb = zzanr.zza(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            zze(strGroup3, zzanoVar);
            StringBuilder sb = new StringBuilder();
            String strZzN = zzerVar.zzN(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strZzN)) {
                if (sb.length() > 0) {
                    sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                }
                sb.append(strZzN.trim());
                strZzN = zzerVar.zzN(StandardCharsets.UTF_8);
            }
            zzanoVar.zzc = zzc(str, sb.toString(), list);
            return new zzanj(zzanoVar.zza().zzr(), zzanoVar.zza, zzanoVar.zzb);
        } catch (IllegalArgumentException unused) {
            zzee.zzc("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:96:0x0167  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void zze(String str, zzano zzanoVar) {
        byte b2;
        byte b3;
        byte b4;
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i2 = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i3 = 2;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    byte b5 = -1;
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring.hashCode()) {
                            case -1364013995:
                                if (strSubstring.equals(TtmlNode.CENTER)) {
                                    b5 = 1;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring.equals("middle")) {
                                    b5 = 2;
                                }
                                break;
                            case 100571:
                                if (strSubstring.equals(TtmlNode.END)) {
                                    b5 = 3;
                                }
                                break;
                            case 109757538:
                                if (strSubstring.equals("start")) {
                                    b5 = 0;
                                }
                                break;
                        }
                        if (b5 == 0) {
                            i3 = 0;
                        } else if (b5 == 1 || b5 == 2) {
                            i3 = 1;
                        } else if (b5 != 3) {
                            zzee.zzc("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                            i3 = Integer.MIN_VALUE;
                        }
                        zzanoVar.zzg = i3;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        zzanoVar.zze = zzanr.zzb(strGroup2);
                        zzanoVar.zzf = 0;
                    } else {
                        zzanoVar.zze = Integer.parseInt(strGroup2);
                        zzanoVar.zzf = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2) {
                        case "center":
                            b2 = 2;
                            break;
                        case "middle":
                            b2 = 3;
                            break;
                        case "end":
                            b2 = 4;
                            break;
                        case "left":
                            b2 = 1;
                            break;
                        case "right":
                            b2 = 5;
                            break;
                        case "start":
                            b2 = 0;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 != 0) {
                        if (b2 == 1) {
                            i2 = 4;
                        } else if (b2 == 2 || b2 == 3) {
                            i2 = 2;
                        } else if (b2 == 4) {
                            i2 = 3;
                        } else if (b2 != 5) {
                            zzee.zzc("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i2 = 2;
                        } else {
                            i2 = 5;
                        }
                    }
                    zzanoVar.zzd = i2;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2) {
                            case "line-left":
                                b4 = 0;
                                break;
                            case "center":
                                b4 = 2;
                                break;
                            case "line-right":
                                b4 = 4;
                                break;
                            case "middle":
                                b4 = 3;
                                break;
                            case "end":
                                b4 = 5;
                                break;
                            case "start":
                                b4 = 1;
                                break;
                            default:
                                b4 = -1;
                                break;
                        }
                        if (b4 == 0 || b4 == 1) {
                            i2 = 0;
                        } else if (b4 != 2 && b4 != 3) {
                            if (b4 == 4 || b4 == 5) {
                                i2 = 2;
                            } else {
                                zzee.zzc("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                i2 = Integer.MIN_VALUE;
                            }
                        }
                        zzanoVar.zzi = i2;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    zzanoVar.zzh = zzanr.zzb(strGroup2);
                } else if ("size".equals(strGroup)) {
                    zzanoVar.zzj = zzanr.zzb(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode == 3642 && strGroup2.equals("rl")) {
                            b3 = 0;
                        } else {
                            b3 = -1;
                        }
                    } else if (strGroup2.equals("lr")) {
                        b3 = 1;
                    } else {
                        b3 = -1;
                    }
                    if (b3 != 0) {
                        if (b3 != 1) {
                            zzee.zzc("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i2 = Integer.MIN_VALUE;
                        } else {
                            i2 = 2;
                        }
                    }
                    zzanoVar.zzk = i2;
                } else {
                    StringBuilder sb = new StringBuilder(strGroup.length() + 21 + strGroup2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(strGroup);
                    sb.append(":");
                    sb.append(strGroup2);
                    zzee.zzc("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                zzee.zzc("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    private static void zzf(String str, zzanm zzanmVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        byte b2;
        int i2 = zzanmVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzanmVar.zza;
        int iHashCode = str2.hashCode();
        int i3 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode != 3511770) {
                        if (iHashCode != 98) {
                            if (iHashCode != 99) {
                                if (iHashCode != 117) {
                                    if (iHashCode == 118 && str2.equals("v")) {
                                        b2 = 5;
                                    } else {
                                        b2 = -1;
                                    }
                                } else if (str2.equals("u")) {
                                    b2 = 3;
                                } else {
                                    b2 = -1;
                                }
                            } else if (str2.equals("c")) {
                                b2 = 4;
                            } else {
                                b2 = -1;
                            }
                        } else if (str2.equals("b")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                    } else if (str2.equals("ruby")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (str2.equals("lang")) {
                    b2 = 6;
                } else {
                    b2 = -1;
                }
            } else if (str2.equals(i.f37957c)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str2.equals("")) {
            b2 = 7;
        } else {
            b2 = -1;
        }
        switch (b2) {
            case 0:
                androidx.datastore.preferences.protobuf.a.t(1, spannableStringBuilder, i2, length, 33);
                break;
            case 1:
                androidx.datastore.preferences.protobuf.a.t(2, spannableStringBuilder, i2, length, 33);
                break;
            case 2:
                int iZzg = zzg(list2, str, zzanmVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, zzanl.zza);
                int i4 = i2;
                int i5 = 0;
                int length2 = 0;
                while (i5 < arrayList.size()) {
                    if ("rt".equals(((zzanl) arrayList.get(i5)).zzc().zza)) {
                        zzanl zzanlVar = (zzanl) arrayList.get(i5);
                        int iZzg2 = zzg(list2, str, zzanlVar.zzc());
                        if (iZzg2 == i3) {
                            iZzg2 = iZzg != i3 ? iZzg : 1;
                        }
                        int i6 = zzanlVar.zzc().zzb - length2;
                        int iZzd = zzanlVar.zzd() - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i6, iZzd);
                        spannableStringBuilder.delete(i6, iZzd);
                        spannableStringBuilder.setSpan(new zzdc(charSequenceSubSequence.toString(), iZzg2), i4, i6, 33);
                        length2 += charSequenceSubSequence.length();
                        i4 = i6;
                    }
                    i5++;
                    i3 = -1;
                }
                break;
            case 3:
                androidx.datastore.preferences.protobuf.a.w(spannableStringBuilder, i2, length, 33);
                break;
            case 4:
                for (String str3 : zzanmVar.zzd) {
                    Map map = zzc;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i2, length, 33);
                    } else {
                        Map map2 = zzd;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i2, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new zzdf(zzanmVar.zzc), i2, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List listZzh = zzh(list2, str, zzanmVar);
        for (int i7 = 0; i7 < listZzh.size(); i7++) {
            zzani zzaniVar = ((zzann) listZzh.get(i7)).zzb;
            if (zzaniVar != null) {
                if (zzaniVar.zzf() != -1) {
                    zzdd.zza(spannableStringBuilder, new StyleSpan(zzaniVar.zzf()), i2, length, 33);
                }
                if (zzaniVar.zzg()) {
                    androidx.datastore.preferences.protobuf.a.w(spannableStringBuilder, i2, length, 33);
                }
                if (zzaniVar.zzo()) {
                    zzdd.zza(spannableStringBuilder, new ForegroundColorSpan(zzaniVar.zzm()), i2, length, 33);
                }
                if (zzaniVar.zzr()) {
                    zzdd.zza(spannableStringBuilder, new BackgroundColorSpan(zzaniVar.zzp()), i2, length, 33);
                }
                if (zzaniVar.zzk() != null) {
                    zzdd.zza(spannableStringBuilder, new TypefaceSpan(zzaniVar.zzk()), i2, length, 33);
                }
                int iZzu = zzaniVar.zzu();
                if (iZzu == 1) {
                    zzdd.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzaniVar.zzv(), true), i2, length, 33);
                } else if (iZzu == 2) {
                    zzdd.zza(spannableStringBuilder, new RelativeSizeSpan(zzaniVar.zzv()), i2, length, 33);
                } else if (iZzu == 3) {
                    zzdd.zza(spannableStringBuilder, new RelativeSizeSpan(zzaniVar.zzv() / 100.0f), i2, length, 33);
                }
                if (zzaniVar.zzz()) {
                    spannableStringBuilder.setSpan(new zzdb(), i2, length, 33);
                }
            }
        }
    }

    private static int zzg(List list, String str, zzanm zzanmVar) {
        List listZzh = zzh(list, str, zzanmVar);
        for (int i2 = 0; i2 < listZzh.size(); i2++) {
            zzani zzaniVar = ((zzann) listZzh.get(i2)).zzb;
            if (zzaniVar.zzx() != -1) {
                return zzaniVar.zzx();
            }
        }
        return -1;
    }

    private static List zzh(List list, String str, zzanm zzanmVar) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzani zzaniVar = (zzani) list.get(i2);
            int iZze = zzaniVar.zze(str, zzanmVar.zza, zzanmVar.zzd, zzanmVar.zzc);
            if (iZze > 0) {
                arrayList.add(new zzann(iZze, zzaniVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
