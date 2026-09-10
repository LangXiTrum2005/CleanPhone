package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {121, 121}, m = "invokeSuspend")
final class SimpleActor$offer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f4687Y;
    public final /* synthetic */ SimpleActor Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleActor$offer$2(SimpleActor simpleActor, Continuation continuation) {
        super(2, continuation);
        this.Z = simpleActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SimpleActor$offer$2(this.Z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SimpleActor$offer$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    /* JADX WARN: Code duplicated, block: B:21:0x0080  */
    /* JADX WARN: Code duplicated, block: B:22:0x0081 A[PHI: r8
  0x0081: PHI (r8v3 kotlinx.coroutines.channels.ChannelSegment) = (r8v2 kotlinx.coroutines.channels.ChannelSegment), (r8v10 kotlinx.coroutines.channels.ChannelSegment) binds: [B:17:0x0072, B:21:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x008c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0090  */
    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:32:0x00ad, B:34:0x00b3, B:36:0x00ba, B:38:0x00c2, B:41:0x00c9, B:42:0x00cf, B:44:0x00d5, B:45:0x00e2, B:47:0x00f8, B:53:0x0106, B:55:0x0111, B:56:0x0115, B:58:0x0119, B:60:0x0121, B:62:0x0126, B:64:0x012a, B:65:0x012e, B:66:0x0132, B:67:0x0137, B:68:0x0138), top: B:91:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:32:0x00ad, B:34:0x00b3, B:36:0x00ba, B:38:0x00c2, B:41:0x00c9, B:42:0x00cf, B:44:0x00d5, B:45:0x00e2, B:47:0x00f8, B:53:0x0106, B:55:0x0111, B:56:0x0115, B:58:0x0119, B:60:0x0121, B:62:0x0126, B:64:0x012a, B:65:0x012e, B:66:0x0132, B:67:0x0137, B:68:0x0138), top: B:91:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:32:0x00ad, B:34:0x00b3, B:36:0x00ba, B:38:0x00c2, B:41:0x00c9, B:42:0x00cf, B:44:0x00d5, B:45:0x00e2, B:47:0x00f8, B:53:0x0106, B:55:0x0111, B:56:0x0115, B:58:0x0119, B:60:0x0121, B:62:0x0126, B:64:0x012a, B:65:0x012e, B:66:0x0132, B:67:0x0137, B:68:0x0138), top: B:91:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:32:0x00ad, B:34:0x00b3, B:36:0x00ba, B:38:0x00c2, B:41:0x00c9, B:42:0x00cf, B:44:0x00d5, B:45:0x00e2, B:47:0x00f8, B:53:0x0106, B:55:0x0111, B:56:0x0115, B:58:0x0119, B:60:0x0121, B:62:0x0126, B:64:0x012a, B:65:0x012e, B:66:0x0132, B:67:0x0137, B:68:0x0138), top: B:91:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f8 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:32:0x00ad, B:34:0x00b3, B:36:0x00ba, B:38:0x00c2, B:41:0x00c9, B:42:0x00cf, B:44:0x00d5, B:45:0x00e2, B:47:0x00f8, B:53:0x0106, B:55:0x0111, B:56:0x0115, B:58:0x0119, B:60:0x0121, B:62:0x0126, B:64:0x012a, B:65:0x012e, B:66:0x0132, B:67:0x0137, B:68:0x0138), top: B:91:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0115 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:32:0x00ad, B:34:0x00b3, B:36:0x00ba, B:38:0x00c2, B:41:0x00c9, B:42:0x00cf, B:44:0x00d5, B:45:0x00e2, B:47:0x00f8, B:53:0x0106, B:55:0x0111, B:56:0x0115, B:58:0x0119, B:60:0x0121, B:62:0x0126, B:64:0x012a, B:65:0x012e, B:66:0x0132, B:67:0x0137, B:68:0x0138), top: B:91:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0119 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:32:0x00ad, B:34:0x00b3, B:36:0x00ba, B:38:0x00c2, B:41:0x00c9, B:42:0x00cf, B:44:0x00d5, B:45:0x00e2, B:47:0x00f8, B:53:0x0106, B:55:0x0111, B:56:0x0115, B:58:0x0119, B:60:0x0121, B:62:0x0126, B:64:0x012a, B:65:0x012e, B:66:0x0132, B:67:0x0137, B:68:0x0138), top: B:91:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0121 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:32:0x00ad, B:34:0x00b3, B:36:0x00ba, B:38:0x00c2, B:41:0x00c9, B:42:0x00cf, B:44:0x00d5, B:45:0x00e2, B:47:0x00f8, B:53:0x0106, B:55:0x0111, B:56:0x0115, B:58:0x0119, B:60:0x0121, B:62:0x0126, B:64:0x012a, B:65:0x012e, B:66:0x0132, B:67:0x0137, B:68:0x0138), top: B:91:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:64:0x012a A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:32:0x00ad, B:34:0x00b3, B:36:0x00ba, B:38:0x00c2, B:41:0x00c9, B:42:0x00cf, B:44:0x00d5, B:45:0x00e2, B:47:0x00f8, B:53:0x0106, B:55:0x0111, B:56:0x0115, B:58:0x0119, B:60:0x0121, B:62:0x0126, B:64:0x012a, B:65:0x012e, B:66:0x0132, B:67:0x0137, B:68:0x0138), top: B:91:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0132 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:32:0x00ad, B:34:0x00b3, B:36:0x00ba, B:38:0x00c2, B:41:0x00c9, B:42:0x00cf, B:44:0x00d5, B:45:0x00e2, B:47:0x00f8, B:53:0x0106, B:55:0x0111, B:56:0x0115, B:58:0x0119, B:60:0x0121, B:62:0x0126, B:64:0x012a, B:65:0x012e, B:66:0x0132, B:67:0x0137, B:68:0x0138), top: B:91:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0138 A[Catch: all -> 0x00c6, TRY_LEAVE, TryCatch #0 {all -> 0x00c6, blocks: (B:32:0x00ad, B:34:0x00b3, B:36:0x00ba, B:38:0x00c2, B:41:0x00c9, B:42:0x00cf, B:44:0x00d5, B:45:0x00e2, B:47:0x00f8, B:53:0x0106, B:55:0x0111, B:56:0x0115, B:58:0x0119, B:60:0x0121, B:62:0x0126, B:64:0x012a, B:65:0x012e, B:66:0x0132, B:67:0x0137, B:68:0x0138), top: B:91:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0149  */
    /* JADX WARN: Code duplicated, block: B:94:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x015b -> B:80:0x015c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:31:0x00a0
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor$offer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
