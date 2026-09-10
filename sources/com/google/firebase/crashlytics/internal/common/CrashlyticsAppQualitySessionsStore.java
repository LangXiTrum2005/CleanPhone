package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
class CrashlyticsAppQualitySessionsStore {
    public static final b d = new b(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f20312e = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileStore f20313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20314b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20315c = null;

    public CrashlyticsAppQualitySessionsStore(FileStore fileStore) {
        this.f20313a = fileStore;
    }

    public static void a(FileStore fileStore, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            fileStore.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e2) {
            Logger.f20289a.f(e2, "Failed to persist App Quality Sessions session id.");
        }
    }
}
