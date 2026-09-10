package com.smartdigimkt.expressad.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.URLUtil;
import android.webkit.WebView;
import com.smartdigimkt.n.h;
import com.smartdigimkt.o8.c;
import com.smartdigimkt.x.d;

/* JADX INFO: loaded from: classes5.dex */
public class AnythinkLandingPageView extends AnythinkH5EndCardView {

    public static final class b implements com.smartdigimkt.u4.a {
        private b() {
        }

        @Override // com.smartdigimkt.u4.a
        public boolean a(String str) {
            if (TextUtils.isEmpty(str) || URLUtil.isNetworkUrl(str)) {
                return false;
            }
            c.a(com.smartdigimkt.m6.b.p().k(), str);
            return true;
        }
    }

    public AnythinkLandingPageView(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkH5EndCardView
    public String getURL() {
        d dVar = this.f0;
        if (dVar != null) {
            return dVar.p0();
        }
        return null;
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkH5EndCardView, com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        super.init(context);
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkH5EndCardView, com.smartdigimkt.x2.f
    public void preLoadData(com.smartdigimkt.y2.b bVar) {
        if (this.j0) {
            this.v0.setFilter(new b());
        }
        super.preLoadData(bVar);
        setVisibility(0);
        setCloseVisible(0);
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkH5EndCardView, com.smartdigimkt.x2.h
    public void webviewshow() {
        try {
            h.a().a((WebView) this.v0, "webviewshow", "");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public AnythinkLandingPageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
