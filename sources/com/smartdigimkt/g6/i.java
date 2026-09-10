package com.smartdigimkt.g6;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.smartdigimkt.sdk.basead.webtemplet.WTWebView;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class i extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35488a = com.smartdigimkt.q8.i.f37957c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f35489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    WTWebView f35490c;
    g d;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35491a;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            f35491a = iArr;
            try {
                iArr[ConsoleMessage.MessageLevel.LOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35491a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35491a[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35491a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35491a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public i(WTWebView wTWebView) {
    }

    public void a(WTWebView wTWebView) {
        this.f35490c = wTWebView;
        this.d = new g(wTWebView);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || consoleMessage.messageLevel() == null) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i2 = a.f35491a[consoleMessage.messageLevel().ordinal()];
        if (i2 == 1 || i2 == 2 || i2 != 3) {
            Objects.toString(consoleMessage.messageLevel());
            consoleMessage.message();
        } else {
            Objects.toString(consoleMessage.messageLevel());
            consoleMessage.message();
        }
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (this.d == null) {
            return super.onConsoleMessage(consoleMessage);
        }
        String strMessage = consoleMessage.message();
        if (TextUtils.isEmpty(strMessage) || !strMessage.startsWith(h.f35485a) || !this.d.c(h.f35485a)) {
            return super.onConsoleMessage(consoleMessage);
        }
        this.d.a(strMessage);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i2) {
        super.onProgressChanged(webView, i2);
        c cVar = this.f35489b;
        if (cVar != null) {
            cVar.onProgressChanged(webView, i2);
        }
    }

    public void a(c cVar) {
        this.f35489b = cVar;
    }
}
