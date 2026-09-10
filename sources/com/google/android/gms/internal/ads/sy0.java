package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sy0 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f20079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f20080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AudioManager f20081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f20082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f20083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ExecutorService f20084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bz0 f20085g;

    public sy0(Handler handler, Context context, bz0 bz0Var) {
        super(handler);
        this.f20082d = new AtomicReference(Float.valueOf(-1.0f));
        this.f20083e = new AtomicBoolean(false);
        this.f20084f = Executors.newSingleThreadExecutor();
        this.f20079a = handler;
        this.f20080b = context;
        this.f20081c = (AudioManager) context.getSystemService("audio");
        this.f20085g = bz0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        if (this.f20083e.getAndSet(true)) {
            return;
        }
        this.f20084f.submit(new ry0(this, 0));
    }
}
