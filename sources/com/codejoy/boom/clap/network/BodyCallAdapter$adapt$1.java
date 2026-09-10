package com.codejoy.boom.clap.network;

import com.google.android.gms.ads.RequestConfiguration;
import kotlinx.coroutines.impassible;
import okhttp3.preprohormone;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;
import retrofit2.rotuma;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: ResponseCallAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/wireman;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/wireman;)V"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.network.BodyCallAdapter$adapt$1", f = "ResponseCallAdapter.kt", l = {59, 41}, m = "invokeSuspend", v = 1)
public final class BodyCallAdapter$adapt$1<T> extends SuspendLambda implements Function2<kotlinx.coroutines.flow.wireman<? super T>, wretchedly.dern<? super Unit>, Object> {
    final /* synthetic */ retrofit2.saneness<T> $call;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: compiled from: ResponseCallAdapter.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class attabal implements Function1<rotuma<T>, Unit> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ retrofit2.saneness<T> f18559arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.wireman<T> f18560kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ impassible<T> f18561monoploid;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(kotlinx.coroutines.flow.wireman<? super T> wiremanVar, retrofit2.saneness<T> sanenessVar, impassible<? super T> impassibleVar) {
            this.f18560kowloon = wiremanVar;
            this.f18559arytenoidectomy = sanenessVar;
            this.f18561monoploid = impassibleVar;
        }

        public final void attabal(rotuma<T> response) {
            Object objM3351constructorimpl;
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                Result.Companion companion = Result.INSTANCE;
                if (!response.wireman()) {
                    throw new HttpException(response);
                }
                T tAttabal = response.attabal();
                if (tAttabal == null) {
                    throw new NullPointerException("Response body is null: " + response);
                }
                objM3351constructorimpl = Result.m3351constructorimpl(tAttabal);
                com.codejoy.boom.clap.network.attabal attabalVar = com.codejoy.boom.clap.network.attabal.f18570attabal;
                preprohormone preprohormoneVarRequest = this.f18559arytenoidectomy.request();
                Intrinsics.checkNotNullExpressionValue(preprohormoneVarRequest, "request(...)");
                attabalVar.attabal(preprohormoneVarRequest, objM3351constructorimpl);
                this.f18561monoploid.resumeWith(objM3351constructorimpl);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
        }

        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            attabal((rotuma) obj);
            return Unit.f29295attabal;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyCallAdapter$adapt$1(retrofit2.saneness<T> sanenessVar, wretchedly.dern<? super BodyCallAdapter$adapt$1> dernVar) {
        super(2, dernVar);
        this.$call = sanenessVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        BodyCallAdapter$adapt$1 bodyCallAdapter$adapt$1 = new BodyCallAdapter$adapt$1(this.$call, dernVar);
        bodyCallAdapter$adapt$1.L$0 = obj;
        return bodyCallAdapter$adapt$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (r2.emit(r7, r6) == r1) goto L18;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.L$0
            kotlinx.coroutines.flow.wireman r0 = (kotlinx.coroutines.flow.wireman) r0
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r6.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L2a
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L16
            p002kotlin.dern.saneness(r7)
            goto L76
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            java.lang.Object r2 = r6.L$2
            kotlinx.coroutines.flow.wireman r2 = (kotlinx.coroutines.flow.wireman) r2
            java.lang.Object r4 = r6.L$1
            retrofit2.saneness r4 = (retrofit2.saneness) r4
            p002kotlin.dern.saneness(r7)
            goto L62
        L2a:
            p002kotlin.dern.saneness(r7)
            retrofit2.saneness<T> r7 = r6.$call
            r6.L$0 = r0
            r6.L$1 = r7
            r6.L$2 = r0
            r2 = 0
            r6.I$0 = r2
            r6.label = r4
            kotlinx.coroutines.kowloon r2 = new kotlinx.coroutines.kowloon
            wretchedly.dern r5 = p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.dern(r6)
            r2.<init>(r5, r4)
            r2.kattegat()
            com.codejoy.boom.clap.network.BodyCallAdapter$adapt$1$attabal r4 = new com.codejoy.boom.clap.network.BodyCallAdapter$adapt$1$attabal
            r4.<init>(r0, r7, r2)
            com.codejoy.boom.clap.network.wireman.saneness(r7, r2, r4)
            com.codejoy.boom.clap.network.wireman.dern(r7, r2)
            java.lang.Object r7 = r2.cuirassed()
            java.lang.Object r2 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            if (r7 != r2) goto L5e
            igo.beachfront.dern(r6)
        L5e:
            if (r7 != r1) goto L61
            goto L75
        L61:
            r2 = r0
        L62:
            java.lang.Object r0 = igo.impromptu.attabal(r0)
            r6.L$0 = r0
            r0 = 0
            r6.L$1 = r0
            r6.L$2 = r0
            r6.label = r3
            java.lang.Object r7 = r2.emit(r7, r6)
            if (r7 != r1) goto L76
        L75:
            return r1
        L76:
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.codejoy.boom.clap.network.BodyCallAdapter$adapt$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.flow.wireman<? super T> wiremanVar, wretchedly.dern<? super Unit> dernVar) {
        return ((BodyCallAdapter$adapt$1) create(wiremanVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
