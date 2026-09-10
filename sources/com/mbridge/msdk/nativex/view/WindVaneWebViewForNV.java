package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.nativex.listener.b;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class WindVaneWebViewForNV extends WindVaneWebView {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f35062r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f35063s;

    public WindVaneWebViewForNV(Context context) {
        super(context);
        this.f35063s = false;
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        b bVar;
        if (i10 != 4 || (bVar = this.f35062r) == null) {
            return super.onKeyDown(i10, keyEvent);
        }
        bVar.a();
        return true;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f35063s) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void orientation(boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (z10) {
                jSONObject.put("orientation", X3.i.C);
            } else {
                jSONObject.put("orientation", X3.i.D);
            }
            f.a().a((WebView) this, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void setBackListener(b bVar) {
        this.f35062r = bVar;
    }

    public void setInterceptTouch(boolean z10) {
        this.f35063s = z10;
    }

    public void webViewShow(CampaignEx campaignEx, String str) {
        try {
            f.a().a((WebView) this, "webviewshow", "");
            n nVar = new n();
            nVar.n(campaignEx.getRequestId());
            nVar.o(campaignEx.getRequestIdNotice());
            if (getContext() != null && getContext().getApplicationContext() != null) {
                nVar.b(campaignEx.getId());
                nVar.b(campaignEx.isMraid() ? n.N : n.O);
                g.d(nVar, getContext().getApplicationContext(), str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public WindVaneWebViewForNV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35063s = false;
    }

    public WindVaneWebViewForNV(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f35063s = false;
    }
}
