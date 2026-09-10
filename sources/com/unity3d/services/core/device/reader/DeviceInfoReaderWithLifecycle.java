package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.lifecycle.LifecycleCache;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class DeviceInfoReaderWithLifecycle implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final LifecycleCache _lifecycleCache;

    public DeviceInfoReaderWithLifecycle(IDeviceInfoReader iDeviceInfoReader, LifecycleCache lifecycleCache) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._lifecycleCache = lifecycleCache;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        Map<String, Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        deviceInfoData.put("appActive", Boolean.valueOf(this._lifecycleCache.isAppActive()));
        return deviceInfoData;
    }
}
