package com.mbridge.msdk.newreward.function.command.receiver.tagreceiver;

import android.app.Activity;
import android.content.Intent;
import com.mbridge.apt_anotation.ReceiverAction;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.a;
import com.mbridge.msdk.newreward.adapter.e;
import com.mbridge.msdk.newreward.function.command.receiver.b;
import com.mbridge.msdk.newreward.player.MBRewardVideoActivity;

/* JADX INFO: loaded from: classes2.dex */
@ReceiverAction(id = "NewShowReceiver", type = b.class)
public class NewShowReceiver implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e f1672a;

    @Override // com.mbridge.msdk.newreward.function.command.receiver.b
    public void a(Object obj) {
        e eVar = (e) obj;
        this.f1672a = eVar;
        if (eVar != null) {
            a();
        }
    }

    private void a() {
        Intent intent = new Intent(c.n().d(), (Class<?>) MBRewardVideoActivity.class);
        intent.putExtra(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, this.f1672a.A());
        if (this.f1672a.g() != null && this.f1672a.g().b() != null && this.f1672a.g().b().size() == 1) {
            e eVar = this.f1672a;
            eVar.a(eVar.g().b().get(0));
        }
        try {
            this.f1672a.g(a.a(c.n().d()));
        } catch (Throwable th) {
            o0.b("NewShowReceiver", th.getMessage());
        }
        try {
            if (c.n() != null && c.n().f() != null) {
                ((Activity) c.n().f()).startActivity(intent);
                return;
            }
        } catch (Throwable th2) {
            o0.b("NewShowReceiver", th2.getMessage());
        }
        intent.addFlags(268435456);
        c.n().d().startActivity(intent);
    }
}
