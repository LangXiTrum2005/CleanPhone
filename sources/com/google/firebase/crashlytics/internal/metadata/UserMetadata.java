package com.google.firebase.crashlytics.internal.metadata;

import com.applovin.shadow.okio.Segment;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class UserMetadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetaDataStore f20414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CrashlyticsWorkers f20415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20416c;
    public final SerializeableKeysMap d = new SerializeableKeysMap(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SerializeableKeysMap f20417e = new SerializeableKeysMap(true);
    public final RolloutAssignmentList f = new RolloutAssignmentList();
    public final AtomicMarkableReference g = new AtomicMarkableReference(null, false);

    public class SerializeableKeysMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicMarkableReference f20418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference f20419b = new AtomicReference(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f20420c;

        public SerializeableKeysMap(boolean z2) {
            this.f20420c = z2;
            this.f20418a = new AtomicMarkableReference(new KeysMap(z2 ? Segment.SIZE : 1024), false);
        }
    }

    public UserMetadata(String str, FileStore fileStore, CrashlyticsWorkers crashlyticsWorkers) {
        this.f20416c = str;
        this.f20414a = new MetaDataStore(fileStore);
        this.f20415b = crashlyticsWorkers;
    }

    public static UserMetadata c(String str, FileStore fileStore, CrashlyticsWorkers crashlyticsWorkers) throws Throwable {
        List listB;
        MetaDataStore metaDataStore = new MetaDataStore(fileStore);
        UserMetadata userMetadata = new UserMetadata(str, fileStore, crashlyticsWorkers);
        ((KeysMap) userMetadata.d.f20418a.getReference()).c(metaDataStore.c(str, false));
        ((KeysMap) userMetadata.f20417e.f20418a.getReference()).c(metaDataStore.c(str, true));
        userMetadata.g.set(metaDataStore.d(str), false);
        Logger logger = Logger.f20289a;
        File fileB = fileStore.b(str, "rollouts-state");
        if (!fileB.exists() || fileB.length() == 0) {
            MetaDataStore.g(fileB, android.support.v4.media.a.C("The file has a length of zero for session: ", str));
            listB = Collections.EMPTY_LIST;
        } else {
            FileInputStream fileInputStream = null;
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(fileB);
                    try {
                        listB = MetaDataStore.b(CommonUtils.i(fileInputStream2));
                        logger.b("Loaded rollouts state:\n" + listB + "\nfor session " + str, null);
                        CommonUtils.b(fileInputStream2, "Failed to close rollouts state file.");
                    } catch (Exception e2) {
                        e = e2;
                        fileInputStream = fileInputStream2;
                        logger.f(e, "Error deserializing rollouts state.");
                        MetaDataStore.f(fileB);
                        CommonUtils.b(fileInputStream, "Failed to close rollouts state file.");
                        listB = Collections.EMPTY_LIST;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        CommonUtils.b(fileInputStream, "Failed to close rollouts state file.");
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        userMetadata.f.b(listB);
        return userMetadata;
    }

    public static String d(String str, FileStore fileStore) {
        return new MetaDataStore(fileStore).d(str);
    }

    public final Map a(Map map) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        boolean zIsEmpty = map.isEmpty();
        SerializeableKeysMap serializeableKeysMap = this.d;
        if (zIsEmpty) {
            KeysMap keysMap = (KeysMap) serializeableKeysMap.f20418a.getReference();
            synchronized (keysMap) {
                mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(keysMap.f20389a));
            }
            return mapUnmodifiableMap2;
        }
        KeysMap keysMap2 = (KeysMap) serializeableKeysMap.f20418a.getReference();
        synchronized (keysMap2) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(keysMap2.f20389a));
        }
        HashMap map2 = new HashMap(mapUnmodifiableMap);
        int i2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String strA = KeysMap.a(1024, (String) entry.getKey());
            if (map2.size() < 64 || map2.containsKey(strA)) {
                map2.put(strA, KeysMap.a(1024, (String) entry.getValue()));
            } else {
                i2++;
            }
        }
        if (i2 > 0) {
            Logger.f20289a.f(null, "Ignored " + i2 + " keys when adding event specific keys. Maximum allowable: 1024");
        }
        return Collections.unmodifiableMap(map2);
    }

    public final Map b() {
        Map mapUnmodifiableMap;
        KeysMap keysMap = (KeysMap) this.f20417e.f20418a.getReference();
        synchronized (keysMap) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(keysMap.f20389a));
        }
        return mapUnmodifiableMap;
    }

    public final void e(String str) {
        final SerializeableKeysMap serializeableKeysMap = this.f20417e;
        synchronized (serializeableKeysMap) {
            try {
                if (((KeysMap) serializeableKeysMap.f20418a.getReference()).b(str)) {
                    AtomicMarkableReference atomicMarkableReference = serializeableKeysMap.f20418a;
                    atomicMarkableReference.set((KeysMap) atomicMarkableReference.getReference(), true);
                    Runnable runnable = new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.c
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            UserMetadata.SerializeableKeysMap serializeableKeysMap2 = serializeableKeysMap;
                            Map mapUnmodifiableMap = null;
                            serializeableKeysMap2.f20419b.set(null);
                            synchronized (serializeableKeysMap2) {
                                if (serializeableKeysMap2.f20418a.isMarked()) {
                                    KeysMap keysMap = (KeysMap) serializeableKeysMap2.f20418a.getReference();
                                    synchronized (keysMap) {
                                        mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(keysMap.f20389a));
                                    }
                                    AtomicMarkableReference atomicMarkableReference2 = serializeableKeysMap2.f20418a;
                                    atomicMarkableReference2.set((KeysMap) atomicMarkableReference2.getReference(), false);
                                }
                            }
                            if (mapUnmodifiableMap != null) {
                                UserMetadata userMetadata = UserMetadata.this;
                                userMetadata.f20414a.h(userMetadata.f20416c, mapUnmodifiableMap, serializeableKeysMap2.f20420c);
                            }
                        }
                    };
                    AtomicReference atomicReference = serializeableKeysMap.f20419b;
                    while (!atomicReference.compareAndSet(null, runnable)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    UserMetadata.this.f20415b.f20377b.a(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(final String str) {
        final Map mapUnmodifiableMap;
        synchronized (this.f20416c) {
            this.f20416c = str;
            KeysMap keysMap = (KeysMap) this.d.f20418a.getReference();
            synchronized (keysMap) {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(keysMap.f20389a));
            }
            final List listA = this.f.a();
            this.f20415b.f20377b.a(new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.a
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    UserMetadata userMetadata = this.X;
                    String str2 = (String) userMetadata.g.getReference();
                    String str3 = str;
                    MetaDataStore metaDataStore = userMetadata.f20414a;
                    if (str2 != null) {
                        String str4 = (String) userMetadata.g.getReference();
                        File fileB = metaDataStore.f20396a.b(str3, "user-data");
                        BufferedWriter bufferedWriter = null;
                        try {
                            try {
                                MetaDataStore.AnonymousClass1 anonymousClass1 = new MetaDataStore.AnonymousClass1();
                                anonymousClass1.put("userId", str4);
                                String string = anonymousClass1.toString();
                                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), MetaDataStore.f20395b));
                                try {
                                    bufferedWriter2.write(string);
                                    bufferedWriter2.flush();
                                    CommonUtils.b(bufferedWriter2, "Failed to close user metadata file.");
                                } catch (Exception e2) {
                                    e = e2;
                                    bufferedWriter = bufferedWriter2;
                                    Logger.f20289a.f(e, "Error serializing user metadata.");
                                    CommonUtils.b(bufferedWriter, "Failed to close user metadata file.");
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedWriter = bufferedWriter2;
                                    CommonUtils.b(bufferedWriter, "Failed to close user metadata file.");
                                    throw th;
                                }
                            } catch (Exception e3) {
                                e = e3;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    Map map = mapUnmodifiableMap;
                    if (!map.isEmpty()) {
                        metaDataStore.h(str3, map, false);
                    }
                    List list = listA;
                    if (list.isEmpty()) {
                        return;
                    }
                    metaDataStore.i(str3, list);
                }
            });
        }
    }
}
