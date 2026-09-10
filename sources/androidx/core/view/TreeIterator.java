package androidx.core.view;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/core/view/TreeIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TreeIterator<T> implements Iterator<T>, KMappedMarker {
    public final Function1 X = ViewGroupKt$descendants$1$1.X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ArrayList f4460Y = new ArrayList();
    public Iterator Z;

    public TreeIterator(Iterator it) {
        this.Z = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Z.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.Z.next();
        Iterator it = (Iterator) ViewGroupKt$descendants$1$1.X.invoke(next);
        ArrayList arrayList = this.f4460Y;
        if (it != null && it.hasNext()) {
            arrayList.add(this.Z);
            this.Z = it;
            return next;
        }
        while (!this.Z.hasNext() && !arrayList.isEmpty()) {
            this.Z = (Iterator) CollectionsKt.F(arrayList);
            CollectionsKt.T(arrayList);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
