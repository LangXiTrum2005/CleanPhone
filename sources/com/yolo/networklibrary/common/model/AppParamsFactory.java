package com.yolo.networklibrary.common.model;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppParamsFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/yolo/networklibrary/common/model/AppParamsFactory;", "", "<init>", "()V", "Lcom/yolo/networklibrary/common/model/AppParamsFactory$IAppParams;", "attabal", "()Lcom/yolo/networklibrary/common/model/AppParamsFactory$IAppParams;", "saneness", "Lcom/yolo/networklibrary/common/model/AppParamsFactory$IAppParams;", "params", "IAppParams", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppParamsFactory {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final AppParamsFactory f23900attabal = new AppParamsFactory();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static volatile IAppParams params;

    /* JADX INFO: compiled from: AppParamsFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yolo/networklibrary/common/model/AppParamsFactory$IAppParams;", "", "attabal", "()Ljava/lang/Object;", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface IAppParams {
        Object attabal();
    }

    private AppParamsFactory() {
    }

    public final IAppParams attabal() {
        if (params == null) {
            params = new IAppParams() { // from class: com.yolo.networklibrary.common.model.AppParamsFactory$getParams$1
                @Override // com.yolo.networklibrary.common.model.AppParamsFactory.IAppParams
                public Object attabal() {
                    return null;
                }
            };
        }
        IAppParams iAppParams = params;
        Intrinsics.beachfront(iAppParams);
        return iAppParams;
    }
}
