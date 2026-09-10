package com.yolo.networklibrary.common.model;

import com.google.gson.annotations.SerializedName;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: HttpConfigModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\n\u0010\u0006R$\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/yolo/networklibrary/common/model/HttpConfigModel;", "", "", "attabal", "Ljava/lang/String;", "wireman", "()Ljava/lang/String;", "hostUrl", "saneness", "assetsResXTokenName", "dern", "headerXToken", "hmacMd5Key", "", "marial", "[B", "()[B", "beachfront", "([B)V", "rawXTokenByteArray", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HttpConfigModel {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hostUrl")
    private final String hostUrl;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    @SerializedName("headerXToken")
    private final String headerXToken;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public byte[] rawXTokenByteArray;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    @SerializedName("assetsResXTokenName")
    private final String assetsResXTokenName;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hmacMd5Key")
    private final String hmacMd5Key;

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final String getAssetsResXTokenName() {
        return this.assetsResXTokenName;
    }

    public final void beachfront(byte[] bArr) {
        this.rawXTokenByteArray = bArr;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final String getHmacMd5Key() {
        return this.hmacMd5Key;
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final byte[] getRawXTokenByteArray() {
        return this.rawXTokenByteArray;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final String getHeaderXToken() {
        return this.headerXToken;
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final String getHostUrl() {
        return this.hostUrl;
    }
}
