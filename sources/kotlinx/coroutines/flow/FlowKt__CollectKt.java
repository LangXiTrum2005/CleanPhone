package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Collect.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aD\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000f\u001a.\u0010\u0012\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/flow/dern;", "", "attabal", "(Lkotlinx/coroutines/flow/dern;Lwretchedly/dern;)Ljava/lang/Object;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/saran;", "scope", "Lkotlinx/coroutines/monroe;", "wireman", "(Lkotlinx/coroutines/flow/dern;Lkotlinx/coroutines/saran;)Lkotlinx/coroutines/monroe;", "Lkotlin/Function2;", "Lwretchedly/dern;", "", "action", "saneness", "(Lkotlinx/coroutines/flow/dern;Lkotlin/jvm/functions/Function2;Lwretchedly/dern;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/wireman;", "flow", "dern", "(Lkotlinx/coroutines/flow/wireman;Lkotlinx/coroutines/flow/dern;Lwretchedly/dern;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__CollectKt {
    public static final Object attabal(dern<?> dernVar, wretchedly.dern<? super Unit> dernVar2) {
        Object objCollect = dernVar.collect(kotlinx.coroutines.flow.internal.formularize.f32305kowloon, dernVar2);
        return objCollect == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCollect : Unit.f29295attabal;
    }

    public static final <T> Object dern(wireman<? super T> wiremanVar, dern<? extends T> dernVar, wretchedly.dern<? super Unit> dernVar2) {
        marial.arytenoidectomy(wiremanVar);
        Object objCollect = dernVar.collect(wiremanVar, dernVar2);
        return objCollect == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCollect : Unit.f29295attabal;
    }

    public static final <T> Object saneness(dern<? extends T> dernVar, Function2<? super T, ? super wretchedly.dern<? super Unit>, ? extends Object> function2, wretchedly.dern<? super Unit> dernVar2) {
        Object objTaiyuan = marial.taiyuan(competently.saneness(marial.cord(dernVar, function2), 0, null, 2, null), dernVar2);
        return objTaiyuan == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objTaiyuan : Unit.f29295attabal;
    }

    public static final <T> monroe wireman(dern<? extends T> dernVar, saran saranVar) {
        return kotlinx.coroutines.cutely.wireman(saranVar, null, null, new FlowKt__CollectKt$launchIn$1(dernVar, null), 3, null);
    }
}
