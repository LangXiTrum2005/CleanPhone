package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
final class zzanh {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzer zzc = new zzer();
    private final StringBuilder zzd = new StringBuilder();

    public static void zzb(zzer zzerVar) {
        while (true) {
            for (boolean z2 = true; zzerVar.zzd() > 0 && z2; z2 = false) {
                char c2 = (char) zzerVar.zzi()[zzerVar.zzg()];
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    zzerVar.zzk(1);
                } else {
                    int iZzg = zzerVar.zzg();
                    int iZze = zzerVar.zze();
                    byte[] bArrZzi = zzerVar.zzi();
                    if (iZzg + 2 <= iZze) {
                        int i2 = iZzg + 1;
                        if (bArrZzi[iZzg] == 47) {
                            int i3 = iZzg + 2;
                            if (bArrZzi[i2] == 42) {
                                while (true) {
                                    int i4 = i3 + 1;
                                    if (i4 >= iZze) {
                                        break;
                                    }
                                    if (((char) bArrZzi[i3]) == '*' && ((char) bArrZzi[i4]) == '/') {
                                        iZze = i3 + 2;
                                        i3 = iZze;
                                    } else {
                                        i3 = i4;
                                    }
                                }
                                zzerVar.zzk(iZze - zzerVar.zzg());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    public static String zzc(zzer zzerVar, StringBuilder sb) {
        zzb(zzerVar);
        if (zzerVar.zzd() == 0) {
            return null;
        }
        String strZzd = zzd(zzerVar, sb);
        if (!strZzd.isEmpty()) {
            return strZzd;
        }
        char cZzs = (char) zzerVar.zzs();
        StringBuilder sb2 = new StringBuilder(String.valueOf(cZzs).length());
        sb2.append(cZzs);
        return sb2.toString();
    }

    private static String zzd(zzer zzerVar, StringBuilder sb) {
        char c2;
        sb.setLength(0);
        int iZzg = zzerVar.zzg();
        int iZze = zzerVar.zze();
        loop0: while (true) {
            boolean z2 = false;
            while (true) {
                if (iZzg < iZze && !z2) {
                    c2 = (char) zzerVar.zzi()[iZzg];
                    if ((c2 >= 'A' && c2 <= 'Z') || ((c2 >= 'a' && c2 <= 'z') || ((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                        break;
                    }
                    z2 = true;
                } else {
                    break loop0;
                }
            }
            sb.append(c2);
            iZzg++;
        }
        zzerVar.zzk(iZzg - zzerVar.zzg());
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:113:0x020e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0216  */
    /* JADX WARN: Code duplicated, block: B:118:0x021e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0226  */
    /* JADX WARN: Code duplicated, block: B:121:0x022b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0233  */
    /* JADX WARN: Code duplicated, block: B:124:0x0238  */
    /* JADX WARN: Code duplicated, block: B:126:0x0240  */
    /* JADX WARN: Code duplicated, block: B:128:0x0248  */
    /* JADX WARN: Code duplicated, block: B:129:0x024d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0255  */
    /* JADX WARN: Code duplicated, block: B:133:0x025d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0262  */
    /* JADX WARN: Code duplicated, block: B:136:0x026a  */
    /* JADX WARN: Code duplicated, block: B:138:0x027a  */
    /* JADX WARN: Code duplicated, block: B:139:0x029c  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:143:0x02af  */
    /* JADX WARN: Code duplicated, block: B:149:0x02be  */
    /* JADX WARN: Code duplicated, block: B:151:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:152:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:154:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:155:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x02d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:163:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:175:0x02de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x003e  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d3  */
    public final List zza(zzer zzerVar) {
        String strTrim;
        String string;
        Matcher matcher;
        String strGroup;
        int iHashCode;
        byte b2;
        boolean z2;
        int i2 = -1;
        StringBuilder sb = this.zzd;
        int i3 = 0;
        sb.setLength(0);
        int iZzg = zzerVar.zzg();
        while (!TextUtils.isEmpty(zzerVar.zzN(StandardCharsets.UTF_8))) {
        }
        zzer zzerVar2 = this.zzc;
        zzerVar2.zzb(zzerVar.zzi(), zzerVar.zzg());
        zzerVar2.zzh(iZzg);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzb(zzerVar2);
            if (zzerVar2.zzd() >= 5 && "::cue".equals(zzerVar2.zzK(5, StandardCharsets.UTF_8))) {
                int iZzg2 = zzerVar2.zzg();
                String strZzc = zzc(zzerVar2, sb);
                if (strZzc == null) {
                    strTrim = null;
                } else if ("{".equals(strZzc)) {
                    zzerVar2.zzh(iZzg2);
                    strTrim = "";
                } else {
                    if ("(".equals(strZzc)) {
                        int iZzg3 = zzerVar2.zzg();
                        int iZze = zzerVar2.zze();
                        int i4 = i3;
                        while (iZzg3 < iZze && i4 == 0) {
                            int i5 = iZzg3 + 1;
                            i4 = ((char) zzerVar2.zzi()[iZzg3]) == ')' ? 1 : i3;
                            iZzg3 = i5;
                        }
                        strTrim = zzerVar2.zzK((iZzg3 + i2) - zzerVar2.zzg(), StandardCharsets.UTF_8).trim();
                    } else {
                        strTrim = null;
                    }
                    if (!")".equals(zzc(zzerVar2, sb))) {
                        strTrim = null;
                    }
                }
            } else {
                strTrim = null;
            }
            if (strTrim == null || !"{".equals(zzc(zzerVar2, sb))) {
                break;
            }
            zzani zzaniVar = new zzani();
            if (!strTrim.isEmpty()) {
                int iIndexOf = strTrim.indexOf(91);
                if (iIndexOf != i2) {
                    Matcher matcher2 = zza.matcher(strTrim.substring(iIndexOf));
                    if (matcher2.matches()) {
                        String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        zzaniVar.zzd(strGroup2);
                    }
                    strTrim = strTrim.substring(i3, iIndexOf);
                }
                String str = zzfj.zza;
                String[] strArrSplit = strTrim.split("\\.", i2);
                String str2 = strArrSplit[i3];
                int iIndexOf2 = str2.indexOf(35);
                if (iIndexOf2 != i2) {
                    zzaniVar.zzb(str2.substring(i3, iIndexOf2));
                    zzaniVar.zza(str2.substring(iIndexOf2 + 1));
                } else {
                    zzaniVar.zzb(str2);
                }
                int length = strArrSplit.length;
                if (length > 1) {
                    zzaniVar.zzc((String[]) Arrays.copyOfRange(strArrSplit, 1, length));
                }
            }
            int i6 = i3;
            String strZzc2 = null;
            while (i6 == 0) {
                int iZzg4 = zzerVar2.zzg();
                strZzc2 = zzc(zzerVar2, sb);
                int i7 = (strZzc2 == null || "}".equals(strZzc2)) ? 1 : i3;
                if (i7 == 0) {
                    zzerVar2.zzh(iZzg4);
                    zzb(zzerVar2);
                    String strZzd = zzd(zzerVar2, sb);
                    if (!strZzd.isEmpty() && ":".equals(zzc(zzerVar2, sb))) {
                        zzb(zzerVar2);
                        StringBuilder sb2 = new StringBuilder();
                        int i8 = i3;
                        while (true) {
                            if (i8 != 0) {
                                string = sb2.toString();
                                break;
                            }
                            int iZzg5 = zzerVar2.zzg();
                            String strZzc3 = zzc(zzerVar2, sb);
                            if (strZzc3 == null) {
                                string = null;
                                break;
                            }
                            if ("}".equals(strZzc3) || ";".equals(strZzc3)) {
                                zzerVar2.zzh(iZzg5);
                                i8 = 1;
                            } else {
                                sb2.append(strZzc3);
                            }
                        }
                        if (string != null && !string.isEmpty()) {
                            int iZzg6 = zzerVar2.zzg();
                            String strZzc4 = zzc(zzerVar2, sb);
                            if (";".equals(strZzc4)) {
                                if ("color".equals(strZzd)) {
                                    zzaniVar.zzn(zzdp.zzb(string));
                                } else if ("background-color".equals(strZzd)) {
                                    zzaniVar.zzq(zzdp.zzb(string));
                                } else if ("ruby-position".equals(strZzd)) {
                                    if ("over".equals(string)) {
                                        zzaniVar.zzw(1);
                                    } else if ("under".equals(string)) {
                                        zzaniVar.zzw(2);
                                    }
                                } else if ("text-combine-upright".equals(strZzd)) {
                                    if ("all".equals(string)) {
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                    }
                                    zzaniVar.zzy(z2);
                                } else if ("text-decoration".equals(strZzd)) {
                                    if (TtmlNode.UNDERLINE.equals(string)) {
                                        zzaniVar.zzh(true);
                                    }
                                } else if ("font-family".equals(strZzd)) {
                                    zzaniVar.zzl(string);
                                } else if ("font-weight".equals(strZzd)) {
                                    if (TtmlNode.BOLD.equals(string)) {
                                        zzaniVar.zzi(true);
                                    }
                                } else if ("font-style".equals(strZzd)) {
                                    if (TtmlNode.ITALIC.equals(string)) {
                                        zzaniVar.zzj(true);
                                    }
                                } else if ("font-size".equals(strZzd)) {
                                    matcher = zzb.matcher(zzgpj.zza(string));
                                    if (matcher.matches()) {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode != 3592) {
                                                    b2 = -1;
                                                } else {
                                                    b2 = 0;
                                                }
                                            } else if (strGroup.equals("em")) {
                                                b2 = 1;
                                            } else {
                                                b2 = -1;
                                            }
                                        } else if (strGroup.equals("%")) {
                                            b2 = 2;
                                        } else {
                                            b2 = -1;
                                        }
                                        if (b2 != 0) {
                                            zzaniVar.zzt(1);
                                        } else if (b2 != 1) {
                                            zzaniVar.zzt(2);
                                        } else {
                                            if (b2 == 2) {
                                                throw new IllegalStateException();
                                            }
                                            zzaniVar.zzt(3);
                                        }
                                        String strGroup3 = matcher.group(1);
                                        strGroup3.getClass();
                                        zzaniVar.zzs(Float.parseFloat(strGroup3));
                                    } else {
                                        StringBuilder sb3 = new StringBuilder(string.length() + 22);
                                        sb3.append("Invalid font-size: '");
                                        sb3.append(string);
                                        sb3.append("'.");
                                        zzee.zzc("WebvttCssParser", sb3.toString());
                                    }
                                } else {
                                    continue;
                                }
                            } else if ("}".equals(strZzc4)) {
                                zzerVar2.zzh(iZzg6);
                                if ("color".equals(strZzd)) {
                                    zzaniVar.zzn(zzdp.zzb(string));
                                } else if ("background-color".equals(strZzd)) {
                                    zzaniVar.zzq(zzdp.zzb(string));
                                } else if ("ruby-position".equals(strZzd)) {
                                    if ("over".equals(string)) {
                                        zzaniVar.zzw(1);
                                    } else if ("under".equals(string)) {
                                        zzaniVar.zzw(2);
                                    }
                                } else if ("text-combine-upright".equals(strZzd)) {
                                    if ("all".equals(string) || string.startsWith("digits")) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    zzaniVar.zzy(z2);
                                } else if ("text-decoration".equals(strZzd)) {
                                    if (TtmlNode.UNDERLINE.equals(string)) {
                                        zzaniVar.zzh(true);
                                    }
                                } else if ("font-family".equals(strZzd)) {
                                    zzaniVar.zzl(string);
                                } else if ("font-weight".equals(strZzd)) {
                                    if (TtmlNode.BOLD.equals(string)) {
                                        zzaniVar.zzi(true);
                                    }
                                } else if ("font-style".equals(strZzd)) {
                                    if (TtmlNode.ITALIC.equals(string)) {
                                        zzaniVar.zzj(true);
                                    }
                                } else if ("font-size".equals(strZzd)) {
                                    matcher = zzb.matcher(zzgpj.zza(string));
                                    if (matcher.matches()) {
                                        StringBuilder sb4 = new StringBuilder(string.length() + 22);
                                        sb4.append("Invalid font-size: '");
                                        sb4.append(string);
                                        sb4.append("'.");
                                        zzee.zzc("WebvttCssParser", sb4.toString());
                                    } else {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode != 3592 && strGroup.equals("px")) {
                                                    b2 = 0;
                                                } else {
                                                    b2 = -1;
                                                }
                                            } else if (strGroup.equals("em")) {
                                                b2 = 1;
                                            } else {
                                                b2 = -1;
                                            }
                                        } else if (strGroup.equals("%")) {
                                            b2 = 2;
                                        } else {
                                            b2 = -1;
                                        }
                                        if (b2 != 0) {
                                            zzaniVar.zzt(1);
                                        } else if (b2 != 1) {
                                            zzaniVar.zzt(2);
                                        } else {
                                            if (b2 == 2) {
                                                throw new IllegalStateException();
                                            }
                                            zzaniVar.zzt(3);
                                        }
                                        String strGroup4 = matcher.group(1);
                                        strGroup4.getClass();
                                        zzaniVar.zzs(Float.parseFloat(strGroup4));
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i6 = i7;
                i3 = 0;
            }
            if ("}".equals(strZzc2)) {
                arrayList.add(zzaniVar);
            }
            i2 = -1;
            i3 = 0;
        }
        return arrayList;
    }
}
