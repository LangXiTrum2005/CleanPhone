package com.startapp.sdk.internal;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

/* JADX INFO: loaded from: classes6.dex */
public final class sa extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        try {
            if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR && consoleMessage.message().contains("mraid")) {
                g9 g9Var = new g9(h9.f41040e);
                g9Var.d = "MraidMode.ConsoleError";
                g9Var.f41002e = consoleMessage.message();
                g9Var.a();
            }
        } catch (Throwable th) {
            g9.a(th);
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
