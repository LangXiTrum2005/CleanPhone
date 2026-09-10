package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.os.Build;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.google.firebase.datastorage.JavaDataStorage;
import com.google.firebase.datastorage.JavaDataStorageKt;
import com.smartdigimkt.n8.g;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
class HeartBeatInfoStorage {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Preferences.Key f20824b = PreferencesKeys.a("fire-global");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Preferences.Key f20825c = PreferencesKeys.a("fire-count");
    public static final Preferences.Key d = new Preferences.Key("last-used-date");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaDataStorage f20826a;

    public HeartBeatInfoStorage(Context context, String str) {
        this.f20826a = new JavaDataStorage(context, android.support.v4.media.a.C("FirebaseHeartBeat", str));
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strB = b(System.currentTimeMillis());
            for (Map.Entry entry : this.f20826a.b().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strB);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new AutoValue_HeartBeatResult(((Preferences.Key) entry.getKey()).f4729a, new ArrayList(hashSet)));
                    }
                }
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f20826a.a(new Function1() { // from class: com.google.firebase.heartbeatinfo.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((MutablePreferences) obj).d(HeartBeatInfoStorage.f20824b, Long.valueOf(jCurrentTimeMillis));
                        return null;
                    }
                });
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String b(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat(g.f37186b, Locale.UK).format(new Date(j));
    }

    public final synchronized Preferences.Key c(MutablePreferences mutablePreferences, String str) {
        for (Map.Entry entry : mutablePreferences.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return PreferencesKeys.b(((Preferences.Key) entry.getKey()).f4729a);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void d(MutablePreferences mutablePreferences, String str) {
        try {
            Preferences.Key keyC = c(mutablePreferences, str);
            if (keyC == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.a(mutablePreferences, keyC, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                mutablePreferences.c(keyC);
            } else {
                mutablePreferences.e(keyC, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
