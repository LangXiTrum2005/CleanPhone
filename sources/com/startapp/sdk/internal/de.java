package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Bundle;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: loaded from: classes6.dex */
public class de extends cb {
    public de(Context context, bb bbVar, Bundle bundle) {
        super(context, bbVar, bundle);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!MetaData.E().l0()) {
                this.callback.a();
                return;
            }
            yh yhVar = (yh) com.startapp.sdk.components.a.a(this.context).g.a();
            m8 m8Var = (m8) yhVar.f41716b.a();
            m8Var.f41243a.post(new sh(yhVar));
            g9 g9Var = new g9(h9.f41042i);
            g9Var.j = true;
            try {
                com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.f40723U.f41603a;
                if (aVar != null) {
                    ((w9) aVar.q.a()).a(g9Var);
                } else {
                    this.callback.a();
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            g9.a(th);
        }
    }
}
