package com.facebook.share.widget;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.share.internal.AppInviteDialogFeature;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.AppInviteContent;
import com.facebook.share.model.ShareContent;
import com.smartdigimkt.o1.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class AppInviteDialog extends FacebookDialogBase<AppInviteContent, Result> {

    /* JADX INFO: renamed from: com.facebook.share.widget.AppInviteDialog$1, reason: invalid class name */
    class AnonymousClass1 extends ResultProcessor {
        @Override // com.facebook.share.internal.ResultProcessor
        public final void c(AppCall appCall, Bundle bundle) {
            if (!b.P3.equalsIgnoreCase(ShareInternalUtility.c(bundle))) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.widget.AppInviteDialog$2, reason: invalid class name */
    class AnonymousClass2 implements CallbackManagerImpl.Callback {
        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public final boolean a(int i2, Intent intent) {
            throw null;
        }
    }

    public class NativeHandler extends FacebookDialogBase<AppInviteContent, Result>.ModeHandler {
        public NativeHandler() {
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final /* bridge */ /* synthetic */ boolean a(Object obj, boolean z2) {
            return false;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final AppCall b(Object obj) {
            final AppInviteContent appInviteContent = (AppInviteContent) obj;
            AppCall appCallC = AppInviteDialog.this.c();
            DialogPresenter.d(appCallC, new DialogPresenter.ParameterProvider() { // from class: com.facebook.share.widget.AppInviteDialog.NativeHandler.1
                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public final Bundle a() {
                    Log.e("AppInviteDialog", "Attempting to present the AppInviteDialog with an outdated Facebook app on the device");
                    return new Bundle();
                }

                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public final Bundle getParameters() {
                    return AppInviteDialog.i(appInviteContent);
                }
            }, AppInviteDialogFeature.f16528Y);
            return appCallC;
        }
    }

    @Deprecated
    public static final class Result {
    }

    public class WebFallbackHandler extends FacebookDialogBase<AppInviteContent, Result>.ModeHandler {
        public WebFallbackHandler() {
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final /* bridge */ /* synthetic */ boolean a(Object obj, boolean z2) {
            return false;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final AppCall b(Object obj) {
            AppCall appCallC = AppInviteDialog.this.c();
            DialogPresenter.g(appCallC, AppInviteDialog.i((AppInviteContent) obj), AppInviteDialogFeature.f16528Y);
            return appCallC;
        }
    }

    static {
        CallbackManagerImpl.RequestCodeOffset.AppInvite.d();
    }

    public static Bundle i(AppInviteContent appInviteContent) {
        Bundle bundle = new Bundle();
        bundle.putString("app_link_url", appInviteContent.X);
        bundle.putString("preview_image_url", appInviteContent.f16606Y);
        AppInviteContent.Builder.Destination destination = appInviteContent.f0;
        if (destination == null) {
            destination = AppInviteContent.Builder.Destination.FACEBOOK;
        }
        bundle.putString("destination", destination.X);
        String str = appInviteContent.Z;
        if (str == null) {
            str = "";
        }
        String str2 = appInviteContent.e0;
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("promo_code", str);
                jSONObject.put("promo_text", str2);
                bundle.putString("deeplink_context", jSONObject.toString());
                bundle.putString("promo_code", str);
                bundle.putString("promo_text", str2);
                return bundle;
            } catch (JSONException unused) {
                Log.e("AppInviteDialog", "Json Exception in creating deeplink context");
            }
        }
        return bundle;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final AppCall c() {
        return new AppCall(this.d, 0);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NativeHandler());
        arrayList.add(new WebFallbackHandler());
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.internal.FacebookDialogBase
    public final /* bridge */ /* synthetic */ void f(ShareContent shareContent) {
    }
}
