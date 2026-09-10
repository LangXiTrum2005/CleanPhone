package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class B7 extends BroadcastReceiver implements InterfaceC3207r7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F7 f22721b;

    public B7(F7 f7, String jsCallbackNamespace) {
        Intrinsics.f(jsCallbackNamespace, "jsCallbackNamespace");
        this.f22721b = f7;
        this.f22720a = jsCallbackNamespace;
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
        B2.a(contextD, this, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.f(context, "context");
        Intrinsics.f(intent, "intent");
        if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("state", 0);
            InterfaceC3333z5 interfaceC3333z5 = this.f22721b.f22818b;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("MraidMediaProcessor", android.support.v4.media.a.h(intExtra, "Headphone plugged state changed: "));
            }
            F7 f7 = this.f22721b;
            String str = this.f22720a;
            boolean z2 = 1 == intExtra;
            InterfaceC3333z5 interfaceC3333z6 = f7.f22818b;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).c("MraidMediaProcessor", "fireHeadphonePluggedEvent");
            }
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = f7.f22817a;
            if (gestureDetectorOnGestureListenerC3005ec != null) {
                gestureDetectorOnGestureListenerC3005ec.a(str, "fireHeadphonePluggedEvent(" + z2 + ");");
            }
        }
    }
}
