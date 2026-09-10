package com.facebook;

import android.os.Handler;
import com.facebook.internal.Validate;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/GraphRequestBatch;", "Ljava/util/AbstractList;", "Lcom/facebook/GraphRequest;", "Callback", "Companion", "OnProgressCallback", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class GraphRequestBatch extends AbstractList<GraphRequest> {
    public static final AtomicInteger f0 = new AtomicInteger();
    public Handler X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f15949Y;
    public final ArrayList Z;
    public final ArrayList e0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/GraphRequestBatch$Callback;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface Callback {
        void a(GraphRequestBatch graphRequestBatch);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/GraphRequestBatch$Companion;", "", "Ljava/util/concurrent/atomic/AtomicInteger;", "idGenerator", "Ljava/util/concurrent/atomic/AtomicInteger;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/GraphRequestBatch$OnProgressCallback;", "Lcom/facebook/GraphRequestBatch$Callback;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface OnProgressCallback extends Callback {
        void b();
    }

    public GraphRequestBatch() {
        this.f15949Y = String.valueOf(f0.incrementAndGet());
        this.e0 = new ArrayList();
        this.Z = new ArrayList();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean add(GraphRequest element) {
        Intrinsics.f(element, "element");
        return this.Z.add(element);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        GraphRequest element = (GraphRequest) obj;
        Intrinsics.f(element, "element");
        this.Z.add(i2, element);
    }

    public final void c(Callback callback) {
        ArrayList arrayList = this.e0;
        if (arrayList.contains(callback)) {
            return;
        }
        arrayList.add(callback);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.Z.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null ? obj instanceof GraphRequest : true) {
            return super.contains((GraphRequest) obj);
        }
        return false;
    }

    public final void d() {
        String str = GraphRequest.j;
        Validate.e(this);
        new GraphRequestAsyncTask(this).executeOnExecutor(FacebookSdk.e(), new Void[0]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        return (GraphRequest) this.Z.get(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj != null ? obj instanceof GraphRequest : true) {
            return super.indexOf((GraphRequest) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj != null ? obj instanceof GraphRequest : true) {
            return super.lastIndexOf((GraphRequest) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj != null ? obj instanceof GraphRequest : true) {
            return super.remove((GraphRequest) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        GraphRequest element = (GraphRequest) obj;
        Intrinsics.f(element, "element");
        return (GraphRequest) this.Z.set(i2, element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        return (GraphRequest) this.Z.remove(i2);
    }

    public GraphRequestBatch(Collection collection) {
        this.f15949Y = String.valueOf(f0.incrementAndGet());
        this.e0 = new ArrayList();
        this.Z = new ArrayList(collection);
    }

    public GraphRequestBatch(GraphRequest... graphRequestArr) {
        this.f15949Y = String.valueOf(f0.incrementAndGet());
        this.e0 = new ArrayList();
        this.Z = new ArrayList(ArraysKt.e(graphRequestArr));
    }
}
