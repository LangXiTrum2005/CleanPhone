package q7;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.internal.ads.fz0;
import com.ironsource.X3;
import com.storage.androidcleaner.R;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class l0 extends Dialog {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile int f48710m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f48711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f48712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g0 f48713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k0 f48714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ProgressDialog f48715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f48716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FrameLayout f48717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0 f48718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f48719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f48720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f48721k;
    public WindowManager.LayoutParams l;

    /* JADX WARN: Illegal instructions before constructor call */
    public l0(Context context, String str) {
        kotlin.jvm.internal.n.f(context, "context");
        f.o();
        int i10 = f48710m;
        if (i10 == 0) {
            f.o();
            i10 = f48710m;
        }
        super(context, i10);
        this.f48712b = "fbconnect://success";
        this.f48711a = str;
    }

    public static int a(int i10, int i11, int i12, float f10) {
        double d10;
        int i13 = (int) (i10 / f10);
        if (i13 <= i11) {
            d10 = 1.0d;
        } else {
            d10 = i13 >= i12 ? 0.5d : ((((double) (i12 - i13)) / ((double) (i12 - i11))) * 0.5d) + 0.5d;
        }
        return (int) (((double) i10) * d10);
    }

    public static final void b(FragmentActivity fragmentActivity) {
        if (fragmentActivity == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = fragmentActivity.getPackageManager().getApplicationInfo(fragmentActivity.getPackageName(), 128);
            if ((applicationInfo != null ? applicationInfo.metaData : null) != null && f48710m == 0) {
                int i10 = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                if (i10 == 0) {
                    i10 = R.style.com_facebook_activity_theme;
                }
                f48710m = i10;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public Bundle c(String str) {
        Uri uri = Uri.parse(str);
        Bundle bundleE = e0.E(uri.getQuery());
        bundleE.putAll(e0.E(uri.getFragment()));
        return bundleE;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f48713c == null || this.f48719i) {
            return;
        }
        e(new l7.p());
    }

    public final void d() {
        Object systemService = getContext().getSystemService("window");
        kotlin.jvm.internal.n.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        int i12 = i10 < i11 ? i10 : i11;
        if (i10 < i11) {
            i10 = i11;
        }
        int iMin = Math.min(a(i12, 480, 800, displayMetrics.density), displayMetrics.widthPixels);
        int iMin2 = Math.min(a(i10, 800, 1280, displayMetrics.density), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(iMin, iMin2);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ProgressDialog progressDialog;
        k0 k0Var = this.f48714d;
        if (k0Var != null) {
            k0Var.stopLoading();
        }
        if (!this.f48720j && (progressDialog = this.f48715e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    public final void e(Exception exc) {
        if (this.f48713c == null || this.f48719i) {
            return;
        }
        this.f48719i = true;
        l7.n nVar = exc instanceof l7.n ? (l7.n) exc : new l7.n(exc);
        g0 g0Var = this.f48713c;
        if (g0Var != null) {
            g0Var.a(null, nVar);
        }
        dismiss();
    }

    public final void f(int i10) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        k0 k0Var = new k0(getContext());
        this.f48714d = k0Var;
        k0Var.setVerticalScrollBarEnabled(false);
        k0 k0Var2 = this.f48714d;
        if (k0Var2 != null) {
            k0Var2.setHorizontalScrollBarEnabled(false);
        }
        k0 k0Var3 = this.f48714d;
        if (k0Var3 != null) {
            k0Var3.setWebViewClient(new fz0(this, 3));
        }
        k0 k0Var4 = this.f48714d;
        WebSettings settings = k0Var4 != null ? k0Var4.getSettings() : null;
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        k0 k0Var5 = this.f48714d;
        if (k0Var5 != null) {
            String str = this.f48711a;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            k0Var5.loadUrl(str);
        }
        k0 k0Var6 = this.f48714d;
        if (k0Var6 != null) {
            k0Var6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        k0 k0Var7 = this.f48714d;
        if (k0Var7 != null) {
            k0Var7.setVisibility(4);
        }
        k0 k0Var8 = this.f48714d;
        WebSettings settings2 = k0Var8 != null ? k0Var8.getSettings() : null;
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        k0 k0Var9 = this.f48714d;
        WebSettings settings3 = k0Var9 != null ? k0Var9.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        k0 k0Var10 = this.f48714d;
        if (k0Var10 != null) {
            k0Var10.setFocusable(true);
        }
        k0 k0Var11 = this.f48714d;
        if (k0Var11 != null) {
            k0Var11.setFocusableInTouchMode(true);
        }
        k0 k0Var12 = this.f48714d;
        if (k0Var12 != null) {
            k0Var12.setOnTouchListener(new com.applovin.impl.adview.q(2));
        }
        linearLayout.setPadding(i10, i10, i10, i10);
        linearLayout.addView(this.f48714d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f48717g;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        Window window;
        WindowManager.LayoutParams attributes;
        this.f48720j = false;
        Context context = getContext();
        kotlin.jvm.internal.n.e(context, "context");
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled() && (layoutParams = this.l) != null && layoutParams.token == null) {
            Activity ownerActivity = getOwnerActivity();
            layoutParams.token = (ownerActivity == null || (window = ownerActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
            StringBuilder sb2 = new StringBuilder("Set token on onAttachedToWindow(): ");
            WindowManager.LayoutParams layoutParams2 = this.l;
            sb2.append(layoutParams2 != null ? layoutParams2.token : null);
            e0.B("FacebookSDK.WebDialog", sb2.toString());
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f48715e = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f48715e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R.string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.f48715e;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f48715e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: q7.f0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    l0 this$0 = this.f48688a;
                    kotlin.jvm.internal.n.f(this$0, "this$0");
                    this$0.cancel();
                }
            });
        }
        requestWindowFeature(1);
        this.f48717g = new FrameLayout(getContext());
        d();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.f48716f = imageView;
        imageView.setOnClickListener(new com.applovin.mediation.nativeAds.a(this, 15));
        Drawable drawable = getContext().getResources().getDrawable(2131230879);
        ImageView imageView2 = this.f48716f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f48716f;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
        if (this.f48711a != null) {
            ImageView imageView4 = this.f48716f;
            if (imageView4 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            f((imageView4.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.f48717g;
        if (frameLayout != null) {
            frameLayout.addView(this.f48716f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f48717g;
        if (frameLayout2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        setContentView(frameLayout2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f48720j = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent event) {
        kotlin.jvm.internal.n.f(event, "event");
        if (i10 == 4) {
            k0 k0Var = this.f48714d;
            if (k0Var != null && k0Var.canGoBack()) {
                k0 k0Var2 = this.f48714d;
                if (k0Var2 != null) {
                    k0Var2.goBack();
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i10, event);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        i0 i0Var = this.f48718h;
        if (i0Var != null) {
            if ((i0Var != null ? i0Var.getStatus() : null) == AsyncTask.Status.PENDING) {
                if (i0Var != null) {
                    i0Var.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f48715e;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        d();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        i0 i0Var = this.f48718h;
        if (i0Var != null) {
            i0Var.cancel(true);
            ProgressDialog progressDialog = this.f48715e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        kotlin.jvm.internal.n.f(params, "params");
        if (params.token == null) {
            this.l = params;
        }
        super.onWindowAttributesChanged(params);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(FragmentActivity context, String str, Bundle bundle, int i10, g0 g0Var) {
        Uri uriA;
        super(context, f48710m);
        f.o();
        this.f48712b = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        kotlin.jvm.internal.n.f(context, "context");
        String str2 = context.getPackageManager().hasSystemFeature("android.hardware.type.pc") ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f48712b = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString(X3.i.f27786d, "touch");
        bundle.putString("client_id", l7.s.c());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{"18.3.0"}, 1)));
        this.f48713c = g0Var;
        if (str.equals(AppLovinEventTypes.USER_SHARED_LINK) && bundle.containsKey(X3.i.I0)) {
            this.f48718h = new i0(this, str, bundle);
            return;
        }
        if (j0.f48706a[v0.i.c(i10)] == 1) {
            uriA = e0.a(f.f(), bundle, "oauth/authorize");
        } else {
            uriA = e0.a(f.e(), bundle, l7.s.e() + "/dialog/" + str);
        }
        this.f48711a = uriA.toString();
    }
}
