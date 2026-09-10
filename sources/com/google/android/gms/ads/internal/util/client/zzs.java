package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import t9.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzs {
    public static Object zza(Context context, String str, zzq zzqVar) throws zzr {
        try {
            try {
                return zzqVar.zza(d.c(context, d.f50563b, ModuleDescriptor.MODULE_ID).b(str));
            } catch (Exception e10) {
                throw new zzr(e10);
            }
        } catch (Exception e11) {
            throw new zzr(e11);
        }
    }

    public static Context zzb(Context context) throws zzr {
        try {
            return d.c(context, d.f50563b, ModuleDescriptor.MODULE_ID).f50576a;
        } catch (Exception e10) {
            throw new zzr(e10);
        }
    }
}
