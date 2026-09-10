package com.umeng.analytics.pro;

/* JADX INFO: loaded from: classes3.dex */
public class bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short[] f2521a;
    private int b = -1;

    public bo(int i) {
        this.f2521a = new short[i];
    }

    private void d() {
        short[] sArr = this.f2521a;
        short[] sArr2 = new short[sArr.length * 2];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        this.f2521a = sArr2;
    }

    public short a() {
        short[] sArr = this.f2521a;
        int i = this.b;
        this.b = i - 1;
        return sArr[i];
    }

    public short b() {
        return this.f2521a[this.b];
    }

    public void c() {
        this.b = -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<ShortStack vector:[");
        for (int i = 0; i < this.f2521a.length; i++) {
            if (i != 0) {
                sb.append(" ");
            }
            if (i == this.b) {
                sb.append(">>");
            }
            sb.append((int) this.f2521a[i]);
            if (i == this.b) {
                sb.append("<<");
            }
        }
        sb.append("]>");
        return sb.toString();
    }

    public void a(short s) {
        if (this.f2521a.length == this.b + 1) {
            d();
        }
        short[] sArr = this.f2521a;
        int i = this.b + 1;
        this.b = i;
        sArr[i] = s;
    }
}
