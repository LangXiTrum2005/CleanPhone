package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService;

/* JADX INFO: loaded from: classes.dex */
public class PostMessageService extends Service {
    public final IPostMessageService.Stub X;

    /* JADX INFO: renamed from: androidx.browser.customtabs.PostMessageService$1, reason: invalid class name */
    public class AnonymousClass1 extends IPostMessageService.Stub {
        @Override // android.support.customtabs.IPostMessageService
        public final void K(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            iCustomTabsCallback.V(str, bundle);
        }

        @Override // android.support.customtabs.IPostMessageService
        public final void j(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            iCustomTabsCallback.W(bundle);
        }
    }

    public PostMessageService() {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.attachInterface(anonymousClass1, IPostMessageService.G8);
        this.X = anonymousClass1;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.X;
    }
}
