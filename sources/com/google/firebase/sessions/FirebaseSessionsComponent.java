package com.google.firebase.sessions;

import android.os.Build;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.MultiProcessDataStoreFactory;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import com.google.firebase.sessions.dagger.Component;
import com.google.firebase.sessions.dagger.Module;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes4.dex */
@Component
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent;", "", "Builder", "MainModule", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FirebaseSessionsComponent {

    @Component.Builder
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Builder {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$MainModule;", "", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Module
    public interface MainModule {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$MainModule$Companion;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public static DataStoreImpl a(Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, ContextScope contextScope, Function0 function0) {
                EmptyList emptyList = EmptyList.X;
                try {
                    System.loadLibrary("datastore_shared_counter");
                    return MultiProcessDataStoreFactory.a(serializer, replaceFileCorruptionHandler, contextScope, function0);
                } catch (SecurityException | UnsatisfiedLinkError unused) {
                    return DataStoreFactory.b(serializer, replaceFileCorruptionHandler, emptyList, contextScope, function0);
                }
            }

            public static void b(File file) throws IOException {
                File parentFile = file.getParentFile();
                if (parentFile == null) {
                    return;
                }
                if (parentFile.exists() && !parentFile.isDirectory() && Intrinsics.a(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
                    throw new IOException(android.support.v4.media.a.l(parentFile, "Failed to delete conflicting file: "));
                }
                if (parentFile.isDirectory()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
                    } catch (Exception e2) {
                        throw new IOException(android.support.v4.media.a.l(parentFile, "Failed to create directory: "), e2);
                    }
                } else if (!parentFile.mkdirs() && !parentFile.isDirectory()) {
                    throw new IOException(android.support.v4.media.a.l(parentFile, "Failed to create directory: "));
                }
            }
        }
    }

    SharedSessionRepository a();

    FirebaseSessions b();
}
