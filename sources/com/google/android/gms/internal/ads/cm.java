package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cm {
    public static final void a(com.google.android.gms.internal.consent_sdk.d dVar, uw uwVar) {
        File externalStorageDirectory;
        Context context = (Context) uwVar.f20919c;
        String str = (String) uwVar.f20921e;
        if (context == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        String str2 = (String) uwVar.f20918b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) uwVar.f20920d;
        dVar.f22985e = context;
        dVar.f22986f = str;
        dVar.f22984d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        dVar.f22988h = atomicBoolean;
        atomicBoolean.set(((Boolean) bn.f12823c.o()).booleanValue());
        if (((AtomicBoolean) dVar.f22988h).get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            dVar.f22989i = new File(new File(externalStorageDirectory, "sdk_csi_data.txt").getPath());
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((LinkedHashMap) dVar.f22982b).put((String) entry.getKey(), (String) entry.getValue());
        }
        l00.f16608a.execute(new d(dVar, 12));
        HashMap map = (HashMap) dVar.f22983c;
        dm dmVar = dm.f13580c;
        map.put("action", dmVar);
        map.put("ad_format", dmVar);
        map.put("e", dm.f13581d);
    }
}
