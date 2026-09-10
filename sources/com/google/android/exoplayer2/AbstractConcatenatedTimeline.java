package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.source.ShuffleOrder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractConcatenatedTimeline extends Timeline {
    public static final /* synthetic */ int e0 = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f16985Y;
    public final ShuffleOrder Z;

    public AbstractConcatenatedTimeline(ShuffleOrder shuffleOrder) {
        this.Z = shuffleOrder;
        this.f16985Y = shuffleOrder.getLength();
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int a(boolean z2) {
        if (this.f16985Y != 0) {
            int firstIndex = z2 ? this.Z.getFirstIndex() : 0;
            while (x(firstIndex).p()) {
                firstIndex = w(firstIndex, z2);
                if (firstIndex == -1) {
                }
            }
            return x(firstIndex).a(z2) + v(firstIndex);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int iQ = q(obj2);
            if (iQ != -1 && (iB = x(iQ).b(obj3)) != -1) {
                return u(iQ) + iB;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int c(boolean z2) {
        int i2 = this.f16985Y;
        if (i2 != 0) {
            ShuffleOrder shuffleOrder = this.Z;
            int lastIndex = z2 ? shuffleOrder.getLastIndex() : i2 - 1;
            while (x(lastIndex).p()) {
                if (z2) {
                    lastIndex = shuffleOrder.getPreviousIndex(lastIndex);
                } else {
                    lastIndex = lastIndex > 0 ? lastIndex - 1 : -1;
                }
                if (lastIndex == -1) {
                }
            }
            return x(lastIndex).c(z2) + v(lastIndex);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int e(int i2, int i3, boolean z2) {
        int iS = s(i2);
        int iV = v(iS);
        int iE = x(iS).e(i2 - iV, i3 == 2 ? 0 : i3, z2);
        if (iE != -1) {
            return iV + iE;
        }
        int iW = w(iS, z2);
        while (iW != -1 && x(iW).p()) {
            iW = w(iW, z2);
        }
        if (iW != -1) {
            return x(iW).a(z2) + v(iW);
        }
        if (i3 == 2) {
            return a(z2);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
        int iR = r(i2);
        int iV = v(iR);
        x(iR).f(i2 - u(iR), period, z2);
        period.Z += iV;
        if (z2) {
            Object objT = t(iR);
            Object obj = period.f17208Y;
            obj.getClass();
            period.f17208Y = Pair.create(objT, obj);
        }
        return period;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Timeline.Period g(Object obj, Timeline.Period period) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ = q(obj2);
        int iV = v(iQ);
        x(iQ).g(obj3, period);
        period.Z += iV;
        period.f17208Y = obj;
        return period;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x002b, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002b, code lost:
    
        r0 = r0 - 1;
     */
    @Override // com.google.android.exoplayer2.Timeline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int k(int r6, int r7, boolean r8) {
        /*
            r5 = this;
            int r0 = r5.s(r6)
            int r1 = r5.v(r0)
            com.google.android.exoplayer2.Timeline r2 = r5.x(r0)
            int r6 = r6 - r1
            r3 = 2
            if (r7 != r3) goto L12
            r4 = 0
            goto L13
        L12:
            r4 = r7
        L13:
            int r6 = r2.k(r6, r4, r8)
            r2 = -1
            if (r6 == r2) goto L1c
            int r1 = r1 + r6
            return r1
        L1c:
            com.google.android.exoplayer2.source.ShuffleOrder r6 = r5.Z
            if (r8 == 0) goto L25
            int r0 = r6.getPreviousIndex(r0)
            goto L2b
        L25:
            if (r0 <= 0) goto L2a
        L27:
            int r0 = r0 + (-1)
            goto L2b
        L2a:
            r0 = r2
        L2b:
            if (r0 == r2) goto L41
            com.google.android.exoplayer2.Timeline r1 = r5.x(r0)
            boolean r1 = r1.p()
            if (r1 == 0) goto L41
            if (r8 == 0) goto L3e
            int r0 = r6.getPreviousIndex(r0)
            goto L2b
        L3e:
            if (r0 <= 0) goto L2a
            goto L27
        L41:
            if (r0 == r2) goto L51
            int r6 = r5.v(r0)
            com.google.android.exoplayer2.Timeline r7 = r5.x(r0)
            int r7 = r7.c(r8)
            int r7 = r7 + r6
            return r7
        L51:
            if (r7 != r3) goto L58
            int r6 = r5.c(r8)
            return r6
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.AbstractConcatenatedTimeline.k(int, int, boolean):int");
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Object l(int i2) {
        int iR = r(i2);
        return Pair.create(t(iR), x(iR).l(i2 - u(iR)));
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Timeline.Window m(int i2, Timeline.Window window, long j) {
        int iS = s(i2);
        int iV = v(iS);
        int iU = u(iS);
        x(iS).m(i2 - iV, window, j);
        Object objT = t(iS);
        if (!Timeline.Window.r0.equals(window.X)) {
            objT = Pair.create(objT, window.X);
        }
        window.X = objT;
        window.o0 += iU;
        window.p0 += iU;
        return window;
    }

    public abstract int q(Object obj);

    public abstract int r(int i2);

    public abstract int s(int i2);

    public abstract Object t(int i2);

    public abstract int u(int i2);

    public abstract int v(int i2);

    public final int w(int i2, boolean z2) {
        if (z2) {
            return this.Z.getNextIndex(i2);
        }
        if (i2 < this.f16985Y - 1) {
            return i2 + 1;
        }
        return -1;
    }

    public abstract Timeline x(int i2);
}
