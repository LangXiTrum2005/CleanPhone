package kotlinx.coroutines.channels;

import p002kotlin.Metadata;
import pigboat.trm;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/wireman;", "E", "Lkotlinx/coroutines/channels/polloi;", "Lkotlinx/coroutines/channels/monoploid;", "apical", "attabal", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface wireman<E> extends polloi<E>, monoploid<E> {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f32171attabal;

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.wireman$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Channel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/channels/wireman$attabal;", "", "<init>", "()V", "", "saneness", "I", "attabal", "()I", "CHANNEL_DEFAULT_CAPACITY", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ Companion f32171attabal = new Companion();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public static final int CHANNEL_DEFAULT_CAPACITY = trm.saneness("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        public final int attabal() {
            return CHANNEL_DEFAULT_CAPACITY;
        }
    }
}
