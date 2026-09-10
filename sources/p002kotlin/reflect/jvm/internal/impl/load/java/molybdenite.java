package p002kotlin.reflect.jvm.internal.impl.load.java;

import byname.dern;
import byname.saneness;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;
import saccharine.attabal;

/* JADX INFO: compiled from: JvmAbi.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class molybdenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final molybdenite f30600attabal = new molybdenite();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final saneness f30601dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final saneness f30602marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final dern f30603saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final saneness f30604wireman;

    static {
        dern dernVar = new dern("kotlin.jvm.JvmField");
        f30603saneness = dernVar;
        saneness sanenessVarImpassible = saneness.impassible(dernVar);
        Intrinsics.checkNotNullExpressionValue(sanenessVarImpassible, "topLevel(...)");
        f30601dern = sanenessVarImpassible;
        saneness sanenessVarImpassible2 = saneness.impassible(new dern("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        Intrinsics.checkNotNullExpressionValue(sanenessVarImpassible2, "topLevel(...)");
        f30604wireman = sanenessVarImpassible2;
        saneness sanenessVarMarial = saneness.marial("kotlin/jvm/internal/RepeatableContainer");
        Intrinsics.checkNotNullExpressionValue(sanenessVarMarial, "fromString(...)");
        f30602marial = sanenessVarMarial;
    }

    public static final boolean beachfront(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!dovishness.starveling(name, "is", false, 2, null) || name.length() == 2) {
            return false;
        }
        char cCharAt = name.charAt(2);
        return Intrinsics.taiyuan(97, cCharAt) > 0 || Intrinsics.taiyuan(cCharAt, 122) > 0;
    }

    public static final boolean dern(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return dovishness.starveling(name, "get", false, 2, null) || dovishness.starveling(name, "is", false, 2, null);
    }

    public static final String marial(String propertyName) {
        String strAttabal;
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        StringBuilder sb = new StringBuilder();
        sb.append("set");
        if (beachfront(propertyName)) {
            strAttabal = propertyName.substring(2);
            Intrinsics.checkNotNullExpressionValue(strAttabal, "substring(...)");
        } else {
            strAttabal = attabal.attabal(propertyName);
        }
        sb.append(strAttabal);
        return sb.toString();
    }

    public static final String saneness(String propertyName) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        if (beachfront(propertyName)) {
            return propertyName;
        }
        return "get" + attabal.attabal(propertyName);
    }

    public static final boolean wireman(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return dovishness.starveling(name, "set", false, 2, null);
    }

    public final saneness attabal() {
        return f30602marial;
    }
}
