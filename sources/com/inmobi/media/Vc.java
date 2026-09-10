package com.inmobi.media;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Vc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Vc f23304a = new Vc();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f23305b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f23306c = "dir";

    public static final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f23306c = str;
    }

    @JvmStatic
    public static /* synthetic */ void b() {
    }

    @JvmStatic
    public static final String c() {
        return "10.8.7";
    }

    public static final String d() {
        return f23306c;
    }

    @JvmStatic
    public static /* synthetic */ void e() {
    }

    public static final String f() {
        return f23305b;
    }

    @JvmStatic
    public static /* synthetic */ void g() {
    }

    public static final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f23305b = str;
    }

    public static final String a() {
        return !TextUtils.isEmpty("") ? "pr-SAND-10.8.7-20250730-" : "pr-SAND-10.8.7-20250730";
    }

    public final boolean b(Context context) {
        Intrinsics.f(context, "context");
        ConcurrentHashMap concurrentHashMap = C6.f22734b;
        return B6.a(context, "sdk_version_store").f22735a.getBoolean("db_deletion_failed", false);
    }

    public final String a(Context context) {
        Intrinsics.f(context, "context");
        ConcurrentHashMap concurrentHashMap = C6.f22734b;
        return B6.a(context, "sdk_version_store").f22735a.getString(com.smartdigimkt.b0.a.s1, null);
    }

    public final void a(Context context, String str) {
        Intrinsics.f(context, "context");
        ConcurrentHashMap concurrentHashMap = C6.f22734b;
        C6.a(B6.a(context, "sdk_version_store"), com.smartdigimkt.b0.a.s1, str, false, 4, (Object) null);
    }

    public final void a(Context context, boolean z2) {
        Intrinsics.f(context, "context");
        ConcurrentHashMap concurrentHashMap = C6.f22734b;
        C6.a(B6.a(context, "sdk_version_store"), "db_deletion_failed", z2, false, 4, (Object) null);
    }
}
