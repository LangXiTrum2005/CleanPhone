package sg.bigo.ads.ad.interstitial.b;

import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.common.utils.n;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sg.bigo.ads.ad.b.c f45834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f45835b;
    public n f;
    public InterfaceC0802a g;
    public boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f45837e = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f45838h = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45836c = 1;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC0802a {
        void a(boolean z2, boolean z3);

        void ah();

        void ai();

        void b(long j);
    }

    public static class b implements VideoController.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final VideoController.d f45842a;

        private b(VideoController.d dVar) {
            this.f45842a = dVar;
        }

        @Override // sg.bigo.ads.api.VideoController.d
        public void a(int i2, int i3) {
            VideoController.d dVar = this.f45842a;
            if (dVar != null) {
                dVar.a(i2, i3);
            }
        }

        public /* synthetic */ b(VideoController.d dVar, byte b2) {
            this(dVar);
        }
    }

    public static class c implements VideoController.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final VideoController.b f45843a;

        private c(VideoController.b bVar) {
            this.f45843a = bVar;
        }

        @Override // sg.bigo.ads.api.VideoController.b
        public final void a() {
            VideoController.b bVar = this.f45843a;
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // sg.bigo.ads.api.VideoController.b
        public final void b() {
            VideoController.b bVar = this.f45843a;
            if (bVar != null) {
                bVar.b();
            }
        }

        @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
        public void onMuteChange(boolean z2) {
            VideoController.b bVar = this.f45843a;
            if (bVar != null) {
                bVar.onMuteChange(z2);
            }
        }

        @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
        public void onVideoEnd() {
            VideoController.b bVar = this.f45843a;
            if (bVar != null) {
                bVar.onVideoEnd();
            }
        }

        @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
        public void onVideoPause() {
            VideoController.b bVar = this.f45843a;
            if (bVar != null) {
                bVar.onVideoPause();
            }
        }

        @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
        public void onVideoPlay() {
            VideoController.b bVar = this.f45843a;
            if (bVar != null) {
                bVar.onVideoPlay();
            }
        }

        @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
        public void onVideoStart() {
            VideoController.b bVar = this.f45843a;
            if (bVar != null) {
                bVar.onVideoStart();
            }
        }

        public /* synthetic */ c(VideoController.b bVar, byte b2) {
            this(bVar);
        }
    }

    public static /* synthetic */ void a(a aVar) {
        if (!aVar.a()) {
            if (aVar.d) {
                aVar.b();
                return;
            }
            sg.bigo.ads.common.t.a.a(0, "CountdownHelper", "invalid status, isCountdownIgnoreVideoProgress=" + aVar.a() + ", mVideoEnd=" + aVar.d);
            return;
        }
        if (aVar.f45837e) {
            aVar.b();
            return;
        }
        sg.bigo.ads.ad.b.c cVar = aVar.f45834a;
        VideoController videoController = cVar != null ? cVar.getVideoController() : null;
        if (videoController == null || videoController.isPlaying()) {
            return;
        }
        videoController.play();
    }

    private void b() {
        InterfaceC0802a interfaceC0802a = this.g;
        if (interfaceC0802a != null) {
            interfaceC0802a.a(a(), this.d);
        }
    }

    public final void a(boolean z2) {
        if (z2 && !a()) {
            InterfaceC0802a interfaceC0802a = this.g;
            if (interfaceC0802a != null) {
                interfaceC0802a.ah();
                return;
            }
            return;
        }
        if (z2 || !a()) {
            return;
        }
        n nVar = this.f;
        if (nVar != null && nVar.e()) {
            this.f.c();
        }
        InterfaceC0802a interfaceC0802a2 = this.g;
        if (interfaceC0802a2 != null) {
            interfaceC0802a2.ah();
        }
    }

    public final void b(boolean z2) {
        if (z2 && !a()) {
            InterfaceC0802a interfaceC0802a = this.g;
            if (interfaceC0802a != null) {
                interfaceC0802a.ai();
                return;
            }
            return;
        }
        if (z2 || !a()) {
            return;
        }
        n nVar = this.f;
        if (nVar != null) {
            nVar.d();
        }
        InterfaceC0802a interfaceC0802a2 = this.g;
        if (interfaceC0802a2 != null) {
            interfaceC0802a2.ai();
        }
    }

    public final boolean a() {
        return this.f45836c == 2;
    }
}
