package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.p0;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f7411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ClickRecognitionState f7414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f7415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PointF f7416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f7418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final OnClickListener f7419i;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface OnClickListener {
        void onClick(View view, MotionEvent motionEvent);
    }

    public AppLovinTouchToClickListener(com.applovin.impl.sdk.l lVar, z4 z4Var, Context context, OnClickListener onClickListener) {
        this.f7411a = ((Long) lVar.a(z4.f10115c0)).longValue();
        this.f7412b = ((Integer) lVar.a(z4.f10122d0)).intValue();
        this.f7413c = AppLovinSdkUtils.dpToPx(context, ((Integer) lVar.a(z4.f10157h0)).intValue());
        this.f7414d = ClickRecognitionState.values()[((Integer) lVar.a(z4Var)).intValue()];
        this.f7418h = context;
        this.f7419i = onClickListener;
    }

    private void a(View view, MotionEvent motionEvent) {
        this.f7419i.onClick(view, motionEvent);
        this.f7417g = true;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.f7417g && this.f7414d == ClickRecognitionState.ACTION_POINTER_UP) {
                    a(view, motionEvent);
                }
            } else if (!this.f7417g && this.f7414d == ClickRecognitionState.ACTION_UP) {
                a(view, motionEvent);
            } else if (this.f7414d == ClickRecognitionState.DISABLED) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f7415e;
                float fA = a(this.f7416f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.f7417g) {
                    long j10 = this.f7411a;
                    if ((j10 < 0 || jElapsedRealtime < j10) && ((i10 = this.f7412b) < 0 || fA < i10)) {
                        a(view, motionEvent);
                    }
                }
            }
        } else if (this.f7414d != ClickRecognitionState.ACTION_DOWN) {
            this.f7415e = SystemClock.elapsedRealtime();
            this.f7416f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.f7417g = false;
        } else if (a(motionEvent)) {
            a(view, motionEvent);
        }
        return true;
    }

    private float a(PointF pointF, PointF pointF2) {
        float f10 = pointF.x - pointF2.x;
        float f11 = pointF.y - pointF2.y;
        return a((float) Math.sqrt((f11 * f11) + (f10 * f10)));
    }

    private float a(float f10) {
        return f10 / this.f7418h.getResources().getDisplayMetrics().density;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.f7413c <= 0) {
            return true;
        }
        Point pointB = p0.b(this.f7418h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i10 = this.f7413c;
        float f10 = i10;
        return rawX >= f10 && rawY >= f10 && rawX <= ((float) (pointB.x - i10)) && rawY <= ((float) (pointB.y - i10));
    }
}
