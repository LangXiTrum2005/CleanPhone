package cutwater;

import java.lang.annotation.Annotation;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcutwater/dern;", "Lasosan/wireman;", "Lcutwater/saneness;", "<init>", "()V", "Lfastidiously/beachfront;", "encoder", "value", "", "saneness", "(Lfastidiously/beachfront;Lcutwater/saneness;)V", "Lfastidiously/marial;", "decoder", "attabal", "(Lfastidiously/marial;)Lcutwater/saneness;", "Lbristol/beachfront;", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class dern implements asosan.wireman<saneness> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dern f24560attabal = new dern();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final bristol.beachfront descriptor = attabal.f24563saneness;

    /* JADX INFO: compiled from: JsonElementSerializers.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0019\u001a\u00020\u00068\u0016X\u0097D¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u001a8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00128VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00128VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\u00048\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcutwater/dern$attabal;", "Lbristol/beachfront;", "<init>", "()V", "", "index", "", "marial", "(I)Ljava/lang/String;", "name", "dern", "(Ljava/lang/String;)I", "", "", "beachfront", "(I)Ljava/util/List;", "competently", "(I)Lbristol/beachfront;", "", "taiyuan", "(I)Z", "Ljava/lang/String;", "impromptu", "()Ljava/lang/String;", "getSerialName$annotations", "serialName", "Lbristol/impassible;", "getKind", "()Lbristol/impassible;", "kind", "saneness", "()Z", "isNullable", "isInline", "wireman", "()I", "elementsCount", "getAnnotations", "()Ljava/util/List;", "annotations", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements bristol.beachfront {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ bristol.beachfront f24564attabal = defendable.attabal.impromptu(monoploid.f24572attabal).getDescriptor();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final attabal f24563saneness = new attabal();

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public static final String serialName = "kotlinx.serialization.json.JsonArray";

        @Override // bristol.beachfront
        public List<Annotation> beachfront(int index) {
            return this.f24564attabal.beachfront(index);
        }

        @Override // bristol.beachfront
        public bristol.beachfront competently(int index) {
            return this.f24564attabal.competently(index);
        }

        @Override // bristol.beachfront
        public int dern(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.f24564attabal.dern(name);
        }

        @Override // bristol.beachfront
        public List<Annotation> getAnnotations() {
            return this.f24564attabal.getAnnotations();
        }

        @Override // bristol.beachfront
        public bristol.impassible getKind() {
            return this.f24564attabal.getKind();
        }

        @Override // bristol.beachfront
        /* JADX INFO: renamed from: impromptu */
        public String getSerialName() {
            return serialName;
        }

        @Override // bristol.beachfront
        /* JADX INFO: renamed from: isInline */
        public boolean getIsInline() {
            return this.f24564attabal.getIsInline();
        }

        @Override // bristol.beachfront
        public String marial(int index) {
            return this.f24564attabal.marial(index);
        }

        @Override // bristol.beachfront
        public boolean saneness() {
            return this.f24564attabal.saneness();
        }

        @Override // bristol.beachfront
        public boolean taiyuan(int index) {
            return this.f24564attabal.taiyuan(index);
        }

        @Override // bristol.beachfront
        /* JADX INFO: renamed from: wireman */
        public int getElementsCount() {
            return this.f24564attabal.getElementsCount();
        }
    }

    @Override // asosan.dern
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public saneness deserialize(fastidiously.marial decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        polloi.competently(decoder);
        return new saneness((List) defendable.attabal.impromptu(monoploid.f24572attabal).deserialize(decoder));
    }

    @Override // asosan.wireman, asosan.impassible, asosan.dern
    public bristol.beachfront getDescriptor() {
        return descriptor;
    }

    @Override // asosan.impassible
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public void serialize(fastidiously.beachfront encoder, saneness value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        polloi.impromptu(encoder);
        defendable.attabal.impromptu(monoploid.f24572attabal).serialize(encoder, value);
    }
}
