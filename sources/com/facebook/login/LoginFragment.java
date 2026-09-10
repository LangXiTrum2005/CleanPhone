package com.facebook.login;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.CustomTabUtils;
import com.smartdigimkt.x.n;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class LoginFragment extends Fragment {
    public String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public LoginClient f16481Y;
    public LoginClient.Request Z;

    /* JADX INFO: renamed from: com.facebook.login.LoginFragment$1, reason: invalid class name */
    class AnonymousClass1 implements LoginClient.OnCompletedListener {
        public AnonymousClass1() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.LoginFragment$2, reason: invalid class name */
    class AnonymousClass2 implements LoginClient.BackgroundProcessingListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f16483a;

        public AnonymousClass2(View view) {
            this.f16483a = view;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        LoginClient loginClient = this.f16481Y;
        loginClient.l0++;
        if (loginClient.h0 != null) {
            if (intent != null) {
                int i4 = CustomTabMainActivity.Z;
                if (intent.getBooleanExtra("CustomTabMainActivity.no_activity_exception", false)) {
                    loginClient.m();
                    return;
                }
            }
            if (loginClient.f().q() && intent == null && loginClient.l0 < loginClient.m0) {
                return;
            }
            loginClient.f().n(i2, i3, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        if (bundle != null) {
            LoginClient loginClient = (LoginClient) bundle.getParcelable("loginClient");
            this.f16481Y = loginClient;
            if (loginClient.Z != null) {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
            loginClient.Z = this;
        } else {
            LoginClient loginClient2 = new LoginClient();
            loginClient2.f16475Y = -1;
            loginClient2.l0 = 0;
            loginClient2.m0 = 0;
            loginClient2.Z = this;
            this.f16481Y = loginClient2;
        }
        this.f16481Y.e0 = new AnonymousClass1();
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.X = callingActivity.getPackageName();
        }
        Intent intent = activity.getIntent();
        if (intent == null || (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) == null) {
            return;
        }
        this.Z = (LoginClient.Request) bundleExtra.getParcelable("request");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(com.charging.screenshow.battery.animations.themes.R.layout.com_facebook_login_fragment, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(com.charging.screenshow.battery.animations.themes.R.id.com_facebook_login_fragment_progress_bar);
        this.f16481Y.f0 = new AnonymousClass2(viewFindViewById);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        LoginClient loginClient = this.f16481Y;
        if (loginClient.f16475Y >= 0) {
            loginClient.f().b();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        View viewFindViewById = getView() == null ? null : getView().findViewById(com.charging.screenshow.battery.animations.themes.R.id.com_facebook_login_fragment_progress_bar);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.X == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            getActivity().finish();
            return;
        }
        LoginClient loginClient = this.f16481Y;
        LoginClient.Request request = this.Z;
        LoginClient.Request request2 = loginClient.h0;
        if ((request2 == null || loginClient.f16475Y < 0) && request != null) {
            if (request2 != null) {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            }
            Date date = AccessToken.m0;
            if (!AccessToken.Companion.c() || loginClient.b()) {
                loginClient.h0 = request;
                ArrayList arrayList = new ArrayList();
                LoginTargetApp loginTargetApp = LoginTargetApp.INSTAGRAM;
                LoginTargetApp loginTargetApp2 = request.m0;
                boolean z2 = loginTargetApp2 == loginTargetApp;
                LoginBehavior loginBehavior = request.X;
                if (!z2) {
                    if (loginBehavior.X) {
                        arrayList.add(new GetTokenLoginMethodHandler(loginClient));
                    }
                    if (!FacebookSdk.o && loginBehavior.f16474Y) {
                        arrayList.add(new KatanaProxyLoginMethodHandler(loginClient));
                    }
                    if (!FacebookSdk.o && loginBehavior.g0) {
                        arrayList.add(new FacebookLiteLoginMethodHandler(loginClient));
                    }
                } else if (!FacebookSdk.o && loginBehavior.h0) {
                    arrayList.add(new InstagramAppLoginMethodHandler(loginClient));
                }
                if (loginBehavior.f0) {
                    CustomTabLoginMethodHandler customTabLoginMethodHandler = new CustomTabLoginMethodHandler(loginClient);
                    customTabLoginMethodHandler.g0 = "";
                    String string = new BigInteger(100, new Random()).toString(32);
                    Intrinsics.e(string, "BigInteger(length * 5, r).toString(32)");
                    customTabLoginMethodHandler.f0 = string;
                    CustomTabLoginMethodHandler.h0 = false;
                    customTabLoginMethodHandler.g0 = CustomTabUtils.c(n.f39791p + FacebookSdk.c() + "://authorize");
                    arrayList.add(customTabLoginMethodHandler);
                }
                if (loginBehavior.Z) {
                    arrayList.add(new WebViewLoginMethodHandler(loginClient));
                }
                if (loginTargetApp2 != loginTargetApp && loginBehavior.e0) {
                    arrayList.add(new DeviceAuthMethodHandler(loginClient));
                }
                LoginMethodHandler[] loginMethodHandlerArr = new LoginMethodHandler[arrayList.size()];
                arrayList.toArray(loginMethodHandlerArr);
                loginClient.X = loginMethodHandlerArr;
                loginClient.m();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", this.f16481Y);
    }
}
