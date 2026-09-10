package com.facebook.share.widget;

import android.view.View;
import androidx.datastore.preferences.protobuf.a;
import com.facebook.CallbackManager;
import com.facebook.FacebookButtonBase;
import com.facebook.FacebookSdk;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.Sharer;
import com.facebook.share.model.ShareContent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ShareButtonBase extends FacebookButtonBase {
    public static final /* synthetic */ int n0 = 0;
    public ShareContent k0;
    public int l0;
    public boolean m0;

    public CallbackManager getCallbackManager() {
        return null;
    }

    public abstract FacebookDialogBase<ShareContent, Sharer.Result> getDialog();

    @Override // com.facebook.FacebookButtonBase
    public int getRequestCode() {
        return this.l0;
    }

    public ShareContent getShareContent() {
        return this.k0;
    }

    public View.OnClickListener getShareOnClickListener() {
        return new View.OnClickListener() { // from class: com.facebook.share.widget.ShareButtonBase.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareButtonBase shareButtonBase = ShareButtonBase.this;
                if (CrashShieldHandler.b(this)) {
                    return;
                }
                try {
                    int i2 = ShareButtonBase.n0;
                    shareButtonBase.a(view);
                    shareButtonBase.getDialog().f(shareButtonBase.getShareContent());
                } catch (Throwable th) {
                    CrashShieldHandler.a(this, th);
                }
            }
        };
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        this.m0 = true;
    }

    public void setRequestCode(int i2) {
        int i3 = FacebookSdk.j;
        if (i2 >= i3 && i2 < i3 + 100) {
            throw new IllegalArgumentException(a.k("Request code ", i2, " cannot be within the range reserved by the Facebook SDK."));
        }
        this.l0 = i2;
    }

    public void setShareContent(ShareContent shareContent) {
        this.k0 = shareContent;
        if (this.m0) {
            return;
        }
        setEnabled(getDialog().a(getShareContent()));
        this.m0 = false;
    }
}
