package com.mbridge.msdk.mbsignalcommon.communication;

import android.content.Context;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseBannerSignalPlugin extends BannerSignalPluginDiff {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f34864g = "BannerSignalPlugin";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f34865h;

    public void click(Object obj, String str) {
        try {
            q0.b("BannerSignalPlugin", "click");
            e eVar = this.f34865h;
            if (eVar != null) {
                eVar.click(obj, str);
            }
        } catch (Throwable th2) {
            q0.b("BannerSignalPlugin", "click", th2);
        }
    }

    public void getFileInfo(Object obj, String str) {
        try {
            q0.b("BannerSignalPlugin", "getFileInfo");
            e eVar = this.f34865h;
            if (eVar != null) {
                eVar.getFileInfo(obj, str);
            }
        } catch (Throwable th2) {
            q0.b("BannerSignalPlugin", "getFileInfo", th2);
        }
    }

    public void getNetstat(Object obj, String str) {
        try {
            q0.b("BannerSignalPlugin", "getNetstat");
            e eVar = this.f34865h;
            if (eVar != null) {
                eVar.b(obj, str);
            }
        } catch (Throwable th2) {
            q0.b("BannerSignalPlugin", "getNetstat", th2);
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        try {
            q0.b("BannerSignalPlugin", "handlerH5Exception");
            e eVar = this.f34865h;
            if (eVar != null) {
                eVar.handlerH5Exception(obj, str);
            }
        } catch (Throwable th2) {
            q0.b("BannerSignalPlugin", "handlerH5Exception", th2);
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            q0.b("BannerSignalPlugin", "increaseOfferFrequence");
            e eVar = this.f34865h;
            if (eVar != null) {
                eVar.increaseOfferFrequence(obj, str);
            }
        } catch (Throwable th2) {
            q0.b("BannerSignalPlugin", "increaseOfferFrequence", th2);
        }
    }

    public void init(Object obj, String str) {
        try {
            q0.b("BannerSignalPlugin", "init");
            e eVar = this.f34865h;
            if (eVar != null) {
                eVar.init(obj, str);
            }
        } catch (Throwable th2) {
            q0.b("BannerSignalPlugin", "init", th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.g
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof e) {
                this.f34865h = (e) context;
            } else {
                if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof e)) {
                    return;
                }
                this.f34865h = (e) windVaneWebView.getObject();
            }
        } catch (Throwable th2) {
            q0.b("BannerSignalPlugin", MobileAdsBridgeBase.initializeMethodName, th2);
        }
    }

    public void install(Object obj, String str) {
        try {
            q0.b("BannerSignalPlugin", "install");
            e eVar = this.f34865h;
            if (eVar != null) {
                eVar.install(obj, str);
            }
        } catch (Throwable th2) {
            q0.b("BannerSignalPlugin", "install", th2);
        }
    }

    public void onSignalCommunication(Object obj, String str) {
        try {
            q0.b("BannerSignalPlugin", "onSignalCommunication");
            e eVar = this.f34865h;
            if (eVar != null) {
                eVar.c(obj, str);
            }
        } catch (Throwable th2) {
            q0.b("BannerSignalPlugin", "onSignalCommunication", th2);
        }
    }

    public void openURL(Object obj, String str) {
        try {
            q0.b("BannerSignalPlugin", "openURL");
            e eVar = this.f34865h;
            if (eVar != null) {
                eVar.openURL(obj, str);
            }
        } catch (Throwable th2) {
            q0.b("BannerSignalPlugin", "openURL", th2);
        }
    }

    public void readyStatus(Object obj, String str) {
        try {
            q0.b("BannerSignalPlugin", "readyStatus");
            e eVar = this.f34865h;
            if (eVar != null) {
                eVar.readyStatus(obj, str);
            }
        } catch (Throwable th2) {
            q0.b("BannerSignalPlugin", "readyStatus", th2);
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            q0.b("BannerSignalPlugin", "reportUrls");
            e eVar = this.f34865h;
            if (eVar != null) {
                eVar.reportUrls(obj, str);
            }
        } catch (Throwable th2) {
            q0.b("BannerSignalPlugin", "reportUrls", th2);
        }
    }

    public void resetCountdown(Object obj, String str) {
        try {
            q0.b("BannerSignalPlugin", "resetCountdown");
            e eVar = this.f34865h;
            if (eVar != null) {
                eVar.a(obj, str);
            }
        } catch (Throwable th2) {
            q0.b("BannerSignalPlugin", "resetCountdown", th2);
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            q0.b("BannerSignalPlugin", "sendImpressions");
            e eVar = this.f34865h;
            if (eVar != null) {
                eVar.d(obj, str);
            }
        } catch (Throwable th2) {
            q0.b("BannerSignalPlugin", "sendImpressions", th2);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            q0.b("BannerSignalPlugin", "toggleCloseBtn");
            e eVar = this.f34865h;
            if (eVar != null) {
                eVar.toggleCloseBtn(obj, str);
            }
        } catch (Throwable th2) {
            q0.b("BannerSignalPlugin", "toggleCloseBtn", th2);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        try {
            q0.b("BannerSignalPlugin", "triggerCloseBtn");
            e eVar = this.f34865h;
            if (eVar != null) {
                eVar.triggerCloseBtn(obj, str);
            }
        } catch (Throwable th2) {
            q0.b("BannerSignalPlugin", "triggerCloseBtn", th2);
        }
    }
}
