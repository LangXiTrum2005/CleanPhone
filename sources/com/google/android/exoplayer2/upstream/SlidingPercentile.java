package com.google.android.exoplayer2.upstream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class SlidingPercentile {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f18807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f18808i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18809a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18812e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sample[] f18811c = new Sample[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f18810b = new ArrayList();
    public int d = -1;

    public static class Sample {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f18813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f18815c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.upstream.d] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.exoplayer2.upstream.d] */
    static {
        final int i2 = 0;
        f18807h = new Comparator() { // from class: com.google.android.exoplayer2.upstream.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                SlidingPercentile.Sample sample = (SlidingPercentile.Sample) obj;
                SlidingPercentile.Sample sample2 = (SlidingPercentile.Sample) obj2;
                switch (i2) {
                    case 0:
                        return sample.f18813a - sample2.f18813a;
                    default:
                        return Float.compare(sample.f18815c, sample2.f18815c);
                }
            }
        };
        final int i3 = 1;
        f18808i = new Comparator() { // from class: com.google.android.exoplayer2.upstream.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                SlidingPercentile.Sample sample = (SlidingPercentile.Sample) obj;
                SlidingPercentile.Sample sample2 = (SlidingPercentile.Sample) obj2;
                switch (i3) {
                    case 0:
                        return sample.f18813a - sample2.f18813a;
                    default:
                        return Float.compare(sample.f18815c, sample2.f18815c);
                }
            }
        };
    }

    public SlidingPercentile(int i2) {
        this.f18809a = i2;
    }

    public final void a(int i2, float f) {
        Sample sample;
        int i3 = this.d;
        ArrayList arrayList = this.f18810b;
        if (i3 != 1) {
            Collections.sort(arrayList, f18807h);
            this.d = 1;
        }
        int i4 = this.g;
        Sample[] sampleArr = this.f18811c;
        if (i4 > 0) {
            int i5 = i4 - 1;
            this.g = i5;
            sample = sampleArr[i5];
        } else {
            sample = new Sample();
        }
        int i6 = this.f18812e;
        this.f18812e = i6 + 1;
        sample.f18813a = i6;
        sample.f18814b = i2;
        sample.f18815c = f;
        arrayList.add(sample);
        this.f += i2;
        while (true) {
            int i7 = this.f;
            int i8 = this.f18809a;
            if (i7 <= i8) {
                return;
            }
            int i9 = i7 - i8;
            Sample sample2 = (Sample) arrayList.get(0);
            int i10 = sample2.f18814b;
            if (i10 <= i9) {
                this.f -= i10;
                arrayList.remove(0);
                int i11 = this.g;
                if (i11 < 5) {
                    this.g = i11 + 1;
                    sampleArr[i11] = sample2;
                }
            } else {
                sample2.f18814b = i10 - i9;
                this.f -= i9;
            }
        }
    }

    public final float b() {
        int i2 = this.d;
        ArrayList arrayList = this.f18810b;
        if (i2 != 0) {
            Collections.sort(arrayList, f18808i);
            this.d = 0;
        }
        float f = 0.5f * this.f;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            Sample sample = (Sample) arrayList.get(i4);
            i3 += sample.f18814b;
            if (i3 >= f) {
                return sample.f18815c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((Sample) android.support.v4.media.a.d(1, arrayList)).f18815c;
    }
}
