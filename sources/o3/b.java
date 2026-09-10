package o3;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f47081a = Pattern.compile("\\{([^}]*)\\}");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f47082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f47083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f47084d;

    static {
        String str = y.f44830a;
        Locale locale = Locale.US;
        f47082b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f47083c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f47084d = Pattern.compile("\\\\an(\\d+)");
    }

    public static PointF a(String str) {
        String strGroup;
        String strGroup2;
        Matcher matcher = f47082b.matcher(str);
        Matcher matcher2 = f47083c.matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        if (zFind) {
            if (zFind2) {
                l1.a.j("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            strGroup = matcher.group(1);
            strGroup2 = matcher.group(2);
        } else {
            if (!zFind2) {
                return null;
            }
            strGroup = matcher2.group(1);
            strGroup2 = matcher2.group(2);
        }
        strGroup.getClass();
        float f10 = Float.parseFloat(strGroup.trim());
        strGroup2.getClass();
        return new PointF(f10, Float.parseFloat(strGroup2.trim()));
    }
}
