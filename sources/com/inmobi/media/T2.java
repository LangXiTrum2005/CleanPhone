package com.inmobi.media;

import android.os.Message;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class T2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I2 f23194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U2 f23195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U2 f23196c;

    public T2(I2 callback, U2 request, U2 u2) {
        Intrinsics.f(callback, "callback");
        Intrinsics.f(request, "request");
        this.f23194a = callback;
        this.f23195b = request;
        this.f23196c = u2;
    }

    public final boolean a(U2 u2, int i2, LinkedHashMap linkedHashMap) throws InterruptedException {
        if (i2 <= u2.f23252z) {
            Thread.sleep(u2.f23250A * 1000);
            return false;
        }
        Iterator it = u2.y.entrySet().iterator();
        while (it.hasNext()) {
            W2 w2 = (W2) linkedHashMap.get((String) ((Map.Entry) it.next()).getKey());
            if (w2 != null) {
                I2 i3 = this.f23194a;
                Message messageObtain = Message.obtain();
                messageObtain.what = 6;
                messageObtain.obj = w2;
                i3.sendMessage(messageObtain);
            }
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (InterruptedException unused) {
        }
    }

    public final void a() {
        LinkedHashMap linkedHashMap;
        List list;
        String str;
        U2 u2;
        int i2 = 0;
        int i3 = 0;
        do {
            U2 u3 = this.f23195b;
            if (i3 > u3.f23252z) {
                break;
            }
            C2928a3 c2928a3 = new C2928a3(u3, u3.b());
            linkedHashMap = c2928a3.f23428c;
            if (c2928a3.a() && (u2 = this.f23196c) != null) {
                while (i2 <= u2.f23252z) {
                    C2928a3 c2928a4 = new C2928a3(u2, u2.b());
                    LinkedHashMap linkedHashMap2 = c2928a4.f23428c;
                    if (!c2928a4.a()) {
                        a(u2, linkedHashMap2);
                        if (u2.y.isEmpty()) {
                            break;
                        }
                        i2++;
                        if (a(u2, i2, linkedHashMap2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                I2 i4 = this.f23194a;
                String accountId = u2.f23251B;
                Intrinsics.f(accountId, "accountId");
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                messageObtain.obj = accountId;
                i4.sendMessage(messageObtain);
                return;
            }
            if (this.f23195b.C) {
                I2 i5 = this.f23194a;
                Map map = c2928a3.f23426a.f;
                Object ipAddress = (map == null || (list = (List) map.get("cip")) == null || (str = (String) CollectionsKt.y(list)) == null) ? X2.f23337a : new Y2(str);
                Intrinsics.f(ipAddress, "ipAddress");
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 7;
                messageObtain2.obj = ipAddress;
                i5.sendMessage(messageObtain2);
            }
            a(this.f23195b, linkedHashMap);
            if (this.f23195b.y.isEmpty()) {
                break;
            } else {
                i3++;
            }
        } while (!a(this.f23195b, i3, linkedHashMap));
        I2 i6 = this.f23194a;
        String accountId2 = this.f23195b.f23251B;
        Intrinsics.f(accountId2, "accountId");
        Message messageObtain3 = Message.obtain();
        messageObtain3.what = 4;
        messageObtain3.obj = accountId2;
        i6.sendMessage(messageObtain3);
    }

    public final void a(U2 u2, LinkedHashMap linkedHashMap) {
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            W2 w2 = (W2) entry.getValue();
            String configType = (String) entry.getKey();
            if (w2.f23315c == null) {
                I2 i2 = this.f23194a;
                Message messageObtain = Message.obtain();
                messageObtain.what = 6;
                messageObtain.obj = w2;
                i2.sendMessage(messageObtain);
                u2.getClass();
                Intrinsics.f(configType, "configType");
                u2.y.remove(configType);
            }
        }
    }
}
