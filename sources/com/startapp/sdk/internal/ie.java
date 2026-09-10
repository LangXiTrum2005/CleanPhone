package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Bundle;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: loaded from: classes6.dex */
public class ie extends cb {
    protected static final String LOG_TAG = "ie";

    public ie(Context context, bb bbVar, Bundle bundle) {
        super(context, bbVar, bundle);
    }

    private void sendMetaDataRequest(Context context) {
        AdPreferences adPreferences = new AdPreferences();
        new he(this, context, com.startapp.sdk.components.a.a(context).K, adPreferences, context, adPreferences).b();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            yh yhVar = (yh) com.startapp.sdk.components.a.a(this.context).g.a();
            m8 m8Var = (m8) yhVar.f41716b.a();
            m8Var.f41243a.post(new sh(yhVar));
            MetaData.c(this.context);
            if (MetaData.E().m0()) {
                sendMetaDataRequest(this.context);
            } else {
                this.callback.a();
            }
        } catch (Throwable th) {
            g9.a(th);
        }
    }
}
