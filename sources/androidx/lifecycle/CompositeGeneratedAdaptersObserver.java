package androidx.lifecycle;

import java.util.HashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CompositeGeneratedAdaptersObserver implements LifecycleEventObserver {
    public final GeneratedAdapter[] X;

    public CompositeGeneratedAdaptersObserver(GeneratedAdapter[] generatedAdapterArr) {
        this.X = generatedAdapterArr;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        new HashMap();
        GeneratedAdapter[] generatedAdapterArr = this.X;
        for (GeneratedAdapter generatedAdapter : generatedAdapterArr) {
            generatedAdapter.a();
        }
        for (GeneratedAdapter generatedAdapter2 : generatedAdapterArr) {
            generatedAdapter2.a();
        }
    }
}
