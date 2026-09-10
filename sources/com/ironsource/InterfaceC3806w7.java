package com.ironsource;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.w7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3806w7 {
    public static final String a = "uuidEnabled";

    /* JADX INFO: renamed from: com.ironsource.w7$a */
    public interface a {
        void a(Context context, long j);
    }

    int A(Context context);

    String B(Context context);

    File C(Context context);

    boolean D(Context context);

    int E(Context context);

    float F(Context context);

    String G(Context context);

    String H(Context context);

    List<ApplicationInfo> I(Context context);

    String J(Context context);

    boolean K(Context context);

    int L(Context context);

    String M(Context context);

    int N(Context context);

    long a();

    long a(String str);

    Long a(ActivityManager.MemoryInfo memoryInfo);

    String a(Context context);

    boolean a(Activity activity);

    int b();

    Boolean b(ActivityManager.MemoryInfo memoryInfo);

    boolean b(Context context);

    int c();

    Long c(ActivityManager.MemoryInfo memoryInfo);

    String c(Context context);

    String d();

    String d(Context context);

    int e();

    String e(Context context);

    String f();

    boolean f(Context context);

    long g();

    File g(Context context);

    long h();

    boolean h(Context context);

    String i();

    boolean i(Context context);

    String j(Context context);

    boolean j();

    int k();

    File k(Context context);

    int l(Context context);

    String l();

    int m();

    File m(Context context);

    String n(Context context);

    boolean n();

    int o();

    ActivityManager.MemoryInfo o(Context context);

    int p(Context context);

    boolean p();

    String q();

    boolean q(Context context);

    float r();

    long r(Context context);

    String s();

    String s(Context context);

    int t(Context context);

    String t();

    int u(Context context);

    String v(Context context);

    String w(Context context);

    boolean x(Context context);

    String y(Context context);

    String z(Context context);
}
