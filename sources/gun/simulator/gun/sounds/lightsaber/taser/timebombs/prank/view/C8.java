package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class C8 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f2912a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8(Context context, String str, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f2912a = context;
        this.b = str;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C8(this.f2912a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C8) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        boolean zBooleanValue = ((Boolean) ((C2856Wi) AbstractC3194cj.U.getValue()).a()).booleanValue();
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (!zBooleanValue) {
            return c5033xf0;
        }
        AssetFileDescriptor assetFileDescriptorOpenFd = null;
        try {
            try {
                try {
                    MediaPlayer mediaPlayer = BF.h;
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                        MediaPlayer mediaPlayer2 = BF.h;
                        if (mediaPlayer2 != null) {
                            mediaPlayer2.release();
                        }
                        BF.h = null;
                    }
                    assetFileDescriptorOpenFd = this.f2912a.getAssets().openFd(this.b);
                    MediaPlayer mediaPlayer3 = new MediaPlayer();
                    mediaPlayer3.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                    mediaPlayer3.setLooping(false);
                    mediaPlayer3.prepare();
                    mediaPlayer3.start();
                    BF.h = mediaPlayer3;
                    assetFileDescriptorOpenFd.close();
                } catch (Throwable th) {
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                if (assetFileDescriptorOpenFd != null) {
                    assetFileDescriptorOpenFd.close();
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        return c5033xf0;
    }
}
