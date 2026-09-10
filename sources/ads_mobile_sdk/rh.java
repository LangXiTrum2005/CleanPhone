package ads_mobile_sdk;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import com.ironsource.X3;
import kotlinx.coroutines.saran;
import p002kotlin.Pair;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.amphitheatre;

/* JADX INFO: loaded from: classes.dex */
public final class rh extends un {
    public final Context l;
    public final wf m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh(Context context, jk0 flags, wf appSettings, saran backgroundScope, amphitheatre clock, ri2 rootTraceCreator, x activityTracker) {
        super(clock, backgroundScope, rootTraceCreator, flags, activityTracker);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(appSettings, "appSettings");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        this.l = context;
        this.m = appSettings;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.AUDIO;
    }

    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        Pair pair;
        Double d;
        Double dSaneness;
        AudioManager audioManager = (AudioManager) this.l.getSystemService(AudioManager.class);
        int streamVolume = audioManager.getStreamVolume(3);
        jk0 jk0Var = this.f;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:normalized_device_volume:enabled", X3.i.W);
        if (((Boolean) jk0Var.a("gads:normalized_device_volume:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
            int streamMinVolume = Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0;
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            if (streamMinVolume > streamVolume || streamVolume > streamMaxVolume) {
                dSaneness = igo.attabal.saneness(-2.0d);
            } else {
                dSaneness = igo.attabal.saneness(streamMinVolume == streamMaxVolume ? 1.0d : ((double) ((int) ((((double) (streamVolume - streamMinVolume)) / ((double) (streamMaxVolume - streamMinVolume))) * 100.0d))) / 100.0d);
            }
            d = dSaneness;
            pair = new Pair(igo.attabal.wireman(streamMinVolume), igo.attabal.wireman(streamMaxVolume));
        } else {
            pair = null;
            d = null;
        }
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int ringerMode = audioManager.getRingerMode();
        int streamVolume2 = audioManager.getStreamVolume(2);
        wf wfVar = this.m;
        return new tn0(new qh(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, pair, ringerMode, streamVolume2, wfVar.c, wfVar.d, d));
    }
}
