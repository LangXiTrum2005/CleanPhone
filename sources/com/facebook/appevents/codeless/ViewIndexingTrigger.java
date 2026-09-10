package com.facebook.appevents.codeless;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import androidx.core.app.NotificationCompat;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import v7.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/facebook/appevents/codeless/ViewIndexingTrigger;", "Landroid/hardware/SensorEventListener;", "<init>", "()V", "Lcom/facebook/appevents/codeless/ViewIndexingTrigger$OnShakeListener;", "listener", "Lwj/r;", "setOnShakeListener", "(Lcom/facebook/appevents/codeless/ViewIndexingTrigger$OnShakeListener;)V", "Landroid/hardware/SensorEvent;", NotificationCompat.CATEGORY_EVENT, "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "onShakeListener", "Lcom/facebook/appevents/codeless/ViewIndexingTrigger$OnShakeListener;", "Companion", "OnShakeListener", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ViewIndexingTrigger implements SensorEventListener {
    private static final double SHAKE_THRESHOLD_GRAVITY = 2.3d;
    private OnShakeListener onShakeListener;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/appevents/codeless/ViewIndexingTrigger$OnShakeListener;", "", "Lwj/r;", "onShake", "()V", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public interface OnShakeListener {
        void onShake();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        if (a.b(this)) {
            return;
        }
        try {
            n.f(sensor, "sensor");
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        if (a.b(this)) {
            return;
        }
        try {
            n.f(event, "event");
            OnShakeListener onShakeListener = this.onShakeListener;
            if (onShakeListener != null) {
                float[] fArr = event.values;
                double d10 = fArr[0] / 9.80665f;
                double d11 = fArr[1] / 9.80665f;
                double d12 = fArr[2] / 9.80665f;
                if (Math.sqrt((d12 * d12) + (d11 * d11) + (d10 * d10)) > SHAKE_THRESHOLD_GRAVITY) {
                    onShakeListener.onShake();
                }
            }
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    public final void setOnShakeListener(OnShakeListener listener) {
        if (a.b(this)) {
            return;
        }
        try {
            this.onShakeListener = listener;
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }
}
