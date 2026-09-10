package k;

import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f44120a;

    public g(AppCompatActivity appCompatActivity) {
        this.f44120a = appCompatActivity;
    }

    @Override // g.b
    public final void a(ComponentActivity componentActivity) {
        AppCompatActivity appCompatActivity = this.f44120a;
        l lVarH = appCompatActivity.H();
        lVarH.a();
        appCompatActivity.getSavedStateRegistry().a("androidx:appcompat");
        lVarH.d();
    }
}
