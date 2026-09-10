package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class kg extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lg f41187a;

    public kg(lg lgVar) {
        this.f41187a = lgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        if (this.f41187a.o.isInitialStickyBroadcast() && intent.getExtras() != null) {
            int i2 = intent.getExtras().getInt("plugged");
            this.f41187a.f41224l = i2 == 1;
        } else if (Objects.equals(intent.getAction(), "android.intent.action.ACTION_POWER_CONNECTED") || Objects.equals(intent.getAction(), "android.intent.action.ACTION_POWER_DISCONNECTED")) {
            this.f41187a.a(false);
        }
    }
}
