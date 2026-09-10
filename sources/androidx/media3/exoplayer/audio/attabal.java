package androidx.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import decarock.grimness;
import hyalinization.taiyuan;

/* JADX INFO: compiled from: AudioCapabilitiesReceiver.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f11663attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final wireman f11664beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public hyalinization.marial f11665competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public boolean f11666cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Handler f11667dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public taiyuan f11668impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final BroadcastReceiver f11669marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final beachfront f11670saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public androidx.media3.common.saneness f11671taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final dern f11672wireman;

    /* JADX INFO: compiled from: AudioCapabilitiesReceiver.java */
    public interface beachfront {
        void attabal(hyalinization.marial marialVar);
    }

    /* JADX INFO: compiled from: AudioCapabilitiesReceiver.java */
    public final class dern extends AudioDeviceCallback {
        public dern() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            attabal attabalVar = attabal.this;
            attabalVar.beachfront(hyalinization.marial.competently(attabalVar.f11663attabal, attabal.this.f11671taiyuan, attabal.this.f11668impromptu));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (grimness.polloi(audioDeviceInfoArr, attabal.this.f11668impromptu)) {
                attabal.this.f11668impromptu = null;
            }
            attabal attabalVar = attabal.this;
            attabalVar.beachfront(hyalinization.marial.competently(attabalVar.f11663attabal, attabal.this.f11671taiyuan, attabal.this.f11668impromptu));
        }
    }

    /* JADX INFO: compiled from: AudioCapabilitiesReceiver.java */
    public final class marial extends BroadcastReceiver {
        public marial() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            attabal attabalVar = attabal.this;
            attabalVar.beachfront(hyalinization.marial.beachfront(context, intent, attabalVar.f11671taiyuan, attabal.this.f11668impromptu));
        }
    }

    /* JADX INFO: compiled from: AudioCapabilitiesReceiver.java */
    public static final class saneness {
        public static void attabal(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager) decarock.attabal.marial((AudioManager) context.getSystemService("audio"))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void saneness(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager) decarock.attabal.marial((AudioManager) context.getSystemService("audio"))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* JADX INFO: compiled from: AudioCapabilitiesReceiver.java */
    public final class wireman extends ContentObserver {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ContentResolver f11675attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Uri f11677saneness;

        public wireman(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f11675attabal = contentResolver;
            this.f11677saneness = uri;
        }

        public void attabal() {
            this.f11675attabal.registerContentObserver(this.f11677saneness, false, this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            attabal attabalVar = attabal.this;
            attabalVar.beachfront(hyalinization.marial.competently(attabalVar.f11663attabal, attabal.this.f11671taiyuan, attabal.this.f11668impromptu));
        }

        public void saneness() {
            this.f11675attabal.unregisterContentObserver(this);
        }
    }

    public attabal(Context context, beachfront beachfrontVar, androidx.media3.common.saneness sanenessVar, taiyuan taiyuanVar) {
        Context applicationContext = context.getApplicationContext();
        this.f11663attabal = applicationContext;
        this.f11670saneness = (beachfront) decarock.attabal.marial(beachfrontVar);
        this.f11671taiyuan = sanenessVar;
        this.f11668impromptu = taiyuanVar;
        Handler handlerStratoscope = grimness.stratoscope();
        this.f11667dern = handlerStratoscope;
        int i = grimness.f25080attabal;
        byte b = 0;
        this.f11672wireman = i >= 23 ? new dern() : null;
        this.f11669marial = i >= 21 ? new marial() : null;
        Uri uriCutely = hyalinization.marial.cutely();
        this.f11664beachfront = uriCutely != null ? new wireman(handlerStratoscope, applicationContext.getContentResolver(), uriCutely) : null;
    }

    public final void beachfront(hyalinization.marial marialVar) {
        if (!this.f11666cutely || marialVar.equals(this.f11665competently)) {
            return;
        }
        this.f11665competently = marialVar;
        this.f11670saneness.attabal(marialVar);
    }

    public hyalinization.marial competently() {
        dern dernVar;
        if (this.f11666cutely) {
            return (hyalinization.marial) decarock.attabal.marial(this.f11665competently);
        }
        this.f11666cutely = true;
        wireman wiremanVar = this.f11664beachfront;
        if (wiremanVar != null) {
            wiremanVar.attabal();
        }
        if (grimness.f25080attabal >= 23 && (dernVar = this.f11672wireman) != null) {
            saneness.attabal(this.f11663attabal, dernVar, this.f11667dern);
        }
        hyalinization.marial marialVarBeachfront = hyalinization.marial.beachfront(this.f11663attabal, this.f11669marial != null ? this.f11663attabal.registerReceiver(this.f11669marial, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f11667dern) : null, this.f11671taiyuan, this.f11668impromptu);
        this.f11665competently = marialVarBeachfront;
        return marialVarBeachfront;
    }

    public void cutely() {
        dern dernVar;
        if (this.f11666cutely) {
            this.f11665competently = null;
            if (grimness.f25080attabal >= 23 && (dernVar = this.f11672wireman) != null) {
                saneness.saneness(this.f11663attabal, dernVar);
            }
            BroadcastReceiver broadcastReceiver = this.f11669marial;
            if (broadcastReceiver != null) {
                this.f11663attabal.unregisterReceiver(broadcastReceiver);
            }
            wireman wiremanVar = this.f11664beachfront;
            if (wiremanVar != null) {
                wiremanVar.saneness();
            }
            this.f11666cutely = false;
        }
    }

    public void impromptu(androidx.media3.common.saneness sanenessVar) {
        this.f11671taiyuan = sanenessVar;
        beachfront(hyalinization.marial.competently(this.f11663attabal, sanenessVar, this.f11668impromptu));
    }

    public void taiyuan(AudioDeviceInfo audioDeviceInfo) {
        taiyuan taiyuanVar = this.f11668impromptu;
        if (grimness.dern(audioDeviceInfo, taiyuanVar == null ? null : taiyuanVar.f28111attabal)) {
            return;
        }
        taiyuan taiyuanVar2 = audioDeviceInfo != null ? new taiyuan(audioDeviceInfo) : null;
        this.f11668impromptu = taiyuanVar2;
        beachfront(hyalinization.marial.competently(this.f11663attabal, this.f11671taiyuan, taiyuanVar2));
    }
}
