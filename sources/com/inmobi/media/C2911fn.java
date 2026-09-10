package com.inmobi.media;

import android.media.MediaPlayer;
import com.inmobi.media.C2911fn;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.flow.apical;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2911fn {
    public final MediaPlayer a;
    public final saran b;
    public final long c;
    public final apical d;
    public final AtomicBoolean e;
    public monroe f;
    public int g;

    public C2911fn(MediaPlayer mediaPlayer, saran coroutineScope, long j, apical progressEvents) {
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(progressEvents, "progressEvents");
        this.a = mediaPlayer;
        this.b = coroutineScope;
        this.c = j;
        this.d = progressEvents;
        this.e = new AtomicBoolean(false);
        this.g = -1;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:60:0x0103  */
    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    /* JADX WARN: Code duplicated, block: B:64:0x010b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0112 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:68:0x0115  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static final Object a(C2911fn c2911fn, ContinuationImpl continuationImpl) {
        C2860dn c2860dn;
        boolean zIsPlaying;
        int currentPosition;
        Object objEmit;
        int i;
        Object objEmit2;
        int i2;
        Object objEmit3;
        c2911fn.getClass();
        if (continuationImpl instanceof C2860dn) {
            c2860dn = (C2860dn) continuationImpl;
            int i3 = c2860dn.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2860dn.e = i3 - Integer.MIN_VALUE;
            } else {
                c2860dn = new C2860dn(c2911fn, continuationImpl);
            }
        } else {
            c2860dn = new C2860dn(c2911fn, continuationImpl);
        }
        Object obj = c2860dn.c;
        Object objBeachfront = attabal.beachfront();
        int i4 = c2860dn.e;
        if (i4 == 0) {
            dern.saneness(obj);
            MediaPlayer mediaPlayer = c2911fn.a;
            Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
            try {
                zIsPlaying = mediaPlayer.isPlaying();
            } catch (IllegalStateException unused) {
                zIsPlaying = false;
            }
            if (zIsPlaying) {
                currentPosition = c2911fn.a.getCurrentPosition();
                int duration = c2911fn.a.getDuration();
                if (duration == -1) {
                    return Unit.f29295attabal;
                }
                int i5 = duration > 0 ? (currentPosition * 100) / duration : 0;
                if (c2911fn.g == 4 && i5 < 25) {
                    c2911fn.g = -1;
                }
                c2860dn.a = currentPosition;
                c2860dn.b = i5;
                c2860dn.e = 1;
                if (c2911fn.g >= 0) {
                    objEmit = Unit.f29295attabal;
                } else {
                    c2911fn.g = 0;
                    objEmit = c2911fn.d.emit(new C3036kn(duration), c2860dn);
                    if (objEmit != attabal.beachfront()) {
                        objEmit = Unit.f29295attabal;
                    }
                }
                if (objEmit == objBeachfront) {
                    return objBeachfront;
                }
                i = i5;
                c2860dn.a = currentPosition;
                c2860dn.b = i;
                c2860dn.e = 2;
                if (c2911fn.a(i, 25, 1)) {
                    c2911fn.g = 1;
                    objEmit2 = c2911fn.d.emit(C3359xm.a, c2860dn);
                    if (objEmit2 != attabal.beachfront()) {
                        objEmit2 = Unit.f29295attabal;
                    }
                } else if (c2911fn.a(i, 50, 2)) {
                    c2911fn.g = 2;
                    objEmit2 = c2911fn.d.emit(C2986in.a, c2860dn);
                    if (objEmit2 != attabal.beachfront()) {
                        objEmit2 = Unit.f29295attabal;
                    }
                } else if (c2911fn.a(i, 75, 3)) {
                    c2911fn.g = 3;
                    objEmit2 = c2911fn.d.emit(C3210rn.a, c2860dn);
                    if (objEmit2 != attabal.beachfront()) {
                        objEmit2 = Unit.f29295attabal;
                    }
                } else {
                    objEmit2 = Unit.f29295attabal;
                }
                if (objEmit2 == objBeachfront) {
                    return objBeachfront;
                }
                i2 = currentPosition;
                c2860dn.e = 3;
                if (c2911fn.g != 4) {
                    objEmit3 = Unit.f29295attabal;
                } else {
                    objEmit3 = Unit.f29295attabal;
                }
                if (objEmit3 == objBeachfront) {
                    return objBeachfront;
                }
            }
        } else if (i4 == 1) {
            i = c2860dn.b;
            int i6 = c2860dn.a;
            dern.saneness(obj);
            currentPosition = i6;
            c2860dn.a = currentPosition;
            c2860dn.b = i;
            c2860dn.e = 2;
            if (c2911fn.a(i, 25, 1)) {
                c2911fn.g = 1;
                objEmit2 = c2911fn.d.emit(C3359xm.a, c2860dn);
                if (objEmit2 != attabal.beachfront()) {
                    objEmit2 = Unit.f29295attabal;
                }
            } else if (c2911fn.a(i, 50, 2)) {
                c2911fn.g = 2;
                objEmit2 = c2911fn.d.emit(C2986in.a, c2860dn);
                if (objEmit2 != attabal.beachfront()) {
                    objEmit2 = Unit.f29295attabal;
                }
            } else if (c2911fn.a(i, 75, 3)) {
                c2911fn.g = 3;
                objEmit2 = c2911fn.d.emit(C3210rn.a, c2860dn);
                if (objEmit2 != attabal.beachfront()) {
                    objEmit2 = Unit.f29295attabal;
                }
            } else {
                objEmit2 = Unit.f29295attabal;
            }
            if (objEmit2 == objBeachfront) {
                return objBeachfront;
            }
            i2 = currentPosition;
            c2860dn.e = 3;
            if (c2911fn.g != 4) {
                objEmit3 = Unit.f29295attabal;
            } else {
                objEmit3 = Unit.f29295attabal;
            }
            if (objEmit3 == objBeachfront) {
                return objBeachfront;
            }
        } else if (i4 == 2) {
            i = c2860dn.b;
            i2 = c2860dn.a;
            dern.saneness(obj);
            c2860dn.e = 3;
            if (c2911fn.g != 4 || (objEmit3 = c2911fn.d.emit(new Xm(i2, i), c2860dn)) != attabal.beachfront()) {
                objEmit3 = Unit.f29295attabal;
            }
            if (objEmit3 == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i4 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }

    public final void b() {
        if (this.e.getAndSet(true)) {
            return;
        }
        this.f = cutely.wireman(this.b, null, null, new C2885en(this, null), 3, null);
        a();
    }

    public final void c() {
        if (this.e.getAndSet(false)) {
            this.a.setOnCompletionListener(null);
            H6.a(this.f);
            this.f = null;
        }
    }

    public final void a() {
        this.a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: adsuki.endosteum
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                C2911fn.a(this.f3422kowloon, mediaPlayer);
            }
        });
    }

    public static final void a(C2911fn c2911fn, MediaPlayer mediaPlayer) {
        c2911fn.g = 4;
        cutely.wireman(c2911fn.b, null, null, new C2834cn(c2911fn, null), 3, null);
    }

    public final boolean a(int i, int i2, int i3) {
        return i3 >= -1 && i3 <= 4 && i >= i2 && this.g == i3 - 1;
    }
}
