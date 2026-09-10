package com.mbridge.msdk.newreward.function.model;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.newreward.adapter.req.l;
import com.mbridge.msdk.newreward.adapter.req.m;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1712a = com.mbridge.msdk.foundation.controller.c.n().b();
    private String b;
    private int c;
    private g d;
    private com.mbridge.msdk.videocommon.setting.a e;
    private com.mbridge.msdk.videocommon.setting.c f;

    public class a implements com.mbridge.msdk.newreward.adapter.req.b {
        public a() {
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
            f.this.a(com.mbridge.msdk.newreward.function.command.f.REPORT_SETTING_REQUEST_FAIL, 2, bVar.h());
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            f.this.a(com.mbridge.msdk.newreward.function.command.f.REPORT_SETTING_REQUEST_SUCCESS, 2, "");
        }
    }

    public class b implements com.mbridge.msdk.newreward.adapter.req.b {
        public b() {
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
            f.this.a(com.mbridge.msdk.newreward.function.command.f.REPORT_SETTING_REQUEST_FAIL, 3, bVar.h());
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            f.this.a(com.mbridge.msdk.newreward.function.command.f.REPORT_SETTING_REQUEST_SUCCESS, 3, "");
        }
    }

    private boolean d() {
        com.mbridge.msdk.videocommon.setting.a aVar = this.e;
        if (aVar != null) {
            return this.e.b() + aVar.d() <= System.currentTimeMillis();
        }
        return true;
    }

    private boolean e() {
        com.mbridge.msdk.videocommon.setting.a aVar = this.e;
        if (aVar == null || this.f == null) {
            return true;
        }
        return this.f.j() + aVar.h() <= System.currentTimeMillis();
    }

    public com.mbridge.msdk.videocommon.setting.a b() {
        return this.e;
    }

    public com.mbridge.msdk.videocommon.setting.c c() {
        return this.f;
    }

    public void a(String str) {
        this.b = str;
    }

    public void a(Object obj) {
        try {
            if (TextUtils.isEmpty(this.b) && (obj instanceof com.mbridge.msdk.newreward.function.paramter.d)) {
                a(((com.mbridge.msdk.newreward.function.paramter.d) obj).e());
            }
        } catch (Throwable th) {
            o0.b("SettingModel", th.getMessage());
        }
    }

    public g a() {
        return this.d;
    }

    public void a(Object obj, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        a(obj);
        try {
            this.d = h.b().b(this.f1712a);
            com.mbridge.msdk.videocommon.setting.a aVarD = com.mbridge.msdk.videocommon.setting.b.b().d();
            this.e = aVarD;
            if (aVarD == null) {
                this.e = com.mbridge.msdk.videocommon.setting.b.b().a();
            }
            try {
                this.f = com.mbridge.msdk.videocommon.setting.b.b().e(this.f1712a, this.b);
            } catch (Exception e) {
                o0.b("SettingModel", e.getMessage());
            }
            if (this.f == null) {
                this.f = com.mbridge.msdk.videocommon.setting.b.b().a(this.c == 287);
            } else {
                com.mbridge.msdk.videocommon.setting.b.b().a(this.b, this.f.c());
            }
            bVar.reqSuccessful(this);
            if (obj instanceof com.mbridge.msdk.newreward.function.paramter.d) {
                a((com.mbridge.msdk.newreward.function.paramter.d) obj);
            }
        } catch (Throwable th) {
            bVar.reqFailed(new com.mbridge.msdk.foundation.error.b(880000, AbstractC3888ke0.l(th, new StringBuilder("fetch setting fail : "))));
        }
    }

    public void a(com.mbridge.msdk.newreward.function.paramter.d dVar) {
        if (d()) {
            try {
                new l().a(dVar, new a());
                a(com.mbridge.msdk.newreward.function.command.f.REPORT_SETTING_REQUEST_START, 2, "");
            } catch (IOException e) {
                o0.b("SettingModel", e.getMessage());
            }
        }
        if (e()) {
            try {
                new m().a(dVar, new b());
                a(com.mbridge.msdk.newreward.function.command.f.REPORT_SETTING_REQUEST_START, 3, "");
            } catch (IOException e2) {
                o0.b("SettingModel", e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.command.f fVar, int i, String str) {
        int i2;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("key", "2000112");
            eVar.a("st_net", Integer.valueOf(com.mbridge.msdk.foundation.same.net.utils.d.h().t));
            if (fVar == com.mbridge.msdk.newreward.function.command.f.REPORT_SETTING_REQUEST_START) {
                i2 = 3;
            } else if (fVar == com.mbridge.msdk.newreward.function.command.f.REPORT_SETTING_REQUEST_SUCCESS) {
                i2 = 1;
            } else {
                i2 = fVar == com.mbridge.msdk.newreward.function.command.f.REPORT_SETTING_REQUEST_FAIL ? 2 : 0;
            }
            eVar.a("result", Integer.valueOf(i2));
            eVar.a("type", Integer.valueOf(i));
            eVar.a("url", com.mbridge.msdk.foundation.same.net.utils.d.h().s ? com.mbridge.msdk.foundation.same.net.utils.d.h().U : com.mbridge.msdk.foundation.same.net.utils.d.h().T);
            eVar.a("reason", str);
            cVar.a("2000112", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000112", cVar);
        } catch (Throwable th) {
            o0.b("SettingModel", th.getMessage());
        }
    }
}
