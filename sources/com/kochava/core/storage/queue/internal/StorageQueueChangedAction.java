package com.kochava.core.storage.queue.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class StorageQueueChangedAction {
    public static final StorageQueueChangedAction X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final StorageQueueChangedAction f28070Y;
    public static final StorageQueueChangedAction Z;
    public static final /* synthetic */ StorageQueueChangedAction[] e0;

    static {
        StorageQueueChangedAction storageQueueChangedAction = new StorageQueueChangedAction("Add", 0);
        X = storageQueueChangedAction;
        StorageQueueChangedAction storageQueueChangedAction2 = new StorageQueueChangedAction("Remove", 1);
        f28070Y = storageQueueChangedAction2;
        StorageQueueChangedAction storageQueueChangedAction3 = new StorageQueueChangedAction("RemoveAll", 2);
        StorageQueueChangedAction storageQueueChangedAction4 = new StorageQueueChangedAction("Update", 3);
        Z = storageQueueChangedAction4;
        e0 = new StorageQueueChangedAction[]{storageQueueChangedAction, storageQueueChangedAction2, storageQueueChangedAction3, storageQueueChangedAction4, new StorageQueueChangedAction("UpdateAll", 4)};
    }

    public static StorageQueueChangedAction valueOf(String str) {
        return (StorageQueueChangedAction) Enum.valueOf(StorageQueueChangedAction.class, str);
    }

    public static StorageQueueChangedAction[] values() {
        return (StorageQueueChangedAction[]) e0.clone();
    }
}
