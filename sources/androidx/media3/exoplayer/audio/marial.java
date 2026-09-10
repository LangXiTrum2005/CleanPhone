package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.media3.common.polloi;
import androidx.media3.common.rotuma;
import decarock.grimness;

/* JADX INFO: compiled from: DefaultAudioOffloadSupportProvider.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial implements DefaultAudioSink.wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f11710attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public Boolean f11711saneness;

    /* JADX INFO: compiled from: DefaultAudioOffloadSupportProvider.java */
    public static final class attabal {
        public static androidx.media3.exoplayer.audio.saneness attabal(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
            return !AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes) ? androidx.media3.exoplayer.audio.saneness.f11712wireman : new androidx.media3.exoplayer.audio.saneness.C0084saneness().marial(true).competently(z).wireman();
        }
    }

    /* JADX INFO: compiled from: DefaultAudioOffloadSupportProvider.java */
    public static final class saneness {
        public static androidx.media3.exoplayer.audio.saneness attabal(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return androidx.media3.exoplayer.audio.saneness.f11712wireman;
            }
            return new androidx.media3.exoplayer.audio.saneness.C0084saneness().marial(true).beachfront(grimness.f25080attabal > 32 && playbackOffloadSupport == 2).competently(z).wireman();
        }
    }

    public marial(Context context) {
        this.f11710attabal = context;
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.wireman
    public androidx.media3.exoplayer.audio.saneness attabal(polloi polloiVar, androidx.media3.common.saneness sanenessVar) {
        decarock.attabal.marial(polloiVar);
        decarock.attabal.marial(sanenessVar);
        int i = grimness.f25080attabal;
        if (i < 29 || polloiVar.f11219trm == -1) {
            return androidx.media3.exoplayer.audio.saneness.f11712wireman;
        }
        boolean zSaneness = saneness(this.f11710attabal);
        int iSaneness = rotuma.saneness((String) decarock.attabal.marial(polloiVar.f11218triweekly), polloiVar.f11192cutely);
        if (iSaneness == 0 || i < grimness.merc(iSaneness)) {
            return androidx.media3.exoplayer.audio.saneness.f11712wireman;
        }
        int iSeminary = grimness.seminary(polloiVar.f11215stratoscope);
        if (iSeminary == 0) {
            return androidx.media3.exoplayer.audio.saneness.f11712wireman;
        }
        try {
            AudioFormat audioFormatPolder = grimness.polder(polloiVar.f11219trm, iSeminary, iSaneness);
            return i >= 31 ? saneness.attabal(audioFormatPolder, sanenessVar.attabal().f11287attabal, zSaneness) : attabal.attabal(audioFormatPolder, sanenessVar.attabal().f11287attabal, zSaneness);
        } catch (IllegalArgumentException unused) {
            return androidx.media3.exoplayer.audio.saneness.f11712wireman;
        }
    }

    public final boolean saneness(Context context) {
        AudioManager audioManager;
        Boolean bool = this.f11711saneness;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
            this.f11711saneness = Boolean.FALSE;
        } else {
            String parameters = audioManager.getParameters("offloadVariableRateSupported");
            this.f11711saneness = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        }
        return this.f11711saneness.booleanValue();
    }
}
