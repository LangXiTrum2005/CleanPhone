package io.flutter.view;

import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f43506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f43507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f43508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f43509d;

    public k() throws NoSuchMethodException {
        Method method;
        Method method2;
        Method method3;
        Field field = null;
        try {
            method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", null);
        } catch (NoSuchMethodException unused) {
            Log.w("AccessibilityBridge", "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
            method = null;
        }
        try {
            method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", null);
        } catch (NoSuchMethodException unused2) {
            Log.w("AccessibilityBridge", "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
            method2 = null;
        }
        try {
            Field declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
            declaredField.setAccessible(true);
            field = declaredField;
            method3 = Class.forName("android.util.LongArray").getMethod("get", Integer.TYPE);
        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused3) {
            Log.w("AccessibilityBridge", "can't access childNodeIdsField with reflection");
            method3 = null;
        }
        this.f43506a = method;
        this.f43507b = method2;
        this.f43508c = field;
        this.f43509d = method3;
    }

    public static Long a(k kVar, AccessibilityRecord accessibilityRecord) {
        Method method = kVar.f43507b;
        if (method != null) {
            try {
                return (Long) method.invoke(accessibilityRecord, null);
            } catch (IllegalAccessException e10) {
                Log.w("AccessibilityBridge", "Failed to access the getRecordSourceNodeId method.", e10);
            } catch (InvocationTargetException e11) {
                Log.w("AccessibilityBridge", "The getRecordSourceNodeId method threw an exception when invoked.", e11);
            }
        }
        return null;
    }

    public static boolean b(int i10, long j10) {
        return (j10 & (1 << i10)) != 0;
    }
}
