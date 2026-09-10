package com.smartdigimkt.t1;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.smartdigimkt.expressad.splash.view.ATSplashView;
import com.smartdigimkt.v0.u;
import com.smartdigimkt.v0.y;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f38625a = "ResManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f38626b = 1;

    public class b implements com.smartdigimkt.f0.c {
        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
        }
    }

    public static void a(ATSplashView aTSplashView, com.smartdigimkt.x.d dVar, com.smartdigimkt.v1.a aVar) {
        com.smartdigimkt.f0.b.a(com.smartdigimkt.m6.b.p().k()).a(dVar.k(), new a(aVar, aTSplashView));
        if (TextUtils.isEmpty(dVar.i())) {
            return;
        }
        com.smartdigimkt.f0.b.a(com.smartdigimkt.m6.b.p().k()).a(dVar.i(), new b());
    }

    private static com.smartdigimkt.x.d b(com.smartdigimkt.x.d dVar) {
        if (!TextUtils.isEmpty(dVar.U()) || (!TextUtils.isEmpty(dVar.Q()) && dVar.Q().contains("<MBTPLMARK>"))) {
            dVar.h(true);
            dVar.k(false);
            return dVar;
        }
        dVar.h(false);
        dVar.k(true);
        return dVar;
    }

    public class a implements com.smartdigimkt.f0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.v1.a f38627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ATSplashView f38628b;

        public a(com.smartdigimkt.v1.a aVar, ATSplashView aTSplashView) {
            this.f38627a = aVar;
            this.f38628b = aTSplashView;
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            com.smartdigimkt.v1.a aVar = this.f38627a;
            if (aVar != null) {
                aVar.a();
            }
            ATSplashView aTSplashView = this.f38628b;
            if (aTSplashView != null) {
                aTSplashView.setImageReady(true);
            }
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
            com.smartdigimkt.v1.a aVar = this.f38627a;
            if (aVar != null) {
                aVar.b();
            }
            ATSplashView aTSplashView = this.f38628b;
            if (aTSplashView != null) {
                aTSplashView.setImageReady(false);
            }
        }
    }

    private static void a(ATSplashView aTSplashView, String str, com.smartdigimkt.x.d dVar, String str2, String str3, boolean z2, int i2, boolean z3) {
        g.d dVar2 = new g.d();
        dVar2.c(str3);
        dVar2.b(str2);
        dVar2.a(dVar);
        dVar2.a(str);
        dVar2.a(z2);
        dVar2.a(i2);
        dVar2.b(z3);
        g.a().a(aTSplashView, dVar2, null);
    }

    private static String a(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            return "file:///" + file.getAbsolutePath();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Exception e2) {
                e2.getMessage();
                return "";
            }
        }
    }

    public static boolean a(ATSplashView aTSplashView, com.smartdigimkt.x.d dVar) {
        if (aTSplashView == null) {
            return false;
        }
        boolean zIsVideoReady = !TextUtils.isEmpty(dVar.u2()) ? aTSplashView.isVideoReady() : true;
        if (zIsVideoReady && !TextUtils.isEmpty(dVar.U())) {
            zIsVideoReady = aTSplashView.isH5Ready();
        }
        if (zIsVideoReady && TextUtils.isEmpty(dVar.U()) && !TextUtils.isEmpty(dVar.Q())) {
            zIsVideoReady = aTSplashView.isH5Ready();
        }
        if (TextUtils.isEmpty(dVar.U()) && TextUtils.isEmpty(dVar.Q())) {
            zIsVideoReady = false;
        }
        if (!dVar.H2()) {
            return zIsVideoReady;
        }
        if (TextUtils.isEmpty(dVar.k())) {
            return false;
        }
        return aTSplashView.isImageReady();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002d  */
    public static boolean a(com.smartdigimkt.x.d dVar) {
        boolean z2;
        Bitmap bitmapA;
        if (TextUtils.isEmpty(dVar.u2())) {
            z2 = true;
        } else {
            String strA = com.smartdigimkt.c3.a.a().a(dVar.u2());
            if (y.a(strA) || new File(strA).length() <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (z2 && TextUtils.isEmpty(dVar.U()) && TextUtils.isEmpty(dVar.Q())) {
            z2 = false;
        }
        if (dVar.H2()) {
            return (TextUtils.isEmpty(dVar.k()) || (bitmapA = com.smartdigimkt.f0.a.a(u.a(dVar.k()))) == null || bitmapA.isRecycled()) ? false : true;
        }
        return z2;
    }
}
