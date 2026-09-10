package com.mbridge.msdk.mbbanner.common.util;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f34527c = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f34528a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34529b;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class RunnableC0141a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f34530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignUnit f34532c;

        public RunnableC0141a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, CampaignUnit campaignUnit) {
            this.f34530a = bVar;
            this.f34531b = str;
            this.f34532c = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f34530a;
            if (bVar != null) {
                bVar.a(this.f34531b, this.f34532c, a.this.f34529b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f34534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.error.b f34535b;

        public b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f34534a = bVar;
            this.f34535b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f34534a != null) {
                this.f34535b.a(a.this.f34529b);
                this.f34534a.a(this.f34535b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f34537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f34539c;

        public c(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i10) {
            this.f34537a = bVar;
            this.f34538b = str;
            this.f34539c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f34537a;
            if (bVar != null) {
                bVar.a(this.f34538b, this.f34539c, a.this.f34529b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f34541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.error.b f34542b;

        public d(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f34541a = bVar;
            this.f34542b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f34541a != null) {
                this.f34542b.a(a.this.f34529b);
                this.f34541a.b(this.f34542b);
            }
        }
    }

    public void b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        q0.b(f34527c, "postResourceFail unitId=" + bVar2);
        this.f34528a.post(new d(bVar, bVar2));
    }

    public void a(boolean z10) {
        this.f34529b = z10;
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, CampaignUnit campaignUnit, String str) {
        f2.s("postCampaignSuccess unitId=", str, f34527c);
        this.f34528a.post(new RunnableC0141a(bVar, str, campaignUnit));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        this.f34528a.post(new b(bVar, bVar2));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i10) {
        f2.s("postResourceSuccess unitId=", str, f34527c);
        this.f34528a.post(new c(bVar, str, i10));
    }
}
