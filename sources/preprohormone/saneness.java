package preprohormone;

import dovishness.beachfront;
import java.util.Collection;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.collections.apical;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PersistentOrderedSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u0000 ,*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001-B/\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0011J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lpreprohormone/saneness;", "E", "Lkotlin/collections/apical;", "Ldovishness/beachfront;", "", "firstElement", "lastElement", "Lrotuma/wireman;", "Lpreprohormone/attabal;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lrotuma/wireman;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "(Ljava/lang/Object;)Ldovishness/beachfront;", "", "elements", "addAll", "(Ljava/util/Collection;)Ldovishness/beachfront;", "remove", "removeAll", "", "iterator", "()Ljava/util/Iterator;", "Ldovishness/beachfront$attabal;", "builder", "()Ldovishness/beachfront$attabal;", "arytenoidectomy", "Ljava/lang/Object;", "marial", "()Ljava/lang/Object;", "monoploid", "competently", "polloi", "Lrotuma/wireman;", "beachfront", "()Lrotuma/wireman;", "", "getSize", "()I", "size", "molybdenite", "attabal", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class saneness<E> extends apical<E> implements beachfront<E> {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final saneness f35654adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final Object firstElement;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final Object lastElement;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final rotuma.wireman<E, attabal> hashMap;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final int f35655graveside = 8;

    /* JADX INFO: renamed from: preprohormone.saneness$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: PersistentOrderedSet.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lpreprohormone/saneness$attabal;", "", "<init>", "()V", "E", "Ldovishness/beachfront;", "attabal", "()Ldovishness/beachfront;", "Lpreprohormone/saneness;", "", "EMPTY", "Lpreprohormone/saneness;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <E> beachfront<E> attabal() {
            return saneness.f35654adultoid;
        }

        public Companion() {
        }
    }

    static {
        cord.dern dernVar = cord.dern.f24045attabal;
        f35654adultoid = new saneness(dernVar, dernVar, rotuma.wireman.INSTANCE.attabal());
    }

    public saneness(Object obj, Object obj2, rotuma.wireman<E, attabal> wiremanVar) {
        this.firstElement = obj;
        this.lastElement = obj2;
        this.hashMap = wiremanVar;
    }

    @Override // java.util.Collection, java.util.Set, dovishness.beachfront
    public beachfront<E> add(E element) {
        if (this.hashMap.containsKey(element)) {
            return this;
        }
        if (isEmpty()) {
            return new saneness(element, element, this.hashMap.adultoid(element, new attabal()));
        }
        Object obj = this.lastElement;
        attabal attabalVar = this.hashMap.get(obj);
        Intrinsics.beachfront(attabalVar);
        return new saneness(this.firstElement, element, this.hashMap.adultoid((E) obj, attabalVar.marial(element)).adultoid(element, new attabal(obj)));
    }

    @Override // java.util.Collection, java.util.Set, dovishness.beachfront
    public beachfront<E> addAll(Collection<? extends E> elements) {
        beachfront.attabal<E> attabalVarBuilder = builder();
        attabalVarBuilder.addAll(elements);
        return attabalVarBuilder.build();
    }

    public final rotuma.wireman<E, attabal> beachfront() {
        return this.hashMap;
    }

    @Override // dovishness.beachfront
    public beachfront.attabal<E> builder() {
        return new dern(this);
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final Object getLastElement() {
        return this.lastElement;
    }

    @Override // p002kotlin.collections.saneness, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return this.hashMap.containsKey(element);
    }

    @Override // p002kotlin.collections.saneness
    /* JADX INFO: renamed from: getSize */
    public int get_size() {
        return this.hashMap.size();
    }

    @Override // p002kotlin.collections.apical, p002kotlin.collections.saneness, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new wireman(this.firstElement, this.hashMap);
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final Object getFirstElement() {
        return this.firstElement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, dovishness.beachfront
    public beachfront<E> remove(E element) {
        attabal attabalVar = this.hashMap.get(element);
        if (attabalVar == null) {
            return this;
        }
        rotuma.wireman wiremanVarDovishness = this.hashMap.dovishness(element);
        if (attabalVar.saneness()) {
            V v = wiremanVarDovishness.get(attabalVar.getPrevious());
            Intrinsics.beachfront(v);
            wiremanVarDovishness = wiremanVarDovishness.adultoid(attabalVar.getPrevious(), ((attabal) v).marial(attabalVar.getNext()));
        }
        if (attabalVar.attabal()) {
            V v2 = wiremanVarDovishness.get(attabalVar.getNext());
            Intrinsics.beachfront(v2);
            wiremanVarDovishness = wiremanVarDovishness.adultoid(attabalVar.getNext(), ((attabal) v2).beachfront(attabalVar.getPrevious()));
        }
        return new saneness(!attabalVar.saneness() ? attabalVar.getNext() : this.firstElement, !attabalVar.attabal() ? attabalVar.getPrevious() : this.lastElement, wiremanVarDovishness);
    }

    @Override // java.util.Collection, java.util.Set, dovishness.beachfront
    public beachfront<E> removeAll(Collection<? extends E> elements) {
        beachfront.attabal<E> attabalVarBuilder = builder();
        attabalVarBuilder.removeAll(elements);
        return attabalVarBuilder.build();
    }
}
