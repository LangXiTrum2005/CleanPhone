package com.smartdigimkt.k0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f36133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InputStream f36134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f36135c;
    private long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f36136e;
    private String f;
    private String g;

    public b(String str, byte[] bArr, long j, String str2, String str3) {
        this.g = "application/octet-stream";
        this.f36136e = str;
        this.f = str2;
        this.f36133a = bArr;
        this.d = j;
        if (str3 != null) {
            this.g = str3;
        }
    }

    public String b() {
        return this.g;
    }

    public byte[] c() {
        return this.f36133a;
    }

    public File d() {
        return this.f36135c;
    }

    public String e() {
        return this.f36136e;
    }

    public long f() {
        return this.d;
    }

    public InputStream g() {
        return this.f36134b;
    }

    public String h() {
        return this.f;
    }

    public void b(String str) {
        this.g = str;
    }

    public void c(String str) {
        this.f36136e = str;
    }

    public void d(String str) {
        this.f = str;
    }

    public b(String str, File file, String str2, String str3) {
        this.g = "application/octet-stream";
        this.f36136e = str;
        this.f = str2;
        try {
            this.f36134b = new FileInputStream(file);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        }
        this.d = file.length();
        if (str3 != null) {
            this.g = str3;
        }
        this.f36135c = file;
    }

    public b(InputStream inputStream, int i2, String str, String str2, String str3) {
        this.f36136e = str;
        this.f = str2;
        this.f36134b = inputStream;
        this.d = i2;
        this.g = str3;
    }
}
