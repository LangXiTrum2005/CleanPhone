package com.facebook.internal;

import android.net.Uri;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/internal/FetchedAppSettings;", "", "Companion", "DialogFeatureConfig", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FetchedAppSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16296c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumSet f16297e;
    public final HashMap f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FacebookRequestErrorClassification f16298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f16299i;
    public final boolean j;
    public final JSONArray k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f16300l;
    public final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f16301n;
    public final String o;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/FetchedAppSettings$Companion;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static DialogFeatureConfig a(String str, String actionName, String featureName) {
            FetchedAppSettings fetchedAppSettingsB;
            Map map;
            Intrinsics.f(actionName, "actionName");
            Intrinsics.f(featureName, "featureName");
            if (Utility.C(actionName) || Utility.C(featureName) || (fetchedAppSettingsB = FetchedAppSettingsManager.b(str)) == null || (map = (Map) fetchedAppSettingsB.f.get(actionName)) == null) {
                return null;
            }
            return (DialogFeatureConfig) map.get(featureName);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class DialogFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f16302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f16303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f16304c;
        public final int[] d;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig$Companion;", "", "", "DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR", "Ljava/lang/String;", "DIALOG_CONFIG_NAME_KEY", "DIALOG_CONFIG_URL_KEY", "DIALOG_CONFIG_VERSIONS_KEY", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
        }

        public DialogFeatureConfig(String str, String str2, Uri uri, int[] iArr) {
            this.f16302a = str;
            this.f16303b = str2;
            this.f16304c = uri;
            this.d = iArr;
        }
    }

    public FetchedAppSettings(boolean z2, String str, boolean z3, int i2, EnumSet enumSet, HashMap map, boolean z4, FacebookRequestErrorClassification facebookRequestErrorClassification, String str2, String str3, boolean z5, boolean z6, JSONArray jSONArray, String str4, String str5, String str6, String str7) {
        this.f16294a = z2;
        this.f16295b = str;
        this.f16296c = z3;
        this.d = i2;
        this.f16297e = enumSet;
        this.f = map;
        this.g = z4;
        this.f16298h = facebookRequestErrorClassification;
        this.f16299i = z5;
        this.j = z6;
        this.k = jSONArray;
        this.f16300l = str4;
        this.m = str5;
        this.f16301n = str6;
        this.o = str7;
    }
}
