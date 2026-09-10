package com.p004ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class dh extends FrameLayout implements di {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f24796b = "IronSourceAdContainer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ih f24797a;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f24798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24799b;

        public a(String str, String str2) {
            this.f24798a = str;
            this.f24799b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            dh dhVar = dh.this;
            dhVar.removeView(dhVar.f24797a.getPresentingView());
            dh.this.f24797a.a(this.f24798a, this.f24799b);
            dh.this.f24797a = null;
        }
    }

    public dh(Context context) {
        super(context);
    }

    private void b() throws Exception {
        JSONObject jSONObject;
        try {
            jSONObject = this.f24797a.c().a().getJSONObject(ch.f24532p).getJSONObject(ch.s);
        } catch (Exception e2) {
            q9.d().a(e2);
            jSONObject = new JSONObject();
        }
        jSONObject.put("adViewId", this.f24797a.b());
        this.f24797a.c().a(d9.g.S, jSONObject);
    }

    @Override // com.p004ironsource.di
    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        this.f24797a.c(jSONObject, str, str2);
    }

    @Override // com.p004ironsource.di
    public WebView getPresentingView() {
        return this.f24797a.getPresentingView();
    }

    public bh getSize() {
        ih ihVar = this.f24797a;
        return ihVar != null ? ihVar.d() : new bh();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        Logger.i(f24796b, "onVisibilityChanged: " + i2);
        ih ihVar = this.f24797a;
        if (ihVar == null) {
            return;
        }
        try {
            ihVar.c().a(ch.k, i2, isShown());
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
        Logger.i(f24796b, "onWindowVisibilityChanged: " + i2);
        ih ihVar = this.f24797a;
        if (ihVar == null) {
            return;
        }
        try {
            ihVar.c().a(ch.f24530l, i2, isShown());
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public dh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p004ironsource.di
    public void b(JSONObject jSONObject, String str, String str2) {
        this.f24797a.b(jSONObject, str, str2);
    }

    public dh(ih ihVar, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(ihVar.d().c(), ihVar.d().a()));
        this.f24797a = ihVar;
        addView(ihVar.getPresentingView());
    }

    public void a() throws Exception {
        ih ihVar = this.f24797a;
        if (ihVar == null || ihVar.c() == null) {
            throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
        b();
    }

    @Override // com.p004ironsource.di
    public synchronized void a(String str, String str2) {
        ih ihVar = this.f24797a;
        if (ihVar != null && ihVar.c() != null && this.f24797a.getPresentingView() != null) {
            this.f24797a.c().e();
            pg.f26494a.d(new a(str, str2));
        }
    }

    @Override // com.p004ironsource.di
    public void a(String str, String str2, String str3) {
        ih ihVar = this.f24797a;
        if (ihVar == null) {
            return;
        }
        ihVar.a(str, str2, str3);
    }

    @Override // com.p004ironsource.di
    public void a(JSONObject jSONObject, String str, String str2) {
        this.f24797a.a(jSONObject, str, str2);
    }
}
