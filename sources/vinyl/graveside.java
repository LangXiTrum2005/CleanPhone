package vinyl;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR/\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0014"}, d2 = {"Lvinyl/graveside;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lvinyl/basify;", "Lkotlin/Function1;", "Lkurbash/wireman;", "Lasosan/wireman;", "compute", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", X3.i.W, "attabal", "(Lkurbash/wireman;)Lasosan/wireman;", "Lkotlin/jvm/functions/Function1;", "saneness", "()Lkotlin/jvm/functions/Function1;", "Lvinyl/dovishness;", "Lvinyl/impassible;", "Lvinyl/dovishness;", "classValue", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class graveside<T> implements basify<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Function1<kurbash.wireman<?>, asosan.wireman<T>> compute;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final dovishness<impassible<T>> classValue;

    /* JADX INFO: compiled from: Caching.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements Function0<T> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ kurbash.wireman f39397arytenoidectomy;

        public attabal(kurbash.wireman wiremanVar) {
            this.f39397arytenoidectomy = wiremanVar;
        }

        @Override // p002kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) new impassible(graveside.this.saneness().invoke(this.f39397arytenoidectomy));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public graveside(Function1<? super kurbash.wireman<?>, ? extends asosan.wireman<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.classValue = new dovishness<>();
    }

    @Override // vinyl.basify
    public asosan.wireman<T> attabal(kurbash.wireman<Object> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.classValue.get(gibeonite.attabal.saneness(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        empress empressVar = (empress) obj;
        T t = empressVar.reference.get();
        if (t == null) {
            t = (T) empressVar.attabal(new attabal(key));
        }
        return t.serializer;
    }

    public final Function1<kurbash.wireman<?>, asosan.wireman<T>> saneness() {
        return this.compute;
    }
}
