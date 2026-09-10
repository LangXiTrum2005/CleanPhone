package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMediaSource implements MediaSource {
    public final ArrayList X = new ArrayList(1);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final HashSet f6339Y = new HashSet(1);
    public final MediaSourceEventListener.EventDispatcher Z = new MediaSourceEventListener.EventDispatcher(new CopyOnWriteArrayList(), 0, null);
    public final DrmSessionEventListener.EventDispatcher e0 = new DrmSessionEventListener.EventDispatcher(new CopyOnWriteArrayList(), 0, null);
    public Looper f0;
    public Timeline g0;
    public PlayerId h0;

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void C(Handler handler, DrmSessionEventListener drmSessionEventListener) {
        handler.getClass();
        this.e0.a(handler, drmSessionEventListener);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void F(DrmSessionEventListener drmSessionEventListener) {
        this.e0.g(drmSessionEventListener);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void I(MediaSource.MediaSourceCaller mediaSourceCaller, TransferListener transferListener, PlayerId playerId) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f0;
        Assertions.b(looper == null || looper == looperMyLooper);
        this.h0 = playerId;
        Timeline timeline = this.g0;
        this.X.add(mediaSourceCaller);
        if (this.f0 == null) {
            this.f0 = looperMyLooper;
            this.f6339Y.add(mediaSourceCaller);
            X(transferListener);
        } else if (timeline != null) {
            L(mediaSourceCaller);
            mediaSourceCaller.u(this, timeline);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void L(MediaSource.MediaSourceCaller mediaSourceCaller) {
        this.f0.getClass();
        HashSet hashSet = this.f6339Y;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(mediaSourceCaller);
        if (zIsEmpty) {
            V();
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void Q(MediaSource.MediaSourceCaller mediaSourceCaller) {
        ArrayList arrayList = this.X;
        arrayList.remove(mediaSourceCaller);
        if (!arrayList.isEmpty()) {
            R(mediaSourceCaller);
            return;
        }
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
        this.f6339Y.clear();
        Z();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void R(MediaSource.MediaSourceCaller mediaSourceCaller) {
        HashSet hashSet = this.f6339Y;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(mediaSourceCaller);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        U();
    }

    public void U() {
    }

    public void V() {
    }

    public void W(Timeline timeline) {
        Y(timeline);
    }

    public abstract void X(TransferListener transferListener);

    public final void Y(Timeline timeline) {
        this.g0 = timeline;
        Iterator it = this.X.iterator();
        while (it.hasNext()) {
            ((MediaSource.MediaSourceCaller) it.next()).u(this, timeline);
        }
    }

    public abstract void Z();

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void v(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
        handler.getClass();
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.Z;
        eventDispatcher.getClass();
        MediaSourceEventListener.EventDispatcher.ListenerAndHandler listenerAndHandler = new MediaSourceEventListener.EventDispatcher.ListenerAndHandler();
        listenerAndHandler.f6391a = handler;
        listenerAndHandler.f6392b = mediaSourceEventListener;
        eventDispatcher.f6390c.add(listenerAndHandler);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void x(MediaSourceEventListener mediaSourceEventListener) {
        CopyOnWriteArrayList<MediaSourceEventListener.EventDispatcher.ListenerAndHandler> copyOnWriteArrayList = this.Z.f6390c;
        for (MediaSourceEventListener.EventDispatcher.ListenerAndHandler listenerAndHandler : copyOnWriteArrayList) {
            if (listenerAndHandler.f6392b == mediaSourceEventListener) {
                copyOnWriteArrayList.remove(listenerAndHandler);
            }
        }
    }
}
