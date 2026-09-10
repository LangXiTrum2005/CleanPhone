package com.smartdigimkt.c4;

import com.smartdigimkt.p4.f0;
import com.smartdigimkt.p4.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f34157b = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f34159c = 12;
    public static final int d = 16;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f34162e = 1;
    public static final int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34171a;
    public static final int g = f0.d("ftyp");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f34163h = f0.d("avc1");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f34164i = f0.d("avc3");
    public static final int j = f0.d("hvc1");
    public static final int k = f0.d("hev1");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f34165l = f0.d("s263");
    public static final int m = f0.d("d263");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f34166n = f0.d("mdat");
    public static final int o = f0.d("mp4a");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f34167p = f0.d(".mp3");
    public static final int q = f0.d("wave");
    public static final int r = f0.d("lpcm");
    public static final int s = f0.d("sowt");
    public static final int t = f0.d("ac-3");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f34168u = f0.d("dac3");
    public static final int v = f0.d("ec-3");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f34169w = f0.d("dec3");
    public static final int x = f0.d("dtsc");
    public static final int y = f0.d("dtsh");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f34170z = f0.d("dtsl");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f34144A = f0.d("dtse");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f34145B = f0.d("ddts");
    public static final int C = f0.d("tfdt");
    public static final int D = f0.d("tfhd");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f34146E = f0.d("trex");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f34147F = f0.d("trun");
    public static final int G = f0.d("sidx");
    public static final int H = f0.d("moov");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f34148I = f0.d("mvhd");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f34149J = f0.d("trak");
    public static final int K = f0.d("mdia");
    public static final int L = f0.d("minf");
    public static final int M = f0.d("stbl");

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f34150N = f0.d("avcC");
    public static final int O = f0.d("hvcC");

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f34151P = f0.d("esds");

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f34152Q = f0.d("moof");

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f34153R = f0.d("traf");
    public static final int S = f0.d("mvex");
    public static final int T = f0.d("mehd");

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int f34154U = f0.d("tkhd");

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final int f34155V = f0.d("edts");
    public static final int W = f0.d("elst");
    public static final int X = f0.d("mdhd");

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final int f34156Y = f0.d("hdlr");
    public static final int Z = f0.d("stsd");
    public static final int a0 = f0.d("pssh");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f34158b0 = f0.d("sinf");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f34160c0 = f0.d("schm");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f34161d0 = f0.d("schi");
    public static final int e0 = f0.d("tenc");
    public static final int f0 = f0.d("encv");
    public static final int g0 = f0.d("enca");
    public static final int h0 = f0.d("frma");
    public static final int i0 = f0.d("saiz");
    public static final int j0 = f0.d("saio");
    public static final int k0 = f0.d("sbgp");
    public static final int l0 = f0.d("sgpd");
    public static final int m0 = f0.d("uuid");
    public static final int n0 = f0.d("senc");
    public static final int o0 = f0.d("pasp");
    public static final int p0 = f0.d("TTML");
    public static final int q0 = f0.d("vmhd");
    public static final int r0 = f0.d("mp4v");
    public static final int s0 = f0.d("stts");
    public static final int t0 = f0.d("stss");
    public static final int u0 = f0.d("ctts");
    public static final int v0 = f0.d("stsc");
    public static final int w0 = f0.d("stsz");
    public static final int x0 = f0.d("stz2");
    public static final int y0 = f0.d("stco");
    public static final int z0 = f0.d("co64");
    public static final int A0 = f0.d("tx3g");
    public static final int B0 = f0.d("wvtt");
    public static final int C0 = f0.d("stpp");
    public static final int D0 = f0.d("c608");
    public static final int E0 = f0.d("samr");
    public static final int F0 = f0.d("sawb");
    public static final int G0 = f0.d("udta");
    public static final int H0 = f0.d("meta");
    public static final int I0 = f0.d("ilst");
    public static final int J0 = f0.d("mean");
    public static final int K0 = f0.d("name");
    public static final int L0 = f0.d("data");
    public static final int M0 = f0.d("emsg");
    public static final int N0 = f0.d("st3d");
    public static final int O0 = f0.d("sv3d");
    public static final int P0 = f0.d("proj");
    public static final int Q0 = f0.d("vp08");
    public static final int R0 = f0.d("vp09");
    public static final int S0 = f0.d("vpcC");
    public static final int T0 = f0.d("camm");
    public static final int U0 = f0.d("alac");

    /* JADX INFO: renamed from: com.smartdigimkt.c4.a$a, reason: collision with other inner class name */
    public static final class C0451a extends a {
        public final long V0;
        public final List<b> W0;
        public final List<C0451a> X0;

        public C0451a(int i2, long j) {
            super(i2);
            this.V0 = j;
            this.W0 = new ArrayList();
            this.X0 = new ArrayList();
        }

        public void a(b bVar) {
            this.W0.add(bVar);
        }

        public int d(int i2) {
            int size = this.W0.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                if (this.W0.get(i4).f34171a == i2) {
                    i3++;
                }
            }
            int size2 = this.X0.size();
            for (int i5 = 0; i5 < size2; i5++) {
                if (this.X0.get(i5).f34171a == i2) {
                    i3++;
                }
            }
            return i3;
        }

        public C0451a e(int i2) {
            int size = this.X0.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0451a c0451a = this.X0.get(i3);
                if (c0451a.f34171a == i2) {
                    return c0451a;
                }
            }
            return null;
        }

        public b f(int i2) {
            int size = this.W0.size();
            for (int i3 = 0; i3 < size; i3++) {
                b bVar = this.W0.get(i3);
                if (bVar.f34171a == i2) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // com.smartdigimkt.c4.a
        public String toString() {
            return a.a(this.f34171a) + " leaves: " + Arrays.toString(this.W0.toArray()) + " containers: " + Arrays.toString(this.X0.toArray());
        }

        public void a(C0451a c0451a) {
            this.X0.add(c0451a);
        }
    }

    public static final class b extends a {
        public final s V0;

        public b(int i2, s sVar) {
            super(i2);
            this.V0 = sVar;
        }
    }

    public a(int i2) {
        this.f34171a = i2;
    }

    public static String a(int i2) {
        return "" + ((char) ((i2 >> 24) & 255)) + ((char) ((i2 >> 16) & 255)) + ((char) ((i2 >> 8) & 255)) + ((char) (i2 & 255));
    }

    public static int b(int i2) {
        return i2 & 16777215;
    }

    public static int c(int i2) {
        return (i2 >> 24) & 255;
    }

    public String toString() {
        return a(this.f34171a);
    }
}
