package kotlinx.serialization.json.internal;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a3\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u0018\u0010\r\u001a\u00020\n*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcutwater/attabal;", "json", "value", "Lasosan/impassible;", "serializer", "Lcutwater/impromptu;", "wireman", "(Lcutwater/attabal;Ljava/lang/Object;Lasosan/impassible;)Lcutwater/impromptu;", "Lbristol/beachfront;", "", "dern", "(Lbristol/beachfront;)Z", "requiresTopLevelTag", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class clubfoot {
    public static final boolean dern(bristol.beachfront beachfrontVar) {
        return (beachfrontVar.getKind() instanceof bristol.marial) || beachfrontVar.getKind() == bristol.impassible.saneness.f15156attabal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit marial(Ref$ObjectRef ref$ObjectRef, cutwater.impromptu it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ref$ObjectRef.element = it;
        return Unit.f29295attabal;
    }

    public static final <T> cutwater.impromptu wireman(cutwater.attabal json, T t, asosan.impassible<? super T> serializer) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        new supplicat(json, new Function1() { // from class: kotlinx.serialization.json.internal.overspeculate
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return clubfoot.marial(ref$ObjectRef, (cutwater.impromptu) obj);
            }
        }).preprohormone(serializer, t);
        T t2 = ref$ObjectRef.element;
        if (t2 != null) {
            return (cutwater.impromptu) t2;
        }
        Intrinsics.preprohormone("result");
        return null;
    }
}
