package com.bytedance.sdk.component.jbs;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class fi extends WebView {
    private ik di;
    private boolean fi;
    private boolean ik;
    private boolean ka;
    private final HashSet<String> lr;
    public long ri;

    public fi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.lr = new HashSet<>();
        this.ri = System.currentTimeMillis();
        lr();
    }

    private void lr() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        setWebViewClient(new di.ri());
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        toString();
        if (this.ik || this.fi) {
            return;
        }
        super.addJavascriptInterface(obj, str);
        this.lr.add(str);
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z) {
        if (this.ik || this.fi) {
            return;
        }
        super.clearCache(z);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        toString();
        if (this.ik) {
            return;
        }
        this.ik = true;
        ri();
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        super.destroy();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.ik && !this.fi) {
            super.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue("");
        }
    }

    @Override // android.webkit.WebView
    public void goBack() {
        if (this.ik || this.fi) {
            return;
        }
        super.goBack();
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i) {
        if (this.ik || this.fi) {
            return;
        }
        super.goBackOrForward(i);
    }

    @Override // android.webkit.WebView
    public void goForward() {
        if (this.ik || this.fi) {
            return;
        }
        super.goForward();
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (this.ik || this.fi) {
            return;
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (this.ik || this.fi) {
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError unused) {
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
        if (this.ka) {
            destroy();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.ik || this.fi) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.ik || this.fi) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.webkit.WebView
    public void onPause() {
        if (this.ik || this.fi) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void onResume() {
        if (this.ik || this.fi) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        if (this.ik || this.fi) {
            return;
        }
        super.pauseTimers();
    }

    @Override // android.webkit.WebView
    public void reload() {
        if (this.ik || this.fi) {
            return;
        }
        super.reload();
    }

    @Override // android.webkit.WebView
    public void removeJavascriptInterface(String str) {
        if (this.ik || this.fi) {
            return;
        }
        super.removeJavascriptInterface(str);
        this.lr.remove(str);
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        if (this.ik || this.fi) {
            return;
        }
        super.resumeTimers();
    }

    public void ri() {
        if (this.ik) {
            return;
        }
        setOnClickListener(null);
        setOnTouchListener(null);
        setOnScrollChangeListener(null);
        Iterator<String> it = this.lr.iterator();
        while (it.hasNext()) {
            super.removeJavascriptInterface(it.next());
        }
        this.lr.clear();
    }

    public void setDestroyOnDetached(boolean z) {
        this.ka = z;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        ik ikVar = this.di;
        if (ikVar == null) {
            super.setOnTouchListener(onTouchListener);
        } else {
            ikVar.ri(onTouchListener);
            super.setOnTouchListener(this.di);
        }
    }

    public void setRecycler(boolean z) {
        this.fi = z;
    }

    public void setTouchListenerProxy(ik ikVar) {
        this.di = ikVar;
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (this.ik || this.fi) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (this.ik || this.fi) {
            return;
        }
        try {
            super.loadUrl(str, map);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError unused) {
        }
    }

    public fi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lr = new HashSet<>();
        this.ri = System.currentTimeMillis();
        lr();
    }
}
