package com.p004ironsource;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f27507a = "uuidEnabled";

    public interface a {
        void a(Context context, long j);
    }

    int A(Context context);

    int B(Context context);

    int C(Context context);

    String D(Context context);

    boolean E(Context context);

    String F(Context context);

    String G(Context context);

    int H(Context context);

    String I(Context context);

    boolean J(Context context);

    String K(Context context);

    int L(Context context);

    String M(Context context);

    int N(Context context);

    int a();

    long a(String str);

    Long a(ActivityManager.MemoryInfo memoryInfo);

    String a(Context context);

    boolean a(Activity activity);

    Boolean b(ActivityManager.MemoryInfo memoryInfo);

    String b();

    String b(Context context);

    Long c(ActivityManager.MemoryInfo memoryInfo);

    boolean c();

    boolean c(Context context);

    int d();

    boolean d(Context context);

    File e(Context context);

    String e();

    String f(Context context);

    boolean f();

    String g();

    boolean g(Context context);

    float h();

    long h(Context context);

    String i();

    String i(Context context);

    long j();

    String j(Context context);

    int k();

    File k(Context context);

    int l();

    int l(Context context);

    float m(Context context);

    String m();

    long n();

    String n(Context context);

    long o();

    List<ApplicationInfo> o(Context context);

    String p();

    String p(Context context);

    int q();

    boolean q(Context context);

    String r(Context context);

    boolean r();

    int s();

    boolean s(Context context);

    String t();

    String t(Context context);

    File u(Context context);

    boolean v(Context context);

    String w(Context context);

    File x(Context context);

    int y(Context context);

    ActivityManager.MemoryInfo z(Context context);
}
