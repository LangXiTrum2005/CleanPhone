package kotlin.reflect.jvm.internal.impl.types;

import com.unity3d.services.ads.gmascar.utils.ScarConstants;

/* JADX INFO: loaded from: classes7.dex */
public enum Variance {
    INVARIANT("", true),
    IN_VARIANCE(ScarConstants.IN_SIGNAL_KEY, false),
    OUT_VARIANCE("out", true);

    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final boolean f44559Y;

    Variance(String str, boolean z2) {
        this.X = str;
        this.f44559Y = z2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.X;
    }
}
