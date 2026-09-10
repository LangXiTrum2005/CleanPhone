package p002kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001aG\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0007¢\u0006\u0004\b\b\u0010\t\u001aG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\f*\f\b\u0002\u0010\u000e\"\u00020\r2\u00020\r¨\u0006\u000f"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function2;", "Lkotlin/sequences/taiyuan;", "Lwretchedly/dern;", "", "", "block", "Lkotlin/sequences/Sequence;", "saneness", "(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;", "", "attabal", "(Lkotlin/jvm/functions/Function2;)Ljava/util/Iterator;", "", "State", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
public class cutely {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/sequences/cutely$attabal", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal<T> implements Sequence<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Function2 f31963attabal;

        public attabal(Function2 function2) {
            this.f31963attabal = function2;
        }

        @Override // p002kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return cutely.attabal(this.f31963attabal);
        }
    }

    public static <T> Iterator<T> attabal(Function2<? super taiyuan<? super T>, ? super dern<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        impromptu impromptuVar = new impromptu();
        impromptuVar.arytenoidectomy(IntrinsicsKt__IntrinsicsJvmKt.attabal(block, impromptuVar, impromptuVar));
        return impromptuVar;
    }

    public static <T> Sequence<T> saneness(Function2<? super taiyuan<? super T>, ? super dern<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new attabal(block);
    }
}
