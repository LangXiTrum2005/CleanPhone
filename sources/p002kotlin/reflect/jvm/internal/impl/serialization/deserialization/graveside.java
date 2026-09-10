package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import byname.marial;
import byname.saneness;
import genesis.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NameResolverUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class graveside {
    public static final saneness attabal(dern dernVar, int i) {
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        saneness sanenessVarBeachfront = saneness.beachfront(dernVar.saneness(i), dernVar.attabal(i));
        Intrinsics.checkNotNullExpressionValue(sanenessVarBeachfront, "fromString(...)");
        return sanenessVarBeachfront;
    }

    public static final marial saneness(dern dernVar, int i) {
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        marial marialVarTaiyuan = marial.taiyuan(dernVar.getString(i));
        Intrinsics.checkNotNullExpressionValue(marialVarTaiyuan, "guessByFirstCharacter(...)");
        return marialVarTaiyuan;
    }
}
