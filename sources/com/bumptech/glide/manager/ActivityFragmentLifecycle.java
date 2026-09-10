package com.bumptech.glide.manager;

import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class ActivityFragmentLifecycle implements Lifecycle {
    public final Set X = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f12746Y;
    public boolean Z;

    @Override // com.bumptech.glide.manager.Lifecycle
    public final void a(LifecycleListener lifecycleListener) {
        this.X.remove(lifecycleListener);
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public final void b(LifecycleListener lifecycleListener) {
        this.X.add(lifecycleListener);
        if (this.Z) {
            lifecycleListener.onDestroy();
        } else if (this.f12746Y) {
            lifecycleListener.onStart();
        } else {
            lifecycleListener.onStop();
        }
    }

    public final void c() {
        this.Z = true;
        Iterator it = Util.e(this.X).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onDestroy();
        }
    }
}
