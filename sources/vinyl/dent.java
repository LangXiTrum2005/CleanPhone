package vinyl;

import com.ironsource.X3;
import kotlinx.serialization.SerializationException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B%\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001H$¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00028\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\t\u001a\u00028\u0000*\u00028\u00028$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001bR\u0018\u0010\n\u001a\u00028\u0001*\u00028\u00028$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001b\u0082\u0001\u0002\u001d\u001e¨\u0006\u001f"}, d2 = {"Lvinyl/dent;", "K", "V", "R", "Lasosan/wireman;", "keySerializer", "valueSerializer", "<init>", "(Lasosan/wireman;Lasosan/wireman;)V", X3.i.W, "value", "marial", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lfastidiously/beachfront;", "encoder", "", "serialize", "(Lfastidiously/beachfront;Ljava/lang/Object;)V", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Ljava/lang/Object;", "attabal", "Lasosan/wireman;", "saneness", "()Lasosan/wireman;", "wireman", "(Ljava/lang/Object;)Ljava/lang/Object;", "dern", "Lvinyl/nosophobia;", "Lvinyl/monroe;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class dent<K, V, R> implements asosan.wireman<R> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final asosan.wireman<K> keySerializer;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final asosan.wireman<V> valueSerializer;

    public /* synthetic */ dent(asosan.wireman wiremanVar, asosan.wireman wiremanVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(wiremanVar, wiremanVar2);
    }

    public abstract K attabal(R r);

    public abstract V dern(R r);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // asosan.dern
    public R deserialize(fastidiously.marial decoder) {
        R r;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        bristol.beachfront descriptor = getDescriptor();
        fastidiously.dern dernVarSaneness = decoder.saneness(descriptor);
        if (dernVarSaneness.triweekly()) {
            r = (R) marial(fastidiously.dern.attabal.dern(dernVarSaneness, getDescriptor(), 0, saneness(), null, 8, null), fastidiously.dern.attabal.dern(dernVarSaneness, getDescriptor(), 1, wireman(), null, 8, null));
        } else {
            Object objDern = demilitarize.f39384attabal;
            Object objDern2 = demilitarize.f39384attabal;
            while (true) {
                int iImpassible = dernVarSaneness.impassible(getDescriptor());
                if (iImpassible == -1) {
                    if (objDern == demilitarize.f39384attabal) {
                        throw new SerializationException("Element 'key' is missing");
                    }
                    if (objDern2 == demilitarize.f39384attabal) {
                        throw new SerializationException("Element 'value' is missing");
                    }
                    r = (R) marial(objDern, objDern2);
                    break;
                }
                if (iImpassible == 0) {
                    objDern = fastidiously.dern.attabal.dern(dernVarSaneness, getDescriptor(), 0, saneness(), null, 8, null);
                } else {
                    if (iImpassible != 1) {
                        throw new SerializationException("Invalid index: " + iImpassible);
                    }
                    objDern2 = fastidiously.dern.attabal.dern(dernVarSaneness, getDescriptor(), 1, wireman(), null, 8, null);
                }
            }
        }
        dernVarSaneness.dern(descriptor);
        return r;
    }

    public abstract R marial(K key, V value);

    public final asosan.wireman<K> saneness() {
        return this.keySerializer;
    }

    @Override // asosan.impassible
    public void serialize(fastidiously.beachfront encoder, R value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        fastidiously.wireman wiremanVarSaneness = encoder.saneness(getDescriptor());
        wiremanVarSaneness.sealless(getDescriptor(), 0, this.keySerializer, attabal(value));
        wiremanVarSaneness.sealless(getDescriptor(), 1, this.valueSerializer, dern(value));
        wiremanVarSaneness.dern(getDescriptor());
    }

    public final asosan.wireman<V> wireman() {
        return this.valueSerializer;
    }

    public dent(asosan.wireman<K> wiremanVar, asosan.wireman<V> wiremanVar2) {
        this.keySerializer = wiremanVar;
        this.valueSerializer = wiremanVar2;
    }
}
