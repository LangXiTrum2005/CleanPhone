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

/* JADX INFO: renamed from: com.ironsource.e8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3492e8 extends FrameLayout implements F8 {
    private static final String b = "IronSourceAdContainer";
    private C3581j8 a;

    /* JADX INFO: renamed from: com.ironsource.e8$a */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3492e8 c3492e8 = C3492e8.this;
            c3492e8.removeView(c3492e8.a.getPresentingView());
            C3492e8.this.a.a(this.a, this.b);
            C3492e8.this.a = null;
        }
    }

    public C3492e8(Context context) {
        super(context);
    }

    private void b() throws Exception {
        JSONObject jSONObject;
        try {
            jSONObject = this.a.b().a().getJSONObject(C3474d8.p).getJSONObject(C3474d8.s);
        } catch (Exception e) {
            C3631m4.d().a(e);
            jSONObject = new JSONObject();
        }
        jSONObject.put("adViewId", this.a.a());
        this.a.b().a(X3.h.S, jSONObject);
    }

    public void a() throws Exception {
        C3581j8 c3581j8 = this.a;
        if (c3581j8 == null || c3581j8.b() == null) {
            throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
        b();
    }

    @Override // com.ironsource.F8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        this.a.c(jSONObject, str, str2);
    }

    @Override // com.ironsource.F8
    public WebView getPresentingView() {
        return this.a.getPresentingView();
    }

    public C3456c8 getSize() {
        C3581j8 c3581j8 = this.a;
        return c3581j8 != null ? c3581j8.c() : new C3456c8();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        Logger.i(b, "onVisibilityChanged: " + i);
        C3581j8 c3581j8 = this.a;
        if (c3581j8 == null) {
            return;
        }
        try {
            c3581j8.b().a(C3474d8.k, i, isShown());
        } catch (Exception e) {
            C3631m4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        Logger.i(b, "onWindowVisibilityChanged: " + i);
        C3581j8 c3581j8 = this.a;
        if (c3581j8 == null) {
            return;
        }
        try {
            c3581j8.b().a(C3474d8.l, i, isShown());
        } catch (Exception e) {
            C3631m4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public C3492e8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C3492e8(C3581j8 c3581j8, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(c3581j8.c().c(), c3581j8.c().a()));
        this.a = c3581j8;
        addView(c3581j8.getPresentingView());
    }

    @Override // com.ironsource.F8
    public void a(JSONObject jSONObject, String str, String str2) {
        this.a.a(jSONObject, str, str2);
    }

    @Override // com.ironsource.F8
    public synchronized void a(String str, String str2) {
        C3581j8 c3581j8 = this.a;
        if (c3581j8 != null && c3581j8.b() != null && this.a.getPresentingView() != null) {
            this.a.b().e();
            P7.a.d(new a(str, str2));
        }
    }

    @Override // com.ironsource.F8
    public void a(String str, String str2, String str3) {
        C3581j8 c3581j8 = this.a;
        if (c3581j8 == null) {
            return;
        }
        c3581j8.a(str, str2, str3);
    }

    @Override // com.ironsource.F8
    public void b(JSONObject jSONObject, String str, String str2) {
        this.a.b(jSONObject, str, str2);
    }
}
