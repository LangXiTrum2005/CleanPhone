package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.ironsource.V5;
import com.unity3d.services.core.device.Storage;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00042\n\u0010\t\u001a\u00060\u0007j\u0002`\bH&¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH&¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH&¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/unity3d/ads/core/data/manager/StorageManager;", "", "Landroid/content/Context;", "context", "", "init", "(Landroid/content/Context;)Z", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "Lcom/unity3d/ads/core/data/manager/LegacyStorageType;", "type", "Lwj/r;", "initStorage", "(Lcom/unity3d/services/core/device/StorageManager$StorageType;)V", "Lcom/unity3d/services/core/device/Storage;", "Lcom/unity3d/ads/core/data/manager/LegacyStorage;", "getStorage", "(Lcom/unity3d/services/core/device/StorageManager$StorageType;)Lcom/unity3d/services/core/device/Storage;", "hasStorage", "(Lcom/unity3d/services/core/device/StorageManager$StorageType;)Z", "", V5.c.f27366b, "addStorageLocation", "(Lcom/unity3d/services/core/device/StorageManager$StorageType;Ljava/lang/String;)V", "removeStorage", "hasInitialized", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface StorageManager {
    void addStorageLocation(com.unity3d.services.core.device.StorageManager.StorageType type, String fileName);

    Storage getStorage(com.unity3d.services.core.device.StorageManager.StorageType type);

    void hasInitialized();

    boolean hasStorage(com.unity3d.services.core.device.StorageManager.StorageType type);

    boolean init(Context context);

    void initStorage(com.unity3d.services.core.device.StorageManager.StorageType type);

    void removeStorage(com.unity3d.services.core.device.StorageManager.StorageType type);
}
