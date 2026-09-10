package com.smartdigimkt.g5;

import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.d9;
import com.smartdigimkt.sdk.basead.mraid.MraidBaseWebView;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class h {
    protected static final String d = "MraidJSBridge";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f35455e = 1500;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f35456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected MraidBaseWebView f35457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.smartdigimkt.s4.b f35458c;

    /* JADX WARN: Multi-variable type inference failed */
    public void a(Context context, MraidBaseWebView mraidBaseWebView) {
        this.f35456a = context;
        this.f35457b = mraidBaseWebView;
        try {
            if (context instanceof com.smartdigimkt.s4.b) {
                this.f35458c = (com.smartdigimkt.s4.b) context;
                return;
            }
            if (mraidBaseWebView.getObject() != null && (mraidBaseWebView.getObject() instanceof com.smartdigimkt.s4.b)) {
                this.f35458c = (com.smartdigimkt.s4.b) mraidBaseWebView.getObject();
            }
            if (mraidBaseWebView.getMraidObject() == null || !(mraidBaseWebView.getMraidObject() instanceof com.smartdigimkt.s4.b)) {
                return;
            }
            this.f35458c = (com.smartdigimkt.s4.b) mraidBaseWebView.getMraidObject();
        } catch (Exception unused) {
        }
    }

    public void b(String str) {
        com.smartdigimkt.s4.a.a().b(this.f35457b, "expand");
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            String strOptString2 = jSONObject.optString("shouldUseCustomClose");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || this.f35458c == null) {
                return;
            }
            this.f35458c.expand(strOptString, strOptString2.toLowerCase().equals(com.p004ironsource.mediationsdk.metadata.a.g));
        } catch (Throwable unused) {
        }
    }

    public void c(String str) {
        com.smartdigimkt.s4.a.a().b(this.f35457b, MRAIDPresenter.OPEN);
        try {
            String strOptString = new JSONObject(str).optString("url");
            if (this.f35458c == null || TextUtils.isEmpty(strOptString)) {
                return;
            }
            this.f35458c.open(strOptString);
        } catch (Throwable unused) {
        }
    }

    public void d(String str) {
        String str2;
        com.smartdigimkt.s4.a.a().b(this.f35457b, MRAIDPresenter.SET_ORIENTATION_PROPERTIES);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("allowOrientationChange");
            String strOptString2 = jSONObject.optString("forceOrientation");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || this.f35458c == null) {
                return;
            }
            strOptString.toLowerCase().equals(com.p004ironsource.mediationsdk.metadata.a.g);
            String lowerCase = strOptString2.toLowerCase();
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == 729267099) {
                str2 = d9.h.D;
            } else if (iHashCode != 1430647483) {
                return;
            } else {
                str2 = d9.h.C;
            }
            lowerCase.equals(str2);
        } catch (Throwable unused) {
        }
    }

    public void e(String str) {
        com.smartdigimkt.s4.a.a().b(this.f35457b, "unload");
        try {
            com.smartdigimkt.s4.b bVar = this.f35458c;
            if (bVar != null) {
                bVar.unload();
            }
        } catch (Throwable unused) {
        }
    }

    public void f(String str) {
        com.smartdigimkt.s4.a.a().b(this.f35457b, "useCustomClose");
        try {
            String strOptString = new JSONObject(str).optString("shouldUseCustomClose");
            if (TextUtils.isEmpty(strOptString) || this.f35458c == null) {
                return;
            }
            this.f35458c.useCustomClose(strOptString.toLowerCase().equals(com.p004ironsource.mediationsdk.metadata.a.g));
        } catch (Throwable unused) {
        }
    }

    public void a(String str) {
        com.smartdigimkt.s4.a.a().b(this.f35457b, "close");
        try {
            com.smartdigimkt.s4.b bVar = this.f35458c;
            if (bVar != null) {
                bVar.close();
            }
        } catch (Throwable unused) {
        }
    }
}
