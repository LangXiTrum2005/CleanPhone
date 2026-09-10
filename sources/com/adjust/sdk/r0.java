package com.adjust.sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6911b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedBlockingQueue f6912c = new LinkedBlockingQueue(1);

    public r0(long j10) {
        this.f6910a = j10;
    }

    public final IBinder a() {
        if (this.f6911b) {
            throw new IllegalStateException();
        }
        this.f6911b = true;
        return (IBinder) this.f6912c.poll(this.f6910a, TimeUnit.MILLISECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f6912c.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
