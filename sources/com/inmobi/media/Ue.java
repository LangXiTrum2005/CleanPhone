package com.inmobi.media;

import com.applovin.shadow.okio.Segment;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes5.dex */
public final class Ue implements Ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdConfig.VastVideoConfig f23279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23281c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f23282e;
    public String f;
    public String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f23283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f23284i;
    public Le j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23285l;

    public Ue(List trackers, AdConfig.VastVideoConfig vastVideoConfig) {
        Intrinsics.f(trackers, "trackers");
        Intrinsics.f(vastVideoConfig, "vastVideoConfig");
        this.f23279a = vastVideoConfig;
        this.f23280b = 1048576;
        this.f23281c = Segment.SIZE;
        this.d = 60;
        ArrayList arrayList = new ArrayList();
        this.f23283h = arrayList;
        arrayList.addAll(trackers);
        this.f23282e = new ArrayList();
        this.f23284i = new ArrayList();
        this.f23285l = 0;
    }

    public static boolean a(double d, double d2, double d3) {
        return d3 > d && d3 <= d2;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01ca A[PHI: r2 r3 r8
  0x01ca: PHI (r2v14 com.inmobi.media.Me) = (r2v7 com.inmobi.media.Me), (r2v17 com.inmobi.media.Me) binds: [B:103:0x01c8, B:80:0x017a] A[DONT_GENERATE, DONT_INLINE]
  0x01ca: PHI (r3v11 com.inmobi.media.Me) = (r3v4 com.inmobi.media.Me), (r3v14 com.inmobi.media.Me) binds: [B:103:0x01c8, B:80:0x017a] A[DONT_GENERATE, DONT_INLINE]
  0x01ca: PHI (r8v13 double) = (r8v4 double), (r8v16 double) binds: [B:103:0x01c8, B:80:0x017a] A[DONT_GENERATE, DONT_INLINE]] */
    public final String b() {
        Me me2;
        int iA;
        String str = this.f;
        if (str != null) {
            return str;
        }
        C3122m1 c3122m1A = Nc.a();
        c3122m1A.getClass();
        ArrayList<C3072j> arrayListA = T1.a(c3122m1A, null, null, null, null, "created_ts DESC ", null, 47);
        ArrayList arrayList = new ArrayList();
        for (C3072j c3072j : arrayListA) {
            if (c3072j != null) {
                arrayList.add(c3072j);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C3072j) it.next()).f23703b);
        }
        Me me3 = null;
        if (arrayList2.isEmpty()) {
            me2 = null;
            break;
        }
        Iterator it2 = this.f23282e.iterator();
        do {
            if (!it2.hasNext()) {
                me2 = null;
                break;
            }
            me2 = (Me) it2.next();
        } while (!arrayList2.contains(me2.f22988a));
        if (me2 != null) {
            String str2 = me2.f22988a;
            this.f = str2;
            return str2;
        }
        double optimalVastVideoSize = (this.f23279a.getOptimalVastVideoSize() * 2.0d) / ((double) this.f23280b);
        double vastMaxAssetSize = (this.f23279a.getVastMaxAssetSize() * 1.0d) / ((double) this.f23280b);
        for (Me me4 : this.f23282e) {
            try {
                iA = a();
            } catch (ArrayIndexOutOfBoundsException e2) {
                S5 s5 = S5.f23167a;
                S5.d.a(new C3011f2(e2));
                iA = 0;
            }
            double d = ((((double) me4.f22989b) * 1.0d) * ((double) iA)) / ((double) this.f23281c);
            me4.f22990c = d;
            double d2 = optimalVastVideoSize;
            if (!a(0.0d, d2, d)) {
                boolean zA = a(d2, vastMaxAssetSize, d);
                d2 = d2;
                if (!zA || (me3 != null && d >= me3.f22990c)) {
                    optimalVastVideoSize = d2;
                } else {
                    optimalVastVideoSize = d2;
                    me3 = me4;
                }
            } else if (me2 == null || d > me2.f22990c) {
                optimalVastVideoSize = d2;
                me2 = me4;
            } else {
                optimalVastVideoSize = d2;
            }
        }
        double d3 = optimalVastVideoSize;
        if (me2 != null) {
            this.f = me2.f22988a;
        } else if (me3 != null) {
            this.f = me3.f22988a;
        }
        String str3 = this.f;
        if (str3 == null || str3.length() == 0) {
            AdConfig.BitRateConfig bitRate = this.f23279a.getBitRate();
            if (bitRate.getBitrate_mandatory() || this.f23282e.size() == 0) {
                return this.f;
            }
            CountDownLatch countDownLatch = new CountDownLatch(this.f23282e.size());
            try {
                try {
                    a(bitRate, countDownLatch);
                    countDownLatch.await(bitRate.getHeaderTimeout(), TimeUnit.MILLISECONDS);
                    for (Me me5 : this.f23282e) {
                        double d4 = me5.f22990c;
                        if (!a(0.0d, d3, d4)) {
                            double d5 = d3;
                            d3 = d5;
                            if (a(d5, vastMaxAssetSize, d4) && (me3 == null || d4 < me3.f22990c)) {
                                me3 = me5;
                            }
                        } else if (me2 == null || d4 > me2.f22990c) {
                            me2 = me5;
                        }
                    }
                    if (me2 != null) {
                        this.f = me2.f22988a;
                    } else if (me3 != null) {
                        this.f = me3.f22988a;
                    }
                } catch (Exception e3) {
                    S5 s6 = S5.f23167a;
                    S5.d.a(new C3011f2(e3));
                    for (Me me6 : this.f23282e) {
                        double d6 = me6.f22990c;
                        if (!a(0.0d, d3, d6)) {
                            double d7 = d3;
                            d3 = d7;
                            if (a(d7, vastMaxAssetSize, d6) && (me3 == null || d6 < me3.f22990c)) {
                                me3 = me6;
                            }
                        } else if (me2 == null || d6 > me2.f22990c) {
                            me2 = me6;
                        }
                    }
                    if (me2 != null) {
                        this.f = me2.f22988a;
                    } else if (me3 != null) {
                    }
                }
            } catch (Throwable th) {
                for (Me me7 : this.f23282e) {
                    double d8 = me7.f22990c;
                    if (!a(0.0d, d3, d8)) {
                        double d9 = d3;
                        d3 = d9;
                        if (a(d9, vastMaxAssetSize, d8) && (me3 == null || d8 < me3.f22990c)) {
                            me3 = me7;
                        }
                    } else if (me2 == null || d8 > me2.f22990c) {
                        me2 = me7;
                    }
                }
                if (me2 != null) {
                    this.f = me2.f22988a;
                } else if (me3 != null) {
                    this.f = me3.f22988a;
                }
                throw th;
            }
        }
        return this.f;
    }

    public final int a() {
        String[] strArr;
        String str = this.g;
        if (str != null && (strArr = (String[]) new Regex(":").f(str, 0).toArray(new String[0])) != null && strArr.length > 2) {
            try {
                return (Integer.parseInt(strArr[1]) * this.d) + ((int) Float.parseFloat(strArr[2]));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public final void a(AdConfig.BitRateConfig bitRateConfig, CountDownLatch countDownLatch) {
        Iterator it = this.f23282e.iterator();
        while (it.hasNext()) {
            new Oe((Me) it.next(), bitRateConfig.getHeaderTimeout(), countDownLatch).a();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Ue(String str, String str2, String str3, ArrayList trackers, ArrayList companionAds, AdConfig.VastVideoConfig vastVideoConfig) {
        this(trackers, vastVideoConfig);
        Intrinsics.f(trackers, "trackers");
        Intrinsics.f(companionAds, "companionAds");
        Intrinsics.f(vastVideoConfig, "vastVideoConfig");
        if (!companionAds.isEmpty()) {
            this.f23284i = new ArrayList(companionAds);
        }
        if (str != null) {
            this.f23282e.add(new Me(str, 1000));
        }
        this.f = str;
        this.g = str2;
        this.k = str3;
    }
}
