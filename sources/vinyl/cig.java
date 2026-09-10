package vinyl;

import kotlinx.serialization.SerializationException;
import p002kotlin.Metadata;
import p002kotlin.Triple;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u0004B1\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lvinyl/cig;", "A", "B", "C", "Lasosan/wireman;", "Lkotlin/Triple;", "aSerializer", "bSerializer", "cSerializer", "<init>", "(Lasosan/wireman;Lasosan/wireman;Lasosan/wireman;)V", "Lfastidiously/beachfront;", "encoder", "value", "", "beachfront", "(Lfastidiously/beachfront;Lkotlin/Triple;)V", "Lfastidiously/marial;", "decoder", "marial", "(Lfastidiously/marial;)Lkotlin/Triple;", "Lfastidiously/dern;", "composite", "saneness", "(Lfastidiously/dern;)Lkotlin/Triple;", "dern", "attabal", "Lasosan/wireman;", "Lbristol/beachfront;", "wireman", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cig<A, B, C> implements asosan.wireman<Triple<? extends A, ? extends B, ? extends C>> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final asosan.wireman<A> aSerializer;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final asosan.wireman<C> cSerializer;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final asosan.wireman<B> bSerializer;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final bristol.beachfront descriptor;

    public cig(asosan.wireman<A> aSerializer, asosan.wireman<B> bSerializer, asosan.wireman<C> cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        this.aSerializer = aSerializer;
        this.bSerializer = bSerializer;
        this.cSerializer = cSerializer;
        this.descriptor = bristol.formularize.dern("kotlin.Triple", new bristol.beachfront[0], new Function1() { // from class: vinyl.tarboosh
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cig.wireman(this.f39502kowloon, (bristol.attabal) obj);
            }
        });
    }

    public static final Unit wireman(cig cigVar, bristol.attabal buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        bristol.attabal.saneness(buildClassSerialDescriptor, "first", cigVar.aSerializer.getDescriptor(), null, false, 12, null);
        bristol.attabal.saneness(buildClassSerialDescriptor, "second", cigVar.bSerializer.getDescriptor(), null, false, 12, null);
        bristol.attabal.saneness(buildClassSerialDescriptor, "third", cigVar.cSerializer.getDescriptor(), null, false, 12, null);
        return Unit.f29295attabal;
    }

    @Override // asosan.impassible
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public void serialize(fastidiously.beachfront encoder, Triple<? extends A, ? extends B, ? extends C> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        fastidiously.wireman wiremanVarSaneness = encoder.saneness(getDescriptor());
        wiremanVarSaneness.sealless(getDescriptor(), 0, this.aSerializer, value.getFirst());
        wiremanVarSaneness.sealless(getDescriptor(), 1, this.bSerializer, value.getSecond());
        wiremanVarSaneness.sealless(getDescriptor(), 2, this.cSerializer, value.getThird());
        wiremanVarSaneness.dern(getDescriptor());
    }

    public final Triple<A, B, C> dern(fastidiously.dern composite) {
        Object objDern = demilitarize.f39384attabal;
        Object objDern2 = demilitarize.f39384attabal;
        Object objDern3 = demilitarize.f39384attabal;
        while (true) {
            int iImpassible = composite.impassible(getDescriptor());
            if (iImpassible == -1) {
                composite.dern(getDescriptor());
                if (objDern == demilitarize.f39384attabal) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objDern2 == demilitarize.f39384attabal) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objDern3 != demilitarize.f39384attabal) {
                    return new Triple<>(objDern, objDern2, objDern3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iImpassible == 0) {
                objDern = fastidiously.dern.attabal.dern(composite, getDescriptor(), 0, this.aSerializer, null, 8, null);
            } else if (iImpassible == 1) {
                objDern2 = fastidiously.dern.attabal.dern(composite, getDescriptor(), 1, this.bSerializer, null, 8, null);
            } else {
                if (iImpassible != 2) {
                    throw new SerializationException("Unexpected index " + iImpassible);
                }
                objDern3 = fastidiously.dern.attabal.dern(composite, getDescriptor(), 2, this.cSerializer, null, 8, null);
            }
        }
    }

    @Override // asosan.wireman, asosan.impassible, asosan.dern
    public bristol.beachfront getDescriptor() {
        return this.descriptor;
    }

    @Override // asosan.dern
    /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
    public Triple<A, B, C> deserialize(fastidiously.marial decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        fastidiously.dern dernVarSaneness = decoder.saneness(getDescriptor());
        return dernVarSaneness.triweekly() ? saneness(dernVarSaneness) : dern(dernVarSaneness);
    }

    public final Triple<A, B, C> saneness(fastidiously.dern composite) {
        Object objDern = fastidiously.dern.attabal.dern(composite, getDescriptor(), 0, this.aSerializer, null, 8, null);
        Object objDern2 = fastidiously.dern.attabal.dern(composite, getDescriptor(), 1, this.bSerializer, null, 8, null);
        Object objDern3 = fastidiously.dern.attabal.dern(composite, getDescriptor(), 2, this.cSerializer, null, 8, null);
        composite.dern(getDescriptor());
        return new Triple<>(objDern, objDern2, objDern3);
    }
}
