package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ov extends NativeAd.AdChoicesInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f18383a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18384b;

    public ov(ho hoVar) {
        try {
            this.f18384b = hoVar.zzb();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            this.f18384b = "";
        }
        try {
            for (Object obj : hoVar.zzc()) {
                mo moVarX1 = obj instanceof IBinder ? yn.x1((IBinder) obj) : null;
                if (moVarX1 != null) {
                    this.f18383a.add(new qv(moVarX1));
                }
            }
        } catch (RemoteException e11) {
            zzo.zzg("", e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List getImages() {
        return this.f18383a;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.f18384b;
    }
}
