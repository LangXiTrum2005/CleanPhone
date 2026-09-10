package com.mbridge.msdk.config.component.load.downloader;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f32103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f32106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32107e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f32108f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f32109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f32110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f32111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f32112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f32113k;
    private String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f32114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f32115n;

    public b(Object obj, String str, String str2, String str3, int i10) {
        this.f32103a = obj;
        this.f32109g = str3;
        this.f32104b = i10;
        this.f32105c = str;
        this.f32113k = str2;
        try {
            if (TextUtils.isEmpty(str2)) {
                URL url = new URL(str);
                this.f32113k = url.getProtocol() + "://" + url.getHost() + url.getPath();
            }
        } catch (MalformedURLException e10) {
            q0.b("DownloadMessage", e10.getMessage(), e10);
        }
    }

    public void a(String str, Object obj) {
        if (this.f32106d == null) {
            this.f32106d = new HashMap(4);
        }
        this.f32106d.put(str, obj);
    }

    public void b(int i10) {
        this.f32104b = i10;
    }

    public long c() {
        return this.f32111i;
    }

    public int d() {
        return this.f32112j;
    }

    public int e() {
        return this.f32104b;
    }

    public String f() {
        return this.f32105c;
    }

    public long g() {
        return this.f32114m;
    }

    public String h() {
        return this.f32109g;
    }

    public long i() {
        return this.f32115n;
    }

    public String j() {
        return this.f32108f;
    }

    public boolean k() {
        return this.f32110h;
    }

    public void b(String str) {
        this.f32108f = str;
    }

    public void c(long j10) {
        this.f32115n = j10;
    }

    public String b() {
        return this.f32113k;
    }

    public void a(boolean z10) {
        this.f32110h = z10;
    }

    public void b(long j10) {
        this.f32114m = j10;
    }

    public void a(long j10) {
        this.f32111i = j10;
    }

    public void a(int i10) {
        this.f32112j = i10;
    }

    public String a() {
        return this.l;
    }

    public void a(String str) {
        this.l = str;
    }
}
