package com.unity3d.services.core.device.reader;

import com.applovin.impl.ca;
import com.ironsource.O6;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class MinimalDeviceInfoReader implements IDeviceInfoReader {
    final IGameSessionIdReader _gameSessionIdReader;

    public MinimalDeviceInfoReader(IGameSessionIdReader iGameSessionIdReader) {
        this._gameSessionIdReader = iGameSessionIdReader;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        HashMap mapN = ca.n(O6.H, "android");
        mapN.put("sdkVersion", Integer.valueOf(SdkProperties.getVersionCode()));
        mapN.put("sdkVersionName", SdkProperties.getVersionName());
        mapN.put("idfi", Device.getIdfi());
        mapN.put(JsonStorageKeyNames.GAME_SESSION_ID_NORMALIZED_KEY, this._gameSessionIdReader.getGameSessionIdAndStore());
        mapN.put("ts", Long.valueOf(System.currentTimeMillis()));
        mapN.put(AndroidGetAdPlayerContext.KEY_GAME_ID, ClientProperties.getGameId());
        return mapN;
    }
}
