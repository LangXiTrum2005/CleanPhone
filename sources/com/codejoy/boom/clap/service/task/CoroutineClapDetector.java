package com.codejoy.boom.clap.service.task;

import android.media.AudioRecord;
import com.codejoy.boom.clap.BoomClapApplication;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.sakeen;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: CoroutineClapDetector.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 72\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0016\u0010\"\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0016\u0010#\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010!R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R*\u00106\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00102\u001a\u0004\b3\u00104\"\u0004\b(\u00105¨\u00068"}, d2 = {"Lcom/codejoy/boom/clap/service/task/CoroutineClapDetector;", "", "<init>", "()V", "", "threshold", "", "taiyuan", "(F)V", "cutely", "competently", "apical", "beachfront", "", "buffer", "dern", "([S)V", "", "wireman", "([S)D", "", "marial", "([S)I", "attabal", "F", "", "saneness", "J", "lastClapTime", "", "Z", "isClaping", "preEnergy", "I", "preFrequency", "ENERGY_LIST_SIZE", "", "Ljava/util/List;", "energyList", "Landroid/media/AudioRecord;", "impromptu", "Landroid/media/AudioRecord;", "audioRecord", "Lkotlinx/coroutines/monroe;", "Lkotlinx/coroutines/monroe;", "detectionJob", "Lkotlinx/coroutines/saran;", "Lkotlinx/coroutines/saran;", "scope", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getOnClapListener", "()Lkotlin/jvm/functions/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "onClapListener", "formularize", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CoroutineClapDetector {

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final int f18622impassible = 8;

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public Function0<Unit> onClapListener;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public float threshold = 3.0f;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public int ENERGY_LIST_SIZE = 20;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public List<Float> energyList = new ArrayList();

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final saran scope = privatdozent.attabal(premeiotic.attabal().plus(sakeen.saneness(null, 1, null)));

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public boolean isClaping;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public AudioRecord audioRecord;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public int preFrequency;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public long lastClapTime;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public monroe detectionJob;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public float preEnergy;

    public final void apical() {
        monroe monroeVar = this.detectionJob;
        if (monroeVar != null) {
            monroe.attabal.attabal(monroeVar, null, 1, null);
        }
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            if (audioRecord.getRecordingState() == 3) {
                audioRecord.stop();
            }
            audioRecord.release();
        }
        this.audioRecord = null;
    }

    public final void beachfront() {
        this.detectionJob = cutely.wireman(this.scope, null, null, new CoroutineClapDetector$processAudioStream$1(this, null), 3, null);
    }

    public final void competently() {
        try {
            Result.Companion companion = Result.INSTANCE;
            apical();
            privatdozent.wireman(this.scope, null, 1, null);
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }

    public final void cutely() {
        try {
            Result.Companion companion = Result.INSTANCE;
            monroe monroeVar = this.detectionJob;
            if (monroeVar == null || !monroeVar.isActive()) {
                Integer numValueOf = Integer.valueOf(AudioRecord.getMinBufferSize(22050, 16, 2));
                int iIntValue = numValueOf.intValue();
                if (iIntValue == -1 || iIntValue == -2) {
                    numValueOf = null;
                }
                int iIntValue2 = numValueOf != null ? numValueOf.intValue() : 44100;
                if (picketboat.saneness.checkSelfPermission(BoomClapApplication.INSTANCE.attabal(), "android.permission.RECORD_AUDIO") != 0) {
                    return;
                }
                AudioRecord audioRecord = new AudioRecord(1, 22050, 16, 2, iIntValue2);
                if (audioRecord.getState() != 1) {
                    com.codejoy.boom.clap.helper.dern.f18260attabal.dern("CoroutineClapDetector", "AudioRecord initialization failed");
                    return;
                }
                audioRecord.startRecording();
                this.audioRecord = audioRecord;
                beachfront();
                Result.m3351constructorimpl(Unit.f29295attabal);
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }

    public final void dern(short[] buffer) {
        float fWireman = (float) wireman(buffer);
        int iMarial = marial(buffer);
        float fDent = (float) (this.energyList.size() != this.ENERGY_LIST_SIZE ? 0.0d : CollectionsKt.dent(this.energyList));
        float fMax = Math.max(fWireman, this.preEnergy);
        int iMax = Math.max(iMarial, this.preFrequency);
        float fAbs = fDent > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.abs(fMax - fDent) / fDent : 0.0f;
        if (fDent <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fAbs <= this.threshold || 350 > iMax || iMax >= 7001) {
            if (fWireman > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.energyList.add(Float.valueOf(fWireman));
                if (this.energyList.size() > this.ENERGY_LIST_SIZE) {
                    this.energyList.remove(0);
                }
            }
            com.codejoy.boom.clap.helper.dern.f18260attabal.attabal("CoroutineClapDetector", "useEnergy: " + fMax + " averageEnergy: " + fDent + " multiple: " + fAbs + " useFrequency: " + iMax);
            this.isClaping = false;
        } else {
            com.codejoy.boom.clap.helper.dern dernVar = com.codejoy.boom.clap.helper.dern.f18260attabal;
            dernVar.wireman("CoroutineClapDetector", "useEnergy: " + fMax + " averageEnergy: " + fDent + " multiple: " + fAbs + " useFrequency: " + iMax);
            if (!this.isClaping) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = jCurrentTimeMillis - this.lastClapTime;
                dernVar.marial("CoroutineClapDetector", "duration: " + j);
                if (200 <= j && j < 1001) {
                    dernVar.dern("CoroutineClapDetector", "double clap...");
                    Function0<Unit> function0 = this.onClapListener;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                this.isClaping = true;
                this.lastClapTime = jCurrentTimeMillis;
            }
        }
        this.preEnergy = fWireman;
        this.preFrequency = iMarial;
    }

    public final void impromptu(Function0<Unit> function0) {
        this.onClapListener = function0;
    }

    public final int marial(short[] buffer) {
        int length = buffer.length;
        int i = 0;
        for (int i2 = 1; i2 < length; i2++) {
            if (buffer[i2 - 1] < 0 && buffer[i2] >= 0) {
                i++;
            }
        }
        return (int) (((double) (i * 22050)) / (((double) buffer.length) * 2.0d));
    }

    public final void taiyuan(float threshold) {
        this.threshold = threshold;
    }

    public final double wireman(short[] buffer) {
        double d = 0.0d;
        for (short s : buffer) {
            double d2 = ((double) s) / 32768.0d;
            d += d2 * d2;
        }
        return Math.sqrt(d / ((double) buffer.length));
    }
}
