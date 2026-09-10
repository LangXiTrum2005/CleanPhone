package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import androidx.datastore.preferences.protobuf.a;

/* JADX INFO: loaded from: classes3.dex */
final class zabc extends com.google.android.gms.internal.base.zau {
    final /* synthetic */ zabe zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabc(zabe zabeVar, Looper looper) {
        super(looper);
        this.zaa = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            zabe.zaj(this.zaa);
        } else if (i2 != 2) {
            a.u(i2, "Unknown message id: ", "GoogleApiClientImpl");
        } else {
            zabe.zai(this.zaa);
        }
    }
}
