package com.thinkup.core.common.inner.mixad.o;

import android.content.Context;
import android.view.View;
import com.smartdigimkt.o1.b;
import com.thinkup.core.api.ITUBaseAdAdapter;
import com.thinkup.core.common.inner.ui.thirdparty.ThirdPartySplashBannerTUView;
import com.thinkup.core.common.mn.m.o.m;
import com.thinkup.core.common.mn.m.o.n;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements com.thinkup.core.common.mn.m.o.o {
    private m m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ITUBaseAdAdapter f41820n;
    private Context o;
    private int o0;

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.mixad.o.o$1, reason: invalid class name */
    public class AnonymousClass1 implements com.thinkup.core.common.inner.ui.thirdparty.o.InterfaceC0663o {
        public AnonymousClass1() {
        }

        @Override // com.thinkup.core.common.inner.ui.thirdparty.o.InterfaceC0663o
        public final void o(int i2) {
            if (o.this.m != null) {
                o.this.m.o(i2);
                o.this.m = null;
            }
            if (o.this.f41820n != null) {
                o.this.f41820n.destory();
            }
        }
    }

    public o(com.thinkup.core.common.mn.o0.o oVar) {
        if (oVar == null) {
            return;
        }
        this.o = oVar.o();
        this.m = oVar.mo();
        this.f41820n = oVar.om();
        this.o0 = oVar.o(b.l3);
    }

    @Override // com.thinkup.core.common.mn.m.o.o
    public final n o() {
        if (this.o == null) {
            return null;
        }
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f41820n;
        View mixView = iTUBaseAdAdapter != null ? iTUBaseAdAdapter.getMixView() : null;
        if (mixView == null) {
            return null;
        }
        ThirdPartySplashBannerTUView thirdPartySplashBannerTUView = new ThirdPartySplashBannerTUView(this.o);
        thirdPartySplashBannerTUView.addBannerView(mixView);
        thirdPartySplashBannerTUView.addCountDownView(this.o0, new AnonymousClass1());
        return thirdPartySplashBannerTUView;
    }

    private n o(View view) {
        ThirdPartySplashBannerTUView thirdPartySplashBannerTUView = new ThirdPartySplashBannerTUView(this.o);
        thirdPartySplashBannerTUView.addBannerView(view);
        thirdPartySplashBannerTUView.addCountDownView(this.o0, new AnonymousClass1());
        return thirdPartySplashBannerTUView;
    }
}
