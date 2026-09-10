package bristol;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import vinyl.sakeen;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\"$\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcerebral/dern;", "Lbristol/beachfront;", "descriptor", "saneness", "(Lcerebral/dern;Lbristol/beachfront;)Lbristol/beachfront;", "Lkurbash/wireman;", "context", "dern", "(Lbristol/beachfront;Lkurbash/wireman;)Lbristol/beachfront;", "attabal", "(Lbristol/beachfront;)Lkurbash/wireman;", "getCapturedKClass$annotations", "(Lbristol/beachfront;)V", "capturedKClass", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class saneness {
    public static final kurbash.wireman<?> attabal(beachfront beachfrontVar) {
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        if (beachfrontVar instanceof ContextDescriptor) {
            return ((ContextDescriptor) beachfrontVar).kClass;
        }
        if (beachfrontVar instanceof sakeen) {
            return attabal(((sakeen) beachfrontVar).getOriginal());
        }
        return null;
    }

    public static final beachfront dern(beachfront beachfrontVar, kurbash.wireman<?> context) {
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new ContextDescriptor(beachfrontVar, context);
    }

    public static final beachfront saneness(cerebral.dern dernVar, beachfront descriptor) {
        asosan.wireman wiremanVarDern;
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kurbash.wireman<?> wiremanVarAttabal = attabal(descriptor);
        if (wiremanVarAttabal == null || (wiremanVarDern = cerebral.dern.dern(dernVar, wiremanVarAttabal, null, 2, null)) == null) {
            return null;
        }
        return wiremanVarDern.getDescriptor();
    }
}
