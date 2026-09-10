package com.smartdigimkt.d8;

import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f34513c = 8;
    public static final int d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f34514e = 6;
    public static final int f = 2;
    public static final int g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f34515h = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f34516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f34517b;

    public interface a {
        void a(Object obj);

        void a(Throwable th);
    }

    public abstract int a();

    public void a(String str, String str2, String str3, int i2) {
    }

    public JSONObject b() {
        return com.smartdigimkt.w7.a.a(f());
    }

    public abstract byte[] c();

    public abstract int d();

    public JSONObject e() {
        return com.smartdigimkt.w7.a.b(f());
    }

    public int f() {
        return 0;
    }

    public com.smartdigimkt.f8.b g() {
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        if (aVarB != null) {
            return new com.smartdigimkt.f8.b(aVarB.v0(), aVarB.x0());
        }
        return null;
    }

    public abstract boolean h();

    public void a(int i2, String str) {
        this.f34516a = i2;
        this.f34517b = str;
    }

    public byte[] a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes("utf-8"));
            gZIPOutputStream.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public void a(a aVar) {
        d.a().a(this, aVar);
    }
}
