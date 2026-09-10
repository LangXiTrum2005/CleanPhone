package com.yolo.networklibrary.common.util;

import android.content.Context;
import android.text.TextUtils;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MccKt.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yolo/networklibrary/common/util/beachfront;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "attabal", "(Landroid/content/Context;)Ljava/lang/String;", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final beachfront f23962attabal = new beachfront();

    public final String attabal(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!TextUtils.isEmpty("")) {
            return "";
        }
        String strTaiyuan = dern.taiyuan(context);
        Intrinsics.checkNotNullExpressionValue(strTaiyuan, "{\n            DeviceUtil.getMcc(context)\n        }");
        return strTaiyuan;
    }
}
