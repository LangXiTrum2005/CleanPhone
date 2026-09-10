package wi;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import bc.r;
import java.util.Objects;
import p.s;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements xi.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f53247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f53248c;

    public /* synthetic */ j(int i10, Object obj, Object obj2) {
        this.f53246a = i10;
        this.f53248c = obj;
        this.f53247b = obj2;
    }

    @Override // xi.o
    public final void a(Object obj) {
        switch (this.f53246a) {
            case 0:
                ((s) this.f53248c).f47793f = (byte[]) this.f53247b;
                break;
            case 1:
                ((oi.f) this.f53247b).a(((p) ((b) this.f53248c).f53211a).f53826c.b(obj));
                break;
            default:
                ((Handler) this.f53248c).post(new w1.b(5, this, obj));
                break;
        }
    }

    @Override // xi.o
    public final void b(String str, String str2, Object obj) {
        switch (this.f53246a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            case 1:
                ((oi.f) this.f53247b).a(((p) ((b) this.f53248c).f53211a).f53826c.f(str, str2, obj));
                break;
            default:
                ((Handler) this.f53248c).post(new r(this, str, str2, obj, 29));
                break;
        }
    }

    @Override // xi.o
    public final void c() {
        switch (this.f53246a) {
            case 0:
                break;
            case 1:
                ((oi.f) this.f53247b).a(null);
                break;
            default:
                Handler handler = (Handler) this.f53248c;
                j jVar = (j) this.f53247b;
                Objects.requireNonNull(jVar);
                handler.post(new q1.c(jVar, 14));
                break;
        }
    }

    public j(j jVar) {
        this.f53246a = 2;
        this.f53248c = new Handler(Looper.getMainLooper());
        this.f53247b = jVar;
    }

    private final void d() {
    }
}
