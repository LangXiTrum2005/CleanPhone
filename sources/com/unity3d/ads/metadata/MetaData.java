package com.unity3d.ads.metadata;

import android.content.Context;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageEvent;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class MetaData extends JsonStorage {
    private String _category;
    protected Context _context;

    public MetaData(Context context) {
        this._context = context.getApplicationContext();
    }

    private String getActualKey(String str) {
        if (getCategory() == null) {
            return str;
        }
        return getCategory() + "." + str;
    }

    private synchronized boolean set(String str, boolean z10) {
        return set(str, Boolean.valueOf(z10));
    }

    public void commit() {
        if (!StorageManager.init(this._context)) {
            DeviceLog.error("Unity Ads could not commit metadata due to storage error");
            return;
        }
        Storage storage = StorageManager.getStorage(getStorageType());
        if (getData() == null || storage == null) {
            return;
        }
        Iterator<String> itKeys = getData().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objMergeJsonObjects = get(next);
            if (storage.get(next) != null && (storage.get(next) instanceof JSONObject) && (get(next) instanceof JSONObject)) {
                try {
                    objMergeJsonObjects = Utilities.mergeJsonObjects((JSONObject) objMergeJsonObjects, (JSONObject) storage.get(next));
                } catch (Exception e10) {
                    DeviceLog.exception("Exception merging JSONs", e10);
                }
            }
            storage.set(next, objMergeJsonObjects);
        }
        storage.writeStorage();
        storage.sendEvent(StorageEvent.SET, getData());
    }

    public String getCategory() {
        return this._category;
    }

    public StorageManager.StorageType getStorageType() {
        return StorageManager.StorageType.PUBLIC;
    }

    public void setCategory(String str) {
        this._category = str;
    }

    public synchronized boolean setRaw(String str, Object obj) {
        initData();
        return super.set(getActualKey(str), obj);
    }

    private synchronized boolean set(String str, int i10) {
        return set(str, Integer.valueOf(i10));
    }

    private synchronized boolean set(String str, long j10) {
        return set(str, Long.valueOf(j10));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0046  */
    @Override // com.unity3d.services.core.misc.JsonStorage
    public synchronized boolean set(String str, Object obj) {
        boolean z10;
        initData();
        if (super.set(getActualKey(str) + ".value", obj)) {
            if (super.set(getActualKey(str) + ".ts", Long.valueOf(System.currentTimeMillis()))) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        return z10;
    }
}
