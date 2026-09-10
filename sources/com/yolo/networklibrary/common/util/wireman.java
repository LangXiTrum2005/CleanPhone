package com.yolo.networklibrary.common.util;

import com.yolo.networklibrary.common.model.HttpInstallInfoBean;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InstallReferrerAttributionUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yolo/networklibrary/common/util/wireman;", "", "attabal", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class wireman {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static HttpInstallInfoBean f23978dern;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static String f23979saneness = "";

    /* JADX INFO: renamed from: com.yolo.networklibrary.common.util.wireman$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: InstallReferrerAttributionUtil.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yolo/networklibrary/common/util/wireman$attabal;", "", "<init>", "()V", "Lcom/yolo/networklibrary/common/model/HttpInstallInfoBean;", "saneness", "()Lcom/yolo/networklibrary/common/model/HttpInstallInfoBean;", "", "attabal", "()Ljava/lang/String;", "mGpReferrerUtmSource", "Ljava/lang/String;", "mHttpInstallInfoBean", "Lcom/yolo/networklibrary/common/model/HttpInstallInfoBean;", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String attabal() {
            if (wireman.f23979saneness.length() > 0) {
                return wireman.f23979saneness;
            }
            String strTaiyuan = babyless.beachfront.taiyuan("file_key_install_gp_referrer_utm_source", "");
            Intrinsics.checkNotNullExpressionValue(strTaiyuan, "getString(CacheConstants…_REFERRER_UTM_SOURCE, \"\")");
            wireman.f23979saneness = strTaiyuan;
            return wireman.f23979saneness;
        }

        public final HttpInstallInfoBean saneness() {
            if (wireman.f23978dern != null) {
                HttpInstallInfoBean httpInstallInfoBean = wireman.f23978dern;
                Intrinsics.beachfront(httpInstallInfoBean);
                String strImpromptu = httpInstallInfoBean.impromptu();
                if (strImpromptu != null && strImpromptu.length() != 0) {
                    return wireman.f23978dern;
                }
            }
            wireman.f23978dern = (HttpInstallInfoBean) babyless.beachfront.beachfront("file_key_install_info_cipher_copy", null, HttpInstallInfoBean.class);
            return wireman.f23978dern;
        }

        public Companion() {
        }
    }
}
