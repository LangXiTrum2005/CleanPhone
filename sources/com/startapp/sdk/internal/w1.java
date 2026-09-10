package com.startapp.sdk.internal;

import android.app.Activity;
import java.net.URLDecoder;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class w1 implements rc {
    private static final String LOG_TAG = "w1";
    protected v1 openListener;

    public w1(v1 v1Var) {
        this.openListener = v1Var;
    }

    public void applyOrientationProperties(Activity activity, ad adVar) {
        try {
            int i2 = 0;
            int i3 = activity.getResources().getConfiguration().orientation == 1 ? 1 : 0;
            int i4 = adVar.f40803b;
            if (i4 == 0) {
                i2 = 1;
            } else if (i4 != 1) {
                i2 = adVar.f40802a ? -1 : i3;
            }
            int i5 = q0.f41381a;
            try {
                activity.setRequestedOrientation(i2);
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            g9.a(th);
        }
    }

    @Override // com.startapp.sdk.internal.rc
    public abstract void close();

    @Override // com.startapp.sdk.internal.rc
    public void createCalendarEvent(String str) {
        isFeatureSupported("calendar");
    }

    @Override // com.startapp.sdk.internal.rc
    public void expand(String str) {
    }

    public abstract boolean isFeatureSupported(String str);

    @Override // com.startapp.sdk.internal.rc
    public boolean open(String str) {
        try {
            String strTrim = URLDecoder.decode(str, "UTF-8").trim();
            if (strTrim.startsWith("sms")) {
                return openSMS(strTrim);
            }
            return strTrim.startsWith("tel") ? openTel(strTrim) : this.openListener.a(strTrim);
        } catch (Exception unused) {
            return this.openListener.a(str);
        }
    }

    public boolean openSMS(String str) {
        isFeatureSupported("sms");
        return true;
    }

    public boolean openTel(String str) {
        isFeatureSupported("tel");
        return true;
    }

    @Override // com.startapp.sdk.internal.rc
    public void playVideo(String str) {
        isFeatureSupported("inlineVideo");
    }

    @Override // com.startapp.sdk.internal.rc
    public void resize() {
    }

    @Override // com.startapp.sdk.internal.rc
    public void setExpandProperties(Map<String, String> map) {
    }

    @Override // com.startapp.sdk.internal.rc
    public abstract void setOrientationProperties(Map<String, String> map);

    @Override // com.startapp.sdk.internal.rc
    public void setResizeProperties(Map<String, String> map) {
    }

    @Override // com.startapp.sdk.internal.rc
    public void storePicture(String str) {
        isFeatureSupported("storePicture");
    }

    @Override // com.startapp.sdk.internal.rc
    public abstract void useCustomClose(String str);
}
