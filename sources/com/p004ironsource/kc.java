package com.p004ironsource;

import android.util.Pair;
import com.p004ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class kc implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f25523e = "Content-Type";
    private static final String f = "application/json";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ag f25524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f25525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f25526c;
    ArrayList<zb> d;

    public kc(ag agVar, String str, String str2, ArrayList<zb> arrayList) {
        this.f25524a = agVar;
        this.f25525b = str;
        this.f25526c = str2;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        ag.a aVarA;
        ag.a aVar = new ag.a(this.d);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            ir irVarB = zg.b(this.f25526c, this.f25525b, arrayList);
            aVarA = aVar.a(irVarB.a()).a(irVarB.f25367a);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error("EventsSender failed to send events - " + e2.getLocalizedMessage());
            aVarA = aVar.a(e2 instanceof ip).a(e2);
        }
        ag agVar = this.f25524a;
        if (agVar != null) {
            agVar.a(aVarA);
        }
    }
}
