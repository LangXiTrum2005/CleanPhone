package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.appevents.internal.AppEventUtility;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/facebook/appevents/AppEventDiskStore;", "", "<init>", "()V", "Lcom/facebook/appevents/PersistedEvents;", "readAndClearStore", "()Lcom/facebook/appevents/PersistedEvents;", "eventsToPersist", "Lwj/r;", "saveEventsToDisk$facebook_core_release", "(Lcom/facebook/appevents/PersistedEvents;)V", "saveEventsToDisk", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "PERSISTED_EVENTS_FILENAME", "MovedClassObjectInputStream", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AppEventDiskStore {
    private static final String PERSISTED_EVENTS_FILENAME = "AppEventsLogger.persistedevents";
    public static final AppEventDiskStore INSTANCE = new AppEventDiskStore();
    private static final String TAG = AppEventDiskStore.class.getName();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/AppEventDiskStore$MovedClassObjectInputStream;", "Ljava/io/ObjectInputStream;", "inputStream", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)V", "readClassDescriptor", "Ljava/io/ObjectStreamClass;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class MovedClassObjectInputStream extends ObjectInputStream {
        private static final String ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1";
        private static final String APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2";

        public MovedClassObjectInputStream(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        public ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
            ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
            if (n.a(resultClassDescriptor.getName(), ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME)) {
                resultClassDescriptor = ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
            } else if (n.a(resultClassDescriptor.getName(), APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME)) {
                resultClassDescriptor = ObjectStreamClass.lookup(AppEvent.SerializationProxyV2.class);
            }
            n.e(resultClassDescriptor, "resultClassDescriptor");
            return resultClassDescriptor;
        }
    }

    private AppEventDiskStore() {
    }

    public static final synchronized PersistedEvents readAndClearStore() {
        PersistedEvents persistedEvents;
        ClassNotFoundException e10;
        IOException e11;
        String str;
        AppEventUtility.assertIsNotMainThread();
        Context contextB = s.b();
        PersistedEvents persistedEvents2 = null;
        try {
            try {
                FileInputStream fileInputStreamOpenFileInput = contextB.openFileInput(PERSISTED_EVENTS_FILENAME);
                n.e(fileInputStreamOpenFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                MovedClassObjectInputStream movedClassObjectInputStream = new MovedClassObjectInputStream(new BufferedInputStream(fileInputStreamOpenFileInput));
                try {
                    Object object = movedClassObjectInputStream.readObject();
                    n.d(object, "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
                    persistedEvents = (PersistedEvents) object;
                    try {
                        movedClassObjectInputStream.close();
                        try {
                            contextB.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                        } catch (Exception e12) {
                            e = e12;
                            str = TAG;
                            Log.w(str, "Got unexpected exception when removing events file: ", e);
                        }
                    } catch (FileNotFoundException unused) {
                        persistedEvents2 = persistedEvents;
                        try {
                            contextB.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                        } catch (Exception e13) {
                            Log.w(TAG, "Got unexpected exception when removing events file: ", e13);
                        }
                        persistedEvents = persistedEvents2;
                    } catch (IOException e14) {
                        e11 = e14;
                        Log.w(TAG, "Got unexpected exception while reading events: ", e11);
                        try {
                            contextB.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                        } catch (Exception e15) {
                            e = e15;
                            str = TAG;
                            Log.w(str, "Got unexpected exception when removing events file: ", e);
                        }
                    } catch (ClassNotFoundException e16) {
                        e10 = e16;
                        Log.w(TAG, "Got unexpected exception while reading events: ", e10);
                        try {
                            contextB.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                        } catch (Exception e17) {
                            e = e17;
                            str = TAG;
                            Log.w(str, "Got unexpected exception when removing events file: ", e);
                        }
                    }
                    if (persistedEvents == null) {
                        persistedEvents = new PersistedEvents();
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        i0.j(movedClassObjectInputStream, th2);
                        throw th3;
                    }
                }
            } catch (FileNotFoundException unused2) {
            } catch (IOException e18) {
                persistedEvents = null;
                e11 = e18;
            } catch (ClassNotFoundException e19) {
                persistedEvents = null;
                e10 = e19;
            }
        } catch (Throwable th4) {
            try {
                contextB.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
            } catch (Exception e20) {
                Log.w(TAG, "Got unexpected exception when removing events file: ", e20);
            }
            throw th4;
        }
        return persistedEvents;
    }

    public static final void saveEventsToDisk$facebook_core_release(PersistedEvents eventsToPersist) {
        Context contextB = s.b();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(contextB.openFileOutput(PERSISTED_EVENTS_FILENAME, 0)));
            try {
                objectOutputStream.writeObject(eventsToPersist);
                objectOutputStream.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    i0.j(objectOutputStream, th2);
                    throw th3;
                }
            }
        } catch (IOException e10) {
            Log.w(TAG, "Got unexpected exception while persisting events: ", e10);
            try {
                contextB.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
            } catch (Exception unused) {
            }
        }
    }
}
