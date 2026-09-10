package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.j60;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import d5.f;
import e5.l;
import g9.k;
import java.util.HashMap;
import java.util.HashSet;
import m5.i;
import rc.d;
import s9.a;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class WorkManagerUtil extends zzbn {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zze(@NonNull a aVar, @NonNull String str, @NonNull String str2) {
        return zzg(aVar, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final void zzf(@NonNull a aVar) {
        Context context = (Context) b.y1(aVar);
        try {
            l.c(context.getApplicationContext(), new j60(new d(9)));
        } catch (IllegalStateException unused) {
        }
        try {
            l lVarB = l.b(context);
            lVarB.f39112d.k(new n5.b(lVarB, 0));
            d5.d dVar = new d5.d();
            d5.b bVar = new d5.b();
            bVar.f38676a = 1;
            bVar.f38681f = -1L;
            bVar.f38682g = -1L;
            new HashSet();
            bVar.f38677b = false;
            bVar.f38678c = false;
            bVar.f38676a = 2;
            bVar.f38679d = false;
            bVar.f38680e = false;
            bVar.f38683h = dVar;
            bVar.f38681f = -1L;
            bVar.f38682g = -1L;
            k kVar = new k(OfflinePingSender.class);
            ((i) kVar.f41771c).f45891j = bVar;
            ((HashSet) kVar.f41772d).add("offline_ping_sender_work");
            lVarB.a(kVar.e());
        } catch (IllegalStateException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to instantiate WorkManager.", e10);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zzg(a aVar, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws Throwable {
        Context context = (Context) b.y1(aVar);
        try {
            l.c(context.getApplicationContext(), new j60(new d(9)));
        } catch (IllegalStateException unused) {
        }
        d5.d dVar = new d5.d();
        d5.b bVar = new d5.b();
        bVar.f38676a = 1;
        bVar.f38681f = -1L;
        bVar.f38682g = -1L;
        new HashSet();
        bVar.f38677b = false;
        bVar.f38678c = false;
        bVar.f38676a = 2;
        bVar.f38679d = false;
        bVar.f38680e = false;
        bVar.f38683h = dVar;
        bVar.f38681f = -1L;
        bVar.f38682g = -1L;
        HashMap map = new HashMap();
        map.put("uri", zzaVar.zza);
        map.put("gws_query_id", zzaVar.zzb);
        map.put(CampaignEx.JSON_KEY_IMAGE_URL, zzaVar.zzc);
        f fVar = new f(map);
        f.c(fVar);
        k kVar = new k(OfflineNotificationPoster.class);
        i iVar = (i) kVar.f41771c;
        iVar.f45891j = bVar;
        iVar.f45886e = fVar;
        ((HashSet) kVar.f41772d).add("offline_notification_work");
        try {
            l.b(context).a(kVar.e());
            return true;
        } catch (IllegalStateException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to instantiate WorkManager.", e10);
            return false;
        }
    }
}
