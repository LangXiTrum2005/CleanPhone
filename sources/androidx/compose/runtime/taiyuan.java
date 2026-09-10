package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b\u000e\u0010\bJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0002H'¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010 2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000!H'¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\u00020\u00042\u0012\u0010&\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030%0$H'¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0004H'¢\u0006\u0004\b)\u0010\bJ\u001b\u0010*\u001a\u00020\u00042\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030%H'¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0004H'¢\u0006\u0004\b,\u0010\bJ\u000f\u0010-\u001a\u00020\u0004H&¢\u0006\u0004\b-\u0010\bR\u001a\u00101\u001a\u00020\u00148&X§\u0004¢\u0006\f\u0012\u0004\b0\u0010\b\u001a\u0004\b.\u0010/R\u001c\u00105\u001a\u0004\u0018\u00010\u00188&X§\u0004¢\u0006\f\u0012\u0004\b4\u0010\b\u001a\u0004\b2\u00103R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u001a\u0010>\u001a\u00020:8gX§\u0004¢\u0006\f\u0012\u0004\b=\u0010\b\u001a\u0004\b;\u0010<\u0082\u0001\u0001?ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006@À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/taiyuan;", "", "", X3.i.W, "", "graveside", "(I)V", "polloi", "()V", "attabal", "(I)Landroidx/compose/runtime/taiyuan;", "Landroidx/compose/runtime/licking;", "dern", "()Landroidx/compose/runtime/licking;", "kowloon", "apical", "()Ljava/lang/Object;", "value", "competently", "(Ljava/lang/Object;)V", "", "molybdenite", "(Ljava/lang/Object;)Z", "impassible", "Landroidx/compose/runtime/hardpan;", "scope", "monoploid", "(Landroidx/compose/runtime/hardpan;)V", "parametersChanged", "flags", "marial", "(ZI)Z", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/preprohormone;", "wireman", "(Landroidx/compose/runtime/preprohormone;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/claque;", "values", "adultoid", "([Landroidx/compose/runtime/claque;)V", "arytenoidectomy", "triweekly", "(Landroidx/compose/runtime/claque;)V", "impromptu", "taiyuan", "saneness", "()Z", "getSkipping$annotations", "skipping", "cutely", "()Landroidx/compose/runtime/hardpan;", "getRecomposeScope$annotations", "recomposeScope", "Loilcan/marial;", "formularize", "()Loilcan/marial;", "compositionData", "Lkotlin/coroutines/CoroutineContext;", "beachfront", "()Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "Landroidx/compose/runtime/kowloon;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f6306attabal;

    /* JADX INFO: renamed from: androidx.compose.runtime.taiyuan$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/taiyuan$attabal;", "", "<init>", "()V", "saneness", "Ljava/lang/Object;", "attabal", "()Ljava/lang/Object;", "Empty", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ Companion f6306attabal = new Companion();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public static final Object Empty = new C0041attabal();

        /* JADX INFO: renamed from: androidx.compose.runtime.taiyuan$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Composer.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/runtime/taiyuan$attabal$attabal", "", "", "toString", "()Ljava/lang/String;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0041attabal {
            public String toString() {
                return "Empty";
            }
        }

        public final Object attabal() {
            return Empty;
        }
    }

    void adultoid(claque<?>[] values);

    Object apical();

    void arytenoidectomy();

    taiyuan attabal(int key);

    CoroutineContext beachfront();

    void competently(Object value);

    hardpan cutely();

    licking dern();

    oilcan.marial formularize();

    void graveside(int key);

    default boolean impassible(Object value) {
        return molybdenite(value);
    }

    void impromptu();

    void kowloon();

    boolean marial(boolean parametersChanged, int flags);

    boolean molybdenite(Object value);

    void monoploid(hardpan scope);

    void polloi();

    boolean saneness();

    void taiyuan();

    void triweekly(claque<?> value);

    <T> T wireman(preprohormone<T> key);
}
