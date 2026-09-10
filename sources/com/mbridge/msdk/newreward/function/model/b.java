package com.mbridge.msdk.newreward.function.model;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.unity3d.services.UnityAdsConstants;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1700a;
    private final String b;
    private final String c;
    private final boolean d;
    private Handler g;
    private com.mbridge.msdk.newreward.function.command.c i;
    private com.mbridge.msdk.newreward.adapter.d l;
    private volatile boolean j = false;
    private volatile boolean k = false;
    private final int e = q0.a().b(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_LOAD_CHECK_INTERVAL, UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION);
    private final long h = q0.a().b(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_LOAD_TOKEN_VALIDITY_PERIOD, 1800000);
    private final boolean f = q0.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_LOAD_CHECK_OPTIMIZED, false);

    public class a implements com.mbridge.msdk.newreward.function.database.b {
        public a() {
        }

        @Override // com.mbridge.msdk.newreward.function.database.b
        public void a(List<com.mbridge.msdk.newreward.function.core.campaign.b> list) {
            b.this.b(list);
        }

        @Override // com.mbridge.msdk.newreward.function.database.b
        public void a() {
            b.this.a((com.mbridge.msdk.newreward.adapter.e) null, (com.mbridge.msdk.newreward.function.core.campaign.b) null);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.newreward.function.model.b$b, reason: collision with other inner class name */
    public class C0215b implements com.mbridge.msdk.newreward.adapter.req.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.newreward.function.core.campaign.b f1702a;
        final /* synthetic */ com.mbridge.msdk.newreward.adapter.e b;

        public C0215b(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.e eVar) {
            this.f1702a = bVar;
            this.b = eVar;
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
            b.this.a(this.b, this.f1702a);
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            b.this.a(this.f1702a, this.b);
        }
    }

    public class c implements com.mbridge.msdk.newreward.adapter.req.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.newreward.adapter.e f1703a;
        final /* synthetic */ com.mbridge.msdk.newreward.function.core.campaign.b b;

        public c(com.mbridge.msdk.newreward.adapter.e eVar, com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
            this.f1703a = eVar;
            this.b = bVar;
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
            b.this.k = false;
            try {
                b.this.i.a(this.f1703a, com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_CHECK, b.this.i.a("check_type", "download_failed", MBInterstitialActivity.INTENT_CAMAPIGN, this.b));
            } catch (Exception e) {
                AbstractC3888ke0.q(e, new StringBuilder("handlerAnthonyNeedDownloadCampaign error: "), "LoadCheckController");
            }
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            b.this.k = false;
            try {
                b.this.i.a(this.f1703a, com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_CHECK, b.this.i.a("check_type", "download_success", MBInterstitialActivity.INTENT_CAMAPIGN, this.b));
            } catch (Exception e) {
                AbstractC3888ke0.q(e, new StringBuilder("handlerAnthonyNeedDownloadCampaign error: "), "LoadCheckController");
            }
        }
    }

    public class d implements com.mbridge.msdk.newreward.adapter.req.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.newreward.function.core.campaign.b f1704a;
        final /* synthetic */ com.mbridge.msdk.newreward.adapter.e b;

        public d(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.e eVar) {
            this.f1704a = bVar;
            this.b = eVar;
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
            b.this.a(this.b, this.f1704a);
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            b.this.a(this.f1704a, this.b);
        }
    }

    public static class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f1705a;
        private final WeakReference<b> b;
        private final long c;

        public e(Handler handler, b bVar, long j) {
            this.f1705a = handler;
            this.b = new WeakReference<>(bVar);
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = this.b.get();
            if (bVar != null) {
                try {
                    bVar.b();
                } catch (Exception e) {
                    o0.a("LoadCheckController", "startCheckTask error: " + e.getMessage());
                }
            }
            Handler handler = this.f1705a;
            if (handler != null) {
                handler.postDelayed(this, this.c);
            }
        }
    }

    public b(int i, String str, String str2, boolean z) {
        this.f1700a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    private void c(com.mbridge.msdk.newreward.adapter.e eVar, com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
        com.mbridge.msdk.newreward.function.command.c cVar = this.i;
        cVar.a(cVar.a("command_manager", cVar, "adapter_model", eVar), new d(bVar, eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.l.b() != null) {
            Iterator<com.mbridge.msdk.newreward.adapter.e> it = this.l.b().iterator();
            while (it.hasNext()) {
                if (it.next().q() == 1) {
                    return;
                }
            }
        }
        if (this.j) {
            return;
        }
        this.j = true;
        com.mbridge.msdk.newreward.function.database.c.c().a().a(this.f1700a, this.b, this.c, this.d, new a());
    }

    public void a(com.mbridge.msdk.newreward.function.command.c cVar, com.mbridge.msdk.newreward.adapter.d dVar) {
        if (cVar != null && dVar != null) {
            if (!this.f) {
                a();
                return;
            }
            this.l = dVar;
            this.i = cVar;
            HandlerThread handlerThread = new HandlerThread("load_check_controller");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.g = handler;
            handler.postDelayed(new e(handler, this, this.e), this.e);
            return;
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<com.mbridge.msdk.newreward.function.core.campaign.b> list) {
        com.mbridge.msdk.newreward.function.core.campaign.b bVarA = a(list);
        b(list, bVarA);
        if (bVarA != null) {
            List<CampaignEx> listF = bVarA.f();
            com.mbridge.msdk.newreward.adapter.e eVarA = a(bVarA);
            if (listF == null) {
                try {
                    com.mbridge.msdk.newreward.function.command.c cVar = this.i;
                    cVar.a(eVarA, com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_CHECK, cVar.a("check_type", "check_start_campaign"));
                } catch (Exception e2) {
                    AbstractC3888ke0.q(e2, new StringBuilder("handlerLoadFailedCampaigns error: "), "LoadCheckController");
                }
                c(eVarA, bVarA);
                return;
            }
            try {
                com.mbridge.msdk.newreward.function.command.c cVar2 = this.i;
                cVar2.a(eVarA, com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_CHECK, cVar2.a("check_type", "check_start_resource"));
            } catch (Exception e3) {
                AbstractC3888ke0.q(e3, new StringBuilder("handlerLoadFailedCampaigns error: "), "LoadCheckController");
            }
            a(eVarA, bVarA, new C0215b(bVarA, eVarA));
            return;
        }
        this.j = false;
    }

    private void a() {
        com.mbridge.msdk.newreward.function.database.c.c().a().d(this.f1700a, this.b, this.c);
    }

    private void a(com.mbridge.msdk.newreward.adapter.e eVar, com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2) {
        eVar.L().b(bVar, bVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.adapter.e eVar, com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
        this.j = false;
        b(eVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.e eVar) {
        this.j = false;
        if (eVar == null) {
            return;
        }
        b(bVar, eVar);
        eVar.k(true);
        if (!bVar.J() || bVar.k() <= 0.0d) {
            this.l.a(eVar);
        }
    }

    @NonNull
    private com.mbridge.msdk.newreward.adapter.e a(com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
        com.mbridge.msdk.newreward.adapter.e eVar = new com.mbridge.msdk.newreward.adapter.e(false, this.f1700a, bVar.c(), this.c, bVar.J());
        eVar.f(bVar.p());
        eVar.b(30000);
        eVar.i(MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
        eVar.g(this.b);
        eVar.i(true);
        eVar.j(false);
        eVar.e(false);
        return eVar;
    }

    private void b(List<com.mbridge.msdk.newreward.function.core.campaign.b> list, com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
        com.mbridge.msdk.newreward.function.core.campaign.b bVarA = a(list, bVar);
        if (this.k || bVarA == null) {
            return;
        }
        this.k = true;
        com.mbridge.msdk.newreward.adapter.e eVarA = a(bVarA);
        try {
            com.mbridge.msdk.newreward.function.command.c cVar = this.i;
            cVar.a(eVarA, com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_CHECK, cVar.a("check_type", "download_start_resource", MBInterstitialActivity.INTENT_CAMAPIGN, bVarA));
        } catch (Exception e2) {
            AbstractC3888ke0.q(e2, new StringBuilder("handlerAnthonyNeedDownloadCampaign error: "), "LoadCheckController");
        }
        a(eVarA, bVarA, new c(eVarA, bVarA));
    }

    private com.mbridge.msdk.newreward.function.core.campaign.b a(List<com.mbridge.msdk.newreward.function.core.campaign.b> list) {
        com.mbridge.msdk.newreward.function.core.campaign.b bVar = null;
        for (com.mbridge.msdk.newreward.function.core.campaign.b bVar2 : list) {
            if (bVar2.J()) {
                long jZ = bVar2.z();
                if (jZ == 0) {
                    com.mbridge.msdk.newreward.function.database.c.c().a().a(bVar2.a(), bVar2.s(), bVar2.E(), bVar2.p(), 8);
                } else if (TextUtils.isEmpty(bVar2.c())) {
                    com.mbridge.msdk.newreward.function.database.c.c().a().a(bVar2.a(), bVar2.s(), bVar2.E(), bVar2.p(), 8);
                } else if (System.currentTimeMillis() - jZ > this.h && bVar2.g() == null) {
                    com.mbridge.msdk.newreward.function.database.c.c().a().a(bVar2.a(), bVar2.s(), bVar2.E(), bVar2.p(), 8);
                } else if (bVar2.k() <= 0.0d && bVar2.D() != 1) {
                    com.mbridge.msdk.newreward.function.database.c.c().a().a(bVar2.a(), bVar2.s(), bVar2.E(), bVar2.p(), 8);
                } else if (bVar == null || bVar2.k() > bVar.k()) {
                    bVar = bVar2;
                }
            } else if (bVar2.z() == 0) {
                com.mbridge.msdk.newreward.function.database.c.c().a().a(bVar2.a(), bVar2.s(), bVar2.E(), bVar2.p(), 8);
            } else if (bVar2.f() == null || bVar2.f().size() == 0) {
                com.mbridge.msdk.newreward.function.database.c.c().a().a(bVar2.a(), bVar2.s(), bVar2.E(), bVar2.p(), 8);
            } else if (bVar == null || bVar2.z() > bVar.z()) {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    private void b(com.mbridge.msdk.newreward.adapter.e eVar, com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
        Map mapA;
        if (eVar == null) {
            return;
        }
        try {
            if (bVar == null) {
                mapA = this.i.a("check_type", "check_failed");
            } else {
                mapA = this.i.a("check_type", "check_failed", MBInterstitialActivity.INTENT_CAMAPIGN, bVar);
            }
            this.i.a(eVar, com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_CHECK, mapA);
        } catch (Exception e2) {
            AbstractC3888ke0.q(e2, new StringBuilder("reportLoadCheckFailed error: "), "LoadCheckController");
        }
    }

    private com.mbridge.msdk.newreward.function.core.campaign.b a(List<com.mbridge.msdk.newreward.function.core.campaign.b> list, com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
        com.mbridge.msdk.newreward.function.core.campaign.b bVar2 = null;
        if (list != null && list.size() != 0 && !this.k) {
            for (com.mbridge.msdk.newreward.function.core.campaign.b bVar3 : list) {
                if (bVar3 != bVar && bVar3.g() != null && (bVar2 == null || bVar3.z() > bVar2.z())) {
                    bVar2 = bVar3;
                }
            }
        }
        return bVar2;
    }

    private void b(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.e eVar) {
        com.mbridge.msdk.newreward.function.command.c cVar = this.i;
        cVar.a(eVar, com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_CHECK, cVar.a("check_type", "check_success", MBInterstitialActivity.INTENT_CAMAPIGN, bVar));
    }
}
