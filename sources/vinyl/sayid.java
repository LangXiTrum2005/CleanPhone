package vinyl;

import java.util.Iterator;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0014\b\u0003\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006B%\b\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0001\u0002*+¨\u0006,"}, d2 = {"Lvinyl/sayid;", "Key", "Value", "Collection", "", "Builder", "Lvinyl/attabal;", "", "Lasosan/wireman;", "keySerializer", "valueSerializer", "<init>", "(Lasosan/wireman;Lasosan/wireman;)V", "Lfastidiously/dern;", "decoder", "builder", "", "startIndex", "size", "", "kowloon", "(Lfastidiously/dern;Ljava/util/Map;II)V", "index", "", "checkIndex", "arytenoidectomy", "(Lfastidiously/dern;ILjava/util/Map;Z)V", "Lfastidiously/beachfront;", "encoder", "value", "serialize", "(Lfastidiously/beachfront;Ljava/lang/Object;)V", "attabal", "Lasosan/wireman;", "impassible", "()Lasosan/wireman;", "saneness", "triweekly", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "Lvinyl/privatdozent;", "Lvinyl/cultivated;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class sayid<Key, Value, Collection, Builder extends Map<Key, Value>> extends attabal<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final asosan.wireman<Key> keySerializer;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final asosan.wireman<Value> valueSerializer;

    public /* synthetic */ sayid(asosan.wireman wiremanVar, asosan.wireman wiremanVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(wiremanVar, wiremanVar2);
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: arytenoidectomy, reason: merged with bridge method [inline-methods] */
    public final void impromptu(fastidiously.dern decoder, int index, Builder builder, boolean checkIndex) {
        int iImpassible;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Object objDern = fastidiously.dern.attabal.dern(decoder, getDescriptor(), index, this.keySerializer, null, 8, null);
        if (checkIndex) {
            iImpassible = decoder.impassible(getDescriptor());
            if (iImpassible != index + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + index + ", returned index for value: " + iImpassible).toString());
            }
        } else {
            iImpassible = index + 1;
        }
        int i = iImpassible;
        builder.put(objDern, (!builder.containsKey(objDern) || (this.valueSerializer.getDescriptor().getKind() instanceof bristol.marial)) ? fastidiously.dern.attabal.dern(decoder, getDescriptor(), i, this.valueSerializer, null, 8, null) : decoder.supplicat(getDescriptor(), i, this.valueSerializer, p002kotlin.collections.seminary.cutely(builder, objDern)));
    }

    @Override // asosan.wireman, asosan.impassible, asosan.dern
    public abstract bristol.beachfront getDescriptor();

    public final asosan.wireman<Key> impassible() {
        return this.keySerializer;
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: kowloon, reason: merged with bridge method [inline-methods] */
    public final void competently(fastidiously.dern decoder, Builder builder, int startIndex, int size) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (size < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        p002kotlin.ranges.attabal attabalVarArytenoidectomy = p002kotlin.ranges.wireman.arytenoidectomy(p002kotlin.ranges.wireman.monoploid(0, size * 2), 2);
        int first = attabalVarArytenoidectomy.getFirst();
        int last = attabalVarArytenoidectomy.getLast();
        int step = attabalVarArytenoidectomy.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return;
        }
        while (true) {
            impromptu(decoder, startIndex + first, builder, false);
            if (first == last) {
                return;
            } else {
                first += step;
            }
        }
    }

    @Override // asosan.impassible
    public void serialize(fastidiously.beachfront encoder, Collection value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iMarial = marial(value);
        bristol.beachfront descriptor = getDescriptor();
        fastidiously.wireman wiremanVarRotuma = encoder.rotuma(descriptor, iMarial);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itWireman = wireman(value);
        int i = 0;
        while (itWireman.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itWireman.next();
            Key key = next.getKey();
            Value value2 = next.getValue();
            int i2 = i + 1;
            wiremanVarRotuma.sealless(getDescriptor(), i, impassible(), key);
            i += 2;
            wiremanVarRotuma.sealless(getDescriptor(), i2, triweekly(), value2);
        }
        wiremanVarRotuma.dern(descriptor);
    }

    public final asosan.wireman<Value> triweekly() {
        return this.valueSerializer;
    }

    public sayid(asosan.wireman<Key> wiremanVar, asosan.wireman<Value> wiremanVar2) {
        super(null);
        this.keySerializer = wiremanVar;
        this.valueSerializer = wiremanVar2;
    }
}
