package com.smartdigimkt.d8;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public class b extends c {
    String j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f34512l;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f34511i = getClass().getSimpleName();
    boolean k = true;

    public b(String str, int i2) {
        this.f34512l = 8;
        this.j = str;
        if (i2 == 1000) {
            this.f34512l = 8;
        } else if (i2 == 1001) {
            this.f34512l = 2;
        }
    }

    @Override // com.smartdigimkt.d8.c
    public void a(String str, String str2, String str3, int i2) {
    }

    @Override // com.smartdigimkt.d8.c
    public byte[] c() {
        return !TextUtils.isEmpty(this.j) ? a(this.j) : new byte[0];
    }

    @Override // com.smartdigimkt.d8.c
    public int d() {
        return 3;
    }

    @Override // com.smartdigimkt.d8.c
    public boolean h() {
        return this.k;
    }

    @Override // com.smartdigimkt.d8.c
    public int a() {
        return this.f34512l;
    }
}
