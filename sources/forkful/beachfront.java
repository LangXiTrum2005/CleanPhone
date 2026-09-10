package forkful;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.C3414a2;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.achondroplasia;
import kotlinx.coroutines.impassible;
import kotlinx.coroutines.mathsort;
import kotlinx.coroutines.milliradian;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.vesuvio;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b(\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010,R\u001a\u00101\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lforkful/beachfront;", "Lforkful/competently;", "Lkotlinx/coroutines/mathsort;", "Landroid/os/Handler;", "handler", "", "name", "", "invokeImmediately", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "nosophobia", "(Lkotlin/coroutines/CoroutineContext;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "itchy", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "timeMillis", "Lkotlinx/coroutines/impassible;", "continuation", "monoploid", "(JLkotlinx/coroutines/impassible;)V", "Lkotlinx/coroutines/milliradian;", "merc", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/milliradian;", "toString", "()Ljava/lang/String;", "", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "picketboat", "arytenoidectomy", "Landroid/os/Handler;", "Ljava/lang/String;", "Z", "polloi", "Lforkful/beachfront;", "palmyra", "()Lforkful/beachfront;", "immediate", "kotlinx-coroutines-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class beachfront extends competently implements mathsort {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final Handler handler;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final boolean invokeImmediately;
    private final String name;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final beachfront immediate;

    public beachfront(Handler handler, String str, boolean z) {
        super(null);
        this.handler = handler;
        this.name = str;
        this.invokeImmediately = z;
        this.immediate = z ? this : new beachfront(handler, str, true);
    }

    public static final Unit julian(beachfront beachfrontVar, Runnable runnable, Throwable th) {
        beachfrontVar.handler.removeCallbacks(runnable);
        return Unit.f29295attabal;
    }

    public static final void lightstruck(beachfront beachfrontVar, Runnable runnable) {
        beachfrontVar.handler.removeCallbacks(runnable);
    }

    public static final void monroe(impassible impassibleVar, beachfront beachfrontVar) {
        impassibleVar.molybdenite(beachfrontVar, Unit.f29295attabal);
    }

    public boolean equals(Object other) {
        if (!(other instanceof beachfront)) {
            return false;
        }
        beachfront beachfrontVar = (beachfront) other;
        return beachfrontVar.handler == this.handler && beachfrontVar.invokeImmediately == this.invokeImmediately;
    }

    public int hashCode() {
        return System.identityHashCode(this.handler) ^ (this.invokeImmediately ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.merc
    public void itchy(CoroutineContext context, Runnable block) {
        if (this.handler.post(block)) {
            return;
        }
        picketboat(context, block);
    }

    @Override // forkful.competently, kotlinx.coroutines.mathsort
    public milliradian merc(long timeMillis, final Runnable block, CoroutineContext context) {
        if (this.handler.postDelayed(block, p002kotlin.ranges.wireman.impromptu(timeMillis, 4611686018427387903L))) {
            return new milliradian() { // from class: forkful.dern
                @Override // kotlinx.coroutines.milliradian
                public final void attabal() {
                    beachfront.lightstruck(this.f26296kowloon, block);
                }
            };
        }
        picketboat(context, block);
        return vesuvio.f32469kowloon;
    }

    @Override // kotlinx.coroutines.mathsort
    public void monoploid(long timeMillis, final impassible<? super Unit> continuation) {
        final Runnable runnable = new Runnable() { // from class: forkful.wireman
            @Override // java.lang.Runnable
            public final void run() {
                beachfront.monroe(continuation, this);
            }
        };
        if (this.handler.postDelayed(runnable, p002kotlin.ranges.wireman.impromptu(timeMillis, 4611686018427387903L))) {
            continuation.beachfront(new Function1() { // from class: forkful.marial
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return beachfront.julian(this.f26299kowloon, runnable, (Throwable) obj);
                }
            });
        } else {
            picketboat(continuation.getContext(), runnable);
        }
    }

    @Override // kotlinx.coroutines.merc
    public boolean nosophobia(CoroutineContext context) {
        return (this.invokeImmediately && Intrinsics.wireman(Looper.myLooper(), this.handler.getLooper())) ? false : true;
    }

    @Override // forkful.competently
    /* JADX INFO: renamed from: palmyra, reason: from getter and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public beachfront preterite() {
        return this.immediate;
    }

    public final void picketboat(CoroutineContext context, Runnable block) {
        achondroplasia.dern(context, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        premeiotic.saneness().itchy(context, block);
    }

    @Override // kotlinx.coroutines.technofreak, kotlinx.coroutines.merc
    /* JADX INFO: renamed from: toString */
    public String getName() {
        String strUnderbelly = underbelly();
        if (strUnderbelly != null) {
            return strUnderbelly;
        }
        String string = this.name;
        if (string == null) {
            string = this.handler.toString();
        }
        if (!this.invokeImmediately) {
            return string;
        }
        return string + ".immediate";
    }

    public /* synthetic */ beachfront(Handler handler, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public beachfront(Handler handler, String str) {
        this(handler, str, false);
    }
}
