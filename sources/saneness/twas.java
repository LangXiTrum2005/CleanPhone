package saneness;

import ads_mobile_sdk.bb;
import ads_mobile_sdk.in;
import ads_mobile_sdk.j;
import ads_mobile_sdk.nb;
import ads_mobile_sdk.vm0;

/* JADX INFO: loaded from: classes.dex */
public final class twas extends vm0 {
    public twas() {
        super(nb.DEFAULT_INSTANCE);
    }

    public final twas attabal(bb bbVar) {
        b();
        nb nbVar = (nb) this.b;
        nbVar.getClass();
        nbVar.encryptionMethod_ = bbVar.a;
        nbVar.bitField0_ |= 4;
        return this;
    }

    public final twas dern(in inVar) {
        b();
        nb nbVar = (nb) this.b;
        nbVar.getClass();
        inVar.getClass();
        prescient prescientVar = nbVar.encryptedBlobs_;
        if (!((j) prescientVar).a) {
            nbVar.encryptedBlobs_ = listeriosis.attabal(prescientVar, 2);
        }
        nbVar.encryptedBlobs_.add(inVar);
        return this;
    }

    public final twas marial() {
        b();
        nb nbVar = (nb) this.b;
        nbVar.getClass();
        nbVar.protoName_ = 4;
        nbVar.bitField0_ |= 2;
        return this;
    }

    public final void wireman(in inVar) {
        b();
        nb nbVar = (nb) this.b;
        nbVar.getClass();
        inVar.getClass();
        nbVar.bitField0_ |= 1;
        nbVar.hash_ = inVar;
    }
}
