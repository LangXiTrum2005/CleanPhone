package com.google.android.gms.internal.ads;

import android.text.Layout;
import com.applovin.impl.Z;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.o1.b;
import com.smartdigimkt.x.d;
import com.thinkup.core.common.n.mo;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class zzamy implements zzaly {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzamw zzh = new zzamw(30.0f, 1, 1);

    public zzamy() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.zzi = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    private static String[] zzc(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzfj.zza;
        return strTrim.split("\\s+", -1);
    }

    /* JADX WARN: Code duplicated, block: B:194:0x0346  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v87 */
    /* JADX WARN: Type inference failed for: r7v88 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private static zzanb zzd(XmlPullParser xmlPullParser, zzanb zzanbVar) {
        ?? r7;
        Matcher matcher;
        byte b2;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z2 = false;
        zzanb zzanbVarZze = zzanbVar;
        int i2 = 0;
        while (i2 < attributeCount) {
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            String attributeName = xmlPullParser.getAttributeName(i2);
            ?? r11 = -1;
             = -1;
             = -1;
             = -1;
             = -1;
            ?? r12 = -1;
             = -1;
             = -1;
            ?? r13 = -1;
             = -1;
             = -1;
             = -1;
             = -1;
             = -1;
             = -1;
            ?? r14 = -1;
            r11 = -1;
            r11 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_FONT_STYLE) ? -1 : 6;
                    break;
                case -1289044182:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_EXTENT) ? -1 : 16;
                    break;
                case -1224696685:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_FONT_FAMILY) ? -1 : 3;
                    break;
                case -1065511464:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN) ? -1 : 7;
                    break;
                case -1008619738:
                    r7 = !attributeName.equals("origin") ? -1 : 15;
                    break;
                case -879295043:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION) ? -1 : 12;
                    break;
                case -734428249:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT) ? -1 : 5;
                    break;
                case 3355:
                    r7 = !attributeName.equals("id") ? -1 : z2;
                    break;
                case 3511770:
                    r7 = !attributeName.equals("ruby") ? -1 : 10;
                    break;
                case 94842723:
                    r7 = !attributeName.equals("color") ? -1 : 2;
                    break;
                case 109403361:
                    r7 = !attributeName.equals("shear") ? -1 : 14;
                    break;
                case 110138194:
                    r7 = !attributeName.equals("textCombine") ? -1 : 9;
                    break;
                case 365601008:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_FONT_SIZE) ? -1 : 4;
                    break;
                case 921125321:
                    r7 = !attributeName.equals("textEmphasis") ? -1 : 13;
                    break;
                case 1115953443:
                    r7 = !attributeName.equals("rubyPosition") ? -1 : 11;
                    break;
                case 1287124693:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR) ? -1 : 1;
                    break;
                case 1754920356:
                    r7 = !attributeName.equals("multiRowAlign") ? -1 : 8;
                    break;
                default:
                    r7 = -1;
                    break;
            }
            switch (r7) {
                case 0:
                    if ("style".equals(xmlPullParser.getName())) {
                        zzanbVarZze = zze(zzanbVarZze);
                        zzanbVarZze.zzs(attributeValue);
                    }
                    break;
                case 1:
                    zzanbVarZze = zze(zzanbVarZze);
                    try {
                        zzanbVarZze.zzn(zzdp.zza(attributeValue));
                    } catch (IllegalArgumentException unused) {
                        Z.D(attributeValue, "Failed parsing background value: ", "TtmlParser");
                    }
                    break;
                case 2:
                    zzanbVarZze = zze(zzanbVarZze);
                    try {
                        zzanbVarZze.zzk(zzdp.zza(attributeValue));
                    } catch (IllegalArgumentException unused2) {
                        Z.D(attributeValue, "Failed parsing color value: ", "TtmlParser");
                    }
                    break;
                case 3:
                    zzanbVarZze = zze(zzanbVarZze);
                    zzanbVarZze.zzi(attributeValue);
                    break;
                case 4:
                    try {
                        zzanbVarZze = zze(zzanbVarZze);
                        String str = zzfj.zza;
                        String[] strArrSplit = attributeValue.split("\\s+", -1);
                        int length = strArrSplit.length;
                        if (length == 1) {
                            matcher = zze.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 41);
                                sb.append("Invalid number of entries for fontSize: ");
                                sb.append(length);
                                sb.append(mo.ono);
                                throw new zzalu(sb.toString());
                            }
                            matcher = zze.matcher(strArrSplit[1]);
                            zzee.zzc("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            StringBuilder sb2 = new StringBuilder(attributeValue.length() + 36);
                            sb2.append("Invalid expression for fontSize: '");
                            sb2.append(attributeValue);
                            sb2.append("'.");
                            throw new zzalu(sb2.toString());
                        }
                        String strGroup = matcher.group(3);
                        if (strGroup == null) {
                            throw null;
                        }
                        int iHashCode = strGroup.hashCode();
                        if (iHashCode != 37) {
                            if (iHashCode != 3240) {
                                if (iHashCode == 3592 && strGroup.equals("px")) {
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
                        if (b2 == 0) {
                            zzanbVarZze.zzH(1);
                        } else if (b2 == 1) {
                            zzanbVarZze.zzH(2);
                        } else {
                            if (b2 != 2) {
                                StringBuilder sb3 = new StringBuilder(strGroup.length() + 30);
                                sb3.append("Invalid unit for fontSize: '");
                                sb3.append(strGroup);
                                sb3.append("'.");
                                throw new zzalu(sb3.toString());
                            }
                            zzanbVarZze.zzH(3);
                        }
                        String strGroup2 = matcher.group(1);
                        if (strGroup2 == null) {
                            throw null;
                        }
                        zzanbVarZze.zzG(Float.parseFloat(strGroup2));
                    } catch (zzalu unused3) {
                        Z.D(attributeValue, "Failed parsing fontSize value: ", "TtmlParser");
                    }
                    break;
                case 5:
                    zzanbVarZze = zze(zzanbVarZze);
                    zzanbVarZze.zzf(TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    zzanbVarZze = zze(zzanbVarZze);
                    zzanbVarZze.zzg(TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    zzanbVarZze = zze(zzanbVarZze);
                    zzanbVarZze.zzz(zzf(attributeValue));
                    break;
                case 8:
                    zzanbVarZze = zze(zzanbVarZze);
                    zzanbVarZze.zzB(zzf(attributeValue));
                    break;
                case 9:
                    String strZza = zzgpj.zza(attributeValue);
                    int iHashCode2 = strZza.hashCode();
                    if (iHashCode2 != 96673) {
                        if (iHashCode2 == 3387192 && strZza.equals("none")) {
                            r11 = z2;
                        }
                    } else if (strZza.equals("all")) {
                        r11 = 1;
                    }
                    if (r11 == 0) {
                        zzanbVarZze = zze(zzanbVarZze);
                        zzanbVarZze.zzD(z2);
                    } else if (r11 == 1) {
                        zzanbVarZze = zze(zzanbVarZze);
                        zzanbVarZze.zzD(true);
                    }
                    break;
                case 10:
                    String strZza2 = zzgpj.zza(attributeValue);
                    switch (strZza2.hashCode()) {
                        case -618561360:
                            if (strZza2.equals("baseContainer")) {
                                r14 = 2;
                            }
                            break;
                        case -410956671:
                            if (strZza2.equals("container")) {
                                r14 = z2;
                            }
                            break;
                        case -250518009:
                            if (strZza2.equals("delimiter")) {
                                r14 = 5;
                            }
                            break;
                        case -136074796:
                            if (strZza2.equals("textContainer")) {
                                r14 = 4;
                            }
                            break;
                        case 3016401:
                            if (strZza2.equals("base")) {
                                r14 = 1;
                            }
                            break;
                        case 3556653:
                            if (strZza2.equals("text")) {
                                r14 = 3;
                            }
                            break;
                    }
                    if (r14 == 0) {
                        zzanbVarZze = zze(zzanbVarZze);
                        zzanbVarZze.zzu(1);
                    } else if (r14 == 1 || r14 == 2) {
                        zzanbVarZze = zze(zzanbVarZze);
                        zzanbVarZze.zzu(2);
                    } else if (r14 == 3 || r14 == 4) {
                        zzanbVarZze = zze(zzanbVarZze);
                        zzanbVarZze.zzu(3);
                    } else if (r14 == 5) {
                        zzanbVarZze = zze(zzanbVarZze);
                        zzanbVarZze.zzu(4);
                    }
                    break;
                case 11:
                    String strZza3 = zzgpj.zza(attributeValue);
                    int iHashCode3 = strZza3.hashCode();
                    if (iHashCode3 != -1392885889) {
                        if (iHashCode3 == 92734940 && strZza3.equals("after")) {
                            r13 = 1;
                        }
                    } else if (strZza3.equals("before")) {
                        r13 = z2;
                    }
                    if (r13 == 0) {
                        zzanbVarZze = zze(zzanbVarZze);
                        zzanbVarZze.zzw(1);
                    } else if (r13 == 1) {
                        zzanbVarZze = zze(zzanbVarZze);
                        zzanbVarZze.zzw(2);
                    }
                    break;
                case 12:
                    String strZza4 = zzgpj.zza(attributeValue);
                    switch (strZza4.hashCode()) {
                        case -1461280213:
                            if (strZza4.equals(TtmlNode.NO_UNDERLINE)) {
                                r12 = 3;
                            }
                            break;
                        case -1026963764:
                            if (strZza4.equals(TtmlNode.UNDERLINE)) {
                                r12 = 2;
                            }
                            break;
                        case 913457136:
                            if (strZza4.equals(TtmlNode.NO_LINETHROUGH)) {
                                r12 = 1;
                            }
                            break;
                        case 1679736913:
                            if (strZza4.equals(TtmlNode.LINETHROUGH)) {
                                r12 = z2;
                            }
                            break;
                    }
                    if (r12 == 0) {
                        zzanbVarZze = zze(zzanbVarZze);
                        zzanbVarZze.zzc(true);
                    } else if (r12 == 1) {
                        zzanbVarZze = zze(zzanbVarZze);
                        zzanbVarZze.zzc(z2);
                    } else if (r12 == 2) {
                        zzanbVarZze = zze(zzanbVarZze);
                        zzanbVarZze.zze(true);
                    } else if (r12 == 3) {
                        zzanbVarZze = zze(zzanbVarZze);
                        zzanbVarZze.zze(z2);
                    }
                    break;
                case 13:
                    zzanbVarZze = zze(zzanbVarZze);
                    zzanbVarZze.zzF(zzamu.zza(attributeValue));
                    break;
                case 14:
                    zzanb zzanbVarZze2 = zze(zzanbVarZze);
                    Matcher matcher2 = zza.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String strGroup3 = matcher2.group(1);
                            if (strGroup3 == null) {
                                throw null;
                            }
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup3)));
                        } catch (NumberFormatException e2) {
                            zzee.zzd("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e2);
                        }
                    } else {
                        Z.D(attributeValue, "Invalid value for shear: ", "TtmlParser");
                    }
                    zzanbVarZze2.zzp(fMin);
                    zzanbVarZze = zzanbVarZze2;
                    break;
                case 15:
                    zzanbVarZze = zze(zzanbVarZze);
                    zzanbVarZze.zzK(attributeValue);
                    break;
                case 16:
                    zzanbVarZze = zze(zzanbVarZze);
                    zzanbVarZze.zzM(attributeValue);
                    break;
            }
            i2++;
            z2 = false;
        }
        return zzanbVarZze;
    }

    private static zzanb zze(zzanb zzanbVar) {
        return zzanbVar == null ? new zzanb() : zzanbVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    private static Layout.Alignment zzf(String str) {
        byte b2;
        switch (zzgpj.zza(str)) {
            case "center":
                b2 = 4;
                break;
            case "end":
                b2 = 3;
                break;
            case "left":
                b2 = 0;
                break;
            case "right":
                b2 = 2;
                break;
            case "start":
                b2 = 1;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0 || b2 == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (b2 == 2 || b2 == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (b2 != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f2  */
    private static long zzg(String str, zzamw zzamwVar) throws zzalu {
        double d;
        double d2;
        Matcher matcher = zzc.matcher(str);
        byte b2 = 2;
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j = Long.parseLong(strGroup) * b.f37307P;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j2 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d3 = j + j2;
            double d4 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d5 = 0.0d;
            double d6 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d7 = d3 + d4;
            String strGroup5 = matcher.group(5);
            double d8 = strGroup5 != null ? Long.parseLong(strGroup5) / zzamwVar.zza : 0.0d;
            double d9 = d7 + d6;
            String strGroup6 = matcher.group(6);
            if (strGroup6 != null) {
                d5 = (Long.parseLong(strGroup6) / ((double) zzamwVar.zzb)) / ((double) zzamwVar.zza);
            }
            return (long) ((d9 + d8 + d5) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            throw new zzalu("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d10 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        int iHashCode = strGroup8.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode != 115) {
                            if (iHashCode == 116 && strGroup8.equals("t")) {
                                b2 = 5;
                            } else {
                                b2 = -1;
                            }
                        } else if (!strGroup8.equals("s")) {
                            b2 = -1;
                        }
                    } else if (strGroup8.equals("ms")) {
                        b2 = 3;
                    } else {
                        b2 = -1;
                    }
                } else if (strGroup8.equals("m")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (strGroup8.equals(h.f36614b)) {
                b2 = 0;
            } else {
                b2 = -1;
            }
        } else if (strGroup8.equals(f.j)) {
            b2 = 4;
        } else {
            b2 = -1;
        }
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 == 3) {
                    d2 = 1000.0d;
                } else if (b2 == 4) {
                    d2 = zzamwVar.zza;
                } else if (b2 == 5) {
                    d2 = zzamwVar.zzc;
                }
                d10 /= d2;
            } else {
                d = 60.0d;
            }
            return (long) (d10 * 1000000.0d);
        }
        d = 3600.0d;
        d10 *= d;
        return (long) (d10 * 1000000.0d);
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(byte[] bArr, int i2, int i3, zzalx zzalxVar, zzdr zzdrVar) {
        zzals.zza(zzb(bArr, i2, i3), zzalxVar, zzdrVar);
    }

    /* JADX WARN: Code duplicated, block: B:151:0x0315 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TRY_LEAVE, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #6, #8, #12, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x032b  */
    /* JADX WARN: Code duplicated, block: B:156:0x0334 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, NumberFormatException -> 0x034c, TryCatch #14 {NumberFormatException -> 0x034c, blocks: (B:154:0x032e, B:156:0x0334, B:158:0x0341, B:159:0x034a, B:160:0x034b), top: B:439:0x032e, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0341 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, NumberFormatException -> 0x034c, TryCatch #14 {NumberFormatException -> 0x034c, blocks: (B:154:0x032e, B:156:0x0334, B:158:0x0341, B:159:0x034a, B:160:0x034b), top: B:439:0x032e, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0357 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #6, #8, #12, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x035f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x0361 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TRY_LEAVE, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #6, #8, #12, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0369  */
    /* JADX WARN: Code duplicated, block: B:171:0x0370 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, NumberFormatException -> 0x038f, TryCatch #13 {NumberFormatException -> 0x038f, blocks: (B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e), top: B:438:0x036a, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x037b A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, NumberFormatException -> 0x038f, TryCatch #13 {NumberFormatException -> 0x038f, blocks: (B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e), top: B:438:0x036a, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0397 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #6, #8, #12, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x039f  */
    /* JADX WARN: Code duplicated, block: B:187:0x03c2 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TRY_LEAVE, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #6, #8, #12, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:192:0x03db A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, NumberFormatException -> 0x03f5, TryCatch #8 {NumberFormatException -> 0x03f5, blocks: (B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:195:0x03f3, B:196:0x03f4), top: B:432:0x03d5, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x03e8 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, NumberFormatException -> 0x03f5, TryCatch #8 {NumberFormatException -> 0x03f5, blocks: (B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:195:0x03f3, B:196:0x03f4), top: B:432:0x03d5, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x0402 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #6, #8, #12, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x0408 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:201:0x040a A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TRY_LEAVE, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #6, #8, #12, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:203:0x0417  */
    /* JADX WARN: Code duplicated, block: B:206:0x041e A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, NumberFormatException -> 0x043f, TryCatch #6 {NumberFormatException -> 0x043f, blocks: (B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e), top: B:429:0x0418, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:208:0x0429 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, NumberFormatException -> 0x043f, TryCatch #6 {NumberFormatException -> 0x043f, blocks: (B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e), top: B:429:0x0418, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:212:0x044c A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #6, #8, #12, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x0459  */
    /* JADX WARN: Code duplicated, block: B:216:0x0465 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TRY_LEAVE, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #6, #8, #12, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:219:0x0472  */
    /* JADX WARN: Code duplicated, block: B:225:0x0482  */
    /* JADX WARN: Code duplicated, block: B:227:0x048a  */
    /* JADX WARN: Code duplicated, block: B:228:0x048d  */
    /* JADX WARN: Code duplicated, block: B:230:0x0490  */
    /* JADX WARN: Code duplicated, block: B:232:0x0493  */
    /* JADX WARN: Code duplicated, block: B:233:0x0498  */
    /* JADX WARN: Code duplicated, block: B:234:0x049f  */
    /* JADX WARN: Code duplicated, block: B:238:0x04b3 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TRY_LEAVE, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #6, #8, #12, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:241:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:243:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:249:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:251:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:252:0x04de  */
    /* JADX WARN: Code duplicated, block: B:254:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:255:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:261:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:263:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:285:0x0565 A[LOOP:1: B:121:0x027a->B:285:0x0565, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:296:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:379:0x06d8 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, zzalu -> 0x06dc, TRY_LEAVE, TryCatch #4 {zzalu -> 0x06dc, blocks: (B:377:0x06d3, B:379:0x06d8), top: B:425:0x06d3 }] */
    /* JADX WARN: Code duplicated, block: B:446:0x034b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x034a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x038e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x038d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:0x03f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:0x03f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x043e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x043d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x055e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v70, types: [com.google.android.gms.internal.ads.zzamz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v17 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v21 */
    /* JADX WARN: Type inference failed for: r22v22 */
    /* JADX WARN: Type inference failed for: r22v23 */
    /* JADX WARN: Type inference failed for: r22v24 */
    /* JADX WARN: Type inference failed for: r22v25 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r51v1, types: [com.google.android.gms.internal.ads.zzanb, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.google.android.gms.internal.ads.zzamx] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    public final zzalt zzb(byte[] bArr, int i2, int i3) {
        String str;
        String str2;
        HashMap map;
        ArrayDeque arrayDeque;
        int i4;
        ?? r22;
        ?? zzamxVar;
        zzamw zzamwVar;
        zzamv zzamvVar;
        zzamv zzamvVar2;
        long j;
        zzamv zzamvVarZzb;
        long j2;
        Object obj;
        byte b2;
        String str3;
        String str4;
        String strZzc;
        String str5;
        String strZzL;
        String str6;
        HashMap map2;
        String str7;
        float f;
        float f2;
        ?? zzamzVar;
        String strZzc2;
        float f3;
        float f4;
        String strZzc3;
        float f5;
        int i5;
        String strZzc4;
        int i6;
        String strZza;
        int iHashCode;
        byte b3;
        String strZza2;
        int iHashCode2;
        byte b4;
        Matcher matcher;
        Matcher matcher2;
        String strGroup;
        int i7;
        String strGroup2;
        String strGroup3;
        float f6;
        String strGroup4;
        String strZzc5;
        zzanb zzanbVar;
        Matcher matcher3;
        Matcher matcher4;
        String strGroup5;
        int i8;
        String strGroup6;
        String strGroup7;
        float f7;
        String strGroup8;
        zzanb zzanbVar2;
        String str8;
        float f8;
        boolean z2;
        int i9 = 1;
        String str9 = "";
        String str10 = "http://www.w3.org/ns/ttml#parameter";
        String str11 = "Ignoring unsupported tag: ";
        try {
            XmlPullParser xmlPullParserNewPullParser = this.zzi.newPullParser();
            HashMap map3 = new HashMap();
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            map4.put("", new zzamz("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            Object obj2 = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), null);
            ArrayDeque arrayDeque2 = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            zzamw zzamwVar2 = zzh;
            zzanc zzancVar = null;
            ?? r23 = 0;
            zzamw zzamwVar3 = zzamwVar2;
            int i10 = 15;
            int i11 = 0;
            while (eventType != i9) {
                zzamv zzamvVar3 = (zzamv) arrayDeque2.peek();
                if (i11 == 0) {
                    ?? r51 = obj2;
                    String name = xmlPullParserNewPullParser.getName();
                    int i12 = i9;
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            String attributeValue = xmlPullParserNewPullParser.getAttributeValue(str10, "frameRate");
                            int i13 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            str = str9;
                            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str10, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                String str12 = zzfj.zza;
                                String[] strArrSplit = attributeValue2.split(" ", -1);
                                zzgqa.zzb(strArrSplit.length == 2 ? i12 : 0, "frameRateMultiplier doesn't have 2 parts");
                                f8 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[i12]);
                            } else {
                                f8 = 1.0f;
                            }
                            int i14 = zzamwVar2.zzb;
                            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str10, "subFrameRate");
                            if (attributeValue3 != null) {
                                i14 = Integer.parseInt(attributeValue3);
                            }
                            int i15 = zzamwVar2.zzc;
                            float f9 = f8;
                            String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str10, "tickRate");
                            if (attributeValue4 != null) {
                                i15 = Integer.parseInt(attributeValue4);
                            }
                            zzamw zzamwVar4 = new zzamw(i13 * f9, i14, i15);
                            String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str10, "cellResolution");
                            if (attributeValue5 == null) {
                                str2 = str10;
                                zzamwVar3 = zzamwVar4;
                                zzamwVar2 = zzamwVar2;
                                i10 = 15;
                            } else {
                                Matcher matcher5 = zzg.matcher(attributeValue5);
                                if (matcher5.matches()) {
                                    str2 = str10;
                                    try {
                                        String strGroup9 = matcher5.group(i12);
                                        if (strGroup9 == null) {
                                            throw r51;
                                        }
                                        int i16 = Integer.parseInt(strGroup9);
                                        zzamwVar3 = zzamwVar4;
                                        try {
                                            String strGroup10 = matcher5.group(2);
                                            if (strGroup10 == null) {
                                                throw r51;
                                            }
                                            int i17 = Integer.parseInt(strGroup10);
                                            if (i16 == 0) {
                                                z2 = false;
                                            } else if (i17 != 0) {
                                                z2 = true;
                                            } else {
                                                i17 = 0;
                                                z2 = false;
                                            }
                                            try {
                                                zzgqa.zzg(z2, "Invalid cell resolution %s %s", i16, i17);
                                                i10 = i17;
                                            } catch (NumberFormatException unused) {
                                                zzee.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                                i10 = 15;
                                            }
                                        } catch (NumberFormatException unused2) {
                                            zzamwVar2 = zzamwVar2;
                                        }
                                    } catch (NumberFormatException unused3) {
                                        zzamwVar3 = zzamwVar4;
                                    }
                                    zzamwVar2 = zzamwVar2;
                                    zzee.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    i10 = 15;
                                } else {
                                    zzee.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    str2 = str10;
                                    zzamwVar3 = zzamwVar4;
                                    zzamwVar2 = zzamwVar2;
                                    i10 = 15;
                                }
                            }
                            String strZzc6 = zzfq.zzc(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                            if (strZzc6 == null) {
                                zzamxVar = r51;
                            } else {
                                Matcher matcher6 = zzf.matcher(strZzc6);
                                if (matcher6.matches()) {
                                    try {
                                        String strGroup11 = matcher6.group(1);
                                        if (strGroup11 == null) {
                                            throw r51;
                                        }
                                        int i18 = Integer.parseInt(strGroup11);
                                        String strGroup12 = matcher6.group(2);
                                        if (strGroup12 == null) {
                                            throw r51;
                                        }
                                        zzamxVar = new zzamx(i18, Integer.parseInt(strGroup12));
                                    } catch (NumberFormatException unused4) {
                                        zzee.zzc("TtmlParser", "Ignoring malformed tts extent: ".concat(strZzc6));
                                        zzamxVar = r51;
                                    }
                                } else {
                                    zzee.zzc("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strZzc6));
                                }
                                zzamxVar = r51;
                            }
                            xmlPullParserNewPullParser.next();
                            eventType = xmlPullParserNewPullParser.getEventType();
                            map4 = map;
                            arrayDeque2 = arrayDeque;
                            i9 = i4;
                            str9 = str;
                            str10 = str2;
                            zzamwVar2 = zzamwVar2;
                            str11 = str11;
                            obj2 = null;
                            r23 = r23;
                        } else {
                            str = str9;
                            str2 = str10;
                            arrayDeque2 = arrayDeque2;
                            zzamwVar2 = zzamwVar2;
                            zzamxVar = r23;
                        }
                        zzamw zzamwVar5 = zzamwVar3;
                        ?? r7 = zzamxVar;
                        i10 = i10;
                        boolean zEquals = name.equals(TtmlNode.TAG_TT);
                        String str13 = d.c.k;
                        String str14 = TtmlNode.TAG_METADATA;
                        String str15 = TtmlNode.TAG_REGION;
                        String str16 = TtmlNode.TAG_HEAD;
                        zzamwVar3 = zzamwVar5;
                        if (zEquals || name.equals(TtmlNode.TAG_HEAD) || name.equals("body") || name.equals(TtmlNode.TAG_DIV) || name.equals("p") || name.equals(TtmlNode.TAG_SPAN) || name.equals(TtmlNode.TAG_BR) || name.equals("style") || name.equals(TtmlNode.TAG_STYLING) || name.equals("layout") || name.equals(TtmlNode.TAG_REGION) || name.equals(TtmlNode.TAG_METADATA) || name.equals(d.c.k) || name.equals("data") || name.equals("information")) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                while (true) {
                                    xmlPullParserNewPullParser.next();
                                    if (zzfq.zzb(xmlPullParserNewPullParser, "style")) {
                                        String strZzc7 = zzfq.zzc(xmlPullParserNewPullParser, "style");
                                        zzanb zzanbVarZzd = zzd(xmlPullParserNewPullParser, new zzanb());
                                        if (strZzc7 != null) {
                                            String[] strArrZzc = zzc(strZzc7);
                                            int length = strArrZzc.length;
                                            int i19 = 0;
                                            while (i19 < length) {
                                                int i20 = i19;
                                                zzanbVarZzd.zzr((zzanb) map3.get(strArrZzc[i20]));
                                                i19 = i20 + 1;
                                            }
                                        }
                                        String strZzt = zzanbVarZzd.zzt();
                                        if (strZzt != null) {
                                            map3.put(strZzt, zzanbVarZzd);
                                        }
                                        map = map4;
                                        str3 = str14;
                                        str4 = str15;
                                    } else {
                                        str16 = str16;
                                        str11 = str11;
                                        if (zzfq.zzb(xmlPullParserNewPullParser, str15)) {
                                            str4 = str15;
                                            HashMap map6 = map5;
                                            String strZzc8 = zzfq.zzc(xmlPullParserNewPullParser, "id");
                                            if (strZzc8 == null) {
                                                zzamzVar = r51;
                                                str6 = str13;
                                                map2 = map4;
                                                str7 = str14;
                                            } else {
                                                String strZzc9 = zzfq.zzc(xmlPullParserNewPullParser, "origin");
                                                if (strZzc9 == null) {
                                                    str5 = strZzc9;
                                                    String strZzc10 = zzfq.zzc(xmlPullParserNewPullParser, "style");
                                                    if (strZzc10 != null && (zzanbVar2 = (zzanb) map3.get(strZzc10)) != null) {
                                                        strZzL = zzanbVar2.zzL();
                                                    }
                                                    if (strZzL != null) {
                                                        str6 = str13;
                                                        matcher3 = zzb.matcher(strZzL);
                                                        str7 = str14;
                                                        matcher4 = zzf.matcher(strZzL);
                                                        if (matcher3.matches()) {
                                                            map2 = map4;
                                                            try {
                                                                strGroup7 = matcher3.group(1);
                                                                if (strGroup7 != null) {
                                                                    throw r51;
                                                                }
                                                                f7 = Float.parseFloat(strGroup7) / 100.0f;
                                                                strGroup8 = matcher3.group(2);
                                                                if (strGroup8 != null) {
                                                                    throw r51;
                                                                }
                                                                f = Float.parseFloat(strGroup8) / 100.0f;
                                                                f2 = f7;
                                                            } catch (NumberFormatException unused5) {
                                                                zzee.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(strZzL));
                                                            }
                                                        } else {
                                                            map2 = map4;
                                                            if (matcher4.matches()) {
                                                                zzee.zzc("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZzL));
                                                            } else if (r7 == 0) {
                                                                zzee.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZzL));
                                                            } else {
                                                                try {
                                                                    strGroup5 = matcher4.group(1);
                                                                    if (strGroup5 != null) {
                                                                        throw r51;
                                                                    }
                                                                    i8 = Integer.parseInt(strGroup5);
                                                                    strGroup6 = matcher4.group(2);
                                                                    if (strGroup6 != null) {
                                                                        throw r51;
                                                                    }
                                                                    int i21 = Integer.parseInt(strGroup6);
                                                                    float f10 = i8 / r7.zza;
                                                                    f = i21 / r7.zzb;
                                                                    f2 = f10;
                                                                } catch (NumberFormatException unused6) {
                                                                    zzee.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(strZzL));
                                                                }
                                                            }
                                                            zzamzVar = r51;
                                                        }
                                                        xmlPullParserNewPullParser.next();
                                                        eventType = xmlPullParserNewPullParser.getEventType();
                                                        map4 = map;
                                                        arrayDeque2 = arrayDeque;
                                                        i9 = i4;
                                                        str9 = str;
                                                        str10 = str2;
                                                        zzamwVar2 = zzamwVar2;
                                                        str11 = str11;
                                                        obj2 = null;
                                                        r23 = r23;
                                                    } else {
                                                        str6 = str13;
                                                        map2 = map4;
                                                        str7 = str14;
                                                        f = 0.0f;
                                                        f2 = 0.0f;
                                                    }
                                                    strZzc2 = zzfq.zzc(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                                    if (strZzc2 == null && (strZzc5 = zzfq.zzc(xmlPullParserNewPullParser, "style")) != null && (zzanbVar = (zzanb) map3.get(strZzc5)) != null) {
                                                        strZzc2 = zzanbVar.zzN();
                                                    }
                                                    if (strZzc2 != null) {
                                                        matcher = zzb.matcher(strZzc2);
                                                        matcher2 = zzf.matcher(strZzc2);
                                                        if (matcher.matches()) {
                                                            try {
                                                                strGroup3 = matcher.group(1);
                                                                if (strGroup3 != null) {
                                                                    throw r51;
                                                                }
                                                                f6 = Float.parseFloat(strGroup3) / 100.0f;
                                                                strGroup4 = matcher.group(2);
                                                                if (strGroup4 != null) {
                                                                    throw r51;
                                                                }
                                                                f4 = Float.parseFloat(strGroup4) / 100.0f;
                                                                f3 = f6;
                                                            } catch (NumberFormatException unused7) {
                                                                zzee.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strZzL)));
                                                                zzamzVar = r51;
                                                            }
                                                        } else {
                                                            if (matcher2.matches()) {
                                                                zzee.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strZzL)));
                                                            } else if (r7 == 0) {
                                                                zzee.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strZzL)));
                                                            } else {
                                                                try {
                                                                    strGroup = matcher2.group(1);
                                                                    if (strGroup != null) {
                                                                        throw r51;
                                                                    }
                                                                    i7 = Integer.parseInt(strGroup);
                                                                    strGroup2 = matcher2.group(2);
                                                                    if (strGroup2 != null) {
                                                                        throw r51;
                                                                    }
                                                                    int i22 = Integer.parseInt(strGroup2);
                                                                    float f11 = i7 / r7.zza;
                                                                    f4 = i22 / r7.zzb;
                                                                    f3 = f11;
                                                                } catch (NumberFormatException unused8) {
                                                                    zzee.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strZzL)));
                                                                    zzamzVar = r51;
                                                                }
                                                            }
                                                            zzamzVar = r51;
                                                        }
                                                    } else {
                                                        f3 = 1.0f;
                                                        f4 = 1.0f;
                                                    }
                                                    strZzc3 = zzfq.zzc(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                    if (strZzc3 != null) {
                                                        strZza2 = zzgpj.zza(strZzc3);
                                                        iHashCode2 = strZza2.hashCode();
                                                        if (iHashCode2 != -1364013995) {
                                                            if (iHashCode2 != 92734940 && strZza2.equals("after")) {
                                                                b4 = 1;
                                                            } else {
                                                                b4 = -1;
                                                            }
                                                        } else if (strZza2.equals(TtmlNode.CENTER)) {
                                                            b4 = 0;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        if (b4 != 0) {
                                                            f5 = f + (f4 / 2.0f);
                                                            i5 = 1;
                                                        } else if (b4 != 1) {
                                                            f5 = f;
                                                            i5 = 0;
                                                        } else {
                                                            f5 = f + f4;
                                                            i5 = 2;
                                                        }
                                                    } else {
                                                        f5 = f;
                                                        i5 = 0;
                                                    }
                                                    float f12 = 1.0f / i10;
                                                    strZzc4 = zzfq.zzc(xmlPullParserNewPullParser, "writingMode");
                                                    if (strZzc4 != null) {
                                                        strZza = zzgpj.zza(strZzc4);
                                                        iHashCode = strZza.hashCode();
                                                        if (iHashCode != 3694) {
                                                            if (iHashCode != 3553396) {
                                                                if (iHashCode != 3553576 && strZza.equals("tbrl")) {
                                                                    b3 = 2;
                                                                } else {
                                                                    b3 = -1;
                                                                }
                                                            } else if (strZza.equals("tblr")) {
                                                                b3 = 1;
                                                            } else {
                                                                b3 = -1;
                                                            }
                                                        } else if (strZza.equals("tb")) {
                                                            b3 = 0;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        if (b3 != 0 || b3 == 1) {
                                                            i6 = 2;
                                                        } else if (b3 != 2) {
                                                            i6 = Integer.MIN_VALUE;
                                                        } else {
                                                            i6 = 1;
                                                        }
                                                    } else {
                                                        i6 = Integer.MIN_VALUE;
                                                    }
                                                    zzamzVar = new zzamz(strZzc8, f2, f5, 0, i5, f3, f4, 1, f12, i6);
                                                } else {
                                                    str5 = strZzc9;
                                                }
                                                strZzL = str5;
                                                if (strZzL != null) {
                                                    str6 = str13;
                                                    matcher3 = zzb.matcher(strZzL);
                                                    str7 = str14;
                                                    matcher4 = zzf.matcher(strZzL);
                                                    if (matcher3.matches()) {
                                                        map2 = map4;
                                                        strGroup7 = matcher3.group(1);
                                                        if (strGroup7 != null) {
                                                            throw r51;
                                                        }
                                                        f7 = Float.parseFloat(strGroup7) / 100.0f;
                                                        strGroup8 = matcher3.group(2);
                                                        if (strGroup8 != null) {
                                                            throw r51;
                                                        }
                                                        f = Float.parseFloat(strGroup8) / 100.0f;
                                                        f2 = f7;
                                                    } else {
                                                        map2 = map4;
                                                        if (matcher4.matches()) {
                                                            zzee.zzc("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZzL));
                                                        } else if (r7 == 0) {
                                                            zzee.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZzL));
                                                        } else {
                                                            strGroup5 = matcher4.group(1);
                                                            if (strGroup5 != null) {
                                                                throw r51;
                                                            }
                                                            i8 = Integer.parseInt(strGroup5);
                                                            strGroup6 = matcher4.group(2);
                                                            if (strGroup6 != null) {
                                                                throw r51;
                                                            }
                                                            int i23 = Integer.parseInt(strGroup6);
                                                            float f13 = i8 / r7.zza;
                                                            f = i23 / r7.zzb;
                                                            f2 = f13;
                                                        }
                                                        zzamzVar = r51;
                                                    }
                                                    xmlPullParserNewPullParser.next();
                                                    eventType = xmlPullParserNewPullParser.getEventType();
                                                    map4 = map;
                                                    arrayDeque2 = arrayDeque;
                                                    i9 = i4;
                                                    str9 = str;
                                                    str10 = str2;
                                                    zzamwVar2 = zzamwVar2;
                                                    str11 = str11;
                                                    obj2 = null;
                                                    r23 = r23;
                                                } else {
                                                    str6 = str13;
                                                    map2 = map4;
                                                    str7 = str14;
                                                    f = 0.0f;
                                                    f2 = 0.0f;
                                                }
                                                strZzc2 = zzfq.zzc(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                                if (strZzc2 == null) {
                                                    strZzc2 = zzanbVar.zzN();
                                                }
                                                if (strZzc2 != null) {
                                                    matcher = zzb.matcher(strZzc2);
                                                    matcher2 = zzf.matcher(strZzc2);
                                                    if (matcher.matches()) {
                                                        strGroup3 = matcher.group(1);
                                                        if (strGroup3 != null) {
                                                            throw r51;
                                                        }
                                                        f6 = Float.parseFloat(strGroup3) / 100.0f;
                                                        strGroup4 = matcher.group(2);
                                                        if (strGroup4 != null) {
                                                            throw r51;
                                                        }
                                                        f4 = Float.parseFloat(strGroup4) / 100.0f;
                                                        f3 = f6;
                                                    } else {
                                                        if (matcher2.matches()) {
                                                            zzee.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strZzL)));
                                                        } else if (r7 == 0) {
                                                            zzee.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strZzL)));
                                                        } else {
                                                            strGroup = matcher2.group(1);
                                                            if (strGroup != null) {
                                                                throw r51;
                                                            }
                                                            i7 = Integer.parseInt(strGroup);
                                                            strGroup2 = matcher2.group(2);
                                                            if (strGroup2 != null) {
                                                                throw r51;
                                                            }
                                                            int i24 = Integer.parseInt(strGroup2);
                                                            float f14 = i7 / r7.zza;
                                                            f4 = i24 / r7.zzb;
                                                            f3 = f14;
                                                        }
                                                        zzamzVar = r51;
                                                    }
                                                } else {
                                                    f3 = 1.0f;
                                                    f4 = 1.0f;
                                                }
                                                strZzc3 = zzfq.zzc(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                if (strZzc3 != null) {
                                                    strZza2 = zzgpj.zza(strZzc3);
                                                    iHashCode2 = strZza2.hashCode();
                                                    if (iHashCode2 != -1364013995) {
                                                        if (iHashCode2 != 92734940) {
                                                            b4 = -1;
                                                        } else {
                                                            b4 = 1;
                                                        }
                                                    } else if (strZza2.equals(TtmlNode.CENTER)) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    if (b4 != 0) {
                                                        f5 = f + (f4 / 2.0f);
                                                        i5 = 1;
                                                    } else if (b4 != 1) {
                                                        f5 = f;
                                                        i5 = 0;
                                                    } else {
                                                        f5 = f + f4;
                                                        i5 = 2;
                                                    }
                                                } else {
                                                    f5 = f;
                                                    i5 = 0;
                                                }
                                                float f15 = 1.0f / i10;
                                                strZzc4 = zzfq.zzc(xmlPullParserNewPullParser, "writingMode");
                                                if (strZzc4 != null) {
                                                    strZza = zzgpj.zza(strZzc4);
                                                    iHashCode = strZza.hashCode();
                                                    if (iHashCode != 3694) {
                                                        if (iHashCode != 3553396) {
                                                            if (iHashCode != 3553576) {
                                                                b3 = -1;
                                                            } else {
                                                                b3 = 2;
                                                            }
                                                        } else if (strZza.equals("tblr")) {
                                                            b3 = 1;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                    } else if (strZza.equals("tb")) {
                                                        b3 = 0;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    if (b3 != 0) {
                                                        i6 = 2;
                                                    } else {
                                                        i6 = 2;
                                                    }
                                                } else {
                                                    i6 = Integer.MIN_VALUE;
                                                }
                                                zzamzVar = new zzamz(strZzc8, f2, f5, 0, i5, f3, f4, 1, f15, i6);
                                            }
                                            if (zzamzVar != 0) {
                                                map = map2;
                                                map.put(zzamzVar.zza, zzamzVar);
                                            } else {
                                                map = map2;
                                            }
                                            str8 = str16;
                                            map5 = map6;
                                            str13 = str6;
                                            str3 = str7;
                                        } else {
                                            String str17 = str13;
                                            map = map4;
                                            HashMap map7 = map5;
                                            str3 = str14;
                                            str4 = str15;
                                            if (zzfq.zzb(xmlPullParserNewPullParser, str3)) {
                                                while (true) {
                                                    xmlPullParserNewPullParser.next();
                                                    str13 = str17;
                                                    if (!zzfq.zzb(xmlPullParserNewPullParser, str13) || (strZzc = zzfq.zzc(xmlPullParserNewPullParser, "id")) == null) {
                                                        map5 = map7;
                                                    } else {
                                                        map5 = map7;
                                                        map5.put(strZzc, xmlPullParserNewPullParser.nextText());
                                                    }
                                                    if (!zzfq.zza(xmlPullParserNewPullParser, str3)) {
                                                        str17 = str13;
                                                        map7 = map5;
                                                    }
                                                }
                                            } else {
                                                map5 = map7;
                                                str13 = str17;
                                            }
                                        }
                                        if (zzfq.zza(xmlPullParserNewPullParser, str8)) {
                                            zzamwVar = zzamwVar3;
                                            arrayDeque = arrayDeque2;
                                        } else {
                                            str14 = str3;
                                            map4 = map;
                                            str15 = str4;
                                            str11 = str11;
                                            str16 = str8;
                                        }
                                    }
                                    str8 = str16;
                                    if (zzfq.zza(xmlPullParserNewPullParser, str8)) {
                                        zzamwVar = zzamwVar3;
                                        arrayDeque = arrayDeque2;
                                    } else {
                                        str14 = str3;
                                        map4 = map;
                                        str15 = str4;
                                        str11 = str11;
                                        str16 = str8;
                                    }
                                }
                            } else {
                                str11 = str11;
                                map = map4;
                                Object obj3 = TtmlNode.TAG_REGION;
                                try {
                                    int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                    zzanb zzanbVarZzd2 = zzd(xmlPullParserNewPullParser, r51);
                                    int i25 = 0;
                                    String str18 = str;
                                    long jZzg = -9223372036854775807L;
                                    long jZzg2 = -9223372036854775807L;
                                    long jZzg3 = -9223372036854775807L;
                                    String[] strArr = null;
                                    String strSubstring = null;
                                    while (i25 < attributeCount) {
                                        try {
                                            String attributeName = xmlPullParserNewPullParser.getAttributeName(i25);
                                            String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(i25);
                                            switch (attributeName.hashCode()) {
                                                case -934795532:
                                                    obj = obj3;
                                                    b2 = !attributeName.equals(obj) ? (byte) -1 : (byte) 4;
                                                    break;
                                                case 99841:
                                                    if (!attributeName.equals("dur")) {
                                                        obj = obj3;
                                                    } else {
                                                        obj = obj3;
                                                        b2 = 2;
                                                    }
                                                    break;
                                                case 100571:
                                                    if (!attributeName.equals(TtmlNode.END)) {
                                                        obj = obj3;
                                                    } else {
                                                        obj = obj3;
                                                        b2 = 1;
                                                    }
                                                    break;
                                                case 93616297:
                                                    if (!attributeName.equals("begin")) {
                                                        obj = obj3;
                                                    } else {
                                                        b2 = 0;
                                                        obj = obj3;
                                                    }
                                                    break;
                                                case 109780401:
                                                    if (!attributeName.equals("style")) {
                                                        obj = obj3;
                                                    } else {
                                                        obj = obj3;
                                                        b2 = 3;
                                                    }
                                                    break;
                                                case 1292595405:
                                                    if (!attributeName.equals("backgroundImage")) {
                                                        obj = obj3;
                                                    } else {
                                                        obj = obj3;
                                                        b2 = 5;
                                                    }
                                                    break;
                                                default:
                                                    obj = obj3;
                                                    break;
                                            }
                                            if (b2 == 0) {
                                                zzamwVar = zzamwVar3;
                                                jZzg2 = zzg(attributeValue6, zzamwVar);
                                            } else if (b2 == 1) {
                                                zzamwVar = zzamwVar3;
                                                jZzg = zzg(attributeValue6, zzamwVar);
                                            } else if (b2 != 2) {
                                                if (b2 == 3) {
                                                    String[] strArrZzc2 = zzc(attributeValue6);
                                                    if (strArrZzc2.length > 0) {
                                                        strArr = strArrZzc2;
                                                    }
                                                } else if (b2 != 4) {
                                                    if (b2 == 5) {
                                                        try {
                                                            if (attributeValue6.startsWith("#")) {
                                                                strSubstring = attributeValue6.substring(1);
                                                            }
                                                        } catch (zzalu e2) {
                                                            e = e2;
                                                            zzamwVar = zzamwVar3;
                                                            arrayDeque = arrayDeque2;
                                                            zzee.zzd("TtmlParser", "Suppressing parser error", e);
                                                            zzamwVar3 = zzamwVar;
                                                            i11 = 1;
                                                            r22 = r7;
                                                            r22 = r23;
                                                            i4 = 1;
                                                            r23 = r22;
                                                            xmlPullParserNewPullParser.next();
                                                            eventType = xmlPullParserNewPullParser.getEventType();
                                                            map4 = map;
                                                            arrayDeque2 = arrayDeque;
                                                            i9 = i4;
                                                            str9 = str;
                                                            str10 = str2;
                                                            zzamwVar2 = zzamwVar2;
                                                            str11 = str11;
                                                            obj2 = null;
                                                            r23 = r23;
                                                        }
                                                    }
                                                } else if (map.containsKey(attributeValue6)) {
                                                    str18 = attributeValue6;
                                                }
                                                zzamwVar = zzamwVar3;
                                            } else {
                                                zzamwVar = zzamwVar3;
                                                jZzg3 = zzg(attributeValue6, zzamwVar);
                                            }
                                            try {
                                                i25++;
                                                obj3 = obj;
                                                zzamwVar3 = zzamwVar;
                                            } catch (zzalu e3) {
                                                e = e3;
                                                arrayDeque = arrayDeque2;
                                                zzee.zzd("TtmlParser", "Suppressing parser error", e);
                                                zzamwVar3 = zzamwVar;
                                                i11 = 1;
                                                r22 = r7;
                                                r22 = r23;
                                                i4 = 1;
                                                r23 = r22;
                                                xmlPullParserNewPullParser.next();
                                                eventType = xmlPullParserNewPullParser.getEventType();
                                                map4 = map;
                                                arrayDeque2 = arrayDeque;
                                                i9 = i4;
                                                str9 = str;
                                                str10 = str2;
                                                zzamwVar2 = zzamwVar2;
                                                str11 = str11;
                                                obj2 = null;
                                                r23 = r23;
                                            }
                                        } catch (zzalu e4) {
                                            e = e4;
                                            zzamwVar = zzamwVar3;
                                        }
                                    }
                                    zzamwVar = zzamwVar3;
                                    if (zzamvVar3 != null) {
                                        zzamvVar = zzamvVar3;
                                        long j3 = zzamvVar.zzd;
                                        if (j3 == -9223372036854775807L) {
                                            zzamvVar2 = zzamvVar;
                                        } else {
                                            jZzg2 = jZzg2 != -9223372036854775807L ? jZzg2 + j3 : -9223372036854775807L;
                                            if (jZzg != -9223372036854775807L) {
                                                jZzg += j3;
                                                zzamvVar2 = zzamvVar;
                                            } else {
                                                zzamvVar2 = zzamvVar;
                                                jZzg = -9223372036854775807L;
                                            }
                                        }
                                    } else {
                                        zzamvVar = zzamvVar3;
                                        zzamvVar2 = null;
                                    }
                                    try {
                                        if (jZzg == -9223372036854775807L) {
                                            if (jZzg3 != -9223372036854775807L) {
                                                j2 = jZzg2 + jZzg3;
                                            } else {
                                                if (zzamvVar2 != null) {
                                                    j2 = zzamvVar2.zze;
                                                    if (j2 != -9223372036854775807L) {
                                                    }
                                                    zzamvVarZzb = zzamv.zzb(xmlPullParserNewPullParser.getName(), jZzg2, j, zzanbVarZzd2, strArr, str18, strSubstring, zzamvVar2);
                                                    arrayDeque = arrayDeque2;
                                                    arrayDeque.push(zzamvVarZzb);
                                                    if (zzamvVar != null) {
                                                        zzamvVar.zzd(zzamvVarZzb);
                                                    }
                                                }
                                                j = -9223372036854775807L;
                                                zzamvVarZzb = zzamv.zzb(xmlPullParserNewPullParser.getName(), jZzg2, j, zzanbVarZzd2, strArr, str18, strSubstring, zzamvVar2);
                                                arrayDeque = arrayDeque2;
                                                arrayDeque.push(zzamvVarZzb);
                                                if (zzamvVar != null) {
                                                    zzamvVar.zzd(zzamvVarZzb);
                                                }
                                            }
                                            j = j2;
                                        } else {
                                            j = jZzg;
                                        }
                                        arrayDeque.push(zzamvVarZzb);
                                        if (zzamvVar != null) {
                                            zzamvVar.zzd(zzamvVarZzb);
                                        }
                                    } catch (zzalu e5) {
                                        e = e5;
                                        zzee.zzd("TtmlParser", "Suppressing parser error", e);
                                        zzamwVar3 = zzamwVar;
                                        i11 = 1;
                                        r22 = r7;
                                    }
                                    zzamvVarZzb = zzamv.zzb(xmlPullParserNewPullParser.getName(), jZzg2, j, zzanbVarZzd2, strArr, str18, strSubstring, zzamvVar2);
                                    arrayDeque = arrayDeque2;
                                } catch (zzalu e6) {
                                    e = e6;
                                    zzamwVar = zzamwVar3;
                                    arrayDeque = arrayDeque2;
                                }
                            }
                            zzamwVar3 = zzamwVar;
                            r22 = r7;
                            i10 = i10;
                        } else {
                            String name2 = xmlPullParserNewPullParser.getName();
                            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 26);
                            sb.append(str11);
                            sb.append(name2);
                            zzee.zzb("TtmlParser", sb.toString());
                            str11 = str11;
                            map = map4;
                            arrayDeque = arrayDeque2;
                        }
                        i11 = 1;
                        r22 = r7;
                    } else {
                        str = str9;
                        str2 = str10;
                        str11 = str11;
                        map = map4;
                        arrayDeque = arrayDeque2;
                        zzamwVar2 = zzamwVar2;
                        if (eventType == 4) {
                            if (zzamvVar3 == null) {
                                throw null;
                            }
                            zzamvVar3.zzd(zzamv.zza(xmlPullParserNewPullParser.getText()));
                            r22 = r23;
                        } else if (eventType == 3) {
                            if (xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT)) {
                                zzamv zzamvVar4 = (zzamv) arrayDeque.peek();
                                if (zzamvVar4 == null) {
                                    r22 = r23;
                                    throw null;
                                }
                                r22 = r23;
                                zzancVar = new zzanc(zzamvVar4, map3, map, map5);
                            }
                            r22 = r23;
                            arrayDeque.pop();
                            r22 = r23;
                        }
                    }
                    r22 = r23;
                    i4 = 1;
                    r23 = r22;
                } else {
                    str = str9;
                    str2 = str10;
                    str11 = str11;
                    map = map4;
                    arrayDeque = arrayDeque2;
                    zzamwVar2 = zzamwVar2;
                    if (eventType == 2) {
                        i4 = 1;
                        i11++;
                        r23 = r23;
                    } else {
                        i4 = 1;
                        if (eventType == 3) {
                            i11--;
                        }
                    }
                    xmlPullParserNewPullParser.next();
                    eventType = xmlPullParserNewPullParser.getEventType();
                    map4 = map;
                    arrayDeque2 = arrayDeque;
                    i9 = i4;
                    str9 = str;
                    str10 = str2;
                    zzamwVar2 = zzamwVar2;
                    str11 = str11;
                    obj2 = null;
                    r23 = r23;
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                map4 = map;
                arrayDeque2 = arrayDeque;
                i9 = i4;
                str9 = str;
                str10 = str2;
                zzamwVar2 = zzamwVar2;
                str11 = str11;
                obj2 = null;
                r23 = r23;
            }
            if (zzancVar != null) {
                return zzancVar;
            }
            throw null;
        } catch (IOException e7) {
            throw new IllegalStateException("Unexpected error when reading input.", e7);
        } catch (XmlPullParserException e8) {
            throw new IllegalStateException("Unable to decode source", e8);
        }
    }
}
