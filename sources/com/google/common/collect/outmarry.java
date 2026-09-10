package com.google.common.collect;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ObjectCountHashMap.java */
/* JADX INFO: loaded from: classes3.dex */
public class outmarry<K> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public transient Object[] f21920attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public transient long[] f21921beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public transient float f21922competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public transient int f21923dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public transient int f21924impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public transient int[] f21925marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public transient int[] f21926saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public transient int f21927wireman;

    /* JADX INFO: compiled from: ObjectCountHashMap.java */
    public class attabal extends Multisets.attabal<K> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f21928arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final K f21929kowloon;

        public attabal(int i) {
            this.f21929kowloon = (K) outmarry.this.f21920attabal[i];
            this.f21928arytenoidectomy = i;
        }

        public void attabal() {
            int i = this.f21928arytenoidectomy;
            if (i == -1 || i >= outmarry.this.trm() || !com.google.common.base.taiyuan.attabal(this.f21929kowloon, outmarry.this.f21920attabal[this.f21928arytenoidectomy])) {
                this.f21928arytenoidectomy = outmarry.this.impassible(this.f21929kowloon);
            }
        }

        @Override // com.google.common.collect.hardpan.attabal
        public int getCount() {
            attabal();
            int i = this.f21928arytenoidectomy;
            if (i == -1) {
                return 0;
            }
            return outmarry.this.f21926saneness[i];
        }

        @Override // com.google.common.collect.hardpan.attabal
        public K getElement() {
            return this.f21929kowloon;
        }
    }

    public outmarry() {
        triweekly(3, 1.0f);
    }

    public static int cutely(long j) {
        return (int) j;
    }

    public static <K> outmarry<K> dern(int i) {
        return new outmarry<>(i);
    }

    public static int impromptu(long j) {
        return (int) (j >>> 32);
    }

    public static long[] monoploid(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    public static long oilcan(long j, int i) {
        return (j & (-4294967296L)) | (4294967295L & ((long) i));
    }

    public static int[] polloi(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public static <K> outmarry<K> saneness() {
        return new outmarry<>();
    }

    public int adultoid(K k, int i) {
        lotta.wireman(i, "count");
        long[] jArr = this.f21921beachfront;
        Object[] objArr = this.f21920attabal;
        int[] iArr = this.f21926saneness;
        int iDern = lightstruck.dern(k);
        int iFormularize = formularize() & iDern;
        int i2 = this.f21923dern;
        int[] iArr2 = this.f21925marial;
        int i3 = iArr2[iFormularize];
        if (i3 == -1) {
            iArr2[iFormularize] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (impromptu(j) == iDern && com.google.common.base.taiyuan.attabal(k, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
                int iCutely = cutely(j);
                if (iCutely == -1) {
                    jArr[i3] = oilcan(j, i2);
                    break;
                }
                i3 = iCutely;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i5 = i2 + 1;
        cord(i5);
        kowloon(i2, k, i, iDern);
        this.f21923dern = i5;
        if (i2 >= this.f21924impromptu) {
            cuirassed(this.f21925marial.length * 2);
        }
        this.f21927wireman++;
        return 0;
    }

    public int apical(int i) {
        com.google.common.base.formularize.formularize(i, this.f21923dern);
        return this.f21926saneness[i];
    }

    public void arytenoidectomy(int i) {
        int iTrm = trm() - 1;
        if (i >= iTrm) {
            this.f21920attabal[i] = null;
            this.f21926saneness[i] = 0;
            this.f21921beachfront[i] = -1;
            return;
        }
        Object[] objArr = this.f21920attabal;
        objArr[i] = objArr[iTrm];
        int[] iArr = this.f21926saneness;
        iArr[i] = iArr[iTrm];
        objArr[iTrm] = null;
        iArr[iTrm] = 0;
        long[] jArr = this.f21921beachfront;
        long j = jArr[iTrm];
        jArr[i] = j;
        jArr[iTrm] = -1;
        int iImpromptu = impromptu(j) & formularize();
        int[] iArr2 = this.f21925marial;
        int i2 = iArr2[iImpromptu];
        if (i2 == iTrm) {
            iArr2[iImpromptu] = i;
            return;
        }
        while (true) {
            long j2 = this.f21921beachfront[i2];
            int iCutely = cutely(j2);
            if (iCutely == iTrm) {
                this.f21921beachfront[i2] = oilcan(j2, i);
                return;
            }
            i2 = iCutely;
        }
    }

    public void attabal() {
        this.f21927wireman++;
        Arrays.fill(this.f21920attabal, 0, this.f21923dern, (Object) null);
        Arrays.fill(this.f21926saneness, 0, this.f21923dern, 0);
        Arrays.fill(this.f21925marial, -1);
        Arrays.fill(this.f21921beachfront, -1L);
        this.f21923dern = 0;
    }

    public int beachfront(@CheckForNull Object obj) {
        int iImpassible = impassible(obj);
        if (iImpassible == -1) {
            return 0;
        }
        return this.f21926saneness[iImpassible];
    }

    public hardpan.attabal<K> competently(int i) {
        com.google.common.base.formularize.formularize(i, this.f21923dern);
        return new attabal(i);
    }

    public final void cord(int i) {
        int length = this.f21921beachfront.length;
        if (i > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                preprohormone(iMax);
            }
        }
    }

    public final void cuirassed(int i) {
        if (this.f21925marial.length >= 1073741824) {
            this.f21924impromptu = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (i * this.f21922competently)) + 1;
        int[] iArrPolloi = polloi(i);
        long[] jArr = this.f21921beachfront;
        int length = iArrPolloi.length - 1;
        for (int i3 = 0; i3 < this.f21923dern; i3++) {
            int iImpromptu = impromptu(jArr[i3]);
            int i4 = iImpromptu & length;
            int i5 = iArrPolloi[i4];
            iArrPolloi[i4] = i3;
            jArr[i3] = (((long) iImpromptu) << 32) | (((long) i5) & 4294967295L);
        }
        this.f21924impromptu = i2;
        this.f21925marial = iArrPolloi;
    }

    public int dovishness(@CheckForNull Object obj) {
        return gintrap(obj, lightstruck.dern(obj));
    }

    public final int formularize() {
        return this.f21925marial.length - 1;
    }

    public final int gintrap(@CheckForNull Object obj, int i) {
        int iFormularize = formularize() & i;
        int i2 = this.f21925marial[iFormularize];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (impromptu(this.f21921beachfront[i2]) == i && com.google.common.base.taiyuan.attabal(obj, this.f21920attabal[i2])) {
                int i4 = this.f21926saneness[i2];
                if (i3 == -1) {
                    this.f21925marial[iFormularize] = cutely(this.f21921beachfront[i2]);
                } else {
                    long[] jArr = this.f21921beachfront;
                    jArr[i3] = oilcan(jArr[i3], cutely(jArr[i2]));
                }
                arytenoidectomy(i2);
                this.f21923dern--;
                this.f21927wireman++;
                return i4;
            }
            int iCutely = cutely(this.f21921beachfront[i2]);
            if (iCutely == -1) {
                return 0;
            }
            i3 = i2;
            i2 = iCutely;
        }
    }

    public int graveside(int i, int i2) {
        return i - 1;
    }

    public int impassible(@CheckForNull Object obj) {
        int iDern = lightstruck.dern(obj);
        int iCutely = this.f21925marial[formularize() & iDern];
        while (iCutely != -1) {
            long j = this.f21921beachfront[iCutely];
            if (impromptu(j) == iDern && com.google.common.base.taiyuan.attabal(obj, this.f21920attabal[iCutely])) {
                return iCutely;
            }
            iCutely = cutely(j);
        }
        return -1;
    }

    public void kowloon(int i, K k, int i2, int i3) {
        this.f21921beachfront[i] = (((long) i3) << 32) | 4294967295L;
        this.f21920attabal[i] = k;
        this.f21926saneness[i] = i2;
    }

    public int marial() {
        return this.f21923dern == 0 ? -1 : 0;
    }

    public int molybdenite(int i) {
        int i2 = i + 1;
        if (i2 < this.f21923dern) {
            return i2;
        }
        return -1;
    }

    public void preprohormone(int i) {
        this.f21920attabal = Arrays.copyOf(this.f21920attabal, i);
        this.f21926saneness = Arrays.copyOf(this.f21926saneness, i);
        long[] jArr = this.f21921beachfront;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.f21921beachfront = jArrCopyOf;
    }

    public int rotuma(int i) {
        return gintrap(this.f21920attabal[i], impromptu(this.f21921beachfront[i]));
    }

    public void stratoscope(int i, int i2) {
        com.google.common.base.formularize.formularize(i, this.f21923dern);
        this.f21926saneness[i] = i2;
    }

    public K taiyuan(int i) {
        com.google.common.base.formularize.formularize(i, this.f21923dern);
        return (K) this.f21920attabal[i];
    }

    public void triweekly(int i, float f) {
        com.google.common.base.formularize.marial(i >= 0, "Initial capacity must be non-negative");
        com.google.common.base.formularize.marial(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, "Illegal load factor");
        int iAttabal = lightstruck.attabal(i, f);
        this.f21925marial = polloi(iAttabal);
        this.f21922competently = f;
        this.f21920attabal = new Object[i];
        this.f21926saneness = new int[i];
        this.f21921beachfront = monoploid(i);
        this.f21924impromptu = Math.max(1, (int) (iAttabal * f));
    }

    public int trm() {
        return this.f21923dern;
    }

    public void wireman(int i) {
        if (i > this.f21921beachfront.length) {
            preprohormone(i);
        }
        if (i >= this.f21924impromptu) {
            cuirassed(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    public outmarry(outmarry<? extends K> outmarryVar) {
        triweekly(outmarryVar.trm(), 1.0f);
        int iMarial = outmarryVar.marial();
        while (iMarial != -1) {
            adultoid(outmarryVar.taiyuan(iMarial), outmarryVar.apical(iMarial));
            iMarial = outmarryVar.molybdenite(iMarial);
        }
    }

    public outmarry(int i) {
        this(i, 1.0f);
    }

    public outmarry(int i, float f) {
        triweekly(i, f);
    }
}
