package com.facebook.gamingservices;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.media3.extractor.text.ttml.a;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Validate;
import com.facebook.share.internal.GameRequestValidation;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.GameRequestContent;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public class GameRequestDialog extends FacebookDialogBase<GameRequestContent, Result> {
    public static final /* synthetic */ int g = 0;

    /* JADX INFO: renamed from: com.facebook.gamingservices.GameRequestDialog$1, reason: invalid class name */
    class AnonymousClass1 extends ResultProcessor {
        @Override // com.facebook.share.internal.ResultProcessor
        public final void c(AppCall appCall, Bundle bundle) {
            if (bundle != null) {
                Result result = new Result();
                bundle.getString("request");
                result.f16242a = new ArrayList();
                while (bundle.containsKey(String.format("to[%d]", Integer.valueOf(result.f16242a.size())))) {
                    ArrayList arrayList = result.f16242a;
                    arrayList.add(bundle.getString(String.format("to[%d]", Integer.valueOf(arrayList.size()))));
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.gamingservices.GameRequestDialog$2, reason: invalid class name */
    class AnonymousClass2 implements CallbackManagerImpl.Callback {
        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public final boolean a(int i2, Intent intent) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.gamingservices.GameRequestDialog$3, reason: invalid class name */
    class AnonymousClass3 implements DaemonRequest.Callback {
        @Override // com.facebook.gamingservices.cloudgaming.DaemonRequest.Callback
        public final void a() {
            int i2 = GameRequestDialog.g;
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

    public class FacebookAppHandler extends FacebookDialogBase<GameRequestContent, Result>.ModeHandler {
        public FacebookAppHandler() {
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final boolean a(Object obj, boolean z2) {
            String str;
            int i2 = GameRequestDialog.g;
            PackageManager packageManager = GameRequestDialog.this.d().getPackageManager();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            boolean z3 = intent.resolveActivity(packageManager) != null;
            Date date = AccessToken.m0;
            AccessToken accessTokenB = AccessToken.Companion.b();
            return z3 && (accessTokenB != null && (str = accessTokenB.l0) != null && "gaming".equals(str));
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final AppCall b(Object obj) {
            GameRequestContent gameRequestContent = (GameRequestContent) obj;
            AppCall appCallC = GameRequestDialog.this.c();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            Date date = AccessToken.m0;
            AccessToken accessTokenB = AccessToken.Companion.b();
            Bundle bundleD = a.d(com.smartdigimkt.m6.a.r.j, "GAME_REQUESTS");
            if (accessTokenB != null) {
                bundleD.putString("app_id", accessTokenB.i0);
            } else {
                bundleD.putString("app_id", FacebookSdk.c());
            }
            GameRequestContent.ActionType actionType = gameRequestContent.g0;
            bundleD.putString("actionType", actionType != null ? actionType.name() : null);
            bundleD.putString(PglCryptUtils.KEY_MESSAGE, gameRequestContent.X);
            bundleD.putString("title", gameRequestContent.e0);
            bundleD.putString("data", gameRequestContent.f0);
            bundleD.putString("cta", gameRequestContent.f16610Y);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = gameRequestContent.Z;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
            }
            bundleD.putString("to", jSONArray.toString());
            NativeProtocol.r(intent, appCallC.b().toString(), "", NativeProtocol.m(), bundleD);
            appCallC.e(intent);
            return appCallC;
        }
    }

    public static final class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f16242a;
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
        arrayList.add(new FacebookAppHandler());
        arrayList.add(new ChromeCustomTabHandler());
        arrayList.add(new WebHandler());
        return arrayList;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final void g(Object obj, Object obj2) {
        super.g((GameRequestContent) obj, FacebookDialogBase.f);
    }
}
