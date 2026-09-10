package com.smartdigimkt.a5;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.smartdigimkt.f5.e;
import com.smartdigimkt.f5.j;
import com.smartdigimkt.sdk.basead.ui.AsseblemCardSplashATView;
import com.smartdigimkt.sdk.basead.ui.AsseblemSplashATView;
import com.smartdigimkt.sdk.basead.ui.BaseATActivity;
import com.smartdigimkt.sdk.basead.ui.BaseBannerATView;
import com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView;
import com.smartdigimkt.sdk.basead.ui.BaseSplashATView;
import com.smartdigimkt.sdk.basead.ui.MraidBannerATView;
import com.smartdigimkt.sdk.basead.ui.MraidSplashATView;
import com.smartdigimkt.sdk.basead.ui.SdkBannerATView;
import com.smartdigimkt.sdk.basead.ui.SinglePictureBottomSlideSplashATView;
import com.smartdigimkt.sdk.basead.ui.SinglePictureSplashATView;
import com.smartdigimkt.sdk.basead.ui.h5template.WTWebViewSplashATView;
import com.smartdigimkt.v3.h;
import com.smartdigimkt.v3.i;
import com.smartdigimkt.w6.l;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    l f33670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    com.smartdigimkt.v6.a f33671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.smartdigimkt.f5.a f33672c;
    BaseSplashATView d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    BaseBannerATView f33673e;

    public a(l lVar, com.smartdigimkt.v6.a aVar) {
        this.f33670a = lVar;
        this.f33671b = aVar;
    }

    @Override // com.smartdigimkt.a5.c
    public void a(com.smartdigimkt.f5.a aVar) {
        this.f33672c = aVar;
    }

    @Override // com.smartdigimkt.a5.c
    public void b(Activity activity, Map<String, Object> map, String str, String str2, String str3) {
        com.smartdigimkt.f5.b.a().a(str, new b(map, str3, str));
        com.smartdigimkt.w6.c cVar = new com.smartdigimkt.w6.c();
        cVar.f39469c = this.f33670a;
        cVar.d = str;
        cVar.f39467a = 3;
        cVar.f39471h = this.f33671b;
        cVar.f39470e = com.smartdigimkt.n8.c.K(activity);
        cVar.f39468b = str2;
        BaseATActivity.a(activity, cVar);
    }

    @Override // com.smartdigimkt.a5.c
    public void destroy() {
        BaseSplashATView baseSplashATView = this.d;
        if (baseSplashATView != null) {
            baseSplashATView.destroy();
            this.d = null;
        }
        BaseBannerATView baseBannerATView = this.f33673e;
        if (baseBannerATView != null) {
            baseBannerATView.destroy();
            this.f33673e = null;
        }
    }

    @Override // com.smartdigimkt.a5.c
    public boolean isAdReady() {
        l lVar = this.f33670a;
        if (lVar == null) {
            return false;
        }
        if (lVar.a0() != 2 || this.f33670a.x0()) {
            return com.smartdigimkt.r3.d.a(this.f33670a, this.f33671b);
        }
        return false;
    }

    @Override // com.smartdigimkt.a5.c
    public void a(Activity activity, Map<String, Object> map, String str, String str2, String str3) {
        com.smartdigimkt.f5.b.a().a(str, new C0433a(map, str3, str));
        com.smartdigimkt.w6.c cVar = new com.smartdigimkt.w6.c();
        cVar.f39469c = this.f33670a;
        cVar.d = str;
        cVar.f39467a = 1;
        cVar.f39471h = this.f33671b;
        cVar.f39470e = com.smartdigimkt.n8.c.K(activity);
        cVar.f39468b = str2;
        BaseATActivity.a(activity, cVar);
    }

    /* JADX INFO: renamed from: com.smartdigimkt.a5.a$a, reason: collision with other inner class name */
    public class C0433a extends com.smartdigimkt.f5.b.c {
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0433a(Map map, String str, String str2) {
            super(map, str);
            this.d = str2;
        }

        @Override // com.smartdigimkt.f5.b.c
        public void a(h hVar) {
            com.smartdigimkt.f5.a aVar = a.this.f33672c;
            if (aVar != null) {
                aVar.onShowFailed(hVar);
            }
            a.this.f33670a = null;
        }

        @Override // com.smartdigimkt.f5.b.c
        public void b(j jVar) {
            com.smartdigimkt.f5.a aVar = a.this.f33672c;
            if (aVar != null) {
                aVar.onAdShow(jVar);
            }
            a.this.f33670a = null;
        }

        @Override // com.smartdigimkt.f5.b.c
        public void c() {
            super.c();
            com.smartdigimkt.f5.a aVar = a.this.f33672c;
            if (aVar != null) {
                aVar.onAdClosed();
            }
            com.smartdigimkt.f5.b.a().b(this.d);
        }

        @Override // com.smartdigimkt.f5.b.c
        public void d() {
            com.smartdigimkt.f5.a aVar = a.this.f33672c;
            if (aVar == null || !(aVar instanceof e)) {
                return;
            }
            ((e) aVar).onRewarded();
        }

        @Override // com.smartdigimkt.f5.b.c
        public void e() {
            com.smartdigimkt.f5.a aVar = a.this.f33672c;
            if (aVar == null || !(aVar instanceof e)) {
                return;
            }
            ((e) aVar).onVideoAdPlayEnd();
        }

        @Override // com.smartdigimkt.f5.b.c
        public void f() {
            com.smartdigimkt.f5.a aVar = a.this.f33672c;
            if (aVar == null || !(aVar instanceof e)) {
                return;
            }
            ((e) aVar).onVideoAdPlayStart();
        }

        @Override // com.smartdigimkt.f5.b.c
        public void a(j jVar) {
            com.smartdigimkt.f5.a aVar = a.this.f33672c;
            if (aVar != null) {
                aVar.onAdClick(jVar);
            }
        }

        @Override // com.smartdigimkt.f5.b.c
        public void a(boolean z2) {
            com.smartdigimkt.f5.a aVar = a.this.f33672c;
            if (aVar != null) {
                aVar.onDeeplinkCallback(z2);
            }
        }
    }

    public class b extends com.smartdigimkt.f5.b.c {
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map map, String str, String str2) {
            super(map, str);
            this.d = str2;
        }

        @Override // com.smartdigimkt.f5.b.c
        public void a(h hVar) {
            com.smartdigimkt.f5.a aVar = a.this.f33672c;
            if (aVar != null) {
                aVar.onShowFailed(hVar);
            }
            a.this.f33670a = null;
        }

        @Override // com.smartdigimkt.f5.b.c
        public void b(j jVar) {
            com.smartdigimkt.f5.a aVar = a.this.f33672c;
            if (aVar != null) {
                aVar.onAdShow(jVar);
            }
            a.this.f33670a = null;
        }

        @Override // com.smartdigimkt.f5.b.c
        public void c() {
            super.c();
            com.smartdigimkt.f5.a aVar = a.this.f33672c;
            if (aVar != null) {
                aVar.onAdClosed();
            }
            com.smartdigimkt.f5.b.a().b(this.d);
        }

        @Override // com.smartdigimkt.f5.b.c
        public void d() {
        }

        @Override // com.smartdigimkt.f5.b.c
        public void e() {
            com.smartdigimkt.f5.a aVar = a.this.f33672c;
            if (aVar == null || !(aVar instanceof e)) {
                return;
            }
            ((e) aVar).onVideoAdPlayEnd();
        }

        @Override // com.smartdigimkt.f5.b.c
        public void f() {
            com.smartdigimkt.f5.a aVar = a.this.f33672c;
            if (aVar == null || !(aVar instanceof e)) {
                return;
            }
            ((e) aVar).onVideoAdPlayStart();
        }

        @Override // com.smartdigimkt.f5.b.c
        public void a(j jVar) {
            com.smartdigimkt.f5.a aVar = a.this.f33672c;
            if (aVar != null) {
                aVar.onAdClick(jVar);
            }
        }

        @Override // com.smartdigimkt.f5.b.c
        public void a(boolean z2) {
            com.smartdigimkt.f5.a aVar = a.this.f33672c;
            if (aVar != null) {
                aVar.onDeeplinkCallback(z2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    @Override // com.smartdigimkt.a5.c
    public void a(ViewGroup viewGroup, Map<String, Object> map, boolean z2) {
        int iN = this.f33670a.N();
        if (iN == 2) {
            this.d = new MraidSplashATView(viewGroup.getContext(), this.f33671b, this.f33670a, this.f33672c);
        } else if (iN == 3) {
            if (com.smartdigimkt.r3.d.b(this.f33670a)) {
                this.d = new WTWebViewSplashATView(viewGroup.getContext(), this.f33671b, this.f33670a, this.f33672c);
            } else {
                if (this.f33670a.i().f0() != 1) {
                    com.smartdigimkt.f5.a aVar = this.f33672c;
                    if (aVar != null) {
                        aVar.onShowFailed(i.a("40002", "Splash show without h5 template html!"));
                        return;
                    }
                    return;
                }
                if (BaseSdkSplashATView.isSinglePicture(this.f33670a, this.f33671b.t)) {
                    if (this.f33671b.t.r1() != 2 && this.f33671b.t.D1() != 2) {
                        this.d = new SinglePictureBottomSlideSplashATView(viewGroup.getContext(), this.f33671b, this.f33670a, this.f33672c);
                    } else {
                        this.d = new SinglePictureSplashATView(viewGroup.getContext(), this.f33671b, this.f33670a, this.f33672c);
                    }
                } else if (this.f33671b.t.m() != 2 && this.f33671b.t.D1() != 2) {
                    this.d = new AsseblemCardSplashATView(viewGroup.getContext(), this.f33671b, this.f33670a, this.f33672c);
                } else {
                    this.d = new AsseblemSplashATView(viewGroup.getContext(), this.f33671b, this.f33670a, this.f33672c);
                }
            }
        } else if (BaseSdkSplashATView.isSinglePicture(this.f33670a, this.f33671b.t)) {
            if (this.f33671b.t.r1() != 2) {
                this.d = new SinglePictureSplashATView(viewGroup.getContext(), this.f33671b, this.f33670a, this.f33672c);
            } else {
                this.d = new SinglePictureSplashATView(viewGroup.getContext(), this.f33671b, this.f33670a, this.f33672c);
            }
        } else if (this.f33671b.t.m() != 2) {
            this.d = new AsseblemSplashATView(viewGroup.getContext(), this.f33671b, this.f33670a, this.f33672c);
        } else {
            this.d = new AsseblemSplashATView(viewGroup.getContext(), this.f33671b, this.f33670a, this.f33672c);
        }
        this.d.setAdExtraInfoMap(map);
        this.d.setDontCountDown(z2);
        viewGroup.addView(this.d, -1, -1);
    }

    @Override // com.smartdigimkt.a5.c
    public View a(Context context) {
        if (this.f33673e == null && isAdReady()) {
            if (this.f33670a.v0()) {
                this.f33673e = new MraidBannerATView(context, this.f33671b, this.f33670a, this.f33672c);
            } else {
                this.f33673e = new SdkBannerATView(context, this.f33671b, this.f33670a, this.f33672c);
            }
        }
        return this.f33673e;
    }

    @Override // com.smartdigimkt.a5.c
    public com.smartdigimkt.b5.d a(Context context, l lVar, com.smartdigimkt.v6.a aVar, boolean z2) {
        if (z2) {
            return new com.smartdigimkt.b5.c(context, lVar, aVar, z2);
        }
        return new com.smartdigimkt.b5.b(context, lVar, aVar, z2);
    }
}
