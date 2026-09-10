package androidx.lifecycle;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/SingleGeneratedAdapterObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SingleGeneratedAdapterObserver implements LifecycleEventObserver {
    public final GeneratedAdapter X;

    public SingleGeneratedAdapterObserver(GeneratedAdapter generatedAdapter) {
        this.X = generatedAdapter;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        GeneratedAdapter generatedAdapter = this.X;
        generatedAdapter.a();
        generatedAdapter.a();
    }
}
