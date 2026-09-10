package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f19818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f19819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f19820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f19821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f19822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f19823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f19824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f19825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f19826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f19827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f19828k;

    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f19818a++;
            this.f19824g = 0.0d;
            this.f19822e = motionEvent.getRawX();
            this.f19823f = motionEvent.getRawY();
            this.f19825h = motionEvent.getX();
            this.f19826i = motionEvent.getY();
            this.f19827j = motionEvent.getRawX();
            this.f19828k = motionEvent.getRawY();
            return;
        }
        if (action == 1) {
            this.f19820c++;
            this.f19824g = Math.hypot(((double) motionEvent.getRawX()) - this.f19822e, ((double) motionEvent.getRawY()) - this.f19823f) + this.f19824g;
            this.f19822e = motionEvent.getRawX();
            this.f19823f = motionEvent.getRawY();
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            this.f19821d++;
            return;
        }
        this.f19819b += (long) (motionEvent.getHistorySize() + 1);
        this.f19824g = Math.hypot(((double) motionEvent.getRawX()) - this.f19822e, ((double) motionEvent.getRawY()) - this.f19823f) + this.f19824g;
        this.f19822e = motionEvent.getRawX();
        this.f19823f = motionEvent.getRawY();
    }
}
