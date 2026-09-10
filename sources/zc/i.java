package zc;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.applovin.impl.da;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import tj.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f54835c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static f0 f54836d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f54837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f54838b;

    public i(ExecutorService executorService) {
        this.f54838b = new x.e(0);
        this.f54837a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z10) {
        f0 f0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f54835c) {
            try {
                if (f54836d == null) {
                    f54836d = new f0(context);
                }
                f0Var = f54836d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10) {
            return f0Var.b(intent).continueWith(new da(1), new h(0));
        }
        if (u.t().v(context)) {
            synchronized (c0.f54815b) {
                try {
                    c0.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        c0.f54816c.a(c0.f54814a);
                    }
                    f0Var.b(intent).addOnCompleteListener(new i0(intent, 19));
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } else {
            f0Var.b(intent);
        }
        return Tasks.forResult(-1);
    }

    public Task b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.f54837a;
        da daVar = (da) this.f54838b;
        boolean z10 = context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z11 = (intent.getFlags() & 268435456) != 0;
        return (!z10 || z11) ? Tasks.call(daVar, new com.unity3d.ads.core.data.repository.a(3, context, intent)).continueWithTask(daVar, new com.applovin.impl.sdk.ad.f(context, intent, z11)) : a(context, intent, z11);
    }

    public i(Context context) {
        this.f54837a = context;
        this.f54838b = new da(1);
    }
}
