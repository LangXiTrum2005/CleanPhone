package com.ironsource;

import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class I5 implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f26278e = "Content-Type";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f26279f = "application/json";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private D7 f26280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f26281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f26282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList<C0654x5> f26283d;

    public I5(D7 d10, String str, String str2, ArrayList<C0654x5> arrayList) {
        this.f26280a = d10;
        this.f26281b = str;
        this.f26282c = str2;
        this.f26283d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        D7.a aVarA;
        D7.a aVar = new D7.a(this.f26283d);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            Pd pdB = C0281c8.b(this.f26282c, this.f26281b, arrayList);
            aVarA = aVar.a(pdB.a()).a(pdB.f27043a);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error("EventsSender failed to send events - " + e10.getLocalizedMessage());
            aVarA = aVar.a(e10 instanceof Fc).a(e10);
        }
        D7 d10 = this.f26280a;
        if (d10 != null) {
            d10.a(aVarA);
        }
    }
}
