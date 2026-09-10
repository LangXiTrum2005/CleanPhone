package androidx.media3.common;

import android.util.SparseBooleanArray;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes.dex */
public final class FlagSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f5397a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseBooleanArray f5398a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f5399b;

        public final void a(int i2) {
            Assertions.e(!this.f5399b);
            this.f5398a.append(i2, true);
        }

        public final FlagSet b() {
            Assertions.e(!this.f5399b);
            this.f5399b = true;
            return new FlagSet(this.f5398a);
        }
    }

    public FlagSet(SparseBooleanArray sparseBooleanArray) {
        this.f5397a = sparseBooleanArray;
    }

    public final int a(int i2) {
        SparseBooleanArray sparseBooleanArray = this.f5397a;
        Assertions.c(i2, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagSet)) {
            return false;
        }
        FlagSet flagSet = (FlagSet) obj;
        int i2 = Util.f5683a;
        SparseBooleanArray sparseBooleanArray = this.f5397a;
        if (i2 >= 24) {
            return sparseBooleanArray.equals(flagSet.f5397a);
        }
        if (sparseBooleanArray.size() != flagSet.f5397a.size()) {
            return false;
        }
        for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
            if (a(i3) != flagSet.a(i3)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i2 = Util.f5683a;
        SparseBooleanArray sparseBooleanArray = this.f5397a;
        if (i2 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
            size = (size * 31) + a(i3);
        }
        return size;
    }
}
