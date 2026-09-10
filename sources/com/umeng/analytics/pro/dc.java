package com.umeng.analytics.pro;

/* JADX INFO: loaded from: classes3.dex */
public final class dc extends dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f2556a;
    private int b;
    private int c;

    public dc() {
    }

    @Override // com.umeng.analytics.pro.dd
    public boolean a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.dd
    public void b() throws de {
    }

    @Override // com.umeng.analytics.pro.dd
    public void c() {
    }

    public void e() {
        this.f2556a = null;
    }

    @Override // com.umeng.analytics.pro.dd
    public byte[] f() {
        return this.f2556a;
    }

    @Override // com.umeng.analytics.pro.dd
    public int g() {
        return this.b;
    }

    @Override // com.umeng.analytics.pro.dd
    public int h() {
        return this.c - this.b;
    }

    public dc(byte[] bArr) {
        a(bArr);
    }

    public void a(byte[] bArr) {
        c(bArr, 0, bArr.length);
    }

    @Override // com.umeng.analytics.pro.dd
    public void b(byte[] bArr, int i, int i2) throws de {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    public void c(byte[] bArr, int i, int i2) {
        this.f2556a = bArr;
        this.b = i;
        this.c = i + i2;
    }

    @Override // com.umeng.analytics.pro.dd
    public int a(byte[] bArr, int i, int i2) throws de {
        int iH = h();
        if (i2 > iH) {
            i2 = iH;
        }
        if (i2 > 0) {
            System.arraycopy(this.f2556a, this.b, bArr, i, i2);
            a(i2);
        }
        return i2;
    }

    public dc(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    @Override // com.umeng.analytics.pro.dd
    public void a(int i) {
        this.b += i;
    }
}
