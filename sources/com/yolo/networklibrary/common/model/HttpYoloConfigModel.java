package com.yolo.networklibrary.common.model;

import com.google.gson.annotations.SerializedName;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: HttpYoloConfigModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/yolo/networklibrary/common/model/HttpYoloConfigModel;", "", "Lcom/yolo/networklibrary/common/model/HttpConfigModel;", "attabal", "Lcom/yolo/networklibrary/common/model/HttpConfigModel;", "()Lcom/yolo/networklibrary/common/model/HttpConfigModel;", "httpBusiness", "saneness", "httpCommon", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HttpYoloConfigModel {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    @SerializedName("http_business")
    private final HttpConfigModel httpBusiness;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    @SerializedName("http_common")
    private final HttpConfigModel httpCommon;

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final HttpConfigModel getHttpBusiness() {
        return this.httpBusiness;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final HttpConfigModel getHttpCommon() {
        return this.httpCommon;
    }
}
