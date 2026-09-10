package f;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.u0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements jk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f40213b;

    public /* synthetic */ c(ComponentActivity componentActivity, int i10) {
        this.f40212a = i10;
        this.f40213b = componentActivity;
    }

    @Override // jk.a
    public final Object invoke() {
        int i10 = this.f40212a;
        ComponentActivity componentActivity = this.f40213b;
        switch (i10) {
            case 0:
                int i11 = ComponentActivity.f3834a;
                componentActivity.reportFullyDrawn();
                return wj.r.f53297a;
            case 1:
                return ComponentActivity.u(componentActivity);
            case 2:
                int i12 = ComponentActivity.f3834a;
                x3.a aVar = new x3.a();
                componentActivity.getNavigationEventDispatcher().a(aVar);
                return aVar;
            case 3:
                int i13 = ComponentActivity.f3834a;
                return new u0(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
            default:
                int i14 = ComponentActivity.f3834a;
                t tVar = new t(new b(componentActivity, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (kotlin.jvm.internal.n.a(Looper.myLooper(), Looper.getMainLooper())) {
                        componentActivity.getLifecycle().a(new d(0, tVar, componentActivity));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new com.unity3d.services.ads.operation.show.b(14, componentActivity, tVar));
                    }
                }
                return tVar;
        }
    }
}
