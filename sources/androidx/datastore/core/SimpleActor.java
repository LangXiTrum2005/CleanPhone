package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/SimpleActor;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SimpleActor<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f4683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function2 f4684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BufferedChannel f4685c;
    public final AtomicInt d;

    public SimpleActor(CoroutineScope scope, final Function1 function1, Function2 function2) {
        Intrinsics.f(scope, "scope");
        this.f4683a = scope;
        this.f4684b = function2;
        this.f4685c = ChannelKt.a(Integer.MAX_VALUE, 6, null);
        this.d = new AtomicInt();
        Job job = (Job) scope.getX().get(Job.Key.X);
        if (job != null) {
            job.s(new Function1<Throwable, Unit>() { // from class: androidx.datastore.core.SimpleActor.1
                public final /* synthetic */ Function2 Z = DataStoreImpl$writeActor$2.X;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit unit;
                    Unit unit2;
                    Throwable th = (Throwable) obj;
                    ((DataStoreImpl$writeActor$1) function1).invoke(th);
                    SimpleActor simpleActor = this;
                    simpleActor.f4685c.n(false, th);
                    do {
                        Object objV = simpleActor.f4685c.v();
                        unit = null;
                        if (objV instanceof ChannelResult.Failed) {
                            objV = null;
                        }
                        unit2 = Unit.f43263a;
                        if (objV != null) {
                            DataStoreImpl$writeActor$2.X.invoke(objV, th);
                            unit = unit2;
                        }
                    } while (unit != null);
                    return unit2;
                }
            });
        }
    }
}
