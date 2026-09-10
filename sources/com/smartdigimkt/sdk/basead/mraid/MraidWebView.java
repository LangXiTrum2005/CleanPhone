package com.smartdigimkt.sdk.basead.mraid;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import com.smartdigimkt.g5.d;
import com.smartdigimkt.g5.e;
import com.smartdigimkt.g5.k;
import com.smartdigimkt.s4.c;

/* JADX INFO: loaded from: classes6.dex */
public class MraidWebView extends MraidBaseWebView {
    public static String TAG = "MraidWebView";
    e v0;
    boolean w0;
    c x0;
    boolean y0;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            try {
                MraidWebView mraidWebView = MraidWebView.this;
                if (!mraidWebView.w0) {
                    mraidWebView.getViewTreeObserver().removeOnPreDrawListener(this);
                    MraidWebView mraidWebView2 = MraidWebView.this;
                    mraidWebView2.w0 = true;
                    int[] iArr = new int[2];
                    mraidWebView2.getLocationInWindow(iArr);
                    com.smartdigimkt.g5.c.a(MraidWebView.this, iArr[0], iArr[1]);
                    MraidWebView mraidWebView3 = MraidWebView.this;
                    com.smartdigimkt.g5.c.a(mraidWebView3, iArr[0], iArr[1], mraidWebView3.getWidth(), MraidWebView.this.getHeight());
                    MraidWebView.this.b();
                    MraidWebView mraidWebView4 = MraidWebView.this;
                    if (mraidWebView4.y0) {
                        mraidWebView4.c();
                    }
                    e eVar = MraidWebView.this.v0;
                    if (eVar != null) {
                        eVar.a();
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return false;
        }
    }

    public class b implements c.b {
        public b() {
        }

        @Override // com.smartdigimkt.s4.c.b
        public void a(double d) {
            String str = MraidWebView.TAG;
            try {
                com.smartdigimkt.s4.a.a().a(MraidWebView.this, d);
            } catch (Exception e2) {
                String str2 = MraidWebView.TAG;
                e2.getMessage();
            }
        }
    }

    public MraidWebView(Context context) {
        super(context);
        this.w0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        c cVar = new c(getContext());
        this.x0 = cVar;
        cVar.c();
        this.x0.a();
        this.x0.a(new b());
    }

    public void prepare(Context context, e eVar) {
        this.v0 = eVar;
        getViewTreeObserver().addOnPreDrawListener(new a());
    }

    @Override // com.smartdigimkt.sdk.basead.mraid.MraidBaseWebView, com.smartdigimkt.sdk.basead.express.web.BaseWebView
    public void release() {
        super.release();
        setWebViewListener(null);
        c cVar = this.x0;
        if (cVar != null) {
            cVar.d();
        }
    }

    public void setNeedRegisterVolumeChangeReceiver(boolean z2) {
        this.y0 = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object object = getObject();
        com.smartdigimkt.u4.b baseWebViewClient = getBaseWebViewClient();
        if (object instanceof d) {
            Context context = getContext();
            if (context instanceof Activity) {
                ((d) object).a((Activity) context);
            }
            ((d) object).a(this.v0);
        }
        if (baseWebViewClient instanceof k) {
            ((k) baseWebViewClient).a(this.v0);
        }
    }

    public MraidWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w0 = false;
    }

    public MraidWebView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.w0 = false;
    }
}
