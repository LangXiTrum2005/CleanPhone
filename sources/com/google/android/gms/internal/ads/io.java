package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class io extends NativeAd.AdChoicesInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15809a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15810b;

    public io(ho hoVar) {
        mo loVar;
        try {
            this.f15810b = hoVar.zzb();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            this.f15810b = "";
        }
        try {
            for (Object obj : hoVar.zzc()) {
                if (obj instanceof IBinder) {
                    IBinder iBinder = (IBinder) obj;
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    loVar = iInterfaceQueryLocalInterface instanceof mo ? (mo) iInterfaceQueryLocalInterface : new lo(iBinder);
                } else {
                    loVar = null;
                }
                if (loVar != null) {
                    this.f15809a.add(new no(loVar));
                }
            }
        } catch (RemoteException e11) {
            zzo.zzg("", e11);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List getImages() {
        return this.f15809a;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.f15810b;
    }
}
