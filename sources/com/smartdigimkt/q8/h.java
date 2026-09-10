package com.smartdigimkt.q8;

import com.smartdigimkt.sdk.api.SDMAdConst;
import com.smartdigimkt.sdk.api.format.SDMAd;
import com.smartdigimkt.sdk.api.format.SDMAdEcpmInfo;
import com.smartdigimkt.sdk.api.format.SDMAdPlaceInfo;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class h implements SDMAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.smartdigimkt.y4.c f37954a;

    public static class b implements SDMAdEcpmInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.smartdigimkt.y6.b f37955a;

        @Override // com.smartdigimkt.sdk.api.format.SDMAdEcpmInfo
        public double getEcpm(SDMAdConst.CURRENCY currency) {
            com.smartdigimkt.y6.b bVar;
            if (currency == null || (bVar = this.f37955a) == null) {
                return 0.0d;
            }
            return com.smartdigimkt.n8.j.a(bVar.f(), SDMAdConst.CURRENCY.USD, currency);
        }

        @Override // com.smartdigimkt.sdk.api.format.SDMAdEcpmInfo
        public String getEncEcpmInfo(SDMAdConst.CURRENCY currency) {
            String strT;
            com.smartdigimkt.y6.b bVar = this.f37955a;
            if (bVar == null) {
                strT = "";
            } else if (currency == SDMAdConst.CURRENCY.USD) {
                strT = bVar.m();
            } else if (currency == SDMAdConst.CURRENCY.RMB) {
                strT = bVar.t();
            } else {
                strT = "The currency(" + currency + ") is not supported.";
            }
            return strT != null ? strT : "";
        }

        @Override // com.smartdigimkt.sdk.api.format.SDMAdEcpmInfo
        public int getSecretId() {
            com.smartdigimkt.y6.b bVar = this.f37955a;
            if (bVar != null) {
                return bVar.n();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SDMAdEcpmInfo{ecpm(USD)=");
            SDMAdConst.CURRENCY currency = SDMAdConst.CURRENCY.USD;
            sb.append(getEcpm(currency));
            sb.append(", ecpmEncInfo(USD)=");
            sb.append(getEncEcpmInfo(currency));
            sb.append(", ecpm(RMB)=");
            SDMAdConst.CURRENCY currency2 = SDMAdConst.CURRENCY.RMB;
            sb.append(getEcpm(currency2));
            sb.append(", ecpmEncInfo(RMB)=");
            sb.append(getEncEcpmInfo(currency2));
            sb.append(", secretId=");
            return android.support.v4.media.a.p(sb, getSecretId(), AbstractJsonLexerKt.END_OBJ);
        }

        private b(com.smartdigimkt.y4.c cVar) {
            this.f37955a = cVar != null ? cVar.i() : null;
        }
    }

    public static class c implements SDMAdPlaceInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.smartdigimkt.v6.a f37956a;

        @Override // com.smartdigimkt.sdk.api.format.SDMAdPlaceInfo
        public int getFormat() {
            com.smartdigimkt.v6.a aVar = this.f37956a;
            if (aVar != null) {
                return aVar.f39164b;
            }
            return 0;
        }

        @Override // com.smartdigimkt.sdk.api.format.SDMAdPlaceInfo
        public String getPlacementId() {
            com.smartdigimkt.v6.a aVar = this.f37956a;
            return aVar != null ? aVar.f39163a : "";
        }

        @Override // com.smartdigimkt.sdk.api.format.SDMAdPlaceInfo
        public String getRequestId() {
            com.smartdigimkt.v6.a aVar = this.f37956a;
            return aVar != null ? aVar.f : "";
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SDMAdPlaceInfo{placementId=");
            sb.append(getPlacementId());
            sb.append(", requestId=");
            sb.append(getRequestId());
            sb.append(", format=");
            return android.support.v4.media.a.p(sb, getFormat(), AbstractJsonLexerKt.END_OBJ);
        }

        private c(com.smartdigimkt.y4.c cVar) {
            this.f37956a = cVar != null ? cVar.h() : null;
        }
    }

    public h(com.smartdigimkt.y4.c cVar) {
        this.f37954a = cVar;
    }

    public static SDMAd a(com.smartdigimkt.y4.c cVar) {
        return new h(cVar);
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMAd
    public SDMAdEcpmInfo getEcpmInfo() {
        return new b(this.f37954a);
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMAd
    public Map<String, Object> getExtraInfo() {
        return com.smartdigimkt.m3.c.a(this.f37954a);
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMAd
    public SDMAdPlaceInfo getPlaceInfo() {
        return new c(this.f37954a);
    }
}
