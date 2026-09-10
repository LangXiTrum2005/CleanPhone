package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class GameSessionIdReader implements IGameSessionIdReader {
    private static final int GAME_SESSION_ID_LENGTH = 12;
    private static volatile GameSessionIdReader _instance;
    private Long gameSessionId;

    private GameSessionIdReader() {
    }

    private void generate() {
        UUID uuidRandomUUID = UUID.randomUUID();
        this.gameSessionId = Long.valueOf((Long.toString(uuidRandomUUID.getMostSignificantBits()) + Long.toString(uuidRandomUUID.getLeastSignificantBits())).replace("-", "").substring(0, 12));
    }

    public static GameSessionIdReader getInstance() {
        if (_instance == null) {
            synchronized (GameSessionIdReader.class) {
                try {
                    if (_instance == null) {
                        _instance = new GameSessionIdReader();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return _instance;
    }

    private void store() {
        Storage storage;
        if (!StorageManager.init(ClientProperties.getApplicationContext()) || (storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE)) == null) {
            return;
        }
        storage.set(JsonStorageKeyNames.GAME_SESSION_ID_NORMALIZED_KEY, this.gameSessionId);
        storage.writeStorage();
    }

    @Override // com.unity3d.services.core.device.reader.IGameSessionIdReader
    public synchronized Long getGameSessionId() {
        try {
            if (this.gameSessionId == null) {
                generate();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.gameSessionId;
    }

    @Override // com.unity3d.services.core.device.reader.IGameSessionIdReader
    public synchronized Long getGameSessionIdAndStore() {
        try {
            if (this.gameSessionId == null) {
                generate();
                store();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.gameSessionId;
    }
}
