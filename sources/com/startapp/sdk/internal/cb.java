package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public abstract class cb implements Runnable {
    protected final bb callback;
    protected final Context context;
    protected final Bundle extras;

    public cb(Context context, bb bbVar, Bundle bundle) {
        this.context = context;
        this.callback = bbVar;
        this.extras = bundle;
    }

    public boolean runSync() {
        return false;
    }
}
