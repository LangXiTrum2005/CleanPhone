package io.flutter.plugin.platform;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43388b;

    public /* synthetic */ v(Object obj, int i10) {
        this.f43387a = i10;
        this.f43388b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43387a) {
            case 0:
                a5.j jVar = (a5.j) this.f43388b;
                ((View) jVar.f3395b).postDelayed((k) jVar.f3396c, 128L);
                break;
            default:
                w wVar = (w) this.f43388b;
                wVar.f43389a.getViewTreeObserver().removeOnDrawListener(wVar);
                break;
        }
    }
}
