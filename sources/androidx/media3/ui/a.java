package androidx.media3.ui;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ View f7752Y;

    public /* synthetic */ a(View view, int i2) {
        this.X = i2;
        this.f7752Y = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f7752Y;
        switch (this.X) {
            case 0:
                int i2 = DefaultTimeBar.T0;
                ((DefaultTimeBar) view).f(false);
                break;
            case 1:
                float[] fArr = PlayerControlView.C1;
                ((PlayerControlView) view).o();
                break;
            default:
                ((PlayerView) view).invalidate();
                break;
        }
    }
}
