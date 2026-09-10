package com.startapp.sdk.internal;

import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.TopicsClientMetadata;
import com.startapp.sdk.common.utils.Pair;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class gi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f41018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f41019c;
    public final q5 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f41020e = new AtomicReference();

    public gi(Context context, lb lbVar, lb lbVar2, q5 q5Var) {
        this.f41017a = context;
        this.f41018b = lbVar;
        this.f41019c = lbVar2;
        this.d = q5Var;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT < 33 || SdkExtensions.getExtensionVersion(30) < 4 || SdkExtensions.getExtensionVersion(1000000) < 5) {
            return;
        }
        try {
            this.d.getClass();
            TopicsClientMetadata topicsClientMetadataB0 = MetaData.E().b0();
            if (topicsClientMetadataB0 == null || !vi.a(topicsClientMetadataB0.a())) {
                return;
            }
            TopicsManager topicsManagerO = androidx.privacysandbox.ads.adservices.customaudience.a.o(this.f41017a.getSystemService(androidx.privacysandbox.ads.adservices.customaudience.a.y()));
            androidx.privacysandbox.ads.adservices.topics.a.l();
            topicsManagerO.getTopics(androidx.privacysandbox.ads.adservices.customaudience.a.i().setAdsSdkName(this.f41017a.getPackageName()).setShouldRecordObservation(true).build(), (Executor) this.f41019c.a(), new fi(this));
        } catch (Throwable th) {
            if (a(2)) {
                g9.a(th);
            }
        }
    }

    public final void b() {
        m8 m8Var = (m8) this.f41018b.a();
        m8Var.f41243a.post(new C(this, 2));
    }

    public final boolean a(int i2) {
        TopicsClientMetadata topicsClientMetadata = (TopicsClientMetadata) this.d.a();
        ComponentInfoEventConfig componentInfoEventConfigB = topicsClientMetadata != null ? topicsClientMetadata.b() : null;
        return componentInfoEventConfigB != null && componentInfoEventConfigB.a((long) i2);
    }

    public static String a(HashMap map) {
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (Map.Entry entry : map.entrySet()) {
            sb.append(str);
            sb.append('M');
            sb.append(((Pair) entry.getKey()).first);
            sb.append('T');
            sb.append(((Pair) entry.getKey()).second);
            String str2 = ":";
            for (Integer num : (Set) entry.getValue()) {
                sb.append(str2);
                sb.append(num);
                str2 = ",";
            }
            str = ";";
        }
        return sb.length() > 0 ? sb.toString() : "NONE";
    }
}
