package p008p;

import android.view.View;
import com.chartboost.sdk.impl.m;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ m f45286Y;
    public final /* synthetic */ View Z;

    public /* synthetic */ h(m mVar, View view, int i2) {
        this.X = i2;
        this.f45286Y = mVar;
        this.Z = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                m.b(this.f45286Y, this.Z);
                break;
            default:
                m.a(this.f45286Y, this.Z);
                break;
        }
    }
}
