package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yz implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f22414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m00 f22415b;

    public yz(zz zzVar, Context context, m00 m00Var) {
        this.f22414a = context;
        this.f22415b = m00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m00 m00Var = this.f22415b;
        try {
            m00Var.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.f22414a));
        } catch (i9.f | i9.g | IOException | IllegalStateException e10) {
            m00Var.zzd(e10);
            zzo.zzg("Exception while getting advertising Id info", e10);
        }
    }
}
