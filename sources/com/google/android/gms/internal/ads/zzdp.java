package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import com.p004ironsource.d9;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdp {
    private static final Pattern zza = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern zzb = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern zzc = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        zzd = map;
        p005e.a.e(-984833, map, "aliceblue", -332841, "antiquewhite");
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        p005e.a.e(-983041, map, "azure", -657956, "beige");
        p005e.a.e(-6972, map, "bisque", -16777216, "black");
        p005e.a.e(-5171, map, "blanchedalmond", -16776961, "blue");
        p005e.a.e(-7722014, map, "blueviolet", -5952982, "brown");
        p005e.a.e(-2180985, map, "burlywood", -10510688, "cadetblue");
        p005e.a.e(-8388864, map, "chartreuse", -2987746, "chocolate");
        p005e.a.e(-32944, map, "coral", -10185235, "cornflowerblue");
        p005e.a.e(-1828, map, "cornsilk", -2354116, "crimson");
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        p005e.a.e(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        p005e.a.e(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        p005e.a.e(-29696, map, "darkorange", -6737204, "darkorchid");
        p005e.a.e(-7667712, map, "darkred", -1468806, "darksalmon");
        p005e.a.e(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        p005e.a.e(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        p005e.a.e(-1296, map, "floralwhite", -14513374, "forestgreen");
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        p005e.a.e(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        p005e.a.e(-16744448, map, "green", -5374161, "greenyellow");
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        p005e.a.e(-38476, map, "hotpink", -3318692, "indianred");
        p005e.a.e(-11861886, map, "indigo", -16, "ivory");
        p005e.a.e(-989556, map, "khaki", -1644806, "lavender");
        p005e.a.e(-3851, map, "lavenderblush", -8586240, "lawngreen");
        p005e.a.e(-1331, map, "lemonchiffon", -5383962, "lightblue");
        p005e.a.e(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        p005e.a.e(-18751, map, "lightpink", -24454, "lightsalmon");
        p005e.a.e(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        p005e.a.e(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        p005e.a.e(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        p005e.a.e(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        p005e.a.e(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        p005e.a.e(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        p005e.a.e(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        p005e.a.e(-15132304, map, "midnightblue", -655366, "mintcream");
        p005e.a.e(-6943, map, "mistyrose", -6987, "moccasin");
        p005e.a.e(-8531, map, "navajowhite", -16777088, "navy");
        p005e.a.e(-133658, map, "oldlace", -8355840, "olive");
        p005e.a.e(-9728477, map, "olivedrab", -23296, "orange");
        p005e.a.e(-47872, map, "orangered", -2461482, "orchid");
        p005e.a.e(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        p005e.a.e(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        p005e.a.e(-4139, map, "papayawhip", -9543, "peachpuff");
        p005e.a.e(-3308225, map, "peru", -16181, "pink");
        p005e.a.e(-2252579, map, "plum", -5185306, "powderblue");
        p005e.a.e(-8388480, map, "purple", -10079335, "rebeccapurple");
        p005e.a.e(-65536, map, "red", -4419697, "rosybrown");
        p005e.a.e(-12490271, map, "royalblue", -7650029, "saddlebrown");
        p005e.a.e(-360334, map, "salmon", -744352, "sandybrown");
        p005e.a.e(-13726889, map, "seagreen", -2578, "seashell");
        p005e.a.e(-6270419, map, "sienna", -4144960, "silver");
        p005e.a.e(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        p005e.a.e(-12156236, map, "steelblue", -2968436, "tan");
        p005e.a.e(-16744320, map, "teal", -2572328, "thistle");
        p005e.a.e(-40121, map, "tomato", 0, d9.h.T);
        p005e.a.e(-12525360, map, "turquoise", -1146130, "violet");
        p005e.a.e(-663885, map, "wheat", -1, "white");
        p005e.a.e(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int zza(String str) {
        return zzc(str, false);
    }

    public static int zzb(String str) {
        return zzc(str, true);
    }

    private static int zzc(String str, boolean z2) {
        int iC;
        zzgqa.zza(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i2 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i2;
            }
            if (strReplace.length() == 9) {
                return ((i2 & 255) << 24) | (i2 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z2 ? zzc : zzb).matcher(strReplace);
            if (matcher.matches()) {
                if (z2) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    iC = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    iC = androidx.datastore.preferences.protobuf.a.c(matcher, 4, 10);
                }
                return Color.argb(iC, androidx.datastore.preferences.protobuf.a.c(matcher, 1, 10), androidx.datastore.preferences.protobuf.a.c(matcher, 2, 10), androidx.datastore.preferences.protobuf.a.c(matcher, 3, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = zza.matcher(strReplace);
            if (matcher2.matches()) {
                int iC2 = androidx.datastore.preferences.protobuf.a.c(matcher2, 1, 10);
                int iC3 = androidx.datastore.preferences.protobuf.a.c(matcher2, 2, 10);
                String strGroup2 = matcher2.group(3);
                strGroup2.getClass();
                return Color.rgb(iC2, iC3, Integer.parseInt(strGroup2, 10));
            }
        } else {
            Integer num = (Integer) zzd.get(zzgpj.zza(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
