package p002kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import wretchedly.dern;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/sequences/taiyuan;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "<init>", "()V", "value", "", "wireman", "(Ljava/lang/Object;Lwretchedly/dern;)Ljava/lang/Object;", "", "iterator", "impromptu", "(Ljava/util/Iterator;Lwretchedly/dern;)Ljava/lang/Object;", "Lkotlin/sequences/Sequence;", "sequence", "cutely", "(Lkotlin/sequences/Sequence;Lwretchedly/dern;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class taiyuan<T> {
    public final Object cutely(Sequence<? extends T> sequence, dern<? super Unit> dernVar) {
        Object objImpromptu = impromptu(sequence.iterator(), dernVar);
        return objImpromptu == attabal.beachfront() ? objImpromptu : Unit.f29295attabal;
    }

    public abstract Object impromptu(Iterator<? extends T> it, dern<? super Unit> dernVar);

    public abstract Object wireman(T t, dern<? super Unit> dernVar);
}
