package com.mbridge.msdk.config.component.status;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f32389a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32390b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32391c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f32392d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f32393e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Handler f32394f = new Handler();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f32395g = new com.mbridge.msdk.config.component.info.provider.subprovider.f(this, 1);

    public b(Context context) {
        if (context == null) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        a();
        b();
    }

    public void b(a aVar) {
        try {
            this.f32389a.remove(aVar);
        } catch (Throwable unused) {
            q0.b("LifecyclePublisher", "remove subscriber error");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        a("LifecycleChanged", "onActivityCreated");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        a("LifecycleChanged", "onActivityDestroyed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        this.f32391c--;
        a("LifecycleChanged", "onActivityPaused");
        if (this.f32391c == 0) {
            this.f32394f.postDelayed(this.f32395g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        this.f32391c++;
        a("LifecycleChanged", "onActivityResumed");
        if (this.f32391c == 1) {
            if (!this.f32392d) {
                this.f32394f.removeCallbacks(this.f32395g);
            } else {
                a("916003", "");
                this.f32392d = false;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        this.f32390b++;
        a("LifecycleChanged", "onActivityStarted");
        if (this.f32390b == 1 && this.f32393e) {
            this.f32393e = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        this.f32390b--;
        a("LifecycleChanged", "onActivityStopped");
        b();
    }

    public void a(a aVar) {
        try {
            this.f32389a.add(aVar);
        } catch (Throwable unused) {
            q0.b("LifecyclePublisher", "add subscriber error");
        }
    }

    private void b() {
        if (this.f32390b == 0 && this.f32392d) {
            a("916004", "");
            this.f32393e = true;
        }
    }

    private void a(com.mbridge.msdk.config.component.base.b bVar) {
        try {
            Iterator<a> it = this.f32389a.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        } catch (Throwable unused) {
            q0.b("LifecyclePublisher", "notifySubscriber error");
        }
    }

    private void a(String str, String str2) {
        com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
        bVar.b(str);
        HashMap map = new HashMap();
        map.put(com.mbridge.msdk.config.component.common.util.c.c("100"), str2);
        bVar.a(map);
        a(bVar);
    }

    private void a() {
        if (this.f32391c == 0) {
            this.f32392d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }
}
