package com.dexterous.flutterlocalnotifications;

import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationDetails f10557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f10559c;

    public i(NotificationDetails notificationDetails, int i10, ArrayList arrayList) {
        this.f10557a = notificationDetails;
        this.f10558b = i10;
        this.f10559c = arrayList;
    }

    public final String toString() {
        return "ForegroundServiceStartParameter{notificationData=" + this.f10557a + ", startMode=" + this.f10558b + ", foregroundServiceTypes=" + this.f10559c + '}';
    }
}
