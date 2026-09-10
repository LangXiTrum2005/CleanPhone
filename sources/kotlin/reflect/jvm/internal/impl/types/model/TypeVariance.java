package kotlin.reflect.jvm.internal.impl.types.model;

import com.unity3d.services.ads.gmascar.utils.ScarConstants;

/* JADX INFO: loaded from: classes7.dex */
public enum TypeVariance {
    IN(ScarConstants.IN_SIGNAL_KEY),
    OUT("out"),
    INV("");

    public final String X;

    TypeVariance(String str) {
        this.X = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.X;
    }
}
