package androidx.room;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/room/TransactionScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1", f = "InvalidationTracker.kt", l = {Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE}, m = "invokeSuspend")
final class TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1 extends SuspendLambda implements Function2<TransactionScope<Unit>, Continuation<? super Unit>, Object> {
    public ObservedTableStates.ObserveOp[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TriggerBasedInvalidationTracker f8274Y;
    public Transactor Z;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public final /* synthetic */ ObservedTableStates.ObserveOp[] i0;
    public final /* synthetic */ TriggerBasedInvalidationTracker j0;
    public final /* synthetic */ Transactor k0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ObservedTableStates.ObserveOp.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ObservedTableStates.ObserveOp observeOp = ObservedTableStates.ObserveOp.X;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ObservedTableStates.ObserveOp observeOp2 = ObservedTableStates.ObserveOp.X;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1(ObservedTableStates.ObserveOp[] observeOpArr, TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Transactor transactor, Continuation continuation) {
        super(2, continuation);
        this.i0 = observeOpArr;
        this.j0 = triggerBasedInvalidationTracker;
        this.k0 = transactor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1(this.i0, this.j0, this.k0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1) create((TransactionScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:26:0x0076). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r1 = r10.h0
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L24
            if (r1 == r2) goto Lc
            if (r1 != r3) goto L1c
        Lc:
            int r1 = r10.g0
            int r4 = r10.f0
            int r5 = r10.e0
            androidx.room.Transactor r6 = r10.Z
            androidx.room.TriggerBasedInvalidationTracker r7 = r10.f8274Y
            androidx.room.ObservedTableStates$ObserveOp[] r8 = r10.X
            kotlin.ResultKt.b(r11)
            goto L58
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            kotlin.ResultKt.b(r11)
            androidx.room.ObservedTableStates$ObserveOp[] r11 = r10.i0
            int r1 = r11.length
            r4 = 0
            androidx.room.TriggerBasedInvalidationTracker r5 = r10.j0
            androidx.room.Transactor r6 = r10.k0
            r8 = r11
            r11 = r4
            r7 = r5
        L32:
            if (r4 >= r1) goto L78
            r5 = r8[r4]
            int r9 = r11 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L75
            if (r5 == r2) goto L60
            if (r5 != r3) goto L5a
            r10.X = r8
            r10.f8274Y = r7
            r10.Z = r6
            r10.e0 = r9
            r10.f0 = r4
            r10.g0 = r1
            r10.h0 = r3
            java.lang.Object r11 = androidx.room.TriggerBasedInvalidationTracker.c(r7, r6, r11, r10)
            if (r11 != r0) goto L57
            goto L74
        L57:
            r5 = r9
        L58:
            r11 = r5
            goto L76
        L5a:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L60:
            r10.X = r8
            r10.f8274Y = r7
            r10.Z = r6
            r10.e0 = r9
            r10.f0 = r4
            r10.g0 = r1
            r10.h0 = r2
            java.lang.Object r11 = androidx.room.TriggerBasedInvalidationTracker.b(r7, r6, r11, r10)
            if (r11 != r0) goto L57
        L74:
            return r0
        L75:
            r11 = r9
        L76:
            int r4 = r4 + r2
            goto L32
        L78:
            kotlin.Unit r11 = kotlin.Unit.f43263a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
