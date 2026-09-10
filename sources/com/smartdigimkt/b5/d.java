package com.smartdigimkt.b5;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;
import com.smartdigimkt.w6.l;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d implements com.smartdigimkt.y4.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f33955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    l f33956c;
    com.smartdigimkt.v6.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f33957e;
    protected com.smartdigimkt.f5.a f;
    boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f33958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f33959i;
    protected int j;
    protected int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    JSONArray f33960l;
    protected long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f33961n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33954a = "d";
    boolean o = false;

    public d(Context context, l lVar, com.smartdigimkt.v6.a aVar, boolean z2) {
        g gVar;
        this.f33959i = 1;
        this.f33955b = context.getApplicationContext();
        this.f33956c = lVar;
        this.d = aVar;
        this.f33957e = z2;
        if (aVar != null && (gVar = aVar.t) != null) {
            this.f33961n = gVar.t0() == 0;
        }
        this.f33959i = i.g(this.f33956c, this.d) ? 1 : 2;
    }

    @Override // com.smartdigimkt.y4.a
    public void a(int i2, int i3) {
        this.j = i2;
        this.k = i3;
    }

    public abstract View b();

    @Override // com.smartdigimkt.y4.a
    public void destroy() {
        unregisterView();
        this.f = null;
    }

    @Override // com.smartdigimkt.y4.a
    public View generateShakeViewContainer() {
        return null;
    }

    @Override // com.smartdigimkt.y4.a
    public String getAdChoiceIconUrl() {
        l lVar = this.f33956c;
        return lVar != null ? lVar.c() : "";
    }

    @Override // com.smartdigimkt.y4.a
    public int getAdImageHeight() {
        l lVar = this.f33956c;
        if (lVar != null) {
            return lVar.D();
        }
        return 0;
    }

    @Override // com.smartdigimkt.y4.a
    public int getAdImageWidth() {
        l lVar = this.f33956c;
        if (lVar != null) {
            return lVar.F();
        }
        return 0;
    }

    @Override // com.smartdigimkt.y4.a
    public int getAdType() {
        return this.f33959i;
    }

    @Override // com.smartdigimkt.y4.a
    public int getAdVideoHeight() {
        l lVar = this.f33956c;
        if (lVar != null) {
            return lVar.j0();
        }
        return 0;
    }

    @Override // com.smartdigimkt.y4.a
    public int getAdVideoWidth() {
        l lVar = this.f33956c;
        if (lVar != null) {
            return lVar.l0();
        }
        return 0;
    }

    @Override // com.smartdigimkt.y4.a
    public String getAppName() {
        l lVar = this.f33956c;
        return lVar != null ? lVar.z0() : "";
    }

    @Override // com.smartdigimkt.y4.a
    public String getAppVersion() {
        l lVar = this.f33956c;
        return lVar != null ? lVar.h() : "";
    }

    @Override // com.smartdigimkt.y4.a
    public f getBaseAdContent() {
        return this.f33956c;
    }

    @Override // com.smartdigimkt.y4.a
    public String getCallToAction() {
        l lVar = this.f33956c;
        return lVar != null ? lVar.n() : "";
    }

    @Override // com.smartdigimkt.y4.a
    public String getDescription() {
        l lVar = this.f33956c;
        return lVar != null ? lVar.r() : "";
    }

    @Override // com.smartdigimkt.y4.a
    public int getDownloadStatus() {
        l lVar;
        if (this.f33957e || (lVar = this.f33956c) == null) {
            return 0;
        }
        return lVar.g();
    }

    @Override // com.smartdigimkt.y4.a
    public String getFunctionUrl() {
        l lVar = this.f33956c;
        return lVar != null ? lVar.u() : "";
    }

    @Override // com.smartdigimkt.y4.a
    public String getIcon() {
        l lVar = this.f33956c;
        return lVar != null ? lVar.w() : "";
    }

    @Override // com.smartdigimkt.y4.a
    public int getInteractionType() {
        l lVar = this.f33956c;
        if (lVar != null) {
            return lVar.j();
        }
        return 0;
    }

    @Override // com.smartdigimkt.y4.a
    public String getMainImageUrl() {
        l lVar = this.f33956c;
        return lVar != null ? lVar.s() : "";
    }

    @Override // com.smartdigimkt.y4.a
    public String getPermissionUrl() {
        l lVar = this.f33956c;
        return lVar != null ? lVar.W() : "";
    }

    @Override // com.smartdigimkt.y4.a
    public String getPrivacyUrl() {
        l lVar = this.f33956c;
        return lVar != null ? lVar.Z() : "";
    }

    @Override // com.smartdigimkt.y4.a
    public String getPublisher() {
        l lVar = this.f33956c;
        return lVar != null ? lVar.b0() : "";
    }

    @Override // com.smartdigimkt.y4.a
    public String getTitle() {
        l lVar = this.f33956c;
        return lVar != null ? lVar.g0() : "";
    }

    @Override // com.smartdigimkt.y4.a
    public long getVideoCurrentPosition() {
        return 0L;
    }

    @Override // com.smartdigimkt.y4.a
    public long getVideoDuration() {
        l lVar = this.f33956c;
        if (lVar != null) {
            return lVar.i0();
        }
        return 0L;
    }

    @Override // com.smartdigimkt.y4.a
    public boolean isDownloadApp() {
        l lVar = this.f33956c;
        if (lVar != null) {
            return (TextUtils.isEmpty(lVar.b0()) && TextUtils.isEmpty(this.f33956c.z0()) && TextUtils.isEmpty(this.f33956c.W()) && TextUtils.isEmpty(this.f33956c.Z()) && TextUtils.isEmpty(this.f33956c.u()) && TextUtils.isEmpty(this.f33956c.h())) ? false : true;
        }
        return false;
    }

    @Override // com.smartdigimkt.y4.a
    public boolean isTemplateAd() {
        return this.f33957e;
    }

    @Override // com.smartdigimkt.y4.a
    public void onPause() {
        pauseVideo();
    }

    @Override // com.smartdigimkt.y4.a
    public void onResume() {
        resumeVideo();
    }

    @Override // com.smartdigimkt.y4.a
    public void pauseVideo() {
    }

    @Override // com.smartdigimkt.y4.a
    public void resumeVideo() {
    }

    @Override // com.smartdigimkt.y4.a
    public void setAutoPlay(String str) {
        this.f33958h = str;
    }

    @Override // com.smartdigimkt.y4.a
    public void setMute(boolean z2) {
        this.g = z2;
    }

    @Override // com.smartdigimkt.y4.a
    public void unregisterView() {
    }

    @Override // com.smartdigimkt.y4.a
    public void a(JSONArray jSONArray) {
        this.f33960l = jSONArray;
    }

    @Override // com.smartdigimkt.y4.a
    public void a(com.smartdigimkt.f5.a aVar) {
        this.f = aVar;
    }

    @Override // com.smartdigimkt.y4.a
    public boolean a(boolean z2, boolean z3) {
        if (this.f33956c.I() != 67) {
            return false;
        }
        if (!z3) {
            if (this.o) {
                return false;
            }
            this.o = true;
        }
        return this.f33956c.a(z2, z3);
    }

    public com.smartdigimkt.v3.l a() {
        com.smartdigimkt.v3.l lVar = new com.smartdigimkt.v3.l(this.d, "");
        View viewB = b();
        if (viewB != null) {
            lVar.g = viewB.getWidth();
            lVar.f39136h = viewB.getHeight();
            try {
                int[] iArr = new int[2];
                viewB.getLocationOnScreen(iArr);
                lVar.f39139n = iArr[0];
                lVar.o = iArr[1];
            } catch (Throwable unused) {
            }
            lVar.f39140p = com.smartdigimkt.k7.f.c.a(viewB);
            long j = this.m;
            if (j > 0) {
                lVar.q = j;
            }
        }
        return lVar;
    }
}
