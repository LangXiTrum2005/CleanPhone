package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3326ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Be f24138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f24139b;

    public C3326ye(Be networkRequest, LinkedHashSet inMobiUnifiedIdInterfaceSet) {
        Intrinsics.f(networkRequest, "networkRequest");
        Intrinsics.f(inMobiUnifiedIdInterfaceSet, "inMobiUnifiedIdInterfaceSet");
        this.f24138a = networkRequest;
        this.f24139b = inMobiUnifiedIdInterfaceSet;
    }

    public final void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        synchronized (AbstractC3310xe.class) {
            try {
                if (this.f24138a.f22700A.get()) {
                    return;
                }
                AbstractC3310xe.a();
                Q5.b(AbstractC3342ze.a(jSONObject, Q5.b()));
                JSONObject jSONObjectA = AbstractC3342ze.a(Q5.b());
                for (InMobiUnifiedIdInterface inMobiUnifiedIdInterface : this.f24139b) {
                    if (jSONObjectA == null) {
                        AbstractC3342ze.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT));
                    } else {
                        AbstractC3342ze.a(inMobiUnifiedIdInterface, jSONObjectA, null);
                    }
                }
                this.f24139b.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(I9 i9) {
        EnumC3157o4 enumC3157o4;
        synchronized (AbstractC3310xe.class) {
            if (i9 != null) {
                try {
                    enumC3157o4 = i9.f22886a;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                enumC3157o4 = null;
            }
            Objects.toString(enumC3157o4);
            Objects.toString(i9 != null ? i9.f22886a : null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (i9 != null) {
                linkedHashMap.put("errorCode", i9.f22886a);
            }
            Pd pd = Pd.f23077a;
            Pd.b("UnifiedIdNetworkResponseFailure", linkedHashMap, Td.SDK);
            if (this.f24138a.f22700A.get()) {
                return;
            }
            AbstractC3310xe.a();
            a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037 A[Catch: all -> 0x0033, JSONException -> 0x0035, Merged into TryCatch #0 {all -> 0x0033, JSONException -> 0x0035, blocks: (B:4:0x000d, B:6:0x0013, B:8:0x001d, B:9:0x0023, B:11:0x0029, B:16:0x0037, B:17:0x003d, B:19:0x0043, B:21:0x0054), top: B:26:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[Catch: all -> 0x0033, JSONException -> 0x0035, LOOP:0: B:17:0x003d->B:19:0x0043, LOOP_END, Merged into TryCatch #0 {all -> 0x0033, JSONException -> 0x0035, blocks: (B:4:0x000d, B:6:0x0013, B:8:0x001d, B:9:0x0023, B:11:0x0029, B:16:0x0037, B:17:0x003d, B:19:0x0043, B:21:0x0054), top: B:26:0x000b }, TRY_LEAVE] */
    public final void a() {
        Iterator it;
        JSONObject jSONObjectA = AbstractC3342ze.a(Q5.b());
        try {
            if (jSONObjectA != null) {
                if (jSONObjectA.has("ufids") && jSONObjectA.getJSONArray("ufids").length() > 0) {
                    Iterator it2 = this.f24139b.iterator();
                    while (it2.hasNext()) {
                        AbstractC3342ze.a((InMobiUnifiedIdInterface) it2.next(), jSONObjectA, null);
                    }
                } else {
                    it = this.f24139b.iterator();
                    while (it.hasNext()) {
                        AbstractC3342ze.a((InMobiUnifiedIdInterface) it.next(), null, new Error(InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT));
                    }
                }
            } else {
                it = this.f24139b.iterator();
                while (it.hasNext()) {
                    AbstractC3342ze.a((InMobiUnifiedIdInterface) it.next(), null, new Error(InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT));
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        } finally {
            this.f24139b.clear();
        }
    }
}
