package r9;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f49513b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f7.a f49514a;

    static {
        c cVar = new c();
        cVar.f49514a = null;
        f49513b = cVar;
    }

    public static f7.a a(Context context) {
        f7.a aVar;
        c cVar = f49513b;
        synchronized (cVar) {
            try {
                if (cVar.f49514a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f49514a = new f7.a(context, 5);
                }
                aVar = cVar.f49514a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }
}
