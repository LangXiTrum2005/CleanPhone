package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/Empty;", "Lkotlinx/coroutines/Incomplete;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class Empty implements Incomplete {
    public final boolean X;

    public Empty(boolean z2) {
        this.X = z2;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* JADX INFO: renamed from: b */
    public final NodeList getX() {
        return null;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* JADX INFO: renamed from: isActive, reason: from getter */
    public final boolean getX() {
        return this.X;
    }

    public final String toString() {
        return androidx.media3.extractor.text.ttml.a.p(new StringBuilder("Empty{"), this.X ? "Active" : "New", AbstractJsonLexerKt.END_OBJ);
    }
}
