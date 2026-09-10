package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3224sc extends BroadcastReceiver implements Zb {
    public final String a;
    public final /* synthetic */ C3324wc b;

    public C3224sc(C3324wc c3324wc, String jsCallbackNamespace) {
        Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        this.b = c3324wc;
        this.a = jsCallbackNamespace;
    }

    @Override // com.inmobi.media.Zb
    public final void a() {
        Context context = Ji.a;
        if (context == null) {
            return;
        }
        context.unregisterReceiver(this);
    }

    @Override // com.inmobi.media.Zb
    public final void b() {
        Context context = Ji.a;
        if (context == null) {
            return;
        }
        F3.a(context, this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.wireman("android.media.RINGER_MODE_CHANGED", intent.getAction())) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", 2);
            InterfaceC3072m9 interfaceC3072m9 = this.b.b;
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).a("MraidMediaProcessor", "Ringer mode action changed: " + intExtra);
            }
            this.b.a(this.a, 2 != intExtra);
        }
    }
}
