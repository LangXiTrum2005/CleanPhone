package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Ln0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f3374a = Pattern.compile("<(head)( [^>]*)?>", 2);
    public static final Pattern b = Pattern.compile("<(head)( [^>]*)?/>", 2);
    public static final Pattern c = Pattern.compile("<(body)( [^>]*?)?>", 2);
    public static final Pattern d = Pattern.compile("<(body)( [^>]*?)?/>", 2);
    public static final Pattern e = Pattern.compile("<(html)( [^>]*?)?>", 2);
    public static final Pattern f = Pattern.compile("<(html)( [^>]*?)?/>", 2);
    public static final Pattern g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    public static boolean a(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        int i;
        Matcher matcher = pattern.matcher(str);
        int i2 = 0;
        while (matcher.find(i2)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (iArr != null) {
                int length = iArr.length;
                while (true) {
                    if (i < length) {
                        int[] iArr2 = iArr[i];
                        i = (iStart < iArr2[0] || iStart > iArr2[1]) ? i + 1 : 0;
                    }
                }
                i2 = iEnd;
            }
            sb.append(str.substring(0, matcher.end()));
            sb.append(str2);
            sb.append(str.substring(matcher.end()));
            return true;
        }
        return false;
    }

    public static boolean b(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        int i;
        Matcher matcher = pattern.matcher(str);
        int i2 = 0;
        while (matcher.find(i2)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (iArr != null) {
                int length = iArr.length;
                while (true) {
                    if (i < length) {
                        int[] iArr2 = iArr[i];
                        i = (iStart < iArr2[0] || iStart > iArr2[1]) ? i + 1 : 0;
                    }
                }
                i2 = iEnd;
            }
            sb.append(str.substring(0, matcher.end() - 2));
            sb.append(">");
            sb.append(str2);
            sb.append("</");
            sb.append(matcher.group(1));
            sb.append(">");
            sb.append(str.substring(matcher.end()));
            return true;
        }
        return false;
    }
}
