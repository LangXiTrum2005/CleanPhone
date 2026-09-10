package com.smartdigimkt.p4;

import android.text.TextUtils;
import com.p004ironsource.d9;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f37531a = "rgb";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f37532b = "rgba";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f37533c = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern d = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f37534e = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    private static final Map<String, Integer> f;

    static {
        HashMap map = new HashMap();
        f = map;
        androidx.datastore.preferences.protobuf.a.v(-984833, map, "aliceblue", -332841, "antiquewhite");
        androidx.datastore.preferences.protobuf.a.B(map, "aqua", -16711681, -8388652, "aquamarine");
        androidx.datastore.preferences.protobuf.a.v(-983041, map, "azure", -657956, "beige");
        androidx.datastore.preferences.protobuf.a.v(-6972, map, "bisque", -16777216, "black");
        androidx.datastore.preferences.protobuf.a.v(-5171, map, "blanchedalmond", -16776961, "blue");
        androidx.datastore.preferences.protobuf.a.v(-7722014, map, "blueviolet", -5952982, "brown");
        androidx.datastore.preferences.protobuf.a.v(-2180985, map, "burlywood", -10510688, "cadetblue");
        androidx.datastore.preferences.protobuf.a.v(-8388864, map, "chartreuse", -2987746, "chocolate");
        androidx.datastore.preferences.protobuf.a.v(-32944, map, "coral", -10185235, "cornflowerblue");
        androidx.datastore.preferences.protobuf.a.v(-1828, map, "cornsilk", -2354116, "crimson");
        androidx.datastore.preferences.protobuf.a.B(map, "cyan", -16711681, -16777077, "darkblue");
        androidx.datastore.preferences.protobuf.a.v(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        androidx.datastore.preferences.protobuf.a.B(map, "darkgray", -5658199, -16751616, "darkgreen");
        androidx.datastore.preferences.protobuf.a.B(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        androidx.datastore.preferences.protobuf.a.v(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        androidx.datastore.preferences.protobuf.a.v(-29696, map, "darkorange", -6737204, "darkorchid");
        androidx.datastore.preferences.protobuf.a.v(-7667712, map, "darkred", -1468806, "darksalmon");
        androidx.datastore.preferences.protobuf.a.v(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        androidx.datastore.preferences.protobuf.a.B(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        androidx.datastore.preferences.protobuf.a.v(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        androidx.datastore.preferences.protobuf.a.B(map, "dodgerblue", -14774017, -5103070, "firebrick");
        androidx.datastore.preferences.protobuf.a.v(-1296, map, "floralwhite", -14513374, "forestgreen");
        androidx.datastore.preferences.protobuf.a.B(map, "fuchsia", -65281, -2302756, "gainsboro");
        androidx.datastore.preferences.protobuf.a.v(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        androidx.datastore.preferences.protobuf.a.v(-16744448, map, "green", -5374161, "greenyellow");
        androidx.datastore.preferences.protobuf.a.B(map, "grey", -8355712, -983056, "honeydew");
        androidx.datastore.preferences.protobuf.a.v(-38476, map, "hotpink", -3318692, "indianred");
        androidx.datastore.preferences.protobuf.a.v(-11861886, map, "indigo", -16, "ivory");
        androidx.datastore.preferences.protobuf.a.v(-989556, map, "khaki", -1644806, "lavender");
        androidx.datastore.preferences.protobuf.a.v(-3851, map, "lavenderblush", -8586240, "lawngreen");
        androidx.datastore.preferences.protobuf.a.v(-1331, map, "lemonchiffon", -5383962, "lightblue");
        androidx.datastore.preferences.protobuf.a.v(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        androidx.datastore.preferences.protobuf.a.v(-18751, map, "lightpink", -24454, "lightsalmon");
        androidx.datastore.preferences.protobuf.a.v(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        androidx.datastore.preferences.protobuf.a.B(map, "lightsteelblue", -5192482, -32, "lightyellow");
        androidx.datastore.preferences.protobuf.a.v(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        androidx.datastore.preferences.protobuf.a.v(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        androidx.datastore.preferences.protobuf.a.v(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        androidx.datastore.preferences.protobuf.a.v(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        androidx.datastore.preferences.protobuf.a.v(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        androidx.datastore.preferences.protobuf.a.v(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        androidx.datastore.preferences.protobuf.a.v(-15132304, map, "midnightblue", -655366, "mintcream");
        androidx.datastore.preferences.protobuf.a.v(-6943, map, "mistyrose", -6987, "moccasin");
        androidx.datastore.preferences.protobuf.a.v(-8531, map, "navajowhite", -16777088, "navy");
        androidx.datastore.preferences.protobuf.a.v(-133658, map, "oldlace", -8355840, "olive");
        androidx.datastore.preferences.protobuf.a.v(-9728477, map, "olivedrab", -23296, "orange");
        androidx.datastore.preferences.protobuf.a.v(-47872, map, "orangered", -2461482, "orchid");
        androidx.datastore.preferences.protobuf.a.v(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        androidx.datastore.preferences.protobuf.a.v(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        androidx.datastore.preferences.protobuf.a.v(-4139, map, "papayawhip", -9543, "peachpuff");
        androidx.datastore.preferences.protobuf.a.v(-3308225, map, "peru", -16181, "pink");
        androidx.datastore.preferences.protobuf.a.v(-2252579, map, "plum", -5185306, "powderblue");
        androidx.datastore.preferences.protobuf.a.v(-8388480, map, "purple", -10079335, "rebeccapurple");
        androidx.datastore.preferences.protobuf.a.v(-65536, map, "red", -4419697, "rosybrown");
        androidx.datastore.preferences.protobuf.a.v(-12490271, map, "royalblue", -7650029, "saddlebrown");
        androidx.datastore.preferences.protobuf.a.v(-360334, map, "salmon", -744352, "sandybrown");
        androidx.datastore.preferences.protobuf.a.v(-13726889, map, "seagreen", -2578, "seashell");
        androidx.datastore.preferences.protobuf.a.v(-6270419, map, "sienna", -4144960, "silver");
        androidx.datastore.preferences.protobuf.a.v(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        androidx.datastore.preferences.protobuf.a.B(map, "snow", -1286, -16711809, "springgreen");
        androidx.datastore.preferences.protobuf.a.v(-12156236, map, "steelblue", -2968436, "tan");
        androidx.datastore.preferences.protobuf.a.v(-16744320, map, "teal", -2572328, "thistle");
        androidx.datastore.preferences.protobuf.a.v(-40121, map, "tomato", 0, d9.h.T);
        androidx.datastore.preferences.protobuf.a.v(-12525360, map, "turquoise", -1146130, "violet");
        androidx.datastore.preferences.protobuf.a.v(-663885, map, "wheat", -1, "white");
        androidx.datastore.preferences.protobuf.a.v(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    private e() {
    }

    private static int a(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    public static int b(String str) {
        return a(str, false);
    }

    public static int a(String str) {
        return a(str, true);
    }

    private static int a(String str, boolean z2) {
        int i2;
        a.a(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i3 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i3;
            }
            if (strReplace.length() == 9) {
                return ((i3 & 255) << 24) | (i3 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith(f37532b)) {
            Matcher matcher = (z2 ? f37534e : d).matcher(strReplace);
            if (matcher.matches()) {
                if (z2) {
                    i2 = (int) (Float.parseFloat(matcher.group(4)) * 255.0f);
                } else {
                    i2 = Integer.parseInt(matcher.group(4), 10);
                }
                return a(i2, Integer.parseInt(matcher.group(1), 10), Integer.parseInt(matcher.group(2), 10), Integer.parseInt(matcher.group(3), 10));
            }
        } else if (strReplace.startsWith(f37531a)) {
            Matcher matcher2 = f37533c.matcher(strReplace);
            if (matcher2.matches()) {
                return a(Integer.parseInt(matcher2.group(1), 10), Integer.parseInt(matcher2.group(2), 10), Integer.parseInt(matcher2.group(3), 10));
            }
        } else {
            Integer num = f.get(f0.k(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    private static int a(int i2, int i3, int i4) {
        return a(255, i2, i3, i4);
    }
}
