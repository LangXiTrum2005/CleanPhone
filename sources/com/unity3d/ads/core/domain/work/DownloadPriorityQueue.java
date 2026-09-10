package com.unity3d.ads.core.domain.work;

import ak.f;
import ck.c;
import ck.e;
import ck.i;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import fn.a1;
import fn.g;
import fn.n0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.CancellationException;
import jk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import ln.a;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH\u0086Bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;", "", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "Lkotlin/Function1;", "Lak/f;", "Lwj/r;", "downloadAction", "invoke", "(ILjk/b;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lln/a;", "mutex", "Lln/a;", "Lfn/n0;", "Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue$PriorityItem;", "nextTurn", "Lfn/n0;", "Ljava/util/PriorityQueue;", "queue", "Ljava/util/PriorityQueue;", "PriorityItem", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class DownloadPriorityQueue {
    private final a mutex;
    private final n0 nextTurn;
    private final PriorityQueue<PriorityItem> queue;
    private final SessionRepository sessionRepository;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue$PriorityItem;", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "(I)V", "getPriority", "()I", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class PriorityItem {
        private final int priority;

        public PriorityItem(int i10) {
            this.priority = i10;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.work.DownloadPriorityQueue", f = "DownloadPriorityQueue.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE, 32, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE, 71}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DownloadPriorityQueue.this.invoke(0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue$PriorityItem;"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @e(c = "com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3", f = "DownloadPriorityQueue.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends i implements jk.c {
        final /* synthetic */ PriorityItem $priorityItem;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PriorityItem priorityItem, f fVar) {
            super(2, fVar);
            this.$priorityItem = priorityItem;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$priorityItem, fVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // jk.c
        public final Object invoke(PriorityItem priorityItem, f fVar) {
            return ((AnonymousClass3) create(priorityItem, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            return Boolean.valueOf(((PriorityItem) this.L$0) == this.$priorityItem);
        }
    }

    public DownloadPriorityQueue(SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
        this.mutex = new ln.c();
        this.nextTurn = g.c(null);
        this.queue = new PriorityQueue<>(50, new Comparator() { // from class: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$special$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return j1.f.h(Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t10).getPriority()), Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t11).getPriority()));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00de  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:46:0x0111  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object invoke(int i10, b bVar, f fVar) {
        AnonymousClass1 anonymousClass1;
        PriorityItem priorityItem;
        ln.c cVar;
        a aVar;
        b bVar2;
        DownloadPriorityQueue downloadPriorityQueue;
        PriorityItem priorityItem2;
        Throwable th2;
        DownloadPriorityQueue downloadPriorityQueue2;
        Object objC;
        PriorityItem priorityItem3;
        DownloadPriorityQueue downloadPriorityQueue3;
        ln.c cVar2;
        DownloadPriorityQueue downloadPriorityQueue4;
        a aVar2;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i11 = anonymousClass1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fVar);
        }
        Object obj = anonymousClass1.result;
        int i12 = anonymousClass1.label;
        r rVar = r.f53297a;
        bk.a aVar3 = bk.a.f5708a;
        try {
            try {
                if (i12 == 0) {
                    t9.e.z(obj);
                    priorityItem = new PriorityItem(i10);
                    a aVar4 = this.mutex;
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = bVar;
                    anonymousClass1.L$2 = priorityItem;
                    anonymousClass1.L$3 = aVar4;
                    anonymousClass1.label = 1;
                    cVar = (ln.c) aVar4;
                    if (cVar.e(anonymousClass1) != aVar3) {
                    }
                    aVar = cVar;
                    return aVar3;
                }
                if (i12 == 1) {
                    a aVar5 = (a) anonymousClass1.L$3;
                    PriorityItem priorityItem4 = (PriorityItem) anonymousClass1.L$2;
                    bVar = (b) anonymousClass1.L$1;
                    DownloadPriorityQueue downloadPriorityQueue5 = (DownloadPriorityQueue) anonymousClass1.L$0;
                    t9.e.z(obj);
                    priorityItem = priorityItem4;
                    aVar = aVar5;
                    this = downloadPriorityQueue5;
                } else {
                    if (i12 == 2) {
                        priorityItem2 = (PriorityItem) anonymousClass1.L$2;
                        bVar2 = (b) anonymousClass1.L$1;
                        downloadPriorityQueue = (DownloadPriorityQueue) anonymousClass1.L$0;
                        t9.e.z(obj);
                        try {
                            anonymousClass1.L$0 = downloadPriorityQueue;
                            anonymousClass1.L$1 = priorityItem2;
                            anonymousClass1.L$2 = null;
                            anonymousClass1.label = 3;
                            if (bVar2.invoke(anonymousClass1) != aVar3) {
                                downloadPriorityQueue2 = downloadPriorityQueue;
                                DownloadPriorityQueue downloadPriorityQueue6 = downloadPriorityQueue2;
                                priorityItem3 = priorityItem2;
                                downloadPriorityQueue3 = downloadPriorityQueue6;
                                objC = rVar;
                                if (!downloadPriorityQueue3.sessionRepository.getFeatureFlags().getUseTryCatchInDownloadQueue()) {
                                    t9.e.z(objC);
                                }
                                a aVar6 = downloadPriorityQueue3.mutex;
                                anonymousClass1.L$0 = downloadPriorityQueue3;
                                anonymousClass1.L$1 = priorityItem3;
                                anonymousClass1.L$2 = aVar6;
                                anonymousClass1.label = 4;
                                cVar2 = (ln.c) aVar6;
                                if (cVar2.e(anonymousClass1) != aVar3) {
                                    downloadPriorityQueue4 = downloadPriorityQueue3;
                                    aVar2 = cVar2;
                                }
                            }
                        } catch (Throwable th3) {
                            DownloadPriorityQueue downloadPriorityQueue7 = downloadPriorityQueue;
                            th2 = th3;
                            downloadPriorityQueue2 = downloadPriorityQueue7;
                            objC = t9.e.c(th2);
                            DownloadPriorityQueue downloadPriorityQueue8 = downloadPriorityQueue2;
                            priorityItem3 = priorityItem2;
                            downloadPriorityQueue3 = downloadPriorityQueue8;
                        }
                        aVar = cVar;
                        return aVar3;
                    }
                    if (i12 == 3) {
                        priorityItem2 = (PriorityItem) anonymousClass1.L$1;
                        downloadPriorityQueue2 = (DownloadPriorityQueue) anonymousClass1.L$0;
                        try {
                            t9.e.z(obj);
                            DownloadPriorityQueue downloadPriorityQueue9 = downloadPriorityQueue2;
                            priorityItem3 = priorityItem2;
                            downloadPriorityQueue3 = downloadPriorityQueue9;
                            objC = rVar;
                        } catch (Throwable th4) {
                            th2 = th4;
                            objC = t9.e.c(th2);
                            DownloadPriorityQueue downloadPriorityQueue10 = downloadPriorityQueue2;
                            priorityItem3 = priorityItem2;
                            downloadPriorityQueue3 = downloadPriorityQueue10;
                        }
                        if (!downloadPriorityQueue3.sessionRepository.getFeatureFlags().getUseTryCatchInDownloadQueue()) {
                            t9.e.z(objC);
                        }
                        a aVar7 = downloadPriorityQueue3.mutex;
                        anonymousClass1.L$0 = downloadPriorityQueue3;
                        anonymousClass1.L$1 = priorityItem3;
                        anonymousClass1.L$2 = aVar7;
                        anonymousClass1.label = 4;
                        cVar2 = (ln.c) aVar7;
                        if (cVar2.e(anonymousClass1) != aVar3) {
                            downloadPriorityQueue4 = downloadPriorityQueue3;
                            aVar2 = cVar2;
                        }
                        aVar = cVar;
                        return aVar3;
                    }
                    if (i12 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (a) anonymousClass1.L$2;
                    priorityItem3 = (PriorityItem) anonymousClass1.L$1;
                    downloadPriorityQueue4 = (DownloadPriorityQueue) anonymousClass1.L$0;
                    t9.e.z(obj);
                }
                try {
                    downloadPriorityQueue4.queue.remove(priorityItem3);
                    ((a1) downloadPriorityQueue4.nextTurn).d0(downloadPriorityQueue4.queue.peek());
                    return rVar;
                } finally {
                    ((ln.c) aVar2).g(null);
                }
                aVar = cVar;
                this.queue.offer(priorityItem);
                ((a1) this.nextTurn).d0(this.queue.peek());
                ((ln.c) aVar).g(null);
                n0 n0Var = this.nextTurn;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(priorityItem, null);
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = bVar;
                anonymousClass1.L$2 = priorityItem;
                anonymousClass1.L$3 = null;
                anonymousClass1.label = 2;
                if (g.l(n0Var, anonymousClass3, anonymousClass1) != aVar3) {
                    bVar2 = bVar;
                    downloadPriorityQueue = this;
                    priorityItem2 = priorityItem;
                    anonymousClass1.L$0 = downloadPriorityQueue;
                    anonymousClass1.L$1 = priorityItem2;
                    anonymousClass1.L$2 = null;
                    anonymousClass1.label = 3;
                    if (bVar2.invoke(anonymousClass1) != aVar3) {
                        downloadPriorityQueue2 = downloadPriorityQueue;
                        DownloadPriorityQueue downloadPriorityQueue11 = downloadPriorityQueue2;
                        priorityItem3 = priorityItem2;
                        downloadPriorityQueue3 = downloadPriorityQueue11;
                        objC = rVar;
                        if (!downloadPriorityQueue3.sessionRepository.getFeatureFlags().getUseTryCatchInDownloadQueue()) {
                            t9.e.z(objC);
                        }
                        a aVar8 = downloadPriorityQueue3.mutex;
                        anonymousClass1.L$0 = downloadPriorityQueue3;
                        anonymousClass1.L$1 = priorityItem3;
                        anonymousClass1.L$2 = aVar8;
                        anonymousClass1.label = 4;
                        cVar2 = (ln.c) aVar8;
                        if (cVar2.e(anonymousClass1) != aVar3) {
                            downloadPriorityQueue4 = downloadPriorityQueue3;
                            aVar2 = cVar2;
                            downloadPriorityQueue4.queue.remove(priorityItem3);
                            ((a1) downloadPriorityQueue4.nextTurn).d0(downloadPriorityQueue4.queue.peek());
                            return rVar;
                        }
                    }
                }
                aVar = cVar;
                return aVar3;
            } catch (Throwable th5) {
                ((ln.c) aVar).g(null);
                throw th5;
            }
        } catch (CancellationException e10) {
            throw e10;
        }
    }
}
