package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements LifecycleEventObserver {
    public final LifecycleObserver X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ClassesInfoCache.CallbackInfo f5254Y;

    public ReflectiveGenericLifecycleObserver(LifecycleObserver lifecycleObserver) {
        this.X = lifecycleObserver;
        ClassesInfoCache classesInfoCache = ClassesInfoCache.f5219c;
        Class<?> cls = lifecycleObserver.getClass();
        ClassesInfoCache.CallbackInfo callbackInfo = (ClassesInfoCache.CallbackInfo) classesInfoCache.f5220a.get(cls);
        this.f5254Y = callbackInfo == null ? classesInfoCache.a(cls, null) : callbackInfo;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        HashMap map = this.f5254Y.f5222a;
        List list = (List) map.get(event);
        LifecycleObserver lifecycleObserver = this.X;
        ClassesInfoCache.CallbackInfo.a(list, lifecycleOwner, event, lifecycleObserver);
        ClassesInfoCache.CallbackInfo.a((List) map.get(Lifecycle.Event.ON_ANY), lifecycleOwner, event, lifecycleObserver);
    }
}
