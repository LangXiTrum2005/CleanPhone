package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.zzh;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hj extends zzc {
    public final /* synthetic */ int F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj(Context context, Looper looper, int i10, k9.b bVar, k9.c cVar) {
        super(context, looper, i10, bVar, cVar);
        this.F = 1;
    }

    @Override // k9.f
    public final IInterface a(IBinder iBinder) {
        switch (this.F) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
                return iInterfaceQueryLocalInterface instanceof jj ? (jj) iInterfaceQueryLocalInterface : new jj(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
                return iInterfaceQueryLocalInterface2 instanceof pr ? (pr) iInterfaceQueryLocalInterface2 : new pr(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                return iInterfaceQueryLocalInterface3 instanceof gx ? (gx) iInterfaceQueryLocalInterface3 : new fx(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
        }
    }

    @Override // k9.f
    public final String e() {
        switch (this.F) {
            case 0:
                return "com.google.android.gms.ads.internal.cache.ICacheService";
            case 1:
                return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
            default:
                return "com.google.android.gms.ads.internal.request.IAdRequestService";
        }
    }

    @Override // k9.f
    public final String f() {
        switch (this.F) {
            case 0:
                return "com.google.android.gms.ads.service.CACHE";
            case 1:
                return "com.google.android.gms.ads.service.HTTP";
            default:
                return "com.google.android.gms.ads.service.START";
        }
    }

    @Override // k9.f
    public i9.c[] getApiFeatures() {
        switch (this.F) {
            case 0:
                return zzh.zzb;
            default:
                return super.getApiFeatures();
        }
    }

    @Override // k9.f
    public int getMinApkVersion() {
        switch (this.F) {
            case 2:
                return ModuleDescriptor.MODULE_VERSION;
            default:
                return super.getMinApkVersion();
        }
    }

    public boolean j() {
        i9.c[] availableFeatures = getAvailableFeatures();
        if (((Boolean) zzba.zzc().a(am.G2)).booleanValue()) {
            i9.c cVar = zzh.zza;
            int length = availableFeatures != null ? availableFeatures.length : 0;
            for (int i10 = 0; i10 < length; i10++) {
                if (k9.c0.l(availableFeatures[i10], cVar)) {
                    if (i10 >= 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public hj(Context context, Looper looper, k9.b bVar, k9.c cVar, int i10) {
        this.F = i10;
        switch (i10) {
            case 2:
                int i11 = tx.f20518a;
                Context applicationContext = context.getApplicationContext();
                super(applicationContext != null ? applicationContext : context, looper, 8, bVar, cVar);
                break;
            default:
                int i12 = tx.f20518a;
                Context applicationContext2 = context.getApplicationContext();
                super(applicationContext2 == null ? context : applicationContext2, looper, 123, bVar, cVar);
                break;
        }
    }
}
