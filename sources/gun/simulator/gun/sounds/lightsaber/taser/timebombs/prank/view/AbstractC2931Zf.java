package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2931Zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f4084a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    public static final HashMap d;

    static {
        HashMap map = new HashMap();
        d = map;
        AbstractC3950lJ.y(-984833, map, "aliceblue", -332841, "antiquewhite");
        DM.z(map, "aqua", -16711681, -8388652, "aquamarine");
        AbstractC3950lJ.y(-983041, map, "azure", -657956, "beige");
        AbstractC3950lJ.y(-6972, map, "bisque", ViewCompat.MEASURED_STATE_MASK, "black");
        AbstractC3950lJ.y(-5171, map, "blanchedalmond", -16776961, "blue");
        AbstractC3950lJ.y(-7722014, map, "blueviolet", -5952982, "brown");
        AbstractC3950lJ.y(-2180985, map, "burlywood", -10510688, "cadetblue");
        AbstractC3950lJ.y(-8388864, map, "chartreuse", -2987746, "chocolate");
        AbstractC3950lJ.y(-32944, map, "coral", -10185235, "cornflowerblue");
        AbstractC3950lJ.y(-1828, map, "cornsilk", -2354116, "crimson");
        DM.z(map, "cyan", -16711681, -16777077, "darkblue");
        AbstractC3950lJ.y(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        DM.z(map, "darkgray", -5658199, -16751616, "darkgreen");
        DM.z(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        AbstractC3950lJ.y(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        AbstractC3950lJ.y(-29696, map, "darkorange", -6737204, "darkorchid");
        AbstractC3950lJ.y(-7667712, map, "darkred", -1468806, "darksalmon");
        AbstractC3950lJ.y(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        DM.z(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        AbstractC3950lJ.y(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        DM.z(map, "dodgerblue", -14774017, -5103070, "firebrick");
        AbstractC3950lJ.y(-1296, map, "floralwhite", -14513374, "forestgreen");
        DM.z(map, "fuchsia", -65281, -2302756, "gainsboro");
        AbstractC3950lJ.y(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        AbstractC3950lJ.y(-16744448, map, "green", -5374161, "greenyellow");
        DM.z(map, "grey", -8355712, -983056, "honeydew");
        AbstractC3950lJ.y(-38476, map, "hotpink", -3318692, "indianred");
        AbstractC3950lJ.y(-11861886, map, "indigo", -16, "ivory");
        AbstractC3950lJ.y(-989556, map, "khaki", -1644806, "lavender");
        AbstractC3950lJ.y(-3851, map, "lavenderblush", -8586240, "lawngreen");
        AbstractC3950lJ.y(-1331, map, "lemonchiffon", -5383962, "lightblue");
        AbstractC3950lJ.y(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        AbstractC3950lJ.y(-18751, map, "lightpink", -24454, "lightsalmon");
        AbstractC3950lJ.y(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        DM.z(map, "lightsteelblue", -5192482, -32, "lightyellow");
        AbstractC3950lJ.y(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        AbstractC3950lJ.y(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        AbstractC3950lJ.y(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        AbstractC3950lJ.y(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        AbstractC3950lJ.y(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        AbstractC3950lJ.y(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        AbstractC3950lJ.y(-15132304, map, "midnightblue", -655366, "mintcream");
        AbstractC3950lJ.y(-6943, map, "mistyrose", -6987, "moccasin");
        AbstractC3950lJ.y(-8531, map, "navajowhite", -16777088, "navy");
        AbstractC3950lJ.y(-133658, map, "oldlace", -8355840, "olive");
        AbstractC3950lJ.y(-9728477, map, "olivedrab", -23296, "orange");
        AbstractC3950lJ.y(-47872, map, "orangered", -2461482, "orchid");
        AbstractC3950lJ.y(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        AbstractC3950lJ.y(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        AbstractC3950lJ.y(-4139, map, "papayawhip", -9543, "peachpuff");
        AbstractC3950lJ.y(-3308225, map, "peru", -16181, "pink");
        AbstractC3950lJ.y(-2252579, map, "plum", -5185306, "powderblue");
        AbstractC3950lJ.y(-8388480, map, "purple", -10079335, "rebeccapurple");
        AbstractC3950lJ.y(SupportMenu.CATEGORY_MASK, map, "red", -4419697, "rosybrown");
        AbstractC3950lJ.y(-12490271, map, "royalblue", -7650029, "saddlebrown");
        AbstractC3950lJ.y(-360334, map, "salmon", -744352, "sandybrown");
        AbstractC3950lJ.y(-13726889, map, "seagreen", -2578, "seashell");
        AbstractC3950lJ.y(-6270419, map, "sienna", -4144960, "silver");
        AbstractC3950lJ.y(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        DM.z(map, "snow", -1286, -16711809, "springgreen");
        AbstractC3950lJ.y(-12156236, map, "steelblue", -2968436, "tan");
        AbstractC3950lJ.y(-16744320, map, "teal", -2572328, "thistle");
        AbstractC3950lJ.y(-40121, map, "tomato", 0, "transparent");
        AbstractC3950lJ.y(-12525360, map, "turquoise", -1146130, "violet");
        AbstractC3950lJ.y(-663885, map, "wheat", -1, "white");
        AbstractC3950lJ.y(-657931, map, "whitesmoke", InputDeviceCompat.SOURCE_ANY, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z) {
        int i;
        FW.h(!TextUtils.isEmpty(str));
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
            Matcher matcher = (z ? c : b).matcher(strReplace);
            if (matcher.matches()) {
                if (z) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i3 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i4 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i, i3, i4, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f4084a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i5 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i6 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i5, i6, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) d.get(FW.h0(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
