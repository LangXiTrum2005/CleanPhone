package com.smartdigimkt.u8;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: loaded from: classes6.dex */
public class f extends com.smartdigimkt.s8.c {

    public class a implements com.smartdigimkt.h7.b {
        final /* synthetic */ com.smartdigimkt.s8.b X;

        public a(com.smartdigimkt.s8.b bVar) {
            this.X = bVar;
        }

        @Override // com.smartdigimkt.h7.b
        public boolean a() {
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39188e));
            f.this.d(this.X);
        }
    }

    @Override // com.smartdigimkt.s8.c
    public boolean b(com.smartdigimkt.s8.b bVar) {
        com.smartdigimkt.t8.b bVarP;
        if (!bVar.t() && (bVarP = bVar.p()) != null) {
            long jE = bVarP.e() - bVarP.g();
            if (jE <= 0) {
                jE = 0;
            }
            com.smartdigimkt.l8.e eVarM = bVar.m();
            long J2 = eVarM != null ? eVarM.J() : ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
            a aVar = new a(bVar);
            com.smartdigimkt.h7.e.b().a(aVar, J2 - jE);
            bVar.a(aVar);
        }
        return true;
    }
}
