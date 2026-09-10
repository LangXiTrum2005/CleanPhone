package com.inmobi.media;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class P9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f23071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f23072c;
    public I9 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23073e;
    public Map f;

    public final String a() {
        String str = this.f23070a;
        if (str != null) {
            return str;
        }
        String strA = J9.a(this.f23071b);
        this.f23070a = strA;
        return strA;
    }

    public final boolean b() {
        return this.d != null;
    }
}
