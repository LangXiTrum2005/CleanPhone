package com.smartdigimkt.u2;

/* JADX INFO: loaded from: classes6.dex */
public class d extends k {
    public d(com.smartdigimkt.x.d dVar, com.smartdigimkt.c3.c cVar, com.smartdigimkt.d3.c cVar2, String str, String str2, com.smartdigimkt.t2.a aVar, int i2, boolean z2) {
        super(dVar, cVar, cVar2, str, str2, aVar, i2, z2);
    }

    @Override // com.smartdigimkt.u2.k, com.smartdigimkt.u2.f, com.smartdigimkt.t2.a
    public void a(int i2, Object obj) {
        super.a(i2, obj);
        if (this.W) {
            try {
                com.smartdigimkt.x.d dVar = this.X;
                if (dVar != null && dVar.t0() == 5) {
                    a(obj.toString());
                }
            } catch (Exception unused) {
            }
            if (i2 == 122) {
                g();
            }
            switch (i2) {
                case 109:
                    a(2);
                    b(2);
                    break;
                case 110:
                    a(1);
                    b(1);
                    break;
                case 111:
                    b(1);
                    break;
            }
        }
    }
}
