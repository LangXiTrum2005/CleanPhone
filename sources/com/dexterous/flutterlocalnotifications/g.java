package com.dexterous.flutterlocalnotifications;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f10551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f10552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f10553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f10554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f10555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g[] f10556f;

    static {
        g gVar = new g("None", 0);
        f10551a = gVar;
        g gVar2 = new g("RequestingNotificationPermission", 1);
        f10552b = gVar2;
        g gVar3 = new g("RequestingNotificationPolicyAccess", 2);
        f10553c = gVar3;
        g gVar4 = new g("RequestingExactAlarmsPermission", 3);
        f10554d = gVar4;
        g gVar5 = new g("RequestingFullScreenIntentPermission", 4);
        f10555e = gVar5;
        f10556f = new g[]{gVar, gVar2, gVar3, gVar4, gVar5};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f10556f.clone();
    }
}
