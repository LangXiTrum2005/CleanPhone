package kotlinx.coroutines;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: Yield.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "attabal", "(Lwretchedly/dern;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class cosy {
    public static final Object attabal(wretchedly.dern<? super Unit> dernVar) {
        Object objBeachfront;
        CoroutineContext context = dernVar.getContext();
        achondroplasia.impromptu(context);
        wretchedly.dern dernVarDern = IntrinsicsKt__IntrinsicsJvmKt.dern(dernVar);
        pigboat.competently competentlyVar = dernVarDern instanceof pigboat.competently ? (pigboat.competently) dernVarDern : null;
        if (competentlyVar == null) {
            objBeachfront = Unit.f29295attabal;
        } else {
            if (pigboat.impromptu.wireman(competentlyVar.dispatcher, context)) {
                competentlyVar.arytenoidectomy(context, Unit.f29295attabal);
            } else {
                fastrack fastrackVar = new fastrack();
                CoroutineContext coroutineContextPlus = context.plus(fastrackVar);
                Unit unit = Unit.f29295attabal;
                competentlyVar.arytenoidectomy(coroutineContextPlus, unit);
                objBeachfront = (!fastrackVar.dispatcherWasUnconfined || pigboat.impromptu.marial(competentlyVar)) ? p002kotlin.coroutines.intrinsics.attabal.beachfront() : unit;
            }
            objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        }
        if (objBeachfront == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            igo.beachfront.dern(dernVar);
        }
        return objBeachfront == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objBeachfront : Unit.f29295attabal;
    }
}
