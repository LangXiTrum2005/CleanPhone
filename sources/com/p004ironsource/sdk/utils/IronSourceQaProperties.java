package com.p004ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class IronSourceQaProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static IronSourceQaProperties f27157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, String> f27158b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f27157a == null) {
            f27157a = new IronSourceQaProperties();
        }
        return f27157a;
    }

    public static boolean isInitialized() {
        return f27157a != null;
    }

    public Map<String, String> getParameters() {
        return f27158b;
    }

    public void setQaParameter(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        f27158b.put(str, str2);
    }
}
