package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class C7 extends BroadcastReceiver implements InterfaceC3207r7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F7 f22737b;

    public C7(F7 f7, String jsCallbackNamespace) {
        Intrinsics.f(jsCallbackNamespace, "jsCallbackNamespace");
        this.f22737b = f7;
        this.f22736a = jsCallbackNamespace;
    }

    @Override // com.inmobi.media.InterfaceC3207r7
    public final void a() {
        Context contextD = Uc.d();
        if (contextD == null) {
            return;
        }
        contextD.unregisterReceiver(this);
    }

    @Override // com.inmobi.media.InterfaceC3207r7
    public final void b() {
        Context contextD = Uc.d();
        if (contextD == null) {
            return;
        }
        B2.a(contextD, this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.f(context, "context");
        Intrinsics.f(intent, "intent");
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", 2);
            InterfaceC3333z5 interfaceC3333z5 = this.f22737b.f22818b;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("MraidMediaProcessor", android.support.v4.media.a.h(intExtra, "Ringer mode action changed: "));
            }
            F7 f7 = this.f22737b;
            String str = this.f22736a;
            boolean z2 = 2 != intExtra;
            InterfaceC3333z5 interfaceC3333z6 = f7.f22818b;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).c("MraidMediaProcessor", "fireDeviceMuteChangeEvent");
            }
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = f7.f22817a;
            if (gestureDetectorOnGestureListenerC3005ec != null) {
                gestureDetectorOnGestureListenerC3005ec.a(str, "fireDeviceMuteChangeEvent(" + z2 + ");");
            }
        }
    }
}
