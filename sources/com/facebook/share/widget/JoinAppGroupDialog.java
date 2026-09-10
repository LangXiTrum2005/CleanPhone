package com.facebook.share.widget;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.share.internal.ResultProcessor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class JoinAppGroupDialog extends FacebookDialogBase<String, Result> {

    /* JADX INFO: renamed from: com.facebook.share.widget.JoinAppGroupDialog$1, reason: invalid class name */
    class AnonymousClass1 extends ResultProcessor {
        @Override // com.facebook.share.internal.ResultProcessor
        public final void c(AppCall appCall, Bundle bundle) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.widget.JoinAppGroupDialog$2, reason: invalid class name */
    class AnonymousClass2 implements CallbackManagerImpl.Callback {
        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public final boolean a(int i2, Intent intent) {
            throw null;
        }
    }

    @Deprecated
    public static final class Result {
    }

    public class WebHandler extends FacebookDialogBase<String, Result>.ModeHandler {
        public WebHandler() {
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final /* bridge */ /* synthetic */ boolean a(Object obj, boolean z2) {
            return true;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final AppCall b(Object obj) {
            AppCall appCallC = JoinAppGroupDialog.this.c();
            Bundle bundle = new Bundle();
            bundle.putString("id", (String) obj);
            DialogPresenter.f(appCallC, "game_group_join", bundle);
            return appCallC;
        }
    }

    static {
        CallbackManagerImpl.RequestCodeOffset.AppGroupJoin.d();
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
