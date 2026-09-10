package com.facebook.login;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;

/* JADX INFO: loaded from: classes3.dex */
public class CustomTabPrefetchHelper extends CustomTabsServiceConnection {
    public static CustomTabsClient X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static CustomTabsSession f16459Y;

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        CustomTabsClient customTabsClient2;
        X = customTabsClient;
        customTabsClient.e();
        if (f16459Y != null || (customTabsClient2 = X) == null) {
            return;
        }
        f16459Y = customTabsClient2.d(null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
