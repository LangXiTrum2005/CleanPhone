package com.smartdigimkt.t1;

import android.content.Context;
import com.smartdigimkt.expressad.splash.view.ATSplashNativeView;
import com.smartdigimkt.expressad.splash.view.ATSplashView;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    public void a(ATSplashView aTSplashView, com.smartdigimkt.q1.b bVar, com.smartdigimkt.s1.a aVar) {
        Context context = aTSplashView.getContext();
        if (context == null) {
            context = com.smartdigimkt.m6.b.p().k();
        }
        if (bVar != null || aVar == null) {
            a(context, aTSplashView, bVar, aVar);
        } else {
            aVar.a("The render parameters is unavailable.");
        }
    }

    public void a(Context context, ATSplashView aTSplashView, com.smartdigimkt.q1.b bVar, com.smartdigimkt.s1.a aVar) {
        try {
            ATSplashNativeView aTSplashNativeView = new ATSplashNativeView(context, aTSplashView, bVar);
            if (aVar != null) {
                aVar.a(aTSplashNativeView);
            }
        } catch (Throwable unused) {
            if (aVar != null) {
                aVar.a("View render error.");
            }
        }
    }
}
