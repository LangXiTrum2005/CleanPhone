package vinyl;

import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import vinyl.attendance;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0017\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00028\u0002H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00028\u0001*\u00028\u0002H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00028\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013*\u00028\u0001H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u0010*\u00028\u00022\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00028\u0002H\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00028\u0001H$¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\nH$¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020#2\u0006\u0010$\u001a\u00028\u0001¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00028\u00012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0017\u00100\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lvinyl/lampshade;", "Element", "Array", "Lvinyl/attendance;", "Builder", "Lvinyl/gintrap;", "Lasosan/wireman;", "primitiveSerializer", "<init>", "(Lasosan/wireman;)V", "", "arytenoidectomy", "(Lvinyl/attendance;)I", "graveside", "(Lvinyl/attendance;)Ljava/lang/Object;", "size", "", "monoploid", "(Lvinyl/attendance;I)V", "", "wireman", "(Ljava/lang/Object;)Ljava/util/Iterator;", "index", "element", "molybdenite", "(Lvinyl/attendance;ILjava/lang/Object;)V", "kowloon", "()Lvinyl/attendance;", "polloi", "()Ljava/lang/Object;", "Lfastidiously/wireman;", "encoder", "content", "adultoid", "(Lfastidiously/wireman;Ljava/lang/Object;I)V", "Lfastidiously/beachfront;", "value", "serialize", "(Lfastidiously/beachfront;Ljava/lang/Object;)V", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Ljava/lang/Object;", "Lbristol/beachfront;", "saneness", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class lampshade<Element, Array, Builder extends attendance<Array>> extends gintrap<Element, Array, Builder> {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final bristol.beachfront descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lampshade(asosan.wireman<Element> primitiveSerializer) {
        super(primitiveSerializer, null);
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        this.descriptor = new homozygous(primitiveSerializer.getDescriptor());
    }

    public abstract void adultoid(fastidiously.wireman encoder, Array content, int size);

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: arytenoidectomy, reason: merged with bridge method [inline-methods] */
    public final int saneness(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        return builder.getPosition();
    }

    @Override // vinyl.attabal, asosan.dern
    public final Array deserialize(fastidiously.marial decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return beachfront(decoder, null);
    }

    @Override // vinyl.gintrap, asosan.wireman, asosan.impassible, asosan.dern
    public final bristol.beachfront getDescriptor() {
        return this.descriptor;
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: graveside, reason: merged with bridge method [inline-methods] */
    public final Array formularize(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        return (Array) builder.attabal();
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: kowloon, reason: merged with bridge method [inline-methods] */
    public final Builder attabal() {
        return apical(polloi());
    }

    @Override // vinyl.gintrap
    /* JADX INFO: renamed from: molybdenite, reason: merged with bridge method [inline-methods] */
    public final void triweekly(Builder builder, int i, Element element) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
    public final void dern(Builder builder, int i) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        builder.saneness(i);
    }

    public abstract Array polloi();

    @Override // vinyl.gintrap, asosan.impassible
    public final void serialize(fastidiously.beachfront encoder, Array value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iMarial = marial(value);
        bristol.beachfront beachfrontVar = this.descriptor;
        fastidiously.wireman wiremanVarRotuma = encoder.rotuma(beachfrontVar, iMarial);
        adultoid(wiremanVarRotuma, value, iMarial);
        wiremanVarRotuma.dern(beachfrontVar);
    }

    @Override // vinyl.attabal
    public final Iterator<Element> wireman(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }
}
