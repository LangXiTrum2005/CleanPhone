package byname;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Regex;

/* JADX INFO: compiled from: NameUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final beachfront f15228attabal = new beachfront();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Regex f15230saneness = new Regex("[^\\p{L}\\p{Digit}]");

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final String f15229dern = "$context_receiver";

    public static final marial attabal(int i) {
        marial marialVarCutely = marial.cutely(f15229dern + '_' + i);
        Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
        return marialVarCutely;
    }

    public static final String saneness(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f15230saneness.replace(name, "_");
    }
}
