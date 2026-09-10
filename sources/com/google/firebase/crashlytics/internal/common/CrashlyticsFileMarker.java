package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
class CrashlyticsFileMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileStore f20340b;

    public CrashlyticsFileMarker(String str, FileStore fileStore) {
        this.f20339a = str;
        this.f20340b = fileStore;
    }

    public final void a() {
        String str = this.f20339a;
        try {
            FileStore fileStore = this.f20340b;
            fileStore.getClass();
            new File(fileStore.f20729c, str).createNewFile();
        } catch (IOException e2) {
            Logger.f20289a.c(e2, "Error creating marker: ".concat(str));
        }
    }
}
