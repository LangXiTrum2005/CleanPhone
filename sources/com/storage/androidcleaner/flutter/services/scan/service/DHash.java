package com.storage.androidcleaner.flutter.services.scan.service;

import android.graphics.Bitmap;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/storage/androidcleaner/flutter/services/scan/service/DHash;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "fromBitmap", "(Landroid/graphics/Bitmap;)J", "app_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
final class DHash {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DHash f38395a = new DHash();

    static {
        System.loadLibrary("dhash");
    }

    public final native long fromBitmap(Bitmap bitmap);
}
