package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseMediaSource implements MediaSource {
    public final ArrayList X = new ArrayList(1);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final HashSet f18315Y = new HashSet(1);
    public final MediaSourceEventListener.EventDispatcher Z = new MediaSourceEventListener.EventDispatcher(new CopyOnWriteArrayList(), 0, null);
    public final DrmSessionEventListener.EventDispatcher e0 = new DrmSessionEventListener.EventDispatcher(new CopyOnWriteArrayList(), 0, null);
    public Looper f0;
    public Timeline g0;
    public PlayerId h0;

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void A(MediaSource.MediaSourceCaller mediaSourceCaller, TransferListener transferListener, PlayerId playerId) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f0;
        Assertions.b(looper == null || looper == looperMyLooper);
        this.h0 = playerId;
        Timeline timeline = this.g0;
        this.X.add(mediaSourceCaller);
        if (this.f0 == null) {
            this.f0 = looperMyLooper;
            this.f18315Y.add(mediaSourceCaller);
            T(transferListener);
        } else if (timeline != null) {
            C(mediaSourceCaller);
            mediaSourceCaller.F(this, timeline);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void C(MediaSource.MediaSourceCaller mediaSourceCaller) {
        this.f0.getClass();
        HashSet hashSet = this.f18315Y;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(mediaSourceCaller);
        if (zIsEmpty) {
            R();
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void H(MediaSource.MediaSourceCaller mediaSourceCaller) {
        HashSet hashSet = this.f18315Y;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(mediaSourceCaller);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        Q();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void I(Handler handler, DrmSessionEventListener drmSessionEventListener) {
        handler.getClass();
        this.e0.a(handler, drmSessionEventListener);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void J(DrmSessionEventListener drmSessionEventListener) {
        this.e0.g(drmSessionEventListener);
    }

    public void Q() {
    }

    public void R() {
    }

    public void S(Timeline timeline) {
        U(timeline);
    }

    public abstract void T(TransferListener transferListener);

    public final void U(Timeline timeline) {
        this.g0 = timeline;
        Iterator it = this.X.iterator();
        while (it.hasNext()) {
            ((MediaSource.MediaSourceCaller) it.next()).F(this, timeline);
        }
    }

    public abstract void V();

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void w(MediaSource.MediaSourceCaller mediaSourceCaller) {
        ArrayList arrayList = this.X;
        arrayList.remove(mediaSourceCaller);
        if (!arrayList.isEmpty()) {
            H(mediaSourceCaller);
            return;
        }
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
        this.f18315Y.clear();
        V();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void x(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
        handler.getClass();
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.Z;
        eventDispatcher.getClass();
        MediaSourceEventListener.EventDispatcher.ListenerAndHandler listenerAndHandler = new MediaSourceEventListener.EventDispatcher.ListenerAndHandler();
        listenerAndHandler.f18354a = handler;
        listenerAndHandler.f18355b = mediaSourceEventListener;
        eventDispatcher.f18353c.add(listenerAndHandler);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void y(MediaSourceEventListener mediaSourceEventListener) {
        CopyOnWriteArrayList<MediaSourceEventListener.EventDispatcher.ListenerAndHandler> copyOnWriteArrayList = this.Z.f18353c;
        for (MediaSourceEventListener.EventDispatcher.ListenerAndHandler listenerAndHandler : copyOnWriteArrayList) {
            if (listenerAndHandler.f18355b == mediaSourceEventListener) {
                copyOnWriteArrayList.remove(listenerAndHandler);
            }
        }
    }
}
