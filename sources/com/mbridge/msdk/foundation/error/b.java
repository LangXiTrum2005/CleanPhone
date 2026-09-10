package com.mbridge.msdk.foundation.error;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import defpackage.e;
import java.io.Serializable;
import java.util.HashMap;
import wi.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Throwable f33661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CampaignEx f33662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MBridgeIds f33663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f33664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f33665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f33666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f33667j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f33668k;
    private HashMap<Object, Object> l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f33669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f33670n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f33671o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f33672p;

    public b(int i10) {
        this.f33658a = i10;
        this.f33659b = a.b(i10);
    }

    public void a(Throwable th2) {
        this.f33661d = th2;
    }

    public void b(String str) {
        this.f33665h = str;
    }

    public void c(String str) {
        this.f33660c = str;
    }

    public CampaignEx d() {
        return this.f33662e;
    }

    public int g() {
        return this.f33658a;
    }

    public int h() {
        return this.f33659b;
    }

    public String i() {
        return this.f33672p;
    }

    public MBridgeIds j() {
        if (this.f33663f == null) {
            this.f33663f = new MBridgeIds();
        }
        return this.f33663f;
    }

    public String k() {
        return this.f33665h;
    }

    public String l() {
        int i10;
        String strA = !TextUtils.isEmpty(this.f33660c) ? this.f33660c : "";
        if (TextUtils.isEmpty(strA) && (i10 = this.f33658a) != -1) {
            strA = a.a(i10);
        }
        Throwable th2 = this.f33661d;
        if (th2 != null) {
            String message = th2.getMessage();
            if (!TextUtils.isEmpty(message)) {
                return d.i(strA, " # ", message);
            }
        }
        return strA;
    }

    public String m() {
        return this.f33668k;
    }

    public int n() {
        return this.f33667j;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MBFailureReason{errorCode=");
        sb2.append(this.f33658a);
        sb2.append(", errorSubType=");
        sb2.append(this.f33659b);
        sb2.append(", message='");
        sb2.append(this.f33660c);
        sb2.append("', cause=");
        sb2.append(this.f33661d);
        sb2.append(", campaign=");
        sb2.append(this.f33662e);
        sb2.append(", ids=");
        sb2.append(this.f33663f);
        sb2.append(", requestId='");
        sb2.append(this.f33664g);
        sb2.append("', localRequestId='");
        sb2.append(this.f33665h);
        sb2.append("', isHeaderBidding=");
        sb2.append(this.f33666i);
        sb2.append(", typeD=");
        sb2.append(this.f33667j);
        sb2.append(", reasonD='");
        sb2.append(this.f33668k);
        sb2.append("', extraMap=");
        sb2.append(this.l);
        sb2.append(", serverErrorCode=");
        sb2.append(this.f33669m);
        sb2.append(", errorUrl='");
        sb2.append(this.f33670n);
        sb2.append("', serverErrorResponse='");
        return e.q(this.f33671o, "'}", sb2);
    }

    public void a(CampaignEx campaignEx) {
        this.f33662e = campaignEx;
    }

    public void d(String str) {
        this.f33668k = str;
    }

    public void a(MBridgeIds mBridgeIds) {
        this.f33663f = mBridgeIds;
    }

    public void a(boolean z10) {
        this.f33666i = z10;
    }

    public b(int i10, String str) {
        this.f33658a = i10;
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
        }
        this.f33660c = str;
        this.f33659b = a.b(i10);
    }

    public void a(Object obj, Object obj2) {
        if (this.l == null) {
            this.l = new HashMap<>();
        }
        this.l.put(obj, obj2);
    }

    public Object a(Object obj) {
        HashMap<Object, Object> map = this.l;
        if (map != null && map.containsKey(obj)) {
            return this.l.get(obj);
        }
        return null;
    }

    public void a(int i10) {
        this.f33667j = i10;
    }

    public void a(String str) {
        this.f33672p = str;
    }
}
