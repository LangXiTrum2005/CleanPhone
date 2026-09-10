package ud;

import android.content.Context;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f52031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wj.j f52032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wj.j f52034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wj.j f52035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f52036f;

    public c0(Context appContext, h1 uuidGenerator) {
        kotlin.jvm.internal.n.f(appContext, "appContext");
        kotlin.jvm.internal.n.f(uuidGenerator, "uuidGenerator");
        this.f52031a = appContext;
        final int i10 = 0;
        this.f52032b = r9.b.u(new jk.a(this) { // from class: ud.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f52018b;

            {
                this.f52018b = this;
            }

            @Override // jk.a
            public final Object invoke() {
                int i11 = i10;
                c0 c0Var = this.f52018b;
                switch (i11) {
                    case 0:
                        return ((e0) c0Var.f52035e.getValue()).f52063a;
                    default:
                        return f0.b(c0Var.f52031a);
                }
            }
        });
        this.f52033c = Process.myPid();
        this.f52034d = r9.b.u(new f.q(uuidGenerator, 3));
        final int i11 = 1;
        this.f52035e = r9.b.u(new jk.a(this) { // from class: ud.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f52018b;

            {
                this.f52018b = this;
            }

            @Override // jk.a
            public final Object invoke() {
                int i12 = i11;
                c0 c0Var = this.f52018b;
                switch (i12) {
                    case 0:
                        return ((e0) c0Var.f52035e.getValue()).f52063a;
                    default:
                        return f0.b(c0Var.f52031a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.f52032b.getValue();
    }

    public final Map b(Map map) {
        wj.j jVar = this.f52034d;
        if (map == null) {
            return xj.b0.P(new wj.f(a(), new a0(Process.myPid(), (String) jVar.getValue())));
        }
        LinkedHashMap linkedHashMapY = xj.b0.Y(map);
        linkedHashMapY.put(a(), new a0(Process.myPid(), (String) jVar.getValue()));
        return xj.b0.X(linkedHashMapY);
    }
}
