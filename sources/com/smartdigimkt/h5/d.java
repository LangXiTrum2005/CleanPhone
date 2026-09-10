package com.smartdigimkt.h5;

import android.app.Activity;
import android.content.Context;
import com.smartdigimkt.f5.j;
import com.smartdigimkt.sdk.basead.ui.BaseATActivity;
import com.smartdigimkt.v3.h;
import com.smartdigimkt.v3.i;

/* JADX INFO: loaded from: classes5.dex */
public class d extends c {
    public static final String j = "d";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.smartdigimkt.f5.e f35670i;

    public d(Context context, com.smartdigimkt.v6.a aVar, String str, boolean z2) {
        super(context, aVar, str, z2);
    }

    public void a(com.smartdigimkt.f5.e eVar) {
        this.f35670i = eVar;
    }

    public class a extends com.smartdigimkt.f5.b.c {
        final /* synthetic */ String d;

        public a(String str) {
            this.d = str;
        }

        @Override // com.smartdigimkt.f5.b.c
        public void a(h hVar) {
            hVar.c();
            if (d.this.f35670i != null) {
                d.this.f35670i.onShowFailed(hVar);
            }
        }

        @Override // com.smartdigimkt.f5.b.c
        public void b(j jVar) {
            if (d.this.f35670i != null) {
                d.this.f35670i.onAdShow(jVar);
            }
        }

        @Override // com.smartdigimkt.f5.b.c
        public void c() {
            if (d.this.f35670i != null) {
                d.this.f35670i.onAdClosed();
            }
            com.smartdigimkt.f5.b.a().b(this.d);
        }

        @Override // com.smartdigimkt.f5.b.c
        public void d() {
        }

        @Override // com.smartdigimkt.f5.b.c
        public void e() {
            if (d.this.f35670i != null) {
                d.this.f35670i.onVideoAdPlayEnd();
            }
        }

        @Override // com.smartdigimkt.f5.b.c
        public void f() {
            if (d.this.f35670i != null) {
                d.this.f35670i.onVideoAdPlayStart();
            }
        }

        @Override // com.smartdigimkt.f5.b.c
        public void a(j jVar) {
            if (d.this.f35670i != null) {
                d.this.f35670i.onAdClick(jVar);
            }
        }

        @Override // com.smartdigimkt.f5.b.c
        public void a(boolean z2) {
            if (d.this.f35670i != null) {
                d.this.f35670i.onDeeplinkCallback(z2);
            }
        }
    }

    @Override // com.smartdigimkt.h5.a
    public void a(Activity activity) {
        try {
            if (this.f35664b == null) {
                com.smartdigimkt.f5.e eVar = this.f35670i;
                if (eVar != null) {
                    eVar.onShowFailed(i.a("30001", "context = null!"));
                    return;
                }
                return;
            }
            String strA = com.smartdigimkt.n8.h.a(d(), "extra_scenario", "");
            String str = this.f35665c.f;
            int iK = com.smartdigimkt.n8.c.K(activity);
            String str2 = this.f35665c.f39163a + this.d + System.currentTimeMillis();
            com.smartdigimkt.f5.b.a().a(str2, new a(str2));
            com.smartdigimkt.w6.c cVar = new com.smartdigimkt.w6.c();
            cVar.f39469c = this.f;
            cVar.d = str2;
            cVar.f39467a = 3;
            cVar.f39471h = this.f35665c;
            cVar.f39470e = iK;
            cVar.f39468b = strA;
            BaseATActivity.a(activity, cVar);
        } catch (Exception e2) {
            e2.printStackTrace();
            com.smartdigimkt.f5.e eVar2 = this.f35670i;
            if (eVar2 != null) {
                eVar2.onShowFailed(i.a("-9999", e2.getMessage()));
            }
        }
    }
}
