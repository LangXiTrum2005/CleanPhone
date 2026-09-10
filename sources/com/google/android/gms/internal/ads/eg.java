package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class eg implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg f13962b;

    public /* synthetic */ eg(fg fgVar, int i10) {
        this.f13961a = i10;
        this.f13962b = fgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13961a) {
            case 0:
                fg fgVar = this.f13962b;
                fgVar.getClass();
                try {
                    if (fgVar.f14392f == null && fgVar.f14393g) {
                        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(fgVar.f14387a);
                        advertisingIdClient.start();
                        fgVar.f14392f = advertisingIdClient;
                        break;
                    }
                } catch (i9.f | i9.g | IOException unused) {
                    fgVar.f14392f = null;
                    return;
                }
                break;
            default:
                am.a(this.f13962b.f14387a);
                break;
        }
    }
}
