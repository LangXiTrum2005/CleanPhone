package k9;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f44403a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    public static Intent a(Context context, l0 l0Var) throws d0 {
        Bundle bundleCall;
        String str = l0Var.f44471a;
        if (str == null) {
            return new Intent().setComponent(l0Var.f44473c);
        }
        Intent intent = null;
        if (l0Var.f44474d) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f44403a);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    if (bundleCall != null) {
                        Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                        if (intent2 != null) {
                            intent = intent2;
                        } else {
                            PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                            if (pendingIntent != null) {
                                StringBuilder sb2 = new StringBuilder(str.length() + 72);
                                sb2.append("Dynamic lookup for intent failed for action ");
                                sb2.append(str);
                                sb2.append(" but has possible resolution");
                                Log.w("ServiceBindIntentUtils", sb2.toString());
                                throw new d0(new ConnectionResult(25, pendingIntent, null));
                            }
                        }
                    }
                    if (intent == null) {
                        Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str));
                    }
                } catch (Throwable th2) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th2;
                }
            } catch (RemoteException | IllegalArgumentException e10) {
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundleCall = null;
            }
        }
        return intent == null ? new Intent(str).setPackage(l0Var.f44472b) : intent;
    }
}
