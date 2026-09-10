package com.startapp.sdk.internal;

import android.hardware.SensorEvent;
import com.startapp.motiondetector.TravelRecognizer;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public final class qc extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingDeque f41401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelRecognizer f41402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f41403c;
    public final AtomicLong d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicLong f41404e;

    public qc(String str, MotionMetadata motionMetadata, int i2, double d, long j) {
        super(str);
        this.f41403c = new AtomicLong(Double.doubleToRawLongBits(0.0d));
        this.d = new AtomicLong(Double.doubleToRawLongBits(0.0d));
        this.f41404e = new AtomicLong(0L);
        TravelRecognizer travelRecognizer = new TravelRecognizer(motionMetadata.f(), motionMetadata.g(), motionMetadata.h(), motionMetadata.i(), motionMetadata.s(), motionMetadata.t(), motionMetadata.d(), motionMetadata.e(), motionMetadata.b(), motionMetadata.a(), motionMetadata.c(), motionMetadata.o(), motionMetadata.p(), motionMetadata.m(), motionMetadata.l(), motionMetadata.n());
        this.f41402b = travelRecognizer;
        travelRecognizer.setTravelProbabilityMaximum(d, j);
        this.f41401a = new LinkedBlockingDeque(i2);
    }

    public final boolean a(SensorEvent sensorEvent) {
        return this.f41401a.offer(sensorEvent);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                SensorEvent sensorEvent = (SensorEvent) this.f41401a.take();
                if (sensorEvent == null) {
                    return;
                }
                TravelRecognizer travelRecognizer = this.f41402b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = sensorEvent.timestamp;
                float[] fArr = sensorEvent.values;
                travelRecognizer.add(jCurrentTimeMillis, j, fArr[0], fArr[1], fArr[2]);
                this.f41403c.set(Double.doubleToRawLongBits(this.f41402b.getTravelProbability()));
                this.d.set(Double.doubleToRawLongBits(this.f41402b.getTravelProbabilityMaximumValue()));
                this.f41404e.set(this.f41402b.getTravelProbabilityMaximumTime());
            } catch (InterruptedException unused) {
                return;
            } catch (Throwable th) {
                g9.a(th);
                return;
            }
        }
    }
}
