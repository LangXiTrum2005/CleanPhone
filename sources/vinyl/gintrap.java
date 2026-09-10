package vinyl;

import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004B\u0017\b\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f*\u00028\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H$¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00028\u00022\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0001\u0003%&'¨\u0006("}, d2 = {"Lvinyl/gintrap;", "Element", "Collection", "Builder", "Lvinyl/attabal;", "Lasosan/wireman;", "elementSerializer", "<init>", "(Lasosan/wireman;)V", "", "index", "element", "", "triweekly", "(Ljava/lang/Object;ILjava/lang/Object;)V", "Lfastidiously/beachfront;", "encoder", "value", "serialize", "(Lfastidiously/beachfront;Ljava/lang/Object;)V", "Lfastidiously/dern;", "decoder", "builder", "startIndex", "size", "competently", "(Lfastidiously/dern;Ljava/lang/Object;II)V", "", "checkIndex", "impromptu", "(Lfastidiously/dern;ILjava/lang/Object;Z)V", "attabal", "Lasosan/wireman;", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "Lvinyl/rotuma;", "Lvinyl/lampshade;", "Lvinyl/molet;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class gintrap<Element, Collection, Builder> extends attabal<Element, Collection, Builder> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final asosan.wireman<Element> elementSerializer;

    public /* synthetic */ gintrap(asosan.wireman wiremanVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(wiremanVar);
    }

    @Override // vinyl.attabal
    public final void competently(fastidiously.dern decoder, Builder builder, int startIndex, int size) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (size < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i = 0; i < size; i++) {
            impromptu(decoder, startIndex + i, builder, false);
        }
    }

    @Override // asosan.wireman, asosan.impassible, asosan.dern
    public abstract bristol.beachfront getDescriptor();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vinyl.attabal
    public void impromptu(fastidiously.dern decoder, int index, Builder builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        triweekly(builder, index, fastidiously.dern.attabal.dern(decoder, getDescriptor(), index, this.elementSerializer, null, 8, null));
    }

    @Override // asosan.impassible
    public void serialize(fastidiously.beachfront encoder, Collection value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iMarial = marial(value);
        bristol.beachfront descriptor = getDescriptor();
        fastidiously.wireman wiremanVarRotuma = encoder.rotuma(descriptor, iMarial);
        Iterator<Element> itWireman = wireman(value);
        for (int i = 0; i < iMarial; i++) {
            wiremanVarRotuma.sealless(getDescriptor(), i, this.elementSerializer, itWireman.next());
        }
        wiremanVarRotuma.dern(descriptor);
    }

    public abstract void triweekly(Builder builder, int i, Element element);

    public gintrap(asosan.wireman<Element> wiremanVar) {
        super(null);
        this.elementSerializer = wiremanVar;
    }
}
