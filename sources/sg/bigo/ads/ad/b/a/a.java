package sg.bigo.ads.ad.b.a;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends sg.bigo.ads.ad.b.c {
    public a(sg.bigo.ads.api.core.g gVar) {
        super(gVar);
    }

    @Override // sg.bigo.ads.ad.b.c
    public final void a(ViewGroup viewGroup, MediaView mediaView, View view, AdOptionsView adOptionsView, List<View> list, int i2, View... viewArr) {
        super.a(viewGroup, mediaView, view, adOptionsView, list, i2, viewArr);
        u.a(this.f45585c, ((sg.bigo.ads.ad.b.c) this).C);
    }

    @Override // sg.bigo.ads.ad.b.c, sg.bigo.ads.ad.c
    public final void h() {
        if (((sg.bigo.ads.ad.b.c) this).f45461A > 0) {
            a("attach_render_cost", Long.valueOf(SystemClock.elapsedRealtime() - ((sg.bigo.ads.ad.b.c) this).f45461A));
        }
        super.h();
    }

    @Override // sg.bigo.ads.ad.c
    public final String i() {
        View view = this.f45585c;
        if (view == null) {
            return "";
        }
        return view.getWidth() > this.f45585c.getHeight() * 2 ? "320x50" : "300x250";
    }

    @Override // sg.bigo.ads.ad.b.c
    public final void a(MediaView mediaView) {
        super.a(mediaView);
    }

    @Override // sg.bigo.ads.ad.b.c
    public final boolean a(ViewGroup viewGroup, View view, int i2) {
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        if (view == null || aVar == null) {
            return false;
        }
        view.setTag(1);
        sg.bigo.ads.ad.b.c.a(viewGroup, view);
        sg.bigo.ads.ad.b.a.a(viewGroup, view, i2, this, this.f45465I);
        return true;
    }
}
