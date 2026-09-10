package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomTabsServiceConnection implements ServiceConnection {
    private Context mApplicationContext;

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsServiceConnection$1, reason: invalid class name */
    public class AnonymousClass1 extends CustomTabsClient {
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        onCustomTabsServiceConnected(componentName, new AnonymousClass1(ICustomTabsService.Stub.b0(iBinder), componentName, this.mApplicationContext));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
