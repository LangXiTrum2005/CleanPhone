package vinyl;

import java.util.ArrayList;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\n\b\u0001\u0010\u0003*\u0004\u0018\u00018\u00002*\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00070\u0004B#\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u000e*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001e\u001a\u00020\u001d*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010\u001c\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010\"\u001a\u00020\u001d*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\"\u0010#R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010+\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lvinyl/molet;", "", "ElementKlass", "Element", "Lvinyl/gintrap;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lkurbash/wireman;", "kClass", "Lasosan/wireman;", "eSerializer", "<init>", "(Lkurbash/wireman;Lasosan/wireman;)V", "", "molybdenite", "([Ljava/lang/Object;)I", "", "polloi", "([Ljava/lang/Object;)Ljava/util/Iterator;", "kowloon", "()Ljava/util/ArrayList;", "arytenoidectomy", "(Ljava/util/ArrayList;)I", "dovishness", "(Ljava/util/ArrayList;)[Ljava/lang/Object;", "adultoid", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "size", "", "monoploid", "(Ljava/util/ArrayList;I)V", "index", "element", "graveside", "(Ljava/util/ArrayList;ILjava/lang/Object;)V", "saneness", "Lkurbash/wireman;", "Lbristol/beachfront;", "dern", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class molet<ElementKlass, Element extends ElementKlass> extends gintrap<Element, Element[], ArrayList<Element>> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final bristol.beachfront descriptor;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final kurbash.wireman<ElementKlass> kClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public molet(kurbash.wireman<ElementKlass> kClass, asosan.wireman<Element> eSerializer) {
        super(eSerializer, null);
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.kClass = kClass;
        this.descriptor = new wireman(eSerializer.getDescriptor());
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: adultoid, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> apical(Element[] elementArr) {
        Intrinsics.checkNotNullParameter(elementArr, "<this>");
        return new ArrayList<>(p002kotlin.collections.arytenoidectomy.wireman(elementArr));
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: arytenoidectomy, reason: merged with bridge method [inline-methods] */
    public int saneness(ArrayList<Element> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: dovishness, reason: merged with bridge method [inline-methods] */
    public Element[] formularize(ArrayList<Element> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return (Element[]) unconsolidated.monoploid(arrayList, this.kClass);
    }

    @Override // vinyl.gintrap, asosan.wireman, asosan.impassible, asosan.dern
    public bristol.beachfront getDescriptor() {
        return this.descriptor;
    }

    @Override // vinyl.gintrap
    /* JADX INFO: renamed from: graveside, reason: merged with bridge method [inline-methods] */
    public void triweekly(ArrayList<Element> arrayList, int i, Element element) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i, element);
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: kowloon, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> attabal() {
        return new ArrayList<>();
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: molybdenite, reason: merged with bridge method [inline-methods] */
    public int marial(Element[] elementArr) {
        Intrinsics.checkNotNullParameter(elementArr, "<this>");
        return elementArr.length;
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
    public void dern(ArrayList<Element> arrayList, int i) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.ensureCapacity(i);
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
    public Iterator<Element> wireman(Element[] elementArr) {
        Intrinsics.checkNotNullParameter(elementArr, "<this>");
        return p002kotlin.jvm.internal.saneness.attabal(elementArr);
    }
}
