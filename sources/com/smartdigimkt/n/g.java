package com.smartdigimkt.n;

import android.content.Context;
import com.smartdigimkt.expressad.atsignalcommon.bridge.BannerJSPlugin;
import com.smartdigimkt.expressad.atsignalcommon.mraid.MraidSignalCommunication;
import com.smartdigimkt.expressad.atsignalcommon.webEnvCheck.WebGLCheckSignal;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.expressad.splash.js.SplashJs;
import com.smartdigimkt.expressad.video.signal.communication.RewardJs;
import com.smartdigimkt.expressad.video.signal.communication.VideoBridge;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class g {
    private static HashMap<String, Class> d = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f36893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f36894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WindVaneWebView f36895c;

    public g(Context context, WindVaneWebView windVaneWebView) {
        this.f36893a = context;
        this.f36895c = windVaneWebView;
        a();
    }

    public void a(Context context) {
        this.f36893a = context;
    }

    public void b(String str) {
        if (d == null) {
            d = new HashMap<>();
        }
        d.remove(str);
    }

    public void a(Object obj) {
        this.f36894b = obj;
    }

    private Object a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = d.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!j.class.isAssignableFrom(cls)) {
                return null;
            }
            j jVar = (j) cls.newInstance();
            jVar.initialize(context, windVaneWebView);
            jVar.initialize(this.f36894b, windVaneWebView);
            return jVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void a(Class cls) {
        if (d == null) {
            d = new HashMap<>();
        }
        d.put(cls.getSimpleName(), cls);
    }

    public void a(String str, Class cls) {
        if (d == null) {
            d = new HashMap<>();
        }
        d.put(str, cls);
    }

    public Object a(String str) {
        if (d == null) {
            d = new HashMap<>();
        }
        return a(str, this.f36895c, this.f36893a);
    }

    public void a() {
        try {
            a(BannerJSPlugin.class);
        } catch (ClassNotFoundException unused) {
        }
        try {
            a(RewardJs.class);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            a(VideoBridge.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            a(com.smartdigimkt.h.b.f35555e, MraidSignalCommunication.class);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            a(SplashJs.class);
        } catch (ClassNotFoundException unused5) {
        }
        try {
            a(com.smartdigimkt.h.b.f35556h, WebGLCheckSignal.class);
        } catch (ClassNotFoundException unused6) {
        }
    }
}
