package sg.bigo.ads.controller.e;

import android.app.Activity;
import android.content.Intent;
import sg.bigo.ads.ad.c;
import sg.bigo.ads.api.core.BaseAdActivityImpl;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b<T extends sg.bigo.ads.ad.c<?, ?>> extends BaseAdActivityImpl {
    public T K;

    public b(Activity activity) {
        super(activity);
        try {
            this.K = (T) sg.bigo.ads.controller.landing.d.b(this.f47011I.getIntent().getIntExtra("ad_identifier", -1));
        } catch (Exception unused) {
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void N() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void U() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void V() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void W() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void X() {
        if (this.K != null) {
            sg.bigo.ads.controller.landing.d.a();
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void a(int i2, int i3, Intent intent) {
    }
}
