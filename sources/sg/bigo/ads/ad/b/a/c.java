package sg.bigo.ads.ad.b.a;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import sg.bigo.ads.api.AdIconView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.api.core.r;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends sg.bigo.ads.ad.b.c implements sg.bigo.ads.common.p.g {
    public boolean x;
    public boolean y;

    public c(sg.bigo.ads.api.core.g gVar) {
        super(gVar);
        this.x = false;
        this.y = false;
    }

    @Override // sg.bigo.ads.ad.c
    public final sg.bigo.ads.core.e.a.b a(r rVar, sg.bigo.ads.core.e.a.e[] eVarArr, sg.bigo.ads.core.e.a.e[] eVarArr2, sg.bigo.ads.core.e.a.e[] eVarArr3, sg.bigo.ads.core.e.a.e[] eVarArr4) {
        return new sg.bigo.ads.core.e.a.a(rVar, eVarArr, eVarArr2, eVarArr3, eVarArr4, sg.bigo.ads.core.d.b.c(this.f45584b.f47032a, this));
    }

    @Override // sg.bigo.ads.common.p.g
    public final void a(int i2, String str, String str2) {
        sg.bigo.ads.common.t.a.a(0, 3, "IconAds", "icon download fail, error=" + i2 + ", errorMsg=" + str);
        this.y = true;
    }

    @Override // sg.bigo.ads.common.p.g
    public final void a(Bitmap bitmap, sg.bigo.ads.common.p.f fVar) {
        p005e.a.f(new StringBuilder("icon download success, url = "), 0, fVar.f47426e, 3, "IconAds");
        this.x = true;
    }

    @Override // sg.bigo.ads.ad.b.c
    public final void a(sg.bigo.ads.api.b.d.a<NativeAd> aVar, int i2) {
        aVar.a(this);
    }

    @Override // sg.bigo.ads.ad.b.c
    public final boolean a(ViewGroup viewGroup, View view, int i2) {
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        if (view != null && aVar != null) {
            view.setTag(1);
            if (sg.bigo.ads.ad.b.c.a(viewGroup, view)) {
                o.a aVarAv = aVar.av();
                if (aVarAv != null) {
                    String strC = aVarAv.c();
                    if (i.f46986a.n().a(9) && URLUtil.isHttpUrl(strC)) {
                        sg.bigo.ads.core.d.b.a(aVar, 3000, 10220, "Invalid http url: ".concat(String.valueOf(strC)));
                    } else if (view instanceof ImageView) {
                        sg.bigo.ads.common.p.b bVar = new sg.bigo.ads.common.p.b((ImageView) view, (byte) 0);
                        bVar.a(this);
                        bVar.a(sg.bigo.ads.common.u.a.e.i(), aVarAv.c(), aVar.al());
                    } else if (view instanceof AdIconView) {
                        ((AdIconView) view).a(sg.bigo.ads.common.u.a.e.i(), aVarAv.c(), aVar.al(), this);
                    }
                }
                sg.bigo.ads.ad.b.a.a(viewGroup, view, i2, this, this.f45465I);
                return true;
            }
        }
        return false;
    }
}
