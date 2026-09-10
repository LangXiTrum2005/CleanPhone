package com.codejoy.boom.clap.helper;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UserHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/codejoy/boom/clap/helper/impromptu;", "", "<init>", "()V", "Lcomplexometry/taiyuan;", "adValue", "", "attabal", "(Lcomplexometry/taiyuan;)V", "", "saneness", "I", "count", "", "dern", "Z", "()Z", "setNewUser", "(Z)V", "isNewUser", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class impromptu {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static boolean isNewUser;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static int count;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final impromptu f18262attabal = new impromptu();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int f18265wireman = 8;

    public final void attabal(complexometry.taiyuan adValue) {
        Intrinsics.checkNotNullParameter(adValue, "adValue");
        int i = count;
        if (i > 2) {
            return;
        }
        count = i + 1;
        if (adValue.getValueMicros() <= 0) {
            isNewUser = true;
        }
    }

    public final boolean saneness() {
        return isNewUser;
    }
}
