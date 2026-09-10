package sg.bigo.ads.a.a;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CustomTabsClient f45347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CustomTabsServiceConnection f45348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0779a f45349c;
    public CustomTabsCallback d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CustomTabsSession f45350e;

    /* JADX INFO: renamed from: sg.bigo.ads.a.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0779a {
        void c();

        void d();
    }

    public interface b {
        void a(Context context, sg.bigo.ads.a.a.b.a aVar);

        void a(sg.bigo.ads.a.a.b.a aVar);
    }

    public final CustomTabsSession a() {
        CustomTabsSession customTabsSessionD;
        CustomTabsClient customTabsClient = this.f45347a;
        if (customTabsClient != null) {
            customTabsSessionD = this.f45350e == null ? customTabsClient.d(new CustomTabsCallback() { // from class: sg.bigo.ads.a.a.a.1
                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void extraCallback(String str, Bundle bundle) {
                    super.extraCallback(str, bundle);
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onMessageChannelReady(Bundle bundle) {
                    super.onMessageChannelReady(bundle);
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onNavigationEvent(int i2, Bundle bundle) {
                    CustomTabsCallback customTabsCallback = a.this.d;
                    if (customTabsCallback != null) {
                        customTabsCallback.onNavigationEvent(i2, bundle);
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onPostMessage(String str, Bundle bundle) {
                    super.onPostMessage(str, bundle);
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onRelationshipValidationResult(int i2, Uri uri, boolean z2, Bundle bundle) {
                    super.onRelationshipValidationResult(i2, uri, z2, bundle);
                }
            }) : null;
            return this.f45350e;
        }
        this.f45350e = customTabsSessionD;
        return this.f45350e;
    }

    @Override // sg.bigo.ads.a.a.d
    public final void b() {
        this.f45347a = null;
        this.f45350e = null;
        InterfaceC0779a interfaceC0779a = this.f45349c;
        if (interfaceC0779a != null) {
            interfaceC0779a.d();
        }
    }

    @Override // sg.bigo.ads.a.a.d
    public final void a(CustomTabsClient customTabsClient) {
        this.f45347a = customTabsClient;
        customTabsClient.e();
        InterfaceC0779a interfaceC0779a = this.f45349c;
        if (interfaceC0779a != null) {
            interfaceC0779a.c();
        }
    }
}
