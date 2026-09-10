package com.unity3d.ads.core.extensions;

import ak.f;
import ak.l;
import bk.a;
import ck.e;
import ck.i;
import cn.a0;
import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import en.q;
import en.r;
import fn.d;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001ab\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042(\u0010\u000b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lfn/e;", "", "timeoutMillis", "", "active", "Lkotlin/Function2;", "Lkotlin/Function0;", "Lwj/r;", "Lak/f;", "", "block", "timeoutAfter", "(Lfn/e;JZLjk/c;)Lfn/e;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class FlowExtensionsKt {

    /* JADX INFO: renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Len/r;", "Lwj/r;", "<anonymous>", "(Len/r;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1", f = "FlowExtensions.kt", l = {15, 17}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        final /* synthetic */ boolean $active;
        final /* synthetic */ c $block;
        final /* synthetic */ fn.e $this_timeoutAfter;
        final /* synthetic */ long $timeoutMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1", f = "FlowExtensions.kt", l = {10}, m = "invokeSuspend")
        public static final class C02191 extends i implements c {
            final /* synthetic */ r $$this$channelFlow;
            final /* synthetic */ fn.e $this_timeoutAfter;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02191(fn.e eVar, r rVar, f fVar) {
                super(2, fVar);
                this.$this_timeoutAfter = eVar;
                this.$$this$channelFlow = rVar;
            }

            @Override // ck.a
            public final f create(Object obj, f fVar) {
                return new C02191(this.$this_timeoutAfter, this.$$this$channelFlow, fVar);
            }

            @Override // jk.c
            public final Object invoke(a0 a0Var, f fVar) {
                return ((C02191) create(a0Var, fVar)).invokeSuspend(wj.r.f53297a);
            }

            @Override // ck.a
            public final Object invokeSuspend(Object obj) {
                int i10 = this.label;
                if (i10 == 0) {
                    t9.e.z(obj);
                    fn.e eVar = this.$this_timeoutAfter;
                    final r rVar = this.$$this$channelFlow;
                    fn.f fVar = new fn.f() { // from class: com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1.1.1
                        @Override // fn.f
                        public final Object emit(T t10, f fVar2) {
                            Object objB = ((q) rVar).f40176d.b(fVar2, t10);
                            return objB == a.f5708a ? objB : wj.r.f53297a;
                        }
                    };
                    this.label = 1;
                    Object objCollect = eVar.collect(fVar, this);
                    a aVar = a.f5708a;
                    if (objCollect == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                }
                ((q) this.$$this$channelFlow).e0(null);
                return wj.r.f53297a;
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public /* synthetic */ class AnonymousClass2 extends kotlin.jvm.internal.a implements jk.a {
            public AnonymousClass2(Object obj) {
                super(0, obj, r.class, CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "close(Ljava/lang/Throwable;)Z", 8);
            }

            @Override // jk.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m3234invoke();
                return wj.r.f53297a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3234invoke() {
                ((q) ((r) this.receiver)).e0(null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j10, boolean z10, c cVar, fn.e eVar, f fVar) {
            super(2, fVar);
            this.$timeoutMillis = j10;
            this.$active = z10;
            this.$block = cVar;
            this.$this_timeoutAfter = eVar;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$timeoutMillis, this.$active, this.$block, this.$this_timeoutAfter, fVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // jk.c
        public final Object invoke(r rVar, f fVar) {
            return ((AnonymousClass1) create(rVar, fVar)).invokeSuspend(wj.r.f53297a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        
            if (r8.invoke(r3, r7) == r4) goto L17;
         */
        @Override // ck.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                int r0 = r7.label
                r1 = 0
                r2 = 2
                r3 = 1
                bk.a r4 = bk.a.f5708a
                if (r0 == 0) goto L21
                if (r0 == r3) goto L19
                if (r0 != r2) goto L11
                t9.e.z(r8)
                goto L57
            L11:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L19:
                java.lang.Object r0 = r7.L$0
                en.r r0 = (en.r) r0
                t9.e.z(r8)
                goto L41
            L21:
                t9.e.z(r8)
                java.lang.Object r8 = r7.L$0
                r0 = r8
                en.r r0 = (en.r) r0
                com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1 r8 = new com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1
                fn.e r5 = r7.$this_timeoutAfter
                r8.<init>(r5, r0, r1)
                r5 = 3
                cn.d0.w(r0, r1, r8, r5)
                long r5 = r7.$timeoutMillis
                r7.L$0 = r0
                r7.label = r3
                java.lang.Object r8 = cn.d0.l(r5, r7)
                if (r8 != r4) goto L41
                goto L56
            L41:
                boolean r8 = r7.$active
                if (r8 == 0) goto L57
                jk.c r8 = r7.$block
                com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2 r3 = new com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2
                r3.<init>(r0)
                r7.L$0 = r1
                r7.label = r2
                java.lang.Object r7 = r8.invoke(r3, r7)
                if (r7 != r4) goto L57
            L56:
                return r4
            L57:
                wj.r r7 = wj.r.f53297a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.extensions.FlowExtensionsKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T> fn.e timeoutAfter(fn.e eVar, long j10, boolean z10, c block) {
        n.f(eVar, "<this>");
        n.f(block, "block");
        return new d(new AnonymousClass1(j10, z10, block, eVar, null), l.f3620a, -2, en.a.f40122a);
    }

    public static /* synthetic */ fn.e timeoutAfter$default(fn.e eVar, long j10, boolean z10, c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return timeoutAfter(eVar, j10, z10, cVar);
    }
}
