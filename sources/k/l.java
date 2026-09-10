package k;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f44125a = new k(new a7.g(4));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f44126b = -100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static i0.e f44127c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static i0.e f44128d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f44129e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f44130f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x.f f44131g = new x.f(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f44132h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f44133i = new Object();

    public static boolean b(Context context) {
        if (f44129e == null) {
            try {
                int i10 = a0.f44039a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) a0.class), z.a() | 128).metaData;
                if (bundle != null) {
                    f44129e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f44129e = Boolean.FALSE;
            }
        }
        return f44129e.booleanValue();
    }

    public static void f(v vVar) {
        synchronized (f44132h) {
            try {
                x.f fVar = f44131g;
                fVar.getClass();
                x.a aVar = new x.a(fVar);
                while (aVar.hasNext()) {
                    l lVar = (l) ((WeakReference) aVar.next()).get();
                    if (lVar == vVar || lVar == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void a();

    public abstract void d();

    public abstract void e();

    public abstract boolean g(int i10);

    public abstract void h(int i10);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void k(CharSequence charSequence);
}
