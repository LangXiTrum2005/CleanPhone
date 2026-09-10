package com.bytedance.sdk.component.lr.ri.lr;

/* JADX INFO: loaded from: classes2.dex */
final class fi {
    fi di;
    boolean fi;
    int ik;
    boolean ka;
    int lr;
    final byte[] ri;
    fi xha;

    public fi() {
        this.ri = new byte[8192];
        this.fi = true;
        this.ka = false;
    }

    public final fi lr() {
        fi fiVar = this.di;
        fi fiVar2 = fiVar != this ? fiVar : null;
        fi fiVar3 = this.xha;
        if (fiVar3 != null) {
            fiVar3.di = fiVar;
        }
        fi fiVar4 = this.di;
        if (fiVar4 != null) {
            fiVar4.xha = fiVar3;
        }
        this.di = null;
        this.xha = null;
        return fiVar2;
    }

    public final fi ri() {
        this.ka = true;
        return new fi(this.ri, this.lr, this.ik, true, false);
    }

    public final fi ri(fi fiVar) {
        fiVar.xha = this;
        fiVar.di = this.di;
        this.di.xha = fiVar;
        this.di = fiVar;
        return fiVar;
    }

    public fi(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.ri = bArr;
        this.lr = i;
        this.ik = i2;
        this.ka = z;
        this.fi = z2;
    }
}
