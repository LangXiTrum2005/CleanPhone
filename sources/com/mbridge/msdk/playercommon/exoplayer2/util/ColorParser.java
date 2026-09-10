package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.text.TextUtils;
import com.ironsource.X3;
import d5.u;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ColorParser {
    private static final Map<String, Integer> COLOR_MAP;
    private static final String RGB = "rgb";
    private static final String RGBA = "rgba";
    private static final Pattern RGB_PATTERN = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern RGBA_PATTERN_INT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern RGBA_PATTERN_FLOAT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    static {
        HashMap map = new HashMap();
        COLOR_MAP = map;
        u.p(-984833, map, "aliceblue", -332841, "antiquewhite");
        d.q(map, "aqua", -16711681, -8388652, "aquamarine");
        u.p(-983041, map, "azure", -657956, "beige");
        u.p(-6972, map, "bisque", -16777216, "black");
        u.p(-5171, map, "blanchedalmond", -16776961, "blue");
        u.p(-7722014, map, "blueviolet", -5952982, "brown");
        u.p(-2180985, map, "burlywood", -10510688, "cadetblue");
        u.p(-8388864, map, "chartreuse", -2987746, "chocolate");
        u.p(-32944, map, "coral", -10185235, "cornflowerblue");
        u.p(-1828, map, "cornsilk", -2354116, "crimson");
        d.q(map, "cyan", -16711681, -16777077, "darkblue");
        u.p(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        d.q(map, "darkgray", -5658199, -16751616, "darkgreen");
        d.q(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        u.p(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        u.p(-29696, map, "darkorange", -6737204, "darkorchid");
        u.p(-7667712, map, "darkred", -1468806, "darksalmon");
        u.p(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        d.q(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        u.p(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        d.q(map, "dodgerblue", -14774017, -5103070, "firebrick");
        u.p(-1296, map, "floralwhite", -14513374, "forestgreen");
        d.q(map, "fuchsia", -65281, -2302756, "gainsboro");
        u.p(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        u.p(-16744448, map, "green", -5374161, "greenyellow");
        d.q(map, "grey", -8355712, -983056, "honeydew");
        u.p(-38476, map, "hotpink", -3318692, "indianred");
        u.p(-11861886, map, "indigo", -16, "ivory");
        u.p(-989556, map, "khaki", -1644806, "lavender");
        u.p(-3851, map, "lavenderblush", -8586240, "lawngreen");
        u.p(-1331, map, "lemonchiffon", -5383962, "lightblue");
        u.p(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        u.p(-18751, map, "lightpink", -24454, "lightsalmon");
        u.p(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        d.q(map, "lightsteelblue", -5192482, -32, "lightyellow");
        u.p(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        u.p(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        u.p(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        u.p(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        u.p(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        u.p(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        u.p(-15132304, map, "midnightblue", -655366, "mintcream");
        u.p(-6943, map, "mistyrose", -6987, "moccasin");
        u.p(-8531, map, "navajowhite", -16777088, "navy");
        u.p(-133658, map, "oldlace", -8355840, "olive");
        u.p(-9728477, map, "olivedrab", -23296, "orange");
        u.p(-47872, map, "orangered", -2461482, "orchid");
        u.p(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        u.p(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        u.p(-4139, map, "papayawhip", -9543, "peachpuff");
        u.p(-3308225, map, "peru", -16181, "pink");
        u.p(-2252579, map, "plum", -5185306, "powderblue");
        u.p(-8388480, map, "purple", -10079335, "rebeccapurple");
        u.p(-65536, map, "red", -4419697, "rosybrown");
        u.p(-12490271, map, "royalblue", -7650029, "saddlebrown");
        u.p(-360334, map, "salmon", -744352, "sandybrown");
        u.p(-13726889, map, "seagreen", -2578, "seashell");
        u.p(-6270419, map, "sienna", -4144960, "silver");
        u.p(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        d.q(map, "snow", -1286, -16711809, "springgreen");
        u.p(-12156236, map, "steelblue", -2968436, "tan");
        u.p(-16744320, map, "teal", -2572328, "thistle");
        u.p(-40121, map, "tomato", 0, X3.i.T);
        u.p(-12525360, map, "turquoise", -1146130, "violet");
        u.p(-663885, map, "wheat", -1, "white");
        u.p(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    private ColorParser() {
    }

    private static int argb(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static int parseColorInternal(String str, boolean z10) {
        Assertions.checkArgument(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i10 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i10;
            }
            if (strReplace.length() == 9) {
                return ((i10 & 255) << 24) | (i10 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith(RGBA)) {
            Matcher matcher = (z10 ? RGBA_PATTERN_FLOAT_ALPHA : RGBA_PATTERN_INT_ALPHA).matcher(strReplace);
            if (matcher.matches()) {
                return argb(z10 ? (int) (Float.parseFloat(matcher.group(4)) * 255.0f) : Integer.parseInt(matcher.group(4), 10), Integer.parseInt(matcher.group(1), 10), Integer.parseInt(matcher.group(2), 10), Integer.parseInt(matcher.group(3), 10));
            }
        } else if (strReplace.startsWith(RGB)) {
            Matcher matcher2 = RGB_PATTERN.matcher(strReplace);
            if (matcher2.matches()) {
                return rgb(Integer.parseInt(matcher2.group(1), 10), Integer.parseInt(matcher2.group(2), 10), Integer.parseInt(matcher2.group(3), 10));
            }
        } else {
            Integer num = COLOR_MAP.get(Util.toLowerInvariant(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    public static int parseCssColor(String str) {
        return parseColorInternal(str, true);
    }

    public static int parseTtmlColor(String str) {
        return parseColorInternal(str, false);
    }

    private static int rgb(int i10, int i11, int i12) {
        return argb(255, i10, i11, i12);
    }
}
