package p002kotlin.reflect.jvm.internal.impl.renderer;

import byname.wireman;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: RenderingUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class marial {
    public static final String attabal(wireman wiremanVar) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        List<byname.marial> listImpromptu = wiremanVar.impromptu();
        Intrinsics.checkNotNullExpressionValue(listImpromptu, "pathSegments(...)");
        return dern(listImpromptu);
    }

    public static final boolean beachfront(String lower, String upper) {
        Intrinsics.checkNotNullParameter(lower, "lower");
        Intrinsics.checkNotNullParameter(upper, "upper");
        if (Intrinsics.wireman(lower, dovishness.polder(upper, "?", "", false, 4, null))) {
            return true;
        }
        if (dovishness.cuirassed(upper, "?", false, 2, null)) {
            if (Intrinsics.wireman(lower + '?', upper)) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(lower);
        sb.append(")?");
        return Intrinsics.wireman(sb.toString(), upper);
    }

    public static final String dern(List<byname.marial> pathSegments) {
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        StringBuilder sb = new StringBuilder();
        for (byname.marial marialVar : pathSegments) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(saneness(marialVar));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final boolean marial(byname.marial marialVar) {
        String strDern = marialVar.dern();
        Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
        if (wireman.f31281attabal.contains(strDern)) {
            return true;
        }
        for (int i = 0; i < strDern.length(); i++) {
            char cCharAt = strDern.charAt(i);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                return true;
            }
        }
        return strDern.length() == 0 || !Character.isJavaIdentifierStart(strDern.codePointAt(0));
    }

    public static final String saneness(byname.marial marialVar) {
        Intrinsics.checkNotNullParameter(marialVar, "<this>");
        if (!marial(marialVar)) {
            String strDern = marialVar.dern();
            Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
            return strDern;
        }
        StringBuilder sb = new StringBuilder();
        String strDern2 = marialVar.dern();
        Intrinsics.checkNotNullExpressionValue(strDern2, "asString(...)");
        sb.append('`' + strDern2);
        sb.append('`');
        return sb.toString();
    }

    public static final String wireman(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(lowerPrefix, "lowerPrefix");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(upperPrefix, "upperPrefix");
        Intrinsics.checkNotNullParameter(foldedPrefix, "foldedPrefix");
        if (dovishness.starveling(lowerRendered, lowerPrefix, false, 2, null) && dovishness.starveling(upperRendered, upperPrefix, false, 2, null)) {
            String strSubstring = lowerRendered.substring(lowerPrefix.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = upperRendered.substring(upperPrefix.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            String str = foldedPrefix + strSubstring;
            if (Intrinsics.wireman(strSubstring, strSubstring2)) {
                return str;
            }
            if (beachfront(strSubstring, strSubstring2)) {
                return str + '!';
            }
        }
        return null;
    }
}
