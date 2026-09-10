package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.sdk.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7343b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f7345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f7346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private w0 f7347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private v0.c f7348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private w0 f7349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Dialog f7350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f7351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f7352k;
    private long l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u0 f7344c = new u0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private v0.b f7353m = new v0.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.applovin.impl.b f7354n = new a();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends com.applovin.impl.b {
        public a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || a1.this.f7349h == null) {
                return;
            }
            if (a1.this.f7350i != null) {
                a1 a1Var = a1.this;
                if (!com.applovin.impl.d.d(a1Var.a(a1Var.f7350i))) {
                    a1.this.f7350i.dismiss();
                }
                a1.this.f7350i = null;
            }
            w0 w0Var = a1.this.f7349h;
            a1.this.f7349h = null;
            a1 a1Var2 = a1.this;
            a1Var2.a(a1Var2.f7347f, w0Var, activity);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y0 f7357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f7358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f7359d;

        public b(boolean z10, y0 y0Var, w0 w0Var, Activity activity) {
            this.f7356a = z10;
            this.f7357b = y0Var;
            this.f7358c = w0Var;
            this.f7359d = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            a1.this.f7349h = null;
            a1.this.f7350i = null;
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - a1.this.l));
            CollectionUtils.putStringIfValid("details", String.valueOf(this.f7356a), mapHashMap);
            a1.this.f7342a.x0().d(f2.f7875q, mapHashMap);
            w0 w0VarA = a1.this.a(this.f7357b.a());
            if (w0VarA == null) {
                a1.this.a("Destination state for TOS/PP alert is null");
                return;
            }
            a1.this.a(this.f7358c, w0VarA, this.f7359d);
            if (w0VarA.d() != w0.b.ALERT) {
                dialogInterface.dismiss();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f7361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f7362b;

        public c(Uri uri, Activity activity) {
            this.f7361a = uri;
            this.f7362b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            q7.a(this.f7361a, this.f7362b, a1.this.f7342a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f7364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f7365b;

        public d(Uri uri, Activity activity) {
            this.f7364a = uri;
            this.f7365b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            q7.a(this.f7364a, this.f7365b, a1.this.f7342a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements CmpServiceImpl.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f7367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f7368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f7369c;

        public e(long j10, w0 w0Var, Activity activity) {
            this.f7367a = j10;
            this.f7368b = w0Var;
            this.f7369c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            a1.this.f7353m.a(appLovinCmpError);
            a1.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.f7367a);
            a1.this.a(this.f7368b, this.f7369c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements CmpServiceImpl.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f7371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f7372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f7373c;

        public f(long j10, w0 w0Var, Activity activity) {
            this.f7371a = j10;
            this.f7372b = w0Var;
            this.f7373c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            a1.this.f7353m.a(appLovinCmpError);
            a1.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.f7371a);
            a1.this.a(this.f7372b, this.f7373c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g implements CmpServiceImpl.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f7375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f7376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f7377c;

        public g(long j10, w0 w0Var, Activity activity) {
            this.f7375a = j10;
            this.f7376b = w0Var;
            this.f7377c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
        public void a(AppLovinCmpError appLovinCmpError) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f7375a));
            if (appLovinCmpError != null) {
                a1.this.f7353m.a(appLovinCmpError);
                mapHashMap.putAll(a1.this.a(appLovinCmpError));
                a1.this.f7342a.x0().d(f2.f7883v, mapHashMap);
            } else {
                a1.this.f7353m.c();
                a1.this.f7342a.x0().d(f2.f7885w, mapHashMap);
            }
            a1.this.b(this.f7376b, this.f7377c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f7379a;

        public h(w0 w0Var) {
            this.f7379a = w0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            a1 a1Var = a1.this;
            a1Var.a(a1Var.f7347f, this.f7379a, a1.this.f7342a.w0());
        }
    }

    public a1(com.applovin.impl.sdk.l lVar) {
        this.f7342a = lVar;
        this.f7343b = ((Integer) lVar.a(z4.f10147f7)).intValue();
    }

    private void c(w0 w0Var, Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new androidx.fragment.app.d(this, w0Var, activity, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(w0 w0Var, Activity activity) {
        a(w0Var, activity, (Boolean) null);
    }

    private void b() {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f7351j));
        CollectionUtils.putStringIfValid("details", this.f7344c.toString(), mapHashMap);
        this.f7342a.x0().d(f2.f7887x, mapHashMap);
        this.f7345d = null;
        this.f7347f = null;
        this.f7351j = 0L;
        this.f7352k = 0L;
        this.l = 0L;
        this.f7344c.a();
        this.f7342a.e().b(this.f7354n);
        v0.c cVar = this.f7348g;
        if (cVar != null) {
            cVar.a(this.f7353m);
            this.f7348g = null;
        }
        this.f7353m = new v0.b();
    }

    public void a(Activity activity, v0.c cVar) {
        a(w0.a.IS_AL_GDPR.b(), activity, cVar);
    }

    public void a(int i10, Activity activity, v0.c cVar) {
        if (this.f7345d != null) {
            this.f7342a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7342a.Q().a("ConsentFlowStateMachine", "Unable to start states: " + this.f7345d);
            }
            this.f7342a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7342a.Q().a("ConsentFlowStateMachine", "Consent flow already in progress for states: " + this.f7345d);
            }
            cVar.a(new v0.b(new t0(t0.f9725d, "Consent flow is already in progress.")));
            return;
        }
        List listA = b1.a(this.f7342a);
        this.f7345d = listA;
        this.f7346e = String.valueOf(listA);
        this.f7348g = cVar;
        w0 w0VarA = a(i10);
        this.f7342a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7342a.Q().a("ConsentFlowStateMachine", "Starting consent flow with states: " + this.f7345d + "\nInitial state: " + w0VarA);
        }
        com.applovin.impl.sdk.l.a(activity).a(this.f7354n);
        this.f7342a.x0().a(f2.f7871o);
        this.f7351j = SystemClock.elapsedRealtime();
        a((w0) null, w0VarA, activity);
    }

    public boolean a() {
        return this.f7345d != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(w0 w0Var, Activity activity, Boolean bool) {
        a(w0Var, a(w0Var.a(bool)), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(w0 w0Var, w0 w0Var2, Activity activity) {
        this.f7347f = w0Var;
        c(w0Var2, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(w0 w0Var, final Activity activity) {
        boolean z10;
        SpannableString spannableString;
        if (w0Var == null) {
            a("Consent flow state is null");
            return;
        }
        this.f7342a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7342a.Q().a("ConsentFlowStateMachine", "Transitioning to state: " + w0Var);
        }
        long jElapsedRealtime = this.f7347f != null ? SystemClock.elapsedRealtime() - this.f7352k : 0L;
        this.f7352k = SystemClock.elapsedRealtime();
        this.f7344c.a(w0Var, jElapsedRealtime);
        if (w0Var.d() == w0.b.ALERT) {
            if (com.applovin.impl.d.d(activity)) {
                a(w0Var);
                return;
            }
            this.f7342a.G().trackEvent("cf_start");
            x0 x0Var = (x0) w0Var;
            this.f7349h = x0Var;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setCancelable(false);
            Uri uriH = this.f7342a.y().h();
            final boolean z11 = uriH != null;
            for (y0 y0Var : x0Var.f()) {
                b bVar = new b(z11, y0Var, w0Var, activity);
                if (y0Var.c() == y0.a.POSITIVE) {
                    builder.setPositiveButton(y0Var.d(), bVar);
                } else if (y0Var.c() == y0.a.NEGATIVE) {
                    builder.setNegativeButton(y0Var.d(), bVar);
                } else {
                    builder.setNeutralButton(y0Var.d(), bVar);
                }
            }
            String strH = x0Var.h();
            if (StringUtils.isValidString(strH)) {
                spannableString = new SpannableString(strH);
                String strA = com.applovin.impl.sdk.l.a(R.string.applovin_terms_of_service_text);
                String strA2 = com.applovin.impl.sdk.l.a(R.string.applovin_privacy_policy_text);
                if (StringUtils.containsAtLeastOneSubstring(strH, Arrays.asList(strA, strA2))) {
                    if (z11) {
                        StringUtils.addLinks(spannableString, Pattern.compile(strA), new c(uriH, activity), true);
                    }
                    StringUtils.addLinks(spannableString, Pattern.compile(strA2), new d(this.f7342a.y().f(), activity), true);
                }
            } else {
                spannableString = null;
            }
            final AlertDialog alertDialogCreate = builder.setTitle(spannableString).setMessage(x0Var.g()).create();
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.s8
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f9252a.a(alertDialogCreate, activity, z11, dialogInterface);
                }
            });
            this.f7350i = alertDialogCreate;
            alertDialogCreate.show();
            this.f7353m.d();
            return;
        }
        if (w0Var.d() == w0.b.POST_ALERT) {
            if (this.f7342a.y().k() && this.f7342a.y().m()) {
                if (com.applovin.impl.d.d(activity)) {
                    a(w0Var);
                    return;
                } else {
                    this.f7342a.x0().a(f2.f7877r);
                    this.f7342a.t().loadCmp(activity, new e(SystemClock.elapsedRealtime(), w0Var, activity));
                    return;
                }
            }
            a(w0Var, activity, Boolean.FALSE);
            return;
        }
        if (w0Var.d() == w0.b.EVENT) {
            z0 z0Var = (z0) w0Var;
            String strG = z0Var.g();
            Map<String, ?> mapF = z0Var.f();
            if (mapF == null) {
                mapF = new HashMap<>(1);
            }
            mapF.put("flow_type", "unified");
            this.f7342a.G().trackEvent(strG, mapF);
            b(z0Var, activity);
            return;
        }
        if (w0Var.d() == w0.b.CMP_LOAD) {
            if (com.applovin.impl.d.d(activity)) {
                a(w0Var);
                return;
            } else if (this.f7342a.y().m()) {
                this.f7342a.t().preloadCmp(activity);
                a(w0Var, activity, Boolean.FALSE);
                return;
            } else {
                this.f7342a.x0().a(f2.f7877r);
                this.f7342a.t().loadCmp(activity, new f(SystemClock.elapsedRealtime(), w0Var, activity));
                return;
            }
        }
        if (w0Var.d() == w0.b.CMP_SHOW) {
            if (com.applovin.impl.d.d(activity)) {
                a(w0Var);
                return;
            }
            if (!this.f7342a.y().m()) {
                this.f7342a.G().trackEvent("cf_start");
            }
            this.f7342a.x0().a(f2.f7881u);
            this.f7342a.t().showCmp(activity, new g(SystemClock.elapsedRealtime(), w0Var, activity));
            return;
        }
        if (w0Var.d() == w0.b.DECISION) {
            w0.a aVarA = w0Var.a();
            if (aVarA == w0.a.IS_AL_GDPR) {
                boolean zK = this.f7342a.y().k();
                this.f7344c.a(w0Var, zK, jElapsedRealtime);
                a(w0Var, activity, Boolean.valueOf(zK));
                return;
            } else if (aVarA == w0.a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT) {
                z10 = !this.f7342a.B0() || ((Boolean) this.f7342a.a(b5.f7561t, Boolean.FALSE)).booleanValue();
                this.f7344c.a(w0Var, z10, jElapsedRealtime);
                a(w0Var, activity, Boolean.valueOf(z10));
                return;
            } else {
                if (aVarA != w0.a.HAS_TERMS_OF_SERVICE_URI) {
                    a("Invalid consent flow decision type: " + aVarA);
                    return;
                }
                z10 = this.f7342a.y().h() != null;
                this.f7344c.a(w0Var, z10, jElapsedRealtime);
                a(w0Var, activity, Boolean.valueOf(z10));
                return;
            }
        }
        if (w0Var.d() == w0.b.REINIT) {
            b();
            return;
        }
        a("Invalid consent flow destination state: " + w0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AlertDialog alertDialog, Activity activity, boolean z10, DialogInterface dialogInterface) {
        TextView textView = (TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
        textView.setLinkTextColor(textView.getCurrentTextColor());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMaxLines(this.f7343b);
        textView.setMinHeight(AppLovinSdkUtils.dpToPx(activity, 48));
        this.l = SystemClock.elapsedRealtime();
        this.f7342a.x0().d(f2.f7873p, CollectionUtils.hashMap("details", String.valueOf(z10)));
    }

    private void a(w0 w0Var) {
        this.f7344c.b();
        AppLovinSdkUtils.runOnUiThreadDelayed(new h(w0Var), TimeUnit.SECONDS.toMillis(1L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        m1.a(str, new Object[0]);
        this.f7342a.E().a(f2.W0, str, CollectionUtils.hashMap("details", "Last started states: " + this.f7346e + "\nLast successful state: " + this.f7347f));
        this.f7344c.b(str);
        v0.b bVar = this.f7353m;
        if (bVar != null) {
            bVar.a(new t0(t0.f9726e, str));
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public w0 a(int i10) {
        List<w0> list = this.f7345d;
        if (list == null) {
            return null;
        }
        for (w0 w0Var : list) {
            if (i10 == w0Var.c()) {
                return w0Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity a(Dialog dialog) {
        Context context = dialog.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinCmpError appLovinCmpError, long j10) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(j10));
        if (appLovinCmpError == null) {
            this.f7342a.x0().d(f2.f7878s, mapHashMap);
        } else {
            mapHashMap.putAll(a(appLovinCmpError));
            this.f7342a.x0().d(f2.f7880t, mapHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(AppLovinCmpError appLovinCmpError) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", appLovinCmpError.getMessage());
        CollectionUtils.putStringIfValid("mediated_network_error_message", appLovinCmpError.getCmpMessage(), mapHashMap);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(appLovinCmpError.getCode().getValue()), mapHashMap);
        CollectionUtils.putStringIfValid("mediated_network_error_code", String.valueOf(appLovinCmpError.getCmpCode()), mapHashMap);
        return mapHashMap;
    }
}
