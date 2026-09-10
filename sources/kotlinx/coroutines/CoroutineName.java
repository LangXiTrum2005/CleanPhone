package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineName;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CoroutineName extends AbstractCoroutineContextElement {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Key f44748Y = new Key();
    public final String X;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineName$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineName;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Key implements CoroutineContext.Key<CoroutineName> {
    }

    public CoroutineName(String str) {
        super(f44748Y);
        this.X = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CoroutineName) && Intrinsics.a(this.X, ((CoroutineName) obj).X);
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        return androidx.media3.extractor.text.ttml.a.p(new StringBuilder("CoroutineName("), this.X, ')');
    }
}
