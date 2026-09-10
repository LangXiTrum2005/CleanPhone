package A;

import android.media.MediaPlayer;
import com.chartboost.sdk.impl.a1;
import com.inmobi.media.C3114l9;

/* JADX INFO: renamed from: A.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C0890f0 implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f3175Y;

    public /* synthetic */ C0890f0(Object obj, int i2) {
        this.X = i2;
        this.f3175Y = obj;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        switch (this.X) {
            case 0:
                C3114l9.a((C3114l9) this.f3175Y, mediaPlayer);
                break;
            default:
                a1.a((a1) this.f3175Y, mediaPlayer);
                break;
        }
    }
}
