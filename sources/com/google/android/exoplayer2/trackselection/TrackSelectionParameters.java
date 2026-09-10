package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public class TrackSelectionParameters implements Bundleable {
    public final ImmutableSet A0;
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f18694Y;
    public final int Z;
    public final int e0;
    public final int f0;
    public final int g0;
    public final int h0;
    public final int i0;
    public final int j0;
    public final int k0;
    public final boolean l0;
    public final ImmutableList m0;
    public final int n0;
    public final ImmutableList o0;
    public final int p0;
    public final int q0;
    public final int r0;
    public final ImmutableList s0;
    public final ImmutableList t0;
    public final int u0;
    public final int v0;
    public final boolean w0;
    public final boolean x0;
    public final boolean y0;
    public final ImmutableMap z0;

    public static class Builder {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18698e;
        public int f;
        public int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f18699h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f18695a = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18696b = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18697c = Integer.MAX_VALUE;
        public int d = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f18700i = Integer.MAX_VALUE;
        public int j = Integer.MAX_VALUE;
        public boolean k = true;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ImmutableList f18701l = ImmutableList.x();
        public int m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImmutableList f18702n = ImmutableList.x();
        public int o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f18703p = Integer.MAX_VALUE;
        public int q = Integer.MAX_VALUE;
        public ImmutableList r = ImmutableList.x();
        public ImmutableList s = ImmutableList.x();
        public int t = 0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f18704u = 0;
        public boolean v = false;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f18705w = false;
        public boolean x = false;
        public HashMap y = new HashMap();

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public HashSet f18706z = new HashSet();

        public Builder a(int i2, int i3) {
            this.f18700i = i2;
            this.j = i3;
            this.k = true;
            return this;
        }
    }

    static {
        new TrackSelectionParameters(new Builder());
        int i2 = Util.f18979a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
    }

    public TrackSelectionParameters(Builder builder) {
        this.X = builder.f18695a;
        this.f18694Y = builder.f18696b;
        this.Z = builder.f18697c;
        this.e0 = builder.d;
        this.f0 = builder.f18698e;
        this.g0 = builder.f;
        this.h0 = builder.g;
        this.i0 = builder.f18699h;
        this.j0 = builder.f18700i;
        this.k0 = builder.j;
        this.l0 = builder.k;
        this.m0 = builder.f18701l;
        this.n0 = builder.m;
        this.o0 = builder.f18702n;
        this.p0 = builder.o;
        this.q0 = builder.f18703p;
        this.r0 = builder.q;
        this.s0 = builder.r;
        this.t0 = builder.s;
        this.u0 = builder.t;
        this.v0 = builder.f18704u;
        this.w0 = builder.v;
        this.x0 = builder.f18705w;
        this.y0 = builder.x;
        this.z0 = ImmutableMap.e(builder.y);
        this.A0 = ImmutableSet.u(builder.f18706z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
            if (this.X == trackSelectionParameters.X && this.f18694Y == trackSelectionParameters.f18694Y && this.Z == trackSelectionParameters.Z && this.e0 == trackSelectionParameters.e0 && this.f0 == trackSelectionParameters.f0 && this.g0 == trackSelectionParameters.g0 && this.h0 == trackSelectionParameters.h0 && this.i0 == trackSelectionParameters.i0 && this.l0 == trackSelectionParameters.l0 && this.j0 == trackSelectionParameters.j0 && this.k0 == trackSelectionParameters.k0 && this.m0.equals(trackSelectionParameters.m0) && this.n0 == trackSelectionParameters.n0 && this.o0.equals(trackSelectionParameters.o0) && this.p0 == trackSelectionParameters.p0 && this.q0 == trackSelectionParameters.q0 && this.r0 == trackSelectionParameters.r0 && this.s0.equals(trackSelectionParameters.s0) && this.t0.equals(trackSelectionParameters.t0) && this.u0 == trackSelectionParameters.u0 && this.v0 == trackSelectionParameters.v0 && this.w0 == trackSelectionParameters.w0 && this.x0 == trackSelectionParameters.x0 && this.y0 == trackSelectionParameters.y0 && this.z0.equals(trackSelectionParameters.z0) && this.A0.equals(trackSelectionParameters.A0)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.A0.hashCode() + ((this.z0.hashCode() + ((((((((((((this.t0.hashCode() + ((this.s0.hashCode() + ((((((((this.o0.hashCode() + ((((this.m0.hashCode() + ((((((((((((((((((((((this.X + 31) * 31) + this.f18694Y) * 31) + this.Z) * 31) + this.e0) * 31) + this.f0) * 31) + this.g0) * 31) + this.h0) * 31) + this.i0) * 31) + (this.l0 ? 1 : 0)) * 31) + this.j0) * 31) + this.k0) * 31)) * 31) + this.n0) * 31)) * 31) + this.p0) * 31) + this.q0) * 31) + this.r0) * 31)) * 31)) * 31) + this.u0) * 31) + this.v0) * 31) + (this.w0 ? 1 : 0)) * 31) + (this.x0 ? 1 : 0)) * 31) + (this.y0 ? 1 : 0)) * 31)) * 31);
    }
}
