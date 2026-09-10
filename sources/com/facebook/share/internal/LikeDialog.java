package com.facebook.share.internal;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.share.model.ShareContent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class LikeDialog extends FacebookDialogBase<LikeContent, Result> {
    public static final /* synthetic */ int g = 0;

    /* JADX INFO: renamed from: com.facebook.share.internal.LikeDialog$1, reason: invalid class name */
    class AnonymousClass1 extends ResultProcessor {
        @Override // com.facebook.share.internal.ResultProcessor
        public final void c(AppCall appCall, Bundle bundle) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.internal.LikeDialog$2, reason: invalid class name */
    class AnonymousClass2 implements CallbackManagerImpl.Callback {
        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public final boolean a(int i2, Intent intent) {
            throw null;
        }
    }

    public class NativeHandler extends FacebookDialogBase<LikeContent, Result>.ModeHandler {
        public NativeHandler() {
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final /* bridge */ /* synthetic */ boolean a(Object obj, boolean z2) {
            return false;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final AppCall b(Object obj) {
            final LikeContent likeContent = (LikeContent) obj;
            AppCall appCallC = LikeDialog.this.c();
            DialogPresenter.d(appCallC, new DialogPresenter.ParameterProvider() { // from class: com.facebook.share.internal.LikeDialog.NativeHandler.1
                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public final Bundle a() {
                    Log.e("LikeDialog", "Attempting to present the Like Dialog with an outdated Facebook app on the device");
                    return new Bundle();
                }

                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public final Bundle getParameters() {
                    int i2 = LikeDialog.g;
                    Bundle bundle = new Bundle();
                    LikeContent likeContent2 = likeContent;
                    bundle.putString("object_id", likeContent2.X);
                    bundle.putString("object_type", likeContent2.f16579Y);
                    return bundle;
                }
            }, LikeDialogFeature.f16583Y);
            return appCallC;
        }
    }

    @Deprecated
    public static final class Result {
    }

    public class WebFallbackHandler extends FacebookDialogBase<LikeContent, Result>.ModeHandler {
        public WebFallbackHandler() {
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final /* bridge */ /* synthetic */ boolean a(Object obj, boolean z2) {
            return false;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final AppCall b(Object obj) {
            LikeContent likeContent = (LikeContent) obj;
            AppCall appCallC = LikeDialog.this.c();
            Bundle bundle = new Bundle();
            bundle.putString("object_id", likeContent.X);
            bundle.putString("object_type", likeContent.f16579Y);
            DialogPresenter.g(appCallC, bundle, LikeDialogFeature.f16583Y);
            return appCallC;
        }
    }

    static {
        CallbackManagerImpl.RequestCodeOffset.Like.d();
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
