package com.facebook.share.widget;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.Utility;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.model.AppGroupCreationContent;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class CreateAppGroupDialog extends FacebookDialogBase<AppGroupCreationContent, Result> {

    /* JADX INFO: renamed from: com.facebook.share.widget.CreateAppGroupDialog$1, reason: invalid class name */
    class AnonymousClass1 extends ResultProcessor {
        @Override // com.facebook.share.internal.ResultProcessor
        public final void c(AppCall appCall, Bundle bundle) {
            bundle.getString("id");
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.widget.CreateAppGroupDialog$2, reason: invalid class name */
    class AnonymousClass2 implements CallbackManagerImpl.Callback {
        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public final boolean a(int i2, Intent intent) {
            throw null;
        }
    }

    @Deprecated
    public static final class Result {
    }

    public class WebHandler extends FacebookDialogBase<AppGroupCreationContent, Result>.ModeHandler {
        public WebHandler() {
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final /* bridge */ /* synthetic */ boolean a(Object obj, boolean z2) {
            return true;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final AppCall b(Object obj) {
            AppGroupCreationContent appGroupCreationContent = (AppGroupCreationContent) obj;
            AppCall appCallC = CreateAppGroupDialog.this.c();
            Bundle bundle = new Bundle();
            Utility.O(bundle, "name", appGroupCreationContent.X);
            Utility.O(bundle, "description", appGroupCreationContent.f16605Y);
            AppGroupCreationContent.AppGroupPrivacy appGroupPrivacy = appGroupCreationContent.Z;
            if (appGroupPrivacy != null) {
                Utility.O(bundle, "privacy", appGroupPrivacy.toString().toLowerCase(Locale.ENGLISH));
            }
            DialogPresenter.f(appCallC, "game_group_create", bundle);
            return appCallC;
        }
    }

    static {
        CallbackManagerImpl.RequestCodeOffset.AppGroupCreate.d();
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final AppCall c() {
        return new AppCall(this.d, 0);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WebHandler());
        return arrayList;
    }
}
