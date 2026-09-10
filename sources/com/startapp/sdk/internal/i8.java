package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class i8 extends y1 {
    public i8(Context context, mg mgVar) {
        super(context, mgVar);
    }

    @Override // com.startapp.sdk.internal.y1
    public final void a() {
        try {
            long millis = TimeUnit.SECONDS.toMillis(MetaData.E().T().k());
            hg hgVar = new hg(this.f41697a, this.f41698b);
            this.f41699c.postDelayed(new h8(this, hgVar), millis);
            hgVar.a();
        } catch (Throwable th) {
            g9.a(th);
            this.f41698b.a(null);
        }
    }
}
