package com.facebook.login.widget;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.charging.screenshow.battery.animations.themes.R;
import com.facebook.AccessToken;
import com.facebook.AccessTokenManager;
import com.facebook.AccessTokenTracker;
import com.facebook.AuthenticationToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookButtonBase;
import com.facebook.ProfileManager;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginTargetApp;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class LoginButton extends FacebookButtonBase {
    public static final /* synthetic */ int s0 = 0;
    public String k0;
    public String l0;
    public LoginButtonProperties m0;
    public ToolTipPopup.Style n0;
    public ToolTipMode o0;
    public long p0;
    public ToolTipPopup q0;
    public LoginManager r0;

    /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$1$1, reason: invalid class name and collision with other inner class name */
        class RunnableC01841 implements Runnable {
            public final /* synthetic */ FetchedAppSettings X;

            public RunnableC01841(FetchedAppSettings fetchedAppSettings) {
                this.X = fetchedAppSettings;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (CrashShieldHandler.b(this)) {
                    return;
                }
                try {
                    int i2 = LoginButton.s0;
                    throw null;
                } catch (Throwable th) {
                    CrashShieldHandler.a(this, th);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.b(this)) {
                return;
            }
            try {
                FetchedAppSettingsManager.f(null, false);
                int i2 = LoginButton.s0;
                throw null;
            } catch (Throwable th) {
                CrashShieldHandler.a(this, th);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$2, reason: invalid class name */
    class AnonymousClass2 extends AccessTokenTracker {
        @Override // com.facebook.AccessTokenTracker
        public final void a(AccessToken accessToken, AccessToken accessToken2) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16512a;

        static {
            int[] iArr = new int[ToolTipMode.values().length];
            f16512a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16512a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16512a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class LoginButtonProperties {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DefaultAudience f16513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f16514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LoginBehavior f16515c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LoginTargetApp f16516e;
        public String f;
        public boolean g;
    }

    public class LoginClickListener implements View.OnClickListener {

        /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$LoginClickListener$1, reason: invalid class name */
        class AnonymousClass1 implements DialogInterface.OnClickListener {
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                throw null;
            }
        }

        public LoginClickListener() {
        }

        public LoginManager a() {
            LoginTargetApp loginTargetApp;
            LoginButton loginButton = LoginButton.this;
            if (CrashShieldHandler.b(this)) {
                return null;
            }
            try {
                LoginManager loginManagerB = LoginManager.b();
                loginManagerB.f16490b = loginButton.getDefaultAudience();
                loginManagerB.f16489a = loginButton.getLoginBehavior();
                if (CrashShieldHandler.b(this)) {
                    loginTargetApp = null;
                } else {
                    try {
                        loginTargetApp = LoginTargetApp.FACEBOOK;
                    } catch (Throwable th) {
                        CrashShieldHandler.a(this, th);
                        loginTargetApp = null;
                    }
                }
                loginManagerB.g = loginTargetApp;
                loginManagerB.d = loginButton.getAuthType();
                CrashShieldHandler.b(this);
                loginManagerB.f16493h = loginButton.getShouldSkipAccountDeduplication();
                loginManagerB.f16492e = loginButton.getMessengerPageId();
                loginManagerB.f = loginButton.getResetMessengerState();
                return loginManagerB;
            } catch (Throwable th2) {
                CrashShieldHandler.a(this, th2);
                return null;
            }
        }

        public final void b() {
            LoginButton loginButton = LoginButton.this;
            if (CrashShieldHandler.b(this)) {
                return;
            }
            try {
                LoginManager loginManagerA = a();
                if (loginButton.getAndroidxActivityResultRegistryOwner() != null) {
                    int i2 = LoginButton.s0;
                    loginManagerA.e(loginButton.getAndroidxActivityResultRegistryOwner(), new CallbackManagerImpl(), loginButton.m0.f16514b, loginButton.getLoggerID());
                    return;
                }
                if (loginButton.getFragment() != null) {
                    Fragment fragment = loginButton.getFragment();
                    List list = loginButton.m0.f16514b;
                    String loggerID = loginButton.getLoggerID();
                    loginManagerA.getClass();
                    loginManagerA.f(new FragmentWrapper(fragment), list, loggerID);
                    return;
                }
                if (loginButton.getNativeFragment() == null) {
                    int i3 = LoginButton.s0;
                    loginManagerA.d(loginButton.getActivity(), loginButton.m0.f16514b, loginButton.getLoggerID());
                    return;
                }
                android.app.Fragment nativeFragment = loginButton.getNativeFragment();
                List list2 = loginButton.m0.f16514b;
                String loggerID2 = loginButton.getLoggerID();
                loginManagerA.getClass();
                loginManagerA.f(new FragmentWrapper(nativeFragment), list2, loggerID2);
            } catch (Throwable th) {
                CrashShieldHandler.a(this, th);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LoginButton loginButton = LoginButton.this;
            if (CrashShieldHandler.b(this)) {
                return;
            }
            try {
                int i2 = LoginButton.s0;
                loginButton.a(view);
                Date date = AccessToken.m0;
                AccessToken accessTokenB = AccessToken.Companion.b();
                int i3 = 0;
                if (AccessToken.Companion.c()) {
                    loginButton.getContext();
                    if (!CrashShieldHandler.b(this)) {
                        try {
                            LoginManager loginManagerA = a();
                            loginManagerA.getClass();
                            AccessTokenManager.g.a().c(null, true);
                            AuthenticationToken.a(null);
                            ProfileManager.f15957e.a().a(null, true);
                            SharedPreferences.Editor editorEdit = loginManagerA.f16491c.edit();
                            editorEdit.putBoolean("express_login_allowed", false);
                            editorEdit.apply();
                        } catch (Throwable th) {
                            CrashShieldHandler.a(this, th);
                        }
                    }
                } else {
                    b();
                }
                InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(loginButton.getContext());
                Bundle bundle = new Bundle();
                if (accessTokenB == null) {
                    i3 = 1;
                }
                bundle.putInt("logging_in", i3);
                Date date2 = AccessToken.m0;
                bundle.putInt("access_token_expired", AccessToken.Companion.c() ? 1 : 0);
                internalAppEventsLogger.d(bundle, null);
            } catch (Throwable th2) {
                CrashShieldHandler.a(this, th2);
            }
        }
    }

    public enum ToolTipMode {
        /* JADX INFO: Fake field, exist only in values array */
        AUTOMATIC("automatic"),
        /* JADX INFO: Fake field, exist only in values array */
        DISPLAY_ALWAYS("display_always"),
        /* JADX INFO: Fake field, exist only in values array */
        NEVER_DISPLAY("never_display");

        public final String X;

        ToolTipMode(String str) {
            this.X = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.X;
        }
    }

    public final void c(String str) {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            ToolTipPopup toolTipPopup = new ToolTipPopup(str, this);
            this.q0 = toolTipPopup;
            ToolTipPopup.Style style = this.n0;
            if (!CrashShieldHandler.b(toolTipPopup)) {
                try {
                    toolTipPopup.f = style;
                } catch (Throwable th) {
                    CrashShieldHandler.a(toolTipPopup, th);
                }
            }
            ToolTipPopup toolTipPopup2 = this.q0;
            long j = this.p0;
            toolTipPopup2.getClass();
            if (!CrashShieldHandler.b(toolTipPopup2)) {
                try {
                    toolTipPopup2.g = j;
                } catch (Throwable th2) {
                    CrashShieldHandler.a(toolTipPopup2, th2);
                }
            }
            this.q0.c();
        } catch (Throwable th3) {
            CrashShieldHandler.a(this, th3);
        }
    }

    public final int d(String str) {
        if (CrashShieldHandler.b(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + b(str) + getCompoundPaddingRight();
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
            return 0;
        }
    }

    public final void e() {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            Resources resources = getResources();
            if (!isInEditMode()) {
                Date date = AccessToken.m0;
                if (AccessToken.Companion.c()) {
                    String string = this.l0;
                    if (string == null) {
                        string = resources.getString(R.string.com_facebook_loginview_log_out_button);
                    }
                    setText(string);
                    return;
                }
            }
            String str = this.k0;
            if (str != null) {
                setText(str);
                return;
            }
            String string2 = resources.getString(getLoginButtonContinueLabel());
            int width = getWidth();
            if (width != 0 && d(string2) > width) {
                string2 = resources.getString(R.string.com_facebook_loginview_log_in_button);
            }
            setText(string2);
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }

    public String getAuthType() {
        return this.m0.d;
    }

    public CallbackManager getCallbackManager() {
        return null;
    }

    public DefaultAudience getDefaultAudience() {
        return this.m0.f16513a;
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultRequestCode() {
        if (CrashShieldHandler.b(this)) {
            return 0;
        }
        try {
            return CallbackManagerImpl.RequestCodeOffset.Login.d();
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
            return 0;
        }
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultStyleResource() {
        return R.style.com_facebook_loginview_default_style;
    }

    public String getLoggerID() {
        return null;
    }

    public LoginBehavior getLoginBehavior() {
        return this.m0.f16515c;
    }

    public int getLoginButtonContinueLabel() {
        return R.string.com_facebook_loginview_log_in_button_continue;
    }

    public LoginManager getLoginManager() {
        if (this.r0 == null) {
            this.r0 = LoginManager.b();
        }
        return this.r0;
    }

    public LoginTargetApp getLoginTargetApp() {
        return this.m0.f16516e;
    }

    public String getMessengerPageId() {
        return this.m0.f;
    }

    public LoginClickListener getNewLoginClickListener() {
        return new LoginClickListener();
    }

    public List<String> getPermissions() {
        return this.m0.f16514b;
    }

    public boolean getResetMessengerState() {
        return this.m0.g;
    }

    public boolean getShouldSkipAccountDeduplication() {
        this.m0.getClass();
        return false;
    }

    public long getToolTipDisplayTime() {
        return this.p0;
    }

    public ToolTipMode getToolTipMode() {
        return this.o0;
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            super.onDetachedFromWindow();
            ToolTipPopup toolTipPopup = this.q0;
            if (toolTipPopup != null) {
                toolTipPopup.b();
                this.q0 = null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            super.onDraw(canvas);
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            super.onLayout(z2, i2, i3, i4, i5);
            try {
                e();
            } catch (Throwable th) {
                th = th;
                CrashShieldHandler.a(this, th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil(Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom))) + getCompoundPaddingBottom();
            Resources resources = getResources();
            int iD = 0;
            if (!CrashShieldHandler.b(this)) {
                try {
                    Resources resources2 = getResources();
                    String string = this.k0;
                    if (string == null) {
                        string = resources2.getString(R.string.com_facebook_loginview_log_in_button_continue);
                        int iD2 = d(string);
                        if (View.resolveSize(iD2, i2) < iD2) {
                            string = resources2.getString(R.string.com_facebook_loginview_log_in_button);
                        }
                    }
                    iD = d(string);
                } catch (Throwable th) {
                    CrashShieldHandler.a(this, th);
                }
            }
            String string2 = this.l0;
            if (string2 == null) {
                string2 = resources.getString(R.string.com_facebook_loginview_log_out_button);
            }
            setMeasuredDimension(View.resolveSize(Math.max(iD, d(string2)), i2), compoundPaddingTop);
        } catch (Throwable th2) {
            CrashShieldHandler.a(this, th2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        ToolTipPopup toolTipPopup;
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            super.onVisibilityChanged(view, i2);
            if (i2 == 0 || (toolTipPopup = this.q0) == null) {
                return;
            }
            toolTipPopup.b();
            this.q0 = null;
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }

    public void setAuthType(String str) {
        this.m0.d = str;
    }

    public void setDefaultAudience(DefaultAudience defaultAudience) {
        this.m0.f16513a = defaultAudience;
    }

    public void setLoginBehavior(LoginBehavior loginBehavior) {
        this.m0.f16515c = loginBehavior;
    }

    public void setLoginManager(LoginManager loginManager) {
        this.r0 = loginManager;
    }

    public void setLoginTargetApp(LoginTargetApp loginTargetApp) {
        this.m0.f16516e = loginTargetApp;
    }

    public void setLoginText(String str) {
        this.k0 = str;
        e();
    }

    public void setLogoutText(String str) {
        this.l0 = str;
        e();
    }

    public void setMessengerPageId(String str) {
        this.m0.f = str;
    }

    public void setPermissions(List<String> list) {
        this.m0.f16514b = list;
    }

    public void setProperties(LoginButtonProperties loginButtonProperties) {
        this.m0 = loginButtonProperties;
    }

    public void setPublishPermissions(List<String> list) {
        this.m0.f16514b = list;
    }

    public void setReadPermissions(List<String> list) {
        this.m0.f16514b = list;
    }

    public void setResetMessengerState(boolean z2) {
        this.m0.g = z2;
    }

    public void setToolTipDisplayTime(long j) {
        this.p0 = j;
    }

    public void setToolTipMode(ToolTipMode toolTipMode) {
        this.o0 = toolTipMode;
    }

    public void setToolTipStyle(ToolTipPopup.Style style) {
        this.n0 = style;
    }

    public void setPermissions(String... strArr) {
        this.m0.f16514b = Arrays.asList(strArr);
    }

    public void setPublishPermissions(String... strArr) {
        this.m0.f16514b = Arrays.asList(strArr);
    }

    public void setReadPermissions(String... strArr) {
        this.m0.f16514b = Arrays.asList(strArr);
    }
}
