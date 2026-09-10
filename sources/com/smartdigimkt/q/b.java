package com.smartdigimkt.q;

import com.smartdigimkt.x.d;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f37748l = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f37749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashSet<String> f37751c = new HashSet<>();
    private long d = System.currentTimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f37752e;
    private String f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f37753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37754i;
    private int j;

    public b(String str, String str2) {
        this.f37749a = str;
        a(str2);
    }

    public void a(boolean z2) {
        this.f37753h = z2;
    }

    public void b(boolean z2) {
        this.f37754i = z2;
    }

    public long c() {
        return this.d;
    }

    public int d() {
        return this.j;
    }

    public int e() {
        return this.f37750b;
    }

    public String f() {
        return this.f;
    }

    public String g() {
        return this.f37749a;
    }

    public int h() {
        return this.g;
    }

    public boolean i() {
        return this.f37753h;
    }

    public boolean j() {
        return this.f37754i;
    }

    public void a(int i2) {
        this.j = i2;
    }

    public void b(int i2) {
        this.g = i2;
    }

    public d a() {
        return this.f37752e;
    }

    public void b(String str) {
        this.f = str;
    }

    public void a(d dVar) {
        this.f37752e = dVar;
    }

    public HashSet<String> b() {
        return this.f37751c;
    }

    public void a(String str) {
        this.f37750b++;
        this.f37751c.add(str);
    }
}
