package nattier;

import com.google.common.primitives.ImmutableIntArray;
import cybernatic.saran;

/* JADX INFO: compiled from: UnsupportedBrandsSniffFailure.java */
/* JADX INFO: loaded from: classes.dex */
public final class gintrap implements saran {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f33715attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ImmutableIntArray f33716saneness;

    public gintrap(int i, int[] iArr) {
        this.f33715attabal = i;
        this.f33716saneness = iArr != null ? ImmutableIntArray.copyOf(iArr) : ImmutableIntArray.of();
    }
}
