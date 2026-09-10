package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class pg {
    public static final pg d = new pg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41371a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f41372b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MetaDataRequest$RequestReason f41373c = MetaDataRequest$RequestReason.LAUNCH;

    public final synchronized void a(Context context, MetaDataRequest$RequestReason metaDataRequest$RequestReason) {
        this.f41371a = UUID.randomUUID().toString();
        this.f41372b = System.currentTimeMillis();
        this.f41373c = metaDataRequest$RequestReason;
        WeakHashMap weakHashMap = vi.f41589a;
        t tVar = t.d;
        tVar.f41492a.clear();
        tVar.f41493b.clear();
        tVar.f41494c.clear();
        MetaData.E().a(context, new AdPreferences(), metaDataRequest$RequestReason, false, null, true);
    }
}
