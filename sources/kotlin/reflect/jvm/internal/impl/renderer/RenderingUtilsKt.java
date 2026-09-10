package kotlin.reflect.jvm.internal.impl.renderer;

import com.thinkup.core.common.n.mo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class RenderingUtilsKt {
    public static final String a(Name name) {
        Intrinsics.f(name, "<this>");
        String strB = name.b();
        Intrinsics.e(strB, "asString()");
        if (!KeywordStringsGenerated.f44270a.contains(strB)) {
            for (int i2 = 0; i2 < strB.length(); i2++) {
                char cCharAt = strB.charAt(i2);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            String strB2 = name.b();
            Intrinsics.e(strB2, "asString()");
            return strB2;
        }
        StringBuilder sb = new StringBuilder();
        String strB3 = name.b();
        Intrinsics.e(strB3, "asString()");
        sb.append("`".concat(strB3));
        sb.append('`');
        return sb.toString();
    }

    public static final String b(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Name name = (Name) it.next();
            if (sb.length() > 0) {
                sb.append(mo.ono);
            }
            sb.append(a(name));
        }
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String c(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        Intrinsics.f(lowerRendered, "lowerRendered");
        Intrinsics.f(lowerPrefix, "lowerPrefix");
        Intrinsics.f(upperRendered, "upperRendered");
        Intrinsics.f(upperPrefix, "upperPrefix");
        Intrinsics.f(foldedPrefix, "foldedPrefix");
        if (!StringsKt.M(lowerRendered, lowerPrefix, false) || !StringsKt.M(upperRendered, upperPrefix, false)) {
            return null;
        }
        String strSubstring = lowerRendered.substring(lowerPrefix.length());
        Intrinsics.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        String strSubstring2 = upperRendered.substring(upperPrefix.length());
        Intrinsics.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
        String strConcat = foldedPrefix.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (!d(strSubstring, strSubstring2)) {
            return null;
        }
        return strConcat + '!';
    }

    public static final boolean d(String lower, String upper) {
        Intrinsics.f(lower, "lower");
        Intrinsics.f(upper, "upper");
        if (lower.equals(StringsKt.I(upper, "?", ""))) {
            return true;
        }
        if (StringsKt.p(upper, "?", false) && Intrinsics.a(lower.concat("?"), upper)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(lower);
        sb.append(")?");
        return Intrinsics.a(sb.toString(), upper);
    }
}
