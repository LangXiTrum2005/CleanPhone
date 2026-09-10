package com.pgl.ssdk;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AccessibilityManager f33486a;

    private static AccessibilityManager a(Context context) {
        if (f33486a == null) {
            f33486a = (AccessibilityManager) context.getSystemService("accessibility");
        }
        return f33486a;
    }

    public static String b(Context context) {
        AccessibilityManager accessibilityManagerA;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        if (context == null || (accessibilityManagerA = a(context)) == null || (enabledAccessibilityServiceList = accessibilityManagerA.getEnabledAccessibilityServiceList(-1)) == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < enabledAccessibilityServiceList.size(); i2++) {
            AccessibilityServiceInfo accessibilityServiceInfo = enabledAccessibilityServiceList.get(i2);
            if (accessibilityServiceInfo != null) {
                sb.append(accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName + "#" + accessibilityServiceInfo.getResolveInfo().serviceInfo.name);
                if (i2 != enabledAccessibilityServiceList.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }
}
