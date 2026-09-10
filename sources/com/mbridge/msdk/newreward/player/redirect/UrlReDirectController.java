package com.mbridge.msdk.newreward.player.redirect;

import com.badlogic.gdx.net.HttpResponseHeader;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.same.task.b;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.newreward.function.command.c;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class UrlReDirectController {
    private c commandManager;
    private b mLoader;

    /* JADX INFO: renamed from: com.mbridge.msdk.newreward.player.redirect.UrlReDirectController$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$mbridge$msdk$newreward$player$redirect$RedirectType;

        static {
            int[] iArr = new int[RedirectType.values().length];
            $SwitchMap$com$mbridge$msdk$newreward$player$redirect$RedirectType = iArr;
            try {
                iArr[RedirectType.CLICK_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$mbridge$msdk$newreward$player$redirect$RedirectType[RedirectType.NOTICE_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public UrlReDirectController() {
        this.mLoader = null;
        this.mLoader = new b(com.mbridge.msdk.foundation.controller.c.n().d());
    }

    private void reDirect(final String str) {
        this.mLoader.a(new a() { // from class: com.mbridge.msdk.newreward.player.redirect.UrlReDirectController.1
            @Override // com.mbridge.msdk.foundation.same.task.a
            public void cancelTask() {
            }

            @Override // com.mbridge.msdk.foundation.same.task.a
            public void pauseTask(boolean z) {
            }

            @Override // com.mbridge.msdk.foundation.same.task.a
            public void runTask() throws Throwable {
                UrlReDirectController.this.realDoDirectUrl(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void realDoDirectUrl(String str) throws Throwable {
        HttpsURLConnection httpsURLConnection;
        HttpsURLConnection httpsURLConnection2 = null;
        try {
            httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
            try {
                httpsURLConnection.setHostnameVerifier(new MBridgeHostnameVerifier(str));
                httpsURLConnection.setInstanceFollowRedirects(false);
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setRequestProperty("User-Agent", k0.i());
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 302 || responseCode == 301) {
                    String headerField = httpsURLConnection.getHeaderField(HttpResponseHeader.Location);
                    if (headerField.startsWith("market:")) {
                        com.mbridge.msdk.click.c.b(com.mbridge.msdk.foundation.controller.c.n().d(), headerField);
                    } else {
                        httpsURLConnection.disconnect();
                        realDoDirectUrl(headerField);
                    }
                }
            } catch (Exception unused) {
                httpsURLConnection2 = httpsURLConnection;
                if (httpsURLConnection2 == null) {
                    return;
                } else {
                    httpsURLConnection = httpsURLConnection2;
                }
            } catch (Throwable th) {
                th = th;
                httpsURLConnection2 = httpsURLConnection;
                if (httpsURLConnection2 != null) {
                    httpsURLConnection2.disconnect();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        httpsURLConnection.disconnect();
    }

    public void doReDirect(RedirectModel redirectModel) {
        int i = AnonymousClass2.$SwitchMap$com$mbridge$msdk$newreward$player$redirect$RedirectType[redirectModel.getRedirectType().ordinal()];
        if (i == 1) {
            reDirect(null);
        } else {
            if (i != 2) {
                return;
            }
            reDirect(null);
        }
    }

    public c getCommandManager() {
        return this.commandManager;
    }

    public void setCommandManager(c cVar) {
        this.commandManager = cVar;
    }
}
