package com.mbridge.msdk.newreward.function.command.receiver.tagreceiver;

import android.text.TextUtils;
import com.mbridge.apt_anotation.ReceiverAction;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.adapter.e;
import com.mbridge.msdk.newreward.function.command.receiver.b;

/* JADX INFO: loaded from: classes2.dex */
@ReceiverAction(id = "PlayFrequenceReceiver", type = b.class)
public class PlayFrequenceReceiver implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e f1674a;
    CampaignEx b;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (PlayFrequenceReceiver.this.b != null) {
                    j.a(g.a(c.n().d())).b(PlayFrequenceReceiver.this.b.getId());
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
    }

    private void b() {
        if (this.b == null) {
            return;
        }
        new Thread(new a()).start();
    }

    @Override // com.mbridge.msdk.newreward.function.command.receiver.b
    public void a(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            this.f1674a = eVar;
            this.b = eVar.H();
        }
        if (this.f1674a != null) {
            b();
            a();
        }
    }

    private void a() {
        CampaignEx campaignEx = this.b;
        if (campaignEx == null) {
            return;
        }
        try {
            if (com.mbridge.msdk.foundation.same.buffer.b.k == null || TextUtils.isEmpty(campaignEx.getId())) {
                return;
            }
            com.mbridge.msdk.foundation.same.buffer.b.a(this.b.getCampaignUnitId(), this.b, "reward");
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
