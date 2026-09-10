package p002kotlin.reflect.jvm.internal.impl.load.java;

import byname.marial;
import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import p002kotlin.text.dovishness;
import saccharine.attabal;

/* JADX INFO: compiled from: propertiesConventionUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class gintrap {
    public static final List<marial> attabal(marial name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strDern = name.dern();
        Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
        if (molybdenite.dern(strDern)) {
            return adultoid.arytenoidectomy(saneness(name));
        }
        return molybdenite.wireman(strDern) ? beachfront(name) : dern.f30398attabal.saneness(name);
    }

    public static final List<marial> beachfront(marial methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        return adultoid.monoploid(dern(methodName, false), dern(methodName, true));
    }

    public static final marial dern(marial methodName, boolean z) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        return marial(methodName, "set", false, z ? "is" : null, 4, null);
    }

    public static /* synthetic */ marial marial(marial marialVar, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return wireman(marialVar, str, z, str2);
    }

    public static final marial saneness(marial methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        marial marialVarMarial = marial(methodName, "get", false, null, 12, null);
        return marialVarMarial == null ? marial(methodName, "is", false, null, 8, null) : marialVarMarial;
    }

    public static final marial wireman(marial marialVar, String str, boolean z, String str2) {
        if (marialVar.apical()) {
            return null;
        }
        String strMarial = marialVar.marial();
        Intrinsics.checkNotNullExpressionValue(strMarial, "getIdentifier(...)");
        if (!dovishness.starveling(strMarial, str, false, 2, null) || strMarial.length() == str.length()) {
            return null;
        }
        char cCharAt = strMarial.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            return marial.cutely(str2 + StringsKt.hardpan(strMarial, str));
        }
        if (!z) {
            return marialVar;
        }
        String strDern = attabal.dern(StringsKt.hardpan(strMarial, str), true);
        if (marial.formularize(strDern)) {
            return marial.cutely(strDern);
        }
        return null;
    }
}
