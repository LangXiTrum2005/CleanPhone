package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.mo;
import java.util.Map;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.collections.seminary;
import p002kotlin.dern;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mo {
    public final Je a;
    public final C2942h3 b;
    public final long c;
    public Function0 d;
    public lo e;
    public final Handler f;
    public Runnable g;

    public mo(Je mNetworkRequest, C2942h3 mWebViewClient, long j, Function0 function0) {
        Intrinsics.checkNotNullParameter(mNetworkRequest, "mNetworkRequest");
        Intrinsics.checkNotNullParameter(mWebViewClient, "mWebViewClient");
        this.a = mNetworkRequest;
        this.b = mWebViewClient;
        this.c = j;
        this.d = function0;
        this.f = new Handler(Looper.getMainLooper());
    }

    public static final void a(mo moVar) {
        Intrinsics.checkNotNullExpressionValue("mo", "TAG");
        String str = moVar.a.a;
        moVar.a();
        Function0 function0 = moVar.d;
        if (function0 != null) {
            function0.invoke();
        }
        moVar.d = null;
    }

    public final void b() {
        try {
            Context context = Ji.a;
            if (context != null) {
                lo loVar = new lo(context);
                loVar.setWebViewClient(this.b);
                loVar.getSettings().setJavaScriptEnabled(true);
                loVar.getSettings().setCacheMode(2);
                this.e = loVar;
            }
            lo loVar2 = this.e;
            if (loVar2 != null) {
                Je je = this.a;
                String strA = Se.a(je.a, je.d);
                Map<String, String> mapTaiyuan = this.a.b;
                if (mapTaiyuan == null) {
                    mapTaiyuan = seminary.taiyuan();
                }
                loVar2.loadUrl(strA, mapTaiyuan);
            }
            if (this.c > 0) {
                Runnable runnable = new Runnable() { // from class: adsuki.staphylococcal
                    @Override // java.lang.Runnable
                    public final void run() {
                        mo.a(this.f3680kowloon);
                    }
                };
                this.f.postDelayed(runnable, this.c);
                this.g = runnable;
            }
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("mo", "TAG");
            e.getMessage();
        }
    }

    public final void a() {
        Runnable runnable = this.g;
        if (runnable != null) {
            this.f.removeCallbacks(runnable);
        }
        this.g = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            lo loVar = this.e;
            if (loVar != null && !loVar.a) {
                loVar.stopLoading();
                loVar.removeAllViews();
                loVar.destroy();
            }
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(dern.attabal(th));
        }
        this.e = null;
    }
}
