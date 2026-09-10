package com.google.firebase.heartbeatinfo;

import android.util.Base64OutputStream;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.google.firebase.datastorage.JavaDataStorageKt;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Callable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ DefaultHeartBeatController f20827Y;

    public /* synthetic */ a(DefaultHeartBeatController defaultHeartBeatController, int i2) {
        this.X = i2;
        this.f20827Y = defaultHeartBeatController;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.X) {
            case 0:
                DefaultHeartBeatController defaultHeartBeatController = this.f20827Y;
                synchronized (defaultHeartBeatController) {
                    final HeartBeatInfoStorage heartBeatInfoStorage = (HeartBeatInfoStorage) defaultHeartBeatController.f20820a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    final String userAgent = ((UserAgentPublisher) defaultHeartBeatController.f20822c.get()).getUserAgent();
                    synchronized (heartBeatInfoStorage) {
                        final String strB = heartBeatInfoStorage.b(jCurrentTimeMillis);
                        final Preferences.Key keyB = PreferencesKeys.b(userAgent);
                        heartBeatInfoStorage.f20826a.a(new Function1() { // from class: com.google.firebase.heartbeatinfo.d
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Object obj2;
                                HeartBeatInfoStorage heartBeatInfoStorage2 = heartBeatInfoStorage;
                                String str = strB;
                                String str2 = userAgent;
                                Preferences.Key key = keyB;
                                MutablePreferences mutablePreferences = (MutablePreferences) obj;
                                Object obj3 = null;
                                if (((String) JavaDataStorageKt.a(mutablePreferences, HeartBeatInfoStorage.d, "")).equals(str)) {
                                    Preferences.Key keyC = heartBeatInfoStorage2.c(mutablePreferences, str);
                                    if (keyC == null || keyC.f4729a.equals(str2)) {
                                        return null;
                                    }
                                    synchronized (heartBeatInfoStorage2) {
                                        heartBeatInfoStorage2.d(mutablePreferences, str);
                                        HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.a(mutablePreferences, key, new HashSet()));
                                        hashSet.add(str);
                                        mutablePreferences.e(key, hashSet);
                                    }
                                    return null;
                                }
                                Preferences.Key key2 = HeartBeatInfoStorage.f20825c;
                                long jLongValue = ((Long) JavaDataStorageKt.a(mutablePreferences, key2, 0L)).longValue();
                                if (jLongValue + 1 == 30) {
                                    synchronized (heartBeatInfoStorage2) {
                                        try {
                                            long jLongValue2 = ((Long) JavaDataStorageKt.a(mutablePreferences, key2, 0L)).longValue();
                                            String str3 = "";
                                            Set hashSet2 = new HashSet();
                                            String str4 = null;
                                            for (Map.Entry entry : mutablePreferences.a().entrySet()) {
                                                if (entry.getValue() instanceof Set) {
                                                    Set<String> set = (Set) entry.getValue();
                                                    for (String str5 : set) {
                                                        Object obj4 = obj3;
                                                        if (str4 == null || str4.compareTo(str5) > 0) {
                                                            str3 = ((Preferences.Key) entry.getKey()).f4729a;
                                                            str4 = str5;
                                                            hashSet2 = set;
                                                        }
                                                        obj3 = obj4;
                                                    }
                                                }
                                                obj3 = obj3;
                                            }
                                            obj2 = obj3;
                                            HashSet hashSet3 = new HashSet(hashSet2);
                                            hashSet3.remove(str4);
                                            mutablePreferences.e(PreferencesKeys.b(str3), hashSet3);
                                            jLongValue = jLongValue2 - 1;
                                            mutablePreferences.d(HeartBeatInfoStorage.f20825c, Long.valueOf(jLongValue));
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                } else {
                                    obj2 = null;
                                }
                                HashSet hashSet4 = new HashSet((Collection) JavaDataStorageKt.a(mutablePreferences, key, new HashSet()));
                                hashSet4.add(str);
                                mutablePreferences.e(key, hashSet4);
                                mutablePreferences.d(HeartBeatInfoStorage.f20825c, Long.valueOf(jLongValue + 1));
                                mutablePreferences.d(HeartBeatInfoStorage.d, str);
                                return obj2;
                            }
                        });
                    }
                }
                return null;
            default:
                DefaultHeartBeatController defaultHeartBeatController2 = this.f20827Y;
                synchronized (defaultHeartBeatController2) {
                    try {
                        final HeartBeatInfoStorage heartBeatInfoStorage2 = (HeartBeatInfoStorage) defaultHeartBeatController2.f20820a.get();
                        ArrayList arrayListA = heartBeatInfoStorage2.a();
                        synchronized (heartBeatInfoStorage2) {
                            heartBeatInfoStorage2.f20826a.a(new Function1() { // from class: com.google.firebase.heartbeatinfo.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    MutablePreferences mutablePreferences = (MutablePreferences) obj;
                                    Preferences.Key key = HeartBeatInfoStorage.f20824b;
                                    HeartBeatInfoStorage heartBeatInfoStorage3 = heartBeatInfoStorage2;
                                    long j = 0;
                                    for (Map.Entry entry : mutablePreferences.a().entrySet()) {
                                        if (entry.getValue() instanceof Set) {
                                            Preferences.Key key2 = (Preferences.Key) entry.getKey();
                                            Set set = (Set) entry.getValue();
                                            String strB2 = heartBeatInfoStorage3.b(System.currentTimeMillis());
                                            if (set.contains(strB2)) {
                                                Object[] objArr = {strB2};
                                                HashSet hashSet = new HashSet(1);
                                                Object obj2 = objArr[0];
                                                Objects.requireNonNull(obj2);
                                                if (!hashSet.add(obj2)) {
                                                    throw new IllegalArgumentException("duplicate element: " + obj2);
                                                }
                                                mutablePreferences.d(key2, Collections.unmodifiableSet(hashSet));
                                                j++;
                                            } else {
                                                mutablePreferences.c(key2);
                                            }
                                        }
                                    }
                                    Preferences.Key key3 = HeartBeatInfoStorage.f20825c;
                                    if (j == 0) {
                                        mutablePreferences.c(key3);
                                        return null;
                                    }
                                    mutablePreferences.d(key3, Long.valueOf(j));
                                    return null;
                                }
                            });
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i2 = 0; i2 < arrayListA.size(); i2++) {
                            HeartBeatResult heartBeatResult = (HeartBeatResult) arrayListA.get(i2);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", heartBeatResult.b());
                            jSONObject.put("dates", new JSONArray((Collection) heartBeatResult.a()));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                    break;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                base64OutputStream.close();
                                break;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return string;
        }
    }
}
