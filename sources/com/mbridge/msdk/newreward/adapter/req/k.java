package com.mbridge.msdk.newreward.adapter.req;

import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.core.resource.q;
import com.mbridge.msdk.newreward.function.core.resource.x;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class k implements com.mbridge.msdk.newreward.adapter.req.a {

    public class a implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f1594a;

        public a(b bVar) {
            this.f1594a = bVar;
        }

        @Override // com.mbridge.msdk.newreward.function.core.resource.x
        public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, q qVar) {
        }

        @Override // com.mbridge.msdk.newreward.function.core.resource.x
        public void b(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, q qVar) {
            if (bVar.I()) {
                this.f1594a.reqSuccessful(aVar);
            }
        }

        @Override // com.mbridge.msdk.newreward.function.core.resource.x
        public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, q qVar, MBridgeError mBridgeError) {
            if (bVar.I()) {
                this.f1594a.reqSuccessful(aVar);
            }
        }

        @Override // com.mbridge.msdk.newreward.function.core.resource.x
        public void b(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, q qVar, MBridgeError mBridgeError) {
            if (bVar.I()) {
                this.f1594a.reqSuccessful(aVar);
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.adapter.req.a
    public void a(Object obj, b bVar) throws IOException {
        com.mbridge.msdk.newreward.function.core.campaign.a aVar = (com.mbridge.msdk.newreward.function.core.campaign.a) obj;
        com.mbridge.msdk.newreward.function.core.resource.m mVarE = aVar.e();
        if (aVar.a() != null && aVar.a().isDynamicView()) {
            if (bVar != null) {
                bVar.reqSuccessful(aVar);
            }
        } else if (mVarE != null) {
            mVarE.g().a(0, new a(bVar));
        } else if (bVar != null) {
            bVar.reqSuccessful(aVar);
        }
    }
}
