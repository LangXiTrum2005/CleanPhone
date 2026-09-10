package p002kotlin.reflect.jvm.internal.impl.descriptors;

import byname.marial;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Pair;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;
import presbytery.impromptu;

/* JADX INFO: compiled from: ValueClassRepresentation.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class dent<Type extends impromptu> {
    public /* synthetic */ dent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean attabal(marial marialVar);

    public final <Other extends impromptu> dent<Other> dern(Function1<? super Type, ? extends Other> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (this instanceof gintrap) {
            gintrap gintrapVar = (gintrap) this;
            return new gintrap(gintrapVar.wireman(), transform.invoke(gintrapVar.marial()));
        }
        if (!(this instanceof oilcan)) {
            throw new NoWhenBranchMatchedException();
        }
        List<Pair<marial, Type>> listSaneness = saneness();
        ArrayList arrayList = new ArrayList(dovishness.gintrap(listSaneness, 10));
        Iterator<T> it = listSaneness.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(formularize.attabal((marial) pair.component1(), transform.invoke((impromptu) pair.component2())));
        }
        return new oilcan(arrayList);
    }

    public abstract List<Pair<marial, Type>> saneness();

    public dent() {
    }
}
