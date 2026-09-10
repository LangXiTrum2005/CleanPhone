package kj;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f44699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f44700b;

    public o(p pVar, Activity activity) {
        this.f44700b = pVar;
        this.f44699a = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f44699a != activity || activity.getApplicationContext() == null) {
            return;
        }
        ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.f44699a == activity) {
            n nVar = (n) this.f44700b.f44702b.f40782d;
            synchronized (nVar.l) {
                try {
                    v9.e eVar = nVar.f44698k;
                    if (eVar == null) {
                        return;
                    }
                    q qVar = (q) eVar.f52503b;
                    f7.a aVar = nVar.f44691d;
                    int i10 = qVar != null ? 1 : 2;
                    aVar.getClass();
                    int iC = v0.i.c(i10);
                    if (iC == 0) {
                        aVar.f40681b.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_type", "image").apply();
                    } else if (iC == 1) {
                        aVar.f40681b.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_type", "video").apply();
                    }
                    if (qVar != null) {
                        SharedPreferences.Editor editorEdit = nVar.f44691d.f40681b.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
                        Double d10 = qVar.f44703a;
                        if (d10 != null) {
                            editorEdit.putLong("flutter_image_picker_max_width", Double.doubleToRawLongBits(d10.doubleValue()));
                        }
                        Double d11 = qVar.f44704b;
                        if (d11 != null) {
                            editorEdit.putLong("flutter_image_picker_max_height", Double.doubleToRawLongBits(d11.doubleValue()));
                        }
                        editorEdit.putInt("flutter_image_picker_image_quality", (int) qVar.f44705c);
                        editorEdit.apply();
                    }
                    Uri uri = nVar.f44697j;
                    if (uri != null) {
                        nVar.f44691d.f40681b.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_pending_image_uri", uri.getPath()).apply();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(androidx.lifecycle.v vVar) {
        onActivityDestroyed(this.f44699a);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(androidx.lifecycle.v vVar) {
        onActivityStopped(this.f44699a);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void a(androidx.lifecycle.v vVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void d(androidx.lifecycle.v vVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void h(androidx.lifecycle.v vVar) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(androidx.lifecycle.v vVar) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
