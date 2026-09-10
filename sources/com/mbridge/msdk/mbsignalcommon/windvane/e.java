package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import com.mbridge.msdk.interstitial.signalcommon.interstitial;
import com.mbridge.msdk.mbsignalcommon.communication.BannerSignalPlugin;
import com.mbridge.msdk.mbsignalcommon.mraid.MraidSignalCommunication;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebGLCheckSignal;
import com.mbridge.msdk.splash.signal.SplashSignal;
import com.mbridge.msdk.video.signal.communication.RewardSignal;
import com.mbridge.msdk.video.signal.communication.VideoCommunication;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static HashMap<String, Class> f34929d = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f34930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f34931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WindVaneWebView f34932c;

    public e(Context context, WindVaneWebView windVaneWebView) {
        this.f34930a = context;
        this.f34932c = windVaneWebView;
        a();
    }

    public void a(Context context) {
        this.f34930a = context;
    }

    public void a(Object obj) {
        this.f34931b = obj;
    }

    private Object a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f34929d.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!g.class.isAssignableFrom(cls)) {
                return null;
            }
            g gVar = (g) cls.newInstance();
            gVar.initialize(context, windVaneWebView);
            gVar.initialize(this.f34931b, windVaneWebView);
            return gVar;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public void a(String str, Class cls) {
        if (f34929d == null) {
            f34929d = new HashMap<>();
        }
        f34929d.put(str, cls);
    }

    public Object a(String str) {
        if (f34929d == null) {
            f34929d = new HashMap<>();
        }
        return a(str, this.f34932c, this.f34930a);
    }

    public void a() {
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f34805a, interstitial.class);
        } catch (ClassNotFoundException unused) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f34806b, RewardSignal.class);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f34807c, VideoCommunication.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f34809e, MraidSignalCommunication.class);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f34810f, BannerSignalPlugin.class);
        } catch (ClassNotFoundException unused5) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f34811g, SplashSignal.class);
        } catch (ClassNotFoundException unused6) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f34812h, WebGLCheckSignal.class);
        } catch (ClassNotFoundException unused7) {
        }
        try {
            if (com.mbridge.msdk.util.b.a()) {
                Class<?> cls = Class.forName("com.mbridge.msdk.mbsignalcommon.confirmation.bridge.ConfirmationJsBridgePlugin");
                a(cls.getSimpleName(), cls);
            }
        } catch (Exception unused8) {
        }
    }
}
