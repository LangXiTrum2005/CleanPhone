package com.smartdigimkt.q4;

import com.smartdigimkt.p4.p;
import com.smartdigimkt.p4.s;
import com.smartdigimkt.w3.t;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f37884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37886c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f37887e;

    private a(List<byte[]> list, int i2, int i3, int i4, float f) {
        this.f37884a = list;
        this.f37885b = i2;
        this.f37886c = i3;
        this.d = i4;
        this.f37887e = f;
    }

    private static byte[] a(s sVar) {
        int iD = sVar.D();
        int iC = sVar.c();
        sVar.f(iD);
        return com.smartdigimkt.p4.d.a(sVar.f37616a, iC, iD);
    }

    public static a b(s sVar) throws t {
        float f;
        int i2;
        int i3;
        try {
            sVar.f(4);
            int iX = (sVar.x() & 3) + 1;
            if (iX == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iX2 = sVar.x() & 31;
            for (int i4 = 0; i4 < iX2; i4++) {
                arrayList.add(a(sVar));
            }
            int iX3 = sVar.x();
            for (int i5 = 0; i5 < iX3; i5++) {
                arrayList.add(a(sVar));
            }
            if (iX2 > 0) {
                p.b bVarC = p.c((byte[]) arrayList.get(0), iX, ((byte[]) arrayList.get(0)).length);
                int i6 = bVarC.f37604b;
                int i7 = bVarC.f37605c;
                f = bVarC.d;
                i2 = i6;
                i3 = i7;
            } else {
                f = 1.0f;
                i2 = -1;
                i3 = -1;
            }
            return new a(arrayList, iX, i2, i3, f);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new t("Error parsing AVC config", e2);
        }
    }
}
