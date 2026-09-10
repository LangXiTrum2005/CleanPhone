package com.bytedance.sdk.component.ri;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class jbs {
    boolean aw;
    boolean di;
    Context fi;
    co jbs;
    xha ka;
    ri lr;
    sf mj;
    WebView ri;
    boolean xha;
    String ik = "IESJSBridge";
    String qt = "host";
    final Set<String> sf = new LinkedHashSet();

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    final Set<String> f18058co = new LinkedHashSet();

    public jbs(WebView webView) {
        this.ri = webView;
    }

    public jbs lr(boolean z) {
        this.xha = z;
        return this;
    }

    public jbs ri(ri riVar) {
        this.lr = riVar;
        return this;
    }

    private void lr() {
        if ((this.ri == null && !this.aw && this.lr == null) || ((TextUtils.isEmpty(this.ik) && this.ri != null) || this.ka == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }

    public jbs ri(String str) {
        this.ik = str;
        return this;
    }

    public jbs ri(qt qtVar) {
        this.ka = xha.ri(qtVar);
        return this;
    }

    public jbs ri(boolean z) {
        this.di = z;
        return this;
    }

    public vr ri() {
        lr();
        return new vr(this);
    }

    public jbs() {
    }
}
