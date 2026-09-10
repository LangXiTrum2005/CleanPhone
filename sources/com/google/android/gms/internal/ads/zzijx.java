package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzijx extends CustomTabsServiceConnection {
    private final WeakReference zza;

    public zzijx(zzbhl zzbhlVar) {
        this.zza = new WeakReference(zzbhlVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbhl zzbhlVar = (zzbhl) this.zza.get();
        if (zzbhlVar != null) {
            zzbhlVar.zzf(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbhl zzbhlVar = (zzbhl) this.zza.get();
        if (zzbhlVar != null) {
            zzbhlVar.zzg();
        }
    }
}
