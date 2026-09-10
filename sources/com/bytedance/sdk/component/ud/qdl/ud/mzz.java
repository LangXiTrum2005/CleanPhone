package com.bytedance.sdk.component.ud.qdl.ud;

import com.applovin.shadow.okio.Segment;

/* JADX INFO: loaded from: classes.dex */
final class mzz {
    int lnr;
    boolean mml;
    mzz mo;
    boolean mzz;
    final byte[] qdl;
    int ud;
    mzz wd;

    public mzz() {
        this.qdl = new byte[Segment.SIZE];
        this.mzz = true;
        this.mml = false;
    }

    public final mzz qdl() {
        this.mml = true;
        return new mzz(this.qdl, this.ud, this.lnr, true, false);
    }

    public final mzz ud() {
        mzz mzzVar = this.mo;
        mzz mzzVar2 = mzzVar != this ? mzzVar : null;
        mzz mzzVar3 = this.wd;
        if (mzzVar3 != null) {
            mzzVar3.mo = mzzVar;
        }
        mzz mzzVar4 = this.mo;
        if (mzzVar4 != null) {
            mzzVar4.wd = mzzVar3;
        }
        this.mo = null;
        this.wd = null;
        return mzzVar2;
    }

    public final mzz qdl(mzz mzzVar) {
        mzzVar.wd = this;
        mzzVar.mo = this.mo;
        this.mo.wd = mzzVar;
        this.mo = mzzVar;
        return mzzVar;
    }

    public mzz(byte[] bArr, int i2, int i3, boolean z2, boolean z3) {
        this.qdl = bArr;
        this.ud = i2;
        this.lnr = i3;
        this.mml = z2;
        this.mzz = z3;
    }
}
