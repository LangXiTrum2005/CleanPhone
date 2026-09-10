package com.codejoy.boom.clap.network;

import com.google.android.gms.ads.RequestConfiguration;
import com.yolo.networklibrary.common.model.HttpResult;
import igo.impromptu;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataSourceExtension.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/dern;", "Lcom/yolo/networklibrary/common/model/HttpResult;", "attabal", "(Lkotlinx/coroutines/flow/dern;)Lkotlinx/coroutines/flow/dern;", "", "saneness", "app_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class DataSourceExtensionKt {
    public static final <T> kotlinx.coroutines.flow.dern<T> attabal(final kotlinx.coroutines.flow.dern<HttpResult<T>> dernVar) {
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        return new kotlinx.coroutines.flow.dern<T>() { // from class: com.codejoy.boom.clap.network.DataSourceExtensionKt$execute$$inlined$map$1

            /* JADX INFO: renamed from: com.codejoy.boom.clap.network.DataSourceExtensionKt$execute$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.wireman {

                /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.wireman f18563kowloon;

                /* JADX INFO: renamed from: com.codejoy.boom.clap.network.DataSourceExtensionKt$execute$$inlined$map$1$2$1, reason: invalid class name */
                @igo.wireman(c = "com.codejoy.boom.clap.network.DataSourceExtensionKt$execute$$inlined$map$1$2", f = "DataSourceExtension.kt", l = {50}, m = "emit", v = 1)
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
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

                public AnonymousClass2(kotlinx.coroutines.flow.wireman wiremanVar) {
                    this.f18563kowloon = wiremanVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.wireman
                public final Object emit(Object obj, wretchedly.dern dernVar) throws ResponseErrorException {
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
                        kotlinx.coroutines.flow.wireman wiremanVar = this.f18563kowloon;
                        HttpResult httpResult = (HttpResult) obj;
                        int error = httpResult.getError();
                        if (error != 0 && error != 7 && error != 8) {
                            throw new ResponseErrorException(httpResult.getError(), httpResult.getMsg());
                        }
                        Object objAttabal = httpResult.attabal();
                        Intrinsics.beachfront(objAttabal);
                        anonymousClass1.L$0 = impromptu.attabal(obj);
                        anonymousClass1.L$1 = impromptu.attabal(anonymousClass1);
                        anonymousClass1.L$2 = impromptu.attabal(obj);
                        anonymousClass1.L$3 = impromptu.attabal(wiremanVar);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (wiremanVar.emit(objAttabal, anonymousClass1) == objBeachfront) {
                            return objBeachfront;
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
            public Object collect(kotlinx.coroutines.flow.wireman wiremanVar, wretchedly.dern dernVar2) {
                Object objCollect = dernVar.collect(new AnonymousClass2(wiremanVar), dernVar2);
                return objCollect == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCollect : Unit.f29295attabal;
            }
        };
    }

    public static final <T> kotlinx.coroutines.flow.dern<Unit> saneness(final kotlinx.coroutines.flow.dern<HttpResult<T>> dernVar) {
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        return new kotlinx.coroutines.flow.dern<Unit>() { // from class: com.codejoy.boom.clap.network.DataSourceExtensionKt$executeUnit$$inlined$map$1

            /* JADX INFO: renamed from: com.codejoy.boom.clap.network.DataSourceExtensionKt$executeUnit$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.wireman {

                /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.wireman f18565kowloon;

                /* JADX INFO: renamed from: com.codejoy.boom.clap.network.DataSourceExtensionKt$executeUnit$$inlined$map$1$2$1, reason: invalid class name */
                @igo.wireman(c = "com.codejoy.boom.clap.network.DataSourceExtensionKt$executeUnit$$inlined$map$1$2", f = "DataSourceExtension.kt", l = {50}, m = "emit", v = 1)
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
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

                public AnonymousClass2(kotlinx.coroutines.flow.wireman wiremanVar) {
                    this.f18565kowloon = wiremanVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.wireman
                public final Object emit(Object obj, wretchedly.dern dernVar) throws ResponseErrorException {
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
                        kotlinx.coroutines.flow.wireman wiremanVar = this.f18565kowloon;
                        HttpResult httpResult = (HttpResult) obj;
                        int error = httpResult.getError();
                        if (error != 0 && error != 7 && error != 8) {
                            throw new ResponseErrorException(httpResult.getError(), httpResult.getMsg());
                        }
                        Unit unit = Unit.f29295attabal;
                        anonymousClass1.L$0 = impromptu.attabal(obj);
                        anonymousClass1.L$1 = impromptu.attabal(anonymousClass1);
                        anonymousClass1.L$2 = impromptu.attabal(obj);
                        anonymousClass1.L$3 = impromptu.attabal(wiremanVar);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (wiremanVar.emit(unit, anonymousClass1) == objBeachfront) {
                            return objBeachfront;
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
            public Object collect(kotlinx.coroutines.flow.wireman<? super Unit> wiremanVar, wretchedly.dern dernVar2) {
                Object objCollect = dernVar.collect(new AnonymousClass2(wiremanVar), dernVar2);
                return objCollect == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCollect : Unit.f29295attabal;
            }
        };
    }
}
