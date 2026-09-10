package cutwater;

import com.google.android.gms.ads.RequestConfiguration;
import kotlinx.serialization.json.internal.clubfoot;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JsonTransformingSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcutwater/restrictive;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lasosan/wireman;", "tSerializer", "<init>", "(Lasosan/wireman;)V", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Ljava/lang/Object;)V", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Ljava/lang/Object;", "Lcutwater/impromptu;", "element", "transformDeserialize", "(Lcutwater/impromptu;)Lcutwater/impromptu;", "transformSerialize", "Lasosan/wireman;", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class restrictive<T> implements asosan.wireman<T> {
    private final asosan.wireman<T> tSerializer;

    public restrictive(asosan.wireman<T> tSerializer) {
        Intrinsics.checkNotNullParameter(tSerializer, "tSerializer");
        this.tSerializer = tSerializer;
    }

    @Override // asosan.dern
    public final T deserialize(fastidiously.marial decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        competently competentlyVarWireman = polloi.wireman(decoder);
        return (T) competentlyVarWireman.getJson().wireman(this.tSerializer, transformDeserialize(competentlyVarWireman.beachfront()));
    }

    @Override // asosan.wireman, asosan.impassible, asosan.dern
    public bristol.beachfront getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // asosan.impassible
    public final void serialize(fastidiously.beachfront encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        molybdenite molybdeniteVarMarial = polloi.marial(encoder);
        molybdeniteVarMarial.polloi(transformSerialize(clubfoot.wireman(molybdeniteVarMarial.getJson(), value, this.tSerializer)));
    }

    public impromptu transformDeserialize(impromptu element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return element;
    }

    public impromptu transformSerialize(impromptu element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return element;
    }
}
