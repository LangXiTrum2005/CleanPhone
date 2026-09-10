package com.smartdigimkt.h6;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.RoundCornerRelativeLayout;
import com.smartdigimkt.sdk.basead.webtemplet.WTWebView;
import com.smartdigimkt.w6.f;
import com.thinkup.core.api.TUAdConst;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class e implements com.smartdigimkt.h6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f35685a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.h6.a f35686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.smartdigimkt.q5.a f35687c;
    f d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    com.smartdigimkt.v6.a f35688e;

    public class a implements Runnable {
        final /* synthetic */ Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ int f35689Y;
        final /* synthetic */ int Z;
        final /* synthetic */ int e0;
        final /* synthetic */ int f0;
        final /* synthetic */ int g0;
        final /* synthetic */ int h0;
        final /* synthetic */ int i0;
        final /* synthetic */ int j0;
        final /* synthetic */ int k0;

        public a(Object obj, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            this.X = obj;
            this.f35689Y = i2;
            this.Z = i3;
            this.e0 = i4;
            this.f0 = i5;
            this.g0 = i6;
            this.h0 = i7;
            this.i0 = i8;
            this.j0 = i9;
            this.k0 = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewD = e.this.f35687c.d();
            if (viewD == null) {
                viewD = e.this.f35687c.c();
            }
            if (viewD == null) {
                com.smartdigimkt.g6.a.a(this.X, "playerViewContainer empty");
                return;
            }
            viewD.setX(this.f35689Y);
            viewD.setY(this.Z);
            ViewGroup.LayoutParams layoutParams = viewD.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.e0;
                layoutParams.height = this.f0;
                viewD.setLayoutParams(layoutParams);
            }
            e.this.f35687c.a(this.g0 == 1, (List<Bitmap>) null, (com.smartdigimkt.k5.d) null);
            if (viewD instanceof RoundCornerRelativeLayout) {
                ((RoundCornerRelativeLayout) viewD).setRadius(this.h0, this.i0, this.j0, this.k0);
            }
            viewD.requestLayout();
            com.smartdigimkt.g6.a.b(this.X, "");
            if (e.this.f35686b != null) {
                e.this.f35686b.b();
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ Object X;

        public b(Object obj) {
            this.X = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f35687c == null || e.this.f35687c.c() == null) {
                com.smartdigimkt.g6.a.a(this.X, "videoComponent empty");
                return;
            }
            long jE = e.this.f35687c.e();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("progress", jE);
                com.smartdigimkt.g6.a.a(this.X, jSONObject);
            } catch (Throwable th) {
                e.this.a(this.X, "playerViewGetProgress", th);
            }
        }
    }

    public class c implements Runnable {
        final /* synthetic */ Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ int f35691Y;
        final /* synthetic */ int Z;
        final /* synthetic */ int e0;
        final /* synthetic */ int f0;
        final /* synthetic */ int g0;
        final /* synthetic */ int h0;
        final /* synthetic */ int i0;
        final /* synthetic */ int j0;

        public c(Object obj, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.X = obj;
            this.f35691Y = i2;
            this.Z = i3;
            this.e0 = i4;
            this.f0 = i5;
            this.g0 = i6;
            this.h0 = i7;
            this.i0 = i8;
            this.j0 = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewD = e.this.f35687c.d();
            if (viewD == null) {
                e.this.f35687c.c();
            }
            if (viewD == null) {
                com.smartdigimkt.g6.a.a(this.X, "videoComponent empty");
                return;
            }
            viewD.setX(this.f35691Y);
            viewD.setY(this.Z);
            ViewGroup.LayoutParams layoutParams = viewD.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.e0;
                layoutParams.height = this.f0;
                viewD.setLayoutParams(layoutParams);
            }
            if (viewD instanceof RoundCornerRelativeLayout) {
                ((RoundCornerRelativeLayout) viewD).setRadius(this.g0, this.h0, this.i0, this.j0);
            }
            viewD.requestLayout();
            com.smartdigimkt.g6.a.b(this.X, "");
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void controlShakeView(Object obj, String str) {
        try {
            if (!i.a(this.f35688e)) {
                com.smartdigimkt.g6.a.a(obj, "not support shake");
                return;
            }
            int iOptInt = new JSONObject(str).optInt("control_show", 0);
            com.smartdigimkt.h6.a aVar = this.f35686b;
            if (aVar == null) {
                com.smartdigimkt.g6.a.a(obj, "bridgeListener empty");
            } else {
                aVar.a(iOptInt);
                com.smartdigimkt.g6.a.b(obj, "");
            }
        } catch (Throwable th) {
            a(obj, "notifyClose", th);
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void h5ShowException(Object obj, String str) {
        if (obj instanceof com.smartdigimkt.g6.e) {
            try {
                WTWebView wTWebView = ((com.smartdigimkt.g6.e) obj).f35472b;
                if (wTWebView == null) {
                    com.smartdigimkt.g6.a.a(obj, "WTWebView empty");
                } else {
                    wTWebView.h5ShowException(str);
                    com.smartdigimkt.g6.a.b(obj, "");
                }
            } catch (Throwable th) {
                a(obj, "h5ShowException", th);
            }
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void initSuccess(Object obj, String str) {
        String string;
        if (obj instanceof com.smartdigimkt.g6.e) {
            try {
                WTWebView wTWebView = ((com.smartdigimkt.g6.e) obj).f35472b;
                if (wTWebView == null) {
                    com.smartdigimkt.g6.a.a(obj, "WTWebView empty");
                    return;
                }
                wTWebView.jsCallInitSuccess();
                try {
                    Context contextK = com.smartdigimkt.m6.b.p().k();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(com.smartdigimkt.k6.b.c.f36227a, 2);
                    jSONObject.put("os_platform", 1);
                    int i2 = com.smartdigimkt.n8.c.i(contextK) + h.f(contextK);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("screen_width", com.smartdigimkt.n8.c.j(contextK));
                    jSONObject2.put("screen_height", i2);
                    int i3 = this.f35688e.f39164b;
                    if (i3 == 1 || i3 == 3 || i3 == 4) {
                        jSONObject2.put("top_padding", h.f(contextK));
                    } else {
                        jSONObject2.put("top_padding", 0);
                    }
                    jSONObject.put(com.smartdigimkt.k6.b.c.d, jSONObject2);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("ad_width", com.smartdigimkt.n8.c.j(contextK));
                    jSONObject3.put("ad_height", i2);
                    HashMap<String, Object> map = this.f35688e.f39172u;
                    if (map != null) {
                        int iA = h.a((Map<String, Object>) map, "key_width", 0);
                        if (iA > 0) {
                            jSONObject3.put("ad_width", iA);
                        }
                        int iA2 = h.a((Map<String, Object>) this.f35688e.f39172u, "key_height", 0);
                        if (iA2 > 0) {
                            jSONObject3.put("ad_height", iA2);
                        }
                        int iA3 = h.a((Map<String, Object>) this.f35688e.f39172u, "orientation", 0);
                        if (iA3 > 0) {
                            jSONObject3.put(TUAdConst.KEY.AD_ORIENTATION, iA3);
                        }
                    }
                    jSONObject.put(com.smartdigimkt.k6.b.c.f36230e, jSONObject3);
                    JSONObject jSONObject4 = new JSONObject();
                    if (!TextUtils.isEmpty(this.f35688e.o)) {
                        try {
                            jSONObject4 = new JSONObject(this.f35688e.o);
                        } catch (Throwable unused) {
                        }
                    }
                    jSONObject.put(com.smartdigimkt.k6.b.c.f, jSONObject4);
                    jSONObject.put("format", this.f35688e.f39164b);
                    jSONObject.put(com.smartdigimkt.k6.b.c.f36232i, wTWebView.isPreload() ? "1" : "2");
                    jSONObject.put("lang", Locale.getDefault().getLanguage());
                    string = jSONObject.toString();
                } catch (Throwable unused2) {
                    string = "";
                }
                if (TextUtils.isEmpty(string)) {
                    com.smartdigimkt.g6.a.a(obj, "");
                } else {
                    com.smartdigimkt.g6.a.b(obj, string);
                    wTWebView.offerDataInject();
                }
            } catch (Throwable th) {
                a(obj, "initSuccess", th);
            }
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void notifyClick(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("cl_s_type", 0);
            int iOptInt2 = jSONObject.optInt("cl_area", 0);
            com.smartdigimkt.h6.a aVar = this.f35686b;
            if (aVar == null) {
                com.smartdigimkt.g6.a.a(obj, "bridgeListener empty");
            } else {
                aVar.a(iOptInt, iOptInt2);
                com.smartdigimkt.g6.a.b(obj, "");
            }
        } catch (Throwable th) {
            a(obj, "notifyClick", th);
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void notifyClose(Object obj, String str) {
        try {
            int iOptInt = new JSONObject(str).optInt("close_scene", 0);
            com.smartdigimkt.h6.a aVar = this.f35686b;
            if (aVar == null) {
                com.smartdigimkt.g6.a.a(obj, "bridgeListener empty");
            } else {
                aVar.b(iOptInt);
                com.smartdigimkt.g6.a.b(obj, "");
            }
        } catch (Throwable th) {
            a(obj, "notifyClose", th);
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void notifyReward(Object obj, String str) {
        try {
            com.smartdigimkt.h6.a aVar = this.f35686b;
            if (aVar != null && (aVar instanceof d)) {
                ((d) aVar).c();
                com.smartdigimkt.g6.a.b(obj, "");
            } else if (aVar == null) {
                com.smartdigimkt.g6.a.a(obj, "bridgeListener empty");
            } else {
                com.smartdigimkt.g6.a.a(obj, "bridgeListener type error");
            }
        } catch (Throwable th) {
            a(obj, "notifyReward", th);
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void openInWebView(Object obj, String str) {
        Context context;
        int iOptInt;
        String strOptString;
        if (obj instanceof com.smartdigimkt.g6.e) {
            try {
                WTWebView wTWebView = ((com.smartdigimkt.g6.e) obj).f35472b;
                if (wTWebView != null) {
                    context = wTWebView.getContext();
                    if (context == null) {
                        context = com.smartdigimkt.m6.b.p().k();
                    }
                } else {
                    context = null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    iOptInt = jSONObject.optInt("type", 1);
                    try {
                        strOptString = jSONObject.optString("url", "");
                    } catch (Throwable unused) {
                        strOptString = "";
                    }
                } catch (Throwable unused2) {
                    iOptInt = 1;
                }
                if (TextUtils.isEmpty(strOptString)) {
                    com.smartdigimkt.g6.a.a(obj, "params error");
                    return;
                }
                if (iOptInt == 1) {
                    com.smartdigimkt.o8.c.a(context, strOptString);
                } else {
                    com.smartdigimkt.o8.c.a(strOptString);
                }
                com.smartdigimkt.g6.a.b(obj, "");
            } catch (Throwable th) {
                a(obj, "openInWebView", th);
            }
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void playerViewGetProgress(Object obj, String str) {
        com.smartdigimkt.l7.b.a().b((Runnable) new b(obj), 2);
    }

    @Override // com.smartdigimkt.h6.b
    public void playerViewInit(Object obj, String str) {
        com.smartdigimkt.q5.a aVar = this.f35687c;
        if (aVar == null || aVar.c() == null) {
            com.smartdigimkt.g6.a.a(obj, "videoComponent empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("position_x", 0);
            int iOptInt2 = jSONObject.optInt("position_y", 0);
            int iOptInt3 = jSONObject.optInt("view_width", 0);
            int iOptInt4 = jSONObject.optInt("view_height", 0);
            int iOptInt5 = jSONObject.optInt("mute", 1);
            int iOptInt6 = jSONObject.optInt("right_top_corner", 0);
            int iOptInt7 = jSONObject.optInt("right_bottom_corner", 0);
            com.smartdigimkt.l7.b.a().e(new a(obj, iOptInt, iOptInt2, iOptInt3, iOptInt4, iOptInt5, jSONObject.optInt("left_top_corner", 0), iOptInt6, iOptInt7, jSONObject.optInt("left_bottom_corner", 0)));
        } catch (Throwable th) {
            a(obj, "playerViewInit", th);
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void playerViewMute(Object obj, String str) {
        com.smartdigimkt.q5.a aVar = this.f35687c;
        if (aVar == null || aVar.c() == null) {
            com.smartdigimkt.g6.a.a(obj, "videoComponent empty");
            return;
        }
        try {
            boolean z2 = true;
            int iOptInt = new JSONObject(str).optInt("mute", 1);
            com.smartdigimkt.q5.a aVar2 = this.f35687c;
            if (iOptInt != 1) {
                z2 = false;
            }
            aVar2.d(z2);
            com.smartdigimkt.g6.a.b(obj, "");
        } catch (Throwable th) {
            a(obj, "playerViewMute", th);
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void playerViewPauseOrResumePlay(Object obj, String str) {
        com.smartdigimkt.q5.a aVar = this.f35687c;
        if (aVar == null || aVar.c() == null) {
            com.smartdigimkt.g6.a.a(obj, "videoComponent empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("is_resume", 1);
            boolean z2 = jSONObject.optInt("can_resume", 1) == 1;
            if (iOptInt == 1) {
                this.f35687c.c(z2);
            } else {
                this.f35687c.b(z2);
            }
            com.smartdigimkt.g6.a.b(obj, "");
        } catch (Throwable th) {
            a(obj, "playerViewPauseOrResumePlay", th);
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void playerViewRelayout(Object obj, String str) {
        Object obj2;
        com.smartdigimkt.q5.a aVar = this.f35687c;
        if (aVar == null || aVar.c() == null) {
            com.smartdigimkt.g6.a.a(obj, "videoComponent empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("position_x", 0);
            int iOptInt2 = jSONObject.optInt("position_y", 0);
            int iOptInt3 = jSONObject.optInt("view_width", 0);
            int iOptInt4 = jSONObject.optInt("view_height", 0);
            int iOptInt5 = jSONObject.optInt("right_top_corner", 0);
            int iOptInt6 = jSONObject.optInt("right_bottom_corner", 0);
            int iOptInt7 = jSONObject.optInt("left_top_corner", 0);
            int iOptInt8 = jSONObject.optInt("left_bottom_corner", 0);
            obj2 = obj;
            try {
                com.smartdigimkt.l7.b.a().e(new c(obj2, iOptInt, iOptInt2, iOptInt3, iOptInt4, iOptInt7, iOptInt5, iOptInt6, iOptInt8));
            } catch (Throwable th) {
                th = th;
                a(obj2, "playerViewRelayout", th);
            }
        } catch (Throwable th2) {
            th = th2;
            obj2 = obj;
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void playerViewRemove(Object obj, String str) {
        com.smartdigimkt.q5.a aVar = this.f35687c;
        if (aVar == null || aVar.c() == null) {
            com.smartdigimkt.g6.a.a(obj, "videoComponent empty");
            return;
        }
        try {
            this.f35687c.n();
            com.smartdigimkt.g6.a.b(obj, "");
        } catch (Throwable th) {
            a(obj, "playerViewRemove", th);
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void renderSuccess(Object obj, String str) {
        if (obj instanceof com.smartdigimkt.g6.e) {
            try {
                WTWebView wTWebView = ((com.smartdigimkt.g6.e) obj).f35472b;
                if (wTWebView == null) {
                    com.smartdigimkt.g6.a.a(obj, "WTWebView empty");
                } else {
                    wTWebView.renderSuccess();
                    com.smartdigimkt.g6.a.b(obj, "");
                }
            } catch (Throwable th) {
                a(obj, "renderSuccess", th);
            }
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void sendEventDA(Object obj, String str) {
        if (obj instanceof com.smartdigimkt.g6.e) {
            try {
                WTWebView wTWebView = ((com.smartdigimkt.g6.e) obj).f35472b;
                if (wTWebView == null) {
                    com.smartdigimkt.g6.a.a(obj, "WTWebView empty");
                } else {
                    wTWebView.sendEventDA(str);
                    com.smartdigimkt.g6.a.b(obj, "");
                }
            } catch (Throwable th) {
                a(obj, "sendEventDA", th);
            }
        }
    }

    @Override // com.smartdigimkt.h6.b
    public void showFeedbackDialog(Object obj, String str) {
        com.smartdigimkt.h6.a aVar = this.f35686b;
        if (aVar == null) {
            com.smartdigimkt.g6.a.a(obj, "bridgeListener empty");
        } else {
            aVar.a();
            com.smartdigimkt.g6.a.b(obj, "");
        }
    }

    public void a(f fVar, com.smartdigimkt.v6.a aVar) {
        this.d = fVar;
        this.f35688e = aVar;
    }

    public void a(com.smartdigimkt.h6.a aVar) {
        this.f35686b = aVar;
    }

    public com.smartdigimkt.h6.a a() {
        return this.f35686b;
    }

    public void a(com.smartdigimkt.q5.a aVar) {
        this.f35687c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj, String str, Throwable th) {
        if (obj == null || th == null) {
            return;
        }
        StringBuilder sbY = android.support.v4.media.a.y("call method ", str, " fail with exception:");
        sbY.append(th.getMessage());
        com.smartdigimkt.g6.a.a(obj, sbY.toString());
    }
}
