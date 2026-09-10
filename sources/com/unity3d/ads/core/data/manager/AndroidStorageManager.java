package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.ironsource.V5;
import com.unity3d.services.core.device.Storage;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00062\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0003¨\u0006\u001b"}, d2 = {"Lcom/unity3d/ads/core/data/manager/AndroidStorageManager;", "Lcom/unity3d/ads/core/data/manager/StorageManager;", "<init>", "()V", "Landroid/content/Context;", "context", "", "init", "(Landroid/content/Context;)Z", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "Lcom/unity3d/ads/core/data/manager/LegacyStorageType;", "type", "Lwj/r;", "initStorage", "(Lcom/unity3d/services/core/device/StorageManager$StorageType;)V", "Lcom/unity3d/services/core/device/Storage;", "getStorage", "(Lcom/unity3d/services/core/device/StorageManager$StorageType;)Lcom/unity3d/services/core/device/Storage;", "hasStorage", "(Lcom/unity3d/services/core/device/StorageManager$StorageType;)Z", "", V5.c.f27366b, "addStorageLocation", "(Lcom/unity3d/services/core/device/StorageManager$StorageType;Ljava/lang/String;)V", "removeStorage", "hasInitialized", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidStorageManager implements StorageManager {
    private static final String KEY_INITIALIZED = "configuration.hasInitialized";

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void addStorageLocation(com.unity3d.services.core.device.StorageManager.StorageType type, String fileName) {
        n.f(type, "type");
        n.f(fileName, "fileName");
        com.unity3d.services.core.device.StorageManager.addStorageLocation(type, fileName);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public Storage getStorage(com.unity3d.services.core.device.StorageManager.StorageType type) {
        n.f(type, "type");
        Storage storage = com.unity3d.services.core.device.StorageManager.getStorage(type);
        n.e(storage, "getStorage(type)");
        return storage;
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void hasInitialized() {
        Storage storage = getStorage(com.unity3d.services.core.device.StorageManager.StorageType.PRIVATE);
        storage.set(KEY_INITIALIZED, Boolean.TRUE);
        storage.writeStorage();
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public boolean hasStorage(com.unity3d.services.core.device.StorageManager.StorageType type) {
        n.f(type, "type");
        return com.unity3d.services.core.device.StorageManager.hasStorage(type);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public boolean init(Context context) {
        n.f(context, "context");
        return com.unity3d.services.core.device.StorageManager.init(context);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void initStorage(com.unity3d.services.core.device.StorageManager.StorageType type) {
        n.f(type, "type");
        com.unity3d.services.core.device.StorageManager.initStorage(type);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void removeStorage(com.unity3d.services.core.device.StorageManager.StorageType type) {
        n.f(type, "type");
        com.unity3d.services.core.device.StorageManager.removeStorage(type);
    }
}
