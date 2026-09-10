package com.smartdigimkt.e;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.smartdigimkt.c0.f;
import com.smartdigimkt.expressad.advanced.js.NativeAdvancedJSBridgeImpl;
import com.smartdigimkt.expressad.advanced.js.NativeAdvancedJsUtils;
import com.smartdigimkt.expressad.advanced.view.ATNativeAdvancedView;
import com.smartdigimkt.expressad.advanced.view.ATNativeAdvancedWebview;
import com.smartdigimkt.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5;
import com.smartdigimkt.n.h;
import com.smartdigimkt.v0.a0;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.l;
import com.smartdigimkt.v0.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected com.smartdigimkt.x.d f34524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ATNativeAdvancedView f34525c;
    protected com.smartdigimkt.f.d d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected com.smartdigimkt.o.a f34526e;
    private com.smartdigimkt.f.c f;
    private boolean g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f34528i;
    protected String j;
    private String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f34529l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34523a = "NativeAdvancedShowManager";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f34527h = -1;
    private View.OnClickListener m = new ViewOnClickListenerC0461a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Handler f34530n = new b(Looper.getMainLooper());
    private com.smartdigimkt.f.a o = new c();

    /* JADX INFO: renamed from: com.smartdigimkt.e.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0461a implements View.OnClickListener {
        public ViewOnClickListenerC0461a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.g) {
                a.this.a(1);
            }
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            com.smartdigimkt.x.d dVar;
            ATNativeAdvancedView aTNativeAdvancedView;
            super.handleMessage(message);
            if (message.what == 2 && (dVar = a.this.f34524b) != null && dVar.C2() && (aTNativeAdvancedView = a.this.f34525c) != null) {
                aTNativeAdvancedView.getAdvancedNativeWebview();
            }
        }
    }

    public class c implements com.smartdigimkt.f.a {
        public c() {
        }

        @Override // com.smartdigimkt.f.a
        public void a(int i2) {
            String unused = a.this.f34523a;
        }

        @Override // com.smartdigimkt.f.a
        public void close() {
            a.this.a(1);
        }

        @Override // com.smartdigimkt.f.a
        public void handlerH5Exception(Object obj, String str) {
            a.this.a(str);
        }

        @Override // com.smartdigimkt.f.a
        public void install(com.smartdigimkt.x.d dVar) {
            a.this.a(dVar, false, "");
        }

        @Override // com.smartdigimkt.f.a
        public void readyStatus(Object obj, String str) {
        }

        @Override // com.smartdigimkt.f.a
        public void toggleCloseBtn(int i2) {
            a.this.f34527h = i2;
            ATNativeAdvancedView aTNativeAdvancedView = a.this.f34525c;
            if (aTNativeAdvancedView != null) {
                aTNativeAdvancedView.changeCloseBtnState(i2);
            }
        }

        @Override // com.smartdigimkt.f.a
        public void triggerCloseBtn(Object obj, String str) {
            ATNativeAdvancedView aTNativeAdvancedView = a.this.f34525c;
            if (aTNativeAdvancedView != null) {
                aTNativeAdvancedView.setVisibility(8);
            }
            a.this.a(1);
        }

        @Override // com.smartdigimkt.f.a
        public void a(boolean z2) {
            a aVar = a.this;
            if (aVar.d != null) {
                aVar.f34529l = z2;
                if (z2) {
                    a.this.d.showFullScreen();
                } else {
                    a.this.d.closeFullScreen();
                }
            }
        }

        @Override // com.smartdigimkt.f.a
        public void a(boolean z2, String str) {
            try {
                if (a.this.d != null) {
                    if (TextUtils.isEmpty(str)) {
                        a aVar = a.this;
                        aVar.d.onAdClicked(aVar.f34524b);
                        a.this.d.onLeaveApp();
                    } else {
                        com.smartdigimkt.x.d dVarB = com.smartdigimkt.x.d.b(com.smartdigimkt.x.d.b(a.this.f34524b));
                        dVarB.H(str);
                        a.this.a(dVarB, z2, str);
                    }
                }
            } catch (Exception e2) {
                String unused = a.this.f34523a;
                e2.getMessage();
            }
        }
    }

    public class e implements Runnable {
        final /* synthetic */ com.smartdigimkt.x.d X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ ATNativeAdvancedView f34535Y;

        public e(com.smartdigimkt.x.d dVar, ATNativeAdvancedView aTNativeAdvancedView) {
            this.X = dVar;
            this.f34535Y = aTNativeAdvancedView;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(this.X, this.f34535Y, false);
        }
    }

    public a(Context context, String str, String str2) {
        this.j = str2;
        this.k = str;
        if (this.f34528i == null) {
            ImageView imageView = new ImageView(context);
            this.f34528i = imageView;
            imageView.setPadding(v.a(context, 2.0f), v.a(context, 2.0f), v.a(context, 2.0f), v.a(context, 2.0f));
            d();
        }
    }

    private void d() {
        Context contextK = com.smartdigimkt.m6.b.p().k();
        this.f34528i.setScaleType(ImageView.ScaleType.FIT_XY);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f34528i.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(v.a(contextK, 29.0f), v.a(contextK, 16.0f));
        }
        this.f34528i.setLayoutParams(layoutParams);
        this.f34528i.setImageResource(k.a(contextK, "sdm_native_advanced_close_icon", k.d));
    }

    private void h() {
        if (this.f34524b.M2()) {
            return;
        }
        this.f34524b.m(true);
        a(this.f34524b);
        com.smartdigimkt.f.d dVar = this.d;
        if (dVar != null) {
            dVar.onShowSuccessed();
        }
    }

    public void a(com.smartdigimkt.x.d dVar, boolean z2, String str) {
    }

    public String c() {
        com.smartdigimkt.x.d dVar = this.f34524b;
        return (dVar == null || dVar.N1() == null) ? "" : this.f34524b.N1();
    }

    public void e() {
        ATNativeAdvancedWebview advancedNativeWebview;
        ATNativeAdvancedView aTNativeAdvancedView = this.f34525c;
        if (aTNativeAdvancedView == null || (advancedNativeWebview = aTNativeAdvancedView.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestroyed()) {
            return;
        }
        h.a().a((WebView) advancedNativeWebview, NativeAdvancedJsUtils.f34662b, "");
    }

    public void f() {
        ATNativeAdvancedWebview advancedNativeWebview;
        if (this.f34525c == null || com.smartdigimkt.z.b.f || (advancedNativeWebview = this.f34525c.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestroyed()) {
            return;
        }
        NativeAdvancedJsUtils.sendEventToH5(advancedNativeWebview, NativeAdvancedJsUtils.f34663c, "");
    }

    public void g() {
        if (this.d != null) {
            this.d = null;
        }
        if (this.o != null) {
            this.o = null;
        }
        if (this.m != null) {
            this.m = null;
        }
        ATNativeAdvancedView aTNativeAdvancedView = this.f34525c;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.destroy();
        }
        if (this.f != null) {
            this.f = null;
        }
        com.smartdigimkt.z.b.b().d(this.j);
    }

    public com.smartdigimkt.f.a b() {
        return this.o;
    }

    private void b(com.smartdigimkt.x.d dVar, Context context, String str) {
        if (dVar != null) {
            try {
                if (TextUtils.isEmpty(dVar.y1())) {
                    return;
                }
                com.smartdigimkt.o.a.a(context, dVar, str, dVar.y1(), false, true, com.smartdigimkt.q.a.q);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    private void c(com.smartdigimkt.x.d dVar, Context context, String str) {
        if (dVar != null) {
            try {
                List<String> listH1 = dVar.H1();
                if (listH1 == null || listH1.size() <= 0) {
                    return;
                }
                Iterator<String> it = listH1.iterator();
                while (it.hasNext()) {
                    com.smartdigimkt.x.d dVar2 = dVar;
                    Context context2 = context;
                    String str2 = str;
                    com.smartdigimkt.o.a.a(context2, dVar2, str2, it.next(), false, true);
                    context = context2;
                    dVar = dVar2;
                    str = str2;
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public void a(com.smartdigimkt.f.c cVar) {
        this.f = cVar;
    }

    public void a(com.smartdigimkt.f.d dVar) {
        this.d = dVar;
    }

    public class d implements com.smartdigimkt.z.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ATNativeAdvancedView f34533a;

        public d(ATNativeAdvancedView aTNativeAdvancedView) {
            this.f34533a = aTNativeAdvancedView;
        }

        @Override // com.smartdigimkt.z.a
        public void a() {
            String string;
            a.this.e();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.smartdigimkt.m6.b.p().k() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = a.this.f34523a;
                th.getMessage();
                string = "";
            }
            h.a().a((WebView) this.f34533a.getAdvancedNativeWebview(), BaseAbsFeedBackForH5.g, Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.smartdigimkt.z.a
        public void close() {
            String string;
            a.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.smartdigimkt.m6.b.p().k() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = a.this.f34523a;
                th.getMessage();
                string = "";
            }
            h.a().a((WebView) this.f34533a.getAdvancedNativeWebview(), BaseAbsFeedBackForH5.g, Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.smartdigimkt.z.a
        public void a(String str) {
            String string;
            a.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.smartdigimkt.m6.b.p().k() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = a.this.f34523a;
                th.getMessage();
                string = "";
            }
            h.a().a((WebView) this.f34533a.getAdvancedNativeWebview(), BaseAbsFeedBackForH5.g, Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public String a() {
        ArrayList arrayList = new ArrayList();
        com.smartdigimkt.x.d dVar = this.f34524b;
        if (dVar != null) {
            arrayList.add(dVar);
        }
        return l.a(arrayList);
    }

    public void a(com.smartdigimkt.x.d dVar, ATNativeAdvancedView aTNativeAdvancedView, boolean z2) {
        View viewA;
        RelativeLayout.LayoutParams layoutParams;
        if (aTNativeAdvancedView == null) {
            return;
        }
        com.smartdigimkt.z.b.b().a(this.j, new d(aTNativeAdvancedView));
        if (dVar.K2() && com.smartdigimkt.z.b.b().a() && (viewA = com.smartdigimkt.z.b.b().a(this.j)) != null) {
            try {
                layoutParams = (RelativeLayout.LayoutParams) viewA.getLayoutParams();
            } catch (Exception e2) {
                e2.printStackTrace();
                layoutParams = null;
            }
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(com.smartdigimkt.z.b.d, com.smartdigimkt.z.b.f40278e);
            }
            layoutParams.addRule(12);
            ViewGroup viewGroup = (ViewGroup) viewA.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(viewA);
            }
            aTNativeAdvancedView.addView(viewA, layoutParams);
        }
        a(this.g);
        this.f34524b = dVar;
        this.f34525c = aTNativeAdvancedView;
        NativeAdvancedJSBridgeImpl advancedNativeJSBridgeImpl = aTNativeAdvancedView.getAdvancedNativeJSBridgeImpl();
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = advancedNativeJSBridgeImpl;
        if (advancedNativeJSBridgeImpl == null) {
            NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl2 = new NativeAdvancedJSBridgeImpl(aTNativeAdvancedView.getContext(), this.k, this.j);
            ArrayList arrayList = new ArrayList();
            arrayList.add(dVar);
            nativeAdvancedJSBridgeImpl2.setCampaignList(arrayList);
            nativeAdvancedJSBridgeImpl = nativeAdvancedJSBridgeImpl2;
        }
        nativeAdvancedJSBridgeImpl.setAllowSkip(this.g ? 1 : 0);
        nativeAdvancedJSBridgeImpl.setNativeAdvancedBridgeListener(this.o);
        aTNativeAdvancedView.setAdvancedNativeJSBridgeImpl(nativeAdvancedJSBridgeImpl);
        if (dVar.I2() || !this.g) {
            this.f34528i.setVisibility(8);
        }
        a(this.f34528i);
        aTNativeAdvancedView.setCloseView(this.f34528i);
        if (aTNativeAdvancedView.getVisibility() != 0) {
            aTNativeAdvancedView.setVisibility(0);
        }
        boolean zA = a0.a(aTNativeAdvancedView.getAdvancedNativeWebview(), 0);
        com.smartdigimkt.f.c cVar = this.f;
        if (cVar == null || zA || cVar.d() == null || this.f.d().getAlpha() < 0.5f || this.f.d().getVisibility() != 0 || this.f34529l) {
            if (z2) {
                aTNativeAdvancedView.postDelayed(new e(dVar, aTNativeAdvancedView), 200L);
                return;
            }
            return;
        }
        aTNativeAdvancedView.show();
        com.smartdigimkt.u.a.f().a(aTNativeAdvancedView.getContext());
        dVar.G(this.j);
        com.smartdigimkt.z.b.b().a(this.j, dVar);
        com.smartdigimkt.x.d dVar2 = this.f34524b;
        if (dVar2 != null && dVar2.C2()) {
            aTNativeAdvancedView.getAdvancedNativeWebview();
            try {
                com.smartdigimkt.c.a.b(dVar.N1());
            } catch (Throwable th) {
                th.getMessage();
                com.smartdigimkt.x.d dVar3 = this.f34524b;
                if (dVar3 != null) {
                    dVar3.N1();
                    this.f34524b.O1();
                    this.f34524b.j();
                }
            }
        }
        h();
        int i2 = this.f34527h;
        if (i2 != -1) {
            aTNativeAdvancedView.changeCloseBtnState(i2);
        }
        com.smartdigimkt.c.a.b(dVar.N1());
        this.f34530n.sendEmptyMessageDelayed(2, 1000L);
    }

    private void a(com.smartdigimkt.x.d dVar) {
        if (dVar.I2()) {
            return;
        }
        a(dVar, com.smartdigimkt.m6.b.p().k(), this.j);
        dVar.m(true);
        f.a(this.j, dVar, f.f34028h);
        b(dVar, com.smartdigimkt.m6.b.p().k(), this.j);
        c(dVar, com.smartdigimkt.m6.b.p().k(), this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        com.smartdigimkt.f.d dVar = this.d;
        if (dVar != null) {
            dVar.onShowFailed("web show failed:" + str);
        }
    }

    public void a(boolean z2) {
        this.g = z2;
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2) {
        com.smartdigimkt.f.d dVar = this.d;
        if (dVar != null) {
            dVar.onClose();
            this.d = null;
        }
    }

    private void a(com.smartdigimkt.x.d dVar, Context context, String str) {
        com.smartdigimkt.u.a.f().a(context);
        if (!TextUtils.isEmpty(dVar.P0())) {
            com.smartdigimkt.o.a.a(context, dVar, str, dVar.P0(), false, true, com.smartdigimkt.q.a.f37742p);
        }
        if (TextUtils.isEmpty(str) || dVar.p1() == null || dVar.p1().l() == null) {
            return;
        }
        com.smartdigimkt.o.a.a(context, dVar, str, dVar.p1().l(), false, false);
    }
}
