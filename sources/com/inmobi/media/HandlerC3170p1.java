package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class HandlerC3170p1 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f23878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3154o1 f23879b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3170p1(Looper looper, C3233t1 assetStore) {
        super(looper);
        Intrinsics.f(looper, "looper");
        Intrinsics.f(assetStore, "assetStore");
        this.f23878a = new WeakReference(assetStore);
        this.f23879b = new C3154o1(this);
    }

    public final void a() {
        try {
            sendEmptyMessage(1);
        } catch (Exception unused) {
            C3233t1 c3233t1 = C3233t1.f23990a;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.f(msg, "msg");
        try {
            if (C3233t1.m.get()) {
                C3233t1 c3233t1 = (C3233t1) this.f23878a.get();
                int i2 = msg.what;
                if (i2 == 1) {
                    if (c3233t1 != null) {
                        AdConfig.AssetCacheConfig assetCache = C3233t1.f23992c;
                        if (assetCache == null) {
                            LinkedHashMap linkedHashMap = O2.f23027a;
                            Config configA = M2.a("ads", Uc.b(), null);
                            Intrinsics.d(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
                            assetCache = ((AdConfig) configA).getAssetCache();
                        }
                        ArrayList<C3072j> arrayListB = Nc.a().b();
                        if (arrayListB.isEmpty()) {
                            C3233t1.d();
                            return;
                        }
                        C3072j c3072j = (C3072j) arrayListB.get(0);
                        for (C3072j c3072j2 : arrayListB) {
                            if (!C3233t1.k.containsKey(c3072j.f23703b)) {
                                c3072j = c3072j2;
                                break;
                            }
                        }
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 1;
                        long jCurrentTimeMillis = System.currentTimeMillis() - c3072j.f23705e;
                        try {
                            if (jCurrentTimeMillis < assetCache.getRetryInterval() * 1000) {
                                sendMessageDelayed(messageObtain, ((long) (assetCache.getRetryInterval() * 1000)) - jCurrentTimeMillis);
                                return;
                            }
                            if (C3233t1.k.containsKey(c3072j.f23703b)) {
                                sendMessageDelayed(messageObtain, assetCache.getRetryInterval() * 1000);
                                return;
                            }
                            Message messageObtain2 = Message.obtain();
                            messageObtain2.what = 2;
                            messageObtain2.obj = c3072j.f23703b;
                            sendMessage(messageObtain2);
                            return;
                        } catch (Exception unused) {
                            C3233t1 c3233t2 = C3233t1.f23990a;
                            return;
                        }
                    }
                    return;
                }
                if (i2 != 2) {
                    if (i2 == 3) {
                        a();
                        return;
                    }
                    if (i2 != 4) {
                        return;
                    }
                    if (c3233t1 != null) {
                        Object obj = msg.obj;
                        C3072j c3072j3 = obj instanceof C3072j ? (C3072j) obj : null;
                        if (c3072j3 != null) {
                            C3122m1 c3122m1A = Nc.a();
                            c3122m1A.getClass();
                            c3122m1A.a("id = ?", new String[]{String.valueOf(c3072j3.f23702a)});
                        }
                    }
                    a();
                    return;
                }
                if (c3233t1 != null) {
                    Object obj2 = msg.obj;
                    String str = obj2 instanceof String ? (String) obj2 : null;
                    if (str == null) {
                        return;
                    }
                    C3072j c3072jB = Nc.a().b(str);
                    if (c3072jB == null) {
                        a();
                        return;
                    }
                    if (c3072jB.a()) {
                        try {
                            sendEmptyMessage(3);
                        } catch (Exception unused2) {
                            C3233t1 c3233t3 = C3233t1.f23990a;
                        }
                        c3233t1.a(c3072jB, (byte) -1);
                        return;
                    }
                    AdConfig.AssetCacheConfig assetCacheConfig = C3233t1.f23992c;
                    if (assetCacheConfig != null) {
                        assetCacheConfig.getMaxRetries();
                    }
                    if (c3072jB.d > 0) {
                        if (T9.a(false) != null) {
                            c3233t1.a(c3072jB, c3072jB.f23708l);
                            C3233t1.d();
                            return;
                        } else {
                            if (C3233t1.a(c3072jB, this.f23879b)) {
                                return;
                            }
                            a();
                            return;
                        }
                    }
                    c3072jB.f23708l = (byte) 6;
                    c3233t1.a(c3072jB, (byte) 6);
                    try {
                        Message messageObtain3 = Message.obtain();
                        messageObtain3.what = 4;
                        messageObtain3.obj = c3072jB;
                        sendMessage(messageObtain3);
                        return;
                    } catch (Exception unused3) {
                        C3233t1 c3233t4 = C3233t1.f23990a;
                        return;
                    }
                }
                return;
                C3233t1 c3233t5 = C3233t1.f23990a;
                S5 s5 = S5.f23167a;
                S5.d.a(AbstractC3285w5.a(e, "event"));
            }
        } catch (Exception e2) {
            C3233t1 c3233t6 = C3233t1.f23990a;
            S5 s6 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }
}
