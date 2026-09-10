package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aN\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function2;", "Lkotlinx/coroutines/saran;", "Lwretchedly/dern;", "", "block", "attabal", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/BuildersKt")
public final /* synthetic */ class taiyuan {
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    public static final <T> T attabal(CoroutineContext coroutineContext, Function2<? super saran, ? super wretchedly.dern<? super T>, ? extends Object> function2) throws InterruptedException {
        lerp lerpVarAttabal;
        CoroutineContext coroutineContextApical;
        Thread threadCurrentThread = Thread.currentThread();
        p002kotlin.coroutines.dern dernVar = (p002kotlin.coroutines.dern) coroutineContext.get(p002kotlin.coroutines.dern.INSTANCE);
        if (dernVar == null) {
            lerpVarAttabal = basify.f32112attabal.saneness();
            coroutineContextApical = supplicat.apical(wostteth.f32471kowloon, coroutineContext.plus(lerpVarAttabal));
        } else {
            lerp lerpVar = dernVar instanceof lerp ? (lerp) dernVar : null;
            if (lerpVar == null) {
                lerpVarAttabal = basify.f32112attabal.attabal();
            } else {
                lerp lerpVar2 = lerpVar.achondroplasia() ? lerpVar : null;
                if (lerpVar2 == null) {
                    lerpVarAttabal = basify.f32112attabal.attabal();
                } else {
                    lerpVarAttabal = lerpVar2;
                }
            }
            coroutineContextApical = supplicat.apical(wostteth.f32471kowloon, coroutineContext);
        }
        beachfront beachfrontVar = new beachfront(coroutineContextApical, threadCurrentThread, lerpVarAttabal);
        beachfrontVar.basify(CoroutineStart.DEFAULT, beachfrontVar, function2);
        return (T) beachfrontVar.tectonization();
    }

    public static /* synthetic */ Object saneness(CoroutineContext coroutineContext, Function2 function2, int i, Object obj) throws InterruptedException {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return impromptu.marial(coroutineContext, function2);
    }
}
