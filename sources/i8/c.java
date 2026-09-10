package i8;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.provider.MediaStore;
import java.util.ArrayList;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f42909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Application f42910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f42911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f42912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f42913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f42914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f42915g;

    public c() {
        a bVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            bVar = new j8.a(0);
        } else if (i10 == 33) {
            bVar = new j8.a(1);
        } else {
            if (34 > i10 || i10 >= Integer.MAX_VALUE) {
                throw new UnsupportedOperationException("This sdk version is not supported yet.");
            }
            bVar = new j8.b();
        }
        this.f42911c = bVar;
        this.f42912d = new ArrayList();
        this.f42913e = new ArrayList();
        this.f42914f = new ArrayList();
    }

    public static boolean a(Context applicationContext) {
        n.f(applicationContext, "applicationContext");
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        return MediaStore.canManageMedia(applicationContext);
    }
}
