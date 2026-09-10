package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlinx.coroutines.flow.internal.CombineKt;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Zip.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001ai\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r0\f\"\u0004\b\u0000\u0010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/flow/dern;", "flow", "Lkotlin/Function3;", "Lwretchedly/dern;", "", "transform", "saneness", "(Lkotlinx/coroutines/flow/dern;Lkotlinx/coroutines/flow/dern;Ltetrahedral/triweekly;)Lkotlinx/coroutines/flow/dern;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function0;", "", "dern", "()Lkotlin/jvm/functions/Function0;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__ZipKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__ZipKt$attabal", "Lkotlinx/coroutines/flow/dern;", "Lkotlinx/coroutines/flow/wireman;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/wireman;Lwretchedly/dern;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class attabal<R> implements dern<R> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ dern f32240arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ dern f32241kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ tetrahedral.triweekly f32242monoploid;

        public attabal(dern dernVar, dern dernVar2, tetrahedral.triweekly triweeklyVar) {
            this.f32241kowloon = dernVar;
            this.f32240arytenoidectomy = dernVar2;
            this.f32242monoploid = triweeklyVar;
        }

        @Override // kotlinx.coroutines.flow.dern
        public Object collect(wireman<? super R> wiremanVar, wretchedly.dern<? super Unit> dernVar) {
            Object objAttabal = CombineKt.attabal(wiremanVar, new dern[]{this.f32241kowloon, this.f32240arytenoidectomy}, FlowKt__ZipKt.dern(), new FlowKt__ZipKt$combine$1$1(this.f32242monoploid, null), dernVar);
            return objAttabal == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objAttabal : Unit.f29295attabal;
        }
    }

    /* JADX INFO: compiled from: Zip.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class saneness implements Function0 {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final saneness f32243kowloon = new saneness();

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    public static final <T> Function0<T[]> dern() {
        return saneness.f32243kowloon;
    }

    public static final <T1, T2, R> dern<R> saneness(dern<? extends T1> dernVar, dern<? extends T2> dernVar2, tetrahedral.triweekly<? super T1, ? super T2, ? super wretchedly.dern<? super R>, ? extends Object> triweeklyVar) {
        return new attabal(dernVar, dernVar2, triweeklyVar);
    }
}
