package com.startapp.sdk.adsbase.consent;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.b7;
import com.startapp.sdk.internal.cc;
import com.startapp.sdk.internal.dc;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h6;
import com.startapp.sdk.internal.sk;
import com.startapp.sdk.internal.vi;
import com.vungle.ads.internal.Constants;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConsentActivity f40643a;

    public a(ConsentActivity consentActivity) {
        this.f40643a = consentActivity;
    }

    public final boolean a(Uri uri) {
        Integer numValueOf;
        String scheme = uri.getScheme();
        String host = uri.getHost();
        ConsentConfig consentConfigR = MetaData.E().r();
        if (scheme != null && scheme.equalsIgnoreCase("startappad") && !TextUtils.isEmpty(host) && consentConfigR != null) {
            if (host.equalsIgnoreCase("setconsent")) {
                String queryParameter = uri.getQueryParameter("status");
                String queryParameter2 = uri.getQueryParameter("apc");
                Boolean boolValueOf = null;
                try {
                    numValueOf = !TextUtils.isEmpty(queryParameter) ? Integer.valueOf(Integer.parseInt(queryParameter)) : null;
                } catch (NumberFormatException unused) {
                } catch (Throwable th) {
                    g9.a(th);
                }
                try {
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        boolValueOf = Boolean.valueOf(Boolean.parseBoolean(queryParameter2));
                    }
                } catch (Throwable th2) {
                    g9.a(th2);
                }
                ((h6) com.startapp.sdk.components.a.a(this.f40643a).j.a()).a(numValueOf, Long.valueOf(consentConfigR.j()), boolValueOf, true, true);
                return true;
            }
            if (host.equalsIgnoreCase("close")) {
                this.f40643a.f40642c = true;
                this.f40643a.finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Drawable drawableLoadIcon;
        String string;
        String string2;
        Bundle extras = this.f40643a.getIntent().getExtras();
        if (extras == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("javascript:var obj = {};");
        if (!TextUtils.isEmpty(str)) {
            android.support.v4.media.a.A(sb, "obj.template = '", str, "';");
        }
        if (extras.containsKey("allowCT")) {
            boolean z2 = extras.getBoolean("allowCT");
            sb.append("obj.allowCT = ");
            sb.append(z2);
            sb.append(";");
        }
        ConsentActivity consentActivity = this.f40643a;
        WeakHashMap weakHashMap = vi.f41589a;
        String str2 = null;
        try {
            PackageManager packageManager = consentActivity.getPackageManager();
            drawableLoadIcon = packageManager == null ? null : packageManager.getApplicationInfo(consentActivity.getPackageName(), 128).loadIcon(packageManager);
        } catch (Throwable th) {
            g9.a(th);
        }
        int iCharCount = 0;
        if (drawableLoadIcon != null) {
            try {
                float f = consentActivity.getResources().getDisplayMetrics().density;
                int i2 = (int) (48.0f * f);
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                    Drawable drawableMutate = drawableLoadIcon.mutate();
                    drawableMutate.setBounds(0, 0, i2, i2);
                    drawableMutate.draw(new Canvas(bitmapCreateBitmap));
                    b7 b7Var = new b7(i2 * i2);
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, b7Var);
                    str2 = new String(Base64.encode(b7Var.a(), 0, b7Var.b(), 2));
                } catch (OutOfMemoryError unused) {
                    int i3 = (int) (f * 24.0f);
                    try {
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_4444);
                        Drawable drawableMutate2 = drawableLoadIcon.mutate();
                        drawableMutate2.setBounds(0, 0, i3, i3);
                        drawableMutate2.draw(new Canvas(bitmapCreateBitmap2));
                        b7 b7Var2 = new b7(i3 * i3);
                        bitmapCreateBitmap2.compress(Bitmap.CompressFormat.PNG, 100, b7Var2);
                        str2 = new String(Base64.encode(b7Var2.a(), 0, b7Var2.b(), 2));
                    } catch (OutOfMemoryError unused2) {
                    }
                }
            } catch (Throwable th2) {
                g9.a(th2);
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            android.support.v4.media.a.A(sb, "obj.imageBase64 = '", str2, "';");
        }
        if (extras.containsKey("dParam")) {
            String string3 = extras.getString("dParam");
            if (!TextUtils.isEmpty(string3)) {
                android.support.v4.media.a.A(sb, "obj.dParam = '", string3, "';");
            }
        }
        if (extras.containsKey(Constants.CLICK_URL)) {
            String string4 = extras.getString(Constants.CLICK_URL);
            if (!TextUtils.isEmpty(string4)) {
                android.support.v4.media.a.A(sb, "obj.clickUrl = '", string4, "';");
            }
        }
        if (extras.containsKey("impressionUrl")) {
            String string5 = extras.getString("impressionUrl");
            if (!TextUtils.isEmpty(string5)) {
                android.support.v4.media.a.A(sb, "obj.impressionUrl = '", string5, "';");
            }
        }
        String str3 = ((cc) ((dc) com.startapp.sdk.components.a.a(this.f40643a).d.a()).b()).f40873c;
        if (!TextUtils.isEmpty(str3)) {
            android.support.v4.media.a.A(sb, "obj.locales = '", str3, "';");
        }
        if (extras.containsKey("timestamp")) {
            long j = extras.getLong("timestamp");
            sb.append("obj.timeStamp = ");
            sb.append(j);
            sb.append(";");
        }
        if (extras.containsKey("templateName")) {
            int i4 = extras.getInt("templateName");
            sb.append("obj.templateName = ");
            sb.append(i4);
            sb.append(";");
        }
        if (extras.containsKey("templateId")) {
            int i5 = extras.getInt("templateId");
            sb.append("obj.templateId = ");
            sb.append(i5);
            sb.append(";");
        }
        sb.append("obj.os = 'android';obj.consentTypeInfo = {};");
        if (extras.containsKey("impression")) {
            androidx.datastore.preferences.protobuf.a.A(sb, "obj.consentTypeInfo.impression = ", extras.getInt("impression"), ";");
        }
        if (extras.containsKey("trueClick")) {
            androidx.datastore.preferences.protobuf.a.A(sb, "obj.consentTypeInfo.trueClick = ", extras.getInt("trueClick"), ";");
        }
        if (extras.containsKey("falseClick")) {
            androidx.datastore.preferences.protobuf.a.A(sb, "obj.consentTypeInfo.falseClick = ", extras.getInt("falseClick"), ";");
        }
        sb.append("obj.infoForExternalLinks = {};");
        if (extras.containsKey("advertisingId")) {
            String string6 = extras.getString("advertisingId");
            sb.append("obj.infoForExternalLinks.advertisingId = '");
            sb.append(string6);
            sb.append("';");
        }
        if (extras.containsKey("consentType")) {
            int i6 = extras.getInt("consentType");
            sb.append("obj.infoForExternalLinks.consentType = ");
            sb.append(i6);
            sb.append(";");
        }
        if (extras.containsKey("erid") && (string2 = extras.getString("erid")) != null) {
            int length = string2.length();
            int iCharCount2 = 0;
            while (iCharCount2 < length) {
                int iCodePointAt = string2.codePointAt(iCharCount2);
                if (!Character.isWhitespace(iCodePointAt)) {
                    android.support.v4.media.a.A(sb, "obj.erid = '", string2, "';");
                    break;
                }
                iCharCount2 += Character.charCount(iCodePointAt);
            }
        }
        if (extras.containsKey("eridUrl") && (string = extras.getString("eridUrl")) != null) {
            int length2 = string.length();
            while (iCharCount < length2) {
                int iCodePointAt2 = string.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt2)) {
                    android.support.v4.media.a.A(sb, "obj.eridUrl = '", string, "';");
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt2);
            }
        }
        sb.append("startappInit(obj);");
        webView.loadUrl(sb.toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return a(webResourceRequest.getUrl());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(Uri.parse(str));
    }
}
