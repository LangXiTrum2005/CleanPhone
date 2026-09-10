package sg.bigo.ads.ad.b.a;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.a.k;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends sg.bigo.ads.ad.b.c {
    private k x;

    public d(sg.bigo.ads.api.core.g gVar) {
        super(gVar);
        k kVarX = gVar.f47033b.x();
        this.x = kVarX;
        this.f45465I = kVarX.c();
    }

    @Override // sg.bigo.ads.ad.b.c
    public final void a(ViewGroup viewGroup, MediaView mediaView, View view, AdOptionsView adOptionsView, List<View> list, int i2, View... viewArr) {
        super.a(viewGroup, mediaView, view, adOptionsView, list, i2, viewArr);
        if (this.x.b()) {
            sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup, i2, this, this.f45465I);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sg.bigo.ads.api.core.c] */
    @Override // sg.bigo.ads.ad.b.c, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        if (this.q) {
            return;
        }
        this.q = true;
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) f(), SystemClock.elapsedRealtime() - this.k);
    }
}
