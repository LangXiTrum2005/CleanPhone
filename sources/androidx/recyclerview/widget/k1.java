package androidx.recyclerview.widget;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f4817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f4818g;

    public k1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f4818g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f4812a = -1;
        this.f4813b = Integer.MIN_VALUE;
        this.f4814c = false;
        this.f4815d = false;
        this.f4816e = false;
        int[] iArr = this.f4817f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
