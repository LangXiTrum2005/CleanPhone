package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class IronSourceQaProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static IronSourceQaProperties f30676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, String> f30677b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f30676a == null) {
            f30676a = new IronSourceQaProperties();
        }
        return f30676a;
    }

    public static boolean isInitialized() {
        return f30676a != null;
    }

    public Map<String, String> getParameters() {
        return f30677b;
    }

    public void setQaParameter(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        f30677b.put(str, str2);
    }
}
