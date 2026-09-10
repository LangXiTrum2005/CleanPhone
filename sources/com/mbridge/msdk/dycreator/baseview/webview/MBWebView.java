package com.mbridge.msdk.dycreator.baseview.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.baseview.webview.client.MBWebChromeClient;
import com.mbridge.msdk.dycreator.baseview.webview.client.MBWebViewClient;
import com.mbridge.msdk.dycreator.baseview.webview.communicator.WebCommunicator;
import com.mbridge.msdk.dycreator.baseview.webview.listener.WebViewEventListener;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBWebView extends WebView implements InterBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f33118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBWebViewClient f33119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MBWebChromeClient f33120d;
    public Map<String, String> dataMethodMap;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f33121e;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.webview.MBWebView$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33122a;

        static {
            int[] iArr = new int[c.values().length];
            f33122a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33122a[c.fadingEdge.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33122a[c.visibility.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33122a[c.background.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33122a[c.contentDescription.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33122a[c.tag.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33122a[c.padding.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33122a[c.paddingTop.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f33122a[c.paddingBottom.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f33122a[c.paddingLeft.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f33122a[c.paddingRight.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f33122a[c.paddingStart.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f33122a[c.paddingEnd.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f33122a[c.layout_width.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f33122a[c.layout_height.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public MBWebView(@NonNull Context context) {
        super(context);
        this.f33117a = "MBWebView";
        a();
    }

    private void a() {
        b();
        MBWebViewClient mBWebViewClient = new MBWebViewClient();
        this.f33119c = mBWebViewClient;
        setWebViewClient(mBWebViewClient);
        MBWebChromeClient mBWebChromeClient = new MBWebChromeClient();
        this.f33120d = mBWebChromeClient;
        setWebChromeClient(mBWebChromeClient);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void b() {
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setUserAgentString(settings.getUserAgentString() + " WindVane/3.0.2");
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setSafeBrowsingEnabled(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(0);
        settings.setDatabaseEnabled(true);
        String path = getContext().getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.f33121e) {
            return;
        }
        try {
            this.f33121e = true;
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            destroy();
        } catch (Throwable th2) {
            q0.b("MBWebView", th2.getMessage());
        }
    }

    @Override // android.widget.AbsoluteLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        if (attributeSet != null) {
            HashMap mapB = b.a().b();
            int attributeCount = attributeSet.getAttributeCount();
            for (int i10 = 0; i10 < attributeCount; i10++) {
                c cVar = (c) mapB.get(attributeSet.getAttributeName(i10));
                if (cVar != null) {
                    int i11 = AnonymousClass1.f33122a[cVar.ordinal()];
                    if (i11 == 14) {
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (attributeValue.startsWith("f") || attributeValue.startsWith("m")) {
                            layoutParams.width = -1;
                        } else if (attributeValue.startsWith("wrap")) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.width = b.a().a(attributeValue);
                        }
                    } else if (i11 == 15) {
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (attributeValue2.startsWith("f") || attributeValue2.startsWith("m")) {
                            layoutParams.height = -1;
                        } else if (attributeValue2.startsWith("wrap")) {
                            layoutParams.height = -2;
                        } else {
                            layoutParams.height = b.a().a(attributeValue2);
                        }
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.dataMethodMap;
        return map != null ? map.get("mbridgeData") : "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        return "";
    }

    public boolean isDestroyed() {
        return this.f33121e;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArrSplit;
        if (attributeSet == null) {
            return;
        }
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        int iA = 0;
        int iA2 = 0;
        int iA3 = 0;
        int iA4 = 0;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                switch (AnonymousClass1.f33122a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (attributeValue.startsWith("@+id/")) {
                            setId(attributeValue.substring(5).hashCode());
                        }
                        break;
                    case 2:
                        setHorizontalFadingEdgeEnabled(attributeSet.getAttributeBooleanValue(i10, false));
                        break;
                    case 3:
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue2)) {
                            if (attributeValue2.equals("invisible")) {
                                setVisibility(4);
                            } else if (attributeValue2.equalsIgnoreCase("gone")) {
                                setVisibility(8);
                            }
                        }
                        break;
                    case 4:
                        String attributeValue3 = attributeSet.getAttributeValue(i10);
                        if (attributeValue3.startsWith("#")) {
                            try {
                                strArrSplit = attributeValue3.split("-");
                            } catch (Exception unused) {
                                strArrSplit = null;
                            }
                            if (strArrSplit != null && strArrSplit.length <= 2) {
                                setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                            } else if (strArrSplit == null || strArrSplit.length != 3) {
                                setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                            } else {
                                try {
                                    GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArrSplit[2]), new int[]{Color.parseColor(strArrSplit[0]), Color.parseColor(strArrSplit[1])});
                                    gradientDrawable.setGradientType(0);
                                    setBackground(gradientDrawable);
                                } catch (Exception unused2) {
                                    setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                                }
                            }
                        } else {
                            if (attributeValue3.startsWith("@drawable/")) {
                                attributeValue3 = attributeValue3.substring(10);
                            }
                            setBackgroundResource(getResources().getIdentifier(attributeValue3, "drawable", getContext().getPackageName()));
                        }
                        break;
                    case 5:
                        String attributeValue4 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue4)) {
                            CharSequence charSequence = (String) com.mbridge.msdk.dycreator.utils.b.f33289a.get(attributeValue4.substring(8));
                            if (!TextUtils.isEmpty(charSequence)) {
                                setContentDescription(charSequence);
                            }
                        }
                        break;
                    case 6:
                        String attributeValue5 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue5)) {
                            String str = com.mbridge.msdk.dycreator.utils.b.f33289a.get(attributeValue5.substring(8));
                            if (!TextUtils.isEmpty(str)) {
                                setTag(str);
                            }
                        }
                        break;
                    case 7:
                        int iA5 = b.a().a(attributeSet.getAttributeValue(i10));
                        setPadding(iA5, iA5, iA5, iA5);
                        break;
                    case 8:
                        iA4 = b.a().a(attributeSet.getAttributeValue(i10));
                        setPadding(iA, iA4, iA2, iA3);
                        break;
                    case 9:
                        iA3 = b.a().a(attributeSet.getAttributeValue(i10));
                        setPadding(iA, iA4, iA2, iA3);
                        break;
                    case 10:
                        iA = b.a().a(attributeSet.getAttributeValue(i10));
                        setPadding(iA, iA4, iA2, iA3);
                        break;
                    case 11:
                        iA2 = b.a().a(attributeSet.getAttributeValue(i10));
                        setPadding(iA, iA4, iA2, iA3);
                        break;
                    case 12:
                        setPadding(b.a().a(attributeSet.getAttributeValue(i10)), iA4, iA2, iA3);
                        break;
                    case 13:
                        setPadding(iA, iA4, b.a().a(attributeSet.getAttributeValue(i10)), iA3);
                        break;
                }
            }
        }
    }

    public void setCommunicator(WebCommunicator webCommunicator) {
        MBWebChromeClient mBWebChromeClient = this.f33120d;
        if (mBWebChromeClient != null) {
            mBWebChromeClient.setCommunicator(webCommunicator);
        }
    }

    public void setWebViewEventListener(WebViewEventListener webViewEventListener) {
        MBWebViewClient mBWebViewClient = this.f33119c;
        if (mBWebViewClient != null) {
            mBWebViewClient.setWebViewEventListener(webViewEventListener);
        }
        MBWebChromeClient mBWebChromeClient = this.f33120d;
        if (mBWebChromeClient != null) {
            mBWebChromeClient.setWebViewEventListener(webViewEventListener);
        }
    }

    public MBWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33117a = "MBWebView";
        try {
            this.f33118b = com.mbridge.msdk.dycreator.utils.c.a(context, attributeSet);
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.utils.c.a(this.f33118b, this);
        } catch (Exception e10) {
            q0.b("MBWebView", e10.getMessage());
        }
        a();
    }

    public MBWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f33117a = "MBWebView";
        a();
    }

    public MBWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f33117a = "MBWebView";
        a();
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
    }
}
