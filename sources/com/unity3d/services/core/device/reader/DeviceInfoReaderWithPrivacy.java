package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.pii.PiiDataProvider;
import com.unity3d.services.core.device.reader.pii.PiiTrackingStatusReader;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class DeviceInfoReaderWithPrivacy implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final PiiDataProvider _piiDataProvider;
    private final PiiTrackingStatusReader _piiTrackingStatusReader;
    private final PrivacyConfigStorage _privacyConfigStorage;

    public DeviceInfoReaderWithPrivacy(IDeviceInfoReader iDeviceInfoReader, PrivacyConfigStorage privacyConfigStorage, PiiDataProvider piiDataProvider, PiiTrackingStatusReader piiTrackingStatusReader) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._privacyConfigStorage = privacyConfigStorage;
        this._piiDataProvider = piiDataProvider;
        this._piiTrackingStatusReader = piiTrackingStatusReader;
    }

    private Map<String, Object> getPiiAttributesFromDevice() {
        HashMap map = new HashMap();
        String advertisingTrackingId = this._piiDataProvider.getAdvertisingTrackingId();
        if (advertisingTrackingId != null) {
            map.put(JsonStorageKeyNames.ADVERTISING_TRACKING_ID_NORMALIZED_KEY, advertisingTrackingId);
        }
        return map;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        Map<String, Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        PrivacyConfigStorage privacyConfigStorage = this._privacyConfigStorage;
        if (privacyConfigStorage != null && privacyConfigStorage.getPrivacyConfig() != null) {
            if (this._privacyConfigStorage.getPrivacyConfig().allowedToSendPii()) {
                deviceInfoData.putAll(getPiiAttributesFromDevice());
            }
            if (this._privacyConfigStorage.getPrivacyConfig().shouldSendNonBehavioral()) {
                deviceInfoData.put(JsonStorageKeyNames.USER_NON_BEHAVIORAL_KEY, Boolean.valueOf(this._piiTrackingStatusReader.getUserNonBehavioralFlag()));
            }
        }
        return deviceInfoData;
    }
}
