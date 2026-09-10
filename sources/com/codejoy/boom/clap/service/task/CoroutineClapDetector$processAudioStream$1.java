package com.codejoy.boom.clap.service.task;

import android.media.AudioRecord;
import igo.wireman;
import java.util.Arrays;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.splinterproof;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoroutineClapDetector.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
@wireman(c = "com.codejoy.boom.clap.service.task.CoroutineClapDetector$processAudioStream$1", f = "CoroutineClapDetector.kt", l = {116}, m = "invokeSuspend", v = 1)
public final class CoroutineClapDetector$processAudioStream$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CoroutineClapDetector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineClapDetector$processAudioStream$1(CoroutineClapDetector coroutineClapDetector, wretchedly.dern<? super CoroutineClapDetector$processAudioStream$1> dernVar) {
        super(2, dernVar);
        this.this$0 = coroutineClapDetector;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        CoroutineClapDetector$processAudioStream$1 coroutineClapDetector$processAudioStream$1 = new CoroutineClapDetector$processAudioStream$1(this.this$0, dernVar);
        coroutineClapDetector$processAudioStream$1.L$0 = obj;
        return coroutineClapDetector$processAudioStream$1;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        short[] sArr;
        AudioRecord audioRecord;
        AudioRecord audioRecord2;
        saran saranVar = (saran) this.L$0;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            sArr = new short[1024];
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sArr = (short[]) this.L$1;
            try {
                try {
                    p002kotlin.dern.saneness(obj);
                } catch (Exception e) {
                    com.codejoy.boom.clap.helper.dern dernVar = com.codejoy.boom.clap.helper.dern.f18260attabal;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    dernVar.dern("CoroutineClapDetector", message);
                    audioRecord = this.this$0.audioRecord;
                    if (audioRecord != null) {
                    }
                    return Unit.f29295attabal;
                }
            } catch (Throwable th) {
                AudioRecord audioRecord3 = this.this$0.audioRecord;
                if (audioRecord3 != null) {
                    audioRecord3.release();
                }
                throw th;
            }
        }
        while (privatdozent.competently(saranVar) && (audioRecord2 = this.this$0.audioRecord) != null) {
            int i2 = audioRecord2.read(sArr, 0, 1024);
            if (i2 <= 0) {
                this.L$0 = saranVar;
                this.L$1 = sArr;
                this.I$0 = i2;
                this.label = 1;
                if (splinterproof.attabal(1000L, this) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                CoroutineClapDetector coroutineClapDetector = this.this$0;
                short[] sArrCopyOf = Arrays.copyOf(sArr, i2);
                Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
                coroutineClapDetector.dern(sArrCopyOf);
            }
        }
        audioRecord = this.this$0.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
        }
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((CoroutineClapDetector$processAudioStream$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
