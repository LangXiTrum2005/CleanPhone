package com.google.android.gms.auth;

import android.content.Intent;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.zs;
import d5.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@KeepName
public class UserRecoverableAuthException extends zs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f11600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11601c;

    public UserRecoverableAuthException(int i10, Intent intent, String str) {
        super(str, 6);
        this.f11600b = intent;
        u.l(i10);
        this.f11601c = i10;
    }
}
