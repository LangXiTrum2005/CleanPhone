package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ba {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Map<String, az> f611 = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ba$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class AnonymousClass3 extends je {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private /* synthetic */ az.b f613;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private /* synthetic */ String f614;

        public AnonymousClass3(String str, az.b bVar) {
            this.f614 = str;
            this.f613 = bVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.je
        /* JADX INFO: renamed from: ｋ */
        public final void mo254() {
            az azVarM706 = ba.m706(ba.this, this.f614);
            if (azVarM706 != null) {
                azVarM706.m696(this.f613);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ba$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class AnonymousClass5 extends je {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private /* synthetic */ az.a f620;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private /* synthetic */ String f622;

        public AnonymousClass5(String str, az.a aVar) {
            this.f622 = str;
            this.f620 = aVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.je
        /* JADX INFO: renamed from: ｋ */
        public final void mo254() {
            az azVarM706 = ba.m706(ba.this, this.f622);
            if (azVarM706 != null) {
                azVarM706.m697(this.f620);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface d extends t {
    }

    public ba() {
        new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean m707(List<String> list) {
        for (String str : list) {
            Map<String, az> map = this.f611;
            az azVar = map != null ? map.get(str) : null;
            if (azVar == null || azVar.m694() != az.a.f594) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m708(String str) {
        this.f611.put(str, new az(str));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m709(String str) {
        Map<String, az> map = this.f611;
        az azVar = map != null ? map.get(str) : null;
        if (azVar != null) {
            return azVar.m695();
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean m705(List<String> list) {
        Map<String, az> map = this.f611;
        if (map != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                if (!list.contains(str)) {
                    Map<String, az> map2 = this.f611;
                    az azVar = map2 != null ? map2.get(str) : null;
                    if (azVar != null && azVar.m694() == az.a.f594) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized boolean m710(boolean z10) {
        try {
            ArrayList arrayList = new ArrayList();
            if (z10) {
                Iterator<String> it = ay.m679().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toLowerCase());
                }
            } else {
                arrayList.add(ay.m684().toLowerCase());
            }
            return m707(arrayList) && m705(arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ az m706(ba baVar, String str) {
        Map<String, az> map = baVar.f611;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
