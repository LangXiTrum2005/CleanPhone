package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;

/* JADX INFO: loaded from: classes.dex */
final class k extends c {
    public k(Context context, b bVar, d dVar) {
        super(CrashType.LAUNCH, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public final com.apm.insight.entity.a a(int i2, com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a aVarA = super.a(i2, aVar);
        if (i2 == 0) {
            Header headerA = Header.a(this.f10302b);
            headerA.c();
            aVarA.a(headerA);
            com.apm.insight.a.a(aVarA, headerA, this.f10301a);
            return aVarA;
        }
        if (i2 == 1) {
            Header headerD = aVarA.d();
            headerD.d();
            headerD.e();
            return aVarA;
        }
        if (i2 == 2) {
            Header.a(aVarA.d());
            try {
                aVarA.d().f().put("launch_did", com.apm.insight.i.a.a(this.f10302b));
            } catch (Throwable unused) {
            }
        } else if (i2 == 5) {
            Header.b(aVarA.d());
            return aVarA;
        }
        return aVarA;
    }
}
