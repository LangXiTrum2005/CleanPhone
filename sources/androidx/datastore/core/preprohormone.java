package androidx.datastore.core;

import com.ironsource.C3700q2;
import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/datastore/core/preprohormone;", "Lkotlin/coroutines/CoroutineContext$Element;", "parent", "Landroidx/datastore/core/DataStoreImpl;", C3700q2.p, "<init>", "(Landroidx/datastore/core/preprohormone;Landroidx/datastore/core/DataStoreImpl;)V", "Landroidx/datastore/core/competently;", "candidate", "", "wireman", "(Landroidx/datastore/core/competently;)V", "kowloon", "Landroidx/datastore/core/preprohormone;", "arytenoidectomy", "Landroidx/datastore/core/DataStoreImpl;", "Lkotlin/coroutines/CoroutineContext$saneness;", "getKey", "()Lkotlin/coroutines/CoroutineContext$saneness;", X3.i.W, "monoploid", "attabal", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class preprohormone implements CoroutineContext.Element {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final String f9597polloi = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final DataStoreImpl<?> instance;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final preprohormone parent;

    public preprohormone(preprohormone preprohormoneVar, DataStoreImpl<?> instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.parent = preprohormoneVar;
        this.instance = instance;
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.attabal.attabal(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p002kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.saneness<E> sanenessVar) {
        return (E) CoroutineContext.Element.attabal.saneness(this, sanenessVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.saneness<?> getKey() {
        return Companion.C0067attabal.f9600kowloon;
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.saneness<?> sanenessVar) {
        return CoroutineContext.Element.attabal.dern(this, sanenessVar);
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.attabal.wireman(this, coroutineContext);
    }

    public final void wireman(competently<?> candidate) {
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (this.instance == candidate) {
            throw new IllegalStateException(f9597polloi.toString());
        }
        preprohormone preprohormoneVar = this.parent;
        if (preprohormoneVar != null) {
            preprohormoneVar.wireman(candidate);
        }
    }
}
