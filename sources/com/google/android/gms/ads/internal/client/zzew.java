package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzew extends zzdf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10859b;

    public zzew(String str, String str2) {
        this.f10858a = str;
        this.f10859b = str2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final String zze() throws RemoteException {
        return this.f10858a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final String zzf() throws RemoteException {
        return this.f10859b;
    }
}
