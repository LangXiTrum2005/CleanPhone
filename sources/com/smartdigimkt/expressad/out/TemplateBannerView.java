package com.smartdigimkt.expressad.out;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.smartdigimkt.c5.b;
import com.smartdigimkt.f1.h;
import com.smartdigimkt.f1.i;
import com.smartdigimkt.x.e;

/* JADX INFO: loaded from: classes5.dex */
public class TemplateBannerView extends RelativeLayout implements b {
    private com.smartdigimkt.d1.a e0;
    private h f0;
    private boolean g0;
    private boolean h0;
    private String i0;
    private String j0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TemplateBannerView.this.e0 == null || com.smartdigimkt.z.b.f) {
                return;
            }
            TemplateBannerView.this.e0.c(true);
        }
    }

    public TemplateBannerView(Context context) {
        this(context, null);
    }

    public String getCreativeIdWithUnitId() {
        com.smartdigimkt.d1.a aVar = this.e0;
        return aVar != null ? aVar.d() : "";
    }

    public String getRequestId() {
        com.smartdigimkt.d1.a aVar = this.e0;
        return aVar != null ? aVar.e() : "";
    }

    public void init(i iVar, String str, String str2) {
        this.j0 = str2;
        com.smartdigimkt.d1.a aVar = new com.smartdigimkt.d1.a(this, iVar, str, str2);
        this.e0 = aVar;
        aVar.c(this.h0);
        this.e0.b(this.g0);
    }

    @Override // com.smartdigimkt.c5.b
    public boolean isReady() {
        return true;
    }

    public void load(e eVar) {
        com.smartdigimkt.d1.a aVar = this.e0;
        if (aVar != null) {
            aVar.b(this.g0);
            this.e0.a(eVar);
        } else {
            h hVar = this.f0;
            if (hVar != null) {
                hVar.onLoadFailed(com.smartdigimkt.x0.a.f39855a);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
    }

    public void onPause() {
        if (this.e0 == null || !TextUtils.isEmpty(this.i0)) {
            return;
        }
        this.e0.g();
    }

    public void onResume() {
        if (this.e0 == null || !TextUtils.isEmpty(this.i0) || com.smartdigimkt.z.b.f) {
            return;
        }
        this.e0.h();
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        com.smartdigimkt.d1.a aVar = this.e0;
        if (aVar != null) {
            aVar.a(i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        this.h0 = i2 == 0;
        com.smartdigimkt.d1.a aVar = this.e0;
        if (aVar != null) {
            if (i2 == 0) {
                a();
            } else {
                aVar.c(false);
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.h0 = i2 == 0;
        if (this.e0 != null) {
            if (i2 == 0) {
                a();
            } else {
                if (com.smartdigimkt.z.b.f) {
                    return;
                }
                this.e0.c(false);
            }
        }
    }

    public void release() {
        if (this.f0 != null) {
            this.f0 = null;
        }
        com.smartdigimkt.d1.a aVar = this.e0;
        if (aVar != null) {
            aVar.a((h) null);
            this.e0.i();
        }
        removeAllViews();
    }

    public void setAllowShowCloseBtn(boolean z2) {
        com.smartdigimkt.d1.a aVar = this.e0;
        if (aVar != null) {
            aVar.a(z2);
        }
    }

    public void setBannerAdListener(h hVar) {
        this.f0 = hVar;
        com.smartdigimkt.d1.a aVar = this.e0;
        if (aVar != null) {
            aVar.a(hVar);
        }
    }

    public void updateBannerSize(i iVar) {
        com.smartdigimkt.d1.a aVar = this.e0;
        if (aVar != null) {
            aVar.a(iVar);
        }
    }

    public TemplateBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(boolean z2) {
        this.g0 = z2;
        com.smartdigimkt.d1.a aVar = this.e0;
        if (aVar != null) {
            aVar.b(z2);
        }
    }

    public TemplateBannerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.g0 = false;
        this.h0 = false;
        com.smartdigimkt.u.a.f().a(context);
    }

    private void a() {
        postDelayed(new a(), 200L);
    }
}
