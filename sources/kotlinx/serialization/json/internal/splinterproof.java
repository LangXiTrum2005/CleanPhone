package kotlinx.serialization.json.internal;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcutwater/attabal;", "json", "Lcutwater/impromptu;", "element", "Lasosan/dern;", "deserializer", "attabal", "(Lcutwater/attabal;Lcutwater/impromptu;Lasosan/dern;)Ljava/lang/Object;", "", "discriminator", "Lcutwater/trm;", "saneness", "(Lcutwater/attabal;Ljava/lang/String;Lcutwater/trm;Lasosan/dern;)Ljava/lang/Object;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class splinterproof {
    public static final <T> T attabal(cutwater.attabal json, cutwater.impromptu element, asosan.dern<? extends T> deserializer) {
        fastidiously.marial trmVar;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (element instanceof cutwater.trm) {
            trmVar = new kattegat(json, (cutwater.trm) element, null, null, 12, null);
        } else if (element instanceof cutwater.saneness) {
            trmVar = new restrictive(json, (cutwater.saneness) element);
        } else {
            if (!(element instanceof cutwater.dovishness) && !Intrinsics.wireman(element, cutwater.cord.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            trmVar = new trm(json, (cutwater.sealless) element, null, 4, null);
        }
        return (T) trmVar.stratoscope(deserializer);
    }

    public static final <T> T saneness(cutwater.attabal attabalVar, String discriminator, cutwater.trm element, asosan.dern<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(attabalVar, "<this>");
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) new kattegat(attabalVar, element, discriminator, deserializer.getDescriptor()).stratoscope(deserializer);
    }
}
