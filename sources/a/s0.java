package A;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.view.ViewGroup;
import com.applovin.impl.C0935f0;
import com.inmobi.media.C3049h8;
import com.inmobi.media.C3193q8;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ int X = 1;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ int f3194Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object e0;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    public /* synthetic */ s0(C0935f0 c0935f0, SensorEventListener sensorEventListener, Sensor sensor, int i2, com.applovin.impl.sdk.o oVar) {
        this.Z = c0935f0;
        this.e0 = sensorEventListener;
        this.f0 = sensor;
        this.f3194Y = i2;
        this.g0 = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                C3193q8.a((C3193q8) this.Z, this.f3194Y, (ViewGroup) this.e0, (ViewGroup) this.f0, (C3049h8) this.g0);
                break;
            default:
                ((C0935f0) this.Z).a((SensorEventListener) this.e0, (Sensor) this.f0, this.f3194Y, (com.applovin.impl.sdk.o) this.g0);
                break;
        }
    }

    public /* synthetic */ s0(C3193q8 c3193q8, int i2, ViewGroup viewGroup, ViewGroup viewGroup2, C3049h8 c3049h8) {
        this.Z = c3193q8;
        this.f3194Y = i2;
        this.e0 = viewGroup;
        this.f0 = viewGroup2;
        this.g0 = c3049h8;
    }
}
