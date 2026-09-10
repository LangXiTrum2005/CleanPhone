package sg.bigo.ads.api.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f47013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<WeakReference<InterfaceC0831a>> f47014b;

    /* JADX INFO: renamed from: sg.bigo.ads.api.core.a$a, reason: collision with other inner class name */
    public interface InterfaceC0831a {
        void a();

        void b();
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f47017a = new a(0);
    }

    private a() {
        this.f47014b = new ArrayList();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator<WeakReference<InterfaceC0831a>> it = this.f47014b.iterator();
        while (it.hasNext()) {
            it.next().get();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Iterator<WeakReference<InterfaceC0831a>> it = this.f47014b.iterator();
        while (it.hasNext()) {
            it.next().get();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Iterator<WeakReference<InterfaceC0831a>> it = this.f47014b.iterator();
        while (it.hasNext()) {
            InterfaceC0831a interfaceC0831a = it.next().get();
            if (interfaceC0831a != null) {
                interfaceC0831a.b();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f47013a = new WeakReference<>(activity);
        Iterator<WeakReference<InterfaceC0831a>> it = this.f47014b.iterator();
        while (it.hasNext()) {
            InterfaceC0831a interfaceC0831a = it.next().get();
            if (interfaceC0831a != null) {
                interfaceC0831a.a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    public static a a() {
        return b.f47017a;
    }
}
