package com.bytedance.sdk.openadsdk.core.act;

import android.content.ComponentName;
import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;

/* JADX INFO: loaded from: classes2.dex */
public class ActServiceConnection extends CustomTabsServiceConnection {
    private LD mConnectionCallback;

    public ActServiceConnection(LD ld) {
        this.mConnectionCallback = ld;
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull CustomTabsClient customTabsClient) {
        LD ld = this.mConnectionCallback;
        if (ld != null) {
            ld.Lxb(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        LD ld = this.mConnectionCallback;
        if (ld != null) {
            ld.Lxb();
        }
    }
}
