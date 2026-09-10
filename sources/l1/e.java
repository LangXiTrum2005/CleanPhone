package l1;

import android.graphics.Color;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.q1;
import com.ironsource.X3;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f44781a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f44782b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f44783c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f44784d;

    static {
        HashMap map = new HashMap();
        f44784d = map;
        d5.u.p(-984833, map, "aliceblue", -332841, "antiquewhite");
        d.q(map, "aqua", -16711681, -8388652, "aquamarine");
        d5.u.p(-983041, map, "azure", -657956, "beige");
        d5.u.p(-6972, map, "bisque", -16777216, "black");
        d5.u.p(-5171, map, "blanchedalmond", -16776961, "blue");
        d5.u.p(-7722014, map, "blueviolet", -5952982, "brown");
        d5.u.p(-2180985, map, "burlywood", -10510688, "cadetblue");
        d5.u.p(-8388864, map, "chartreuse", -2987746, "chocolate");
        d5.u.p(-32944, map, "coral", -10185235, "cornflowerblue");
        d5.u.p(-1828, map, "cornsilk", -2354116, "crimson");
        d.q(map, "cyan", -16711681, -16777077, "darkblue");
        d5.u.p(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        d.q(map, "darkgray", -5658199, -16751616, "darkgreen");
        d.q(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        d5.u.p(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        d5.u.p(-29696, map, "darkorange", -6737204, "darkorchid");
        d5.u.p(-7667712, map, "darkred", -1468806, "darksalmon");
        d5.u.p(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        d.q(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        d5.u.p(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        d.q(map, "dodgerblue", -14774017, -5103070, "firebrick");
        d5.u.p(-1296, map, "floralwhite", -14513374, "forestgreen");
        d.q(map, "fuchsia", -65281, -2302756, "gainsboro");
        d5.u.p(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        d5.u.p(-16744448, map, "green", -5374161, "greenyellow");
        d.q(map, "grey", -8355712, -983056, "honeydew");
        d5.u.p(-38476, map, "hotpink", -3318692, "indianred");
        d5.u.p(-11861886, map, "indigo", -16, "ivory");
        d5.u.p(-989556, map, "khaki", -1644806, "lavender");
        d5.u.p(-3851, map, "lavenderblush", -8586240, "lawngreen");
        d5.u.p(-1331, map, "lemonchiffon", -5383962, "lightblue");
        d5.u.p(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        d5.u.p(-18751, map, "lightpink", -24454, "lightsalmon");
        d5.u.p(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        d.q(map, "lightsteelblue", -5192482, -32, "lightyellow");
        d5.u.p(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        d5.u.p(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        d5.u.p(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        d5.u.p(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        d5.u.p(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        d5.u.p(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        d5.u.p(-15132304, map, "midnightblue", -655366, "mintcream");
        d5.u.p(-6943, map, "mistyrose", -6987, "moccasin");
        d5.u.p(-8531, map, "navajowhite", -16777088, "navy");
        d5.u.p(-133658, map, "oldlace", -8355840, "olive");
        d5.u.p(-9728477, map, "olivedrab", -23296, "orange");
        d5.u.p(-47872, map, "orangered", -2461482, "orchid");
        d5.u.p(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        d5.u.p(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        d5.u.p(-4139, map, "papayawhip", -9543, "peachpuff");
        d5.u.p(-3308225, map, "peru", -16181, "pink");
        d5.u.p(-2252579, map, "plum", -5185306, "powderblue");
        d5.u.p(-8388480, map, "purple", -10079335, "rebeccapurple");
        d5.u.p(-65536, map, "red", -4419697, "rosybrown");
        d5.u.p(-12490271, map, "royalblue", -7650029, "saddlebrown");
        d5.u.p(-360334, map, "salmon", -744352, "sandybrown");
        d5.u.p(-13726889, map, "seagreen", -2578, "seashell");
        d5.u.p(-6270419, map, "sienna", -4144960, "silver");
        d5.u.p(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        d.q(map, "snow", -1286, -16711809, "springgreen");
        d5.u.p(-12156236, map, "steelblue", -2968436, "tan");
        d5.u.p(-16744320, map, "teal", -2572328, "thistle");
        d5.u.p(-40121, map, "tomato", 0, X3.i.T);
        d5.u.p(-12525360, map, "turquoise", -1146130, "violet");
        d5.u.p(-663885, map, "wheat", -1, "white");
        d5.u.p(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z10) {
        int i10;
        go.k.i(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i11 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i11;
            }
            if (strReplace.length() == 9) {
                return ((i11 & 255) << 24) | (i11 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z10 ? f44783c : f44782b).matcher(strReplace);
            if (matcher.matches()) {
                if (z10) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i10 = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i10 = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i12 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i13 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i10, i12, i13, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f44781a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i14 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i15 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i14, i15, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f44784d.get(q1.F(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
