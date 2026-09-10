package A;

import android.media.MediaPlayer;
import com.chartboost.sdk.impl.a1;
import com.inmobi.media.C3114l9;

/* JADX INFO: renamed from: A.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C0896i0 implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f3178Y;

    public /* synthetic */ C0896i0(Object obj, int i2) {
        this.X = i2;
        this.f3178Y = obj;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        switch (this.X) {
            case 0:
                return C3114l9.a((C3114l9) this.f3178Y, mediaPlayer, i2, i3);
            default:
                return a1.b((a1) this.f3178Y, mediaPlayer, i2, i3);
        }
    }
}
