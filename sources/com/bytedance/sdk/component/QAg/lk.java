package com.bytedance.sdk.component.QAg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.sLN;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends WebView {
    private boolean JXs;
    private final HashSet<String> LD;
    public long Lxb;
    private boolean ZU;
    private Lxb lc;
    private boolean lk;

    public lk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LD = new HashSet<>();
        this.Lxb = System.currentTimeMillis();
        Lxb();
    }

    private void LD() {
        if (this.lk) {
            return;
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        setOnClickListener(null);
        setOnTouchListener(null);
        Iterator<String> it = this.LD.iterator();
        while (it.hasNext()) {
            super.removeJavascriptInterface(it.next());
        }
    }

    private void Lxb() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        setWebViewClient(new ZU.Lxb());
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        toString();
        if (this.lk || this.JXs) {
            sLN.Lxb("TTAD.PangleWebView", "addJavascriptInterface: has destroyed or has recycler");
        } else {
            super.addJavascriptInterface(obj, str);
            this.LD.add(str);
        }
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z) {
        if (this.lk || this.JXs) {
            sLN.Lxb("TTAD.PangleWebView", "clearCache: has destroyed or recycler");
        } else {
            super.clearCache(z);
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        toString();
        if (this.lk) {
            return;
        }
        this.lk = true;
        LD();
        super.destroy();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.lk && !this.JXs) {
            super.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            sLN.Lxb("TTAD.PangleWebView", "evaluateJavascript: has destroyed or recycler, ".concat(String.valueOf(str)));
            valueCallback.onReceiveValue("");
        }
    }

    @Override // android.webkit.WebView
    public void goBack() {
        if (this.lk || this.JXs) {
            sLN.Lxb("TTAD.PangleWebView", "goBack: has destroyed or recycler");
        } else {
            super.goBack();
        }
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i) {
        if (this.lk || this.JXs) {
            sLN.Lxb("TTAD.PangleWebView", "goBackOrForward: has destroyed or recycler");
        } else {
            super.goBackOrForward(i);
        }
    }

    @Override // android.webkit.WebView
    public void goForward() {
        if (this.lk || this.JXs) {
            sLN.Lxb("TTAD.PangleWebView", "goForward: has destroyed or recycler");
        } else {
            super.goForward();
        }
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (this.lk || this.JXs) {
            sLN.Lxb("TTAD.PangleWebView", "loadDataWithBaseURL: has destroyed or recycler");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (this.lk || this.JXs) {
            sLN.Lxb("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
            sLN.Lxb("TTAD.PangleWebView", "loadUrl: ", e);
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        toString();
        if (this.ZU) {
            destroy();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.lk || this.JXs) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.lk || this.JXs) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.webkit.WebView
    public void onPause() {
        if (this.lk || this.JXs) {
            sLN.Lxb("TTAD.PangleWebView", "onPause: has destroyed or recycler");
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            sLN.Lxb("TTAD.PangleWebView", "onPause: ", e);
        }
    }

    @Override // android.webkit.WebView
    public void onResume() {
        if (this.lk || this.JXs) {
            sLN.Lxb("TTAD.PangleWebView", "onResume: has destroyed or recycler");
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            sLN.Lxb("TTAD.PangleWebView", "onResume: ", e);
        }
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        if (this.lk || this.JXs) {
            return;
        }
        super.pauseTimers();
    }

    @Override // android.webkit.WebView
    public void reload() {
        if (this.lk || this.JXs) {
            sLN.Lxb("TTAD.PangleWebView", "reload: has destroyed or recycler");
        } else {
            super.reload();
        }
    }

    @Override // android.webkit.WebView
    public void removeJavascriptInterface(String str) {
        if (this.lk || this.JXs) {
            return;
        }
        super.removeJavascriptInterface(str);
        this.LD.remove(str);
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        if (this.lk || this.JXs) {
            return;
        }
        super.resumeTimers();
    }

    public void setArbitrageTouchListener(Lxb lxb) {
        this.lc = lxb;
    }

    public void setDestroyOnDetached(boolean z) {
        this.ZU = z;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        Lxb lxb = this.lc;
        if (lxb == null) {
            super.setOnTouchListener(onTouchListener);
        } else {
            lxb.Lxb(onTouchListener);
            super.setOnTouchListener(this.lc);
        }
    }

    public void setRecycler(boolean z) {
        this.JXs = z;
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (this.lk || this.JXs) {
            sLN.Lxb("TTAD.PangleWebView", "stopLoading: has destroyed or recycler");
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            sLN.Lxb("TTAD.PangleWebView", "stopLoading: ", e);
        }
    }

    public lk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LD = new HashSet<>();
        this.Lxb = System.currentTimeMillis();
        Lxb();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (!this.lk && !this.JXs) {
            try {
                super.loadUrl(str, map);
                return;
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
                sLN.Lxb("TTAD.PangleWebView", "loadUrl: ", e);
                return;
            }
        }
        sLN.Lxb("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
    }
}
