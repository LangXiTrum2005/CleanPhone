package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hq0 implements bs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fe1 f15363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f15364c;

    public /* synthetic */ hq0(Context context, fe1 fe1Var, int i10) {
        this.f15362a = i10;
        this.f15364c = context;
        this.f15363b = fe1Var;
    }

    public Intent a() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.Fc)).booleanValue();
        Context context = this.f15364c;
        return (!zBooleanValue || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final ListenableFuture zza() {
        switch (this.f15362a) {
            case 0:
                if (!((Boolean) zzba.zzc().a(am.De)).booleanValue()) {
                    return zw1.d(new iq0(0, null, false));
                }
                ContentResolver contentResolver = this.f15364c.getContentResolver();
                if (contentResolver == null) {
                    return zw1.d(new iq0(0, null, false));
                }
                return ((k00) this.f15363b).b(new sf(contentResolver, 10));
            case 1:
                return ((k00) this.f15363b).b(new sf(this, 13));
            case 2:
                return ((k00) this.f15363b).b(new sf(this, 14));
            case 3:
                return ((k00) this.f15363b).b(new sf(this, 16));
            case 4:
                return ((k00) this.f15363b).b(new sf(this, 17));
            case 5:
                return ((k00) this.f15363b).b(new sf(this, 26));
            case 6:
                if (!((Boolean) zm.f22660b.o()).booleanValue()) {
                    return zw1.d(new cs0(-1, -1));
                }
                return ((k00) this.f15363b).b(new sf(this, 27));
            default:
                return ((k00) this.f15363b).b(new sf(this, 29));
        }
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final int zzb() {
        switch (this.f15362a) {
            case 0:
                return 61;
            case 1:
                return 13;
            case 2:
                return 14;
            case 3:
                return 18;
            case 4:
                return 57;
            case 5:
                return 37;
            case 6:
                return 59;
            default:
                return 39;
        }
    }

    public /* synthetic */ hq0(fe1 fe1Var, Context context, int i10) {
        this.f15362a = i10;
        this.f15363b = fe1Var;
        this.f15364c = context;
    }
}
