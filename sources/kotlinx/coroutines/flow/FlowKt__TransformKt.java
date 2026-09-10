package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Transform.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/dern;", "attabal", "(Lkotlinx/coroutines/flow/dern;)Lkotlinx/coroutines/flow/dern;", "Lkotlin/Function2;", "Lwretchedly/dern;", "", "action", "saneness", "(Lkotlinx/coroutines/flow/dern;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/dern;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__TransformKt {
    public static final <T> dern<T> attabal(final dern<? extends T> dernVar) {
        return new dern<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements wireman {

                /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
                public final /* synthetic */ wireman f32235kowloon;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                @igo.wireman(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wretchedly.dern dernVar) {
                        super(dernVar);
                    }

                    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(wireman wiremanVar) {
                    this.f32235kowloon = wiremanVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.wireman
                public final Object emit(T t, wretchedly.dern<? super Unit> dernVar) {
                    AnonymousClass1 anonymousClass1;
                    if (dernVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dernVar;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(dernVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(dernVar);
                    }
                    Object obj = anonymousClass1.result;
                    Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        p002kotlin.dern.saneness(obj);
                        wireman wiremanVar = this.f32235kowloon;
                        if (t != null) {
                            anonymousClass1.label = 1;
                            if (wiremanVar.emit(t, anonymousClass1) == objBeachfront) {
                                return objBeachfront;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p002kotlin.dern.saneness(obj);
                    }
                    return Unit.f29295attabal;
                }
            }

            @Override // kotlinx.coroutines.flow.dern
            public Object collect(wireman wiremanVar, wretchedly.dern dernVar2) {
                Object objCollect = dernVar.collect(new AnonymousClass2(wiremanVar), dernVar2);
                return objCollect == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCollect : Unit.f29295attabal;
            }
        };
    }

    public static final <T> dern<T> saneness(final dern<? extends T> dernVar, final Function2<? super T, ? super wretchedly.dern<? super Unit>, ? extends Object> function2) {
        return new dern<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements wireman {

                /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
                public final /* synthetic */ Function2 f32238arytenoidectomy;

                /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
                public final /* synthetic */ wireman f32239kowloon;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                @igo.wireman(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50, 51}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wretchedly.dern dernVar) {
                        super(dernVar);
                    }

                    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(wireman wiremanVar, Function2 function2) {
                    this.f32239kowloon = wiremanVar;
                    this.f32238arytenoidectomy = function2;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
                
                    if (r6.emit(r2, r0) == r1) goto L22;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.wireman
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(T r6, wretchedly.dern<? super p002kotlin.Unit> r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3e
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        p002kotlin.dern.saneness(r7)
                        goto L6a
                    L2c:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L34:
                        java.lang.Object r6 = r0.L$1
                        kotlinx.coroutines.flow.wireman r6 = (kotlinx.coroutines.flow.wireman) r6
                        java.lang.Object r2 = r0.L$0
                        p002kotlin.dern.saneness(r7)
                        goto L5c
                    L3e:
                        p002kotlin.dern.saneness(r7)
                        kotlinx.coroutines.flow.wireman r7 = r5.f32239kowloon
                        kotlin.jvm.functions.Function2 r2 = r5.f32238arytenoidectomy
                        r0.L$0 = r6
                        r0.L$1 = r7
                        r0.label = r4
                        r4 = 6
                        p002kotlin.jvm.internal.impassible.dern(r4)
                        java.lang.Object r2 = r2.invoke(r6, r0)
                        r4 = 7
                        p002kotlin.jvm.internal.impassible.dern(r4)
                        if (r2 != r1) goto L5a
                        goto L69
                    L5a:
                        r2 = r6
                        r6 = r7
                    L5c:
                        r7 = 0
                        r0.L$0 = r7
                        r0.L$1 = r7
                        r0.label = r3
                        java.lang.Object r6 = r6.emit(r2, r0)
                        if (r6 != r1) goto L6a
                    L69:
                        return r1
                    L6a:
                        kotlin.Unit r6 = p002kotlin.Unit.f29295attabal
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.emit(java.lang.Object, wretchedly.dern):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.dern
            public Object collect(wireman wiremanVar, wretchedly.dern dernVar2) {
                Object objCollect = dernVar.collect(new AnonymousClass2(wiremanVar, function2), dernVar2);
                return objCollect == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCollect : Unit.f29295attabal;
            }
        };
    }
}
