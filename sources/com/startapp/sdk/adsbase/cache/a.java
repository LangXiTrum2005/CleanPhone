package com.startapp.sdk.adsbase.cache;

import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.j;
import com.startapp.sdk.internal.o;
import com.startapp.sdk.internal.p;
import com.startapp.sdk.internal.p6;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f40638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p6 f40639b;

    public a(p6 p6Var, ArrayList arrayList) {
        this.f40639b = p6Var;
        this.f40638a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        j jVar = this.f40639b.f41348b;
        ArrayList<DiskAdCacheManager$DiskCacheKey> arrayList = this.f40638a;
        if (arrayList != null) {
            try {
                for (DiskAdCacheManager$DiskCacheKey diskAdCacheManager$DiskCacheKey : arrayList) {
                    jVar.f41125a.a(null, diskAdCacheManager$DiskCacheKey.placement, diskAdCacheManager$DiskCacheKey.adPreferences, true, diskAdCacheManager$DiskCacheKey.a(), null, null);
                }
            } catch (Throwable th) {
                g9.a(th);
            }
        }
        p pVar = jVar.f41125a;
        pVar.d = false;
        for (o oVar : pVar.f41336e) {
            pVar.a(oVar.f41283a, oVar.f41284b, oVar.f41285c, false, 0, oVar.d, null);
        }
        pVar.f41336e.clear();
    }
}
