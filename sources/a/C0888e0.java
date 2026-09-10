package A;

import android.media.MediaPlayer;
import android.view.View;
import com.inmobi.media.C3114l9;
import com.inmobi.media.C3271v7;

/* JADX INFO: renamed from: A.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C0888e0 implements MediaPlayer.OnVideoSizeChangedListener {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ View f3173Y;

    public /* synthetic */ C0888e0(View view, int i2) {
        this.X = i2;
        this.f3173Y = view;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        switch (this.X) {
            case 0:
                C3114l9.c((C3114l9) this.f3173Y, mediaPlayer, i2, i3);
                break;
            default:
                C3271v7.a((C3271v7) this.f3173Y, mediaPlayer, i2, i3);
                break;
        }
    }
}
