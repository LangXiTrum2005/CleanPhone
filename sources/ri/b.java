package ri;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import cj.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f49594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f49595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Handler f49596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f49597e;

    public /* synthetic */ b(d dVar, Context context, Handler handler, l lVar, int i10) {
        this.f49593a = i10;
        this.f49594b = dVar;
        this.f49595c = context;
        this.f49596d = handler;
        this.f49597e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49593a) {
            case 0:
                d dVar = this.f49594b;
                try {
                    Handler.createAsync(Looper.getMainLooper()).post(new b(dVar, this.f49595c, this.f49596d, this.f49597e, 1));
                    return;
                } catch (Exception e10) {
                    Log.e("FlutterLoader", "Flutter initialization failed.", e10);
                    throw new RuntimeException(e10);
                }
            default:
                this.f49594b.a(this.f49595c.getApplicationContext(), null);
                this.f49596d.post(this.f49597e);
                return;
        }
    }
}
