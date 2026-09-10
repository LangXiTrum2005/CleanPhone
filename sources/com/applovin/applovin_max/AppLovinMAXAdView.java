package com.applovin.applovin_max;

import a4.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.ads.MaxAdView;
import io.flutter.plugin.platform.d;
import java.util.HashMap;
import java.util.Map;
import xi.f;
import xi.m;
import xi.o;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinMAXAdView implements d {
    private final int adViewId;
    private final p channel;

    @Nullable
    private AppLovinMAXAdViewWidget widget;
    private static final Map<Integer, AppLovinMAXAdViewWidget> widgetInstances = new HashMap(2);
    private static final Map<Integer, AppLovinMAXAdViewWidget> preloadedWidgetInstances = new HashMap(2);

    public AppLovinMAXAdView(int i10, String str, int i11, MaxAdFormat maxAdFormat, boolean z10, boolean z11, @Nullable String str2, @Nullable String str3, @Nullable Map<String, Object> map, @Nullable Map<String, Object> map2, f fVar, Context context) {
        p pVar = new p(fVar, l1.d.e(i10, "applovin_max/adview_"));
        this.channel = pVar;
        pVar.b(new a(this, 9));
        AppLovinMAXAdViewWidget appLovinMAXAdViewWidget = preloadedWidgetInstances.get(Integer.valueOf(i11));
        this.widget = appLovinMAXAdViewWidget;
        if (appLovinMAXAdViewWidget != null && !appLovinMAXAdViewWidget.hasContainerView()) {
            AppLovinMAX.d("Mounting the preloaded AdView (" + i11 + ") for Ad Unit ID " + str);
            this.adViewId = i11;
            this.widget.setAutoRefreshEnabled(z11);
            this.widget.attachAdView(this);
            return;
        }
        AppLovinMAXAdViewWidget appLovinMAXAdViewWidget2 = new AppLovinMAXAdViewWidget(str, maxAdFormat, z10, context);
        this.widget = appLovinMAXAdViewWidget2;
        int iHashCode = appLovinMAXAdViewWidget2.hashCode();
        this.adViewId = iHashCode;
        widgetInstances.put(Integer.valueOf(iHashCode), this.widget);
        AppLovinMAX.d("Mounting a new AdView (" + iHashCode + ") for Ad Unit ID " + str);
        this.widget.setPlacement(str2);
        this.widget.setCustomData(str3);
        this.widget.setExtraParameters(map);
        this.widget.setLocalExtraParameters(map2);
        this.widget.setAutoRefreshEnabled(z11);
        this.widget.attachAdView(this);
        this.widget.loadAd();
    }

    public static void destroyWidgetAdView(int i10, o oVar) {
        Map<Integer, AppLovinMAXAdViewWidget> map = preloadedWidgetInstances;
        AppLovinMAXAdViewWidget appLovinMAXAdViewWidget = map.get(Integer.valueOf(i10));
        if (appLovinMAXAdViewWidget == null) {
            oVar.b(AppLovinMAX.TAG, "No preloaded AdView found to destroy", null);
            return;
        }
        if (appLovinMAXAdViewWidget.hasContainerView()) {
            oVar.b(AppLovinMAX.TAG, "Cannot destroy - the preloaded AdView is currently in use", null);
            return;
        }
        map.remove(Integer.valueOf(i10));
        appLovinMAXAdViewWidget.detachAdView();
        appLovinMAXAdViewWidget.destroy();
        oVar.a(null);
    }

    @Nullable
    public static MaxAdView getInstance(String str) {
        for (Map.Entry<Integer, AppLovinMAXAdViewWidget> entry : preloadedWidgetInstances.entrySet()) {
            if (entry.getValue().getAdUnitId().equals(str)) {
                return entry.getValue().getAdView();
            }
        }
        for (Map.Entry<Integer, AppLovinMAXAdViewWidget> entry2 : widgetInstances.entrySet()) {
            if (entry2.getValue().getAdUnitId().equals(str)) {
                return entry2.getValue().getAdView();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(m mVar, o oVar) {
        if ("startAutoRefresh".equals(mVar.f53822a)) {
            this.widget.setAutoRefreshEnabled(true);
            oVar.a(null);
        } else if (!"stopAutoRefresh".equals(mVar.f53822a)) {
            oVar.c();
        } else {
            this.widget.setAutoRefreshEnabled(false);
            oVar.a(null);
        }
    }

    public static void preloadWidgetAdView(String str, MaxAdFormat maxAdFormat, boolean z10, @Nullable String str2, @Nullable String str3, @Nullable Map<String, Object> map, @Nullable Map<String, Object> map2, o oVar, Context context) {
        AppLovinMAXAdViewWidget appLovinMAXAdViewWidget = new AppLovinMAXAdViewWidget(str, maxAdFormat, z10, true, context);
        preloadedWidgetInstances.put(Integer.valueOf(appLovinMAXAdViewWidget.hashCode()), appLovinMAXAdViewWidget);
        appLovinMAXAdViewWidget.setPlacement(str2);
        appLovinMAXAdViewWidget.setCustomData(str3);
        appLovinMAXAdViewWidget.setExtraParameters(map);
        appLovinMAXAdViewWidget.setLocalExtraParameters(map2);
        appLovinMAXAdViewWidget.loadAd();
        oVar.a(Integer.valueOf(appLovinMAXAdViewWidget.hashCode()));
    }

    @Override // io.flutter.plugin.platform.d
    public void dispose() {
        AppLovinMAXAdViewWidget appLovinMAXAdViewWidget = this.widget;
        if (appLovinMAXAdViewWidget != null) {
            appLovinMAXAdViewWidget.detachAdView();
            if (this.widget == preloadedWidgetInstances.get(Integer.valueOf(this.adViewId))) {
                AppLovinMAX.d("Unmounting the preloaded AdView (" + this.adViewId + ") for Ad Unit ID " + this.widget.getAdUnitId());
                this.widget.setAutoRefreshEnabled(false);
            } else {
                AppLovinMAX.d("Unmounting the AdView (" + this.adViewId + ") to destroy for Ad Unit ID " + this.widget.getAdUnitId());
                widgetInstances.remove(Integer.valueOf(this.adViewId));
                this.widget.destroy();
            }
        }
        p pVar = this.channel;
        if (pVar != null) {
            pVar.b(null);
        }
    }

    @Override // io.flutter.plugin.platform.d
    @Nullable
    public View getView() {
        return this.widget;
    }

    public void sendEvent(String str, Map<String, Object> map) {
        AppLovinMAX.getInstance().fireCallback(str, map, this.channel);
    }

    @Override // io.flutter.plugin.platform.d
    public void onFlutterViewDetached() {
    }

    @Override // io.flutter.plugin.platform.d
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onInputConnectionLocked() {
    }

    @Override // io.flutter.plugin.platform.d
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onInputConnectionUnlocked() {
    }

    @Override // io.flutter.plugin.platform.d
    public void onFlutterViewAttached(@NonNull View view) {
    }
}
