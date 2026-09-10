package androidx.webkit.internal;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import com.vungle.ads.internal.session.UnclosedAdDetector;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Callable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f8597Y;

    public /* synthetic */ b(Object obj, int i2) {
        this.X = i2;
        this.f8597Y = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ConfigContainer configContainerA;
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th;
        switch (this.X) {
            case 0:
                return new JavaScriptReplyProxyImpl((JsReplyProxyBoundaryInterface) this.f8597Y);
            case 1:
                WebViewRenderProcessImpl webViewRenderProcessImpl = new WebViewRenderProcessImpl();
                webViewRenderProcessImpl.f8595a = (WebViewRendererBoundaryInterface) this.f8597Y;
                return webViewRenderProcessImpl;
            case 2:
                return ((RemoteConfigComponent) this.f8597Y).b();
            case 3:
                ConfigStorageClient configStorageClient = (ConfigStorageClient) this.f8597Y;
                synchronized (configStorageClient) {
                    configContainerA = null;
                    try {
                        try {
                            fileInputStreamOpenFileInput = configStorageClient.f20989a.openFileInput(configStorageClient.f20990b);
                            try {
                                int iAvailable = fileInputStreamOpenFileInput.available();
                                byte[] bArr = new byte[iAvailable];
                                fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                                configContainerA = ConfigContainer.a(new JSONObject(new String(bArr, "UTF-8")));
                                fileInputStreamOpenFileInput.close();
                            } catch (FileNotFoundException | JSONException unused) {
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                                throw th;
                            }
                        } catch (FileNotFoundException | JSONException unused2) {
                            fileInputStreamOpenFileInput = null;
                        } catch (Throwable th3) {
                            fileInputStreamOpenFileInput = null;
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return configContainerA;
            default:
                return UnclosedAdDetector.m3246readUnclosedAdFromFile$lambda4((UnclosedAdDetector) this.f8597Y);
        }
    }
}
