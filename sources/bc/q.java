package bc;

import android.util.Log;
import com.applovin.impl.ca;
import com.google.android.gms.internal.ads.ad;
import com.google.android.gms.internal.ads.bd;
import com.google.android.gms.internal.ads.id;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5574b;

    public q(int i10) {
        switch (i10) {
            case 2:
                this.f5573a = new ArrayList();
                this.f5574b = 0;
                break;
            default:
                this.f5573a = new ArrayList();
                this.f5574b = 128;
                break;
        }
    }

    public synchronized List a() {
        return Collections.unmodifiableList(new ArrayList(this.f5573a));
    }

    public boolean b() {
        return this.f5574b < this.f5573a.size();
    }

    public synchronized boolean c(List list) {
        this.f5573a.clear();
        if (list.size() <= this.f5574b) {
            return this.f5573a.addAll(list);
        }
        Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f5574b, null);
        return this.f5573a.addAll(list.subList(0, this.f5574b));
    }

    public int d(long j10) throws ad {
        long j11;
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int iG = ca.g((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        int i18 = i17 % 84353895;
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j12 = jArr[0];
        long j13 = jArr[1];
        long j14 = jArr[2];
        long j15 = jArr[3];
        long j16 = jArr[4];
        long j17 = jArr[5];
        long j18 = jArr[6];
        long j19 = jArr[7];
        long j20 = (((((~j12) & j13) | j14) + ((j12 & j15) | j16)) - j17) + j18;
        long j21 = j19 % 438792350;
        if (j10 >= 0) {
            j11 = ((long) (this.f5574b + (iG ^ i18))) - j10;
        } else {
            j11 = (j20 ^ j21) + (-j10);
        }
        if (j11 < 0 || j11 >= this.f5574b) {
            throw new ad();
        }
        return (int) j11;
    }

    public void e(id idVar) {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int iG = ca.g((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        int i18 = this.f5574b;
        if (i18 >= ((i17 % 937558955) ^ iG)) {
            throw new bd();
        }
        ArrayList arrayList = this.f5573a;
        if (i18 == arrayList.size()) {
            arrayList.add(idVar);
        } else {
            arrayList.set(this.f5574b, idVar);
        }
        this.f5574b++;
    }

    public id f() {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int iG = ca.g((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        int i18 = i17 % 459541652;
        int i19 = this.f5574b;
        if (i19 <= 0) {
            throw new ad();
        }
        int i20 = i18 ^ iG;
        ArrayList arrayList = this.f5573a;
        id idVar = (id) arrayList.get(i19 + i20);
        arrayList.set(this.f5574b + i20, null);
        this.f5574b += i20;
        return idVar;
    }

    public id g(long j10) {
        return (id) this.f5573a.get(d(j10));
    }

    public q(ArrayList arrayList) {
        this.f5573a = arrayList;
    }
}
