package sg.bigo.ads.core.adview;

import android.view.View;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends c implements MediaView.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sg.bigo.ads.core.player.b.f f48283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AdImageView f48284c;
    public Boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f48285e;
    public VideoController f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f48286h;

    public static class a implements VideoController {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final sg.bigo.ads.core.player.b.f f48287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private VideoController.VideoLifeCallback f48288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private VideoController.d f48289c;
        private VideoController.c d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private VideoController.a f48290e;

        public a(sg.bigo.ads.core.player.b.f fVar) {
            this.f48287a = fVar;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final VideoController.a getBackupLoadCallback() {
            return this.f48290e;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final VideoController.c getLoadHTMLCallback() {
            return this.d;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final VideoController.d getProgressChangeListener() {
            return this.f48289c;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final VideoController.VideoLifeCallback getVideoLifeCallback() {
            return this.f48288b;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final boolean isMuted() {
            sg.bigo.ads.core.player.d unused = sg.bigo.ads.core.player.d.a.f48851a;
            return this.f48287a.c();
        }

        @Override // sg.bigo.ads.api.VideoController
        public final boolean isPaused() {
            sg.bigo.ads.core.player.d unused = sg.bigo.ads.core.player.d.a.f48851a;
            return this.f48287a.getPlayStatus() == 3;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final boolean isPlaying() {
            sg.bigo.ads.core.player.d unused = sg.bigo.ads.core.player.d.a.f48851a;
            return this.f48287a.t();
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void mute(boolean z2) {
            sg.bigo.ads.core.player.d unused = sg.bigo.ads.core.player.d.a.f48851a;
            this.f48287a.setMute(z2);
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void notifyBackupResourceReady() {
            sg.bigo.ads.core.player.d unused = sg.bigo.ads.core.player.d.a.f48851a;
            sg.bigo.ads.core.player.b.f fVar = this.f48287a;
            if (fVar instanceof sg.bigo.ads.core.player.b.e) {
                ((sg.bigo.ads.core.player.b.e) fVar).l();
            }
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void notifyPlayViewRegister() {
            sg.bigo.ads.core.player.d.a.f48851a.a(this.f48287a);
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void notifyResourceReady() {
            sg.bigo.ads.core.player.d unused = sg.bigo.ads.core.player.d.a.f48851a;
            sg.bigo.ads.core.player.b.f fVar = this.f48287a;
            if (fVar instanceof sg.bigo.ads.core.player.b.e) {
                ((sg.bigo.ads.core.player.b.e) fVar).m();
            }
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void pause() {
            sg.bigo.ads.core.player.d unused = sg.bigo.ads.core.player.d.a.f48851a;
            this.f48287a.u();
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void play() {
            sg.bigo.ads.core.player.d unused = sg.bigo.ads.core.player.d.a.f48851a;
            this.f48287a.e(true);
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setBackupLoadCallback(VideoController.a aVar) {
            this.f48290e = aVar;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setLoadHTMLCallback(VideoController.c cVar) {
            this.d = cVar;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setProgressChangeListener(VideoController.d dVar) {
            this.f48289c = dVar;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setVideoLifeCallback(VideoController.VideoLifeCallback videoLifeCallback) {
            this.f48288b = videoLifeCallback;
        }
    }

    public f(sg.bigo.ads.api.a<?> aVar) {
        super(aVar);
        this.f48283b = null;
        this.f48284c = null;
        Boolean bool = Boolean.TRUE;
        this.d = bool;
        this.f48285e = bool;
        this.f48286h = true;
        this.g = true;
    }

    @Override // sg.bigo.ads.core.adview.c
    public final void a(View view) {
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        }
        u.a(view, this.f48267a, null, -1);
    }

    @Override // sg.bigo.ads.api.MediaView.a
    public final void b() {
        sg.bigo.ads.core.player.b.f fVar = this.f48283b;
        if (fVar != null) {
            fVar.performClick();
        }
    }

    public final int c() {
        AdImageView adImageView = this.f48284c;
        if (adImageView == null || adImageView.getDrawable() == null) {
            return 0;
        }
        return this.f48284c.getDrawable().getIntrinsicHeight();
    }

    public final int d() {
        AdImageView adImageView = this.f48284c;
        if (adImageView == null || adImageView.getDrawable() == null) {
            return 0;
        }
        return this.f48284c.getDrawable().getIntrinsicWidth();
    }

    private boolean b(int i2, int i3) {
        AdImageView adImageView = this.f48284c;
        if (adImageView != null) {
            return u.a(i2, i3, adImageView);
        }
        sg.bigo.ads.core.player.b.f fVar = this.f48283b;
        if (fVar != null) {
            return u.a(i2, i3, fVar);
        }
        return false;
    }

    public final void a(String str) {
        sg.bigo.ads.core.player.b.e eVar = new sg.bigo.ads.core.player.b.e(this.f48267a.getContext(), 0, 0, sg.bigo.ads.api.c.b.b(1), null);
        eVar.setClickable(this.f48286h);
        a(eVar);
        eVar.setPlayInfo$505cff1c(str);
        this.f = new a(eVar);
        this.f48283b = eVar;
    }

    public final void a(o oVar, sg.bigo.ads.common.p.g gVar) {
        AdImageView adImageView;
        ImageView.ScaleType scaleType;
        AdImageView adImageView2;
        FrameLayout.LayoutParams layoutParams;
        sg.bigo.ads.api.c.b bVarB = sg.bigo.ads.api.c.b.b(oVar.x());
        if (this.f48284c == null) {
            this.f48284c = new AdImageView(this.f48267a.getContext());
        }
        int i2 = bVarB.f47007a;
        if (i2 == 1) {
            adImageView = this.f48284c;
            scaleType = ImageView.ScaleType.FIT_CENTER;
            adImageView.setScaleType(scaleType);
        } else if (i2 != 2) {
            if (i2 == 3) {
                adImageView2 = this.f48284c;
                layoutParams = new FrameLayout.LayoutParams(-1, -2, 17);
            } else if (i2 == 4) {
                adImageView2 = this.f48284c;
                layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
            }
            adImageView2.setLayoutParams(layoutParams);
            adImageView = this.f48284c;
            scaleType = ImageView.ScaleType.FIT_CENTER;
            adImageView.setScaleType(scaleType);
        } else {
            adImageView = this.f48284c;
            scaleType = ImageView.ScaleType.CENTER_CROP;
            adImageView.setScaleType(scaleType);
        }
        String strAT = oVar.aT();
        a(this.f48284c);
        this.f48284c.setBlurBorder(this.g);
        this.f48284c.a(gVar);
        if (i.f46986a.n().a(9) && URLUtil.isHttpUrl(strAT) && gVar != null) {
            gVar.a(1305, "Invalid http url", "");
        } else {
            this.f48284c.a(strAT, oVar.al());
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026 A[PHI: r1
  0x0026: PHI (r1v1 int) = (r1v0 int), (r1v0 int), (r1v4 int) binds: [B:3:0x0010, B:5:0x0018, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public final void a(sg.bigo.ads.core.a.a aVar, p pVar, sg.bigo.ads.core.g.c cVar) {
        int i2;
        sg.bigo.ads.api.c.b bVarB = sg.bigo.ads.api.c.b.b(aVar.x());
        n nVarAV = aVar.aV();
        int i3 = pVar.x;
        int i4 = pVar.f48538w;
        if (nVarAV == null || nVarAV.f47056c <= 0) {
            i2 = i4;
        } else {
            int i5 = nVarAV.f47054a;
            if (i5 > 0) {
                i3 = i5;
            }
            int i6 = nVarAV.f47055b;
            if (i6 > 0) {
                i2 = i6;
            } else {
                i2 = i4;
            }
        }
        sg.bigo.ads.core.player.b.e eVar = new sg.bigo.ads.core.player.b.e(this.f48267a.getContext(), i3, i2, bVarB, aVar);
        eVar.setClickable(this.f48286h);
        a(eVar);
        eVar.setPlayInfo$505cff1c(aVar.c(this.f48267a.getContext()));
        eVar.setOnEventListener(cVar);
        this.f = new a(eVar);
        this.f48283b = eVar;
    }

    @Override // sg.bigo.ads.api.MediaView.a
    public final void a(sg.bigo.ads.core.player.b.b bVar) {
        sg.bigo.ads.core.player.b.f fVar = this.f48283b;
        if (fVar instanceof sg.bigo.ads.core.player.b.e) {
            ((sg.bigo.ads.core.player.b.e) fVar).setIVideoPlayerViewListener(bVar);
        }
    }

    public final void a(sg.bigo.ads.core.player.b.d dVar) {
        dVar.setVPAIDClickable(this.f48286h);
        a((View) dVar);
        this.f = new a(dVar);
        this.f48283b = dVar;
    }

    @Override // sg.bigo.ads.api.MediaView.a
    public final void a(boolean z2) {
        sg.bigo.ads.core.player.b.f fVar = this.f48283b;
        if (fVar != null) {
            fVar.setClickable(z2);
        } else {
            this.f48286h = z2;
        }
    }

    @Override // sg.bigo.ads.api.MediaView.a
    public final boolean a() {
        sg.bigo.ads.core.player.b.f fVar = this.f48283b;
        return fVar != null ? fVar.isClickable() : this.f48286h;
    }

    @Override // sg.bigo.ads.core.adview.c
    public final boolean a(int i2, int i3) {
        int i4;
        boolean zB = b(i2, i3);
        if ((super.a(i2, i3) && (b(i2, i3) ^ true)) && this.d.booleanValue()) {
            i4 = 9;
        } else {
            if (!zB || !this.f48285e.booleanValue()) {
                return false;
            }
            i4 = 5;
        }
        a(i4);
        return true;
    }
}
