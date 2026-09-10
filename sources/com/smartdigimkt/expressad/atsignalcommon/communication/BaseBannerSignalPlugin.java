package com.smartdigimkt.expressad.atsignalcommon.communication;

import android.content.Context;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.j.c;
import com.smartdigimkt.n.j;

/* JADX INFO: loaded from: classes5.dex */
public class BaseBannerSignalPlugin extends j {
    private final String f = "BaseBannerSignalPlugin";
    protected c g;

    public void click(Object obj, String str) {
        try {
            c cVar = this.g;
            if (cVar != null) {
                cVar.click(obj, str);
            }
        } catch (Throwable unused) {
        }
    }

    public void getFileInfo(Object obj, String str) {
        try {
            c cVar = this.g;
            if (cVar != null) {
                cVar.getFileInfo(obj, str);
            }
        } catch (Throwable unused) {
        }
    }

    public void getNetstat(Object obj, String str) {
        try {
            c cVar = this.g;
            if (cVar != null) {
                cVar.getNetstat(obj, str);
            }
        } catch (Throwable unused) {
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        try {
            c cVar = this.g;
            if (cVar != null) {
                cVar.handlerH5Exception(obj, str);
            }
        } catch (Throwable unused) {
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            c cVar = this.g;
            if (cVar != null) {
                cVar.increaseOfferFrequence(obj, str);
            }
        } catch (Throwable unused) {
        }
    }

    public void init(Object obj, String str) {
        try {
            c cVar = this.g;
            if (cVar != null) {
                cVar.init(obj, str);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.smartdigimkt.n.j
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof c) {
                this.g = (c) context;
            } else {
                if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof c)) {
                    return;
                }
                this.g = (c) windVaneWebView.getObject();
            }
        } catch (Throwable unused) {
        }
    }

    public void install(Object obj, String str) {
        try {
            c cVar = this.g;
            if (cVar != null) {
                cVar.install(obj, str);
            }
        } catch (Throwable unused) {
        }
    }

    public void onSignalCommunication(Object obj, String str) {
        try {
            c cVar = this.g;
            if (cVar != null) {
                cVar.a(obj, str);
            }
        } catch (Throwable unused) {
        }
    }

    public void openURL(Object obj, String str) {
        try {
            c cVar = this.g;
            if (cVar != null) {
                cVar.openURL(obj, str);
            }
        } catch (Throwable unused) {
        }
    }

    public void readyStatus(Object obj, String str) {
        try {
            c cVar = this.g;
            if (cVar != null) {
                cVar.readyStatus(obj, str);
            }
        } catch (Throwable unused) {
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            c cVar = this.g;
            if (cVar != null) {
                cVar.reportUrls(obj, str);
            }
        } catch (Throwable unused) {
        }
    }

    public void resetCountdown(Object obj, String str) {
        try {
            c cVar = this.g;
            if (cVar != null) {
                cVar.resetCountdown(obj, str);
            }
        } catch (Throwable unused) {
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            c cVar = this.g;
            if (cVar != null) {
                cVar.sendImpressions(obj, str);
            }
        } catch (Throwable unused) {
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            c cVar = this.g;
            if (cVar != null) {
                cVar.toggleCloseBtn(obj, str);
            }
        } catch (Throwable unused) {
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        try {
            c cVar = this.g;
            if (cVar != null) {
                cVar.triggerCloseBtn(obj, str);
            }
        } catch (Throwable unused) {
        }
    }
}
