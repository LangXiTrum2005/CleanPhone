package com.facebook.gamingservices;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.media3.extractor.text.ttml.a;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.model.ContextSwitchContent;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.model.ShareContent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ContextSwitchDialog extends FacebookDialogBase<ContextSwitchContent, Result> {
    public static final /* synthetic */ int g = 0;

    /* JADX INFO: renamed from: com.facebook.gamingservices.ContextSwitchDialog$1, reason: invalid class name */
    class AnonymousClass1 implements DaemonRequest.Callback {
        @Override // com.facebook.gamingservices.cloudgaming.DaemonRequest.Callback
        public final void a() {
            int i2 = ContextSwitchDialog.g;
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.gamingservices.ContextSwitchDialog$2, reason: invalid class name */
    class AnonymousClass2 extends ResultProcessor {
        @Override // com.facebook.share.internal.ResultProcessor
        public final void c(AppCall appCall, Bundle bundle) {
            if (bundle != null) {
                if (bundle.getString("error_message") != null) {
                    new FacebookException(bundle.getString("error_message"));
                    throw null;
                }
                if (bundle.getString("id") != null) {
                    new GamingContext(bundle.getString("id"));
                    bundle.getString("id");
                    throw null;
                }
                if (bundle.getString("context_id") == null) {
                    new FacebookException(bundle.getString("Invalid response received from server."));
                    throw null;
                }
                new GamingContext(bundle.getString("context_id"));
                bundle.getString("context_id");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.gamingservices.ContextSwitchDialog$3, reason: invalid class name */
    class AnonymousClass3 implements CallbackManagerImpl.Callback {
        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public final boolean a(int i2, Intent intent) {
            throw null;
        }
    }

    public class FacebookAppHandler extends FacebookDialogBase<ContextSwitchContent, Result>.ModeHandler {
        public FacebookAppHandler() {
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final /* bridge */ /* synthetic */ boolean a(Object obj, boolean z2) {
            return d();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final AppCall b(Object obj) {
            ContextSwitchContent contextSwitchContent = (ContextSwitchContent) obj;
            AppCall appCallC = ContextSwitchDialog.this.c();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            Date date = AccessToken.m0;
            AccessToken accessTokenB = AccessToken.Companion.b();
            Bundle bundleD = a.d(com.smartdigimkt.m6.a.r.j, "CONTEXT_SWITCH");
            if (accessTokenB != null) {
                bundleD.putString("game_id", accessTokenB.i0);
            } else {
                bundleD.putString("game_id", FacebookSdk.c());
            }
            contextSwitchContent.getClass();
            NativeProtocol.r(intent, appCallC.b().toString(), "", NativeProtocol.m(), bundleD);
            appCallC.e(intent);
            return appCallC;
        }

        public final boolean d() {
            String str;
            int i2 = ContextSwitchDialog.g;
            PackageManager packageManager = ContextSwitchDialog.this.d().getPackageManager();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            boolean z2 = intent.resolveActivity(packageManager) != null;
            Date date = AccessToken.m0;
            AccessToken accessTokenB = AccessToken.Companion.b();
            return z2 && (accessTokenB != null && (str = accessTokenB.l0) != null && "gaming".equals(str));
        }
    }

    public static final class Result {
    }

    public class WebHandler extends FacebookDialogBase<ContextSwitchContent, Result>.ModeHandler {
        public WebHandler() {
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final /* bridge */ /* synthetic */ boolean a(Object obj, boolean z2) {
            return true;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final AppCall b(Object obj) {
            AppCall appCallC = ContextSwitchDialog.this.c();
            Bundle bundle = new Bundle();
            ((ContextSwitchContent) obj).getClass();
            bundle.putString("context_id", null);
            Date date = AccessToken.m0;
            AccessToken accessTokenB = AccessToken.Companion.b();
            if (accessTokenB != null) {
                bundle.putString("dialog_access_token", accessTokenB.f0);
            }
            DialogPresenter.f(appCallC, "context", bundle);
            return appCallC;
        }
    }

    static {
        CallbackManagerImpl.RequestCodeOffset.GamingContextSwitch.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.internal.FacebookDialogBase
    public final boolean a(ShareContent shareContent) {
        new FacebookAppHandler().d();
        return true;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final AppCall c() {
        return new AppCall(this.d, 0);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FacebookAppHandler());
        arrayList.add(new WebHandler());
        return arrayList;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final void g(Object obj, Object obj2) {
        super.g((ContextSwitchContent) obj, FacebookDialogBase.f);
    }
}
