package com.google.android.gms.internal.ads;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ClipData f12674a = ClipData.newIntent("", new Intent());

    public static Intent a(Intent intent, int i10) {
        boolean zB = b(0, 17);
        boolean zB2 = b(0, 9);
        boolean zB3 = b(0, 5);
        boolean zB4 = b(0, 3);
        ps1.C("Must set component on Intent.", intent.getComponent() != null);
        if (b(0, 1)) {
            ps1.C("Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.", !b(i10, 67108864));
        } else {
            ps1.C("Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.", b(i10, 67108864));
        }
        Intent intent2 = new Intent(intent);
        if (!b(i10, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!zB4 && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!zB2 && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!zB3 && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!zB && intent2.getClipData() == null) {
                intent2.setClipData(f12674a);
            }
        }
        return intent2;
    }

    public static boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
