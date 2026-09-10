package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\u000b\u0010\f\u001aU\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\u000f\u0010\u0010\u001aO\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/saran;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/CoroutineStart;", "start", "Lkotlin/Function2;", "Lwretchedly/dern;", "", "", "block", "Lkotlinx/coroutines/monroe;", "dern", "(Lkotlinx/coroutines/saran;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/monroe;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/walach;", "attabal", "(Lkotlinx/coroutines/saran;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/walach;", "marial", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lwretchedly/dern;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/BuildersKt")
public final /* synthetic */ class cutely {
    public static final <T> walach<T> attabal(saran saranVar, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2<? super saran, ? super wretchedly.dern<? super T>, ? extends Object> function2) {
        CoroutineContext coroutineContextApical = supplicat.apical(saranVar, coroutineContext);
        peridotite hardpanVar = coroutineStart.isLazy() ? new hardpan(coroutineContextApical, function2) : new peridotite(coroutineContextApical, true);
        ((attabal) hardpanVar).basify(coroutineStart, hardpanVar, function2);
        return (walach<T>) hardpanVar;
    }

    public static final monroe dern(saran saranVar, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2<? super saran, ? super wretchedly.dern<? super Unit>, ? extends Object> function2) {
        CoroutineContext coroutineContextApical = supplicat.apical(saranVar, coroutineContext);
        attabal herdbookVar = coroutineStart.isLazy() ? new herdbook(coroutineContextApical, function2) : new libyan(coroutineContextApical, true);
        herdbookVar.basify(coroutineStart, herdbookVar, function2);
        return herdbookVar;
    }

    public static final <T> Object marial(CoroutineContext coroutineContext, Function2<? super saran, ? super wretchedly.dern<? super T>, ? extends Object> function2, wretchedly.dern<? super T> dernVar) {
        Object objPrefect;
        CoroutineContext context = dernVar.getContext();
        CoroutineContext coroutineContextCutely = supplicat.cutely(context, coroutineContext);
        achondroplasia.impromptu(coroutineContextCutely);
        if (coroutineContextCutely == context) {
            pigboat.rotuma rotumaVar = new pigboat.rotuma(coroutineContextCutely, dernVar);
            objPrefect = girt.saneness.saneness(rotumaVar, rotumaVar, function2);
        } else {
            p002kotlin.coroutines.dern.Companion sanenessVar = p002kotlin.coroutines.dern.INSTANCE;
            if (Intrinsics.wireman(coroutineContextCutely.get(sanenessVar), context.get(sanenessVar))) {
                osteal ostealVar = new osteal(coroutineContextCutely, dernVar);
                CoroutineContext context2 = ostealVar.getContext();
                Object objTaiyuan = pigboat.restrictive.taiyuan(context2, null);
                try {
                    Object objSaneness = girt.saneness.saneness(ostealVar, ostealVar, function2);
                    pigboat.restrictive.beachfront(context2, objTaiyuan);
                    objPrefect = objSaneness;
                } catch (Throwable th) {
                    pigboat.restrictive.beachfront(context2, objTaiyuan);
                    throw th;
                }
            } else {
                clubfoot clubfootVar = new clubfoot(coroutineContextCutely, dernVar);
                girt.attabal.saneness(function2, clubfootVar, clubfootVar);
                objPrefect = clubfootVar.prefect();
            }
        }
        if (objPrefect == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            igo.beachfront.dern(dernVar);
        }
        return objPrefect;
    }

    public static /* synthetic */ walach saneness(saran saranVar, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return impromptu.attabal(saranVar, coroutineContext, coroutineStart, function2);
    }

    public static /* synthetic */ monroe wireman(saran saranVar, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return impromptu.dern(saranVar, coroutineContext, coroutineStart, function2);
    }
}
