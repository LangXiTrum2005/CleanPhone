package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class PlaylistTimeline extends AbstractConcatenatedTimeline {
    public final int f0;
    public final int g0;
    public final int[] h0;
    public final int[] i0;
    public final Timeline[] j0;
    public final Object[] k0;
    public final HashMap l0;

    public PlaylistTimeline(ArrayList arrayList, ShuffleOrder shuffleOrder) {
        super(shuffleOrder);
        int size = arrayList.size();
        this.h0 = new int[size];
        this.i0 = new int[size];
        this.j0 = new Timeline[size];
        this.k0 = new Object[size];
        this.l0 = new HashMap();
        Iterator it = arrayList.iterator();
        int iO = 0;
        int iH = 0;
        int i2 = 0;
        while (it.hasNext()) {
            MediaSourceInfoHolder mediaSourceInfoHolder = (MediaSourceInfoHolder) it.next();
            this.j0[i2] = mediaSourceInfoHolder.b();
            this.i0[i2] = iO;
            this.h0[i2] = iH;
            iO += this.j0[i2].o();
            iH += this.j0[i2].h();
            this.k0[i2] = mediaSourceInfoHolder.a();
            this.l0.put(this.k0[i2], Integer.valueOf(i2));
            i2++;
        }
        this.f0 = iO;
        this.g0 = iH;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int h() {
        return this.g0;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int o() {
        return this.f0;
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final int q(Object obj) {
        Integer num = (Integer) this.l0.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final int r(int i2) {
        return Util.e(this.h0, i2 + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final int s(int i2) {
        return Util.e(this.i0, i2 + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final Object t(int i2) {
        return this.k0[i2];
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final int u(int i2) {
        return this.h0[i2];
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final int v(int i2) {
        return this.i0[i2];
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final Timeline x(int i2) {
        return this.j0[i2];
    }
}
