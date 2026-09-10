package com.p004ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class bb {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Map<String, ba> f716 = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bb$1, reason: invalid class name */
    public class AnonymousClass1 extends it {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private /* synthetic */ String f718;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private /* synthetic */ ba.c f719;

        public AnonymousClass1(String str, ba.c cVar) {
            this.f718 = str;
            this.f719 = cVar;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
        /* JADX INFO: renamed from: ﾒ */
        public final void mo276() {
            ba baVarM760 = bb.m760(bb.this, this.f718);
            if (baVarM760 != null) {
                baVarM760.m750(this.f719);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bb$3, reason: invalid class name */
    public class AnonymousClass3 extends it {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private /* synthetic */ String f725;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private /* synthetic */ ba.b f726;

        public AnonymousClass3(String str, ba.b bVar) {
            this.f725 = str;
            this.f726 = bVar;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
        /* JADX INFO: renamed from: ﾒ */
        public final void mo276() {
            ba baVarM760 = bb.m760(bb.this, this.f725);
            if (baVarM760 != null) {
                baVarM760.m751(this.f726);
            }
        }
    }

    public interface e extends p {
    }

    public bb() {
        new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ ba m760(bb bbVar, String str) {
        Map<String, ba> map = bbVar.f716;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m762(String str) {
        Map<String, ba> map = this.f716;
        ba baVar = map != null ? map.get(str) : null;
        if (baVar != null) {
            return baVar.m754();
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized boolean m763() {
        Iterator it = new ArrayList(this.f716.values()).iterator();
        while (it.hasNext()) {
            if (((ba) it.next()).m753()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m764(String str) {
        this.f716.put(str, new ba(str));
    }
}
