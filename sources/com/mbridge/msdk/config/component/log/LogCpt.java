package com.mbridge.msdk.config.component.log;

import com.applovin.impl.sdk.b0;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.foundation.same.report.d;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class LogCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.log.model.a f32256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    x f32257i;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(e eVar) throws Exception {
        return true;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        super.b(map);
        this.f31828f = "913001";
        this.f32256h = new com.mbridge.msdk.config.component.log.model.a(map);
        this.f32257i = new x.b().a(this.f32256h.k()).b(this.f32256h.d()).d(this.f32256h.g()).c(this.f32256h.b()).e(this.f32256h.a()).a(new d()).a(new b0(29)).a(new n()).a(this.f32256h.f(), a(this.f32256h.f())).a();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        com.mbridge.msdk.config.component.common.metrics.a.a().a(this.f32257i);
        if (this.f32256h.h() != null) {
            com.mbridge.msdk.config.component.common.metrics.a.a().b(this.f32256h.h());
        }
        if (this.f32256h.e() == 1) {
            com.mbridge.msdk.config.component.common.metrics.a.a().d();
        }
        a("913002", (HashMap<String, Object>) null);
    }

    private p a(int i10) {
        return i10 == 1 ? new p(new m((byte) 2), this.f32256h.i(), this.f32256h.j()) : new p(new h(), this.f32256h.c(), 0);
    }
}
