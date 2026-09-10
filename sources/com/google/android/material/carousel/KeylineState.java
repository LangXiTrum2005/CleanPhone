package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class KeylineState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19190c;
    public final int d;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f19191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f19192b;
        public Keyline d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Keyline f19194e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f19193c = new ArrayList();
        public int f = -1;
        public int g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f19195h = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f19196i = -1;

        public Builder(float f, float f2) {
            this.f19191a = f;
            this.f19192b = f2;
        }

        public final void a(float f, float f2, float f3, boolean z2, boolean z3) {
            float fAbs;
            float f4 = f3 / 2.0f;
            float f5 = f - f4;
            float f6 = f4 + f;
            float f7 = this.f19192b;
            if (f6 > f7) {
                fAbs = Math.abs(f6 - Math.max(f6 - f3, f7));
            } else {
                fAbs = 0.0f;
                if (f5 < 0.0f) {
                    fAbs = Math.abs(f5 - Math.min(f5 + f3, 0.0f));
                }
            }
            b(f, f2, f3, z2, z3, fAbs, 0.0f, 0.0f);
        }

        public final void b(float f, float f2, float f3, boolean z2, boolean z3, float f4, float f5, float f6) {
            if (f3 <= 0.0f) {
                return;
            }
            ArrayList arrayList = this.f19193c;
            if (z3) {
                if (z2) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i2 = this.f19196i;
                if (i2 != -1 && i2 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f19196i = arrayList.size();
            }
            Keyline keyline = new Keyline(Float.MIN_VALUE, f, f2, f3, z3, f4, f5, f6);
            if (z2) {
                if (this.d == null) {
                    this.d = keyline;
                    this.f = arrayList.size();
                }
                if (this.g != -1 && arrayList.size() - this.g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f3 != this.d.d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f19194e = keyline;
                this.g = arrayList.size();
            } else {
                if (this.d == null && f3 < this.f19195h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f19194e != null && f3 > this.f19195h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f19195h = f3;
            arrayList.add(keyline);
        }

        public final void c(float f, float f2, int i2, boolean z2, float f3) {
            if (i2 <= 0 || f3 <= 0.0f) {
                return;
            }
            int i3 = 0;
            while (i3 < i2) {
                float f4 = f2;
                boolean z3 = z2;
                float f5 = f3;
                a((i3 * f3) + f, f4, f5, z3, false);
                i3++;
                f2 = f4;
                f3 = f5;
                z2 = z3;
            }
        }

        public final KeylineState d() {
            if (this.d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (true) {
                ArrayList arrayList2 = this.f19193c;
                int size = arrayList2.size();
                float f = this.f19191a;
                if (i2 >= size) {
                    return new KeylineState(f, arrayList, this.f, this.g);
                }
                Keyline keyline = (Keyline) arrayList2.get(i2);
                arrayList.add(new Keyline((i2 * f) + (this.d.f19198b - (this.f * f)), keyline.f19198b, keyline.f19199c, keyline.d, keyline.f19200e, keyline.f, keyline.g, keyline.f19201h));
                i2++;
            }
        }
    }

    public static final class Keyline {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f19197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f19198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f19199c;
        public final float d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f19200e;
        public final float f;
        public final float g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f19201h;

        public Keyline(float f, float f2, float f3, float f4, boolean z2, float f5, float f6, float f7) {
            this.f19197a = f;
            this.f19198b = f2;
            this.f19199c = f3;
            this.d = f4;
            this.f19200e = z2;
            this.f = f5;
            this.g = f6;
            this.f19201h = f7;
        }
    }

    public KeylineState(float f, ArrayList arrayList, int i2, int i3) {
        this.f19188a = f;
        this.f19189b = Collections.unmodifiableList(arrayList);
        this.f19190c = i2;
        this.d = i3;
    }

    public final Keyline a() {
        return (Keyline) this.f19189b.get(this.f19190c);
    }

    public final Keyline b() {
        return (Keyline) this.f19189b.get(0);
    }

    public final Keyline c() {
        return (Keyline) this.f19189b.get(this.d);
    }

    public final Keyline d() {
        return (Keyline) androidx.media3.extractor.text.ttml.a.h(1, this.f19189b);
    }
}
