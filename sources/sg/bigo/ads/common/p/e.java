package sg.bigo.ads.common.p;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class e {
    public static void a(Context context, String str, boolean z2, g gVar) {
        a(context, null, str, z2, gVar);
    }

    public static void b(Context context, Executor executor, String str, boolean z2, g gVar) {
        d.a.f47419a.a(context, executor, str, z2, gVar);
    }

    private static void c(Context context, Executor executor, String str, boolean z2, g gVar) {
        h.a.f47427a.a(context, executor, str, z2, gVar);
    }

    public static void a(final Context context, final List<String> list, final boolean z2, final g gVar) {
        if (list.size() == 0) {
            gVar.a(0, "urlList all download Failed", "");
        } else {
            a(context, list.remove(0), z2, new g() { // from class: sg.bigo.ads.common.p.e.1
                @Override // sg.bigo.ads.common.p.g
                public final void a(int i2, String str, String str2) {
                    e.a(context, (List<String>) list, z2, gVar);
                }

                @Override // sg.bigo.ads.common.p.g
                public final void a(Bitmap bitmap, f fVar) {
                    g gVar2 = gVar;
                    if (gVar2 != null) {
                        gVar2.a(bitmap, fVar);
                    }
                }
            });
        }
    }

    public static void a(Context context, Executor executor, String str, boolean z2, g gVar) {
        c(context, executor, str, z2, gVar);
    }

    public static boolean a(Context context, String str) {
        return h.a.f47427a.d(context, str);
    }
}
