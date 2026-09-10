package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.util.Util;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Handler.Callback {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ CompositeMediaSource f18435Y;

    public /* synthetic */ b(CompositeMediaSource compositeMediaSource, int i2) {
        this.X = i2;
        this.f18435Y = compositeMediaSource;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.X) {
            case 0:
                MediaItem mediaItem = ConcatenatingMediaSource.o0;
                ConcatenatingMediaSource concatenatingMediaSource = (ConcatenatingMediaSource) this.f18435Y;
                concatenatingMediaSource.getClass();
                int i2 = message.what;
                if (i2 == 0) {
                    Object obj = message.obj;
                    int i3 = Util.f18979a;
                    ((ConcatenatingMediaSource.MessageData) obj).getClass();
                    throw null;
                }
                if (i2 == 1) {
                    Object obj2 = message.obj;
                    int i4 = Util.f18979a;
                    ((ConcatenatingMediaSource.MessageData) obj2).getClass();
                    throw null;
                }
                if (i2 == 2) {
                    Object obj3 = message.obj;
                    int i5 = Util.f18979a;
                    ShuffleOrder shuffleOrder = concatenatingMediaSource.n0;
                    ((ConcatenatingMediaSource.MessageData) obj3).getClass();
                    concatenatingMediaSource.n0 = shuffleOrder.cloneAndRemove(1);
                    throw null;
                }
                if (i2 == 3) {
                    Object obj4 = message.obj;
                    int i6 = Util.f18979a;
                    ((ConcatenatingMediaSource.MessageData) obj4).getClass();
                    concatenatingMediaSource.n0 = null;
                    if (!concatenatingMediaSource.m0) {
                        concatenatingMediaSource.l0.obtainMessage(4).sendToTarget();
                        concatenatingMediaSource.m0 = true;
                    }
                    return true;
                }
                if (i2 == 4) {
                    concatenatingMediaSource.m0 = false;
                    new HashSet();
                    new ConcatenatingMediaSource.ConcatenatedTimeline(concatenatingMediaSource.n0);
                    throw null;
                }
                if (i2 != 5) {
                    throw new IllegalStateException();
                }
                Object obj5 = message.obj;
                int i7 = Util.f18979a;
                Set set = (Set) obj5;
                synchronized (concatenatingMediaSource) {
                    try {
                        Iterator it = set.iterator();
                        if (!it.hasNext()) {
                            throw null;
                        }
                        ((ConcatenatingMediaSource.HandlerAndRunnable) it.next()).getClass();
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                ConcatenatingMediaSource2 concatenatingMediaSource2 = (ConcatenatingMediaSource2) this.f18435Y;
                concatenatingMediaSource2.getClass();
                if (message.what != 0) {
                    return true;
                }
                concatenatingMediaSource2.m0 = false;
                ConcatenatingMediaSource2.c0();
                throw null;
        }
    }
}
