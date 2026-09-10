package com.facebook.share.widget;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.Validate;
import com.facebook.share.internal.GameRequestValidation;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.GameRequestContent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class GameRequestDialog extends FacebookDialogBase<GameRequestContent, Result> {
    public static final /* synthetic */ int g = 0;

    /* JADX INFO: renamed from: com.facebook.share.widget.GameRequestDialog$1, reason: invalid class name */
    class AnonymousClass1 extends ResultProcessor {
        @Override // com.facebook.share.internal.ResultProcessor
        public final void c(AppCall appCall, Bundle bundle) {
            if (bundle != null) {
                Result result = new Result();
                bundle.getString("request");
                result.f16634a = new ArrayList();
                while (bundle.containsKey(String.format("to[%d]", Integer.valueOf(result.f16634a.size())))) {
                    ArrayList arrayList = result.f16634a;
                    arrayList.add(bundle.getString(String.format("to[%d]", Integer.valueOf(arrayList.size()))));
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.widget.GameRequestDialog$2, reason: invalid class name */
    class AnonymousClass2 implements CallbackManagerImpl.Callback {
        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public final boolean a(int i2, Intent intent) {
            throw null;
        }
    }

    public class ChromeCustomTabHandler extends FacebookDialogBase<GameRequestContent, Result>.ModeHandler {
        public ChromeCustomTabHandler() {
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final boolean a(Object obj, boolean z2) {
            if (CustomTabUtils.a() == null) {
                return false;
            }
            int i2 = GameRequestDialog.g;
            return Validate.a(GameRequestDialog.this.d(), CustomTabUtils.b());
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final AppCall b(Object obj) {
            GameRequestContent gameRequestContent = (GameRequestContent) obj;
            GameRequestValidation.a(gameRequestContent);
            AppCall appCallC = GameRequestDialog.this.c();
            Bundle bundleA = WebDialogParameters.a(gameRequestContent);
            Date date = AccessToken.m0;
            AccessToken accessTokenB = AccessToken.Companion.b();
            if (accessTokenB != null) {
                bundleA.putString("app_id", accessTokenB.i0);
            } else {
                bundleA.putString("app_id", FacebookSdk.c());
            }
            bundleA.putString("redirect_uri", CustomTabUtils.b());
            DialogPresenter.c(appCallC, bundleA);
            return appCallC;
        }
    }

    public static final class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f16634a;
    }

    public class WebHandler extends FacebookDialogBase<GameRequestContent, Result>.ModeHandler {
        public WebHandler() {
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final /* bridge */ /* synthetic */ boolean a(Object obj, boolean z2) {
            return true;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final AppCall b(Object obj) {
            GameRequestContent gameRequestContent = (GameRequestContent) obj;
            GameRequestValidation.a(gameRequestContent);
            AppCall appCallC = GameRequestDialog.this.c();
            DialogPresenter.f(appCallC, "apprequests", WebDialogParameters.a(gameRequestContent));
            return appCallC;
        }
    }

    static {
        CallbackManagerImpl.RequestCodeOffset.GameRequest.d();
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final AppCall c() {
        return new AppCall(this.d, 0);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ChromeCustomTabHandler());
        arrayList.add(new WebHandler());
        return arrayList;
    }
}
