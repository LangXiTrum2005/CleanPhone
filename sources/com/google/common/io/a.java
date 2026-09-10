package com.google.common.io;

import android.app.NotificationChannel;
import java.nio.file.attribute.AclEntryPermission;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NotificationChannel b(int i2, String str, String str2) {
        return new NotificationChannel(str, str2, i2);
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return AclEntryPermission.class;
    }
}
