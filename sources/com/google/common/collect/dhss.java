package com.google.common.collect;

import java.util.Arrays;

/* JADX INFO: compiled from: ObjectCountLinkedHashMap.java */
/* JADX INFO: loaded from: classes3.dex */
public class dhss<K> extends outmarry<K> {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public transient int f21903apical;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public transient int f21904cutely;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public transient long[] f21905taiyuan;

    public dhss(int i) {
        this(i, 1.0f);
    }

    @Override // com.google.common.collect.outmarry
    public void arytenoidectomy(int i) {
        int iTrm = trm() - 1;
        supplicat(yemenite(i), sealless(i));
        if (i < iTrm) {
            supplicat(yemenite(iTrm), i);
            supplicat(i, sealless(iTrm));
        }
        super.arytenoidectomy(i);
    }

    @Override // com.google.common.collect.outmarry
    public void attabal() {
        super.attabal();
        this.f21904cutely = -2;
        this.f21903apical = -2;
    }

    @Override // com.google.common.collect.outmarry
    public int graveside(int i, int i2) {
        return i == trm() ? i2 : i;
    }

    public final void kattegat(int i, int i2) {
        long[] jArr = this.f21905taiyuan;
        jArr[i] = (jArr[i] & 4294967295L) | (((long) i2) << 32);
    }

    @Override // com.google.common.collect.outmarry
    public void kowloon(int i, K k, int i2, int i3) {
        super.kowloon(i, k, i2, i3);
        supplicat(this.f21903apical, i);
        supplicat(i, -2);
    }

    @Override // com.google.common.collect.outmarry
    public int marial() {
        int i = this.f21904cutely;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    @Override // com.google.common.collect.outmarry
    public int molybdenite(int i) {
        int iSealless = sealless(i);
        if (iSealless == -2) {
            return -1;
        }
        return iSealless;
    }

    @Override // com.google.common.collect.outmarry
    public void preprohormone(int i) {
        super.preprohormone(i);
        long[] jArr = this.f21905taiyuan;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        this.f21905taiyuan = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i, -1L);
    }

    public final void restrictive(int i, int i2) {
        long[] jArr = this.f21905taiyuan;
        jArr[i] = (jArr[i] & (-4294967296L)) | (((long) i2) & 4294967295L);
    }

    public final int sealless(int i) {
        return (int) this.f21905taiyuan[i];
    }

    public final void supplicat(int i, int i2) {
        if (i == -2) {
            this.f21904cutely = i2;
        } else {
            restrictive(i, i2);
        }
        if (i2 == -2) {
            this.f21903apical = i;
        } else {
            kattegat(i2, i);
        }
    }

    @Override // com.google.common.collect.outmarry
    public void triweekly(int i, float f) {
        super.triweekly(i, f);
        this.f21904cutely = -2;
        this.f21903apical = -2;
        long[] jArr = new long[i];
        this.f21905taiyuan = jArr;
        Arrays.fill(jArr, -1L);
    }

    public final int yemenite(int i) {
        return (int) (this.f21905taiyuan[i] >>> 32);
    }

    public dhss(int i, float f) {
        super(i, f);
    }
}
