package kotlinx.coroutines.channels;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3414a2;
import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087@\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0004\u0014\u001cB\u0013\b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u001b\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/channels/impromptu;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "holder", "dern", "(Ljava/lang/Object;)Ljava/lang/Object;", "beachfront", "", "marial", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "cutely", "(Ljava/lang/Object;)Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Ljava/lang/Object;", "getHolder$annotations", "()V", "taiyuan", "isSuccess", "impromptu", "isClosed", "saneness", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class impromptu<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Object holder;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final dern f32162dern = new dern();

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.impromptu$attabal, reason: from toString */
    /* JADX INFO: compiled from: Channel.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/channels/impromptu$attabal;", "Lkotlinx/coroutines/channels/impromptu$dern;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "attabal", "Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Closed extends dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final Throwable cause;

        public Closed(Throwable th) {
            this.cause = th;
        }

        public boolean equals(Object other) {
            return (other instanceof Closed) && Intrinsics.wireman(this.cause, ((Closed) other).cause);
        }

        public int hashCode() {
            Throwable th = this.cause;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.impromptu.dern
        public String toString() {
            return "Closed(" + this.cause + ')';
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/channels/impromptu$dern;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class dern {
        public String toString() {
            return "Failed";
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.impromptu$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Channel.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/impromptu$saneness;", "", "<init>", "()V", "E", "value", "Lkotlinx/coroutines/channels/impromptu;", "dern", "(Ljava/lang/Object;)Ljava/lang/Object;", "saneness", "()Ljava/lang/Object;", "", "cause", "attabal", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/impromptu$dern;", X3.i.t, "Lkotlinx/coroutines/channels/impromptu$dern;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <E> Object attabal(Throwable cause) {
            return impromptu.dern(new Closed(cause));
        }

        public final <E> Object dern(E value) {
            return impromptu.dern(value);
        }

        public final <E> Object saneness() {
            return impromptu.dern(impromptu.f32162dern);
        }

        public Companion() {
        }
    }

    public /* synthetic */ impromptu(Object obj) {
        this.holder = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T beachfront(Object obj) {
        if (obj instanceof dern) {
            return null;
        }
        return obj;
    }

    public static int competently(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String cutely(Object obj) {
        if (obj instanceof Closed) {
            return ((Closed) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public static final boolean impromptu(Object obj) {
        return obj instanceof Closed;
    }

    public static final Throwable marial(Object obj) {
        Closed closed = obj instanceof Closed ? (Closed) obj : null;
        if (closed != null) {
            return closed.cause;
        }
        return null;
    }

    public static final /* synthetic */ impromptu saneness(Object obj) {
        return new impromptu(obj);
    }

    public static final boolean taiyuan(Object obj) {
        return !(obj instanceof dern);
    }

    public static boolean wireman(Object obj, Object obj2) {
        return (obj2 instanceof impromptu) && Intrinsics.wireman(obj, ((impromptu) obj2).getHolder());
    }

    /* JADX INFO: renamed from: apical, reason: from getter */
    public final /* synthetic */ Object getHolder() {
        return this.holder;
    }

    public boolean equals(Object other) {
        return wireman(this.holder, other);
    }

    public int hashCode() {
        return competently(this.holder);
    }

    public String toString() {
        return cutely(this.holder);
    }

    public static <T> Object dern(Object obj) {
        return obj;
    }
}
