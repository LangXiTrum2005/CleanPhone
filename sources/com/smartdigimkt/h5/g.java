package com.smartdigimkt.h5;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.api.SDMAdConst;
import com.smartdigimkt.sdk.basead.ui.AsseblemSplashATView;
import com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView;
import com.smartdigimkt.sdk.basead.ui.BaseSplashATView;
import com.smartdigimkt.sdk.basead.ui.SinglePictureSplashATView;

/* JADX INFO: loaded from: classes5.dex */
public class g extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    com.smartdigimkt.f5.a f35683i;
    BaseSplashATView j;
    boolean k;

    public class a implements Runnable {
        final /* synthetic */ ViewGroup X;

        public a(ViewGroup viewGroup) {
            this.X = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            if (BaseSdkSplashATView.isSinglePicture(gVar.f, gVar.f35665c.t)) {
                g gVar2 = g.this;
                Context context = this.X.getContext();
                g gVar3 = g.this;
                gVar2.j = new SinglePictureSplashATView(context, gVar3.f35665c, gVar3.f, gVar3.f35683i);
            } else {
                g gVar4 = g.this;
                Context context2 = this.X.getContext();
                g gVar5 = g.this;
                gVar4.j = new AsseblemSplashATView(context2, gVar5.f35665c, gVar5.f, gVar5.f35683i);
            }
            g gVar6 = g.this;
            gVar6.j.setDontCountDown(gVar6.k);
            this.X.addView(g.this.j);
        }
    }

    public g(Context context, com.smartdigimkt.v6.a aVar, String str, boolean z2) {
        super(context, aVar, str, z2);
    }

    @Override // com.smartdigimkt.h5.a
    public void a(Activity activity) {
    }

    public void h() {
        this.f35683i = null;
        BaseSplashATView baseSplashATView = this.j;
        if (baseSplashATView != null) {
            baseSplashATView.destroy();
            this.j = null;
        }
    }

    @Override // com.smartdigimkt.h5.c, com.smartdigimkt.h5.a
    public boolean isReady() {
        try {
            if (a()) {
                return com.smartdigimkt.i5.a.a(this.f35664b).a(this.f, this.f35665c, this.f35666e);
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public void a(ViewGroup viewGroup) {
        this.k = h.a(d(), SDMAdConst.EXTRA_PARAMS.SHOW_HIDE_SPLASH_SKIP_VIEW, false);
        com.smartdigimkt.l7.b.a().e(new a(viewGroup));
    }

    public void a(com.smartdigimkt.f5.a aVar) {
        this.f35683i = aVar;
    }
}
