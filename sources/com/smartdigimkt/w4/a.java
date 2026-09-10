package com.smartdigimkt.w4;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Base64;
import android.view.View;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.sdk.basead.ui.web.BaseWebView;
import com.smartdigimkt.sdk.basead.ui.web.WebProgressBarView;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w6.o;
import java.net.URLDecoder;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a extends Dialog {
    private final String A0;
    private final String B0;
    private final String C0;
    private View.OnClickListener D0;
    private final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public com.smartdigimkt.w6.f f39396Y;
    public com.smartdigimkt.v6.a Z;
    private com.smartdigimkt.k3.d.a e0;
    private RelativeLayout f0;
    private EditText g0;
    private ImageView h0;
    private TextView i0;
    private TextView j0;
    private TextView k0;
    private TextView l0;
    private TextView m0;
    private TextView n0;
    private TextView o0;
    private TextView p0;
    private TextView q0;
    private TextView r0;
    private String s0;
    private TextView t0;
    private FrameLayout u0;
    private BaseWebView v0;
    String w0;
    private boolean x0;
    private final String y0;
    private final String z0;

    /* JADX INFO: renamed from: com.smartdigimkt.w4.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0634a implements View.OnClickListener {
        public ViewOnClickListenerC0634a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                a.this.a(textView, textView.getTag().toString());
            }
        }
    }

    public class b implements DialogInterface.OnDismissListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            a.this.e();
        }
    }

    public class c implements com.smartdigimkt.b6.b {
        public c() {
        }

        @Override // com.smartdigimkt.b6.b
        public void callbackClickResult(o oVar) {
        }

        @Override // com.smartdigimkt.b6.b
        public com.smartdigimkt.w6.f getBaseAdContent() {
            return null;
        }

        @Override // com.smartdigimkt.b6.b
        public WebProgressBarView getWebProgressBarView() {
            return null;
        }

        @Override // com.smartdigimkt.b6.b
        public void onWebFinish() {
        }

        @Override // com.smartdigimkt.b6.b
        public void onWebPageFinish(WebView webView, String str) {
            String unused = a.this.X;
            if (a.this.x0) {
                return;
            }
            a.this.x0 = true;
            a.this.g();
            a aVar = a.this;
            com.smartdigimkt.i7.d.a(aVar.Z, aVar.f39396Y, "1");
        }

        @Override // com.smartdigimkt.b6.b
        public void onWebPageLoadError(WebView webView, String str) {
            if (a.this.x0) {
                return;
            }
            a.this.x0 = true;
            a.this.f();
            a aVar = a.this;
            com.smartdigimkt.i7.d.a(aVar.Z, aVar.f39396Y, "2");
        }

        @Override // com.smartdigimkt.b6.b
        public void onWebPageStart(WebView webView, String str) {
        }

        @Override // com.smartdigimkt.b6.b
        public void recordRedirectUrl(String str) {
        }

        @Override // com.smartdigimkt.b6.b
        public boolean supportDeeplinkJump() {
            return true;
        }
    }

    public class d extends WebChromeClient {
        public d() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            if (consoleMessage == null) {
                return false;
            }
            String unused = a.this.X;
            Objects.toString(consoleMessage.messageLevel());
            consoleMessage.message();
            if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
                return super.onConsoleMessage(consoleMessage);
            }
            a.this.a(consoleMessage.message());
            return false;
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.b();
        }
    }

    public class f implements TextWatcher {
        public f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            a.this.a();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            com.smartdigimkt.i7.d.a(aVar.f39396Y, aVar.Z, TextUtils.isEmpty(aVar.s0) ? "0" : a.this.s0, a.this.g0.getText().toString());
            if (a.this.e0 != null) {
                a.this.e0.a();
            }
            a.this.b();
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a.this.dismiss();
            } catch (Throwable unused) {
            }
        }
    }

    public a(Context context) {
        super(context);
        this.X = "a";
        this.w0 = "";
        this.x0 = false;
        this.y0 = "HybridInteract";
        this.z0 = "HybridInteractCall";
        this.A0 = "close";
        this.B0 = "showfeedback";
        this.C0 = "browser";
        this.D0 = new ViewOnClickListenerC0634a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        setContentView(com.smartdigimkt.n8.h.a(context, "myoffer_feedback", "layout"));
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            if (context.getResources().getDisplayMetrics().widthPixels > context.getResources().getDisplayMetrics().heightPixels) {
                window.setGravity(5);
                window.setLayout(com.smartdigimkt.n8.h.a(context, 376.0f), -1);
            } else {
                window.setGravity(80);
                window.setLayout(-1, -2);
            }
        }
        c();
        setOnDismissListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.smartdigimkt.l7.b.a().b((Runnable) new h(), 30L);
    }

    private void c() {
        Context context = getContext();
        this.h0 = (ImageView) findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_feedback_iv_close", "id"));
        this.f0 = (RelativeLayout) findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_feedback_container", "id"));
        this.u0 = (FrameLayout) findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_feedback_privacy_web_container", "id"));
        this.g0 = (EditText) findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_feedback_et", "id"));
        this.i0 = (TextView) findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_feedback_tv_commit", "id"));
        this.j0 = (TextView) findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_feedback_tv_1", "id"));
        this.k0 = (TextView) findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_feedback_tv_2", "id"));
        this.l0 = (TextView) findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_feedback_tv_3", "id"));
        this.m0 = (TextView) findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_feedback_tv_4", "id"));
        this.n0 = (TextView) findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_feedback_tv_5", "id"));
        this.o0 = (TextView) findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_feedback_tv_6", "id"));
        this.p0 = (TextView) findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_feedback_tv_7", "id"));
        this.q0 = (TextView) findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_feedback_tv_8", "id"));
        this.r0 = (TextView) findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_feedback_tv_9", "id"));
        d();
        if (TextUtils.isEmpty(this.w0)) {
            f();
            com.smartdigimkt.i7.d.a(this.Z, this.f39396Y, "");
        } else {
            this.f0.setVisibility(8);
            this.u0.setVisibility(0);
            a(context);
        }
    }

    private void d() {
        this.h0.setOnClickListener(new e());
        this.j0.setOnClickListener(this.D0);
        this.k0.setOnClickListener(this.D0);
        this.l0.setOnClickListener(this.D0);
        this.m0.setOnClickListener(this.D0);
        this.n0.setOnClickListener(this.D0);
        this.o0.setOnClickListener(this.D0);
        this.p0.setOnClickListener(this.D0);
        this.q0.setOnClickListener(this.D0);
        this.r0.setOnClickListener(this.D0);
        this.g0.addTextChangedListener(new f());
        this.i0.setOnClickListener(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f0.setVisibility(0);
        this.u0.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        String strT;
        com.smartdigimkt.w6.f fVar = this.f39396Y;
        if (fVar != null) {
            strT = fVar.T();
            if (TextUtils.isEmpty(strT)) {
                String strU = this.f39396Y.U();
                if (!TextUtils.isEmpty(strU)) {
                    try {
                        JSONArray jSONArray = new JSONObject(strU).getJSONArray("seatbid");
                        if (jSONArray != null && jSONArray.length() > 0) {
                            String strOptString = jSONArray.optString(0);
                            if (!TextUtils.isEmpty(strOptString)) {
                                this.f39396Y.F(strOptString);
                                strT = strOptString;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } else {
            strT = "";
        }
        if (TextUtils.isEmpty(strT)) {
            return;
        }
        a(this.v0, "setData", Base64.encodeToString(strT.getBytes(), 2));
    }

    public void e() {
        com.smartdigimkt.k3.d.a aVar = this.e0;
        if (aVar != null) {
            aVar.b();
        }
        this.e0 = null;
        this.f39396Y = null;
        this.Z = null;
        BaseWebView baseWebView = this.v0;
        if (baseWebView != null) {
            baseWebView.destroy();
            this.v0 = null;
        }
    }

    private void a(Context context) {
        BaseWebView baseWebView = new BaseWebView(context);
        this.v0 = baseWebView;
        baseWebView.setBackgroundColor(-1);
        com.smartdigimkt.a6.f.a(this.v0, context, new c());
        com.smartdigimkt.a6.f.a(this.v0, new d());
        this.v0.loadUrl(this.w0);
        this.u0.addView(this.v0);
    }

    public void a(BaseWebView baseWebView, String str, String str2) {
        String strN;
        if (baseWebView == null || baseWebView.isDestroyed()) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            strN = android.support.v4.media.a.n("javascript:window.HybridInteract.fireEvent('", str, "', '');");
        } else {
            strN = androidx.datastore.preferences.protobuf.a.n("javascript:window.HybridInteract.fireEvent('", str, "','", com.smartdigimkt.v4.d.a(str2), "');");
        }
        try {
            baseWebView.loadUrl(strN);
        } catch (Throwable unused) {
        }
    }

    public a(Context context, int i2) {
        super(context, i2);
        this.X = "a";
        this.w0 = "";
        this.x0 = false;
        this.y0 = "HybridInteract";
        this.z0 = "HybridInteractCall";
        this.A0 = "close";
        this.B0 = "showfeedback";
        this.C0 = "browser";
        this.D0 = new ViewOnClickListenerC0634a();
    }

    public a(Context context, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z2, onCancelListener);
        this.X = "a";
        this.w0 = "";
        this.x0 = false;
        this.y0 = "HybridInteract";
        this.z0 = "HybridInteractCall";
        this.A0 = "close";
        this.B0 = "showfeedback";
        this.C0 = "browser";
        this.D0 = new ViewOnClickListenerC0634a();
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("HybridInteractCall")) {
            return;
        }
        String[] strArrSplit = str.split("_");
        if (strArrSplit.length >= 2) {
            String str2 = strArrSplit[1];
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            str2.getClass();
            switch (str2) {
                case "showfeedback":
                    f();
                    break;
                case "close":
                    b();
                    break;
                case "browser":
                    try {
                        String strSubstring = str.substring(27);
                        if (!TextUtils.isEmpty(strSubstring)) {
                            strSubstring = URLDecoder.decode(strSubstring);
                        }
                        if (!TextUtils.isEmpty(strSubstring)) {
                            com.smartdigimkt.o8.c.a(strSubstring);
                        }
                        break;
                    } catch (Throwable unused) {
                        return;
                    }
                    break;
            }
        }
    }

    public void a(com.smartdigimkt.k3.d.a aVar, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar2) {
        this.e0 = aVar;
        this.f39396Y = fVar;
        this.Z = aVar2;
        if (fVar != null) {
            this.w0 = fVar.z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TextView textView, String str) {
        if (TextUtils.isEmpty(this.s0)) {
            this.s0 = str;
            this.t0 = textView;
            if (textView != null) {
                textView.setTextColor(Color.parseColor("#2265FF"));
                this.t0.setBackgroundResource(com.smartdigimkt.n8.h.a(textView.getContext(), "myoffer_bg_feedback_textview_pressed", k.d));
            }
        } else if (TextUtils.equals(this.s0, str)) {
            TextView textView2 = this.t0;
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor("#84879D"));
                this.t0.setBackgroundResource(com.smartdigimkt.n8.h.a(textView.getContext(), "myoffer_bg_feedback_textview", k.d));
            }
            this.s0 = "";
            this.t0 = null;
        } else {
            TextView textView3 = this.t0;
            if (textView3 != null) {
                textView3.setTextColor(Color.parseColor("#84879D"));
                this.t0.setBackgroundResource(com.smartdigimkt.n8.h.a(textView.getContext(), "myoffer_bg_feedback_textview", k.d));
            }
            this.s0 = str;
            this.t0 = textView;
            textView.setTextColor(Color.parseColor("#2265FF"));
            this.t0.setBackgroundResource(com.smartdigimkt.n8.h.a(textView.getContext(), "myoffer_bg_feedback_textview_pressed", k.d));
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (TextUtils.isEmpty(this.s0) && TextUtils.isEmpty(this.g0.getText().toString())) {
            this.i0.setEnabled(false);
        } else {
            this.i0.setEnabled(true);
        }
    }
}
