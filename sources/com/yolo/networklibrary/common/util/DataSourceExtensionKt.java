package com.yolo.networklibrary.common.util;

import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.yolo.networklibrary.common.model.HttpResult;
import com.yolo.networklibrary.common.model.ResponseErrorException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataSourceExtension.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/dern;", "Lcom/yolo/networklibrary/common/model/HttpResult;", "attabal", "(Lkotlinx/coroutines/flow/dern;)Lkotlinx/coroutines/flow/dern;", "neworklibrary_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DataSourceExtensionKt {
    public static final <T> kotlinx.coroutines.flow.dern<T> attabal(final kotlinx.coroutines.flow.dern<HttpResult<T>> dernVar) {
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        return new kotlinx.coroutines.flow.dern<T>() { // from class: com.yolo.networklibrary.common.util.DataSourceExtensionKt$execute$$inlined$map$1

            /* JADX INFO: renamed from: com.yolo.networklibrary.common.util.DataSourceExtensionKt$execute$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "", "emit", "(Ljava/lang/Object;Lwretchedly/dern;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.wireman {

                /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.wireman f23959kowloon;

                /* JADX INFO: renamed from: com.yolo.networklibrary.common.util.DataSourceExtensionKt$execute$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @igo.wireman(c = "com.yolo.networklibrary.common.util.DataSourceExtensionKt$execute$$inlined$map$1$2", f = "DataSourceExtension.kt", l = {Sdk$SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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
                    this.f23959kowloon = wiremanVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.wireman
                public final Object emit(Object obj, wretchedly.dern dernVar) throws Exception {
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
                        kotlinx.coroutines.flow.wireman wiremanVar = this.f23959kowloon;
                        HttpResult httpResult = (HttpResult) obj;
                        int error = httpResult.getError();
                        if (error != 0 && error != 7 && error != 8) {
                            throw new Exception(new ResponseErrorException(httpResult.getError(), httpResult.getMsg()).toString());
                        }
                        Object objAttabal = httpResult.attabal();
                        Intrinsics.beachfront(objAttabal);
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
}
