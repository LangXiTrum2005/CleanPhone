package com.mbridge.msdk.tracker;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f37087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f37089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f37090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f37091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f37092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f37093j;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p f37097d;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private d f37101h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private w f37102i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private f f37103j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f37094a = 50;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f37095b = 15000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f37096c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f37098e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f37099f = 50;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f37100g = 604800000;

        public b a(int i10, p pVar) {
            this.f37096c = i10;
            this.f37097d = pVar;
            return this;
        }

        public b b(int i10) {
            if (i10 <= 0) {
                this.f37094a = 50;
                return this;
            }
            this.f37094a = i10;
            return this;
        }

        public b c(int i10) {
            if (i10 < 0) {
                this.f37095b = 15000;
                return this;
            }
            this.f37095b = i10;
            return this;
        }

        public b d(int i10) {
            if (i10 < 0) {
                this.f37099f = 50;
                return this;
            }
            this.f37099f = i10;
            return this;
        }

        public b e(int i10) {
            if (i10 <= 0) {
                this.f37098e = 2;
                return this;
            }
            this.f37098e = i10;
            return this;
        }

        public b a(int i10) {
            if (i10 < 0) {
                this.f37100g = 604800000;
                return this;
            }
            this.f37100g = i10;
            return this;
        }

        public b a(d dVar) {
            this.f37101h = dVar;
            return this;
        }

        public b a(w wVar) {
            this.f37102i = wVar;
            return this;
        }

        public b a(f fVar) {
            this.f37103j = fVar;
            return this;
        }

        public x a() {
            if (y.b(this.f37101h) && com.mbridge.msdk.tracker.a.f36843a) {
                Log.e("TrackManager", "decorate can not be null");
            }
            if (y.b(this.f37102i) && com.mbridge.msdk.tracker.a.f36843a) {
                Log.e("TrackManager", "responseHandler can not be null");
            }
            if ((y.b(this.f37097d) || y.b(this.f37097d.b())) && com.mbridge.msdk.tracker.a.f36843a) {
                Log.e("TrackManager", "networkStackConfig or stack can not be null");
            }
            return new x(this);
        }
    }

    private x(b bVar) {
        this.f37084a = bVar.f37094a;
        this.f37085b = bVar.f37095b;
        this.f37086c = bVar.f37096c;
        this.f37087d = bVar.f37098e;
        this.f37088e = bVar.f37099f;
        this.f37089f = bVar.f37100g;
        this.f37090g = bVar.f37097d;
        this.f37091h = bVar.f37101h;
        this.f37092i = bVar.f37102i;
        this.f37093j = bVar.f37103j;
    }
}
