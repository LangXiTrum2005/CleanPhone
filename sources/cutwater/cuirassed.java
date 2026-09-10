package cutwater;

import kotlinx.serialization.json.internal.JsonDecodingException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcutwater/cuirassed;", "Lasosan/wireman;", "Lcutwater/cord;", "<init>", "()V", "Lfastidiously/beachfront;", "encoder", "value", "", "saneness", "(Lfastidiously/beachfront;Lcutwater/cord;)V", "Lfastidiously/marial;", "decoder", "attabal", "(Lfastidiously/marial;)Lcutwater/cord;", "Lbristol/beachfront;", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cuirassed implements asosan.wireman<cord> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final cuirassed f24557attabal = new cuirassed();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final bristol.beachfront descriptor = bristol.formularize.marial("kotlinx.serialization.json.JsonNull", bristol.impassible.saneness.f15156attabal, new bristol.beachfront[0], null, 8, null);

    @Override // asosan.dern
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public cord deserialize(fastidiously.marial decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        polloi.competently(decoder);
        if (decoder.trm()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        decoder.impromptu();
        return cord.INSTANCE;
    }

    @Override // asosan.wireman, asosan.impassible, asosan.dern
    public bristol.beachfront getDescriptor() {
        return descriptor;
    }

    @Override // asosan.impassible
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public void serialize(fastidiously.beachfront encoder, cord value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        polloi.impromptu(encoder);
        encoder.impassible();
    }
}
