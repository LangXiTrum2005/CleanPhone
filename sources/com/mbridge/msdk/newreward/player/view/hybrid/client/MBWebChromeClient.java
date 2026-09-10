package com.mbridge.msdk.newreward.player.view.hybrid.client;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.newreward.player.view.hybrid.MBWebView;
import com.mbridge.msdk.newreward.player.view.hybrid.communicator.CommunicatorParameter;
import com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator;
import com.mbridge.msdk.newreward.player.view.hybrid.listener.WebViewEventListener;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MBHybridUtil;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class MBWebChromeClient extends WebChromeClient {
    private final String TAG = "MBWebChromeViewClient";
    private WebViewEventListener mEventListener;
    private HybridCommunicator mMBCommunicator;
    private MBWebView mWebView;

    private void findAndCallClassMethod(HybridCommunicator hybridCommunicator, CommunicatorParameter communicatorParameter) {
        if (hybridCommunicator == null) {
            return;
        }
        try {
            Method method = null;
            for (Method method2 : hybridCommunicator.getClass().getMethods()) {
                if (method2.getName().equals("callNotSupportMethod")) {
                    method = method2;
                }
                if (method2.getName().equals(communicatorParameter.getPath())) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    if (parameterTypes.length == 1 && parameterTypes[0].isInstance(communicatorParameter)) {
                        method2.invoke(hybridCommunicator, communicatorParameter);
                        return;
                    }
                }
            }
            if (method != null) {
                method.invoke(hybridCommunicator, communicatorParameter);
            }
        } catch (Throwable th) {
            o0.b("MBWebChromeViewClient", th.getMessage());
        }
    }

    private String getUriToken(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            String[] strArrSplit = str.split(":");
            if (!TextUtils.isEmpty(strArrSplit[2])) {
                String[] strArrSplit2 = strArrSplit[2].split("/");
                if (!TextUtils.isEmpty(strArrSplit2[0])) {
                    return strArrSplit2[0];
                }
            }
        } catch (Throwable th) {
            o0.b("MBWebChromeViewClient", th.getMessage());
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    private boolean onReceiveMessage(String str) {
        String str2;
        try {
            if (!str.startsWith("mv:")) {
                if (str.startsWith("mraid:")) {
                }
                return false;
            }
            if (str.contains("wv_hybrid:")) {
                str = str.substring(0, str.lastIndexOf(" ") + 1);
            }
            o0.a("MBWebChromeViewClient", "onConsoleMessage: message.length() = " + str.length() + " " + str);
            if (!TextUtils.isEmpty(str)) {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                String uriToken = getUriToken(str);
                String lastPathSegment = uri.getLastPathSegment();
                if (scheme != null && scheme.equals(CampaignEx.JSON_KEY_MRAID)) {
                    lastPathSegment = uri.getHost();
                }
                String str3 = lastPathSegment;
                String encodedQuery = uri.getEncodedQuery();
                if (!TextUtils.isEmpty(scheme) && !TextUtils.isEmpty(str3)) {
                    if (Objects.equals(scheme, CampaignEx.JSON_KEY_MRAID)) {
                        String queryParameters = MBHybridUtil.getQueryParameters(uri);
                        if (TextUtils.isEmpty(queryParameters)) {
                            str2 = encodedQuery;
                        } else {
                            str2 = queryParameters;
                        }
                    } else {
                        str2 = encodedQuery;
                    }
                    CommunicatorParameter communicatorParameter = new CommunicatorParameter(this.mWebView, scheme, str3, uriToken, str2);
                    HybridCommunicator hybridCommunicator = this.mMBCommunicator;
                    if (hybridCommunicator != null) {
                        findAndCallClassMethod(hybridCommunicator, communicatorParameter);
                    }
                }
                return false;
            }
            return true;
        } catch (Throwable th) {
            o0.b("MBWebChromeViewClient", th.getMessage());
        }
    }

    public HybridCommunicator getHybridCommunicator() {
        return this.mMBCommunicator;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (TextUtils.isEmpty(consoleMessage.message()) || !onReceiveMessage(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (TextUtils.isEmpty(str2) || !onReceiveMessage(str2)) {
            return false;
        }
        jsPromptResult.confirm("");
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        WebViewEventListener webViewEventListener = this.mEventListener;
        if (webViewEventListener != null) {
            webViewEventListener.onProgressChanged(webView, i);
        }
    }

    public void setHybridCommunicator(HybridCommunicator hybridCommunicator) {
        this.mMBCommunicator = hybridCommunicator;
    }

    public void setWeView(MBWebView mBWebView) {
        this.mWebView = mBWebView;
    }

    public void setWebViewEventListener(WebViewEventListener webViewEventListener) {
        this.mEventListener = webViewEventListener;
    }
}
