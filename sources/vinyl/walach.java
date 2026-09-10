package vinyl;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InlineClassDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "name", "Lasosan/wireman;", "primitiveSerializer", "Lbristol/beachfront;", "attabal", "(Ljava/lang/String;Lasosan/wireman;)Lbristol/beachfront;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class walach {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: InlineClassDescriptor.kt */
    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"vinyl/walach$attabal", "Lvinyl/grimness;", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Ljava/lang/Object;)V", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Ljava/lang/Object;", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal<T> implements grimness<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ asosan.wireman<T> f39528attabal;

        public attabal(asosan.wireman<T> wiremanVar) {
            this.f39528attabal = wiremanVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vinyl.grimness
        public asosan.wireman<?>[] childSerializers() {
            return new asosan.wireman[]{this.f39528attabal};
        }

        @Override // asosan.dern
        public T deserialize(fastidiously.marial decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // asosan.wireman, asosan.impassible, asosan.dern
        public bristol.beachfront getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        @Override // asosan.impassible
        public void serialize(fastidiously.beachfront encoder, T value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // vinyl.grimness
        public asosan.wireman<?>[] typeParametersSerializers() {
            return grimness.attabal.attabal(this);
        }
    }

    public static final <T> bristol.beachfront attabal(String name, asosan.wireman<T> primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new hydrovane(name, new attabal(primitiveSerializer));
    }
}
