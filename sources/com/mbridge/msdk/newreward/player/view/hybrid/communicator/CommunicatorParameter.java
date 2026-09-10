package com.mbridge.msdk.newreward.player.view.hybrid.communicator;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
public class CommunicatorParameter {
    private String path;
    private String query;
    private String scheme;
    private String token;
    private WebView webView;

    public CommunicatorParameter() {
    }

    public String getPath() {
        return this.path;
    }

    public String getQuery() {
        return this.query;
    }

    public String getScheme() {
        return this.scheme;
    }

    public String getToken() {
        return this.token;
    }

    public WebView getWebView() {
        return this.webView;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public void setScheme(String str) {
        this.scheme = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setWebView(WebView webView) {
        this.webView = webView;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CommunicatorParameter{webView=");
        sb.append(this.webView);
        sb.append(", scheme='");
        sb.append(this.scheme);
        sb.append("', path='");
        sb.append(this.path);
        sb.append("', token='");
        sb.append(this.token);
        sb.append("', query='");
        return DM.m(sb, this.query, "'}");
    }

    public CommunicatorParameter(WebView webView, String str, String str2, String str3, String str4) {
        this.webView = webView;
        this.scheme = str;
        this.path = str2;
        this.token = str3;
        this.query = str4;
    }
}
