package com.smartdigimkt.y3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.smartdigimkt.p4.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f40048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f40049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BroadcastReceiver f40050c;
    com.smartdigimkt.y3.c d;

    public final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            com.smartdigimkt.y3.c cVarA = com.smartdigimkt.y3.c.a(intent);
            if (cVarA.equals(d.this.d)) {
                return;
            }
            d dVar = d.this;
            dVar.d = cVarA;
            dVar.f40049b.a(cVarA);
        }
    }

    public interface c {
        void a(com.smartdigimkt.y3.c cVar);
    }

    public d(Context context, c cVar) {
        this.f40048a = (Context) com.smartdigimkt.p4.a.a(context);
        this.f40049b = (c) com.smartdigimkt.p4.a.a(cVar);
        this.f40050c = f0.f37540a >= 21 ? new b() : null;
    }

    public void b() {
        BroadcastReceiver broadcastReceiver = this.f40050c;
        if (broadcastReceiver != null) {
            this.f40048a.unregisterReceiver(broadcastReceiver);
        }
    }

    public com.smartdigimkt.y3.c a() {
        BroadcastReceiver broadcastReceiver = this.f40050c;
        com.smartdigimkt.y3.c cVarA = com.smartdigimkt.y3.c.a(broadcastReceiver == null ? null : androidx.datastore.preferences.protobuf.a.d("android.media.action.HDMI_AUDIO_PLUG", this.f40048a, broadcastReceiver));
        this.d = cVarA;
        return cVarA;
    }
}
