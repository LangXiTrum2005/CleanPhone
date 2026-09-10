package kotlin.sequences;

import com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/SequencesKt___SequencesKt$sortedWith$1", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SequencesKt___SequencesKt$sortedWith$1 implements Sequence<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1 f44673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CleanupDirectory$invoke$$inlined$sortedBy$1 f44674b;

    public SequencesKt___SequencesKt$sortedWith$1(CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1 collectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1, CleanupDirectory$invoke$$inlined$sortedBy$1 cleanupDirectory$invoke$$inlined$sortedBy$1) {
        this.f44673a = collectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1;
        this.f44674b = cleanupDirectory$invoke$$inlined$sortedBy$1;
    }

    @Override // kotlin.sequences.Sequence
    /* JADX INFO: renamed from: iterator */
    public final Iterator getF44671a() {
        ArrayList arrayListW = SequencesKt.w(this.f44673a);
        CollectionsKt.a0(arrayListW, this.f44674b);
        return arrayListW.iterator();
    }
}
