package asosan;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.annotation.Annotation;
import java.util.List;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import vinyl.claque;

/* JADX INFO: compiled from: ContextualSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lasosan/saneness;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lasosan/wireman;", "Lkurbash/wireman;", "serializableClass", "fallbackSerializer", "", "typeArgumentsSerializers", "<init>", "(Lkurbash/wireman;Lasosan/wireman;[Lasosan/wireman;)V", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Ljava/lang/Object;)V", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Ljava/lang/Object;", "Lcerebral/dern;", "serializersModule", "dern", "(Lcerebral/dern;)Lasosan/wireman;", "attabal", "Lkurbash/wireman;", "saneness", "Lasosan/wireman;", "", "Ljava/util/List;", "Lbristol/beachfront;", "wireman", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class saneness<T> implements wireman<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final kurbash.wireman<T> serializableClass;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final List<wireman<?>> typeArgumentsSerializers;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final wireman<T> fallbackSerializer;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final bristol.beachfront descriptor;

    public saneness(kurbash.wireman<T> serializableClass, wireman<T> wiremanVar, wireman<?>[] typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(serializableClass, "serializableClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        this.serializableClass = serializableClass;
        this.fallbackSerializer = wiremanVar;
        this.typeArgumentsSerializers = p002kotlin.collections.arytenoidectomy.wireman(typeArgumentsSerializers);
        this.descriptor = bristol.saneness.dern(bristol.formularize.wireman("kotlinx.serialization.ContextualSerializer", bristol.impassible.attabal.f15155attabal, new bristol.beachfront[0], new Function1() { // from class: asosan.attabal
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return saneness.saneness(this.f14482kowloon, (bristol.attabal) obj);
            }
        }), serializableClass);
    }

    public static final Unit saneness(saneness sanenessVar, bristol.attabal buildSerialDescriptor) {
        bristol.beachfront descriptor;
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        wireman<T> wiremanVar = sanenessVar.fallbackSerializer;
        List<Annotation> annotations = (wiremanVar == null || (descriptor = wiremanVar.getDescriptor()) == null) ? null : descriptor.getAnnotations();
        if (annotations == null) {
            annotations = p002kotlin.collections.adultoid.formularize();
        }
        buildSerialDescriptor.impromptu(annotations);
        return Unit.f29295attabal;
    }

    public final wireman<T> dern(cerebral.dern serializersModule) {
        wireman<T> wiremanVarSaneness = serializersModule.saneness(this.serializableClass, this.typeArgumentsSerializers);
        if (wiremanVarSaneness != null) {
            return wiremanVarSaneness;
        }
        wireman<T> wiremanVar = this.fallbackSerializer;
        if (wiremanVar != null) {
            return wiremanVar;
        }
        claque.beachfront(this.serializableClass);
        throw new KotlinNothingValueException();
    }

    @Override // asosan.dern
    public T deserialize(fastidiously.marial decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return (T) decoder.stratoscope(dern(decoder.getSerializersModule()));
    }

    @Override // asosan.wireman, asosan.impassible, asosan.dern
    public bristol.beachfront getDescriptor() {
        return this.descriptor;
    }

    @Override // asosan.impassible
    public void serialize(fastidiously.beachfront encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.preprohormone(dern(encoder.getSerializersModule()), value);
    }
}
