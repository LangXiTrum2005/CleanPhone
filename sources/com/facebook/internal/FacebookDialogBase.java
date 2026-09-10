package com.facebook.internal;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import com.facebook.CallbackManager;
import com.facebook.FacebookDialog;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.model.ShareContent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/FacebookDialogBase;", "CONTENT", "RESULT", "Lcom/facebook/FacebookDialog;", "Companion", "ModeHandler", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public abstract class FacebookDialogBase<CONTENT, RESULT> implements FacebookDialog<CONTENT, RESULT> {
    public static final Object f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f16272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentWrapper f16273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f16274c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CallbackManager f16275e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/FacebookDialogBase$Companion;", "", "BASE_AUTOMATIC_MODE", "Ljava/lang/Object;", "", "TAG", "Ljava/lang/String;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b¤\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/FacebookDialogBase$ModeHandler;", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public abstract class ModeHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f16276a = FacebookDialogBase.f;

        public abstract boolean a(Object obj, boolean z2);

        public abstract AppCall b(Object obj);

        public Object c() {
            return FacebookDialogBase.f;
        }
    }

    public FacebookDialogBase(Activity activity, int i2) {
        Intrinsics.f(activity, "activity");
        this.f16272a = activity;
        this.f16273b = null;
        this.d = i2;
        this.f16275e = null;
    }

    public boolean a(ShareContent shareContent) {
        return b(shareContent);
    }

    public boolean b(ShareContent shareContent) {
        if (this.f16274c == null) {
            this.f16274c = e();
        }
        List list = this.f16274c;
        if (list == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase<CONTENT, RESULT>.ModeHandler>");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((ModeHandler) it.next()).a(shareContent, false)) {
                return true;
            }
        }
        return false;
    }

    public abstract AppCall c();

    public final Activity d() {
        Activity activity = this.f16272a;
        if (activity != null) {
            return activity;
        }
        FragmentWrapper fragmentWrapper = this.f16273b;
        if (fragmentWrapper != null) {
            return fragmentWrapper.a();
        }
        return null;
    }

    public abstract List e();

    public void f(ShareContent shareContent) {
        g(shareContent, f);
    }

    public void g(Object obj, Object mode) {
        Intent intent;
        AppCall appCall;
        Intrinsics.f(mode, "mode");
        boolean z2 = mode == f;
        if (this.f16274c == null) {
            this.f16274c = e();
        }
        List list = this.f16274c;
        if (list == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase<CONTENT, RESULT>.ModeHandler>");
        }
        Iterator it = list.iterator();
        while (true) {
            intent = null;
            if (!it.hasNext()) {
                appCall = null;
                break;
            }
            ModeHandler modeHandler = (ModeHandler) it.next();
            if (z2 || modeHandler.c().equals(mode)) {
                if (modeHandler.a(obj, true)) {
                    try {
                        appCall = modeHandler.b(obj);
                        break;
                    } catch (FacebookException e2) {
                        AppCall appCallC = c();
                        DialogPresenter.e(appCallC, e2);
                        appCall = appCallC;
                    }
                }
            }
        }
        if (appCall == null) {
            appCall = c();
            Intrinsics.f(appCall, "appCall");
            DialogPresenter.e(appCall, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
        }
        if (d() instanceof ActivityResultRegistryOwner) {
            ComponentCallbacks2 componentCallbacks2D = d();
            if (componentCallbacks2D == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
            }
            ActivityResultRegistry activityResultRegistry = ((ActivityResultRegistryOwner) componentCallbacks2D).getActivityResultRegistry();
            Intrinsics.e(activityResultRegistry, "registryOwner.activityResultRegistry");
            CallbackManager callbackManager = this.f16275e;
            if (!CrashShieldHandler.b(appCall)) {
                try {
                    intent = appCall.f16252a;
                } catch (Throwable th) {
                    CrashShieldHandler.a(appCall, th);
                }
            }
            if (intent != null) {
                DialogPresenter.h(activityResultRegistry, callbackManager, intent, appCall.c());
                appCall.d();
            }
            appCall.d();
            return;
        }
        FragmentWrapper fragmentWrapper = this.f16273b;
        if (fragmentWrapper != null) {
            if (!CrashShieldHandler.b(appCall)) {
                try {
                    intent = appCall.f16252a;
                } catch (Throwable th2) {
                    CrashShieldHandler.a(appCall, th2);
                }
            }
            fragmentWrapper.b(intent, appCall.c());
            appCall.d();
            return;
        }
        Activity activity = this.f16272a;
        if (activity != null) {
            if (!CrashShieldHandler.b(appCall)) {
                try {
                    intent = appCall.f16252a;
                } catch (Throwable th3) {
                    CrashShieldHandler.a(appCall, th3);
                }
            }
            activity.startActivityForResult(intent, appCall.c());
            appCall.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void h(Intent intent, int i2) {
        String str;
        Activity activityD = d();
        if (activityD instanceof ActivityResultRegistryOwner) {
            ActivityResultRegistry activityResultRegistry = ((ActivityResultRegistryOwner) activityD).getActivityResultRegistry();
            Intrinsics.e(activityResultRegistry, "(activity as ActivityRes…r).activityResultRegistry");
            DialogPresenter.h(activityResultRegistry, this.f16275e, intent, i2);
        } else {
            if (activityD == 0) {
                FragmentWrapper fragmentWrapper = this.f16273b;
                if (fragmentWrapper != null) {
                    fragmentWrapper.b(intent, i2);
                } else {
                    str = "Failed to find Activity or Fragment to startActivityForResult ";
                }
                if (str != null) {
                    HashMap map = Logger.d;
                    Logger.Companion.b(LoggingBehavior.g0, getClass().getName(), str);
                }
            }
            activityD.startActivityForResult(intent, i2);
        }
        str = null;
        if (str != null) {
            HashMap map2 = Logger.d;
            Logger.Companion.b(LoggingBehavior.g0, getClass().getName(), str);
        }
    }

    public FacebookDialogBase(FragmentWrapper fragmentWrapper, int i2) {
        this.f16273b = fragmentWrapper;
        this.f16272a = null;
        this.d = i2;
        if (fragmentWrapper.a() == null) {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity");
        }
    }
}
