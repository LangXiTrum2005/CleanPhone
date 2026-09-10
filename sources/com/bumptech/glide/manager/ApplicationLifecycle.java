package com.bumptech.glide.manager;

/* JADX INFO: loaded from: classes.dex */
class ApplicationLifecycle implements Lifecycle {
    @Override // com.bumptech.glide.manager.Lifecycle
    public final void a(LifecycleListener lifecycleListener) {
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public final void b(LifecycleListener lifecycleListener) {
        lifecycleListener.onStart();
    }
}
