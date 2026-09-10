package vinyl;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NullableSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lvinyl/igbo;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lasosan/wireman;", "serializer", "<init>", "(Lasosan/wireman;)V", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Ljava/lang/Object;)V", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Ljava/lang/Object;", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "attabal", "Lasosan/wireman;", "Lbristol/beachfront;", "saneness", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class igbo<T> implements asosan.wireman<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final asosan.wireman<T> serializer;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final bristol.beachfront descriptor;

    public igbo(asosan.wireman<T> serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.serializer = serializer;
        this.descriptor = new sakeen(serializer.getDescriptor());
    }

    @Override // asosan.dern
    public T deserialize(fastidiously.marial decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.trm() ? (T) decoder.stratoscope(this.serializer) : (T) decoder.impromptu();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return other != null && igbo.class == other.getClass() && Intrinsics.wireman(this.serializer, ((igbo) other).serializer);
    }

    @Override // asosan.wireman, asosan.impassible, asosan.dern
    public bristol.beachfront getDescriptor() {
        return this.descriptor;
    }

    public int hashCode() {
        return this.serializer.hashCode();
    }

    @Override // asosan.impassible
    public void serialize(fastidiously.beachfront encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (value == null) {
            encoder.impassible();
        } else {
            encoder.gintrap();
            encoder.preprohormone(this.serializer, value);
        }
    }
}
