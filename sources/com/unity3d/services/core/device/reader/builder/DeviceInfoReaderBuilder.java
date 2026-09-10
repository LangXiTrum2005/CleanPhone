package com.unity3d.services.core.device.reader.builder;

import com.ironsource.C0493o5;
import com.ironsource.O6;
import com.ironsource.X3;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.reader.DeviceInfoReaderExtended;
import com.unity3d.services.core.device.reader.DeviceInfoReaderFilterProvider;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithAuid;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithFilter;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithLifecycle;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithMetrics;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithPrivacy;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithRequestType;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithSessionId;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithStorageInfo;
import com.unity3d.services.core.device.reader.IDeviceInfoReader;
import com.unity3d.services.core.device.reader.IGameSessionIdReader;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.device.reader.MinimalDeviceInfoReader;
import com.unity3d.services.core.device.reader.pii.PiiDataProvider;
import com.unity3d.services.core.device.reader.pii.PiiTrackingStatusReader;
import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import com.unity3d.services.core.misc.JsonStorageAggregator;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.Session;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class DeviceInfoReaderBuilder {
    private final ConfigurationReader _configurationReader;
    private final IGameSessionIdReader _gameSessionIdReader;
    private final PrivacyConfigStorage _privacyConfigStorage;

    public DeviceInfoReaderBuilder(ConfigurationReader configurationReader, PrivacyConfigStorage privacyConfigStorage, IGameSessionIdReader iGameSessionIdReader) {
        this._configurationReader = configurationReader;
        this._privacyConfigStorage = privacyConfigStorage;
        this._gameSessionIdReader = iGameSessionIdReader;
    }

    private JsonFlattenerRules getTsiRequestStorageRules() {
        return new JsonFlattenerRules(Arrays.asList("privacy", "gdpr", "framework", O6.G1, "unity", "pipl", "configuration", "user", JsonStorageKeyNames.UNIFIED_CONFIG_KEY), Collections.singletonList(X3.i.X), Arrays.asList("ts", "exclude", "pii", "nonBehavioral", "nonbehavioral"));
    }

    public IDeviceInfoReader build() {
        Storage storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE);
        Storage storage2 = StorageManager.getStorage(StorageManager.StorageType.PUBLIC);
        Storage storage3 = StorageManager.getStorage(StorageManager.StorageType.MEMORY);
        JsonStorageAggregator jsonStorageAggregator = new JsonStorageAggregator(Arrays.asList(storage2, storage));
        return new DeviceInfoReaderWithMetrics(new DeviceInfoReaderWithFilter(new DeviceInfoReaderWithPrivacy(new DeviceInfoReaderWithStorageInfo(new DeviceInfoReaderWithStorageInfo(new DeviceInfoReaderWithLifecycle(new DeviceInfoReaderExtended(new DeviceInfoReaderWithAuid(new DeviceInfoReaderWithSessionId(buildWithRequestType(InitRequestType.TOKEN), Session.INSTANCE))), CachedLifecycle.getLifecycleListener()), getMediationInfoRules(), storage3), getTsiRequestStorageRules(), jsonStorageAggregator), this._privacyConfigStorage, new PiiDataProvider(), new PiiTrackingStatusReader(jsonStorageAggregator)), new DeviceInfoReaderFilterProvider(storage).getFilterList()), (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class));
    }

    public IDeviceInfoReader buildWithRequestType(InitRequestType initRequestType) {
        return new DeviceInfoReaderWithRequestType(new MinimalDeviceInfoReader(this._gameSessionIdReader), initRequestType);
    }

    public JsonFlattenerRules getMediationInfoRules() {
        return new JsonFlattenerRules(Collections.singletonList("mediation"), Collections.singletonList(X3.i.X), Arrays.asList("ts", C0493o5.f29912a));
    }
}
