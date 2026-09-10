package g9;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import b2.p;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.measurement.u6;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f41766a = new p("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        f41766a.d("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static void b(Context context) {
        k.J(context).K();
        Set set = j9.l.f43751a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((j9.l) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        synchronized (com.google.android.gms.common.api.internal.e.f11691r) {
            try {
                com.google.android.gms.common.api.internal.e eVar = com.google.android.gms.common.api.internal.e.f11692s;
                if (eVar != null) {
                    eVar.f11701i.incrementAndGet();
                    u6 u6Var = eVar.f11705n;
                    u6Var.sendMessageAtFrontOfQueue(u6Var.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
