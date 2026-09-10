package vinyl;

import java.util.LinkedHashSet;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\f*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0013\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0019\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lvinyl/timberyard;", "E", "Lvinyl/rotuma;", "", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Lasosan/wireman;", "eSerializer", "<init>", "(Lasosan/wireman;)V", "monoploid", "()Ljava/util/LinkedHashSet;", "", "polloi", "(Ljava/util/LinkedHashSet;)I", "dovishness", "(Ljava/util/LinkedHashSet;)Ljava/util/Set;", "adultoid", "(Ljava/util/Set;)Ljava/util/LinkedHashSet;", "size", "", "molybdenite", "(Ljava/util/LinkedHashSet;I)V", "index", "element", "graveside", "(Ljava/util/LinkedHashSet;ILjava/lang/Object;)V", "Lbristol/beachfront;", "saneness", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class timberyard<E> extends rotuma<E, Set<? extends E>, LinkedHashSet<E>> {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final bristol.beachfront descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public timberyard(asosan.wireman<E> eSerializer) {
        super(eSerializer);
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.descriptor = new premeiotic(eSerializer.getDescriptor());
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: adultoid, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<E> apical(Set<? extends E> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet<E> linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet<>(set) : linkedHashSet;
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: dovishness, reason: merged with bridge method [inline-methods] */
    public Set<E> formularize(LinkedHashSet<E> linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet;
    }

    @Override // vinyl.gintrap, asosan.wireman, asosan.impassible, asosan.dern
    public bristol.beachfront getDescriptor() {
        return this.descriptor;
    }

    @Override // vinyl.gintrap
    /* JADX INFO: renamed from: graveside, reason: merged with bridge method [inline-methods] */
    public void triweekly(LinkedHashSet<E> linkedHashSet, int i, E e) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        linkedHashSet.add(e);
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: molybdenite, reason: merged with bridge method [inline-methods] */
    public void dern(LinkedHashSet<E> linkedHashSet, int i) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<E> attabal() {
        return new LinkedHashSet<>();
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
    public int saneness(LinkedHashSet<E> linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }
}
