package cutwater;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Json.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcutwater/attabal;", "from", "Lkotlin/Function1;", "Lcutwater/wireman;", "", "builderAction", "attabal", "(Lcutwater/attabal;Lkotlin/jvm/functions/Function1;)Lcutwater/attabal;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class adultoid {
    public static final attabal attabal(attabal from, Function1<? super wireman, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        wireman wiremanVar = new wireman(from);
        builderAction.invoke(wiremanVar);
        return new graveside(wiremanVar.attabal(), wiremanVar.getSerializersModule());
    }

    public static /* synthetic */ attabal saneness(attabal attabalVar, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            attabalVar = attabal.INSTANCE;
        }
        return attabal(attabalVar, function1);
    }
}
