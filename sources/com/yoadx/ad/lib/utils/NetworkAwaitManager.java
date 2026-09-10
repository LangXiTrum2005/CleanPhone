package com.yoadx.ad.lib.utils;

import kotlinx.coroutines.cutely;
import kotlinx.coroutines.flow.formularize;
import kotlinx.coroutines.flow.gintrap;
import kotlinx.coroutines.flow.marial;
import kotlinx.coroutines.premeiotic;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: NetworkAwaitManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/yoadx/ad/lib/utils/NetworkAwaitManager;", "", "<init>", "()V", "", "dern", "", "target", "saneness", "(ZLwretchedly/dern;)Ljava/lang/Object;", "wireman", "()Z", "Lkotlinx/coroutines/flow/formularize;", "Lkotlinx/coroutines/flow/formularize;", "_networkState", "Z", "isInit", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkAwaitManager {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static boolean isInit;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final NetworkAwaitManager f23890attabal = new NetworkAwaitManager();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final formularize<Boolean> _networkState = gintrap.attabal(Boolean.TRUE);

    public final void dern() {
        if (isInit) {
            return;
        }
        isInit = true;
        cutely.wireman(wireman.f23898attabal.dern(), premeiotic.saneness(), null, new NetworkAwaitManager$init$1(null), 2, null);
    }

    public final Object saneness(final boolean z, wretchedly.dern<? super Unit> dernVar) {
        final formularize<Boolean> formularizeVar = _networkState;
        Object objMolybdenite = marial.molybdenite(new kotlinx.coroutines.flow.dern<Boolean>() { // from class: com.yoadx.ad.lib.utils.NetworkAwaitManager$awaitNetworkState$$inlined$filter$1

            /* JADX INFO: renamed from: com.yoadx.ad.lib.utils.NetworkAwaitManager$awaitNetworkState$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.wireman {

                /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
                public final /* synthetic */ boolean f23895arytenoidectomy;

                /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.wireman f23896kowloon;

                /* JADX INFO: renamed from: com.yoadx.ad.lib.utils.NetworkAwaitManager$awaitNetworkState$$inlined$filter$1$2$1, reason: invalid class name */
                @igo.wireman(c = "com.yoadx.ad.lib.utils.NetworkAwaitManager$awaitNetworkState$$inlined$filter$1$2", f = "NetworkAwaitManager.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wretchedly.dern dernVar) {
                        super(dernVar);
                    }

                    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.wireman wiremanVar, boolean z) {
                    this.f23896kowloon = wiremanVar;
                    this.f23895arytenoidectomy = z;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.wireman
                public final Object emit(Object obj, wretchedly.dern dernVar) {
                    AnonymousClass1 anonymousClass1;
                    if (dernVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dernVar;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(dernVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(dernVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        p002kotlin.dern.saneness(obj2);
                        kotlinx.coroutines.flow.wireman wiremanVar = this.f23896kowloon;
                        if (((Boolean) obj).booleanValue() == this.f23895arytenoidectomy) {
                            anonymousClass1.label = 1;
                            if (wiremanVar.emit(obj, anonymousClass1) == objBeachfront) {
                                return objBeachfront;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p002kotlin.dern.saneness(obj2);
                    }
                    return Unit.f29295attabal;
                }
            }

            @Override // kotlinx.coroutines.flow.dern
            public Object collect(kotlinx.coroutines.flow.wireman<? super Boolean> wiremanVar, wretchedly.dern dernVar2) {
                Object objCollect = formularizeVar.collect(new AnonymousClass2(wiremanVar, z), dernVar2);
                return objCollect == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCollect : Unit.f29295attabal;
            }
        }, dernVar);
        return objMolybdenite == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objMolybdenite : Unit.f29295attabal;
    }

    public final boolean wireman() {
        return _networkState.getValue().booleanValue();
    }
}
