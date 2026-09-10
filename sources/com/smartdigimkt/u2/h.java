package com.smartdigimkt.u2;

/* JADX INFO: loaded from: classes6.dex */
public class h extends k {
    public h(com.smartdigimkt.x.d dVar, com.smartdigimkt.c3.c cVar, com.smartdigimkt.d3.c cVar2, String str, String str2, com.smartdigimkt.t2.a aVar, int i2, boolean z2) {
        super(dVar, cVar, cVar2, str, str2, aVar, i2, z2);
    }

    @Override // com.smartdigimkt.u2.k, com.smartdigimkt.u2.f, com.smartdigimkt.t2.a
    public void a(int i2, Object obj) {
        if (i2 == 100) {
            j();
            h();
            i();
            b(2);
        } else if (i2 == 109) {
            a(2);
        } else if (i2 == 122) {
            g();
        } else if (i2 != 129) {
            String str = "";
            if (i2 == 118) {
                if (obj != null && (obj instanceof String)) {
                    str = (String) obj;
                }
                a(3, str);
            } else if (i2 == 119) {
                if (obj != null && (obj instanceof String)) {
                    str = (String) obj;
                }
                a(4, str);
            }
        } else {
            com.smartdigimkt.x.d dVar = this.X;
            if (dVar != null && dVar.B1() == 2) {
                j();
                h();
                i();
                b(1);
            }
        }
        super.a(i2, obj);
    }
}
