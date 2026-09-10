package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.persistence.FileStore;

/* JADX INFO: loaded from: classes4.dex */
public class LogFileManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final NoopLogStore f20392c = new NoopLogStore();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileStore f20393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileLogStore f20394b = f20392c;

    public static final class NoopLogStore implements FileLogStore {
        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public final void a() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public final String b() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public final void c(long j, String str) {
        }
    }

    public LogFileManager(FileStore fileStore) {
        this.f20393a = fileStore;
    }

    public final String a() {
        return this.f20394b.b();
    }

    public final void b(String str) {
        this.f20394b.a();
        this.f20394b = f20392c;
        if (str == null) {
            return;
        }
        this.f20394b = new QueueFileLogStore(this.f20393a.b(str, "userlog"));
    }

    public final void c(long j, String str) {
        this.f20394b.c(j, str);
    }
}
