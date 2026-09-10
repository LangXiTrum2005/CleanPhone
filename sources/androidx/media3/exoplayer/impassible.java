package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: compiled from: AudioFocusManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final AudioManager f11930attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f11931beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public saneness f11933dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public AudioFocusRequest f11934impromptu;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final attabal f11936saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f11937taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public androidx.media3.common.saneness f11938wireman;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public float f11932competently = 1.0f;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f11935marial = 0;

    /* JADX INFO: compiled from: AudioFocusManager.java */
    public class attabal implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Handler f11939attabal;

        public attabal(Handler handler) {
            this.f11939attabal = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            this.f11939attabal.post(new Runnable() { // from class: androidx.media3.exoplayer.formularize
                @Override // java.lang.Runnable
                public final void run() {
                    impassible.this.impromptu(i);
                }
            });
        }
    }

    /* JADX INFO: compiled from: AudioFocusManager.java */
    public interface saneness {
        void cord(int i);

        void preprohormone(float f);
    }

    public impassible(Context context, Handler handler, saneness sanenessVar) {
        this.f11930attabal = (AudioManager) decarock.attabal.marial((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f11933dern = sanenessVar;
        this.f11936saneness = new attabal(handler);
    }

    public static int marial(androidx.media3.common.saneness sanenessVar) {
        if (sanenessVar == null) {
            return 0;
        }
        switch (sanenessVar.f11278dern) {
            case 0:
                decarock.triweekly.impromptu("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (sanenessVar.f11276attabal == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                decarock.triweekly.impromptu("AudioFocusManager", "Unidentified audio usage: " + sanenessVar.f11278dern);
                return 0;
            case 16:
                return 4;
        }
    }

    public final int apical() {
        return this.f11930attabal.requestAudioFocus(this.f11936saneness, decarock.grimness.lerp(((androidx.media3.common.saneness) decarock.attabal.marial(this.f11938wireman)).f11278dern), this.f11931beachfront);
    }

    public int arytenoidectomy(boolean z, int i) {
        if (!kowloon(i)) {
            saneness();
            triweekly(0);
            return 1;
        }
        if (z) {
            return cutely();
        }
        int i2 = this.f11935marial;
        if (i2 != 1) {
            return i2 != 3 ? 1 : 0;
        }
        return -1;
    }

    public final void attabal() {
        this.f11930attabal.abandonAudioFocus(this.f11936saneness);
    }

    public final void beachfront(int i) {
        saneness sanenessVar = this.f11933dern;
        if (sanenessVar != null) {
            sanenessVar.cord(i);
        }
    }

    public float competently() {
        return this.f11932competently;
    }

    public final int cutely() {
        if (this.f11935marial == 2) {
            return 1;
        }
        if ((decarock.grimness.f25080attabal >= 26 ? formularize() : apical()) == 1) {
            triweekly(2);
            return 1;
        }
        triweekly(1);
        return -1;
    }

    public final void dern() {
        AudioFocusRequest audioFocusRequest = this.f11934impromptu;
        if (audioFocusRequest != null) {
            this.f11930attabal.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    public final int formularize() {
        AudioFocusRequest.Builder builderAttabal;
        AudioFocusRequest audioFocusRequest = this.f11934impromptu;
        if (audioFocusRequest == null || this.f11937taiyuan) {
            if (audioFocusRequest == null) {
                marial.attabal();
                builderAttabal = dern.attabal(this.f11931beachfront);
            } else {
                marial.attabal();
                builderAttabal = wireman.attabal(this.f11934impromptu);
            }
            this.f11934impromptu = builderAttabal.setAudioAttributes(((androidx.media3.common.saneness) decarock.attabal.marial(this.f11938wireman)).attabal().f11287attabal).setWillPauseWhenDucked(monoploid()).setOnAudioFocusChangeListener(this.f11936saneness).build();
            this.f11937taiyuan = false;
        }
        return this.f11930attabal.requestAudioFocus(this.f11934impromptu);
    }

    public void impassible(androidx.media3.common.saneness sanenessVar) {
        if (decarock.grimness.dern(this.f11938wireman, sanenessVar)) {
            return;
        }
        this.f11938wireman = sanenessVar;
        int iMarial = marial(sanenessVar);
        this.f11931beachfront = iMarial;
        boolean z = true;
        if (iMarial != 1 && iMarial != 0) {
            z = false;
        }
        decarock.attabal.saneness(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public final void impromptu(int i) {
        if (i == -3 || i == -2) {
            if (i != -2 && !monoploid()) {
                triweekly(4);
                return;
            } else {
                beachfront(0);
                triweekly(3);
                return;
            }
        }
        if (i == -1) {
            beachfront(-1);
            saneness();
            triweekly(1);
        } else if (i == 1) {
            triweekly(2);
            beachfront(1);
        } else {
            decarock.triweekly.impromptu("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }

    public final boolean kowloon(int i) {
        return i != 1 && this.f11931beachfront == 1;
    }

    public final boolean monoploid() {
        androidx.media3.common.saneness sanenessVar = this.f11938wireman;
        return sanenessVar != null && sanenessVar.f11276attabal == 1;
    }

    public final void saneness() {
        int i = this.f11935marial;
        if (i == 1 || i == 0) {
            return;
        }
        if (decarock.grimness.f25080attabal >= 26) {
            dern();
        } else {
            attabal();
        }
    }

    public void taiyuan() {
        this.f11933dern = null;
        saneness();
        triweekly(0);
    }

    public final void triweekly(int i) {
        if (this.f11935marial == i) {
            return;
        }
        this.f11935marial = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.f11932competently == f) {
            return;
        }
        this.f11932competently = f;
        saneness sanenessVar = this.f11933dern;
        if (sanenessVar != null) {
            sanenessVar.preprohormone(f);
        }
    }
}
