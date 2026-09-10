package f;

import androidx.activity.ComponentActivity;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f40211b;

    public /* synthetic */ b(ComponentActivity componentActivity, int i10) {
        this.f40210a = i10;
        this.f40211b = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f40210a;
        ComponentActivity componentActivity = this.f40211b;
        switch (i10) {
            case 0:
                int i11 = ComponentActivity.f3834a;
                componentActivity.invalidateMenu();
                break;
            default:
                ComponentActivity.D(componentActivity);
                break;
        }
    }
}
