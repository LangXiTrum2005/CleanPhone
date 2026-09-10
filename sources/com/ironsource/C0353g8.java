package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.g8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0353g8 extends FrameLayout implements H8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f28738b = "IronSourceAdContainer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0442l8 f28739a;

    /* JADX INFO: renamed from: com.ironsource.g8$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28741b;

        public a(String str, String str2) {
            this.f28740a = str;
            this.f28741b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0353g8 c0353g8 = C0353g8.this;
            c0353g8.removeView(c0353g8.f28739a.getPresentingView());
            C0353g8.this.f28739a.a(this.f28740a, this.f28741b);
            C0353g8.this.f28739a = null;
        }
    }

    public C0353g8(Context context) {
        super(context);
    }

    @Override // com.ironsource.H8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        this.f28739a.c(jSONObject, str, str2);
    }

    @Override // com.ironsource.H8
    public WebView getPresentingView() {
        return this.f28739a.getPresentingView();
    }

    public C0317e8 getSize() {
        C0442l8 c0442l8 = this.f28739a;
        return c0442l8 != null ? c0442l8.c() : new C0317e8();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        Logger.i(f28738b, "onVisibilityChanged: " + i10);
        C0442l8 c0442l8 = this.f28739a;
        if (c0442l8 == null) {
            return;
        }
        try {
            c0442l8.b().a(C0335f8.f28653k, i10, isShown());
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        Logger.i(f28738b, "onWindowVisibilityChanged: " + i10);
        C0442l8 c0442l8 = this.f28739a;
        if (c0442l8 == null) {
            return;
        }
        try {
            c0442l8.b().a(C0335f8.l, i10, isShown());
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public C0353g8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void b() throws Exception {
        JSONObject jSONObject;
        try {
            jSONObject = this.f28739a.b().a().getJSONObject(C0335f8.f28657p).getJSONObject(C0335f8.f28660s);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            jSONObject = new JSONObject();
        }
        jSONObject.put("adViewId", this.f28739a.a());
        this.f28739a.b().a(X3.h.S, jSONObject);
    }

    public void a() throws Exception {
        C0442l8 c0442l8 = this.f28739a;
        if (c0442l8 == null || c0442l8.b() == null) {
            throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
        b();
    }

    public C0353g8(C0442l8 c0442l8, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(c0442l8.c().c(), c0442l8.c().a()));
        this.f28739a = c0442l8;
        addView(c0442l8.getPresentingView());
    }

    @Override // com.ironsource.H8
    public void a(JSONObject jSONObject, String str, String str2) {
        this.f28739a.a(jSONObject, str, str2);
    }

    @Override // com.ironsource.H8
    public synchronized void a(String str, String str2) {
        C0442l8 c0442l8 = this.f28739a;
        if (c0442l8 != null && c0442l8.b() != null && this.f28739a.getPresentingView() != null) {
            this.f28739a.b().e();
            R7.f27125a.d(new a(str, str2));
        }
    }

    @Override // com.ironsource.H8
    public void a(String str, String str2, String str3) {
        C0442l8 c0442l8 = this.f28739a;
        if (c0442l8 == null) {
            return;
        }
        c0442l8.a(str, str2, str3);
    }

    @Override // com.ironsource.H8
    public void b(JSONObject jSONObject, String str, String str2) {
        this.f28739a.b(jSONObject, str, str2);
    }
}
