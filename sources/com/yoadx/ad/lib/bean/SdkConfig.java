package com.yoadx.ad.lib.bean;

import java.io.Serializable;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SdkConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001\u0016B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\u0003\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/yoadx/ad/lib/bean/SdkConfig;", "Ljava/io/Serializable;", "", "isDebugMode", "", "admobPubId", "authorizationHmacKey", "headerXTokenValue", "", "encryptedKeyRaw", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Z", "()Z", "Ljava/lang/String;", "getAdmobPubId", "()Ljava/lang/String;", "getAuthorizationHmacKey", "getHeaderXTokenValue", "I", "getEncryptedKeyRaw", "()I", "attabal", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SdkConfig implements Serializable {
    private final String admobPubId;
    private final String authorizationHmacKey;
    private final int encryptedKeyRaw;
    private final String headerXTokenValue;
    private final boolean isDebugMode;

    /* JADX INFO: compiled from: SdkConfig.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/yoadx/ad/lib/bean/SdkConfig$attabal;", "", "<init>", "()V", "", "debugMode", "dern", "(Z)Lcom/yoadx/ad/lib/bean/SdkConfig$attabal;", "", "admobPubId", "attabal", "(Ljava/lang/String;)Lcom/yoadx/ad/lib/bean/SdkConfig$attabal;", "Lcom/yoadx/ad/lib/bean/SdkConfig;", "saneness", "()Lcom/yoadx/ad/lib/bean/SdkConfig;", "Z", "isDebugMode", "Ljava/lang/String;", "authorizationHmacKey", "wireman", "headerXTokenValue", "", "marial", "I", "encryptedKeyRaw", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public boolean isDebugMode;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public int encryptedKeyRaw;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public String admobPubId = "";

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public String authorizationHmacKey = "";

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public String headerXTokenValue = "";

        public final attabal attabal(String admobPubId) {
            Intrinsics.checkNotNullParameter(admobPubId, "admobPubId");
            this.admobPubId = admobPubId;
            return this;
        }

        public final attabal dern(boolean debugMode) {
            this.isDebugMode = debugMode;
            return this;
        }

        public final SdkConfig saneness() {
            return new SdkConfig(this.isDebugMode, this.admobPubId, this.authorizationHmacKey, this.headerXTokenValue, this.encryptedKeyRaw, null);
        }
    }

    public /* synthetic */ SdkConfig(boolean z, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, str2, str3, i);
    }

    public final String getAdmobPubId() {
        return this.admobPubId;
    }

    public final String getAuthorizationHmacKey() {
        return this.authorizationHmacKey;
    }

    public final int getEncryptedKeyRaw() {
        return this.encryptedKeyRaw;
    }

    public final String getHeaderXTokenValue() {
        return this.headerXTokenValue;
    }

    /* JADX INFO: renamed from: isDebugMode, reason: from getter */
    public final boolean getIsDebugMode() {
        return this.isDebugMode;
    }

    public SdkConfig(boolean z, String str, String str2, String str3, int i) {
        this.isDebugMode = z;
        this.admobPubId = str;
        this.authorizationHmacKey = str2;
        this.headerXTokenValue = str3;
        this.encryptedKeyRaw = i;
    }
}
