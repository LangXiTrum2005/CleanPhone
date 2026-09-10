package com.bytedance.sdk.openadsdk.core.exu.mml;

import androidx.media3.extractor.text.ttml.a;
import com.bykv.vk.openvk.qdl.qdl.ud.lnr.mml;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class lnr extends mml {
    private final qdl mml;
    private final List<ud> qdl = a.u();
    private int ud = 1;
    private int lnr = 1;

    public interface ud extends com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl {
        void qdl(int i2, int i3);
    }

    public lnr() {
        qdl qdlVar = new qdl();
        this.mml = qdlVar;
        super.qdl(qdlVar);
        qdl(500);
    }

    public static /* synthetic */ int qdl(lnr lnrVar) {
        int i2 = lnrVar.lnr;
        lnrVar.lnr = i2 + 1;
        return i2;
    }

    public int aaj() {
        return this.lnr;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.mml
    public long jtx() {
        return super.jtx() * ((long) this.ud);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.mml
    public long yt() {
        long jYt = super.yt();
        return this.ud == 1 ? jYt : (((long) (this.lnr - 1)) * super.jtx()) + jYt;
    }

    public class qdl implements com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl {
        private qdl() {
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void lnr(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).lnr(qdlVar);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void mml(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).mml(qdlVar);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void mzz(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).mzz(qdlVar);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
            lnr.qdl(lnr.this);
            if (lnr.this.lnr > lnr.this.ud) {
                Iterator it = lnr.this.qdl.iterator();
                while (it.hasNext()) {
                    ((ud) it.next()).qdl(qdlVar);
                }
            } else {
                Iterator it2 = lnr.this.qdl.iterator();
                while (it2.hasNext()) {
                    ((ud) it2.next()).qdl(lnr.this.lnr, lnr.this.ud);
                }
                lnr.this.tvp();
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void ud(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).ud(qdlVar);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void ud(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, int i2) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).ud(qdlVar, i2);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, long j) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).qdl(qdlVar, j);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, com.bykv.vk.openvk.qdl.qdl.qdl.lnr.qdl qdlVar2) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).qdl(qdlVar, qdlVar2);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, boolean z2) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).qdl(qdlVar, z2);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, int i2, int i3) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).qdl(qdlVar, i2, i3);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, int i2, int i3, int i4) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).qdl(qdlVar, i2, i3, i4);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, int i2) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).qdl(qdlVar, i2);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, long j, long j2) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).qdl(qdlVar, j, j2);
            }
        }
    }

    public void lnr(int i2) {
        this.ud = Math.max(1, i2);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.mml
    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl interfaceC0057qdl) {
        if (!(interfaceC0057qdl instanceof ud)) {
            super.qdl(interfaceC0057qdl);
        } else {
            if (this.qdl.contains(interfaceC0057qdl)) {
                return;
            }
            this.qdl.add((ud) interfaceC0057qdl);
        }
    }
}
