package kotlinx.coroutines.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.EventLoopImplBase;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005R\u000b\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/atomicfu/AtomicInt;", "_size", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ThreadSafeHeap<T extends ThreadSafeHeapNode & Comparable<? super T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f45052b = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ThreadSafeHeapNode[] f45053a;

    public final void a(EventLoopImplBase.DelayedTask delayedTask) {
        delayedTask.b((EventLoopImplBase.DelayedTaskQueue) this);
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f45053a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f45052b;
        if (threadSafeHeapNodeArr == null) {
            threadSafeHeapNodeArr = new ThreadSafeHeapNode[4];
            this.f45053a = threadSafeHeapNodeArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= threadSafeHeapNodeArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(threadSafeHeapNodeArr, atomicIntegerFieldUpdater.get(this) * 2);
            Intrinsics.e(objArrCopyOf, "copyOf(...)");
            threadSafeHeapNodeArr = (ThreadSafeHeapNode[]) objArrCopyOf;
            this.f45053a = threadSafeHeapNodeArr;
        }
        int i2 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i2 + 1);
        threadSafeHeapNodeArr[i2] = delayedTask;
        delayedTask.f44754Y = i2;
        c(i2);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    /* JADX WARN: Code duplicated, block: B:21:0x007b A[LOOP:0: B:9:0x003c->B:21:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0080 A[EDGE_INSN: B:24:0x0080->B:22:0x0080 BREAK  A[LOOP:0: B:9:0x003c->B:21:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0080 A[EDGE_INSN: B:25:0x0080->B:22:0x0080 BREAK  A[LOOP:0: B:9:0x003c->B:21:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final ThreadSafeHeapNode b(int i2) {
        int i3;
        int i4;
        ThreadSafeHeapNode[] threadSafeHeapNodeArr;
        int i5;
        ThreadSafeHeapNode threadSafeHeapNode;
        ThreadSafeHeapNode threadSafeHeapNode2;
        ThreadSafeHeapNode threadSafeHeapNode3;
        ThreadSafeHeapNode threadSafeHeapNode4;
        ThreadSafeHeapNode[] threadSafeHeapNodeArr2 = this.f45053a;
        Intrinsics.c(threadSafeHeapNodeArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f45052b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i2 < atomicIntegerFieldUpdater.get(this)) {
            d(i2, atomicIntegerFieldUpdater.get(this));
            int i6 = (i2 - 1) / 2;
            if (i2 > 0) {
                ThreadSafeHeapNode threadSafeHeapNode5 = threadSafeHeapNodeArr2[i2];
                Intrinsics.c(threadSafeHeapNode5);
                ThreadSafeHeapNode threadSafeHeapNode6 = threadSafeHeapNodeArr2[i6];
                Intrinsics.c(threadSafeHeapNode6);
                if (((Comparable) threadSafeHeapNode5).compareTo(threadSafeHeapNode6) < 0) {
                    d(i2, i6);
                    c(i6);
                } else {
                    while (true) {
                        i3 = i2 * 2;
                        i4 = i3 + 1;
                        if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        threadSafeHeapNodeArr = this.f45053a;
                        Intrinsics.c(threadSafeHeapNodeArr);
                        i5 = i3 + 2;
                        if (i5 < atomicIntegerFieldUpdater.get(this)) {
                            threadSafeHeapNode3 = threadSafeHeapNodeArr[i5];
                            Intrinsics.c(threadSafeHeapNode3);
                            threadSafeHeapNode4 = threadSafeHeapNodeArr[i4];
                            Intrinsics.c(threadSafeHeapNode4);
                            if (((Comparable) threadSafeHeapNode3).compareTo(threadSafeHeapNode4) >= 0) {
                                i5 = i4;
                            }
                        } else {
                            i5 = i4;
                        }
                        threadSafeHeapNode = threadSafeHeapNodeArr[i2];
                        Intrinsics.c(threadSafeHeapNode);
                        threadSafeHeapNode2 = threadSafeHeapNodeArr[i5];
                        Intrinsics.c(threadSafeHeapNode2);
                        if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) <= 0) {
                            break;
                        }
                        d(i2, i5);
                        i2 = i5;
                    }
                }
            } else {
                while (true) {
                    i3 = i2 * 2;
                    i4 = i3 + 1;
                    if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    threadSafeHeapNodeArr = this.f45053a;
                    Intrinsics.c(threadSafeHeapNodeArr);
                    i5 = i3 + 2;
                    if (i5 < atomicIntegerFieldUpdater.get(this)) {
                        threadSafeHeapNode3 = threadSafeHeapNodeArr[i5];
                        Intrinsics.c(threadSafeHeapNode3);
                        threadSafeHeapNode4 = threadSafeHeapNodeArr[i4];
                        Intrinsics.c(threadSafeHeapNode4);
                        if (((Comparable) threadSafeHeapNode3).compareTo(threadSafeHeapNode4) >= 0) {
                            i5 = i4;
                        }
                    } else {
                        i5 = i4;
                    }
                    threadSafeHeapNode = threadSafeHeapNodeArr[i2];
                    Intrinsics.c(threadSafeHeapNode);
                    threadSafeHeapNode2 = threadSafeHeapNodeArr[i5];
                    Intrinsics.c(threadSafeHeapNode2);
                    if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) <= 0) {
                        break;
                        break;
                    }
                    d(i2, i5);
                    i2 = i5;
                }
            }
        }
        ThreadSafeHeapNode threadSafeHeapNode7 = threadSafeHeapNodeArr2[atomicIntegerFieldUpdater.get(this)];
        Intrinsics.c(threadSafeHeapNode7);
        threadSafeHeapNode7.b(null);
        threadSafeHeapNode7.setIndex(-1);
        threadSafeHeapNodeArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return threadSafeHeapNode7;
    }

    public final void c(int i2) {
        while (i2 > 0) {
            ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f45053a;
            Intrinsics.c(threadSafeHeapNodeArr);
            int i3 = (i2 - 1) / 2;
            ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i3];
            Intrinsics.c(threadSafeHeapNode);
            ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i2];
            Intrinsics.c(threadSafeHeapNode2);
            if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) <= 0) {
                return;
            }
            d(i2, i3);
            i2 = i3;
        }
    }

    public final void d(int i2, int i3) {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f45053a;
        Intrinsics.c(threadSafeHeapNodeArr);
        ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i3];
        Intrinsics.c(threadSafeHeapNode);
        ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i2];
        Intrinsics.c(threadSafeHeapNode2);
        threadSafeHeapNodeArr[i2] = threadSafeHeapNode;
        threadSafeHeapNodeArr[i3] = threadSafeHeapNode2;
        threadSafeHeapNode.setIndex(i2);
        threadSafeHeapNode2.setIndex(i3);
    }
}
