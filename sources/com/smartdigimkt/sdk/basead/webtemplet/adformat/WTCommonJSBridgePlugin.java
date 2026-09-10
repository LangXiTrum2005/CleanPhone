package com.smartdigimkt.sdk.basead.webtemplet.adformat;

import com.smartdigimkt.g6.d;
import com.smartdigimkt.g6.h;
import com.smartdigimkt.h6.b;
import com.smartdigimkt.sdk.basead.webtemplet.WTWebView;

/* JADX INFO: loaded from: classes6.dex */
public class WTCommonJSBridgePlugin extends d implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f38592c = getClass().getSimpleName();
    private b d;

    @Override // com.smartdigimkt.h6.b
    public void controlShakeView(Object obj, String str) {
        h.b(str);
        System.currentTimeMillis();
        b bVar = this.d;
        if (bVar != null) {
            bVar.controlShakeView(obj, h.b(str));
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void h5ShowException(Object obj, String str) {
        h.b(str);
        b bVar = this.d;
        if (bVar != null) {
            bVar.h5ShowException(obj, h.b(str));
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void initSuccess(Object obj, String str) {
        h.b(str);
        b bVar = this.d;
        if (bVar != null) {
            bVar.initSuccess(obj, h.b(str));
        }
    }

    @Override // com.smartdigimkt.g6.d
    public void initialize(WTWebView wTWebView) {
        super.initialize(wTWebView);
        try {
            if (wTWebView.getJsCommunicationObject() == null || !(wTWebView.getJsCommunicationObject() instanceof b)) {
                return;
            }
            this.d = (b) wTWebView.getJsCommunicationObject();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void notifyClick(Object obj, String str) {
        h.b(str);
        b bVar = this.d;
        if (bVar != null) {
            bVar.notifyClick(obj, h.b(str));
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void notifyClose(Object obj, String str) {
        h.b(str);
        b bVar = this.d;
        if (bVar != null) {
            bVar.notifyClose(obj, h.b(str));
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void notifyReward(Object obj, String str) {
        h.b(str);
        System.currentTimeMillis();
        b bVar = this.d;
        if (bVar != null) {
            bVar.notifyReward(obj, h.b(str));
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void openInWebView(Object obj, String str) {
        h.b(str);
        b bVar = this.d;
        if (bVar != null) {
            bVar.openInWebView(obj, h.b(str));
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void playerViewGetProgress(Object obj, String str) {
        h.b(str);
        b bVar = this.d;
        if (bVar != null) {
            bVar.playerViewGetProgress(obj, h.b(str));
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void playerViewInit(Object obj, String str) {
        h.b(str);
        b bVar = this.d;
        if (bVar != null) {
            bVar.playerViewInit(obj, h.b(str));
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void playerViewMute(Object obj, String str) {
        h.b(str);
        b bVar = this.d;
        if (bVar != null) {
            bVar.playerViewMute(obj, h.b(str));
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void playerViewPauseOrResumePlay(Object obj, String str) {
        h.b(str);
        b bVar = this.d;
        if (bVar != null) {
            bVar.playerViewPauseOrResumePlay(obj, h.b(str));
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void playerViewRelayout(Object obj, String str) {
        h.b(str);
        b bVar = this.d;
        if (bVar != null) {
            bVar.playerViewRelayout(obj, h.b(str));
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void playerViewRemove(Object obj, String str) {
        h.b(str);
        b bVar = this.d;
        if (bVar != null) {
            bVar.playerViewRemove(obj, h.b(str));
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void renderSuccess(Object obj, String str) {
        h.b(str);
        b bVar = this.d;
        if (bVar != null) {
            bVar.renderSuccess(obj, h.b(str));
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void sendEventDA(Object obj, String str) {
        h.b(str);
        b bVar = this.d;
        if (bVar != null) {
            bVar.sendEventDA(obj, h.b(str));
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void showFeedbackDialog(Object obj, String str) {
        h.b(str);
        b bVar = this.d;
        if (bVar != null) {
            bVar.showFeedbackDialog(obj, h.b(str));
        }
    }
}
