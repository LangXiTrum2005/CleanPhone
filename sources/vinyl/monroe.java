package vinyl;

import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\n\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u000b\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lvinyl/monroe;", "K", "V", "Lvinyl/dent;", "Lkotlin/Pair;", "Lasosan/wireman;", "keySerializer", "valueSerializer", "<init>", "(Lasosan/wireman;Lasosan/wireman;)V", X3.i.W, "value", "cutely", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "Lbristol/beachfront;", "dern", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "impromptu", "(Lkotlin/Pair;)Ljava/lang/Object;", "taiyuan", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class monroe<K, V> extends dent<K, V, Pair<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final bristol.beachfront descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public monroe(final asosan.wireman<K> keySerializer, final asosan.wireman<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.descriptor = bristol.formularize.dern("kotlin.Pair", new bristol.beachfront[0], new Function1() { // from class: vinyl.lightstruck
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return monroe.competently(keySerializer, valueSerializer, (bristol.attabal) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit competently(asosan.wireman wiremanVar, asosan.wireman wiremanVar2, bristol.attabal buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        bristol.attabal.saneness(buildClassSerialDescriptor, "first", wiremanVar.getDescriptor(), null, false, 12, null);
        bristol.attabal.saneness(buildClassSerialDescriptor, "second", wiremanVar2.getDescriptor(), null, false, 12, null);
        return Unit.f29295attabal;
    }

    @Override // vinyl.dent
    /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
    public Pair<K, V> marial(K key, V value) {
        return patroclinal.formularize.attabal(key, value);
    }

    @Override // asosan.wireman, asosan.impassible, asosan.dern
    public bristol.beachfront getDescriptor() {
        return this.descriptor;
    }

    @Override // vinyl.dent
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public K attabal(Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.getFirst();
    }

    @Override // vinyl.dent
    /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
    public V dern(Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.getSecond();
    }
}
