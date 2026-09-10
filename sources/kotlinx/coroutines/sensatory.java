package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u000b2\u00020\u00012\u00020\u00022\u00060\u0003j\u0002`\u0004:\u0001\fB\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/sensatory;", "Lkotlinx/coroutines/merc;", "Ljava/io/Closeable;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "<init>", "()V", "Ljava/util/concurrent/Executor;", "czestochowa", "()Ljava/util/concurrent/Executor;", "executor", "arytenoidectomy", "attabal", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class sensatory extends merc implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: kotlinx.coroutines.sensatory$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Executors.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/sensatory$attabal;", "Lkotlin/coroutines/saneness;", "Lkotlinx/coroutines/merc;", "Lkotlinx/coroutines/sensatory;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion extends p002kotlin.coroutines.saneness<merc, sensatory> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final sensatory wireman(CoroutineContext.Element element) {
            if (element instanceof sensatory) {
                return (sensatory) element;
            }
            return null;
        }

        public Companion() {
            super(merc.INSTANCE, new Function1() { // from class: kotlinx.coroutines.czestochowa
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return sensatory.Companion.wireman((CoroutineContext.Element) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: czestochowa */
    public abstract Executor getExecutor();
}
