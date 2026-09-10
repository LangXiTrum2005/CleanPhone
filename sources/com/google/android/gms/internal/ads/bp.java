package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.internal.util.client.zzo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ap f12836a;

    public bp(ap apVar) {
        Context context;
        this.f12836a = apVar;
        try {
            context = (Context) s9.b.y1(apVar.zzm());
        } catch (RemoteException | NullPointerException e10) {
            zzo.zzg("", e10);
            context = null;
        }
        if (context != null) {
            try {
                this.f12836a.zzn(new s9.b(new MediaView(context)));
            } catch (RemoteException e11) {
                zzo.zzg("", e11);
            }
        }
    }
}
