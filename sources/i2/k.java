package i2;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;
import l1.y;
import p1.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spatializer f42783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f42784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f42785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f42786d;

    public k(Context context, p pVar, Boolean bool) {
        AudioManager audioManagerU = context == null ? null : j1.f.u(context);
        if (audioManagerU == null || (bool != null && bool.booleanValue())) {
            this.f42783a = null;
            this.f42784b = false;
            this.f42785c = null;
            this.f42786d = null;
            return;
        }
        Spatializer spatializer = audioManagerU.getSpatializer();
        this.f42783a = spatializer;
        this.f42784b = spatializer.getImmersiveAudioLevel() != 0;
        j jVar = new j(pVar);
        this.f42786d = jVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        Handler handler = new Handler(looperMyLooper);
        this.f42785c = handler;
        spatializer.addOnSpatializerStateChangedListener(new z(handler, 1), jVar);
    }

    public final boolean a(i1.e eVar, i1.p pVar) {
        String str = pVar.f42643n;
        String str2 = pVar.f42643n;
        int i10 = pVar.F;
        if (Objects.equals(str, MimeTypes.AUDIO_E_AC3_JOC)) {
            if (i10 == 16) {
                i10 = 12;
            }
        } else if (Objects.equals(str2, "audio/iamf")) {
            if (i10 == -1) {
                i10 = 6;
            }
        } else if (Objects.equals(str2, "audio/ac4") && (i10 == 18 || i10 == 21)) {
            i10 = 24;
        }
        int iS = y.s(i10);
        if (iS == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iS);
        int i11 = pVar.G;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        Spatializer spatializer = this.f42783a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(eVar.a(), channelMask.build());
    }

    public final boolean b() {
        Spatializer spatializer = this.f42783a;
        spatializer.getClass();
        return spatializer.isAvailable();
    }

    public final boolean c() {
        Spatializer spatializer = this.f42783a;
        spatializer.getClass();
        return spatializer.isEnabled();
    }

    public final void d() {
        j jVar;
        Handler handler;
        Spatializer spatializer = this.f42783a;
        if (spatializer == null || (jVar = this.f42786d) == null || (handler = this.f42785c) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(jVar);
        handler.removeCallbacksAndMessages(null);
    }
}
