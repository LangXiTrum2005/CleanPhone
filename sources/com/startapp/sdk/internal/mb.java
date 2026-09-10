package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.startapp.sdk.ads.list3d.List3DActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class mb extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DActivity f41249a;

    public mb(List3DActivity list3DActivity) {
        this.f41249a = list3DActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f41249a.finish();
    }
}
