package com.facebook.internal;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.applovin.sdk.AppLovinEventTypes;
import com.bumptech.glide.load.resource.a;
import com.charging.screenshow.battery.animations.themes.R;
import com.facebook.AccessToken;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.LoginTargetApp;
import com.facebook.share.internal.ShareInternalUtility;
import com.p004ironsource.d9;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class WebDialog extends Dialog {
    public static volatile int n0;
    public String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f16387Y;
    public OnCompleteListener Z;
    public WebView e0;
    public ProgressDialog f0;
    public ImageView g0;
    public FrameLayout h0;
    public final UploadStagingResourcesTask i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public WindowManager.LayoutParams m0;

    /* JADX INFO: renamed from: com.facebook.internal.WebDialog$3, reason: invalid class name */
    class AnonymousClass3 extends WebView {
        @Override // android.webkit.WebView, android.view.View
        public final void onWindowFocusChanged(boolean z2) {
            try {
                super.onWindowFocusChanged(z2);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.WebDialog$4, reason: invalid class name */
    class AnonymousClass4 implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.WebDialog$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static {
            try {
                new int[LoginTargetApp.values().length][1] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FragmentActivity f16388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f16389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f16390c;
        public OnCompleteListener d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bundle f16391e;
        public AccessToken f;
    }

    public class DialogWebViewClient extends WebViewClient {
        public DialogWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            WebDialog webDialog = WebDialog.this;
            if (!webDialog.k0) {
                webDialog.f0.dismiss();
            }
            webDialog.h0.setBackgroundColor(0);
            webDialog.e0.setVisibility(0);
            webDialog.g0.setVisibility(0);
            webDialog.l0 = true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            HashSet hashSet = FacebookSdk.f15915a;
            super.onPageStarted(webView, str, bitmap);
            WebDialog webDialog = WebDialog.this;
            if (webDialog.k0) {
                return;
            }
            webDialog.f0.show();
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i2, String str, String str2) {
            super.onReceivedError(webView, i2, str, str2);
            WebDialog.this.e(new FacebookDialogException(str, i2, str2));
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            WebDialog.this.e(new FacebookDialogException(null, -11, null));
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            int i2;
            HashSet hashSet = FacebookSdk.f15915a;
            Uri uri = Uri.parse(str);
            boolean z2 = uri.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", uri.getPath());
            WebDialog webDialog = WebDialog.this;
            if (!str.startsWith(webDialog.f16387Y)) {
                if (str.startsWith("fbconnect://cancel")) {
                    webDialog.cancel();
                    return true;
                }
                if (!z2 && !str.contains("touch")) {
                    try {
                        webDialog.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        return true;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                return false;
            }
            Bundle bundleC = webDialog.c(str);
            String string = bundleC.getString("error");
            if (string == null) {
                string = bundleC.getString("error_type");
            }
            String string2 = bundleC.getString("error_msg");
            if (string2 == null) {
                string2 = bundleC.getString("error_message");
            }
            if (string2 == null) {
                string2 = bundleC.getString("error_description");
            }
            String string3 = bundleC.getString("error_code");
            if (Utility.C(string3)) {
                i2 = -1;
            } else {
                try {
                    i2 = Integer.parseInt(string3);
                } catch (NumberFormatException unused2) {
                    i2 = -1;
                }
            }
            if (Utility.C(string) && Utility.C(string2) && i2 == -1) {
                OnCompleteListener onCompleteListener = webDialog.Z;
                if (onCompleteListener != null && !webDialog.j0) {
                    webDialog.j0 = true;
                    onCompleteListener.a(bundleC, null);
                    webDialog.dismiss();
                }
            } else if ((string == null || !(string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) && i2 != 4201) {
                webDialog.e(new FacebookServiceException(new FacebookRequestError(i2, string, string2), string2));
            } else {
                webDialog.cancel();
            }
            return true;
        }
    }

    public interface InitCallback {
    }

    public interface OnCompleteListener {
        void a(Bundle bundle, FacebookException facebookException);
    }

    public class UploadStagingResourcesTask extends AsyncTask<Void, Void, String[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f16393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bundle f16394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Exception[] f16395c;

        public UploadStagingResourcesTask(String str, Bundle bundle) {
            this.f16393a = str;
            this.f16394b = bundle;
        }

        public final String[] a() {
            if (!CrashShieldHandler.b(this)) {
                try {
                    String[] stringArray = this.f16394b.getStringArray(d9.h.I0);
                    final String[] strArr = new String[stringArray.length];
                    this.f16395c = new Exception[stringArray.length];
                    final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                    ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    Date date = AccessToken.m0;
                    AccessToken accessTokenB = AccessToken.Companion.b();
                    for (final int i2 = 0; i2 < stringArray.length; i2++) {
                        try {
                            if (isCancelled()) {
                                Iterator it = concurrentLinkedQueue.iterator();
                                while (it.hasNext()) {
                                    ((AsyncTask) it.next()).cancel(true);
                                }
                            } else {
                                Uri uri = Uri.parse(stringArray[i2]);
                                if (Utility.E(uri)) {
                                    strArr[i2] = uri.toString();
                                    countDownLatch.countDown();
                                } else {
                                    concurrentLinkedQueue.add(ShareInternalUtility.l(accessTokenB, uri, new GraphRequest.Callback() { // from class: com.facebook.internal.WebDialog.UploadStagingResourcesTask.1
                                        @Override // com.facebook.GraphRequest.Callback
                                        public final void a(GraphResponse graphResponse) {
                                            int i3 = i2;
                                            try {
                                                FacebookRequestError facebookRequestError = graphResponse.d;
                                                String str = "Error staging photo.";
                                                if (facebookRequestError != null) {
                                                    String strA = facebookRequestError.a();
                                                    if (strA != null) {
                                                        str = strA;
                                                    }
                                                    throw new FacebookGraphResponseException(graphResponse, str);
                                                }
                                                JSONObject jSONObject = graphResponse.f15952c;
                                                if (jSONObject == null) {
                                                    throw new FacebookException("Error staging photo.");
                                                }
                                                String strOptString = jSONObject.optString("uri");
                                                if (strOptString == null) {
                                                    throw new FacebookException("Error staging photo.");
                                                }
                                                strArr[i3] = strOptString;
                                                countDownLatch.countDown();
                                            } catch (Exception e2) {
                                                UploadStagingResourcesTask.this.f16395c[i3] = e2;
                                            }
                                        }
                                    }).d());
                                }
                            }
                        } catch (Exception unused) {
                            Iterator it2 = concurrentLinkedQueue.iterator();
                            while (it2.hasNext()) {
                                ((AsyncTask) it2.next()).cancel(true);
                            }
                        }
                    }
                    countDownLatch.await();
                    return strArr;
                } catch (Throwable th) {
                    CrashShieldHandler.a(this, th);
                    return null;
                }
            }
            return null;
        }

        public final void b(String[] strArr) {
            Bundle bundle = this.f16394b;
            WebDialog webDialog = WebDialog.this;
            if (CrashShieldHandler.b(this)) {
                return;
            }
            try {
                webDialog.f0.dismiss();
                for (Exception exc : this.f16395c) {
                    if (exc != null) {
                        webDialog.e(exc);
                        return;
                    }
                }
                if (strArr == null) {
                    webDialog.e(new FacebookException("Failed to stage photos for web dialog"));
                    return;
                }
                List listAsList = Arrays.asList(strArr);
                if (listAsList.contains(null)) {
                    webDialog.e(new FacebookException("Failed to stage photos for web dialog"));
                    return;
                }
                Utility.N(bundle, d9.h.I0, new JSONArray((Collection) listAsList));
                webDialog.X = Utility.b(bundle, ServerProtocol.a(), FacebookSdk.f() + "/dialog/" + this.f16393a).toString();
                webDialog.f((webDialog.g0.getDrawable().getIntrinsicWidth() / 2) + 1);
            } catch (Throwable th) {
                CrashShieldHandler.a(this, th);
            }
        }

        @Override // android.os.AsyncTask
        public final /* bridge */ /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (CrashShieldHandler.b(this)) {
                return null;
            }
            try {
                return a();
            } catch (Throwable th) {
                CrashShieldHandler.a(this, th);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final /* bridge */ /* synthetic */ void onPostExecute(String[] strArr) {
            if (CrashShieldHandler.b(this)) {
                return;
            }
            try {
                b(strArr);
            } catch (Throwable th) {
                CrashShieldHandler.a(this, th);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebDialog(FragmentActivity fragmentActivity, String str, Bundle bundle, LoginTargetApp loginTargetApp, OnCompleteListener onCompleteListener) {
        Uri uriB;
        super(fragmentActivity, n0);
        Validate.h();
        this.f16387Y = "fbconnect://success";
        this.j0 = false;
        this.k0 = false;
        this.l0 = false;
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = Utility.A(fragmentActivity) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f16387Y = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString(d9.h.d, "touch");
        bundle.putString("client_id", FacebookSdk.c());
        Locale locale = Locale.ROOT;
        bundle.putString("sdk", "android-12.1.0");
        this.Z = onCompleteListener;
        if (str.equals(AppLovinEventTypes.USER_SHARED_LINK) && bundle.containsKey(d9.h.I0)) {
            this.i0 = new UploadStagingResourcesTask(str, bundle);
            return;
        }
        if (loginTargetApp.ordinal() != 1) {
            uriB = Utility.b(bundle, ServerProtocol.a(), FacebookSdk.f() + "/dialog/" + str);
        } else {
            Collection collection = ServerProtocol.f16370a;
            uriB = Utility.b(bundle, String.format("m.%s", Arrays.copyOf(new Object[]{FacebookSdk.q}, 1)), "oauth/authorize");
        }
        this.X = uriB.toString();
    }

    public static int a(int i2, float f, int i3, int i4) {
        double d;
        int i5 = (int) (i2 / f);
        if (i5 <= i3) {
            d = 1.0d;
        } else {
            d = i5 >= i4 ? 0.5d : ((((double) (i4 - i5)) / ((double) (i4 - i3))) * 0.5d) + 0.5d;
        }
        return (int) (((double) i2) * d);
    }

    public static void b(FragmentActivity fragmentActivity) {
        if (fragmentActivity == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = fragmentActivity.getPackageManager().getApplicationInfo(fragmentActivity.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null || n0 != 0) {
                return;
            }
            int i2 = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
            if (i2 == 0) {
                i2 = R.style.com_facebook_activity_theme;
            }
            n0 = i2;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public Bundle c(String str) {
        Uri uri = Uri.parse(str);
        Bundle bundleL = Utility.L(uri.getQuery());
        bundleL.putAll(Utility.L(uri.getFragment()));
        return bundleL;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.Z == null || this.j0) {
            return;
        }
        e(new FacebookOperationCanceledException());
    }

    public final void d() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        int i4 = i2 < i3 ? i2 : i3;
        if (i2 < i3) {
            i2 = i3;
        }
        getWindow().setLayout(Math.min(a(i4, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(a(i2, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.e0;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.k0 && (progressDialog = this.f0) != null && progressDialog.isShowing()) {
            this.f0.dismiss();
        }
        super.dismiss();
    }

    public final void e(Exception exc) {
        if (this.Z == null || this.j0) {
            return;
        }
        this.j0 = true;
        this.Z.a(null, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc));
        dismiss();
    }

    public final void f(int i2) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(getContext());
        this.e0 = anonymousClass3;
        anonymousClass3.setVerticalScrollBarEnabled(false);
        this.e0.setHorizontalScrollBarEnabled(false);
        this.e0.setWebViewClient(new DialogWebViewClient());
        this.e0.getSettings().setJavaScriptEnabled(true);
        this.e0.loadUrl(this.X);
        this.e0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.e0.setVisibility(4);
        this.e0.getSettings().setSavePassword(false);
        this.e0.getSettings().setSaveFormData(false);
        this.e0.setFocusable(true);
        this.e0.setFocusableInTouchMode(true);
        this.e0.setOnTouchListener(new AnonymousClass4());
        linearLayout.setPadding(i2, i2, i2, i2);
        linearLayout.addView(this.e0);
        linearLayout.setBackgroundColor(-872415232);
        this.h0.addView(linearLayout);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        AutofillManager autofillManagerI;
        WindowManager.LayoutParams layoutParams;
        this.k0 = false;
        Context context = getContext();
        Intrinsics.f(context, "context");
        if (Build.VERSION.SDK_INT >= 26 && (autofillManagerI = a.i(context.getSystemService(a.j()))) != null && autofillManagerI.isAutofillSupported() && autofillManagerI.isEnabled() && (layoutParams = this.m0) != null && layoutParams.token == null) {
            layoutParams.token = getOwnerActivity().getWindow().getAttributes().token;
            Objects.toString(this.m0.token);
            HashSet hashSet = FacebookSdk.f15915a;
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f0 = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.f0.setMessage(getContext().getString(R.string.com_facebook_loading));
        this.f0.setCanceledOnTouchOutside(false);
        this.f0.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.internal.WebDialog.1
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                WebDialog.this.cancel();
            }
        });
        requestWindowFeature(1);
        this.h0 = new FrameLayout(getContext());
        d();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        ImageView imageView = new ImageView(getContext());
        this.g0 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.internal.WebDialog.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (CrashShieldHandler.b(this)) {
                    return;
                }
                try {
                    WebDialog.this.cancel();
                } catch (Throwable th) {
                    CrashShieldHandler.a(this, th);
                }
            }
        });
        this.g0.setImageDrawable(getContext().getResources().getDrawable(2131231086));
        this.g0.setVisibility(4);
        if (this.X != null) {
            f((this.g0.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.h0.addView(this.g0, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.h0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.k0 = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            WebView webView = this.e0;
            if (webView != null && webView.canGoBack()) {
                this.e0.goBack();
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        UploadStagingResourcesTask uploadStagingResourcesTask = this.i0;
        if (uploadStagingResourcesTask == null || uploadStagingResourcesTask.getStatus() != AsyncTask.Status.PENDING) {
            d();
        } else {
            uploadStagingResourcesTask.execute(new Void[0]);
            this.f0.show();
        }
    }

    @Override // android.app.Dialog
    public final void onStop() {
        UploadStagingResourcesTask uploadStagingResourcesTask = this.i0;
        if (uploadStagingResourcesTask != null) {
            uploadStagingResourcesTask.cancel(true);
            this.f0.dismiss();
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.m0 = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }
}
