package com.smartdigimkt.t1;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5;
import com.smartdigimkt.expressad.splash.js.SplashJSBridgeImpl;
import com.smartdigimkt.expressad.splash.js.SplashJsUtils;
import com.smartdigimkt.expressad.splash.view.ATSplashView;
import com.smartdigimkt.expressad.splash.view.ATSplashWebview;
import com.smartdigimkt.expressad.widget.FeedBackButton;
import com.smartdigimkt.n.h;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.l;
import com.smartdigimkt.v0.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.x.d f38609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ATSplashView f38610c;
    protected com.smartdigimkt.u1.d d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected com.smartdigimkt.o.a f38611e;
    private boolean f;
    private TextView g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f38612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f38613i;
    private String j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f38615n;
    private String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f38616p;
    private String q;
    protected boolean r;
    private boolean s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected Context f38617u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private f f38618w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f38608a = "SplashShowManager";
    protected int k = 5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f38614l = 1;
    private String m = "";
    private boolean t = false;
    protected boolean v = true;
    private View.OnClickListener x = new a();
    private com.smartdigimkt.k7.f.c y = new com.smartdigimkt.k7.f.c(1);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Handler f38619z = new HandlerC0615b(Looper.getMainLooper());

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    Rect f38607A = new Rect();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.f) {
                b.this.a(1);
                b.this.e(-1);
            }
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.t1.b$b, reason: collision with other inner class name */
    public class HandlerC0615b extends Handler {
        public HandlerC0615b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ATSplashView aTSplashView;
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 != 1) {
                if (i2 == 2 && b.this.f38609b != null && b.this.f38609b.C2() && (aTSplashView = b.this.f38610c) != null) {
                    aTSplashView.getSplashWebview();
                    return;
                }
                return;
            }
            if (b.this.t) {
                return;
            }
            b bVar = b.this;
            ATSplashView aTSplashView2 = bVar.f38610c;
            if (aTSplashView2 == null || !com.smartdigimkt.j7.c.a(aTSplashView2, bVar.y)) {
                b.this.f38619z.removeMessages(1);
                sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            b bVar2 = b.this;
            int i3 = bVar2.k;
            if (i3 <= 0) {
                if (bVar2.f38614l == 1) {
                    b.this.a(2);
                    return;
                } else {
                    b.this.j();
                    return;
                }
            }
            int i4 = i3 - 1;
            bVar2.k = i4;
            bVar2.e(i4);
            b.this.f38619z.removeMessages(1);
            sendEmptyMessageDelayed(1, 1000L);
        }
    }

    public class c implements View.OnAttachStateChangeListener {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                if (bVar.a((View) bVar.f38610c)) {
                    b.this.i();
                }
            }
        }

        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            com.smartdigimkt.l7.b.a().b((Runnable) new a(), 30L);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            b.this.h();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = b.this;
            if (bVar.a((View) bVar.f38610c)) {
                b.this.i();
            }
        }
    }

    public class f implements com.smartdigimkt.u1.a {
        private f() {
        }

        @Override // com.smartdigimkt.u1.a
        public void a(int i2) {
            b bVar = b.this;
            String str = bVar.f38608a;
            bVar.k = i2;
            bVar.f38619z.removeMessages(1);
            b.this.f38619z.sendEmptyMessageDelayed(1, 1000L);
        }

        @Override // com.smartdigimkt.u1.a
        public void close() {
            b.this.a(1);
        }

        @Override // com.smartdigimkt.u1.a
        public void handlerH5Exception(Object obj, String str) {
            b.this.a(str);
        }

        @Override // com.smartdigimkt.u1.a
        public void install(com.smartdigimkt.x.d dVar) {
            b.this.b(dVar, false, "");
        }

        @Override // com.smartdigimkt.u1.a
        public void readyStatus(Object obj, String str) {
        }

        @Override // com.smartdigimkt.u1.a
        public void toggleCloseBtn(int i2) {
            ATSplashView aTSplashView = b.this.f38610c;
            if (aTSplashView != null) {
                aTSplashView.changeCloseBtnState(i2);
            }
        }

        @Override // com.smartdigimkt.u1.a
        public void triggerCloseBtn(Object obj, String str) {
            b.this.a(1);
        }

        public /* synthetic */ f(b bVar, a aVar) {
            this();
        }

        @Override // com.smartdigimkt.u1.a
        public void a(int i2, int i3) {
            if (i2 == 1) {
                b.this.f38619z.removeMessages(1);
            }
            if (i2 == 2) {
                b bVar = b.this;
                bVar.k = i3;
                bVar.f38619z.removeMessages(1);
                b.this.f38619z.sendEmptyMessageDelayed(1, 1000L);
            }
        }

        @Override // com.smartdigimkt.u1.a
        public void a(boolean z2) {
            if (z2) {
                b.this.f38619z.removeMessages(1);
            }
        }

        @Override // com.smartdigimkt.u1.a
        public void a(boolean z2, String str) {
            try {
                if (b.this.d != null) {
                    if (TextUtils.isEmpty(str)) {
                        b bVar = b.this;
                        bVar.d.onAdClicked(bVar.f38609b);
                    } else {
                        com.smartdigimkt.x.d dVarB = com.smartdigimkt.x.d.b(com.smartdigimkt.x.d.b(b.this.f38609b));
                        dVarB.H(str);
                        b.this.b(dVarB, true, str);
                    }
                }
            } catch (Exception e2) {
                String str2 = b.this.f38608a;
                e2.getMessage();
            }
        }
    }

    public b(Context context, String str, String str2) {
        this.f38615n = "";
        this.o = "";
        this.f38616p = "";
        this.q = "";
        this.f38613i = str2;
        this.j = str;
        this.f38617u = context;
        int iA = k.a(context.getApplicationContext(), "sdm_splash_count_time_can_skip", k.f38992h);
        int iA2 = k.a(this.f38617u.getApplicationContext(), "sdm_splash_count_time_can_skip_not", k.f38992h);
        int iA3 = k.a(this.f38617u.getApplicationContext(), "sdm_splash_count_time_can_skip_s", k.f38992h);
        int iA4 = k.a(this.f38617u.getApplicationContext(), "sdm_splash_count_time_can_skip_action", k.f38992h);
        this.f38615n = this.f38617u.getResources().getString(iA);
        this.f38616p = this.f38617u.getResources().getString(iA2);
        this.o = this.f38617u.getResources().getString(iA3);
        this.q = this.f38617u.getResources().getString(iA4);
        if (this.g == null) {
            TextView textView = new TextView(context);
            this.g = textView;
            textView.setGravity(1);
            this.g.setTextIsSelectable(false);
            this.g.setPadding(v.a(context, 5.0f), v.a(context, 5.0f), v.a(context, 5.0f), v.a(context, 5.0f));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.g.getLayoutParams();
            this.g.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(v.a(context, 100.0f), v.a(context, 50.0f)) : layoutParams);
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() {
        if (this.f38609b != null && !this.s) {
            this.s = true;
            if (this.d != null && this.f38610c != null) {
                Context context = this.f38617u;
                if (context != null && (context instanceof Activity) && ((Activity) context).isFinishing()) {
                    this.d.onShowFailed("Activity is finishing");
                    return;
                }
                this.d.onShowSuccessed();
            }
            if (!this.f38609b.M2()) {
                ATSplashView aTSplashView = this.f38610c;
                if (aTSplashView == null || aTSplashView.isDynamicView()) {
                    a(this.f38609b);
                } else {
                    b(this.f38609b);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        String str;
        if (this.k <= 0) {
            str = this.q;
        } else if (this.f) {
            str = this.f38615n + this.k + this.o;
        } else {
            str = this.k + this.f38616p;
        }
        this.g.setText(str);
    }

    public void b(com.smartdigimkt.x.d dVar, boolean z2, String str) {
    }

    public void h() {
        Handler handler = this.f38619z;
        if (handler != null) {
            handler.removeMessages(1);
            this.f38619z.removeMessages(2);
        }
        if (this.d != null) {
            this.d = null;
        }
        if (this.f38618w != null) {
            this.f38618w = null;
        }
        if (this.x != null) {
            this.x = null;
        }
        ATSplashView aTSplashView = this.f38610c;
        if (aTSplashView != null) {
            aTSplashView.destroy();
        }
        com.smartdigimkt.z.b.b().d(this.f38613i);
    }

    private void e() {
        Context contextK = com.smartdigimkt.m6.b.p().k();
        if (contextK != null) {
            int iA = k.a(contextK, "sdm_splash_count_time_can_skip", k.f38992h);
            int iA2 = k.a(contextK, "sdm_splash_count_time_can_skip_not", k.f38992h);
            int iA3 = k.a(contextK, "sdm_splash_count_time_can_skip_s", k.f38992h);
            int iA4 = k.a(this.f38617u.getApplicationContext(), "sdm_splash_count_time_can_skip_action", k.f38992h);
            this.f38615n = contextK.getResources().getString(iA);
            String string = contextK.getResources().getString(iA2);
            this.f38616p = string;
            this.m = string;
            this.o = contextK.getResources().getString(iA3);
            this.q = this.f38617u.getResources().getString(iA4);
            this.g.setBackgroundResource(k.a(contextK, "sdm_splash_close_bg", k.d));
            this.g.setTextColor(contextK.getResources().getColor(k.a(contextK, "sdm_splash_count_time_skip_text_color", "color")));
        }
    }

    public void c(int i2) {
        this.k = i2;
    }

    public void d(int i2) {
        this.f38614l = i2;
    }

    public void f() {
        Handler handler;
        if (this.k > 0 && (handler = this.f38619z) != null) {
            handler.removeMessages(1);
        }
        ATSplashView aTSplashView = this.f38610c;
        if (aTSplashView != null) {
            aTSplashView.onPause();
            ATSplashWebview splashWebview = this.f38610c.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestroyed()) {
                return;
            }
            SplashJsUtils.sendEventToH5(splashWebview, SplashJsUtils.d, "");
        }
    }

    public void g() {
        Handler handler;
        if (this.r || com.smartdigimkt.z.b.f) {
            return;
        }
        if (this.k > 0 && (handler = this.f38619z) != null) {
            handler.removeMessages(1);
            this.f38619z.sendEmptyMessageDelayed(1, 1000L);
        }
        ATSplashView aTSplashView = this.f38610c;
        if (aTSplashView != null) {
            aTSplashView.onResume();
            ATSplashWebview splashWebview = this.f38610c.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestroyed()) {
                return;
            }
            SplashJsUtils.sendEventToH5(splashWebview, SplashJsUtils.f34728e, "");
        }
    }

    public String c() {
        com.smartdigimkt.x.d dVar = this.f38609b;
        if (dVar != null && dVar.N1() != null) {
            return this.f38609b.N1();
        }
        return "";
    }

    public com.smartdigimkt.u1.a d() {
        return this.f38618w;
    }

    public String b() {
        ArrayList arrayList = new ArrayList();
        com.smartdigimkt.x.d dVar = this.f38609b;
        if (dVar != null) {
            arrayList.add(dVar);
        }
        return l.a(arrayList);
    }

    public void a(com.smartdigimkt.u1.d dVar) {
        this.d = dVar;
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

    public void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this.x);
        }
        this.f38612h = viewGroup;
    }

    public class e implements com.smartdigimkt.z.a {
        public e() {
        }

        @Override // com.smartdigimkt.z.a
        public void a() {
            String string;
            b.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.smartdigimkt.m6.b.p().k() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String str = b.this.f38608a;
                th.getMessage();
                string = "";
            }
            h.a().a((WebView) b.this.f38610c.getSplashWebview(), BaseAbsFeedBackForH5.g, Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.smartdigimkt.z.a
        public void close() {
            String string;
            b.this.g();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.smartdigimkt.m6.b.p().k() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String str = b.this.f38608a;
                th.getMessage();
                string = "";
            }
            h.a().a((WebView) b.this.f38610c.getSplashWebview(), BaseAbsFeedBackForH5.g, Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.smartdigimkt.z.a
        public void a(String str) {
            String string;
            b.this.g();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.smartdigimkt.m6.b.p().k() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String str2 = b.this.f38608a;
                th.getMessage();
                string = "";
            }
            h.a().a((WebView) b.this.f38610c.getSplashWebview(), BaseAbsFeedBackForH5.g, Base64.encodeToString(string.getBytes(), 2));
        }
    }

    private void b(com.smartdigimkt.x.d dVar) {
        if (dVar.I2()) {
            return;
        }
        a(dVar, com.smartdigimkt.m6.b.p().k(), this.f38613i);
        dVar.m(true);
        com.smartdigimkt.c0.f.a(this.f38613i, dVar, "splash");
        b(dVar, com.smartdigimkt.m6.b.p().k(), this.f38613i);
        c(dVar, com.smartdigimkt.m6.b.p().k(), this.f38613i);
    }

    public void a(com.smartdigimkt.x.d dVar, ATSplashView aTSplashView) {
        a(this.f);
        this.f38609b = dVar;
        this.f38610c = aTSplashView;
        SplashJSBridgeImpl splashJSBridgeImpl = aTSplashView.getSplashJSBridgeImpl();
        SplashJSBridgeImpl splashJSBridgeImpl2 = splashJSBridgeImpl;
        if (splashJSBridgeImpl == null) {
            SplashJSBridgeImpl splashJSBridgeImpl3 = new SplashJSBridgeImpl(aTSplashView.getContext(), this.j, this.f38613i);
            ArrayList arrayList = new ArrayList();
            arrayList.add(dVar);
            splashJSBridgeImpl3.setCampaignList(arrayList);
            splashJSBridgeImpl2 = splashJSBridgeImpl3;
        }
        splashJSBridgeImpl2.setCountdownS(this.k);
        splashJSBridgeImpl2.setAllowSkip(this.f ? 1 : 0);
        if (this.f38618w == null) {
            this.f38618w = new f(this, null);
        }
        splashJSBridgeImpl2.setSplashBridgeListener(this.f38618w);
        aTSplashView.setSplashJSBridgeImpl(splashJSBridgeImpl2);
        boolean zI2 = dVar.I2();
        View view = this.f38612h;
        if (view == null) {
            if (zI2) {
                this.g.setVisibility(8);
            }
            j();
            b(this.g);
            aTSplashView.setCloseView(this.g);
        } else {
            if (zI2) {
                view.setVisibility(8);
            }
            b(this.f38612h);
            aTSplashView.setCloseView(this.f38612h);
        }
        aTSplashView.show();
        com.smartdigimkt.x.d dVar2 = this.f38609b;
        if (dVar2 != null && dVar2.C2()) {
            aTSplashView.getSplashWebview();
        }
        aTSplashView.addOnAttachStateChangeListener(new c());
        com.smartdigimkt.l7.b.a().b((Runnable) new d(), 30L);
        this.f38619z.removeMessages(1);
        this.f38619z.sendEmptyMessageDelayed(1, 1000L);
        this.f38619z.sendEmptyMessageDelayed(2, 1000L);
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i2) {
        ATSplashView aTSplashView = this.f38610c;
        if (aTSplashView != null) {
            aTSplashView.updateCountdown(i2);
            if (this.f38610c.getSplashJSBridgeImpl() != null) {
                this.f38610c.getSplashJSBridgeImpl().updateCountDown(i2);
            }
        }
        if (i2 < 0) {
            this.k = i2;
            return;
        }
        com.smartdigimkt.u1.d dVar = this.d;
        if (dVar != null) {
            dVar.onAdTick(i2 * 1000);
        }
        if (this.f38612h == null) {
            j();
        }
    }

    public void b(int i2) {
        a(i2);
    }

    private void b(View view) {
        if (view != null) {
            view.setOnClickListener(this.x);
        }
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

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(View view) {
        return view != null && view.getVisibility() == 0 && view.getParent() != null && view.getWindowVisibility() == 0 && view.getGlobalVisibleRect(this.f38607A) && ((long) this.f38607A.height()) * ((long) this.f38607A.width()) > 0;
    }

    private void a() {
        RelativeLayout.LayoutParams layoutParams;
        com.smartdigimkt.x.d dVar = this.f38609b;
        if (dVar != null) {
            dVar.G(this.f38613i);
            com.smartdigimkt.z.b.b().a(this.f38613i, this.f38609b);
        }
        if (com.smartdigimkt.z.b.b().a()) {
            ATSplashView aTSplashView = this.f38610c;
            if (aTSplashView == null || !aTSplashView.isDynamicView()) {
                com.smartdigimkt.z.b.b().a(this.f38613i, new e());
                FeedBackButton feedBackButtonA = com.smartdigimkt.z.b.b().a(this.f38613i);
                if (feedBackButtonA != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) feedBackButtonA.getLayoutParams();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        layoutParams = null;
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(com.smartdigimkt.z.b.d, com.smartdigimkt.z.b.f40278e);
                    }
                    layoutParams.topMargin = v.a(com.smartdigimkt.m6.b.p().k(), 10.0f);
                    layoutParams.leftMargin = v.a(com.smartdigimkt.m6.b.p().k(), 10.0f);
                    ViewGroup viewGroup = (ViewGroup) feedBackButtonA.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(feedBackButtonA);
                    }
                    ATSplashView aTSplashView2 = this.f38610c;
                    if (aTSplashView2 != null) {
                        aTSplashView2.addView(feedBackButtonA, layoutParams);
                    }
                }
                this.f38609b.G(this.f38613i);
                com.smartdigimkt.z.b.b().a(this.f38613i, this.f38609b);
            }
        }
    }

    private void a(com.smartdigimkt.x.d dVar) {
        b(dVar, com.smartdigimkt.m6.b.p().k(), this.f38613i);
        a(dVar, com.smartdigimkt.m6.b.p().k(), this.f38613i);
        c(dVar, com.smartdigimkt.m6.b.p().k(), this.f38613i);
        dVar.m(true);
        com.smartdigimkt.c0.f.a(this.f38613i, dVar, "splash");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        com.smartdigimkt.u1.d dVar = this.d;
        if (dVar != null) {
            dVar.onShowFailed("web show failed:" + str);
        }
    }

    public void a(boolean z2) {
        this.f = z2;
        if (z2) {
            this.m = this.f38615n;
        } else {
            this.m = this.f38616p;
        }
    }

    public void a(com.smartdigimkt.x.d dVar, boolean z2, String str) {
        com.smartdigimkt.u1.d dVar2 = this.d;
        if (dVar2 != null) {
            dVar2.onAdClicked(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2) {
        if (this.t) {
            return;
        }
        if (i2 == 1 && this.k <= 0 && this.f38614l != 1) {
            i2 = 11;
        }
        try {
            this.t = true;
            com.smartdigimkt.u1.d dVar = this.d;
            if (dVar != null) {
                dVar.onDismiss(i2);
                this.d = null;
            }
            this.s = false;
            ATSplashView aTSplashView = this.f38610c;
            if (aTSplashView != null) {
                aTSplashView.getSplashWebview();
            }
            Handler handler = this.f38619z;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable unused) {
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
