package kotlin.random;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"kotlin/random/FallbackThreadLocalRandom$implStorage$1", "Ljava/lang/ThreadLocal;", "Ljava/util/Random;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FallbackThreadLocalRandom$implStorage$1 extends ThreadLocal<java.util.Random> {
    @Override // java.lang.ThreadLocal
    public final java.util.Random initialValue() {
        return new java.util.Random();
    }
}
