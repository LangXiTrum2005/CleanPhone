package com.smartdigimkt.z2;

import android.content.res.Configuration;
import com.smartdigimkt.expressad.video.module.AnythinkContainerView;

/* JADX INFO: loaded from: classes6.dex */
public class k extends d {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private AnythinkContainerView f40329Y;

    public k(AnythinkContainerView anythinkContainerView) {
        this.f40329Y = anythinkContainerView;
    }

    @Override // com.smartdigimkt.z2.d, com.smartdigimkt.x2.e
    public void configurationChanged(int i2, int i3, int i4) {
        super.configurationChanged(i2, i3, i4);
        try {
            AnythinkContainerView anythinkContainerView = this.f40329Y;
            if (anythinkContainerView != null) {
                anythinkContainerView.configurationChanged(i2, i3, i4);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.z2.d, com.smartdigimkt.x2.e
    public boolean endCardShowing() {
        try {
            AnythinkContainerView anythinkContainerView = this.f40329Y;
            if (anythinkContainerView != null) {
                return anythinkContainerView.endCardShowing();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.endCardShowing();
    }

    @Override // com.smartdigimkt.z2.d, com.smartdigimkt.x2.e
    public void hideAlertWebview() {
        super.hideAlertWebview();
        AnythinkContainerView anythinkContainerView = this.f40329Y;
        if (anythinkContainerView != null) {
            anythinkContainerView.hideAlertWebview();
        }
    }

    @Override // com.smartdigimkt.z2.d, com.smartdigimkt.x2.h
    public void install(com.smartdigimkt.x.d dVar) {
        super.install(dVar);
        try {
            AnythinkContainerView anythinkContainerView = this.f40329Y;
            if (anythinkContainerView != null) {
                anythinkContainerView.install(dVar);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.z2.d, com.smartdigimkt.x2.e
    public void ivRewardAdsWithoutVideo(String str) {
        super.ivRewardAdsWithoutVideo(str);
        AnythinkContainerView anythinkContainerView = this.f40329Y;
        if (anythinkContainerView != null) {
            anythinkContainerView.ivRewardAdsWithoutVideo(str);
        }
    }

    @Override // com.smartdigimkt.z2.d, com.smartdigimkt.x2.e
    public boolean miniCardLoaded() {
        try {
            AnythinkContainerView anythinkContainerView = this.f40329Y;
            if (anythinkContainerView != null) {
                return anythinkContainerView.miniCardLoaded();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.miniCardLoaded();
    }

    @Override // com.smartdigimkt.z2.d, com.smartdigimkt.x2.e
    public boolean miniCardShowing() {
        try {
            AnythinkContainerView anythinkContainerView = this.f40329Y;
            if (anythinkContainerView != null) {
                return anythinkContainerView.miniCardShowing();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.miniCardShowing();
    }

    @Override // com.smartdigimkt.z2.d, com.smartdigimkt.x2.h
    public void orientation(Configuration configuration) {
        super.orientation(configuration);
        try {
            AnythinkContainerView anythinkContainerView = this.f40329Y;
            if (anythinkContainerView != null) {
                anythinkContainerView.orientation(configuration);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.z2.d, com.smartdigimkt.x2.f
    public void preLoadData(com.smartdigimkt.y2.b bVar) {
        super.preLoadData(bVar);
        try {
            AnythinkContainerView anythinkContainerView = this.f40329Y;
            if (anythinkContainerView != null) {
                anythinkContainerView.preLoadData(bVar);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.z2.d, com.smartdigimkt.x2.e, com.smartdigimkt.x2.h
    public void readyStatus(int i2) {
        try {
            AnythinkContainerView anythinkContainerView = this.f40329Y;
            if (anythinkContainerView != null) {
                anythinkContainerView.readyStatus(i2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.readyStatus(i2);
    }

    @Override // com.smartdigimkt.z2.d, com.smartdigimkt.x2.e
    public void resizeMiniCard(int i2, int i3, int i4) {
        super.resizeMiniCard(i2, i3, i4);
        try {
            AnythinkContainerView anythinkContainerView = this.f40329Y;
            if (anythinkContainerView != null) {
                anythinkContainerView.resizeMiniCard(i2, i3, i4);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.z2.d, com.smartdigimkt.x2.e
    public boolean showAlertWebView() {
        super.showAlertWebView();
        AnythinkContainerView anythinkContainerView = this.f40329Y;
        if (anythinkContainerView != null) {
            return anythinkContainerView.showAlertWebView();
        }
        return false;
    }

    @Override // com.smartdigimkt.z2.d, com.smartdigimkt.x2.e
    public void showEndcard(int i2) {
        super.showEndcard(i2);
        try {
            AnythinkContainerView anythinkContainerView = this.f40329Y;
            if (anythinkContainerView != null) {
                anythinkContainerView.showEndcard(i2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.z2.d, com.smartdigimkt.x2.e
    public void showMiniCard(int i2, int i3, int i4, int i5, int i6) {
        super.showMiniCard(i2, i3, i4, i5, i6);
        try {
            AnythinkContainerView anythinkContainerView = this.f40329Y;
            if (anythinkContainerView != null) {
                anythinkContainerView.showMiniCard(i2, i3, i4, i5, i6);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.z2.d, com.smartdigimkt.x2.e
    public void showPlayableView() {
        super.showPlayableView();
        try {
            AnythinkContainerView anythinkContainerView = this.f40329Y;
            if (anythinkContainerView != null) {
                anythinkContainerView.showPlayableView();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.z2.d, com.smartdigimkt.x2.e
    public void showVideoClickView(int i2) {
        super.showVideoClickView(i2);
        AnythinkContainerView anythinkContainerView = this.f40329Y;
        if (anythinkContainerView != null) {
            anythinkContainerView.showVideoClickView(i2);
        }
    }

    @Override // com.smartdigimkt.z2.d, com.smartdigimkt.x2.h
    public void toggleCloseBtn(int i2) {
        super.toggleCloseBtn(i2);
        try {
            AnythinkContainerView anythinkContainerView = this.f40329Y;
            if (anythinkContainerView != null) {
                anythinkContainerView.toggleCloseBtn(i2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.z2.d, com.smartdigimkt.x2.h
    public void webviewshow() {
        super.webviewshow();
        try {
            AnythinkContainerView anythinkContainerView = this.f40329Y;
            if (anythinkContainerView != null) {
                anythinkContainerView.webviewshow();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
