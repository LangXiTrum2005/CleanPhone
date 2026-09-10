package com.inmobi.media;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes5.dex */
public final class G8 extends MediaPlayer {
    public static final Object d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static G8 f22843e;
    public static int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public G8 f22846c;

    public final void a() {
        if (3 == this.f22844a) {
            return;
        }
        synchronized (d) {
            int i2 = f;
            if (i2 < 5) {
                this.f22846c = f22843e;
                f22843e = this;
                f = i2 + 1;
            }
        }
    }
}
