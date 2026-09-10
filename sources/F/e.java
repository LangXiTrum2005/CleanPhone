package f;

import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.lifecycle.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40218b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f40217a = i10;
        this.f40218b = obj;
    }

    @Override // androidx.lifecycle.t
    public final void onStateChanged(androidx.lifecycle.v vVar, androidx.lifecycle.m mVar) {
        Window window;
        View viewPeekDecorView;
        int i10 = this.f40217a;
        Object obj = this.f40218b;
        switch (i10) {
            case 0:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                int i11 = ComponentActivity.f3834a;
                if (mVar == androidx.lifecycle.m.ON_STOP && (window = componentActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                ComponentActivity.C((ComponentActivity) obj, vVar, mVar);
                break;
            default:
                j4.e this$0 = (j4.e) obj;
                kotlin.jvm.internal.n.f(this$0, "this$0");
                if (mVar == androidx.lifecycle.m.ON_START) {
                    this$0.f43706f = true;
                } else if (mVar == androidx.lifecycle.m.ON_STOP) {
                    this$0.f43706f = false;
                }
                break;
        }
    }
}
